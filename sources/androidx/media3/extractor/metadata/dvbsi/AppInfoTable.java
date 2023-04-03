package androidx.media3.extractor.metadata.dvbsi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.C0792h;
import androidx.media3.common.C0816l;
import androidx.media3.common.Metadata;

public final class AppInfoTable implements Metadata.Entry {
    public static final Parcelable.Creator<AppInfoTable> CREATOR = new C1036a();

    /* renamed from: a */
    public final int f5557a;

    /* renamed from: d */
    public final String f5558d;

    /* renamed from: androidx.media3.extractor.metadata.dvbsi.AppInfoTable$a */
    public class C1036a implements Parcelable.Creator<AppInfoTable> {
        /* renamed from: a */
        public AppInfoTable createFromParcel(Parcel parcel) {
            return new AppInfoTable(parcel.readInt(), (String) C2725kr.m20985e(parcel.readString()));
        }

        /* renamed from: b */
        public AppInfoTable[] newArray(int i) {
            return new AppInfoTable[i];
        }
    }

    public AppInfoTable(int i, String str) {
        this.f5557a = i;
        this.f5558d = str;
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

    /* renamed from: k1 */
    public /* synthetic */ byte[] mo6553k1() {
        return yu3.m30837a(this);
    }

    public String toString() {
        return "Ait(controlCode=" + this.f5557a + ",url=" + this.f5558d + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f5558d);
        parcel.writeInt(this.f5557a);
    }
}
