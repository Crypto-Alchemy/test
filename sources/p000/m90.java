package p000;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: m90 */
/* compiled from: CallableId.kt */
public final class m90 {

    /* renamed from: e */
    public static final C7870a f40809e = new C7870a((DefaultConstructorMarker) null);
    @Deprecated

    /* renamed from: f */
    public static final r24 f40810f;
    @Deprecated

    /* renamed from: g */
    public static final u82 f40811g;

    /* renamed from: a */
    public final u82 f40812a;

    /* renamed from: b */
    public final u82 f40813b;

    /* renamed from: c */
    public final r24 f40814c;

    /* renamed from: d */
    public final u82 f40815d;

    /* renamed from: m90$a */
    /* compiled from: CallableId.kt */
    public static final class C7870a {
        public C7870a() {
        }

        public /* synthetic */ C7870a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        r24 r24 = n66.f41113l;
        f40810f = r24;
        u82 k = u82.m72648k(r24);
        vx2.m53590f(k, "topLevel(LOCAL_NAME)");
        f40811g = k;
    }

    public m90(u82 u82, u82 u822, r24 r24, u82 u823) {
        vx2.m53591g(u82, "packageName");
        vx2.m53591g(r24, "callableName");
        this.f40812a = u82;
        this.f40813b = u822;
        this.f40814c = r24;
        this.f40815d = u823;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m90)) {
            return false;
        }
        m90 m90 = (m90) obj;
        return vx2.m53586b(this.f40812a, m90.f40812a) && vx2.m53586b(this.f40813b, m90.f40813b) && vx2.m53586b(this.f40814c, m90.f40814c) && vx2.m53586b(this.f40815d, m90.f40815d);
    }

    public int hashCode() {
        int hashCode = this.f40812a.hashCode() * 31;
        u82 u82 = this.f40813b;
        int i = 0;
        int hashCode2 = (((hashCode + (u82 == null ? 0 : u82.hashCode())) * 31) + this.f40814c.hashCode()) * 31;
        u82 u822 = this.f40815d;
        if (u822 != null) {
            i = u822.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String b = this.f40812a.mo66195b();
        vx2.m53590f(b, "packageName.asString()");
        sb.append(yb6.m74331H(b, '.', '/', false, 4, (Object) null));
        sb.append("/");
        u82 u82 = this.f40813b;
        if (u82 != null) {
            sb.append(u82);
            sb.append(".");
        }
        sb.append(this.f40814c);
        String sb2 = sb.toString();
        vx2.m53590f(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m90(u82 u82, u82 u822, r24 r24, u82 u823, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(u82, u822, r24, (i & 8) != 0 ? null : u823);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public m90(u82 u82, r24 r24) {
        this(u82, (u82) null, r24, (u82) null, 8, (DefaultConstructorMarker) null);
        vx2.m53591g(u82, "packageName");
        vx2.m53591g(r24, "callableName");
    }
}
