package androidx.media3.extractor.metadata.emsg;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.C0792h;
import androidx.media3.common.C0816l;
import androidx.media3.common.Metadata;
import java.util.Arrays;

public final class EventMessage implements Metadata.Entry {
    public static final Parcelable.Creator<EventMessage> CREATOR = new C1037a();

    /* renamed from: s */
    public static final C0792h f5559s = new C0792h.C0794b().mo6670e0("application/id3").mo6644E();

    /* renamed from: x */
    public static final C0792h f5560x = new C0792h.C0794b().mo6670e0("application/x-scte35").mo6644E();

    /* renamed from: a */
    public final String f5561a;

    /* renamed from: d */
    public final String f5562d;

    /* renamed from: e */
    public final long f5563e;

    /* renamed from: g */
    public final long f5564g;

    /* renamed from: k */
    public final byte[] f5565k;

    /* renamed from: r */
    public int f5566r;

    /* renamed from: androidx.media3.extractor.metadata.emsg.EventMessage$a */
    public class C1037a implements Parcelable.Creator<EventMessage> {
        /* renamed from: a */
        public EventMessage createFromParcel(Parcel parcel) {
            return new EventMessage(parcel);
        }

        /* renamed from: b */
        public EventMessage[] newArray(int i) {
            return new EventMessage[i];
        }
    }

    public EventMessage(String str, String str2, long j, long j2, byte[] bArr) {
        this.f5561a = str;
        this.f5562d = str2;
        this.f5563e = j;
        this.f5564g = j2;
        this.f5565k = bArr;
    }

    /* renamed from: N0 */
    public /* synthetic */ void mo6551N0(C0816l.C0818b bVar) {
        yu3.m30839c(this, bVar);
    }

    /* renamed from: O */
    public C0792h mo6552O() {
        String str = this.f5561a;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1468477611:
                if (str.equals("urn:scte:scte35:2014:bin")) {
                    c = 0;
                    break;
                }
                break;
            case -795945609:
                if (str.equals("https://aomedia.org/emsg/ID3")) {
                    c = 1;
                    break;
                }
                break;
            case 1303648457:
                if (str.equals("https://developer.apple.com/streaming/emsg-id3")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return f5560x;
            case 1:
            case 2:
                return f5559s;
            default:
                return null;
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || EventMessage.class != obj.getClass()) {
            return false;
        }
        EventMessage eventMessage = (EventMessage) obj;
        if (this.f5563e != eventMessage.f5563e || this.f5564g != eventMessage.f5564g || !w67.m29346c(this.f5561a, eventMessage.f5561a) || !w67.m29346c(this.f5562d, eventMessage.f5562d) || !Arrays.equals(this.f5565k, eventMessage.f5565k)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        if (this.f5566r == 0) {
            String str = this.f5561a;
            int i2 = 0;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int i3 = (527 + i) * 31;
            String str2 = this.f5562d;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            long j = this.f5563e;
            long j2 = this.f5564g;
            this.f5566r = ((((((i3 + i2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + Arrays.hashCode(this.f5565k);
        }
        return this.f5566r;
    }

    /* renamed from: k1 */
    public byte[] mo6553k1() {
        if (mo6552O() != null) {
            return this.f5565k;
        }
        return null;
    }

    public String toString() {
        return "EMSG: scheme=" + this.f5561a + ", id=" + this.f5564g + ", durationMs=" + this.f5563e + ", value=" + this.f5562d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f5561a);
        parcel.writeString(this.f5562d);
        parcel.writeLong(this.f5563e);
        parcel.writeLong(this.f5564g);
        parcel.writeByteArray(this.f5565k);
    }

    public EventMessage(Parcel parcel) {
        this.f5561a = (String) w67.m29360j(parcel.readString());
        this.f5562d = (String) w67.m29360j(parcel.readString());
        this.f5563e = parcel.readLong();
        this.f5564g = parcel.readLong();
        this.f5565k = (byte[]) w67.m29360j(parcel.createByteArray());
    }
}
