package com.swordxstaff;

import com.botmaker.sdk.api.params.Params;
import com.swordxstaff.params.bot.Progress;

/**
 * Your project.
 *
 * <p>BotMaker wrote this file once, when the project was created, and will never touch it
 * again. Every line of it is yours — rename it, split it up, throw it away.
 *
 * <p>This is a plain Java project: it has a pom, a source folder and this main(). To make it
 * a bot, add the BotMaker SDK from <b>Project ▸ Plugins & Libraries</b> — it is a plugin like any
 * other, and installing it brings the palette, the pictures, the capture tools and the rest.
 * Or start from a published bot instead, which arrives with all of that already pinned.
 */
public class SwordXStaff {

    public static void main(String[] args) {
        int before = Params.get(Progress::gold);
        Params.set(Progress::gold, before + 100);
        System.out.println("gold was " + before + ", now " + Params.get(Progress::gold));
    }
}
