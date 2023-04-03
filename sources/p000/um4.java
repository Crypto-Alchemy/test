package p000;

import android.graphics.Path;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u001a:\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001\u001a*\u0010\u000e\u001a\u00020\b*\u00020\u00002\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001\u001aJ\u0010\u0011\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0001¨\u0006\u0012"}, mo44877d2 = {"Landroid/graphics/Path;", "", "x0", "y0", "x1", "y1", "x2", "y2", "Lr37;", "c", "left", "top", "right", "bottom", "b", "x3", "y3", "a", "library-identicon_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: um4 */
/* compiled from: PathExtensions.kt */
public final class um4 {
    /* renamed from: a */
    public static final void m52878a(Path path, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        vx2.m53591g(path, "<this>");
        float f = (float) i;
        float f2 = (float) i2;
        path.moveTo(f, f2);
        path.lineTo((float) i3, (float) i4);
        path.lineTo((float) i5, (float) i6);
        path.lineTo((float) i7, (float) i8);
        path.lineTo(f, f2);
    }

    /* renamed from: b */
    public static final void m52879b(Path path, int i, int i2, int i3, int i4) {
        vx2.m53591g(path, "<this>");
        float f = (float) i;
        float f2 = (float) i2;
        path.moveTo(f, f2);
        float f3 = (float) i3;
        path.lineTo(f3, f2);
        float f4 = (float) i4;
        path.lineTo(f3, f4);
        path.lineTo(f, f4);
        path.lineTo(f, f2);
    }

    /* renamed from: c */
    public static final void m52880c(Path path, int i, int i2, int i3, int i4, int i5, int i6) {
        vx2.m53591g(path, "<this>");
        float f = (float) i;
        float f2 = (float) i2;
        path.moveTo(f, f2);
        path.lineTo((float) i3, (float) i4);
        path.lineTo((float) i5, (float) i6);
        path.lineTo(f, f2);
    }
}
