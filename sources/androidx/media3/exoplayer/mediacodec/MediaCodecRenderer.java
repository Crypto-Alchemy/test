package androidx.media3.exoplayer.mediacodec;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.media3.common.C0792h;
import androidx.media3.common.PlaybackException;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.mediacodec.C0941c;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public abstract class MediaCodecRenderer extends C2580iz {

    /* renamed from: s2 */
    public static final byte[] f5028s2 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* renamed from: A1 */
    public boolean f5029A1;

    /* renamed from: B1 */
    public float f5030B1;

    /* renamed from: C1 */
    public ArrayDeque<C0945d> f5031C1;

    /* renamed from: D1 */
    public DecoderInitializationException f5032D1;

    /* renamed from: E1 */
    public C0945d f5033E1;

    /* renamed from: F1 */
    public int f5034F1;

    /* renamed from: G1 */
    public boolean f5035G1;

    /* renamed from: H1 */
    public boolean f5036H1;

    /* renamed from: I */
    public final C0941c.C0943b f5037I;

    /* renamed from: I1 */
    public boolean f5038I1;

    /* renamed from: J1 */
    public boolean f5039J1;

    /* renamed from: K1 */
    public boolean f5040K1;

    /* renamed from: L */
    public final C0946e f5041L;

    /* renamed from: L1 */
    public boolean f5042L1;

    /* renamed from: M */
    public final boolean f5043M;

    /* renamed from: M1 */
    public boolean f5044M1;

    /* renamed from: N1 */
    public boolean f5045N1;

    /* renamed from: O1 */
    public boolean f5046O1;

    /* renamed from: P */
    public final float f5047P;

    /* renamed from: P1 */
    public boolean f5048P1;

    /* renamed from: Q */
    public final DecoderInputBuffer f5049Q = DecoderInputBuffer.m5953z();

    /* renamed from: Q1 */
    public k70 f5050Q1;

    /* renamed from: R1 */
    public long f5051R1;

    /* renamed from: S1 */
    public int f5052S1;

    /* renamed from: T1 */
    public int f5053T1;

    /* renamed from: U */
    public final DecoderInputBuffer f5054U = new DecoderInputBuffer(0);

    /* renamed from: U1 */
    public ByteBuffer f5055U1;

    /* renamed from: V1 */
    public boolean f5056V1;

    /* renamed from: W1 */
    public boolean f5057W1;

    /* renamed from: X */
    public final DecoderInputBuffer f5058X = new DecoderInputBuffer(2);

    /* renamed from: X1 */
    public boolean f5059X1;

    /* renamed from: Y */
    public final b00 f5060Y;

    /* renamed from: Y1 */
    public boolean f5061Y1;

    /* renamed from: Z */
    public final mq6<C0792h> f5062Z;

    /* renamed from: Z1 */
    public boolean f5063Z1;

    /* renamed from: a2 */
    public boolean f5064a2;

    /* renamed from: b1 */
    public final long[] f5065b1;

    /* renamed from: b2 */
    public int f5066b2;

    /* renamed from: c2 */
    public int f5067c2;

    /* renamed from: d2 */
    public int f5068d2;

    /* renamed from: e0 */
    public final ArrayList<Long> f5069e0;

    /* renamed from: e1 */
    public final long[] f5070e1;

    /* renamed from: e2 */
    public boolean f5071e2;

    /* renamed from: f2 */
    public boolean f5072f2;

    /* renamed from: g2 */
    public boolean f5073g2;

    /* renamed from: h2 */
    public long f5074h2;

    /* renamed from: i2 */
    public long f5075i2;

    /* renamed from: j2 */
    public boolean f5076j2;

    /* renamed from: k0 */
    public final MediaCodec.BufferInfo f5077k0;

    /* renamed from: k2 */
    public boolean f5078k2;

    /* renamed from: l2 */
    public boolean f5079l2;

    /* renamed from: m2 */
    public boolean f5080m2;

    /* renamed from: n2 */
    public ExoPlaybackException f5081n2;

    /* renamed from: o1 */
    public C0792h f5082o1;

    /* renamed from: o2 */
    public n31 f5083o2;

    /* renamed from: p1 */
    public C0792h f5084p1;

    /* renamed from: p2 */
    public long f5085p2;

    /* renamed from: q1 */
    public DrmSession f5086q1;

    /* renamed from: q2 */
    public long f5087q2;

    /* renamed from: r1 */
    public DrmSession f5088r1;

    /* renamed from: r2 */
    public int f5089r2;

    /* renamed from: s1 */
    public MediaCrypto f5090s1;

    /* renamed from: t1 */
    public boolean f5091t1;

    /* renamed from: u1 */
    public long f5092u1;

    /* renamed from: v0 */
    public final long[] f5093v0;

    /* renamed from: v1 */
    public float f5094v1;

    /* renamed from: w1 */
    public float f5095w1;

    /* renamed from: x1 */
    public C0941c f5096x1;

    /* renamed from: y1 */
    public C0792h f5097y1;

    /* renamed from: z1 */
    public MediaFormat f5098z1;

    /* renamed from: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$a */
    public static final class C0930a {
        /* renamed from: a */
        public static void m6793a(C0941c.C0942a aVar, br4 br4) {
            LogSessionId a = br4.mo11789a();
            if (!a.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                aVar.f5119b.setString("log-session-id", a.getStringId());
            }
        }
    }

    public MediaCodecRenderer(int i, C0941c.C0943b bVar, C0946e eVar, boolean z, float f) {
        super(i);
        this.f5037I = bVar;
        this.f5041L = (C0946e) C2725kr.m20985e(eVar);
        this.f5043M = z;
        this.f5047P = f;
        b00 b00 = new b00();
        this.f5060Y = b00;
        this.f5062Z = new mq6<>();
        this.f5069e0 = new ArrayList<>();
        this.f5077k0 = new MediaCodec.BufferInfo();
        this.f5094v1 = 1.0f;
        this.f5095w1 = 1.0f;
        this.f5092u1 = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        this.f5093v0 = new long[10];
        this.f5065b1 = new long[10];
        this.f5070e1 = new long[10];
        this.f5085p2 = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        this.f5087q2 = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        b00.mo6970w(0);
        b00.f4592e.order(ByteOrder.nativeOrder());
        this.f5030B1 = -1.0f;
        this.f5034F1 = 0;
        this.f5066b2 = 0;
        this.f5052S1 = -1;
        this.f5053T1 = -1;
        this.f5051R1 = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        this.f5074h2 = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        this.f5075i2 = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        this.f5067c2 = 0;
        this.f5068d2 = 0;
    }

    /* renamed from: D0 */
    public static boolean m6701D0(IllegalStateException illegalStateException) {
        if (w67.f19021a >= 21 && m6702E0(illegalStateException)) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
            return false;
        }
        return true;
    }

    /* renamed from: E0 */
    public static boolean m6702E0(IllegalStateException illegalStateException) {
        return illegalStateException instanceof MediaCodec.CodecException;
    }

    /* renamed from: F0 */
    public static boolean m6703F0(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) illegalStateException).isRecoverable();
        }
        return false;
    }

    /* renamed from: U */
    public static boolean m6704U(String str, C0792h hVar) {
        if (w67.f19021a >= 21 || !hVar.f4177I.isEmpty() || !"OMX.MTK.VIDEO.DECODER.AVC".equals(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: V */
    public static boolean m6705V(String str) {
        if (w67.f19021a < 21 && "OMX.SEC.mp3.dec".equals(str) && "samsung".equals(w67.f19023c)) {
            String str2 = w67.f19022b;
            if (str2.startsWith("baffin") || str2.startsWith("grand") || str2.startsWith("fortuna") || str2.startsWith("gprimelte") || str2.startsWith("j2y18lte") || str2.startsWith("ms01")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: W */
    public static boolean m6706W(String str) {
        int i = w67.f19021a;
        if (i > 23 || !"OMX.google.vorbis.decoder".equals(str)) {
            if (i <= 19) {
                String str2 = w67.f19022b;
                if (("hb2000".equals(str2) || "stvm8".equals(str2)) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str))) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: X */
    public static boolean m6707X(String str) {
        if (w67.f19021a != 21 || !"OMX.google.aac.decoder".equals(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: Y */
    public static boolean m6708Y(C0945d dVar) {
        String str = dVar.f5124a;
        int i = w67.f19021a;
        if ((i > 25 || !"OMX.rk.video_decoder.avc".equals(str)) && ((i > 17 || !"OMX.allwinner.video.decoder.avc".equals(str)) && ((i > 29 || (!"OMX.broadcom.video_decoder.tunnel".equals(str) && !"OMX.broadcom.video_decoder.tunnel.secure".equals(str))) && (!"Amazon".equals(w67.f19023c) || !"AFTS".equals(w67.f19024d) || !dVar.f5130g)))) {
            return false;
        }
        return true;
    }

    /* renamed from: Z */
    public static boolean m6709Z(String str) {
        int i = w67.f19021a;
        if (i < 18 || ((i == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (i == 19 && w67.f19024d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str))))) {
            return true;
        }
        return false;
    }

    /* renamed from: a0 */
    public static boolean m6710a0(String str, C0792h hVar) {
        if (w67.f19021a > 18 || hVar.f4202v0 != 1 || !"OMX.MTK.AUDIO.DECODER.MP3".equals(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: b0 */
    public static boolean m6711b0(String str) {
        if (w67.f19021a != 29 || !"c2.android.aac.decoder".equals(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: k1 */
    public static boolean m6712k1(C0792h hVar) {
        int i = hVar.f4199r1;
        if (i == 0 || i == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: A0 */
    public final void mo7420A0(C0792h hVar) {
        mo7443d0();
        String str = hVar.f4175C;
        if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
            this.f5060Y.mo11331I(32);
        } else {
            this.f5060Y.mo11331I(1);
        }
        this.f5059X1 = true;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: B0 */
    public final void mo7421B0(C0945d dVar, MediaCrypto mediaCrypto) throws Exception {
        float f;
        boolean z;
        String str = dVar.f5124a;
        int i = w67.f19021a;
        float f2 = -1.0f;
        if (i < 23) {
            f = -1.0f;
        } else {
            f = mo7155r0(this.f5095w1, this.f5082o1, mo21678E());
        }
        if (f > this.f5047P) {
            f2 = f;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C0941c.C0942a v0 = mo7159v0(dVar, this.f5082o1, mediaCrypto, f2);
        if (i >= 31) {
            C0930a.m6793a(v0, mo21677D());
        }
        try {
            ps6.m25173a("createCodec:" + str);
            this.f5096x1 = this.f5037I.mo7502a(v0);
            ps6.m25175c();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            this.f5033E1 = dVar;
            this.f5030B1 = f2;
            this.f5097y1 = this.f5082o1;
            this.f5034F1 = mo7431T(str);
            this.f5035G1 = m6704U(str, this.f5097y1);
            this.f5036H1 = m6709Z(str);
            this.f5038I1 = m6711b0(str);
            this.f5039J1 = m6706W(str);
            this.f5040K1 = m6707X(str);
            this.f5042L1 = m6705V(str);
            this.f5044M1 = m6710a0(str, this.f5097y1);
            boolean z2 = false;
            if (m6708Y(dVar) || mo7464q0()) {
                z = true;
            } else {
                z = false;
            }
            this.f5048P1 = z;
            if (this.f5096x1.mo7493i()) {
                this.f5064a2 = true;
                this.f5066b2 = 1;
                if (this.f5034F1 != 0) {
                    z2 = true;
                }
                this.f5045N1 = z2;
            }
            if ("c2.android.mp3.decoder".equals(dVar.f5124a)) {
                this.f5050Q1 = new k70();
            }
            if (getState() == 2) {
                this.f5051R1 = SystemClock.elapsedRealtime() + 1000;
            }
            this.f5083o2.f15306a++;
            mo7138J0(str, v0, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
        } catch (Throwable th) {
            ps6.m25175c();
            throw th;
        }
    }

    /* renamed from: C0 */
    public final boolean mo7422C0(long j) {
        int size = this.f5069e0.size();
        for (int i = 0; i < size; i++) {
            if (this.f5069e0.get(i).longValue() == j) {
                this.f5069e0.remove(i);
                return true;
            }
        }
        return false;
    }

    /* renamed from: G */
    public void mo7133G() {
        this.f5082o1 = null;
        this.f5085p2 = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        this.f5087q2 = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        this.f5089r2 = 0;
        mo7458m0();
    }

    /* renamed from: G0 */
    public final void mo7423G0() throws ExoPlaybackException {
        C0792h hVar;
        boolean z;
        if (this.f5096x1 == null && !this.f5059X1 && (hVar = this.f5082o1) != null) {
            if (this.f5088r1 != null || !mo7152i1(hVar)) {
                mo7440b1(this.f5088r1);
                String str = this.f5082o1.f4175C;
                DrmSession drmSession = this.f5086q1;
                if (drmSession != null) {
                    if (this.f5090s1 == null) {
                        xb2 u0 = mo7469u0(drmSession);
                        if (u0 != null) {
                            try {
                                MediaCrypto mediaCrypto = new MediaCrypto(u0.f19805a, u0.f19806b);
                                this.f5090s1 = mediaCrypto;
                                if (u0.f19807c || !mediaCrypto.requiresSecureDecoderComponent(str)) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                                this.f5091t1 = z;
                            } catch (MediaCryptoException e) {
                                throw mo21700y(e, this.f5082o1, PlaybackException.ERROR_CODE_DRM_SYSTEM_ERROR);
                            }
                        } else if (this.f5086q1.getError() == null) {
                            return;
                        }
                    }
                    if (xb2.f19804d) {
                        int state = this.f5086q1.getState();
                        if (state == 1) {
                            DrmSession.DrmSessionException drmSessionException = (DrmSession.DrmSessionException) C2725kr.m20985e(this.f5086q1.getError());
                            throw mo21700y(drmSessionException, this.f5082o1, drmSessionException.errorCode);
                        } else if (state != 4) {
                            return;
                        }
                    }
                }
                try {
                    mo7424H0(this.f5090s1, this.f5091t1);
                } catch (DecoderInitializationException e2) {
                    throw mo21700y(e2, this.f5082o1, PlaybackException.ERROR_CODE_DECODER_INIT_FAILED);
                }
            } else {
                mo7420A0(this.f5082o1);
            }
        }
    }

    /* renamed from: H */
    public void mo7134H(boolean z, boolean z2) throws ExoPlaybackException {
        this.f5083o2 = new n31();
    }

    /* renamed from: H0 */
    public final void mo7424H0(MediaCrypto mediaCrypto, boolean z) throws DecoderInitializationException {
        if (this.f5031C1 == null) {
            try {
                List<C0945d> n0 = mo7460n0(z);
                ArrayDeque<C0945d> arrayDeque = new ArrayDeque<>();
                this.f5031C1 = arrayDeque;
                if (this.f5043M) {
                    arrayDeque.addAll(n0);
                } else if (!n0.isEmpty()) {
                    this.f5031C1.add(n0.get(0));
                }
                this.f5032D1 = null;
            } catch (MediaCodecUtil.DecoderQueryException e) {
                throw new DecoderInitializationException(this.f5082o1, (Throwable) e, z, -49998);
            }
        }
        if (!this.f5031C1.isEmpty()) {
            C0945d peekFirst = this.f5031C1.peekFirst();
            while (this.f5096x1 == null) {
                C0945d peekFirst2 = this.f5031C1.peekFirst();
                if (mo7450g1(peekFirst2)) {
                    try {
                        mo7421B0(peekFirst2, mediaCrypto);
                    } catch (Exception e2) {
                        if (peekFirst2 == peekFirst) {
                            gk3.m18132i("MediaCodecRenderer", "Preferred decoder instantiation failed. Sleeping for 50ms then retrying.");
                            Thread.sleep(50);
                            mo7421B0(peekFirst2, mediaCrypto);
                        } else {
                            throw e2;
                        }
                    } catch (Exception e3) {
                        gk3.m18133j("MediaCodecRenderer", "Failed to initialize decoder: " + peekFirst2, e3);
                        this.f5031C1.removeFirst();
                        DecoderInitializationException decoderInitializationException = new DecoderInitializationException(this.f5082o1, (Throwable) e3, z, peekFirst2);
                        mo7136I0(decoderInitializationException);
                        DecoderInitializationException decoderInitializationException2 = this.f5032D1;
                        if (decoderInitializationException2 == null) {
                            this.f5032D1 = decoderInitializationException;
                        } else {
                            this.f5032D1 = decoderInitializationException2.mo7474b(decoderInitializationException);
                        }
                        if (this.f5031C1.isEmpty()) {
                            throw this.f5032D1;
                        }
                    }
                } else {
                    return;
                }
            }
            this.f5031C1 = null;
            return;
        }
        throw new DecoderInitializationException(this.f5082o1, (Throwable) null, z, -49999);
    }

    /* renamed from: I */
    public void mo7135I(long j, boolean z) throws ExoPlaybackException {
        this.f5076j2 = false;
        this.f5078k2 = false;
        this.f5080m2 = false;
        if (this.f5059X1) {
            this.f5060Y.mo6968h();
            this.f5058X.mo6968h();
            this.f5061Y1 = false;
        } else {
            mo7456l0();
        }
        if (this.f5062Z.mo23314l() > 0) {
            this.f5079l2 = true;
        }
        this.f5062Z.mo23306c();
        int i = this.f5089r2;
        if (i != 0) {
            this.f5087q2 = this.f5065b1[i - 1];
            this.f5085p2 = this.f5093v0[i - 1];
            this.f5089r2 = 0;
        }
    }

    /* renamed from: I0 */
    public abstract void mo7136I0(Exception exc);

    /* renamed from: J */
    public void mo7137J() {
        try {
            mo7443d0();
            mo7434V0();
        } finally {
            mo7446e1((DrmSession) null);
        }
    }

    /* renamed from: J0 */
    public abstract void mo7138J0(String str, C0941c.C0942a aVar, long j, long j2);

    /* renamed from: K */
    public void mo7139K() {
    }

    /* renamed from: K0 */
    public abstract void mo7140K0(String str);

    /* renamed from: L */
    public void mo7141L() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0080, code lost:
        if (mo7449g0() == false) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b2, code lost:
        if (mo7449g0() == false) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00ce, code lost:
        r7 = 2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00ea A[RETURN] */
    /* renamed from: L0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p000.p31 mo7142L0(p000.c82 r12) throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            r11 = this;
            r0 = 1
            r11.f5079l2 = r0
            androidx.media3.common.h r1 = r12.f8368b
            java.lang.Object r1 = p000.C2725kr.m20985e(r1)
            r5 = r1
            androidx.media3.common.h r5 = (androidx.media3.common.C0792h) r5
            java.lang.String r1 = r5.f4175C
            if (r1 == 0) goto L_0x00eb
            androidx.media3.exoplayer.drm.DrmSession r12 = r12.f8367a
            r11.mo7446e1(r12)
            r11.f5082o1 = r5
            boolean r12 = r11.f5059X1
            r1 = 0
            if (r12 == 0) goto L_0x001f
            r11.f5063Z1 = r0
            return r1
        L_0x001f:
            androidx.media3.exoplayer.mediacodec.c r12 = r11.f5096x1
            if (r12 != 0) goto L_0x0029
            r11.f5031C1 = r1
            r11.mo7423G0()
            return r1
        L_0x0029:
            androidx.media3.exoplayer.mediacodec.d r1 = r11.f5033E1
            androidx.media3.common.h r4 = r11.f5097y1
            androidx.media3.exoplayer.drm.DrmSession r2 = r11.f5086q1
            androidx.media3.exoplayer.drm.DrmSession r3 = r11.f5088r1
            boolean r2 = r11.mo7453i0(r1, r5, r2, r3)
            if (r2 == 0) goto L_0x0046
            r11.mo7447f0()
            p31 r12 = new p31
            java.lang.String r3 = r1.f5124a
            r6 = 0
            r7 = 128(0x80, float:1.794E-43)
            r2 = r12
            r2.<init>(r3, r4, r5, r6, r7)
            return r12
        L_0x0046:
            androidx.media3.exoplayer.drm.DrmSession r2 = r11.f5088r1
            androidx.media3.exoplayer.drm.DrmSession r3 = r11.f5086q1
            r6 = 0
            if (r2 == r3) goto L_0x004f
            r2 = r0
            goto L_0x0050
        L_0x004f:
            r2 = r6
        L_0x0050:
            if (r2 == 0) goto L_0x005b
            int r3 = p000.w67.f19021a
            r7 = 23
            if (r3 < r7) goto L_0x0059
            goto L_0x005b
        L_0x0059:
            r3 = r6
            goto L_0x005c
        L_0x005b:
            r3 = r0
        L_0x005c:
            p000.C2725kr.m20987g(r3)
            p31 r3 = r11.mo7147S(r1, r4, r5)
            int r7 = r3.f16270d
            r8 = 3
            r9 = 16
            r10 = 2
            if (r7 == 0) goto L_0x00d0
            if (r7 == r0) goto L_0x00b5
            if (r7 == r10) goto L_0x0089
            if (r7 != r8) goto L_0x0083
            boolean r0 = r11.mo7457l1(r5)
            if (r0 != 0) goto L_0x0078
            goto L_0x00bb
        L_0x0078:
            r11.f5097y1 = r5
            if (r2 == 0) goto L_0x00d3
            boolean r0 = r11.mo7449g0()
            if (r0 != 0) goto L_0x00d3
            goto L_0x00ce
        L_0x0083:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            r12.<init>()
            throw r12
        L_0x0089:
            boolean r7 = r11.mo7457l1(r5)
            if (r7 != 0) goto L_0x0090
            goto L_0x00bb
        L_0x0090:
            r11.f5064a2 = r0
            r11.f5066b2 = r0
            int r7 = r11.f5034F1
            if (r7 == r10) goto L_0x00a8
            if (r7 != r0) goto L_0x00a7
            int r7 = r5.f4180P
            int r9 = r4.f4180P
            if (r7 != r9) goto L_0x00a7
            int r7 = r5.f4181Q
            int r9 = r4.f4181Q
            if (r7 != r9) goto L_0x00a7
            goto L_0x00a8
        L_0x00a7:
            r0 = r6
        L_0x00a8:
            r11.f5045N1 = r0
            r11.f5097y1 = r5
            if (r2 == 0) goto L_0x00d3
            boolean r0 = r11.mo7449g0()
            if (r0 != 0) goto L_0x00d3
            goto L_0x00ce
        L_0x00b5:
            boolean r0 = r11.mo7457l1(r5)
            if (r0 != 0) goto L_0x00bd
        L_0x00bb:
            r7 = r9
            goto L_0x00d4
        L_0x00bd:
            r11.f5097y1 = r5
            if (r2 == 0) goto L_0x00c8
            boolean r0 = r11.mo7449g0()
            if (r0 != 0) goto L_0x00d3
            goto L_0x00ce
        L_0x00c8:
            boolean r0 = r11.mo7445e0()
            if (r0 != 0) goto L_0x00d3
        L_0x00ce:
            r7 = r10
            goto L_0x00d4
        L_0x00d0:
            r11.mo7447f0()
        L_0x00d3:
            r7 = r6
        L_0x00d4:
            int r0 = r3.f16270d
            if (r0 == 0) goto L_0x00ea
            androidx.media3.exoplayer.mediacodec.c r0 = r11.f5096x1
            if (r0 != r12) goto L_0x00e0
            int r12 = r11.f5068d2
            if (r12 != r8) goto L_0x00ea
        L_0x00e0:
            p31 r12 = new p31
            java.lang.String r3 = r1.f5124a
            r6 = 0
            r2 = r12
            r2.<init>(r3, r4, r5, r6, r7)
            return r12
        L_0x00ea:
            return r3
        L_0x00eb:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            r12.<init>()
            r0 = 4005(0xfa5, float:5.612E-42)
            androidx.media3.exoplayer.ExoPlaybackException r12 = r11.mo21700y(r12, r5, r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.mo7142L0(c82):p31");
    }

    /* renamed from: M */
    public void mo7425M(C0792h[] hVarArr, long j, long j2) throws ExoPlaybackException {
        boolean z = true;
        if (this.f5087q2 == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            if (this.f5085p2 != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                z = false;
            }
            C2725kr.m20987g(z);
            this.f5085p2 = j;
            this.f5087q2 = j2;
            return;
        }
        int i = this.f5089r2;
        if (i == this.f5065b1.length) {
            gk3.m18132i("MediaCodecRenderer", "Too many stream changes, so dropping offset: " + this.f5065b1[this.f5089r2 - 1]);
        } else {
            this.f5089r2 = i + 1;
        }
        long[] jArr = this.f5093v0;
        int i2 = this.f5089r2;
        jArr[i2 - 1] = j;
        this.f5065b1[i2 - 1] = j2;
        this.f5070e1[i2 - 1] = this.f5074h2;
    }

    /* renamed from: M0 */
    public abstract void mo7143M0(C0792h hVar, MediaFormat mediaFormat) throws ExoPlaybackException;

    /* renamed from: N0 */
    public void mo7426N0(long j) {
        while (true) {
            int i = this.f5089r2;
            if (i != 0 && j >= this.f5070e1[0]) {
                long[] jArr = this.f5093v0;
                this.f5085p2 = jArr[0];
                this.f5087q2 = this.f5065b1[0];
                int i2 = i - 1;
                this.f5089r2 = i2;
                System.arraycopy(jArr, 1, jArr, 0, i2);
                long[] jArr2 = this.f5065b1;
                System.arraycopy(jArr2, 1, jArr2, 0, this.f5089r2);
                long[] jArr3 = this.f5070e1;
                System.arraycopy(jArr3, 1, jArr3, 0, this.f5089r2);
                mo7144O0();
            } else {
                return;
            }
        }
    }

    /* renamed from: O0 */
    public void mo7144O0() {
    }

    /* renamed from: P0 */
    public abstract void mo7145P0(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException;

    /* renamed from: Q */
    public final void mo7427Q() throws ExoPlaybackException {
        C2725kr.m20987g(!this.f5076j2);
        c82 B = mo21675B();
        this.f5058X.mo6968h();
        do {
            this.f5058X.mo6968h();
            int N = mo21680N(B, this.f5058X, 0);
            if (N == -5) {
                mo7142L0(B);
                return;
            } else if (N != -4) {
                if (N != -3) {
                    throw new IllegalStateException();
                }
                return;
            } else if (this.f5058X.mo23893p()) {
                this.f5076j2 = true;
                return;
            } else {
                if (this.f5079l2) {
                    C0792h hVar = (C0792h) C2725kr.m20985e(this.f5082o1);
                    this.f5084p1 = hVar;
                    mo7143M0(hVar, (MediaFormat) null);
                    this.f5079l2 = false;
                }
                this.f5058X.mo6971x();
            }
        } while (this.f5060Y.mo11325C(this.f5058X));
        this.f5061Y1 = true;
    }

    @TargetApi(23)
    /* renamed from: Q0 */
    public final void mo7428Q0() throws ExoPlaybackException {
        int i = this.f5068d2;
        if (i == 1) {
            mo7455k0();
        } else if (i == 2) {
            mo7455k0();
            mo7459m1();
        } else if (i != 3) {
            this.f5078k2 = true;
            mo7148W0();
        } else {
            mo7433U0();
        }
    }

    /* renamed from: R */
    public final boolean mo7429R(long j, long j2) throws ExoPlaybackException {
        boolean z;
        C2725kr.m20987g(!this.f5078k2);
        if (this.f5060Y.mo11330H()) {
            b00 b00 = this.f5060Y;
            if (!mo7146R0(j, j2, (C0941c) null, b00.f4592e, this.f5053T1, 0, b00.mo11329G(), this.f5060Y.mo11327E(), this.f5060Y.mo23892o(), this.f5060Y.mo23893p(), this.f5084p1)) {
                return false;
            }
            mo7426N0(this.f5060Y.mo11328F());
            this.f5060Y.mo6968h();
            z = false;
        } else {
            z = false;
        }
        if (this.f5076j2) {
            this.f5078k2 = true;
            return z;
        }
        if (this.f5061Y1) {
            C2725kr.m20987g(this.f5060Y.mo11325C(this.f5058X));
            this.f5061Y1 = z;
        }
        if (this.f5063Z1) {
            if (this.f5060Y.mo11330H()) {
                return true;
            }
            mo7443d0();
            this.f5063Z1 = z;
            mo7423G0();
            if (!this.f5059X1) {
                return z;
            }
        }
        mo7427Q();
        if (this.f5060Y.mo11330H()) {
            this.f5060Y.mo6971x();
        }
        if (this.f5060Y.mo11330H() || this.f5076j2 || this.f5063Z1) {
            return true;
        }
        return z;
    }

    /* renamed from: R0 */
    public abstract boolean mo7146R0(long j, long j2, C0941c cVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C0792h hVar) throws ExoPlaybackException;

    /* renamed from: S */
    public abstract p31 mo7147S(C0945d dVar, C0792h hVar, C0792h hVar2);

    /* renamed from: S0 */
    public final void mo7430S0() {
        this.f5073g2 = true;
        MediaFormat d = this.f5096x1.mo7487d();
        if (this.f5034F1 != 0 && d.getInteger("width") == 32 && d.getInteger("height") == 32) {
            this.f5046O1 = true;
            return;
        }
        if (this.f5044M1) {
            d.setInteger("channel-count", 1);
        }
        this.f5098z1 = d;
        this.f5029A1 = true;
    }

    /* renamed from: T */
    public final int mo7431T(String str) {
        int i = w67.f19021a;
        if (i <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            String str2 = w67.f19024d;
            if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                return 2;
            }
        }
        if (i >= 24) {
            return 0;
        }
        if (!"OMX.Nvidia.h264.decode".equals(str) && !"OMX.Nvidia.h264.decode.secure".equals(str)) {
            return 0;
        }
        String str3 = w67.f19022b;
        if ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) {
            return 1;
        }
        return 0;
    }

    /* renamed from: T0 */
    public final boolean mo7432T0(int i) throws ExoPlaybackException {
        c82 B = mo21675B();
        this.f5049Q.mo6968h();
        int N = mo21680N(B, this.f5049Q, i | 4);
        if (N == -5) {
            mo7142L0(B);
            return true;
        } else if (N != -4 || !this.f5049Q.mo23893p()) {
            return false;
        } else {
            this.f5076j2 = true;
            mo7428Q0();
            return false;
        }
    }

    /* renamed from: U0 */
    public final void mo7433U0() throws ExoPlaybackException {
        mo7434V0();
        mo7423G0();
    }

    /* renamed from: V0 */
    public void mo7434V0() {
        try {
            C0941c cVar = this.f5096x1;
            if (cVar != null) {
                cVar.mo7484a();
                this.f5083o2.f15307b++;
                mo7140K0(this.f5033E1.f5124a);
            }
            this.f5096x1 = null;
            try {
                MediaCrypto mediaCrypto = this.f5090s1;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.f5090s1 = null;
                mo7440b1((DrmSession) null);
                mo7436Y0();
            }
        } catch (Throwable th) {
            this.f5096x1 = null;
            MediaCrypto mediaCrypto2 = this.f5090s1;
            if (mediaCrypto2 != null) {
                mediaCrypto2.release();
            }
            throw th;
        } finally {
            this.f5090s1 = null;
            mo7440b1((DrmSession) null);
            mo7436Y0();
        }
    }

    /* renamed from: W0 */
    public void mo7148W0() throws ExoPlaybackException {
    }

    /* renamed from: X0 */
    public void mo7435X0() {
        mo7437Z0();
        mo7439a1();
        this.f5051R1 = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        this.f5072f2 = false;
        this.f5071e2 = false;
        this.f5045N1 = false;
        this.f5046O1 = false;
        this.f5056V1 = false;
        this.f5057W1 = false;
        this.f5069e0.clear();
        this.f5074h2 = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        this.f5075i2 = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        k70 k70 = this.f5050Q1;
        if (k70 != null) {
            k70.mo22201c();
        }
        this.f5067c2 = 0;
        this.f5068d2 = 0;
        this.f5066b2 = this.f5064a2 ? 1 : 0;
    }

    /* renamed from: Y0 */
    public void mo7436Y0() {
        mo7435X0();
        this.f5081n2 = null;
        this.f5050Q1 = null;
        this.f5031C1 = null;
        this.f5033E1 = null;
        this.f5097y1 = null;
        this.f5098z1 = null;
        this.f5029A1 = false;
        this.f5073g2 = false;
        this.f5030B1 = -1.0f;
        this.f5034F1 = 0;
        this.f5035G1 = false;
        this.f5036H1 = false;
        this.f5038I1 = false;
        this.f5039J1 = false;
        this.f5040K1 = false;
        this.f5042L1 = false;
        this.f5044M1 = false;
        this.f5048P1 = false;
        this.f5064a2 = false;
        this.f5066b2 = 0;
        this.f5091t1 = false;
    }

    /* renamed from: Z0 */
    public final void mo7437Z0() {
        this.f5052S1 = -1;
        this.f5054U.f4592e = null;
    }

    /* renamed from: a */
    public final int mo7438a(C0792h hVar) throws ExoPlaybackException {
        try {
            return mo7153j1(this.f5041L, hVar);
        } catch (MediaCodecUtil.DecoderQueryException e) {
            throw mo21700y(e, hVar, PlaybackException.ERROR_CODE_DECODER_QUERY_FAILED);
        }
    }

    /* renamed from: a1 */
    public final void mo7439a1() {
        this.f5053T1 = -1;
        this.f5055U1 = null;
    }

    /* renamed from: b1 */
    public final void mo7440b1(DrmSession drmSession) {
        gk1.m18104a(this.f5086q1, drmSession);
        this.f5086q1 = drmSession;
    }

    /* renamed from: c0 */
    public MediaCodecDecoderException mo7441c0(Throwable th, C0945d dVar) {
        return new MediaCodecDecoderException(th, dVar);
    }

    /* renamed from: c1 */
    public final void mo7442c1() {
        this.f5080m2 = true;
    }

    /* renamed from: d0 */
    public final void mo7443d0() {
        this.f5063Z1 = false;
        this.f5060Y.mo6968h();
        this.f5058X.mo6968h();
        this.f5061Y1 = false;
        this.f5059X1 = false;
    }

    /* renamed from: d1 */
    public final void mo7444d1(ExoPlaybackException exoPlaybackException) {
        this.f5081n2 = exoPlaybackException;
    }

    /* renamed from: e */
    public boolean mo7149e() {
        return this.f5078k2;
    }

    /* renamed from: e0 */
    public final boolean mo7445e0() {
        if (this.f5071e2) {
            this.f5067c2 = 1;
            if (this.f5036H1 || this.f5039J1) {
                this.f5068d2 = 3;
                return false;
            }
            this.f5068d2 = 1;
        }
        return true;
    }

    /* renamed from: e1 */
    public final void mo7446e1(DrmSession drmSession) {
        gk1.m18104a(this.f5088r1, drmSession);
        this.f5088r1 = drmSession;
    }

    /* renamed from: f0 */
    public final void mo7447f0() throws ExoPlaybackException {
        if (this.f5071e2) {
            this.f5067c2 = 1;
            this.f5068d2 = 3;
            return;
        }
        mo7433U0();
    }

    /* renamed from: f1 */
    public final boolean mo7448f1(long j) {
        if (this.f5092u1 == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED || SystemClock.elapsedRealtime() - j < this.f5092u1) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public boolean mo7150g() {
        if (this.f5082o1 == null || (!mo21679F() && !mo7473z0() && (this.f5051R1 == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED || SystemClock.elapsedRealtime() >= this.f5051R1))) {
            return false;
        }
        return true;
    }

    @TargetApi(23)
    /* renamed from: g0 */
    public final boolean mo7449g0() throws ExoPlaybackException {
        if (this.f5071e2) {
            this.f5067c2 = 1;
            if (this.f5036H1 || this.f5039J1) {
                this.f5068d2 = 3;
                return false;
            }
            this.f5068d2 = 2;
        } else {
            mo7459m1();
        }
        return true;
    }

    /* renamed from: g1 */
    public boolean mo7450g1(C0945d dVar) {
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:68:0x00f7  */
    /* renamed from: h0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo7451h0(long r20, long r22) throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            r19 = this;
            r15 = r19
            boolean r0 = r19.mo7473z0()
            r16 = 1
            r14 = 0
            if (r0 != 0) goto L_0x00c2
            boolean r0 = r15.f5040K1
            if (r0 == 0) goto L_0x0027
            boolean r0 = r15.f5072f2
            if (r0 == 0) goto L_0x0027
            androidx.media3.exoplayer.mediacodec.c r0 = r15.f5096x1     // Catch:{ IllegalStateException -> 0x001c }
            android.media.MediaCodec$BufferInfo r1 = r15.f5077k0     // Catch:{ IllegalStateException -> 0x001c }
            int r0 = r0.mo7497m(r1)     // Catch:{ IllegalStateException -> 0x001c }
            goto L_0x002f
        L_0x001c:
            r19.mo7428Q0()
            boolean r0 = r15.f5078k2
            if (r0 == 0) goto L_0x0026
            r19.mo7434V0()
        L_0x0026:
            return r14
        L_0x0027:
            androidx.media3.exoplayer.mediacodec.c r0 = r15.f5096x1
            android.media.MediaCodec$BufferInfo r1 = r15.f5077k0
            int r0 = r0.mo7497m(r1)
        L_0x002f:
            if (r0 >= 0) goto L_0x0049
            r1 = -2
            if (r0 != r1) goto L_0x0038
            r19.mo7430S0()
            return r16
        L_0x0038:
            boolean r0 = r15.f5048P1
            if (r0 == 0) goto L_0x0048
            boolean r0 = r15.f5076j2
            if (r0 != 0) goto L_0x0045
            int r0 = r15.f5067c2
            r1 = 2
            if (r0 != r1) goto L_0x0048
        L_0x0045:
            r19.mo7428Q0()
        L_0x0048:
            return r14
        L_0x0049:
            boolean r1 = r15.f5046O1
            if (r1 == 0) goto L_0x0055
            r15.f5046O1 = r14
            androidx.media3.exoplayer.mediacodec.c r1 = r15.f5096x1
            r1.mo7498n(r0, r14)
            return r16
        L_0x0055:
            android.media.MediaCodec$BufferInfo r1 = r15.f5077k0
            int r2 = r1.size
            if (r2 != 0) goto L_0x0065
            int r1 = r1.flags
            r1 = r1 & 4
            if (r1 == 0) goto L_0x0065
            r19.mo7428Q0()
            return r14
        L_0x0065:
            r15.f5053T1 = r0
            androidx.media3.exoplayer.mediacodec.c r1 = r15.f5096x1
            java.nio.ByteBuffer r0 = r1.mo7499o(r0)
            r15.f5055U1 = r0
            if (r0 == 0) goto L_0x0084
            android.media.MediaCodec$BufferInfo r1 = r15.f5077k0
            int r1 = r1.offset
            r0.position(r1)
            java.nio.ByteBuffer r0 = r15.f5055U1
            android.media.MediaCodec$BufferInfo r1 = r15.f5077k0
            int r2 = r1.offset
            int r1 = r1.size
            int r2 = r2 + r1
            r0.limit(r2)
        L_0x0084:
            boolean r0 = r15.f5042L1
            if (r0 == 0) goto L_0x00a5
            android.media.MediaCodec$BufferInfo r0 = r15.f5077k0
            long r1 = r0.presentationTimeUs
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x00a5
            int r1 = r0.flags
            r1 = r1 & 4
            if (r1 == 0) goto L_0x00a5
            long r1 = r15.f5074h2
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x00a5
            r0.presentationTimeUs = r1
        L_0x00a5:
            android.media.MediaCodec$BufferInfo r0 = r15.f5077k0
            long r0 = r0.presentationTimeUs
            boolean r0 = r15.mo7422C0(r0)
            r15.f5056V1 = r0
            long r0 = r15.f5075i2
            android.media.MediaCodec$BufferInfo r2 = r15.f5077k0
            long r2 = r2.presentationTimeUs
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x00bc
            r0 = r16
            goto L_0x00bd
        L_0x00bc:
            r0 = r14
        L_0x00bd:
            r15.f5057W1 = r0
            r15.mo7461n1(r2)
        L_0x00c2:
            boolean r0 = r15.f5040K1
            if (r0 == 0) goto L_0x00fb
            boolean r0 = r15.f5072f2
            if (r0 == 0) goto L_0x00fb
            androidx.media3.exoplayer.mediacodec.c r5 = r15.f5096x1     // Catch:{ IllegalStateException -> 0x00ee }
            java.nio.ByteBuffer r6 = r15.f5055U1     // Catch:{ IllegalStateException -> 0x00ee }
            int r7 = r15.f5053T1     // Catch:{ IllegalStateException -> 0x00ee }
            android.media.MediaCodec$BufferInfo r0 = r15.f5077k0     // Catch:{ IllegalStateException -> 0x00ee }
            int r8 = r0.flags     // Catch:{ IllegalStateException -> 0x00ee }
            r9 = 1
            long r10 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x00ee }
            boolean r12 = r15.f5056V1     // Catch:{ IllegalStateException -> 0x00ee }
            boolean r13 = r15.f5057W1     // Catch:{ IllegalStateException -> 0x00ee }
            androidx.media3.common.h r3 = r15.f5084p1     // Catch:{ IllegalStateException -> 0x00ee }
            r0 = r19
            r1 = r20
            r17 = r3
            r3 = r22
            r18 = r14
            r14 = r17
            boolean r0 = r0.mo7146R0(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14)     // Catch:{ IllegalStateException -> 0x00f0 }
            goto L_0x011a
        L_0x00ee:
            r18 = r14
        L_0x00f0:
            r19.mo7428Q0()
            boolean r0 = r15.f5078k2
            if (r0 == 0) goto L_0x00fa
            r19.mo7434V0()
        L_0x00fa:
            return r18
        L_0x00fb:
            r18 = r14
            androidx.media3.exoplayer.mediacodec.c r5 = r15.f5096x1
            java.nio.ByteBuffer r6 = r15.f5055U1
            int r7 = r15.f5053T1
            android.media.MediaCodec$BufferInfo r0 = r15.f5077k0
            int r8 = r0.flags
            r9 = 1
            long r10 = r0.presentationTimeUs
            boolean r12 = r15.f5056V1
            boolean r13 = r15.f5057W1
            androidx.media3.common.h r14 = r15.f5084p1
            r0 = r19
            r1 = r20
            r3 = r22
            boolean r0 = r0.mo7146R0(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14)
        L_0x011a:
            if (r0 == 0) goto L_0x0139
            android.media.MediaCodec$BufferInfo r0 = r15.f5077k0
            long r0 = r0.presentationTimeUs
            r15.mo7426N0(r0)
            android.media.MediaCodec$BufferInfo r0 = r15.f5077k0
            int r0 = r0.flags
            r0 = r0 & 4
            if (r0 == 0) goto L_0x012e
            r14 = r16
            goto L_0x0130
        L_0x012e:
            r14 = r18
        L_0x0130:
            r19.mo7439a1()
            if (r14 != 0) goto L_0x0136
            return r16
        L_0x0136:
            r19.mo7428Q0()
        L_0x0139:
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.mo7451h0(long, long):boolean");
    }

    /* renamed from: h1 */
    public boolean mo7452h1() {
        return false;
    }

    /* renamed from: i0 */
    public final boolean mo7453i0(C0945d dVar, C0792h hVar, DrmSession drmSession, DrmSession drmSession2) throws ExoPlaybackException {
        xb2 u0;
        boolean z;
        if (drmSession == drmSession2) {
            return false;
        }
        if (drmSession2 == null || drmSession == null || w67.f19021a < 23) {
            return true;
        }
        UUID uuid = l70.f14427e;
        if (uuid.equals(drmSession.mo7319a()) || uuid.equals(drmSession2.mo7319a()) || (u0 = mo7469u0(drmSession2)) == null) {
            return true;
        }
        if (u0.f19807c) {
            z = false;
        } else {
            z = drmSession2.mo7325g(hVar.f4175C);
        }
        if (dVar.f5130g || !z) {
            return false;
        }
        return true;
    }

    /* renamed from: i1 */
    public boolean mo7152i1(C0792h hVar) {
        return false;
    }

    /* renamed from: j0 */
    public final boolean mo7454j0() throws ExoPlaybackException {
        int i;
        if (this.f5096x1 == null || (i = this.f5067c2) == 2 || this.f5076j2) {
            return false;
        }
        if (i == 0 && mo7452h1()) {
            mo7447f0();
        }
        if (this.f5052S1 < 0) {
            int l = this.f5096x1.mo7496l();
            this.f5052S1 = l;
            if (l < 0) {
                return false;
            }
            this.f5054U.f4592e = this.f5096x1.mo7489f(l);
            this.f5054U.mo6968h();
        }
        if (this.f5067c2 == 1) {
            if (!this.f5048P1) {
                this.f5072f2 = true;
                this.f5096x1.mo7492h(this.f5052S1, 0, 0, 0, 4);
                mo7437Z0();
            }
            this.f5067c2 = 2;
            return false;
        } else if (this.f5045N1) {
            this.f5045N1 = false;
            ByteBuffer byteBuffer = this.f5054U.f4592e;
            byte[] bArr = f5028s2;
            byteBuffer.put(bArr);
            this.f5096x1.mo7492h(this.f5052S1, 0, bArr.length, 0, 0);
            mo7437Z0();
            this.f5071e2 = true;
            return true;
        } else {
            if (this.f5066b2 == 1) {
                for (int i2 = 0; i2 < this.f5097y1.f4177I.size(); i2++) {
                    this.f5054U.f4592e.put(this.f5097y1.f4177I.get(i2));
                }
                this.f5066b2 = 2;
            }
            int position = this.f5054U.f4592e.position();
            c82 B = mo21675B();
            try {
                int N = mo21680N(B, this.f5054U, 0);
                if (mo21687i()) {
                    this.f5075i2 = this.f5074h2;
                }
                if (N == -3) {
                    return false;
                }
                if (N == -5) {
                    if (this.f5066b2 == 2) {
                        this.f5054U.mo6968h();
                        this.f5066b2 = 1;
                    }
                    mo7142L0(B);
                    return true;
                } else if (this.f5054U.mo23893p()) {
                    if (this.f5066b2 == 2) {
                        this.f5054U.mo6968h();
                        this.f5066b2 = 1;
                    }
                    this.f5076j2 = true;
                    if (!this.f5071e2) {
                        mo7428Q0();
                        return false;
                    }
                    try {
                        if (!this.f5048P1) {
                            this.f5072f2 = true;
                            this.f5096x1.mo7492h(this.f5052S1, 0, 0, 0, 4);
                            mo7437Z0();
                        }
                        return false;
                    } catch (MediaCodec.CryptoException e) {
                        throw mo21700y(e, this.f5082o1, w67.m29328R(e.getErrorCode()));
                    }
                } else if (this.f5071e2 || this.f5054U.mo23895t()) {
                    boolean y = this.f5054U.mo6972y();
                    if (y) {
                        this.f5054U.f4591d.mo22097b(position);
                    }
                    if (this.f5035G1 && !y) {
                        q24.m25333b(this.f5054U.f4592e);
                        if (this.f5054U.f4592e.position() == 0) {
                            return true;
                        }
                        this.f5035G1 = false;
                    }
                    DecoderInputBuffer decoderInputBuffer = this.f5054U;
                    long j = decoderInputBuffer.f4594k;
                    k70 k70 = this.f5050Q1;
                    if (k70 != null) {
                        j = k70.mo22202d(this.f5082o1, decoderInputBuffer);
                        this.f5074h2 = Math.max(this.f5074h2, this.f5050Q1.mo22200b(this.f5082o1));
                    }
                    long j2 = j;
                    if (this.f5054U.mo23892o()) {
                        this.f5069e0.add(Long.valueOf(j2));
                    }
                    if (this.f5079l2) {
                        this.f5062Z.mo23304a(j2, this.f5082o1);
                        this.f5079l2 = false;
                    }
                    this.f5074h2 = Math.max(this.f5074h2, j2);
                    this.f5054U.mo6971x();
                    if (this.f5054U.mo23891m()) {
                        mo7472y0(this.f5054U);
                    }
                    mo7145P0(this.f5054U);
                    if (y) {
                        try {
                            this.f5096x1.mo7486c(this.f5052S1, 0, this.f5054U.f4591d, j2, 0);
                        } catch (MediaCodec.CryptoException e2) {
                            throw mo21700y(e2, this.f5082o1, w67.m29328R(e2.getErrorCode()));
                        }
                    } else {
                        this.f5096x1.mo7492h(this.f5052S1, 0, this.f5054U.f4592e.limit(), j2, 0);
                    }
                    mo7437Z0();
                    this.f5071e2 = true;
                    this.f5066b2 = 0;
                    this.f5083o2.f15308c++;
                    return true;
                } else {
                    this.f5054U.mo6968h();
                    if (this.f5066b2 == 2) {
                        this.f5066b2 = 1;
                    }
                    return true;
                }
            } catch (DecoderInputBuffer.InsufficientCapacityException e3) {
                mo7136I0(e3);
                mo7432T0(0);
                mo7455k0();
                return true;
            }
        }
    }

    /* renamed from: j1 */
    public abstract int mo7153j1(C0946e eVar, C0792h hVar) throws MediaCodecUtil.DecoderQueryException;

    /* renamed from: k0 */
    public final void mo7455k0() {
        try {
            this.f5096x1.flush();
        } finally {
            mo7435X0();
        }
    }

    /* renamed from: l0 */
    public final boolean mo7456l0() throws ExoPlaybackException {
        boolean m0 = mo7458m0();
        if (m0) {
            mo7423G0();
        }
        return m0;
    }

    /* renamed from: l1 */
    public final boolean mo7457l1(C0792h hVar) throws ExoPlaybackException {
        if (!(w67.f19021a < 23 || this.f5096x1 == null || this.f5068d2 == 3 || getState() == 0)) {
            float r0 = mo7155r0(this.f5095w1, hVar, mo21678E());
            float f = this.f5030B1;
            if (f == r0) {
                return true;
            }
            if (r0 == -1.0f) {
                mo7447f0();
                return false;
            } else if (f == -1.0f && r0 <= this.f5047P) {
                return true;
            } else {
                Bundle bundle = new Bundle();
                bundle.putFloat("operating-rate", r0);
                this.f5096x1.mo7494j(bundle);
                this.f5030B1 = r0;
            }
        }
        return true;
    }

    /* renamed from: m0 */
    public boolean mo7458m0() {
        boolean z;
        if (this.f5096x1 == null) {
            return false;
        }
        int i = this.f5068d2;
        if (i == 3 || this.f5036H1 || ((this.f5038I1 && !this.f5073g2) || (this.f5039J1 && this.f5072f2))) {
            mo7434V0();
            return true;
        }
        if (i == 2) {
            int i2 = w67.f19021a;
            if (i2 >= 23) {
                z = true;
            } else {
                z = false;
            }
            C2725kr.m20987g(z);
            if (i2 >= 23) {
                try {
                    mo7459m1();
                } catch (ExoPlaybackException e) {
                    gk3.m18133j("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
                    mo7434V0();
                    return true;
                }
            }
        }
        mo7455k0();
        return false;
    }

    /* renamed from: m1 */
    public final void mo7459m1() throws ExoPlaybackException {
        try {
            this.f5090s1.setMediaDrmSession(mo7469u0(this.f5088r1).f19806b);
            mo7440b1(this.f5088r1);
            this.f5067c2 = 0;
            this.f5068d2 = 0;
        } catch (MediaCryptoException e) {
            throw mo21700y(e, this.f5082o1, PlaybackException.ERROR_CODE_DRM_SYSTEM_ERROR);
        }
    }

    /* renamed from: n0 */
    public final List<C0945d> mo7460n0(boolean z) throws MediaCodecUtil.DecoderQueryException {
        List<C0945d> t0 = mo7157t0(this.f5041L, this.f5082o1, z);
        if (t0.isEmpty() && z) {
            t0 = mo7157t0(this.f5041L, this.f5082o1, false);
            if (!t0.isEmpty()) {
                gk3.m18132i("MediaCodecRenderer", "Drm session requires secure decoder for " + this.f5082o1.f4175C + ", but no secure decoder available. Trying to proceed with " + t0 + ".");
            }
        }
        return t0;
    }

    /* renamed from: n1 */
    public final void mo7461n1(long j) throws ExoPlaybackException {
        boolean z;
        C0792h j2 = this.f5062Z.mo23312j(j);
        if (j2 == null && this.f5029A1) {
            j2 = this.f5062Z.mo23311i();
        }
        if (j2 != null) {
            this.f5084p1 = j2;
            z = true;
        } else {
            z = false;
        }
        if (z || (this.f5029A1 && this.f5084p1 != null)) {
            mo7143M0(this.f5084p1, this.f5098z1);
            this.f5029A1 = false;
        }
    }

    /* renamed from: o0 */
    public final C0941c mo7462o0() {
        return this.f5096x1;
    }

    /* renamed from: p0 */
    public final C0945d mo7463p0() {
        return this.f5033E1;
    }

    /* renamed from: q0 */
    public boolean mo7464q0() {
        return false;
    }

    /* renamed from: r */
    public void mo7465r(float f, float f2) throws ExoPlaybackException {
        this.f5094v1 = f;
        this.f5095w1 = f2;
        mo7457l1(this.f5097y1);
    }

    /* renamed from: r0 */
    public abstract float mo7155r0(float f, C0792h hVar, C0792h[] hVarArr);

    /* renamed from: s0 */
    public final MediaFormat mo7466s0() {
        return this.f5098z1;
    }

    /* renamed from: t */
    public final int mo7467t() {
        return 8;
    }

    /* renamed from: t0 */
    public abstract List<C0945d> mo7157t0(C0946e eVar, C0792h hVar, boolean z) throws MediaCodecUtil.DecoderQueryException;

    /* renamed from: u */
    public void mo7468u(long j, long j2) throws ExoPlaybackException {
        boolean z = false;
        if (this.f5080m2) {
            this.f5080m2 = false;
            mo7428Q0();
        }
        ExoPlaybackException exoPlaybackException = this.f5081n2;
        if (exoPlaybackException == null) {
            try {
                if (this.f5078k2) {
                    mo7148W0();
                } else if (this.f5082o1 != null || mo7432T0(2)) {
                    mo7423G0();
                    if (this.f5059X1) {
                        ps6.m25173a("bypassRender");
                        while (mo7429R(j, j2)) {
                        }
                        ps6.m25175c();
                    } else if (this.f5096x1 != null) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        ps6.m25173a("drainAndFeed");
                        while (mo7451h0(j, j2) && mo7448f1(elapsedRealtime)) {
                        }
                        while (mo7454j0() && mo7448f1(elapsedRealtime)) {
                        }
                        ps6.m25175c();
                    } else {
                        this.f5083o2.f15309d += mo21682P(j);
                        mo7432T0(1);
                    }
                    this.f5083o2.mo23488c();
                }
            } catch (IllegalStateException e) {
                if (m6701D0(e)) {
                    mo7136I0(e);
                    if (w67.f19021a >= 21 && m6703F0(e)) {
                        z = true;
                    }
                    if (z) {
                        mo7434V0();
                    }
                    throw mo21701z(mo7441c0(e, mo7463p0()), this.f5082o1, z, PlaybackException.ERROR_CODE_DECODING_FAILED);
                }
                throw e;
            }
        } else {
            this.f5081n2 = null;
            throw exoPlaybackException;
        }
    }

    /* renamed from: u0 */
    public final xb2 mo7469u0(DrmSession drmSession) throws ExoPlaybackException {
        hw0 c = drmSession.mo7321c();
        if (c == null || (c instanceof xb2)) {
            return (xb2) c;
        }
        throw mo21700y(new IllegalArgumentException("Expecting FrameworkCryptoConfig but found: " + c), this.f5082o1, PlaybackException.ERROR_CODE_DRM_SCHEME_UNSUPPORTED);
    }

    /* renamed from: v0 */
    public abstract C0941c.C0942a mo7159v0(C0945d dVar, C0792h hVar, MediaCrypto mediaCrypto, float f);

    /* renamed from: w0 */
    public final long mo7470w0() {
        return this.f5087q2;
    }

    /* renamed from: x0 */
    public float mo7471x0() {
        return this.f5094v1;
    }

    /* renamed from: y0 */
    public void mo7472y0(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
    }

    /* renamed from: z0 */
    public final boolean mo7473z0() {
        if (this.f5053T1 >= 0) {
            return true;
        }
        return false;
    }

    public static class DecoderInitializationException extends Exception {
        public final C0945d codecInfo;
        public final String diagnosticInfo;
        public final DecoderInitializationException fallbackDecoderInitializationException;
        public final String mimeType;
        public final boolean secureDecoderRequired;

        public DecoderInitializationException(C0792h hVar, Throwable th, boolean z, int i) {
            this("Decoder init failed: [" + i + "], " + hVar, th, hVar.f4175C, z, (C0945d) null, m6790a(i), (DecoderInitializationException) null);
        }

        /* renamed from: a */
        public static String m6790a(int i) {
            String str;
            if (i < 0) {
                str = "neg_";
            } else {
                str = "";
            }
            return "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_" + str + Math.abs(i);
        }

        /* renamed from: c */
        public static String m6791c(Throwable th) {
            if (th instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th).getDiagnosticInfo();
            }
            return null;
        }

        /* renamed from: b */
        public final DecoderInitializationException mo7474b(DecoderInitializationException decoderInitializationException) {
            return new DecoderInitializationException(getMessage(), getCause(), this.mimeType, this.secureDecoderRequired, this.codecInfo, this.diagnosticInfo, decoderInitializationException);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public DecoderInitializationException(C0792h hVar, Throwable th, boolean z, C0945d dVar) {
            this("Decoder init failed: " + dVar.f5124a + ", " + hVar, th, hVar.f4175C, z, dVar, w67.f19021a >= 21 ? m6791c(th) : null, (DecoderInitializationException) null);
        }

        public DecoderInitializationException(String str, Throwable th, String str2, boolean z, C0945d dVar, String str3, DecoderInitializationException decoderInitializationException) {
            super(str, th);
            this.mimeType = str2;
            this.secureDecoderRequired = z;
            this.codecInfo = dVar;
            this.diagnosticInfo = str3;
            this.fallbackDecoderInitializationException = decoderInitializationException;
        }
    }
}
