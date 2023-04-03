package androidx.media3.exoplayer.mediacodec;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import androidx.media3.common.C0787e;
import androidx.media3.common.C0792h;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

@SuppressLint({"InlinedApi"})
public final class MediaCodecUtil {

    /* renamed from: a */
    public static final Pattern f5099a = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: b */
    public static final HashMap<C0932b, List<C0945d>> f5100b = new HashMap<>();

    /* renamed from: c */
    public static int f5101c = -1;

    public static class DecoderQueryException extends Exception {
        public DecoderQueryException(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }
    }

    /* renamed from: androidx.media3.exoplayer.mediacodec.MediaCodecUtil$b */
    public static final class C0932b {

        /* renamed from: a */
        public final String f5102a;

        /* renamed from: b */
        public final boolean f5103b;

        /* renamed from: c */
        public final boolean f5104c;

        public C0932b(String str, boolean z, boolean z2) {
            this.f5102a = str;
            this.f5103b = z;
            this.f5104c = z2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != C0932b.class) {
                return false;
            }
            C0932b bVar = (C0932b) obj;
            if (TextUtils.equals(this.f5102a, bVar.f5102a) && this.f5103b == bVar.f5103b && this.f5104c == bVar.f5104c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i;
            int hashCode = (this.f5102a.hashCode() + 31) * 31;
            int i2 = 1231;
            if (this.f5103b) {
                i = 1231;
            } else {
                i = 1237;
            }
            int i3 = (hashCode + i) * 31;
            if (!this.f5104c) {
                i2 = 1237;
            }
            return i3 + i2;
        }
    }

    /* renamed from: androidx.media3.exoplayer.mediacodec.MediaCodecUtil$c */
    public interface C0933c {
        /* renamed from: a */
        MediaCodecInfo mo7477a(int i);

        /* renamed from: b */
        boolean mo7478b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        /* renamed from: c */
        boolean mo7479c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        /* renamed from: d */
        int mo7480d();

        /* renamed from: e */
        boolean mo7481e();
    }

    /* renamed from: androidx.media3.exoplayer.mediacodec.MediaCodecUtil$d */
    public static final class C0934d implements C0933c {
        public C0934d() {
        }

        /* renamed from: a */
        public MediaCodecInfo mo7477a(int i) {
            return MediaCodecList.getCodecInfoAt(i);
        }

        /* renamed from: b */
        public boolean mo7478b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            if (!"secure-playback".equals(str) || !"video/avc".equals(str2)) {
                return false;
            }
            return true;
        }

        /* renamed from: c */
        public boolean mo7479c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        /* renamed from: d */
        public int mo7480d() {
            return MediaCodecList.getCodecCount();
        }

        /* renamed from: e */
        public boolean mo7481e() {
            return false;
        }
    }

    /* renamed from: androidx.media3.exoplayer.mediacodec.MediaCodecUtil$e */
    public static final class C0935e implements C0933c {

        /* renamed from: a */
        public final int f5105a;

        /* renamed from: b */
        public MediaCodecInfo[] f5106b;

        public C0935e(boolean z, boolean z2) {
            int i;
            if (z || z2) {
                i = 1;
            } else {
                i = 0;
            }
            this.f5105a = i;
        }

        /* renamed from: a */
        public MediaCodecInfo mo7477a(int i) {
            mo7482f();
            return this.f5106b[i];
        }

        /* renamed from: b */
        public boolean mo7478b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        /* renamed from: c */
        public boolean mo7479c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        /* renamed from: d */
        public int mo7480d() {
            mo7482f();
            return this.f5106b.length;
        }

        /* renamed from: e */
        public boolean mo7481e() {
            return true;
        }

        @EnsuresNonNull({"mediaCodecInfos"})
        /* renamed from: f */
        public final void mo7482f() {
            if (this.f5106b == null) {
                this.f5106b = new MediaCodecList(this.f5105a).getCodecInfos();
            }
        }
    }

    /* renamed from: androidx.media3.exoplayer.mediacodec.MediaCodecUtil$f */
    public interface C0936f<T> {
        /* renamed from: a */
        int mo7483a(T t);
    }

    /* renamed from: A */
    public static boolean m6794A(MediaCodecInfo mediaCodecInfo) {
        if (w67.f19021a < 29 || !m6795B(mediaCodecInfo)) {
            return false;
        }
        return true;
    }

    /* renamed from: B */
    public static boolean m6795B(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isAlias();
    }

    /* renamed from: C */
    public static boolean m6796C(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z && str.endsWith(".secure"))) {
            return false;
        }
        int i = w67.f19021a;
        if (i < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = w67.f19022b;
            if ("a70".equals(str3) || ("Xiaomi".equals(w67.f19023c) && str3.startsWith("HM"))) {
                return false;
            }
        }
        if (i == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = w67.f19022b;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = w67.f19022b;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(w67.f19023c))) {
            String str6 = w67.f19022b;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(w67.f19023c)) {
            String str7 = w67.f19022b;
            if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i <= 19 && w67.f19022b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        if (i > 23 || !"audio/eac3-joc".equals(str2) || !"OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: D */
    public static boolean m6797D(MediaCodecInfo mediaCodecInfo, String str) {
        if (w67.f19021a >= 29) {
            return m6798E(mediaCodecInfo);
        }
        return !m6799F(mediaCodecInfo, str);
    }

    /* renamed from: E */
    public static boolean m6798E(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    /* renamed from: F */
    public static boolean m6799F(MediaCodecInfo mediaCodecInfo, String str) {
        if (w67.f19021a >= 29) {
            return m6800G(mediaCodecInfo);
        }
        if (vv3.m29139m(str)) {
            return true;
        }
        String e = C5876gr.m44841e(mediaCodecInfo.getName());
        if (e.startsWith("arc.")) {
            return false;
        }
        if (e.startsWith("omx.google.") || e.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((e.startsWith("omx.sec.") && e.contains(".sw.")) || e.equals("omx.qcom.video.decoder.hevcswvdec") || e.startsWith("c2.android.") || e.startsWith("c2.google.")) {
            return true;
        }
        if (e.startsWith("omx.") || e.startsWith("c2.")) {
            return false;
        }
        return true;
    }

    /* renamed from: G */
    public static boolean m6800G(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    /* renamed from: H */
    public static boolean m6801H(MediaCodecInfo mediaCodecInfo) {
        if (w67.f19021a >= 29) {
            return m6802I(mediaCodecInfo);
        }
        String e = C5876gr.m44841e(mediaCodecInfo.getName());
        if (e.startsWith("omx.google.") || e.startsWith("c2.android.") || e.startsWith("c2.google.")) {
            return false;
        }
        return true;
    }

    /* renamed from: I */
    public static boolean m6802I(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isVendor();
    }

    /* renamed from: J */
    public static /* synthetic */ int m6803J(C0945d dVar) {
        String str = dVar.f5124a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        if (w67.f19021a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
            return 0;
        }
        return -1;
    }

    /* renamed from: K */
    public static /* synthetic */ int m6804K(C0945d dVar) {
        return dVar.f5124a.startsWith("OMX.google") ? 1 : 0;
    }

    /* renamed from: L */
    public static /* synthetic */ int m6805L(C0792h hVar, C0945d dVar) {
        try {
            return dVar.mo7511m(hVar) ? 1 : 0;
        } catch (DecoderQueryException unused) {
            return -1;
        }
    }

    /* renamed from: M */
    public static /* synthetic */ int m6806M(C0936f fVar, Object obj, Object obj2) {
        return fVar.mo7483a(obj2) - fVar.mo7483a(obj);
    }

    /* renamed from: N */
    public static int m6807N() throws DecoderQueryException {
        int i;
        if (f5101c == -1) {
            int i2 = 0;
            C0945d r = m6829r("video/avc", false, false);
            if (r != null) {
                MediaCodecInfo.CodecProfileLevel[] g = r.mo7507g();
                int length = g.length;
                int i3 = 0;
                while (i2 < length) {
                    i3 = Math.max(m6819h(g[i2].level), i3);
                    i2++;
                }
                if (w67.f19021a >= 21) {
                    i = 345600;
                } else {
                    i = 172800;
                }
                i2 = Math.max(i3, i);
            }
            f5101c = i2;
        }
        return f5101c;
    }

    /* renamed from: O */
    public static int m6808O(int i) {
        int i2 = 17;
        if (i != 17) {
            i2 = 20;
            if (i != 20) {
                i2 = 23;
                if (i != 23) {
                    i2 = 29;
                    if (i != 29) {
                        i2 = 39;
                        if (i != 39) {
                            i2 = 42;
                            if (i != 42) {
                                switch (i) {
                                    case 1:
                                        return 1;
                                    case 2:
                                        return 2;
                                    case 3:
                                        return 3;
                                    case 4:
                                        return 4;
                                    case 5:
                                        return 5;
                                    case 6:
                                        return 6;
                                    default:
                                        return -1;
                                }
                            }
                        }
                    }
                }
            }
        }
        return i2;
    }

    /* renamed from: P */
    public static <T> void m6809P(List<T> list, C0936f<T> fVar) {
        Collections.sort(list, new br3(fVar));
    }

    /* renamed from: Q */
    public static int m6810Q(int i) {
        if (i == 10) {
            return 1;
        }
        if (i == 11) {
            return 2;
        }
        if (i == 20) {
            return 4;
        }
        if (i == 21) {
            return 8;
        }
        if (i == 30) {
            return 16;
        }
        if (i == 31) {
            return 32;
        }
        if (i == 40) {
            return 64;
        }
        if (i == 41) {
            return 128;
        }
        if (i == 50) {
            return 256;
        }
        if (i == 51) {
            return RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN;
        }
        switch (i) {
            case 60:
                return 2048;
            case 61:
                return 4096;
            case 62:
                return 8192;
            default:
                return -1;
        }
    }

    /* renamed from: R */
    public static int m6811R(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? -1 : 8;
        }
        return 4;
    }

    /* renamed from: e */
    public static void m6816e(String str, List<C0945d> list) {
        if ("audio/raw".equals(str)) {
            if (w67.f19021a < 26 && w67.f19022b.equals("R9") && list.size() == 1 && list.get(0).f5124a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(C0945d.m6908C("OMX.google.raw.decoder", "audio/raw", "audio/raw", (MediaCodecInfo.CodecCapabilities) null, false, true, false, false, false));
            }
            m6809P(list, new zq3());
        }
        int i = w67.f19021a;
        if (i < 21 && list.size() > 1) {
            String str2 = list.get(0).f5124a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                m6809P(list, new ar3());
            }
        }
        if (i < 32 && list.size() > 1 && "OMX.qti.audio.decoder.flac".equals(list.get(0).f5124a)) {
            list.add(list.remove(0));
        }
    }

    /* renamed from: f */
    public static int m6817f(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            case 9:
                return RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN;
            case 10:
                return RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE;
            case 11:
                return 2048;
            case 12:
                return 4096;
            case 13:
                return 8192;
            case 14:
                return Http2.INITIAL_MAX_FRAME_SIZE;
            case 15:
                return 32768;
            case 16:
                return 65536;
            case 17:
                return 131072;
            case 18:
                return 262144;
            case 19:
                return 524288;
            case 20:
                return 1048576;
            case 21:
                return 2097152;
            case 22:
                return 4194304;
            case 23:
                return 8388608;
            default:
                return -1;
        }
    }

    /* renamed from: g */
    public static int m6818g(int i) {
        switch (i) {
            case 10:
                return 1;
            case 11:
                return 4;
            case 12:
                return 8;
            case 13:
                return 16;
            default:
                switch (i) {
                    case 20:
                        return 32;
                    case 21:
                        return 64;
                    case 22:
                        return 128;
                    default:
                        switch (i) {
                            case 30:
                                return 256;
                            case 31:
                                return RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN;
                            case 32:
                                return RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE;
                            default:
                                switch (i) {
                                    case 40:
                                        return 2048;
                                    case 41:
                                        return 4096;
                                    case 42:
                                        return 8192;
                                    default:
                                        switch (i) {
                                            case 50:
                                                return Http2.INITIAL_MAX_FRAME_SIZE;
                                            case 51:
                                                return 32768;
                                            case 52:
                                                return 65536;
                                            default:
                                                return -1;
                                        }
                                }
                        }
                }
        }
    }

    /* renamed from: h */
    public static int m6819h(int i) {
        if (i == 1 || i == 2) {
            return 25344;
        }
        switch (i) {
            case 8:
            case 16:
            case 32:
                return 101376;
            case 64:
                return 202752;
            case 128:
            case 256:
                return 414720;
            case RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN /*512*/:
                return 921600;
            case RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE /*1024*/:
                return 1310720;
            case 2048:
            case 4096:
                return 2097152;
            case 8192:
                return 2228224;
            case Http2.INITIAL_MAX_FRAME_SIZE /*16384*/:
                return 5652480;
            case 32768:
            case 65536:
                return 9437184;
            case 131072:
            case 262144:
            case 524288:
                return 35651584;
            default:
                return -1;
        }
    }

    /* renamed from: i */
    public static int m6820i(int i) {
        if (i == 66) {
            return 1;
        }
        if (i == 77) {
            return 2;
        }
        if (i == 88) {
            return 4;
        }
        if (i == 100) {
            return 8;
        }
        if (i == 110) {
            return 16;
        }
        if (i != 122) {
            return i != 244 ? -1 : 64;
        }
        return 32;
    }

    /* renamed from: j */
    public static Integer m6821j(String str) {
        if (str == null) {
            return null;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case 1537:
                if (str.equals("01")) {
                    c = 0;
                    break;
                }
                break;
            case 1538:
                if (str.equals("02")) {
                    c = 1;
                    break;
                }
                break;
            case 1539:
                if (str.equals("03")) {
                    c = 2;
                    break;
                }
                break;
            case 1540:
                if (str.equals("04")) {
                    c = 3;
                    break;
                }
                break;
            case 1541:
                if (str.equals("05")) {
                    c = 4;
                    break;
                }
                break;
            case 1542:
                if (str.equals("06")) {
                    c = 5;
                    break;
                }
                break;
            case 1543:
                if (str.equals("07")) {
                    c = 6;
                    break;
                }
                break;
            case 1544:
                if (str.equals("08")) {
                    c = 7;
                    break;
                }
                break;
            case 1545:
                if (str.equals("09")) {
                    c = 8;
                    break;
                }
                break;
            case 1567:
                if (str.equals("10")) {
                    c = 9;
                    break;
                }
                break;
            case 1568:
                if (str.equals("11")) {
                    c = 10;
                    break;
                }
                break;
            case 1569:
                if (str.equals("12")) {
                    c = 11;
                    break;
                }
                break;
            case 1570:
                if (str.equals("13")) {
                    c = 12;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            case 9:
                return Integer.valueOf(RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN);
            case 10:
                return Integer.valueOf(RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE);
            case 11:
                return 2048;
            case 12:
                return 4096;
            default:
                return null;
        }
    }

    /* renamed from: k */
    public static Integer m6822k(String str) {
        if (str == null) {
            return null;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case 1536:
                if (str.equals("00")) {
                    c = 0;
                    break;
                }
                break;
            case 1537:
                if (str.equals("01")) {
                    c = 1;
                    break;
                }
                break;
            case 1538:
                if (str.equals("02")) {
                    c = 2;
                    break;
                }
                break;
            case 1539:
                if (str.equals("03")) {
                    c = 3;
                    break;
                }
                break;
            case 1540:
                if (str.equals("04")) {
                    c = 4;
                    break;
                }
                break;
            case 1541:
                if (str.equals("05")) {
                    c = 5;
                    break;
                }
                break;
            case 1542:
                if (str.equals("06")) {
                    c = 6;
                    break;
                }
                break;
            case 1543:
                if (str.equals("07")) {
                    c = 7;
                    break;
                }
                break;
            case 1544:
                if (str.equals("08")) {
                    c = 8;
                    break;
                }
                break;
            case 1545:
                if (str.equals("09")) {
                    c = 9;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            case 9:
                return Integer.valueOf(RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN);
            default:
                return null;
        }
    }

    /* renamed from: l */
    public static Pair<Integer, Integer> m6823l(String str, String[] strArr) {
        int O;
        if (strArr.length != 3) {
            gk3.m18132i("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + str);
            return null;
        }
        try {
            if ("audio/mp4a-latm".equals(vv3.m29132f(Integer.parseInt(strArr[1], 16))) && (O = m6808O(Integer.parseInt(strArr[2]))) != -1) {
                return new Pair<>(Integer.valueOf(O), 0);
            }
        } catch (NumberFormatException unused) {
            gk3.m18132i("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + str);
        }
        return null;
    }

    /* renamed from: m */
    public static String m6824m(C0792h hVar) {
        Pair<Integer, Integer> q;
        if ("audio/eac3-joc".equals(hVar.f4175C)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(hVar.f4175C) || (q = m6828q(hVar)) == null) {
            return null;
        }
        int intValue = ((Integer) q.first).intValue();
        if (intValue == 16 || intValue == 256) {
            return "video/hevc";
        }
        if (intValue == 512) {
            return "video/avc";
        }
        return null;
    }

    /* renamed from: n */
    public static Pair<Integer, Integer> m6825n(String str, String[] strArr, C0787e eVar) {
        int i;
        if (strArr.length < 4) {
            gk3.m18132i("MediaCodecUtil", "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
        int i2 = 1;
        try {
            int parseInt = Integer.parseInt(strArr[1]);
            int parseInt2 = Integer.parseInt(strArr[2].substring(0, 2));
            int parseInt3 = Integer.parseInt(strArr[3]);
            if (parseInt != 0) {
                gk3.m18132i("MediaCodecUtil", "Unknown AV1 profile: " + parseInt);
                return null;
            } else if (parseInt3 == 8 || parseInt3 == 10) {
                if (parseInt3 != 8) {
                    if (eVar == null || !(eVar.f4161g != null || (i = eVar.f4160e) == 7 || i == 6)) {
                        i2 = 2;
                    } else {
                        i2 = 4096;
                    }
                }
                int f = m6817f(parseInt2);
                if (f != -1) {
                    return new Pair<>(Integer.valueOf(i2), Integer.valueOf(f));
                }
                gk3.m18132i("MediaCodecUtil", "Unknown AV1 level: " + parseInt2);
                return null;
            } else {
                gk3.m18132i("MediaCodecUtil", "Unknown AV1 bit depth: " + parseInt3);
                return null;
            }
        } catch (NumberFormatException unused) {
            gk3.m18132i("MediaCodecUtil", "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
    }

    /* renamed from: o */
    public static Pair<Integer, Integer> m6826o(String str, String[] strArr) {
        int i;
        int i2;
        if (strArr.length < 2) {
            gk3.m18132i("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                i2 = Integer.parseInt(strArr[1].substring(0, 2), 16);
                i = Integer.parseInt(strArr[1].substring(4), 16);
            } else if (strArr.length >= 3) {
                int parseInt = Integer.parseInt(strArr[1]);
                i = Integer.parseInt(strArr[2]);
                i2 = parseInt;
            } else {
                gk3.m18132i("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
                return null;
            }
            int i3 = m6820i(i2);
            if (i3 == -1) {
                gk3.m18132i("MediaCodecUtil", "Unknown AVC profile: " + i2);
                return null;
            }
            int g = m6818g(i);
            if (g != -1) {
                return new Pair<>(Integer.valueOf(i3), Integer.valueOf(g));
            }
            gk3.m18132i("MediaCodecUtil", "Unknown AVC level: " + i);
            return null;
        } catch (NumberFormatException unused) {
            gk3.m18132i("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
    }

    /* renamed from: p */
    public static String m6827p(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        } else if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        } else {
            if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
                return "audio/x-lg-flac";
            }
            if (!str2.equals("audio/ac3") || !"OMX.lge.ac3.decoder".equals(str)) {
                return null;
            }
            return "audio/lg-ac3";
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0075, code lost:
        if (r3.equals("av01") == false) goto L_0x002b;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> m6828q(androidx.media3.common.C0792h r6) {
        /*
            java.lang.String r0 = r6.f4204y
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            java.lang.String r2 = "\\."
            java.lang.String[] r0 = r0.split(r2)
            java.lang.String r2 = r6.f4175C
            java.lang.String r3 = "video/dolby-vision"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x001d
            java.lang.String r6 = r6.f4204y
            android.util.Pair r6 = m6834w(r6, r0)
            return r6
        L_0x001d:
            r2 = 0
            r3 = r0[r2]
            r3.hashCode()
            r4 = -1
            int r5 = r3.hashCode()
            switch(r5) {
                case 3004662: goto L_0x006f;
                case 3006243: goto L_0x0064;
                case 3006244: goto L_0x0059;
                case 3199032: goto L_0x004e;
                case 3214780: goto L_0x0043;
                case 3356560: goto L_0x0038;
                case 3624515: goto L_0x002d;
                default: goto L_0x002b;
            }
        L_0x002b:
            r2 = r4
            goto L_0x0078
        L_0x002d:
            java.lang.String r2 = "vp09"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x0036
            goto L_0x002b
        L_0x0036:
            r2 = 6
            goto L_0x0078
        L_0x0038:
            java.lang.String r2 = "mp4a"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x0041
            goto L_0x002b
        L_0x0041:
            r2 = 5
            goto L_0x0078
        L_0x0043:
            java.lang.String r2 = "hvc1"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x004c
            goto L_0x002b
        L_0x004c:
            r2 = 4
            goto L_0x0078
        L_0x004e:
            java.lang.String r2 = "hev1"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x0057
            goto L_0x002b
        L_0x0057:
            r2 = 3
            goto L_0x0078
        L_0x0059:
            java.lang.String r2 = "avc2"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x0062
            goto L_0x002b
        L_0x0062:
            r2 = 2
            goto L_0x0078
        L_0x0064:
            java.lang.String r2 = "avc1"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x006d
            goto L_0x002b
        L_0x006d:
            r2 = 1
            goto L_0x0078
        L_0x006f:
            java.lang.String r5 = "av01"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0078
            goto L_0x002b
        L_0x0078:
            switch(r2) {
                case 0: goto L_0x0098;
                case 1: goto L_0x0091;
                case 2: goto L_0x0091;
                case 3: goto L_0x008a;
                case 4: goto L_0x008a;
                case 5: goto L_0x0083;
                case 6: goto L_0x007c;
                default: goto L_0x007b;
            }
        L_0x007b:
            return r1
        L_0x007c:
            java.lang.String r6 = r6.f4204y
            android.util.Pair r6 = m6836y(r6, r0)
            return r6
        L_0x0083:
            java.lang.String r6 = r6.f4204y
            android.util.Pair r6 = m6823l(r6, r0)
            return r6
        L_0x008a:
            java.lang.String r6 = r6.f4204y
            android.util.Pair r6 = m6835x(r6, r0)
            return r6
        L_0x0091:
            java.lang.String r6 = r6.f4204y
            android.util.Pair r6 = m6826o(r6, r0)
            return r6
        L_0x0098:
            java.lang.String r1 = r6.f4204y
            androidx.media3.common.e r6 = r6.f4194k0
            android.util.Pair r6 = m6825n(r1, r0, r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.MediaCodecUtil.m6828q(androidx.media3.common.h):android.util.Pair");
    }

    /* renamed from: r */
    public static C0945d m6829r(String str, boolean z, boolean z2) throws DecoderQueryException {
        List<C0945d> s = m6830s(str, z, z2);
        if (s.isEmpty()) {
            return null;
        }
        return s.get(0);
    }

    /* renamed from: s */
    public static synchronized List<C0945d> m6830s(String str, boolean z, boolean z2) throws DecoderQueryException {
        C0933c cVar;
        synchronized (MediaCodecUtil.class) {
            C0932b bVar = new C0932b(str, z, z2);
            HashMap<C0932b, List<C0945d>> hashMap = f5100b;
            List<C0945d> list = hashMap.get(bVar);
            if (list != null) {
                return list;
            }
            int i = w67.f19021a;
            if (i >= 21) {
                cVar = new C0935e(z, z2);
            } else {
                cVar = new C0934d();
            }
            ArrayList<C0945d> t = m6831t(bVar, cVar);
            if (z && t.isEmpty() && 21 <= i && i <= 23) {
                t = m6831t(bVar, new C0934d());
                if (!t.isEmpty()) {
                    gk3.m18132i("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + t.get(0).f5124a);
                }
            }
            m6816e(str, t);
            ImmutableList<C0945d> copyOf = ImmutableList.copyOf(t);
            hashMap.put(bVar, copyOf);
            return copyOf;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007f, code lost:
        if (r1.f5103b == false) goto L_0x0081;
     */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0101 A[SYNTHETIC, Splitter:B:60:0x0101] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x012a A[SYNTHETIC] */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList<androidx.media3.exoplayer.mediacodec.C0945d> m6831t(androidx.media3.exoplayer.mediacodec.MediaCodecUtil.C0932b r24, androidx.media3.exoplayer.mediacodec.MediaCodecUtil.C0933c r25) throws androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException {
        /*
            r1 = r24
            r2 = r25
            java.lang.String r3 = "secure-playback"
            java.lang.String r4 = "tunneled-playback"
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x014f }
            r5.<init>()     // Catch:{ Exception -> 0x014f }
            java.lang.String r15 = r1.f5102a     // Catch:{ Exception -> 0x014f }
            int r14 = r25.mo7480d()     // Catch:{ Exception -> 0x014f }
            boolean r13 = r25.mo7481e()     // Catch:{ Exception -> 0x014f }
            r0 = 0
            r12 = r0
        L_0x0019:
            if (r12 >= r14) goto L_0x014e
            android.media.MediaCodecInfo r0 = r2.mo7477a(r12)     // Catch:{ Exception -> 0x014f }
            boolean r6 = m6794A(r0)     // Catch:{ Exception -> 0x014f }
            if (r6 == 0) goto L_0x002d
        L_0x0025:
            r22 = r12
            r23 = r13
            r18 = r14
            goto L_0x0120
        L_0x002d:
            java.lang.String r11 = r0.getName()     // Catch:{ Exception -> 0x014f }
            boolean r6 = m6796C(r0, r11, r13, r15)     // Catch:{ Exception -> 0x014f }
            if (r6 != 0) goto L_0x0038
            goto L_0x0025
        L_0x0038:
            java.lang.String r10 = m6827p(r0, r11, r15)     // Catch:{ Exception -> 0x014f }
            if (r10 != 0) goto L_0x003f
            goto L_0x0025
        L_0x003f:
            android.media.MediaCodecInfo$CodecCapabilities r9 = r0.getCapabilitiesForType(r10)     // Catch:{ Exception -> 0x00ef }
            boolean r6 = r2.mo7478b(r4, r10, r9)     // Catch:{ Exception -> 0x00ef }
            boolean r7 = r2.mo7479c(r4, r10, r9)     // Catch:{ Exception -> 0x00ef }
            boolean r8 = r1.f5104c     // Catch:{ Exception -> 0x00ef }
            if (r8 != 0) goto L_0x0051
            if (r7 != 0) goto L_0x0025
        L_0x0051:
            if (r8 == 0) goto L_0x0056
            if (r6 != 0) goto L_0x0056
            goto L_0x0025
        L_0x0056:
            boolean r6 = r2.mo7478b(r3, r10, r9)     // Catch:{ Exception -> 0x00ef }
            boolean r7 = r2.mo7479c(r3, r10, r9)     // Catch:{ Exception -> 0x00ef }
            boolean r8 = r1.f5103b     // Catch:{ Exception -> 0x00ef }
            if (r8 != 0) goto L_0x0064
            if (r7 != 0) goto L_0x0025
        L_0x0064:
            if (r8 == 0) goto L_0x0069
            if (r6 != 0) goto L_0x0069
            goto L_0x0025
        L_0x0069:
            boolean r16 = m6797D(r0, r15)     // Catch:{ Exception -> 0x00ef }
            boolean r17 = m6799F(r0, r15)     // Catch:{ Exception -> 0x00ef }
            boolean r0 = m6801H(r0)     // Catch:{ Exception -> 0x00ef }
            if (r13 == 0) goto L_0x007b
            boolean r7 = r1.f5103b     // Catch:{ Exception -> 0x00ef }
            if (r7 == r6) goto L_0x0081
        L_0x007b:
            if (r13 != 0) goto L_0x00b3
            boolean r7 = r1.f5103b     // Catch:{ Exception -> 0x00a8 }
            if (r7 != 0) goto L_0x00b3
        L_0x0081:
            r18 = 0
            r19 = 0
            r6 = r11
            r7 = r15
            r8 = r10
            r20 = r10
            r10 = r16
            r21 = r11
            r11 = r17
            r22 = r12
            r12 = r0
            r23 = r13
            r13 = r18
            r18 = r14
            r14 = r19
            androidx.media3.exoplayer.mediacodec.d r0 = androidx.media3.exoplayer.mediacodec.C0945d.m6908C(r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x00a4 }
            r5.add(r0)     // Catch:{ Exception -> 0x00a4 }
            goto L_0x0120
        L_0x00a4:
            r0 = move-exception
            r1 = r21
            goto L_0x00f9
        L_0x00a8:
            r0 = move-exception
            r20 = r10
            r22 = r12
            r23 = r13
            r18 = r14
            r1 = r11
            goto L_0x00f9
        L_0x00b3:
            r20 = r10
            r21 = r11
            r22 = r12
            r23 = r13
            r18 = r14
            if (r23 != 0) goto L_0x0120
            if (r6 == 0) goto L_0x0120
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a4 }
            r6.<init>()     // Catch:{ Exception -> 0x00a4 }
            r14 = r21
            r6.append(r14)     // Catch:{ Exception -> 0x00ec }
            java.lang.String r7 = ".secure"
            r6.append(r7)     // Catch:{ Exception -> 0x00ec }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x00ec }
            r13 = 0
            r19 = 1
            r7 = r15
            r8 = r20
            r10 = r16
            r11 = r17
            r12 = r0
            r1 = r14
            r14 = r19
            androidx.media3.exoplayer.mediacodec.d r0 = androidx.media3.exoplayer.mediacodec.C0945d.m6908C(r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x00ea }
            r5.add(r0)     // Catch:{ Exception -> 0x00ea }
            return r5
        L_0x00ea:
            r0 = move-exception
            goto L_0x00f9
        L_0x00ec:
            r0 = move-exception
            r1 = r14
            goto L_0x00f9
        L_0x00ef:
            r0 = move-exception
            r20 = r10
            r1 = r11
            r22 = r12
            r23 = r13
            r18 = r14
        L_0x00f9:
            int r6 = p000.w67.f19021a     // Catch:{ Exception -> 0x014f }
            r7 = 23
            java.lang.String r8 = "MediaCodecUtil"
            if (r6 > r7) goto L_0x012a
            boolean r6 = r5.isEmpty()     // Catch:{ Exception -> 0x014f }
            if (r6 != 0) goto L_0x012a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x014f }
            r0.<init>()     // Catch:{ Exception -> 0x014f }
            java.lang.String r6 = "Skipping codec "
            r0.append(r6)     // Catch:{ Exception -> 0x014f }
            r0.append(r1)     // Catch:{ Exception -> 0x014f }
            java.lang.String r1 = " (failed to query capabilities)"
            r0.append(r1)     // Catch:{ Exception -> 0x014f }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x014f }
            p000.gk3.m18126c(r8, r0)     // Catch:{ Exception -> 0x014f }
        L_0x0120:
            int r12 = r22 + 1
            r1 = r24
            r14 = r18
            r13 = r23
            goto L_0x0019
        L_0x012a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x014f }
            r2.<init>()     // Catch:{ Exception -> 0x014f }
            java.lang.String r3 = "Failed to query codec "
            r2.append(r3)     // Catch:{ Exception -> 0x014f }
            r2.append(r1)     // Catch:{ Exception -> 0x014f }
            java.lang.String r1 = " ("
            r2.append(r1)     // Catch:{ Exception -> 0x014f }
            r1 = r20
            r2.append(r1)     // Catch:{ Exception -> 0x014f }
            java.lang.String r1 = ")"
            r2.append(r1)     // Catch:{ Exception -> 0x014f }
            java.lang.String r1 = r2.toString()     // Catch:{ Exception -> 0x014f }
            p000.gk3.m18126c(r8, r1)     // Catch:{ Exception -> 0x014f }
            throw r0     // Catch:{ Exception -> 0x014f }
        L_0x014e:
            return r5
        L_0x014f:
            r0 = move-exception
            androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException r1 = new androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException
            r2 = 0
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.MediaCodecUtil.m6831t(androidx.media3.exoplayer.mediacodec.MediaCodecUtil$b, androidx.media3.exoplayer.mediacodec.MediaCodecUtil$c):java.util.ArrayList");
    }

    /* renamed from: u */
    public static List<C0945d> m6832u(List<C0945d> list, C0792h hVar) {
        ArrayList arrayList = new ArrayList(list);
        m6809P(arrayList, new yq3(hVar));
        return arrayList;
    }

    /* renamed from: v */
    public static C0945d m6833v() throws DecoderQueryException {
        return m6829r("audio/raw", false, false);
    }

    /* renamed from: w */
    public static Pair<Integer, Integer> m6834w(String str, String[] strArr) {
        if (strArr.length < 3) {
            gk3.m18132i("MediaCodecUtil", "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        Matcher matcher = f5099a.matcher(strArr[1]);
        if (!matcher.matches()) {
            gk3.m18132i("MediaCodecUtil", "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        String group = matcher.group(1);
        Integer k = m6822k(group);
        if (k == null) {
            gk3.m18132i("MediaCodecUtil", "Unknown Dolby Vision profile string: " + group);
            return null;
        }
        String str2 = strArr[2];
        Integer j = m6821j(str2);
        if (j != null) {
            return new Pair<>(k, j);
        }
        gk3.m18132i("MediaCodecUtil", "Unknown Dolby Vision level string: " + str2);
        return null;
    }

    /* renamed from: x */
    public static Pair<Integer, Integer> m6835x(String str, String[] strArr) {
        if (strArr.length < 4) {
            gk3.m18132i("MediaCodecUtil", "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        int i = 1;
        Matcher matcher = f5099a.matcher(strArr[1]);
        if (!matcher.matches()) {
            gk3.m18132i("MediaCodecUtil", "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        String group = matcher.group(1);
        if (!"1".equals(group)) {
            if ("2".equals(group)) {
                i = 2;
            } else {
                gk3.m18132i("MediaCodecUtil", "Unknown HEVC profile string: " + group);
                return null;
            }
        }
        String str2 = strArr[3];
        Integer z = m6837z(str2);
        if (z != null) {
            return new Pair<>(Integer.valueOf(i), z);
        }
        gk3.m18132i("MediaCodecUtil", "Unknown HEVC level string: " + str2);
        return null;
    }

    /* renamed from: y */
    public static Pair<Integer, Integer> m6836y(String str, String[] strArr) {
        if (strArr.length < 3) {
            gk3.m18132i("MediaCodecUtil", "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
        try {
            int parseInt = Integer.parseInt(strArr[1]);
            int parseInt2 = Integer.parseInt(strArr[2]);
            int R = m6811R(parseInt);
            if (R == -1) {
                gk3.m18132i("MediaCodecUtil", "Unknown VP9 profile: " + parseInt);
                return null;
            }
            int Q = m6810Q(parseInt2);
            if (Q != -1) {
                return new Pair<>(Integer.valueOf(R), Integer.valueOf(Q));
            }
            gk3.m18132i("MediaCodecUtil", "Unknown VP9 level: " + parseInt2);
            return null;
        } catch (NumberFormatException unused) {
            gk3.m18132i("MediaCodecUtil", "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
    }

    /* renamed from: z */
    public static Integer m6837z(String str) {
        if (str == null) {
            return null;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case 70821:
                if (str.equals("H30")) {
                    c = 0;
                    break;
                }
                break;
            case 70914:
                if (str.equals("H60")) {
                    c = 1;
                    break;
                }
                break;
            case 70917:
                if (str.equals("H63")) {
                    c = 2;
                    break;
                }
                break;
            case 71007:
                if (str.equals("H90")) {
                    c = 3;
                    break;
                }
                break;
            case 71010:
                if (str.equals("H93")) {
                    c = 4;
                    break;
                }
                break;
            case 74665:
                if (str.equals("L30")) {
                    c = 5;
                    break;
                }
                break;
            case 74758:
                if (str.equals("L60")) {
                    c = 6;
                    break;
                }
                break;
            case 74761:
                if (str.equals("L63")) {
                    c = 7;
                    break;
                }
                break;
            case 74851:
                if (str.equals("L90")) {
                    c = 8;
                    break;
                }
                break;
            case 74854:
                if (str.equals("L93")) {
                    c = 9;
                    break;
                }
                break;
            case 2193639:
                if (str.equals("H120")) {
                    c = 10;
                    break;
                }
                break;
            case 2193642:
                if (str.equals("H123")) {
                    c = 11;
                    break;
                }
                break;
            case 2193732:
                if (str.equals("H150")) {
                    c = 12;
                    break;
                }
                break;
            case 2193735:
                if (str.equals("H153")) {
                    c = 13;
                    break;
                }
                break;
            case 2193738:
                if (str.equals("H156")) {
                    c = 14;
                    break;
                }
                break;
            case 2193825:
                if (str.equals("H180")) {
                    c = 15;
                    break;
                }
                break;
            case 2193828:
                if (str.equals("H183")) {
                    c = 16;
                    break;
                }
                break;
            case 2193831:
                if (str.equals("H186")) {
                    c = 17;
                    break;
                }
                break;
            case 2312803:
                if (str.equals("L120")) {
                    c = 18;
                    break;
                }
                break;
            case 2312806:
                if (str.equals("L123")) {
                    c = 19;
                    break;
                }
                break;
            case 2312896:
                if (str.equals("L150")) {
                    c = 20;
                    break;
                }
                break;
            case 2312899:
                if (str.equals("L153")) {
                    c = 21;
                    break;
                }
                break;
            case 2312902:
                if (str.equals("L156")) {
                    c = 22;
                    break;
                }
                break;
            case 2312989:
                if (str.equals("L180")) {
                    c = 23;
                    break;
                }
                break;
            case 2312992:
                if (str.equals("L183")) {
                    c = 24;
                    break;
                }
                break;
            case 2312995:
                if (str.equals("L186")) {
                    c = 25;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 2;
            case 1:
                return 8;
            case 2:
                return 32;
            case 3:
                return 128;
            case 4:
                return Integer.valueOf(RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN);
            case 5:
                return 1;
            case 6:
                return 4;
            case 7:
                return 16;
            case 8:
                return 64;
            case 9:
                return 256;
            case 10:
                return 2048;
            case 11:
                return 8192;
            case 12:
                return 32768;
            case 13:
                return 131072;
            case 14:
                return 524288;
            case 15:
                return 2097152;
            case 16:
                return 8388608;
            case 17:
                return 33554432;
            case 18:
                return Integer.valueOf(RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE);
            case 19:
                return 4096;
            case 20:
                return Integer.valueOf(Http2.INITIAL_MAX_FRAME_SIZE);
            case 21:
                return 65536;
            case 22:
                return 262144;
            case 23:
                return 1048576;
            case 24:
                return 4194304;
            case 25:
                return Integer.valueOf(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
            default:
                return null;
        }
    }
}
