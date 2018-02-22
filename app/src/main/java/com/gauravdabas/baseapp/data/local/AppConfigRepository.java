package com.gauravdabas.baseapp.data.local;

import android.content.Context;
import com.gauravdabas.baseapp.common.Constants;
import com.gauravdabas.baseapp.data.FileReader;
import com.gauravdabas.baseapp.model.BaseConfig;

import javax.inject.Singleton;

/**
 * Created by Dabas on 2/21/2018.
 */

@Singleton
public class AppConfigRepository {
    private final Context mContext;

    public AppConfigRepository(Context mContext) {
        this.mContext = mContext;
    }

    public BaseConfig getConfiguration(){
        String jsonConfigData = getConfigurationAsJSON();
        //return mGson.fromJson(jsonConfigData, BaseConfig.class);
        return null;
    }

    public String getConfigurationAsJSON(){
        return (new FileReader().readAsJSON(mContext, Constants.SAMPLE_APP_CONFIG_FILE_NAME));
    }


}
