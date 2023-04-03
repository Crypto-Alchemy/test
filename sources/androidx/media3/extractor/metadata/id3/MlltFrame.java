package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class MlltFrame extends Id3Frame {
    public static final Parcelable.Creator<MlltFrame> CREATOR = new C1049a();

    /* renamed from: d */
    public final int f5613d;

    /* renamed from: e */
    public final int f5614e;

    /* renamed from: g */
    public final int f5615g;

    /* renamed from: k */
    public final int[] f5616k;

    /* renamed from: r */
    public final int[] f5617r;

    /* renamed from: androidx.media3.extractor.metadata.id3.MlltFrame$a */
    public class C1049a implements Parcelable.Creator<MlltFrame> {
        /* renamed from: a */
        public MlltFrame createFromParcel(Parcel parcel) {
            return new MlltFrame(parcel);
        }

        /* renamed from: b */
        public MlltFrame[] newArray(int i) {
            return new MlltFrame[i];
        }
    }

    public MlltFrame(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f5613d = i;
        this.f5614e = i2;
        this.f5615g = i3;
        this.f5616k = iArr;
        this.f5617r = iArr2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MlltFrame.class != obj.getClass()) {
            return false;
        }
        MlltFrame mlltFrame = (MlltFrame) obj;
        if (this.f5613d == mlltFrame.f5613d && this.f5614e == mlltFrame.f5614e && this.f5615g == mlltFrame.f5615g && Arrays.equals(this.f5616k, mlltFrame.f5616k) && Arrays.equals(this.f5617r, mlltFrame.f5617r)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + this.f5613d) * 31) + this.f5614e) * 31) + this.f5615g) * 31) + Arrays.hashCode(this.f5616k)) * 31) + Arrays.hashCode(this.f5617r);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f5613d);
        parcel.writeInt(this.f5614e);
        parcel.writeInt(this.f5615g);
        parcel.writeIntArray(this.f5616k);
        parcel.writeIntArray(this.f5617r);
    }

    public MlltFrame(Parcel parcel) {
        super("MLLT");
        this.f5613d = parcel.readInt();
        this.f5614e = parcel.readInt();
        this.f5615g = parcel.readInt();
        this.f5616k = (int[]) w67.m29360j(parcel.createIntArray());
        this.f5617r = (int[]) w67.m29360j(parcel.createIntArray());
    }
}
