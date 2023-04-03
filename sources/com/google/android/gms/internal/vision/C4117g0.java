package com.google.android.gms.internal.vision;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.vision.g0 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public final class C4117g0<T> implements g79<T> {

    /* renamed from: a */
    public final k59 f22878a;

    /* renamed from: b */
    public final o89<?, ?> f22879b;

    /* renamed from: c */
    public final boolean f22880c;

    /* renamed from: d */
    public final wz8<?> f22881d;

    public C4117g0(o89<?, ?> o89, wz8<?> wz8, k59 k59) {
        this.f22879b = o89;
        this.f22880c = wz8.mo31166e(k59);
        this.f22881d = wz8;
        this.f22878a = k59;
    }

    /* renamed from: i */
    public static <T> C4117g0<T> m34270i(o89<?, ?> o89, wz8<?> wz8, k59 k59) {
        return new C4117g0<>(o89, wz8, k59);
    }

    /* renamed from: a */
    public final void mo31205a(T t) {
        this.f22879b.mo46353j(t);
        this.f22881d.mo31168g(t);
    }

    /* renamed from: b */
    public final int mo31206b(T t) {
        int hashCode = this.f22879b.mo46349f(t).hashCode();
        if (this.f22880c) {
            return (hashCode * 53) + this.f22881d.mo31164c(t).hashCode();
        }
        return hashCode;
    }

    /* renamed from: c */
    public final void mo31207c(T t, T t2) {
        i79.m45568p(this.f22879b, t, t2);
        if (this.f22880c) {
            i79.m45566n(this.f22881d, t, t2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: com.google.android.gms.internal.vision.e0$d} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo31208d(T r11, byte[] r12, int r13, int r14, p000.uw8 r15) throws java.io.IOException {
        /*
            r10 = this;
            r0 = r11
            com.google.android.gms.internal.vision.e0 r0 = (com.google.android.gms.internal.vision.C4105e0) r0
            t89 r1 = r0.zzb
            t89 r2 = p000.t89.m52128a()
            if (r1 != r2) goto L_0x0011
            t89 r1 = p000.t89.m52131g()
            r0.zzb = r1
        L_0x0011:
            com.google.android.gms.internal.vision.e0$c r11 = (com.google.android.gms.internal.vision.C4105e0.C4108c) r11
            i09 r11 = r11.mo31191x()
            r0 = 0
            r2 = r0
        L_0x0019:
            if (r13 >= r14) goto L_0x00c9
            int r4 = com.google.android.gms.internal.vision.C4144z.m34331i(r12, r13, r15)
            int r13 = r15.f34743a
            r3 = 11
            r5 = 2
            if (r13 == r3) goto L_0x0065
            r3 = r13 & 7
            if (r3 != r5) goto L_0x0060
            wz8<?> r2 = r10.f22881d
            com.google.android.gms.internal.vision.b0 r3 = r15.f34746d
            k59 r5 = r10.f22878a
            int r6 = r13 >>> 3
            java.lang.Object r2 = r2.mo31163b(r3, r5, r6)
            r8 = r2
            com.google.android.gms.internal.vision.e0$d r8 = (com.google.android.gms.internal.vision.C4105e0.C4109d) r8
            if (r8 == 0) goto L_0x0055
            n69 r13 = p000.n69.m48643a()
            k59 r2 = r8.f22865a
            java.lang.Class r2 = r2.getClass()
            g79 r13 = r13.mo46002b(r2)
            int r13 = com.google.android.gms.internal.vision.C4144z.m34329g(r13, r12, r4, r14, r15)
            com.google.android.gms.internal.vision.e0$e r2 = r8.f22866b
            java.lang.Object r3 = r15.f34745c
            r11.mo43439g(r2, r3)
            goto L_0x005e
        L_0x0055:
            r2 = r13
            r3 = r12
            r5 = r14
            r6 = r1
            r7 = r15
            int r13 = com.google.android.gms.internal.vision.C4144z.m34325c(r2, r3, r4, r5, r6, r7)
        L_0x005e:
            r2 = r8
            goto L_0x0019
        L_0x0060:
            int r13 = com.google.android.gms.internal.vision.C4144z.m34323a(r13, r12, r4, r14, r15)
            goto L_0x0019
        L_0x0065:
            r13 = 0
            r3 = r0
        L_0x0067:
            if (r4 >= r14) goto L_0x00be
            int r4 = com.google.android.gms.internal.vision.C4144z.m34331i(r12, r4, r15)
            int r6 = r15.f34743a
            int r7 = r6 >>> 3
            r8 = r6 & 7
            if (r7 == r5) goto L_0x00a0
            r9 = 3
            if (r7 == r9) goto L_0x0079
            goto L_0x00b5
        L_0x0079:
            if (r2 == 0) goto L_0x0095
            n69 r6 = p000.n69.m48643a()
            k59 r7 = r2.f22865a
            java.lang.Class r7 = r7.getClass()
            g79 r6 = r6.mo46002b(r7)
            int r4 = com.google.android.gms.internal.vision.C4144z.m34329g(r6, r12, r4, r14, r15)
            com.google.android.gms.internal.vision.e0$e r6 = r2.f22866b
            java.lang.Object r7 = r15.f34745c
            r11.mo43439g(r6, r7)
            goto L_0x0067
        L_0x0095:
            if (r8 != r5) goto L_0x00b5
            int r4 = com.google.android.gms.internal.vision.C4144z.m34339q(r12, r4, r15)
            java.lang.Object r3 = r15.f34745c
            com.google.android.gms.internal.vision.zzht r3 = (com.google.android.gms.internal.vision.zzht) r3
            goto L_0x0067
        L_0x00a0:
            if (r8 != 0) goto L_0x00b5
            int r4 = com.google.android.gms.internal.vision.C4144z.m34331i(r12, r4, r15)
            int r13 = r15.f34743a
            wz8<?> r2 = r10.f22881d
            com.google.android.gms.internal.vision.b0 r6 = r15.f34746d
            k59 r7 = r10.f22878a
            java.lang.Object r2 = r2.mo31163b(r6, r7, r13)
            com.google.android.gms.internal.vision.e0$d r2 = (com.google.android.gms.internal.vision.C4105e0.C4109d) r2
            goto L_0x0067
        L_0x00b5:
            r7 = 12
            if (r6 == r7) goto L_0x00be
            int r4 = com.google.android.gms.internal.vision.C4144z.m34323a(r6, r12, r4, r14, r15)
            goto L_0x0067
        L_0x00be:
            if (r3 == 0) goto L_0x00c6
            int r13 = r13 << 3
            r13 = r13 | r5
            r1.mo48024c(r13, r3)
        L_0x00c6:
            r13 = r4
            goto L_0x0019
        L_0x00c9:
            if (r13 != r14) goto L_0x00cc
            return
        L_0x00cc:
            com.google.android.gms.internal.vision.zzjk r11 = com.google.android.gms.internal.vision.zzjk.zzg()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.C4117g0.mo31208d(java.lang.Object, byte[], int, int, uw8):void");
    }

    /* renamed from: e */
    public final boolean mo31209e(T t) {
        return this.f22881d.mo31164c(t).mo43447r();
    }

    /* renamed from: f */
    public final int mo31210f(T t) {
        o89<?, ?> o89 = this.f22879b;
        int k = o89.mo46354k(o89.mo46349f(t)) + 0;
        if (this.f22880c) {
            return k + this.f22881d.mo31164c(t).mo43448s();
        }
        return k;
    }

    /* renamed from: g */
    public final boolean mo31211g(T t, T t2) {
        if (!this.f22879b.mo46349f(t).equals(this.f22879b.mo46349f(t2))) {
            return false;
        }
        if (this.f22880c) {
            return this.f22881d.mo31164c(t).equals(this.f22881d.mo31164c(t2));
        }
        return true;
    }

    /* renamed from: h */
    public final void mo31212h(T t, sa9 sa9) throws IOException {
        Iterator<Map.Entry<?, Object>> o = this.f22881d.mo31164c(t).mo43445o();
        while (o.hasNext()) {
            Map.Entry next = o.next();
            n09 n09 = (n09) next.getKey();
            if (n09.zzc() != zzmo.MESSAGE || n09.mo31194b() || n09.mo31195c()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (next instanceof x29) {
                sa9.mo45572f(n09.zza(), ((x29) next).mo49341a().mo41820d());
            } else {
                sa9.mo45572f(n09.zza(), next.getValue());
            }
        }
        o89<?, ?> o89 = this.f22879b;
        o89.mo46351h(o89.mo46349f(t), sa9);
    }

    public final T zza() {
        return this.f22878a.mo31177l().mo31182c();
    }
}
