package androidx.media3.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.C0816l;
import java.util.Arrays;
import java.util.List;

public final class Metadata implements Parcelable {
    public static final Parcelable.Creator<Metadata> CREATOR = new C0774a();

    /* renamed from: a */
    public final Entry[] f4120a;

    public interface Entry extends Parcelable {
        /* renamed from: N0 */
        void mo6551N0(C0816l.C0818b bVar);

        /* renamed from: O */
        C0792h mo6552O();

        /* renamed from: k1 */
        byte[] mo6553k1();
    }

    /* renamed from: androidx.media3.common.Metadata$a */
    public class C0774a implements Parcelable.Creator<Metadata> {
        /* renamed from: a */
        public Metadata createFromParcel(Parcel parcel) {
            return new Metadata(parcel);
        }

        /* renamed from: b */
        public Metadata[] newArray(int i) {
            return new Metadata[i];
        }
    }

    public Metadata(Entry... entryArr) {
        this.f4120a = entryArr;
    }

    /* renamed from: a */
    public Metadata mo6542a(Entry... entryArr) {
        if (entryArr.length == 0) {
            return this;
        }
        return new Metadata((Entry[]) w67.m29297B0(this.f4120a, entryArr));
    }

    /* renamed from: b */
    public Metadata mo6543b(Metadata metadata) {
        if (metadata == null) {
            return this;
        }
        return mo6542a(metadata.f4120a);
    }

    /* renamed from: c */
    public Entry mo6544c(int i) {
        return this.f4120a[i];
    }

    /* renamed from: d */
    public int mo6545d() {
        return this.f4120a.length;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Metadata.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f4120a, ((Metadata) obj).f4120a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f4120a);
    }

    public String toString() {
        return "entries=" + Arrays.toString(this.f4120a);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f4120a.length);
        for (Entry writeParcelable : this.f4120a) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public Metadata(List<? extends Entry> list) {
        this.f4120a = (Entry[]) list.toArray(new Entry[0]);
    }

    public Metadata(Parcel parcel) {
        this.f4120a = new Entry[parcel.readInt()];
        int i = 0;
        while (true) {
            Entry[] entryArr = this.f4120a;
            if (i < entryArr.length) {
                entryArr[i] = (Entry) parcel.readParcelable(Entry.class.getClassLoader());
                i++;
            } else {
                return;
            }
        }
    }
}
