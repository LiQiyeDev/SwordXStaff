package com.swordxstaff.plugins.com_github_botmakerdev.botmaker_sdk;

import com.botmaker.sdk.api.bot.SdkValue;
import com.botmaker.sdk.api.screens.Element;

/**
 * Values com.github.BotMakerDev:botmaker-sdk keeps in step with its own windows.
 * <p>Written by BotMaker because this project had none, and <b>yours from that moment</b>:
 * it is never rewritten. BotMaker changes the expression a {@code @SdkValue} method returns and nothing else.
 */
@SdkValue(SdkValue.Id.ELEMENTS)
public final class Elements {
    public static final Element USER_AGREEMENT = Element.byLabel(Texts.USER_AGREEMENT)
            .shot("elements/user_agreement.png");
    public static final Element CONFIRM = Element.byText(Texts.CONFIRM).shot("elements/confirm.png");
    public static final Element PRIVACY_POLICY = Element.byLabel(Texts.PRIVACY_POLICY)
            .shot("elements/privacy_policy.png");

    private Elements() {
    }
}
