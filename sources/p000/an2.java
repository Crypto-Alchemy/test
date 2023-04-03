package p000;

import android.graphics.Color;

/* renamed from: an2 */
/* compiled from: HtmlUtils */
public final class an2 {
    /* renamed from: a */
    public static String m408a(String str) {
        return "." + str + ",." + str + " *";
    }

    /* renamed from: b */
    public static String m409b(int i) {
        return w67.m29294A("rgba(%d,%d,%d,%.3f)", Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Double.valueOf(((double) Color.alpha(i)) / 255.0d));
    }
}
