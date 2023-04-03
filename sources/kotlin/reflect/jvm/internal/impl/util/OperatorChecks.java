package kotlin.reflect.jvm.internal.impl.util;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.C7425c;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.util.ReturnsCheck;
import p000.m87;
import p000.ps3;

/* compiled from: modifierChecks.kt */
public final class OperatorChecks extends C7928n6 {

    /* renamed from: a */
    public static final OperatorChecks f40312a = new OperatorChecks();

    /* renamed from: b */
    public static final List<Checks> f40313b;

    static {
        r24 r24 = oi4.f43695k;
        ps3.C9194b bVar = ps3.C9194b.f44109b;
        de0[] de0Arr = {bVar, new m87.C7866a(1)};
        r24 r242 = oi4.f43696l;
        de0[] de0Arr2 = {bVar, new m87.C7866a(2)};
        r24 r243 = oi4.f43686b;
        m74 m74 = m74.f40801a;
        oy2 oy2 = oy2.f43961a;
        r24 r244 = oi4.f43692h;
        m87.C7869d dVar = m87.C7869d.f40808b;
        ReturnsCheck.ReturnsBoolean returnsBoolean = ReturnsCheck.ReturnsBoolean.f40317d;
        r24 r245 = oi4.f43694j;
        m87.C7868c cVar = m87.C7868c.f40807b;
        f40313b = ck0.m33065m(new Checks(r24, de0Arr, (rc2) null, 4, (DefaultConstructorMarker) null), new Checks(r242, de0Arr2, (rc2<? super C7425c, String>) OperatorChecks$checks$1.INSTANCE), new Checks(r243, new de0[]{bVar, m74, new m87.C7866a(2), oy2}, (rc2) null, 4, (DefaultConstructorMarker) null), new Checks(oi4.f43687c, new de0[]{bVar, m74, new m87.C7866a(3), oy2}, (rc2) null, 4, (DefaultConstructorMarker) null), new Checks(oi4.f43688d, new de0[]{bVar, m74, new m87.C7867b(2), oy2}, (rc2) null, 4, (DefaultConstructorMarker) null), new Checks(oi4.f43693i, new de0[]{bVar}, (rc2) null, 4, (DefaultConstructorMarker) null), new Checks(r244, new de0[]{bVar, dVar, m74, returnsBoolean}, (rc2) null, 4, (DefaultConstructorMarker) null), new Checks(r245, new de0[]{bVar, cVar}, (rc2) null, 4, (DefaultConstructorMarker) null), new Checks(oi4.f43697m, new de0[]{bVar, cVar}, (rc2) null, 4, (DefaultConstructorMarker) null), new Checks(oi4.f43698n, new de0[]{bVar, cVar, returnsBoolean}, (rc2) null, 4, (DefaultConstructorMarker) null), new Checks(oi4.f43673I, new de0[]{bVar, dVar, m74}, (rc2) null, 4, (DefaultConstructorMarker) null), new Checks(oi4.f43689e, new de0[]{ps3.C9193a.f44108b}, (rc2<? super C7425c, String>) OperatorChecks$checks$2.INSTANCE), new Checks(oi4.f43691g, new de0[]{bVar, ReturnsCheck.ReturnsInt.f40318d, dVar, m74}, (rc2) null, 4, (DefaultConstructorMarker) null), new Checks((Collection) oi4.f43682R, new de0[]{bVar, dVar, m74}, (rc2) null, 4, (DefaultConstructorMarker) null), new Checks((Collection) oi4.f43681Q, new de0[]{bVar, cVar}, (rc2) null, 4, (DefaultConstructorMarker) null), new Checks((Collection<r24>) ck0.m33065m(oi4.f43708x, oi4.f43709y), new de0[]{bVar}, (rc2<? super C7425c, String>) OperatorChecks$checks$3.INSTANCE), new Checks((Collection) oi4.f43683S, new de0[]{bVar, ReturnsCheck.ReturnsUnit.f40319d, dVar, m74}, (rc2) null, 4, (DefaultConstructorMarker) null), new Checks(oi4.f43700p, new de0[]{bVar, cVar}, (rc2) null, 4, (DefaultConstructorMarker) null));
    }

    /* renamed from: b */
    public List<Checks> mo55390b() {
        return f40313b;
    }

    /* renamed from: d */
    public final boolean mo55391d(C7425c cVar, h85 h85) {
        nf0 g;
        xc3 returnType;
        j85 value = h85.getValue();
        vx2.m53590f(value, "receiver.value");
        if (!(value instanceof ps2)) {
            return false;
        }
        if0 r = ((ps2) value).mo50936r();
        if (!r.mo51319d0() || (g = DescriptorUtilsKt.m62446g(r)) == null) {
            return false;
        }
        eg0 b = FindClassInModuleKt.m60279b(DescriptorUtilsKt.m62451l(r), g);
        if (!(b instanceof hz6)) {
            b = null;
        }
        hz6 hz6 = (hz6) b;
        if (hz6 == null || (returnType = cVar.getReturnType()) == null) {
            return false;
        }
        return TypeUtilsKt.m62959o(returnType, hz6.mo52331C());
    }
}
