package p000;

import java.util.concurrent.atomic.AtomicReference;
import p000.sx3;

/* renamed from: n04 */
/* compiled from: MutableMonitoringRegistry */
public final class n04 {

    /* renamed from: b */
    public static final n04 f31932b = new n04();

    /* renamed from: c */
    public static final C6272b f31933c = new C6272b();

    /* renamed from: a */
    public final AtomicReference<sx3> f31934a = new AtomicReference<>();

    /* renamed from: n04$b */
    /* compiled from: MutableMonitoringRegistry */
    public static class C6272b implements sx3 {
        public C6272b() {
        }

        /* renamed from: a */
        public sx3.C6506a mo45943a(tx3 tx3, String str, String str2) {
            return ux3.f34747a;
        }
    }

    /* renamed from: b */
    public static n04 m48577b() {
        return f31932b;
    }

    /* renamed from: a */
    public sx3 mo45942a() {
        sx3 sx3 = this.f31934a.get();
        if (sx3 == null) {
            return f31933c;
        }
        return sx3;
    }
}
