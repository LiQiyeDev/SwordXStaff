package com.swordxstaff.plugins.com_github_botmakerdev.botmaker_sdk;

import com.botmaker.sdk.api.bot.SdkValue;
import com.botmaker.sdk.api.text.Words;

/**
 * Values com.github.BotMakerDev:botmaker-sdk keeps in step with its own windows.
 * <p>Written by BotMaker because this project had none, and <b>yours from that moment</b>:
 * it is never rewritten. BotMaker changes the expression a {@code @SdkValue} method returns and nothing else.
 */
@SdkValue(SdkValue.Id.TEXTS)
public final class Texts {
    public static final Words USER_AGREEMENT = Words.of("User Agreement");
    public static final Words CONFIRM = Words.of("Confirm");
    public static final Words PRIVACY_POLICY = Words.of("Privacy Policy");
    public static final Words CANCEL = Words.of("Cancel");

    private Texts() {
    }
}
