package p000;

import java.io.File;

/* renamed from: sh5 */
/* compiled from: RootToolsInternalMethods */
public class sh5 {
    /* renamed from: a */
    public static boolean m51797a() {
        String[] strArr = {"/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/"};
        int i = 0;
        while (i < 8) {
            try {
                if (new File(strArr[i] + "su").exists()) {
                    return true;
                }
                i++;
            } catch (Throwable unused) {
            }
        }
        return false;
    }
}
