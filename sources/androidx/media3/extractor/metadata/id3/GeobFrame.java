package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class GeobFrame extends Id3Frame {
    public static final Parcelable.Creator<GeobFrame> CREATOR = new C1047a();

    /* renamed from: d */
    public final String f5605d;

    /* renamed from: e */
    public final String f5606e;

    /* renamed from: g */
    public final String f5607g;

    /* renamed from: k */
    public final byte[] f5608k;

    /* renamed from: androidx.media3.extractor.metadata.id3.GeobFrame$a */
    public class C1047a implements Parcelable.Creator<GeobFrame> {
        /* renamed from: a */
        public GeobFrame createFromParcel(Parcel parcel) {
            return new GeobFrame(parcel);
        }

        /* renamed from: b */
        public GeobFrame[] newArray(int i) {
            return new GeobFrame[i];
        }
    }

    public GeobFrame(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f5605d = str;
        this.f5606e = str2;
        this.f5607g = str3;
        this.f5608k = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || GeobFrame.class != obj.getClass()) {
            return false;
        }
        GeobFrame geobFrame = (GeobFrame) obj;
        if (!w67.m29346c(this.f5605d, geobFrame.f5605d) || !w67.m29346c(this.f5606e, geobFrame.f5606e) || !w67.m29346c(this.f5607g, geobFrame.f5607g) || !Arrays.equals(this.f5608k, geobFrame.f5608k)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int i2;
        String str = this.f5605d;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (527 + i) * 31;
        String str2 = this.f5606e;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str3 = this.f5607g;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return ((i5 + i3) * 31) + Arrays.hashCode(this.f5608k);
    }

    public String toString() {
        return this.f5609a + ": mimeType=" + this.f5605d + ", filename=" + this.f5606e + ", description=" + this.f5607g;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f5605d);
        parcel.writeString(this.f5606e);
        parcel.writeString(this.f5607g);
        parcel.writeByteArray(this.f5608k);
    }

    public GeobFrame(Parcel parcel) {
        super("GEOB");
        this.f5605d = (String) w67.m29360j(parcel.readString());
        this.f5606e = (String) w67.m29360j(parcel.readString());
        this.f5607g = (String) w67.m29360j(parcel.readString());
        this.f5608k = (byte[]) w67.m29360j(parcel.createByteArray());
    }
}
