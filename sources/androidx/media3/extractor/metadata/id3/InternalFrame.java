package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;

public final class InternalFrame extends Id3Frame {
    public static final Parcelable.Creator<InternalFrame> CREATOR = new C1048a();

    /* renamed from: d */
    public final String f5610d;

    /* renamed from: e */
    public final String f5611e;

    /* renamed from: g */
    public final String f5612g;

    /* renamed from: androidx.media3.extractor.metadata.id3.InternalFrame$a */
    public class C1048a implements Parcelable.Creator<InternalFrame> {
        /* renamed from: a */
        public InternalFrame createFromParcel(Parcel parcel) {
            return new InternalFrame(parcel);
        }

        /* renamed from: b */
        public InternalFrame[] newArray(int i) {
            return new InternalFrame[i];
        }
    }

    public InternalFrame(String str, String str2, String str3) {
        super("----");
        this.f5610d = str;
        this.f5611e = str2;
        this.f5612g = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || InternalFrame.class != obj.getClass()) {
            return false;
        }
        InternalFrame internalFrame = (InternalFrame) obj;
        if (!w67.m29346c(this.f5611e, internalFrame.f5611e) || !w67.m29346c(this.f5610d, internalFrame.f5610d) || !w67.m29346c(this.f5612g, internalFrame.f5612g)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int i2;
        String str = this.f5610d;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (527 + i) * 31;
        String str2 = this.f5611e;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str3 = this.f5612g;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return i5 + i3;
    }

    public String toString() {
        return this.f5609a + ": domain=" + this.f5610d + ", description=" + this.f5611e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f5609a);
        parcel.writeString(this.f5610d);
        parcel.writeString(this.f5612g);
    }

    public InternalFrame(Parcel parcel) {
        super("----");
        this.f5610d = (String) w67.m29360j(parcel.readString());
        this.f5611e = (String) w67.m29360j(parcel.readString());
        this.f5612g = (String) w67.m29360j(parcel.readString());
    }
}
