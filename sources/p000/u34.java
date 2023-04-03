package p000;

/* renamed from: u34 */
/* compiled from: NativeLoader */
public class u34 {

    /* renamed from: a */
    public static v34 f18367a;

    /* renamed from: a */
    public static synchronized void m28055a(v34 v34) {
        synchronized (u34.class) {
            if (f18367a == null) {
                f18367a = v34;
            } else {
                throw new IllegalStateException("Cannot re-initialize NativeLoader.");
            }
        }
    }

    /* renamed from: b */
    public static synchronized void m28056b(v34 v34) {
        synchronized (u34.class) {
            if (!m28057c()) {
                m28055a(v34);
            }
        }
    }

    /* renamed from: c */
    public static synchronized boolean m28057c() {
        boolean z;
        synchronized (u34.class) {
            if (f18367a != null) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: d */
    public static boolean m28058d(String str) {
        return m28059e(str, 0);
    }

    /* renamed from: e */
    public static boolean m28059e(String str, int i) {
        v34 v34;
        synchronized (u34.class) {
            v34 = f18367a;
            if (v34 == null) {
                throw new IllegalStateException("NativeLoader has not been initialized.  To use standard native library loading, call NativeLoader.init(new SystemDelegate()).");
            }
        }
        return v34.mo21951a(str, i);
    }
}
