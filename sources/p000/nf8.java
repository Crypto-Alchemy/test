package p000;

import com.google.android.gms.internal.clearcut.C4056e;

/* renamed from: nf8 */
public final class nf8 implements rj8 {

    /* renamed from: a */
    public static final nf8 f32113a = new nf8();

    /* renamed from: c */
    public static nf8 m48760c() {
        return f32113a;
    }

    /* renamed from: a */
    public final boolean mo46073a(Class<?> cls) {
        return C4056e.class.isAssignableFrom(cls);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Class<?>, java.lang.Class] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p000.pj8 mo46074b(java.lang.Class<?> r5) {
        /*
            r4 = this;
            java.lang.Class<com.google.android.gms.internal.clearcut.e> r0 = com.google.android.gms.internal.clearcut.C4056e.class
            boolean r1 = r0.isAssignableFrom(r5)
            if (r1 != 0) goto L_0x0024
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unsupported message type: "
            java.lang.String r5 = r5.getName()
            int r2 = r5.length()
            if (r2 == 0) goto L_0x001b
            java.lang.String r5 = r1.concat(r5)
            goto L_0x0020
        L_0x001b:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1)
        L_0x0020:
            r0.<init>(r5)
            throw r0
        L_0x0024:
            java.lang.Class r0 = r5.asSubclass(r0)     // Catch:{ Exception -> 0x0036 }
            com.google.android.gms.internal.clearcut.e r0 = com.google.android.gms.internal.clearcut.C4056e.m33859q(r0)     // Catch:{ Exception -> 0x0036 }
            int r1 = com.google.android.gms.internal.clearcut.C4056e.C4061e.f22456c     // Catch:{ Exception -> 0x0036 }
            r2 = 0
            java.lang.Object r0 = r0.mo30767e(r1, r2, r2)     // Catch:{ Exception -> 0x0036 }
            pj8 r0 = (p000.pj8) r0     // Catch:{ Exception -> 0x0036 }
            return r0
        L_0x0036:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Unable to get message info for "
            java.lang.String r5 = r5.getName()
            int r3 = r5.length()
            if (r3 == 0) goto L_0x004a
            java.lang.String r5 = r2.concat(r5)
            goto L_0x004f
        L_0x004a:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r2)
        L_0x004f:
            r1.<init>(r5, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.nf8.mo46074b(java.lang.Class):pj8");
    }
}
