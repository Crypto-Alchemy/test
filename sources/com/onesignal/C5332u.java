package com.onesignal;

import com.onesignal.OneSignal;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.onesignal.u */
/* compiled from: OSDynamicTriggerTimer */
public class C5332u {
    /* renamed from: a */
    public static void m41333a(TimerTask timerTask, String str, long j) {
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        OneSignal.m40387d1(log_level, "scheduleTrigger: " + str + " delay: " + j);
        StringBuilder sb = new StringBuilder();
        sb.append("trigger_timer:");
        sb.append(str);
        new Timer(sb.toString()).schedule(timerTask, j);
    }
}
