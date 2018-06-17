package com.gauravdabas.baseapp.di;

import android.arch.lifecycle.ViewModelProvider;

import com.gauravdabas.baseapp.viewmodel.BaseAppViewModelFactory;

import dagger.Binds;
import dagger.Module;

/**
 * Creates ViewModel instances
 */

@Module
public abstract class ViewModelModule {
    /*@Binds
    @IntoMap
    @ViewModelKey(LocalSettingsViewModel.class)
    abstract ViewModel bindLocalSettingsViewModel(LocalSettingsViewModel localSettingsViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(LoadServicesViewModel.class)
    abstract ViewModel bindLoadServicesViewModel(LoadServicesViewModel loadServicesViewModel);*/

    @Binds
    abstract ViewModelProvider.Factory bindViewModelFactory(BaseAppViewModelFactory factory);
}
