package net.safemoon.androidwallet.views.editText.autoSize;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.TypedValue;
import androidx.appcompat.widget.AppCompatEditText;
import com.github.mikephil.charting.utils.Utils;

public class AutoSizeEditText extends AppCompatEditText {

    /* renamed from: A */
    public float f43274A;

    /* renamed from: B */
    public float f43275B;

    /* renamed from: C */
    public Float f43276C;

    /* renamed from: H */
    public int f43277H;

    /* renamed from: I */
    public int f43278I;

    /* renamed from: L */
    public boolean f43279L;

    /* renamed from: M */
    public boolean f43280M;

    /* renamed from: P */
    public TextPaint f43281P;

    /* renamed from: r */
    public final RectF f43282r;

    /* renamed from: s */
    public final SparseIntArray f43283s;

    /* renamed from: x */
    public final C8949b f43284x;

    /* renamed from: y */
    public float f43285y;

    /* renamed from: net.safemoon.androidwallet.views.editText.autoSize.AutoSizeEditText$a */
    public class C8948a implements C8949b {

        /* renamed from: a */
        public final RectF f43286a = new RectF();

        public C8948a() {
        }

        @TargetApi(16)
        /* renamed from: a */
        public int mo62165a(int i, RectF rectF) {
            boolean z;
            AutoSizeEditText.this.f43281P.setTextSize((float) i);
            String obj = AutoSizeEditText.this.getText().toString();
            if (AutoSizeEditText.this.getMaxLines() == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f43286a.bottom = AutoSizeEditText.this.f43281P.getFontSpacing();
                this.f43286a.right = AutoSizeEditText.this.f43281P.measureText(obj);
            } else {
                StaticLayout staticLayout = new StaticLayout(obj, AutoSizeEditText.this.f43281P, AutoSizeEditText.this.f43277H, Layout.Alignment.ALIGN_NORMAL, AutoSizeEditText.this.f43274A, AutoSizeEditText.this.f43275B, true);
                if (AutoSizeEditText.this.getMaxLines() != -1 && staticLayout.getLineCount() > AutoSizeEditText.this.getMaxLines()) {
                    return 1;
                }
                this.f43286a.bottom = (float) staticLayout.getHeight();
                int i2 = -1;
                for (int i3 = 0; i3 < staticLayout.getLineCount(); i3++) {
                    if (((float) i2) < staticLayout.getLineWidth(i3)) {
                        i2 = (int) staticLayout.getLineWidth(i3);
                    }
                }
                this.f43286a.right = (float) i2;
            }
            this.f43286a.offsetTo(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
            if (rectF.contains(this.f43286a)) {
                return -1;
            }
            return 1;
        }
    }

    /* renamed from: net.safemoon.androidwallet.views.editText.autoSize.AutoSizeEditText$b */
    public interface C8949b {
        /* renamed from: a */
        int mo62165a(int i, RectF rectF);
    }

    public AutoSizeEditText(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    public int getMaxLines() {
        return this.f43278I;
    }

    public Float get_minTextSize() {
        return this.f43276C;
    }

    /* renamed from: h */
    public final void mo62149h() {
        if (this.f43280M) {
            int round = Math.round(this.f43276C.floatValue());
            int measuredHeight = (getMeasuredHeight() - getCompoundPaddingBottom()) - getCompoundPaddingTop();
            int measuredWidth = (getMeasuredWidth() - getCompoundPaddingLeft()) - getCompoundPaddingRight();
            this.f43277H = measuredWidth;
            if (measuredWidth > 0) {
                RectF rectF = this.f43282r;
                rectF.right = (float) measuredWidth;
                rectF.bottom = (float) measuredHeight;
                super.setTextSize(0, (float) mo62151j(round, (int) this.f43285y, this.f43284x, rectF));
            }
        }
    }

    /* renamed from: i */
    public final int mo62150i(int i, int i2, C8949b bVar, RectF rectF) {
        int i3 = i2 - 1;
        int i4 = i;
        while (i <= i3) {
            i4 = (i + i3) >>> 1;
            int a = bVar.mo62165a(i4, rectF);
            if (a >= 0) {
                if (a <= 0) {
                    break;
                }
                i4--;
                i3 = i4;
            } else {
                int i5 = i4 + 1;
                i4 = i;
                i = i5;
            }
        }
        return i4;
    }

    /* renamed from: j */
    public final int mo62151j(int i, int i2, C8949b bVar, RectF rectF) {
        int i3;
        if (!this.f43279L) {
            return mo62150i(i, i2, bVar, rectF);
        }
        String obj = getText().toString();
        if (obj == null) {
            i3 = 0;
        } else {
            i3 = obj.length();
        }
        int i4 = this.f43283s.get(i3);
        if (i4 != 0) {
            return i4;
        }
        int i5 = mo62150i(i, i2, bVar, rectF);
        this.f43283s.put(i3, i5);
        return i5;
    }

    /* renamed from: k */
    public final void mo62152k() {
        mo62149h();
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        this.f43283s.clear();
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            mo62152k();
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        mo62152k();
    }

    public void setEnableSizeCache(boolean z) {
        this.f43279L = z;
        this.f43283s.clear();
        mo62149h();
    }

    public void setLineSpacing(float f, float f2) {
        super.setLineSpacing(f, f2);
        this.f43274A = f2;
        this.f43275B = f;
    }

    public void setLines(int i) {
        super.setLines(i);
        this.f43278I = i;
        mo62152k();
    }

    public void setMaxLines(int i) {
        super.setMaxLines(i);
        this.f43278I = i;
        mo62152k();
    }

    public void setMinTextSize(Float f) {
        this.f43276C = f;
        mo62152k();
    }

    public void setSingleLine() {
        super.setSingleLine();
        this.f43278I = 1;
        mo62152k();
    }

    public void setTextSize(float f) {
        this.f43285y = f;
        this.f43283s.clear();
        mo62149h();
    }

    public void setTypeface(Typeface typeface) {
        if (this.f43281P == null) {
            this.f43281P = new TextPaint(getPaint());
        }
        this.f43281P.setTypeface(typeface);
        super.setTypeface(typeface);
    }

    public AutoSizeEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AutoSizeEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f43282r = new RectF();
        this.f43283s = new SparseIntArray();
        this.f43274A = 1.0f;
        this.f43275B = Utils.FLOAT_EPSILON;
        this.f43279L = true;
        this.f43276C = Float.valueOf(TypedValue.applyDimension(2, 12.0f, getResources().getDisplayMetrics()));
        this.f43285y = getTextSize();
        if (this.f43278I == 0) {
            this.f43278I = -1;
        }
        this.f43284x = new C8948a();
        this.f43280M = true;
    }

    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
        if (z) {
            this.f43278I = 1;
        } else {
            this.f43278I = -1;
        }
        mo62152k();
    }

    public void setTextSize(int i, float f) {
        Resources resources;
        Context context = getContext();
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        this.f43285y = TypedValue.applyDimension(i, f, resources.getDisplayMetrics());
        this.f43283s.clear();
        mo62149h();
    }
}
