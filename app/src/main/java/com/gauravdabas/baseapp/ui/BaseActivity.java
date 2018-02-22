package com.gauravdabas.baseapp.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import com.gauravdabas.baseapp.R;

/**
 * Purpose for the activity to serve as a Base class for all activities/fragment.
 * This should handel core level changes like, language change, actionbar, different user accounts, etc.
 */

public class BaseActivity extends FragmentActivity {
    protected LayoutInflater mLayoutInflator = null;
    protected LinearLayout mParentLayout = null;

    @Override
    public void setContentView(int layoutResID) {
        //Create a wrapper layout to hold any activity/fragment layout as child
        mParentLayout = (LinearLayout) mLayoutInflator.inflate(R.layout.activity_wrapper_layout, null);
        View v = mLayoutInflator.inflate(layoutResID, null);
        mParentLayout.addView(v, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));

        super.setContentView(mParentLayout);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mLayoutInflator = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
}
