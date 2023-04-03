package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;

public final class CommentFrame extends Id3Frame {
    public static final Parcelable.Creator<CommentFrame> CREATOR = new C1046a();

    /* renamed from: d */
    public final String f5602d;

    /* renamed from: e */
    public final String f5603e;

    /* renamed from: g */
    public final String f5604g;

    /* renamed from: androidx.media3.extractor.metadata.id3.CommentFrame$a */
    public class C1046a implements Parcelable.Creator<CommentFrame> {
        /* renamed from: a */
        public CommentFrame createFromParcel(Parcel parcel) {
            return new CommentFrame(parcel);
        }

        /* renamed from: b */
        public CommentFrame[] newArray(int i) {
            return new CommentFrame[i];
        }
    }

    public CommentFrame(String str, String str2, String str3) {
        super("COMM");
        this.f5602d = str;
        this.f5603e = str2;
        this.f5604g = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CommentFrame.class != obj.getClass()) {
            return false;
        }
        CommentFrame commentFrame = (CommentFrame) obj;
        if (!w67.m29346c(this.f5603e, commentFrame.f5603e) || !w67.m29346c(this.f5602d, commentFrame.f5602d) || !w67.m29346c(this.f5604g, commentFrame.f5604g)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int i2;
        String str = this.f5602d;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (527 + i) * 31;
        String str2 = this.f5603e;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str3 = this.f5604g;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return i5 + i3;
    }

    public String toString() {
        return this.f5609a + ": language=" + this.f5602d + ", description=" + this.f5603e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f5609a);
        parcel.writeString(this.f5602d);
        parcel.writeString(this.f5604g);
    }

    public CommentFrame(Parcel parcel) {
        super("COMM");
        this.f5602d = (String) w67.m29360j(parcel.readString());
        this.f5603e = (String) w67.m29360j(parcel.readString());
        this.f5604g = (String) w67.m29360j(parcel.readString());
    }
}
