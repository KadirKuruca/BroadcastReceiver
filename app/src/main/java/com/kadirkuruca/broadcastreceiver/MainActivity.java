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
        //sendBroadcast(intent);
        //sendOrderedBroadcast(intent, null);
        Bundle bundle = new Bundle();
        bundle.putString("ad","Kadir");
        sendOrderedBroadcast(intent,null, new FourthReceiver(),null,AppCompatActivity.RESULT_OK,"Android",bundle);
    }

    public void sendBroadcastMessageSecurity(View view) {


        Intent intent = new Intent("my.action.name");
        //sendBroadcast(intent);
        sendBroadcast(intent,"my.permission");
    }


    public static class SecondReceiver extends BroadcastReceiver{

        private static final String TAG = SecondReceiver.class.getSimpleName();
        @Override
        public void onReceive(Context context, Intent intent) {

            if(isOrderedBroadcast()) {
                int code = getResultCode();
                String data = getResultData();
                Bundle b = getResultExtras(true);
                String ad = b.getString("ad");

                Log.e(TAG, "Code : " + code + " ,Data : " + data + " ,Ad : " + ad);
                Log.e(TAG,"InnerClass Receiver");
                Toast.makeText(context,"InnerClass Receiver",Toast.LENGTH_SHORT).show();

                setResultCode(7);
                setResultData("Kotlin");
                b.putString("ad","Kadir2");
                setResultExtras(b);
            }

        }
    }
}
