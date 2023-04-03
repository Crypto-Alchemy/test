package p000;

import com.fasterxml.jackson.core.Base64Variant;
import org.slf4j.Marker;

/* renamed from: vx */
/* compiled from: Base64Variants */
public final class C3514vx {

    /* renamed from: a */
    public static final Base64Variant f18917a;

    /* renamed from: b */
    public static final Base64Variant f18918b;

    /* renamed from: c */
    public static final Base64Variant f18919c;

    /* renamed from: d */
    public static final Base64Variant f18920d;

    static {
        Base64Variant base64Variant = new Base64Variant("MIME", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", true, '=', 76);
        f18917a = base64Variant;
        f18918b = new Base64Variant(base64Variant, "MIME-NO-LINEFEEDS", Integer.MAX_VALUE);
        f18919c = new Base64Variant(base64Variant, "PEM", true, '=', 64);
        StringBuilder sb = new StringBuilder("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        sb.setCharAt(sb.indexOf(Marker.ANY_NON_NULL_MARKER), '-');
        sb.setCharAt(sb.indexOf("/"), '_');
        f18920d = new Base64Variant("MODIFIED-FOR-URL", sb.toString(), false, 0, Integer.MAX_VALUE);
    }

    /* renamed from: a */
    public static Base64Variant m29159a() {
        return f18918b;
    }

    /* renamed from: b */
    public static Base64Variant m29160b(String str) throws IllegalArgumentException {
        String str2;
        Base64Variant base64Variant = f18917a;
        if (base64Variant._name.equals(str)) {
            return base64Variant;
        }
        Base64Variant base64Variant2 = f18918b;
        if (base64Variant2._name.equals(str)) {
            return base64Variant2;
        }
        Base64Variant base64Variant3 = f18919c;
        if (base64Variant3._name.equals(str)) {
            return base64Variant3;
        }
        Base64Variant base64Variant4 = f18920d;
        if (base64Variant4._name.equals(str)) {
            return base64Variant4;
        }
        if (str == null) {
            str2 = "<null>";
        } else {
            str2 = "'" + str + "'";
        }
        throw new IllegalArgumentException("No Base64Variant with name " + str2);
    }
}
