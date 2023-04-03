package p000;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzp;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o19 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class o19 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f32258a;

    /* renamed from: d */
    public final /* synthetic */ String f32259d;

    /* renamed from: e */
    public final /* synthetic */ String f32260e;

    /* renamed from: g */
    public final /* synthetic */ zzp f32261g;

    /* renamed from: k */
    public final /* synthetic */ boolean f32262k;

    /* renamed from: r */
    public final /* synthetic */ g29 f32263r;

    public o19(g29 g29, AtomicReference atomicReference, String str, String str2, String str3, zzp zzp, boolean z) {
        this.f32263r = g29;
        this.f32258a = atomicReference;
        this.f32259d = str2;
        this.f32260e = str3;
        this.f32261g = zzp;
        this.f32262k = z;
    }

    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f32258a) {
            try {
                am8 z = this.f32263r.f29060d;
                if (z == null) {
                    this.f32263r.f34342a.mo45237A().mo29670l().mo48772d("(legacy) Failed to get user properties; not connected to service", (Object) null, this.f32259d, this.f32260e);
                    this.f32258a.set(Collections.emptyList());
                    this.f32258a.notify();
                    return;
                }
                if (TextUtils.isEmpty((CharSequence) null)) {
                    cu4.m43221k(this.f32261g);
                    this.f32258a.set(z.mo29008A(this.f32259d, this.f32260e, this.f32262k, this.f32261g));
                } else {
                    this.f32258a.set(z.mo29019f0((String) null, this.f32259d, this.f32260e, this.f32262k));
                }
                this.f32263r.mo42710D();
                atomicReference = this.f32258a;
                atomicReference.notify();
            } catch (RemoteException e) {
                try {
                    this.f32263r.f34342a.mo45237A().mo29670l().mo48772d("(legacy) Failed to get user properties; remote exception", (Object) null, this.f32259d, e);
                    this.f32258a.set(Collections.emptyList());
                    atomicReference = this.f32258a;
                } catch (Throwable th) {
                    this.f32258a.notify();
                    throw th;
                }
            }
        }
    }
}
