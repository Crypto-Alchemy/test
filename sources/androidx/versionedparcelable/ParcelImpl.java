package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C1467a();

    /* renamed from: a */
    public final f97 f7280a;

    /* renamed from: androidx.versionedparcelable.ParcelImpl$a */
    public static class C1467a implements Parcelable.Creator<ParcelImpl> {
        /* renamed from: a */
        public ParcelImpl createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        /* renamed from: b */
        public ParcelImpl[] newArray(int i) {
            return new ParcelImpl[i];
        }
    }

    public ParcelImpl(Parcel parcel) {
        this.f7280a = new e97(parcel).mo18629u();
    }

    /* renamed from: a */
    public <T extends f97> T mo10604a() {
        return this.f7280a;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        new e97(parcel).mo18606L(this.f7280a);
    }
}
