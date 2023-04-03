package p000;

/* renamed from: lc2 */
/* compiled from: FrescoSystrace */
public class lc2 {

    /* renamed from: a */
    public static final C2754b f14473a = new C2755c();

    /* renamed from: b */
    public static volatile C2756d f14474b = null;

    /* renamed from: lc2$b */
    /* compiled from: FrescoSystrace */
    public interface C2754b {
    }

    /* renamed from: lc2$c */
    /* compiled from: FrescoSystrace */
    public static final class C2755c implements C2754b {
        public C2755c() {
        }
    }

    /* renamed from: lc2$d */
    /* compiled from: FrescoSystrace */
    public interface C2756d {
        /* renamed from: a */
        void mo20414a(String str);

        /* renamed from: b */
        boolean mo20415b();

        /* renamed from: c */
        void mo20416c();
    }

    /* renamed from: a */
    public static void m21366a(String str) {
        m21368c().mo20414a(str);
    }

    /* renamed from: b */
    public static void m21367b() {
        m21368c().mo20416c();
    }

    /* renamed from: c */
    public static C2756d m21368c() {
        if (f14474b == null) {
            synchronized (lc2.class) {
                if (f14474b == null) {
                    f14474b = new g81();
                }
            }
        }
        return f14474b;
    }

    /* renamed from: d */
    public static boolean m21369d() {
        return m21368c().mo20415b();
    }
}
