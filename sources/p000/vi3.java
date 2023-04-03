package p000;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: vi3 */
/* compiled from: LoadEventInfo */
public final class vi3 {

    /* renamed from: h */
    public static final AtomicLong f18799h = new AtomicLong();

    /* renamed from: a */
    public final long f18800a;

    /* renamed from: b */
    public final d21 f18801b;

    /* renamed from: c */
    public final Uri f18802c;

    /* renamed from: d */
    public final Map<String, List<String>> f18803d;

    /* renamed from: e */
    public final long f18804e;

    /* renamed from: f */
    public final long f18805f;

    /* renamed from: g */
    public final long f18806g;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public vi3(long r13, p000.d21 r15, long r16) {
        /*
            r12 = this;
            r3 = r15
            android.net.Uri r4 = r3.f10437a
            java.util.Map r5 = java.util.Collections.emptyMap()
            r8 = 0
            r10 = 0
            r0 = r12
            r1 = r13
            r6 = r16
            r0.<init>(r1, r3, r4, r5, r6, r8, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.vi3.<init>(long, d21, long):void");
    }

    /* renamed from: a */
    public static long m28818a() {
        return f18799h.getAndIncrement();
    }

    public vi3(long j, d21 d21, Uri uri, Map<String, List<String>> map, long j2, long j3, long j4) {
        this.f18800a = j;
        this.f18801b = d21;
        this.f18802c = uri;
        this.f18803d = map;
        this.f18804e = j2;
        this.f18805f = j3;
        this.f18806g = j4;
    }
}
