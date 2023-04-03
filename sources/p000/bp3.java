package p000;

import com.google.errorprone.annotations.CanIgnoreReturnValue;

@CanIgnoreReturnValue
/* renamed from: bp3 */
/* compiled from: MathPreconditions */
public final class bp3 {
    /* renamed from: a */
    public static void m32678a(boolean z, String str, int i, int i2) {
        if (!z) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 36);
            sb.append("overflow: ");
            sb.append(str);
            sb.append("(");
            sb.append(i);
            sb.append(", ");
            sb.append(i2);
            sb.append(")");
            throw new ArithmeticException(sb.toString());
        }
    }

    /* renamed from: b */
    public static int m32679b(String str, int i) {
        if (i > 0) {
            return i;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 26);
        sb.append(str);
        sb.append(" (");
        sb.append(i);
        sb.append(") must be > 0");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: c */
    public static void m32680c(boolean z) {
        if (!z) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
