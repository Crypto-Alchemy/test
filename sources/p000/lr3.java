package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent$Builder;
import android.media.metrics.PlaybackErrorEvent$Builder;
import android.media.metrics.PlaybackMetrics$Builder;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent$Builder;
import android.media.metrics.TrackChangeEvent$Builder;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import androidx.media3.common.C0788f;
import androidx.media3.common.C0792h;
import androidx.media3.common.C0798k;
import androidx.media3.common.C0816l;
import androidx.media3.common.C0820n;
import androidx.media3.common.C0821o;
import androidx.media3.common.C0831s;
import androidx.media3.common.C0840v;
import androidx.media3.common.C0842w;
import androidx.media3.common.C0844x;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Metadata;
import androidx.media3.common.ParserException;
import androidx.media3.common.PlaybackException;
import androidx.media3.datasource.FileDataSource;
import androidx.media3.datasource.HttpDataSource$HttpDataSourceException;
import androidx.media3.datasource.HttpDataSource$InvalidContentTypeException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.datasource.UdpDataSource;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import androidx.media3.exoplayer.source.C0973i;
import com.google.common.collect.ImmutableList;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p000.C0020ag;
import p000.bq4;

/* renamed from: lr3 */
/* compiled from: MediaMetricsListener */
public final class lr3 implements C0020ag, bq4.C1643a {

    /* renamed from: A */
    public boolean f14668A;

    /* renamed from: a */
    public final Context f14669a;

    /* renamed from: b */
    public final bq4 f14670b;

    /* renamed from: c */
    public final PlaybackSession f14671c;

    /* renamed from: d */
    public final long f14672d = SystemClock.elapsedRealtime();

    /* renamed from: e */
    public final C0831s.C0835d f14673e = new C0831s.C0835d();

    /* renamed from: f */
    public final C0831s.C0833b f14674f = new C0831s.C0833b();

    /* renamed from: g */
    public final HashMap<String, Long> f14675g = new HashMap<>();

    /* renamed from: h */
    public final HashMap<String, Long> f14676h = new HashMap<>();

    /* renamed from: i */
    public String f14677i;

    /* renamed from: j */
    public PlaybackMetrics$Builder f14678j;

    /* renamed from: k */
    public int f14679k;

    /* renamed from: l */
    public int f14680l = 0;

    /* renamed from: m */
    public int f14681m = 0;

    /* renamed from: n */
    public PlaybackException f14682n;

    /* renamed from: o */
    public C2785b f14683o;

    /* renamed from: p */
    public C2785b f14684p;

    /* renamed from: q */
    public C2785b f14685q;

    /* renamed from: r */
    public C0792h f14686r;

    /* renamed from: s */
    public C0792h f14687s;

    /* renamed from: t */
    public C0792h f14688t;

    /* renamed from: u */
    public boolean f14689u;

    /* renamed from: v */
    public int f14690v;

    /* renamed from: w */
    public boolean f14691w;

    /* renamed from: x */
    public int f14692x;

    /* renamed from: y */
    public int f14693y;

    /* renamed from: z */
    public int f14694z;

    /* renamed from: lr3$a */
    /* compiled from: MediaMetricsListener */
    public static final class C2784a {

        /* renamed from: a */
        public final int f14695a;

        /* renamed from: b */
        public final int f14696b;

        public C2784a(int i, int i2) {
            this.f14695a = i;
            this.f14696b = i2;
        }
    }

    /* renamed from: lr3$b */
    /* compiled from: MediaMetricsListener */
    public static final class C2785b {

        /* renamed from: a */
        public final C0792h f14697a;

        /* renamed from: b */
        public final int f14698b;

        /* renamed from: c */
        public final String f14699c;

        public C2785b(C0792h hVar, int i, String str) {
            this.f14697a = hVar;
            this.f14698b = i;
            this.f14699c = str;
        }
    }

    public lr3(Context context, PlaybackSession playbackSession) {
        this.f14669a = context.getApplicationContext();
        this.f14671c = playbackSession;
        k91 k91 = new k91();
        this.f14670b = k91;
        k91.mo11778g(this);
    }

    /* renamed from: A0 */
    public static lr3 m21725A0(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new lr3(context, mediaMetricsManager.createPlaybackSession());
    }

    @SuppressLint({"SwitchIntDef"})
    /* renamed from: C0 */
    public static int m21726C0(int i) {
        switch (w67.m29328R(i)) {
            case PlaybackException.ERROR_CODE_DRM_PROVISIONING_FAILED:
                return 24;
            case PlaybackException.ERROR_CODE_DRM_CONTENT_ERROR:
                return 28;
            case PlaybackException.ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED:
                return 25;
            case PlaybackException.ERROR_CODE_DRM_DISALLOWED_OPERATION:
                return 26;
            default:
                return 27;
        }
    }

    /* renamed from: D0 */
    public static DrmInitData m21727D0(ImmutableList<C0842w.C0843a> immutableList) {
        DrmInitData drmInitData;
        c47<C0842w.C0843a> it = immutableList.iterator();
        while (it.hasNext()) {
            C0842w.C0843a next = it.next();
            int i = 0;
            while (true) {
                if (i < next.f4549a) {
                    if (next.mo6958g(i) && (drmInitData = next.mo6953c(i).f4178L) != null) {
                        return drmInitData;
                    }
                    i++;
                }
            }
        }
        return null;
    }

    /* renamed from: E0 */
    public static int m21728E0(DrmInitData drmInitData) {
        for (int i = 0; i < drmInitData.f4114g; i++) {
            UUID uuid = drmInitData.mo6522e(i).f4116d;
            if (uuid.equals(l70.f14426d)) {
                return 3;
            }
            if (uuid.equals(l70.f14427e)) {
                return 2;
            }
            if (uuid.equals(l70.f14425c)) {
                return 6;
            }
        }
        return 1;
    }

    /* renamed from: F0 */
    public static C2784a m21729F0(PlaybackException playbackException, Context context, boolean z) {
        boolean z2;
        int i;
        int i2;
        if (playbackException.errorCode == 1001) {
            return new C2784a(20, 0);
        }
        if (playbackException instanceof ExoPlaybackException) {
            ExoPlaybackException exoPlaybackException = (ExoPlaybackException) playbackException;
            if (exoPlaybackException.type == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            i = exoPlaybackException.rendererFormatSupport;
        } else {
            i = 0;
            z2 = false;
        }
        Throwable th = (Throwable) C2725kr.m20985e(playbackException.getCause());
        if (th instanceof IOException) {
            if (th instanceof HttpDataSource$InvalidResponseCodeException) {
                return new C2784a(5, ((HttpDataSource$InvalidResponseCodeException) th).responseCode);
            }
            if ((th instanceof HttpDataSource$InvalidContentTypeException) || (th instanceof ParserException)) {
                if (z) {
                    i2 = 10;
                } else {
                    i2 = 11;
                }
                return new C2784a(i2, 0);
            } else if ((th instanceof HttpDataSource$HttpDataSourceException) || (th instanceof UdpDataSource.UdpDataSourceException)) {
                if (x54.m29901d(context).mo27673f() == 1) {
                    return new C2784a(3, 0);
                }
                Throwable cause = th.getCause();
                if (cause instanceof UnknownHostException) {
                    return new C2784a(6, 0);
                }
                if (cause instanceof SocketTimeoutException) {
                    return new C2784a(7, 0);
                }
                if (!(th instanceof HttpDataSource$HttpDataSourceException) || ((HttpDataSource$HttpDataSourceException) th).type != 1) {
                    return new C2784a(8, 0);
                }
                return new C2784a(4, 0);
            } else if (playbackException.errorCode == 1002) {
                return new C2784a(21, 0);
            } else {
                if (th instanceof DrmSession.DrmSessionException) {
                    Throwable th2 = (Throwable) C2725kr.m20985e(th.getCause());
                    int i3 = w67.f19021a;
                    if (i3 >= 21 && (th2 instanceof MediaDrm.MediaDrmStateException)) {
                        int S = w67.m29330S(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo());
                        return new C2784a(m21726C0(S), S);
                    } else if (i3 >= 23 && (th2 instanceof MediaDrmResetException)) {
                        return new C2784a(27, 0);
                    } else {
                        if (i3 >= 18 && (th2 instanceof NotProvisionedException)) {
                            return new C2784a(24, 0);
                        }
                        if (i3 >= 18 && (th2 instanceof DeniedByServerException)) {
                            return new C2784a(29, 0);
                        }
                        if (th2 instanceof UnsupportedDrmException) {
                            return new C2784a(23, 0);
                        }
                        if (th2 instanceof DefaultDrmSessionManager.MissingSchemeDataException) {
                            return new C2784a(28, 0);
                        }
                        return new C2784a(30, 0);
                    }
                } else if (!(th instanceof FileDataSource.FileDataSourceException) || !(th.getCause() instanceof FileNotFoundException)) {
                    return new C2784a(9, 0);
                } else {
                    Throwable cause2 = ((Throwable) C2725kr.m20985e(th.getCause())).getCause();
                    if (w67.f19021a < 21 || !(cause2 instanceof ErrnoException) || ((ErrnoException) cause2).errno != OsConstants.EACCES) {
                        return new C2784a(31, 0);
                    }
                    return new C2784a(32, 0);
                }
            }
        } else if (z2 && (i == 0 || i == 1)) {
            return new C2784a(35, 0);
        } else {
            if (z2 && i == 3) {
                return new C2784a(15, 0);
            }
            if (z2 && i == 2) {
                return new C2784a(23, 0);
            }
            if (th instanceof MediaCodecRenderer.DecoderInitializationException) {
                return new C2784a(13, w67.m29330S(((MediaCodecRenderer.DecoderInitializationException) th).diagnosticInfo));
            }
            if (th instanceof MediaCodecDecoderException) {
                return new C2784a(14, w67.m29330S(((MediaCodecDecoderException) th).diagnosticInfo));
            }
            if (th instanceof OutOfMemoryError) {
                return new C2784a(14, 0);
            }
            if (th instanceof AudioSink.InitializationException) {
                return new C2784a(17, ((AudioSink.InitializationException) th).audioTrackState);
            }
            if (th instanceof AudioSink.WriteException) {
                return new C2784a(18, ((AudioSink.WriteException) th).errorCode);
            }
            if (w67.f19021a < 16 || !(th instanceof MediaCodec.CryptoException)) {
                return new C2784a(22, 0);
            }
            int errorCode = ((MediaCodec.CryptoException) th).getErrorCode();
            return new C2784a(m21726C0(errorCode), errorCode);
        }
    }

    /* renamed from: G0 */
    public static Pair<String, String> m21730G0(String str) {
        String str2;
        String[] L0 = w67.m29317L0(str, "-");
        String str3 = L0[0];
        if (L0.length >= 2) {
            str2 = L0[1];
        } else {
            str2 = null;
        }
        return Pair.create(str3, str2);
    }

    /* renamed from: I0 */
    public static int m21731I0(Context context) {
        switch (x54.m29901d(context).mo27673f()) {
            case 0:
                return 0;
            case 1:
                return 9;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 7:
                return 3;
            case 9:
                return 8;
            case 10:
                return 7;
            default:
                return 1;
        }
    }

    /* renamed from: J0 */
    public static int m21732J0(C0798k kVar) {
        C0798k.C0809h hVar = kVar.f4244d;
        if (hVar == null) {
            return 0;
        }
        int m0 = w67.m29367m0(hVar.f4307a, hVar.f4308b);
        if (m0 == 0) {
            return 3;
        }
        if (m0 == 1) {
            return 5;
        }
        if (m0 != 2) {
            return 1;
        }
        return 4;
    }

    /* renamed from: K0 */
    public static int m21733K0(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 1 : 4;
        }
        return 3;
    }

    /* renamed from: A */
    public /* synthetic */ void mo223A(C0020ag.C0021a aVar, int i, n31 n31) {
        C3725zf.m31208p(this, aVar, i, n31);
    }

    /* renamed from: B */
    public /* synthetic */ void mo224B(C0020ag.C0021a aVar, hx0 hx0) {
        C3725zf.m31204m(this, aVar, hx0);
    }

    /* renamed from: B0 */
    public final void mo22936B0() {
        long j;
        long j2;
        int i;
        PlaybackMetrics$Builder playbackMetrics$Builder = this.f14678j;
        if (playbackMetrics$Builder != null && this.f14668A) {
            playbackMetrics$Builder.setAudioUnderrunCount(this.f14694z);
            this.f14678j.setVideoFramesDropped(this.f14692x);
            this.f14678j.setVideoFramesPlayed(this.f14693y);
            Long l = this.f14675g.get(this.f14677i);
            PlaybackMetrics$Builder playbackMetrics$Builder2 = this.f14678j;
            if (l == null) {
                j = 0;
            } else {
                j = l.longValue();
            }
            playbackMetrics$Builder2.setNetworkTransferDurationMillis(j);
            Long l2 = this.f14676h.get(this.f14677i);
            PlaybackMetrics$Builder playbackMetrics$Builder3 = this.f14678j;
            if (l2 == null) {
                j2 = 0;
            } else {
                j2 = l2.longValue();
            }
            playbackMetrics$Builder3.setNetworkBytesRead(j2);
            PlaybackMetrics$Builder playbackMetrics$Builder4 = this.f14678j;
            if (l2 == null || l2.longValue() <= 0) {
                i = 0;
            } else {
                i = 1;
            }
            playbackMetrics$Builder4.setStreamSource(i);
            this.f14671c.reportPlaybackMetrics(this.f14678j.build());
        }
        this.f14678j = null;
        this.f14677i = null;
        this.f14694z = 0;
        this.f14692x = 0;
        this.f14693y = 0;
        this.f14686r = null;
        this.f14687s = null;
        this.f14688t = null;
        this.f14668A = false;
    }

    /* renamed from: C */
    public /* synthetic */ void mo225C(C0020ag.C0021a aVar, vi3 vi3, jr3 jr3) {
        C3725zf.m31158E(this, aVar, vi3, jr3);
    }

    /* renamed from: D */
    public /* synthetic */ void mo226D(C0020ag.C0021a aVar, int i) {
        C3725zf.m31172S(this, aVar, i);
    }

    /* renamed from: E */
    public /* synthetic */ void mo227E(C0020ag.C0021a aVar, String str, long j) {
        C3725zf.m31191f0(this, aVar, str, j);
    }

    /* renamed from: F */
    public void mo228F(C0020ag.C0021a aVar, C0844x xVar) {
        C2785b bVar = this.f14683o;
        if (bVar != null) {
            C0792h hVar = bVar.f14697a;
            if (hVar.f4181Q == -1) {
                this.f14683o = new C2785b(hVar.mo6636b().mo6675j0(xVar.f4556a).mo6656Q(xVar.f4557d).mo6644E(), bVar.f14698b, bVar.f14699c);
            }
        }
    }

    /* renamed from: G */
    public /* synthetic */ void mo229G(C0020ag.C0021a aVar, boolean z) {
        C3725zf.m31177X(this, aVar, z);
    }

    /* renamed from: H */
    public void mo11779H(C0020ag.C0021a aVar, String str) {
    }

    /* renamed from: H0 */
    public LogSessionId mo22937H0() {
        return this.f14671c.getSessionId();
    }

    /* renamed from: I */
    public /* synthetic */ void mo230I(C0020ag.C0021a aVar) {
        C3725zf.m31214v(this, aVar);
    }

    /* renamed from: J */
    public /* synthetic */ void mo231J(C0020ag.C0021a aVar, String str) {
        C3725zf.m31186d(this, aVar, str);
    }

    /* renamed from: K */
    public void mo11780K(C0020ag.C0021a aVar, String str, boolean z) {
        C0973i.C0975b bVar = aVar.f118d;
        if ((bVar == null || !bVar.mo23781b()) && str.equals(this.f14677i)) {
            mo22936B0();
        }
        this.f14675g.remove(str);
        this.f14676h.remove(str);
    }

    /* renamed from: L */
    public /* synthetic */ void mo232L(C0020ag.C0021a aVar, int i) {
        C3725zf.m31167N(this, aVar, i);
    }

    /* renamed from: L0 */
    public final void mo22938L0(C0020ag.C0022b bVar) {
        for (int i = 0; i < bVar.mo301d(); i++) {
            int b = bVar.mo299b(i);
            C0020ag.C0021a c = bVar.mo300c(b);
            if (b == 0) {
                this.f14670b.mo11774c(c);
            } else if (b == 11) {
                this.f14670b.mo11776e(c, this.f14679k);
            } else {
                this.f14670b.mo11775d(c);
            }
        }
    }

    /* renamed from: M */
    public /* synthetic */ void mo233M(C0020ag.C0021a aVar, C0820n nVar) {
        C3725zf.m31166M(this, aVar, nVar);
    }

    /* renamed from: M0 */
    public final void mo22939M0(long j) {
        int I0 = m21731I0(this.f14669a);
        if (I0 != this.f14681m) {
            this.f14681m = I0;
            this.f14671c.reportNetworkEvent(new NetworkEvent$Builder().setNetworkType(I0).setTimeSinceCreatedMillis(j - this.f14672d).build());
        }
    }

    /* renamed from: N */
    public /* synthetic */ void mo234N(C0020ag.C0021a aVar, C0792h hVar, p31 p31) {
        C3725zf.m31194h(this, aVar, hVar, p31);
    }

    /* renamed from: N0 */
    public final void mo22940N0(long j) {
        boolean z;
        PlaybackException playbackException = this.f14682n;
        if (playbackException != null) {
            Context context = this.f14669a;
            if (this.f14690v == 4) {
                z = true;
            } else {
                z = false;
            }
            C2784a F0 = m21729F0(playbackException, context, z);
            this.f14671c.reportPlaybackErrorEvent(new PlaybackErrorEvent$Builder().setTimeSinceCreatedMillis(j - this.f14672d).setErrorCode(F0.f14695a).setSubErrorCode(F0.f14696b).setException(playbackException).build());
            this.f14668A = true;
            this.f14682n = null;
        }
    }

    /* renamed from: O */
    public /* synthetic */ void mo235O(C0020ag.C0021a aVar) {
        C3725zf.m31216x(this, aVar);
    }

    /* renamed from: O0 */
    public final void mo22941O0(C0821o oVar, C0020ag.C0022b bVar, long j) {
        if (oVar.mo6686P() != 2) {
            this.f14689u = false;
        }
        if (oVar.mo6705l() == null) {
            this.f14691w = false;
        } else if (bVar.mo298a(10)) {
            this.f14691w = true;
        }
        int W0 = mo22949W0(oVar);
        if (this.f14680l != W0) {
            this.f14680l = W0;
            this.f14668A = true;
            this.f14671c.reportPlaybackStateEvent(new PlaybackStateEvent$Builder().setState(this.f14680l).setTimeSinceCreatedMillis(j - this.f14672d).build());
        }
    }

    /* renamed from: P */
    public /* synthetic */ void mo236P(C0020ag.C0021a aVar) {
        C3725zf.m31176W(this, aVar);
    }

    /* renamed from: P0 */
    public final void mo22942P0(C0821o oVar, C0020ag.C0022b bVar, long j) {
        if (bVar.mo298a(2)) {
            C0842w o = oVar.mo6706o();
            boolean d = o.mo6949d(2);
            boolean d2 = o.mo6949d(1);
            boolean d3 = o.mo6949d(3);
            if (d || d2 || d3) {
                if (!d) {
                    mo22947U0(j, (C0792h) null, 0);
                }
                if (!d2) {
                    mo22943Q0(j, (C0792h) null, 0);
                }
                if (!d3) {
                    mo22945S0(j, (C0792h) null, 0);
                }
            }
        }
        if (mo22950z0(this.f14683o)) {
            C2785b bVar2 = this.f14683o;
            C0792h hVar = bVar2.f14697a;
            if (hVar.f4181Q != -1) {
                mo22947U0(j, hVar, bVar2.f14698b);
                this.f14683o = null;
            }
        }
        if (mo22950z0(this.f14684p)) {
            C2785b bVar3 = this.f14684p;
            mo22943Q0(j, bVar3.f14697a, bVar3.f14698b);
            this.f14684p = null;
        }
        if (mo22950z0(this.f14685q)) {
            C2785b bVar4 = this.f14685q;
            mo22945S0(j, bVar4.f14697a, bVar4.f14698b);
            this.f14685q = null;
        }
    }

    /* renamed from: Q */
    public /* synthetic */ void mo237Q(C0020ag.C0021a aVar, C0792h hVar, p31 p31) {
        C3725zf.m31203l0(this, aVar, hVar, p31);
    }

    /* renamed from: Q0 */
    public final void mo22943Q0(long j, C0792h hVar, int i) {
        if (!w67.m29346c(this.f14687s, hVar)) {
            if (this.f14687s == null && i == 0) {
                i = 1;
            }
            this.f14687s = hVar;
            mo22948V0(0, j, hVar, i);
        }
    }

    /* renamed from: R */
    public /* synthetic */ void mo238R(C0020ag.C0021a aVar, C0788f fVar) {
        C3725zf.m31211s(this, aVar, fVar);
    }

    /* renamed from: R0 */
    public final void mo22944R0(C0821o oVar, C0020ag.C0022b bVar) {
        DrmInitData D0;
        if (bVar.mo298a(0)) {
            C0020ag.C0021a c = bVar.mo300c(0);
            if (this.f14678j != null) {
                mo22946T0(c.f116b, c.f118d);
            }
        }
        if (!(!bVar.mo298a(2) || this.f14678j == null || (D0 = m21727D0(oVar.mo6706o().mo6947b())) == null)) {
            ((PlaybackMetrics$Builder) w67.m29360j(this.f14678j)).setDrmType(m21728E0(D0));
        }
        if (bVar.mo298a(1011)) {
            this.f14694z++;
        }
    }

    /* renamed from: S */
    public /* synthetic */ void mo239S(C0020ag.C0021a aVar, String str, long j, long j2) {
        C3725zf.m31184c(this, aVar, str, j, j2);
    }

    /* renamed from: S0 */
    public final void mo22945S0(long j, C0792h hVar, int i) {
        if (!w67.m29346c(this.f14688t, hVar)) {
            if (this.f14688t == null && i == 0) {
                i = 1;
            }
            this.f14688t = hVar;
            mo22948V0(2, j, hVar, i);
        }
    }

    /* renamed from: T */
    public /* synthetic */ void mo240T(C0020ag.C0021a aVar, int i) {
        C3725zf.m31174U(this, aVar, i);
    }

    @RequiresNonNull({"metricsBuilder"})
    /* renamed from: T0 */
    public final void mo22946T0(C0831s sVar, C0973i.C0975b bVar) {
        int f;
        int i;
        PlaybackMetrics$Builder playbackMetrics$Builder = this.f14678j;
        if (bVar != null && (f = sVar.mo6867f(bVar.f15659a)) != -1) {
            sVar.mo6872j(f, this.f14674f);
            sVar.mo6880r(this.f14674f.f4438e, this.f14673e);
            playbackMetrics$Builder.setStreamType(m21732J0(this.f14673e.f4461e));
            C0831s.C0835d dVar = this.f14673e;
            if (dVar.f4455I != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED && !dVar.f4453C && !dVar.f4467y && !dVar.mo6914i()) {
                playbackMetrics$Builder.setMediaDurationMillis(this.f14673e.mo6911g());
            }
            if (this.f14673e.mo6914i()) {
                i = 2;
            } else {
                i = 1;
            }
            playbackMetrics$Builder.setPlaybackType(i);
            this.f14668A = true;
        }
    }

    /* renamed from: U */
    public /* synthetic */ void mo241U(C0020ag.C0021a aVar, C0798k kVar, int i) {
        C3725zf.m31162I(this, aVar, kVar, i);
    }

    /* renamed from: U0 */
    public final void mo22947U0(long j, C0792h hVar, int i) {
        if (!w67.m29346c(this.f14686r, hVar)) {
            if (this.f14686r == null && i == 0) {
                i = 1;
            }
            this.f14686r = hVar;
            mo22948V0(1, j, hVar, i);
        }
    }

    /* renamed from: V */
    public /* synthetic */ void mo242V(C0020ag.C0021a aVar, C0840v vVar) {
        C3725zf.m31183b0(this, aVar, vVar);
    }

    /* renamed from: V0 */
    public final void mo22948V0(int i, long j, C0792h hVar, int i2) {
        TrackChangeEvent$Builder timeSinceCreatedMillis = new TrackChangeEvent$Builder(i).setTimeSinceCreatedMillis(j - this.f14672d);
        if (hVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(m21733K0(i2));
            String str = hVar.f4174B;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = hVar.f4175C;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = hVar.f4204y;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i3 = hVar.f4203x;
            if (i3 != -1) {
                timeSinceCreatedMillis.setBitrate(i3);
            }
            int i4 = hVar.f4180P;
            if (i4 != -1) {
                timeSinceCreatedMillis.setWidth(i4);
            }
            int i5 = hVar.f4181Q;
            if (i5 != -1) {
                timeSinceCreatedMillis.setHeight(i5);
            }
            int i6 = hVar.f4202v0;
            if (i6 != -1) {
                timeSinceCreatedMillis.setChannelCount(i6);
            }
            int i7 = hVar.f4187b1;
            if (i7 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i7);
            }
            String str4 = hVar.f4189e;
            if (str4 != null) {
                Pair<String, String> G0 = m21730G0(str4);
                timeSinceCreatedMillis.setLanguage((String) G0.first);
                Object obj = G0.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = hVar.f4182U;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f14668A = true;
        this.f14671c.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    /* renamed from: W */
    public /* synthetic */ void mo243W(C0020ag.C0021a aVar, Exception exc) {
        C3725zf.m31189e0(this, aVar, exc);
    }

    /* renamed from: W0 */
    public final int mo22949W0(C0821o oVar) {
        int P = oVar.mo6686P();
        if (this.f14689u) {
            return 5;
        }
        if (this.f14691w) {
            return 13;
        }
        if (P == 4) {
            return 11;
        }
        if (P == 2) {
            int i = this.f14680l;
            if (i == 0 || i == 2) {
                return 2;
            }
            if (!oVar.mo6678E()) {
                return 7;
            }
            if (oVar.mo6711w() != 0) {
                return 10;
            }
            return 6;
        } else if (P == 3) {
            if (!oVar.mo6678E()) {
                return 4;
            }
            if (oVar.mo6711w() != 0) {
                return 9;
            }
            return 3;
        } else if (P != 1 || this.f14680l == 0) {
            return this.f14680l;
        } else {
            return 12;
        }
    }

    /* renamed from: X */
    public /* synthetic */ void mo244X(C0020ag.C0021a aVar, C0816l lVar) {
        C3725zf.m31163J(this, aVar, lVar);
    }

    /* renamed from: Y */
    public /* synthetic */ void mo245Y(C0020ag.C0021a aVar, int i) {
        C3725zf.m31181a0(this, aVar, i);
    }

    /* renamed from: Z */
    public /* synthetic */ void mo246Z(C0020ag.C0021a aVar, String str, long j, long j2) {
        C3725zf.m31193g0(this, aVar, str, j, j2);
    }

    /* renamed from: a */
    public /* synthetic */ void mo247a(C0020ag.C0021a aVar, Metadata metadata) {
        C3725zf.m31164K(this, aVar, metadata);
    }

    /* renamed from: a0 */
    public /* synthetic */ void mo248a0(C0020ag.C0021a aVar, n31 n31) {
        C3725zf.m31190f(this, aVar, n31);
    }

    /* renamed from: b */
    public /* synthetic */ void mo249b(C0020ag.C0021a aVar) {
        C3725zf.m31213u(this, aVar);
    }

    /* renamed from: b0 */
    public /* synthetic */ void mo250b0(C0020ag.C0021a aVar, boolean z, int i) {
        C3725zf.m31171R(this, aVar, z, i);
    }

    /* renamed from: c */
    public /* synthetic */ void mo251c(C0020ag.C0021a aVar, boolean z) {
        C3725zf.m31157D(this, aVar, z);
    }

    /* renamed from: c0 */
    public /* synthetic */ void mo252c0(C0020ag.C0021a aVar) {
        C3725zf.m31175V(this, aVar);
    }

    /* renamed from: d */
    public /* synthetic */ void mo253d(C0020ag.C0021a aVar, Exception exc) {
        C3725zf.m31180a(this, aVar, exc);
    }

    /* renamed from: d0 */
    public void mo254d0(C0821o oVar, C0020ag.C0022b bVar) {
        if (bVar.mo301d() != 0) {
            mo22938L0(bVar);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            mo22944R0(oVar, bVar);
            mo22940N0(elapsedRealtime);
            mo22942P0(oVar, bVar, elapsedRealtime);
            mo22939M0(elapsedRealtime);
            mo22941O0(oVar, bVar, elapsedRealtime);
            if (bVar.mo298a(1028)) {
                this.f14670b.mo11777f(bVar.mo300c(1028));
            }
        }
    }

    /* renamed from: e */
    public /* synthetic */ void mo255e(C0020ag.C0021a aVar, C0821o.C0823b bVar) {
        C3725zf.m31202l(this, aVar, bVar);
    }

    /* renamed from: e0 */
    public /* synthetic */ void mo256e0(C0020ag.C0021a aVar, String str) {
        C3725zf.m31195h0(this, aVar, str);
    }

    /* renamed from: f */
    public /* synthetic */ void mo257f(C0020ag.C0021a aVar, Exception exc) {
        C3725zf.m31198j(this, aVar, exc);
    }

    /* renamed from: f0 */
    public /* synthetic */ void mo258f0(C0020ag.C0021a aVar, String str, long j) {
        C3725zf.m31182b(this, aVar, str, j);
    }

    /* renamed from: g */
    public /* synthetic */ void mo259g(C0020ag.C0021a aVar, int i, n31 n31) {
        C3725zf.m31207o(this, aVar, i, n31);
    }

    /* renamed from: g0 */
    public /* synthetic */ void mo260g0(C0020ag.C0021a aVar, n31 n31) {
        C3725zf.m31197i0(this, aVar, n31);
    }

    /* renamed from: h */
    public /* synthetic */ void mo261h(C0020ag.C0021a aVar, List list) {
        C3725zf.m31206n(this, aVar, list);
    }

    /* renamed from: h0 */
    public /* synthetic */ void mo262h0(C0020ag.C0021a aVar, int i) {
        C3725zf.m31217y(this, aVar, i);
    }

    /* renamed from: i */
    public /* synthetic */ void mo263i(C0020ag.C0021a aVar, boolean z) {
        C3725zf.m31178Y(this, aVar, z);
    }

    /* renamed from: i0 */
    public /* synthetic */ void mo264i0(C0020ag.C0021a aVar, vi3 vi3, jr3 jr3) {
        C3725zf.m31159F(this, aVar, vi3, jr3);
    }

    /* renamed from: j */
    public void mo265j(C0020ag.C0021a aVar, vi3 vi3, jr3 jr3, IOException iOException, boolean z) {
        this.f14690v = jr3.f13827a;
    }

    /* renamed from: j0 */
    public /* synthetic */ void mo266j0(C0020ag.C0021a aVar, int i, long j, long j2) {
        C3725zf.m31200k(this, aVar, i, j, j2);
    }

    /* renamed from: k */
    public /* synthetic */ void mo267k(C0020ag.C0021a aVar, long j, int i) {
        C3725zf.m31199j0(this, aVar, j, i);
    }

    /* renamed from: k0 */
    public void mo268k0(C0020ag.C0021a aVar, int i, long j, long j2) {
        long j3;
        C0973i.C0975b bVar = aVar.f118d;
        if (bVar != null) {
            String b = this.f14670b.mo11773b(aVar.f116b, (C0973i.C0975b) C2725kr.m20985e(bVar));
            Long l = this.f14676h.get(b);
            Long l2 = this.f14675g.get(b);
            HashMap<String, Long> hashMap = this.f14676h;
            long j4 = 0;
            if (l == null) {
                j3 = 0;
            } else {
                j3 = l.longValue();
            }
            hashMap.put(b, Long.valueOf(j3 + j));
            HashMap<String, Long> hashMap2 = this.f14675g;
            if (l2 != null) {
                j4 = l2.longValue();
            }
            hashMap2.put(b, Long.valueOf(j4 + ((long) i)));
        }
    }

    /* renamed from: l */
    public /* synthetic */ void mo269l(C0020ag.C0021a aVar, long j) {
        C3725zf.m31196i(this, aVar, j);
    }

    /* renamed from: l0 */
    public void mo270l0(C0020ag.C0021a aVar, jr3 jr3) {
        if (aVar.f118d != null) {
            C2785b bVar = new C2785b((C0792h) C2725kr.m20985e(jr3.f13829c), jr3.f13830d, this.f14670b.mo11773b(aVar.f116b, (C0973i.C0975b) C2725kr.m20985e(aVar.f118d)));
            int i = jr3.f13828b;
            if (i != 0) {
                if (i == 1) {
                    this.f14684p = bVar;
                    return;
                } else if (i != 2) {
                    if (i == 3) {
                        this.f14685q = bVar;
                        return;
                    }
                    return;
                }
            }
            this.f14683o = bVar;
        }
    }

    /* renamed from: m */
    public /* synthetic */ void mo271m(C0020ag.C0021a aVar, vi3 vi3, jr3 jr3) {
        C3725zf.m31160G(this, aVar, vi3, jr3);
    }

    /* renamed from: m0 */
    public /* synthetic */ void mo272m0(C0020ag.C0021a aVar, int i, boolean z) {
        C3725zf.m31212t(this, aVar, i, z);
    }

    /* renamed from: n */
    public /* synthetic */ void mo273n(C0020ag.C0021a aVar) {
        C3725zf.m31170Q(this, aVar);
    }

    /* renamed from: n0 */
    public /* synthetic */ void mo274n0(C0020ag.C0021a aVar, PlaybackException playbackException) {
        C3725zf.m31169P(this, aVar, playbackException);
    }

    /* renamed from: o */
    public /* synthetic */ void mo275o(C0020ag.C0021a aVar, jr3 jr3) {
        C3725zf.m31187d0(this, aVar, jr3);
    }

    /* renamed from: o0 */
    public /* synthetic */ void mo276o0(C0020ag.C0021a aVar) {
        C3725zf.m31154A(this, aVar);
    }

    /* renamed from: p */
    public /* synthetic */ void mo277p(C0020ag.C0021a aVar, int i, int i2) {
        C3725zf.m31179Z(this, aVar, i, i2);
    }

    /* renamed from: p0 */
    public /* synthetic */ void mo278p0(C0020ag.C0021a aVar, int i, long j) {
        C3725zf.m31155B(this, aVar, i, j);
    }

    /* renamed from: q */
    public void mo11781q(C0020ag.C0021a aVar, String str) {
        C0973i.C0975b bVar = aVar.f118d;
        if (bVar == null || !bVar.mo23781b()) {
            mo22936B0();
            this.f14677i = str;
            this.f14678j = new PlaybackMetrics$Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.0.0-beta02");
            mo22946T0(aVar.f116b, aVar.f118d);
        }
    }

    /* renamed from: q0 */
    public /* synthetic */ void mo279q0(C0020ag.C0021a aVar, boolean z) {
        C3725zf.m31156C(this, aVar, z);
    }

    /* renamed from: r */
    public /* synthetic */ void mo280r(C0020ag.C0021a aVar, C0842w wVar) {
        C3725zf.m31185c0(this, aVar, wVar);
    }

    /* renamed from: r0 */
    public /* synthetic */ void mo281r0(C0020ag.C0021a aVar, boolean z, int i) {
        C3725zf.m31165L(this, aVar, z, i);
    }

    /* renamed from: s */
    public /* synthetic */ void mo282s(C0020ag.C0021a aVar, int i, int i2, int i3, float f) {
        C3725zf.m31205m0(this, aVar, i, i2, i3, f);
    }

    /* renamed from: s0 */
    public /* synthetic */ void mo283s0(C0020ag.C0021a aVar, C0792h hVar) {
        C3725zf.m31192g(this, aVar, hVar);
    }

    /* renamed from: t */
    public /* synthetic */ void mo284t(C0020ag.C0021a aVar, int i, String str, long j) {
        C3725zf.m31209q(this, aVar, i, str, j);
    }

    /* renamed from: t0 */
    public /* synthetic */ void mo285t0(C0020ag.C0021a aVar, n31 n31) {
        C3725zf.m31188e(this, aVar, n31);
    }

    /* renamed from: u */
    public /* synthetic */ void mo286u(C0020ag.C0021a aVar, Object obj, long j) {
        C3725zf.m31173T(this, aVar, obj, j);
    }

    /* renamed from: u0 */
    public /* synthetic */ void mo287u0(C0020ag.C0021a aVar, Exception exc) {
        C3725zf.m31218z(this, aVar, exc);
    }

    /* renamed from: v */
    public void mo11782v(C0020ag.C0021a aVar, String str, String str2) {
    }

    /* renamed from: v0 */
    public /* synthetic */ void mo288v0(C0020ag.C0021a aVar, boolean z) {
        C3725zf.m31161H(this, aVar, z);
    }

    /* renamed from: w */
    public /* synthetic */ void mo289w(C0020ag.C0021a aVar, C0792h hVar) {
        C3725zf.m31201k0(this, aVar, hVar);
    }

    /* renamed from: w0 */
    public void mo290w0(C0020ag.C0021a aVar, C0821o.C0827e eVar, C0821o.C0827e eVar2, int i) {
        if (i == 1) {
            this.f14689u = true;
        }
        this.f14679k = i;
    }

    /* renamed from: x */
    public /* synthetic */ void mo291x(C0020ag.C0021a aVar, int i, C0792h hVar) {
        C3725zf.m31210r(this, aVar, i, hVar);
    }

    /* renamed from: x0 */
    public /* synthetic */ void mo292x0(C0020ag.C0021a aVar, int i) {
        C3725zf.m31168O(this, aVar, i);
    }

    /* renamed from: y */
    public void mo293y(C0020ag.C0021a aVar, PlaybackException playbackException) {
        this.f14682n = playbackException;
    }

    /* renamed from: y0 */
    public /* synthetic */ void mo294y0(C0020ag.C0021a aVar) {
        C3725zf.m31215w(this, aVar);
    }

    /* renamed from: z */
    public void mo295z(C0020ag.C0021a aVar, n31 n31) {
        this.f14692x += n31.f15312g;
        this.f14693y += n31.f15310e;
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = true)
    /* renamed from: z0 */
    public final boolean mo22950z0(C2785b bVar) {
        if (bVar == null || !bVar.f14699c.equals(this.f14670b.mo11772a())) {
            return false;
        }
        return true;
    }
}
