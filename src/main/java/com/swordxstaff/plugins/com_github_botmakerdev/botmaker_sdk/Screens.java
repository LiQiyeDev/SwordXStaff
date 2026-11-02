package com.swordxstaff.plugins.com_github_botmakerdev.botmaker_sdk;

import com.botmaker.sdk.api.bot.SdkValue;
import com.botmaker.sdk.api.screens.Screen;
import com.botmaker.sdk.api.screens.Setup;
import java.util.List;
import com.botmaker.sdk.api.screens.Button;

/**
 * Values com.github.BotMakerDev:botmaker-sdk keeps in step with its own windows.
 * <p>Written by BotMaker because this project had none, and <b>yours from that moment</b>:
 * it is never rewritten. BotMaker changes the expression a {@code @SdkValue} method returns and nothing else.
 */
@SdkValue(SdkValue.Id.SCREEN_MAP)
public final class Screens {
    public static final class Consent extends Screen {
        public final Button confirm = Button.of(Elements.CONFIRM).tried();

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

    private Screens() {
    }
}
