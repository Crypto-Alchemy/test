package androidx.media3.extractor.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.C0792h;
import androidx.media3.common.C0816l;
import androidx.media3.common.Metadata;

public final class MotionPhotoMetadata implements Metadata.Entry {
    public static final Parcelable.Creator<MotionPhotoMetadata> CREATOR = new C1054a();

    /* renamed from: a */
    public final long f5628a;

    /* renamed from: d */
    public final long f5629d;

    /* renamed from: e */
    public final long f5630e;

    /* renamed from: g */
    public final long f5631g;

    /* renamed from: k */
    public final long f5632k;

    /* renamed from: androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata$a */
    public class C1054a implements Parcelable.Creator<MotionPhotoMetadata> {
        /* renamed from: a */
        public MotionPhotoMetadata createFromParcel(Parcel parcel) {
            return new MotionPhotoMetadata(parcel, (C1054a) null);
        }

        /* renamed from: b */
        public MotionPhotoMetadata[] newArray(int i) {
            return new MotionPhotoMetadata[i];
        }
    }

    public /* synthetic */ MotionPhotoMetadata(Parcel parcel, C1054a aVar) {
        this(parcel);
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
        if (obj == null || MotionPhotoMetadata.class != obj.getClass()) {
            return false;
        }
        MotionPhotoMetadata motionPhotoMetadata = (MotionPhotoMetadata) obj;
        if (this.f5628a == motionPhotoMetadata.f5628a && this.f5629d == motionPhotoMetadata.f5629d && this.f5630e == motionPhotoMetadata.f5630e && this.f5631g == motionPhotoMetadata.f5631g && this.f5632k == motionPhotoMetadata.f5632k) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + ll3.m47834b(this.f5628a)) * 31) + ll3.m47834b(this.f5629d)) * 31) + ll3.m47834b(this.f5630e)) * 31) + ll3.m47834b(this.f5631g)) * 31) + ll3.m47834b(this.f5632k);
    }

    /* renamed from: k1 */
    public /* synthetic */ byte[] mo6553k1() {
        return yu3.m30837a(this);
    }

    public String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f5628a + ", photoSize=" + this.f5629d + ", photoPresentationTimestampUs=" + this.f5630e + ", videoStartPosition=" + this.f5631g + ", videoSize=" + this.f5632k;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f5628a);
        parcel.writeLong(this.f5629d);
        parcel.writeLong(this.f5630e);
        parcel.writeLong(this.f5631g);
        parcel.writeLong(this.f5632k);
    }

    public MotionPhotoMetadata(long j, long j2, long j3, long j4, long j5) {
        this.f5628a = j;
        this.f5629d = j2;
        this.f5630e = j3;
        this.f5631g = j4;
        this.f5632k = j5;
    }

    public MotionPhotoMetadata(Parcel parcel) {
        this.f5628a = parcel.readLong();
        this.f5629d = parcel.readLong();
        this.f5630e = parcel.readLong();
        this.f5631g = parcel.readLong();
        this.f5632k = parcel.readLong();
    }
}
