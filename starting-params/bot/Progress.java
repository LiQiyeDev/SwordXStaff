package com.swordxstaff.params.bot;

import com.botmaker.plugin.api.params.Param;
import com.botmaker.sdk.api.bot.Outcome;

/** What the bot keeps between runs. */
@Param
public class Progress {

    @Param.Shown(changes = Param.Changes.DURING_RUN)
    public int gold() {
        return 0;
    }

    public String reg() {
        return "";
    }

    public Outcome ffezf() {
        return Outcome.NONE;
    }
}
