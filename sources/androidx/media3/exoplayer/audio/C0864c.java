package androidx.media3.exoplayer.audio;

import androidx.media3.exoplayer.audio.AudioProcessor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: androidx.media3.exoplayer.audio.c */
/* compiled from: BaseAudioProcessor */
public abstract class C0864c implements AudioProcessor {

    /* renamed from: b */
    public AudioProcessor.C0846a f4727b;

    /* renamed from: c */
    public AudioProcessor.C0846a f4728c;

    /* renamed from: d */
    public AudioProcessor.C0846a f4729d;

    /* renamed from: e */
    public AudioProcessor.C0846a f4730e;

    /* renamed from: f */
    public ByteBuffer f4731f;

    /* renamed from: g */
    public ByteBuffer f4732g;

    /* renamed from: h */
    public boolean f4733h;

    public C0864c() {
        ByteBuffer byteBuffer = AudioProcessor.f4598a;
        this.f4731f = byteBuffer;
        this.f4732g = byteBuffer;
        AudioProcessor.C0846a aVar = AudioProcessor.C0846a.f4599e;
        this.f4729d = aVar;
        this.f4730e = aVar;
        this.f4727b = aVar;
        this.f4728c = aVar;
    }

    /* renamed from: a */
    public boolean mo6977a() {
        if (this.f4730e != AudioProcessor.C0846a.f4599e) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final AudioProcessor.C0846a mo6978b(AudioProcessor.C0846a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        this.f4729d = aVar;
        this.f4730e = mo7122g(aVar);
        if (mo6977a()) {
            return this.f4730e;
        }
        return AudioProcessor.C0846a.f4599e;
    }

    /* renamed from: d */
    public final void mo6980d() {
        this.f4733h = true;
        mo7124i();
    }

    /* renamed from: e */
    public boolean mo6981e() {
        if (!this.f4733h || this.f4732g != AudioProcessor.f4598a) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo7121f() {
        return this.f4732g.hasRemaining();
    }

    public final void flush() {
        this.f4732g = AudioProcessor.f4598a;
        this.f4733h = false;
        this.f4727b = this.f4729d;
        this.f4728c = this.f4730e;
        mo7123h();
    }

    /* renamed from: g */
    public abstract AudioProcessor.C0846a mo7122g(AudioProcessor.C0846a aVar) throws AudioProcessor.UnhandledAudioFormatException;

    public ByteBuffer getOutput() {
        ByteBuffer byteBuffer = this.f4732g;
        this.f4732g = AudioProcessor.f4598a;
        return byteBuffer;
    }

    /* renamed from: h */
    public void mo7123h() {
    }

    /* renamed from: i */
    public void mo7124i() {
    }

    /* renamed from: j */
    public void mo7125j() {
    }

    /* renamed from: k */
    public final ByteBuffer mo7126k(int i) {
        if (this.f4731f.capacity() < i) {
            this.f4731f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f4731f.clear();
        }
        ByteBuffer byteBuffer = this.f4731f;
        this.f4732g = byteBuffer;
        return byteBuffer;
    }

    public final void reset() {
        flush();
        this.f4731f = AudioProcessor.f4598a;
        AudioProcessor.C0846a aVar = AudioProcessor.C0846a.f4599e;
        this.f4729d = aVar;
        this.f4730e = aVar;
        this.f4727b = aVar;
        this.f4728c = aVar;
        mo7125j();
    }
}
