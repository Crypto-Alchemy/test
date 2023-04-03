package androidx.media3.exoplayer.audio;

import androidx.media3.common.C0778b;
import androidx.media3.common.C0792h;
import androidx.media3.common.C0820n;
import java.nio.ByteBuffer;

public interface AudioSink {

    public static final class InitializationException extends Exception {
        public final int audioTrackState;
        public final C0792h format;
        public final boolean isRecoverable;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public InitializationException(int r3, int r4, int r5, int r6, androidx.media3.common.C0792h r7, boolean r8, java.lang.Exception r9) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "AudioTrack init failed "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r1 = " "
                r0.append(r1)
                java.lang.String r1 = "Config("
                r0.append(r1)
                r0.append(r4)
                java.lang.String r4 = ", "
                r0.append(r4)
                r0.append(r5)
                r0.append(r4)
                r0.append(r6)
                java.lang.String r4 = ")"
                r0.append(r4)
                if (r8 == 0) goto L_0x0032
                java.lang.String r4 = " (recoverable)"
                goto L_0x0034
            L_0x0032:
                java.lang.String r4 = ""
            L_0x0034:
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r2.<init>(r4, r9)
                r2.audioTrackState = r3
                r2.isRecoverable = r8
                r2.format = r7
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.audio.AudioSink.InitializationException.<init>(int, int, int, int, androidx.media3.common.h, boolean, java.lang.Exception):void");
        }
    }

    public static final class UnexpectedDiscontinuityException extends Exception {
        public final long actualPresentationTimeUs;
        public final long expectedPresentationTimeUs;

        public UnexpectedDiscontinuityException(long j, long j2) {
            super("Unexpected audio track timestamp discontinuity: expected " + j2 + ", got " + j);
            this.actualPresentationTimeUs = j;
            this.expectedPresentationTimeUs = j2;
        }
    }

    public static final class WriteException extends Exception {
        public final int errorCode;
        public final C0792h format;
        public final boolean isRecoverable;

        public WriteException(int i, C0792h hVar, boolean z) {
            super("AudioTrack write failed: " + i);
            this.isRecoverable = z;
            this.errorCode = i;
            this.format = hVar;
        }
    }

    /* renamed from: androidx.media3.exoplayer.audio.AudioSink$a */
    public interface C0847a {
        /* renamed from: a */
        void mo7011a(long j);

        /* renamed from: b */
        void mo7012b(boolean z);

        /* renamed from: c */
        void mo7013c(Exception exc);

        /* renamed from: d */
        void mo7014d();

        /* renamed from: e */
        void mo7015e(int i, long j, long j2);

        /* renamed from: f */
        void mo7016f();

        /* renamed from: g */
        void mo7017g();
    }

    /* renamed from: a */
    boolean mo6986a(C0792h hVar);

    /* renamed from: b */
    void mo6987b(C0820n nVar);

    /* renamed from: c */
    void mo6988c();

    /* renamed from: d */
    C0820n mo6989d();

    /* renamed from: e */
    boolean mo6990e();

    /* renamed from: f */
    void mo6991f();

    void flush();

    /* renamed from: g */
    void mo6993g(C0778b bVar);

    /* renamed from: h */
    boolean mo6994h();

    /* renamed from: i */
    void mo6995i(int i);

    /* renamed from: j */
    void mo6996j(C0847a aVar);

    /* renamed from: k */
    void mo6997k();

    /* renamed from: l */
    void mo6998l(C3645xv xvVar);

    /* renamed from: m */
    boolean mo6999m(ByteBuffer byteBuffer, long j, int i) throws InitializationException, WriteException;

    /* renamed from: n */
    void mo7000n();

    /* renamed from: o */
    void mo7001o(C0792h hVar, int i, int[] iArr) throws ConfigurationException;

    /* renamed from: p */
    void mo7002p() throws WriteException;

    /* renamed from: q */
    long mo7003q(boolean z);

    /* renamed from: r */
    void mo7004r();

    void reset();

    /* renamed from: s */
    void mo7006s(float f);

    /* renamed from: t */
    void mo7007t(br4 br4);

    /* renamed from: u */
    void mo7008u();

    /* renamed from: v */
    int mo7009v(C0792h hVar);

    /* renamed from: w */
    void mo7010w(boolean z);

    public static final class ConfigurationException extends Exception {
        public final C0792h format;

        public ConfigurationException(Throwable th, C0792h hVar) {
            super(th);
            this.format = hVar;
        }

        public ConfigurationException(String str, C0792h hVar) {
            super(str);
            this.format = hVar;
        }
    }
}
