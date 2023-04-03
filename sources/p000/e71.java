package p000;

import android.os.SystemClock;

/* renamed from: e71 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class e71 implements bh0 {

    /* renamed from: a */
    public static final e71 f28412a = new e71();

    /* renamed from: c */
    public static bh0 m43806c() {
        return f28412a;
    }

    /* renamed from: a */
    public final long mo29580a() {
        return System.currentTimeMillis();
    }

    /* renamed from: b */
    public final long mo29581b() {
        return SystemClock.elapsedRealtime();
    }

    public final long nanoTime() {
        return System.nanoTime();
    }
}
