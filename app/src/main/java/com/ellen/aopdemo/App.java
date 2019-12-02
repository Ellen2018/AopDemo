package com.ellen.aopdemo;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        LoginManager.mContext = this;
    }
}
