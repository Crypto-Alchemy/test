package net.safemoon.androidwallet.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.github.mikephil.charting.utils.Utils;
import kotlin.C6169a;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019B\u001d\b\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0018\u0010\u001cB%\b\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u001eJ(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0014J\u0012\u0010\u000b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014R\u001b\u0010\u0011\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, mo44877d2 = {"Lnet/safemoon/androidwallet/views/ClipRelativeLayout;", "Landroid/widget/RelativeLayout;", "", "w", "h", "oldw", "oldh", "Lr37;", "onSizeChanged", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "Landroid/graphics/Paint;", "a", "Lef3;", "getPaint", "()Landroid/graphics/Paint;", "paint", "Landroid/graphics/Path;", "d", "Landroid/graphics/Path;", "path", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: ClipRelativeLayout.kt */
public final class ClipRelativeLayout extends RelativeLayout {

    /* renamed from: a */
    public final ef3 f43213a;

    /* renamed from: d */
    public Path f43214d;

    public ClipRelativeLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    private final Paint getPaint() {
        return (Paint) this.f43213a.getValue();
    }

    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        RectF rectF = new RectF(Utils.FLOAT_EPSILON, ((float) getHeight()) - ol0.m70379u(this), (float) getWidth(), (float) getHeight());
        this.f43214d.reset();
        this.f43214d.moveTo(rectF.left, rectF.bottom);
        this.f43214d.lineTo(rectF.left, rectF.top);
        float centerX = rectF.centerX();
        float f = rectF.bottom;
        float f2 = rectF.right;
        this.f43214d.cubicTo((rectF.left + centerX) / 2.0f, f, (centerX + f2) / 2.0f, f, f2, rectF.top);
        this.f43214d.lineTo(rectF.right, rectF.top);
        this.f43214d.lineTo(rectF.right, rectF.bottom);
        this.f43214d.close();
    }

    public ClipRelativeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ClipRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.f43213a = C6169a.m47232a(new ClipRelativeLayout$paint$2(this));
        this.f43214d = new Path();
    }
}
