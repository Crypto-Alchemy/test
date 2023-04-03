package com.facebook.drawee.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.facebook.drawee.view.C1935a;
import com.github.mikephil.charting.utils.Utils;
import p000.bk1;
import p000.hf4;

public class DraweeView<DH extends bk1> extends ImageView {

    /* renamed from: r */
    public static boolean f9575r = false;

    /* renamed from: a */
    public final C1935a.C1936a f9576a = new C1935a.C1936a();

    /* renamed from: d */
    public float f9577d = Utils.FLOAT_EPSILON;

    /* renamed from: e */
    public ck1<DH> f9578e;

    /* renamed from: g */
    public boolean f9579g = false;

    /* renamed from: k */
    public boolean f9580k = false;

    public DraweeView(Context context) {
        super(context);
        mo13273c(context);
    }

    public static void setGlobalLegacyVisibilityHandlingEnabled(boolean z) {
        f9575r = z;
    }

    /* renamed from: a */
    public void mo13271a() {
        this.f9578e.mo12085j();
    }

    /* renamed from: b */
    public void mo13272b() {
        this.f9578e.mo12086k();
    }

    /* renamed from: c */
    public final void mo13273c(Context context) {
        try {
            if (lc2.m21369d()) {
                lc2.m21366a("DraweeView#init");
            }
            if (!this.f9579g) {
                boolean z = true;
                this.f9579g = true;
                this.f9578e = ck1.m11899d(null, context);
                ColorStateList imageTintList = getImageTintList();
                if (imageTintList != null) {
                    setColorFilter(imageTintList.getDefaultColor());
                    if (!f9575r || context.getApplicationInfo().targetSdkVersion < 24) {
                        z = false;
                    }
                    this.f9580k = z;
                    if (lc2.m21369d()) {
                        lc2.m21367b();
                    }
                } else if (lc2.m21369d()) {
                    lc2.m21367b();
                }
            }
        } finally {
            if (lc2.m21369d()) {
                lc2.m21367b();
            }
        }
    }

    /* renamed from: d */
    public final void mo13274d() {
        Drawable drawable;
        boolean z;
        if (this.f9580k && (drawable = getDrawable()) != null) {
            if (getVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            drawable.setVisible(z, false);
        }
    }

    /* renamed from: e */
    public void mo13275e() {
        mo13271a();
    }

    /* renamed from: f */
    public void mo13276f() {
        mo13272b();
    }

    public float getAspectRatio() {
        return this.f9577d;
    }

    public ak1 getController() {
        return this.f9578e.mo12081f();
    }

    public DH getHierarchy() {
        return this.f9578e.mo12082g();
    }

    public Drawable getTopLevelDrawable() {
        return this.f9578e.mo12083h();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo13274d();
        mo13275e();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo13274d();
        mo13276f();
    }

    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        mo13274d();
        mo13275e();
    }

    public void onMeasure(int i, int i2) {
        C1935a.C1936a aVar = this.f9576a;
        aVar.f9583a = i;
        aVar.f9584b = i2;
        C1935a.m13428b(aVar, this.f9577d, getLayoutParams(), getPaddingLeft() + getPaddingRight(), getPaddingTop() + getPaddingBottom());
        C1935a.C1936a aVar2 = this.f9576a;
        super.onMeasure(aVar2.f9583a, aVar2.f9584b);
    }

    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        mo13274d();
        mo13276f();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f9578e.mo12087l(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        mo13274d();
    }

    public void setAspectRatio(float f) {
        if (f != this.f9577d) {
            this.f9577d = f;
            requestLayout();
        }
    }

    public void setController(ak1 ak1) {
        this.f9578e.mo12089n(ak1);
        super.setImageDrawable(this.f9578e.mo12083h());
    }

    public void setHierarchy(DH dh) {
        this.f9578e.mo12090o(dh);
        super.setImageDrawable(this.f9578e.mo12083h());
    }

    @Deprecated
    public void setImageBitmap(Bitmap bitmap) {
        mo13273c(getContext());
        this.f9578e.mo12089n((ak1) null);
        super.setImageBitmap(bitmap);
    }

    @Deprecated
    public void setImageDrawable(Drawable drawable) {
        mo13273c(getContext());
        this.f9578e.mo12089n((ak1) null);
        super.setImageDrawable(drawable);
    }

    @Deprecated
    public void setImageResource(int i) {
        mo13273c(getContext());
        this.f9578e.mo12089n((ak1) null);
        super.setImageResource(i);
    }

    @Deprecated
    public void setImageURI(Uri uri) {
        mo13273c(getContext());
        this.f9578e.mo12089n((ak1) null);
        super.setImageURI(uri);
    }

    public void setLegacyVisibilityHandlingEnabled(boolean z) {
        this.f9580k = z;
    }

    public String toString() {
        String str;
        hf4.C2469b c = hf4.m18862c(this);
        ck1<DH> ck1 = this.f9578e;
        if (ck1 != null) {
            str = ck1.toString();
        } else {
            str = "<no holder set>";
        }
        return c.mo21158b("holder", str).toString();
    }

    public DraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo13273c(context);
    }

    public DraweeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo13273c(context);
    }
}
