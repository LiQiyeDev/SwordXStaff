package com.swordxstaff.plugins.com_github_botmakerdev.botmaker_sdk;

import com.botmaker.plugin.api.params.Param;
import com.botmaker.sdk.api.bot.BotSettings;
import com.botmaker.sdk.api.bot.LaunchChoice;
import com.botmaker.sdk.api.bot.Launcher;
import com.botmaker.sdk.api.bot.Outcome;
import com.botmaker.sdk.api.bot.SdkValue;
import com.botmaker.sdk.api.capture.CaptureSource;
import com.botmaker.sdk.api.flow.Flow;
import com.botmaker.sdk.api.flow.FlowLayout;
import com.botmaker.sdk.api.flow.Run;
import com.botmaker.sdk.api.geometry.Size;
import java.util.List;
import java.util.Set;

/**
 * Values com.github.BotMakerDev:botmaker-sdk keeps in step with its own windows.
 * <p>Written by BotMaker because this project had none, and <b>yours from that moment</b>:
 * it is never rewritten. BotMaker changes the expression a {@code @SdkValue} method returns and nothing else.
 */
public final class Sdk {
    @SdkValue(SdkValue.Id.FLOW)
    @Param(category = "Run", visibility = Param.PUBLIC, description = "Which flow the bot runs")
    public static Flow flow = Flow.NONE;
    @SdkValue(SdkValue.Id.DO_SETUP)
    @Param(category = "Run", visibility = Param.PUBLIC, description = "Set the game up first: tick it on a new computer or after changing a game setting")
    public static boolean doSetup = true;
    @SdkValue(SdkValue.Id.SKIP)
    @Param(category = "Run", visibility = Param.PUBLIC, description = "Activities this run skips")
    public static Set<Class<? extends Outcome>> skip = Set.of();
    @SdkValue(SdkValue.Id.LAUNCH_TARGETS)
    @Param(category = "Game", description = "The games this bot supports, preferred first")
    public static List<Launcher> launchTargets = List.of(Launcher.of("emu-app:com.zjcs.android.us@Waydroid"));
    @SdkValue(SdkValue.Id.LAUNCH_TARGET)
    @Param(category = "Game", visibility = Param.PUBLIC, description = "Which of the bot's games this computer launches")
    public static LaunchChoice launchTarget = LaunchChoice.of("");
    @SdkValue(SdkValue.Id.CAPTURE)
    @Param(category = "Game", visibility = Param.PUBLIC, description = "The game's window: where the bot reads pixels from")
    public static CaptureSource capture = CaptureSource.emulator("Waydroid");

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
        return new Size(0, 0);
    }

    private Sdk() {
    }
}
