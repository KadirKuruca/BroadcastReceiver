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
    public void onReceive(Context context, Intent intent) {

        String isim = intent.getStringExtra("ad");
        int yas = intent.getIntExtra("yas",0);

        Log.e(TAG,"isim : "+isim+" Yaş : "+yas);

        Log.e(TAG,"Uçak Moduna Geçtiniz. Thread : "+Thread.currentThread().getName());
        Toast.makeText(context,"Uçak Moduna Geçtiniz",Toast.LENGTH_SHORT).show();
    }
}
