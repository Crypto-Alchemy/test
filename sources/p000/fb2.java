package p000;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.transition.C1452a;
import java.util.ArrayList;

/* renamed from: fb2 */
/* compiled from: FragmentTransition */
public class fb2 {

    /* renamed from: a */
    public static final hb2 f11689a = new gb2();

    /* renamed from: b */
    public static final hb2 f11690b = m16824b();

    /* renamed from: a */
    public static void m16823a(Fragment fragment, Fragment fragment2, boolean z, C2781lq<String, View> lqVar, boolean z2) {
        if (z) {
            fragment2.getEnterTransitionCallback();
        } else {
            fragment.getEnterTransitionCallback();
        }
    }

    /* renamed from: b */
    public static hb2 m16824b() {
        try {
            return C1452a.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static void m16825c(C2781lq<String, String> lqVar, C2781lq<String, View> lqVar2) {
        for (int size = lqVar.size() - 1; size >= 0; size--) {
            if (!lqVar2.containsKey(lqVar.mo27921m(size))) {
                lqVar.mo22211k(size);
            }
        }
    }

    /* renamed from: d */
    public static void m16826d(ArrayList<View> arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).setVisibility(i);
            }
        }
    }

    /* renamed from: e */
    public static boolean m16827e() {
        if (f11689a == null && f11690b == null) {
            return false;
        }
        return true;
    }
}
