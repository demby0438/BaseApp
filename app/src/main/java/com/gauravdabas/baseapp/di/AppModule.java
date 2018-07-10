package com.gauravdabas.baseapp.di;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Dabas on 2/21/2018.
 */

@Module(includes = ViewModelModule.class)
public class AppModule {
    private Application mApplication;

    public AppModule() {
    }

    public AppModule(Application application) {
        mApplication = application;
    }

    @Provides
    @Singleton
    // Note: Method name (e.g. 'provideContext') is arbitrary - only return matters
    // Context in this case will be available for injection
    public Context provideContext(Application application) {
        return application.getApplicationContext();
    }
}
