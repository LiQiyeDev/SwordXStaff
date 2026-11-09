package com.swordxstaff.params.com_github_botmakerdev.botmaker_sdk;

import com.botmaker.plugin.api.params.Param;
import com.botmaker.sdk.api.bot.SdkValue;
import com.botmaker.sdk.api.flow.Flow;

/**
 * Parameters of com.github.BotMakerDev:botmaker-sdk for this bot, each one method, whole: its name, its type and,
 * as what it returns, its value on this computer. This file is never versioned; its starting copy
 * is, and <i>Make this the starting value</i> is what changes that.
 */
@Param
public class Running {

    @SdkValue(SdkValue.Id.FLOW)
        @Param.Shown(description = "Which flow the bot runs")
        public Flow flow() {
            return Flow.NONE;
        }

    @SdkValue(SdkValue.Id.DO_SETUP)
        @Param.Shown(description = "Set the game up first: tick it on a new computer or after changing a game setting")
        public boolean doSetup() {
            return true;
        }
}
