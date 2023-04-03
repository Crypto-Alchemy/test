package androidx.media3.exoplayer.upstream;

import java.io.IOException;

/* renamed from: androidx.media3.exoplayer.upstream.b */
/* compiled from: LoadErrorHandlingPolicy */
public interface C1019b {

    /* renamed from: androidx.media3.exoplayer.upstream.b$a */
    /* compiled from: LoadErrorHandlingPolicy */
    public static final class C1020a {

        /* renamed from: a */
        public final int f5468a;

        /* renamed from: b */
        public final int f5469b;

        /* renamed from: c */
        public final int f5470c;

        /* renamed from: d */
        public final int f5471d;

        public C1020a(int i, int i2, int i3, int i4) {
            this.f5468a = i;
            this.f5469b = i2;
            this.f5470c = i3;
            this.f5471d = i4;
        }

        /* renamed from: a */
        public boolean mo7829a(int i) {
            if (i == 1) {
                if (this.f5468a - this.f5469b <= 1) {
                    return false;
                }
            } else if (this.f5470c - this.f5471d <= 1) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: androidx.media3.exoplayer.upstream.b$b */
    /* compiled from: LoadErrorHandlingPolicy */
    public static final class C1021b {

        /* renamed from: a */
        public final int f5472a;

        /* renamed from: b */
        public final long f5473b;

        public C1021b(int i, long j) {
            boolean z;
            if (j >= 0) {
                z = true;
            } else {
                z = false;
            }
            C2725kr.m20981a(z);
            this.f5472a = i;
            this.f5473b = j;
        }
    }

    /* renamed from: androidx.media3.exoplayer.upstream.b$c */
    /* compiled from: LoadErrorHandlingPolicy */
    public static final class C1022c {

        /* renamed from: a */
        public final vi3 f5474a;

        /* renamed from: b */
        public final jr3 f5475b;

        /* renamed from: c */
        public final IOException f5476c;

        /* renamed from: d */
        public final int f5477d;

        public C1022c(vi3 vi3, jr3 jr3, IOException iOException, int i) {
            this.f5474a = vi3;
            this.f5475b = jr3;
            this.f5476c = iOException;
            this.f5477d = i;
        }
    }

    /* renamed from: a */
    long mo7824a(C1022c cVar);

    /* renamed from: b */
    int mo7825b(int i);

    /* renamed from: c */
    void mo7826c(long j);

    /* renamed from: d */
    C1021b mo7827d(C1020a aVar, C1022c cVar);
}
