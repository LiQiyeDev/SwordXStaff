package com.swordxstaff.plugins.com_github_botmakerdev.botmaker_sdk;

import com.botmaker.sdk.api.bot.SdkValue;
import com.botmaker.sdk.api.screens.Screen;
import com.botmaker.sdk.api.screens.Setup;
import java.util.List;
import com.botmaker.sdk.api.screens.Button;
import java.time.Duration;
import com.botmaker.sdk.api.screens.Reached;

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
        @Override
        public Setup setup() {
            return Setup
                    .named("Tutorial dialogue")
                    .markers(List.of(Pictures.DIALOGUE_NEXT_ARROW))
                    .popup()
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
        public final Button titleNotice = Button.of(Pictures.TITLE_NOTICE);
        public final Button titleUserCenter = Button.of(Pictures.TITLE_USER_CENTER);
        public final Button titleSubmitLogs = Button.of(Pictures.TITLE_SUBMIT_LOGS).never("Sends logs to the game's maker; no bot use");
        public final Button titleRepairClient = Button.of(Pictures.TITLE_REPAIR_CLIENT);

        @Override
        public Setup setup() {
            return Setup
                    .named("Title")
                    .markers(List.of(Pictures.TITLE_USER_CENTER))
                    .shot("screens/TITLE.png")
                    .from(Screens.NOTICE.noticeBack);
        }
    }

    public static final Title TITLE = new Title();

    public static final class Servers extends Screen {
        public final Button serversRowSelected = Button.of(Pictures.SERVERS_ROW_SELECTED);
        public final Button serversRowOther = Button.of(Pictures.SERVERS_ROW_OTHER).never(
                "Picking another server moves the account to a new start; the run stays on the one the game chose");

        @Override
        public Setup setup() {
            return Setup
                    .named("Servers")
                    .markers(List.of(Pictures.SERVERS_TITLE))
                    .shot("screens/SERVERS.png")
                    .from(Screens.TITLE.titleServers);
        }
    }

    public static final Servers SERVERS = new Servers();

    private Screens() {
    }
}
