package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\b&\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010*\u001a\u00020\u0007\u0012\u0006\u0010+\u001a\u00020\u0007\u0012\u0006\u0010)\u001a\u00020\u0007\u0012\u0006\u0010,\u001a\u00020\u0007¢\u0006\u0004\b-\u0010.J\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H$J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0014J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J\u0012\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u0010\u001a\u00020\u0007H\u0016R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0017\u0010\"\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010%\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010!R*\u0010)\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u00078\u0006@FX\u000e¢\u0006\u0012\n\u0004\b'\u0010\u001f\u001a\u0004\b\u0014\u0010!\"\u0004\b\u001b\u0010(¨\u0006/"}, mo44877d2 = {"Lcq2;", "Landroid/graphics/drawable/Drawable;", "Lr37;", "c", "Landroid/graphics/Canvas;", "canvas", "a", "", "newHash", "d", "draw", "i", "setAlpha", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "getOpacity", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;", "bitmapRect", "b", "destinationRect", "Landroid/graphics/Bitmap;", "Landroid/graphics/Bitmap;", "bitmap", "Landroid/graphics/Canvas;", "Landroid/graphics/Paint;", "e", "Landroid/graphics/Paint;", "bitmapPaint", "f", "I", "getWidth", "()I", "width", "g", "getHeight", "height", "value", "h", "(I)V", "hash", "desiredWidth", "desiredHeight", "multipleOf", "<init>", "(IIII)V", "library-identicon_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: cq2 */
/* compiled from: IdenticonDrawable.kt */
public abstract class cq2 extends Drawable {

    /* renamed from: a */
    public final Rect f27866a;

    /* renamed from: b */
    public final Rect f27867b;

    /* renamed from: c */
    public final Bitmap f27868c;

    /* renamed from: d */
    public final Canvas f27869d;

    /* renamed from: e */
    public final Paint f27870e = new Paint(1);

    /* renamed from: f */
    public final int f27871f;

    /* renamed from: g */
    public final int f27872g;

    /* renamed from: h */
    public int f27873h;

    public cq2(int i, int i2, int i3, int i4) {
        this.f27873h = i3;
        while (i % i4 != 0) {
            i++;
        }
        while (i2 % i4 != 0) {
            i2++;
        }
        this.f27871f = i;
        this.f27872g = i2;
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        vx2.m53590f(createBitmap, "createBitmap(actualWidth… Bitmap.Config.ARGB_8888)");
        this.f27868c = createBitmap;
        this.f27866a = new Rect(0, 0, i, i2);
        this.f27867b = new Rect(0, 0, i, i2);
        this.f27869d = new Canvas(createBitmap);
    }

    /* renamed from: a */
    public abstract void mo41606a(Canvas canvas);

    /* renamed from: b */
    public final int mo41607b() {
        return this.f27873h;
    }

    /* renamed from: c */
    public final void mo41608c() {
        mo41606a(this.f27869d);
        invalidateSelf();
    }

    /* renamed from: d */
    public void mo41609d(int i) {
    }

    public void draw(Canvas canvas) {
        vx2.m53591g(canvas, "canvas");
        this.f27867b.set(0, 0, canvas.getWidth(), canvas.getHeight());
        canvas.drawBitmap(this.f27868c, this.f27866a, this.f27867b, this.f27870e);
    }

    /* renamed from: e */
    public final void mo41611e(int i) {
        this.f27873h = i;
        mo41609d(i);
        mo41608c();
    }

    public int getOpacity() {
        return this.f27870e.getAlpha();
    }

    public void setAlpha(int i) {
        this.f27870e.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f27870e.setColorFilter(colorFilter);
    }
}
