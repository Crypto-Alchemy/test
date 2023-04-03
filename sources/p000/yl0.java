package p000;

import java.lang.reflect.Type;
import java.math.BigInteger;
import java.nio.charset.Charset;
import okhttp3.HttpUrl;

/* renamed from: yl0 */
/* compiled from: Compat */
public final class yl0 {
    public static final int BYTES = 8;
    private static final BigInteger LONG_MAX = BigInteger.valueOf(Long.MAX_VALUE);
    private static final BigInteger LONG_MIN = BigInteger.valueOf(Long.MIN_VALUE);
    public static final Charset UTF_8 = Charset.forName("UTF-8");

    private yl0() {
    }

    public static boolean equals(Object obj, Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }

    private static String getClassName(Class cls) {
        if (cls.isArray()) {
            Class cls2 = cls;
            int i = 0;
            while (cls2.isArray()) {
                try {
                    i++;
                    cls2 = cls2.getComponentType();
                } catch (Throwable unused) {
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append(cls2.getName());
            for (int i2 = 0; i2 < i; i2++) {
                sb.append(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
            }
            return sb.toString();
        }
        return cls.getName();
    }

    public static String getTypeName(Type type) {
        if (type instanceof Class) {
            return getClassName((Class) type);
        }
        return type.toString();
    }

    public static int hashCode(boolean z) {
        return z ? 1231 : 1237;
    }

    public static String join(CharSequence charSequence, CharSequence... charSequenceArr) {
        if (charSequenceArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(charSequenceArr.length * 7);
        sb.append(charSequenceArr[0]);
        for (int i = 1; i < charSequenceArr.length; i++) {
            sb.append(charSequence);
            sb.append(charSequenceArr[i]);
        }
        return sb.toString();
    }

    public static long longValueExact(BigInteger bigInteger) {
        if (bigInteger.compareTo(LONG_MIN) >= 0 && bigInteger.compareTo(LONG_MAX) <= 0) {
            return bigInteger.longValue();
        }
        throw new ArithmeticException("BigInteger out of long range");
    }

    public static <T> T requireNonNull(T t) {
        t.getClass();
        return t;
    }
}
