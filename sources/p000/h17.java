package p000;

import kotlin.reflect.jvm.internal.impl.types.Variance;

/* renamed from: h17 */
/* compiled from: TypeProjectionImpl */
public class h17 extends g17 {

    /* renamed from: a */
    public final Variance f38149a;

    /* renamed from: b */
    public final xc3 f38150b;

    public h17(Variance variance, xc3 xc3) {
        if (variance == null) {
            m58379d(0);
        }
        if (xc3 == null) {
            m58379d(1);
        }
        this.f38149a = variance;
        this.f38150b = xc3;
    }

    /* renamed from: d */
    public static /* synthetic */ void m58379d(int i) {
        String str = (i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 4 || i == 5) ? 2 : 3)];
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "type";
                break;
            case 4:
            case 5:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            case 6:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "projection";
                break;
        }
        if (i == 4) {
            objArr[1] = "getProjectionKind";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else {
            objArr[1] = "getType";
        }
        if (i == 3) {
            objArr[2] = "replaceType";
        } else if (!(i == 4 || i == 5)) {
            if (i != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "refine";
            }
        }
        String format = String.format(str, objArr);
        throw ((i == 4 || i == 5) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: a */
    public f17 mo51407a(bd3 bd3) {
        if (bd3 == null) {
            m58379d(6);
        }
        return new h17(this.f38149a, bd3.mo50562h(this.f38150b));
    }

    /* renamed from: b */
    public boolean mo51408b() {
        return false;
    }

    /* renamed from: c */
    public Variance mo51409c() {
        Variance variance = this.f38149a;
        if (variance == null) {
            m58379d(4);
        }
        return variance;
    }

    public xc3 getType() {
        xc3 xc3 = this.f38150b;
        if (xc3 == null) {
            m58379d(5);
        }
        return xc3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public h17(xc3 xc3) {
        this(Variance.INVARIANT, xc3);
        if (xc3 == null) {
            m58379d(2);
        }
    }
}
