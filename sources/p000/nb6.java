package p000;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: nb6 */
/* compiled from: Strings */
public final class nb6 {
    /* renamed from: a */
    public static String m48720a(String str, Object... objArr) {
        int indexOf;
        String valueOf = String.valueOf(str);
        int i = 0;
        if (objArr == null) {
            objArr = new Object[]{"(Object[])null"};
        } else {
            for (int i2 = 0; i2 < objArr.length; i2++) {
                objArr[i2] = m48721b(objArr[i2]);
            }
        }
        StringBuilder sb = new StringBuilder(valueOf.length() + (objArr.length * 16));
        int i3 = 0;
        while (i < objArr.length && (indexOf = valueOf.indexOf("%s", i3)) != -1) {
            sb.append(valueOf, i3, indexOf);
            sb.append(objArr[i]);
            i3 = indexOf + 2;
            i++;
        }
        sb.append(valueOf, i3, valueOf.length());
        if (i < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static String m48721b(Object obj) {
        String str;
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            StringBuilder sb = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
            sb.append(name);
            sb.append('@');
            sb.append(hexString);
            String sb2 = sb.toString();
            Logger logger = Logger.getLogger("com.google.common.base.Strings");
            Level level = Level.WARNING;
            String valueOf = String.valueOf(sb2);
            if (valueOf.length() != 0) {
                str = "Exception during lenientFormat for ".concat(valueOf);
            } else {
                str = new String("Exception during lenientFormat for ");
            }
            logger.log(level, str, e);
            String name2 = e.getClass().getName();
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 9 + name2.length());
            sb3.append("<");
            sb3.append(sb2);
            sb3.append(" threw ");
            sb3.append(name2);
            sb3.append(">");
            return sb3.toString();
        }
    }
}
