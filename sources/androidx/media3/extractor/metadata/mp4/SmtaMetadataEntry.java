package androidx.media3.extractor.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.C0792h;
import androidx.media3.common.C0816l;
import androidx.media3.common.Metadata;

public final class SmtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<SmtaMetadataEntry> CREATOR = new C1057a();

    /* renamed from: a */
    public final float f5638a;

    /* renamed from: d */
    public final int f5639d;

    /* renamed from: androidx.media3.extractor.metadata.mp4.SmtaMetadataEntry$a */
    public class C1057a implements Parcelable.Creator<SmtaMetadataEntry> {
        /* renamed from: a */
        public SmtaMetadataEntry createFromParcel(Parcel parcel) {
            return new SmtaMetadataEntry(parcel, (C1057a) null);
        }

        /* renamed from: b */
        public SmtaMetadataEntry[] newArray(int i) {
            return new SmtaMetadataEntry[i];
        }
    }

    public /* synthetic */ SmtaMetadataEntry(Parcel parcel, C1057a aVar) {
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
        if (obj == null || SmtaMetadataEntry.class != obj.getClass()) {
            return false;
        }
        SmtaMetadataEntry smtaMetadataEntry = (SmtaMetadataEntry) obj;
        if (this.f5638a == smtaMetadataEntry.f5638a && this.f5639d == smtaMetadataEntry.f5639d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((527 + x42.m54172a(this.f5638a)) * 31) + this.f5639d;
    }

    /* renamed from: k1 */
    public /* synthetic */ byte[] mo6553k1() {
        return yu3.m30837a(this);
    }

    public String toString() {
        return "smta: captureFrameRate=" + this.f5638a + ", svcTemporalLayerCount=" + this.f5639d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f5638a);
        parcel.writeInt(this.f5639d);
    }

    public SmtaMetadataEntry(float f, int i) {
        this.f5638a = f;
        this.f5639d = i;
    }

    public SmtaMetadataEntry(Parcel parcel) {
        this.f5638a = parcel.readFloat();
        this.f5639d = parcel.readInt();
    }
}
