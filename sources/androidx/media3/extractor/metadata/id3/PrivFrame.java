package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class PrivFrame extends Id3Frame {
    public static final Parcelable.Creator<PrivFrame> CREATOR = new C1050a();

    /* renamed from: d */
    public final String f5618d;

    /* renamed from: e */
    public final byte[] f5619e;

    /* renamed from: androidx.media3.extractor.metadata.id3.PrivFrame$a */
    public class C1050a implements Parcelable.Creator<PrivFrame> {
        /* renamed from: a */
        public PrivFrame createFromParcel(Parcel parcel) {
            return new PrivFrame(parcel);
        }

        /* renamed from: b */
        public PrivFrame[] newArray(int i) {
            return new PrivFrame[i];
        }
    }

    public PrivFrame(String str, byte[] bArr) {
        super("PRIV");
        this.f5618d = str;
        this.f5619e = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PrivFrame.class != obj.getClass()) {
            return false;
        }
        PrivFrame privFrame = (PrivFrame) obj;
        if (!w67.m29346c(this.f5618d, privFrame.f5618d) || !Arrays.equals(this.f5619e, privFrame.f5619e)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        String str = this.f5618d;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return ((527 + i) * 31) + Arrays.hashCode(this.f5619e);
    }

    public String toString() {
        return this.f5609a + ": owner=" + this.f5618d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f5618d);
        parcel.writeByteArray(this.f5619e);
    }

    public PrivFrame(Parcel parcel) {
        super("PRIV");
        this.f5618d = (String) w67.m29360j(parcel.readString());
        this.f5619e = (byte[]) w67.m29360j(parcel.createByteArray());
    }
}
