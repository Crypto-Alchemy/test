package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: SpecialTypes.kt */
public final class LazyWrappedType extends on7 {

    /* renamed from: d */
    public final da6 f40267d;

    /* renamed from: e */
    public final pc2<xc3> f40268e;

    /* renamed from: g */
    public final q84<xc3> f40269g;

    public LazyWrappedType(da6 da6, pc2<? extends xc3> pc2) {
        vx2.m53591g(da6, "storageManager");
        vx2.m53591g(pc2, "computation");
        this.f40267d = da6;
        this.f40268e = pc2;
        this.f40269g = da6.mo51164i(pc2);
    }

    /* renamed from: L0 */
    public xc3 mo55315L0() {
        return (xc3) this.f40269g.invoke();
    }

    /* renamed from: M0 */
    public boolean mo55316M0() {
        return this.f40269g.mo65425r();
    }

    /* renamed from: O0 */
    public LazyWrappedType mo51136J0(bd3 bd3) {
        vx2.m53591g(bd3, "kotlinTypeRefiner");
        return new LazyWrappedType(this.f40267d, new LazyWrappedType$refine$1(bd3, this));
    }
}
