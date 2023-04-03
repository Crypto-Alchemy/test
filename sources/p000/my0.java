package p000;

import android.os.Bundle;

/* renamed from: my0 */
/* compiled from: CustomTabColorSchemeParams */
public final class my0 {

    /* renamed from: a */
    public final Integer f15271a;

    /* renamed from: b */
    public final Integer f15272b;

    /* renamed from: c */
    public final Integer f15273c;

    /* renamed from: d */
    public final Integer f15274d;

    /* renamed from: my0$a */
    /* compiled from: CustomTabColorSchemeParams */
    public static final class C2857a {

        /* renamed from: a */
        public Integer f15275a;

        /* renamed from: b */
        public Integer f15276b;

        /* renamed from: c */
        public Integer f15277c;

        /* renamed from: d */
        public Integer f15278d;

        /* renamed from: a */
        public my0 mo23420a() {
            return new my0(this.f15275a, this.f15276b, this.f15277c, this.f15278d);
        }
    }

    public my0(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f15271a = num;
        this.f15272b = num2;
        this.f15273c = num3;
        this.f15274d = num4;
    }

    /* renamed from: a */
    public Bundle mo23419a() {
        Bundle bundle = new Bundle();
        Integer num = this.f15271a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f15272b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f15273c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.f15274d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}
