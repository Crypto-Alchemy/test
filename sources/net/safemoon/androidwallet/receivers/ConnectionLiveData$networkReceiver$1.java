package net.safemoon.androidwallet.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, mo44877d2 = {"net/safemoon/androidwallet/receivers/ConnectionLiveData$networkReceiver$1", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Lr37;", "onReceive", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: ConnectionLiveData.kt */
public final class ConnectionLiveData$networkReceiver$1 extends BroadcastReceiver {

    /* renamed from: a */
    public final /* synthetic */ ConnectionLiveData f42503a;

    public ConnectionLiveData$networkReceiver$1(ConnectionLiveData connectionLiveData) {
        this.f42503a = connectionLiveData;
    }

    public void onReceive(Context context, Intent intent) {
        vx2.m53591g(context, "context");
        vx2.m53591g(intent, "intent");
        this.f42503a.mo60717e();
    }
}
