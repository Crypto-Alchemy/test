package p000;

import java.util.Map;

/* renamed from: hf7 */
/* compiled from: Visibilities.kt */
public final class hf7 {

    /* renamed from: a */
    public static final hf7 f38205a = new hf7();

    /* renamed from: b */
    public static final Map<if7, Integer> f38206b;

    /* renamed from: c */
    public static final C7180h f38207c;

    /* renamed from: hf7$a */
    /* compiled from: Visibilities.kt */
    public static final class C7173a extends if7 {

        /* renamed from: c */
        public static final C7173a f38208c = new C7173a();

        public C7173a() {
            super("inherited", false);
        }
    }

    /* renamed from: hf7$b */
    /* compiled from: Visibilities.kt */
    public static final class C7174b extends if7 {

        /* renamed from: c */
        public static final C7174b f38209c = new C7174b();

        public C7174b() {
            super("internal", false);
        }
    }

    /* renamed from: hf7$c */
    /* compiled from: Visibilities.kt */
    public static final class C7175c extends if7 {

        /* renamed from: c */
        public static final C7175c f38210c = new C7175c();

        public C7175c() {
            super("invisible_fake", false);
        }
    }

    /* renamed from: hf7$d */
    /* compiled from: Visibilities.kt */
    public static final class C7176d extends if7 {

        /* renamed from: c */
        public static final C7176d f38211c = new C7176d();

        public C7176d() {
            super("local", false);
        }
    }

    /* renamed from: hf7$e */
    /* compiled from: Visibilities.kt */
    public static final class C7177e extends if7 {

        /* renamed from: c */
        public static final C7177e f38212c = new C7177e();

        public C7177e() {
            super("private", false);
        }
    }

    /* renamed from: hf7$f */
    /* compiled from: Visibilities.kt */
    public static final class C7178f extends if7 {

        /* renamed from: c */
        public static final C7178f f38213c = new C7178f();

        public C7178f() {
            super("private_to_this", false);
        }

        /* renamed from: b */
        public String mo52198b() {
            return "private/*private to this*/";
        }
    }

    /* renamed from: hf7$g */
    /* compiled from: Visibilities.kt */
    public static final class C7179g extends if7 {

        /* renamed from: c */
        public static final C7179g f38214c = new C7179g();

        public C7179g() {
            super("protected", true);
        }
    }

    /* renamed from: hf7$h */
    /* compiled from: Visibilities.kt */
    public static final class C7180h extends if7 {

        /* renamed from: c */
        public static final C7180h f38215c = new C7180h();

        public C7180h() {
            super("public", true);
        }
    }

    /* renamed from: hf7$i */
    /* compiled from: Visibilities.kt */
    public static final class C7181i extends if7 {

        /* renamed from: c */
        public static final C7181i f38216c = new C7181i();

        public C7181i() {
            super("unknown", false);
        }
    }

    static {
        Map c = ao3.m31891c();
        c.put(C7178f.f38213c, 0);
        c.put(C7177e.f38212c, 0);
        c.put(C7174b.f38209c, 1);
        c.put(C7179g.f38214c, 1);
        C7180h hVar = C7180h.f38215c;
        c.put(hVar, 2);
        f38206b = ao3.m31890b(c);
        f38207c = hVar;
    }

    /* renamed from: a */
    public final Integer mo52196a(if7 if7, if7 if72) {
        vx2.m53591g(if7, "first");
        vx2.m53591g(if72, "second");
        if (if7 == if72) {
            return 0;
        }
        Map<if7, Integer> map = f38206b;
        Integer num = map.get(if7);
        Integer num2 = map.get(if72);
        if (num == null || num2 == null || vx2.m53586b(num, num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    /* renamed from: b */
    public final boolean mo52197b(if7 if7) {
        vx2.m53591g(if7, "visibility");
        if (if7 == C7177e.f38212c || if7 == C7178f.f38213c) {
            return true;
        }
        return false;
    }
}
