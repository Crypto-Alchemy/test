package p000;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.C4402a;
import com.google.android.material.tabs.TabLayout;

/* renamed from: wn1 */
/* compiled from: ElasticTabIndicatorInterpolator */
public class wn1 extends C4402a {
    /* renamed from: e */
    public static float m53990e(float f) {
        return (float) (1.0d - Math.cos((((double) f) * 3.141592653589793d) / 2.0d));
    }

    /* renamed from: f */
    public static float m53991f(float f) {
        return (float) Math.sin((((double) f) * 3.141592653589793d) / 2.0d);
    }

    /* renamed from: c */
    public void mo33740c(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        boolean z;
        float f2;
        float f3;
        RectF a = C4402a.m36086a(tabLayout, view);
        RectF a2 = C4402a.m36086a(tabLayout, view2);
        if (a.left < a2.left) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f3 = m53990e(f);
            f2 = m53991f(f);
        } else {
            f3 = m53991f(f);
            f2 = m53990e(f);
        }
        drawable.setBounds(C5807el.m43988c((int) a.left, (int) a2.left, f3), drawable.getBounds().top, C5807el.m43988c((int) a.right, (int) a2.right, f2), drawable.getBounds().bottom);
    }
}
