package kotlin.reflect.jvm.internal.impl.types;

import kotlin.C6169a;
import kotlin.LazyThreadSafetyMode;

/* compiled from: StarProjectionImpl.kt */
public final class StarProjectionImpl extends g17 {

    /* renamed from: a */
    public final a17 f40270a;

    /* renamed from: b */
    public final ef3 f40271b = C6169a.m47233b(LazyThreadSafetyMode.PUBLICATION, new StarProjectionImpl$_type$2(this));

    public StarProjectionImpl(a17 a17) {
        vx2.m53591g(a17, "typeParameter");
        this.f40270a = a17;
    }

    /* renamed from: a */
    public f17 mo51407a(bd3 bd3) {
        vx2.m53591g(bd3, "kotlinTypeRefiner");
        return this;
    }

    /* renamed from: b */
    public boolean mo51408b() {
        return true;
    }

    /* renamed from: c */
    public Variance mo51409c() {
        return Variance.OUT_VARIANCE;
    }

    /* renamed from: e */
    public final xc3 mo55318e() {
        return (xc3) this.f40271b.getValue();
    }

    public xc3 getType() {
        return mo55318e();
    }
}
