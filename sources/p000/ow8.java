package p000;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ow8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class ow8 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f32468a;

    /* renamed from: d */
    public final /* synthetic */ String f32469d;

    /* renamed from: e */
    public final /* synthetic */ String f32470e;

    /* renamed from: g */
    public final /* synthetic */ boolean f32471g;

    /* renamed from: k */
    public final /* synthetic */ sx8 f32472k;

    public ow8(sx8 sx8, AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        this.f32472k = sx8;
        this.f32468a = atomicReference;
        this.f32469d = str2;
        this.f32470e = str3;
        this.f32471g = z;
    }

    public final void run() {
        this.f32472k.f34342a.mo45254R().mo42722P(this.f32468a, (String) null, this.f32469d, this.f32470e, this.f32471g);
    }
}
