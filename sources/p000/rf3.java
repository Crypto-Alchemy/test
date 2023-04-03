package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* renamed from: rf3 */
/* compiled from: LazyJavaTypeParameterDescriptor.kt */
public final class rf3 extends C7162h6 {

    /* renamed from: B */
    public final pf3 f44362B;

    /* renamed from: C */
    public final h23 f44363C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rf3(pf3 pf3, h23 h23, int i, d31 d31) {
        super(pf3.mo65300e(), d31, new LazyJavaAnnotations(pf3, h23, false, 4, (DefaultConstructorMarker) null), h23.getName(), Variance.INVARIANT, false, i, a66.f36360a, pf3.mo65296a().mo67019v());
        vx2.m53591g(pf3, "c");
        vx2.m53591g(h23, "javaTypeParameter");
        vx2.m53591g(d31, "containingDeclaration");
        this.f44362B = pf3;
        this.f44363C = h23;
    }

    /* renamed from: A0 */
    public List<xc3> mo52628A0(List<? extends xc3> list) {
        vx2.m53591g(list, "bounds");
        return this.f44362B.mo65296a().mo67015r().mo53749i(this, list, this.f44362B);
    }

    /* renamed from: E0 */
    public void mo50450E0(xc3 xc3) {
        vx2.m53591g(xc3, "type");
    }

    /* renamed from: F0 */
    public List<xc3> mo50451F0() {
        return mo65646G0();
    }

    /* renamed from: G0 */
    public final List<xc3> mo65646G0() {
        Collection<x03> upperBounds = this.f44363C.getUpperBounds();
        if (upperBounds.isEmpty()) {
            d36 i = this.f44362B.mo65299d().mo51535k().mo53169i();
            vx2.m53590f(i, "c.module.builtIns.anyType");
            d36 I = this.f44362B.mo65299d().mo51535k().mo53151I();
            vx2.m53590f(I, "c.module.builtIns.nullableAnyType");
            return bk0.m32598e(KotlinTypeFactory.m62849d(i, I));
        }
        ArrayList arrayList = new ArrayList(dk0.m43495u(upperBounds, 10));
        for (x03 o : upperBounds) {
            arrayList.add(this.f44362B.mo65302g().mo53660o(o, l23.m63664d(TypeUsage.COMMON, false, this, 1, (Object) null)));
        }
        return arrayList;
    }
}
