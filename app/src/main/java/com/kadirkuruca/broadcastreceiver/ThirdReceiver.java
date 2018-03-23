package com.kadirkuruca.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Kadir on 23.03.2018.
 */

public class ThirdReceiver extends BroadcastReceiver {

    private static final String TAG = ThirdReceiver.class.getSimpleName();

    @Override
    public void onReceive(Context context, Intent ıntent) {
        Log.e(TAG,"Üçüncü Receiver");
        Toast.makeText(context,"Üçüncü Receiver",Toast.LENGTH_SHORT).show();
    }
}
