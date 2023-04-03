package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import p000.C2346g9;

public abstract class ActionBar {

    /* renamed from: androidx.appcompat.app.ActionBar$a */
    public interface C0110a {
        void onMenuVisibilityChanged(boolean z);
    }

    @Deprecated
    /* renamed from: androidx.appcompat.app.ActionBar$b */
    public static abstract class C0111b {
        /* renamed from: a */
        public abstract CharSequence mo975a();

        /* renamed from: b */
        public abstract View mo976b();

        /* renamed from: c */
        public abstract Drawable mo977c();

        /* renamed from: d */
        public abstract CharSequence mo978d();

        /* renamed from: e */
        public abstract void mo979e();
    }

    /* renamed from: g */
    public boolean mo954g() {
        return false;
    }

    /* renamed from: h */
    public abstract boolean mo955h();

    /* renamed from: i */
    public abstract void mo956i(boolean z);

    /* renamed from: j */
    public abstract int mo957j();

    /* renamed from: k */
    public abstract Context mo958k();

    /* renamed from: l */
    public abstract void mo959l();

    /* renamed from: m */
    public boolean mo960m() {
        return false;
    }

    /* renamed from: n */
    public void mo961n(Configuration configuration) {
    }

    /* renamed from: o */
    public void mo962o() {
    }

    /* renamed from: p */
    public abstract boolean mo963p(int i, KeyEvent keyEvent);

    /* renamed from: q */
    public boolean mo964q(KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: r */
    public boolean mo965r() {
        return false;
    }

    /* renamed from: s */
    public abstract void mo966s(boolean z);

    /* renamed from: t */
    public abstract void mo967t(boolean z);

    /* renamed from: u */
    public abstract void mo968u(int i);

    /* renamed from: v */
    public abstract void mo969v(Drawable drawable);

    /* renamed from: w */
    public abstract void mo970w(boolean z);

    /* renamed from: x */
    public abstract void mo971x(CharSequence charSequence);

    /* renamed from: y */
    public abstract void mo972y(CharSequence charSequence);

    /* renamed from: z */
    public C2346g9 mo973z(C2346g9.C2347a aVar) {
        return null;
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f400a = 8388627;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j65.ActionBarLayout);
            this.f400a = obtainStyledAttributes.getInt(j65.ActionBarLayout_android_layout_gravity, 0);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.f400a = layoutParams.f400a;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
