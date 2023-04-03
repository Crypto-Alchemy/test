package p000;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import p000.dx0;

/* renamed from: gd6 */
/* compiled from: SubtitleViewUtils */
public final class gd6 {
    /* renamed from: c */
    public static /* synthetic */ boolean m18013c(Object obj) {
        return !(obj instanceof wd3);
    }

    /* renamed from: d */
    public static /* synthetic */ boolean m18014d(Object obj) {
        if ((obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static void m18015e(dx0.C2206b bVar) {
        bVar.mo18980b();
        if (bVar.mo18983e() instanceof Spanned) {
            if (!(bVar.mo18983e() instanceof Spannable)) {
                bVar.mo18993o(SpannableString.valueOf(bVar.mo18983e()));
            }
            m18017g((Spannable) C2725kr.m20985e(bVar.mo18983e()), new ed6());
        }
        m18016f(bVar);
    }

    /* renamed from: f */
    public static void m18016f(dx0.C2206b bVar) {
        bVar.mo18995q(-3.4028235E38f, Integer.MIN_VALUE);
        if (bVar.mo18983e() instanceof Spanned) {
            if (!(bVar.mo18983e() instanceof Spannable)) {
                bVar.mo18993o(SpannableString.valueOf(bVar.mo18983e()));
            }
            m18017g((Spannable) C2725kr.m20985e(bVar.mo18983e()), new fd6());
        }
    }

    /* renamed from: g */
    public static void m18017g(Spannable spannable, ku4<Object> ku4) {
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            if (ku4.apply(obj)) {
                spannable.removeSpan(obj);
            }
        }
    }

    /* renamed from: h */
    public static float m18018h(int i, float f, int i2, int i3) {
        float f2;
        if (f == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i == 0) {
            f2 = (float) i3;
        } else if (i == 1) {
            f2 = (float) i2;
        } else if (i != 2) {
            return -3.4028235E38f;
        } else {
            return f;
        }
        return f * f2;
    }
}
