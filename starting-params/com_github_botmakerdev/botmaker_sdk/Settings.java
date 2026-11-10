package com.swordxstaff.params.com_github_botmakerdev.botmaker_sdk;

import com.botmaker.plugin.api.params.Param;
import com.botmaker.sdk.api.bot.BotSettings;
import com.botmaker.sdk.api.bot.SdkValue;
import java.time.Duration;

/**
 * Parameters of com.github.BotMakerDev:botmaker-sdk for this bot, each one method, whole: its name, its type and,
 * as what it returns, its value on this computer. This file is never versioned; its starting copy
 * is, and <i>Make this the starting value</i> is what changes that.
 */
@Param
public class Settings {
    @SdkValue(SdkValue.Id.FOUND_DELAY)
    @Param.Shown(description = "Pause after a picture is found, in ms: long enough for the game's animation to settle")
    public int foundDelay() {
        return 500;
    }

    @SdkValue(SdkValue.Id.NOT_FOUND_DELAY)
    @Param.Shown(description = "Pause after a picture is not found, in ms: how fast the bot looks again")
    public int notFoundDelay() {
        return 200;
    }

    @SdkValue(SdkValue.Id.RANDOM_CLICKS)
    @Param.Shown(description = "Click a random point of what was found rather than its centre")
    public boolean randomClicks() {
        return true;
    }

    @SdkValue(SdkValue.Id.CONFIDENCE)
    @Param.Shown(description = "How sure a match has to be, from 0 to 1: lower finds more, and finds wrong things more")
    public double confidence() {
        return 0.8;
    }

    @SdkValue(SdkValue.Id.COMPARE_MARGIN)
    @Param.Shown(description = "How far a picture must beat its look-alike, from 0 to 1")
    public double compareMargin() {
        return 0.05;
    }

    @SdkValue(SdkValue.Id.MAX_ROUNDS)
    @Param.Shown(description = "Rounds a repeated look runs before the bot counts as stuck")
    public int maxRounds() {
        return 50;
    }

    @SdkValue(SdkValue.Id.PATIENCE)
    @Param.Shown(description = "How long, in ms, the bot waits for a press to show before it acts again")
    public int patience() {
        return 3000;
    }

    @SdkValue(SdkValue.Id.FROZEN_AFTER)
    @Param.Shown(description = "How long, in ms, the screen may stay still while the bot acts before the game counts as frozen")
    public int frozenAfter() {
        return 60000;
    }

    @SdkValue(SdkValue.Id.STUCK_AFTER)
    @Param.Shown(description = "How long a run may act with no progress before it goes home or restarts the game")
    public Duration stuckAfter() {
        return Duration.ofMillis(600000L);
    }

    @SdkValue(SdkValue.Id.RESTART_CAP)
    @Param.Shown(description = "Game restarts allowed in a while before the bot stops instead")
    public int restartCap() {
        return 5;
    }

    @SdkValue(SdkValue.Id.RESTARTS_WITHIN)
    @Param.Shown(description = "The while the game restarts are counted over")
    public Duration restartsWithin() {
        return Duration.ofMillis(1800000L);
    }

    @SdkValue(SdkValue.Id.GAME_RUNS_IN)
    @Param.Shown(description = "Where the game runs: a private display, a game VM, or your desktop")
    public BotSettings.Where gameRunsIn() {
        return BotSettings.Where.PRIVATE_DISPLAY;
    }

    @SdkValue(SdkValue.Id.TAKE_OVER)
    @Param.Shown(description = "On your desktop, drive the real mouse and keyboard: for a game that ignores sent clicks")
    public boolean takeOver() {
        return false;
    }

    @SdkValue(SdkValue.Id.DISPLAY_BACKEND)
    @Param.Shown(description = "Which private display hosts the game")
    public BotSettings.DisplayBackend displayBackend() {
        return BotSettings.DisplayBackend.AUTO;
    }

    @SdkValue(SdkValue.Id.INPUT_BACKEND)
    @Param.Shown(description = "Which Linux backend drives the real mouse and keyboard")
    public BotSettings.InputBackend inputBackend() {
        return BotSettings.InputBackend.AUTO;
    }
}
