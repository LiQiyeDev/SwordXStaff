package com.swordxstaff;

import com.botmaker.sdk.api.bot.Bot;
import com.swordxstaff.plugins.com_github_botmakerdev.botmaker_sdk.Sdk;

/**
 * Sword x Staff, played by its plan: the run walks the screen map to the actions that serve the plan's goals.
 * Which plan runs is the plan parameter, set in the Runner.
 */
public class SwordXStaff {

    public static void main(String[] args) {
        Bot.run(Sdk.class);
    }
}
