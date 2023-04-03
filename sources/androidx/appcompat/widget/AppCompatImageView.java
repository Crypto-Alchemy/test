package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

public class AppCompatImageView extends ImageView {
    private final C3155qm mBackgroundTintHelper;
    private boolean mHasLevel;
    private final C2183dn mImageHelper;

    public AppCompatImageView(Context context) {
        this(context, (AttributeSet) null);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C3155qm qmVar = this.mBackgroundTintHelper;
        if (qmVar != null) {
            qmVar.mo25144b();
        }
        C2183dn dnVar = this.mImageHelper;
        if (dnVar != null) {
            dnVar.mo18853c();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C3155qm qmVar = this.mBackgroundTintHelper;
        if (qmVar != null) {
            return qmVar.mo25145c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C3155qm qmVar = this.mBackgroundTintHelper;
        if (qmVar != null) {
            return qmVar.mo25146d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C2183dn dnVar = this.mImageHelper;
        if (dnVar != null) {
            return dnVar.mo18854d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C2183dn dnVar = this.mImageHelper;
        if (dnVar != null) {
            return dnVar.mo18855e();
        }
        return null;
    }

    public boolean hasOverlappingRendering() {
        if (!this.mImageHelper.mo18856f() || !super.hasOverlappingRendering()) {
            return false;
        }
        return true;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C3155qm qmVar = this.mBackgroundTintHelper;
        if (qmVar != null) {
            qmVar.mo25148f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C3155qm qmVar = this.mBackgroundTintHelper;
        if (qmVar != null) {
            qmVar.mo25149g(i);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C2183dn dnVar = this.mImageHelper;
        if (dnVar != null) {
            dnVar.mo18853c();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        C2183dn dnVar = this.mImageHelper;
        if (!(dnVar == null || drawable == null || this.mHasLevel)) {
            dnVar.mo18858h(drawable);
        }
        super.setImageDrawable(drawable);
        C2183dn dnVar2 = this.mImageHelper;
        if (dnVar2 != null) {
            dnVar2.mo18853c();
            if (!this.mHasLevel) {
                this.mImageHelper.mo18852b();
            }
        }
    }

    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.mHasLevel = true;
    }

    public void setImageResource(int i) {
        C2183dn dnVar = this.mImageHelper;
        if (dnVar != null) {
            dnVar.mo18859i(i);
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C2183dn dnVar = this.mImageHelper;
        if (dnVar != null) {
            dnVar.mo18853c();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C3155qm qmVar = this.mBackgroundTintHelper;
        if (qmVar != null) {
            qmVar.mo25151i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C3155qm qmVar = this.mBackgroundTintHelper;
        if (qmVar != null) {
            qmVar.mo25152j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C2183dn dnVar = this.mImageHelper;
        if (dnVar != null) {
            dnVar.mo18860j(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C2183dn dnVar = this.mImageHelper;
        if (dnVar != null) {
            dnVar.mo18861k(mode);
        }
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet, int i) {
        super(vq6.m29075b(context), attributeSet, i);
        this.mHasLevel = false;
        xo6.m30262a(this, getContext());
        C3155qm qmVar = new C3155qm(this);
        this.mBackgroundTintHelper = qmVar;
        qmVar.mo25147e(attributeSet, i);
        C2183dn dnVar = new C2183dn(this);
        this.mImageHelper = dnVar;
        dnVar.mo18857g(attributeSet, i);
    }
}
