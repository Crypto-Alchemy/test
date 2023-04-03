package p000;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: h38 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public abstract class h38 extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public volatile boolean f29425d;

    /* renamed from: e */
    public final AtomicReference f29426e = new AtomicReference((Object) null);

    /* renamed from: g */
    public final Handler f29427g = new s38(Looper.getMainLooper());

    /* renamed from: k */
    public final yh2 f29428k;

    public h38(qg3 qg3, yh2 yh2) {
        super(qg3);
        this.f29428k = yh2;
    }

    /* renamed from: p */
    public static final int m45018p(u28 u28) {
        if (u28 == null) {
            return -1;
        }
        return u28.mo48284a();
    }

    /* renamed from: e */
    public final void mo30590e(int i, int i2, Intent intent) {
        u28 u28 = (u28) this.f29426e.get();
        if (i != 1) {
            if (i == 2) {
                int i3 = this.f29428k.mo49669i(mo30589b());
                if (i3 == 0) {
                    mo43069o();
                    return;
                } else if (u28 != null) {
                    if (u28.mo48285b().mo30457r1() == 18 && i3 == 18) {
                        return;
                    }
                } else {
                    return;
                }
            }
        } else if (i2 == -1) {
            mo43069o();
            return;
        } else if (i2 == 0) {
            if (u28 != null) {
                int i4 = 13;
                if (intent != null) {
                    i4 = intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
                }
                mo43068l(new ConnectionResult(i4, (PendingIntent) null, u28.mo48285b().toString()), m45018p(u28));
                return;
            }
            return;
        }
        if (u28 != null) {
            mo43068l(u28.mo48285b(), u28.mo48284a());
        }
    }

    /* renamed from: f */
    public final void mo30591f(Bundle bundle) {
        u28 u28;
        super.mo30591f(bundle);
        if (bundle != null) {
            AtomicReference atomicReference = this.f29426e;
            if (bundle.getBoolean("resolving_error", false)) {
                u28 = new u28(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1));
            } else {
                u28 = null;
            }
            atomicReference.set(u28);
        }
    }

    /* renamed from: i */
    public final void mo30594i(Bundle bundle) {
        super.mo30594i(bundle);
        u28 u28 = (u28) this.f29426e.get();
        if (u28 != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", u28.mo48284a());
            bundle.putInt("failed_status", u28.mo48285b().mo30457r1());
            bundle.putParcelable("failed_resolution", u28.mo48285b().mo30459t1());
        }
    }

    /* renamed from: j */
    public void mo30595j() {
        super.mo30595j();
        this.f29425d = true;
    }

    /* renamed from: k */
    public void mo30596k() {
        super.mo30596k();
        this.f29425d = false;
    }

    /* renamed from: l */
    public final void mo43068l(ConnectionResult connectionResult, int i) {
        this.f29426e.set((Object) null);
        mo42091m(connectionResult, i);
    }

    /* renamed from: m */
    public abstract void mo42091m(ConnectionResult connectionResult, int i);

    /* renamed from: n */
    public abstract void mo42092n();

    /* renamed from: o */
    public final void mo43069o() {
        this.f29426e.set((Object) null);
        mo42092n();
    }

    public final void onCancel(DialogInterface dialogInterface) {
        mo43068l(new ConnectionResult(13, (PendingIntent) null), m45018p((u28) this.f29426e.get()));
    }

    /* renamed from: s */
    public final void mo43071s(ConnectionResult connectionResult, int i) {
        u28 u28 = new u28(connectionResult, i);
        AtomicReference atomicReference = this.f29426e;
        while (!ao0.m10672a(atomicReference, (Object) null, u28)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        this.f29427g.post(new d38(this, u28));
    }
}
