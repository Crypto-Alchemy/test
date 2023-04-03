package p000;

import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.C0787e;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.ParserException;
import com.github.mikephil.charting.utils.Utils;
import com.google.mlkit.common.MlKitException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import net.sqlcipher.database.SQLiteDatabase;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p000.xs5;
import p000.zs6;

/* renamed from: mp3 */
/* compiled from: MatroskaExtractor */
public class mp3 implements hy1 {

    /* renamed from: c0 */
    public static final ny1 f15014c0 = new lp3();

    /* renamed from: d0 */
    public static final byte[] f15015d0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: e0 */
    public static final byte[] f15016e0 = w67.m29361j0("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* renamed from: f0 */
    public static final byte[] f15017f0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};

    /* renamed from: g0 */
    public static final byte[] f15018g0 = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};

    /* renamed from: h0 */
    public static final UUID f15019h0 = new UUID(72057594037932032L, -9223371306706625679L);

    /* renamed from: i0 */
    public static final Map<String, Integer> f15020i0;

    /* renamed from: A */
    public long f15021A;

    /* renamed from: B */
    public long f15022B;

    /* renamed from: C */
    public cl3 f15023C;

    /* renamed from: D */
    public cl3 f15024D;

    /* renamed from: E */
    public boolean f15025E;

    /* renamed from: F */
    public boolean f15026F;

    /* renamed from: G */
    public int f15027G;

    /* renamed from: H */
    public long f15028H;

    /* renamed from: I */
    public long f15029I;

    /* renamed from: J */
    public int f15030J;

    /* renamed from: K */
    public int f15031K;

    /* renamed from: L */
    public int[] f15032L;

    /* renamed from: M */
    public int f15033M;

    /* renamed from: N */
    public int f15034N;

    /* renamed from: O */
    public int f15035O;

    /* renamed from: P */
    public int f15036P;

    /* renamed from: Q */
    public boolean f15037Q;

    /* renamed from: R */
    public long f15038R;

    /* renamed from: S */
    public int f15039S;

    /* renamed from: T */
    public int f15040T;

    /* renamed from: U */
    public int f15041U;

    /* renamed from: V */
    public boolean f15042V;

    /* renamed from: W */
    public boolean f15043W;

    /* renamed from: X */
    public boolean f15044X;

    /* renamed from: Y */
    public int f15045Y;

    /* renamed from: Z */
    public byte f15046Z;

    /* renamed from: a */
    public final an1 f15047a;

    /* renamed from: a0 */
    public boolean f15048a0;

    /* renamed from: b */
    public final q87 f15049b;

    /* renamed from: b0 */
    public jy1 f15050b0;

    /* renamed from: c */
    public final SparseArray<C2844c> f15051c;

    /* renamed from: d */
    public final boolean f15052d;

    /* renamed from: e */
    public final gm4 f15053e;

    /* renamed from: f */
    public final gm4 f15054f;

    /* renamed from: g */
    public final gm4 f15055g;

    /* renamed from: h */
    public final gm4 f15056h;

    /* renamed from: i */
    public final gm4 f15057i;

    /* renamed from: j */
    public final gm4 f15058j;

    /* renamed from: k */
    public final gm4 f15059k;

    /* renamed from: l */
    public final gm4 f15060l;

    /* renamed from: m */
    public final gm4 f15061m;

    /* renamed from: n */
    public final gm4 f15062n;

    /* renamed from: o */
    public ByteBuffer f15063o;

    /* renamed from: p */
    public long f15064p;

    /* renamed from: q */
    public long f15065q;

    /* renamed from: r */
    public long f15066r;

    /* renamed from: s */
    public long f15067s;

    /* renamed from: t */
    public long f15068t;

    /* renamed from: u */
    public C2844c f15069u;

    /* renamed from: v */
    public boolean f15070v;

    /* renamed from: w */
    public int f15071w;

    /* renamed from: x */
    public long f15072x;

    /* renamed from: y */
    public boolean f15073y;

    /* renamed from: z */
    public long f15074z;

    /* renamed from: mp3$b */
    /* compiled from: MatroskaExtractor */
    public final class C2843b implements zm1 {
        public C2843b() {
        }

        /* renamed from: a */
        public void mo23265a(int i) throws ParserException {
            mp3.this.mo23257p(i);
        }

        /* renamed from: b */
        public void mo23266b(int i, double d) throws ParserException {
            mp3.this.mo23259s(i, d);
        }

        /* renamed from: c */
        public void mo23267c(int i, int i2, iy1 iy1) throws IOException {
            mp3.this.mo23254m(i, i2, iy1);
        }

        /* renamed from: d */
        public void mo23268d(int i, long j) throws ParserException {
            mp3.this.mo23264y(i, j);
        }

        /* renamed from: e */
        public int mo23269e(int i) {
            return mp3.this.mo23261v(i);
        }

        /* renamed from: f */
        public boolean mo23270f(int i) {
            return mp3.this.mo23240A(i);
        }

        /* renamed from: g */
        public void mo23271g(int i, String str) throws ParserException {
            mp3.this.mo23246I(i, str);
        }

        /* renamed from: h */
        public void mo23272h(int i, long j, long j2) throws ParserException {
            mp3.this.mo23245H(i, j, j2);
        }
    }

    /* renamed from: mp3$c */
    /* compiled from: MatroskaExtractor */
    public static final class C2844c {

        /* renamed from: A */
        public int f15076A = -1;

        /* renamed from: B */
        public int f15077B = 1000;

        /* renamed from: C */
        public int f15078C = MlKitException.CODE_SCANNER_UNAVAILABLE;

        /* renamed from: D */
        public float f15079D = -1.0f;

        /* renamed from: E */
        public float f15080E = -1.0f;

        /* renamed from: F */
        public float f15081F = -1.0f;

        /* renamed from: G */
        public float f15082G = -1.0f;

        /* renamed from: H */
        public float f15083H = -1.0f;

        /* renamed from: I */
        public float f15084I = -1.0f;

        /* renamed from: J */
        public float f15085J = -1.0f;

        /* renamed from: K */
        public float f15086K = -1.0f;

        /* renamed from: L */
        public float f15087L = -1.0f;

        /* renamed from: M */
        public float f15088M = -1.0f;

        /* renamed from: N */
        public byte[] f15089N;

        /* renamed from: O */
        public int f15090O = 1;

        /* renamed from: P */
        public int f15091P = -1;

        /* renamed from: Q */
        public int f15092Q = 8000;

        /* renamed from: R */
        public long f15093R = 0;

        /* renamed from: S */
        public long f15094S = 0;

        /* renamed from: T */
        public cy6 f15095T;

        /* renamed from: U */
        public boolean f15096U;

        /* renamed from: V */
        public boolean f15097V = true;

        /* renamed from: W */
        public String f15098W = "eng";

        /* renamed from: X */
        public zs6 f15099X;

        /* renamed from: Y */
        public int f15100Y;

        /* renamed from: a */
        public String f15101a;

        /* renamed from: b */
        public String f15102b;

        /* renamed from: c */
        public int f15103c;

        /* renamed from: d */
        public int f15104d;

        /* renamed from: e */
        public int f15105e;

        /* renamed from: f */
        public int f15106f;

        /* renamed from: g */
        public int f15107g;

        /* renamed from: h */
        public boolean f15108h;

        /* renamed from: i */
        public byte[] f15109i;

        /* renamed from: j */
        public zs6.C3758a f15110j;

        /* renamed from: k */
        public byte[] f15111k;

        /* renamed from: l */
        public DrmInitData f15112l;

        /* renamed from: m */
        public int f15113m = -1;

        /* renamed from: n */
        public int f15114n = -1;

        /* renamed from: o */
        public int f15115o = -1;

        /* renamed from: p */
        public int f15116p = -1;

        /* renamed from: q */
        public int f15117q = 0;

        /* renamed from: r */
        public int f15118r = -1;

        /* renamed from: s */
        public float f15119s = Utils.FLOAT_EPSILON;

        /* renamed from: t */
        public float f15120t = Utils.FLOAT_EPSILON;

        /* renamed from: u */
        public float f15121u = Utils.FLOAT_EPSILON;

        /* renamed from: v */
        public byte[] f15122v = null;

        /* renamed from: w */
        public int f15123w = -1;

        /* renamed from: x */
        public boolean f15124x = false;

        /* renamed from: y */
        public int f15125y = -1;

        /* renamed from: z */
        public int f15126z = -1;

        /* renamed from: k */
        public static Pair<String, List<byte[]>> m22460k(gm4 gm4) throws ParserException {
            try {
                gm4.mo20675Q(16);
                long t = gm4.mo20695t();
                if (t == 1482049860) {
                    return new Pair<>("video/divx", (Object) null);
                }
                if (t == 859189832) {
                    return new Pair<>("video/3gpp", (Object) null);
                }
                if (t == 826496599) {
                    byte[] d = gm4.mo20679d();
                    for (int e = gm4.mo20680e() + 20; e < d.length - 4; e++) {
                        if (d[e] == 0 && d[e + 1] == 0 && d[e + 2] == 1 && d[e + 3] == 15) {
                            return new Pair<>("video/wvc1", Collections.singletonList(Arrays.copyOfRange(d, e, d.length)));
                        }
                    }
                    throw ParserException.createForMalformedContainer("Failed to find FourCC VC1 initialization data", (Throwable) null);
                }
                gk3.m18132i("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair<>("video/x-unknown", (Object) null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ParserException.createForMalformedContainer("Error parsing FourCC private data", (Throwable) null);
            }
        }

        /* renamed from: l */
        public static boolean m22461l(gm4 gm4) throws ParserException {
            try {
                int v = gm4.mo20697v();
                if (v == 1) {
                    return true;
                }
                if (v != 65534) {
                    return false;
                }
                gm4.mo20674P(24);
                if (gm4.mo20698w() == mp3.f15019h0.getMostSignificantBits() && gm4.mo20698w() == mp3.f15019h0.getLeastSignificantBits()) {
                    return true;
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ParserException.createForMalformedContainer("Error parsing MS/ACM codec private", (Throwable) null);
            }
        }

        /* renamed from: m */
        public static List<byte[]> m22462m(byte[] bArr) throws ParserException {
            byte b;
            byte b2;
            try {
                if (bArr[0] == 2) {
                    int i = 0;
                    int i2 = 1;
                    while (true) {
                        b = bArr[i2];
                        if ((b & 255) != 255) {
                            break;
                        }
                        i += 255;
                        i2++;
                    }
                    int i3 = i2 + 1;
                    int i4 = i + (b & 255);
                    int i5 = 0;
                    while (true) {
                        b2 = bArr[i3];
                        if ((b2 & 255) != 255) {
                            break;
                        }
                        i5 += 255;
                        i3++;
                    }
                    int i6 = i3 + 1;
                    int i7 = i5 + (b2 & 255);
                    if (bArr[i6] == 1) {
                        byte[] bArr2 = new byte[i4];
                        System.arraycopy(bArr, i6, bArr2, 0, i4);
                        int i8 = i6 + i4;
                        if (bArr[i8] == 3) {
                            int i9 = i8 + i7;
                            if (bArr[i9] == 5) {
                                byte[] bArr3 = new byte[(bArr.length - i9)];
                                System.arraycopy(bArr, i9, bArr3, 0, bArr.length - i9);
                                ArrayList arrayList = new ArrayList(2);
                                arrayList.add(bArr2);
                                arrayList.add(bArr3);
                                return arrayList;
                            }
                            throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", (Throwable) null);
                        }
                        throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", (Throwable) null);
                    }
                    throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", (Throwable) null);
                }
                throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", (Throwable) null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", (Throwable) null);
            }
        }

        @EnsuresNonNull({"output"})
        /* renamed from: f */
        public final void mo23273f() {
            C2725kr.m20985e(this.f15099X);
        }

        @EnsuresNonNull({"codecPrivate"})
        /* renamed from: g */
        public final byte[] mo23274g(String str) throws ParserException {
            byte[] bArr = this.f15111k;
            if (bArr != null) {
                return bArr;
            }
            throw ParserException.createForMalformedContainer("Missing CodecPrivate for codec " + str, (Throwable) null);
        }

        /* renamed from: h */
        public final byte[] mo23275h() {
            if (this.f15079D == -1.0f || this.f15080E == -1.0f || this.f15081F == -1.0f || this.f15082G == -1.0f || this.f15083H == -1.0f || this.f15084I == -1.0f || this.f15085J == -1.0f || this.f15086K == -1.0f || this.f15087L == -1.0f || this.f15088M == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            order.put((byte) 0);
            order.putShort((short) ((int) ((this.f15079D * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.f15080E * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.f15081F * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.f15082G * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.f15083H * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.f15084I * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.f15085J * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.f15086K * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) (this.f15087L + 0.5f)));
            order.putShort((short) ((int) (this.f15088M + 0.5f)));
            order.putShort((short) this.f15077B);
            order.putShort((short) this.f15078C);
            return bArr;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v15, resolved type: java.lang.String} */
        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:117:0x029d, code lost:
            r4 = r1;
            r1 = null;
            r3 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:132:0x0300, code lost:
            r1 = null;
            r3 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:133:0x0302, code lost:
            r4 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:134:0x0303, code lost:
            r6 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:142:0x0356, code lost:
            r4 = -1;
            r6 = -1;
            r18 = r3;
            r3 = r1;
            r1 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:145:0x038c, code lost:
            r3 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:148:0x0394, code lost:
            r1 = null;
            r3 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:150:0x03a5, code lost:
            r3 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:151:0x03a6, code lost:
            r6 = r16;
            r4 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:159:0x03ff, code lost:
            r1 = null;
            r3 = null;
            r17 = "audio/x-unknown";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:165:0x0413, code lost:
            r7 = r0.f15089N;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:166:0x0415, code lost:
            if (r7 == null) goto L_0x0426;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:167:0x0417, code lost:
            r7 = p000.ki1.m20745a(new p000.gm4(r7));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:168:0x0420, code lost:
            if (r7 == null) goto L_0x0426;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:169:0x0422, code lost:
            r3 = r7.f14093c;
            r17 = "video/dolby-vision";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:170:0x0426, code lost:
            r7 = r17;
            r10 = r0.f15097V | 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:171:0x042e, code lost:
            if (r0.f15096U == false) goto L_0x0432;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:172:0x0430, code lost:
            r9 = 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:173:0x0432, code lost:
            r9 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:174:0x0433, code lost:
            r9 = r9 | r10;
            r10 = new androidx.media3.common.C0792h.C0794b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:175:0x043d, code lost:
            if (p000.vv3.m29139m(r7) == false) goto L_0x0451;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:176:0x043f, code lost:
            r10.mo6647H(r0.f15090O).mo6671f0(r0.f15092Q).mo6664Y(r4);
            r5 = 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:178:0x0455, code lost:
            if (p000.vv3.m29143q(r7) == false) goto L_0x0529;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:180:0x0459, code lost:
            if (r0.f15117q != 0) goto L_0x046d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:181:0x045b, code lost:
            r2 = r0.f15115o;
            r4 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:182:0x045e, code lost:
            if (r2 != -1) goto L_0x0462;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:183:0x0460, code lost:
            r2 = r0.f15113m;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:184:0x0462, code lost:
            r0.f15115o = r2;
            r2 = r0.f15116p;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:185:0x0466, code lost:
            if (r2 != -1) goto L_0x046a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:186:0x0468, code lost:
            r2 = r0.f15114n;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:187:0x046a, code lost:
            r0.f15116p = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:188:0x046d, code lost:
            r4 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:189:0x046e, code lost:
            r2 = -1.0f;
            r5 = r0.f15115o;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:190:0x0472, code lost:
            if (r5 == r4) goto L_0x0481;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:191:0x0474, code lost:
            r12 = r0.f15116p;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:192:0x0476, code lost:
            if (r12 == r4) goto L_0x0481;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:193:0x0478, code lost:
            r2 = ((float) (r0.f15114n * r5)) / ((float) (r0.f15113m * r12));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:195:0x0483, code lost:
            if (r0.f15124x == false) goto L_0x0494;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:196:0x0485, code lost:
            r8 = new androidx.media3.common.C0787e(r0.f15125y, r0.f15076A, r0.f15126z, mo23275h());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:198:0x0496, code lost:
            if (r0.f15101a == null) goto L_0x04b4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:200:0x04a2, code lost:
            if (p000.mp3.m22412g().containsKey(r0.f15101a) == false) goto L_0x04b4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:201:0x04a4, code lost:
            r4 = ((java.lang.Integer) p000.mp3.m22412g().get(r0.f15101a)).intValue();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:203:0x04b6, code lost:
            if (r0.f15118r != 0) goto L_0x0504;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:205:0x04bf, code lost:
            if (java.lang.Float.compare(r0.f15119s, com.github.mikephil.charting.utils.Utils.FLOAT_EPSILON) != 0) goto L_0x0504;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:207:0x04c7, code lost:
            if (java.lang.Float.compare(r0.f15120t, com.github.mikephil.charting.utils.Utils.FLOAT_EPSILON) != 0) goto L_0x0504;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:209:0x04cf, code lost:
            if (java.lang.Float.compare(r0.f15121u, com.github.mikephil.charting.utils.Utils.FLOAT_EPSILON) != 0) goto L_0x04d3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:210:0x04d1, code lost:
            r4 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:212:0x04db, code lost:
            if (java.lang.Float.compare(r0.f15120t, 90.0f) != 0) goto L_0x04e0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:213:0x04dd, code lost:
            r4 = 90;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:215:0x04e8, code lost:
            if (java.lang.Float.compare(r0.f15120t, -180.0f) == 0) goto L_0x0502;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:217:0x04f2, code lost:
            if (java.lang.Float.compare(r0.f15120t, 180.0f) != 0) goto L_0x04f5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:219:0x04fd, code lost:
            if (java.lang.Float.compare(r0.f15120t, -90.0f) != 0) goto L_0x0504;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:220:0x04ff, code lost:
            r4 = 270;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:221:0x0502, code lost:
            r4 = 180;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:222:0x0504, code lost:
            r10.mo6675j0(r0.f15113m).mo6656Q(r0.f15114n).mo6666a0(r2).mo6669d0(r4).mo6667b0(r0.f15122v).mo6673h0(r0.f15123w).mo6649J(r8);
            r5 = 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:224:0x052d, code lost:
            if ("application/x-subrip".equals(r7) != false) goto L_0x0555;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:226:0x0533, code lost:
            if ("text/x-ssa".equals(r7) != false) goto L_0x0555;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:228:0x0539, code lost:
            if ("text/vtt".equals(r7) != false) goto L_0x0555;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:230:0x053f, code lost:
            if ("application/vobsub".equals(r7) != false) goto L_0x0555;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:232:0x0545, code lost:
            if ("application/pgs".equals(r7) != false) goto L_0x0555;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:234:0x054b, code lost:
            if ("application/dvbsubs".equals(r7) == false) goto L_0x054e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:236:0x0554, code lost:
            throw androidx.media3.common.ParserException.createForMalformedContainer("Unexpected MIME type.", (java.lang.Throwable) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:237:0x0555, code lost:
            r5 = 3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:239:0x0558, code lost:
            if (r0.f15101a == null) goto L_0x056b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:241:0x0564, code lost:
            if (p000.mp3.m22412g().containsKey(r0.f15101a) != false) goto L_0x056b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:242:0x0566, code lost:
            r10.mo6660U(r0.f15101a);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:243:0x056b, code lost:
            r1 = r10.mo6657R(r21).mo6670e0(r7).mo6662W(r6).mo6661V(r0.f15098W).mo6672g0(r9).mo6659T(r1).mo6648I(r3).mo6652M(r0.f15112l).mo6644E();
            r2 = r20.mo7713f(r0.f15103c, r5);
            r0.f15099X = r2;
            r2.mo7303d(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:244:0x05a2, code lost:
            return;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        @org.checkerframework.checker.nullness.qual.RequiresNonNull({"codecId"})
        @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"this.output"})
        /* renamed from: i */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo23276i(p000.jy1 r20, int r21) throws androidx.media3.common.ParserException {
            /*
                r19 = this;
                r0 = r19
                java.lang.String r1 = r0.f15102b
                r1.hashCode()
                int r2 = r1.hashCode()
                r3 = 32
                r4 = 16
                r7 = 8
                r9 = 3
                switch(r2) {
                    case -2095576542: goto L_0x01bd;
                    case -2095575984: goto L_0x01b1;
                    case -1985379776: goto L_0x01a5;
                    case -1784763192: goto L_0x0199;
                    case -1730367663: goto L_0x018d;
                    case -1482641358: goto L_0x0181;
                    case -1482641357: goto L_0x0175;
                    case -1373388978: goto L_0x0169;
                    case -933872740: goto L_0x015c;
                    case -538363189: goto L_0x014e;
                    case -538363109: goto L_0x0140;
                    case -425012669: goto L_0x0132;
                    case -356037306: goto L_0x0124;
                    case 62923557: goto L_0x0116;
                    case 62923603: goto L_0x0108;
                    case 62927045: goto L_0x00fa;
                    case 82318131: goto L_0x00ed;
                    case 82338133: goto L_0x00df;
                    case 82338134: goto L_0x00d1;
                    case 99146302: goto L_0x00c3;
                    case 444813526: goto L_0x00b5;
                    case 542569478: goto L_0x00a7;
                    case 635596514: goto L_0x0099;
                    case 725948237: goto L_0x008c;
                    case 725957860: goto L_0x007f;
                    case 738597099: goto L_0x0072;
                    case 855502857: goto L_0x0065;
                    case 1045209816: goto L_0x0058;
                    case 1422270023: goto L_0x004b;
                    case 1809237540: goto L_0x003e;
                    case 1950749482: goto L_0x0031;
                    case 1950789798: goto L_0x0024;
                    case 1951062397: goto L_0x0018;
                    default: goto L_0x0015;
                }
            L_0x0015:
                r1 = -1
                goto L_0x01c8
            L_0x0018:
                java.lang.String r2 = "A_OPUS"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0021
                goto L_0x0015
            L_0x0021:
                r1 = r3
                goto L_0x01c8
            L_0x0024:
                java.lang.String r2 = "A_FLAC"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x002d
                goto L_0x0015
            L_0x002d:
                r1 = 31
                goto L_0x01c8
            L_0x0031:
                java.lang.String r2 = "A_EAC3"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x003a
                goto L_0x0015
            L_0x003a:
                r1 = 30
                goto L_0x01c8
            L_0x003e:
                java.lang.String r2 = "V_MPEG2"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0047
                goto L_0x0015
            L_0x0047:
                r1 = 29
                goto L_0x01c8
            L_0x004b:
                java.lang.String r2 = "S_TEXT/UTF8"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0054
                goto L_0x0015
            L_0x0054:
                r1 = 28
                goto L_0x01c8
            L_0x0058:
                java.lang.String r2 = "S_TEXT/WEBVTT"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0061
                goto L_0x0015
            L_0x0061:
                r1 = 27
                goto L_0x01c8
            L_0x0065:
                java.lang.String r2 = "V_MPEGH/ISO/HEVC"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x006e
                goto L_0x0015
            L_0x006e:
                r1 = 26
                goto L_0x01c8
            L_0x0072:
                java.lang.String r2 = "S_TEXT/ASS"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x007b
                goto L_0x0015
            L_0x007b:
                r1 = 25
                goto L_0x01c8
            L_0x007f:
                java.lang.String r2 = "A_PCM/INT/LIT"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0088
                goto L_0x0015
            L_0x0088:
                r1 = 24
                goto L_0x01c8
            L_0x008c:
                java.lang.String r2 = "A_PCM/INT/BIG"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0095
                goto L_0x0015
            L_0x0095:
                r1 = 23
                goto L_0x01c8
            L_0x0099:
                java.lang.String r2 = "A_PCM/FLOAT/IEEE"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x00a3
                goto L_0x0015
            L_0x00a3:
                r1 = 22
                goto L_0x01c8
            L_0x00a7:
                java.lang.String r2 = "A_DTS/EXPRESS"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x00b1
                goto L_0x0015
            L_0x00b1:
                r1 = 21
                goto L_0x01c8
            L_0x00b5:
                java.lang.String r2 = "V_THEORA"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x00bf
                goto L_0x0015
            L_0x00bf:
                r1 = 20
                goto L_0x01c8
            L_0x00c3:
                java.lang.String r2 = "S_HDMV/PGS"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x00cd
                goto L_0x0015
            L_0x00cd:
                r1 = 19
                goto L_0x01c8
            L_0x00d1:
                java.lang.String r2 = "V_VP9"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x00db
                goto L_0x0015
            L_0x00db:
                r1 = 18
                goto L_0x01c8
            L_0x00df:
                java.lang.String r2 = "V_VP8"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x00e9
                goto L_0x0015
            L_0x00e9:
                r1 = 17
                goto L_0x01c8
            L_0x00ed:
                java.lang.String r2 = "V_AV1"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x00f7
                goto L_0x0015
            L_0x00f7:
                r1 = r4
                goto L_0x01c8
            L_0x00fa:
                java.lang.String r2 = "A_DTS"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0104
                goto L_0x0015
            L_0x0104:
                r1 = 15
                goto L_0x01c8
            L_0x0108:
                java.lang.String r2 = "A_AC3"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0112
                goto L_0x0015
            L_0x0112:
                r1 = 14
                goto L_0x01c8
            L_0x0116:
                java.lang.String r2 = "A_AAC"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0120
                goto L_0x0015
            L_0x0120:
                r1 = 13
                goto L_0x01c8
            L_0x0124:
                java.lang.String r2 = "A_DTS/LOSSLESS"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x012e
                goto L_0x0015
            L_0x012e:
                r1 = 12
                goto L_0x01c8
            L_0x0132:
                java.lang.String r2 = "S_VOBSUB"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x013c
                goto L_0x0015
            L_0x013c:
                r1 = 11
                goto L_0x01c8
            L_0x0140:
                java.lang.String r2 = "V_MPEG4/ISO/AVC"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x014a
                goto L_0x0015
            L_0x014a:
                r1 = 10
                goto L_0x01c8
            L_0x014e:
                java.lang.String r2 = "V_MPEG4/ISO/ASP"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0158
                goto L_0x0015
            L_0x0158:
                r1 = 9
                goto L_0x01c8
            L_0x015c:
                java.lang.String r2 = "S_DVBSUB"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0166
                goto L_0x0015
            L_0x0166:
                r1 = r7
                goto L_0x01c8
            L_0x0169:
                java.lang.String r2 = "V_MS/VFW/FOURCC"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0173
                goto L_0x0015
            L_0x0173:
                r1 = 7
                goto L_0x01c8
            L_0x0175:
                java.lang.String r2 = "A_MPEG/L3"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x017f
                goto L_0x0015
            L_0x017f:
                r1 = 6
                goto L_0x01c8
            L_0x0181:
                java.lang.String r2 = "A_MPEG/L2"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x018b
                goto L_0x0015
            L_0x018b:
                r1 = 5
                goto L_0x01c8
            L_0x018d:
                java.lang.String r2 = "A_VORBIS"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0197
                goto L_0x0015
            L_0x0197:
                r1 = 4
                goto L_0x01c8
            L_0x0199:
                java.lang.String r2 = "A_TRUEHD"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x01a3
                goto L_0x0015
            L_0x01a3:
                r1 = r9
                goto L_0x01c8
            L_0x01a5:
                java.lang.String r2 = "A_MS/ACM"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x01af
                goto L_0x0015
            L_0x01af:
                r1 = 2
                goto L_0x01c8
            L_0x01b1:
                java.lang.String r2 = "V_MPEG4/ISO/SP"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x01bb
                goto L_0x0015
            L_0x01bb:
                r1 = 1
                goto L_0x01c8
            L_0x01bd:
                java.lang.String r2 = "V_MPEG4/ISO/AP"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x01c7
                goto L_0x0015
            L_0x01c7:
                r1 = 0
            L_0x01c8:
                java.lang.String r2 = "application/dvbsubs"
                java.lang.String r12 = "application/pgs"
                java.lang.String r13 = "application/vobsub"
                java.lang.String r14 = "text/vtt"
                java.lang.String r15 = "text/x-ssa"
                java.lang.String r5 = "application/x-subrip"
                r16 = 4096(0x1000, float:5.74E-42)
                java.lang.String r6 = ". Setting mimeType to "
                java.lang.String r17 = "audio/raw"
                java.lang.String r11 = "MatroskaExtractor"
                java.lang.String r10 = "audio/x-unknown"
                r8 = 0
                switch(r1) {
                    case 0: goto L_0x0405;
                    case 1: goto L_0x0405;
                    case 2: goto L_0x03b5;
                    case 3: goto L_0x03aa;
                    case 4: goto L_0x0397;
                    case 5: goto L_0x0392;
                    case 6: goto L_0x038f;
                    case 7: goto L_0x0373;
                    case 8: goto L_0x035f;
                    case 9: goto L_0x0405;
                    case 10: goto L_0x033d;
                    case 11: goto L_0x032f;
                    case 12: goto L_0x032c;
                    case 13: goto L_0x030f;
                    case 14: goto L_0x030c;
                    case 15: goto L_0x0309;
                    case 16: goto L_0x0306;
                    case 17: goto L_0x02fe;
                    case 18: goto L_0x02fb;
                    case 19: goto L_0x02f6;
                    case 20: goto L_0x02f3;
                    case 21: goto L_0x0309;
                    case 22: goto L_0x02cd;
                    case 23: goto L_0x02a2;
                    case 24: goto L_0x0277;
                    case 25: goto L_0x0264;
                    case 26: goto L_0x0249;
                    case 27: goto L_0x0243;
                    case 28: goto L_0x023f;
                    case 29: goto L_0x023b;
                    case 30: goto L_0x0237;
                    case 31: goto L_0x0229;
                    case 32: goto L_0x01e9;
                    default: goto L_0x01e2;
                }
            L_0x01e2:
                java.lang.String r1 = "Unrecognized codec identifier."
                androidx.media3.common.ParserException r1 = androidx.media3.common.ParserException.createForMalformedContainer(r1, r8)
                throw r1
            L_0x01e9:
                r16 = 5760(0x1680, float:8.071E-42)
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>(r9)
                java.lang.String r3 = r0.f15102b
                byte[] r3 = r0.mo23274g(r3)
                r1.add(r3)
                java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r7)
                java.nio.ByteOrder r4 = java.nio.ByteOrder.LITTLE_ENDIAN
                java.nio.ByteBuffer r3 = r3.order(r4)
                long r10 = r0.f15093R
                java.nio.ByteBuffer r3 = r3.putLong(r10)
                byte[] r3 = r3.array()
                r1.add(r3)
                java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r7)
                java.nio.ByteBuffer r3 = r3.order(r4)
                long r6 = r0.f15094S
                java.nio.ByteBuffer r3 = r3.putLong(r6)
                byte[] r3 = r3.array()
                r1.add(r3)
                java.lang.String r17 = "audio/opus"
                goto L_0x03a5
            L_0x0229:
                java.lang.String r1 = r0.f15102b
                byte[] r1 = r0.mo23274g(r1)
                java.util.List r1 = java.util.Collections.singletonList(r1)
                java.lang.String r17 = "audio/flac"
                goto L_0x038c
            L_0x0237:
                java.lang.String r17 = "audio/eac3"
                goto L_0x0300
            L_0x023b:
                java.lang.String r17 = "video/mpeg2"
                goto L_0x0300
            L_0x023f:
                r17 = r5
                goto L_0x0300
            L_0x0243:
                r1 = r8
                r3 = r1
                r17 = r14
                goto L_0x0302
            L_0x0249:
                gm4 r1 = new gm4
                java.lang.String r3 = r0.f15102b
                byte[] r3 = r0.mo23274g(r3)
                r1.<init>((byte[]) r3)
                xl2 r1 = p000.xl2.m30169a(r1)
                java.util.List<byte[]> r3 = r1.f19878a
                int r4 = r1.f19879b
                r0.f15100Y = r4
                java.lang.String r1 = r1.f19883f
                java.lang.String r17 = "video/hevc"
                goto L_0x0356
            L_0x0264:
                byte[] r1 = p000.mp3.f15016e0
                java.lang.String r3 = r0.f15102b
                byte[] r3 = r0.mo23274g(r3)
                com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.m36629of(r1, r3)
                r3 = r8
                r17 = r15
                goto L_0x0302
            L_0x0277:
                int r1 = r0.f15091P
                int r1 = p000.w67.m29340Y(r1)
                if (r1 != 0) goto L_0x029d
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "Unsupported little endian PCM bit depth: "
                r1.append(r3)
                int r3 = r0.f15091P
                r1.append(r3)
                r1.append(r6)
                r1.append(r10)
                java.lang.String r1 = r1.toString()
                p000.gk3.m18132i(r11, r1)
                goto L_0x03ff
            L_0x029d:
                r4 = r1
                r1 = r8
                r3 = r1
                goto L_0x0303
            L_0x02a2:
                int r1 = r0.f15091P
                if (r1 != r7) goto L_0x02aa
                r1 = r8
                r3 = r1
                r4 = r9
                goto L_0x0303
            L_0x02aa:
                if (r1 != r4) goto L_0x02af
                r1 = 268435456(0x10000000, float:2.5243549E-29)
                goto L_0x029d
            L_0x02af:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "Unsupported big endian PCM bit depth: "
                r1.append(r3)
                int r3 = r0.f15091P
                r1.append(r3)
                r1.append(r6)
                r1.append(r10)
                java.lang.String r1 = r1.toString()
                p000.gk3.m18132i(r11, r1)
                goto L_0x03ff
            L_0x02cd:
                int r1 = r0.f15091P
                if (r1 != r3) goto L_0x02d5
                r1 = r8
                r3 = r1
                r4 = 4
                goto L_0x0303
            L_0x02d5:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "Unsupported floating point PCM bit depth: "
                r1.append(r3)
                int r3 = r0.f15091P
                r1.append(r3)
                r1.append(r6)
                r1.append(r10)
                java.lang.String r1 = r1.toString()
                p000.gk3.m18132i(r11, r1)
                goto L_0x03ff
            L_0x02f3:
                java.lang.String r17 = "video/x-unknown"
                goto L_0x0300
            L_0x02f6:
                r1 = r8
                r3 = r1
                r17 = r12
                goto L_0x0302
            L_0x02fb:
                java.lang.String r17 = "video/x-vnd.on2.vp9"
                goto L_0x0300
            L_0x02fe:
                java.lang.String r17 = "video/x-vnd.on2.vp8"
            L_0x0300:
                r1 = r8
                r3 = r1
            L_0x0302:
                r4 = -1
            L_0x0303:
                r6 = -1
                goto L_0x0413
            L_0x0306:
                java.lang.String r17 = "video/av01"
                goto L_0x0300
            L_0x0309:
                java.lang.String r17 = "audio/vnd.dts"
                goto L_0x0300
            L_0x030c:
                java.lang.String r17 = "audio/ac3"
                goto L_0x0300
            L_0x030f:
                java.lang.String r1 = r0.f15102b
                byte[] r1 = r0.mo23274g(r1)
                java.util.List r1 = java.util.Collections.singletonList(r1)
                byte[] r3 = r0.f15111k
                l5$b r3 = p000.C2740l5.m21231e(r3)
                int r4 = r3.f14414a
                r0.f15092Q = r4
                int r4 = r3.f14415b
                r0.f15090O = r4
                java.lang.String r3 = r3.f14416c
                java.lang.String r17 = "audio/mp4a-latm"
                goto L_0x0302
            L_0x032c:
                java.lang.String r17 = "audio/vnd.dts.hd"
                goto L_0x0300
            L_0x032f:
                java.lang.String r1 = r0.f15102b
                byte[] r1 = r0.mo23274g(r1)
                com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.m36628of(r1)
                r3 = r8
                r17 = r13
                goto L_0x0302
            L_0x033d:
                gm4 r1 = new gm4
                java.lang.String r3 = r0.f15102b
                byte[] r3 = r0.mo23274g(r3)
                r1.<init>((byte[]) r3)
                yv r1 = p000.C3697yv.m30841b(r1)
                java.util.List<byte[]> r3 = r1.f20382a
                int r4 = r1.f20383b
                r0.f15100Y = r4
                java.lang.String r1 = r1.f20387f
                java.lang.String r17 = "video/avc"
            L_0x0356:
                r4 = -1
                r6 = -1
                r18 = r3
                r3 = r1
                r1 = r18
                goto L_0x0413
            L_0x035f:
                r1 = 4
                byte[] r3 = new byte[r1]
                java.lang.String r4 = r0.f15102b
                byte[] r4 = r0.mo23274g(r4)
                r6 = 0
                java.lang.System.arraycopy(r4, r6, r3, r6, r1)
                com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.m36628of(r3)
                r17 = r2
                goto L_0x038c
            L_0x0373:
                gm4 r1 = new gm4
                java.lang.String r3 = r0.f15102b
                byte[] r3 = r0.mo23274g(r3)
                r1.<init>((byte[]) r3)
                android.util.Pair r1 = m22460k(r1)
                java.lang.Object r3 = r1.first
                r17 = r3
                java.lang.String r17 = (java.lang.String) r17
                java.lang.Object r1 = r1.second
                java.util.List r1 = (java.util.List) r1
            L_0x038c:
                r3 = r8
                goto L_0x0302
            L_0x038f:
                java.lang.String r17 = "audio/mpeg"
                goto L_0x0394
            L_0x0392:
                java.lang.String r17 = "audio/mpeg-L2"
            L_0x0394:
                r1 = r8
                r3 = r1
                goto L_0x03a6
            L_0x0397:
                r16 = 8192(0x2000, float:1.14794E-41)
                java.lang.String r1 = r0.f15102b
                byte[] r1 = r0.mo23274g(r1)
                java.util.List r1 = m22462m(r1)
                java.lang.String r17 = "audio/vorbis"
            L_0x03a5:
                r3 = r8
            L_0x03a6:
                r6 = r16
                r4 = -1
                goto L_0x0413
            L_0x03aa:
                cy6 r1 = new cy6
                r1.<init>()
                r0.f15095T = r1
                java.lang.String r17 = "audio/true-hd"
                goto L_0x0300
            L_0x03b5:
                gm4 r1 = new gm4
                java.lang.String r3 = r0.f15102b
                byte[] r3 = r0.mo23274g(r3)
                r1.<init>((byte[]) r3)
                boolean r1 = m22461l(r1)
                if (r1 == 0) goto L_0x03eb
                int r1 = r0.f15091P
                int r1 = p000.w67.m29340Y(r1)
                if (r1 != 0) goto L_0x029d
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "Unsupported PCM bit depth: "
                r1.append(r3)
                int r3 = r0.f15091P
                r1.append(r3)
                r1.append(r6)
                r1.append(r10)
                java.lang.String r1 = r1.toString()
                p000.gk3.m18132i(r11, r1)
                goto L_0x03ff
            L_0x03eb:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "Non-PCM MS/ACM is unsupported. Setting mimeType to "
                r1.append(r3)
                r1.append(r10)
                java.lang.String r1 = r1.toString()
                p000.gk3.m18132i(r11, r1)
            L_0x03ff:
                r1 = r8
                r3 = r1
                r17 = r10
                goto L_0x0302
            L_0x0405:
                byte[] r1 = r0.f15111k
                if (r1 != 0) goto L_0x040b
                r1 = r8
                goto L_0x040f
            L_0x040b:
                java.util.List r1 = java.util.Collections.singletonList(r1)
            L_0x040f:
                java.lang.String r17 = "video/mp4v-es"
                goto L_0x038c
            L_0x0413:
                byte[] r7 = r0.f15089N
                if (r7 == 0) goto L_0x0426
                gm4 r10 = new gm4
                r10.<init>((byte[]) r7)
                ki1 r7 = p000.ki1.m20745a(r10)
                if (r7 == 0) goto L_0x0426
                java.lang.String r3 = r7.f14093c
                java.lang.String r17 = "video/dolby-vision"
            L_0x0426:
                r7 = r17
                boolean r10 = r0.f15097V
                r11 = 0
                r10 = r10 | r11
                boolean r9 = r0.f15096U
                if (r9 == 0) goto L_0x0432
                r9 = 2
                goto L_0x0433
            L_0x0432:
                r9 = r11
            L_0x0433:
                r9 = r9 | r10
                androidx.media3.common.h$b r10 = new androidx.media3.common.h$b
                r10.<init>()
                boolean r17 = p000.vv3.m29139m(r7)
                if (r17 == 0) goto L_0x0451
                int r2 = r0.f15090O
                androidx.media3.common.h$b r2 = r10.mo6647H(r2)
                int r5 = r0.f15092Q
                androidx.media3.common.h$b r2 = r2.mo6671f0(r5)
                r2.mo6664Y(r4)
                r5 = 1
                goto L_0x0556
            L_0x0451:
                boolean r4 = p000.vv3.m29143q(r7)
                if (r4 == 0) goto L_0x0529
                int r2 = r0.f15117q
                if (r2 != 0) goto L_0x046d
                int r2 = r0.f15115o
                r4 = -1
                if (r2 != r4) goto L_0x0462
                int r2 = r0.f15113m
            L_0x0462:
                r0.f15115o = r2
                int r2 = r0.f15116p
                if (r2 != r4) goto L_0x046a
                int r2 = r0.f15114n
            L_0x046a:
                r0.f15116p = r2
                goto L_0x046e
            L_0x046d:
                r4 = -1
            L_0x046e:
                r2 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r5 = r0.f15115o
                if (r5 == r4) goto L_0x0481
                int r12 = r0.f15116p
                if (r12 == r4) goto L_0x0481
                int r2 = r0.f15114n
                int r2 = r2 * r5
                float r2 = (float) r2
                int r5 = r0.f15113m
                int r5 = r5 * r12
                float r5 = (float) r5
                float r2 = r2 / r5
            L_0x0481:
                boolean r5 = r0.f15124x
                if (r5 == 0) goto L_0x0494
                byte[] r5 = r19.mo23275h()
                androidx.media3.common.e r8 = new androidx.media3.common.e
                int r12 = r0.f15125y
                int r13 = r0.f15076A
                int r14 = r0.f15126z
                r8.<init>(r12, r13, r14, r5)
            L_0x0494:
                java.lang.String r5 = r0.f15101a
                if (r5 == 0) goto L_0x04b4
                java.util.Map r5 = p000.mp3.f15020i0
                java.lang.String r12 = r0.f15101a
                boolean r5 = r5.containsKey(r12)
                if (r5 == 0) goto L_0x04b4
                java.util.Map r4 = p000.mp3.f15020i0
                java.lang.String r5 = r0.f15101a
                java.lang.Object r4 = r4.get(r5)
                java.lang.Integer r4 = (java.lang.Integer) r4
                int r4 = r4.intValue()
            L_0x04b4:
                int r5 = r0.f15118r
                if (r5 != 0) goto L_0x0504
                float r5 = r0.f15119s
                r12 = 0
                int r5 = java.lang.Float.compare(r5, r12)
                if (r5 != 0) goto L_0x0504
                float r5 = r0.f15120t
                int r5 = java.lang.Float.compare(r5, r12)
                if (r5 != 0) goto L_0x0504
                float r5 = r0.f15121u
                int r5 = java.lang.Float.compare(r5, r12)
                if (r5 != 0) goto L_0x04d3
                r4 = r11
                goto L_0x0504
            L_0x04d3:
                float r5 = r0.f15120t
                r11 = 1119092736(0x42b40000, float:90.0)
                int r5 = java.lang.Float.compare(r5, r11)
                if (r5 != 0) goto L_0x04e0
                r4 = 90
                goto L_0x0504
            L_0x04e0:
                float r5 = r0.f15120t
                r11 = -1020002304(0xffffffffc3340000, float:-180.0)
                int r5 = java.lang.Float.compare(r5, r11)
                if (r5 == 0) goto L_0x0502
                float r5 = r0.f15120t
                r11 = 1127481344(0x43340000, float:180.0)
                int r5 = java.lang.Float.compare(r5, r11)
                if (r5 != 0) goto L_0x04f5
                goto L_0x0502
            L_0x04f5:
                float r5 = r0.f15120t
                r11 = -1028390912(0xffffffffc2b40000, float:-90.0)
                int r5 = java.lang.Float.compare(r5, r11)
                if (r5 != 0) goto L_0x0504
                r4 = 270(0x10e, float:3.78E-43)
                goto L_0x0504
            L_0x0502:
                r4 = 180(0xb4, float:2.52E-43)
            L_0x0504:
                int r5 = r0.f15113m
                androidx.media3.common.h$b r5 = r10.mo6675j0(r5)
                int r11 = r0.f15114n
                androidx.media3.common.h$b r5 = r5.mo6656Q(r11)
                androidx.media3.common.h$b r2 = r5.mo6666a0(r2)
                androidx.media3.common.h$b r2 = r2.mo6669d0(r4)
                byte[] r4 = r0.f15122v
                androidx.media3.common.h$b r2 = r2.mo6667b0(r4)
                int r4 = r0.f15123w
                androidx.media3.common.h$b r2 = r2.mo6673h0(r4)
                r2.mo6649J(r8)
                r5 = 2
                goto L_0x0556
            L_0x0529:
                boolean r4 = r5.equals(r7)
                if (r4 != 0) goto L_0x0555
                boolean r4 = r15.equals(r7)
                if (r4 != 0) goto L_0x0555
                boolean r4 = r14.equals(r7)
                if (r4 != 0) goto L_0x0555
                boolean r4 = r13.equals(r7)
                if (r4 != 0) goto L_0x0555
                boolean r4 = r12.equals(r7)
                if (r4 != 0) goto L_0x0555
                boolean r2 = r2.equals(r7)
                if (r2 == 0) goto L_0x054e
                goto L_0x0555
            L_0x054e:
                java.lang.String r1 = "Unexpected MIME type."
                androidx.media3.common.ParserException r1 = androidx.media3.common.ParserException.createForMalformedContainer(r1, r8)
                throw r1
            L_0x0555:
                r5 = 3
            L_0x0556:
                java.lang.String r2 = r0.f15101a
                if (r2 == 0) goto L_0x056b
                java.util.Map r2 = p000.mp3.f15020i0
                java.lang.String r4 = r0.f15101a
                boolean r2 = r2.containsKey(r4)
                if (r2 != 0) goto L_0x056b
                java.lang.String r2 = r0.f15101a
                r10.mo6660U(r2)
            L_0x056b:
                r2 = r21
                androidx.media3.common.h$b r2 = r10.mo6657R(r2)
                androidx.media3.common.h$b r2 = r2.mo6670e0(r7)
                androidx.media3.common.h$b r2 = r2.mo6662W(r6)
                java.lang.String r4 = r0.f15098W
                androidx.media3.common.h$b r2 = r2.mo6661V(r4)
                androidx.media3.common.h$b r2 = r2.mo6672g0(r9)
                androidx.media3.common.h$b r1 = r2.mo6659T(r1)
                androidx.media3.common.h$b r1 = r1.mo6648I(r3)
                androidx.media3.common.DrmInitData r2 = r0.f15112l
                androidx.media3.common.h$b r1 = r1.mo6652M(r2)
                androidx.media3.common.h r1 = r1.mo6644E()
                int r2 = r0.f15103c
                r3 = r20
                zs6 r2 = r3.mo7713f(r2, r5)
                r0.f15099X = r2
                r2.mo7303d(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.mp3.C2844c.mo23276i(jy1, int):void");
        }

        @RequiresNonNull({"output"})
        /* renamed from: j */
        public void mo23277j() {
            cy6 cy6 = this.f15095T;
            if (cy6 != null) {
                cy6.mo18379a(this.f15099X, this.f15110j);
            }
        }

        /* renamed from: n */
        public void mo23278n() {
            cy6 cy6 = this.f15095T;
            if (cy6 != null) {
                cy6.mo18380b();
            }
        }

        /* renamed from: o */
        public final boolean mo23279o(boolean z) {
            if ("A_OPUS".equals(this.f15102b)) {
                return z;
            }
            if (this.f15106f > 0) {
                return true;
            }
            return false;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        f15020i0 = Collections.unmodifiableMap(hashMap);
    }

    public mp3() {
        this(0);
    }

    /* renamed from: B */
    public static /* synthetic */ hy1[] m22408B() {
        return new hy1[]{new mp3()};
    }

    /* renamed from: G */
    public static void m22409G(String str, long j, byte[] bArr) {
        int i;
        byte[] bArr2;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 738597099:
                if (str.equals("S_TEXT/ASS")) {
                    c = 0;
                    break;
                }
                break;
            case 1045209816:
                if (str.equals("S_TEXT/WEBVTT")) {
                    c = 1;
                    break;
                }
                break;
            case 1422270023:
                if (str.equals("S_TEXT/UTF8")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                bArr2 = m22415t(j, "%01d:%02d:%02d:%02d", 10000);
                i = 21;
                break;
            case 1:
                bArr2 = m22415t(j, "%02d:%02d:%02d.%03d", 1000);
                i = 25;
                break;
            case 2:
                bArr2 = m22415t(j, "%02d:%02d:%02d,%03d", 1000);
                i = 19;
                break;
            default:
                throw new IllegalArgumentException();
        }
        System.arraycopy(bArr2, 0, bArr, i, bArr2.length);
    }

    /* renamed from: q */
    public static int[] m22414q(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        if (iArr.length >= i) {
            return iArr;
        }
        return new int[Math.max(iArr.length * 2, i)];
    }

    /* renamed from: t */
    public static byte[] m22415t(long j, String str, long j2) {
        boolean z;
        if (j != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            z = true;
        } else {
            z = false;
        }
        C2725kr.m20981a(z);
        int i = (int) (j / 3600000000L);
        long j3 = j - ((((long) i) * 3600) * 1000000);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - ((((long) i2) * 60) * 1000000);
        int i3 = (int) (j4 / 1000000);
        return w67.m29361j0(String.format(Locale.US, str, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (((long) i3) * 1000000)) / j2))}));
    }

    /* renamed from: z */
    public static boolean m22416z(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -2095576542:
                if (str.equals("V_MPEG4/ISO/AP")) {
                    c = 0;
                    break;
                }
                break;
            case -2095575984:
                if (str.equals("V_MPEG4/ISO/SP")) {
                    c = 1;
                    break;
                }
                break;
            case -1985379776:
                if (str.equals("A_MS/ACM")) {
                    c = 2;
                    break;
                }
                break;
            case -1784763192:
                if (str.equals("A_TRUEHD")) {
                    c = 3;
                    break;
                }
                break;
            case -1730367663:
                if (str.equals("A_VORBIS")) {
                    c = 4;
                    break;
                }
                break;
            case -1482641358:
                if (str.equals("A_MPEG/L2")) {
                    c = 5;
                    break;
                }
                break;
            case -1482641357:
                if (str.equals("A_MPEG/L3")) {
                    c = 6;
                    break;
                }
                break;
            case -1373388978:
                if (str.equals("V_MS/VFW/FOURCC")) {
                    c = 7;
                    break;
                }
                break;
            case -933872740:
                if (str.equals("S_DVBSUB")) {
                    c = 8;
                    break;
                }
                break;
            case -538363189:
                if (str.equals("V_MPEG4/ISO/ASP")) {
                    c = 9;
                    break;
                }
                break;
            case -538363109:
                if (str.equals("V_MPEG4/ISO/AVC")) {
                    c = 10;
                    break;
                }
                break;
            case -425012669:
                if (str.equals("S_VOBSUB")) {
                    c = 11;
                    break;
                }
                break;
            case -356037306:
                if (str.equals("A_DTS/LOSSLESS")) {
                    c = 12;
                    break;
                }
                break;
            case 62923557:
                if (str.equals("A_AAC")) {
                    c = 13;
                    break;
                }
                break;
            case 62923603:
                if (str.equals("A_AC3")) {
                    c = 14;
                    break;
                }
                break;
            case 62927045:
                if (str.equals("A_DTS")) {
                    c = 15;
                    break;
                }
                break;
            case 82318131:
                if (str.equals("V_AV1")) {
                    c = 16;
                    break;
                }
                break;
            case 82338133:
                if (str.equals("V_VP8")) {
                    c = 17;
                    break;
                }
                break;
            case 82338134:
                if (str.equals("V_VP9")) {
                    c = 18;
                    break;
                }
                break;
            case 99146302:
                if (str.equals("S_HDMV/PGS")) {
                    c = 19;
                    break;
                }
                break;
            case 444813526:
                if (str.equals("V_THEORA")) {
                    c = 20;
                    break;
                }
                break;
            case 542569478:
                if (str.equals("A_DTS/EXPRESS")) {
                    c = 21;
                    break;
                }
                break;
            case 635596514:
                if (str.equals("A_PCM/FLOAT/IEEE")) {
                    c = 22;
                    break;
                }
                break;
            case 725948237:
                if (str.equals("A_PCM/INT/BIG")) {
                    c = 23;
                    break;
                }
                break;
            case 725957860:
                if (str.equals("A_PCM/INT/LIT")) {
                    c = 24;
                    break;
                }
                break;
            case 738597099:
                if (str.equals("S_TEXT/ASS")) {
                    c = 25;
                    break;
                }
                break;
            case 855502857:
                if (str.equals("V_MPEGH/ISO/HEVC")) {
                    c = 26;
                    break;
                }
                break;
            case 1045209816:
                if (str.equals("S_TEXT/WEBVTT")) {
                    c = 27;
                    break;
                }
                break;
            case 1422270023:
                if (str.equals("S_TEXT/UTF8")) {
                    c = 28;
                    break;
                }
                break;
            case 1809237540:
                if (str.equals("V_MPEG2")) {
                    c = 29;
                    break;
                }
                break;
            case 1950749482:
                if (str.equals("A_EAC3")) {
                    c = 30;
                    break;
                }
                break;
            case 1950789798:
                if (str.equals("A_FLAC")) {
                    c = 31;
                    break;
                }
                break;
            case 1951062397:
                if (str.equals("A_OPUS")) {
                    c = ' ';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case ' ':
                return true;
            default:
                return false;
        }
    }

    /* renamed from: A */
    public boolean mo23240A(int i) {
        return i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427;
    }

    /* renamed from: C */
    public final boolean mo23241C(mt4 mt4, long j) {
        if (this.f15073y) {
            this.f15021A = j;
            mt4.f15249a = this.f15074z;
            this.f15073y = false;
            return true;
        }
        if (this.f15070v) {
            long j2 = this.f15021A;
            if (j2 != -1) {
                mt4.f15249a = j2;
                this.f15021A = -1;
                return true;
            }
        }
        return false;
    }

    /* renamed from: D */
    public final void mo23242D(iy1 iy1, int i) throws IOException {
        if (this.f15055g.mo20681f() < i) {
            if (this.f15055g.mo20677b() < i) {
                gm4 gm4 = this.f15055g;
                gm4.mo20678c(Math.max(gm4.mo20677b() * 2, i));
            }
            iy1.readFully(this.f15055g.mo20679d(), this.f15055g.mo20681f(), i - this.f15055g.mo20681f());
            this.f15055g.mo20673O(i);
        }
    }

    /* renamed from: E */
    public final void mo23243E() {
        this.f15039S = 0;
        this.f15040T = 0;
        this.f15041U = 0;
        this.f15042V = false;
        this.f15043W = false;
        this.f15044X = false;
        this.f15045Y = 0;
        this.f15046Z = 0;
        this.f15048a0 = false;
        this.f15058j.mo20670L(0);
    }

    /* renamed from: F */
    public final long mo23244F(long j) throws ParserException {
        long j2 = this.f15066r;
        if (j2 != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            return w67.m29313J0(j, j2, 1000);
        }
        throw ParserException.createForMalformedContainer("Can't scale timecode prior to timecodeScale being set.", (Throwable) null);
    }

    /* renamed from: H */
    public void mo23245H(int i, long j, long j2) throws ParserException {
        mo23253l();
        if (i == 160) {
            this.f15037Q = false;
            this.f15038R = 0;
        } else if (i == 174) {
            this.f15069u = new C2844c();
        } else if (i == 187) {
            this.f15025E = false;
        } else if (i == 19899) {
            this.f15071w = -1;
            this.f15072x = -1;
        } else if (i == 20533) {
            mo23260u(i).f15108h = true;
        } else if (i == 21968) {
            mo23260u(i).f15124x = true;
        } else if (i == 408125543) {
            long j3 = this.f15065q;
            if (j3 == -1 || j3 == j) {
                this.f15065q = j;
                this.f15064p = j2;
                return;
            }
            throw ParserException.createForMalformedContainer("Multiple Segment elements not supported", (Throwable) null);
        } else if (i == 475249515) {
            this.f15023C = new cl3();
            this.f15024D = new cl3();
        } else if (i != 524531317 || this.f15070v) {
        } else {
            if (!this.f15052d || this.f15074z == -1) {
                this.f15050b0.mo7715g(new xs5.C3642b(this.f15068t));
                this.f15070v = true;
                return;
            }
            this.f15073y = true;
        }
    }

    /* renamed from: I */
    public void mo23246I(int i, String str) throws ParserException {
        if (i == 134) {
            mo23260u(i).f15102b = str;
        } else if (i != 17026) {
            if (i == 21358) {
                mo23260u(i).f15101a = str;
            } else if (i == 2274716) {
                String unused = mo23260u(i).f15098W = str;
            }
        } else if (!"webm".equals(str) && !"matroska".equals(str)) {
            throw ParserException.createForMalformedContainer("DocType " + str + " not supported", (Throwable) null);
        }
    }

    @RequiresNonNull({"#2.output"})
    /* renamed from: J */
    public final int mo23247J(iy1 iy1, C2844c cVar, int i, boolean z) throws IOException {
        boolean z2;
        boolean z3;
        int i2;
        if ("S_TEXT/UTF8".equals(cVar.f15102b)) {
            mo23248K(iy1, f15015d0, i);
            return mo23258r();
        } else if ("S_TEXT/ASS".equals(cVar.f15102b)) {
            mo23248K(iy1, f15017f0, i);
            return mo23258r();
        } else if ("S_TEXT/WEBVTT".equals(cVar.f15102b)) {
            mo23248K(iy1, f15018g0, i);
            return mo23258r();
        } else {
            zs6 zs6 = cVar.f15099X;
            boolean z4 = true;
            if (!this.f15042V) {
                if (cVar.f15108h) {
                    this.f15035O &= -1073741825;
                    int i3 = 128;
                    if (!this.f15043W) {
                        iy1.readFully(this.f15055g.mo20679d(), 0, 1);
                        this.f15039S++;
                        if ((this.f15055g.mo20679d()[0] & 128) != 128) {
                            this.f15046Z = this.f15055g.mo20679d()[0];
                            this.f15043W = true;
                        } else {
                            throw ParserException.createForMalformedContainer("Extension bit is set in signal byte", (Throwable) null);
                        }
                    }
                    byte b = this.f15046Z;
                    if ((b & 1) == 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        if ((b & 2) == 2) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        this.f15035O |= 1073741824;
                        if (!this.f15048a0) {
                            iy1.readFully(this.f15060l.mo20679d(), 0, 8);
                            this.f15039S += 8;
                            this.f15048a0 = true;
                            byte[] d = this.f15055g.mo20679d();
                            if (!z3) {
                                i3 = 0;
                            }
                            d[0] = (byte) (i3 | 8);
                            this.f15055g.mo20674P(0);
                            zs6.mo7302c(this.f15055g, 1, 1);
                            this.f15040T++;
                            this.f15060l.mo20674P(0);
                            zs6.mo7302c(this.f15060l, 8, 1);
                            this.f15040T += 8;
                        }
                        if (z3) {
                            if (!this.f15044X) {
                                iy1.readFully(this.f15055g.mo20679d(), 0, 1);
                                this.f15039S++;
                                this.f15055g.mo20674P(0);
                                this.f15045Y = this.f15055g.mo20662D();
                                this.f15044X = true;
                            }
                            int i4 = this.f15045Y * 4;
                            this.f15055g.mo20670L(i4);
                            iy1.readFully(this.f15055g.mo20679d(), 0, i4);
                            this.f15039S += i4;
                            short s = (short) ((this.f15045Y / 2) + 1);
                            int i5 = (s * 6) + 2;
                            ByteBuffer byteBuffer = this.f15063o;
                            if (byteBuffer == null || byteBuffer.capacity() < i5) {
                                this.f15063o = ByteBuffer.allocate(i5);
                            }
                            this.f15063o.position(0);
                            this.f15063o.putShort(s);
                            int i6 = 0;
                            int i7 = 0;
                            while (true) {
                                i2 = this.f15045Y;
                                if (i6 >= i2) {
                                    break;
                                }
                                int H = this.f15055g.mo20666H();
                                if (i6 % 2 == 0) {
                                    this.f15063o.putShort((short) (H - i7));
                                } else {
                                    this.f15063o.putInt(H - i7);
                                }
                                i6++;
                                i7 = H;
                            }
                            int i8 = (i - this.f15039S) - i7;
                            if (i2 % 2 == 1) {
                                this.f15063o.putInt(i8);
                            } else {
                                this.f15063o.putShort((short) i8);
                                this.f15063o.putInt(0);
                            }
                            this.f15061m.mo20672N(this.f15063o.array(), i5);
                            zs6.mo7302c(this.f15061m, i5, 1);
                            this.f15040T += i5;
                        }
                    }
                } else {
                    byte[] bArr = cVar.f15109i;
                    if (bArr != null) {
                        this.f15058j.mo20672N(bArr, bArr.length);
                    }
                }
                if (cVar.mo23279o(z)) {
                    this.f15035O |= SQLiteDatabase.CREATE_IF_NECESSARY;
                    this.f15062n.mo20670L(0);
                    int f = (this.f15058j.mo20681f() + i) - this.f15039S;
                    this.f15055g.mo20670L(4);
                    this.f15055g.mo20679d()[0] = (byte) ((f >> 24) & 255);
                    this.f15055g.mo20679d()[1] = (byte) ((f >> 16) & 255);
                    this.f15055g.mo20679d()[2] = (byte) ((f >> 8) & 255);
                    this.f15055g.mo20679d()[3] = (byte) (f & 255);
                    zs6.mo7302c(this.f15055g, 4, 2);
                    this.f15040T += 4;
                }
                this.f15042V = true;
            }
            int f2 = i + this.f15058j.mo20681f();
            if (!"V_MPEG4/ISO/AVC".equals(cVar.f15102b) && !"V_MPEGH/ISO/HEVC".equals(cVar.f15102b)) {
                if (cVar.f15095T != null) {
                    if (this.f15058j.mo20681f() != 0) {
                        z4 = false;
                    }
                    C2725kr.m20987g(z4);
                    cVar.f15095T.mo18382d(iy1);
                }
                while (true) {
                    int i9 = this.f15039S;
                    if (i9 >= f2) {
                        break;
                    }
                    int L = mo23249L(iy1, zs6, f2 - i9);
                    this.f15039S += L;
                    this.f15040T += L;
                }
            } else {
                byte[] d2 = this.f15054f.mo20679d();
                d2[0] = 0;
                d2[1] = 0;
                d2[2] = 0;
                int i10 = cVar.f15100Y;
                int i11 = 4 - i10;
                while (this.f15039S < f2) {
                    int i12 = this.f15041U;
                    if (i12 == 0) {
                        mo23250M(iy1, d2, i11, i10);
                        this.f15039S += i10;
                        this.f15054f.mo20674P(0);
                        this.f15041U = this.f15054f.mo20666H();
                        this.f15053e.mo20674P(0);
                        zs6.mo7300a(this.f15053e, 4);
                        this.f15040T += 4;
                    } else {
                        int L2 = mo23249L(iy1, zs6, i12);
                        this.f15039S += L2;
                        this.f15040T += L2;
                        this.f15041U -= L2;
                    }
                }
            }
            if ("A_VORBIS".equals(cVar.f15102b)) {
                this.f15056h.mo20674P(0);
                zs6.mo7300a(this.f15056h, 4);
                this.f15040T += 4;
            }
            return mo23258r();
        }
    }

    /* renamed from: K */
    public final void mo23248K(iy1 iy1, byte[] bArr, int i) throws IOException {
        int length = bArr.length + i;
        if (this.f15059k.mo20677b() < length) {
            this.f15059k.mo20671M(Arrays.copyOf(bArr, length + i));
        } else {
            System.arraycopy(bArr, 0, this.f15059k.mo20679d(), 0, bArr.length);
        }
        iy1.readFully(this.f15059k.mo20679d(), bArr.length, i);
        this.f15059k.mo20674P(0);
        this.f15059k.mo20673O(length);
    }

    /* renamed from: L */
    public final int mo23249L(iy1 iy1, zs6 zs6, int i) throws IOException {
        int a = this.f15058j.mo20676a();
        if (a <= 0) {
            return zs6.mo7304e(iy1, i, false);
        }
        int min = Math.min(i, a);
        zs6.mo7300a(this.f15058j, min);
        return min;
    }

    /* renamed from: M */
    public final void mo23250M(iy1 iy1, byte[] bArr, int i, int i2) throws IOException {
        int min = Math.min(i2, this.f15058j.mo20676a());
        iy1.readFully(bArr, i + min, i2 - min);
        if (min > 0) {
            this.f15058j.mo20685j(bArr, i, min);
        }
    }

    /* renamed from: a */
    public final void mo151a() {
    }

    /* renamed from: b */
    public void mo152b(long j, long j2) {
        this.f15022B = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        this.f15027G = 0;
        this.f15047a.reset();
        this.f15049b.mo25040e();
        mo23243E();
        for (int i = 0; i < this.f15051c.size(); i++) {
            this.f15051c.valueAt(i).mo23278n();
        }
    }

    /* renamed from: d */
    public final int mo154d(iy1 iy1, mt4 mt4) throws IOException {
        this.f15026F = false;
        boolean z = true;
        while (z && !this.f15026F) {
            z = this.f15047a.mo425b(iy1);
            if (z && mo23241C(mt4, iy1.getPosition())) {
                return 1;
            }
        }
        if (z) {
            return 0;
        }
        for (int i = 0; i < this.f15051c.size(); i++) {
            C2844c valueAt = this.f15051c.valueAt(i);
            valueAt.mo23273f();
            valueAt.mo23277j();
        }
        return -1;
    }

    /* renamed from: e */
    public final boolean mo155e(iy1 iy1) throws IOException {
        return new p56().mo24451b(iy1);
    }

    @EnsuresNonNull({"cueTimesUs", "cueClusterPositions"})
    /* renamed from: i */
    public final void mo23251i(int i) throws ParserException {
        if (this.f15023C == null || this.f15024D == null) {
            throw ParserException.createForMalformedContainer("Element " + i + " must be in a Cues", (Throwable) null);
        }
    }

    /* renamed from: j */
    public final void mo159j(jy1 jy1) {
        this.f15050b0 = jy1;
    }

    @EnsuresNonNull({"currentTrack"})
    /* renamed from: k */
    public final void mo23252k(int i) throws ParserException {
        if (this.f15069u == null) {
            throw ParserException.createForMalformedContainer("Element " + i + " must be in a TrackEntry", (Throwable) null);
        }
    }

    @EnsuresNonNull({"extractorOutput"})
    /* renamed from: l */
    public final void mo23253l() {
        C2725kr.m20989i(this.f15050b0);
    }

    /* renamed from: m */
    public void mo23254m(int i, int i2, iy1 iy1) throws IOException {
        C2844c cVar;
        int i3;
        C2844c cVar2;
        C2844c cVar3;
        long j;
        long j2;
        int i4;
        byte b;
        int i5;
        int i6 = i;
        int i7 = i2;
        iy1 iy12 = iy1;
        int i8 = 0;
        int i9 = 1;
        if (i6 == 161 || i6 == 163) {
            if (this.f15027G == 0) {
                this.f15033M = (int) this.f15049b.mo25039d(iy12, false, true, 8);
                this.f15034N = this.f15049b.mo25038b();
                this.f15029I = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
                this.f15027G = 1;
                this.f15055g.mo20670L(0);
            }
            C2844c cVar4 = this.f15051c.get(this.f15033M);
            if (cVar4 == null) {
                iy12.mo92k(i7 - this.f15034N);
                this.f15027G = 0;
                return;
            }
            cVar4.mo23273f();
            if (this.f15027G == 1) {
                mo23242D(iy12, 3);
                int i10 = (this.f15055g.mo20679d()[2] & 6) >> 1;
                byte b2 = 255;
                if (i10 == 0) {
                    this.f15031K = 1;
                    int[] q = m22414q(this.f15032L, 1);
                    this.f15032L = q;
                    q[0] = (i7 - this.f15034N) - 3;
                } else {
                    int i11 = 4;
                    mo23242D(iy12, 4);
                    int i12 = (this.f15055g.mo20679d()[3] & 255) + 1;
                    this.f15031K = i12;
                    int[] q2 = m22414q(this.f15032L, i12);
                    this.f15032L = q2;
                    if (i10 == 2) {
                        int i13 = this.f15031K;
                        Arrays.fill(q2, 0, i13, ((i7 - this.f15034N) - 4) / i13);
                    } else if (i10 == 1) {
                        int i14 = 0;
                        int i15 = 0;
                        while (true) {
                            i4 = this.f15031K;
                            if (i14 >= i4 - 1) {
                                break;
                            }
                            this.f15032L[i14] = 0;
                            do {
                                i11++;
                                mo23242D(iy12, i11);
                                b = this.f15055g.mo20679d()[i11 - 1] & 255;
                                int[] iArr = this.f15032L;
                                i5 = iArr[i14] + b;
                                iArr[i14] = i5;
                            } while (b == 255);
                            i15 += i5;
                            i14++;
                        }
                        this.f15032L[i4 - 1] = ((i7 - this.f15034N) - i11) - i15;
                    } else if (i10 == 3) {
                        int i16 = 0;
                        int i17 = 0;
                        while (true) {
                            int i18 = this.f15031K;
                            if (i16 >= i18 - 1) {
                                cVar2 = cVar4;
                                this.f15032L[i18 - 1] = ((i7 - this.f15034N) - i11) - i17;
                                break;
                            }
                            this.f15032L[i16] = i8;
                            i11++;
                            mo23242D(iy12, i11);
                            int i19 = i11 - 1;
                            if (this.f15055g.mo20679d()[i19] != 0) {
                                int i20 = i8;
                                while (true) {
                                    if (i20 >= 8) {
                                        cVar3 = cVar4;
                                        j = 0;
                                        break;
                                    }
                                    int i21 = i9 << (7 - i20);
                                    if ((this.f15055g.mo20679d()[i19] & i21) != 0) {
                                        int i22 = i11 + i20;
                                        mo23242D(iy12, i22);
                                        cVar3 = cVar4;
                                        long j3 = (long) ((~i21) & this.f15055g.mo20679d()[i19] & b2);
                                        int i23 = i19 + 1;
                                        while (true) {
                                            j2 = j3;
                                            if (i23 >= i22) {
                                                break;
                                            }
                                            j3 = (j2 << 8) | ((long) (this.f15055g.mo20679d()[i23] & b2));
                                            i23++;
                                            i22 = i22;
                                            b2 = 255;
                                        }
                                        int i24 = i22;
                                        if (i16 > 0) {
                                            j2 -= (1 << ((i20 * 7) + 6)) - 1;
                                        }
                                        j = j2;
                                        i11 = i24;
                                    } else {
                                        C2844c cVar5 = cVar4;
                                        i20++;
                                        i9 = 1;
                                        b2 = 255;
                                    }
                                }
                                if (j >= -2147483648L && j <= 2147483647L) {
                                    int i25 = (int) j;
                                    int[] iArr2 = this.f15032L;
                                    if (i16 != 0) {
                                        i25 += iArr2[i16 - 1];
                                    }
                                    iArr2[i16] = i25;
                                    i17 += i25;
                                    i16++;
                                    cVar4 = cVar3;
                                    i8 = 0;
                                    i9 = 1;
                                    b2 = 255;
                                }
                            } else {
                                throw ParserException.createForMalformedContainer("No valid varint length mask found", (Throwable) null);
                            }
                        }
                        throw ParserException.createForMalformedContainer("EBML lacing sample size out of range.", (Throwable) null);
                    } else {
                        throw ParserException.createForMalformedContainer("Unexpected lacing value: " + i10, (Throwable) null);
                    }
                }
                cVar2 = cVar4;
                this.f15028H = this.f15022B + mo23244F((long) ((this.f15055g.mo20679d()[0] << 8) | (this.f15055g.mo20679d()[1] & 255)));
                cVar = cVar2;
                this.f15035O = (cVar.f15104d == 2 || (i6 == 163 && (this.f15055g.mo20679d()[2] & 128) == 128)) ? 1 : 0;
                this.f15027G = 2;
                this.f15030J = 0;
                i3 = 163;
            } else {
                cVar = cVar4;
                i3 = 163;
            }
            if (i6 == i3) {
                while (true) {
                    int i26 = this.f15030J;
                    if (i26 < this.f15031K) {
                        mo23256o(cVar, ((long) ((this.f15030J * cVar.f15105e) / 1000)) + this.f15028H, this.f15035O, mo23247J(iy12, cVar, this.f15032L[i26], false), 0);
                        this.f15030J++;
                    } else {
                        this.f15027G = 0;
                        return;
                    }
                }
            } else {
                while (true) {
                    int i27 = this.f15030J;
                    if (i27 < this.f15031K) {
                        int[] iArr3 = this.f15032L;
                        iArr3[i27] = mo23247J(iy12, cVar, iArr3[i27], true);
                        this.f15030J++;
                    } else {
                        return;
                    }
                }
            }
        } else if (i6 != 165) {
            if (i6 == 16877) {
                mo23262w(mo23260u(i), iy12, i7);
            } else if (i6 == 16981) {
                mo23252k(i);
                byte[] bArr = new byte[i7];
                this.f15069u.f15109i = bArr;
                iy12.readFully(bArr, 0, i7);
            } else if (i6 == 18402) {
                byte[] bArr2 = new byte[i7];
                iy12.readFully(bArr2, 0, i7);
                mo23260u(i).f15110j = new zs6.C3758a(1, bArr2, 0, 0);
            } else if (i6 == 21419) {
                Arrays.fill(this.f15057i.mo20679d(), (byte) 0);
                iy12.readFully(this.f15057i.mo20679d(), 4 - i7, i7);
                this.f15057i.mo20674P(0);
                this.f15071w = (int) this.f15057i.mo20664F();
            } else if (i6 == 25506) {
                mo23252k(i);
                byte[] bArr3 = new byte[i7];
                this.f15069u.f15111k = bArr3;
                iy12.readFully(bArr3, 0, i7);
            } else if (i6 == 30322) {
                mo23252k(i);
                byte[] bArr4 = new byte[i7];
                this.f15069u.f15122v = bArr4;
                iy12.readFully(bArr4, 0, i7);
            } else {
                throw ParserException.createForMalformedContainer("Unexpected id: " + i6, (Throwable) null);
            }
        } else if (this.f15027G == 2) {
            mo23263x(this.f15051c.get(this.f15033M), this.f15036P, iy12, i7);
        }
    }

    /* renamed from: n */
    public final xs5 mo23255n(cl3 cl3, cl3 cl32) {
        int i;
        if (this.f15065q == -1 || this.f15068t == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED || cl3 == null || cl3.mo12105c() == 0 || cl32 == null || cl32.mo12105c() != cl3.mo12105c()) {
            return new xs5.C3642b(this.f15068t);
        }
        int c = cl3.mo12105c();
        int[] iArr = new int[c];
        long[] jArr = new long[c];
        long[] jArr2 = new long[c];
        long[] jArr3 = new long[c];
        int i2 = 0;
        for (int i3 = 0; i3 < c; i3++) {
            jArr3[i3] = cl3.mo12104b(i3);
            jArr[i3] = this.f15065q + cl32.mo12104b(i3);
        }
        while (true) {
            i = c - 1;
            if (i2 >= i) {
                break;
            }
            int i4 = i2 + 1;
            iArr[i2] = (int) (jArr[i4] - jArr[i2]);
            jArr2[i2] = jArr3[i4] - jArr3[i2];
            i2 = i4;
        }
        iArr[i] = (int) ((this.f15065q + this.f15064p) - jArr[i]);
        long j = this.f15068t - jArr3[i];
        jArr2[i] = j;
        if (j <= 0) {
            gk3.m18132i("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j);
            iArr = Arrays.copyOf(iArr, i);
            jArr = Arrays.copyOf(jArr, i);
            jArr2 = Arrays.copyOf(jArr2, i);
            jArr3 = Arrays.copyOf(jArr3, i);
        }
        return new se0(iArr, jArr, jArr2, jArr3);
    }

    @RequiresNonNull({"#1.output"})
    /* renamed from: o */
    public final void mo23256o(C2844c cVar, long j, int i, int i2, int i3) {
        cy6 cy6 = cVar.f15095T;
        if (cy6 != null) {
            cy6.mo18381c(cVar.f15099X, j, i, i2, i3, cVar.f15110j);
        } else {
            if ("S_TEXT/UTF8".equals(cVar.f15102b) || "S_TEXT/ASS".equals(cVar.f15102b) || "S_TEXT/WEBVTT".equals(cVar.f15102b)) {
                if (this.f15031K > 1) {
                    gk3.m18132i("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j2 = this.f15029I;
                    if (j2 == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                        gk3.m18132i("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        m22409G(cVar.f15102b, j2, this.f15059k.mo20679d());
                        int e = this.f15059k.mo20680e();
                        while (true) {
                            if (e >= this.f15059k.mo20681f()) {
                                break;
                            } else if (this.f15059k.mo20679d()[e] == 0) {
                                this.f15059k.mo20673O(e);
                                break;
                            } else {
                                e++;
                            }
                        }
                        zs6 zs6 = cVar.f15099X;
                        gm4 gm4 = this.f15059k;
                        zs6.mo7300a(gm4, gm4.mo20681f());
                        i2 += this.f15059k.mo20681f();
                    }
                }
            }
            if ((268435456 & i) != 0) {
                if (this.f15031K > 1) {
                    this.f15062n.mo20670L(0);
                } else {
                    int f = this.f15062n.mo20681f();
                    cVar.f15099X.mo7302c(this.f15062n, f, 2);
                    i2 += f;
                }
            }
            cVar.f15099X.mo7301b(j, i, i2, i3, cVar.f15110j);
        }
        this.f15026F = true;
    }

    /* renamed from: p */
    public void mo23257p(int i) throws ParserException {
        mo23253l();
        if (i != 160) {
            if (i == 174) {
                C2844c cVar = (C2844c) C2725kr.m20989i(this.f15069u);
                String str = cVar.f15102b;
                if (str != null) {
                    if (m22416z(str)) {
                        cVar.mo23276i(this.f15050b0, cVar.f15103c);
                        this.f15051c.put(cVar.f15103c, cVar);
                    }
                    this.f15069u = null;
                    return;
                }
                throw ParserException.createForMalformedContainer("CodecId is missing in TrackEntry element", (Throwable) null);
            } else if (i == 19899) {
                int i2 = this.f15071w;
                if (i2 != -1) {
                    long j = this.f15072x;
                    if (j != -1) {
                        if (i2 == 475249515) {
                            this.f15074z = j;
                            return;
                        }
                        return;
                    }
                }
                throw ParserException.createForMalformedContainer("Mandatory element SeekID or SeekPosition not found", (Throwable) null);
            } else if (i == 25152) {
                mo23252k(i);
                C2844c cVar2 = this.f15069u;
                if (!cVar2.f15108h) {
                    return;
                }
                if (cVar2.f15110j != null) {
                    cVar2.f15112l = new DrmInitData(new DrmInitData.SchemeData(l70.f14423a, "video/webm", this.f15069u.f15110j.f20678b));
                    return;
                }
                throw ParserException.createForMalformedContainer("Encrypted Track found but ContentEncKeyID was not found", (Throwable) null);
            } else if (i == 28032) {
                mo23252k(i);
                C2844c cVar3 = this.f15069u;
                if (cVar3.f15108h && cVar3.f15109i != null) {
                    throw ParserException.createForMalformedContainer("Combining encryption and compression is not supported", (Throwable) null);
                }
            } else if (i == 357149030) {
                if (this.f15066r == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                    this.f15066r = 1000000;
                }
                long j2 = this.f15067s;
                if (j2 != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                    this.f15068t = mo23244F(j2);
                }
            } else if (i != 374648427) {
                if (i == 475249515) {
                    if (!this.f15070v) {
                        this.f15050b0.mo7715g(mo23255n(this.f15023C, this.f15024D));
                        this.f15070v = true;
                    }
                    this.f15023C = null;
                    this.f15024D = null;
                }
            } else if (this.f15051c.size() != 0) {
                this.f15050b0.mo7722p();
            } else {
                throw ParserException.createForMalformedContainer("No valid tracks were found", (Throwable) null);
            }
        } else if (this.f15027G == 2) {
            C2844c cVar4 = this.f15051c.get(this.f15033M);
            cVar4.mo23273f();
            if (this.f15038R > 0 && "A_OPUS".equals(cVar4.f15102b)) {
                this.f15062n.mo20671M(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.f15038R).array());
            }
            int i3 = 0;
            for (int i4 = 0; i4 < this.f15031K; i4++) {
                i3 += this.f15032L[i4];
            }
            int i5 = 0;
            while (i5 < this.f15031K) {
                long j3 = this.f15028H + ((long) ((cVar4.f15105e * i5) / 1000));
                int i6 = this.f15035O;
                if (i5 == 0 && !this.f15037Q) {
                    i6 |= 1;
                }
                int i7 = this.f15032L[i5];
                int i8 = i3 - i7;
                mo23256o(cVar4, j3, i6, i7, i8);
                i5++;
                i3 = i8;
            }
            this.f15027G = 0;
        }
    }

    /* renamed from: r */
    public final int mo23258r() {
        int i = this.f15040T;
        mo23243E();
        return i;
    }

    /* renamed from: s */
    public void mo23259s(int i, double d) throws ParserException {
        if (i == 181) {
            mo23260u(i).f15092Q = (int) d;
        } else if (i != 17545) {
            switch (i) {
                case 21969:
                    mo23260u(i).f15079D = (float) d;
                    return;
                case 21970:
                    mo23260u(i).f15080E = (float) d;
                    return;
                case 21971:
                    mo23260u(i).f15081F = (float) d;
                    return;
                case 21972:
                    mo23260u(i).f15082G = (float) d;
                    return;
                case 21973:
                    mo23260u(i).f15083H = (float) d;
                    return;
                case 21974:
                    mo23260u(i).f15084I = (float) d;
                    return;
                case 21975:
                    mo23260u(i).f15085J = (float) d;
                    return;
                case 21976:
                    mo23260u(i).f15086K = (float) d;
                    return;
                case 21977:
                    mo23260u(i).f15087L = (float) d;
                    return;
                case 21978:
                    mo23260u(i).f15088M = (float) d;
                    return;
                default:
                    switch (i) {
                        case 30323:
                            mo23260u(i).f15119s = (float) d;
                            return;
                        case 30324:
                            mo23260u(i).f15120t = (float) d;
                            return;
                        case 30325:
                            mo23260u(i).f15121u = (float) d;
                            return;
                        default:
                            return;
                    }
            }
        } else {
            this.f15067s = (long) d;
        }
    }

    /* renamed from: u */
    public C2844c mo23260u(int i) throws ParserException {
        mo23252k(i);
        return this.f15069u;
    }

    /* renamed from: v */
    public int mo23261v(int i) {
        switch (i) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 238:
            case 241:
            case 251:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30114:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 165:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    /* renamed from: w */
    public void mo23262w(C2844c cVar, iy1 iy1, int i) throws IOException {
        if (cVar.f15107g == 1685485123 || cVar.f15107g == 1685480259) {
            byte[] bArr = new byte[i];
            cVar.f15089N = bArr;
            iy1.readFully(bArr, 0, i);
            return;
        }
        iy1.mo92k(i);
    }

    /* renamed from: x */
    public void mo23263x(C2844c cVar, int i, iy1 iy1, int i2) throws IOException {
        if (i != 4 || !"V_VP9".equals(cVar.f15102b)) {
            iy1.mo92k(i2);
            return;
        }
        this.f15062n.mo20670L(i2);
        iy1.readFully(this.f15062n.mo20679d(), 0, i2);
    }

    /* renamed from: y */
    public void mo23264y(int i, long j) throws ParserException {
        if (i != 20529) {
            if (i != 20530) {
                boolean z = false;
                switch (i) {
                    case 131:
                        mo23260u(i).f15104d = (int) j;
                        return;
                    case 136:
                        C2844c u = mo23260u(i);
                        if (j == 1) {
                            z = true;
                        }
                        u.f15097V = z;
                        return;
                    case 155:
                        this.f15029I = mo23244F(j);
                        return;
                    case 159:
                        mo23260u(i).f15090O = (int) j;
                        return;
                    case 176:
                        mo23260u(i).f15113m = (int) j;
                        return;
                    case 179:
                        mo23251i(i);
                        this.f15023C.mo12103a(mo23244F(j));
                        return;
                    case 186:
                        mo23260u(i).f15114n = (int) j;
                        return;
                    case 215:
                        mo23260u(i).f15103c = (int) j;
                        return;
                    case 231:
                        this.f15022B = mo23244F(j);
                        return;
                    case 238:
                        this.f15036P = (int) j;
                        return;
                    case 241:
                        if (!this.f15025E) {
                            mo23251i(i);
                            this.f15024D.mo12103a(j);
                            this.f15025E = true;
                            return;
                        }
                        return;
                    case 251:
                        this.f15037Q = true;
                        return;
                    case 16871:
                        int unused = mo23260u(i).f15107g = (int) j;
                        return;
                    case 16980:
                        if (j != 3) {
                            throw ParserException.createForMalformedContainer("ContentCompAlgo " + j + " not supported", (Throwable) null);
                        }
                        return;
                    case 17029:
                        if (j < 1 || j > 2) {
                            throw ParserException.createForMalformedContainer("DocTypeReadVersion " + j + " not supported", (Throwable) null);
                        }
                        return;
                    case 17143:
                        if (j != 1) {
                            throw ParserException.createForMalformedContainer("EBMLReadVersion " + j + " not supported", (Throwable) null);
                        }
                        return;
                    case 18401:
                        if (j != 5) {
                            throw ParserException.createForMalformedContainer("ContentEncAlgo " + j + " not supported", (Throwable) null);
                        }
                        return;
                    case 18408:
                        if (j != 1) {
                            throw ParserException.createForMalformedContainer("AESSettingsCipherMode " + j + " not supported", (Throwable) null);
                        }
                        return;
                    case 21420:
                        this.f15072x = j + this.f15065q;
                        return;
                    case 21432:
                        int i2 = (int) j;
                        mo23252k(i);
                        if (i2 == 0) {
                            this.f15069u.f15123w = 0;
                            return;
                        } else if (i2 == 1) {
                            this.f15069u.f15123w = 2;
                            return;
                        } else if (i2 == 3) {
                            this.f15069u.f15123w = 1;
                            return;
                        } else if (i2 == 15) {
                            this.f15069u.f15123w = 3;
                            return;
                        } else {
                            return;
                        }
                    case 21680:
                        mo23260u(i).f15115o = (int) j;
                        return;
                    case 21682:
                        mo23260u(i).f15117q = (int) j;
                        return;
                    case 21690:
                        mo23260u(i).f15116p = (int) j;
                        return;
                    case 21930:
                        C2844c u2 = mo23260u(i);
                        if (j == 1) {
                            z = true;
                        }
                        u2.f15096U = z;
                        return;
                    case 21998:
                        mo23260u(i).f15106f = (int) j;
                        return;
                    case 22186:
                        mo23260u(i).f15093R = j;
                        return;
                    case 22203:
                        mo23260u(i).f15094S = j;
                        return;
                    case 25188:
                        mo23260u(i).f15091P = (int) j;
                        return;
                    case 30114:
                        this.f15038R = j;
                        return;
                    case 30321:
                        mo23252k(i);
                        int i3 = (int) j;
                        if (i3 == 0) {
                            this.f15069u.f15118r = 0;
                            return;
                        } else if (i3 == 1) {
                            this.f15069u.f15118r = 1;
                            return;
                        } else if (i3 == 2) {
                            this.f15069u.f15118r = 2;
                            return;
                        } else if (i3 == 3) {
                            this.f15069u.f15118r = 3;
                            return;
                        } else {
                            return;
                        }
                    case 2352003:
                        mo23260u(i).f15105e = (int) j;
                        return;
                    case 2807729:
                        this.f15066r = j;
                        return;
                    default:
                        switch (i) {
                            case 21945:
                                mo23252k(i);
                                int i4 = (int) j;
                                if (i4 == 1) {
                                    this.f15069u.f15076A = 2;
                                    return;
                                } else if (i4 == 2) {
                                    this.f15069u.f15076A = 1;
                                    return;
                                } else {
                                    return;
                                }
                            case 21946:
                                mo23252k(i);
                                int c = C0787e.m5331c((int) j);
                                if (c != -1) {
                                    this.f15069u.f15126z = c;
                                    return;
                                }
                                return;
                            case 21947:
                                mo23252k(i);
                                this.f15069u.f15124x = true;
                                int b = C0787e.m5330b((int) j);
                                if (b != -1) {
                                    this.f15069u.f15125y = b;
                                    return;
                                }
                                return;
                            case 21948:
                                mo23260u(i).f15077B = (int) j;
                                return;
                            case 21949:
                                mo23260u(i).f15078C = (int) j;
                                return;
                            default:
                                return;
                        }
                }
            } else if (j != 1) {
                throw ParserException.createForMalformedContainer("ContentEncodingScope " + j + " not supported", (Throwable) null);
            }
        } else if (j != 0) {
            throw ParserException.createForMalformedContainer("ContentEncodingOrder " + j + " not supported", (Throwable) null);
        }
    }

    public mp3(int i) {
        this(new v71(), i);
    }

    public mp3(an1 an1, int i) {
        this.f15065q = -1;
        this.f15066r = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        this.f15067s = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        this.f15068t = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        this.f15074z = -1;
        this.f15021A = -1;
        this.f15022B = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        this.f15047a = an1;
        an1.mo424a(new C2843b());
        this.f15052d = (i & 1) == 0;
        this.f15049b = new q87();
        this.f15051c = new SparseArray<>();
        this.f15055g = new gm4(4);
        this.f15056h = new gm4(ByteBuffer.allocate(4).putInt(-1).array());
        this.f15057i = new gm4(4);
        this.f15053e = new gm4(q24.f16719a);
        this.f15054f = new gm4(4);
        this.f15058j = new gm4();
        this.f15059k = new gm4();
        this.f15060l = new gm4(8);
        this.f15061m = new gm4();
        this.f15062n = new gm4();
        this.f15032L = new int[1];
    }
}
