package com.google.android.material.circularreveal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.android.material.circularreveal.C4247c;

public class CircularRevealLinearLayout extends LinearLayout implements C4247c {

    /* renamed from: a */
    public final C4245b f23688a;

    public CircularRevealLinearLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public void mo32425a() {
        this.f23688a.mo32448a();
    }

    /* renamed from: b */
    public void mo32426b() {
        this.f23688a.mo32449b();
    }

    /* renamed from: c */
    public void mo32427c(Canvas canvas) {
        super.draw(canvas);
    }

    /* renamed from: d */
    public boolean mo32428d() {
        return super.isOpaque();
    }

    public void draw(Canvas canvas) {
        C4245b bVar = this.f23688a;
        if (bVar != null) {
            bVar.mo32450c(canvas);
        } else {
            super.draw(canvas);
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return this.f23688a.mo32452e();
    }

    public int getCircularRevealScrimColor() {
        return this.f23688a.mo32453f();
    }

    public C4247c.C4252e getRevealInfo() {
        return this.f23688a.mo32455h();
    }

    public boolean isOpaque() {
        C4245b bVar = this.f23688a;
        if (bVar != null) {
            return bVar.mo32457j();
        }
        return super.isOpaque();
    }

    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f23688a.mo32458k(drawable);
    }

    public void setCircularRevealScrimColor(int i) {
        this.f23688a.mo32459l(i);
    }

    public void setRevealInfo(C4247c.C4252e eVar) {
        this.f23688a.mo32460m(eVar);
    }

    public CircularRevealLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23688a = new C4245b(this);
    }
}
