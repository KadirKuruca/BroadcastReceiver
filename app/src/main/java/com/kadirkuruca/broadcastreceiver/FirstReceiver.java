package com.kadirkuruca.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Kadir on 23.03.2018.
 */

public class FirstReceiver extends BroadcastReceiver {

    private static final String TAG = FirstReceiver.class.getSimpleName();
    @Override
    public void onReceive(Context context, Intent ıntent) {

        Log.e(TAG,"Birinci Receiver");
        Toast.makeText(context,"Birinci Receiver",Toast.LENGTH_SHORT).show();
    }
}
