package androidx.media3.extractor.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.C0792h;
import androidx.media3.common.C0816l;
import androidx.media3.common.Metadata;
import java.util.Arrays;

public final class MdtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<MdtaMetadataEntry> CREATOR = new C1053a();

    /* renamed from: a */
    public final String f5624a;

    /* renamed from: d */
    public final byte[] f5625d;

    /* renamed from: e */
    public final int f5626e;

    /* renamed from: g */
    public final int f5627g;

    /* renamed from: androidx.media3.extractor.metadata.mp4.MdtaMetadataEntry$a */
    public class C1053a implements Parcelable.Creator<MdtaMetadataEntry> {
        /* renamed from: a */
        public MdtaMetadataEntry createFromParcel(Parcel parcel) {
            return new MdtaMetadataEntry(parcel, (C1053a) null);
        }

        /* renamed from: b */
        public MdtaMetadataEntry[] newArray(int i) {
            return new MdtaMetadataEntry[i];
        }
    }

    public /* synthetic */ MdtaMetadataEntry(Parcel parcel, C1053a aVar) {
        this(parcel);
    }

    /* renamed from: N0 */
    public /* synthetic */ void mo6551N0(C0816l.C0818b bVar) {
        yu3.m30839c(this, bVar);
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
        if (obj == null || MdtaMetadataEntry.class != obj.getClass()) {
            return false;
        }
        MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) obj;
        if (!this.f5624a.equals(mdtaMetadataEntry.f5624a) || !Arrays.equals(this.f5625d, mdtaMetadataEntry.f5625d) || this.f5626e != mdtaMetadataEntry.f5626e || this.f5627g != mdtaMetadataEntry.f5627g) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((527 + this.f5624a.hashCode()) * 31) + Arrays.hashCode(this.f5625d)) * 31) + this.f5626e) * 31) + this.f5627g;
    }

    /* renamed from: k1 */
    public /* synthetic */ byte[] mo6553k1() {
        return yu3.m30837a(this);
    }

    public String toString() {
        return "mdta: key=" + this.f5624a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f5624a);
        parcel.writeByteArray(this.f5625d);
        parcel.writeInt(this.f5626e);
        parcel.writeInt(this.f5627g);
    }

    public MdtaMetadataEntry(String str, byte[] bArr, int i, int i2) {
        this.f5624a = str;
        this.f5625d = bArr;
        this.f5626e = i;
        this.f5627g = i2;
    }

    public MdtaMetadataEntry(Parcel parcel) {
        this.f5624a = (String) w67.m29360j(parcel.readString());
        this.f5625d = (byte[]) w67.m29360j(parcel.createByteArray());
        this.f5626e = parcel.readInt();
        this.f5627g = parcel.readInt();
    }
}
