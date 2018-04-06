package com.udmatech.logutil;

import android.util.Log;

/**
 * Created by mantechser on 4/6/2018.
 */
/*

public class LogDebug extends LinearLayout {
    public LogDebug(Context context) {
        super(context);
        initialize(context);
    }

    public LogDebug(Context context, AttributeSet attrs) {
        super(context, attrs);

    }

    private void initialize(Context context) {
        inflate(context, R.layout.my_view, this);
    }
}
*/

public class LogDebug {
    private static final String TAG = "SUPER_AWESOME_APP";

    public static void d(String message) {
        Log.d(TAG, message);
    }
}