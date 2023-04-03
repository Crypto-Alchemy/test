package android.support.p002v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: android.support.v4.media.session.ParcelableVolumeInfo */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new C0075a();

    /* renamed from: a */
    public int f310a;

    /* renamed from: d */
    public int f311d;

    /* renamed from: e */
    public int f312e;

    /* renamed from: g */
    public int f313g;

    /* renamed from: k */
    public int f314k;

    /* renamed from: android.support.v4.media.session.ParcelableVolumeInfo$a */
    public class C0075a implements Parcelable.Creator<ParcelableVolumeInfo> {
        /* renamed from: a */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        /* renamed from: b */
        public ParcelableVolumeInfo[] newArray(int i) {
            return new ParcelableVolumeInfo[i];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f310a = parcel.readInt();
        this.f312e = parcel.readInt();
        this.f313g = parcel.readInt();
        this.f314k = parcel.readInt();
        this.f311d = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f310a);
        parcel.writeInt(this.f312e);
        parcel.writeInt(this.f313g);
        parcel.writeInt(this.f314k);
        parcel.writeInt(this.f311d);
    }
}
