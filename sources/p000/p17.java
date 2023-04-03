package p000;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* renamed from: p17 */
/* compiled from: TypeSubstitution.kt */
public abstract class p17 {

    /* renamed from: a */
    public static final C9152b f43973a = new C9152b((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final p17 f43974b = new C9151a();

    /* renamed from: p17$a */
    /* compiled from: TypeSubstitution.kt */
    public static final class C9151a extends p17 {
        /* renamed from: e */
        public /* bridge */ /* synthetic */ f17 mo50024e(xc3 xc3) {
            return (f17) mo65210i(xc3);
        }

        /* renamed from: f */
        public boolean mo50031f() {
            return true;
        }

        /* renamed from: i */
        public Void mo65210i(xc3 xc3) {
            vx2.m53591g(xc3, "key");
            return null;
        }

        public String toString() {
            return "Empty TypeSubstitution";
        }
    }

    /* renamed from: p17$b */
    /* compiled from: TypeSubstitution.kt */
    public static final class C9152b {
        public C9152b() {
        }

        public /* synthetic */ C9152b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: p17$c */
    /* compiled from: TypeSubstitution.kt */
    public static final class C9153c extends p17 {

        /* renamed from: c */
        public final /* synthetic */ p17 f43975c;

        public C9153c(p17 p17) {
            this.f43975c = p17;
        }

        /* renamed from: a */
        public boolean mo50030a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo55063b() {
            return false;
        }

        /* renamed from: d */
        public C6983dm mo65207d(C6983dm dmVar) {
            vx2.m53591g(dmVar, "annotations");
            return this.f43975c.mo65207d(dmVar);
        }

        /* renamed from: e */
        public f17 mo50024e(xc3 xc3) {
            vx2.m53591g(xc3, "key");
            return this.f43975c.mo50024e(xc3);
        }

        /* renamed from: f */
        public boolean mo50031f() {
            return this.f43975c.mo50031f();
        }

        /* renamed from: g */
        public xc3 mo65208g(xc3 xc3, Variance variance) {
            vx2.m53591g(xc3, "topLevelType");
            vx2.m53591g(variance, "position");
            return this.f43975c.mo65208g(xc3, variance);
        }
    }

    /* renamed from: a */
    public boolean mo50030a() {
        return false;
    }

    /* renamed from: b */
    public boolean mo55063b() {
        return false;
    }

    /* renamed from: c */
    public final TypeSubstitutor mo65206c() {
        TypeSubstitutor g = TypeSubstitutor.m62902g(this);
        vx2.m53590f(g, "create(this)");
        return g;
    }

    /* renamed from: d */
    public C6983dm mo65207d(C6983dm dmVar) {
        vx2.m53591g(dmVar, "annotations");
        return dmVar;
    }

    /* renamed from: e */
    public abstract f17 mo50024e(xc3 xc3);

    /* renamed from: f */
    public boolean mo50031f() {
        return false;
    }

    /* renamed from: g */
    public xc3 mo65208g(xc3 xc3, Variance variance) {
        vx2.m53591g(xc3, "topLevelType");
        vx2.m53591g(variance, "position");
        return xc3;
    }

    /* renamed from: h */
    public final p17 mo65209h() {
        return new C9153c(this);
    }
}
