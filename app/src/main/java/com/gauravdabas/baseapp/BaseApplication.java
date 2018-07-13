package com.gauravdabas.baseapp;

import android.app.Application;

import com.gauravdabas.baseapp.data.local.AppConfigRepository;
import com.gauravdabas.baseapp.di.AppInjector;
import com.gauravdabas.baseapp.model.BaseConfig;

/**
 * This class support the application level layer. It runs even before LAUNCHER activity.
 * Purpose for the class is to do initial setup requires at application level.
 */

public class BaseApplication extends Application {

    private BaseConfig mBaseConfig = null;
    private AppConfigRepository mAppConfigRepository;

    @Override
    public void onCreate() {
        super.onCreate();

        // Add application to dependency graph
        AppInjector.init(this);

        // Read configuration data
        //getConfigurations();
    }

    private void getConfigurations() {
        mBaseConfig = mAppConfigRepository.getConfiguration();
    }
}
