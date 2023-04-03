package p000;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzp;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: k19 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class k19 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f30693a;

    /* renamed from: d */
    public final /* synthetic */ String f30694d;

    /* renamed from: e */
    public final /* synthetic */ String f30695e;

    /* renamed from: g */
    public final /* synthetic */ zzp f30696g;

    /* renamed from: k */
    public final /* synthetic */ g29 f30697k;

    public k19(g29 g29, AtomicReference atomicReference, String str, String str2, String str3, zzp zzp) {
        this.f30697k = g29;
        this.f30693a = atomicReference;
        this.f30694d = str2;
        this.f30695e = str3;
        this.f30696g = zzp;
    }

    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f30693a) {
            try {
                am8 z = this.f30697k.f29060d;
                if (z == null) {
                    this.f30697k.f34342a.mo45237A().mo29670l().mo48772d("(legacy) Failed to get conditional properties; not connected to service", (Object) null, this.f30694d, this.f30695e);
                    this.f30693a.set(Collections.emptyList());
                    this.f30693a.notify();
                    return;
                }
                if (TextUtils.isEmpty((CharSequence) null)) {
                    cu4.m43221k(this.f30696g);
                    this.f30693a.set(z.mo29018d(this.f30694d, this.f30695e, this.f30696g));
                } else {
                    this.f30693a.set(z.mo29009B((String) null, this.f30694d, this.f30695e));
                }
                this.f30697k.mo42710D();
                atomicReference = this.f30693a;
                atomicReference.notify();
            } catch (RemoteException e) {
                try {
                    this.f30697k.f34342a.mo45237A().mo29670l().mo48772d("(legacy) Failed to get conditional properties; remote exception", (Object) null, this.f30694d, e);
                    this.f30693a.set(Collections.emptyList());
                    atomicReference = this.f30693a;
                } catch (Throwable th) {
                    this.f30693a.notify();
                    throw th;
                }
            }
        }
    }
}
