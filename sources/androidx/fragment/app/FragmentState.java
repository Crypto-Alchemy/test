package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.Lifecycle;

@SuppressLint({"BanParcelableUsage"})
final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new C0647a();

    /* renamed from: A */
    public final Bundle f3726A;

    /* renamed from: B */
    public final boolean f3727B;

    /* renamed from: C */
    public final int f3728C;

    /* renamed from: H */
    public Bundle f3729H;

    /* renamed from: a */
    public final String f3730a;

    /* renamed from: d */
    public final String f3731d;

    /* renamed from: e */
    public final boolean f3732e;

    /* renamed from: g */
    public final int f3733g;

    /* renamed from: k */
    public final int f3734k;

    /* renamed from: r */
    public final String f3735r;

    /* renamed from: s */
    public final boolean f3736s;

    /* renamed from: x */
    public final boolean f3737x;

    /* renamed from: y */
    public final boolean f3738y;

    /* renamed from: androidx.fragment.app.FragmentState$a */
    public class C0647a implements Parcelable.Creator<FragmentState> {
        /* renamed from: a */
        public FragmentState createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        /* renamed from: b */
        public FragmentState[] newArray(int i) {
            return new FragmentState[i];
        }
    }

    public FragmentState(Fragment fragment) {
        this.f3730a = fragment.getClass().getName();
        this.f3731d = fragment.mWho;
        this.f3732e = fragment.mFromLayout;
        this.f3733g = fragment.mFragmentId;
        this.f3734k = fragment.mContainerId;
        this.f3735r = fragment.mTag;
        this.f3736s = fragment.mRetainInstance;
        this.f3737x = fragment.mRemoving;
        this.f3738y = fragment.mDetached;
        this.f3726A = fragment.mArguments;
        this.f3727B = fragment.mHidden;
        this.f3728C = fragment.mMaxState.ordinal();
    }

    /* renamed from: a */
    public Fragment mo6070a(C0674d dVar, ClassLoader classLoader) {
        Fragment a = dVar.mo6039a(classLoader, this.f3730a);
        Bundle bundle = this.f3726A;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a.setArguments(this.f3726A);
        a.mWho = this.f3731d;
        a.mFromLayout = this.f3732e;
        a.mRestored = true;
        a.mFragmentId = this.f3733g;
        a.mContainerId = this.f3734k;
        a.mTag = this.f3735r;
        a.mRetainInstance = this.f3736s;
        a.mRemoving = this.f3737x;
        a.mDetached = this.f3738y;
        a.mHidden = this.f3727B;
        a.mMaxState = Lifecycle.State.values()[this.f3728C];
        Bundle bundle2 = this.f3729H;
        if (bundle2 != null) {
            a.mSavedFragmentState = bundle2;
        } else {
            a.mSavedFragmentState = new Bundle();
        }
        return a;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f3730a);
        sb.append(" (");
        sb.append(this.f3731d);
        sb.append(")}:");
        if (this.f3732e) {
            sb.append(" fromLayout");
        }
        if (this.f3734k != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f3734k));
        }
        String str = this.f3735r;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f3735r);
        }
        if (this.f3736s) {
            sb.append(" retainInstance");
        }
        if (this.f3737x) {
            sb.append(" removing");
        }
        if (this.f3738y) {
            sb.append(" detached");
        }
        if (this.f3727B) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f3730a);
        parcel.writeString(this.f3731d);
        parcel.writeInt(this.f3732e ? 1 : 0);
        parcel.writeInt(this.f3733g);
        parcel.writeInt(this.f3734k);
        parcel.writeString(this.f3735r);
        parcel.writeInt(this.f3736s ? 1 : 0);
        parcel.writeInt(this.f3737x ? 1 : 0);
        parcel.writeInt(this.f3738y ? 1 : 0);
        parcel.writeBundle(this.f3726A);
        parcel.writeInt(this.f3727B ? 1 : 0);
        parcel.writeBundle(this.f3729H);
        parcel.writeInt(this.f3728C);
    }

    public FragmentState(Parcel parcel) {
        this.f3730a = parcel.readString();
        this.f3731d = parcel.readString();
        boolean z = true;
        this.f3732e = parcel.readInt() != 0;
        this.f3733g = parcel.readInt();
        this.f3734k = parcel.readInt();
        this.f3735r = parcel.readString();
        this.f3736s = parcel.readInt() != 0;
        this.f3737x = parcel.readInt() != 0;
        this.f3738y = parcel.readInt() != 0;
        this.f3726A = parcel.readBundle();
        this.f3727B = parcel.readInt() == 0 ? false : z;
        this.f3729H = parcel.readBundle();
        this.f3728C = parcel.readInt();
    }
}
