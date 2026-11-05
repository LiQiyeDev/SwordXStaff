package com.swordxstaff.params.bot;

import com.botmaker.plugin.api.params.Param;

/** What the bot keeps between runs. */
@Param
public class Progress {

    @Param.Shown(changes = Param.Changes.DURING_RUN)
    public int gold() {
        return 0;
    }
}
