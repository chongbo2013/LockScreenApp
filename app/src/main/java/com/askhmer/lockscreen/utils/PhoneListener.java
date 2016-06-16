package com.askhmer.lockscreen.utils;

import android.content.Context;
import android.content.Intent;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;

/**
 * Created by soklundy on 6/15/2016.
 */
public class PhoneListener extends PhoneStateListener{

    public static Context context;
    private Intent intent;

    public PhoneListener(Context c, Intent i) {
        context = c;
        intent = i;
    }
    @Override
    public void onCallStateChanged(int state, String incomingNumber) {

        super.onCallStateChanged(state, incomingNumber);
       if ((state != TelephonyManager.CALL_STATE_OFFHOOK)) {
           if (intent.getAction().equals(Intent.ACTION_SCREEN_OFF)
                   || intent.getAction().equals(Intent.ACTION_SCREEN_ON)
                   || intent.getAction().equals(Intent.ACTION_BOOT_COMPLETED)) {
              new LockscreenIntentReceiver().start_lockscreen(context);
           }
       }
    }
}
