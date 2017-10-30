package com.yl.lenovo.testprovice;

import android.app.Application;

import org.xutils.x;

/**
 * Created by lenovo on 2017/10/30.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
        x.Ext.setDebug(true);

    }
}
