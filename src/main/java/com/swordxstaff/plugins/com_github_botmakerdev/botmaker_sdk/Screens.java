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
                    .at(new Point(1651, 0))
                    .shot("screens/CONSENT.png");
        }
    }

    public static final Consent CONSENT = new Consent();

    public static final class TutorialDialogue extends Screen {
        public final Button dialoguePanel = Button.of(Pictures.DIALOGUE_PANEL);

        @Override
        public Setup setup() {
            return Setup
                    .named("Tutorial dialogue")
                    .markers(List.of(Pictures.DIALOGUE_PANEL))
                    .popup()
                    .notes("""
                            A speech box over the scene: name tag, one line of text, a bobbing arrow at the bottom centre. Seen over the Prologue battle at 1080x1920: first Reina "The final showdown again. Let's do this.", then Akane "Ugh, not again... We lost...".
                            Marker: dialogue_panel at 60,1730 (900x110); the arrow bobs and matches only at 0.91.
                            One tap at 540,1780 moved on from the first line (seen once; not tried at the second).\
                            """)
                    .reached(Reached.SURVEYED)
                    .at(new Point(340, 0))
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
                    .at(new Point(1905, 318))
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
                    .at(new Point(1349, 318))
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
                    .at(new Point(1627, 318))
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
                    .at(new Point(0, 0))
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

        @Override
        public Setup setup() {
            return Setup
                    .named("Title")
                    .markers(List.of(Pictures.TITLE_USER_CENTER))
                    .alsoFrom(List.of(Way.onItsOwn(Screens.STARTUP_LOADING)))
                    .at(new Point(1627, 621))
                    .shot("screens/TITLE.png")
                    .from(Screens.NOTICE.noticeBack);
        }
    }

    public static final Title TITLE = new Title();

    public static final class Servers extends Screen {
        public final Button serversRowSelected = Button.of(Pictures.SERVERS_ROW_SELECTED);
        public final Button serversRowOther = Button.of(Pictures.SERVERS_ROW_OTHER).never(
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
                    .at(new Point(1298, 924))
                    .shot("screens/SERVERS.png")
                    .from(Screens.TITLE.titleServers);
        }
    }

    public static final Servers SERVERS = new Servers();

    public static final class Settings extends Screen {
        public final Button settingsTabSound = Button.of(Pictures.SETTINGS_TAB_SOUND).tried();
        public final Button settingsTabOther = Button.of(Pictures.SETTINGS_TAB_OTHER).tried();
        public final Button settingsTextLanguage = Button.of(Pictures.SETTINGS_TEXT_LANGUAGE).never("Stays English: the bot reads the game's words");
        public final Button settingsToggleServerChannel = Button.of(Pictures.SETTINGS_TOGGLE_SERVER_CHANNEL)
                .never("Only hides chat channels on Home; no bot use, left as the game sets it");
        public final Button settingsTabGame = Button.of(Pictures.SETTINGS_TAB_GAME).tried();

        @Override
        public Setup setup() {
            return Setup
                    .named("Settings")
                    .markers(List.of(Pictures.SETTINGS_TITLE))
                    .notes(
                            "Three tabs. Game: text and voice language (English), chat channels shown on Home. Sound: Master, Music, Sound, Voice Over sliders, all 100%. Other: Vibration, Network Boost, Auto-Download Resources (Off, Wi-Fi Only, Cellular Data & Wi-Fi). The game's own language setting is here, separate from Android's.")
                    .reached(Reached.SURVEYED)
                    .at(new Point(1020, 924))
                    .shot("screens/SETTINGS.png")
                    .from(Screens.TITLE.titleSettings);
        }
    }

    public static final Settings SETTINGS = new Settings();

    public static final class OfficialCommunity extends Screen {
        public final Button communityDiscord = Button.of(Pictures.COMMUNITY_DISCORD).never("Outside link, leaves the game");
        public final Button communityFacebook = Button.of(Pictures.COMMUNITY_FACEBOOK).never("Outside link, leaves the game");
        public final Button communityX = Button.of(Pictures.COMMUNITY_X).never("Outside link, leaves the game");

        @Override
        public Setup setup() {
            return Setup
                    .named("Official Community")
                    .markers(List.of(Pictures.COMMUNITY_TITLE))
                    .at(new Point(2410, 924))
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
                    .at(new Point(1854, 924))
                    .shot("screens/CUSTOMER_SERVICE.png")
                    .from(Screens.TITLE.titleCustomerService);
        }
    }

    public static final CustomerService CUSTOMER_SERVICE = new CustomerService();

    public static final class UserCenter extends Screen {
        public final Button linkAccount = Button.of(Elements.LINK_ACCOUNT).never("Binds the guest account to an outside account; the user's call");
        public final Button unlink = Button.of(Elements.UNLINK).never("Changes the account's login; the user's call");
        public final Button userCenterClose = Button.of(Pictures.USER_CENTER_CLOSE);
        public final Button contactSupport = Button.of(Elements.CONTACT_SUPPORT).tried();
        public final Button termsAndConditions = Button.of(Elements.TERMS_AND_CONDITIONS).tried();
        public final Button manageCookies = Button.of(Elements.MANAGE_COOKIES).tried();
        public final Button deleteAccount = Button.of(Elements.DELETE_ACCOUNT).never("Deletes the account for good; the user's call");
        public final Button switchInput = Button.of(Elements.LT_LY_SWITCH_ACCOUNT)
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
                    .at(new Point(1576, 924))
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
                    .markers(List.of(Pictures.SCENE_LOADING_TEXT))
                    .notes(
                            "Shown after Logging in... while the first scene loads: a dark wallpaper of monster silhouettes, a running chibi and \"Loading...\" whose letters bounce. No inputs. The marker is the word Loading as cut; it bounces, so a run may miss it.")
                    .owes(List.of("marker: the word bounces; a still part of the wallpaper wasn't cut in time"))
                    .at(new Point(2132, 932))
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
                    .at(new Point(743, 16))
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
                    .at(new Point(2132, 1541))
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
        public final Button customizationTabHair = Button.of(Pictures.CUSTOMIZATION_TAB_HAIR);
        public final Button customizationTabFace = Button.of(Pictures.CUSTOMIZATION_TAB_FACE);
        public final Button customizationTabTrait = Button.of(Pictures.CUSTOMIZATION_TAB_TRAIT);
        public final Button customizationShuffle = Button.of(Pictures.CUSTOMIZATION_SHUFFLE);
        public final Button customizationReset = Button.of(Pictures.CUSTOMIZATION_RESET);
        public final Button resetConfirmCancel = Button.of(Pictures.RESET_CONFIRM_CANCEL);
        public final Button resetConfirmOk = Button.of(Pictures.RESET_CONFIRM_OK);

        @Override
        public Setup setup() {
            return Setup
                    .named("Character customization")
                    .markers(List.of(Pictures.RESET_CONFIRM_TEXT, Pictures.CUSTOMIZATION_TITLE))
                    .back(Screens.CHARACTER_CUSTOMIZATION.resetConfirmCancel)
                    .shot("screens/CHARACTER_CUSTOMIZATION.png")
                    .from(Screens.SELECT_BODY_TYPE.bodyTypeNext);
        }
    }

    public static final CharacterCustomization CHARACTER_CUSTOMIZATION = new CharacterCustomization();

    private Screens() {
    }
}
