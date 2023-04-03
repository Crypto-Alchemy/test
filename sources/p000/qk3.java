package p000;

/* renamed from: qk3 */
/* compiled from: Logger */
public abstract class qk3 {

    /* renamed from: a */
    public static qk3 f16964a = null;

    /* renamed from: b */
    public static final int f16965b = 20;

    /* renamed from: qk3$a */
    /* compiled from: Logger */
    public static class C3151a extends qk3 {

        /* renamed from: c */
        public int f16966c;

        public C3151a(int i) {
            super(i);
            this.f16966c = i;
        }

        /* renamed from: a */
        public void mo25135a(String str, String str2, Throwable... thArr) {
            if (this.f16966c <= 3 && thArr != null && thArr.length >= 1) {
                Throwable th = thArr[0];
            }
        }

        /* renamed from: b */
        public void mo25136b(String str, String str2, Throwable... thArr) {
            if (this.f16966c <= 6 && thArr != null && thArr.length >= 1) {
                Throwable th = thArr[0];
            }
        }

        /* renamed from: d */
        public void mo25137d(String str, String str2, Throwable... thArr) {
            if (this.f16966c <= 4 && thArr != null && thArr.length >= 1) {
                Throwable th = thArr[0];
            }
        }

        /* renamed from: g */
        public void mo25138g(String str, String str2, Throwable... thArr) {
            if (this.f16966c <= 2 && thArr != null && thArr.length >= 1) {
                Throwable th = thArr[0];
            }
        }

        /* renamed from: h */
        public void mo25139h(String str, String str2, Throwable... thArr) {
            if (this.f16966c <= 5 && thArr != null && thArr.length >= 1) {
                Throwable th = thArr[0];
            }
        }
    }

    public qk3(int i) {
    }

    /* renamed from: c */
    public static synchronized qk3 m25726c() {
        qk3 qk3;
        synchronized (qk3.class) {
            if (f16964a == null) {
                f16964a = new C3151a(3);
            }
            qk3 = f16964a;
        }
        return qk3;
    }

    /* renamed from: e */
    public static synchronized void m25727e(qk3 qk3) {
        synchronized (qk3.class) {
            f16964a = qk3;
        }
    }

    /* renamed from: f */
    public static String m25728f(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        int i = f16965b;
        if (length >= i) {
            sb.append(str.substring(0, i));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public abstract void mo25135a(String str, String str2, Throwable... thArr);

    /* renamed from: b */
    public abstract void mo25136b(String str, String str2, Throwable... thArr);

    /* renamed from: d */
    public abstract void mo25137d(String str, String str2, Throwable... thArr);

    /* renamed from: g */
    public abstract void mo25138g(String str, String str2, Throwable... thArr);

    /* renamed from: h */
    public abstract void mo25139h(String str, String str2, Throwable... thArr);
}
