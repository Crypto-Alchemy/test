package p000;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import net.safemoon.androidwallet.R;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rJ\u000e\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\rJ\u000e\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0016"}, mo44877d2 = {"Lg06;", "", "Landroid/content/Context;", "context", "", "defaultScreen", "Lr37;", "f", "b", "", "defaultLanguage", "e", "a", "", "isLinked", "h", "d", "isDisplayMasterAccount", "g", "c", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: g06 */
/* compiled from: SharedUtility.kt */
public final class g06 {

    /* renamed from: a */
    public static final g06 f37938a = new g06();

    /* renamed from: a */
    public final String mo51832a(Context context) {
        vx2.m53591g(context, "context");
        String j = f06.m57519j(context, "DEFAULT_LANGUAGE", "en");
        vx2.m53590f(j, "getString(context, Share…GUAGE, Languages.English)");
        return j;
    }

    /* renamed from: b */
    public final int mo51833b(Context context) {
        boolean z;
        vx2.m53591g(context, "context");
        int f = f06.m57515f(context, "DEFAULT_SCREEN", R.id.navigation_wallet);
        ArrayList<Pair<Integer, Integer>> c = lz0.f40718a.mo55991c();
        boolean z2 = true;
        if (!(c instanceof Collection) || !c.isEmpty()) {
            Iterator<T> it = c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((Number) ((Pair) it.next()).getFirst()).intValue() == f) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
        }
        z2 = false;
        if (z2) {
            return f06.m57515f(context, "DEFAULT_SCREEN", R.id.navigation_wallet);
        }
        return R.id.navigation_wallet;
    }

    /* renamed from: c */
    public final boolean mo51834c(Context context) {
        vx2.m53591g(context, "context");
        return f06.m57514e(context, "DISPLAY_MASTER_ACCOUNT", false);
    }

    /* renamed from: d */
    public final boolean mo51835d(Context context) {
        vx2.m53591g(context, "context");
        return f06.m57514e(context, "SAFEMOON_LINKED_ALL_WALLET", false);
    }

    /* renamed from: e */
    public final void mo51836e(Context context, String str) {
        vx2.m53591g(context, "context");
        vx2.m53591g(str, "defaultLanguage");
        f06.m57524o(context, "DEFAULT_LANGUAGE", str);
    }

    /* renamed from: f */
    public final void mo51837f(Context context, int i) {
        vx2.m53591g(context, "context");
        f06.m57521l(context, "DEFAULT_SCREEN", i);
    }

    /* renamed from: g */
    public final void mo51838g(Context context, boolean z) {
        vx2.m53591g(context, "context");
        f06.m57523n(context, "DISPLAY_MASTER_ACCOUNT", Boolean.valueOf(z));
    }

    /* renamed from: h */
    public final void mo51839h(Context context, boolean z) {
        vx2.m53591g(context, "context");
        f06.m57523n(context, "SAFEMOON_LINKED_ALL_WALLET", Boolean.valueOf(z));
    }
}
