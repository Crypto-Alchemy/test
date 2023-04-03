package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.github.mikephil.charting.utils.Utils;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0004\b\u0014\u0010\u0015J.\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bR&\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, mo44877d2 = {"Lbq6;", "", "Landroid/graphics/Canvas;", "canvas", "Lcq6;", "measures", "", "originalRotation", "Landroid/graphics/Paint;", "bgPaint", "fgPaint", "Lr37;", "a", "Lkotlin/Function2;", "Landroid/graphics/Path;", "Lfd2;", "drawer", "b", "Landroid/graphics/Path;", "path", "<init>", "(Lfd2;)V", "library-identicon_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: bq6 */
/* compiled from: TileDrawer.kt */
public final class bq6 {

    /* renamed from: a */
    public final fd2<Path, cq6, r37> f21439a;

    /* renamed from: b */
    public final Path f21440b = new Path();

    public bq6(fd2<? super Path, ? super cq6, r37> fd2) {
        vx2.m53591g(fd2, "drawer");
        this.f21439a = fd2;
    }

    /* renamed from: a */
    public final void mo29696a(Canvas canvas, cq6 cq6, int i, Paint paint, Paint paint2) {
        vx2.m53591g(canvas, "canvas");
        vx2.m53591g(cq6, "measures");
        vx2.m53591g(paint, "bgPaint");
        vx2.m53591g(paint2, "fgPaint");
        canvas.drawRect(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) cq6.mo41629m(), (float) cq6.mo41621f(), paint);
        this.f21440b.reset();
        int i2 = i % 360;
        if (i2 != 0) {
            canvas.save();
            canvas.rotate((float) i2, (float) cq6.mo41628l(), (float) cq6.mo41619e());
            this.f21439a.invoke(this.f21440b, cq6);
            canvas.drawPath(this.f21440b, paint2);
            canvas.restore();
            return;
        }
        this.f21439a.invoke(this.f21440b, cq6);
        canvas.drawPath(this.f21440b, paint2);
    }
}
