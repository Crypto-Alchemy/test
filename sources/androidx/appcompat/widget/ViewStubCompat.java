package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

public final class ViewStubCompat extends View {

    /* renamed from: a */
    public int f1280a;

    /* renamed from: d */
    public int f1281d;

    /* renamed from: e */
    public WeakReference<View> f1282e;

    /* renamed from: g */
    public LayoutInflater f1283g;

    /* renamed from: k */
    public C0273a f1284k;

    /* renamed from: androidx.appcompat.widget.ViewStubCompat$a */
    public interface C0273a {
        /* renamed from: a */
        void mo2578a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public View mo2566a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.f1280a != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.f1283g;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.f1280a, viewGroup, false);
            int i = this.f1281d;
            if (i != -1) {
                inflate.setId(i);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f1282e = new WeakReference<>(inflate);
            C0273a aVar = this.f1284k;
            if (aVar != null) {
                aVar.mo2578a(this, inflate);
            }
            return inflate;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    public void dispatchDraw(Canvas canvas) {
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f1281d;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f1283g;
    }

    public int getLayoutResource() {
        return this.f1280a;
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f1281d = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f1283g = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f1280a = i;
    }

    public void setOnInflateListener(C0273a aVar) {
        this.f1284k = aVar;
    }

    public void setVisibility(int i) {
        WeakReference<View> weakReference = this.f1282e;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            mo2566a();
        }
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1280a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j65.ViewStubCompat, i, 0);
        this.f1281d = obtainStyledAttributes.getResourceId(j65.ViewStubCompat_android_inflatedId, -1);
        this.f1280a = obtainStyledAttributes.getResourceId(j65.ViewStubCompat_android_layout, 0);
        setId(obtainStyledAttributes.getResourceId(j65.ViewStubCompat_android_id, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }
}
