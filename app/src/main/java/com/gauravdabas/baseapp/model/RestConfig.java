package com.gauravdabas.baseapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Dabas on 2/21/2018.
 */

public class RestConfig {

    @SerializedName("restConfig")
    @Expose
    private RetryConfig retryConfig = null;

    @SerializedName("restEndPoints")
    @Expose
    private RestEndPoints restEndPoints = null;

    private class RetryConfig {
        @SerializedName("initialTimeout")
        private int initialTimeout = 0;

        @SerializedName("multiplyFactor")
        private float multiplyFactor = 0;

        @SerializedName("retryCount")
        private int retryCount = 0;
    }

    private class RestEndPoints {

    }
}
