package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

public class ScrimInsetsFrameLayout extends FrameLayout {

    /* renamed from: a */
    public Drawable f24006a;

    /* renamed from: d */
    public Rect f24007d;

    /* renamed from: e */
    public Rect f24008e;

    /* renamed from: g */
    public boolean f24009g;

    /* renamed from: k */
    public boolean f24010k;

    /* renamed from: com.google.android.material.internal.ScrimInsetsFrameLayout$a */
    public class C4331a implements xg4 {
        public C4331a() {
        }

        /* renamed from: a */
        public hl7 mo1158a(View view, hl7 hl7) {
            boolean z;
            ScrimInsetsFrameLayout scrimInsetsFrameLayout = ScrimInsetsFrameLayout.this;
            if (scrimInsetsFrameLayout.f24007d == null) {
                scrimInsetsFrameLayout.f24007d = new Rect();
            }
            ScrimInsetsFrameLayout.this.f24007d.set(hl7.mo21238k(), hl7.mo21240m(), hl7.mo21239l(), hl7.mo21237j());
            ScrimInsetsFrameLayout.this.mo32998a(hl7);
            ScrimInsetsFrameLayout scrimInsetsFrameLayout2 = ScrimInsetsFrameLayout.this;
            if (!hl7.mo21241n() || ScrimInsetsFrameLayout.this.f24006a == null) {
                z = true;
            } else {
                z = false;
            }
            scrimInsetsFrameLayout2.setWillNotDraw(z);
            ga7.m17767g0(ScrimInsetsFrameLayout.this);
            return hl7.mo21228c();
        }
    }

    public ScrimInsetsFrameLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public void mo32998a(hl7 hl7) {
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f24007d != null && this.f24006a != null) {
            int save = canvas.save();
            canvas.translate((float) getScrollX(), (float) getScrollY());
            if (this.f24009g) {
                this.f24008e.set(0, 0, width, this.f24007d.top);
                this.f24006a.setBounds(this.f24008e);
                this.f24006a.draw(canvas);
            }
            if (this.f24010k) {
                this.f24008e.set(0, height - this.f24007d.bottom, width, height);
                this.f24006a.setBounds(this.f24008e);
                this.f24006a.draw(canvas);
            }
            Rect rect = this.f24008e;
            Rect rect2 = this.f24007d;
            rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
            this.f24006a.setBounds(this.f24008e);
            this.f24006a.draw(canvas);
            Rect rect3 = this.f24008e;
            Rect rect4 = this.f24007d;
            rect3.set(width - rect4.right, rect4.top, width, height - rect4.bottom);
            this.f24006a.setBounds(this.f24008e);
            this.f24006a.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f24006a;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f24006a;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z) {
        this.f24010k = z;
    }

    public void setDrawTopInsetForeground(boolean z) {
        this.f24009g = z;
    }

    public void setScrimInsetForeground(Drawable drawable) {
        this.f24006a = drawable;
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24008e = new Rect();
        this.f24009g = true;
        this.f24010k = true;
        TypedArray h = wo6.m54004h(context, attributeSet, u55.ScrimInsetsFrameLayout, i, e55.Widget_Design_ScrimInsetsFrameLayout, new int[0]);
        this.f24006a = h.getDrawable(u55.ScrimInsetsFrameLayout_insetForeground);
        h.recycle();
        setWillNotDraw(true);
        ga7.m17720D0(this, new C4331a());
    }
}
