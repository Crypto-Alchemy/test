package p000;

import android.os.Build;

/* renamed from: ap4 */
/* compiled from: PlatformDecoderFactory */
public class ap4 {
    /* renamed from: a */
    public static zo4 m10688a(ls4 ls4, boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            int e = ls4.mo22959e();
            return new aj4(ls4.mo22956b(), e, new ct4(e));
        }
        int e2 = ls4.mo22959e();
        return new C1568ar(ls4.mo22956b(), e2, new ct4(e2));
    }
}
