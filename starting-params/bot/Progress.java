package com.swordxstaff.params.bot;

import com.botmaker.plugin.api.params.Param;
import com.botmaker.sdk.api.params.Facts;

/** What the bot keeps between runs. */
@Param
@Facts
public class Progress {

    @Param.Shown(changes = Param.Changes.DURING_RUN)
    public int gold() {
        return 0;
    }

    @Param.Shown(changes = Param.Changes.DURING_RUN)
    public String reg() {
        return "";
    }

    public String fez() {
        return "";
    }

    @Param.Shown(changes = Param.Changes.DURING_RUN)
    public int gems() {
        return 0;
    }
}
