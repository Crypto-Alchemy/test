package androidx.media3.extractor.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.C0792h;
import androidx.media3.common.C0816l;
import androidx.media3.common.Metadata;

@Deprecated
public class VorbisComment implements Metadata.Entry {
    public static final Parcelable.Creator<VorbisComment> CREATOR = new C1039a();

    /* renamed from: a */
    public final String f5575a;

    /* renamed from: d */
    public final String f5576d;

    /* renamed from: androidx.media3.extractor.metadata.flac.VorbisComment$a */
    public class C1039a implements Parcelable.Creator<VorbisComment> {
        /* renamed from: a */
        public VorbisComment createFromParcel(Parcel parcel) {
            return new VorbisComment(parcel);
        }

        /* renamed from: b */
        public VorbisComment[] newArray(int i) {
            return new VorbisComment[i];
        }
    }

    public VorbisComment(String str, String str2) {
        this.f5575a = str;
        this.f5576d = str2;
    }

    /* renamed from: N0 */
    public void mo6551N0(C0816l.C0818b bVar) {
        String str = this.f5575a;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    c = 0;
                    break;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c = 1;
                    break;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c = 2;
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c = 3;
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                bVar.mo6806L(this.f5576d);
                return;
            case 1:
                bVar.mo6829i0(this.f5576d);
                return;
            case 2:
                bVar.mo6813S(this.f5576d);
                return;
            case 3:
                bVar.mo6805K(this.f5576d);
                return;
            case 4:
                bVar.mo6807M(this.f5576d);
                return;
            default:
                return;
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
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VorbisComment vorbisComment = (VorbisComment) obj;
        if (!this.f5575a.equals(vorbisComment.f5575a) || !this.f5576d.equals(vorbisComment.f5576d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((527 + this.f5575a.hashCode()) * 31) + this.f5576d.hashCode();
    }

    /* renamed from: k1 */
    public /* synthetic */ byte[] mo6553k1() {
        return yu3.m30837a(this);
    }

    public String toString() {
        return "VC: " + this.f5575a + "=" + this.f5576d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f5575a);
        parcel.writeString(this.f5576d);
    }

    public VorbisComment(Parcel parcel) {
        this.f5575a = (String) w67.m29360j(parcel.readString());
        this.f5576d = (String) w67.m29360j(parcel.readString());
    }
}
