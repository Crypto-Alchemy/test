package p000;

import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;

/* renamed from: t17 */
/* compiled from: TypeSystemContext.kt */
public final class t17 {

    /* renamed from: t17$a */
    /* compiled from: TypeSystemContext.kt */
    public /* synthetic */ class C9323a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f44635a;

        static {
            int[] iArr = new int[Variance.values().length];
            iArr[Variance.INVARIANT.ordinal()] = 1;
            iArr[Variance.IN_VARIANCE.ordinal()] = 2;
            iArr[Variance.OUT_VARIANCE.ordinal()] = 3;
            f44635a = iArr;
        }
    }

    /* renamed from: a */
    public static final TypeVariance m72145a(Variance variance) {
        vx2.m53591g(variance, "<this>");
        int i = C9323a.f44635a[variance.ordinal()];
        if (i == 1) {
            return TypeVariance.INV;
        }
        if (i == 2) {
            return TypeVariance.IN;
        }
        if (i == 3) {
            return TypeVariance.OUT;
        }
        throw new NoWhenBranchMatchedException();
    }
}
