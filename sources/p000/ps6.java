package p000;

import android.os.Trace;

/* renamed from: ps6 */
/* compiled from: TraceUtil */
public final class ps6 {
    /* renamed from: a */
    public static void m25173a(String str) {
        if (w67.f19021a >= 18) {
            m25174b(str);
        }
    }

    /* renamed from: b */
    public static void m25174b(String str) {
        Trace.beginSection(str);
    }

    /* renamed from: c */
    public static void m25175c() {
        if (w67.f19021a >= 18) {
            m25176d();
        }
    }

    /* renamed from: d */
    public static void m25176d() {
        Trace.endSection();
    }
}
