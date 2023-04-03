package p000;

import android.content.Context;
import android.os.Process;

/* renamed from: nj */
/* compiled from: AndroidSupportV4Compat */
public class C6285nj {
    /* renamed from: a */
    public static int m48809a(Context context, String str) {
        try {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: b */
    public static int m48810b(Context context, int i) {
        return context.getColor(i);
    }
}
