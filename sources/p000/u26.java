package p000;

import java.util.Collections;
import java.util.List;

/* renamed from: u26 */
/* compiled from: SimpleProgressiveJpegConfig */
public class u26 implements qw4 {

    /* renamed from: a */
    public final C3392c f18363a;

    /* renamed from: u26$b */
    /* compiled from: SimpleProgressiveJpegConfig */
    public static class C3391b implements C3392c {
        public C3391b() {
        }

        /* renamed from: a */
        public List<Integer> mo26641a() {
            return Collections.EMPTY_LIST;
        }

        /* renamed from: b */
        public int mo26642b() {
            return 0;
        }
    }

    /* renamed from: u26$c */
    /* compiled from: SimpleProgressiveJpegConfig */
    public interface C3392c {
        /* renamed from: a */
        List<Integer> mo26641a();

        /* renamed from: b */
        int mo26642b();
    }

    public u26() {
        this(new C3391b());
    }

    /* renamed from: a */
    public int mo25279a(int i) {
        List<Integer> a = this.f18363a.mo26641a();
        if (a == null || a.isEmpty()) {
            return i + 1;
        }
        for (int i2 = 0; i2 < a.size(); i2++) {
            if (a.get(i2).intValue() > i) {
                return a.get(i2).intValue();
            }
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: b */
    public qz4 mo25280b(int i) {
        boolean z;
        if (i >= this.f18363a.mo26642b()) {
            z = true;
        } else {
            z = false;
        }
        return ns2.m23450d(i, z, false);
    }

    public u26(C3392c cVar) {
        this.f18363a = (C3392c) au4.m10792g(cVar);
    }
}
