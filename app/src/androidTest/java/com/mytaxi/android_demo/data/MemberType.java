package com.mytaxi.android_demo.data;

public enum MemberType {

    VALID_MEMBER("whiteelephant261", "video"),
    WRONG_USERNAME("test", "video"),
    WRONG_PASSWORD("whiteelephant261", "test"),
    WRONG_USERNAMEANDPWD("test", "test");

    private String username;
    private String password;

    MemberType(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUserName() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
