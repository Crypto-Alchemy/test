package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.assetpacks.AssetPackState;
import com.google.android.play.core.assetpacks.C4475g;
import com.google.android.play.core.assetpacks.C4477i;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* renamed from: hr7 */
public final class hr7 extends zr7<AssetPackState> {

    /* renamed from: g */
    public final C4477i f29697g;

    /* renamed from: h */
    public final C4475g f29698h;

    /* renamed from: i */
    public final rt7<yw7> f29699i;

    /* renamed from: j */
    public final hs7 f29700j;

    /* renamed from: k */
    public final rs7 f29701k;

    /* renamed from: l */
    public final rt7<Executor> f29702l;

    /* renamed from: m */
    public final rt7<Executor> f29703m;

    /* renamed from: n */
    public final Handler f29704n = new Handler(Looper.getMainLooper());

    public hr7(Context context, C4477i iVar, C4475g gVar, rt7<yw7> rt7, rs7 rs7, hs7 hs7, rt7<Executor> rt72, rt7<Executor> rt73) {
        super(new pq7("AssetPackServiceListenerRegistry"), new IntentFilter("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE"), context);
        this.f29697g = iVar;
        this.f29698h = gVar;
        this.f29699i = rt7;
        this.f29701k = rs7;
        this.f29700j = hs7;
        this.f29702l = rt72;
        this.f29703m = rt73;
    }

    /* renamed from: a */
    public final void mo43369a(Context context, Intent intent) {
        Bundle bundleExtra = intent.getBundleExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE");
        if (bundleExtra != null) {
            ArrayList<String> stringArrayList = bundleExtra.getStringArrayList("pack_names");
            if (stringArrayList == null || stringArrayList.size() != 1) {
                this.f36220a.mo46853b("Corrupt bundle received from broadcast.", new Object[0]);
                return;
            }
            AssetPackState d = AssetPackState.m36339d(bundleExtra, stringArrayList.get(0), this.f29701k, kr7.f31011c);
            this.f36220a.mo46852a("ListenerRegistryBroadcastReceiver.onReceive: %s", d);
            PendingIntent pendingIntent = (PendingIntent) bundleExtra.getParcelable("confirmation_intent");
            if (pendingIntent != null) {
                this.f29700j.mo43375a(pendingIntent);
            }
            this.f29703m.mo47486a().execute(new dr7(this, bundleExtra, d));
            this.f29702l.mo47486a().execute(new fr7(this, bundleExtra));
            return;
        }
        this.f36220a.mo46853b("Empty bundle received from broadcast.", new Object[0]);
    }

    /* renamed from: f */
    public final void mo43370f(AssetPackState assetPackState) {
        this.f29704n.post(new br7(this, assetPackState));
    }

    /* renamed from: g */
    public final /* synthetic */ void mo43371g(Bundle bundle) {
        if (this.f29697g.mo34206d(bundle)) {
            this.f29698h.mo34200a();
        }
    }

    /* renamed from: h */
    public final /* synthetic */ void mo43372h(Bundle bundle, AssetPackState assetPackState) {
        if (this.f29697g.mo34207e(bundle)) {
            mo43370f(assetPackState);
            this.f29699i.mo47486a().mo29741a();
        }
    }
}
