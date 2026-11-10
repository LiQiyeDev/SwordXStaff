package com.swordxstaff.plugins.com_github_botmakerdev.botmaker_sdk;

import com.botmaker.plugin.api.params.Param;
import com.botmaker.sdk.api.bot.LaunchChoice;
import com.botmaker.sdk.api.bot.SdkValue;
import com.botmaker.sdk.api.capture.CaptureSource;

/**
 * Parameters of com.github.BotMakerDev:botmaker-sdk for this bot, each one method, whole: its name, its type and,
 * as what it returns, its value on this computer. This file is never versioned; its starting copy
 * is, and <i>Make this the starting value</i> is what changes that.
 */
@Param
public class Game {

    @SdkValue(SdkValue.Id.LAUNCH_TARGET)
        @Param.Shown(description = "Which of the bot's games this computer launches")
        public LaunchChoice launchTarget() {
            return LaunchChoice.of("");
        }

    @SdkValue(SdkValue.Id.CAPTURE)
        @Param.Shown(description = "The game's window: where the bot reads pixels from")
        public CaptureSource capture() {
            return CaptureSource.emulator("Waydroid");
        }

        @SdkValue(SdkValue.Id.GAME_ZONE)
        @Param.Shown(description = "The game server's time zone, that its daily reset is read in")
        public String gameZone() {
            return "";
        }
}
