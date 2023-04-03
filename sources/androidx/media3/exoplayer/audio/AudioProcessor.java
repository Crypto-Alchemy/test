package androidx.media3.exoplayer.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public interface AudioProcessor {

    /* renamed from: a */
    public static final ByteBuffer f4598a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    public static final class UnhandledAudioFormatException extends Exception {
        public UnhandledAudioFormatException(C0846a aVar) {
            super("Unhandled format: " + aVar);
        }
    }

    /* renamed from: androidx.media3.exoplayer.audio.AudioProcessor$a */
    public static final class C0846a {

        /* renamed from: e */
        public static final C0846a f4599e = new C0846a(-1, -1, -1);

        /* renamed from: a */
        public final int f4600a;

        /* renamed from: b */
        public final int f4601b;

        /* renamed from: c */
        public final int f4602c;

        /* renamed from: d */
        public final int f4603d;

        public C0846a(int i, int i2, int i3) {
            int i4;
            this.f4600a = i;
            this.f4601b = i2;
            this.f4602c = i3;
            if (w67.m29375q0(i3)) {
                i4 = w67.m29343a0(i3, i2);
            } else {
                i4 = -1;
            }
            this.f4603d = i4;
        }

        public String toString() {
            return "AudioFormat[sampleRate=" + this.f4600a + ", channelCount=" + this.f4601b + ", encoding=" + this.f4602c + ']';
        }
    }

    /* renamed from: a */
    boolean mo6977a();

    /* renamed from: b */
    C0846a mo6978b(C0846a aVar) throws UnhandledAudioFormatException;

    /* renamed from: c */
    void mo6979c(ByteBuffer byteBuffer);

    /* renamed from: d */
    void mo6980d();

    /* renamed from: e */
    boolean mo6981e();

    void flush();

    ByteBuffer getOutput();

    void reset();
}
