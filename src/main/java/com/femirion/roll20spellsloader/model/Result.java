package com.femirion.roll20spellsloader.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Result {
    private final int status;
    private final String msg;

    public Result () {
        this.status = 200;
        this.msg = "ok";
    }

    public boolean isError() {
        return status != 200;
    }
}
