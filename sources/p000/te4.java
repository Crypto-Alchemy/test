package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.C1515a;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0007\u001a\u00020\u0006H\u0003¨\u0006\n"}, mo44877d2 = {"Lte4;", "", "Landroid/content/Context;", "context", "Lmm7;", "a", "", "b", "<init>", "()V", "onesignal_release"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* renamed from: te4 */
/* compiled from: OSWorkManagerHelper.kt */
public final class te4 {

    /* renamed from: a */
    public static final te4 f34249a = new te4();

    /* renamed from: a */
    public static final synchronized mm7 m52273a(Context context) {
        mm7 f;
        synchronized (te4.class) {
            vx2.m53591g(context, "context");
            if (!f34249a.mo48098b()) {
                mm7.m22390g(context, new C1515a.C1517b().mo10919a());
            }
            f = mm7.m22389f(context);
            vx2.m53590f(f, "WorkManager.getInstance(context)");
        }
        return f;
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: b */
    public final boolean mo48098b() {
        if (nm7.m23321l() != null) {
            return true;
        }
        return false;
    }
}
