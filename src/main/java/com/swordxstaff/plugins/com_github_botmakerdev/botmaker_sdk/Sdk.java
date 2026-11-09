package com.swordxstaff.plugins.com_github_botmakerdev.botmaker_sdk;

import com.botmaker.sdk.api.bot.BotSettings;
import com.botmaker.sdk.api.bot.Launcher;
import com.botmaker.sdk.api.bot.SdkValue;
import com.botmaker.sdk.api.flow.FlowLayout;
import com.botmaker.sdk.api.flow.Run;
import com.botmaker.sdk.api.geometry.Size;
import java.util.List;

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

    @SdkValue(SdkValue.Id.FLOW_LAYOUT)
    public static FlowLayout flowLayout() {
        return FlowLayout.NONE;
    }

    @SdkValue(SdkValue.Id.SETTINGS)
    public static BotSettings settings() {
        return BotSettings.defaults();
    }

    @SdkValue(SdkValue.Id.SCREEN)
    public static Size screen() {
        return new Size(1080, 1920);
    }

    private Sdk() {
    }
}
