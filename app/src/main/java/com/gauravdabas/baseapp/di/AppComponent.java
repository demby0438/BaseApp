package com.gauravdabas.baseapp.di;

import android.app.Application;

import com.gauravdabas.baseapp.BaseApplication;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

/**
 * This interface represents class dependency graph
 */

@Singleton
@Component(modules = {
        AppModule.class,
        BuilderModule.class,
        RepositoryModule.class})
public interface AppComponent {

    // Add application instance to the graph
    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);
        AppComponent build();
    }

    void inject(BaseApplication target);
}
