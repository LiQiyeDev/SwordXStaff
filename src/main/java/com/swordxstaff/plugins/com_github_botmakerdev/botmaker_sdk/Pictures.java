package com.swordxstaff.plugins.com_github_botmakerdev.botmaker_sdk;

import com.botmaker.sdk.api.bot.SdkValue;
import com.botmaker.sdk.api.vision.ImageTemplate;
import com.botmaker.sdk.api.geometry.Rect;

/**
 * Values com.github.BotMakerDev:botmaker-sdk keeps in step with its own windows.
 * <p>Written by BotMaker because this project had none, and <b>yours from that moment</b>:
 * it is never rewritten. BotMaker changes the expression a {@code @SdkValue} method returns and nothing else.
 */
@SdkValue(SdkValue.Id.PICTURES)
public final class Pictures {
    public static final ImageTemplate DIALOGUE_NEXT_ARROW = new ImageTemplate("images/dialogue_next_arrow.png")
            .at(new Rect(632, 699, 17, 16));
    public static final ImageTemplate POLICY_BACK_ARROW = new ImageTemplate("images/policy_back_arrow.png")
            .at(new Rect(472, 14, 40, 40));

    private Pictures() {
    }
}
