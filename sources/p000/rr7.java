package p000;

import android.os.Build;
import java.io.File;

/* renamed from: rr7 */
public final class rr7 {
    /* renamed from: a */
    public static qr7 m51232a() {
        switch (Build.VERSION.SDK_INT) {
            case 23:
                return new ds7((char[]) null);
            case 24:
                return new ds7((short[]) null);
            case 25:
                return new ds7((int[]) null);
            case 26:
                return new ds7((boolean[]) null);
            case 27:
                if (Build.VERSION.PREVIEW_SDK_INT == 0) {
                    return new ds7((float[]) null);
                }
                break;
        }
        return new ds7((byte[][]) null);
    }

    /* renamed from: b */
    public static String m51233b(File file) {
        if (file.getName().endsWith(".apk")) {
            String str = "";
            String replaceFirst = file.getName().replaceFirst("(_\\d+)?\\.apk", str);
            if (replaceFirst.equals("base-master")) {
                return str;
            }
            String str2 = "base-";
            if (replaceFirst.startsWith(str2)) {
                str = "config.";
            } else {
                replaceFirst = replaceFirst.replace("-", ".config.");
                str2 = ".config.master";
            }
            return replaceFirst.replace(str2, str);
        }
        throw new IllegalArgumentException("Non-apk found in splits directory.");
    }

    /* renamed from: c */
    public static void m51234c(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* renamed from: d */
    public static <T> void m51235d(T t, Object obj) {
        if (t == null) {
            throw new NullPointerException((String) obj);
        }
    }
}
