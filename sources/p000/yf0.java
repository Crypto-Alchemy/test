package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.github.mikephil.charting.utils.Utils;
import com.lelloman.identicon.drawable.ClassicIdenticonTile;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\u0006\u0010 \u001a\u00020\u0002¢\u0006\u0004\b!\u0010\"J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0014J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0002J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00028BX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u001c¨\u0006#"}, mo44877d2 = {"Lyf0;", "Lcq2;", "", "newHash", "Lr37;", "d", "Landroid/graphics/Canvas;", "canvas", "a", "position", "Lcom/lelloman/identicon/drawable/ClassicIdenticonTile$Tiles;", "j", "g", "f", "h", "Lzf0;", "i", "Lzf0;", "identiconHash", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "bgPaint", "k", "fgPaint", "Lcq6;", "l", "Lcq6;", "tileMeasure", "()I", "color", "width", "height", "hash", "<init>", "(III)V", "library-identicon_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: yf0 */
/* compiled from: ClassicIdenticonDrawable.kt */
public final class yf0 extends cq2 {

    /* renamed from: i */
    public zf0 f35858i;

    /* renamed from: j */
    public final Paint f35859j;

    /* renamed from: k */
    public final Paint f35860k;

    /* renamed from: l */
    public final cq6 f35861l;

    public yf0(int i, int i2, int i3) {
        super(i, i2, i3, 3);
        Paint paint = new Paint(1);
        this.f35859j = paint;
        Paint paint2 = new Paint(1);
        this.f35860k = paint2;
        mo41609d(i3);
        paint.setStyle(Paint.Style.FILL);
        paint2.setStyle(Paint.Style.FILL);
        paint.setColor(0);
        paint2.setColor(-16777216);
        this.f35861l = new cq6(i / 3, i2 / 3);
        mo41608c();
    }

    /* renamed from: a */
    public void mo41606a(Canvas canvas) {
        vx2.m53591g(canvas, "canvas");
        if (this.f35858i != null) {
            this.f35860k.setColor(mo49644i());
            canvas.drawColor(0);
            mo49642g(canvas);
            mo49641f(canvas);
            mo49643h(canvas);
        }
    }

    /* renamed from: d */
    public void mo41609d(int i) {
        this.f35858i = new zf0(i);
    }

    /* renamed from: f */
    public final void mo49641f(Canvas canvas) {
        boolean z;
        Paint paint;
        Paint paint2;
        zf0 zf0 = this.f35858i;
        vx2.m53588d(zf0);
        ClassicIdenticonTile.Tiles j = mo49645j(zf0.mo49832b());
        zf0 zf02 = this.f35858i;
        vx2.m53588d(zf02);
        if (zf02.mo49835e() == 0) {
            z = true;
        } else {
            z = false;
        }
        zf0 zf03 = this.f35858i;
        vx2.m53588d(zf03);
        int c = zf03.mo49833c() * 90;
        if (z) {
            paint = this.f35860k;
        } else {
            paint = this.f35859j;
        }
        Paint paint3 = paint;
        if (z) {
            paint2 = this.f35859j;
        } else {
            paint2 = this.f35860k;
        }
        Paint paint4 = paint2;
        Canvas canvas2 = canvas;
        Paint paint5 = paint4;
        Paint paint6 = paint3;
        j.draw(canvas2, this.f35861l, c + 0, paint5, paint6);
        canvas.save();
        canvas.translate((float) this.f35861l.mo41630n(), Utils.FLOAT_EPSILON);
        j.draw(canvas2, this.f35861l, c + 90, paint5, paint6);
        canvas.restore();
        canvas.save();
        canvas.translate((float) this.f35861l.mo41630n(), (float) this.f35861l.mo41622g());
        Canvas canvas3 = canvas;
        j.draw(canvas3, this.f35861l, c + 180, paint5, paint6);
        canvas.restore();
        canvas.save();
        canvas.translate(Utils.FLOAT_EPSILON, (float) this.f35861l.mo41622g());
        j.draw(canvas3, this.f35861l, c + 270, paint5, paint6);
        canvas.restore();
    }

    /* renamed from: g */
    public final void mo49642g(Canvas canvas) {
        boolean z;
        Paint paint;
        Paint paint2;
        zf0 zf0 = this.f35858i;
        vx2.m53588d(zf0);
        if (zf0.mo49836f() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            paint = this.f35860k;
        } else {
            paint = this.f35859j;
        }
        Paint paint3 = paint;
        if (z) {
            paint2 = this.f35859j;
        } else {
            paint2 = this.f35860k;
        }
        Paint paint4 = paint2;
        canvas.save();
        canvas.translate((float) this.f35861l.mo41629m(), (float) this.f35861l.mo41621f());
        zf0 zf02 = this.f35858i;
        vx2.m53588d(zf02);
        mo49645j(zf02.mo49838h()).draw(canvas, this.f35861l, 0, paint4, paint3);
        canvas.restore();
    }

    /* renamed from: h */
    public final void mo49643h(Canvas canvas) {
        boolean z;
        Paint paint;
        Paint paint2;
        zf0 zf0 = this.f35858i;
        vx2.m53588d(zf0);
        ClassicIdenticonTile.Tiles j = mo49645j(zf0.mo49840j());
        zf0 zf02 = this.f35858i;
        vx2.m53588d(zf02);
        if (zf02.mo49837g() == 0) {
            z = true;
        } else {
            z = false;
        }
        zf0 zf03 = this.f35858i;
        vx2.m53588d(zf03);
        int k = zf03.mo49841k() * 90;
        if (z) {
            paint = this.f35860k;
        } else {
            paint = this.f35859j;
        }
        Paint paint3 = paint;
        if (z) {
            paint2 = this.f35859j;
        } else {
            paint2 = this.f35860k;
        }
        Paint paint4 = paint2;
        canvas.save();
        canvas.translate(Utils.FLOAT_EPSILON, (float) this.f35861l.mo41621f());
        Paint paint5 = paint4;
        Paint paint6 = paint3;
        j.draw(canvas, this.f35861l, k + 0, paint5, paint6);
        canvas.restore();
        canvas.save();
        canvas.translate((float) this.f35861l.mo41629m(), (float) this.f35861l.mo41622g());
        j.draw(canvas, this.f35861l, k + 90, paint5, paint6);
        canvas.restore();
        canvas.save();
        canvas.translate((float) this.f35861l.mo41630n(), (float) this.f35861l.mo41621f());
        Canvas canvas2 = canvas;
        j.draw(canvas2, this.f35861l, k + 180, paint5, paint6);
        canvas.restore();
        canvas.save();
        canvas.translate((float) this.f35861l.mo41629m(), Utils.FLOAT_EPSILON);
        j.draw(canvas2, this.f35861l, k + 270, paint5, paint6);
        canvas.restore();
    }

    /* renamed from: i */
    public final int mo49644i() {
        zf0 zf0 = this.f35858i;
        vx2.m53588d(zf0);
        zf0 zf02 = this.f35858i;
        vx2.m53588d(zf02);
        zf0 zf03 = this.f35858i;
        vx2.m53588d(zf03);
        return ((((zf0.mo49839i() * 8) + 100) * 65536) - 16777216) + (((zf02.mo49834d() * 8) + 100) * 256) + (zf03.mo49831a() * 8) + 100;
    }

    /* renamed from: j */
    public final ClassicIdenticonTile.Tiles mo49645j(int i) {
        return ClassicIdenticonTile.f25846a.mo38330a()[i];
    }
}
