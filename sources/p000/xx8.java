package p000;

import java.util.Map;

/* renamed from: xx8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final /* synthetic */ class xx8 implements Runnable {

    /* renamed from: a */
    public final zx8 f35719a;

    /* renamed from: d */
    public final int f35720d;

    /* renamed from: e */
    public final Exception f35721e;

    /* renamed from: g */
    public final byte[] f35722g;

    /* renamed from: k */
    public final Map f35723k;

    public xx8(zx8 zx8, int i, Exception exc, byte[] bArr, Map map) {
        this.f35719a = zx8;
        this.f35720d = i;
        this.f35721e = exc;
        this.f35722g = bArr;
        this.f35723k = map;
    }

    public final void run() {
        this.f35719a.mo49988a(this.f35720d, this.f35721e, this.f35722g, this.f35723k);
    }
}
