package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;

public final class UrlLinkFrame extends Id3Frame {
    public static final Parcelable.Creator<UrlLinkFrame> CREATOR = new C1052a();

    /* renamed from: d */
    public final String f5622d;

    /* renamed from: e */
    public final String f5623e;

    /* renamed from: androidx.media3.extractor.metadata.id3.UrlLinkFrame$a */
    public class C1052a implements Parcelable.Creator<UrlLinkFrame> {
        /* renamed from: a */
        public UrlLinkFrame createFromParcel(Parcel parcel) {
            return new UrlLinkFrame(parcel);
        }

        /* renamed from: b */
        public UrlLinkFrame[] newArray(int i) {
            return new UrlLinkFrame[i];
        }
    }

    public UrlLinkFrame(String str, String str2, String str3) {
        super(str);
        this.f5622d = str2;
        this.f5623e = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || UrlLinkFrame.class != obj.getClass()) {
            return false;
        }
        UrlLinkFrame urlLinkFrame = (UrlLinkFrame) obj;
        if (!this.f5609a.equals(urlLinkFrame.f5609a) || !w67.m29346c(this.f5622d, urlLinkFrame.f5622d) || !w67.m29346c(this.f5623e, urlLinkFrame.f5623e)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int hashCode = (527 + this.f5609a.hashCode()) * 31;
        String str = this.f5622d;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        String str2 = this.f5623e;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    public String toString() {
        return this.f5609a + ": url=" + this.f5623e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f5609a);
        parcel.writeString(this.f5622d);
        parcel.writeString(this.f5623e);
    }

    public UrlLinkFrame(Parcel parcel) {
        super((String) w67.m29360j(parcel.readString()));
        this.f5622d = parcel.readString();
        this.f5623e = (String) w67.m29360j(parcel.readString());
    }
}
