package com.gauravdabas.baseapp.di;

import android.app.Application;

import dagger.Module;

/**
 * Created by Dabas on 2/21/2018.
 */

@Module
public class AppModule {
    private Application mApplication;

    public AppModule(Application application){
        mApplication = application;
    }
}
