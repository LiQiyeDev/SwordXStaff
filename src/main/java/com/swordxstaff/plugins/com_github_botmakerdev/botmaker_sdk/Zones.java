package com.swordxstaff.plugins.com_github_botmakerdev.botmaker_sdk;

import com.botmaker.sdk.api.bot.SdkValue;
import com.botmaker.sdk.api.geometry.Zone;
import com.botmaker.sdk.api.geometry.Anchor;

/**
 * Values com.github.BotMakerDev:botmaker-sdk keeps in step with its own windows.
 * <p>Written by BotMaker because this project had none, and <b>yours from that moment</b>:
 * it is never rewritten. BotMaker changes the expression a {@code @SdkValue} method returns and nothing else.
 */
@SdkValue(SdkValue.Id.ZONES)
public final class Zones {
    public static final Zone ROLLA = new Zone(612, 65, 84, 33).anchored(Anchor.TOP_RIGHT);
    public static final Zone GEMS = new Zone(778, 62, 70, 38).anchored(Anchor.TOP_RIGHT);
    public static final Zone ENERGY = new Zone(905, 58, 160, 46).anchored(Anchor.TOP_RIGHT);

    private Zones() {
    }
}
