package p000;

import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition;

/* renamed from: p07 */
/* compiled from: typeEnhancement.kt */
public final class p07 {

    /* renamed from: a */
    public static final nq1 f43968a;

    /* renamed from: b */
    public static final nq1 f43969b;

    /* renamed from: p07$a */
    /* compiled from: typeEnhancement.kt */
    public /* synthetic */ class C9149a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f43970a;

        static {
            int[] iArr = new int[NullabilityQualifier.values().length];
            iArr[NullabilityQualifier.NULLABLE.ordinal()] = 1;
            iArr[NullabilityQualifier.NOT_NULL.ordinal()] = 2;
            f43970a = iArr;
        }
    }

    static {
        u82 u82 = t73.f44673u;
        vx2.m53590f(u82, "ENHANCED_NULLABILITY_ANNOTATION");
        f43968a = new nq1(u82);
        u82 u822 = t73.f44674v;
        vx2.m53590f(u822, "ENHANCED_MUTABILITY_ANNOTATION");
        f43969b = new nq1(u822);
    }

    /* renamed from: f */
    public static final C6983dm m70835f(List<? extends C6983dm> list) {
        int size = list.size();
        if (size == 0) {
            throw new IllegalStateException("At least one Annotations object expected".toString());
        } else if (size != 1) {
            return new CompositeAnnotations((List<? extends C6983dm>) CollectionsKt___CollectionsKt.m47311K0(list));
        } else {
            return (C6983dm) CollectionsKt___CollectionsKt.m47355z0(list);
        }
    }

    /* renamed from: g */
    public static final eg0 m70836g(eg0 eg0, j23 j23, TypeComponentPosition typeComponentPosition) {
        d23 d23 = d23.f37229a;
        if (!xz6.m74181a(typeComponentPosition) || !(eg0 instanceof if0)) {
            return null;
        }
        if (j23.mo52601c() == MutabilityQualifier.READ_ONLY && typeComponentPosition == TypeComponentPosition.FLEXIBLE_LOWER) {
            if0 if0 = (if0) eg0;
            if (d23.mo51030c(if0)) {
                return d23.mo51028a(if0);
            }
        }
        if (j23.mo52601c() != MutabilityQualifier.MUTABLE || typeComponentPosition != TypeComponentPosition.FLEXIBLE_UPPER) {
            return null;
        }
        if0 if02 = (if0) eg0;
        if (d23.mo51031d(if02)) {
            return d23.mo51029b(if02);
        }
        return null;
    }

    /* renamed from: h */
    public static final Boolean m70837h(j23 j23, TypeComponentPosition typeComponentPosition) {
        int i;
        if (!xz6.m74181a(typeComponentPosition)) {
            return null;
        }
        NullabilityQualifier d = j23.mo52602d();
        if (d == null) {
            i = -1;
        } else {
            i = C9149a.f43970a[d.ordinal()];
        }
        if (i == 1) {
            return Boolean.TRUE;
        }
        if (i != 2) {
            return null;
        }
        return Boolean.FALSE;
    }

    /* renamed from: i */
    public static final boolean m70838i(xc3 xc3) {
        vx2.m53591g(xc3, "<this>");
        return q07.m71154c(d26.f37237a, xc3);
    }
}
