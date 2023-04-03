package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final String f7564a = qk3.m25728f("RescheduleReceiver");

    public void onReceive(Context context, Intent intent) {
        qk3.m25726c().mo25135a(f7564a, String.format("Received intent %s", new Object[]{intent}), new Throwable[0]);
        try {
            nm7.m23322m(context).mo23748v(goAsync());
        } catch (IllegalStateException e) {
            qk3.m25726c().mo25136b(f7564a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }
}
