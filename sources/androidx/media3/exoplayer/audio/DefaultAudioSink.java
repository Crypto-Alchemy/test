package androidx.media3.exoplayer.audio;

import android.annotation.SuppressLint;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.common.C0778b;
import androidx.media3.common.C0792h;
import androidx.media3.common.C0820n;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.audio.AudioProcessor;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.audio.C0862b;
import androidx.media3.exoplayer.audio.C0866e;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.utils.Utils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

public final class DefaultAudioSink implements AudioSink {

    /* renamed from: c0 */
    public static boolean f4604c0 = false;

    /* renamed from: A */
    public int f4605A;

    /* renamed from: B */
    public long f4606B;

    /* renamed from: C */
    public long f4607C;

    /* renamed from: D */
    public long f4608D;

    /* renamed from: E */
    public long f4609E;

    /* renamed from: F */
    public int f4610F;

    /* renamed from: G */
    public boolean f4611G;

    /* renamed from: H */
    public boolean f4612H;

    /* renamed from: I */
    public long f4613I;

    /* renamed from: J */
    public float f4614J;

    /* renamed from: K */
    public AudioProcessor[] f4615K;

    /* renamed from: L */
    public ByteBuffer[] f4616L;

    /* renamed from: M */
    public ByteBuffer f4617M;

    /* renamed from: N */
    public int f4618N;

    /* renamed from: O */
    public ByteBuffer f4619O;

    /* renamed from: P */
    public byte[] f4620P;

    /* renamed from: Q */
    public int f4621Q;

    /* renamed from: R */
    public int f4622R;

    /* renamed from: S */
    public boolean f4623S;

    /* renamed from: T */
    public boolean f4624T;

    /* renamed from: U */
    public boolean f4625U;

    /* renamed from: V */
    public boolean f4626V;

    /* renamed from: W */
    public int f4627W;

    /* renamed from: X */
    public C3645xv f4628X;

    /* renamed from: Y */
    public boolean f4629Y;

    /* renamed from: Z */
    public long f4630Z;

    /* renamed from: a */
    public final C3168qs f4631a;

    /* renamed from: a0 */
    public boolean f4632a0;

    /* renamed from: b */
    public final C0850c f4633b;

    /* renamed from: b0 */
    public boolean f4634b0;

    /* renamed from: c */
    public final boolean f4635c;

    /* renamed from: d */
    public final C0865d f4636d;

    /* renamed from: e */
    public final C0875k f4637e;

    /* renamed from: f */
    public final AudioProcessor[] f4638f;

    /* renamed from: g */
    public final AudioProcessor[] f4639g;

    /* renamed from: h */
    public final lo0 f4640h;

    /* renamed from: i */
    public final C0862b f4641i;

    /* renamed from: j */
    public final ArrayDeque<C0855h> f4642j;

    /* renamed from: k */
    public final boolean f4643k;

    /* renamed from: l */
    public final int f4644l;

    /* renamed from: m */
    public C0858k f4645m;

    /* renamed from: n */
    public final C0856i<AudioSink.InitializationException> f4646n;

    /* renamed from: o */
    public final C0856i<AudioSink.WriteException> f4647o;

    /* renamed from: p */
    public final C0851d f4648p;

    /* renamed from: q */
    public br4 f4649q;

    /* renamed from: r */
    public AudioSink.C0847a f4650r;

    /* renamed from: s */
    public C0853f f4651s;

    /* renamed from: t */
    public C0853f f4652t;

    /* renamed from: u */
    public AudioTrack f4653u;

    /* renamed from: v */
    public C0778b f4654v;

    /* renamed from: w */
    public C0855h f4655w;

    /* renamed from: x */
    public C0855h f4656x;

    /* renamed from: y */
    public C0820n f4657y;

    /* renamed from: z */
    public ByteBuffer f4658z;

    public static final class InvalidAudioTrackTimestampException extends RuntimeException {
        public /* synthetic */ InvalidAudioTrackTimestampException(String str, C0848a aVar) {
            this(str);
        }

        public InvalidAudioTrackTimestampException(String str) {
            super(str);
        }
    }

    /* renamed from: androidx.media3.exoplayer.audio.DefaultAudioSink$a */
    public class C0848a extends Thread {

        /* renamed from: a */
        public final /* synthetic */ AudioTrack f4659a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0848a(String str, AudioTrack audioTrack) {
            super(str);
            this.f4659a = audioTrack;
        }

        public void run() {
            try {
                this.f4659a.flush();
                this.f4659a.release();
            } finally {
                DefaultAudioSink.this.f4640h.mo22888e();
            }
        }
    }

    /* renamed from: androidx.media3.exoplayer.audio.DefaultAudioSink$b */
    public static final class C0849b {
        /* renamed from: a */
        public static void m6066a(AudioTrack audioTrack, br4 br4) {
            LogSessionId a = br4.mo11789a();
            if (!a.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                audioTrack.setLogSessionId(a);
            }
        }
    }

    /* renamed from: androidx.media3.exoplayer.audio.DefaultAudioSink$c */
    public interface C0850c {
        /* renamed from: a */
        long mo7048a(long j);

        /* renamed from: b */
        AudioProcessor[] mo7049b();

        /* renamed from: c */
        C0820n mo7050c(C0820n nVar);

        /* renamed from: d */
        long mo7051d();

        /* renamed from: e */
        boolean mo7052e(boolean z);
    }

    /* renamed from: androidx.media3.exoplayer.audio.DefaultAudioSink$d */
    public interface C0851d {

        /* renamed from: a */
        public static final C0851d f4661a = new C0866e.C0867a().mo7132g();

        /* renamed from: a */
        int mo7053a(int i, int i2, int i3, int i4, int i5, double d);
    }

    /* renamed from: androidx.media3.exoplayer.audio.DefaultAudioSink$e */
    public static final class C0852e {

        /* renamed from: a */
        public C3168qs f4662a = C3168qs.f17047c;

        /* renamed from: b */
        public C0850c f4663b;

        /* renamed from: c */
        public boolean f4664c;

        /* renamed from: d */
        public boolean f4665d;

        /* renamed from: e */
        public int f4666e = 0;

        /* renamed from: f */
        public C0851d f4667f = C0851d.f4661a;

        /* renamed from: f */
        public DefaultAudioSink mo7054f() {
            if (this.f4663b == null) {
                this.f4663b = new C0854g(new AudioProcessor[0]);
            }
            return new DefaultAudioSink(this, (C0848a) null);
        }

        /* renamed from: g */
        public C0852e mo7055g(C3168qs qsVar) {
            C2725kr.m20985e(qsVar);
            this.f4662a = qsVar;
            return this;
        }

        /* renamed from: h */
        public C0852e mo7056h(boolean z) {
            this.f4665d = z;
            return this;
        }

        /* renamed from: i */
        public C0852e mo7057i(boolean z) {
            this.f4664c = z;
            return this;
        }

        /* renamed from: j */
        public C0852e mo7058j(int i) {
            this.f4666e = i;
            return this;
        }
    }

    /* renamed from: androidx.media3.exoplayer.audio.DefaultAudioSink$f */
    public static final class C0853f {

        /* renamed from: a */
        public final C0792h f4668a;

        /* renamed from: b */
        public final int f4669b;

        /* renamed from: c */
        public final int f4670c;

        /* renamed from: d */
        public final int f4671d;

        /* renamed from: e */
        public final int f4672e;

        /* renamed from: f */
        public final int f4673f;

        /* renamed from: g */
        public final int f4674g;

        /* renamed from: h */
        public final int f4675h;

        /* renamed from: i */
        public final AudioProcessor[] f4676i;

        public C0853f(C0792h hVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, AudioProcessor[] audioProcessorArr) {
            this.f4668a = hVar;
            this.f4669b = i;
            this.f4670c = i2;
            this.f4671d = i3;
            this.f4672e = i4;
            this.f4673f = i5;
            this.f4674g = i6;
            this.f4675h = i7;
            this.f4676i = audioProcessorArr;
        }

        /* renamed from: i */
        public static AudioAttributes m6083i(C0778b bVar, boolean z) {
            if (z) {
                return m6084j();
            }
            return bVar.mo6586b().f4150a;
        }

        /* renamed from: j */
        public static AudioAttributes m6084j() {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }

        /* renamed from: a */
        public AudioTrack mo7059a(boolean z, C0778b bVar, int i) throws AudioSink.InitializationException {
            try {
                AudioTrack d = mo7062d(z, bVar, i);
                int state = d.getState();
                if (state == 1) {
                    return d;
                }
                try {
                    d.release();
                } catch (Exception unused) {
                }
                throw new AudioSink.InitializationException(state, this.f4672e, this.f4673f, this.f4675h, this.f4668a, mo7068l(), (Exception) null);
            } catch (IllegalArgumentException | UnsupportedOperationException e) {
                throw new AudioSink.InitializationException(0, this.f4672e, this.f4673f, this.f4675h, this.f4668a, mo7068l(), e);
            }
        }

        /* renamed from: b */
        public boolean mo7060b(C0853f fVar) {
            if (fVar.f4670c == this.f4670c && fVar.f4674g == this.f4674g && fVar.f4672e == this.f4672e && fVar.f4673f == this.f4673f && fVar.f4671d == this.f4671d) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public C0853f mo7061c(int i) {
            return new C0853f(this.f4668a, this.f4669b, this.f4670c, this.f4671d, this.f4672e, this.f4673f, this.f4674g, i, this.f4676i);
        }

        /* renamed from: d */
        public final AudioTrack mo7062d(boolean z, C0778b bVar, int i) {
            int i2 = w67.f19021a;
            if (i2 >= 29) {
                return mo7064f(z, bVar, i);
            }
            if (i2 >= 21) {
                return mo7063e(z, bVar, i);
            }
            return mo7065g(bVar, i);
        }

        /* renamed from: e */
        public final AudioTrack mo7063e(boolean z, C0778b bVar, int i) {
            return new AudioTrack(m6083i(bVar, z), DefaultAudioSink.m6003M(this.f4672e, this.f4673f, this.f4674g), this.f4675h, 1, i);
        }

        /* renamed from: f */
        public final AudioTrack mo7064f(boolean z, C0778b bVar, int i) {
            AudioFormat C = DefaultAudioSink.m6003M(this.f4672e, this.f4673f, this.f4674g);
            AudioAttributes i2 = m6083i(bVar, z);
            boolean z2 = true;
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(i2).setAudioFormat(C).setTransferMode(1).setBufferSizeInBytes(this.f4675h).setSessionId(i);
            if (this.f4670c != 1) {
                z2 = false;
            }
            return sessionId.setOffloadedPlayback(z2).build();
        }

        /* renamed from: g */
        public final AudioTrack mo7065g(C0778b bVar, int i) {
            int c0 = w67.m29347c0(bVar.f4146e);
            if (i == 0) {
                return new AudioTrack(c0, this.f4672e, this.f4673f, this.f4674g, this.f4675h, 1);
            }
            return new AudioTrack(c0, this.f4672e, this.f4673f, this.f4674g, this.f4675h, 1, i);
        }

        /* renamed from: h */
        public long mo7066h(long j) {
            return (j * 1000000) / ((long) this.f4672e);
        }

        /* renamed from: k */
        public long mo7067k(long j) {
            return (j * 1000000) / ((long) this.f4668a.f4187b1);
        }

        /* renamed from: l */
        public boolean mo7068l() {
            if (this.f4670c == 1) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: androidx.media3.exoplayer.audio.DefaultAudioSink$g */
    public static class C0854g implements C0850c {

        /* renamed from: a */
        public final AudioProcessor[] f4677a;

        /* renamed from: b */
        public final C0873i f4678b;

        /* renamed from: c */
        public final C0874j f4679c;

        public C0854g(AudioProcessor... audioProcessorArr) {
            this(audioProcessorArr, new C0873i(), new C0874j());
        }

        /* renamed from: a */
        public long mo7048a(long j) {
            return this.f4679c.mo7175f(j);
        }

        /* renamed from: b */
        public AudioProcessor[] mo7049b() {
            return this.f4677a;
        }

        /* renamed from: c */
        public C0820n mo7050c(C0820n nVar) {
            this.f4679c.mo7177h(nVar.f4406a);
            this.f4679c.mo7176g(nVar.f4407d);
            return nVar;
        }

        /* renamed from: d */
        public long mo7051d() {
            return this.f4678b.mo7167o();
        }

        /* renamed from: e */
        public boolean mo7052e(boolean z) {
            this.f4678b.mo7173u(z);
            return z;
        }

        public C0854g(AudioProcessor[] audioProcessorArr, C0873i iVar, C0874j jVar) {
            AudioProcessor[] audioProcessorArr2 = new AudioProcessor[(audioProcessorArr.length + 2)];
            this.f4677a = audioProcessorArr2;
            System.arraycopy(audioProcessorArr, 0, audioProcessorArr2, 0, audioProcessorArr.length);
            this.f4678b = iVar;
            this.f4679c = jVar;
            audioProcessorArr2[audioProcessorArr.length] = iVar;
            audioProcessorArr2[audioProcessorArr.length + 1] = jVar;
        }
    }

    /* renamed from: androidx.media3.exoplayer.audio.DefaultAudioSink$h */
    public static final class C0855h {

        /* renamed from: a */
        public final C0820n f4680a;

        /* renamed from: b */
        public final boolean f4681b;

        /* renamed from: c */
        public final long f4682c;

        /* renamed from: d */
        public final long f4683d;

        public /* synthetic */ C0855h(C0820n nVar, boolean z, long j, long j2, C0848a aVar) {
            this(nVar, z, j, j2);
        }

        public C0855h(C0820n nVar, boolean z, long j, long j2) {
            this.f4680a = nVar;
            this.f4681b = z;
            this.f4682c = j;
            this.f4683d = j2;
        }
    }

    /* renamed from: androidx.media3.exoplayer.audio.DefaultAudioSink$i */
    public static final class C0856i<T extends Exception> {

        /* renamed from: a */
        public final long f4684a;

        /* renamed from: b */
        public T f4685b;

        /* renamed from: c */
        public long f4686c;

        public C0856i(long j) {
            this.f4684a = j;
        }

        /* renamed from: a */
        public void mo7069a() {
            this.f4685b = null;
        }

        /* renamed from: b */
        public void mo7070b(T t) throws Exception {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f4685b == null) {
                this.f4685b = t;
                this.f4686c = this.f4684a + elapsedRealtime;
            }
            if (elapsedRealtime >= this.f4686c) {
                T t2 = this.f4685b;
                if (t2 != t) {
                    t2.addSuppressed(t);
                }
                T t3 = this.f4685b;
                mo7069a();
                throw t3;
            }
        }
    }

    /* renamed from: androidx.media3.exoplayer.audio.DefaultAudioSink$j */
    public final class C0857j implements C0862b.C0863a {
        public C0857j() {
        }

        /* renamed from: a */
        public void mo7071a(long j) {
            if (DefaultAudioSink.this.f4650r != null) {
                DefaultAudioSink.this.f4650r.mo7011a(j);
            }
        }

        /* renamed from: b */
        public void mo7072b(int i, long j) {
            if (DefaultAudioSink.this.f4650r != null) {
                DefaultAudioSink.this.f4650r.mo7015e(i, j, SystemClock.elapsedRealtime() - DefaultAudioSink.this.f4630Z);
            }
        }

        /* renamed from: c */
        public void mo7073c(long j) {
            gk3.m18132i("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j);
        }

        /* renamed from: d */
        public void mo7074d(long j, long j2, long j3, long j4) {
            String str = "Spurious audio timestamp (frame position mismatch): " + j + ", " + j2 + ", " + j3 + ", " + j4 + ", " + DefaultAudioSink.this.mo7029T() + ", " + DefaultAudioSink.this.mo7030U();
            if (!DefaultAudioSink.f4604c0) {
                gk3.m18132i("DefaultAudioSink", str);
                return;
            }
            throw new InvalidAudioTrackTimestampException(str, (C0848a) null);
        }

        /* renamed from: e */
        public void mo7075e(long j, long j2, long j3, long j4) {
            String str = "Spurious audio timestamp (system clock mismatch): " + j + ", " + j2 + ", " + j3 + ", " + j4 + ", " + DefaultAudioSink.this.mo7029T() + ", " + DefaultAudioSink.this.mo7030U();
            if (!DefaultAudioSink.f4604c0) {
                gk3.m18132i("DefaultAudioSink", str);
                return;
            }
            throw new InvalidAudioTrackTimestampException(str, (C0848a) null);
        }

        public /* synthetic */ C0857j(DefaultAudioSink defaultAudioSink, C0848a aVar) {
            this();
        }
    }

    /* renamed from: androidx.media3.exoplayer.audio.DefaultAudioSink$k */
    public final class C0858k {

        /* renamed from: a */
        public final Handler f4688a = new Handler();

        /* renamed from: b */
        public final AudioTrack$StreamEventCallback f4689b;

        /* renamed from: androidx.media3.exoplayer.audio.DefaultAudioSink$k$a */
        public class C0859a extends AudioTrack$StreamEventCallback {

            /* renamed from: a */
            public final /* synthetic */ DefaultAudioSink f4691a;

            public C0859a(DefaultAudioSink defaultAudioSink) {
                this.f4691a = defaultAudioSink;
            }

            public void onDataRequest(AudioTrack audioTrack, int i) {
                boolean z;
                if (audioTrack == DefaultAudioSink.this.f4653u) {
                    z = true;
                } else {
                    z = false;
                }
                C2725kr.m20987g(z);
                if (DefaultAudioSink.this.f4650r != null && DefaultAudioSink.this.f4625U) {
                    DefaultAudioSink.this.f4650r.mo7017g();
                }
            }

            public void onTearDown(AudioTrack audioTrack) {
                boolean z;
                if (audioTrack == DefaultAudioSink.this.f4653u) {
                    z = true;
                } else {
                    z = false;
                }
                C2725kr.m20987g(z);
                if (DefaultAudioSink.this.f4650r != null && DefaultAudioSink.this.f4625U) {
                    DefaultAudioSink.this.f4650r.mo7017g();
                }
            }
        }

        public C0858k() {
            this.f4689b = new C0859a(DefaultAudioSink.this);
        }

        /* renamed from: a */
        public void mo7076a(AudioTrack audioTrack) {
            Handler handler = this.f4688a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new q61(handler), this.f4689b);
        }

        /* renamed from: b */
        public void mo7077b(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.f4689b);
            this.f4688a.removeCallbacksAndMessages((Object) null);
        }
    }

    public /* synthetic */ DefaultAudioSink(C0852e eVar, C0848a aVar) {
        this(eVar);
    }

    /* renamed from: M */
    public static AudioFormat m6003M(int i, int i2, int i3) {
        return new AudioFormat.Builder().setSampleRate(i).setChannelMask(i2).setEncoding(i3).build();
    }

    /* renamed from: O */
    public static int m6004O(int i, int i2, int i3) {
        boolean z;
        int minBufferSize = AudioTrack.getMinBufferSize(i, i2, i3);
        if (minBufferSize != -2) {
            z = true;
        } else {
            z = false;
        }
        C2725kr.m20987g(z);
        return minBufferSize;
    }

    /* renamed from: P */
    public static int m6005P(int i, ByteBuffer byteBuffer) {
        switch (i) {
            case 5:
            case 6:
            case 18:
                return C3182r7.m26082d(byteBuffer);
            case 7:
            case 8:
                return zk1.m31352e(byteBuffer);
            case 9:
                int m = kz3.m21180m(w67.m29306G(byteBuffer, byteBuffer.position()));
                if (m != -1) {
                    return m;
                }
                throw new IllegalArgumentException();
            case 10:
                return RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE;
            case 11:
            case 12:
                return 2048;
            case 14:
                int a = C3182r7.m26079a(byteBuffer);
                if (a == -1) {
                    return 0;
                }
                return C3182r7.m26086h(byteBuffer, a) * 16;
            case 15:
                return RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN;
            case 16:
                return RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE;
            case 17:
                return C3467v7.m28677c(byteBuffer);
            default:
                throw new IllegalStateException("Unexpected audio encoding: " + i);
        }
    }

    /* renamed from: W */
    public static boolean m6006W(int i) {
        if ((w67.f19021a < 24 || i != -6) && i != -32) {
            return false;
        }
        return true;
    }

    /* renamed from: Y */
    public static boolean m6007Y(AudioTrack audioTrack) {
        if (w67.f19021a < 29 || !audioTrack.isOffloadedPlayback()) {
            return false;
        }
        return true;
    }

    /* renamed from: h0 */
    public static void m6008h0(AudioTrack audioTrack, float f) {
        audioTrack.setVolume(f);
    }

    /* renamed from: i0 */
    public static void m6009i0(AudioTrack audioTrack, float f) {
        audioTrack.setStereoVolume(f, f);
    }

    /* renamed from: o0 */
    public static int m6010o0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
        return audioTrack.write(byteBuffer, i, 1);
    }

    /* renamed from: F */
    public final void mo7018F(long j) {
        C0820n nVar;
        boolean z;
        if (mo7042k0()) {
            nVar = this.f4633b.mo7050c(mo7025N());
        } else {
            nVar = C0820n.f4404g;
        }
        C0820n nVar2 = nVar;
        if (mo7042k0()) {
            z = this.f4633b.mo7052e(mo7028S());
        } else {
            z = false;
        }
        this.f4642j.add(new C0855h(nVar2, z, Math.max(0, j), this.f4652t.mo7066h(mo7030U()), (C0848a) null));
        mo7041j0();
        AudioSink.C0847a aVar = this.f4650r;
        if (aVar != null) {
            aVar.mo7012b(z);
        }
    }

    /* renamed from: G */
    public final long mo7019G(long j) {
        while (!this.f4642j.isEmpty() && j >= this.f4642j.getFirst().f4683d) {
            this.f4656x = this.f4642j.remove();
        }
        C0855h hVar = this.f4656x;
        long j2 = j - hVar.f4683d;
        if (hVar.f4680a.equals(C0820n.f4404g)) {
            return this.f4656x.f4682c + j2;
        }
        if (this.f4642j.isEmpty()) {
            return this.f4656x.f4682c + this.f4633b.mo7048a(j2);
        }
        C0855h first = this.f4642j.getFirst();
        return first.f4682c - w67.m29338W(first.f4683d - j, this.f4656x.f4680a.f4406a);
    }

    /* renamed from: H */
    public final long mo7020H(long j) {
        return j + this.f4652t.mo7066h(this.f4633b.mo7051d());
    }

    /* renamed from: I */
    public final AudioTrack mo7021I(C0853f fVar) throws AudioSink.InitializationException {
        try {
            return fVar.mo7059a(this.f4629Y, this.f4654v, this.f4627W);
        } catch (AudioSink.InitializationException e) {
            AudioSink.C0847a aVar = this.f4650r;
            if (aVar != null) {
                aVar.mo7013c(e);
            }
            throw e;
        }
    }

    /* renamed from: J */
    public final AudioTrack mo7022J() throws AudioSink.InitializationException {
        try {
            return mo7021I((C0853f) C2725kr.m20985e(this.f4652t));
        } catch (AudioSink.InitializationException e) {
            C0853f fVar = this.f4652t;
            if (fVar.f4675h > 1000000) {
                C0853f c = fVar.mo7061c(PlaybackException.CUSTOM_ERROR_CODE_BASE);
                try {
                    AudioTrack I = mo7021I(c);
                    this.f4652t = c;
                    return I;
                } catch (AudioSink.InitializationException e2) {
                    e.addSuppressed(e2);
                    mo7033Z();
                    throw e;
                }
            }
            mo7033Z();
            throw e;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0018  */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo7023K() throws androidx.media3.exoplayer.audio.AudioSink.WriteException {
        /*
            r9 = this;
            int r0 = r9.f4622R
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L_0x000b
            r9.f4622R = r3
        L_0x0009:
            r0 = r2
            goto L_0x000c
        L_0x000b:
            r0 = r3
        L_0x000c:
            int r4 = r9.f4622R
            androidx.media3.exoplayer.audio.AudioProcessor[] r5 = r9.f4615K
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L_0x002f
            r4 = r5[r4]
            if (r0 == 0) goto L_0x001f
            r4.mo6980d()
        L_0x001f:
            r9.mo7035b0(r7)
            boolean r0 = r4.mo6981e()
            if (r0 != 0) goto L_0x0029
            return r3
        L_0x0029:
            int r0 = r9.f4622R
            int r0 = r0 + r2
            r9.f4622R = r0
            goto L_0x0009
        L_0x002f:
            java.nio.ByteBuffer r0 = r9.f4619O
            if (r0 == 0) goto L_0x003b
            r9.mo7045n0(r0, r7)
            java.nio.ByteBuffer r0 = r9.f4619O
            if (r0 == 0) goto L_0x003b
            return r3
        L_0x003b:
            r9.f4622R = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.audio.DefaultAudioSink.mo7023K():boolean");
    }

    /* renamed from: L */
    public final void mo7024L() {
        int i = 0;
        while (true) {
            AudioProcessor[] audioProcessorArr = this.f4615K;
            if (i < audioProcessorArr.length) {
                AudioProcessor audioProcessor = audioProcessorArr[i];
                audioProcessor.flush();
                this.f4616L[i] = audioProcessor.getOutput();
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: N */
    public final C0820n mo7025N() {
        return mo7026Q().f4680a;
    }

    /* renamed from: Q */
    public final C0855h mo7026Q() {
        C0855h hVar = this.f4655w;
        if (hVar != null) {
            return hVar;
        }
        if (!this.f4642j.isEmpty()) {
            return this.f4642j.getLast();
        }
        return this.f4656x;
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: R */
    public final int mo7027R(AudioFormat audioFormat, AudioAttributes audioAttributes) {
        int i = w67.f19021a;
        if (i >= 31) {
            return AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        }
        if (!AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
            return 0;
        }
        if (i != 30 || !w67.f19024d.startsWith("Pixel")) {
            return 1;
        }
        return 2;
    }

    /* renamed from: S */
    public boolean mo7028S() {
        return mo7026Q().f4681b;
    }

    /* renamed from: T */
    public final long mo7029T() {
        C0853f fVar = this.f4652t;
        if (fVar.f4670c == 0) {
            return this.f4606B / ((long) fVar.f4669b);
        }
        return this.f4607C;
    }

    /* renamed from: U */
    public final long mo7030U() {
        C0853f fVar = this.f4652t;
        if (fVar.f4670c == 0) {
            return this.f4608D / ((long) fVar.f4671d);
        }
        return this.f4609E;
    }

    /* renamed from: V */
    public final boolean mo7031V() throws AudioSink.InitializationException {
        boolean z;
        br4 br4;
        if (!this.f4640h.mo22887d()) {
            return false;
        }
        AudioTrack J = mo7022J();
        this.f4653u = J;
        if (m6007Y(J)) {
            mo7036c0(this.f4653u);
            if (this.f4644l != 3) {
                AudioTrack audioTrack = this.f4653u;
                C0792h hVar = this.f4652t.f4668a;
                audioTrack.setOffloadDelayPadding(hVar.f4195o1, hVar.f4196p1);
            }
        }
        if (w67.f19021a >= 31 && (br4 = this.f4649q) != null) {
            C0849b.m6066a(this.f4653u, br4);
        }
        this.f4627W = this.f4653u.getAudioSessionId();
        C0862b bVar = this.f4641i;
        AudioTrack audioTrack2 = this.f4653u;
        C0853f fVar = this.f4652t;
        if (fVar.f4670c == 2) {
            z = true;
        } else {
            z = false;
        }
        bVar.mo7118s(audioTrack2, z, fVar.f4674g, fVar.f4671d, fVar.f4675h);
        mo7040g0();
        int i = this.f4628X.f19983a;
        if (i != 0) {
            this.f4653u.attachAuxEffect(i);
            this.f4653u.setAuxEffectSendLevel(this.f4628X.f19984b);
        }
        this.f4612H = true;
        return true;
    }

    /* renamed from: X */
    public final boolean mo7032X() {
        if (this.f4653u != null) {
            return true;
        }
        return false;
    }

    /* renamed from: Z */
    public final void mo7033Z() {
        if (this.f4652t.mo7068l()) {
            this.f4632a0 = true;
        }
    }

    /* renamed from: a */
    public boolean mo6986a(C0792h hVar) {
        if (mo7009v(hVar) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a0 */
    public final void mo7034a0() {
        if (!this.f4624T) {
            this.f4624T = true;
            this.f4641i.mo7107g(mo7030U());
            this.f4653u.stop();
            this.f4605A = 0;
        }
    }

    /* renamed from: b */
    public void mo6987b(C0820n nVar) {
        C0820n nVar2 = new C0820n(w67.m29372p(nVar.f4406a, 0.1f, 8.0f), w67.m29372p(nVar.f4407d, 0.1f, 8.0f));
        if (!this.f4643k || w67.f19021a < 23) {
            mo7038e0(nVar2, mo7028S());
        } else {
            mo7039f0(nVar2);
        }
    }

    /* renamed from: b0 */
    public final void mo7035b0(long j) throws AudioSink.WriteException {
        ByteBuffer byteBuffer;
        int length = this.f4615K.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.f4616L[i - 1];
            } else {
                byteBuffer = this.f4617M;
                if (byteBuffer == null) {
                    byteBuffer = AudioProcessor.f4598a;
                }
            }
            if (i == length) {
                mo7045n0(byteBuffer, j);
            } else {
                AudioProcessor audioProcessor = this.f4615K[i];
                if (i > this.f4622R) {
                    audioProcessor.mo6979c(byteBuffer);
                }
                ByteBuffer output = audioProcessor.getOutput();
                this.f4616L[i] = output;
                if (output.hasRemaining()) {
                    i++;
                }
            }
            if (!byteBuffer.hasRemaining()) {
                i--;
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public void mo6988c() {
        this.f4625U = false;
        if (mo7032X() && this.f4641i.mo7115p()) {
            this.f4653u.pause();
        }
    }

    /* renamed from: c0 */
    public final void mo7036c0(AudioTrack audioTrack) {
        if (this.f4645m == null) {
            this.f4645m = new C0858k();
        }
        this.f4645m.mo7076a(audioTrack);
    }

    /* renamed from: d */
    public C0820n mo6989d() {
        if (this.f4643k) {
            return this.f4657y;
        }
        return mo7025N();
    }

    /* renamed from: d0 */
    public final void mo7037d0() {
        this.f4606B = 0;
        this.f4607C = 0;
        this.f4608D = 0;
        this.f4609E = 0;
        this.f4634b0 = false;
        this.f4610F = 0;
        this.f4656x = new C0855h(mo7025N(), mo7028S(), 0, 0, (C0848a) null);
        this.f4613I = 0;
        this.f4655w = null;
        this.f4642j.clear();
        this.f4617M = null;
        this.f4618N = 0;
        this.f4619O = null;
        this.f4624T = false;
        this.f4623S = false;
        this.f4622R = -1;
        this.f4658z = null;
        this.f4605A = 0;
        this.f4637e.mo7179m();
        mo7024L();
    }

    /* renamed from: e */
    public boolean mo6990e() {
        if (!mo7032X() || (this.f4623S && !mo6994h())) {
            return true;
        }
        return false;
    }

    /* renamed from: e0 */
    public final void mo7038e0(C0820n nVar, boolean z) {
        C0855h Q = mo7026Q();
        if (!nVar.equals(Q.f4680a) || z != Q.f4681b) {
            C0855h hVar = new C0855h(nVar, z, CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED, CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED, (C0848a) null);
            if (mo7032X()) {
                this.f4655w = hVar;
            } else {
                this.f4656x = hVar;
            }
        }
    }

    /* renamed from: f */
    public void mo6991f() {
        this.f4625U = true;
        if (mo7032X()) {
            this.f4641i.mo7120u();
            this.f4653u.play();
        }
    }

    /* renamed from: f0 */
    public final void mo7039f0(C0820n nVar) {
        if (mo7032X()) {
            try {
                this.f4653u.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(nVar.f4406a).setPitch(nVar.f4407d).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                gk3.m18133j("DefaultAudioSink", "Failed to set playback params", e);
            }
            nVar = new C0820n(this.f4653u.getPlaybackParams().getSpeed(), this.f4653u.getPlaybackParams().getPitch());
            this.f4641i.mo7119t(nVar.f4406a);
        }
        this.f4657y = nVar;
    }

    public void flush() {
        if (mo7032X()) {
            mo7037d0();
            if (this.f4641i.mo7109i()) {
                this.f4653u.pause();
            }
            if (m6007Y(this.f4653u)) {
                ((C0858k) C2725kr.m20985e(this.f4645m)).mo7077b(this.f4653u);
            }
            AudioTrack audioTrack = this.f4653u;
            this.f4653u = null;
            if (w67.f19021a < 21 && !this.f4626V) {
                this.f4627W = 0;
            }
            C0853f fVar = this.f4651s;
            if (fVar != null) {
                this.f4652t = fVar;
                this.f4651s = null;
            }
            this.f4641i.mo7116q();
            this.f4640h.mo22886c();
            new C0848a("ExoPlayer:AudioTrackReleaseThread", audioTrack).start();
        }
        this.f4647o.mo7069a();
        this.f4646n.mo7069a();
    }

    /* renamed from: g */
    public void mo6993g(C0778b bVar) {
        if (!this.f4654v.equals(bVar)) {
            this.f4654v = bVar;
            if (!this.f4629Y) {
                flush();
            }
        }
    }

    /* renamed from: g0 */
    public final void mo7040g0() {
        if (mo7032X()) {
            if (w67.f19021a >= 21) {
                m6008h0(this.f4653u, this.f4614J);
            } else {
                m6009i0(this.f4653u, this.f4614J);
            }
        }
    }

    /* renamed from: h */
    public boolean mo6994h() {
        if (!mo7032X() || !this.f4641i.mo7108h(mo7030U())) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public void mo6995i(int i) {
        boolean z;
        if (this.f4627W != i) {
            this.f4627W = i;
            if (i != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f4626V = z;
            flush();
        }
    }

    /* renamed from: j */
    public void mo6996j(AudioSink.C0847a aVar) {
        this.f4650r = aVar;
    }

    /* renamed from: j0 */
    public final void mo7041j0() {
        AudioProcessor[] audioProcessorArr = this.f4652t.f4676i;
        ArrayList arrayList = new ArrayList();
        for (AudioProcessor audioProcessor : audioProcessorArr) {
            if (audioProcessor.mo6977a()) {
                arrayList.add(audioProcessor);
            } else {
                audioProcessor.flush();
            }
        }
        int size = arrayList.size();
        this.f4615K = (AudioProcessor[]) arrayList.toArray(new AudioProcessor[size]);
        this.f4616L = new ByteBuffer[size];
        mo7024L();
    }

    /* renamed from: k */
    public void mo6997k() {
        if (this.f4629Y) {
            this.f4629Y = false;
            flush();
        }
    }

    /* renamed from: k0 */
    public final boolean mo7042k0() {
        if (this.f4629Y || !"audio/raw".equals(this.f4652t.f4668a.f4175C) || mo7043l0(this.f4652t.f4668a.f4191e1)) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public void mo6998l(C3645xv xvVar) {
        if (!this.f4628X.equals(xvVar)) {
            int i = xvVar.f19983a;
            float f = xvVar.f19984b;
            AudioTrack audioTrack = this.f4653u;
            if (audioTrack != null) {
                if (this.f4628X.f19983a != i) {
                    audioTrack.attachAuxEffect(i);
                }
                if (i != 0) {
                    this.f4653u.setAuxEffectSendLevel(f);
                }
            }
            this.f4628X = xvVar;
        }
    }

    /* renamed from: l0 */
    public final boolean mo7043l0(int i) {
        if (!this.f4635c || !w67.m29373p0(i)) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public boolean mo6999m(ByteBuffer byteBuffer, long j, int i) throws AudioSink.InitializationException, AudioSink.WriteException {
        boolean z;
        boolean z2;
        ByteBuffer byteBuffer2 = byteBuffer;
        long j2 = j;
        int i2 = i;
        ByteBuffer byteBuffer3 = this.f4617M;
        if (byteBuffer3 == null || byteBuffer2 == byteBuffer3) {
            z = true;
        } else {
            z = false;
        }
        C2725kr.m20981a(z);
        if (this.f4651s != null) {
            if (!mo7023K()) {
                return false;
            }
            if (!this.f4651s.mo7060b(this.f4652t)) {
                mo7034a0();
                if (mo6994h()) {
                    return false;
                }
                flush();
            } else {
                this.f4652t = this.f4651s;
                this.f4651s = null;
                if (m6007Y(this.f4653u) && this.f4644l != 3) {
                    if (this.f4653u.getPlayState() == 3) {
                        this.f4653u.setOffloadEndOfStream();
                    }
                    AudioTrack audioTrack = this.f4653u;
                    C0792h hVar = this.f4652t.f4668a;
                    audioTrack.setOffloadDelayPadding(hVar.f4195o1, hVar.f4196p1);
                    this.f4634b0 = true;
                }
            }
            mo7018F(j2);
        }
        if (!mo7032X()) {
            try {
                if (!mo7031V()) {
                    return false;
                }
            } catch (AudioSink.InitializationException e) {
                AudioSink.InitializationException initializationException = e;
                if (!initializationException.isRecoverable) {
                    this.f4646n.mo7070b(initializationException);
                    return false;
                }
                throw initializationException;
            }
        }
        this.f4646n.mo7069a();
        if (this.f4612H) {
            this.f4613I = Math.max(0, j2);
            this.f4611G = false;
            this.f4612H = false;
            if (this.f4643k && w67.f19021a >= 23) {
                mo7039f0(this.f4657y);
            }
            mo7018F(j2);
            if (this.f4625U) {
                mo6991f();
            }
        }
        if (!this.f4641i.mo7111k(mo7030U())) {
            return false;
        }
        if (this.f4617M == null) {
            if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
                z2 = true;
            } else {
                z2 = false;
            }
            C2725kr.m20981a(z2);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            C0853f fVar = this.f4652t;
            if (fVar.f4670c != 0 && this.f4610F == 0) {
                int P = m6005P(fVar.f4674g, byteBuffer2);
                this.f4610F = P;
                if (P == 0) {
                    return true;
                }
            }
            if (this.f4655w != null) {
                if (!mo7023K()) {
                    return false;
                }
                mo7018F(j2);
                this.f4655w = null;
            }
            long k = this.f4613I + this.f4652t.mo7067k(mo7029T() - this.f4637e.mo7178l());
            if (!this.f4611G && Math.abs(k - j2) > 200000) {
                this.f4650r.mo7013c(new AudioSink.UnexpectedDiscontinuityException(j2, k));
                this.f4611G = true;
            }
            if (this.f4611G) {
                if (!mo7023K()) {
                    return false;
                }
                long j3 = j2 - k;
                this.f4613I += j3;
                this.f4611G = false;
                mo7018F(j2);
                AudioSink.C0847a aVar = this.f4650r;
                if (!(aVar == null || j3 == 0)) {
                    aVar.mo7016f();
                }
            }
            if (this.f4652t.f4670c == 0) {
                this.f4606B += (long) byteBuffer.remaining();
            } else {
                this.f4607C += ((long) this.f4610F) * ((long) i2);
            }
            this.f4617M = byteBuffer2;
            this.f4618N = i2;
        }
        mo7035b0(j2);
        if (!this.f4617M.hasRemaining()) {
            this.f4617M = null;
            this.f4618N = 0;
            return true;
        } else if (!this.f4641i.mo7110j(mo7030U())) {
            return false;
        } else {
            gk3.m18132i("DefaultAudioSink", "Resetting stalled audio track");
            flush();
            return true;
        }
    }

    /* renamed from: m0 */
    public final boolean mo7044m0(C0792h hVar, C0778b bVar) {
        int d;
        int E;
        int R;
        boolean z;
        boolean z2;
        if (w67.f19021a < 29 || this.f4644l == 0 || (d = vv3.m29130d((String) C2725kr.m20985e(hVar.f4175C), hVar.f4204y)) == 0 || (E = w67.m29302E(hVar.f4202v0)) == 0 || (R = mo7027R(m6003M(hVar.f4187b1, E, d), bVar.mo6586b().f4150a)) == 0) {
            return false;
        }
        if (R == 1) {
            if (hVar.f4195o1 == 0 && hVar.f4196p1 == 0) {
                z = false;
            } else {
                z = true;
            }
            if (this.f4644l == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z || !z2) {
                return true;
            }
            return false;
        } else if (R == 2) {
            return true;
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: n */
    public void mo7000n() {
        boolean z;
        if (w67.f19021a < 25) {
            flush();
            return;
        }
        this.f4647o.mo7069a();
        this.f4646n.mo7069a();
        if (mo7032X()) {
            mo7037d0();
            if (this.f4641i.mo7109i()) {
                this.f4653u.pause();
            }
            this.f4653u.flush();
            this.f4641i.mo7116q();
            C0862b bVar = this.f4641i;
            AudioTrack audioTrack = this.f4653u;
            C0853f fVar = this.f4652t;
            if (fVar.f4670c == 2) {
                z = true;
            } else {
                z = false;
            }
            bVar.mo7118s(audioTrack, z, fVar.f4674g, fVar.f4671d, fVar.f4675h);
            this.f4612H = true;
        }
    }

    /* renamed from: n0 */
    public final void mo7045n0(ByteBuffer byteBuffer, long j) throws AudioSink.WriteException {
        int i;
        AudioSink.C0847a aVar;
        boolean z;
        boolean z2;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.f4619O;
            boolean z3 = true;
            if (byteBuffer2 != null) {
                if (byteBuffer2 == byteBuffer) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C2725kr.m20981a(z2);
            } else {
                this.f4619O = byteBuffer;
                if (w67.f19021a < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.f4620P;
                    if (bArr == null || bArr.length < remaining) {
                        this.f4620P = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.f4620P, 0, remaining);
                    byteBuffer.position(position);
                    this.f4621Q = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            if (w67.f19021a < 21) {
                int c = this.f4641i.mo7103c(this.f4608D);
                if (c > 0) {
                    i = this.f4653u.write(this.f4620P, this.f4621Q, Math.min(remaining2, c));
                    if (i > 0) {
                        this.f4621Q += i;
                        byteBuffer.position(byteBuffer.position() + i);
                    }
                } else {
                    i = 0;
                }
            } else if (this.f4629Y) {
                if (j != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                    z = true;
                } else {
                    z = false;
                }
                C2725kr.m20987g(z);
                i = mo7046p0(this.f4653u, byteBuffer, remaining2, j);
            } else {
                i = m6010o0(this.f4653u, byteBuffer, remaining2);
            }
            this.f4630Z = SystemClock.elapsedRealtime();
            if (i < 0) {
                boolean W = m6006W(i);
                if (W) {
                    mo7033Z();
                }
                AudioSink.WriteException writeException = new AudioSink.WriteException(i, this.f4652t.f4668a, W);
                AudioSink.C0847a aVar2 = this.f4650r;
                if (aVar2 != null) {
                    aVar2.mo7013c(writeException);
                }
                if (!writeException.isRecoverable) {
                    this.f4647o.mo7070b(writeException);
                    return;
                }
                throw writeException;
            }
            this.f4647o.mo7069a();
            if (m6007Y(this.f4653u)) {
                if (this.f4609E > 0) {
                    this.f4634b0 = false;
                }
                if (this.f4625U && (aVar = this.f4650r) != null && i < remaining2 && !this.f4634b0) {
                    aVar.mo7014d();
                }
            }
            int i2 = this.f4652t.f4670c;
            if (i2 == 0) {
                this.f4608D += (long) i;
            }
            if (i == remaining2) {
                if (i2 != 0) {
                    if (byteBuffer != this.f4617M) {
                        z3 = false;
                    }
                    C2725kr.m20987g(z3);
                    this.f4609E += ((long) this.f4610F) * ((long) this.f4618N);
                }
                this.f4619O = null;
            }
        }
    }

    /* renamed from: o */
    public void mo7001o(C0792h hVar, int i, int[] iArr) throws AudioSink.ConfigurationException {
        AudioProcessor[] audioProcessorArr;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        double d;
        AudioProcessor[] audioProcessorArr2;
        int[] iArr2;
        C0792h hVar2 = hVar;
        if ("audio/raw".equals(hVar2.f4175C)) {
            C2725kr.m20981a(w67.m29375q0(hVar2.f4191e1));
            i7 = w67.m29343a0(hVar2.f4191e1, hVar2.f4202v0);
            if (mo7043l0(hVar2.f4191e1)) {
                audioProcessorArr2 = this.f4639g;
            } else {
                audioProcessorArr2 = this.f4638f;
            }
            this.f4637e.mo7180n(hVar2.f4195o1, hVar2.f4196p1);
            if (w67.f19021a < 21 && hVar2.f4202v0 == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i10 = 0; i10 < 6; i10++) {
                    iArr2[i10] = i10;
                }
            } else {
                iArr2 = iArr;
            }
            this.f4636d.mo7127l(iArr2);
            AudioProcessor.C0846a aVar = new AudioProcessor.C0846a(hVar2.f4187b1, hVar2.f4202v0, hVar2.f4191e1);
            int length = audioProcessorArr2.length;
            int i11 = 0;
            while (i11 < length) {
                AudioProcessor audioProcessor = audioProcessorArr2[i11];
                try {
                    AudioProcessor.C0846a b = audioProcessor.mo6978b(aVar);
                    if (audioProcessor.mo6977a()) {
                        aVar = b;
                    }
                    i11++;
                } catch (AudioProcessor.UnhandledAudioFormatException e) {
                    throw new AudioSink.ConfigurationException((Throwable) e, hVar2);
                }
            }
            int i12 = aVar.f4602c;
            int i13 = aVar.f4600a;
            int E = w67.m29302E(aVar.f4601b);
            audioProcessorArr = audioProcessorArr2;
            i4 = 0;
            i3 = w67.m29343a0(i12, aVar.f4601b);
            i5 = i12;
            i2 = i13;
            i6 = E;
        } else {
            AudioProcessor[] audioProcessorArr3 = new AudioProcessor[0];
            int i14 = hVar2.f4187b1;
            if (mo7044m0(hVar2, this.f4654v)) {
                audioProcessorArr = audioProcessorArr3;
                i7 = -1;
                i3 = -1;
                i2 = i14;
                i5 = vv3.m29130d((String) C2725kr.m20985e(hVar2.f4175C), hVar2.f4204y);
                i6 = w67.m29302E(hVar2.f4202v0);
                i4 = 1;
            } else {
                Pair<Integer, Integer> f = this.f4631a.mo25265f(hVar2);
                if (f != null) {
                    int intValue = ((Integer) f.first).intValue();
                    audioProcessorArr = audioProcessorArr3;
                    i7 = -1;
                    i3 = -1;
                    i2 = i14;
                    i4 = 2;
                    i6 = ((Integer) f.second).intValue();
                    i5 = intValue;
                } else {
                    throw new AudioSink.ConfigurationException("Unable to configure passthrough for: " + hVar2, hVar2);
                }
            }
        }
        if (i != 0) {
            i9 = i;
            i8 = i5;
        } else {
            C0851d dVar = this.f4648p;
            int O = m6004O(i2, i6, i5);
            if (this.f4643k) {
                d = 8.0d;
            } else {
                d = 1.0d;
            }
            i8 = i5;
            i9 = dVar.mo7053a(O, i5, i4, i3, i2, d);
        }
        if (i8 == 0) {
            throw new AudioSink.ConfigurationException("Invalid output encoding (mode=" + i4 + ") for: " + hVar2, hVar2);
        } else if (i6 != 0) {
            this.f4632a0 = false;
            C0853f fVar = new C0853f(hVar, i7, i4, i3, i2, i6, i8, i9, audioProcessorArr);
            if (mo7032X()) {
                this.f4651s = fVar;
            } else {
                this.f4652t = fVar;
            }
        } else {
            throw new AudioSink.ConfigurationException("Invalid output channel config (mode=" + i4 + ") for: " + hVar2, hVar2);
        }
    }

    /* renamed from: p */
    public void mo7002p() throws AudioSink.WriteException {
        if (!this.f4623S && mo7032X() && mo7023K()) {
            mo7034a0();
            this.f4623S = true;
        }
    }

    /* renamed from: p0 */
    public final int mo7046p0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i, long j) {
        if (w67.f19021a >= 26) {
            return audioTrack.write(byteBuffer, i, 1, j * 1000);
        }
        if (this.f4658z == null) {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            this.f4658z = allocate;
            allocate.order(ByteOrder.BIG_ENDIAN);
            this.f4658z.putInt(1431633921);
        }
        if (this.f4605A == 0) {
            this.f4658z.putInt(4, i);
            this.f4658z.putLong(8, j * 1000);
            this.f4658z.position(0);
            this.f4605A = i;
        }
        int remaining = this.f4658z.remaining();
        if (remaining > 0) {
            int write = audioTrack.write(this.f4658z, remaining, 1);
            if (write < 0) {
                this.f4605A = 0;
                return write;
            } else if (write < remaining) {
                return 0;
            }
        }
        int o0 = m6010o0(audioTrack, byteBuffer, i);
        if (o0 < 0) {
            this.f4605A = 0;
            return o0;
        }
        this.f4605A -= o0;
        return o0;
    }

    /* renamed from: q */
    public long mo7003q(boolean z) {
        if (!mo7032X() || this.f4612H) {
            return Long.MIN_VALUE;
        }
        return mo7020H(mo7019G(Math.min(this.f4641i.mo7104d(z), this.f4652t.mo7066h(mo7030U()))));
    }

    /* renamed from: r */
    public void mo7004r() {
        this.f4611G = true;
    }

    public void reset() {
        flush();
        for (AudioProcessor reset : this.f4638f) {
            reset.reset();
        }
        for (AudioProcessor reset2 : this.f4639g) {
            reset2.reset();
        }
        this.f4625U = false;
        this.f4632a0 = false;
    }

    /* renamed from: s */
    public void mo7006s(float f) {
        if (this.f4614J != f) {
            this.f4614J = f;
            mo7040g0();
        }
    }

    /* renamed from: t */
    public void mo7007t(br4 br4) {
        this.f4649q = br4;
    }

    /* renamed from: u */
    public void mo7008u() {
        boolean z;
        if (w67.f19021a >= 21) {
            z = true;
        } else {
            z = false;
        }
        C2725kr.m20987g(z);
        C2725kr.m20987g(this.f4626V);
        if (!this.f4629Y) {
            this.f4629Y = true;
            flush();
        }
    }

    /* renamed from: v */
    public int mo7009v(C0792h hVar) {
        if ("audio/raw".equals(hVar.f4175C)) {
            if (!w67.m29375q0(hVar.f4191e1)) {
                gk3.m18132i("DefaultAudioSink", "Invalid PCM encoding: " + hVar.f4191e1);
                return 0;
            }
            int i = hVar.f4191e1;
            if (i == 2 || (this.f4635c && i == 4)) {
                return 2;
            }
            return 1;
        } else if ((this.f4632a0 || !mo7044m0(hVar, this.f4654v)) && !this.f4631a.mo25266h(hVar)) {
            return 0;
        } else {
            return 2;
        }
    }

    /* renamed from: w */
    public void mo7010w(boolean z) {
        mo7038e0(mo7025N(), z);
    }

    @RequiresNonNull({"#1.audioProcessorChain"})
    public DefaultAudioSink(C0852e eVar) {
        this.f4631a = eVar.f4662a;
        C0850c b = eVar.f4663b;
        this.f4633b = b;
        int i = w67.f19021a;
        this.f4635c = i >= 21 && eVar.f4664c;
        this.f4643k = i >= 23 && eVar.f4665d;
        this.f4644l = i >= 29 ? eVar.f4666e : 0;
        this.f4648p = eVar.f4667f;
        lo0 lo0 = new lo0(dh0.f10712a);
        this.f4640h = lo0;
        lo0.mo22888e();
        this.f4641i = new C0862b(new C0857j(this, (C0848a) null));
        C0865d dVar = new C0865d();
        this.f4636d = dVar;
        C0875k kVar = new C0875k();
        this.f4637e = kVar;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new C0864c[]{new C0872h(), dVar, kVar});
        Collections.addAll(arrayList, b.mo7049b());
        this.f4638f = (AudioProcessor[]) arrayList.toArray(new AudioProcessor[0]);
        this.f4639g = new AudioProcessor[]{new C0868f()};
        this.f4614J = 1.0f;
        this.f4654v = C0778b.f4142s;
        this.f4627W = 0;
        this.f4628X = new C3645xv(0, Utils.FLOAT_EPSILON);
        C0820n nVar = C0820n.f4404g;
        this.f4656x = new C0855h(nVar, false, 0, 0, (C0848a) null);
        this.f4657y = nVar;
        this.f4622R = -1;
        this.f4615K = new AudioProcessor[0];
        this.f4616L = new ByteBuffer[0];
        this.f4642j = new ArrayDeque<>();
        this.f4646n = new C0856i<>(100);
        this.f4647o = new C0856i<>(100);
    }
}
