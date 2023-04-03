package androidx.media3.exoplayer.offline;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.StreamKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class DownloadRequest implements Parcelable {
    public static final Parcelable.Creator<DownloadRequest> CREATOR = new C0950a();

    /* renamed from: a */
    public final String f5139a;

    /* renamed from: d */
    public final Uri f5140d;

    /* renamed from: e */
    public final String f5141e;

    /* renamed from: g */
    public final List<StreamKey> f5142g;

    /* renamed from: k */
    public final byte[] f5143k;

    /* renamed from: r */
    public final String f5144r;

    /* renamed from: s */
    public final byte[] f5145s;

    /* renamed from: androidx.media3.exoplayer.offline.DownloadRequest$a */
    public class C0950a implements Parcelable.Creator<DownloadRequest> {
        /* renamed from: a */
        public DownloadRequest createFromParcel(Parcel parcel) {
            return new DownloadRequest(parcel);
        }

        /* renamed from: b */
        public DownloadRequest[] newArray(int i) {
            return new DownloadRequest[i];
        }
    }

    public DownloadRequest(Parcel parcel) {
        this.f5139a = (String) w67.m29360j(parcel.readString());
        this.f5140d = Uri.parse((String) w67.m29360j(parcel.readString()));
        this.f5141e = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add((StreamKey) parcel.readParcelable(StreamKey.class.getClassLoader()));
        }
        this.f5142g = Collections.unmodifiableList(arrayList);
        this.f5143k = parcel.createByteArray();
        this.f5144r = parcel.readString();
        this.f5145s = (byte[]) w67.m29360j(parcel.createByteArray());
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DownloadRequest)) {
            return false;
        }
        DownloadRequest downloadRequest = (DownloadRequest) obj;
        if (!this.f5139a.equals(downloadRequest.f5139a) || !this.f5140d.equals(downloadRequest.f5140d) || !w67.m29346c(this.f5141e, downloadRequest.f5141e) || !this.f5142g.equals(downloadRequest.f5142g) || !Arrays.equals(this.f5143k, downloadRequest.f5143k) || !w67.m29346c(this.f5144r, downloadRequest.f5144r) || !Arrays.equals(this.f5145s, downloadRequest.f5145s)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = ((this.f5139a.hashCode() * 31 * 31) + this.f5140d.hashCode()) * 31;
        String str = this.f5141e;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int hashCode2 = (((((hashCode + i) * 31) + this.f5142g.hashCode()) * 31) + Arrays.hashCode(this.f5143k)) * 31;
        String str2 = this.f5144r;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((hashCode2 + i2) * 31) + Arrays.hashCode(this.f5145s);
    }

    public String toString() {
        return this.f5141e + ":" + this.f5139a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f5139a);
        parcel.writeString(this.f5140d.toString());
        parcel.writeString(this.f5141e);
        parcel.writeInt(this.f5142g.size());
        for (int i2 = 0; i2 < this.f5142g.size(); i2++) {
            parcel.writeParcelable(this.f5142g.get(i2), 0);
        }
        parcel.writeByteArray(this.f5143k);
        parcel.writeString(this.f5144r);
        parcel.writeByteArray(this.f5145s);
    }
}
