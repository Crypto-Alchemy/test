package p000;

/* renamed from: t39 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
public final class t39 implements n79 {

    /* renamed from: a */
    public static final t39 f34110a = new t39();

    /* renamed from: c */
    public static t39 m52064c() {
        return f34110a;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Class<?>, java.lang.Class] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p000.l79 mo46027a(java.lang.Class<?> r5) {
        /*
            r4 = this;
            java.lang.Class<s49> r0 = p000.s49.class
            boolean r1 = r0.isAssignableFrom(r5)
            if (r1 != 0) goto L_0x0024
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.getName()
            java.lang.String r1 = "Unsupported message type: "
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
            java.lang.Class r0 = r5.asSubclass(r0)     // Catch:{ Exception -> 0x0035 }
            s49 r0 = p000.s49.m51530t(r0)     // Catch:{ Exception -> 0x0035 }
            r1 = 3
            r2 = 0
            java.lang.Object r0 = r0.mo29044w(r1, r2, r2)     // Catch:{ Exception -> 0x0035 }
            l79 r0 = (p000.l79) r0     // Catch:{ Exception -> 0x0035 }
            return r0
        L_0x0035:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r5 = r5.getName()
            java.lang.String r2 = "Unable to get message info for "
            int r3 = r5.length()
            if (r3 == 0) goto L_0x0049
            java.lang.String r5 = r2.concat(r5)
            goto L_0x004e
        L_0x0049:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r2)
        L_0x004e:
            r1.<init>(r5, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.t39.mo46027a(java.lang.Class):l79");
    }

    /* renamed from: b */
    public final boolean mo46028b(Class<?> cls) {
        return s49.class.isAssignableFrom(cls);
    }
}
