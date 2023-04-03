package p000;

import android.content.Context;
import android.graphics.Typeface;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\n"}, mo44877d2 = {"Lnf5;", "", "Landroid/content/Context;", "context", "Llf5;", "font", "Landroid/graphics/Typeface;", "a", "<init>", "()V", "ui-text_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: nf5 */
/* compiled from: AndroidFontLoader.android.kt */
public final class nf5 {

    /* renamed from: a */
    public static final nf5 f15537a = new nf5();

    /* renamed from: a */
    public final Typeface mo23675a(Context context, lf5 lf5) {
        vx2.m53591g(context, "context");
        vx2.m53591g(lf5, "font");
        Typeface a = context.getResources().getFont(lf5.mo22751d());
        vx2.m53590f(a, "context.resources.getFont(font.resId)");
        return a;
    }
}
