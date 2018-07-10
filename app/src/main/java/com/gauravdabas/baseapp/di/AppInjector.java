package com.gauravdabas.baseapp.di;

import com.gauravdabas.baseapp.BaseApplication;

/**
 * Helper class to automatically inject fragments if they implement.
 */

public class AppInjector {
    private AppInjector() {}

    public static void init(BaseApplication baseApplication) {
        DaggerAppComponent.builder()
                .application(baseApplication)
                .build()
                .inject(baseApplication);

        //TODO - I might have to registerActivityLifecycleCallbacks to handle activity. Take reference from STV application
    }
}
