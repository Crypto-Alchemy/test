package p000;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.StateSet;

/* renamed from: bh5 */
/* compiled from: RippleUtils */
public class bh5 {

    /* renamed from: a */
    public static final boolean f21304a = true;

    /* renamed from: b */
    public static final int[] f21305b = {16842919};

    /* renamed from: c */
    public static final int[] f21306c = {16843623, 16842908};

    /* renamed from: d */
    public static final int[] f21307d = {16842908};

    /* renamed from: e */
    public static final int[] f21308e = {16843623};

    /* renamed from: f */
    public static final int[] f21309f = {16842913, 16842919};

    /* renamed from: g */
    public static final int[] f21310g = {16842913, 16843623, 16842908};

    /* renamed from: h */
    public static final int[] f21311h = {16842913, 16842908};

    /* renamed from: i */
    public static final int[] f21312i = {16842913, 16843623};

    /* renamed from: j */
    public static final int[] f21313j = {16842913};

    /* renamed from: k */
    public static final int[] f21314k = {16842910, 16842919};

    /* renamed from: l */
    public static final String f21315l = bh5.class.getSimpleName();

    /* renamed from: a */
    public static ColorStateList m32530a(ColorStateList colorStateList) {
        if (f21304a) {
            return new ColorStateList(new int[][]{f21313j, StateSet.NOTHING}, new int[]{m32532c(colorStateList, f21309f), m32532c(colorStateList, f21305b)});
        }
        int[] iArr = f21309f;
        int[] iArr2 = f21310g;
        int[] iArr3 = f21311h;
        int[] iArr4 = f21312i;
        int[] iArr5 = f21305b;
        int[] iArr6 = f21306c;
        int[] iArr7 = f21307d;
        int[] iArr8 = f21308e;
        return new ColorStateList(new int[][]{iArr, iArr2, iArr3, iArr4, f21313j, iArr5, iArr6, iArr7, iArr8, StateSet.NOTHING}, new int[]{m32532c(colorStateList, iArr), m32532c(colorStateList, iArr2), m32532c(colorStateList, iArr3), m32532c(colorStateList, iArr4), 0, m32532c(colorStateList, iArr5), m32532c(colorStateList, iArr6), m32532c(colorStateList, iArr7), m32532c(colorStateList, iArr8), 0});
    }

    @TargetApi(21)
    /* renamed from: b */
    public static int m32531b(int i) {
        return gl0.m18169j(i, Math.min(Color.alpha(i) * 2, 255));
    }

    /* renamed from: c */
    public static int m32532c(ColorStateList colorStateList, int[] iArr) {
        int i;
        if (colorStateList != null) {
            i = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        } else {
            i = 0;
        }
        if (f21304a) {
            return m32531b(i);
        }
        return i;
    }

    /* renamed from: d */
    public static ColorStateList m32533d(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0) {
            Color.alpha(colorStateList.getColorForState(f21314k, 0));
        }
        return colorStateList;
    }

    /* renamed from: e */
    public static boolean m32534e(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z2 = true;
            }
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }
}
