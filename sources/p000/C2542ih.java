package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Region;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b/\u0010)J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J\u001d\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ=\u0010\u0013\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0011H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u0019*\u00020\u0011ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ0\u0010\u001e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\b\u0010\u001f\u001a\u00020\u0002H\u0016J\b\u0010 \u001a\u00020\u0002H\u0016R,\u0010*\u001a\u00060!j\u0002`\"8\u0000@\u0000X\u000e¢\u0006\u0018\n\u0004\b\u0013\u0010#\u0012\u0004\b(\u0010)\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0014\u0010-\u001a\u00020+8\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010,R\u0014\u0010.\u001a\u00020+8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010,\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00060"}, mo44877d2 = {"Lih;", "Lxa0;", "Lr37;", "g", "c", "", "dx", "dy", "b", "Lfp3;", "matrix", "i", "([F)V", "left", "top", "right", "bottom", "Lwg0;", "clipOp", "a", "(FFFFI)V", "Ltm4;", "path", "f", "(Ltm4;I)V", "Landroid/graphics/Region$Op;", "m", "(I)Landroid/graphics/Region$Op;", "Lgl4;", "paint", "j", "d", "h", "Landroid/graphics/Canvas;", "Landroidx/compose/ui/graphics/NativeCanvas;", "Landroid/graphics/Canvas;", "k", "()Landroid/graphics/Canvas;", "l", "(Landroid/graphics/Canvas;)V", "getInternalCanvas$annotations", "()V", "internalCanvas", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;", "srcRect", "dstRect", "<init>", "ui-graphics_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: ih */
/* compiled from: AndroidCanvas.android.kt */
public final class C2542ih implements xa0 {

    /* renamed from: a */
    public Canvas f13261a = C2601jh.f13611a;

    /* renamed from: b */
    public final Rect f13262b = new Rect();

    /* renamed from: c */
    public final Rect f13263c = new Rect();

    /* renamed from: a */
    public void mo21525a(float f, float f2, float f3, float f4, int i) {
        this.f13261a.clipRect(f, f2, f3, f4, mo21537m(i));
    }

    /* renamed from: b */
    public void mo21526b(float f, float f2) {
        this.f13261a.translate(f, f2);
    }

    /* renamed from: c */
    public void mo21527c() {
        this.f13261a.restore();
    }

    /* renamed from: d */
    public void mo21528d() {
        db0.f10584a.mo18646a(this.f13261a, true);
    }

    /* renamed from: e */
    public /* synthetic */ void mo21529e(a95 a95, gl4 gl4) {
        wa0.m29430a(this, a95, gl4);
    }

    /* renamed from: f */
    public void mo21530f(tm4 tm4, int i) {
        vx2.m53591g(tm4, "path");
        Canvas canvas = this.f13261a;
        if (tm4 instanceof C0024aj) {
            canvas.clipPath(((C0024aj) tm4).mo317f(), mo21537m(i));
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    /* renamed from: g */
    public void mo21531g() {
        this.f13261a.save();
    }

    /* renamed from: h */
    public void mo21532h() {
        db0.f10584a.mo18646a(this.f13261a, false);
    }

    /* renamed from: i */
    public void mo21533i(float[] fArr) {
        vx2.m53591g(fArr, "matrix");
        if (!jp3.m20329a(fArr)) {
            Matrix matrix = new Matrix();
            C3601xi.m30110a(matrix, fArr);
            this.f13261a.concat(matrix);
        }
    }

    /* renamed from: j */
    public void mo21534j(float f, float f2, float f3, float f4, gl4 gl4) {
        vx2.m53591g(gl4, "paint");
        this.f13261a.drawRect(f, f2, f3, f4, gl4.mo20639b());
    }

    /* renamed from: k */
    public final Canvas mo21535k() {
        return this.f13261a;
    }

    /* renamed from: l */
    public final void mo21536l(Canvas canvas) {
        vx2.m53591g(canvas, "<set-?>");
        this.f13261a = canvas;
    }

    /* renamed from: m */
    public final Region.Op mo21537m(int i) {
        if (wg0.m29556d(i, wg0.f19093a.mo27509a())) {
            return Region.Op.DIFFERENCE;
        }
        return Region.Op.INTERSECT;
    }
}
