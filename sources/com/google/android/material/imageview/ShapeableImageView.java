package com.google.android.material.imageview;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatImageView;
import com.github.mikephil.charting.utils.Utils;

public class ShapeableImageView extends AppCompatImageView implements vz5 {

    /* renamed from: U */
    public static final int f23956U = e55.Widget_MaterialComponents_ShapeableImageView;

    /* renamed from: A */
    public float f23957A;

    /* renamed from: B */
    public Path f23958B;

    /* renamed from: C */
    public int f23959C;

    /* renamed from: H */
    public int f23960H;

    /* renamed from: I */
    public int f23961I;

    /* renamed from: L */
    public int f23962L;

    /* renamed from: M */
    public int f23963M;

    /* renamed from: P */
    public int f23964P;

    /* renamed from: Q */
    public boolean f23965Q;

    /* renamed from: a */
    public final sz5 f23966a;

    /* renamed from: d */
    public final RectF f23967d;

    /* renamed from: e */
    public final RectF f23968e;

    /* renamed from: g */
    public final Paint f23969g;

    /* renamed from: k */
    public final Paint f23970k;

    /* renamed from: r */
    public final Path f23971r;

    /* renamed from: s */
    public ColorStateList f23972s;

    /* renamed from: x */
    public uo3 f23973x;

    /* renamed from: y */
    public rz5 f23974y;

    @TargetApi(21)
    /* renamed from: com.google.android.material.imageview.ShapeableImageView$a */
    public class C4324a extends ViewOutlineProvider {

        /* renamed from: a */
        public final Rect f23975a = new Rect();

        public C4324a() {
        }

        public void getOutline(View view, Outline outline) {
            if (ShapeableImageView.this.f23974y != null) {
                if (ShapeableImageView.this.f23973x == null) {
                    uo3 unused = ShapeableImageView.this.f23973x = new uo3(ShapeableImageView.this.f23974y);
                }
                ShapeableImageView.this.f23967d.round(this.f23975a);
                ShapeableImageView.this.f23973x.setBounds(this.f23975a);
                ShapeableImageView.this.f23973x.getOutline(outline);
            }
        }
    }

    public ShapeableImageView(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    /* renamed from: g */
    public final void mo32887g(Canvas canvas) {
        if (this.f23972s != null) {
            this.f23969g.setStrokeWidth(this.f23957A);
            int colorForState = this.f23972s.getColorForState(getDrawableState(), this.f23972s.getDefaultColor());
            if (this.f23957A > Utils.FLOAT_EPSILON && colorForState != 0) {
                this.f23969g.setColor(colorForState);
                canvas.drawPath(this.f23971r, this.f23969g);
            }
        }
    }

    public int getContentPaddingBottom() {
        return this.f23962L;
    }

    public final int getContentPaddingEnd() {
        int i = this.f23964P;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        if (mo32904i()) {
            return this.f23959C;
        }
        return this.f23961I;
    }

    public int getContentPaddingLeft() {
        int i;
        int i2;
        if (mo32903h()) {
            if (mo32904i() && (i2 = this.f23964P) != Integer.MIN_VALUE) {
                return i2;
            }
            if (!mo32904i() && (i = this.f23963M) != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.f23959C;
    }

    public int getContentPaddingRight() {
        int i;
        int i2;
        if (mo32903h()) {
            if (mo32904i() && (i2 = this.f23963M) != Integer.MIN_VALUE) {
                return i2;
            }
            if (!mo32904i() && (i = this.f23964P) != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.f23961I;
    }

    public final int getContentPaddingStart() {
        int i = this.f23963M;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        if (mo32904i()) {
            return this.f23961I;
        }
        return this.f23959C;
    }

    public int getContentPaddingTop() {
        return this.f23960H;
    }

    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    public rz5 getShapeAppearanceModel() {
        return this.f23974y;
    }

    public ColorStateList getStrokeColor() {
        return this.f23972s;
    }

    public float getStrokeWidth() {
        return this.f23957A;
    }

    /* renamed from: h */
    public final boolean mo32903h() {
        if (this.f23963M == Integer.MIN_VALUE && this.f23964P == Integer.MIN_VALUE) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public final boolean mo32904i() {
        if (getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final void mo32905j(int i, int i2) {
        this.f23967d.set((float) getPaddingLeft(), (float) getPaddingTop(), (float) (i - getPaddingRight()), (float) (i2 - getPaddingBottom()));
        this.f23966a.mo47940e(this.f23974y, 1.0f, this.f23967d, this.f23971r);
        this.f23958B.rewind();
        this.f23958B.addPath(this.f23971r);
        this.f23968e.set(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) i, (float) i2);
        this.f23958B.addRect(this.f23968e, Path.Direction.CCW);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setLayerType(2, (Paint) null);
    }

    public void onDetachedFromWindow() {
        setLayerType(0, (Paint) null);
        super.onDetachedFromWindow();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f23958B, this.f23970k);
        mo32887g(canvas);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.f23965Q && isLayoutDirectionResolved()) {
            this.f23965Q = true;
            if (isPaddingRelative() || mo32903h()) {
                setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
            } else {
                setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
            }
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        mo32905j(i, i2);
    }

    public void setContentPadding(int i, int i2, int i3, int i4) {
        this.f23963M = Integer.MIN_VALUE;
        this.f23964P = Integer.MIN_VALUE;
        super.setPadding((super.getPaddingLeft() - this.f23959C) + i, (super.getPaddingTop() - this.f23960H) + i2, (super.getPaddingRight() - this.f23961I) + i3, (super.getPaddingBottom() - this.f23962L) + i4);
        this.f23959C = i;
        this.f23960H = i2;
        this.f23961I = i3;
        this.f23962L = i4;
    }

    public void setContentPaddingRelative(int i, int i2, int i3, int i4) {
        int i5;
        super.setPaddingRelative((super.getPaddingStart() - getContentPaddingStart()) + i, (super.getPaddingTop() - this.f23960H) + i2, (super.getPaddingEnd() - getContentPaddingEnd()) + i3, (super.getPaddingBottom() - this.f23962L) + i4);
        if (mo32904i()) {
            i5 = i3;
        } else {
            i5 = i;
        }
        this.f23959C = i5;
        this.f23960H = i2;
        if (!mo32904i()) {
            i = i3;
        }
        this.f23961I = i;
        this.f23962L = i4;
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i + getContentPaddingLeft(), i2 + getContentPaddingTop(), i3 + getContentPaddingRight(), i4 + getContentPaddingBottom());
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i + getContentPaddingStart(), i2 + getContentPaddingTop(), i3 + getContentPaddingEnd(), i4 + getContentPaddingBottom());
    }

    public void setShapeAppearanceModel(rz5 rz5) {
        this.f23974y = rz5;
        uo3 uo3 = this.f23973x;
        if (uo3 != null) {
            uo3.setShapeAppearanceModel(rz5);
        }
        mo32905j(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f23972s = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(int i) {
        setStrokeColor(C2554in.m19713a(getContext(), i));
    }

    public void setStrokeWidth(float f) {
        if (this.f23957A != f) {
            this.f23957A = f;
            invalidate();
        }
    }

    public void setStrokeWidthResource(int i) {
        setStrokeWidth((float) getResources().getDimensionPixelSize(i));
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ShapeableImageView(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r0 = f23956U
            android.content.Context r7 = p000.xo3.m54461c(r7, r8, r9, r0)
            r6.<init>(r7, r8, r9)
            sz5 r7 = p000.sz5.m52000k()
            r6.f23966a = r7
            android.graphics.Path r7 = new android.graphics.Path
            r7.<init>()
            r6.f23971r = r7
            r7 = 0
            r6.f23965Q = r7
            android.content.Context r1 = r6.getContext()
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r6.f23970k = r2
            r3 = 1
            r2.setAntiAlias(r3)
            r4 = -1
            r2.setColor(r4)
            android.graphics.PorterDuffXfermode r4 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r5 = android.graphics.PorterDuff.Mode.DST_OUT
            r4.<init>(r5)
            r2.setXfermode(r4)
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            r6.f23967d = r2
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            r6.f23968e = r2
            android.graphics.Path r2 = new android.graphics.Path
            r2.<init>()
            r6.f23958B = r2
            int[] r2 = p000.u55.ShapeableImageView
            android.content.res.TypedArray r2 = r1.obtainStyledAttributes(r8, r2, r9, r0)
            int r4 = p000.u55.ShapeableImageView_strokeColor
            android.content.res.ColorStateList r4 = p000.to3.m52391b(r1, r2, r4)
            r6.f23972s = r4
            int r4 = p000.u55.ShapeableImageView_strokeWidth
            int r4 = r2.getDimensionPixelSize(r4, r7)
            float r4 = (float) r4
            r6.f23957A = r4
            int r4 = p000.u55.ShapeableImageView_contentPadding
            int r7 = r2.getDimensionPixelSize(r4, r7)
            r6.f23959C = r7
            r6.f23960H = r7
            r6.f23961I = r7
            r6.f23962L = r7
            int r4 = p000.u55.ShapeableImageView_contentPaddingLeft
            int r4 = r2.getDimensionPixelSize(r4, r7)
            r6.f23959C = r4
            int r4 = p000.u55.ShapeableImageView_contentPaddingTop
            int r4 = r2.getDimensionPixelSize(r4, r7)
            r6.f23960H = r4
            int r4 = p000.u55.ShapeableImageView_contentPaddingRight
            int r4 = r2.getDimensionPixelSize(r4, r7)
            r6.f23961I = r4
            int r4 = p000.u55.ShapeableImageView_contentPaddingBottom
            int r7 = r2.getDimensionPixelSize(r4, r7)
            r6.f23962L = r7
            int r7 = p000.u55.ShapeableImageView_contentPaddingStart
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            int r7 = r2.getDimensionPixelSize(r7, r4)
            r6.f23963M = r7
            int r7 = p000.u55.ShapeableImageView_contentPaddingEnd
            int r7 = r2.getDimensionPixelSize(r7, r4)
            r6.f23964P = r7
            r2.recycle()
            android.graphics.Paint r7 = new android.graphics.Paint
            r7.<init>()
            r6.f23969g = r7
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE
            r7.setStyle(r2)
            r7.setAntiAlias(r3)
            rz5$b r7 = p000.rz5.m51450e(r1, r8, r9, r0)
            rz5 r7 = r7.mo47599m()
            r6.f23974y = r7
            com.google.android.material.imageview.ShapeableImageView$a r7 = new com.google.android.material.imageview.ShapeableImageView$a
            r7.<init>()
            r6.setOutlineProvider(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.imageview.ShapeableImageView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
