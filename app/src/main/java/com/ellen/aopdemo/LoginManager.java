package com.ellen.aopdemo;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class LoginManager {
    public static boolean isLogin = false;
    public static Context mContext;

    public static void toLoginActivity(){
        Intent intent = new Intent(mContext,LoginActivity.class);
        mContext.startActivity(intent);
    }

    public static void logined(){
        Toast.makeText(mContext,"已经登陆",Toast.LENGTH_SHORT).show();
    }
}
