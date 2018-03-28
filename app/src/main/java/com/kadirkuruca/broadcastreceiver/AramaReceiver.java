package com.kadirkuruca.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import android.widget.Toast;

/**
 * Created by Kadir on 28.03.2018.
 */

public class AramaReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String durum = intent.getStringExtra(TelephonyManager.EXTRA_STATE);

        if(durum.equals(TelephonyManager.EXTRA_STATE_RINGING)){
            Toast.makeText(context,"TELEFON ÇALIYOR",Toast.LENGTH_SHORT).show();
        }
        if(durum.equals(TelephonyManager.EXTRA_STATE_IDLE)){
            Toast.makeText(context,"KAPANDI",Toast.LENGTH_SHORT).show();
        }
        if(durum.equals(TelephonyManager.EXTRA_STATE_OFFHOOK)){
            Toast.makeText(context,"BEKLEMEDE",Toast.LENGTH_SHORT).show();
        }
    }
}
