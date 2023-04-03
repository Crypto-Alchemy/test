package com.google.android.material.circularreveal.cardview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.circularreveal.C4245b;
import com.google.android.material.circularreveal.C4247c;

public class CircularRevealCardView extends MaterialCardView implements C4247c {

    /* renamed from: U */
    public final C4245b f23708U;

    public CircularRevealCardView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public void mo32425a() {
        this.f23708U.mo32448a();
    }

    /* renamed from: b */
    public void mo32426b() {
        this.f23708U.mo32449b();
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
        C4245b bVar = this.f23708U;
        if (bVar != null) {
            bVar.mo32450c(canvas);
        } else {
            super.draw(canvas);
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return this.f23708U.mo32452e();
    }

    public int getCircularRevealScrimColor() {
        return this.f23708U.mo32453f();
    }

    public C4247c.C4252e getRevealInfo() {
        return this.f23708U.mo32455h();
    }

    public boolean isOpaque() {
        C4245b bVar = this.f23708U;
        if (bVar != null) {
            return bVar.mo32457j();
        }
        return super.isOpaque();
    }

    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f23708U.mo32458k(drawable);
    }

    public void setCircularRevealScrimColor(int i) {
        this.f23708U.mo32459l(i);
    }

    public void setRevealInfo(C4247c.C4252e eVar) {
        this.f23708U.mo32460m(eVar);
    }

    public CircularRevealCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23708U = new C4245b(this);
    }
}
