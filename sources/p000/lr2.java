package p000;

import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: lr2 */
/* compiled from: ImagePipeline */
public class lr2 {

    /* renamed from: p */
    public static final CancellationException f14652p = new CancellationException("Prefetching is not enabled");

    /* renamed from: a */
    public final dw4 f14653a;

    /* renamed from: b */
    public final je5 f14654b;

    /* renamed from: c */
    public final ke5 f14655c;

    /* renamed from: d */
    public final td6<Boolean> f14656d;

    /* renamed from: e */
    public final ys3<f80, kh0> f14657e;

    /* renamed from: f */
    public final ys3<f80, PooledByteBuffer> f14658f;

    /* renamed from: g */
    public final t40 f14659g;

    /* renamed from: h */
    public final t40 f14660h;

    /* renamed from: i */
    public final g80 f14661i;

    /* renamed from: j */
    public final fp6 f14662j;

    /* renamed from: k */
    public final td6<Boolean> f14663k;

    /* renamed from: l */
    public AtomicLong f14664l = new AtomicLong();

    /* renamed from: m */
    public final td6<Boolean> f14665m;

    /* renamed from: n */
    public final v90 f14666n;

    /* renamed from: o */
    public final nr2 f14667o;

    public lr2(dw4 dw4, Set<je5> set, Set<ke5> set2, td6<Boolean> td6, ys3<f80, kh0> ys3, ys3<f80, PooledByteBuffer> ys32, t40 t40, t40 t402, g80 g80, fp6 fp6, td6<Boolean> td62, td6<Boolean> td63, v90 v90, nr2 nr2) {
        this.f14653a = dw4;
        this.f14654b = new o82(set);
        this.f14655c = new n82(set2);
        this.f14656d = td6;
        this.f14657e = ys3;
        this.f14658f = ys32;
        this.f14659g = t40;
        this.f14660h = t402;
        this.f14661i = g80;
        this.f14662j = fp6;
        this.f14663k = td62;
        this.f14665m = td63;
        this.f14666n = v90;
        this.f14667o = nr2;
    }

    /* renamed from: a */
    public z11<nh0<kh0>> mo22930a(ImageRequest imageRequest, Object obj, ImageRequest.RequestLevel requestLevel, je5 je5, String str) {
        try {
            return mo22935f(this.f14653a.mo18957e(imageRequest), imageRequest, requestLevel, obj, je5, str);
        } catch (Exception e) {
            return c21.m11692b(e);
        }
    }

    /* renamed from: b */
    public String mo22931b() {
        return String.valueOf(this.f14664l.getAndIncrement());
    }

    /* renamed from: c */
    public ys3<f80, kh0> mo22932c() {
        return this.f14657e;
    }

    /* renamed from: d */
    public g80 mo22933d() {
        return this.f14661i;
    }

    /* renamed from: e */
    public je5 mo22934e(ImageRequest imageRequest, je5 je5) {
        if (je5 == null) {
            if (imageRequest.mo13452p() == null) {
                return this.f14654b;
            }
            return new o82(this.f14654b, imageRequest.mo13452p());
        } else if (imageRequest.mo13452p() == null) {
            return new o82(this.f14654b, je5);
        } else {
            return new o82(this.f14654b, je5, imageRequest.mo13452p());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0068  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> p000.z11<p000.nh0<T>> mo22935f(p000.vv4<p000.nh0<T>> r15, com.facebook.imagepipeline.request.ImageRequest r16, com.facebook.imagepipeline.request.ImageRequest.RequestLevel r17, java.lang.Object r18, p000.je5 r19, java.lang.String r20) {
        /*
            r14 = this;
            r1 = r14
            boolean r0 = p000.lc2.m21369d()
            if (r0 == 0) goto L_0x000c
            java.lang.String r0 = "ImagePipeline#submitFetchRequest"
            p000.lc2.m21366a(r0)
        L_0x000c:
            qx2 r0 = new qx2
            r3 = r16
            r2 = r19
            je5 r2 = r14.mo22934e(r3, r2)
            ke5 r4 = r1.f14655c
            r0.<init>(r2, r4)
            v90 r2 = r1.f14666n
            r4 = 0
            r7 = r18
            if (r2 == 0) goto L_0x0025
            r2.mo27082a(r7, r4)
        L_0x0025:
            com.facebook.imagepipeline.request.ImageRequest$RequestLevel r2 = r16.mo13446j()     // Catch:{ Exception -> 0x006e }
            r5 = r17
            com.facebook.imagepipeline.request.ImageRequest$RequestLevel r8 = com.facebook.imagepipeline.request.ImageRequest.RequestLevel.getMax(r2, r5)     // Catch:{ Exception -> 0x006e }
            sy5 r13 = new sy5     // Catch:{ Exception -> 0x006e }
            java.lang.String r5 = r14.mo22931b()     // Catch:{ Exception -> 0x006e }
            r9 = 0
            boolean r2 = r16.mo13451o()     // Catch:{ Exception -> 0x006e }
            if (r2 != 0) goto L_0x0049
            android.net.Uri r2 = r16.mo13458u()     // Catch:{ Exception -> 0x006e }
            boolean r2 = p000.i57.m19429l(r2)     // Catch:{ Exception -> 0x006e }
            if (r2 != 0) goto L_0x0047
            goto L_0x0049
        L_0x0047:
            r10 = r4
            goto L_0x004b
        L_0x0049:
            r2 = 1
            r10 = r2
        L_0x004b:
            com.facebook.imagepipeline.common.Priority r11 = r16.mo13450n()     // Catch:{ Exception -> 0x006e }
            nr2 r12 = r1.f14667o     // Catch:{ Exception -> 0x006e }
            r2 = r13
            r3 = r16
            r4 = r5
            r5 = r20
            r6 = r0
            r7 = r18
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x006e }
            r2 = r15
            z11 r0 = p000.mh0.m22297H(r15, r13, r0)     // Catch:{ Exception -> 0x006e }
            boolean r2 = p000.lc2.m21369d()
            if (r2 == 0) goto L_0x006b
            p000.lc2.m21367b()
        L_0x006b:
            return r0
        L_0x006c:
            r0 = move-exception
            goto L_0x007d
        L_0x006e:
            r0 = move-exception
            z11 r0 = p000.c21.m11692b(r0)     // Catch:{ all -> 0x006c }
            boolean r2 = p000.lc2.m21369d()
            if (r2 == 0) goto L_0x007c
            p000.lc2.m21367b()
        L_0x007c:
            return r0
        L_0x007d:
            boolean r2 = p000.lc2.m21369d()
            if (r2 == 0) goto L_0x0086
            p000.lc2.m21367b()
        L_0x0086:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.lr2.mo22935f(vv4, com.facebook.imagepipeline.request.ImageRequest, com.facebook.imagepipeline.request.ImageRequest$RequestLevel, java.lang.Object, je5, java.lang.String):z11");
    }
}
