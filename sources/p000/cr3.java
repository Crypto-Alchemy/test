package p000;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import androidx.media3.common.C0792h;
import androidx.media3.common.C0844x;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.mediacodec.C0941c;
import androidx.media3.exoplayer.mediacodec.C0945d;
import androidx.media3.exoplayer.mediacodec.C0946e;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.media3.exoplayer.video.MediaCodecVideoDecoderException;
import androidx.media3.exoplayer.video.PlaceholderSurface;
import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import java.util.List;
import p000.z97;

/* renamed from: cr3 */
/* compiled from: MediaCodecVideoRenderer */
public class cr3 extends MediaCodecRenderer {

    /* renamed from: c3 */
    public static final int[] f10215c3 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: d3 */
    public static boolean f10216d3;

    /* renamed from: e3 */
    public static boolean f10217e3;

    /* renamed from: A2 */
    public boolean f10218A2;

    /* renamed from: B2 */
    public boolean f10219B2;

    /* renamed from: C2 */
    public Surface f10220C2;

    /* renamed from: D2 */
    public PlaceholderSurface f10221D2;

    /* renamed from: E2 */
    public boolean f10222E2;

    /* renamed from: F2 */
    public int f10223F2;

    /* renamed from: G2 */
    public boolean f10224G2;

    /* renamed from: H2 */
    public boolean f10225H2;

    /* renamed from: I2 */
    public boolean f10226I2;

    /* renamed from: J2 */
    public long f10227J2;

    /* renamed from: K2 */
    public long f10228K2;

    /* renamed from: L2 */
    public long f10229L2;

    /* renamed from: M2 */
    public int f10230M2;

    /* renamed from: N2 */
    public int f10231N2;

    /* renamed from: O2 */
    public int f10232O2;

    /* renamed from: P2 */
    public long f10233P2;

    /* renamed from: Q2 */
    public long f10234Q2;

    /* renamed from: R2 */
    public long f10235R2;

    /* renamed from: S2 */
    public int f10236S2;

    /* renamed from: T2 */
    public int f10237T2;

    /* renamed from: U2 */
    public int f10238U2;

    /* renamed from: V2 */
    public int f10239V2;

    /* renamed from: W2 */
    public float f10240W2;

    /* renamed from: X2 */
    public C0844x f10241X2;

    /* renamed from: Y2 */
    public boolean f10242Y2;

    /* renamed from: Z2 */
    public int f10243Z2;

    /* renamed from: a3 */
    public C2114b f10244a3;

    /* renamed from: b3 */
    public k97 f10245b3;

    /* renamed from: t2 */
    public final Context f10246t2;

    /* renamed from: u2 */
    public final n97 f10247u2;

    /* renamed from: v2 */
    public final z97.C3721a f10248v2;

    /* renamed from: w2 */
    public final long f10249w2;

    /* renamed from: x2 */
    public final int f10250x2;

    /* renamed from: y2 */
    public final boolean f10251y2;

    /* renamed from: z2 */
    public C2113a f10252z2;

    /* renamed from: cr3$a */
    /* compiled from: MediaCodecVideoRenderer */
    public static final class C2113a {

        /* renamed from: a */
        public final int f10253a;

        /* renamed from: b */
        public final int f10254b;

        /* renamed from: c */
        public final int f10255c;

        public C2113a(int i, int i2, int i3) {
            this.f10253a = i;
            this.f10254b = i2;
            this.f10255c = i3;
        }
    }

    /* renamed from: cr3$b */
    /* compiled from: MediaCodecVideoRenderer */
    public final class C2114b implements C0941c.C0944c, Handler.Callback {

        /* renamed from: a */
        public final Handler f10256a;

        public C2114b(C0941c cVar) {
            Handler w = w67.m29386w(this);
            this.f10256a = w;
            cVar.mo7485b(this, w);
        }

        /* renamed from: a */
        public void mo7504a(C0941c cVar, long j, long j2) {
            if (w67.f19021a < 30) {
                this.f10256a.sendMessageAtFrontOfQueue(Message.obtain(this.f10256a, 0, (int) (j >> 32), (int) j));
                return;
            }
            mo18262b(j);
        }

        /* renamed from: b */
        public final void mo18262b(long j) {
            cr3 cr3 = cr3.this;
            if (this == cr3.f10244a3) {
                if (j == Long.MAX_VALUE) {
                    cr3.mo18243O1();
                    return;
                }
                try {
                    cr3.mo18242N1(j);
                } catch (ExoPlaybackException e) {
                    cr3.this.mo7444d1(e);
                }
            }
        }

        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            mo18262b(w67.m29329R0(message.arg1, message.arg2));
            return true;
        }
    }

    public cr3(Context context, C0941c.C0943b bVar, C0946e eVar, long j, boolean z, Handler handler, z97 z97, int i) {
        this(context, bVar, eVar, j, z, handler, z97, i, 30.0f);
    }

    /* renamed from: A1 */
    public static List<C0945d> m14390A1(C0946e eVar, C0792h hVar, boolean z, boolean z2) throws MediaCodecUtil.DecoderQueryException {
        String str = hVar.f4175C;
        if (str == null) {
            return ImmutableList.m36627of();
        }
        List<C0945d> a = eVar.mo7519a(str, z, z2);
        String m = MediaCodecUtil.m6824m(hVar);
        if (m == null) {
            return ImmutableList.copyOf(a);
        }
        return ImmutableList.builder().mo34690j(a).mo34690j(eVar.mo7519a(m, z, z2)).mo34692l();
    }

    /* renamed from: B1 */
    public static int m14391B1(C0945d dVar, C0792h hVar) {
        if (hVar.f4176H == -1) {
            return m14400x1(dVar, hVar);
        }
        int size = hVar.f4177I.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += hVar.f4177I.get(i2).length;
        }
        return hVar.f4176H + i;
    }

    /* renamed from: D1 */
    public static boolean m14392D1(long j) {
        return j < -30000;
    }

    /* renamed from: E1 */
    public static boolean m14393E1(long j) {
        return j < -500000;
    }

    /* renamed from: S1 */
    public static void m14394S1(C0941c cVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        cVar.mo7494j(bundle);
    }

    /* renamed from: t1 */
    public static void m14397t1(MediaFormat mediaFormat, int i) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i);
    }

    /* renamed from: u1 */
    public static boolean m14398u1() {
        return "NVIDIA".equals(w67.f19023c);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:438:0x07ce, code lost:
        if (r0.equals("PGN528") == false) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:465:0x083c, code lost:
        if (r0.equals("AFTN") == false) goto L_0x0834;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:473:0x0858, code lost:
        return true;
     */
    /* renamed from: w1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m14399w1() {
        /*
            int r0 = p000.w67.f19021a
            r1 = 7
            r2 = 6
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 28
            r7 = 2
            r8 = -1
            r9 = 0
            r10 = 1
            if (r0 > r6) goto L_0x007a
            java.lang.String r11 = p000.w67.f19022b
            r11.hashCode()
            int r12 = r11.hashCode()
            switch(r12) {
                case -1339091551: goto L_0x006b;
                case -1220081023: goto L_0x0060;
                case -1220066608: goto L_0x0055;
                case -1012436106: goto L_0x004a;
                case -760312546: goto L_0x003f;
                case -64886864: goto L_0x0034;
                case 3415681: goto L_0x0029;
                case 825323514: goto L_0x001e;
                default: goto L_0x001b;
            }
        L_0x001b:
            r11 = r8
            goto L_0x0075
        L_0x001e:
            java.lang.String r12 = "machuca"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x0027
            goto L_0x001b
        L_0x0027:
            r11 = r1
            goto L_0x0075
        L_0x0029:
            java.lang.String r12 = "once"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x0032
            goto L_0x001b
        L_0x0032:
            r11 = r2
            goto L_0x0075
        L_0x0034:
            java.lang.String r12 = "magnolia"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x003d
            goto L_0x001b
        L_0x003d:
            r11 = r3
            goto L_0x0075
        L_0x003f:
            java.lang.String r12 = "aquaman"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x0048
            goto L_0x001b
        L_0x0048:
            r11 = r4
            goto L_0x0075
        L_0x004a:
            java.lang.String r12 = "oneday"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x0053
            goto L_0x001b
        L_0x0053:
            r11 = r5
            goto L_0x0075
        L_0x0055:
            java.lang.String r12 = "dangalUHD"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x005e
            goto L_0x001b
        L_0x005e:
            r11 = r7
            goto L_0x0075
        L_0x0060:
            java.lang.String r12 = "dangalFHD"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x0069
            goto L_0x001b
        L_0x0069:
            r11 = r10
            goto L_0x0075
        L_0x006b:
            java.lang.String r12 = "dangal"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x0074
            goto L_0x001b
        L_0x0074:
            r11 = r9
        L_0x0075:
            switch(r11) {
                case 0: goto L_0x0079;
                case 1: goto L_0x0079;
                case 2: goto L_0x0079;
                case 3: goto L_0x0079;
                case 4: goto L_0x0079;
                case 5: goto L_0x0079;
                case 6: goto L_0x0079;
                case 7: goto L_0x0079;
                default: goto L_0x0078;
            }
        L_0x0078:
            goto L_0x007a
        L_0x0079:
            return r10
        L_0x007a:
            r11 = 27
            if (r0 > r11) goto L_0x0089
            java.lang.String r12 = p000.w67.f19022b
            java.lang.String r13 = "HWEML"
            boolean r12 = r13.equals(r12)
            if (r12 == 0) goto L_0x0089
            return r10
        L_0x0089:
            r12 = 26
            if (r0 > r12) goto L_0x0859
            java.lang.String r0 = p000.w67.f19022b
            r0.hashCode()
            int r13 = r0.hashCode()
            switch(r13) {
                case -2144781245: goto L_0x081a;
                case -2144781185: goto L_0x080e;
                case -2144781160: goto L_0x0802;
                case -2097309513: goto L_0x07f6;
                case -2022874474: goto L_0x07ea;
                case -1978993182: goto L_0x07de;
                case -1978990237: goto L_0x07d2;
                case -1936688988: goto L_0x07c8;
                case -1936688066: goto L_0x07ba;
                case -1936688065: goto L_0x07ac;
                case -1931988508: goto L_0x079e;
                case -1885099851: goto L_0x0790;
                case -1696512866: goto L_0x0782;
                case -1680025915: goto L_0x0774;
                case -1615810839: goto L_0x0766;
                case -1600724499: goto L_0x0758;
                case -1554255044: goto L_0x074a;
                case -1481772737: goto L_0x073c;
                case -1481772730: goto L_0x072e;
                case -1481772729: goto L_0x0720;
                case -1320080169: goto L_0x0712;
                case -1217592143: goto L_0x0704;
                case -1180384755: goto L_0x06f6;
                case -1139198265: goto L_0x06e8;
                case -1052835013: goto L_0x06da;
                case -993250464: goto L_0x06cc;
                case -993250458: goto L_0x06bf;
                case -965403638: goto L_0x06b2;
                case -958336948: goto L_0x06a5;
                case -879245230: goto L_0x0697;
                case -842500323: goto L_0x0689;
                case -821392978: goto L_0x067b;
                case -797483286: goto L_0x066d;
                case -794946968: goto L_0x065f;
                case -788334647: goto L_0x0651;
                case -782144577: goto L_0x0643;
                case -575125681: goto L_0x0635;
                case -521118391: goto L_0x0627;
                case -430914369: goto L_0x0619;
                case -290434366: goto L_0x060b;
                case -282781963: goto L_0x05fd;
                case -277133239: goto L_0x05ef;
                case -173639913: goto L_0x05e1;
                case -56598463: goto L_0x05d3;
                case 2126: goto L_0x05c5;
                case 2564: goto L_0x05b7;
                case 2715: goto L_0x05a9;
                case 2719: goto L_0x059b;
                case 3091: goto L_0x058d;
                case 3483: goto L_0x057f;
                case 73405: goto L_0x0571;
                case 75537: goto L_0x0563;
                case 75739: goto L_0x0555;
                case 76779: goto L_0x0547;
                case 78669: goto L_0x0539;
                case 79305: goto L_0x052b;
                case 80618: goto L_0x051d;
                case 88274: goto L_0x050f;
                case 98846: goto L_0x0501;
                case 98848: goto L_0x04f3;
                case 99329: goto L_0x04e5;
                case 101481: goto L_0x04d7;
                case 1513190: goto L_0x04c9;
                case 1514184: goto L_0x04bb;
                case 1514185: goto L_0x04ad;
                case 2133089: goto L_0x049f;
                case 2133091: goto L_0x0491;
                case 2133120: goto L_0x0483;
                case 2133151: goto L_0x0475;
                case 2133182: goto L_0x0467;
                case 2133184: goto L_0x0459;
                case 2436959: goto L_0x044b;
                case 2463773: goto L_0x043d;
                case 2464648: goto L_0x042f;
                case 2689555: goto L_0x0421;
                case 3154429: goto L_0x0413;
                case 3284551: goto L_0x0405;
                case 3351335: goto L_0x03f7;
                case 3386211: goto L_0x03e9;
                case 41325051: goto L_0x03db;
                case 51349633: goto L_0x03cd;
                case 51350594: goto L_0x03bf;
                case 55178625: goto L_0x03b1;
                case 61542055: goto L_0x03a3;
                case 65355429: goto L_0x0395;
                case 66214468: goto L_0x0387;
                case 66214470: goto L_0x0379;
                case 66214473: goto L_0x036b;
                case 66215429: goto L_0x035d;
                case 66215431: goto L_0x034f;
                case 66215433: goto L_0x0341;
                case 66216390: goto L_0x0333;
                case 76402249: goto L_0x0325;
                case 76404105: goto L_0x0317;
                case 76404911: goto L_0x0309;
                case 80963634: goto L_0x02fb;
                case 82882791: goto L_0x02ed;
                case 98715550: goto L_0x02df;
                case 101370885: goto L_0x02d1;
                case 102844228: goto L_0x02c3;
                case 165221241: goto L_0x02b5;
                case 182191441: goto L_0x02a7;
                case 245388979: goto L_0x0299;
                case 287431619: goto L_0x028b;
                case 307593612: goto L_0x027d;
                case 308517133: goto L_0x026f;
                case 316215098: goto L_0x0261;
                case 316215116: goto L_0x0253;
                case 316246811: goto L_0x0245;
                case 316246818: goto L_0x0237;
                case 407160593: goto L_0x0229;
                case 507412548: goto L_0x021b;
                case 793982701: goto L_0x020d;
                case 794038622: goto L_0x01ff;
                case 794040393: goto L_0x01f1;
                case 835649806: goto L_0x01e3;
                case 917340916: goto L_0x01d5;
                case 958008161: goto L_0x01c7;
                case 1060579533: goto L_0x01b9;
                case 1150207623: goto L_0x01ab;
                case 1176899427: goto L_0x019d;
                case 1280332038: goto L_0x018f;
                case 1306947716: goto L_0x0181;
                case 1349174697: goto L_0x0173;
                case 1522194893: goto L_0x0165;
                case 1691543273: goto L_0x0157;
                case 1691544261: goto L_0x0149;
                case 1709443163: goto L_0x013b;
                case 1865889110: goto L_0x012d;
                case 1906253259: goto L_0x011f;
                case 1977196784: goto L_0x0111;
                case 2006372676: goto L_0x0104;
                case 2019281702: goto L_0x00f7;
                case 2029784656: goto L_0x00ea;
                case 2030379515: goto L_0x00dd;
                case 2033393791: goto L_0x00d0;
                case 2047190025: goto L_0x00c3;
                case 2047252157: goto L_0x00b6;
                case 2048319463: goto L_0x00a9;
                case 2048855701: goto L_0x009c;
                default: goto L_0x0099;
            }
        L_0x0099:
            r1 = r8
            goto L_0x0825
        L_0x009c:
            java.lang.String r1 = "HWWAS-H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00a5
            goto L_0x0099
        L_0x00a5:
            r1 = 139(0x8b, float:1.95E-43)
            goto L_0x0825
        L_0x00a9:
            java.lang.String r1 = "HWVNS-H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00b2
            goto L_0x0099
        L_0x00b2:
            r1 = 138(0x8a, float:1.93E-43)
            goto L_0x0825
        L_0x00b6:
            java.lang.String r1 = "ELUGA_Prim"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00bf
            goto L_0x0099
        L_0x00bf:
            r1 = 137(0x89, float:1.92E-43)
            goto L_0x0825
        L_0x00c3:
            java.lang.String r1 = "ELUGA_Note"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00cc
            goto L_0x0099
        L_0x00cc:
            r1 = 136(0x88, float:1.9E-43)
            goto L_0x0825
        L_0x00d0:
            java.lang.String r1 = "ASUS_X00AD_2"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00d9
            goto L_0x0099
        L_0x00d9:
            r1 = 135(0x87, float:1.89E-43)
            goto L_0x0825
        L_0x00dd:
            java.lang.String r1 = "HWCAM-H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00e6
            goto L_0x0099
        L_0x00e6:
            r1 = 134(0x86, float:1.88E-43)
            goto L_0x0825
        L_0x00ea:
            java.lang.String r1 = "HWBLN-H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00f3
            goto L_0x0099
        L_0x00f3:
            r1 = 133(0x85, float:1.86E-43)
            goto L_0x0825
        L_0x00f7:
            java.lang.String r1 = "DM-01K"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0100
            goto L_0x0099
        L_0x0100:
            r1 = 132(0x84, float:1.85E-43)
            goto L_0x0825
        L_0x0104:
            java.lang.String r1 = "BRAVIA_ATV3_4K"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x010d
            goto L_0x0099
        L_0x010d:
            r1 = 131(0x83, float:1.84E-43)
            goto L_0x0825
        L_0x0111:
            java.lang.String r1 = "Infinix-X572"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x011b
            goto L_0x0099
        L_0x011b:
            r1 = 130(0x82, float:1.82E-43)
            goto L_0x0825
        L_0x011f:
            java.lang.String r1 = "PB2-670M"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0129
            goto L_0x0099
        L_0x0129:
            r1 = 129(0x81, float:1.81E-43)
            goto L_0x0825
        L_0x012d:
            java.lang.String r1 = "santoni"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0137
            goto L_0x0099
        L_0x0137:
            r1 = 128(0x80, float:1.794E-43)
            goto L_0x0825
        L_0x013b:
            java.lang.String r1 = "iball8735_9806"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0145
            goto L_0x0099
        L_0x0145:
            r1 = 127(0x7f, float:1.78E-43)
            goto L_0x0825
        L_0x0149:
            java.lang.String r1 = "CPH1715"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0153
            goto L_0x0099
        L_0x0153:
            r1 = 126(0x7e, float:1.77E-43)
            goto L_0x0825
        L_0x0157:
            java.lang.String r1 = "CPH1609"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0161
            goto L_0x0099
        L_0x0161:
            r1 = 125(0x7d, float:1.75E-43)
            goto L_0x0825
        L_0x0165:
            java.lang.String r1 = "woods_f"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x016f
            goto L_0x0099
        L_0x016f:
            r1 = 124(0x7c, float:1.74E-43)
            goto L_0x0825
        L_0x0173:
            java.lang.String r1 = "htc_e56ml_dtul"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x017d
            goto L_0x0099
        L_0x017d:
            r1 = 123(0x7b, float:1.72E-43)
            goto L_0x0825
        L_0x0181:
            java.lang.String r1 = "EverStar_S"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x018b
            goto L_0x0099
        L_0x018b:
            r1 = 122(0x7a, float:1.71E-43)
            goto L_0x0825
        L_0x018f:
            java.lang.String r1 = "hwALE-H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0199
            goto L_0x0099
        L_0x0199:
            r1 = 121(0x79, float:1.7E-43)
            goto L_0x0825
        L_0x019d:
            java.lang.String r1 = "itel_S41"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01a7
            goto L_0x0099
        L_0x01a7:
            r1 = 120(0x78, float:1.68E-43)
            goto L_0x0825
        L_0x01ab:
            java.lang.String r1 = "LS-5017"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01b5
            goto L_0x0099
        L_0x01b5:
            r1 = 119(0x77, float:1.67E-43)
            goto L_0x0825
        L_0x01b9:
            java.lang.String r1 = "panell_d"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01c3
            goto L_0x0099
        L_0x01c3:
            r1 = 118(0x76, float:1.65E-43)
            goto L_0x0825
        L_0x01c7:
            java.lang.String r1 = "j2xlteins"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01d1
            goto L_0x0099
        L_0x01d1:
            r1 = 117(0x75, float:1.64E-43)
            goto L_0x0825
        L_0x01d5:
            java.lang.String r1 = "A7000plus"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01df
            goto L_0x0099
        L_0x01df:
            r1 = 116(0x74, float:1.63E-43)
            goto L_0x0825
        L_0x01e3:
            java.lang.String r1 = "manning"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01ed
            goto L_0x0099
        L_0x01ed:
            r1 = 115(0x73, float:1.61E-43)
            goto L_0x0825
        L_0x01f1:
            java.lang.String r1 = "GIONEE_WBL7519"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01fb
            goto L_0x0099
        L_0x01fb:
            r1 = 114(0x72, float:1.6E-43)
            goto L_0x0825
        L_0x01ff:
            java.lang.String r1 = "GIONEE_WBL7365"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0209
            goto L_0x0099
        L_0x0209:
            r1 = 113(0x71, float:1.58E-43)
            goto L_0x0825
        L_0x020d:
            java.lang.String r1 = "GIONEE_WBL5708"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0217
            goto L_0x0099
        L_0x0217:
            r1 = 112(0x70, float:1.57E-43)
            goto L_0x0825
        L_0x021b:
            java.lang.String r1 = "QM16XE_U"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0225
            goto L_0x0099
        L_0x0225:
            r1 = 111(0x6f, float:1.56E-43)
            goto L_0x0825
        L_0x0229:
            java.lang.String r1 = "Pixi5-10_4G"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0233
            goto L_0x0099
        L_0x0233:
            r1 = 110(0x6e, float:1.54E-43)
            goto L_0x0825
        L_0x0237:
            java.lang.String r1 = "TB3-850M"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0241
            goto L_0x0099
        L_0x0241:
            r1 = 109(0x6d, float:1.53E-43)
            goto L_0x0825
        L_0x0245:
            java.lang.String r1 = "TB3-850F"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x024f
            goto L_0x0099
        L_0x024f:
            r1 = 108(0x6c, float:1.51E-43)
            goto L_0x0825
        L_0x0253:
            java.lang.String r1 = "TB3-730X"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x025d
            goto L_0x0099
        L_0x025d:
            r1 = 107(0x6b, float:1.5E-43)
            goto L_0x0825
        L_0x0261:
            java.lang.String r1 = "TB3-730F"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x026b
            goto L_0x0099
        L_0x026b:
            r1 = 106(0x6a, float:1.49E-43)
            goto L_0x0825
        L_0x026f:
            java.lang.String r1 = "A7020a48"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0279
            goto L_0x0099
        L_0x0279:
            r1 = 105(0x69, float:1.47E-43)
            goto L_0x0825
        L_0x027d:
            java.lang.String r1 = "A7010a48"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0287
            goto L_0x0099
        L_0x0287:
            r1 = 104(0x68, float:1.46E-43)
            goto L_0x0825
        L_0x028b:
            java.lang.String r1 = "griffin"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0295
            goto L_0x0099
        L_0x0295:
            r1 = 103(0x67, float:1.44E-43)
            goto L_0x0825
        L_0x0299:
            java.lang.String r1 = "marino_f"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02a3
            goto L_0x0099
        L_0x02a3:
            r1 = 102(0x66, float:1.43E-43)
            goto L_0x0825
        L_0x02a7:
            java.lang.String r1 = "CPY83_I00"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02b1
            goto L_0x0099
        L_0x02b1:
            r1 = 101(0x65, float:1.42E-43)
            goto L_0x0825
        L_0x02b5:
            java.lang.String r1 = "A2016a40"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02bf
            goto L_0x0099
        L_0x02bf:
            r1 = 100
            goto L_0x0825
        L_0x02c3:
            java.lang.String r1 = "le_x6"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02cd
            goto L_0x0099
        L_0x02cd:
            r1 = 99
            goto L_0x0825
        L_0x02d1:
            java.lang.String r1 = "l5460"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02db
            goto L_0x0099
        L_0x02db:
            r1 = 98
            goto L_0x0825
        L_0x02df:
            java.lang.String r1 = "i9031"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02e9
            goto L_0x0099
        L_0x02e9:
            r1 = 97
            goto L_0x0825
        L_0x02ed:
            java.lang.String r1 = "X3_HK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02f7
            goto L_0x0099
        L_0x02f7:
            r1 = 96
            goto L_0x0825
        L_0x02fb:
            java.lang.String r1 = "V23GB"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0305
            goto L_0x0099
        L_0x0305:
            r1 = 95
            goto L_0x0825
        L_0x0309:
            java.lang.String r1 = "Q4310"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0313
            goto L_0x0099
        L_0x0313:
            r1 = 94
            goto L_0x0825
        L_0x0317:
            java.lang.String r1 = "Q4260"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0321
            goto L_0x0099
        L_0x0321:
            r1 = 93
            goto L_0x0825
        L_0x0325:
            java.lang.String r1 = "PRO7S"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x032f
            goto L_0x0099
        L_0x032f:
            r1 = 92
            goto L_0x0825
        L_0x0333:
            java.lang.String r1 = "F3311"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x033d
            goto L_0x0099
        L_0x033d:
            r1 = 91
            goto L_0x0825
        L_0x0341:
            java.lang.String r1 = "F3215"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x034b
            goto L_0x0099
        L_0x034b:
            r1 = 90
            goto L_0x0825
        L_0x034f:
            java.lang.String r1 = "F3213"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0359
            goto L_0x0099
        L_0x0359:
            r1 = 89
            goto L_0x0825
        L_0x035d:
            java.lang.String r1 = "F3211"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0367
            goto L_0x0099
        L_0x0367:
            r1 = 88
            goto L_0x0825
        L_0x036b:
            java.lang.String r1 = "F3116"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0375
            goto L_0x0099
        L_0x0375:
            r1 = 87
            goto L_0x0825
        L_0x0379:
            java.lang.String r1 = "F3113"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0383
            goto L_0x0099
        L_0x0383:
            r1 = 86
            goto L_0x0825
        L_0x0387:
            java.lang.String r1 = "F3111"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0391
            goto L_0x0099
        L_0x0391:
            r1 = 85
            goto L_0x0825
        L_0x0395:
            java.lang.String r1 = "E5643"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x039f
            goto L_0x0099
        L_0x039f:
            r1 = 84
            goto L_0x0825
        L_0x03a3:
            java.lang.String r1 = "A1601"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03ad
            goto L_0x0099
        L_0x03ad:
            r1 = 83
            goto L_0x0825
        L_0x03b1:
            java.lang.String r1 = "Aura_Note_2"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03bb
            goto L_0x0099
        L_0x03bb:
            r1 = 82
            goto L_0x0825
        L_0x03bf:
            java.lang.String r1 = "602LV"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03c9
            goto L_0x0099
        L_0x03c9:
            r1 = 81
            goto L_0x0825
        L_0x03cd:
            java.lang.String r1 = "601LV"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03d7
            goto L_0x0099
        L_0x03d7:
            r1 = 80
            goto L_0x0825
        L_0x03db:
            java.lang.String r1 = "MEIZU_M5"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03e5
            goto L_0x0099
        L_0x03e5:
            r1 = 79
            goto L_0x0825
        L_0x03e9:
            java.lang.String r1 = "p212"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03f3
            goto L_0x0099
        L_0x03f3:
            r1 = 78
            goto L_0x0825
        L_0x03f7:
            java.lang.String r1 = "mido"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0401
            goto L_0x0099
        L_0x0401:
            r1 = 77
            goto L_0x0825
        L_0x0405:
            java.lang.String r1 = "kate"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x040f
            goto L_0x0099
        L_0x040f:
            r1 = 76
            goto L_0x0825
        L_0x0413:
            java.lang.String r1 = "fugu"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x041d
            goto L_0x0099
        L_0x041d:
            r1 = 75
            goto L_0x0825
        L_0x0421:
            java.lang.String r1 = "XE2X"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x042b
            goto L_0x0099
        L_0x042b:
            r1 = 74
            goto L_0x0825
        L_0x042f:
            java.lang.String r1 = "Q427"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0439
            goto L_0x0099
        L_0x0439:
            r1 = 73
            goto L_0x0825
        L_0x043d:
            java.lang.String r1 = "Q350"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0447
            goto L_0x0099
        L_0x0447:
            r1 = 72
            goto L_0x0825
        L_0x044b:
            java.lang.String r1 = "P681"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0455
            goto L_0x0099
        L_0x0455:
            r1 = 71
            goto L_0x0825
        L_0x0459:
            java.lang.String r1 = "F04J"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0463
            goto L_0x0099
        L_0x0463:
            r1 = 70
            goto L_0x0825
        L_0x0467:
            java.lang.String r1 = "F04H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0471
            goto L_0x0099
        L_0x0471:
            r1 = 69
            goto L_0x0825
        L_0x0475:
            java.lang.String r1 = "F03H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x047f
            goto L_0x0099
        L_0x047f:
            r1 = 68
            goto L_0x0825
        L_0x0483:
            java.lang.String r1 = "F02H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x048d
            goto L_0x0099
        L_0x048d:
            r1 = 67
            goto L_0x0825
        L_0x0491:
            java.lang.String r1 = "F01J"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x049b
            goto L_0x0099
        L_0x049b:
            r1 = 66
            goto L_0x0825
        L_0x049f:
            java.lang.String r1 = "F01H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04a9
            goto L_0x0099
        L_0x04a9:
            r1 = 65
            goto L_0x0825
        L_0x04ad:
            java.lang.String r1 = "1714"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04b7
            goto L_0x0099
        L_0x04b7:
            r1 = 64
            goto L_0x0825
        L_0x04bb:
            java.lang.String r1 = "1713"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04c5
            goto L_0x0099
        L_0x04c5:
            r1 = 63
            goto L_0x0825
        L_0x04c9:
            java.lang.String r1 = "1601"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04d3
            goto L_0x0099
        L_0x04d3:
            r1 = 62
            goto L_0x0825
        L_0x04d7:
            java.lang.String r1 = "flo"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04e1
            goto L_0x0099
        L_0x04e1:
            r1 = 61
            goto L_0x0825
        L_0x04e5:
            java.lang.String r1 = "deb"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04ef
            goto L_0x0099
        L_0x04ef:
            r1 = 60
            goto L_0x0825
        L_0x04f3:
            java.lang.String r1 = "cv3"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04fd
            goto L_0x0099
        L_0x04fd:
            r1 = 59
            goto L_0x0825
        L_0x0501:
            java.lang.String r1 = "cv1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x050b
            goto L_0x0099
        L_0x050b:
            r1 = 58
            goto L_0x0825
        L_0x050f:
            java.lang.String r1 = "Z80"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0519
            goto L_0x0099
        L_0x0519:
            r1 = 57
            goto L_0x0825
        L_0x051d:
            java.lang.String r1 = "QX1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0527
            goto L_0x0099
        L_0x0527:
            r1 = 56
            goto L_0x0825
        L_0x052b:
            java.lang.String r1 = "PLE"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0535
            goto L_0x0099
        L_0x0535:
            r1 = 55
            goto L_0x0825
        L_0x0539:
            java.lang.String r1 = "P85"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0543
            goto L_0x0099
        L_0x0543:
            r1 = 54
            goto L_0x0825
        L_0x0547:
            java.lang.String r1 = "MX6"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0551
            goto L_0x0099
        L_0x0551:
            r1 = 53
            goto L_0x0825
        L_0x0555:
            java.lang.String r1 = "M5c"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x055f
            goto L_0x0099
        L_0x055f:
            r1 = 52
            goto L_0x0825
        L_0x0563:
            java.lang.String r1 = "M04"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x056d
            goto L_0x0099
        L_0x056d:
            r1 = 51
            goto L_0x0825
        L_0x0571:
            java.lang.String r1 = "JGZ"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x057b
            goto L_0x0099
        L_0x057b:
            r1 = 50
            goto L_0x0825
        L_0x057f:
            java.lang.String r1 = "mh"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0589
            goto L_0x0099
        L_0x0589:
            r1 = 49
            goto L_0x0825
        L_0x058d:
            java.lang.String r1 = "b5"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0597
            goto L_0x0099
        L_0x0597:
            r1 = 48
            goto L_0x0825
        L_0x059b:
            java.lang.String r1 = "V5"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x05a5
            goto L_0x0099
        L_0x05a5:
            r1 = 47
            goto L_0x0825
        L_0x05a9:
            java.lang.String r1 = "V1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x05b3
            goto L_0x0099
        L_0x05b3:
            r1 = 46
            goto L_0x0825
        L_0x05b7:
            java.lang.String r1 = "Q5"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x05c1
            goto L_0x0099
        L_0x05c1:
            r1 = 45
            goto L_0x0825
        L_0x05c5:
            java.lang.String r1 = "C1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x05cf
            goto L_0x0099
        L_0x05cf:
            r1 = 44
            goto L_0x0825
        L_0x05d3:
            java.lang.String r1 = "woods_fn"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x05dd
            goto L_0x0099
        L_0x05dd:
            r1 = 43
            goto L_0x0825
        L_0x05e1:
            java.lang.String r1 = "ELUGA_A3_Pro"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x05eb
            goto L_0x0099
        L_0x05eb:
            r1 = 42
            goto L_0x0825
        L_0x05ef:
            java.lang.String r1 = "Z12_PRO"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x05f9
            goto L_0x0099
        L_0x05f9:
            r1 = 41
            goto L_0x0825
        L_0x05fd:
            java.lang.String r1 = "BLACK-1X"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0607
            goto L_0x0099
        L_0x0607:
            r1 = 40
            goto L_0x0825
        L_0x060b:
            java.lang.String r1 = "taido_row"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0615
            goto L_0x0099
        L_0x0615:
            r1 = 39
            goto L_0x0825
        L_0x0619:
            java.lang.String r1 = "Pixi4-7_3G"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0623
            goto L_0x0099
        L_0x0623:
            r1 = 38
            goto L_0x0825
        L_0x0627:
            java.lang.String r1 = "GIONEE_GBL7360"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0631
            goto L_0x0099
        L_0x0631:
            r1 = 37
            goto L_0x0825
        L_0x0635:
            java.lang.String r1 = "GiONEE_CBL7513"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x063f
            goto L_0x0099
        L_0x063f:
            r1 = 36
            goto L_0x0825
        L_0x0643:
            java.lang.String r1 = "OnePlus5T"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x064d
            goto L_0x0099
        L_0x064d:
            r1 = 35
            goto L_0x0825
        L_0x0651:
            java.lang.String r1 = "whyred"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x065b
            goto L_0x0099
        L_0x065b:
            r1 = 34
            goto L_0x0825
        L_0x065f:
            java.lang.String r1 = "watson"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0669
            goto L_0x0099
        L_0x0669:
            r1 = 33
            goto L_0x0825
        L_0x066d:
            java.lang.String r1 = "SVP-DTV15"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0677
            goto L_0x0099
        L_0x0677:
            r1 = 32
            goto L_0x0825
        L_0x067b:
            java.lang.String r1 = "A7000-a"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0685
            goto L_0x0099
        L_0x0685:
            r1 = 31
            goto L_0x0825
        L_0x0689:
            java.lang.String r1 = "nicklaus_f"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0693
            goto L_0x0099
        L_0x0693:
            r1 = 30
            goto L_0x0825
        L_0x0697:
            java.lang.String r1 = "tcl_eu"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x06a1
            goto L_0x0099
        L_0x06a1:
            r1 = 29
            goto L_0x0825
        L_0x06a5:
            java.lang.String r1 = "ELUGA_Ray_X"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x06af
            goto L_0x0099
        L_0x06af:
            r1 = r6
            goto L_0x0825
        L_0x06b2:
            java.lang.String r1 = "s905x018"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x06bc
            goto L_0x0099
        L_0x06bc:
            r1 = r11
            goto L_0x0825
        L_0x06bf:
            java.lang.String r1 = "A10-70L"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x06c9
            goto L_0x0099
        L_0x06c9:
            r1 = r12
            goto L_0x0825
        L_0x06cc:
            java.lang.String r1 = "A10-70F"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x06d6
            goto L_0x0099
        L_0x06d6:
            r1 = 25
            goto L_0x0825
        L_0x06da:
            java.lang.String r1 = "namath"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x06e4
            goto L_0x0099
        L_0x06e4:
            r1 = 24
            goto L_0x0825
        L_0x06e8:
            java.lang.String r1 = "Slate_Pro"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x06f2
            goto L_0x0099
        L_0x06f2:
            r1 = 23
            goto L_0x0825
        L_0x06f6:
            java.lang.String r1 = "iris60"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0700
            goto L_0x0099
        L_0x0700:
            r1 = 22
            goto L_0x0825
        L_0x0704:
            java.lang.String r1 = "BRAVIA_ATV2"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x070e
            goto L_0x0099
        L_0x070e:
            r1 = 21
            goto L_0x0825
        L_0x0712:
            java.lang.String r1 = "GiONEE_GBL7319"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x071c
            goto L_0x0099
        L_0x071c:
            r1 = 20
            goto L_0x0825
        L_0x0720:
            java.lang.String r1 = "panell_dt"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x072a
            goto L_0x0099
        L_0x072a:
            r1 = 19
            goto L_0x0825
        L_0x072e:
            java.lang.String r1 = "panell_ds"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0738
            goto L_0x0099
        L_0x0738:
            r1 = 18
            goto L_0x0825
        L_0x073c:
            java.lang.String r1 = "panell_dl"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0746
            goto L_0x0099
        L_0x0746:
            r1 = 17
            goto L_0x0825
        L_0x074a:
            java.lang.String r1 = "vernee_M5"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0754
            goto L_0x0099
        L_0x0754:
            r1 = 16
            goto L_0x0825
        L_0x0758:
            java.lang.String r1 = "pacificrim"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0762
            goto L_0x0099
        L_0x0762:
            r1 = 15
            goto L_0x0825
        L_0x0766:
            java.lang.String r1 = "Phantom6"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0770
            goto L_0x0099
        L_0x0770:
            r1 = 14
            goto L_0x0825
        L_0x0774:
            java.lang.String r1 = "ComioS1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x077e
            goto L_0x0099
        L_0x077e:
            r1 = 13
            goto L_0x0825
        L_0x0782:
            java.lang.String r1 = "XT1663"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x078c
            goto L_0x0099
        L_0x078c:
            r1 = 12
            goto L_0x0825
        L_0x0790:
            java.lang.String r1 = "RAIJIN"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x079a
            goto L_0x0099
        L_0x079a:
            r1 = 11
            goto L_0x0825
        L_0x079e:
            java.lang.String r1 = "AquaPowerM"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x07a8
            goto L_0x0099
        L_0x07a8:
            r1 = 10
            goto L_0x0825
        L_0x07ac:
            java.lang.String r1 = "PGN611"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x07b6
            goto L_0x0099
        L_0x07b6:
            r1 = 9
            goto L_0x0825
        L_0x07ba:
            java.lang.String r1 = "PGN610"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x07c4
            goto L_0x0099
        L_0x07c4:
            r1 = 8
            goto L_0x0825
        L_0x07c8:
            java.lang.String r2 = "PGN528"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0825
            goto L_0x0099
        L_0x07d2:
            java.lang.String r1 = "NX573J"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x07dc
            goto L_0x0099
        L_0x07dc:
            r1 = r2
            goto L_0x0825
        L_0x07de:
            java.lang.String r1 = "NX541J"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x07e8
            goto L_0x0099
        L_0x07e8:
            r1 = r3
            goto L_0x0825
        L_0x07ea:
            java.lang.String r1 = "CP8676_I02"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x07f4
            goto L_0x0099
        L_0x07f4:
            r1 = r4
            goto L_0x0825
        L_0x07f6:
            java.lang.String r1 = "K50a40"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0800
            goto L_0x0099
        L_0x0800:
            r1 = r5
            goto L_0x0825
        L_0x0802:
            java.lang.String r1 = "GIONEE_SWW1631"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x080c
            goto L_0x0099
        L_0x080c:
            r1 = r7
            goto L_0x0825
        L_0x080e:
            java.lang.String r1 = "GIONEE_SWW1627"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0818
            goto L_0x0099
        L_0x0818:
            r1 = r10
            goto L_0x0825
        L_0x081a:
            java.lang.String r1 = "GIONEE_SWW1609"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0824
            goto L_0x0099
        L_0x0824:
            r1 = r9
        L_0x0825:
            switch(r1) {
                case 0: goto L_0x0858;
                case 1: goto L_0x0858;
                case 2: goto L_0x0858;
                case 3: goto L_0x0858;
                case 4: goto L_0x0858;
                case 5: goto L_0x0858;
                case 6: goto L_0x0858;
                case 7: goto L_0x0858;
                case 8: goto L_0x0858;
                case 9: goto L_0x0858;
                case 10: goto L_0x0858;
                case 11: goto L_0x0858;
                case 12: goto L_0x0858;
                case 13: goto L_0x0858;
                case 14: goto L_0x0858;
                case 15: goto L_0x0858;
                case 16: goto L_0x0858;
                case 17: goto L_0x0858;
                case 18: goto L_0x0858;
                case 19: goto L_0x0858;
                case 20: goto L_0x0858;
                case 21: goto L_0x0858;
                case 22: goto L_0x0858;
                case 23: goto L_0x0858;
                case 24: goto L_0x0858;
                case 25: goto L_0x0858;
                case 26: goto L_0x0858;
                case 27: goto L_0x0858;
                case 28: goto L_0x0858;
                case 29: goto L_0x0858;
                case 30: goto L_0x0858;
                case 31: goto L_0x0858;
                case 32: goto L_0x0858;
                case 33: goto L_0x0858;
                case 34: goto L_0x0858;
                case 35: goto L_0x0858;
                case 36: goto L_0x0858;
                case 37: goto L_0x0858;
                case 38: goto L_0x0858;
                case 39: goto L_0x0858;
                case 40: goto L_0x0858;
                case 41: goto L_0x0858;
                case 42: goto L_0x0858;
                case 43: goto L_0x0858;
                case 44: goto L_0x0858;
                case 45: goto L_0x0858;
                case 46: goto L_0x0858;
                case 47: goto L_0x0858;
                case 48: goto L_0x0858;
                case 49: goto L_0x0858;
                case 50: goto L_0x0858;
                case 51: goto L_0x0858;
                case 52: goto L_0x0858;
                case 53: goto L_0x0858;
                case 54: goto L_0x0858;
                case 55: goto L_0x0858;
                case 56: goto L_0x0858;
                case 57: goto L_0x0858;
                case 58: goto L_0x0858;
                case 59: goto L_0x0858;
                case 60: goto L_0x0858;
                case 61: goto L_0x0858;
                case 62: goto L_0x0858;
                case 63: goto L_0x0858;
                case 64: goto L_0x0858;
                case 65: goto L_0x0858;
                case 66: goto L_0x0858;
                case 67: goto L_0x0858;
                case 68: goto L_0x0858;
                case 69: goto L_0x0858;
                case 70: goto L_0x0858;
                case 71: goto L_0x0858;
                case 72: goto L_0x0858;
                case 73: goto L_0x0858;
                case 74: goto L_0x0858;
                case 75: goto L_0x0858;
                case 76: goto L_0x0858;
                case 77: goto L_0x0858;
                case 78: goto L_0x0858;
                case 79: goto L_0x0858;
                case 80: goto L_0x0858;
                case 81: goto L_0x0858;
                case 82: goto L_0x0858;
                case 83: goto L_0x0858;
                case 84: goto L_0x0858;
                case 85: goto L_0x0858;
                case 86: goto L_0x0858;
                case 87: goto L_0x0858;
                case 88: goto L_0x0858;
                case 89: goto L_0x0858;
                case 90: goto L_0x0858;
                case 91: goto L_0x0858;
                case 92: goto L_0x0858;
                case 93: goto L_0x0858;
                case 94: goto L_0x0858;
                case 95: goto L_0x0858;
                case 96: goto L_0x0858;
                case 97: goto L_0x0858;
                case 98: goto L_0x0858;
                case 99: goto L_0x0858;
                case 100: goto L_0x0858;
                case 101: goto L_0x0858;
                case 102: goto L_0x0858;
                case 103: goto L_0x0858;
                case 104: goto L_0x0858;
                case 105: goto L_0x0858;
                case 106: goto L_0x0858;
                case 107: goto L_0x0858;
                case 108: goto L_0x0858;
                case 109: goto L_0x0858;
                case 110: goto L_0x0858;
                case 111: goto L_0x0858;
                case 112: goto L_0x0858;
                case 113: goto L_0x0858;
                case 114: goto L_0x0858;
                case 115: goto L_0x0858;
                case 116: goto L_0x0858;
                case 117: goto L_0x0858;
                case 118: goto L_0x0858;
                case 119: goto L_0x0858;
                case 120: goto L_0x0858;
                case 121: goto L_0x0858;
                case 122: goto L_0x0858;
                case 123: goto L_0x0858;
                case 124: goto L_0x0858;
                case 125: goto L_0x0858;
                case 126: goto L_0x0858;
                case 127: goto L_0x0858;
                case 128: goto L_0x0858;
                case 129: goto L_0x0858;
                case 130: goto L_0x0858;
                case 131: goto L_0x0858;
                case 132: goto L_0x0858;
                case 133: goto L_0x0858;
                case 134: goto L_0x0858;
                case 135: goto L_0x0858;
                case 136: goto L_0x0858;
                case 137: goto L_0x0858;
                case 138: goto L_0x0858;
                case 139: goto L_0x0858;
                default: goto L_0x0828;
            }
        L_0x0828:
            java.lang.String r0 = p000.w67.f19024d
            r0.hashCode()
            int r1 = r0.hashCode()
            switch(r1) {
                case -594534941: goto L_0x084a;
                case 2006354: goto L_0x083f;
                case 2006367: goto L_0x0836;
                default: goto L_0x0834;
            }
        L_0x0834:
            r7 = r8
            goto L_0x0854
        L_0x0836:
            java.lang.String r1 = "AFTN"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0854
            goto L_0x0834
        L_0x083f:
            java.lang.String r1 = "AFTA"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0848
            goto L_0x0834
        L_0x0848:
            r7 = r10
            goto L_0x0854
        L_0x084a:
            java.lang.String r1 = "JSN-L21"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0853
            goto L_0x0834
        L_0x0853:
            r7 = r9
        L_0x0854:
            switch(r7) {
                case 0: goto L_0x0858;
                case 1: goto L_0x0858;
                case 2: goto L_0x0858;
                default: goto L_0x0857;
            }
        L_0x0857:
            goto L_0x0859
        L_0x0858:
            return r10
        L_0x0859:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.cr3.m14399w1():boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007b, code lost:
        if (r3.equals("video/av01") == false) goto L_0x0040;
     */
    /* renamed from: x1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m14400x1(androidx.media3.exoplayer.mediacodec.C0945d r10, androidx.media3.common.C0792h r11) {
        /*
            int r0 = r11.f4180P
            int r1 = r11.f4181Q
            r2 = -1
            if (r0 == r2) goto L_0x00ce
            if (r1 != r2) goto L_0x000b
            goto L_0x00ce
        L_0x000b:
            java.lang.String r3 = r11.f4175C
            java.lang.String r4 = "video/dolby-vision"
            boolean r4 = r4.equals(r3)
            java.lang.String r5 = "video/avc"
            java.lang.String r6 = "video/hevc"
            r7 = 1
            r8 = 2
            if (r4 == 0) goto L_0x0034
            android.util.Pair r11 = androidx.media3.exoplayer.mediacodec.MediaCodecUtil.m6828q(r11)
            if (r11 == 0) goto L_0x0033
            java.lang.Object r11 = r11.first
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r3 = 512(0x200, float:7.175E-43)
            if (r11 == r3) goto L_0x0031
            if (r11 == r7) goto L_0x0031
            if (r11 != r8) goto L_0x0033
        L_0x0031:
            r3 = r5
            goto L_0x0034
        L_0x0033:
            r3 = r6
        L_0x0034:
            r3.hashCode()
            int r11 = r3.hashCode()
            r4 = 4
            r9 = 3
            switch(r11) {
                case -1664118616: goto L_0x007e;
                case -1662735862: goto L_0x0075;
                case -1662541442: goto L_0x006c;
                case 1187890754: goto L_0x0061;
                case 1331836730: goto L_0x0058;
                case 1599127256: goto L_0x004d;
                case 1599127257: goto L_0x0042;
                default: goto L_0x0040;
            }
        L_0x0040:
            r7 = r2
            goto L_0x0088
        L_0x0042:
            java.lang.String r11 = "video/x-vnd.on2.vp9"
            boolean r11 = r3.equals(r11)
            if (r11 != 0) goto L_0x004b
            goto L_0x0040
        L_0x004b:
            r7 = 6
            goto L_0x0088
        L_0x004d:
            java.lang.String r11 = "video/x-vnd.on2.vp8"
            boolean r11 = r3.equals(r11)
            if (r11 != 0) goto L_0x0056
            goto L_0x0040
        L_0x0056:
            r7 = 5
            goto L_0x0088
        L_0x0058:
            boolean r11 = r3.equals(r5)
            if (r11 != 0) goto L_0x005f
            goto L_0x0040
        L_0x005f:
            r7 = r4
            goto L_0x0088
        L_0x0061:
            java.lang.String r11 = "video/mp4v-es"
            boolean r11 = r3.equals(r11)
            if (r11 != 0) goto L_0x006a
            goto L_0x0040
        L_0x006a:
            r7 = r9
            goto L_0x0088
        L_0x006c:
            boolean r11 = r3.equals(r6)
            if (r11 != 0) goto L_0x0073
            goto L_0x0040
        L_0x0073:
            r7 = r8
            goto L_0x0088
        L_0x0075:
            java.lang.String r11 = "video/av01"
            boolean r11 = r3.equals(r11)
            if (r11 != 0) goto L_0x0088
            goto L_0x0040
        L_0x007e:
            java.lang.String r11 = "video/3gpp"
            boolean r11 = r3.equals(r11)
            if (r11 != 0) goto L_0x0087
            goto L_0x0040
        L_0x0087:
            r7 = 0
        L_0x0088:
            switch(r7) {
                case 0: goto L_0x00c7;
                case 1: goto L_0x00c7;
                case 2: goto L_0x00c4;
                case 3: goto L_0x00c7;
                case 4: goto L_0x008c;
                case 5: goto L_0x00c7;
                case 6: goto L_0x00c4;
                default: goto L_0x008b;
            }
        L_0x008b:
            return r2
        L_0x008c:
            java.lang.String r11 = p000.w67.f19024d
            java.lang.String r3 = "BRAVIA 4K 2015"
            boolean r3 = r3.equals(r11)
            if (r3 != 0) goto L_0x00c3
            java.lang.String r3 = p000.w67.f19023c
            java.lang.String r4 = "Amazon"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x00b5
            java.lang.String r3 = "KFSOWI"
            boolean r3 = r3.equals(r11)
            if (r3 != 0) goto L_0x00c3
            java.lang.String r3 = "AFTS"
            boolean r11 = r3.equals(r11)
            if (r11 == 0) goto L_0x00b5
            boolean r10 = r10.f5130g
            if (r10 == 0) goto L_0x00b5
            goto L_0x00c3
        L_0x00b5:
            r10 = 16
            int r11 = p000.w67.m29364l(r0, r10)
            int r0 = p000.w67.m29364l(r1, r10)
            int r11 = r11 * r0
            int r11 = r11 * r10
            int r11 = r11 * r10
            goto L_0x00c9
        L_0x00c3:
            return r2
        L_0x00c4:
            int r11 = r0 * r1
            goto L_0x00ca
        L_0x00c7:
            int r11 = r0 * r1
        L_0x00c9:
            r4 = r8
        L_0x00ca:
            int r11 = r11 * r9
            int r4 = r4 * r8
            int r11 = r11 / r4
            return r11
        L_0x00ce:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.cr3.m14400x1(androidx.media3.exoplayer.mediacodec.d, androidx.media3.common.h):int");
    }

    /* renamed from: y1 */
    public static Point m14401y1(C0945d dVar, C0792h hVar) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4 = hVar.f4181Q;
        int i5 = hVar.f4180P;
        if (i4 > i5) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = i4;
        } else {
            i = i5;
        }
        if (z) {
            i4 = i5;
        }
        float f = ((float) i4) / ((float) i);
        for (int i6 : f10215c3) {
            int i7 = (int) (((float) i6) * f);
            if (i6 <= i || i7 <= i4) {
                break;
            }
            if (w67.f19021a >= 21) {
                if (z) {
                    i3 = i7;
                } else {
                    i3 = i6;
                }
                if (!z) {
                    i6 = i7;
                }
                Point b = dVar.mo7505b(i3, i6);
                if (dVar.mo7516u(b.x, b.y, (double) hVar.f4182U)) {
                    return b;
                }
            } else {
                try {
                    int l = w67.m29364l(i6, 16) * 16;
                    int l2 = w67.m29364l(i7, 16) * 16;
                    if (l * l2 <= MediaCodecUtil.m6807N()) {
                        if (z) {
                            i2 = l2;
                        } else {
                            i2 = l;
                        }
                        if (!z) {
                            l = l2;
                        }
                        return new Point(i2, l);
                    }
                } catch (MediaCodecUtil.DecoderQueryException unused) {
                }
            }
        }
        return null;
    }

    @SuppressLint({"InlinedApi"})
    @TargetApi(21)
    /* renamed from: C1 */
    public MediaFormat mo18233C1(C0792h hVar, String str, C2113a aVar, float f, boolean z, int i) {
        Pair<Integer, Integer> q;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", hVar.f4180P);
        mediaFormat.setInteger("height", hVar.f4181Q);
        dr3.m15340e(mediaFormat, hVar.f4177I);
        dr3.m15338c(mediaFormat, "frame-rate", hVar.f4182U);
        dr3.m15339d(mediaFormat, "rotation-degrees", hVar.f4183X);
        dr3.m15337b(mediaFormat, hVar.f4194k0);
        if ("video/dolby-vision".equals(hVar.f4175C) && (q = MediaCodecUtil.m6828q(hVar)) != null) {
            dr3.m15339d(mediaFormat, "profile", ((Integer) q.first).intValue());
        }
        mediaFormat.setInteger("max-width", aVar.f10253a);
        mediaFormat.setInteger("max-height", aVar.f10254b);
        dr3.m15339d(mediaFormat, "max-input-size", aVar.f10255c);
        if (w67.f19021a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (z) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i != 0) {
            m14397t1(mediaFormat, i);
        }
        return mediaFormat;
    }

    /* renamed from: F1 */
    public boolean mo18234F1(long j, boolean z) throws ExoPlaybackException {
        int P = mo21682P(j);
        if (P == 0) {
            return false;
        }
        if (z) {
            n31 n31 = this.f5083o2;
            n31.f15309d += P;
            n31.f15311f += this.f10232O2;
        } else {
            this.f5083o2.f15315j++;
            mo18255b2(P, this.f10232O2);
        }
        mo7456l0();
        return true;
    }

    /* renamed from: G */
    public void mo7133G() {
        mo18258r1();
        mo18257q1();
        this.f10222E2 = false;
        this.f10244a3 = null;
        try {
            super.mo7133G();
        } finally {
            this.f10248v2.mo28401m(this.f5083o2);
        }
    }

    /* renamed from: G1 */
    public final void mo18235G1() {
        if (this.f10230M2 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f10248v2.mo28402n(this.f10230M2, elapsedRealtime - this.f10229L2);
            this.f10230M2 = 0;
            this.f10229L2 = elapsedRealtime;
        }
    }

    /* renamed from: H */
    public void mo7134H(boolean z, boolean z2) throws ExoPlaybackException {
        boolean z3;
        super.mo7134H(z, z2);
        boolean z4 = mo21674A().f16391a;
        if (!z4 || this.f10243Z2 != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        C2725kr.m20987g(z3);
        if (this.f10242Y2 != z4) {
            this.f10242Y2 = z4;
            mo7434V0();
        }
        this.f10248v2.mo28403o(this.f5083o2);
        this.f10225H2 = z2;
        this.f10226I2 = false;
    }

    /* renamed from: H1 */
    public void mo18236H1() {
        this.f10226I2 = true;
        if (!this.f10224G2) {
            this.f10224G2 = true;
            this.f10248v2.mo28395A(this.f10220C2);
            this.f10222E2 = true;
        }
    }

    /* renamed from: I */
    public void mo7135I(long j, boolean z) throws ExoPlaybackException {
        super.mo7135I(j, z);
        mo18257q1();
        this.f10247u2.mo23548j();
        this.f10233P2 = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        this.f10227J2 = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        this.f10231N2 = 0;
        if (z) {
            mo18247T1();
        } else {
            this.f10228K2 = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        }
    }

    /* renamed from: I0 */
    public void mo7136I0(Exception exc) {
        gk3.m18127d("MediaCodecVideoRenderer", "Video codec error", exc);
        this.f10248v2.mo28397C(exc);
    }

    /* renamed from: I1 */
    public final void mo18237I1() {
        int i = this.f10236S2;
        if (i != 0) {
            this.f10248v2.mo28396B(this.f10235R2, i);
            this.f10235R2 = 0;
            this.f10236S2 = 0;
        }
    }

    @TargetApi(17)
    /* renamed from: J */
    public void mo7137J() {
        try {
            super.mo7137J();
        } finally {
            if (this.f10221D2 != null) {
                mo18244P1();
            }
        }
    }

    /* renamed from: J0 */
    public void mo7138J0(String str, C0941c.C0942a aVar, long j, long j2) {
        this.f10248v2.mo28399k(str, j, j2);
        this.f10218A2 = mo18259s1(str);
        this.f10219B2 = ((C0945d) C2725kr.m20985e(mo7463p0())).mo7512n();
        if (w67.f19021a >= 23 && this.f10242Y2) {
            this.f10244a3 = new C2114b((C0941c) C2725kr.m20985e(mo7462o0()));
        }
    }

    /* renamed from: J1 */
    public final void mo18238J1() {
        int i = this.f10237T2;
        if (i != -1 || this.f10238U2 != -1) {
            C0844x xVar = this.f10241X2;
            if (xVar == null || xVar.f4556a != i || xVar.f4557d != this.f10238U2 || xVar.f4558e != this.f10239V2 || xVar.f4559g != this.f10240W2) {
                C0844x xVar2 = new C0844x(this.f10237T2, this.f10238U2, this.f10239V2, this.f10240W2);
                this.f10241X2 = xVar2;
                this.f10248v2.mo28398D(xVar2);
            }
        }
    }

    /* renamed from: K */
    public void mo7139K() {
        super.mo7139K();
        this.f10230M2 = 0;
        this.f10229L2 = SystemClock.elapsedRealtime();
        this.f10234Q2 = SystemClock.elapsedRealtime() * 1000;
        this.f10235R2 = 0;
        this.f10236S2 = 0;
        this.f10247u2.mo23549k();
    }

    /* renamed from: K0 */
    public void mo7140K0(String str) {
        this.f10248v2.mo28400l(str);
    }

    /* renamed from: K1 */
    public final void mo18239K1() {
        if (this.f10222E2) {
            this.f10248v2.mo28395A(this.f10220C2);
        }
    }

    /* renamed from: L */
    public void mo7141L() {
        this.f10228K2 = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        mo18235G1();
        mo18237I1();
        this.f10247u2.mo23550l();
        super.mo7141L();
    }

    /* renamed from: L0 */
    public p31 mo7142L0(c82 c82) throws ExoPlaybackException {
        p31 L0 = super.mo7142L0(c82);
        this.f10248v2.mo28404p(c82.f8368b, L0);
        return L0;
    }

    /* renamed from: L1 */
    public final void mo18240L1() {
        C0844x xVar = this.f10241X2;
        if (xVar != null) {
            this.f10248v2.mo28398D(xVar);
        }
    }

    /* renamed from: M0 */
    public void mo7143M0(C0792h hVar, MediaFormat mediaFormat) {
        boolean z;
        int i;
        int i2;
        C0941c o0 = mo7462o0();
        if (o0 != null) {
            o0.mo7488e(this.f10223F2);
        }
        if (this.f10242Y2) {
            this.f10237T2 = hVar.f4180P;
            this.f10238U2 = hVar.f4181Q;
        } else {
            C2725kr.m20985e(mediaFormat);
            if (!mediaFormat.containsKey("crop-right") || !mediaFormat.containsKey("crop-left") || !mediaFormat.containsKey("crop-bottom") || !mediaFormat.containsKey("crop-top")) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                i = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
            } else {
                i = mediaFormat.getInteger("width");
            }
            this.f10237T2 = i;
            if (z) {
                i2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
            } else {
                i2 = mediaFormat.getInteger("height");
            }
            this.f10238U2 = i2;
        }
        float f = hVar.f4184Y;
        this.f10240W2 = f;
        if (w67.f19021a >= 21) {
            int i3 = hVar.f4183X;
            if (i3 == 90 || i3 == 270) {
                int i4 = this.f10237T2;
                this.f10237T2 = this.f10238U2;
                this.f10238U2 = i4;
                this.f10240W2 = 1.0f / f;
            }
        } else {
            this.f10239V2 = hVar.f4183X;
        }
        this.f10247u2.mo23545g(hVar.f4182U);
    }

    /* renamed from: M1 */
    public final void mo18241M1(long j, long j2, C0792h hVar) {
        k97 k97 = this.f10245b3;
        if (k97 != null) {
            k97.mo22236d(j, j2, hVar, mo7466s0());
        }
    }

    /* renamed from: N0 */
    public void mo7426N0(long j) {
        super.mo7426N0(j);
        if (!this.f10242Y2) {
            this.f10232O2--;
        }
    }

    /* renamed from: N1 */
    public void mo18242N1(long j) throws ExoPlaybackException {
        mo7461n1(j);
        mo18238J1();
        this.f5083o2.f15310e++;
        mo18236H1();
        mo7426N0(j);
    }

    /* renamed from: O0 */
    public void mo7144O0() {
        super.mo7144O0();
        mo18257q1();
    }

    /* renamed from: O1 */
    public final void mo18243O1() {
        mo7442c1();
    }

    /* renamed from: P0 */
    public void mo7145P0(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
        boolean z = this.f10242Y2;
        if (!z) {
            this.f10232O2++;
        }
        if (w67.f19021a < 23 && z) {
            mo18242N1(decoderInputBuffer.f4594k);
        }
    }

    /* renamed from: P1 */
    public final void mo18244P1() {
        Surface surface = this.f10220C2;
        PlaceholderSurface placeholderSurface = this.f10221D2;
        if (surface == placeholderSurface) {
            this.f10220C2 = null;
        }
        placeholderSurface.release();
        this.f10221D2 = null;
    }

    /* renamed from: Q1 */
    public void mo18245Q1(C0941c cVar, int i, long j) {
        mo18238J1();
        ps6.m25173a("releaseOutputBuffer");
        cVar.mo7498n(i, true);
        ps6.m25175c();
        this.f10234Q2 = SystemClock.elapsedRealtime() * 1000;
        this.f5083o2.f15310e++;
        this.f10231N2 = 0;
        mo18236H1();
    }

    /* renamed from: R0 */
    public boolean mo7146R0(long j, long j2, C0941c cVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C0792h hVar) throws ExoPlaybackException {
        long j4;
        boolean z3;
        long j5 = j;
        C0941c cVar2 = cVar;
        int i4 = i;
        long j6 = j3;
        C2725kr.m20985e(cVar);
        if (this.f10227J2 == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            this.f10227J2 = j5;
        }
        if (j6 != this.f10233P2) {
            this.f10247u2.mo23546h(j6);
            this.f10233P2 = j6;
        }
        long w0 = mo7470w0();
        long j7 = j6 - w0;
        if (!z || z2) {
            double x0 = (double) mo7471x0();
            boolean z4 = getState() == 2;
            long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
            long j8 = (long) (((double) (j6 - j5)) / x0);
            if (z4) {
                j8 -= elapsedRealtime - j2;
            }
            if (this.f10220C2 != this.f10221D2) {
                long j9 = elapsedRealtime - this.f10234Q2;
                if (this.f10226I2 ? this.f10224G2 : !z4 && !this.f10225H2) {
                    j4 = j9;
                    z3 = false;
                } else {
                    z3 = true;
                    j4 = j9;
                }
                if (this.f10228K2 == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED && j5 >= w0 && (z3 || (z4 && mo18252Y1(j8, j4)))) {
                    long nanoTime = System.nanoTime();
                    mo18241M1(j7, nanoTime, hVar);
                    if (w67.f19021a >= 21) {
                        mo18246R1(cVar, i, j7, nanoTime);
                    } else {
                        mo18245Q1(cVar2, i4, j7);
                    }
                    mo18256c2(j8);
                    return true;
                }
                if (z4 && j5 != this.f10227J2) {
                    long nanoTime2 = System.nanoTime();
                    long b = this.f10247u2.mo23543b((j8 * 1000) + nanoTime2);
                    long j10 = (b - nanoTime2) / 1000;
                    long j11 = j10;
                    boolean z5 = this.f10228K2 != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
                    if (mo18250W1(j10, j2, z2) && mo18234F1(j5, z5)) {
                        return false;
                    }
                    if (mo18251X1(j11, j2, z2)) {
                        if (z5) {
                            mo18254a2(cVar2, i4, j7);
                        } else {
                            mo18260v1(cVar2, i4, j7);
                        }
                        mo18256c2(j11);
                        return true;
                    }
                    long j12 = j11;
                    if (w67.f19021a >= 21) {
                        if (j12 < 50000) {
                            mo18241M1(j7, b, hVar);
                            mo18246R1(cVar, i, j7, b);
                            mo18256c2(j12);
                            return true;
                        }
                    } else if (j12 < 30000) {
                        if (j12 > 11000) {
                            try {
                                Thread.sleep((j12 - 10000) / 1000);
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                return false;
                            }
                        }
                        mo18241M1(j7, b, hVar);
                        mo18245Q1(cVar2, i4, j7);
                        mo18256c2(j12);
                        return true;
                    }
                }
                return false;
            } else if (!m14392D1(j8)) {
                return false;
            } else {
                mo18254a2(cVar2, i4, j7);
                mo18256c2(j8);
                return true;
            }
        } else {
            mo18254a2(cVar2, i4, j7);
            return true;
        }
    }

    /* renamed from: R1 */
    public void mo18246R1(C0941c cVar, int i, long j, long j2) {
        mo18238J1();
        ps6.m25173a("releaseOutputBuffer");
        cVar.mo7495k(i, j2);
        ps6.m25175c();
        this.f10234Q2 = SystemClock.elapsedRealtime() * 1000;
        this.f5083o2.f15310e++;
        this.f10231N2 = 0;
        mo18236H1();
    }

    /* renamed from: S */
    public p31 mo7147S(C0945d dVar, C0792h hVar, C0792h hVar2) {
        int i;
        p31 e = dVar.mo7506e(hVar, hVar2);
        int i2 = e.f16271e;
        int i3 = hVar2.f4180P;
        C2113a aVar = this.f10252z2;
        if (i3 > aVar.f10253a || hVar2.f4181Q > aVar.f10254b) {
            i2 |= 256;
        }
        if (m14391B1(dVar, hVar2) > this.f10252z2.f10255c) {
            i2 |= 64;
        }
        int i4 = i2;
        String str = dVar.f5124a;
        if (i4 != 0) {
            i = 0;
        } else {
            i = e.f16270d;
        }
        return new p31(str, hVar, hVar2, i, i4);
    }

    /* renamed from: T1 */
    public final void mo18247T1() {
        long j;
        if (this.f10249w2 > 0) {
            j = SystemClock.elapsedRealtime() + this.f10249w2;
        } else {
            j = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        }
        this.f10228K2 = j;
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* renamed from: U1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18248U1(java.lang.Object r5) throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            r4 = this;
            boolean r0 = r5 instanceof android.view.Surface
            if (r0 == 0) goto L_0x0007
            android.view.Surface r5 = (android.view.Surface) r5
            goto L_0x0008
        L_0x0007:
            r5 = 0
        L_0x0008:
            if (r5 != 0) goto L_0x0026
            androidx.media3.exoplayer.video.PlaceholderSurface r0 = r4.f10221D2
            if (r0 == 0) goto L_0x0010
            r5 = r0
            goto L_0x0026
        L_0x0010:
            androidx.media3.exoplayer.mediacodec.d r0 = r4.mo7463p0()
            if (r0 == 0) goto L_0x0026
            boolean r1 = r4.mo18253Z1(r0)
            if (r1 == 0) goto L_0x0026
            android.content.Context r5 = r4.f10246t2
            boolean r0 = r0.f5130g
            androidx.media3.exoplayer.video.PlaceholderSurface r5 = androidx.media3.exoplayer.video.PlaceholderSurface.m7574c(r5, r0)
            r4.f10221D2 = r5
        L_0x0026:
            android.view.Surface r0 = r4.f10220C2
            if (r0 == r5) goto L_0x006e
            r4.f10220C2 = r5
            n97 r0 = r4.f10247u2
            r0.mo23551m(r5)
            r0 = 0
            r4.f10222E2 = r0
            int r0 = r4.getState()
            androidx.media3.exoplayer.mediacodec.c r1 = r4.mo7462o0()
            if (r1 == 0) goto L_0x0054
            int r2 = p000.w67.f19021a
            r3 = 23
            if (r2 < r3) goto L_0x004e
            if (r5 == 0) goto L_0x004e
            boolean r2 = r4.f10218A2
            if (r2 != 0) goto L_0x004e
            r4.mo18249V1(r1, r5)
            goto L_0x0054
        L_0x004e:
            r4.mo7434V0()
            r4.mo7423G0()
        L_0x0054:
            if (r5 == 0) goto L_0x0067
            androidx.media3.exoplayer.video.PlaceholderSurface r1 = r4.f10221D2
            if (r5 == r1) goto L_0x0067
            r4.mo18240L1()
            r4.mo18257q1()
            r5 = 2
            if (r0 != r5) goto L_0x007a
            r4.mo18247T1()
            goto L_0x007a
        L_0x0067:
            r4.mo18258r1()
            r4.mo18257q1()
            goto L_0x007a
        L_0x006e:
            if (r5 == 0) goto L_0x007a
            androidx.media3.exoplayer.video.PlaceholderSurface r0 = r4.f10221D2
            if (r5 == r0) goto L_0x007a
            r4.mo18240L1()
            r4.mo18239K1()
        L_0x007a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.cr3.mo18248U1(java.lang.Object):void");
    }

    /* renamed from: V1 */
    public void mo18249V1(C0941c cVar, Surface surface) {
        cVar.mo7491g(surface);
    }

    /* renamed from: W1 */
    public boolean mo18250W1(long j, long j2, boolean z) {
        if (!m14393E1(j) || z) {
            return false;
        }
        return true;
    }

    /* renamed from: X0 */
    public void mo7435X0() {
        super.mo7435X0();
        this.f10232O2 = 0;
    }

    /* renamed from: X1 */
    public boolean mo18251X1(long j, long j2, boolean z) {
        if (!m14392D1(j) || z) {
            return false;
        }
        return true;
    }

    /* renamed from: Y1 */
    public boolean mo18252Y1(long j, long j2) {
        if (!m14392D1(j) || j2 <= 100000) {
            return false;
        }
        return true;
    }

    /* renamed from: Z1 */
    public final boolean mo18253Z1(C0945d dVar) {
        if (w67.f19021a < 23 || this.f10242Y2 || mo18259s1(dVar.f5124a) || (dVar.f5130g && !PlaceholderSurface.m7573b(this.f10246t2))) {
            return false;
        }
        return true;
    }

    /* renamed from: a2 */
    public void mo18254a2(C0941c cVar, int i, long j) {
        ps6.m25173a("skipVideoBuffer");
        cVar.mo7498n(i, false);
        ps6.m25175c();
        this.f5083o2.f15311f++;
    }

    /* renamed from: b2 */
    public void mo18255b2(int i, int i2) {
        n31 n31 = this.f5083o2;
        n31.f15313h += i;
        int i3 = i + i2;
        n31.f15312g += i3;
        this.f10230M2 += i3;
        int i4 = this.f10231N2 + i3;
        this.f10231N2 = i4;
        n31.f15314i = Math.max(i4, n31.f15314i);
        int i5 = this.f10250x2;
        if (i5 > 0 && this.f10230M2 >= i5) {
            mo18235G1();
        }
    }

    /* renamed from: c0 */
    public MediaCodecDecoderException mo7441c0(Throwable th, C0945d dVar) {
        return new MediaCodecVideoDecoderException(th, dVar, this.f10220C2);
    }

    /* renamed from: c2 */
    public void mo18256c2(long j) {
        this.f5083o2.mo23486a(j);
        this.f10235R2 += j;
        this.f10236S2++;
    }

    /* renamed from: g */
    public boolean mo7150g() {
        PlaceholderSurface placeholderSurface;
        if (super.mo7150g() && (this.f10224G2 || (((placeholderSurface = this.f10221D2) != null && this.f10220C2 == placeholderSurface) || mo7462o0() == null || this.f10242Y2))) {
            this.f10228K2 = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
            return true;
        } else if (this.f10228K2 == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.f10228K2) {
                return true;
            }
            this.f10228K2 = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
            return false;
        }
    }

    /* renamed from: g1 */
    public boolean mo7450g1(C0945d dVar) {
        if (this.f10220C2 != null || mo18253Z1(dVar)) {
            return true;
        }
        return false;
    }

    public String getName() {
        return "MediaCodecVideoRenderer";
    }

    /* renamed from: j1 */
    public int mo7153j1(C0946e eVar, C0792h hVar) throws MediaCodecUtil.DecoderQueryException {
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        if (!vv3.m29143q(hVar.f4175C)) {
            return nd5.m23113a(0);
        }
        if (hVar.f4178L != null) {
            z = true;
        } else {
            z = false;
        }
        List<C0945d> A1 = m14390A1(eVar, hVar, z, false);
        if (z && A1.isEmpty()) {
            A1 = m14390A1(eVar, hVar, false, false);
        }
        if (A1.isEmpty()) {
            return nd5.m23113a(1);
        }
        if (!MediaCodecRenderer.m6712k1(hVar)) {
            return nd5.m23113a(2);
        }
        C0945d dVar = A1.get(0);
        boolean m = dVar.mo7511m(hVar);
        if (!m) {
            int i6 = 1;
            while (true) {
                if (i6 >= A1.size()) {
                    break;
                }
                C0945d dVar2 = A1.get(i6);
                if (dVar2.mo7511m(hVar)) {
                    z2 = false;
                    m = true;
                    dVar = dVar2;
                    break;
                }
                i6++;
            }
        }
        z2 = true;
        if (m) {
            i = 4;
        } else {
            i = 3;
        }
        if (dVar.mo7514p(hVar)) {
            i2 = 16;
        } else {
            i2 = 8;
        }
        if (dVar.f5131h) {
            i3 = 64;
        } else {
            i3 = 0;
        }
        if (z2) {
            i4 = 128;
        } else {
            i4 = 0;
        }
        if (m) {
            List<C0945d> A12 = m14390A1(eVar, hVar, z, true);
            if (!A12.isEmpty()) {
                C0945d dVar3 = MediaCodecUtil.m6832u(A12, hVar).get(0);
                if (dVar3.mo7511m(hVar) && dVar3.mo7514p(hVar)) {
                    i5 = 32;
                }
            }
        }
        return nd5.m23115c(i, i2, i5, i3, i4);
    }

    /* renamed from: k */
    public void mo7154k(int i, Object obj) throws ExoPlaybackException {
        if (i == 1) {
            mo18248U1(obj);
        } else if (i == 7) {
            this.f10245b3 = (k97) obj;
        } else if (i == 10) {
            int intValue = ((Integer) obj).intValue();
            if (this.f10243Z2 != intValue) {
                this.f10243Z2 = intValue;
                if (this.f10242Y2) {
                    mo7434V0();
                }
            }
        } else if (i == 4) {
            this.f10223F2 = ((Integer) obj).intValue();
            C0941c o0 = mo7462o0();
            if (o0 != null) {
                o0.mo7488e(this.f10223F2);
            }
        } else if (i != 5) {
            super.mo7154k(i, obj);
        } else {
            this.f10247u2.mo23553o(((Integer) obj).intValue());
        }
    }

    /* renamed from: q0 */
    public boolean mo7464q0() {
        if (!this.f10242Y2 || w67.f19021a >= 23) {
            return false;
        }
        return true;
    }

    /* renamed from: q1 */
    public final void mo18257q1() {
        C0941c o0;
        this.f10224G2 = false;
        if (w67.f19021a >= 23 && this.f10242Y2 && (o0 = mo7462o0()) != null) {
            this.f10244a3 = new C2114b(o0);
        }
    }

    /* renamed from: r */
    public void mo7465r(float f, float f2) throws ExoPlaybackException {
        super.mo7465r(f, f2);
        this.f10247u2.mo23547i(f);
    }

    /* renamed from: r0 */
    public float mo7155r0(float f, C0792h hVar, C0792h[] hVarArr) {
        float f2 = -1.0f;
        for (C0792h hVar2 : hVarArr) {
            float f3 = hVar2.f4182U;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        if (f2 == -1.0f) {
            return -1.0f;
        }
        return f2 * f;
    }

    /* renamed from: r1 */
    public final void mo18258r1() {
        this.f10241X2 = null;
    }

    /* renamed from: s1 */
    public boolean mo18259s1(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (cr3.class) {
            if (!f10216d3) {
                f10217e3 = m14399w1();
                f10216d3 = true;
            }
        }
        return f10217e3;
    }

    /* renamed from: t0 */
    public List<C0945d> mo7157t0(C0946e eVar, C0792h hVar, boolean z) throws MediaCodecUtil.DecoderQueryException {
        return MediaCodecUtil.m6832u(m14390A1(eVar, hVar, z, this.f10242Y2), hVar);
    }

    @TargetApi(17)
    /* renamed from: v0 */
    public C0941c.C0942a mo7159v0(C0945d dVar, C0792h hVar, MediaCrypto mediaCrypto, float f) {
        int i;
        PlaceholderSurface placeholderSurface = this.f10221D2;
        if (!(placeholderSurface == null || placeholderSurface.f5486a == dVar.f5130g)) {
            mo18244P1();
        }
        String str = dVar.f5126c;
        C2113a z1 = mo18261z1(dVar, hVar, mo21678E());
        this.f10252z2 = z1;
        boolean z = this.f10251y2;
        if (this.f10242Y2) {
            i = this.f10243Z2;
        } else {
            i = 0;
        }
        MediaFormat C1 = mo18233C1(hVar, str, z1, f, z, i);
        if (this.f10220C2 == null) {
            if (mo18253Z1(dVar)) {
                if (this.f10221D2 == null) {
                    this.f10221D2 = PlaceholderSurface.m7574c(this.f10246t2, dVar.f5130g);
                }
                this.f10220C2 = this.f10221D2;
            } else {
                throw new IllegalStateException();
            }
        }
        return C0941c.C0942a.m6903b(dVar, C1, hVar, this.f10220C2, mediaCrypto);
    }

    /* renamed from: v1 */
    public void mo18260v1(C0941c cVar, int i, long j) {
        ps6.m25173a("dropVideoBuffer");
        cVar.mo7498n(i, false);
        ps6.m25175c();
        mo18255b2(0, 1);
    }

    @TargetApi(29)
    /* renamed from: y0 */
    public void mo7472y0(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
        if (this.f10219B2) {
            ByteBuffer byteBuffer = (ByteBuffer) C2725kr.m20985e(decoderInputBuffer.f4595r);
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4 && b3 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    m14394S1(mo7462o0(), bArr);
                }
            }
        }
    }

    /* renamed from: z1 */
    public C2113a mo18261z1(C0945d dVar, C0792h hVar, C0792h[] hVarArr) {
        boolean z;
        int x1;
        int i = hVar.f4180P;
        int i2 = hVar.f4181Q;
        int B1 = m14391B1(dVar, hVar);
        if (hVarArr.length == 1) {
            if (!(B1 == -1 || (x1 = m14400x1(dVar, hVar)) == -1)) {
                B1 = Math.min((int) (((float) B1) * 1.5f), x1);
            }
            return new C2113a(i, i2, B1);
        }
        int length = hVarArr.length;
        boolean z2 = false;
        for (int i3 = 0; i3 < length; i3++) {
            C0792h hVar2 = hVarArr[i3];
            if (hVar.f4194k0 != null && hVar2.f4194k0 == null) {
                hVar2 = hVar2.mo6636b().mo6649J(hVar.f4194k0).mo6644E();
            }
            if (dVar.mo7506e(hVar, hVar2).f16270d != 0) {
                int i4 = hVar2.f4180P;
                if (i4 == -1 || hVar2.f4181Q == -1) {
                    z = true;
                } else {
                    z = false;
                }
                z2 |= z;
                i = Math.max(i, i4);
                i2 = Math.max(i2, hVar2.f4181Q);
                B1 = Math.max(B1, m14391B1(dVar, hVar2));
            }
        }
        if (z2) {
            gk3.m18132i("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i + "x" + i2);
            Point y1 = m14401y1(dVar, hVar);
            if (y1 != null) {
                i = Math.max(i, y1.x);
                i2 = Math.max(i2, y1.y);
                B1 = Math.max(B1, m14400x1(dVar, hVar.mo6636b().mo6675j0(i).mo6656Q(i2).mo6644E()));
                gk3.m18132i("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i + "x" + i2);
            }
        }
        return new C2113a(i, i2, B1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cr3(Context context, C0941c.C0943b bVar, C0946e eVar, long j, boolean z, Handler handler, z97 z97, int i, float f) {
        super(2, bVar, eVar, z, f);
        this.f10249w2 = j;
        this.f10250x2 = i;
        Context applicationContext = context.getApplicationContext();
        this.f10246t2 = applicationContext;
        this.f10247u2 = new n97(applicationContext);
        Handler handler2 = handler;
        z97 z972 = z97;
        this.f10248v2 = new z97.C3721a(handler, z97);
        this.f10251y2 = m14398u1();
        this.f10228K2 = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        this.f10237T2 = -1;
        this.f10238U2 = -1;
        this.f10240W2 = -1.0f;
        this.f10223F2 = 1;
        this.f10243Z2 = 0;
        mo18258r1();
    }
}
