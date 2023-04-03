package p000;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* renamed from: sg1 */
/* compiled from: DisjointKeysUnionTypeSubstitution.kt */
public final class sg1 extends p17 {

    /* renamed from: e */
    public static final C9309a f44557e = new C9309a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public final p17 f44558c;

    /* renamed from: d */
    public final p17 f44559d;

    /* renamed from: sg1$a */
    /* compiled from: DisjointKeysUnionTypeSubstitution.kt */
    public static final class C9309a {
        public C9309a() {
        }

        public /* synthetic */ C9309a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final p17 mo65849a(p17 p17, p17 p172) {
            vx2.m53591g(p17, "first");
            vx2.m53591g(p172, "second");
            if (p17.mo50031f()) {
                return p172;
            }
            if (p172.mo50031f()) {
                return p17;
            }
            return new sg1(p17, p172, (DefaultConstructorMarker) null);
        }
    }

    public sg1(p17 p17, p17 p172) {
        this.f44558c = p17;
        this.f44559d = p172;
    }

    public /* synthetic */ sg1(p17 p17, p17 p172, DefaultConstructorMarker defaultConstructorMarker) {
        this(p17, p172);
    }

    /* renamed from: i */
    public static final p17 m71918i(p17 p17, p17 p172) {
        return f44557e.mo65849a(p17, p172);
    }

    /* renamed from: a */
    public boolean mo50030a() {
        if (this.f44558c.mo50030a() || this.f44559d.mo50030a()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo55063b() {
        if (this.f44558c.mo55063b() || this.f44559d.mo55063b()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public C6983dm mo65207d(C6983dm dmVar) {
        vx2.m53591g(dmVar, "annotations");
        return this.f44559d.mo65207d(this.f44558c.mo65207d(dmVar));
    }

    /* renamed from: e */
    public f17 mo50024e(xc3 xc3) {
        vx2.m53591g(xc3, "key");
        f17 e = this.f44558c.mo50024e(xc3);
        if (e == null) {
            return this.f44559d.mo50024e(xc3);
        }
        return e;
    }

    /* renamed from: f */
    public boolean mo50031f() {
        return false;
    }

    /* renamed from: g */
    public xc3 mo65208g(xc3 xc3, Variance variance) {
        vx2.m53591g(xc3, "topLevelType");
        vx2.m53591g(variance, "position");
        return this.f44559d.mo65208g(this.f44558c.mo65208g(xc3, variance), variance);
    }
}
