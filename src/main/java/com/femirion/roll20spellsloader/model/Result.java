package com.femirion.roll20spellsloader.model;

public class Result {
    private final int status;
    private final String msg;

    public Result () {
        this.status = 200;
        this.msg = "ok";
    }

    public Result(int status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public int getStatus() {
        return status;
    }

    public String getMsg() {
        return msg;
    }
}
