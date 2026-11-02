package com.swordxstaff.plugins.com_github_botmakerdev.botmaker_sdk;

import com.botmaker.sdk.api.bot.SdkValue;
import com.botmaker.sdk.api.screens.Screen;
import com.botmaker.sdk.api.screens.Setup;
import java.util.List;
import com.botmaker.sdk.api.screens.Button;
import java.time.Duration;
import com.botmaker.sdk.api.screens.Reached;
import com.botmaker.sdk.api.screens.Way;
import com.botmaker.sdk.api.geometry.Point;
import com.botmaker.sdk.api.screens.Hotkey;
import com.botmaker.sdk.api.input.Key;
import com.botmaker.sdk.api.screens.Pick;
import com.botmaker.sdk.api.screens.Order;

/**
 * Values com.github.BotMakerDev:botmaker-sdk keeps in step with its own windows.
 * <p>Written by BotMaker because this project had none, and <b>yours from that moment</b>:
 * it is never rewritten. BotMaker changes the expression a {@code @SdkValue} method returns and nothing else.
 */
@SdkValue(SdkValue.Id.SCREEN_MAP)
public final class Screens {
    public static final class Consent extends Screen {
        public final Button confirm = Button.of(Elements.CONFIRM);
        public final Button privacyPolicy = Button.of(Elements.PRIVACY_POLICY).info();
        public final Button cancel = Button
                .of(Elements.CANCEL)
                .never("Declines the agreement and quits the game to Android's launcher, tried 2026-11-02");
        public final Button userAgreement = Button.of(Elements.USER_AGREEMENT).info();

        @Override
        public Setup setup() {
            return Setup
                    .named("Consent")
                    .elements(List.of(Elements.USER_AGREEMENT))
                    .start()
                    .shot("screens/CONSENT.png");
        }
    }

    public static final Consent CONSENT = new Consent();

    public static final class TutorialDialogue extends Screen {
        public final Button dialoguePanel = Button.of(Pictures.DIALOGUE_PANEL);
        public final Button dialogueNextArrow = Button.of(Pictures.DIALOGUE_NEXT_ARROW);

        @Override
        public Setup setup() {
            return Setup
                    .named("Tutorial dialogue")
                    .markers(List.of(Pictures.DIALOGUE_PANEL))
                    .popup()
                    .notes("""
                            A speech box over the scene: name tag, one or two lines of text, a bobbing arrow at the bottom centre. Marker: dialogue_panel at 60,1730 (900x110); the arrow bobs and matches only at 0.91. Its text types in letter by letter, so describe right after a tap reads garbage: wait for it.
                            One tap at 540,1780 moves to the next line, or closes the box on the last one. Seen over the Prologue battle (Reina "The final showdown again. Let's do this."; Akane "Ugh, not again... We lost..."; "Lord Goddess, please help us!"), over black after Character name (Reina "This world faces a grave crisis. We need your strength.", "Come to Aethyris. Only then can we save...") and over Aethyris arrival (Akane's lines, and a reply choice).\
                            """)
                    .reached(Reached.SURVEYED)
                    .shot("screens/TUTORIAL_DIALOGUE.png");
        }
    }

    public static final TutorialDialogue TUTORIAL_DIALOGUE = new TutorialDialogue();

    public static final class PrivacyPolicy extends Screen {
        public final Button policyBackArrow = Button.of(Pictures.POLICY_BACK_ARROW);

        @Override
        public Setup setup() {
            return Setup
                    .named("Privacy Policy")
                    .markers(List.of(Pictures.BOLTRAY_PAGE_LOGO))
                    .elements(List.of(Elements.BOLTRAY_GAMES_PRIVACY_POLICY))
                    .back(Screens.PRIVACY_POLICY.policyBackArrow)
                    .takes(Duration.ofMillis(3400L))
                    .shot("screens/PRIVACY_POLICY.png")
                    .from(Screens.CONSENT.privacyPolicy);
        }
    }

    public static final PrivacyPolicy PRIVACY_POLICY = new PrivacyPolicy();

    public static final class UserAgreement extends Screen {
        public final Button policyBackArrow = Button.of(Pictures.POLICY_BACK_ARROW);

        @Override
        public Setup setup() {
            return Setup
                    .named("User Agreement")
                    .elements(List.of(Elements.BOLTRAY_GAMES_LICENSE_AGREEMENT))
                    .back(Screens.USER_AGREEMENT.policyBackArrow)
                    .notes("Legal page, no bot work. Back arrow returns to Consent; first tap on the link after returning from a page may do nothing.")
                    .owes(List.of("marker — the text marker also matches Consent's shot (tree holds covered views)"))
                    .from(Screens.CONSENT.userAgreement);
        }
    }

    public static final UserAgreement USER_AGREEMENT = new UserAgreement();

    public static final class StartupLoading extends Screen {
        @Override
        public Setup setup() {
            return Setup
                    .named("Startup loading")
                    .markers(List.of(Pictures.STARTUP_LOADING_BAR_END))
                    .loads(Duration.ofMillis(60000L))
                    .shot("screens/LOADING_PATCH.png")
                    .from(Screens.CONSENT.confirm);
        }
    }

    public static final StartupLoading STARTUP_LOADING = new StartupLoading();

    public static final class Notice extends Screen {
        public final Button noticeBack = Button.of(Pictures.NOTICE_BACK);
        public final Button noticeTabSystem = Button.of(Pictures.NOTICE_TAB_SYSTEM).tried();
        public final Button noticeTabNews = Button.of(Pictures.NOTICE_TAB_NEWS).tried();
        public final Button noticeHideToday = Button.of(Pictures.NOTICE_HIDE_TODAY).tried();
        public final Button noticeItem1 = Button.of(Pictures.NOTICE_ITEM_1).tried().occasional();
        public final Button noticeItem2 = Button.of(Pictures.NOTICE_ITEM_2).tried().occasional();
        public final Button noticeItem3 = Button.of(Pictures.NOTICE_ITEM_3).tried().occasional();
        public final Button noticeItem4 = Button.of(Pictures.NOTICE_ITEM_4).tried().occasional();
        public final Button noticeTabNotice = Button.of(Pictures.NOTICE_TAB_NOTICE).tried();

        @Override
        public Setup setup() {
            return Setup
                    .named("Notice")
                    .markers(List.of(Pictures.NOTICE_TITLE))
                    .back(Screens.NOTICE.noticeBack)
                    .popup()
                    .notes(
                            "Opens by itself after startup loading. Only news: no rewards, no bot work. Tabs Notice, System, News; each lists changing articles, so items come and go. Don't show again today hides it for the day. News holds outside links (Discord, X, Facebook, YouTube), not clicked.")
                    .reached(Reached.SURVEYED)
                    .shot("screens/NOTICE.png");
        }
    }

    public static final Notice NOTICE = new Notice();

    public static final class Title extends Screen {
        public final Button titleTapToPlay = Button.of(Pictures.TITLE_TAP_TO_PLAY);
        public final Button titleServers = Button.of(Pictures.TITLE_SERVERS);
        public final Button titleSettings = Button.of(Pictures.TITLE_SETTINGS);
        public final Button titleFollowUs = Button.of(Pictures.TITLE_FOLLOW_US);
        public final Button titleCustomerService = Button.of(Pictures.TITLE_CUSTOMER_SERVICE);
        public final Button titleNotice = Button.of(Pictures.TITLE_NOTICE).tried();
        public final Button titleUserCenter = Button.of(Pictures.TITLE_USER_CENTER);
        public final Button titleSubmitLogs = Button
                .of(Pictures.TITLE_SUBMIT_LOGS)
                .never("Sends logs to the game's maker; no bot use");
        public final Button titleRepairClient = Button
                .of(Pictures.TITLE_REPAIR_CLIENT)
                .never("Can re-download the game's files; only for a broken install");
        public final Hotkey keyEsc = Hotkey.of(Key.ESCAPE);

        @Override
        public Setup setup() {
            return Setup
                    .named("Title")
                    .markers(List.of(Pictures.TITLE_USER_CENTER))
                    .alsoFrom(List.of(Way.onItsOwn(Screens.STARTUP_LOADING)))
                    .shot("screens/TITLE.png")
                    .from(Screens.NOTICE.noticeBack);
        }
    }

    public static final Title TITLE = new Title();

    public static final class Servers extends Screen {
        public final Button serversRowSelected = Button.of(Pictures.SERVERS_ROW_SELECTED);
        public final Button serversRowOther = Button
                .of(Pictures.SERVERS_ROW_OTHER)
                .never(
                        "Picking another server moves the account to a new start; the run stays on the one the game chose");
        public final Button serversTabAvailable = Button.of(Pictures.SERVERS_TAB_AVAILABLE).tried();
        public final Button serversTabCharacters = Button.of(Pictures.SERVERS_TAB_CHARACTERS).tried();
        public final Button serversSearch = Button.of(Pictures.SERVERS_SEARCH);
        public final Button serversSearchGo = Button.of(Pictures.SERVERS_SEARCH_GO);

        @Override
        public Setup setup() {
            return Setup
                    .named("Servers")
                    .markers(List.of(Pictures.SERVERS_TITLE))
                    .back(Screens.SERVERS.serversRowSelected)
                    .notes("Two tabs: Character List (this account's character on Cloudwold, Lv. 1, 601, tagged Recent) and Available (every server by name with a status dot, a search box and its magnifier below). Dots: green Rcmd, orange Crowded, red Full, grey Maintenance. Tapping the highlighted server closes the list and returns to Title. The account plays on Cloudwold, the game's default. The mouse wheel does not scroll the Available list (30 notches moved it 2 px); more rows sit under the sixth.")
                    .owes(List
                            .of("Available list: scrolling it needs a drag, the wheel does nothing",
                                    "servers_search, servers_search_go: not tried"))
                    .shot("screens/SERVERS.png")
                    .from(Screens.TITLE.titleServers);
        }
    }

    public static final Servers SERVERS = new Servers();

    public static final class Settings extends Screen {
        public final Button settingsTabSound = Button.of(Pictures.SETTINGS_TAB_SOUND).tried();
        public final Button settingsTabOther = Button.of(Pictures.SETTINGS_TAB_OTHER).tried();
        public final Button settingsTextLanguage = Button
                .of(Pictures.SETTINGS_TEXT_LANGUAGE)
                .never("Stays English: the bot reads the game's words");
        public final Button settingsToggleServerChannel = Button
                .of(Pictures.SETTINGS_TOGGLE_SERVER_CHANNEL)
                .never("Only hides chat channels on Home; no bot use, left as the game sets it");
        public final Button settingsTabGame = Button.of(Pictures.SETTINGS_TAB_GAME).tried();
        public final Button settingsTabGraphics = Button.of(Pictures.SETTINGS_TAB_GRAPHICS).tried().occasional();

        @Override
        public Setup setup() {
            return Setup
                    .named("Settings")
                    .markers(List.of(Pictures.SETTINGS_TITLE))
                    .alsoFrom(List.of(Way.of(Screens.STAGE_PACKAGE.menuSettings)))
                    .notes("""
                            Opened from Title's Settings (tabs Game, Sound, Other) or, in game, from Stage's menu (tabs Game, Graphics, Sound, Other).
                            Game: text and voice language (English), chat channels shown on Home.
                            Graphics (in game only): Quality Low/Med./High/Ultra, Frame Rate 30/60, Visible Players Few/Med./Many, Bloom Off/Low/Med./High.
                            Every picture was cut at Quality Med., Frame Rate 60, Visible Players Few, Bloom Off (2026-11-02): Quality and Bloom change how everything is drawn, Visible Players how many other heroes cover the map. Keep them so; the bot changes none of them.
                            Sound: Master, Music, Sound, Voice Over sliders, all 100%.
                            Other: Vibration, Network Boost, Auto-Download Resources (Off, Wi-Fi Only, Cellular Data & Wi-Fi).
                            The game's own language setting is here, separate from Android's.\
                            """)
                    .reached(Reached.SURVEYED)
                    .owes(List.of("graphics options: not cut; never changed by the bot"))
                    .takes(Duration.ofMillis(4700L))
                    .shot("screens/SETTINGS.png")
                    .from(Screens.TITLE.titleSettings);
        }
    }

    public static final Settings SETTINGS = new Settings();

    public static final class OfficialCommunity extends Screen {
        public final Button communityDiscord = Button
                .of(Pictures.COMMUNITY_DISCORD)
                .never("Outside link, leaves the game");
        public final Button communityFacebook = Button
                .of(Pictures.COMMUNITY_FACEBOOK)
                .never("Outside link, leaves the game");
        public final Button communityX = Button.of(Pictures.COMMUNITY_X).never("Outside link, leaves the game");

        @Override
        public Setup setup() {
            return Setup
                    .named("Official Community")
                    .markers(List.of(Pictures.COMMUNITY_TITLE))
                    .shot("screens/OFFICIAL_COMMUNITY.png")
                    .from(Screens.TITLE.titleFollowUs);
        }
    }

    public static final OfficialCommunity OFFICIAL_COMMUNITY = new OfficialCommunity();

    public static final class CustomerService extends Screen {
        public final Button supportBack = Button.of(Pictures.SUPPORT_BACK);

        @Override
        public Setup setup() {
            return Setup
                    .named("Customer Service")
                    .markers(List.of(Pictures.SUPPORT_AVATAR))
                    .back(Screens.CUSTOMER_SERVICE.supportBack)
                    .notes("Live chat with the game's support, full screen with Android's keyboard up. The bot never types or sends here.")
                    .reached(Reached.SURVEYED)
                    .shot("screens/CUSTOMER_SERVICE.png")
                    .from(Screens.TITLE.titleCustomerService);
        }
    }

    public static final CustomerService CUSTOMER_SERVICE = new CustomerService();

    public static final class UserCenter extends Screen {
        public final Button linkAccount = Button
                .of(Elements.LINK_ACCOUNT)
                .never("Binds the guest account to an outside account; the user's call");
        public final Button unlink = Button.of(Elements.UNLINK).never("Changes the account's login; the user's call");
        public final Button userCenterClose = Button.of(Pictures.USER_CENTER_CLOSE);
        public final Button contactSupport = Button.of(Elements.CONTACT_SUPPORT).tried();
        public final Button termsAndConditions = Button.of(Elements.TERMS_AND_CONDITIONS).tried();
        public final Button manageCookies = Button.of(Elements.MANAGE_COOKIES).tried();
        public final Button deleteAccount = Button
                .of(Elements.DELETE_ACCOUNT)
                .never("Deletes the account for good; the user's call");
        public final Button switchInput = Button
                .of(Elements.LT_LY_SWITCH_ACCOUNT)
                .never("Switches the guest account; it warns the in-game progress is lost, the user's call");

        @Override
        public Setup setup() {
            return Setup
                    .named("User Center")
                    .elements(List.of(Elements.LT_TV_DIALOG_TITLE, Elements.SUBSCRIPTION_EMAIL))
                    .back(Screens.USER_CENTER.userCenterClose)
                    .notes("The account's page, a native Android view the tree reads whole: Guest, its ID, version, and the rows Link Account, Contact Support, Terms and Conditions, Manage Cookies, Unlink, Delete Account, Subscription Email, and a Switch button. Contact Support opens the support chat (the same page as Customer Service; two Escapes come back). Terms and Conditions and Manage Cookies raise the agreement dialog (Cancel and Confirm) over this page; Escape closes it without choosing. Subscription Email opens a web email form that the bot never fills; Escape comes back. Switch raises a guest-account warning (Reminder, \"you'll lose your in-game progress\", Confirm); Escape closes it. Link Account, Unlink and Delete Account were not pressed: the user's call.")
                    .owes(List
                            .of(
                                    "marker: Consent's agreement texts also show on its dialogs; need a part only User Center shows"))
                    .shot("screens/USER_CENTER.png")
                    .from(Screens.TITLE.titleUserCenter);
        }
    }

    public static final UserCenter USER_CENTER = new UserCenter();

    public static final class SceneLoading extends Screen {
        public final Button sceneLoadingText = Button.of(Pictures.SCENE_LOADING_TEXT);

        @Override
        public Setup setup() {
            return Setup
                    .named("Scene loading")
                    .markers(List.of(Pictures.ISLAND_LOADING_PATTERN))
                    .alsoFrom(List.of(Way.of(Screens.WORLD.worldIslandOriginisle)))
                    .notes("Shown after Logging in... while the first scene loads: a dark wallpaper of monster silhouettes, a running chibi and \"Loading...\" whose letters bounce. No inputs. The marker is the word Loading as cut; it bounces, so a run may miss it.")
                    .owes(List.of("marker: the word bounces; a still part of the wallpaper wasn't cut in time"))
                    .shot("screens/SCENE_LOADING.png")
                    .from(Screens.TITLE.titleTapToPlay);
        }
    }

    public static final SceneLoading SCENE_LOADING = new SceneLoading();

    public static final class LoggingIn extends Screen {
        @Override
        public Setup setup() {
            return Setup
                    .named("Logging in")
                    .markers(List.of(Pictures.LOGGING_IN_TEXT))
                    .popup()
                    .shot("screens/LOGGING_IN.png");
        }
    }

    public static final LoggingIn LOGGING_IN = new LoggingIn();

    public static final class PrologueBattle extends Screen {
        @Override
        public Setup setup() {
            return Setup
                    .named("Prologue battle")
                    .markers(List.of(Pictures.PROLOGUE_TURN_PORTRAIT))
                    .notes("""
                            The first scene after Tap to Play (Logging in..., then Loading..., then this): a scripted boss battle. Reina and Akane face a tentacled boss, Chaos Tyrant.
                            Seen in order: Reina's dialogue; one tap at 540,1780; the fight played on its own (HUD "Round 1/25", turn-order bar with portraits at the top, boss HP bar showing x98, flame slash effects); then Akane's dialogue "Ugh, not again... We lost...". Akane is shown crying in the bottom left.
                            No HUD button was found or tapped yet: during the fight nothing was tried.\
                            """)
                    .reached(Reached.SURVEYED)
                    .owes(List.of("every input of the battle HUD (none found yet)", "what follows the second dialogue"))
                    .shot("screens/PROLOGUE_BATTLE.png")
                    .from(Screens.SCENE_LOADING.sceneLoadingText);
        }
    }

    public static final PrologueBattle PROLOGUE_BATTLE = new PrologueBattle();

    public static final class PrologueNarration extends Screen {
        public final Button dialoguePanel = Button.of(Pictures.DIALOGUE_PANEL);

        @Override
        public Setup setup() {
            return Setup
                    .named("Prologue narration")
                    .notes(
                            "A dark scene of a long-haired winged figure with a quote shown in grey: \"Until / an adventurer appears, / rekindling\" (cut at that point). Seen once after the second Tutorial dialogue line \"Lord Goddess, please help us!\" was tapped and Scene loading passed. No tap was made on it: it moved on to Select body type by itself.")
                    .reached(Reached.SURVEYED)
                    .owes(List
                            .of("marker — the screen changed before it could be cut, a run may need a wait",
                                    "what a tap does here (it advanced alone)"))
                    .from(Screens.TUTORIAL_DIALOGUE.dialoguePanel);
        }
    }

    public static final PrologueNarration PROLOGUE_NARRATION = new PrologueNarration();

    public static final class SelectBodyType extends Screen {
        public final Button bodyTypeNext = Button.of(Pictures.BODY_TYPE_NEXT);
        public final Button bodyTypeA = Button.of(Pictures.BODY_TYPE_A).tried();
        public final Button bodyTypeB = Button.of(Pictures.BODY_TYPE_B).tried();

        @Override
        public Setup setup() {
            return Setup
                    .named("Select body type")
                    .markers(List.of(Pictures.BODY_TYPE_TITLE))
                    .notes("""
                            Character creation, first step: "Select Body Type" at the top, two large figures (a short-haired one on the left, a long-haired one on the right) and, below, two head icons and a black Next bar.
                            The picked figure is lit with a yellow outline and its head icon is in colour; the other is greyed. Opens with the left one picked.
                            Tapping the right head icon (825,1665) picks the right figure; tapping the left one (290,1665) picks the left again. Both stay on the screen, nothing is left. Not tapped: Next.\
                            """)
                    .reached(Reached.SURVEYED)
                    .owes(List.of("Next (leaves, not tried yet)"))
                    .shot("screens/SELECT_BODY_TYPE.png")
                    .from(Screens.PROLOGUE_NARRATION.dialoguePanel);
        }
    }

    public static final SelectBodyType SELECT_BODY_TYPE = new SelectBodyType();

    public static final class CharacterCustomization extends Screen {
        public final Button customizationBack = Button.of(Pictures.CUSTOMIZATION_BACK);
        public final Button customizationNext = Button.of(Pictures.CUSTOMIZATION_NEXT);
        public final Button customizationTabHair = Button.of(Pictures.CUSTOMIZATION_TAB_HAIR).tried();
        public final Button customizationTabFace = Button.of(Pictures.CUSTOMIZATION_TAB_FACE).tried();
        public final Button customizationTabTrait = Button.of(Pictures.CUSTOMIZATION_TAB_TRAIT).tried();
        public final Button customizationShuffle = Button.of(Pictures.CUSTOMIZATION_SHUFFLE).tried();
        public final Button customizationReset = Button.of(Pictures.CUSTOMIZATION_RESET);

        @Override
        public Setup setup() {
            return Setup
                    .named("Character customization")
                    .markers(List.of(Pictures.CUSTOMIZATION_HEADER))
                    .back(Screens.CHARACTER_CUSTOMIZATION.customizationBack)
                    .notes("""
                            Character creation, second step, after Next on Select body type. "Customization" at the top, the character running on a meadow, an outfit strip (Visage Try-On), four tabs General / Hair / Face / Trait, a back arrow and a black Next bar at the bottom.
                            Opens on General (Skin Tone swatches). Tapping Hair shows Hairstyle / Hair Color; Face shows Eyebrows / Eyes / Pupil Color / Lips / Makeup; Trait shows a grid of options. The screen stays the same, only the panel changes.
                            Shuffle (round arrows, right side) changed the character's hair and skin at once. Reset (circle arrows below it) opens Reset confirm.
                            Not tried: Next, the back arrow, the swatches, the outfit icons.
                            The notice_back and dialogue_next_arrow pictures also score as found on this screen: they clash with the bottom bar.\
                            """)
                    .reached(Reached.SURVEYED)
                    .owes(List.of("Next (leaves)", "the back arrow (untried)", "swatches and outfit try-on icons"))
                    .shot("screens/CHARACTER_CUSTOMIZATION.png")
                    .from(Screens.SELECT_BODY_TYPE.bodyTypeNext);
        }
    }

    public static final CharacterCustomization CHARACTER_CUSTOMIZATION = new CharacterCustomization();

    public static final class ResetConfirm extends Screen {
        public final Button resetConfirmCancel = Button.of(Pictures.RESET_CONFIRM_CANCEL).tried();
        public final Button resetConfirmOk = Button.of(Pictures.RESET_CONFIRM_OK).tried();

        @Override
        public Setup setup() {
            return Setup
                    .named("Reset confirm")
                    .markers(List.of(Pictures.RESET_CONFIRM_TEXT))
                    .back(Screens.RESET_CONFIRM.resetConfirmCancel)
                    .popup()
                    .notes("""
                            A "Confirm" box: "Reset your character customization?" with Cancel and OK. Opened by the reset icon on Character customization.
                            Cancel closed it and kept the look. OK closed it too: the screen below came back (the look was not checked to have changed).\
                            """)
                    .reached(Reached.TRIED)
                    .shot("screens/RESET_CONFIRM.png")
                    .from(Screens.CHARACTER_CUSTOMIZATION.customizationReset);
        }
    }

    public static final ResetConfirm RESET_CONFIRM = new ResetConfirm();

    public static final class CharacterName extends Screen {
        public final Button nameBack = Button.of(Pictures.NAME_BACK);
        public final Button nameField = Button.of(Pictures.NAME_FIELD).tried().submitting().types(Texts.BOTMAKER);
        public final Button nameLetsGo = Button.of(Pictures.NAME_LETS_GO);

        @Override
        public Setup setup() {
            return Setup
                    .named("Character name")
                    .markers(List.of(Pictures.NAME_TITLE))
                    .back(Screens.CHARACTER_NAME.nameBack)
                    .notes("""
                            Character creation, last step seen: "Character Name" at the top, the character on a meadow, a text field "Enter your name" with a 0/16 count, a back arrow and a yellow LET'S GO! bar.
                            Tapping the field opens Android's keyboard (the frame shrinks to about 1006 px tall; the field becomes a white bar above the keys) and hides LET'S GO!. The game's key tool typed lowercase and mangled "BotMaker" (shift taps landed wrong); text sent by adb "input text BotMaker" was typed correctly. Enter closed the keyboard and the name showed in the game's field.
                            The back arrow looks like customization_back and both are found here.
                            Pressing LET'S GO! commits the name on the account (name BotMaker, chosen by the user).\
                            """)
                    .reached(Reached.SURVEYED)
                    .owes(List.of("LET'S GO! (leaves, about to be pressed)", "the back arrow (untried)"))
                    .shot("screens/CHARACTER_NAME.png")
                    .from(Screens.CHARACTER_CUSTOMIZATION.customizationNext);
        }
    }

    public static final CharacterName CHARACTER_NAME = new CharacterName();

    public static final class AethyrisArrival extends Screen {
        @Override
        public Setup setup() {
            return Setup
                    .named("Aethyris arrival")
                    .notes("""
                            The first scene of the world after naming the character: a meadow with a large cherry tree, a cat-eared girl, a crate with a bobbing "Open" label and a red ! badge, a white-haired character lying on the grass. The scene moves by itself (the crate view was gone seconds later) and Akane's dialogue ("Hey, you're awake! I'm Akane, your trusty guide! Nice to meet ya!") covers it.
                            Before it: Reina's dialogue "This world faces a grave crisis. We need your strength." and "Come to Aethyris. Only then can we save..." over black.\
                            """)
                    .reached(Reached.SURVEYED)
                    .owes(List
                            .of("marker — the scene moves on by itself before a still part can be cut",
                                    "the crate (Open) not tried"))
                    .from(Screens.TUTORIAL_DIALOGUE.dialoguePanel);
        }
    }

    public static final AethyrisArrival AETHYRIS_ARRIVAL = new AethyrisArrival();

    public static final class DialogueChoice extends Screen {
        public final Button choiceStaff = Button.of(Pictures.CHOICE_STAFF);
        public final Button choiceSword = Button
                .of(Pictures.CHOICE_SWORD)
                .never("picks the Sword class, once per account; this account chose Staff");

        @Override
        public Setup setup() {
            return Setup
                    .named("Dialogue choice")
                    .markers(List.of(Pictures.CHOICE_ARROW))
                    .absent(List.of(Pictures.UPGRADE_LEVEL_ARROW))
                    .back(Screens.DIALOGUE_CHOICE.choiceStaff)
                    .popup()
                    .notes("""
                            A reply bar over the dialogue: an arrow, one line "I'm here to save the world...", a star at the right. Seen once, over Akane's "Hey, you're awake!" in Aethyris. Only one reply was offered.
                            Tapping it (540,1480) sent the reply: the bar went and Akane answered "Whoa! The Goddess made the perfect pick, and that's exactly why I'm here, too!".\
                            """)
                    .reached(Reached.SURVEYED)
                    .shot("screens/DIALOGUE_CHOICE.png")
                    .from(Screens.TUTORIAL_DIALOGUE.dialoguePanel);
        }
    }

    public static final DialogueChoice DIALOGUE_CHOICE = new DialogueChoice();

    public static final class CartBlueprint extends Screen {
        public final Button cartBlueprintCard = Button.of(Pictures.CART_BLUEPRINT_CARD);

        @Override
        public Setup setup() {
            return Setup
                    .named("Cart blueprint")
                    .markers(List.of(Pictures.CART_BLUEPRINT_CARD))
                    .notes("""
                            Tutorial: after Akane's chores line, the island shows the Cart's blueprint card with "Open" over it.
                            The red ! badge on the card is skipped by the marker.
                            Tapping the card opens Unlock cart.\
                            """)
                    .reached(Reached.TRIED)
                    .shot("screens/CART_BLUEPRINT.png")
                    .from(Screens.TUTORIAL_DIALOGUE.dialogueNextArrow);
        }
    }

    public static final CartBlueprint CART_BLUEPRINT = new CartBlueprint();

    public static final class UnlockFurniture extends Screen {
        public final Button unlockButton = Button.of(Pictures.UNLOCK_BUTTON);

        @Override
        public Setup setup() {
            return Setup
                    .named("Unlock furniture")
                    .markers(List.of(Pictures.UNLOCK_BUTTON))
                    .alsoFrom(List.of(Way.of(Screens.HOME.housePackageCard)))
                    .notes("""
                            Cart (Resources): holds all AFK resources.
                            Unlock is free in the tutorial; its glowing frame pulses, so the picture is the pill's inside.
                            Unlock opens Feature unlocked.\
                            """)
                    .reached(Reached.TRIED)
                    .shot("screens/UNLOCK_CART.png")
                    .from(Screens.CART_BLUEPRINT.cartBlueprintCard);
        }
    }

    public static final UnlockFurniture UNLOCK_FURNITURE = new UnlockFurniture();

    public static final class FeatureUnlocked extends Screen {
        public final Button tapToContinue = Button.of(Pictures.TAP_TO_CONTINUE).tried();

        @Override
        public Setup setup() {
            return Setup
                    .named("Feature unlocked")
                    .markers(List.of(Pictures.UNLOCKED_TITLE))
                    .notes("""
                            Shown after any feature is unlocked (first: Cart); the item in the middle changes, the UNLOCKED title stays.
                            Tap to Continue closes it; in the tutorial Akane's dialogue follows.\
                            """)
                    .reached(Reached.TRIED)
                    .takes(Duration.ofMillis(7200L))
                    .shot("screens/CART_UNLOCKED.png")
                    .from(Screens.UNLOCK_FURNITURE.unlockButton);
        }
    }

    public static final FeatureUnlocked FEATURE_UNLOCKED = new FeatureUnlocked();

    public static final class Island extends Screen {
        public final Button islandCartButton = Button.of(Pictures.ISLAND_CART_BUTTON);

        @Override
        public Setup setup() {
            return Setup
                    .named("Island")
                    .markers(List.of(Pictures.ISLAND_CART_BUTTON))
                    .shot("screens/ISLAND.png")
                    .from(Screens.TUTORIAL_DIALOGUE.dialogueNextArrow);
        }
    }

    public static final Island ISLAND = new Island();

    public static final class Cart extends Screen {
        public final Button cartRowUnlock = Button.of(Pictures.CART_ROW_UNLOCK).tried().repeated();
        public final Button cartClaimAll = Button.of(Pictures.CART_CLAIM_ALL);
        public final Button cartRowUpgrade = Button.of(Pictures.CART_ROW_UPGRADE).repeated();
        public final Button cartoutside = Button.beside(Pictures.CART_CLAIM_ALL, 0.0, 2.8);

        @Override
        public Setup setup() {
            return Setup
                    .named("Cart")
                    .markers(List.of(Pictures.CART_HEADER_PICTURE))
                    .back(Screens.CART.cartoutside)
                    .notes("""
                            Cart: AFK resources pile up here. Rows: Rolla (+1000/h at Lv.1), Wood and Stone (+50/h each); Raw Ore and Battle Essence unlock at Lv. 3.
                            Tutorial: each row is unlocked free with its Unlock button, then Claim All gives what piled up (You received).
                            Each unlocked row has an upgrade arrow, opening Furniture upgrade.
                            No close button: a tap below the panel closes it (cartOutside); Back does nothing.
                            The tutorial dims all but the highlighted button, so pictures cut then score low after it.\
                            """)
                    .reached(Reached.TRIED)
                    .takes(Duration.ofMillis(5900L))
                    .shot("screens/CART.png")
                    .from(Screens.ISLAND.islandCartButton);
        }
    }

    public static final Cart CART = new Cart();

    public static final class YouReceived extends Screen {
        public final Button youReceivedTitle = Button.of(Pictures.YOU_RECEIVED_TITLE);

        @Override
        public Setup setup() {
            return Setup
                    .named("You received")
                    .markers(List.of(Pictures.YOU_RECEIVED_TITLE))
                    .back(Screens.YOU_RECEIVED.youReceivedTitle)
                    .notes("""
                            Shows what was just claimed (Cart's Claim All: Rolla, Stone, Wood). A tap on it closes it.
                            It opens a few seconds after the claim.\
                            """)
                    .reached(Reached.TRIED)
                    .shot("screens/YOU_RECEIVED.png")
                    .from(Screens.CART.cartClaimAll);
        }
    }

    public static final YouReceived YOU_RECEIVED = new YouReceived();

    public static final class FurnitureUpgrade extends Screen {
        public final Button upgradeBack = Button.of(Pictures.UPGRADE_BACK);
        public final Button upgradeTabWood = Button.of(Pictures.UPGRADE_TAB_WOOD).tried();
        public final Button upgradeTabStone = Button.of(Pictures.UPGRADE_TAB_STONE).tried();

        @Override
        public Setup setup() {
            return Setup
                    .named("Furniture upgrade")
                    .markers(List.of(Pictures.UPGRADE_LEVEL_ARROW))
                    .back(Screens.FURNITURE_UPGRADE.upgradeBack)
                    .notes("""
                            Upgrades one Cart row: tabs Rolla, Wood, Stone along the top; shows the yield and reserve at this level and the next, and the upgrade cost (Wood, Stone, Rolla).
                            Lv.1 to Lv.2 needs Blessing Lv. 2 first.
                            The Rolla tab's coin shines, so it has no picture; it is the tab shown first from the Rolla row.
                            upgrade_back also matches notice_back, name_back and customization_back (same black pill).\
                            """)
                    .reached(Reached.TRIED)
                    .owes(List.of("upgrade_tab_rolla: the coin shines, so no still picture yet"))
                    .shot("screens/FURNITURE_UPGRADE.png")
                    .from(Screens.CART.cartRowUpgrade);
        }
    }

    public static final FurnitureUpgrade FURNITURE_UPGRADE = new FurnitureUpgrade();

    public static final class Home extends Screen {
        public final Button housePackageCard = Button.of(Pictures.HOUSE_PACKAGE_CARD);
        public final Button houseStorageChest = Button.of(Pictures.HOUSE_STORAGE_CHEST);
        public final Button navCharacter = Button.of(Pictures.NAV_CHARACTER);

        @Override
        public Setup setup() {
            return Setup
                    .named("Home")
                    .markers(List.of(Pictures.HOUSE_ARCH_WINDOW))
                    .shot("screens/HOUSE.png")
                    .from(Screens.TUTORIAL_DIALOGUE.dialogueNextArrow);
        }
    }

    public static final Home HOME = new Home();

    public static final class StorageChest extends Screen {
        public final Button upgradeBack = Button.of(Pictures.UPGRADE_BACK);

        @Override
        public Setup setup() {
            return Setup
                    .named("Storage chest")
                    .back(Screens.STORAGE_CHEST.upgradeBack)
                    .notes("""
                            The bag ("Item"): what the AFK Cart gathered (Wood 50, Stone 50 after the tutorial claim). Currencies along the top: Rolla and two others at 0.
                            A Type filter at the top right; tabs along the bottom: bag, gear, gem, pot.
                            Tutorial: opened from the House's storage chest; it dims all but Back.\
                            """)
                    .reached(Reached.SURVEYED)
                    .owes(List
                            .of("marker — the tutorial dimmed the screen; cut the Type filter or the bag tab when it is not",
                                    "inputs — Type filter and the bottom tabs, untried"))
                    .takes(Duration.ofMillis(12100L))
                    .shot("screens/STORAGE_CHEST.png")
                    .from(Screens.HOME.houseStorageChest);
        }
    }

    public static final StorageChest STORAGE_CHEST = new StorageChest();

    public static final class Character extends Screen {
        public final Button charGearSlot = Button.of(Pictures.CHAR_GEAR_SLOT).repeated();
        public final Button charSkillIcon = Button.of(Pictures.CHAR_SKILL_ICON);
        public final Button navPortal = Button.of(Pictures.NAV_PORTAL);

        @Override
        public Setup setup() {
            return Setup
                    .named("Character")
                    .markers(List.of(Pictures.CHAR_CLASS_ICON))
                    .notes("""
                            The character: class emblem (No Class at first), gear slots around the hero (left: weapon; right: three more), a locked slot under the weapon.
                            Skill and Class buttons under the hero; level, rank and stats (ATK, DEF, HP, SPD) below.
                            Opened from the bottom bar's first tab (the hero's face).
                            Tutorial: equip the Novice Staff from the left slot (ATK 60 to 84, SPD 48 to 55), then Skill.\
                            """)
                    .reached(Reached.SURVEYED)
                    .owes(List
                            .of("inputs — Class button, the right gear slots and the rank, untried while the tutorial leads"))
                    .takes(Duration.ofMillis(7600L))
                    .shot("screens/CHARACTER.png")
                    .from(Screens.HOME.navCharacter);
        }
    }

    public static final Character CHARACTER = new Character();

    public static final class ReplaceGear extends Screen {
        public final Button gearNoviceStaff = Button.of(Pictures.GEAR_NOVICE_STAFF);

        @Override
        public Setup setup() {
            return Setup
                    .named("Replace gear")
                    .markers(List.of(Pictures.REPLACE_GEAR_CORNER))
                    .notes("""
                            Lists the gear that fits the slot pressed on Character; a tap on an item opens Gear details.
                            First item: Novice Staff (Common, power 81, Level 3), given for picking Staff.\
                            """)
                    .reached(Reached.TRIED)
                    .takes(Duration.ofMillis(5100L))
                    .shot("screens/EQUIP_WEAPON.png")
                    .from(Screens.CHARACTER.charGearSlot)
                    .fromPick(Pick.nth(2, Order.NORTH));
        }
    }

    public static final ReplaceGear REPLACE_GEAR = new ReplaceGear();

    public static final class GearDetails extends Screen {
        public final Button gearLock = Button.of(Pictures.GEAR_LOCK);
        public final Button gearEquip = Button.of(Pictures.GEAR_EQUIP).leaving();

        @Override
        public Setup setup() {
            return Setup
                    .named("Gear details")
                    .markers(List.of(Pictures.GEAR_SHARE))
                    .notes("""
                            One piece of gear: rarity, power, level, stats; Equip puts it on and goes back to Character.
                            Share and lock icons at the top right; what the lock does is not tried yet.\
                            """)
                    .reached(Reached.SURVEYED)
                    .owes(List.of("gear_lock — untried while the tutorial leads"))
                    .takes(Duration.ofMillis(10700L))
                    .shot("screens/GEAR_DETAILS.png")
                    .from(Screens.REPLACE_GEAR.gearNoviceStaff);
        }
    }

    public static final GearDetails GEAR_DETAILS = new GearDetails();

    public static final class Skills extends Screen {
        public final Button skillsLoadoutPrev = Button.of(Pictures.SKILLS_LOADOUT_PREV);
        public final Button skillsLoadoutNext = Button.of(Pictures.SKILLS_LOADOUT_NEXT);
        public final Button skillsWaterShot = Button.of(Pictures.SKILLS_WATER_SHOT);
        public final Button upgradeBack = Button.of(Pictures.UPGRADE_BACK).tried();

        @Override
        public Setup setup() {
            return Setup
                    .named("Skills")
                    .markers(List.of(Pictures.SKILLS_LOADOUT_PENCIL))
                    .back(Screens.SKILLS.upgradeBack)
                    .notes("""
                            Skill loadout: eight skill slots around the hero (four each side), loadout pages with arrows and a pencil to rename.
                            Tabs Technique, Charm, Shard, an All box; the bottom bar has Skill and Goals.
                            A technique pressed opens Technique details; its Equip asks for a slot, then fills it.
                            Tutorial: Water Shot (the Staff's first technique) goes in the top-left slot.\
                            """)
                    .reached(Reached.SURVEYED)
                    .owes(List
                            .of("inputs — loadout arrows, Charm and Shard tabs, All, Goals: untried while the tutorial leads"))
                    .takes(Duration.ofMillis(7900L))
                    .shot("screens/SKILLS.png")
                    .from(Screens.CHARACTER.charSkillIcon);
        }
    }

    public static final Skills SKILLS = new Skills();

    public static final class TechniqueDetails extends Screen {
        public final Button techniqueEquip = Button.of(Pictures.TECHNIQUE_EQUIP);

        @Override
        public Setup setup() {
            return Setup
                    .named("Technique details")
                    .markers(List.of(Pictures.TECHNIQUE_PIN))
                    .back(Screens.TECHNIQUE_DETAILS.techniqueEquip)
                    .notes("""
                            One technique: rarity, type (Water Shot: Rare, Single-Hit DMG, 43.6%+3 DMG to 1 enemy within 4 grids), its range grid and source.
                            Equip, then a slot on Skills; Enhance levels it up (not tried).
                            Its share icon also matches Gear details' header; the pin icon tells them apart.\
                            """)
                    .reached(Reached.SURVEYED)
                    .owes(List.of("technique_enhance — its frame moved when cut; cut and try after the tutorial"))
                    .takes(Duration.ofMillis(5500L))
                    .shot("screens/TECHNIQUE_DETAILS.png")
                    .from(Screens.SKILLS.skillsWaterShot);
        }
    }

    public static final TechniqueDetails TECHNIQUE_DETAILS = new TechniqueDetails();

    public static final class World extends Screen {
        public final Button worldIslandOriginisle = Button.of(Pictures.WORLD_ISLAND_ORIGINISLE);
        public final Button worldChest = Button.of(Pictures.WORLD_CHEST);

        @Override
        public Setup setup() {
            return Setup
                    .named("World")
                    .markers(List.of(Pictures.WORLD_TAB_SELECTED))
                    .takes(Duration.ofMillis(8600L))
                    .shot("screens/NAV_PORTAL.png")
                    .from(Screens.CHARACTER.navPortal);
        }
    }

    public static final World WORLD = new World();

    public static final class Stage extends Screen {
        public final Button upgradeBack = Button.of(Pictures.UPGRADE_BACK);
        public final Button stagePackage = Button.of(Pictures.STAGE_PACKAGE);
        public final Button topAvatar = Button.of(Pictures.TOP_AVATAR);
        public final Button stageDownloadReward = Button.of(Pictures.STAGE_DOWNLOAD_REWARD).occasional();
        public final Button stageBoar = Button.of(Pictures.STAGE_BOAR);
        public final Button stageOreNode = Button.of(Pictures.STAGE_ORE_NODE).tried().occasional();
        public final Button stageWoodNode = Button.of(Pictures.STAGE_WOOD_NODE).tried().occasional();
        public final Button stageQuestTracker = Button.of(Pictures.STAGE_QUEST_TRACKER);
        public final Button stagePlantMonster = Button.of(Pictures.STAGE_PLANT_MONSTER).leaving().occasional();
        public final Button stageBoarIdle = Button.of(Pictures.STAGE_BOAR_IDLE).occasional();
        public final Button stageBoarCheck = Button.of(Pictures.STAGE_BOAR_CHECK).occasional();
        public final Button stagePlantIdle = Button.of(Pictures.STAGE_PLANT_IDLE).occasional();
        @Override
        public Setup setup() {
            return Setup
                    .named("Stage")
                    .markers(List.of(Pictures.STAGE_QUEST_ICON))
                    .back(Screens.STAGE.upgradeBack)
                    .notes("""
                            The island stage (Originisle I), reached from World's island card through Scene loading.
                            Stage is a window on a big tile map. A tap on a visible ground cell walks the hero there.
                            The game finds the path itself, round trees and rocks: checked from (27, 17) to (23, 21) round the tree clumps.
                            The camera does not follow the walk. A swipe on the ground pans it.
                            The minimap's label (about 860,399 and 877,434) says the map and the hero's cell: "Originisle I (25, 19)".
                            One cell is about 150 px across and 170 px down; x grows to the right, y grows upward.
                            Quest panel bottom left: "The First Battles", Originisle I Battle Wins 1/2. Its icon opens the quest's details; it does not walk there.
                            Resource nodes (ore, wood log) show on the map; a tap on one did nothing seen in the tutorial.
                            A chat strip sits above the back button.\
                            """)
                    .reached(Reached.SURVEYED)
                    .owes(List
                            .of("minimap — its inside moves with the hero; needs a spot or a still part of its ring",
                                    "chat strip — only text; not cut",
                                    "quest claim gift — the tutorial's highlight pulses over it; cut it after the tutorial",
                                    "stage_quest_tracker — same icon as the marker stage_quest_icon; keep one",
                                    "stage_plant_monster — monsters animate; cut from leaves, weak; needs a still part or several looks"))
                    .shot("screens/STAGE.png")
                    .after(Screens.SCENE_LOADING);
        }
    }

    public static final Stage STAGE = new Stage();

    public static final class Battle extends Screen {
        public final Button battleStart = Button.of(Pictures.BATTLE_START).leaving();
        public final Button battleLock = Button.of(Pictures.BATTLE_LOCK).tried();
        public final Button battleLoadoutSwap = Button.of(Pictures.BATTLE_LOADOUT_SWAP);
        public final Button battleCamera = Button.of(Pictures.BATTLE_CAMERA).tried();
        public final Button noticeBack = Button.of(Pictures.NOTICE_BACK);

        @Override
        public Setup setup() {
            return Setup
                    .named("Battle")
                    .markers(List.of(Pictures.BATTLE_CAMERA))
                    .back(Screens.BATTLE.noticeBack)
                    .notes("""
                            The pre-fight view, reached by tapping an enemy on Stage (through the loading wallpaper).
                            Shows Round 0/15, the enemy above, the hero below, Start Battle, the camera and lock buttons, and Loadout 1 with its skill slots.
                            Start Battle plays the fight by itself: Start Battle and the loadout label go, the round counter runs (Round 1/15).
                            A won fight returns to Stage in about 5 s with no result screen.
                            The camera button changes the view in place; the lock button showed no change.
                            The loadout swap opens Skill Loadout (4 loadouts, Edit, OK). Edit opens the loadout editor, where Escape is refused: "Cannot return while in battle".\
                            """)
                    .reached(Reached.SURVEYED)
                    .takes(Duration.ofMillis(4500L))
                    .shot("screens/BATTLE.png")
                    .from(Screens.STAGE.stageBoar);
        }
    }

    public static final Battle BATTLE = new Battle();

    public static final class StageQuestTracker extends Screen {
        public final Button questClaimButton = Button.of(Pictures.QUEST_CLAIM_BUTTON).tried();
        public final Hotkey keyEsc = Hotkey.of(Key.ESCAPE);

        @Override
        public Setup setup() {
            return Setup
                    .named("Stage quest tracker")
                    .markers(List.of(Pictures.QUEST_GOAL_LABEL))
                    .back(Screens.STAGE_QUEST_TRACKER.keyEsc)
                    .takes(Duration.ofMillis(4200L))
                    .shot("screens/STAGE_QUEST_TRACKER.png")
                    .from(Screens.STAGE.stageQuestTracker);
        }
    }

    public static final StageQuestTracker STAGE_QUEST_TRACKER = new StageQuestTracker();

    public static final class BattleLoadoutSwap extends Screen {
        public final Button loadoutEdit = Button.of(Pictures.LOADOUT_EDIT);
        public final Button loadoutOk = Button.of(Pictures.LOADOUT_OK);

        @Override
        public Setup setup() {
            return Setup
                    .named("Battle loadout swap")
                    .markers(List.of(Pictures.LOADOUT_RADIO_EMPTY))
                    .back(Screens.BATTLE_LOADOUT_SWAP.loadoutOk)
                    .takes(Duration.ofMillis(5900L))
                    .shot("screens/BATTLE_LOADOUT_SWAP.png")
                    .from(Screens.BATTLE.battleLoadoutSwap);
        }
    }

    public static final BattleLoadoutSwap BATTLE_LOADOUT_SWAP = new BattleLoadoutSwap();

    public static final class LoadoutEdit extends Screen {
        public final Button loadoutEditCharmTab = Button.of(Pictures.LOADOUT_EDIT_CHARM_TAB).tried();
        public final Button loadoutEditTechniqueTab = Button.of(Pictures.LOADOUT_EDIT_TECHNIQUE_TAB);
        public final Button loadoutEditEmptySlot = Button.of(Pictures.LOADOUT_EDIT_EMPTY_SLOT).tried();
        public final Hotkey keyEsc = Hotkey.of(Key.ESCAPE).tried();
        public final Button upgradeBack = Button.of(Pictures.UPGRADE_BACK);

        @Override
        public Setup setup() {
            return Setup
                    .named("Loadout edit")
                    .markers(List.of(Pictures.LOADOUT_EDIT_HEADER))
                    .back(Screens.LOADOUT_EDIT.upgradeBack)
                    .takes(Duration.ofMillis(4800L))
                    .shot("screens/LOADOUT_EDIT.png")
                    .from(Screens.BATTLE_LOADOUT_SWAP.loadoutEdit);
        }
    }

    public static final LoadoutEdit LOADOUT_EDIT = new LoadoutEdit();

    public static final class QuitConfirm extends Screen {
        public final Button resetConfirmCancel = Button.of(Pictures.RESET_CONFIRM_CANCEL);
        public final Button resetConfirmOk = Button.of(Pictures.RESET_CONFIRM_OK).never("quits the game");

        @Override
        public Setup setup() {
            return Setup
                    .named("Quit confirm")
                    .markers(List.of(Pictures.QUIT_GAME_QUESTION))
                    .back(Screens.QUIT_CONFIRM.resetConfirmCancel)
                    .shot("screens/QUIT_CONFIRM.png")
                    .from(Screens.TITLE.keyEsc);
        }
    }

    public static final QuitConfirm QUIT_CONFIRM = new QuitConfirm();

    public static final class TopAvatar extends Screen {
        public final Button profilePowerSearch = Button.of(Pictures.PROFILE_POWER_SEARCH).info();
        public final Button profileStatsSearch = Button.of(Pictures.PROFILE_STATS_SEARCH);
        public final Button profileDish = Button.of(Pictures.PROFILE_DISH);
        public final Button profileQuickHeal = Button.of(Pictures.PROFILE_QUICK_HEAL).never("Spends a healing item; the user's call");

        @Override
        public Setup setup() {
            return Setup
                    .named("Top avatar")
                    .markers(List.of(Pictures.PROFILE_PLAYER_ID_LABEL))
                    .notes("""
                            The player's profile, opened by the avatar at the top left of Stage: power, class, player ID, rank, server (Cloudwold), stats, equipped gear, techniques and charms, HP bar.
                            No settings here: no graphics, sound or language option.
                            Escape closes it back to Stage.
                            The power magnifier opens Character Power (power by source); Escape closes it.\
                            """)
                    .reached(Reached.SURVEYED)
                    .owes(List
                            .of("Escape as its way back (works, not recorded as an input)",
                                    "profile_stats_search, profile_dish: untried",
                                    "profile_quick_heal: spends a healing item, the user's call",
                                    "gear, technique and charm slots, like thumb, player ID copy: not cut"))
                    .takes(Duration.ofMillis(8400L))
                    .shot("screens/TOP_AVATAR.png")
                    .from(Screens.STAGE.topAvatar);
        }
    }

    public static final TopAvatar TOP_AVATAR = new TopAvatar();

    public static final class ProfilePowerSearch extends Screen {
        @Override
        public Setup setup() {
            return Setup
                    .named("Profile power search")
                    .markers(List.of(Pictures.POWER_BREAKDOWN_TITLE))
                    .takes(Duration.ofMillis(2500L))
                    .shot("screens/PROFILE_POWER_SEARCH.png")
                    .from(Screens.TOP_AVATAR.profilePowerSearch);
        }
    }

    public static final ProfilePowerSearch PROFILE_POWER_SEARCH = new ProfilePowerSearch();

    public static final class StagePackage extends Screen {
        public final Button upgradeBack = Button.of(Pictures.UPGRADE_BACK);
        public final Button menuQuest = Button.of(Pictures.MENU_QUEST);
        public final Button menuPhoto = Button.of(Pictures.MENU_PHOTO);
        public final Button menuUserCenter = Button.of(Pictures.MENU_USER_CENTER);
        public final Button menuSettings = Button.of(Pictures.MENU_SETTINGS);
        public final Button menuNotice = Button.of(Pictures.MENU_NOTICE).tried();

        @Override
        public Setup setup() {
            return Setup
                    .named("Stage package")
                    .markers(List.of(Pictures.MENU_SERVER_TIME_LABEL))
                    .back(Screens.STAGE_PACKAGE.upgradeBack)
                    .takes(Duration.ofMillis(6600L))
                    .shot("screens/STAGE_PACKAGE.png")
                    .from(Screens.STAGE.stagePackage);
        }
    }

    public static final StagePackage STAGE_PACKAGE = new StagePackage();

    public static final class MenuQuest extends Screen {
        public final Button upgradeBack = Button.of(Pictures.UPGRADE_BACK);
        public final Button questGo = Button.of(Pictures.QUEST_GO);
        public final Button questTabAchievement = Button.of(Pictures.QUEST_TAB_ACHIEVEMENT);

        @Override
        public Setup setup() {
            return Setup
                    .named("Menu quest")
                    .markers(List.of(Pictures.GUIDANCE_QUEST_TITLE))
                    .back(Screens.MENU_QUEST.upgradeBack)
                    .notes("""
                            Guidance Quest: the quest list, opened by Quest on Stage's menu. Tabs Quest and Achievement at the bottom, back arrow at the bottom left.
                            Main Quest: Wild Isle Trek I (the one tracked on Stage, reward 30), then Warrior's Equipment (50), Combat Beginner (15), Polish Up (10 + 80), Skill Honing (1K), each with Go >> on the right.
                            Go >> appears once per quest row (4 copies here); each likely walks to that quest's place.\
                            """)
                    .reached(Reached.SURVEYED)
                    .owes(List
                            .of("quest_go: one per row, each leads elsewhere; try one",
                                    "quest_tab_achievement: untried"))
                    .takes(Duration.ofMillis(7100L))
                    .shot("screens/MENU_QUEST.png")
                    .from(Screens.STAGE_PACKAGE.menuQuest);
        }
    }

    public static final MenuQuest MENU_QUEST = new MenuQuest();

    public static final class MenuPhoto extends Screen {
        public final Button photoZoomIn = Button.of(Pictures.PHOTO_ZOOM_IN).tried();
        public final Button photoZoomOut = Button.of(Pictures.PHOTO_ZOOM_OUT).tried();
        public final Button noticeBack = Button.of(Pictures.NOTICE_BACK);

        @Override
        public Setup setup() {
            return Setup
                    .named("Menu photo")
                    .markers(List.of(Pictures.PHOTO_SHUTTER))
                    .back(Screens.MENU_PHOTO.noticeBack)
                    .takes(Duration.ofMillis(4300L))
                    .shot("screens/MENU_PHOTO.png")
                    .from(Screens.STAGE_PACKAGE.menuPhoto);
        }
    }

    public static final MenuPhoto MENU_PHOTO = new MenuPhoto();

    public static final class MenuUserCenter extends Screen {
        public final Button ucAccountCenter = Button.of(Pictures.UC_ACCOUNT_CENTER);
        public final Button ucHelpCenter = Button.of(Pictures.UC_HELP_CENTER);
        public final Button ucSubmitLogs = Button.of(Pictures.UC_SUBMIT_LOGS);
        public final Button ucPrivacyPolicy = Button.of(Pictures.UC_PRIVACY_POLICY);
        public final Button ucUserAgreement = Button.of(Pictures.UC_USER_AGREEMENT);
        public final Button ucSelfService = Button.of(Pictures.UC_SELF_SERVICE);
        public final Button ucGiftCode = Button.of(Pictures.UC_GIFT_CODE);

        @Override
        public Setup setup() {
            return Setup
                    .named("Menu user center")
                    .markers(List.of(Pictures.USER_CENTER_TITLE))
                    .takes(Duration.ofMillis(3400L))
                    .shot("screens/MENU_USER_CENTER.png")
                    .from(Screens.STAGE_PACKAGE.menuUserCenter);
        }
    }

    public static final MenuUserCenter MENU_USER_CENTER = new MenuUserCenter();

    public static final class Achievement extends Screen {
        public final Button noticeBack = Button.of(Pictures.NOTICE_BACK);
        public final Button questTabQuest = Button.of(Pictures.QUEST_TAB_QUEST);
        public final Button achievementCard = Button.of(Pictures.ACHIEVEMENT_CARD);

        @Override
        public Setup setup() {
            return Setup
                    .named("Achievement")
                    .markers(List.of(Pictures.ACHIEVEMENT_TITLE))
                    .back(Screens.ACHIEVEMENT.noticeBack)
                    .takes(Duration.ofMillis(4200L))
                    .shot("screens/ACHIEVEMENT.png")
                    .from(Screens.MENU_QUEST.questTabAchievement);
        }
    }

    public static final Achievement ACHIEVEMENT = new Achievement();

    public static final class ReturnHomeConfirm extends Screen {
        public final Button resetConfirmCancel = Button.of(Pictures.RESET_CONFIRM_CANCEL);
        public final Button resetConfirmOk = Button.of(Pictures.RESET_CONFIRM_OK);

        @Override
        public Setup setup() {
            return Setup
                    .named("Return home confirm")
                    .markers(List.of(Pictures.RETURN_HOME_TEXT))
                    .back(Screens.RETURN_HOME_CONFIRM.resetConfirmCancel)
                    .takes(Duration.ofMillis(4300L))
                    .shot("screens/QUEST_GO.png")
                    .from(Screens.MENU_QUEST.questGo);
        }
    }

    public static final ReturnHomeConfirm RETURN_HOME_CONFIRM = new ReturnHomeConfirm();

    public static final class CharacterStats extends Screen {
        public final Button statsTabGeneral = Button.of(Pictures.STATS_TAB_GENERAL);
        public final Button statsTabDetails = Button.of(Pictures.STATS_TAB_DETAILS);
        public final Button statsMainHeading = Button.of(Pictures.STATS_MAIN_HEADING);

        @Override
        public Setup setup() {
            return Setup
                    .named("Character stats")
                    .markers(List.of(Pictures.CHARACTER_STATS_TITLE))
                    .shot("screens/CHARACTER_STATS.png")
                    .from(Screens.TOP_AVATAR.profileStatsSearch);
        }
    }

    public static final CharacterStats CHARACTER_STATS = new CharacterStats();

    private Screens() {
    }
}
