package com.google.android.gms.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zaaa;
import com.google.android.gms.dynamic.RemoteCreator;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class SignInButton extends FrameLayout implements View.OnClickListener {

    /* renamed from: a */
    public int f22160a;

    /* renamed from: d */
    public int f22161d;

    /* renamed from: e */
    public View f22162e;

    /* renamed from: g */
    public View.OnClickListener f22163g;

    public SignInButton(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public final void mo30476a(Context context) {
        View view = this.f22162e;
        if (view != null) {
            removeView(view);
        }
        try {
            this.f22162e = z38.m54981c(context, this.f22160a, this.f22161d);
        } catch (RemoteCreator.RemoteCreatorException unused) {
            int i = this.f22160a;
            int i2 = this.f22161d;
            zaaa zaaa = new zaaa(context, (AttributeSet) null);
            zaaa.mo30663a(context.getResources(), i, i2);
            this.f22162e = zaaa;
        }
        addView(this.f22162e);
        this.f22162e.setEnabled(isEnabled());
        this.f22162e.setOnClickListener(this);
    }

    public void onClick(View view) {
        View.OnClickListener onClickListener = this.f22163g;
        if (onClickListener != null && view == this.f22162e) {
            onClickListener.onClick(this);
        }
    }

    public void setColorScheme(int i) {
        setStyle(this.f22160a, i);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f22162e.setEnabled(z);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f22163g = onClickListener;
        View view = this.f22162e;
        if (view != null) {
            view.setOnClickListener(this);
        }
    }

    @Deprecated
    public void setScopes(Scope[] scopeArr) {
        setStyle(this.f22160a, this.f22161d);
    }

    public void setSize(int i) {
        setStyle(i, this.f22161d);
    }

    public void setStyle(int i, int i2) {
        this.f22160a = i;
        this.f22161d = i2;
        mo30476a(getContext());
    }

    public SignInButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Deprecated
    public void setStyle(int i, int i2, Scope[] scopeArr) {
        setStyle(i, i2);
    }

    /* JADX INFO: finally extract failed */
    public SignInButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22163g = null;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, t55.SignInButton, 0, 0);
        try {
            this.f22160a = obtainStyledAttributes.getInt(t55.SignInButton_buttonSize, 0);
            this.f22161d = obtainStyledAttributes.getInt(t55.SignInButton_colorScheme, 2);
            obtainStyledAttributes.recycle();
            setStyle(this.f22160a, this.f22161d);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
