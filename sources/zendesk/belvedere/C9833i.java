package zendesk.belvedere;

/* renamed from: zendesk.belvedere.i */
/* compiled from: L */
public class C9833i {

    /* renamed from: a */
    public static C9835b f46761a = new C9834a();

    /* renamed from: zendesk.belvedere.i$a */
    /* compiled from: L */
    public static class C9834a implements C9835b {

        /* renamed from: a */
        public boolean f46762a = false;

        /* renamed from: a */
        public void mo73800a(String str, String str2) {
        }

        /* renamed from: b */
        public void mo73801b(String str, String str2) {
        }

        /* renamed from: c */
        public void mo73802c(String str, String str2) {
        }

        /* renamed from: d */
        public void mo73803d(String str, String str2, Throwable th) {
        }

        /* renamed from: e */
        public void mo73804e(boolean z) {
            this.f46762a = z;
        }
    }

    /* renamed from: zendesk.belvedere.i$b */
    /* compiled from: L */
    public interface C9835b {
        /* renamed from: a */
        void mo73800a(String str, String str2);

        /* renamed from: b */
        void mo73801b(String str, String str2);

        /* renamed from: c */
        void mo73802c(String str, String str2);

        /* renamed from: d */
        void mo73803d(String str, String str2, Throwable th);

        /* renamed from: e */
        void mo73804e(boolean z);
    }

    /* renamed from: a */
    public static void m75551a(String str, String str2) {
        f46761a.mo73802c(str, str2);
    }

    /* renamed from: b */
    public static void m75552b(String str, String str2) {
        f46761a.mo73801b(str, str2);
    }

    /* renamed from: c */
    public static void m75553c(String str, String str2, Throwable th) {
        f46761a.mo73803d(str, str2, th);
    }

    /* renamed from: d */
    public static void m75554d(C9835b bVar) {
        f46761a = bVar;
    }

    /* renamed from: e */
    public static void m75555e(String str, String str2) {
        f46761a.mo73800a(str, str2);
    }
}
