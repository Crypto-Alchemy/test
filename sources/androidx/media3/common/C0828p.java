package androidx.media3.common;

import android.os.Bundle;
import androidx.media3.common.C0785d;

/* renamed from: androidx.media3.common.p */
/* compiled from: Rating */
public abstract class C0828p implements C0785d {

    /* renamed from: a */
    public static final C0785d.C0786a<C0828p> f4426a = new e75();

    /* renamed from: b */
    public static C0828p m5761b(Bundle bundle) {
        int i = bundle.getInt(m5762c(0), -1);
        if (i == 0) {
            return C0797j.f4238g.mo104a(bundle);
        }
        if (i == 1) {
            return C0819m.f4402e.mo104a(bundle);
        }
        if (i == 2) {
            return C0829q.f4427g.mo104a(bundle);
        }
        if (i == 3) {
            return C0830r.f4430g.mo104a(bundle);
        }
        throw new IllegalArgumentException("Unknown RatingType: " + i);
    }

    /* renamed from: c */
    public static String m5762c(int i) {
        return Integer.toString(i, 36);
    }
}
