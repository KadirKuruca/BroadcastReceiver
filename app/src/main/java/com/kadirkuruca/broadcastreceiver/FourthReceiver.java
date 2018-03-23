package com.kadirkuruca.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Kadir on 24.03.2018.
 */

public class FourthReceiver extends BroadcastReceiver{
    public static final String TAG = FourthReceiver.class.getSimpleName();
    @Override
    public void onReceive(Context context, Intent ıntent) {
        if(isOrderedBroadcast()) {
            int code = getResultCode();
            String data = getResultData();
            Bundle b = getResultExtras(true);
            String ad = b.getString("ad");

            Log.e(TAG, "Code : " + code + " ,Data : " + data + " ,Ad : " + ad);
            Log.e(TAG, "Dördüncü Receiver");
            Toast.makeText(context, "Dördüncü Receiver", Toast.LENGTH_SHORT).show();
        }
    }
}
