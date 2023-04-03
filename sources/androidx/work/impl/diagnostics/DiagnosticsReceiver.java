package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.C1521c;
import androidx.work.impl.workers.DiagnosticsWorker;

public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final String f7606a = qk3.m25728f("DiagnosticsRcvr");

    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            qk3.m25726c().mo25135a(f7606a, "Requesting diagnostics", new Throwable[0]);
            try {
                mm7.m22389f(context).mo23236b(C1521c.m10487d(DiagnosticsWorker.class));
            } catch (IllegalStateException e) {
                qk3.m25726c().mo25136b(f7606a, "WorkManager is not initialized", e);
            }
        }
    }
}
