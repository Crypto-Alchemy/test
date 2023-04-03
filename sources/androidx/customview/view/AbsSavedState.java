package androidx.customview.view;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public abstract class AbsSavedState implements Parcelable {
    public static final Parcelable.Creator<AbsSavedState> CREATOR = new C0573a();

    /* renamed from: d */
    public static final AbsSavedState f3459d = new AbsSavedState() {
    };

    /* renamed from: a */
    public final Parcelable f3460a;

    /* renamed from: androidx.customview.view.AbsSavedState$a */
    public class C0573a implements Parcelable.ClassLoaderCreator<AbsSavedState> {
        /* renamed from: a */
        public AbsSavedState createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, (ClassLoader) null);
        }

        /* renamed from: b */
        public AbsSavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return AbsSavedState.f3459d;
            }
            throw new IllegalStateException("superState must be null");
        }

        /* renamed from: c */
        public AbsSavedState[] newArray(int i) {
            return new AbsSavedState[i];
        }
    }

    /* renamed from: a */
    public final Parcelable mo5481a() {
        return this.f3460a;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f3460a, i);
    }

    public AbsSavedState() {
        this.f3460a = null;
    }

    public AbsSavedState(Parcelable parcelable) {
        if (parcelable != null) {
            this.f3460a = parcelable == f3459d ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public AbsSavedState(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f3460a = readParcelable == null ? f3459d : readParcelable;
    }
}
