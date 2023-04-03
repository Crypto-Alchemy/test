package androidx.media3.decoder;

import java.nio.ByteBuffer;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public class DecoderInputBuffer extends o40 {

    /* renamed from: d */
    public final jw0 f4591d;

    /* renamed from: e */
    public ByteBuffer f4592e;

    /* renamed from: g */
    public boolean f4593g;

    /* renamed from: k */
    public long f4594k;

    /* renamed from: r */
    public ByteBuffer f4595r;

    /* renamed from: s */
    public final int f4596s;

    /* renamed from: x */
    public final int f4597x;

    public static final class InsufficientCapacityException extends IllegalStateException {
        public final int currentCapacity;
        public final int requiredCapacity;

        public InsufficientCapacityException(int i, int i2) {
            super("Buffer too small (" + i + " < " + i2 + ")");
            this.currentCapacity = i;
            this.requiredCapacity = i2;
        }
    }

    static {
        ir3.m19787a("media3.decoder");
    }

    public DecoderInputBuffer(int i) {
        this(i, 0);
    }

    /* renamed from: z */
    public static DecoderInputBuffer m5953z() {
        return new DecoderInputBuffer(0);
    }

    @EnsuresNonNull({"supplementalData"})
    /* renamed from: B */
    public void mo6967B(int i) {
        ByteBuffer byteBuffer = this.f4595r;
        if (byteBuffer == null || byteBuffer.capacity() < i) {
            this.f4595r = ByteBuffer.allocate(i);
        } else {
            this.f4595r.clear();
        }
    }

    /* renamed from: h */
    public void mo6968h() {
        super.mo6968h();
        ByteBuffer byteBuffer = this.f4592e;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f4595r;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f4593g = false;
    }

    /* renamed from: v */
    public final ByteBuffer mo6969v(int i) {
        int i2;
        int i3 = this.f4596s;
        if (i3 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i3 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f4592e;
        if (byteBuffer == null) {
            i2 = 0;
        } else {
            i2 = byteBuffer.capacity();
        }
        throw new InsufficientCapacityException(i2, i);
    }

    @EnsuresNonNull({"data"})
    /* renamed from: w */
    public void mo6970w(int i) {
        int i2 = i + this.f4597x;
        ByteBuffer byteBuffer = this.f4592e;
        if (byteBuffer == null) {
            this.f4592e = mo6969v(i2);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i3 = i2 + position;
        if (capacity >= i3) {
            this.f4592e = byteBuffer;
            return;
        }
        ByteBuffer v = mo6969v(i3);
        v.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            v.put(byteBuffer);
        }
        this.f4592e = v;
    }

    /* renamed from: x */
    public final void mo6971x() {
        ByteBuffer byteBuffer = this.f4592e;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f4595r;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    /* renamed from: y */
    public final boolean mo6972y() {
        return mo23890l(1073741824);
    }

    public DecoderInputBuffer(int i, int i2) {
        this.f4591d = new jw0();
        this.f4596s = i;
        this.f4597x = i2;
    }
}
