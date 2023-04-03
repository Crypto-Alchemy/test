package p000;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.jd1;

/* renamed from: oi5 */
/* compiled from: RuntimeModuleData.kt */
public final class oi5 {

    /* renamed from: c */
    public static final C9027a f43711c = new C9027a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final id1 f43712a;

    /* renamed from: b */
    public final ok4 f43713b;

    /* renamed from: oi5$a */
    /* compiled from: RuntimeModuleData.kt */
    public static final class C9027a {
        public C9027a() {
        }

        public /* synthetic */ C9027a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final oi5 mo62930a(ClassLoader classLoader) {
            vx2.m53591g(classLoader, "classLoader");
            qa5 qa5 = new qa5(classLoader);
            jd1.C7260a aVar = jd1.f38644b;
            ClassLoader classLoader2 = r37.class.getClassLoader();
            vx2.m53590f(classLoader2, "Unit::class.java.classLoader");
            qa5 qa52 = new qa5(classLoader2);
            v95 v95 = new v95(classLoader);
            jd1.C7260a.C7261a a = aVar.mo52665a(qa5, qa52, v95, "runtime module for " + classLoader, ni5.f43483b, ri5.f44375a);
            return new oi5(a.mo52666a().mo52664a(), new ok4(a.mo52667b(), qa5), (DefaultConstructorMarker) null);
        }
    }

    public oi5(id1 id1, ok4 ok4) {
        this.f43712a = id1;
        this.f43713b = ok4;
    }

    public /* synthetic */ oi5(id1 id1, ok4 ok4, DefaultConstructorMarker defaultConstructorMarker) {
        this(id1, ok4);
    }

    /* renamed from: a */
    public final id1 mo62927a() {
        return this.f43712a;
    }

    /* renamed from: b */
    public final mx3 mo62928b() {
        return this.f43712a.mo52449p();
    }

    /* renamed from: c */
    public final ok4 mo62929c() {
        return this.f43713b;
    }
}
