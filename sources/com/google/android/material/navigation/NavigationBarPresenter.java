package com.google.android.material.navigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.view.menu.C0173e;
import androidx.appcompat.view.menu.C0177g;
import androidx.appcompat.view.menu.C0182i;
import androidx.appcompat.view.menu.C0189l;
import com.google.android.material.badge.C4184a;
import com.google.android.material.internal.ParcelableSparseArray;

public class NavigationBarPresenter implements C0182i {

    /* renamed from: a */
    public C0173e f24132a;

    /* renamed from: d */
    public NavigationBarMenuView f24133d;

    /* renamed from: e */
    public boolean f24134e = false;

    /* renamed from: g */
    public int f24135g;

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C4337a();

        /* renamed from: a */
        public int f24136a;

        /* renamed from: d */
        public ParcelableSparseArray f24137d;

        /* renamed from: com.google.android.material.navigation.NavigationBarPresenter$SavedState$a */
        public static class C4337a implements Parcelable.Creator<SavedState> {
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState() {
        }

        public SavedState(Parcel parcel) {
            this.f24136a = parcel.readInt();
            this.f24137d = (ParcelableSparseArray) parcel.readParcelable(getClass().getClassLoader());
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f24136a);
            parcel.writeParcelable(this.f24137d, 0);
        }
    }

    /* renamed from: a */
    public void mo33159a(int i) {
        this.f24135g = i;
    }

    /* renamed from: b */
    public void mo1304b(C0173e eVar, boolean z) {
    }

    /* renamed from: c */
    public void mo33160c(NavigationBarMenuView navigationBarMenuView) {
        this.f24133d = navigationBarMenuView;
    }

    /* renamed from: d */
    public boolean mo1306d(C0173e eVar, C0177g gVar) {
        return false;
    }

    /* renamed from: f */
    public void mo1331f(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f24133d.mo33144j(savedState.f24136a);
            this.f24133d.setBadgeDrawables(C4184a.m34696b(this.f24133d.getContext(), savedState.f24137d));
        }
    }

    /* renamed from: g */
    public boolean mo1308g(C0189l lVar) {
        return false;
    }

    public int getId() {
        return this.f24135g;
    }

    /* renamed from: h */
    public Parcelable mo1332h() {
        SavedState savedState = new SavedState();
        savedState.f24136a = this.f24133d.getSelectedItemId();
        savedState.f24137d = C4184a.m34697c(this.f24133d.getBadgeDrawables());
        return savedState;
    }

    /* renamed from: i */
    public void mo1310i(boolean z) {
        if (!this.f24134e) {
            if (z) {
                this.f24133d.mo33126d();
            } else {
                this.f24133d.mo33145k();
            }
        }
    }

    /* renamed from: j */
    public boolean mo1333j() {
        return false;
    }

    /* renamed from: k */
    public boolean mo1311k(C0173e eVar, C0177g gVar) {
        return false;
    }

    /* renamed from: l */
    public void mo1312l(Context context, C0173e eVar) {
        this.f24132a = eVar;
        this.f24133d.mo1284a(eVar);
    }

    /* renamed from: m */
    public void mo33161m(boolean z) {
        this.f24134e = z;
    }
}
