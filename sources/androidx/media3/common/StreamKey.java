package androidx.media3.common;

import android.os.Parcel;
import android.os.Parcelable;

public final class StreamKey implements Comparable<StreamKey>, Parcelable {
    public static final Parcelable.Creator<StreamKey> CREATOR = new C0775a();

    /* renamed from: a */
    public final int f4121a;

    /* renamed from: d */
    public final int f4122d;

    /* renamed from: e */
    public final int f4123e;
    @Deprecated

    /* renamed from: g */
    public final int f4124g;

    /* renamed from: androidx.media3.common.StreamKey$a */
    public class C0775a implements Parcelable.Creator<StreamKey> {
        /* renamed from: a */
        public StreamKey createFromParcel(Parcel parcel) {
            return new StreamKey(parcel);
        }

        /* renamed from: b */
        public StreamKey[] newArray(int i) {
            return new StreamKey[i];
        }
    }

    public StreamKey(int i, int i2, int i3) {
        this.f4121a = i;
        this.f4122d = i2;
        this.f4123e = i3;
        this.f4124g = i3;
    }

    /* renamed from: a */
    public int compareTo(StreamKey streamKey) {
        int i = this.f4121a - streamKey.f4121a;
        if (i != 0) {
            return i;
        }
        int i2 = this.f4122d - streamKey.f4122d;
        if (i2 == 0) {
            return this.f4123e - streamKey.f4123e;
        }
        return i2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StreamKey.class != obj.getClass()) {
            return false;
        }
        StreamKey streamKey = (StreamKey) obj;
        if (this.f4121a == streamKey.f4121a && this.f4122d == streamKey.f4122d && this.f4123e == streamKey.f4123e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f4121a * 31) + this.f4122d) * 31) + this.f4123e;
    }

    public String toString() {
        return this.f4121a + "." + this.f4122d + "." + this.f4123e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f4121a);
        parcel.writeInt(this.f4122d);
        parcel.writeInt(this.f4123e);
    }

    public StreamKey(Parcel parcel) {
        this.f4121a = parcel.readInt();
        this.f4122d = parcel.readInt();
        int readInt = parcel.readInt();
        this.f4123e = readInt;
        this.f4124g = readInt;
    }
}
