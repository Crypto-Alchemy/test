package p000;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* renamed from: e9 */
/* compiled from: ActionBarPolicy */
public class C2215e9 {

    /* renamed from: a */
    public Context f11092a;

    public C2215e9(Context context) {
        this.f11092a = context;
    }

    /* renamed from: b */
    public static C2215e9 m15978b(Context context) {
        return new C2215e9(context);
    }

    /* renamed from: a */
    public boolean mo19208a() {
        if (this.f11092a.getApplicationInfo().targetSdkVersion < 14) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public int mo19209c() {
        return this.f11092a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    /* renamed from: d */
    public int mo19210d() {
        Configuration configuration = this.f11092a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i > 960 && i2 > 720) {
            return 5;
        }
        if (i > 720 && i2 > 960) {
            return 5;
        }
        if (i >= 500) {
            return 4;
        }
        if (i > 640 && i2 > 480) {
            return 4;
        }
        if (i > 480 && i2 > 640) {
            return 4;
        }
        if (i >= 360) {
            return 3;
        }
        return 2;
    }

    /* renamed from: e */
    public int mo19211e() {
        return this.f11092a.getResources().getDimensionPixelSize(n25.abc_action_bar_stacked_tab_max_width);
    }

    /* renamed from: f */
    public int mo19212f() {
        TypedArray obtainStyledAttributes = this.f11092a.obtainStyledAttributes((AttributeSet) null, j65.ActionBar, m15.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(j65.ActionBar_height, 0);
        Resources resources = this.f11092a.getResources();
        if (!mo19213g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(n25.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    /* renamed from: g */
    public boolean mo19213g() {
        return this.f11092a.getResources().getBoolean(p15.abc_action_bar_embed_tabs);
    }

    /* renamed from: h */
    public boolean mo19214h() {
        return true;
    }
}
