package com.yl.lenovo.testprovice;

import android.app.Application;

import org.xutils.x;

import cn.bmob.v3.Bmob;

/**
 * Created by lenovo on 2017/10/30.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
        x.Ext.setDebug(true);
        //第一：默认初始化
        Bmob.initialize(this, "848985c53bf4bbe148655717b3714f8d");

    }
}
