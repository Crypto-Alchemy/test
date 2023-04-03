package androidx.media3.extractor.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.C0792h;
import androidx.media3.common.C0816l;
import androidx.media3.common.Metadata;
import java.util.Arrays;

public final class IcyInfo implements Metadata.Entry {
    public static final Parcelable.Creator<IcyInfo> CREATOR = new C1041a();

    /* renamed from: a */
    public final byte[] f5583a;

    /* renamed from: d */
    public final String f5584d;

    /* renamed from: e */
    public final String f5585e;

    /* renamed from: androidx.media3.extractor.metadata.icy.IcyInfo$a */
    public class C1041a implements Parcelable.Creator<IcyInfo> {
        /* renamed from: a */
        public IcyInfo createFromParcel(Parcel parcel) {
            return new IcyInfo(parcel);
        }

        /* renamed from: b */
        public IcyInfo[] newArray(int i) {
            return new IcyInfo[i];
        }
    }

    public IcyInfo(byte[] bArr, String str, String str2) {
        this.f5583a = bArr;
        this.f5584d = str;
        this.f5585e = str2;
    }

    /* renamed from: N0 */
    public void mo6551N0(C0816l.C0818b bVar) {
        String str = this.f5584d;
        if (str != null) {
            bVar.mo6829i0(str);
        }
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
        if (obj == null || IcyInfo.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f5583a, ((IcyInfo) obj).f5583a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f5583a);
    }

    /* renamed from: k1 */
    public /* synthetic */ byte[] mo6553k1() {
        return yu3.m30837a(this);
    }

    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", new Object[]{this.f5584d, this.f5585e, Integer.valueOf(this.f5583a.length)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.f5583a);
        parcel.writeString(this.f5584d);
        parcel.writeString(this.f5585e);
    }

    public IcyInfo(Parcel parcel) {
        this.f5583a = (byte[]) C2725kr.m20985e(parcel.createByteArray());
        this.f5584d = parcel.readString();
        this.f5585e = parcel.readString();
    }
}
