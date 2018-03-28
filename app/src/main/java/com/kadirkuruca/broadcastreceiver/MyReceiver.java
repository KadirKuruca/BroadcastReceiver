package com.kadirkuruca.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import android.widget.Toast;

/**
 * Created by Kadir on 28.03.2018.
 */

public class MyReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        int sayi1 = intent.getIntExtra("a",0);
        int sayi2 = intent.getIntExtra("b",0);
        int toplam = sayi1 + sayi2;

        LocalBroadcastManager manager = LocalBroadcastManager.getInstance(context);

        Intent returningIntent = new Intent("my.result.receiver");
        returningIntent.putExtra("toplam",toplam);
        manager.sendBroadcast(returningIntent);
    }
}
