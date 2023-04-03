package p000;

import android.net.Uri;
import androidx.media3.common.C0792h;
import androidx.media3.exoplayer.upstream.Loader;
import java.util.List;
import java.util.Map;

/* renamed from: pe0 */
/* compiled from: Chunk */
public abstract class pe0 implements Loader.C1015e {

    /* renamed from: a */
    public final long f16392a = vi3.m28818a();

    /* renamed from: b */
    public final d21 f16393b;

    /* renamed from: c */
    public final int f16394c;

    /* renamed from: d */
    public final C0792h f16395d;

    /* renamed from: e */
    public final int f16396e;

    /* renamed from: f */
    public final Object f16397f;

    /* renamed from: g */
    public final long f16398g;

    /* renamed from: h */
    public final long f16399h;

    /* renamed from: i */
    public final n96 f16400i;

    public pe0(x11 x11, d21 d21, int i, C0792h hVar, int i2, Object obj, long j, long j2) {
        this.f16400i = new n96(x11);
        this.f16393b = (d21) C2725kr.m20985e(d21);
        this.f16394c = i;
        this.f16395d = hVar;
        this.f16396e = i2;
        this.f16397f = obj;
        this.f16398g = j;
        this.f16399h = j2;
    }

    /* renamed from: b */
    public final long mo24534b() {
        return this.f16400i.mo23539o();
    }

    /* renamed from: d */
    public final Map<String, List<String>> mo24535d() {
        return this.f16400i.mo23541q();
    }

    /* renamed from: e */
    public final Uri mo24536e() {
        return this.f16400i.mo23540p();
    }
}
