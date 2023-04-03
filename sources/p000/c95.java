package p000;

import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0000*\u00020\u0001¨\u0006\u0006"}, mo44877d2 = {"La95;", "Landroid/graphics/Rect;", "a", "Landroid/graphics/RectF;", "b", "c", "ui-graphics_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: c95 */
/* compiled from: RectHelper.android.kt */
public final class c95 {
    /* renamed from: a */
    public static final Rect m11756a(a95 a95) {
        vx2.m53591g(a95, "<this>");
        return new Rect((int) a95.mo118f(), (int) a95.mo122i(), (int) a95.mo119g(), (int) a95.mo114c());
    }

    /* renamed from: b */
    public static final RectF m11757b(a95 a95) {
        vx2.m53591g(a95, "<this>");
        return new RectF(a95.mo118f(), a95.mo122i(), a95.mo119g(), a95.mo114c());
    }

    /* renamed from: c */
    public static final a95 m11758c(Rect rect) {
        vx2.m53591g(rect, "<this>");
        return new a95((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
    }
}
