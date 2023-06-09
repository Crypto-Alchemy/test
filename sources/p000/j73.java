package p000;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: j73 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class j73 {

    /* renamed from: a */
    public static final Pattern f30234a = Pattern.compile("\\\\.");

    /* renamed from: b */
    public static final Pattern f30235b = Pattern.compile("[\\\\\"/\b\f\n\r\t]");

    /* renamed from: a */
    public static String m46161a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Matcher matcher = f30235b.matcher(str);
        StringBuffer stringBuffer = null;
        while (matcher.find()) {
            if (stringBuffer == null) {
                stringBuffer = new StringBuffer();
            }
            char charAt = matcher.group().charAt(0);
            if (charAt == 12) {
                matcher.appendReplacement(stringBuffer, "\\\\f");
            } else if (charAt == 13) {
                matcher.appendReplacement(stringBuffer, "\\\\r");
            } else if (charAt == '\"') {
                matcher.appendReplacement(stringBuffer, "\\\\\\\"");
            } else if (charAt == '/') {
                matcher.appendReplacement(stringBuffer, "\\\\/");
            } else if (charAt != '\\') {
                switch (charAt) {
                    case 8:
                        matcher.appendReplacement(stringBuffer, "\\\\b");
                        break;
                    case 9:
                        matcher.appendReplacement(stringBuffer, "\\\\t");
                        break;
                    case 10:
                        matcher.appendReplacement(stringBuffer, "\\\\n");
                        break;
                }
            } else {
                matcher.appendReplacement(stringBuffer, "\\\\\\\\");
            }
        }
        if (stringBuffer == null) {
            return str;
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }
}
