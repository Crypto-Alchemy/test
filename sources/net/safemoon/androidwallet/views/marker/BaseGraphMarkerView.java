package net.safemoon.androidwallet.views.marker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Utils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0019\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J \u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\fH'¨\u0006\u0014"}, mo44877d2 = {"Lnet/safemoon/androidwallet/views/marker/BaseGraphMarkerView;", "Lcom/github/mikephil/charting/components/MarkerView;", "Lcom/github/mikephil/charting/utils/MPPointF;", "getOffset", "", "posX", "posY", "getOffsetForDrawingAtPoint", "Landroid/graphics/Canvas;", "canvas", "Lr37;", "draw", "", "getMarkerColor", "Landroid/content/Context;", "context", "layoutResource", "<init>", "(Landroid/content/Context;I)V", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: BaseGraphMarkerView.kt */
public abstract class BaseGraphMarkerView extends MarkerView {

    /* renamed from: a */
    public static final C8965a f43350a = new C8965a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final float f43351d = ho0.m58584a(2);

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, mo44877d2 = {"Lnet/safemoon/androidwallet/views/marker/BaseGraphMarkerView$a;", "", "", "ARROW_SIZE", "F", "VIEW_HORIZONTAL_PADDING", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.views.marker.BaseGraphMarkerView$a */
    /* compiled from: BaseGraphMarkerView.kt */
    public static final class C8965a {
        public C8965a() {
        }

        public /* synthetic */ C8965a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public BaseGraphMarkerView(Context context, int i) {
        super(context, i);
    }

    public void draw(Canvas canvas, float f, float f2) {
        Path path;
        Canvas canvas2 = canvas;
        float f3 = f;
        float f4 = f2;
        vx2.m53591g(canvas2, "canvas");
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(uf5.m28221d(getResources(), getMarkerColor(), (Resources.Theme) null));
        Chart chartView = getChartView();
        float width = ((float) getWidth()) - f43351d;
        float height = (float) getHeight();
        MPPointF offsetForDrawingAtPoint = getOffsetForDrawingAtPoint(f3, f4);
        int save = canvas.save();
        float f5 = height + 40.0f;
        if (f4 < f5) {
            path = new Path();
            path.moveTo(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
            if (f3 > ((float) chartView.getWidth()) - width) {
                path.lineTo(width - 40.0f, Utils.FLOAT_EPSILON);
                path.lineTo(width, -40.0f);
                path.lineTo(width, Utils.FLOAT_EPSILON);
            } else {
                float f6 = width / ((float) 2);
                if (f3 > f6) {
                    path.lineTo(f6 - 20.0f, Utils.FLOAT_EPSILON);
                    path.lineTo(f6, -40.0f);
                    path.lineTo(f6 + 20.0f, Utils.FLOAT_EPSILON);
                } else {
                    path.lineTo(Utils.FLOAT_EPSILON, -40.0f);
                    path.lineTo(40.0f, Utils.FLOAT_EPSILON);
                }
            }
            float f7 = (float) 0;
            float f8 = width + f7;
            path.lineTo(f8, Utils.FLOAT_EPSILON);
            float f9 = f7 + height;
            path.lineTo(f8, f9);
            path.lineTo(Utils.FLOAT_EPSILON, f9);
            path.lineTo(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
            path.offset(offsetForDrawingAtPoint.f10199x + f3, offsetForDrawingAtPoint.f10200y + f4);
        } else {
            Path path2 = new Path();
            path2.moveTo(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
            float f10 = (float) 0;
            float f11 = f10 + width;
            path2.lineTo(f11, Utils.FLOAT_EPSILON);
            float f12 = f10 + height;
            path2.lineTo(f11, f12);
            if (f3 > ((float) chartView.getWidth()) - width) {
                path2.lineTo(width, f5);
                path2.lineTo(width - 40.0f, f12);
                path2.lineTo(Utils.FLOAT_EPSILON, f12);
            } else {
                float f13 = width / ((float) 2);
                if (f3 > f13) {
                    path2.lineTo(f13 + 20.0f, f12);
                    path2.lineTo(f13, f5);
                    path2.lineTo(f13 - 20.0f, f12);
                    path2.lineTo(Utils.FLOAT_EPSILON, f12);
                } else {
                    path2.lineTo(40.0f, f12);
                    path2.lineTo(Utils.FLOAT_EPSILON, f5);
                    path2.lineTo(Utils.FLOAT_EPSILON, f12);
                }
            }
            path2.lineTo(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
            path2.offset(offsetForDrawingAtPoint.f10199x + f3, offsetForDrawingAtPoint.f10200y + f4);
            path = path2;
        }
        canvas2.drawPath(path, paint);
        canvas2.translate(f3 + offsetForDrawingAtPoint.f10199x, f4 + offsetForDrawingAtPoint.f10200y);
        draw(canvas);
        canvas2.restoreToCount(save);
    }

    public abstract int getMarkerColor();

    public MPPointF getOffset() {
        return new MPPointF(-(((float) getWidth()) - (f43351d / ((float) 2))), (float) (-getHeight()));
    }

    public MPPointF getOffsetForDrawingAtPoint(float f, float f2) {
        MPPointF offset = getOffset();
        Chart chartView = getChartView();
        float width = ((float) getWidth()) - f43351d;
        float height = (float) getHeight();
        if (f2 <= height + 40.0f) {
            offset.f10200y = 40.0f;
        } else {
            offset.f10200y = (-height) - 40.0f;
        }
        if (f > ((float) chartView.getWidth()) - width) {
            offset.f10199x = -width;
        } else {
            offset.f10199x = Utils.FLOAT_EPSILON;
            float f3 = width / ((float) 2);
            if (f > f3) {
                offset.f10199x = -f3;
            }
        }
        return offset;
    }
}
