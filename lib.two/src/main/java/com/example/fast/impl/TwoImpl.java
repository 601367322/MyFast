package com.example.fast.impl;

import android.content.Context;
import android.content.Intent;

import com.example.fast.lib.interfaces.ITwo;
import com.example.fast.lib.two.TwoActivity;

/**
 * Created by bingbing on 2016/12/21.
 */

public class TwoImpl implements ITwo {

    @Override
    public void startActivity(Context context) {
        context.startActivity(new Intent(context, TwoActivity.class));
    }
}
