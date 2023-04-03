package p000;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.play.core.install.InstallState;

/* renamed from: iq7 */
public final class iq7 extends zr7<InstallState> {
    public iq7(Context context) {
        super(new pq7("AppUpdateListenerRegistry"), new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"), context);
    }

    /* renamed from: a */
    public final void mo43369a(Context context, Intent intent) {
        Intent intent2 = intent;
        if (!context.getPackageName().equals(intent2.getStringExtra("package.name"))) {
            this.f36220a.mo46852a("ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", intent2.getStringExtra("package.name"));
            return;
        }
        this.f36220a.mo46852a("List of extras in received intent:", new Object[0]);
        for (String next : intent.getExtras().keySet()) {
            this.f36220a.mo46852a("Key: %s; value: %s", next, intent.getExtras().get(next));
        }
        pq7 pq7 = this.f36220a;
        pq7.mo46852a("List of extras in received intent needed by fromUpdateIntent:", new Object[0]);
        pq7.mo46852a("Key: %s; value: %s", "install.status", Integer.valueOf(intent2.getIntExtra("install.status", 0)));
        pq7.mo46852a("Key: %s; value: %s", "error.code", Integer.valueOf(intent2.getIntExtra("error.code", 0)));
        InstallState a = InstallState.m36474a(intent2.getIntExtra("install.status", 0), intent2.getLongExtra("bytes.downloaded", 0), intent2.getLongExtra("total.bytes.to.download", 0), intent2.getIntExtra("error.code", 0), intent2.getStringExtra("package.name"));
        this.f36220a.mo46852a("ListenerRegistryBroadcastReceiver.onReceive: %s", a);
        mo49912d(a);
    }
}
