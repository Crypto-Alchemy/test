package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class ChapterTocFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterTocFrame> CREATOR = new C1045a();

    /* renamed from: d */
    public final String f5597d;

    /* renamed from: e */
    public final boolean f5598e;

    /* renamed from: g */
    public final boolean f5599g;

    /* renamed from: k */
    public final String[] f5600k;

    /* renamed from: r */
    public final Id3Frame[] f5601r;

    /* renamed from: androidx.media3.extractor.metadata.id3.ChapterTocFrame$a */
    public class C1045a implements Parcelable.Creator<ChapterTocFrame> {
        /* renamed from: a */
        public ChapterTocFrame createFromParcel(Parcel parcel) {
            return new ChapterTocFrame(parcel);
        }

        /* renamed from: b */
        public ChapterTocFrame[] newArray(int i) {
            return new ChapterTocFrame[i];
        }
    }

    public ChapterTocFrame(String str, boolean z, boolean z2, String[] strArr, Id3Frame[] id3FrameArr) {
        super("CTOC");
        this.f5597d = str;
        this.f5598e = z;
        this.f5599g = z2;
        this.f5600k = strArr;
        this.f5601r = id3FrameArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChapterTocFrame.class != obj.getClass()) {
            return false;
        }
        ChapterTocFrame chapterTocFrame = (ChapterTocFrame) obj;
        if (this.f5598e != chapterTocFrame.f5598e || this.f5599g != chapterTocFrame.f5599g || !w67.m29346c(this.f5597d, chapterTocFrame.f5597d) || !Arrays.equals(this.f5600k, chapterTocFrame.f5600k) || !Arrays.equals(this.f5601r, chapterTocFrame.f5601r)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int i2 = (((true + (this.f5598e ? 1 : 0)) * 31) + (this.f5599g ? 1 : 0)) * 31;
        String str = this.f5597d;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return i2 + i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f5597d);
        parcel.writeByte(this.f5598e ? (byte) 1 : 0);
        parcel.writeByte(this.f5599g ? (byte) 1 : 0);
        parcel.writeStringArray(this.f5600k);
        parcel.writeInt(this.f5601r.length);
        for (Id3Frame writeParcelable : this.f5601r) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public ChapterTocFrame(Parcel parcel) {
        super("CTOC");
        this.f5597d = (String) w67.m29360j(parcel.readString());
        boolean z = true;
        this.f5598e = parcel.readByte() != 0;
        this.f5599g = parcel.readByte() == 0 ? false : z;
        this.f5600k = (String[]) w67.m29360j(parcel.createStringArray());
        int readInt = parcel.readInt();
        this.f5601r = new Id3Frame[readInt];
        for (int i = 0; i < readInt; i++) {
            this.f5601r[i] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }
}
