package p000;

import androidx.media3.common.C0792h;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: zs6 */
/* compiled from: TrackOutput */
public interface zs6 {

    /* renamed from: zs6$a */
    /* compiled from: TrackOutput */
    public static final class C3758a {

        /* renamed from: a */
        public final int f20677a;

        /* renamed from: b */
        public final byte[] f20678b;

        /* renamed from: c */
        public final int f20679c;

        /* renamed from: d */
        public final int f20680d;

        public C3758a(int i, byte[] bArr, int i2, int i3) {
            this.f20677a = i;
            this.f20678b = bArr;
            this.f20679c = i2;
            this.f20680d = i3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C3758a.class != obj.getClass()) {
                return false;
            }
            C3758a aVar = (C3758a) obj;
            if (this.f20677a == aVar.f20677a && this.f20679c == aVar.f20679c && this.f20680d == aVar.f20680d && Arrays.equals(this.f20678b, aVar.f20678b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f20677a * 31) + Arrays.hashCode(this.f20678b)) * 31) + this.f20679c) * 31) + this.f20680d;
        }
    }

    /* renamed from: a */
    void mo7300a(gm4 gm4, int i);

    /* renamed from: b */
    void mo7301b(long j, int i, int i2, int i3, C3758a aVar);

    /* renamed from: c */
    void mo7302c(gm4 gm4, int i, int i2);

    /* renamed from: d */
    void mo7303d(C0792h hVar);

    /* renamed from: e */
    int mo7304e(u11 u11, int i, boolean z) throws IOException;

    /* renamed from: f */
    int mo7305f(u11 u11, int i, boolean z, int i2) throws IOException;
}
