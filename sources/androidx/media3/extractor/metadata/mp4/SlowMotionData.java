package androidx.media3.extractor.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.C0792h;
import androidx.media3.common.C0816l;
import androidx.media3.common.Metadata;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public final class SlowMotionData implements Metadata.Entry {
    public static final Parcelable.Creator<SlowMotionData> CREATOR = new C1056a();

    /* renamed from: a */
    public final List<Segment> f5633a;

    public static final class Segment implements Parcelable {
        public static final Parcelable.Creator<Segment> CREATOR = new C1055a();

        /* renamed from: g */
        public static final Comparator<Segment> f5634g = new u46();

        /* renamed from: a */
        public final long f5635a;

        /* renamed from: d */
        public final long f5636d;

        /* renamed from: e */
        public final int f5637e;

        /* renamed from: androidx.media3.extractor.metadata.mp4.SlowMotionData$Segment$a */
        public class C1055a implements Parcelable.Creator<Segment> {
            /* renamed from: a */
            public Segment createFromParcel(Parcel parcel) {
                return new Segment(parcel.readLong(), parcel.readLong(), parcel.readInt());
            }

            /* renamed from: b */
            public Segment[] newArray(int i) {
                return new Segment[i];
            }
        }

        public Segment(long j, long j2, int i) {
            boolean z;
            if (j < j2) {
                z = true;
            } else {
                z = false;
            }
            C2725kr.m20981a(z);
            this.f5635a = j;
            this.f5636d = j2;
            this.f5637e = i;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Segment.class != obj.getClass()) {
                return false;
            }
            Segment segment = (Segment) obj;
            if (this.f5635a == segment.f5635a && this.f5636d == segment.f5636d && this.f5637e == segment.f5637e) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return jf4.m46497b(Long.valueOf(this.f5635a), Long.valueOf(this.f5636d), Integer.valueOf(this.f5637e));
        }

        public String toString() {
            return w67.m29294A("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f5635a), Long.valueOf(this.f5636d), Integer.valueOf(this.f5637e));
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f5635a);
            parcel.writeLong(this.f5636d);
            parcel.writeInt(this.f5637e);
        }
    }

    /* renamed from: androidx.media3.extractor.metadata.mp4.SlowMotionData$a */
    public class C1056a implements Parcelable.Creator<SlowMotionData> {
        /* renamed from: a */
        public SlowMotionData createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, Segment.class.getClassLoader());
            return new SlowMotionData(arrayList);
        }

        /* renamed from: b */
        public SlowMotionData[] newArray(int i) {
            return new SlowMotionData[i];
        }
    }

    public SlowMotionData(List<Segment> list) {
        this.f5633a = list;
        C2725kr.m20981a(!m7682a(list));
    }

    /* renamed from: a */
    public static boolean m7682a(List<Segment> list) {
        if (list.isEmpty()) {
            return false;
        }
        long j = list.get(0).f5636d;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).f5635a < j) {
                return true;
            }
            j = list.get(i).f5636d;
        }
        return false;
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
        if (obj == null || SlowMotionData.class != obj.getClass()) {
            return false;
        }
        return this.f5633a.equals(((SlowMotionData) obj).f5633a);
    }

    public int hashCode() {
        return this.f5633a.hashCode();
    }

    /* renamed from: k1 */
    public /* synthetic */ byte[] mo6553k1() {
        return yu3.m30837a(this);
    }

    public String toString() {
        return "SlowMotion: segments=" + this.f5633a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.f5633a);
    }
}
