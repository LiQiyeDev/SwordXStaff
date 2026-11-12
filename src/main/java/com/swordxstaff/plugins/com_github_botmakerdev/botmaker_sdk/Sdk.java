package com.swordxstaff.plugins.com_github_botmakerdev.botmaker_sdk;

import com.botmaker.sdk.api.bot.Launcher;
import com.botmaker.sdk.api.bot.Run;
import com.botmaker.sdk.api.bot.SdkValue;
import com.botmaker.sdk.api.geometry.Size;
import java.util.List;
import com.botmaker.sdk.api.screens.Shades;
import com.botmaker.sdk.api.screens.Shade;
import com.botmaker.sdk.api.screens.State;

/**
 * Values com.github.BotMakerDev:botmaker-sdk keeps in step with its own windows.
 * <p>Written by BotMaker because this project had none, and <b>yours from that moment</b>:
 * it is never rewritten. BotMaker changes the expression a {@code @SdkValue} method returns and nothing else.
 */
public final class Sdk {
    @SdkValue(SdkValue.Id.LAUNCH_TARGETS)
    public static List<Launcher> launchTargets() {
        return List.of(Launcher.of("emu-app:com.zjcs.android.us@Waydroid"));
    }

    @SdkValue(SdkValue.Id.RUN)
    public static Run run() {
        return Run.NONE;
    }

    @SdkValue(SdkValue.Id.SCREEN)
    public static Size screen() {
        return new Size(1080, 1920);
    }

    @SdkValue(SdkValue.Id.SHADES)
    public static Shades shades() {
        return Shades
                .of(
                        new Shade(Shade.Kind.BRIGHT, new Shade.Channels(1.98, 1.99, 2.0),
                                new Shade.Channels(0.02, 0.02, 0.02),
                                0.08, Shade.Cause.GAME, State.SELECTED, new Shade.Geometry(0, 1.0, 1.0, 0, 0)),
                        new Shade(Shade.Kind.BRIGHT, new Shade.Channels(1.89, 1.88, 1.89),
                                new Shade.Channels(0.05, 0.05, 0.05),
                                0.08, Shade.Cause.GAME, States.Blocks.LOADOUT_1,
                                new Shade.Geometry(0, 1.0, 1.0, 0, 0)));
    }

    private Sdk() {
    }
}
