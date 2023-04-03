package p000;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.Html;
import android.text.Spanned;

@SuppressLint({"InlinedApi"})
/* renamed from: zm2 */
/* compiled from: HtmlCompat */
public final class zm2 {

    /* renamed from: zm2$a */
    /* compiled from: HtmlCompat */
    public static class C3745a {
        /* renamed from: a */
        public static Spanned m31399a(String str, int i) {
            return Html.fromHtml(str, i);
        }

        /* renamed from: b */
        public static Spanned m31400b(String str, int i, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
            return Html.fromHtml(str, i, imageGetter, tagHandler);
        }

        /* renamed from: c */
        public static String m31401c(Spanned spanned, int i) {
            return Html.toHtml(spanned, i);
        }
    }

    /* renamed from: a */
    public static Spanned m31398a(String str, int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C3745a.m31399a(str, i);
        }
        return Html.fromHtml(str);
    }
}
