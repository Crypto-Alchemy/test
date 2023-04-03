package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class ChapterFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterFrame> CREATOR = new C1044a();

    /* renamed from: d */
    public final String f5591d;

    /* renamed from: e */
    public final int f5592e;

    /* renamed from: g */
    public final int f5593g;

    /* renamed from: k */
    public final long f5594k;

    /* renamed from: r */
    public final long f5595r;

    /* renamed from: s */
    public final Id3Frame[] f5596s;

    /* renamed from: androidx.media3.extractor.metadata.id3.ChapterFrame$a */
    public class C1044a implements Parcelable.Creator<ChapterFrame> {
        /* renamed from: a */
        public ChapterFrame createFromParcel(Parcel parcel) {
            return new ChapterFrame(parcel);
        }

        /* renamed from: b */
        public ChapterFrame[] newArray(int i) {
            return new ChapterFrame[i];
        }
    }

    public ChapterFrame(String str, int i, int i2, long j, long j2, Id3Frame[] id3FrameArr) {
        super("CHAP");
        this.f5591d = str;
        this.f5592e = i;
        this.f5593g = i2;
        this.f5594k = j;
        this.f5595r = j2;
        this.f5596s = id3FrameArr;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChapterFrame.class != obj.getClass()) {
            return false;
        }
        ChapterFrame chapterFrame = (ChapterFrame) obj;
        if (this.f5592e == chapterFrame.f5592e && this.f5593g == chapterFrame.f5593g && this.f5594k == chapterFrame.f5594k && this.f5595r == chapterFrame.f5595r && w67.m29346c(this.f5591d, chapterFrame.f5591d) && Arrays.equals(this.f5596s, chapterFrame.f5596s)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = (((((((527 + this.f5592e) * 31) + this.f5593g) * 31) + ((int) this.f5594k)) * 31) + ((int) this.f5595r)) * 31;
        String str = this.f5591d;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return i2 + i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f5591d);
        parcel.writeInt(this.f5592e);
        parcel.writeInt(this.f5593g);
        parcel.writeLong(this.f5594k);
        parcel.writeLong(this.f5595r);
        parcel.writeInt(this.f5596s.length);
        for (Id3Frame writeParcelable : this.f5596s) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public ChapterFrame(Parcel parcel) {
        super("CHAP");
        this.f5591d = (String) w67.m29360j(parcel.readString());
        this.f5592e = parcel.readInt();
        this.f5593g = parcel.readInt();
        this.f5594k = parcel.readLong();
        this.f5595r = parcel.readLong();
        int readInt = parcel.readInt();
        this.f5596s = new Id3Frame[readInt];
        for (int i = 0; i < readInt; i++) {
            this.f5596s[i] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }
}
