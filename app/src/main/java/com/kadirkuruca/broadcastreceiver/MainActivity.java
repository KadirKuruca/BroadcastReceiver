package com.kadirkuruca.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    Button broadcastNow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        broadcastNow = findViewById(R.id.btnBroadcast);
    }

    public void sendBroadcastMessage(View view) {

        //Intent intent = new Intent(this,FirstReceiver.class);
        Intent intent = new Intent("custom.action.name");
        intent.putExtra("ad","Kadir Kuruca");
        intent.putExtra("yas", 22);
        sendBroadcast(intent);
    }

    public void sendBroadcastInnerClass(View view) {
        //Intent intent = new Intent(this,SecondReceiver.class);
        Intent intent = new Intent("custom.action.name2");
        Bundle bundle = new Bundle();
        bundle.putString("ad","Kadir Kuruca");
        bundle.putInt("yas",22);
        intent.putExtras(bundle);
        sendBroadcast(intent);
    }

    public static class SecondReceiver extends BroadcastReceiver{

        private static final String TAG = SecondReceiver.class.getSimpleName();
        @Override
        public void onReceive(Context context, Intent intent) {

            String isim = intent.getStringExtra("ad");
            int yas = intent.getIntExtra("yas",0);

            Log.e(TAG,"isim : "+isim+" Yaş : "+yas);
            Log.e(TAG,"InnerClass Receiver");
            Toast.makeText(context,"InnerClass Receiver",Toast.LENGTH_SHORT).show();
        }
    }
}
