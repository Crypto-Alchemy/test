package androidx.media3.exoplayer.audio;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import androidx.media3.common.C0778b;
import androidx.media3.common.C0792h;
import androidx.media3.common.C0820n;
import androidx.media3.common.PlaybackException;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.audio.C0860a;
import androidx.media3.exoplayer.mediacodec.C0941c;
import androidx.media3.exoplayer.mediacodec.C0945d;
import androidx.media3.exoplayer.mediacodec.C0946e;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import java.util.List;
import p000.md5;

/* renamed from: androidx.media3.exoplayer.audio.g */
/* compiled from: MediaCodecAudioRenderer */
public class C0869g extends MediaCodecRenderer implements sq3 {

    /* renamed from: A2 */
    public boolean f4749A2;

    /* renamed from: B2 */
    public boolean f4750B2;

    /* renamed from: C2 */
    public boolean f4751C2;

    /* renamed from: D2 */
    public boolean f4752D2;

    /* renamed from: E2 */
    public md5.C2822a f4753E2;

    /* renamed from: t2 */
    public final Context f4754t2;

    /* renamed from: u2 */
    public final C0860a.C0861a f4755u2;

    /* renamed from: v2 */
    public final AudioSink f4756v2;

    /* renamed from: w2 */
    public int f4757w2;

    /* renamed from: x2 */
    public boolean f4758x2;

    /* renamed from: y2 */
    public C0792h f4759y2;

    /* renamed from: z2 */
    public long f4760z2;

    /* renamed from: androidx.media3.exoplayer.audio.g$b */
    /* compiled from: MediaCodecAudioRenderer */
    public final class C0871b implements AudioSink.C0847a {
        public C0871b() {
        }

        /* renamed from: a */
        public void mo7011a(long j) {
            C0869g.this.f4755u2.mo7091B(j);
        }

        /* renamed from: b */
        public void mo7012b(boolean z) {
            C0869g.this.f4755u2.mo7092C(z);
        }

        /* renamed from: c */
        public void mo7013c(Exception exc) {
            gk3.m18127d("MediaCodecAudioRenderer", "Audio sink error", exc);
            C0869g.this.f4755u2.mo7095l(exc);
        }

        /* renamed from: d */
        public void mo7014d() {
            if (C0869g.this.f4753E2 != null) {
                C0869g.this.f4753E2.mo11280a();
            }
        }

        /* renamed from: e */
        public void mo7015e(int i, long j, long j2) {
            C0869g.this.f4755u2.mo7093D(i, j, j2);
        }

        /* renamed from: f */
        public void mo7016f() {
            C0869g.this.mo7161w1();
        }

        /* renamed from: g */
        public void mo7017g() {
            if (C0869g.this.f4753E2 != null) {
                C0869g.this.f4753E2.mo11281b();
            }
        }
    }

    public C0869g(Context context, C0941c.C0943b bVar, C0946e eVar, boolean z, Handler handler, C0860a aVar, AudioSink audioSink) {
        super(1, bVar, eVar, z, 44100.0f);
        this.f4754t2 = context.getApplicationContext();
        this.f4756v2 = audioSink;
        this.f4755u2 = new C0860a.C0861a(handler, aVar);
        audioSink.mo6996j(new C0871b());
    }

    /* renamed from: q1 */
    public static boolean m6210q1(String str) {
        if (w67.f19021a < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(w67.f19023c)) {
            String str2 = w67.f19022b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: r1 */
    public static boolean m6211r1() {
        if (w67.f19021a == 23) {
            String str = w67.f19024d;
            if ("ZTE B2017G".equals(str) || "AXON 7 mini".equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: u1 */
    public static List<C0945d> m6212u1(C0946e eVar, C0792h hVar, boolean z, AudioSink audioSink) throws MediaCodecUtil.DecoderQueryException {
        C0945d v;
        String str = hVar.f4175C;
        if (str == null) {
            return ImmutableList.m36627of();
        }
        if (audioSink.mo6986a(hVar) && (v = MediaCodecUtil.m6833v()) != null) {
            return ImmutableList.m36628of(v);
        }
        List<C0945d> a = eVar.mo7519a(str, z, false);
        String m = MediaCodecUtil.m6824m(hVar);
        if (m == null) {
            return ImmutableList.copyOf(a);
        }
        return ImmutableList.builder().mo34690j(a).mo34690j(eVar.mo7519a(m, z, false)).mo34692l();
    }

    /* renamed from: G */
    public void mo7133G() {
        this.f4751C2 = true;
        try {
            this.f4756v2.flush();
            try {
                super.mo7133G();
            } finally {
                this.f4755u2.mo7098o(this.f5083o2);
            }
        } catch (Throwable th) {
            super.mo7133G();
            throw th;
        } finally {
            this.f4755u2.mo7098o(this.f5083o2);
        }
    }

    /* renamed from: H */
    public void mo7134H(boolean z, boolean z2) throws ExoPlaybackException {
        super.mo7134H(z, z2);
        this.f4755u2.mo7099p(this.f5083o2);
        if (mo21674A().f16391a) {
            this.f4756v2.mo7008u();
        } else {
            this.f4756v2.mo6997k();
        }
        this.f4756v2.mo7007t(mo21677D());
    }

    /* renamed from: I */
    public void mo7135I(long j, boolean z) throws ExoPlaybackException {
        super.mo7135I(j, z);
        if (this.f4752D2) {
            this.f4756v2.mo7000n();
        } else {
            this.f4756v2.flush();
        }
        this.f4760z2 = j;
        this.f4749A2 = true;
        this.f4750B2 = true;
    }

    /* renamed from: I0 */
    public void mo7136I0(Exception exc) {
        gk3.m18127d("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.f4755u2.mo7094k(exc);
    }

    /* renamed from: J */
    public void mo7137J() {
        try {
            super.mo7137J();
        } finally {
            if (this.f4751C2) {
                this.f4751C2 = false;
                this.f4756v2.reset();
            }
        }
    }

    /* renamed from: J0 */
    public void mo7138J0(String str, C0941c.C0942a aVar, long j, long j2) {
        this.f4755u2.mo7096m(str, j, j2);
    }

    /* renamed from: K */
    public void mo7139K() {
        super.mo7139K();
        this.f4756v2.mo6991f();
    }

    /* renamed from: K0 */
    public void mo7140K0(String str) {
        this.f4755u2.mo7097n(str);
    }

    /* renamed from: L */
    public void mo7141L() {
        mo7163x1();
        this.f4756v2.mo6988c();
        super.mo7141L();
    }

    /* renamed from: L0 */
    public p31 mo7142L0(c82 c82) throws ExoPlaybackException {
        p31 L0 = super.mo7142L0(c82);
        this.f4755u2.mo7100q(c82.f8368b, L0);
        return L0;
    }

    /* renamed from: M0 */
    public void mo7143M0(C0792h hVar, MediaFormat mediaFormat) throws ExoPlaybackException {
        int i;
        int i2;
        C0792h hVar2 = this.f4759y2;
        int[] iArr = null;
        if (hVar2 != null) {
            hVar = hVar2;
        } else if (mo7462o0() != null) {
            if ("audio/raw".equals(hVar.f4175C)) {
                i = hVar.f4191e1;
            } else if (w67.f19021a >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                i = mediaFormat.getInteger("pcm-encoding");
            } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                i = w67.m29340Y(mediaFormat.getInteger("v-bits-per-sample"));
            } else {
                i = 2;
            }
            C0792h E = new C0792h.C0794b().mo6670e0("audio/raw").mo6664Y(i).mo6653N(hVar.f4195o1).mo6654O(hVar.f4196p1).mo6647H(mediaFormat.getInteger("channel-count")).mo6671f0(mediaFormat.getInteger("sample-rate")).mo6644E();
            if (this.f4758x2 && E.f4202v0 == 6 && (i2 = hVar.f4202v0) < 6) {
                iArr = new int[i2];
                for (int i3 = 0; i3 < hVar.f4202v0; i3++) {
                    iArr[i3] = i3;
                }
            }
            hVar = E;
        }
        try {
            this.f4756v2.mo7001o(hVar, 0, iArr);
        } catch (AudioSink.ConfigurationException e) {
            throw mo21700y(e, e.format, PlaybackException.ERROR_CODE_AUDIO_TRACK_INIT_FAILED);
        }
    }

    /* renamed from: O0 */
    public void mo7144O0() {
        super.mo7144O0();
        this.f4756v2.mo7004r();
    }

    /* renamed from: P0 */
    public void mo7145P0(DecoderInputBuffer decoderInputBuffer) {
        if (this.f4749A2 && !decoderInputBuffer.mo23892o()) {
            if (Math.abs(decoderInputBuffer.f4594k - this.f4760z2) > 500000) {
                this.f4760z2 = decoderInputBuffer.f4594k;
            }
            this.f4749A2 = false;
        }
    }

    /* renamed from: R0 */
    public boolean mo7146R0(long j, long j2, C0941c cVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C0792h hVar) throws ExoPlaybackException {
        C2725kr.m20985e(byteBuffer);
        if (this.f4759y2 != null && (i2 & 2) != 0) {
            ((C0941c) C2725kr.m20985e(cVar)).mo7498n(i, false);
            return true;
        } else if (z) {
            if (cVar != null) {
                cVar.mo7498n(i, false);
            }
            this.f5083o2.f15311f += i3;
            this.f4756v2.mo7004r();
            return true;
        } else {
            try {
                if (!this.f4756v2.mo6999m(byteBuffer, j3, i3)) {
                    return false;
                }
                if (cVar != null) {
                    cVar.mo7498n(i, false);
                }
                this.f5083o2.f15310e += i3;
                return true;
            } catch (AudioSink.InitializationException e) {
                throw mo21701z(e, e.format, e.isRecoverable, PlaybackException.ERROR_CODE_AUDIO_TRACK_INIT_FAILED);
            } catch (AudioSink.WriteException e2) {
                throw mo21701z(e2, hVar, e2.isRecoverable, PlaybackException.ERROR_CODE_AUDIO_TRACK_WRITE_FAILED);
            }
        }
    }

    /* renamed from: S */
    public p31 mo7147S(C0945d dVar, C0792h hVar, C0792h hVar2) {
        int i;
        p31 e = dVar.mo7506e(hVar, hVar2);
        int i2 = e.f16271e;
        if (mo7156s1(dVar, hVar2) > this.f4757w2) {
            i2 |= 64;
        }
        int i3 = i2;
        String str = dVar.f5124a;
        if (i3 != 0) {
            i = 0;
        } else {
            i = e.f16270d;
        }
        return new p31(str, hVar, hVar2, i, i3);
    }

    /* renamed from: W0 */
    public void mo7148W0() throws ExoPlaybackException {
        try {
            this.f4756v2.mo7002p();
        } catch (AudioSink.WriteException e) {
            throw mo21701z(e, e.format, e.isRecoverable, PlaybackException.ERROR_CODE_AUDIO_TRACK_WRITE_FAILED);
        }
    }

    /* renamed from: b */
    public void mo106b(C0820n nVar) {
        this.f4756v2.mo6987b(nVar);
    }

    /* renamed from: d */
    public C0820n mo108d() {
        return this.f4756v2.mo6989d();
    }

    /* renamed from: e */
    public boolean mo7149e() {
        if (!super.mo7149e() || !this.f4756v2.mo6990e()) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public boolean mo7150g() {
        if (this.f4756v2.mo6994h() || super.mo7150g()) {
            return true;
        }
        return false;
    }

    public String getName() {
        return "MediaCodecAudioRenderer";
    }

    /* renamed from: i1 */
    public boolean mo7152i1(C0792h hVar) {
        return this.f4756v2.mo6986a(hVar);
    }

    /* renamed from: j1 */
    public int mo7153j1(C0946e eVar, C0792h hVar) throws MediaCodecUtil.DecoderQueryException {
        int i;
        boolean z;
        boolean z2;
        int i2;
        int i3 = 0;
        if (!vv3.m29139m(hVar.f4175C)) {
            return nd5.m23113a(0);
        }
        if (w67.f19021a >= 21) {
            i = 32;
        } else {
            i = 0;
        }
        boolean z3 = true;
        if (hVar.f4199r1 != 0) {
            z = true;
        } else {
            z = false;
        }
        boolean k1 = MediaCodecRenderer.m6712k1(hVar);
        int i4 = 8;
        int i5 = 4;
        if (k1 && this.f4756v2.mo6986a(hVar) && (!z || MediaCodecUtil.m6833v() != null)) {
            return nd5.m23114b(4, 8, i);
        }
        if ("audio/raw".equals(hVar.f4175C) && !this.f4756v2.mo6986a(hVar)) {
            return nd5.m23113a(1);
        }
        if (!this.f4756v2.mo6986a(w67.m29341Z(2, hVar.f4202v0, hVar.f4187b1))) {
            return nd5.m23113a(1);
        }
        List<C0945d> u1 = m6212u1(eVar, hVar, false, this.f4756v2);
        if (u1.isEmpty()) {
            return nd5.m23113a(1);
        }
        if (!k1) {
            return nd5.m23113a(2);
        }
        C0945d dVar = u1.get(0);
        boolean m = dVar.mo7511m(hVar);
        if (!m) {
            int i6 = 1;
            while (true) {
                if (i6 >= u1.size()) {
                    break;
                }
                C0945d dVar2 = u1.get(i6);
                if (dVar2.mo7511m(hVar)) {
                    z2 = false;
                    dVar = dVar2;
                    break;
                }
                i6++;
            }
        }
        z2 = true;
        z3 = m;
        if (!z3) {
            i5 = 3;
        }
        if (z3 && dVar.mo7514p(hVar)) {
            i4 = 16;
        }
        if (dVar.f5131h) {
            i2 = 64;
        } else {
            i2 = 0;
        }
        if (z2) {
            i3 = 128;
        }
        return nd5.m23115c(i5, i4, i, i2, i3);
    }

    /* renamed from: k */
    public void mo7154k(int i, Object obj) throws ExoPlaybackException {
        if (i == 2) {
            this.f4756v2.mo7006s(((Float) obj).floatValue());
        } else if (i == 3) {
            this.f4756v2.mo6993g((C0778b) obj);
        } else if (i != 6) {
            switch (i) {
                case 9:
                    this.f4756v2.mo7010w(((Boolean) obj).booleanValue());
                    return;
                case 10:
                    this.f4756v2.mo6995i(((Integer) obj).intValue());
                    return;
                case 11:
                    this.f4753E2 = (md5.C2822a) obj;
                    return;
                default:
                    super.mo7154k(i, obj);
                    return;
            }
        } else {
            this.f4756v2.mo6998l((C3645xv) obj);
        }
    }

    /* renamed from: q */
    public long mo110q() {
        if (getState() == 2) {
            mo7163x1();
        }
        return this.f4760z2;
    }

    /* renamed from: r0 */
    public float mo7155r0(float f, C0792h hVar, C0792h[] hVarArr) {
        int i = -1;
        for (C0792h hVar2 : hVarArr) {
            int i2 = hVar2.f4187b1;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return f * ((float) i);
    }

    /* renamed from: s1 */
    public final int mo7156s1(C0945d dVar, C0792h hVar) {
        int i;
        if (!"OMX.google.raw.decoder".equals(dVar.f5124a) || (i = w67.f19021a) >= 24 || (i == 23 && w67.m29381t0(this.f4754t2))) {
            return hVar.f4176H;
        }
        return -1;
    }

    /* renamed from: t0 */
    public List<C0945d> mo7157t0(C0946e eVar, C0792h hVar, boolean z) throws MediaCodecUtil.DecoderQueryException {
        return MediaCodecUtil.m6832u(m6212u1(eVar, hVar, z, this.f4756v2), hVar);
    }

    /* renamed from: t1 */
    public int mo7158t1(C0945d dVar, C0792h hVar, C0792h[] hVarArr) {
        int s1 = mo7156s1(dVar, hVar);
        if (hVarArr.length == 1) {
            return s1;
        }
        for (C0792h hVar2 : hVarArr) {
            if (dVar.mo7506e(hVar, hVar2).f16270d != 0) {
                s1 = Math.max(s1, mo7156s1(dVar, hVar2));
            }
        }
        return s1;
    }

    /* renamed from: v0 */
    public C0941c.C0942a mo7159v0(C0945d dVar, C0792h hVar, MediaCrypto mediaCrypto, float f) {
        boolean z;
        C0792h hVar2;
        this.f4757w2 = mo7158t1(dVar, hVar, mo21678E());
        this.f4758x2 = m6210q1(dVar.f5124a);
        MediaFormat v1 = mo7160v1(hVar, dVar.f5126c, this.f4757w2, f);
        if (!"audio/raw".equals(dVar.f5125b) || "audio/raw".equals(hVar.f4175C)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            hVar2 = hVar;
        } else {
            hVar2 = null;
        }
        this.f4759y2 = hVar2;
        return C0941c.C0942a.m6902a(dVar, v1, hVar, mediaCrypto);
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: v1 */
    public MediaFormat mo7160v1(C0792h hVar, String str, int i, float f) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", hVar.f4202v0);
        mediaFormat.setInteger("sample-rate", hVar.f4187b1);
        dr3.m15340e(mediaFormat, hVar.f4177I);
        dr3.m15339d(mediaFormat, "max-input-size", i);
        int i2 = w67.f19021a;
        if (i2 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f && !m6211r1()) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (i2 <= 28 && "audio/ac4".equals(hVar.f4175C)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i2 >= 24 && this.f4756v2.mo7009v(w67.m29341Z(4, hVar.f4202v0, hVar.f4187b1)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i2 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        return mediaFormat;
    }

    /* renamed from: w1 */
    public void mo7161w1() {
        this.f4750B2 = true;
    }

    /* renamed from: x */
    public sq3 mo7162x() {
        return this;
    }

    /* renamed from: x1 */
    public final void mo7163x1() {
        long q = this.f4756v2.mo7003q(mo7149e());
        if (q != Long.MIN_VALUE) {
            if (!this.f4750B2) {
                q = Math.max(this.f4760z2, q);
            }
            this.f4760z2 = q;
            this.f4750B2 = false;
        }
    }
}
