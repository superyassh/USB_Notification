package com.kage.USB_Notificaion;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
          String condition=intent.getAction();
          if (condition.equals(intent.ACTION_POWER_DISCONNECTED)){
              Toast.makeText(context, "Power Disconnected", Toast.LENGTH_SHORT).show();
          }
       else if (condition.equals(intent.ACTION_POWER_CONNECTED)){
            Toast.makeText(context, "Power Connected", Toast.LENGTH_SHORT).show();
        }
    }
}
