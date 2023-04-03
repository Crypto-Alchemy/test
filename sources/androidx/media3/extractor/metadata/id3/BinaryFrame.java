package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class BinaryFrame extends Id3Frame {
    public static final Parcelable.Creator<BinaryFrame> CREATOR = new C1043a();

    /* renamed from: d */
    public final byte[] f5590d;

    /* renamed from: androidx.media3.extractor.metadata.id3.BinaryFrame$a */
    public class C1043a implements Parcelable.Creator<BinaryFrame> {
        /* renamed from: a */
        public BinaryFrame createFromParcel(Parcel parcel) {
            return new BinaryFrame(parcel);
        }

        /* renamed from: b */
        public BinaryFrame[] newArray(int i) {
            return new BinaryFrame[i];
        }
    }

    public BinaryFrame(String str, byte[] bArr) {
        super(str);
        this.f5590d = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || BinaryFrame.class != obj.getClass()) {
            return false;
        }
        BinaryFrame binaryFrame = (BinaryFrame) obj;
        if (!this.f5609a.equals(binaryFrame.f5609a) || !Arrays.equals(this.f5590d, binaryFrame.f5590d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((527 + this.f5609a.hashCode()) * 31) + Arrays.hashCode(this.f5590d);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f5609a);
        parcel.writeByteArray(this.f5590d);
    }

    public BinaryFrame(Parcel parcel) {
        super((String) w67.m29360j(parcel.readString()));
        this.f5590d = (byte[]) w67.m29360j(parcel.createByteArray());
    }
}
