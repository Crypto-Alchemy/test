package p000;

import androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata;
import java.util.List;

/* renamed from: uy3 */
/* compiled from: MotionPhotoDescription */
public final class uy3 {

    /* renamed from: a */
    public final long f18610a;

    /* renamed from: b */
    public final List<C3448a> f18611b;

    /* renamed from: uy3$a */
    /* compiled from: MotionPhotoDescription */
    public static final class C3448a {

        /* renamed from: a */
        public final String f18612a;

        /* renamed from: b */
        public final String f18613b;

        /* renamed from: c */
        public final long f18614c;

        /* renamed from: d */
        public final long f18615d;

        public C3448a(String str, String str2, long j, long j2) {
            this.f18612a = str;
            this.f18613b = str2;
            this.f18614c = j;
            this.f18615d = j2;
        }
    }

    public uy3(long j, List<C3448a> list) {
        this.f18610a = j;
        this.f18611b = list;
    }

    /* renamed from: a */
    public MotionPhotoMetadata mo26944a(long j) {
        long j2;
        if (this.f18611b.size() < 2) {
            return null;
        }
        long j3 = j;
        long j4 = -1;
        long j5 = -1;
        long j6 = -1;
        long j7 = -1;
        boolean z = false;
        for (int size = this.f18611b.size() - 1; size >= 0; size--) {
            C3448a aVar = this.f18611b.get(size);
            boolean equals = "video/mp4".equals(aVar.f18612a) | z;
            if (size == 0) {
                j2 = j3 - aVar.f18615d;
                j3 = 0;
            } else {
                long j8 = j3;
                j3 -= aVar.f18614c;
                j2 = j8;
            }
            if (!equals || j3 == j2) {
                z = equals;
            } else {
                j7 = j2 - j3;
                j6 = j3;
                z = false;
            }
            if (size == 0) {
                j4 = j3;
                j5 = j2;
            }
        }
        if (j6 == -1 || j7 == -1 || j4 == -1 || j5 == -1) {
            return null;
        }
        return new MotionPhotoMetadata(j4, j5, this.f18610a, j6, j7);
    }
}
