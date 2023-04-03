package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.customview.view.AbsSavedState;

public class CheckableImageButton extends AppCompatImageButton implements Checkable {

    /* renamed from: s */
    public static final int[] f23978s = {16842912};

    /* renamed from: g */
    public boolean f23979g;

    /* renamed from: k */
    public boolean f23980k;

    /* renamed from: r */
    public boolean f23981r;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C4325a();

        /* renamed from: e */
        public boolean f23982e;

        /* renamed from: com.google.android.material.internal.CheckableImageButton$SavedState$a */
        public static class C4325a implements Parcelable.ClassLoaderCreator<SavedState> {
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: b */
        public final void mo32933b(Parcel parcel) {
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f23982e = z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f23982e ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            mo32933b(parcel);
        }
    }

    /* renamed from: com.google.android.material.internal.CheckableImageButton$a */
    public class C4326a extends C3715z7 {
        public C4326a() {
        }

        /* renamed from: f */
        public void mo5478f(View view, AccessibilityEvent accessibilityEvent) {
            super.mo5478f(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        /* renamed from: g */
        public void mo5479g(View view, C3335t8 t8Var) {
            super.mo5479g(view, t8Var);
            t8Var.mo26234d0(CheckableImageButton.this.mo32923a());
            t8Var.mo26236e0(CheckableImageButton.this.isChecked());
        }
    }

    public CheckableImageButton(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public boolean mo32923a() {
        return this.f23980k;
    }

    public boolean isChecked() {
        return this.f23979g;
    }

    public int[] onCreateDrawableState(int i) {
        if (!this.f23979g) {
            return super.onCreateDrawableState(i);
        }
        int[] iArr = f23978s;
        return View.mergeDrawableStates(super.onCreateDrawableState(i + iArr.length), iArr);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo5481a());
        setChecked(savedState.f23982e);
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f23982e = this.f23979g;
        return savedState;
    }

    public void setCheckable(boolean z) {
        if (this.f23980k != z) {
            this.f23980k = z;
            sendAccessibilityEvent(0);
        }
    }

    public void setChecked(boolean z) {
        if (this.f23980k && this.f23979g != z) {
            this.f23979g = z;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void setPressable(boolean z) {
        this.f23981r = z;
    }

    public void setPressed(boolean z) {
        if (this.f23981r) {
            super.setPressed(z);
        }
    }

    public void toggle() {
        setChecked(!this.f23979g);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, m15.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23980k = true;
        this.f23981r = true;
        ga7.m17785p0(this, new C4326a());
    }
}
