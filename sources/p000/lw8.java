package p000;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: lw8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class lw8 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f31426a;

    /* renamed from: d */
    public final /* synthetic */ String f31427d;

    /* renamed from: e */
    public final /* synthetic */ String f31428e;

    /* renamed from: g */
    public final /* synthetic */ sx8 f31429g;

    public lw8(sx8 sx8, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f31429g = sx8;
        this.f31426a = atomicReference;
        this.f31427d = str2;
        this.f31428e = str3;
    }

    public final void run() {
        this.f31429g.f34342a.mo45254R().mo42720N(this.f31426a, (String) null, this.f31427d, this.f31428e);
    }
}
