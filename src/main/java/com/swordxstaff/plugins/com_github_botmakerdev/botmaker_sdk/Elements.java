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
    public static final Element CANCEL = Element.byText(Texts.CANCEL).shot("elements/cancel.png");
    public static final Element BOLTRAY_GAMES_PRIVACY_POLICY = Element.byText(Texts.BOLTRAY_GAMES_PRIVACY_POLICY)
            .shot("elements/boltray_games_privacy_policy.png");
    public static final Element BOLTRAY_GAMES_LICENSE_AGREEMENT = Element.byText(Texts.BOLTRAY_GAMES_LICENSE_AGREEMENT)
            .shot("elements/boltray_games_license_agreement.png");
    public static final Element PERMISSION_ALLOW_BUTTON = Element.byId("permission_allow_button")
            .shot("elements/permission_allow_button.png");

    private Elements() {
    }
}
