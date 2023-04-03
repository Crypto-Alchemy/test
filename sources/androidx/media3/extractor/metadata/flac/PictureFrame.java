package androidx.media3.extractor.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.C0792h;
import androidx.media3.common.C0816l;
import androidx.media3.common.Metadata;
import java.util.Arrays;

public final class PictureFrame implements Metadata.Entry {
    public static final Parcelable.Creator<PictureFrame> CREATOR = new C1038a();

    /* renamed from: a */
    public final int f5567a;

    /* renamed from: d */
    public final String f5568d;

    /* renamed from: e */
    public final String f5569e;

    /* renamed from: g */
    public final int f5570g;

    /* renamed from: k */
    public final int f5571k;

    /* renamed from: r */
    public final int f5572r;

    /* renamed from: s */
    public final int f5573s;

    /* renamed from: x */
    public final byte[] f5574x;

    /* renamed from: androidx.media3.extractor.metadata.flac.PictureFrame$a */
    public class C1038a implements Parcelable.Creator<PictureFrame> {
        /* renamed from: a */
        public PictureFrame createFromParcel(Parcel parcel) {
            return new PictureFrame(parcel);
        }

        /* renamed from: b */
        public PictureFrame[] newArray(int i) {
            return new PictureFrame[i];
        }
    }

    public PictureFrame(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.f5567a = i;
        this.f5568d = str;
        this.f5569e = str2;
        this.f5570g = i2;
        this.f5571k = i3;
        this.f5572r = i4;
        this.f5573s = i5;
        this.f5574x = bArr;
    }

    /* renamed from: a */
    public static PictureFrame m7622a(gm4 gm4) {
        int n = gm4.mo20689n();
        String B = gm4.mo20660B(gm4.mo20689n(), be0.f21261a);
        String A = gm4.mo20659A(gm4.mo20689n());
        int n2 = gm4.mo20689n();
        int n3 = gm4.mo20689n();
        int n4 = gm4.mo20689n();
        int n5 = gm4.mo20689n();
        int n6 = gm4.mo20689n();
        byte[] bArr = new byte[n6];
        gm4.mo20685j(bArr, 0, n6);
        return new PictureFrame(n, B, A, n2, n3, n4, n5, bArr);
    }

    /* renamed from: N0 */
    public void mo6551N0(C0816l.C0818b bVar) {
        bVar.mo6801G(this.f5574x, this.f5567a);
    }

    /* renamed from: O */
    public /* synthetic */ C0792h mo6552O() {
        return yu3.m30838b(this);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PictureFrame.class != obj.getClass()) {
            return false;
        }
        PictureFrame pictureFrame = (PictureFrame) obj;
        if (this.f5567a == pictureFrame.f5567a && this.f5568d.equals(pictureFrame.f5568d) && this.f5569e.equals(pictureFrame.f5569e) && this.f5570g == pictureFrame.f5570g && this.f5571k == pictureFrame.f5571k && this.f5572r == pictureFrame.f5572r && this.f5573s == pictureFrame.f5573s && Arrays.equals(this.f5574x, pictureFrame.f5574x)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((527 + this.f5567a) * 31) + this.f5568d.hashCode()) * 31) + this.f5569e.hashCode()) * 31) + this.f5570g) * 31) + this.f5571k) * 31) + this.f5572r) * 31) + this.f5573s) * 31) + Arrays.hashCode(this.f5574x);
    }

    /* renamed from: k1 */
    public /* synthetic */ byte[] mo6553k1() {
        return yu3.m30837a(this);
    }

    public String toString() {
        return "Picture: mimeType=" + this.f5568d + ", description=" + this.f5569e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f5567a);
        parcel.writeString(this.f5568d);
        parcel.writeString(this.f5569e);
        parcel.writeInt(this.f5570g);
        parcel.writeInt(this.f5571k);
        parcel.writeInt(this.f5572r);
        parcel.writeInt(this.f5573s);
        parcel.writeByteArray(this.f5574x);
    }

    public PictureFrame(Parcel parcel) {
        this.f5567a = parcel.readInt();
        this.f5568d = (String) w67.m29360j(parcel.readString());
        this.f5569e = (String) w67.m29360j(parcel.readString());
        this.f5570g = parcel.readInt();
        this.f5571k = parcel.readInt();
        this.f5572r = parcel.readInt();
        this.f5573s = parcel.readInt();
        this.f5574x = (byte[]) w67.m29360j(parcel.createByteArray());
    }
}
