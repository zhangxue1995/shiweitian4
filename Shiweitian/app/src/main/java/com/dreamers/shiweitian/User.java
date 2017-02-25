package com.dreamers.shiweitian;

import android.app.Application;

/**
 * Created by stzha on 2017/1/25.
 */

public class User extends Application{
    public boolean isLogin;
    public String account;
    public String password;
    public String username;
    @Override
    public void onCreate(){
        isLogin=false;
        super.onCreate();
    }

    public boolean isLogin() {
        return isLogin;
    }



}
