package com.gauravdabas.baseapp.di;

import com.gauravdabas.baseapp.ui.LoginActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Binds all sub-components modules belonging to activity/fragments to the dependency graph
 */

@Module
public abstract class BuilderModule {
    // Activities
    @ContributesAndroidInjector()
    abstract LoginActivity bindLoginActivity();

    /*@ContributesAndroidInjector(modules = LaunchPadActivityModule.class)
    abstract LaunchPadActivity bindLaunchPadActivity();

    // Fragments
    @ContributesAndroidInjector(modules = {LaunchPadFragmentModule.class})
    abstract LaunchPadDetailFragment bindLaunchPadDetailFragment();*/

    // Follow this pattern
    //@ContributesAndroidInjector(modules = {NextActivityModule.class, NextFragmentProvider.class})
    //abstract NextActivity bindNextActivity();

    // Note: you can gain access to other fragment/activity dependencies  via:
    // @ContributesAndroidInjector(modules = {xyzFragmentModule.class, xyzActivityModule.class})
}
