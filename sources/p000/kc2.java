package p000;

/* renamed from: kc2 */
/* compiled from: FrescoInstrumenter */
public final class kc2 {

    /* renamed from: a */
    public static volatile C2660a f14036a;

    /* renamed from: kc2$a */
    /* compiled from: FrescoInstrumenter */
    public interface C2660a {
        /* renamed from: a */
        Runnable mo22249a(Runnable runnable, String str);

        /* renamed from: b */
        boolean mo22250b();

        /* renamed from: c */
        void mo22251c(Object obj, Throwable th);

        /* renamed from: d */
        Object mo22252d(String str);

        /* renamed from: e */
        Object mo22253e(Object obj, String str);

        /* renamed from: f */
        void mo22254f(Object obj);
    }

    /* renamed from: a */
    public static Runnable m20626a(Runnable runnable, String str) {
        C2660a aVar = f14036a;
        if (aVar == null || runnable == null) {
            return runnable;
        }
        if (str == null) {
            str = "";
        }
        return aVar.mo22249a(runnable, str);
    }

    /* renamed from: b */
    public static boolean m20627b() {
        C2660a aVar = f14036a;
        if (aVar == null) {
            return false;
        }
        return aVar.mo22250b();
    }

    /* renamed from: c */
    public static void m20628c(Object obj, Throwable th) {
        C2660a aVar = f14036a;
        if (aVar != null && obj != null) {
            aVar.mo22251c(obj, th);
        }
    }

    /* renamed from: d */
    public static Object m20629d(String str) {
        C2660a aVar = f14036a;
        if (aVar == null || str == null) {
            return null;
        }
        return aVar.mo22252d(str);
    }

    /* renamed from: e */
    public static Object m20630e(Object obj, String str) {
        C2660a aVar = f14036a;
        if (aVar == null || obj == null) {
            return null;
        }
        return aVar.mo22253e(obj, str);
    }

    /* renamed from: f */
    public static void m20631f(Object obj) {
        C2660a aVar = f14036a;
        if (aVar != null && obj != null) {
            aVar.mo22254f(obj);
        }
    }
}
