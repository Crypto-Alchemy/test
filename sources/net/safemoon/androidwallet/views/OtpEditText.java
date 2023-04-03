package net.safemoon.androidwallet.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import com.github.mikephil.charting.utils.Utils;
import net.safemoon.androidwallet.R;

public class OtpEditText extends AppCompatEditText {

    /* renamed from: A */
    public float f43255A = 2.0f;

    /* renamed from: B */
    public Paint f43256B;

    /* renamed from: C */
    public View.OnClickListener f43257C;

    /* renamed from: r */
    public float f43258r = 24.0f;

    /* renamed from: s */
    public float f43259s = 6.0f;

    /* renamed from: x */
    public float f43260x = 8.0f;

    /* renamed from: y */
    public int f43261y = 6;

    public OtpEditText(Context context) {
        super(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m69570f(View view) {
        setSelection(getText().length());
        View.OnClickListener onClickListener = this.f43257C;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    /* renamed from: e */
    public final void mo62135e(Context context, AttributeSet attributeSet) {
        float f = context.getResources().getDisplayMetrics().density;
        this.f43255A *= f;
        Paint paint = new Paint(getPaint());
        this.f43256B = paint;
        paint.setStrokeWidth(this.f43255A);
        this.f43256B.setColor(zr0.m31440c(getContext(), R.color.curve_green));
        setBackgroundResource(0);
        this.f43258r *= f;
        this.f43260x = f * this.f43260x;
        this.f43259s = (float) this.f43261y;
        super.setOnClickListener(new dj4(this));
    }

    public void onDraw(Canvas canvas) {
        float f;
        int i;
        float f2;
        int width = (getWidth() - getPaddingRight()) - getPaddingLeft();
        float f3 = this.f43258r;
        if (f3 < Utils.FLOAT_EPSILON) {
            f = ((float) width) / ((this.f43259s * 2.0f) - 1.0f);
        } else {
            float f4 = this.f43259s;
            f = (((float) width) - (f3 * (f4 - 1.0f))) / f4;
        }
        int paddingLeft = getPaddingLeft();
        int height = getHeight() - getPaddingBottom();
        Editable text = getText();
        int length = text.length();
        float[] fArr = new float[length];
        getPaint().getTextWidths(getText(), 0, length, fArr);
        getPaint().setColor(zr0.m31440c(getContext(), R.color.t1));
        int i2 = 0;
        while (((float) i2) < this.f43259s) {
            float f5 = (float) paddingLeft;
            float f6 = (float) height;
            canvas.drawLine(f5, f6, f5 + f, f6, this.f43256B);
            if (getText().length() > i2) {
                i = i2;
                canvas.drawText(text, i2, i2 + 1, ((f / 2.0f) + f5) - (fArr[0] / 2.0f), f6 - this.f43260x, getPaint());
            } else {
                i = i2;
            }
            float f7 = this.f43258r;
            if (f7 < Utils.FLOAT_EPSILON) {
                f2 = f * 2.0f;
            } else {
                f2 = f7 + f;
            }
            paddingLeft = (int) (f5 + f2);
            i2 = i + 1;
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        throw new RuntimeException("setCustomSelectionActionModeCallback() not supported.");
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f43257C = onClickListener;
    }

    public OtpEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo62135e(context, attributeSet);
    }

    public OtpEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo62135e(context, attributeSet);
    }
}
