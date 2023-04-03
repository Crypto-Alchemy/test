package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;

public class AppCompatImageButton extends ImageButton {

    /* renamed from: a */
    public final C3155qm f1025a;

    /* renamed from: d */
    public final C2183dn f1026d;

    /* renamed from: e */
    public boolean f1027e;

    public AppCompatImageButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C3155qm qmVar = this.f1025a;
        if (qmVar != null) {
            qmVar.mo25144b();
        }
        C2183dn dnVar = this.f1026d;
        if (dnVar != null) {
            dnVar.mo18853c();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C3155qm qmVar = this.f1025a;
        if (qmVar != null) {
            return qmVar.mo25145c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C3155qm qmVar = this.f1025a;
        if (qmVar != null) {
            return qmVar.mo25146d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C2183dn dnVar = this.f1026d;
        if (dnVar != null) {
            return dnVar.mo18854d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C2183dn dnVar = this.f1026d;
        if (dnVar != null) {
            return dnVar.mo18855e();
        }
        return null;
    }

    public boolean hasOverlappingRendering() {
        if (!this.f1026d.mo18856f() || !super.hasOverlappingRendering()) {
            return false;
        }
        return true;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C3155qm qmVar = this.f1025a;
        if (qmVar != null) {
            qmVar.mo25148f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C3155qm qmVar = this.f1025a;
        if (qmVar != null) {
            qmVar.mo25149g(i);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C2183dn dnVar = this.f1026d;
        if (dnVar != null) {
            dnVar.mo18853c();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        C2183dn dnVar = this.f1026d;
        if (!(dnVar == null || drawable == null || this.f1027e)) {
            dnVar.mo18858h(drawable);
        }
        super.setImageDrawable(drawable);
        C2183dn dnVar2 = this.f1026d;
        if (dnVar2 != null) {
            dnVar2.mo18853c();
            if (!this.f1027e) {
                this.f1026d.mo18852b();
            }
        }
    }

    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f1027e = true;
    }

    public void setImageResource(int i) {
        this.f1026d.mo18859i(i);
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C2183dn dnVar = this.f1026d;
        if (dnVar != null) {
            dnVar.mo18853c();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C3155qm qmVar = this.f1025a;
        if (qmVar != null) {
            qmVar.mo25151i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C3155qm qmVar = this.f1025a;
        if (qmVar != null) {
            qmVar.mo25152j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C2183dn dnVar = this.f1026d;
        if (dnVar != null) {
            dnVar.mo18860j(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C2183dn dnVar = this.f1026d;
        if (dnVar != null) {
            dnVar.mo18861k(mode);
        }
    }

    public AppCompatImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, m15.imageButtonStyle);
    }

    public AppCompatImageButton(Context context, AttributeSet attributeSet, int i) {
        super(vq6.m29075b(context), attributeSet, i);
        this.f1027e = false;
        xo6.m30262a(this, getContext());
        C3155qm qmVar = new C3155qm(this);
        this.f1025a = qmVar;
        qmVar.mo25147e(attributeSet, i);
        C2183dn dnVar = new C2183dn(this);
        this.f1026d = dnVar;
        dnVar.mo18857g(attributeSet, i);
    }
}
