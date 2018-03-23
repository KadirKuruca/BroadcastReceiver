package com.kadirkuruca.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Kadir on 23.03.2018.
 */

public class FirstReceiver extends BroadcastReceiver {

    private static final String TAG = FirstReceiver.class.getSimpleName();
    @Override
    public void onReceive(Context context, Intent intent) {

        if(isOrderedBroadcast()) {
            int code = getResultCode();
            String data = getResultData();
            Bundle b = getResultExtras(true);
            String ad = b.getString("ad");

            Log.e(TAG, "Code : " + code + " ,Data : " + data + " ,Ad : " + ad);
            Log.e(TAG,"Birinci Receiver. Thread : "+Thread.currentThread().getName());
            Toast.makeText(context,"Birinci Receiver",Toast.LENGTH_SHORT).show();
            setResultCode(42);
            setResultData("Broadcast");
            b.putString("ad","Receiver1");
            setResultExtras(b);
        }

    }
}
