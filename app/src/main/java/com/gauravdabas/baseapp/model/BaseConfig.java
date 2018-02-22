package com.gauravdabas.baseapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Application level configuration model.
 */

public class BaseConfig {

    @SerializedName("appConfig")
    @Expose
    private RestConfig restConfig = null;

    public RestConfig getRestConfig() {
        return restConfig;
    }

    public void setRestConfig(RestConfig restConfig) {
        this.restConfig = restConfig;
    }
}
