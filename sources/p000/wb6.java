package p000;

import java.math.BigInteger;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0010\u000e\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u000e\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u0000H\u0007\u001a\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u0007*\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0007¨\u0006\f"}, mo44877d2 = {"", "", "m", "(Ljava/lang/String;)Ljava/lang/Float;", "", "l", "(Ljava/lang/String;)Ljava/lang/Double;", "Ljava/math/BigInteger;", "j", "", "radix", "k", "kotlin-stdlib"}, mo44878k = 5, mo44879mv = {1, 7, 1}, mo44882xs = "kotlin/text/StringsKt")
/* renamed from: wb6 */
/* compiled from: StringNumberConversionsJVM.kt */
public class wb6 extends vb6 {
    /* renamed from: j */
    public static final BigInteger m73528j(String str) {
        vx2.m53591g(str, "<this>");
        return m73529k(str, 10);
    }

    /* renamed from: k */
    public static final BigInteger m73529k(String str, int i) {
        vx2.m53591g(str, "<this>");
        wd0.m73569a(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        if (length != 1) {
            if (str.charAt(0) == '-') {
                i2 = 1;
            }
            while (i2 < length) {
                if (wd0.m73570b(str.charAt(i2), i) < 0) {
                    return null;
                }
                i2++;
            }
        } else if (wd0.m73570b(str.charAt(0), i) < 0) {
            return null;
        }
        return new BigInteger(str, wd0.m73569a(i));
    }

    /* renamed from: l */
    public static final Double m73530l(String str) {
        vx2.m53591g(str, "<this>");
        try {
            if (pn5.f44073b.matches(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: m */
    public static final Float m73531m(String str) {
        vx2.m53591g(str, "<this>");
        try {
            if (pn5.f44073b.matches(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
