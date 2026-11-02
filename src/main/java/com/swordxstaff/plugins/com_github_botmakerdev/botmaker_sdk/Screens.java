package com.swordxstaff.plugins.com_github_botmakerdev.botmaker_sdk;

import com.botmaker.sdk.api.bot.SdkValue;
import com.botmaker.sdk.api.screens.Screen;
import com.botmaker.sdk.api.screens.Setup;
import java.util.List;
import com.botmaker.sdk.api.screens.Button;
import java.time.Duration;

/**
 * Values com.github.BotMakerDev:botmaker-sdk keeps in step with its own windows.
 * <p>Written by BotMaker because this project had none, and <b>yours from that moment</b>:
 * it is never rewritten. BotMaker changes the expression a {@code @SdkValue} method returns and nothing else.
 */
@SdkValue(SdkValue.Id.SCREEN_MAP)
public final class Screens {
    public static final class Consent extends Screen {
        public final Button confirm = Button.of(Elements.CONFIRM).tried();
        public final Button privacyPolicy = Button.of(Elements.PRIVACY_POLICY).info();
        public final Button cancel = Button.of(Elements.CANCEL);
        public final Button userAgreement = Button.of(Elements.USER_AGREEMENT);

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
                    .elements(List.of(Elements.BOLTRAY_GAMES_PRIVACY_POLICY))
                    .back(Screens.PRIVACY_POLICY.policyBackArrow)
                    .takes(Duration.ofMillis(3400L))
                    .shot("screens/PRIVACY_POLICY.png")
                    .from(Screens.CONSENT.privacyPolicy);
        }
    }

    public static final PrivacyPolicy PRIVACY_POLICY = new PrivacyPolicy();

    private Screens() {
    }
}
