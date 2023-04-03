package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.kg3;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0007B\u0019\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J9\u0010\u0007\u001a\u00020\u00062.\u0010\u0005\u001a*\u0012\u000e\b\u0000\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0000\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u0002H\u0001J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\f\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\rH\u0002R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012¨\u0006\u0016"}, mo44877d2 = {"Lxp0;", "Lkg3;", "Lnc6;", "Lkg3$a;", "kotlin.jvm.PlatformType", "p0", "Lr37;", "a", "Landroid/content/Context;", "applicationContext", "d", "f", "Landroid/net/ConnectivityManager;", "", "e", "isConnected", "g", "Lyg3;", "Lyg3;", "lifecycleRegistry", "<init>", "(Landroid/content/Context;Lyg3;)V", "scarlet-lifecycle-android_release"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* renamed from: xp0 */
/* compiled from: ConnectivityOnLifecycle.kt */
public final class xp0 implements kg3 {

    /* renamed from: a */
    public final yg3 f35671a;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\n"}, mo44877d2 = {"Lxp0$a;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Lr37;", "onReceive", "<init>", "(Lxp0;)V", "scarlet-lifecycle-android_release"}, mo44878k = 1, mo44879mv = {1, 5, 1})
    /* renamed from: xp0$a */
    /* compiled from: ConnectivityOnLifecycle.kt */
    public final class C6705a extends BroadcastReceiver {

        /* renamed from: a */
        public final /* synthetic */ xp0 f35672a;

        public C6705a(xp0 xp0) {
            vx2.m53591g(xp0, "this$0");
            this.f35672a = xp0;
        }

        public void onReceive(Context context, Intent intent) {
            vx2.m53591g(context, "context");
            vx2.m53591g(intent, "intent");
            Bundle extras = intent.getExtras();
            if (extras != null) {
                this.f35672a.f35671a.onNext(this.f35672a.mo49533g(!extras.getBoolean("noConnectivity")));
            }
        }
    }

    public xp0(Context context, yg3 yg3) {
        vx2.m53591g(context, "applicationContext");
        vx2.m53591g(yg3, "lifecycleRegistry");
        this.f35671a = yg3;
        mo49530d(context);
        mo49532f(context);
    }

    /* renamed from: a */
    public void mo40232a(nc6<? super kg3.C6147a> nc6) {
        this.f35671a.mo40232a(nc6);
    }

    /* renamed from: d */
    public final void mo49530d(Context context) {
        Object systemService = context.getSystemService("connectivity");
        if (systemService != null) {
            this.f35671a.onNext(mo49533g(mo49531e((ConnectivityManager) systemService)));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
    }

    /* renamed from: e */
    public final boolean mo49531e(ConnectivityManager connectivityManager) {
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnectedOrConnecting()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final void mo49532f(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new C6705a(this), intentFilter);
    }

    /* renamed from: g */
    public final kg3.C6147a mo49533g(boolean z) {
        if (z) {
            return kg3.C6147a.C6149b.f30871a;
        }
        return kg3.C6147a.C6150c.C6151a.f30872a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xp0(Context context, yg3 yg3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new yg3(0, 1, (DefaultConstructorMarker) null) : yg3);
    }
}
