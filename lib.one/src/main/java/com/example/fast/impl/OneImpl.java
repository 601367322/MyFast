package com.example.fast.impl;

import android.content.Context;
import android.content.Intent;

import com.example.fast.lib.interfaces.IOne;
import com.example.fast.lib.one.OneActivity;

/**
 * Created by bingbing on 2016/12/21.
 */

public class OneImpl implements IOne {

    @Override
    public void startActivity(Context context) {
        context.startActivity(new Intent(context, OneActivity.class));
    }
}
