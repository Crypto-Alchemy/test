package p000;

import android.os.Build;
import android.view.View;

/* renamed from: xr6 */
/* compiled from: TooltipCompat */
public class xr6 {

    /* renamed from: xr6$a */
    /* compiled from: TooltipCompat */
    public static class C3638a {
        /* renamed from: a */
        public static void m30295a(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* renamed from: a */
    public static void m30294a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            C3638a.m30295a(view, charSequence);
        } else {
            as6.m10762h(view, charSequence);
        }
    }
}
