package p000;

import android.view.View;

/* renamed from: lf7 */
/* compiled from: VisibilityPropagation */
public abstract class lf7 extends zw6 {

    /* renamed from: a */
    public static final String[] f14514a = {"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};

    /* renamed from: d */
    public static int m21435d(bx6 bx6, int i) {
        int[] iArr;
        if (bx6 == null || (iArr = (int[]) bx6.f8291a.get("android:visibilityPropagation:center")) == null) {
            return -1;
        }
        return iArr[i];
    }

    /* renamed from: a */
    public void mo22756a(bx6 bx6) {
        View view = bx6.f8292b;
        Integer num = (Integer) bx6.f8291a.get("android:visibility:visibility");
        if (num == null) {
            num = Integer.valueOf(view.getVisibility());
        }
        bx6.f8291a.put("android:visibilityPropagation:visibility", num);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int round = iArr[0] + Math.round(view.getTranslationX());
        iArr[0] = round;
        iArr[0] = round + (view.getWidth() / 2);
        int round2 = iArr[1] + Math.round(view.getTranslationY());
        iArr[1] = round2;
        iArr[1] = round2 + (view.getHeight() / 2);
        bx6.f8291a.put("android:visibilityPropagation:center", iArr);
    }

    /* renamed from: b */
    public String[] mo22757b() {
        return f14514a;
    }

    /* renamed from: e */
    public int mo22758e(bx6 bx6) {
        Integer num;
        if (bx6 == null || (num = (Integer) bx6.f8291a.get("android:visibilityPropagation:visibility")) == null) {
            return 8;
        }
        return num.intValue();
    }

    /* renamed from: f */
    public int mo22759f(bx6 bx6) {
        return m21435d(bx6, 0);
    }

    /* renamed from: g */
    public int mo22760g(bx6 bx6) {
        return m21435d(bx6, 1);
    }
}
