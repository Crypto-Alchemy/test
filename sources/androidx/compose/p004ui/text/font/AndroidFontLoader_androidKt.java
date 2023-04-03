package androidx.compose.p004ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u001f\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, mo44877d2 = {"Llf5;", "Landroid/content/Context;", "context", "Landroid/graphics/Typeface;", "c", "d", "(Llf5;Landroid/content/Context;Lns0;)Ljava/lang/Object;", "ui-text_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.text.font.AndroidFontLoader_androidKt */
/* compiled from: AndroidFontLoader.android.kt */
public final class AndroidFontLoader_androidKt {
    /* renamed from: c */
    public static final Typeface m3251c(lf5 lf5, Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return nf5.f15537a.mo23675a(context, lf5);
        }
        Typeface h = uf5.m28225h(context, lf5.mo22751d());
        vx2.m53588d(h);
        vx2.m53590f(h, "{\n        ResourcesCompa…t(context, resId)!!\n    }");
        return h;
    }

    /* renamed from: d */
    public static final Object m3252d(lf5 lf5, Context context, ns0<? super Typeface> ns0) {
        return b50.m55768e(qh1.m71265b(), new AndroidFontLoader_androidKt$loadAsync$2(lf5, context, (ns0<? super AndroidFontLoader_androidKt$loadAsync$2>) null), ns0);
    }
}
