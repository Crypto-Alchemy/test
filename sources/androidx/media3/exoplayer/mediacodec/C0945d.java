package androidx.media3.exoplayer.mediacodec;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.media3.common.C0792h;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.recyclerview.widget.RecyclerView;
import okhttp3.internal.http2.Http2;

/* renamed from: androidx.media3.exoplayer.mediacodec.d */
/* compiled from: MediaCodecInfo */
public final class C0945d {

    /* renamed from: a */
    public final String f5124a;

    /* renamed from: b */
    public final String f5125b;

    /* renamed from: c */
    public final String f5126c;

    /* renamed from: d */
    public final MediaCodecInfo.CodecCapabilities f5127d;

    /* renamed from: e */
    public final boolean f5128e;

    /* renamed from: f */
    public final boolean f5129f;

    /* renamed from: g */
    public final boolean f5130g;

    /* renamed from: h */
    public final boolean f5131h;

    /* renamed from: i */
    public final boolean f5132i;

    /* renamed from: j */
    public final boolean f5133j;

    /* renamed from: k */
    public final boolean f5134k;

    public C0945d(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f5124a = (String) C2725kr.m20985e(str);
        this.f5125b = str2;
        this.f5126c = str3;
        this.f5127d = codecCapabilities;
        this.f5131h = z;
        this.f5132i = z2;
        this.f5133j = z3;
        this.f5128e = z4;
        this.f5129f = z5;
        this.f5130g = z6;
        this.f5134k = vv3.m29143q(str2);
    }

    /* renamed from: A */
    public static boolean m6906A(String str, int i) {
        if ("video/hevc".equals(str) && 2 == i) {
            String str2 = w67.f19022b;
            if ("sailfish".equals(str2) || "marlin".equals(str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: B */
    public static final boolean m6907B(String str) {
        if (!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(w67.f19022b)) {
            return true;
        }
        return false;
    }

    /* renamed from: C */
    public static C0945d m6908C(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        boolean z7;
        boolean z8;
        if (z4 || codecCapabilities == null || !m6913h(codecCapabilities) || m6921z(str)) {
            z6 = false;
        } else {
            z6 = true;
        }
        if (codecCapabilities == null || !m6917s(codecCapabilities)) {
            z7 = false;
        } else {
            z7 = true;
        }
        if (z5 || (codecCapabilities != null && m6915q(codecCapabilities))) {
            z8 = true;
        } else {
            z8 = false;
        }
        return new C0945d(str, str2, str3, codecCapabilities, z, z2, z3, z6, z7, z8);
    }

    /* renamed from: a */
    public static int m6909a(String str, String str2, int i) {
        int i2;
        if (i > 1 || ((w67.f19021a >= 26 && i > 0) || "audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || "audio/amr-wb".equals(str2) || "audio/mp4a-latm".equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2))) {
            return i;
        }
        if ("audio/ac3".equals(str2)) {
            i2 = 6;
        } else if ("audio/eac3".equals(str2)) {
            i2 = 16;
        } else {
            i2 = 30;
        }
        gk3.m18132i("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + i + " to " + i2 + "]");
        return i2;
    }

    /* renamed from: c */
    public static Point m6910c(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(w67.m29364l(i, widthAlignment) * widthAlignment, w67.m29364l(i2, heightAlignment) * heightAlignment);
    }

    /* renamed from: d */
    public static boolean m6911d(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point c = m6910c(videoCapabilities, i, i2);
        int i3 = c.x;
        int i4 = c.y;
        if (d == -1.0d || d < 1.0d) {
            return videoCapabilities.isSizeSupported(i3, i4);
        }
        return videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
    }

    /* renamed from: f */
    public static MediaCodecInfo.CodecProfileLevel[] m6912f(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        int i;
        int i2;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            i = 0;
        } else {
            i = videoCapabilities.getBitrateRange().getUpper().intValue();
        }
        if (i >= 180000000) {
            i2 = RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE;
        } else if (i >= 120000000) {
            i2 = RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN;
        } else if (i >= 60000000) {
            i2 = 256;
        } else if (i >= 30000000) {
            i2 = 128;
        } else if (i >= 18000000) {
            i2 = 64;
        } else if (i >= 12000000) {
            i2 = 32;
        } else if (i >= 7200000) {
            i2 = 16;
        } else if (i >= 3600000) {
            i2 = 8;
        } else if (i >= 1800000) {
            i2 = 4;
        } else if (i >= 800000) {
            i2 = 2;
        } else {
            i2 = 1;
        }
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = 1;
        codecProfileLevel.level = i2;
        return new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
    }

    /* renamed from: h */
    public static boolean m6913h(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        if (w67.f19021a < 19 || !m6914i(codecCapabilities)) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public static boolean m6914i(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    /* renamed from: q */
    public static boolean m6915q(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        if (w67.f19021a < 21 || !m6916r(codecCapabilities)) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    public static boolean m6916r(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    /* renamed from: s */
    public static boolean m6917s(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        if (w67.f19021a < 21 || !m6918t(codecCapabilities)) {
            return false;
        }
        return true;
    }

    /* renamed from: t */
    public static boolean m6918t(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    /* renamed from: x */
    public static boolean m6919x(String str) {
        return "audio/opus".equals(str);
    }

    /* renamed from: y */
    public static boolean m6920y(String str) {
        if (!w67.f19024d.startsWith("SM-T230") || !"OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: z */
    public static boolean m6921z(String str) {
        if (w67.f19021a <= 22) {
            String str2 = w67.f19024d;
            if (("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public Point mo7505b(int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f5127d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return m6910c(videoCapabilities, i, i2);
    }

    /* renamed from: e */
    public p31 mo7506e(C0792h hVar, C0792h hVar2) {
        int i;
        int i2;
        if (!w67.m29346c(hVar.f4175C, hVar2.f4175C)) {
            i = 8;
        } else {
            i = 0;
        }
        if (this.f5134k) {
            if (hVar.f4183X != hVar2.f4183X) {
                i |= RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE;
            }
            if (!this.f5128e && !(hVar.f4180P == hVar2.f4180P && hVar.f4181Q == hVar2.f4181Q)) {
                i |= RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN;
            }
            if (!w67.m29346c(hVar.f4194k0, hVar2.f4194k0)) {
                i |= 2048;
            }
            if (m6920y(this.f5124a) && !hVar.mo6640g(hVar2)) {
                i |= 2;
            }
            if (i == 0) {
                String str = this.f5124a;
                if (hVar.mo6640g(hVar2)) {
                    i2 = 3;
                } else {
                    i2 = 2;
                }
                return new p31(str, hVar, hVar2, i2, 0);
            }
        } else {
            if (hVar.f4202v0 != hVar2.f4202v0) {
                i |= 4096;
            }
            if (hVar.f4187b1 != hVar2.f4187b1) {
                i |= 8192;
            }
            if (hVar.f4191e1 != hVar2.f4191e1) {
                i |= Http2.INITIAL_MAX_FRAME_SIZE;
            }
            if (i == 0 && "audio/mp4a-latm".equals(this.f5125b)) {
                Pair<Integer, Integer> q = MediaCodecUtil.m6828q(hVar);
                Pair<Integer, Integer> q2 = MediaCodecUtil.m6828q(hVar2);
                if (!(q == null || q2 == null)) {
                    int intValue = ((Integer) q.first).intValue();
                    int intValue2 = ((Integer) q2.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new p31(this.f5124a, hVar, hVar2, 3, 0);
                    }
                }
            }
            if (!hVar.mo6640g(hVar2)) {
                i |= 32;
            }
            if (m6919x(this.f5125b)) {
                i |= 2;
            }
            if (i == 0) {
                return new p31(this.f5124a, hVar, hVar2, 1, 0);
            }
        }
        return new p31(this.f5124a, hVar, hVar2, 0, i);
    }

    /* renamed from: g */
    public MediaCodecInfo.CodecProfileLevel[] mo7507g() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f5127d;
        if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
            return new MediaCodecInfo.CodecProfileLevel[0];
        }
        return codecProfileLevelArr;
    }

    /* renamed from: j */
    public boolean mo7508j(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f5127d;
        if (codecCapabilities == null) {
            mo7518w("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            mo7518w("channelCount.aCaps");
            return false;
        } else if (m6909a(this.f5124a, this.f5125b, audioCapabilities.getMaxInputChannelCount()) >= i) {
            return true;
        } else {
            mo7518w("channelCount.support, " + i);
            return false;
        }
    }

    /* renamed from: k */
    public boolean mo7509k(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f5127d;
        if (codecCapabilities == null) {
            mo7518w("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            mo7518w("sampleRate.aCaps");
            return false;
        } else if (audioCapabilities.isSampleRateSupported(i)) {
            return true;
        } else {
            mo7518w("sampleRate.support, " + i);
            return false;
        }
    }

    /* renamed from: l */
    public final boolean mo7510l(C0792h hVar) {
        Pair<Integer, Integer> q;
        if (hVar.f4204y == null || (q = MediaCodecUtil.m6828q(hVar)) == null) {
            return true;
        }
        int intValue = ((Integer) q.first).intValue();
        int intValue2 = ((Integer) q.second).intValue();
        if ("video/dolby-vision".equals(hVar.f4175C)) {
            if ("video/avc".equals(this.f5125b)) {
                intValue = 8;
            } else if ("video/hevc".equals(this.f5125b)) {
                intValue = 2;
            }
            intValue2 = 0;
        }
        if (!this.f5134k && intValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecProfileLevel[] g = mo7507g();
        if (w67.f19021a <= 23 && "video/x-vnd.on2.vp9".equals(this.f5125b) && g.length == 0) {
            g = m6912f(this.f5127d);
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : g) {
            if (codecProfileLevel.profile == intValue && codecProfileLevel.level >= intValue2 && !m6906A(this.f5125b, intValue)) {
                return true;
            }
        }
        mo7518w("codec.profileLevel, " + hVar.f4204y + ", " + this.f5126c);
        return false;
    }

    /* renamed from: m */
    public boolean mo7511m(C0792h hVar) throws MediaCodecUtil.DecoderQueryException {
        int i;
        boolean z = false;
        if (!mo7513o(hVar) || !mo7510l(hVar)) {
            return false;
        }
        if (this.f5134k) {
            int i2 = hVar.f4180P;
            if (i2 <= 0 || (i = hVar.f4181Q) <= 0) {
                return true;
            }
            if (w67.f19021a >= 21) {
                return mo7516u(i2, i, (double) hVar.f4182U);
            }
            if (i2 * i <= MediaCodecUtil.m6807N()) {
                z = true;
            }
            if (!z) {
                mo7518w("legacyFrameSize, " + hVar.f4180P + "x" + hVar.f4181Q);
            }
            return z;
        }
        if (w67.f19021a >= 21) {
            int i3 = hVar.f4187b1;
            if (i3 != -1 && !mo7509k(i3)) {
                return false;
            }
            int i4 = hVar.f4202v0;
            if (i4 != -1 && !mo7508j(i4)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: n */
    public boolean mo7512n() {
        if (w67.f19021a >= 29 && "video/x-vnd.on2.vp9".equals(this.f5125b)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : mo7507g()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: o */
    public final boolean mo7513o(C0792h hVar) {
        if (this.f5125b.equals(hVar.f4175C) || this.f5125b.equals(MediaCodecUtil.m6824m(hVar))) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public boolean mo7514p(C0792h hVar) {
        if (this.f5134k) {
            return this.f5128e;
        }
        Pair<Integer, Integer> q = MediaCodecUtil.m6828q(hVar);
        if (q == null || ((Integer) q.first).intValue() != 42) {
            return false;
        }
        return true;
    }

    public String toString() {
        return this.f5124a;
    }

    /* renamed from: u */
    public boolean mo7516u(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f5127d;
        if (codecCapabilities == null) {
            mo7518w("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            mo7518w("sizeAndRate.vCaps");
            return false;
        } else if (m6911d(videoCapabilities, i, i2, d)) {
            return true;
        } else {
            if (i >= i2 || !m6907B(this.f5124a) || !m6911d(videoCapabilities, i2, i, d)) {
                mo7518w("sizeAndRate.support, " + i + "x" + i2 + "x" + d);
                return false;
            }
            mo7517v("sizeAndRate.rotated, " + i + "x" + i2 + "x" + d);
            return true;
        }
    }

    /* renamed from: v */
    public final void mo7517v(String str) {
        gk3.m18125b("MediaCodecInfo", "AssumedSupport [" + str + "] [" + this.f5124a + ", " + this.f5125b + "] [" + w67.f19025e + "]");
    }

    /* renamed from: w */
    public final void mo7518w(String str) {
        gk3.m18125b("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f5124a + ", " + this.f5125b + "] [" + w67.f19025e + "]");
    }
}
