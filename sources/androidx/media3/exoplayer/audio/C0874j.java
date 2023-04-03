package androidx.media3.exoplayer.audio;

import androidx.media3.exoplayer.audio.AudioProcessor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import okhttp3.internal.p023ws.RealWebSocket;

/* renamed from: androidx.media3.exoplayer.audio.j */
/* compiled from: SonicAudioProcessor */
public final class C0874j implements AudioProcessor {

    /* renamed from: b */
    public int f4774b;

    /* renamed from: c */
    public float f4775c = 1.0f;

    /* renamed from: d */
    public float f4776d = 1.0f;

    /* renamed from: e */
    public AudioProcessor.C0846a f4777e;

    /* renamed from: f */
    public AudioProcessor.C0846a f4778f;

    /* renamed from: g */
    public AudioProcessor.C0846a f4779g;

    /* renamed from: h */
    public AudioProcessor.C0846a f4780h;

    /* renamed from: i */
    public boolean f4781i;

    /* renamed from: j */
    public w56 f4782j;

    /* renamed from: k */
    public ByteBuffer f4783k;

    /* renamed from: l */
    public ShortBuffer f4784l;

    /* renamed from: m */
    public ByteBuffer f4785m;

    /* renamed from: n */
    public long f4786n;

    /* renamed from: o */
    public long f4787o;

    /* renamed from: p */
    public boolean f4788p;

    public C0874j() {
        AudioProcessor.C0846a aVar = AudioProcessor.C0846a.f4599e;
        this.f4777e = aVar;
        this.f4778f = aVar;
        this.f4779g = aVar;
        this.f4780h = aVar;
        ByteBuffer byteBuffer = AudioProcessor.f4598a;
        this.f4783k = byteBuffer;
        this.f4784l = byteBuffer.asShortBuffer();
        this.f4785m = byteBuffer;
        this.f4774b = -1;
    }

    /* renamed from: a */
    public boolean mo6977a() {
        if (this.f4778f.f4600a == -1 || (Math.abs(this.f4775c - 1.0f) < 1.0E-4f && Math.abs(this.f4776d - 1.0f) < 1.0E-4f && this.f4778f.f4600a == this.f4777e.f4600a)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public AudioProcessor.C0846a mo6978b(AudioProcessor.C0846a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (aVar.f4602c == 2) {
            int i = this.f4774b;
            if (i == -1) {
                i = aVar.f4600a;
            }
            this.f4777e = aVar;
            AudioProcessor.C0846a aVar2 = new AudioProcessor.C0846a(i, aVar.f4601b, 2);
            this.f4778f = aVar2;
            this.f4781i = true;
            return aVar2;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }

    /* renamed from: c */
    public void mo6979c(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f4786n += (long) remaining;
            ((w56) C2725kr.m20985e(this.f4782j)).mo27450t(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    /* renamed from: d */
    public void mo6980d() {
        w56 w56 = this.f4782j;
        if (w56 != null) {
            w56.mo27449s();
        }
        this.f4788p = true;
    }

    /* renamed from: e */
    public boolean mo6981e() {
        w56 w56;
        if (!this.f4788p || ((w56 = this.f4782j) != null && w56.mo27442k() != 0)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public long mo7175f(long j) {
        if (this.f4787o < RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
            return (long) (((double) this.f4775c) * ((double) j));
        }
        long l = this.f4786n - ((long) ((w56) C2725kr.m20985e(this.f4782j)).mo27443l());
        int i = this.f4780h.f4600a;
        int i2 = this.f4779g.f4600a;
        if (i == i2) {
            return w67.m29313J0(j, l, this.f4787o);
        }
        return w67.m29313J0(j, l * ((long) i), this.f4787o * ((long) i2));
    }

    public void flush() {
        if (mo6977a()) {
            AudioProcessor.C0846a aVar = this.f4777e;
            this.f4779g = aVar;
            AudioProcessor.C0846a aVar2 = this.f4778f;
            this.f4780h = aVar2;
            if (this.f4781i) {
                this.f4782j = new w56(aVar.f4600a, aVar.f4601b, this.f4775c, this.f4776d, aVar2.f4600a);
            } else {
                w56 w56 = this.f4782j;
                if (w56 != null) {
                    w56.mo27440i();
                }
            }
        }
        this.f4785m = AudioProcessor.f4598a;
        this.f4786n = 0;
        this.f4787o = 0;
        this.f4788p = false;
    }

    /* renamed from: g */
    public void mo7176g(float f) {
        if (this.f4776d != f) {
            this.f4776d = f;
            this.f4781i = true;
        }
    }

    public ByteBuffer getOutput() {
        int k;
        w56 w56 = this.f4782j;
        if (w56 != null && (k = w56.mo27442k()) > 0) {
            if (this.f4783k.capacity() < k) {
                ByteBuffer order = ByteBuffer.allocateDirect(k).order(ByteOrder.nativeOrder());
                this.f4783k = order;
                this.f4784l = order.asShortBuffer();
            } else {
                this.f4783k.clear();
                this.f4784l.clear();
            }
            w56.mo27441j(this.f4784l);
            this.f4787o += (long) k;
            this.f4783k.limit(k);
            this.f4785m = this.f4783k;
        }
        ByteBuffer byteBuffer = this.f4785m;
        this.f4785m = AudioProcessor.f4598a;
        return byteBuffer;
    }

    /* renamed from: h */
    public void mo7177h(float f) {
        if (this.f4775c != f) {
            this.f4775c = f;
            this.f4781i = true;
        }
    }

    public void reset() {
        this.f4775c = 1.0f;
        this.f4776d = 1.0f;
        AudioProcessor.C0846a aVar = AudioProcessor.C0846a.f4599e;
        this.f4777e = aVar;
        this.f4778f = aVar;
        this.f4779g = aVar;
        this.f4780h = aVar;
        ByteBuffer byteBuffer = AudioProcessor.f4598a;
        this.f4783k = byteBuffer;
        this.f4784l = byteBuffer.asShortBuffer();
        this.f4785m = byteBuffer;
        this.f4774b = -1;
        this.f4781i = false;
        this.f4782j = null;
        this.f4786n = 0;
        this.f4787o = 0;
        this.f4788p = false;
    }
}
