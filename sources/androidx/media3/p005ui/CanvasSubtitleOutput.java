package androidx.media3.p005ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import androidx.media3.p005ui.SubtitleView;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000.dx0;

/* renamed from: androidx.media3.ui.CanvasSubtitleOutput */
final class CanvasSubtitleOutput extends View implements SubtitleView.C1091a {

    /* renamed from: a */
    public final List<dd6> f5684a;

    /* renamed from: d */
    public List<dx0> f5685d;

    /* renamed from: e */
    public int f5686e;

    /* renamed from: g */
    public float f5687g;

    /* renamed from: k */
    public ib0 f5688k;

    /* renamed from: r */
    public float f5689r;

    public CanvasSubtitleOutput(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: b */
    public static dx0 m7732b(dx0 dx0) {
        dx0.C2206b p = dx0.mo18976b().mo18989k(-3.4028235E38f).mo18990l(Integer.MIN_VALUE).mo18994p((Layout.Alignment) null);
        if (dx0.f10948r == 0) {
            p.mo18986h(1.0f - dx0.f10947k, 0);
        } else {
            p.mo18986h((-dx0.f10947k) - 1.0f, 1);
        }
        int i = dx0.f10949s;
        if (i == 0) {
            p.mo18987i(2);
        } else if (i == 2) {
            p.mo18987i(0);
        }
        return p.mo18979a();
    }

    /* renamed from: a */
    public void mo8100a(List<dx0> list, ib0 ib0, float f, int i, float f2) {
        this.f5685d = list;
        this.f5688k = ib0;
        this.f5687g = f;
        this.f5686e = i;
        this.f5689r = f2;
        while (this.f5684a.size() < list.size()) {
            this.f5684a.add(new dd6(getContext()));
        }
        invalidate();
    }

    public void dispatchDraw(Canvas canvas) {
        List<dx0> list = this.f5685d;
        if (!list.isEmpty()) {
            int height = getHeight();
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int paddingBottom = height - getPaddingBottom();
            if (paddingBottom > paddingTop && width > paddingLeft) {
                int i = paddingBottom - paddingTop;
                float h = gd6.m18018h(this.f5686e, this.f5687g, height, i);
                if (h > Utils.FLOAT_EPSILON) {
                    int size = list.size();
                    int i2 = 0;
                    while (i2 < size) {
                        dx0 dx0 = list.get(i2);
                        if (dx0.f10941M != Integer.MIN_VALUE) {
                            dx0 = m7732b(dx0);
                        }
                        dx0 dx02 = dx0;
                        int i3 = paddingBottom;
                        this.f5684a.get(i2).mo18730b(dx02, this.f5688k, h, gd6.m18018h(dx02.f10939I, dx02.f10940L, height, i), this.f5689r, canvas, paddingLeft, paddingTop, width, i3);
                        i2++;
                        size = size;
                        i = i;
                        paddingBottom = i3;
                        width = width;
                    }
                }
            }
        }
    }

    public CanvasSubtitleOutput(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5684a = new ArrayList();
        this.f5685d = Collections.emptyList();
        this.f5686e = 0;
        this.f5687g = 0.0533f;
        this.f5688k = ib0.f13235g;
        this.f5689r = 0.08f;
    }
}
