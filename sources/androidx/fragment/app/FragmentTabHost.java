package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabWidget;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;

@Deprecated
public class FragmentTabHost extends TabHost implements TabHost.OnTabChangeListener {

    /* renamed from: a */
    public final ArrayList<C0649a> f3739a = new ArrayList<>();

    /* renamed from: d */
    public FrameLayout f3740d;

    /* renamed from: e */
    public Context f3741e;

    /* renamed from: g */
    public FragmentManager f3742g;

    /* renamed from: k */
    public int f3743k;

    /* renamed from: r */
    public TabHost.OnTabChangeListener f3744r;

    /* renamed from: s */
    public C0649a f3745s;

    /* renamed from: x */
    public boolean f3746x;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0648a();

        /* renamed from: a */
        public String f3747a;

        /* renamed from: androidx.fragment.app.FragmentTabHost$SavedState$a */
        public class C0648a implements Parcelable.Creator<SavedState> {
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentTabHost.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " curTab=" + this.f3747a + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f3747a);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f3747a = parcel.readString();
        }
    }

    /* renamed from: androidx.fragment.app.FragmentTabHost$a */
    public static final class C0649a {

        /* renamed from: a */
        public final String f3748a;

        /* renamed from: b */
        public final Class<?> f3749b;

        /* renamed from: c */
        public final Bundle f3750c;

        /* renamed from: d */
        public Fragment f3751d;
    }

    @Deprecated
    public FragmentTabHost(Context context) {
        super(context, (AttributeSet) null);
        mo6082e(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public final C0684j mo6078a(String str, C0684j jVar) {
        Fragment fragment;
        C0649a d = mo6081d(str);
        if (this.f3745s != d) {
            if (jVar == null) {
                jVar = this.f3742g.mo5996q();
            }
            C0649a aVar = this.f3745s;
            if (!(aVar == null || (fragment = aVar.f3751d) == null)) {
                jVar.mo6143n(fragment);
            }
            if (d != null) {
                Fragment fragment2 = d.f3751d;
                if (fragment2 == null) {
                    Fragment a = this.f3742g.mo6012v0().mo6039a(this.f3741e.getClassLoader(), d.f3749b.getName());
                    d.f3751d = a;
                    a.setArguments(d.f3750c);
                    jVar.mo6262c(this.f3743k, d.f3751d, d.f3748a);
                } else {
                    jVar.mo6268i(fragment2);
                }
            }
            this.f3745s = d;
        }
        return jVar;
    }

    /* renamed from: b */
    public final void mo6079b() {
        if (this.f3740d == null) {
            FrameLayout frameLayout = (FrameLayout) findViewById(this.f3743k);
            this.f3740d = frameLayout;
            if (frameLayout == null) {
                throw new IllegalStateException("No tab content FrameLayout found for id " + this.f3743k);
            }
        }
    }

    /* renamed from: c */
    public final void mo6080c(Context context) {
        if (findViewById(16908307) == null) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
            TabWidget tabWidget = new TabWidget(context);
            tabWidget.setId(16908307);
            tabWidget.setOrientation(0);
            linearLayout.addView(tabWidget, new LinearLayout.LayoutParams(-1, -2, Utils.FLOAT_EPSILON));
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setId(16908305);
            linearLayout.addView(frameLayout, new LinearLayout.LayoutParams(0, 0, Utils.FLOAT_EPSILON));
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.f3740d = frameLayout2;
            frameLayout2.setId(this.f3743k);
            linearLayout.addView(frameLayout2, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
    }

    /* renamed from: d */
    public final C0649a mo6081d(String str) {
        int size = this.f3739a.size();
        for (int i = 0; i < size; i++) {
            C0649a aVar = this.f3739a.get(i);
            if (aVar.f3748a.equals(str)) {
                return aVar;
            }
        }
        return null;
    }

    /* renamed from: e */
    public final void mo6082e(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842995}, 0, 0);
        this.f3743k = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    @Deprecated
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        int size = this.f3739a.size();
        C0684j jVar = null;
        for (int i = 0; i < size; i++) {
            C0649a aVar = this.f3739a.get(i);
            Fragment l0 = this.f3742g.mo5984l0(aVar.f3748a);
            aVar.f3751d = l0;
            if (l0 != null && !l0.isDetached()) {
                if (aVar.f3748a.equals(currentTabTag)) {
                    this.f3745s = aVar;
                } else {
                    if (jVar == null) {
                        jVar = this.f3742g.mo5996q();
                    }
                    jVar.mo6143n(aVar.f3751d);
                }
            }
        }
        this.f3746x = true;
        C0684j a = mo6078a(currentTabTag, jVar);
        if (a != null) {
            a.mo6139j();
            this.f3742g.mo5972h0();
        }
    }

    @Deprecated
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f3746x = false;
    }

    @Deprecated
    public void onRestoreInstanceState(@SuppressLint({"UnknownNullness"}) Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentTabByTag(savedState.f3747a);
    }

    @Deprecated
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f3747a = getCurrentTabTag();
        return savedState;
    }

    @Deprecated
    public void onTabChanged(String str) {
        C0684j a;
        if (this.f3746x && (a = mo6078a(str, (C0684j) null)) != null) {
            a.mo6139j();
        }
        TabHost.OnTabChangeListener onTabChangeListener = this.f3744r;
        if (onTabChangeListener != null) {
            onTabChangeListener.onTabChanged(str);
        }
    }

    @Deprecated
    public void setOnTabChangedListener(TabHost.OnTabChangeListener onTabChangeListener) {
        this.f3744r = onTabChangeListener;
    }

    @Deprecated
    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    @Deprecated
    public void setup(Context context, FragmentManager fragmentManager) {
        mo6080c(context);
        super.setup();
        this.f3741e = context;
        this.f3742g = fragmentManager;
        mo6079b();
    }

    @Deprecated
    public FragmentTabHost(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo6082e(context, attributeSet);
    }

    @Deprecated
    public void setup(Context context, FragmentManager fragmentManager, int i) {
        mo6080c(context);
        super.setup();
        this.f3741e = context;
        this.f3742g = fragmentManager;
        this.f3743k = i;
        mo6079b();
        this.f3740d.setId(i);
        if (getId() == -1) {
            setId(16908306);
        }
    }
}
