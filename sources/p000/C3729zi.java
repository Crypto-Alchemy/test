package p000;

import android.graphics.Paint;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0006\u0010\u0001\u001a\u00020\u0000\u001a\b\u0010\u0003\u001a\u00020\u0002H\u0000\u001a\u0018\u0010\b\u001a\u00020\u0007*\u00060\u0002j\u0002`\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0000\u001a%\u0010\n\u001a\u00020\u0007*\u00060\u0002j\u0002`\u00042\u0006\u0010\u0006\u001a\u00020\tH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a%\u0010\r\u001a\u00020\u0007*\u00060\u0002j\u0002`\u00042\u0006\u0010\u0006\u001a\u00020\fH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u0018\u0010\u000f\u001a\u00020\u0007*\u00060\u0002j\u0002`\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0000*\n\u0010\u0010\"\u00020\u00022\u00020\u0002\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0011"}, mo44877d2 = {"Lgl4;", "a", "Landroid/graphics/Paint;", "b", "Landroidx/compose/ui/graphics/NativePaint;", "", "value", "Lr37;", "c", "Luk0;", "d", "(Landroid/graphics/Paint;J)V", "Lil4;", "f", "(Landroid/graphics/Paint;I)V", "e", "NativePaint", "ui-graphics_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: zi */
/* compiled from: AndroidPaint.android.kt */
public final class C3729zi {
    /* renamed from: a */
    public static final gl4 m31240a() {
        return new C3679yi();
    }

    /* renamed from: b */
    public static final Paint m31241b() {
        return new Paint(7);
    }

    /* renamed from: c */
    public static final void m31242c(Paint paint, float f) {
        vx2.m53591g(paint, "<this>");
        paint.setAlpha((int) ((float) Math.rint((double) (f * 255.0f))));
    }

    /* renamed from: d */
    public static final void m31243d(Paint paint, long j) {
        vx2.m53591g(paint, "$this$setNativeColor");
        paint.setColor(zk0.m31347e(j));
    }

    /* renamed from: e */
    public static final void m31244e(Paint paint, float f) {
        vx2.m53591g(paint, "<this>");
        paint.setStrokeWidth(f);
    }

    /* renamed from: f */
    public static final void m31245f(Paint paint, int i) {
        Paint.Style style;
        vx2.m53591g(paint, "$this$setNativeStyle");
        if (il4.m19704c(i, il4.f13314a.mo21570a())) {
            style = Paint.Style.STROKE;
        } else {
            style = Paint.Style.FILL;
        }
        paint.setStyle(style);
    }
}
