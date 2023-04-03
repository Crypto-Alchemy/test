package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.github.mikephil.charting.utils.Utils;
import com.google.mlkit.common.MlKitException;

public class MockView extends View {

    /* renamed from: A */
    public int f2983A = Color.argb(255, 50, 50, 50);

    /* renamed from: B */
    public int f2984B = 4;

    /* renamed from: a */
    public Paint f2985a = new Paint();

    /* renamed from: d */
    public Paint f2986d = new Paint();

    /* renamed from: e */
    public Paint f2987e = new Paint();

    /* renamed from: g */
    public boolean f2988g = true;

    /* renamed from: k */
    public boolean f2989k = true;

    /* renamed from: r */
    public String f2990r = null;

    /* renamed from: s */
    public Rect f2991s = new Rect();

    /* renamed from: x */
    public int f2992x = Color.argb(255, 0, 0, 0);

    /* renamed from: y */
    public int f2993y = Color.argb(255, MlKitException.CODE_SCANNER_UNAVAILABLE, MlKitException.CODE_SCANNER_UNAVAILABLE, MlKitException.CODE_SCANNER_UNAVAILABLE);

    public MockView(Context context) {
        super(context);
        mo4970a(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public final void mo4970a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c65.MockView);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == c65.MockView_mock_label) {
                    this.f2990r = obtainStyledAttributes.getString(index);
                } else if (index == c65.MockView_mock_showDiagonals) {
                    this.f2988g = obtainStyledAttributes.getBoolean(index, this.f2988g);
                } else if (index == c65.MockView_mock_diagonalsColor) {
                    this.f2992x = obtainStyledAttributes.getColor(index, this.f2992x);
                } else if (index == c65.MockView_mock_labelBackgroundColor) {
                    this.f2983A = obtainStyledAttributes.getColor(index, this.f2983A);
                } else if (index == c65.MockView_mock_labelColor) {
                    this.f2993y = obtainStyledAttributes.getColor(index, this.f2993y);
                } else if (index == c65.MockView_mock_showLabel) {
                    this.f2989k = obtainStyledAttributes.getBoolean(index, this.f2989k);
                }
            }
            obtainStyledAttributes.recycle();
        }
        if (this.f2990r == null) {
            try {
                this.f2990r = context.getResources().getResourceEntryName(getId());
            } catch (Exception unused) {
            }
        }
        this.f2985a.setColor(this.f2992x);
        this.f2985a.setAntiAlias(true);
        this.f2986d.setColor(this.f2993y);
        this.f2986d.setAntiAlias(true);
        this.f2987e.setColor(this.f2983A);
        this.f2984B = Math.round(((float) this.f2984B) * (getResources().getDisplayMetrics().xdpi / 160.0f));
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f2988g) {
            width--;
            height--;
            float f = (float) width;
            float f2 = (float) height;
            canvas.drawLine(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, f, f2, this.f2985a);
            Canvas canvas2 = canvas;
            float f3 = f;
            canvas2.drawLine(Utils.FLOAT_EPSILON, f2, f3, Utils.FLOAT_EPSILON, this.f2985a);
            canvas2.drawLine(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, f3, Utils.FLOAT_EPSILON, this.f2985a);
            float f4 = f;
            float f5 = f2;
            canvas2.drawLine(f4, Utils.FLOAT_EPSILON, f3, f5, this.f2985a);
            float f6 = f2;
            canvas2.drawLine(f4, f6, Utils.FLOAT_EPSILON, f5, this.f2985a);
            canvas2.drawLine(Utils.FLOAT_EPSILON, f6, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, this.f2985a);
        }
        String str = this.f2990r;
        if (str != null && this.f2989k) {
            this.f2986d.getTextBounds(str, 0, str.length(), this.f2991s);
            float width2 = ((float) (width - this.f2991s.width())) / 2.0f;
            float height2 = (((float) (height - this.f2991s.height())) / 2.0f) + ((float) this.f2991s.height());
            this.f2991s.offset((int) width2, (int) height2);
            Rect rect = this.f2991s;
            int i = rect.left;
            int i2 = this.f2984B;
            rect.set(i - i2, rect.top - i2, rect.right + i2, rect.bottom + i2);
            canvas.drawRect(this.f2991s, this.f2987e);
            canvas.drawText(this.f2990r, width2, height2, this.f2986d);
        }
    }

    public MockView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo4970a(context, attributeSet);
    }

    public MockView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo4970a(context, attributeSet);
    }
}
