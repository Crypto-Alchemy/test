package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.C0816l;
import java.util.Arrays;

public final class ApicFrame extends Id3Frame {
    public static final Parcelable.Creator<ApicFrame> CREATOR = new C1042a();

    /* renamed from: d */
    public final String f5586d;

    /* renamed from: e */
    public final String f5587e;

    /* renamed from: g */
    public final int f5588g;

    /* renamed from: k */
    public final byte[] f5589k;

    /* renamed from: androidx.media3.extractor.metadata.id3.ApicFrame$a */
    public class C1042a implements Parcelable.Creator<ApicFrame> {
        /* renamed from: a */
        public ApicFrame createFromParcel(Parcel parcel) {
            return new ApicFrame(parcel);
        }

        /* renamed from: b */
        public ApicFrame[] newArray(int i) {
            return new ApicFrame[i];
        }
    }

    public ApicFrame(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.f5586d = str;
        this.f5587e = str2;
        this.f5588g = i;
        this.f5589k = bArr;
    }

    /* renamed from: N0 */
    public void mo6551N0(C0816l.C0818b bVar) {
        bVar.mo6801G(this.f5589k, this.f5588g);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ApicFrame.class != obj.getClass()) {
            return false;
        }
        ApicFrame apicFrame = (ApicFrame) obj;
        if (this.f5588g != apicFrame.f5588g || !w67.m29346c(this.f5586d, apicFrame.f5586d) || !w67.m29346c(this.f5587e, apicFrame.f5587e) || !Arrays.equals(this.f5589k, apicFrame.f5589k)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int i2 = (527 + this.f5588g) * 31;
        String str = this.f5586d;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (i2 + i) * 31;
        String str2 = this.f5587e;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return ((i4 + i3) * 31) + Arrays.hashCode(this.f5589k);
    }

    public String toString() {
        return this.f5609a + ": mimeType=" + this.f5586d + ", description=" + this.f5587e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f5586d);
        parcel.writeString(this.f5587e);
        parcel.writeInt(this.f5588g);
        parcel.writeByteArray(this.f5589k);
    }

    public ApicFrame(Parcel parcel) {
        super("APIC");
        this.f5586d = (String) w67.m29360j(parcel.readString());
        this.f5587e = parcel.readString();
        this.f5588g = parcel.readInt();
        this.f5589k = (byte[]) w67.m29360j(parcel.createByteArray());
    }
}
