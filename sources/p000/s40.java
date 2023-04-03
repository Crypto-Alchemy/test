package p000;

import java.lang.ref.SoftReference;

/* renamed from: s40 */
/* compiled from: BufferRecyclers */
public class s40 {

    /* renamed from: a */
    public static final hp6 f17464a;

    /* renamed from: b */
    public static final ThreadLocal<SoftReference<r40>> f17465b = new ThreadLocal<>();

    static {
        boolean z;
        hp6 hp6;
        try {
            z = "true".equals(System.getProperty("com.fasterxml.jackson.core.util.BufferRecyclers.trackReusableBuffers"));
        } catch (SecurityException unused) {
            z = false;
        }
        if (z) {
            hp6 = hp6.m19144a();
        } else {
            hp6 = null;
        }
        f17464a = hp6;
    }

    /* renamed from: a */
    public static r40 m26586a() {
        r40 r40;
        SoftReference<r40> softReference;
        ThreadLocal<SoftReference<r40>> threadLocal = f17465b;
        SoftReference softReference2 = threadLocal.get();
        if (softReference2 == null) {
            r40 = null;
        } else {
            r40 = (r40) softReference2.get();
        }
        if (r40 == null) {
            r40 = new r40();
            hp6 hp6 = f17464a;
            if (hp6 != null) {
                softReference = hp6.mo21334c(r40);
            } else {
                softReference = new SoftReference<>(r40);
            }
            threadLocal.set(softReference);
        }
        return r40;
    }
}
