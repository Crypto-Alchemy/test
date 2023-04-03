package p000;

import java.security.SecureRandom;
import okhttp3.internal.p023ws.WebSocketProtocol;

/* renamed from: xy6 */
/* compiled from: TweetNaclFast */
public final class xy6 {

    /* renamed from: a */
    public static final byte[] f46065a = new byte[16];

    /* renamed from: b */
    public static final byte[] f46066b;

    /* renamed from: c */
    public static final long[] f46067c = new long[16];

    /* renamed from: d */
    public static final long[] f46068d;

    /* renamed from: e */
    public static final long[] f46069e;

    /* renamed from: f */
    public static final long[] f46070f = {30883, 4953, 19914, 30187, 55467, 16705, 2637, 112, 59544, 30585, 16505, 36039, 65139, 11119, 27886, 20995};

    /* renamed from: g */
    public static final long[] f46071g = {61785, 9906, 39828, 60374, 45398, 33411, 5274, 224, 53552, 61171, 33010, 6542, 64743, 22239, 55772, 9222};

    /* renamed from: h */
    public static final long[] f46072h = {54554, 36645, 11616, 51542, 42930, 38181, 51040, 26924, 56412, 64982, 57905, 49316, 21502, 52590, 14035, 8553};

    /* renamed from: i */
    public static final long[] f46073i = {26200, 26214, 26214, 26214, 26214, 26214, 26214, 26214, 26214, 26214, 26214, 26214, 26214, 26214, 26214, 26214};

    /* renamed from: j */
    public static final long[] f46074j = {41136, 18958, 6951, 50414, 58488, 44335, 6150, 12099, 55207, 15867, 153, 11085, 57099, 20417, 9344, 11139};

    /* renamed from: k */
    public static final byte[] f46075k = {101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107};

    /* renamed from: l */
    public static final long[] f46076l = {4794697086780616226L, 8158064640168781261L, -5349999486874862801L, -1606136188198331460L, 4131703408338449720L, 6480981068601479193L, -7908458776815382629L, -6116909921290321640L, -2880145864133508542L, 1334009975649890238L, 2608012711638119052L, 6128411473006802146L, 8268148722764581231L, -9160688886553864527L, -7215885187991268811L, -4495734319001033068L, -1973867731355612462L, -1171420211273849373L, 1135362057144423861L, 2597628984639134821L, 3308224258029322869L, 5365058923640841347L, 6679025012923562964L, 8573033837759648693L, -7476448914759557205L, -6327057829258317296L, -5763719355590565569L, -4658551843659510044L, -4116276920077217854L, -3051310485924567259L, 489312712824947311L, 1452737877330783856L, 2861767655752347644L, 3322285676063803686L, 5560940570517711597L, 5996557281743188959L, 7280758554555802590L, 8532644243296465576L, -9096487096722542874L, -7894198246740708037L, -6719396339535248540L, -6333637450476146687L, -4446306890439682159L, -4076793802049405392L, -3345356375505022440L, -2983346525034927856L, -860691631967231958L, 1182934255886127544L, 1847814050463011016L, 2177327727835720531L, 2830643537854262169L, 3796741975233480872L, 4115178125766777443L, 5681478168544905931L, 6601373596472566643L, 7507060721942968483L, 8399075790359081724L, 8693463985226723168L, -8878714635349349518L, -8302665154208450068L, -8016688836872298968L, -6606660893046293015L, -4685533653050689259L, -4147400797238176981L, -3880063495543823972L, -3348786107499101689L, -1523767162380948706L, -757361751448694408L, 500013540394364858L, 748580250866718886L, 1242879168328830382L, 1977374033974150939L, 2944078676154940804L, 3659926193048069267L, 4368137639120453308L, 4836135668995329356L, 5532061633213252278L, 6448918945643986474L, 6902733635092675308L, 7801388544844847127L};

    /* renamed from: m */
    public static final long[] f46077m = {237, 211, 245, 92, 26, 99, 18, 88, 214, 156, 247, 162, 222, 249, 222, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16};

    /* renamed from: n */
    public static final SecureRandom f46078n = new SecureRandom();

    /* renamed from: xy6$a */
    /* compiled from: TweetNaclFast */
    public static final class C9614a {

        /* renamed from: xy6$a$a */
        /* compiled from: TweetNaclFast */
        public static class C9615a {

            /* renamed from: a */
            public byte[] f46079a = new byte[32];

            /* renamed from: b */
            public byte[] f46080b = new byte[64];

            /* renamed from: a */
            public byte[] mo66985a() {
                return this.f46079a;
            }

            /* renamed from: b */
            public byte[] mo66986b() {
                return this.f46080b;
            }
        }

        /* renamed from: a */
        public static C9615a m74171a(byte[] bArr) {
            C9615a aVar = new C9615a();
            byte[] a = aVar.mo66985a();
            byte[] b = aVar.mo66986b();
            for (int i = 0; i < 32; i++) {
                b[i] = bArr[i];
            }
            xy6.m74157i(a, b, true);
            return aVar;
        }
    }

    static {
        byte[] bArr = new byte[32];
        f46066b = bArr;
        bArr[0] = 9;
        long[] jArr = new long[16];
        f46068d = jArr;
        long[] jArr2 = new long[16];
        f46069e = jArr2;
        jArr[0] = 1;
        jArr2[0] = 56129;
        jArr2[1] = 1;
    }

    /* renamed from: a */
    public static void m74149a(long[] jArr, int i, long[] jArr2, int i2, long[] jArr3, int i3) {
        for (int i4 = 0; i4 < 16; i4++) {
            jArr[i4 + i] = jArr2[i4 + i2] + jArr3[i4 + i3];
        }
    }

    /* JADX WARNING: type inference failed for: r96v0, types: [long[]] */
    /* JADX WARNING: type inference failed for: r100v0, types: [long[]] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m74150b(long[] r96, int r97, long[] r98, int r99, long[] r100, int r101) {
        /*
            int r0 = r101 + 0
            r0 = r100[r0]
            int r2 = r101 + 1
            r2 = r100[r2]
            int r4 = r101 + 2
            r4 = r100[r4]
            int r6 = r101 + 3
            r6 = r100[r6]
            int r8 = r101 + 4
            r8 = r100[r8]
            int r10 = r101 + 5
            r10 = r100[r10]
            int r12 = r101 + 6
            r12 = r100[r12]
            int r14 = r101 + 7
            r14 = r100[r14]
            int r16 = r101 + 8
            r16 = r100[r16]
            int r18 = r101 + 9
            r18 = r100[r18]
            int r20 = r101 + 10
            r20 = r100[r20]
            int r22 = r101 + 11
            r22 = r100[r22]
            int r24 = r101 + 12
            r24 = r100[r24]
            int r26 = r101 + 13
            r26 = r100[r26]
            int r28 = r101 + 14
            r28 = r100[r28]
            int r30 = r101 + 15
            r30 = r100[r30]
            int r32 = r99 + 0
            r32 = r98[r32]
            long r34 = r32 * r0
            r36 = 0
            long r34 = r34 + r36
            long r38 = r32 * r2
            long r38 = r38 + r36
            long r40 = r32 * r4
            long r40 = r40 + r36
            long r42 = r32 * r6
            long r42 = r42 + r36
            long r44 = r32 * r8
            long r44 = r44 + r36
            long r46 = r32 * r10
            long r46 = r46 + r36
            long r48 = r32 * r12
            long r48 = r48 + r36
            long r50 = r32 * r14
            long r50 = r50 + r36
            long r52 = r32 * r16
            long r52 = r52 + r36
            long r54 = r32 * r18
            long r54 = r54 + r36
            long r56 = r32 * r20
            long r56 = r56 + r36
            long r58 = r32 * r22
            long r58 = r58 + r36
            long r60 = r32 * r24
            long r60 = r60 + r36
            long r62 = r32 * r26
            long r62 = r62 + r36
            long r64 = r32 * r28
            long r64 = r64 + r36
            long r32 = r32 * r30
            long r32 = r32 + r36
            int r66 = r99 + 1
            r66 = r98[r66]
            long r68 = r66 * r0
            long r38 = r38 + r68
            long r68 = r66 * r2
            long r40 = r40 + r68
            long r68 = r66 * r4
            long r42 = r42 + r68
            long r68 = r66 * r6
            long r44 = r44 + r68
            long r68 = r66 * r8
            long r46 = r46 + r68
            long r68 = r66 * r10
            long r48 = r48 + r68
            long r68 = r66 * r12
            long r50 = r50 + r68
            long r68 = r66 * r14
            long r52 = r52 + r68
            long r68 = r66 * r16
            long r54 = r54 + r68
            long r68 = r66 * r18
            long r56 = r56 + r68
            long r68 = r66 * r20
            long r58 = r58 + r68
            long r68 = r66 * r22
            long r60 = r60 + r68
            long r68 = r66 * r24
            long r62 = r62 + r68
            long r68 = r66 * r26
            long r64 = r64 + r68
            long r68 = r66 * r28
            long r32 = r32 + r68
            long r66 = r66 * r30
            long r66 = r66 + r36
            int r68 = r99 + 2
            r68 = r98[r68]
            long r70 = r68 * r0
            long r40 = r40 + r70
            long r70 = r68 * r2
            long r42 = r42 + r70
            long r70 = r68 * r4
            long r44 = r44 + r70
            long r70 = r68 * r6
            long r46 = r46 + r70
            long r70 = r68 * r8
            long r48 = r48 + r70
            long r70 = r68 * r10
            long r50 = r50 + r70
            long r70 = r68 * r12
            long r52 = r52 + r70
            long r70 = r68 * r14
            long r54 = r54 + r70
            long r70 = r68 * r16
            long r56 = r56 + r70
            long r70 = r68 * r18
            long r58 = r58 + r70
            long r70 = r68 * r20
            long r60 = r60 + r70
            long r70 = r68 * r22
            long r62 = r62 + r70
            long r70 = r68 * r24
            long r64 = r64 + r70
            long r70 = r68 * r26
            long r32 = r32 + r70
            long r70 = r68 * r28
            long r66 = r66 + r70
            long r68 = r68 * r30
            long r68 = r68 + r36
            int r70 = r99 + 3
            r70 = r98[r70]
            long r72 = r70 * r0
            long r42 = r42 + r72
            long r72 = r70 * r2
            long r44 = r44 + r72
            long r72 = r70 * r4
            long r46 = r46 + r72
            long r72 = r70 * r6
            long r48 = r48 + r72
            long r72 = r70 * r8
            long r50 = r50 + r72
            long r72 = r70 * r10
            long r52 = r52 + r72
            long r72 = r70 * r12
            long r54 = r54 + r72
            long r72 = r70 * r14
            long r56 = r56 + r72
            long r72 = r70 * r16
            long r58 = r58 + r72
            long r72 = r70 * r18
            long r60 = r60 + r72
            long r72 = r70 * r20
            long r62 = r62 + r72
            long r72 = r70 * r22
            long r64 = r64 + r72
            long r72 = r70 * r24
            long r32 = r32 + r72
            long r72 = r70 * r26
            long r66 = r66 + r72
            long r72 = r70 * r28
            long r68 = r68 + r72
            long r70 = r70 * r30
            long r70 = r70 + r36
            int r72 = r99 + 4
            r72 = r98[r72]
            long r74 = r72 * r0
            long r44 = r44 + r74
            long r74 = r72 * r2
            long r46 = r46 + r74
            long r74 = r72 * r4
            long r48 = r48 + r74
            long r74 = r72 * r6
            long r50 = r50 + r74
            long r74 = r72 * r8
            long r52 = r52 + r74
            long r74 = r72 * r10
            long r54 = r54 + r74
            long r74 = r72 * r12
            long r56 = r56 + r74
            long r74 = r72 * r14
            long r58 = r58 + r74
            long r74 = r72 * r16
            long r60 = r60 + r74
            long r74 = r72 * r18
            long r62 = r62 + r74
            long r74 = r72 * r20
            long r64 = r64 + r74
            long r74 = r72 * r22
            long r32 = r32 + r74
            long r74 = r72 * r24
            long r66 = r66 + r74
            long r74 = r72 * r26
            long r68 = r68 + r74
            long r74 = r72 * r28
            long r70 = r70 + r74
            long r72 = r72 * r30
            long r72 = r72 + r36
            int r74 = r99 + 5
            r74 = r98[r74]
            long r76 = r74 * r0
            long r46 = r46 + r76
            long r76 = r74 * r2
            long r48 = r48 + r76
            long r76 = r74 * r4
            long r50 = r50 + r76
            long r76 = r74 * r6
            long r52 = r52 + r76
            long r76 = r74 * r8
            long r54 = r54 + r76
            long r76 = r74 * r10
            long r56 = r56 + r76
            long r76 = r74 * r12
            long r58 = r58 + r76
            long r76 = r74 * r14
            long r60 = r60 + r76
            long r76 = r74 * r16
            long r62 = r62 + r76
            long r76 = r74 * r18
            long r64 = r64 + r76
            long r76 = r74 * r20
            long r32 = r32 + r76
            long r76 = r74 * r22
            long r66 = r66 + r76
            long r76 = r74 * r24
            long r68 = r68 + r76
            long r76 = r74 * r26
            long r70 = r70 + r76
            long r76 = r74 * r28
            long r72 = r72 + r76
            long r74 = r74 * r30
            long r74 = r74 + r36
            int r76 = r99 + 6
            r76 = r98[r76]
            long r78 = r76 * r0
            long r48 = r48 + r78
            long r78 = r76 * r2
            long r50 = r50 + r78
            long r78 = r76 * r4
            long r52 = r52 + r78
            long r78 = r76 * r6
            long r54 = r54 + r78
            long r78 = r76 * r8
            long r56 = r56 + r78
            long r78 = r76 * r10
            long r58 = r58 + r78
            long r78 = r76 * r12
            long r60 = r60 + r78
            long r78 = r76 * r14
            long r62 = r62 + r78
            long r78 = r76 * r16
            long r64 = r64 + r78
            long r78 = r76 * r18
            long r32 = r32 + r78
            long r78 = r76 * r20
            long r66 = r66 + r78
            long r78 = r76 * r22
            long r68 = r68 + r78
            long r78 = r76 * r24
            long r70 = r70 + r78
            long r78 = r76 * r26
            long r72 = r72 + r78
            long r78 = r76 * r28
            long r74 = r74 + r78
            long r76 = r76 * r30
            long r76 = r76 + r36
            int r78 = r99 + 7
            r78 = r98[r78]
            long r80 = r78 * r0
            long r50 = r50 + r80
            long r80 = r78 * r2
            long r52 = r52 + r80
            long r80 = r78 * r4
            long r54 = r54 + r80
            long r80 = r78 * r6
            long r56 = r56 + r80
            long r80 = r78 * r8
            long r58 = r58 + r80
            long r80 = r78 * r10
            long r60 = r60 + r80
            long r80 = r78 * r12
            long r62 = r62 + r80
            long r80 = r78 * r14
            long r64 = r64 + r80
            long r80 = r78 * r16
            long r32 = r32 + r80
            long r80 = r78 * r18
            long r66 = r66 + r80
            long r80 = r78 * r20
            long r68 = r68 + r80
            long r80 = r78 * r22
            long r70 = r70 + r80
            long r80 = r78 * r24
            long r72 = r72 + r80
            long r80 = r78 * r26
            long r74 = r74 + r80
            long r80 = r78 * r28
            long r76 = r76 + r80
            long r78 = r78 * r30
            long r78 = r78 + r36
            int r80 = r99 + 8
            r80 = r98[r80]
            long r82 = r80 * r0
            long r52 = r52 + r82
            long r82 = r80 * r2
            long r54 = r54 + r82
            long r82 = r80 * r4
            long r56 = r56 + r82
            long r82 = r80 * r6
            long r58 = r58 + r82
            long r82 = r80 * r8
            long r60 = r60 + r82
            long r82 = r80 * r10
            long r62 = r62 + r82
            long r82 = r80 * r12
            long r64 = r64 + r82
            long r82 = r80 * r14
            long r32 = r32 + r82
            long r82 = r80 * r16
            long r66 = r66 + r82
            long r82 = r80 * r18
            long r68 = r68 + r82
            long r82 = r80 * r20
            long r70 = r70 + r82
            long r82 = r80 * r22
            long r72 = r72 + r82
            long r82 = r80 * r24
            long r74 = r74 + r82
            long r82 = r80 * r26
            long r76 = r76 + r82
            long r82 = r80 * r28
            long r78 = r78 + r82
            long r80 = r80 * r30
            long r80 = r80 + r36
            int r82 = r99 + 9
            r82 = r98[r82]
            long r84 = r82 * r0
            long r54 = r54 + r84
            long r84 = r82 * r2
            long r56 = r56 + r84
            long r84 = r82 * r4
            long r58 = r58 + r84
            long r84 = r82 * r6
            long r60 = r60 + r84
            long r84 = r82 * r8
            long r62 = r62 + r84
            long r84 = r82 * r10
            long r64 = r64 + r84
            long r84 = r82 * r12
            long r32 = r32 + r84
            long r84 = r82 * r14
            long r66 = r66 + r84
            long r84 = r82 * r16
            long r68 = r68 + r84
            long r84 = r82 * r18
            long r70 = r70 + r84
            long r84 = r82 * r20
            long r72 = r72 + r84
            long r84 = r82 * r22
            long r74 = r74 + r84
            long r84 = r82 * r24
            long r76 = r76 + r84
            long r84 = r82 * r26
            long r78 = r78 + r84
            long r84 = r82 * r28
            long r80 = r80 + r84
            long r82 = r82 * r30
            long r82 = r82 + r36
            int r84 = r99 + 10
            r84 = r98[r84]
            long r86 = r84 * r0
            long r56 = r56 + r86
            long r86 = r84 * r2
            long r58 = r58 + r86
            long r86 = r84 * r4
            long r60 = r60 + r86
            long r86 = r84 * r6
            long r62 = r62 + r86
            long r86 = r84 * r8
            long r64 = r64 + r86
            long r86 = r84 * r10
            long r32 = r32 + r86
            long r86 = r84 * r12
            long r66 = r66 + r86
            long r86 = r84 * r14
            long r68 = r68 + r86
            long r86 = r84 * r16
            long r70 = r70 + r86
            long r86 = r84 * r18
            long r72 = r72 + r86
            long r86 = r84 * r20
            long r74 = r74 + r86
            long r86 = r84 * r22
            long r76 = r76 + r86
            long r86 = r84 * r24
            long r78 = r78 + r86
            long r86 = r84 * r26
            long r80 = r80 + r86
            long r86 = r84 * r28
            long r82 = r82 + r86
            long r84 = r84 * r30
            long r84 = r84 + r36
            int r86 = r99 + 11
            r86 = r98[r86]
            long r88 = r86 * r0
            long r58 = r58 + r88
            long r88 = r86 * r2
            long r60 = r60 + r88
            long r88 = r86 * r4
            long r62 = r62 + r88
            long r88 = r86 * r6
            long r64 = r64 + r88
            long r88 = r86 * r8
            long r32 = r32 + r88
            long r88 = r86 * r10
            long r66 = r66 + r88
            long r88 = r86 * r12
            long r68 = r68 + r88
            long r88 = r86 * r14
            long r70 = r70 + r88
            long r88 = r86 * r16
            long r72 = r72 + r88
            long r88 = r86 * r18
            long r74 = r74 + r88
            long r88 = r86 * r20
            long r76 = r76 + r88
            long r88 = r86 * r22
            long r78 = r78 + r88
            long r88 = r86 * r24
            long r80 = r80 + r88
            long r88 = r86 * r26
            long r82 = r82 + r88
            long r88 = r86 * r28
            long r84 = r84 + r88
            long r86 = r86 * r30
            long r86 = r86 + r36
            int r88 = r99 + 12
            r88 = r98[r88]
            long r90 = r88 * r0
            long r60 = r60 + r90
            long r90 = r88 * r2
            long r62 = r62 + r90
            long r90 = r88 * r4
            long r64 = r64 + r90
            long r90 = r88 * r6
            long r32 = r32 + r90
            long r90 = r88 * r8
            long r66 = r66 + r90
            long r90 = r88 * r10
            long r68 = r68 + r90
            long r90 = r88 * r12
            long r70 = r70 + r90
            long r90 = r88 * r14
            long r72 = r72 + r90
            long r90 = r88 * r16
            long r74 = r74 + r90
            long r90 = r88 * r18
            long r76 = r76 + r90
            long r90 = r88 * r20
            long r78 = r78 + r90
            long r90 = r88 * r22
            long r80 = r80 + r90
            long r90 = r88 * r24
            long r82 = r82 + r90
            long r90 = r88 * r26
            long r84 = r84 + r90
            long r90 = r88 * r28
            long r86 = r86 + r90
            long r88 = r88 * r30
            long r88 = r88 + r36
            int r90 = r99 + 13
            r90 = r98[r90]
            long r92 = r90 * r0
            long r62 = r62 + r92
            long r92 = r90 * r2
            long r64 = r64 + r92
            long r92 = r90 * r4
            long r32 = r32 + r92
            long r92 = r90 * r6
            long r66 = r66 + r92
            long r92 = r90 * r8
            long r68 = r68 + r92
            long r92 = r90 * r10
            long r70 = r70 + r92
            long r92 = r90 * r12
            long r72 = r72 + r92
            long r92 = r90 * r14
            long r74 = r74 + r92
            long r92 = r90 * r16
            long r76 = r76 + r92
            long r92 = r90 * r18
            long r78 = r78 + r92
            long r92 = r90 * r20
            long r80 = r80 + r92
            long r92 = r90 * r22
            long r82 = r82 + r92
            long r92 = r90 * r24
            long r84 = r84 + r92
            long r92 = r90 * r26
            long r86 = r86 + r92
            long r92 = r90 * r28
            long r88 = r88 + r92
            long r90 = r90 * r30
            long r90 = r90 + r36
            int r92 = r99 + 14
            r92 = r98[r92]
            long r94 = r92 * r0
            long r64 = r64 + r94
            long r94 = r92 * r2
            long r32 = r32 + r94
            long r94 = r92 * r4
            long r66 = r66 + r94
            long r94 = r92 * r6
            long r68 = r68 + r94
            long r94 = r92 * r8
            long r70 = r70 + r94
            long r94 = r92 * r10
            long r72 = r72 + r94
            long r94 = r92 * r12
            long r74 = r74 + r94
            long r94 = r92 * r14
            long r76 = r76 + r94
            long r94 = r92 * r16
            long r78 = r78 + r94
            long r94 = r92 * r18
            long r80 = r80 + r94
            long r94 = r92 * r20
            long r82 = r82 + r94
            long r94 = r92 * r22
            long r84 = r84 + r94
            long r94 = r92 * r24
            long r86 = r86 + r94
            long r94 = r92 * r26
            long r88 = r88 + r94
            long r94 = r92 * r28
            long r90 = r90 + r94
            long r92 = r92 * r30
            long r92 = r92 + r36
            int r94 = r99 + 15
            r94 = r98[r94]
            long r0 = r0 * r94
            long r32 = r32 + r0
            long r2 = r2 * r94
            long r66 = r66 + r2
            long r4 = r4 * r94
            long r68 = r68 + r4
            long r6 = r6 * r94
            long r70 = r70 + r6
            long r8 = r8 * r94
            long r72 = r72 + r8
            long r10 = r10 * r94
            long r74 = r74 + r10
            long r12 = r12 * r94
            long r76 = r76 + r12
            long r14 = r14 * r94
            long r78 = r78 + r14
            long r16 = r16 * r94
            long r80 = r80 + r16
            long r18 = r18 * r94
            long r82 = r82 + r18
            long r20 = r20 * r94
            long r84 = r84 + r20
            long r22 = r22 * r94
            long r86 = r86 + r22
            long r24 = r24 * r94
            long r88 = r88 + r24
            long r26 = r26 * r94
            long r90 = r90 + r26
            long r28 = r28 * r94
            long r92 = r92 + r28
            long r94 = r94 * r30
            long r94 = r94 + r36
            r0 = 38
            long r66 = r66 * r0
            long r34 = r34 + r66
            long r68 = r68 * r0
            long r38 = r38 + r68
            long r70 = r70 * r0
            long r40 = r40 + r70
            long r72 = r72 * r0
            long r42 = r42 + r72
            long r74 = r74 * r0
            long r44 = r44 + r74
            long r76 = r76 * r0
            long r46 = r46 + r76
            long r78 = r78 * r0
            long r48 = r48 + r78
            long r80 = r80 * r0
            long r50 = r50 + r80
            long r82 = r82 * r0
            long r52 = r52 + r82
            long r84 = r84 * r0
            long r54 = r54 + r84
            long r86 = r86 * r0
            long r56 = r56 + r86
            long r88 = r88 * r0
            long r58 = r58 + r88
            long r90 = r90 * r0
            long r60 = r60 + r90
            long r92 = r92 * r0
            long r62 = r62 + r92
            long r94 = r94 * r0
            long r64 = r64 + r94
            r0 = 1
            long r34 = r34 + r0
            r2 = 65535(0xffff, double:3.23786E-319)
            long r34 = r34 + r2
            r4 = 16
            long r5 = r34 >> r4
            r7 = 65536(0x10000, double:3.2379E-319)
            long r9 = r5 * r7
            long r34 = r34 - r9
            long r38 = r38 + r5
            long r38 = r38 + r2
            long r5 = r38 >> r4
            long r9 = r5 * r7
            long r38 = r38 - r9
            long r40 = r40 + r5
            long r40 = r40 + r2
            long r5 = r40 >> r4
            long r9 = r5 * r7
            long r40 = r40 - r9
            long r42 = r42 + r5
            long r42 = r42 + r2
            long r5 = r42 >> r4
            long r9 = r5 * r7
            long r42 = r42 - r9
            long r44 = r44 + r5
            long r44 = r44 + r2
            long r5 = r44 >> r4
            long r9 = r5 * r7
            long r44 = r44 - r9
            long r46 = r46 + r5
            long r46 = r46 + r2
            long r5 = r46 >> r4
            long r9 = r5 * r7
            long r46 = r46 - r9
            long r48 = r48 + r5
            long r48 = r48 + r2
            long r5 = r48 >> r4
            long r9 = r5 * r7
            long r48 = r48 - r9
            long r50 = r50 + r5
            long r50 = r50 + r2
            long r5 = r50 >> r4
            long r9 = r5 * r7
            long r50 = r50 - r9
            long r52 = r52 + r5
            long r52 = r52 + r2
            long r5 = r52 >> r4
            long r9 = r5 * r7
            long r52 = r52 - r9
            long r54 = r54 + r5
            long r54 = r54 + r2
            long r5 = r54 >> r4
            long r9 = r5 * r7
            long r54 = r54 - r9
            long r56 = r56 + r5
            long r56 = r56 + r2
            long r5 = r56 >> r4
            long r9 = r5 * r7
            long r56 = r56 - r9
            long r58 = r58 + r5
            long r58 = r58 + r2
            long r5 = r58 >> r4
            long r9 = r5 * r7
            long r58 = r58 - r9
            long r60 = r60 + r5
            long r60 = r60 + r2
            long r5 = r60 >> r4
            long r9 = r5 * r7
            long r60 = r60 - r9
            long r62 = r62 + r5
            long r62 = r62 + r2
            long r5 = r62 >> r4
            long r9 = r5 * r7
            long r62 = r62 - r9
            long r64 = r64 + r5
            long r64 = r64 + r2
            long r5 = r64 >> r4
            long r9 = r5 * r7
            long r64 = r64 - r9
            long r32 = r32 + r5
            long r32 = r32 + r2
            long r5 = r32 >> r4
            long r9 = r5 * r7
            long r32 = r32 - r9
            long r5 = r5 - r0
            r9 = 37
            long r9 = r9 * r5
            long r5 = r5 + r9
            long r34 = r34 + r5
            long r34 = r34 + r0
            long r34 = r34 + r2
            long r5 = r34 >> r4
            long r9 = r5 * r7
            long r34 = r34 - r9
            long r38 = r38 + r5
            long r38 = r38 + r2
            long r5 = r38 >> r4
            long r9 = r5 * r7
            long r38 = r38 - r9
            long r40 = r40 + r5
            long r40 = r40 + r2
            long r5 = r40 >> r4
            long r9 = r5 * r7
            long r40 = r40 - r9
            long r42 = r42 + r5
            long r42 = r42 + r2
            long r5 = r42 >> r4
            long r9 = r5 * r7
            long r42 = r42 - r9
            long r44 = r44 + r5
            long r44 = r44 + r2
            long r5 = r44 >> r4
            long r9 = r5 * r7
            long r44 = r44 - r9
            long r46 = r46 + r5
            long r46 = r46 + r2
            long r5 = r46 >> r4
            long r9 = r5 * r7
            long r46 = r46 - r9
            long r48 = r48 + r5
            long r48 = r48 + r2
            long r5 = r48 >> r4
            long r9 = r5 * r7
            long r48 = r48 - r9
            long r50 = r50 + r5
            long r50 = r50 + r2
            long r5 = r50 >> r4
            long r9 = r5 * r7
            long r50 = r50 - r9
            long r52 = r52 + r5
            long r52 = r52 + r2
            long r5 = r52 >> r4
            long r9 = r5 * r7
            long r52 = r52 - r9
            long r54 = r54 + r5
            long r54 = r54 + r2
            long r5 = r54 >> r4
            long r9 = r5 * r7
            long r54 = r54 - r9
            long r56 = r56 + r5
            long r56 = r56 + r2
            long r5 = r56 >> r4
            long r9 = r5 * r7
            long r56 = r56 - r9
            long r58 = r58 + r5
            long r58 = r58 + r2
            long r5 = r58 >> r4
            long r9 = r5 * r7
            long r58 = r58 - r9
            long r60 = r60 + r5
            long r60 = r60 + r2
            long r5 = r60 >> r4
            long r9 = r5 * r7
            long r60 = r60 - r9
            long r62 = r62 + r5
            long r62 = r62 + r2
            long r5 = r62 >> r4
            long r9 = r5 * r7
            long r62 = r62 - r9
            long r64 = r64 + r5
            long r64 = r64 + r2
            long r5 = r64 >> r4
            long r9 = r5 * r7
            long r64 = r64 - r9
            long r32 = r32 + r5
            long r32 = r32 + r2
            long r2 = r32 >> r4
            long r7 = r7 * r2
            long r32 = r32 - r7
            long r2 = r2 - r0
            r0 = 37
            long r0 = r0 * r2
            long r2 = r2 + r0
            long r34 = r34 + r2
            int r0 = r97 + 0
            r96[r0] = r34
            int r0 = r97 + 1
            r96[r0] = r38
            int r0 = r97 + 2
            r96[r0] = r40
            int r0 = r97 + 3
            r96[r0] = r42
            int r0 = r97 + 4
            r96[r0] = r44
            int r0 = r97 + 5
            r96[r0] = r46
            int r0 = r97 + 6
            r96[r0] = r48
            int r0 = r97 + 7
            r96[r0] = r50
            int r0 = r97 + 8
            r96[r0] = r52
            int r0 = r97 + 9
            r96[r0] = r54
            int r0 = r97 + 10
            r96[r0] = r56
            int r0 = r97 + 11
            r96[r0] = r58
            int r0 = r97 + 12
            r96[r0] = r60
            int r0 = r97 + 13
            r96[r0] = r62
            int r0 = r97 + 14
            r96[r0] = r64
            int r0 = r97 + 15
            r96[r0] = r32
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.xy6.m74150b(long[], int, long[], int, long[], int):void");
    }

    /* renamed from: c */
    public static void m74151c(long[] jArr, int i, long[] jArr2, int i2) {
        m74150b(jArr, i, jArr2, i2, jArr2, i2);
    }

    /* renamed from: d */
    public static void m74152d(long[] jArr, int i, long[] jArr2, int i2, long[] jArr3, int i3) {
        for (int i4 = 0; i4 < 16; i4++) {
            jArr[i4 + i] = jArr2[i4 + i2] - jArr3[i4 + i3];
        }
    }

    /* renamed from: e */
    public static void m74153e(long[][] jArr, long[][] jArr2) {
        long[] jArr3 = new long[16];
        long[] jArr4 = new long[16];
        long[] jArr5 = new long[16];
        long[] jArr6 = new long[16];
        long[] jArr7 = new long[16];
        long[] jArr8 = new long[16];
        long[] jArr9 = new long[16];
        long[] jArr10 = new long[16];
        long[] jArr11 = new long[16];
        long[] jArr12 = jArr[0];
        long[] jArr13 = jArr[1];
        long[] jArr14 = jArr[2];
        long[] jArr15 = jArr[3];
        long[] jArr16 = jArr2[0];
        long[] jArr17 = jArr2[1];
        long[] jArr18 = jArr2[2];
        long[] jArr19 = jArr2[3];
        m74152d(jArr3, 0, jArr13, 0, jArr12, 0);
        m74152d(jArr7, 0, jArr17, 0, jArr16, 0);
        m74150b(jArr3, 0, jArr3, 0, jArr7, 0);
        m74149a(jArr4, 0, jArr12, 0, jArr13, 0);
        m74149a(jArr7, 0, jArr16, 0, jArr17, 0);
        m74150b(jArr4, 0, jArr4, 0, jArr7, 0);
        long[] jArr20 = jArr5;
        m74150b(jArr20, 0, jArr15, 0, jArr19, 0);
        m74150b(jArr20, 0, jArr5, 0, f46071g, 0);
        long[] jArr21 = jArr6;
        m74150b(jArr21, 0, jArr14, 0, jArr18, 0);
        m74149a(jArr21, 0, jArr6, 0, jArr6, 0);
        m74152d(jArr8, 0, jArr4, 0, jArr3, 0);
        long[] jArr22 = jArr6;
        long[] jArr23 = jArr5;
        m74152d(jArr9, 0, jArr22, 0, jArr23, 0);
        m74149a(jArr10, 0, jArr22, 0, jArr23, 0);
        m74149a(jArr11, 0, jArr4, 0, jArr3, 0);
        m74150b(jArr12, 0, jArr8, 0, jArr9, 0);
        m74150b(jArr13, 0, jArr11, 0, jArr10, 0);
        m74150b(jArr14, 0, jArr10, 0, jArr9, 0);
        m74150b(jArr15, 0, jArr8, 0, jArr11, 0);
    }

    /* renamed from: f */
    public static void m74154f(long[] jArr) {
        long j = 1;
        for (int i = 0; i < 16; i++) {
            long j2 = jArr[i] + j + WebSocketProtocol.PAYLOAD_SHORT_MAX;
            j = j2 >> 16;
            jArr[i] = j2 - (65536 * j);
        }
        long j3 = j - 1;
        jArr[0] = jArr[0] + j3 + (37 * j3);
    }

    /* renamed from: g */
    public static int m74155g(byte[] bArr, byte[] bArr2, int i, int i2) {
        int i3;
        int i4;
        int[] iArr = {1779033703, -1150833019, 1013904242, -1521486534, 1359893119, -1694144372, 528734635, 1541459225};
        int[] iArr2 = {-205731576, -2067093701, -23791573, 1595750129, -1377402159, 725511199, -79577749, 327033209};
        byte[] bArr3 = new byte[256];
        if (i2 >= 128) {
            m74156h(iArr, iArr2, bArr2, i, i2);
            i3 = i2 % 128;
        } else {
            i3 = i2;
        }
        for (int i5 = 0; i5 < i3; i5++) {
            bArr3[i5] = bArr2[(i2 - i3) + i5 + i];
        }
        bArr3[i3] = Byte.MIN_VALUE;
        if (i3 < 112) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        int i6 = 256 - (i4 * 128);
        bArr3[i6 - 9] = 0;
        m74170v(bArr3, i6 - 8, (long) (i2 << 3));
        m74156h(iArr, iArr2, bArr3, 0, i6);
        for (int i7 = 0; i7 < 8; i7++) {
            m74170v(bArr, i7 * 8, (((long) iArr[i7]) << 32) | (((long) iArr2[i7]) & 4294967295L));
        }
        return 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v8, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v38, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v24, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v14, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v16, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v16, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v35, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v15, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v17, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r37v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v20, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v12, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r37v21, resolved type: int} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m74156h(int[] r43, int[] r44, byte[] r45, int r46, int r47) {
        /*
            r0 = 16
            int[] r1 = new int[r0]
            int[] r2 = new int[r0]
            r3 = 0
            r4 = r43[r3]
            r5 = 1
            r6 = r43[r5]
            r7 = 2
            r8 = r43[r7]
            r9 = 3
            r10 = r43[r9]
            r11 = 4
            r12 = r43[r11]
            r13 = 5
            r14 = r43[r13]
            r15 = 6
            r16 = r43[r15]
            r17 = 7
            r18 = r43[r17]
            r19 = r44[r3]
            r20 = r44[r5]
            r21 = r44[r7]
            r22 = r44[r9]
            r23 = r44[r11]
            r24 = r44[r13]
            r25 = r44[r15]
            r26 = r44[r17]
            r13 = r3
            r27 = r26
            r26 = r25
            r25 = r24
            r24 = r23
            r23 = r22
            r22 = r21
            r21 = r20
            r20 = r19
            r19 = r18
            r18 = r16
            r16 = r14
            r14 = r12
            r12 = r10
            r10 = r8
            r8 = r6
            r6 = r4
            r4 = r47
        L_0x004d:
            r11 = 128(0x80, float:1.794E-43)
            if (r4 < r11) goto L_0x04f0
            r11 = r3
        L_0x0052:
            if (r11 >= r0) goto L_0x00b3
            int r30 = r11 * 8
            int r30 = r30 + r13
            int r31 = r30 + 0
            int r31 = r31 + r46
            byte r9 = r45[r31]
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r9 = r9 << 24
            int r31 = r30 + 1
            int r31 = r31 + r46
            byte r7 = r45[r31]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r7 = r7 << r0
            r7 = r7 | r9
            int r9 = r30 + 2
            int r9 = r9 + r46
            byte r9 = r45[r9]
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r9 = r9 << 8
            r7 = r7 | r9
            int r9 = r30 + 3
            int r9 = r9 + r46
            byte r9 = r45[r9]
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r9 = r9 << r3
            r7 = r7 | r9
            r1[r11] = r7
            int r7 = r30 + 4
            int r7 = r7 + r46
            byte r7 = r45[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r7 = r7 << 24
            int r9 = r30 + 5
            int r9 = r9 + r46
            byte r9 = r45[r9]
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r9 = r9 << r0
            r7 = r7 | r9
            int r9 = r30 + 6
            int r9 = r9 + r46
            byte r9 = r45[r9]
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r9 = r9 << 8
            r7 = r7 | r9
            int r30 = r30 + 7
            int r30 = r30 + r46
            byte r9 = r45[r30]
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r9 = r9 << r3
            r7 = r7 | r9
            r2[r11] = r7
            int r11 = r11 + 1
            r7 = 2
            r9 = 3
            goto L_0x0052
        L_0x00b3:
            r9 = r3
            r7 = r24
        L_0x00b6:
            r11 = 80
            r24 = 65535(0xffff, float:9.1834E-41)
            if (r9 >= r11) goto L_0x030e
            r11 = r27 & r24
            int r27 = r27 >>> 16
            r30 = r19 & r24
            int r19 = r19 >>> 16
            int r31 = r14 >>> 14
            int r34 = r7 << 18
            r31 = r31 | r34
            int r34 = r14 >>> 18
            int r35 = r7 << 14
            r34 = r34 | r35
            r31 = r31 ^ r34
            int r34 = r7 >>> 9
            int r35 = r14 << 23
            r34 = r34 | r35
            r31 = r31 ^ r34
            int r34 = r7 >>> 14
            int r35 = r14 << 18
            r34 = r34 | r35
            int r35 = r7 >>> 18
            int r36 = r14 << 14
            r35 = r35 | r36
            r34 = r34 ^ r35
            int r35 = r14 >>> 9
            int r36 = r7 << 23
            r35 = r35 | r36
            r34 = r34 ^ r35
            r35 = r34 & r24
            int r11 = r11 + r35
            int r34 = r34 >>> 16
            int r27 = r27 + r34
            r34 = r31 & r24
            int r30 = r30 + r34
            int r31 = r31 >>> 16
            int r19 = r19 + r31
            r31 = r14 & r16
            int r5 = ~r14
            r5 = r5 & r18
            r5 = r31 ^ r5
            r31 = r7 & r25
            int r15 = ~r7
            r15 = r15 & r26
            r15 = r31 ^ r15
            r31 = r15 & r24
            int r11 = r11 + r31
            int r15 = r15 >>> r0
            int r27 = r27 + r15
            r15 = r5 & r24
            int r30 = r30 + r15
            int r5 = r5 >>> r0
            int r19 = r19 + r5
            long[] r5 = f46076l
            r36 = r5[r9]
            r5 = 32
            long r38 = r36 >>> r5
            r40 = -1
            r15 = r1
            long r0 = r38 & r40
            int r0 = (int) r0
            long r36 = r36 >>> r3
            r31 = r4
            long r3 = r36 & r40
            int r3 = (int) r3
            r4 = r3 & r24
            int r11 = r11 + r4
            r4 = 16
            int r3 = r3 >>> r4
            int r27 = r27 + r3
            r3 = r0 & r24
            int r30 = r30 + r3
            int r0 = r0 >>> r4
            int r19 = r19 + r0
            int r0 = r9 % 16
            r3 = r15[r0]
            r5 = r2[r0]
            r36 = r5 & r24
            int r11 = r11 + r36
            int r5 = r5 >>> r4
            int r27 = r27 + r5
            r5 = r3 & r24
            int r30 = r30 + r5
            int r3 = r3 >>> r4
            int r19 = r19 + r3
            int r3 = r11 >>> 16
            int r27 = r27 + r3
            int r3 = r27 >>> 16
            int r30 = r30 + r3
            int r3 = r30 >>> 16
            int r19 = r19 + r3
            r3 = r30 & r24
            r4 = 16
            int r5 = r19 << 16
            r3 = r3 | r5
            r5 = r11 & r24
            int r11 = r27 << 16
            r5 = r5 | r11
            r11 = r5 & r24
            int r19 = r5 >>> 16
            r27 = r3 & r24
            int r3 = r3 >>> r4
            int r4 = r6 >>> 28
            int r30 = r20 << 4
            r4 = r4 | r30
            int r30 = r20 >>> 2
            int r36 = r6 << 30
            r30 = r30 | r36
            r4 = r4 ^ r30
            int r30 = r20 >>> 7
            int r36 = r6 << 25
            r30 = r30 | r36
            r4 = r4 ^ r30
            int r30 = r20 >>> 28
            int r36 = r6 << 4
            r30 = r30 | r36
            int r36 = r6 >>> 2
            int r37 = r20 << 30
            r36 = r36 | r37
            r30 = r30 ^ r36
            int r36 = r6 >>> 7
            int r37 = r20 << 25
            r36 = r36 | r37
            r30 = r30 ^ r36
            r36 = r30 & r24
            int r36 = r11 + r36
            r5 = 16
            int r30 = r30 >>> 16
            int r30 = r19 + r30
            r37 = r4 & r24
            int r37 = r27 + r37
            int r4 = r4 >>> r5
            int r4 = r4 + r3
            r38 = r6 & r8
            r39 = r6 & r10
            r38 = r38 ^ r39
            r39 = r8 & r10
            r38 = r38 ^ r39
            r39 = r20 & r21
            r40 = r20 & r22
            r39 = r39 ^ r40
            r40 = r21 & r22
            r39 = r39 ^ r40
            r40 = r39 & r24
            int r36 = r36 + r40
            r5 = 16
            int r39 = r39 >>> 16
            int r30 = r30 + r39
            r39 = r38 & r24
            int r37 = r37 + r39
            int r38 = r38 >>> 16
            int r4 = r4 + r38
            int r38 = r36 >>> 16
            int r30 = r30 + r38
            int r38 = r30 >>> 16
            int r37 = r37 + r38
            int r38 = r37 >>> 16
            int r4 = r4 + r38
            r37 = r37 & r24
            r5 = 16
            int r4 = r4 << r5
            r4 = r37 | r4
            r36 = r36 & r24
            int r30 = r30 << 16
            r30 = r36 | r30
            r36 = r23 & r24
            int r23 = r23 >>> 16
            r37 = r12 & r24
            int r12 = r12 >>> 16
            int r36 = r36 + r11
            int r23 = r23 + r19
            int r37 = r37 + r27
            int r12 = r12 + r3
            int r3 = r36 >>> 16
            int r23 = r23 + r3
            int r3 = r23 >>> 16
            int r37 = r37 + r3
            int r3 = r37 >>> 16
            int r12 = r12 + r3
            r3 = r37 & r24
            r5 = 16
            int r11 = r12 << 16
            r3 = r3 | r11
            r11 = r36 & r24
            int r12 = r23 << 16
            r11 = r11 | r12
            r12 = 15
            if (r0 != r12) goto L_0x02e8
            r0 = 0
        L_0x021a:
            if (r0 >= r5) goto L_0x02e8
            r12 = r15[r0]
            r19 = r2[r0]
            r23 = r19 & r24
            int r19 = r19 >>> 16
            r27 = r12 & r24
            int r12 = r12 >>> r5
            int r36 = r0 + 9
            int r36 = r36 % 16
            r37 = r15[r36]
            r36 = r2[r36]
            r38 = r36 & r24
            int r23 = r23 + r38
            int r36 = r36 >>> 16
            int r19 = r19 + r36
            r36 = r37 & r24
            int r27 = r27 + r36
            int r36 = r37 >>> 16
            int r12 = r12 + r36
            int r36 = r0 + 1
            int r37 = r36 % 16
            r38 = r15[r37]
            r37 = r2[r37]
            int r39 = r38 >>> 1
            int r40 = r37 << 31
            r39 = r39 | r40
            int r40 = r38 >>> 8
            int r41 = r37 << 24
            r40 = r40 | r41
            r39 = r39 ^ r40
            int r40 = r38 >>> 7
            r39 = r39 ^ r40
            int r40 = r37 >>> 1
            int r41 = r38 << 31
            r40 = r40 | r41
            int r41 = r37 >>> 8
            int r42 = r38 << 24
            r41 = r41 | r42
            r40 = r40 ^ r41
            int r37 = r37 >>> 7
            int r38 = r38 << 25
            r37 = r37 | r38
            r37 = r40 ^ r37
            r38 = r37 & r24
            int r23 = r23 + r38
            r5 = 16
            int r37 = r37 >>> 16
            int r19 = r19 + r37
            r37 = r39 & r24
            int r27 = r27 + r37
            int r37 = r39 >>> 16
            int r12 = r12 + r37
            int r37 = r0 + 14
            int r37 = r37 % 16
            r38 = r15[r37]
            r37 = r2[r37]
            int r39 = r38 >>> 19
            int r40 = r37 << 13
            r39 = r39 | r40
            int r40 = r37 >>> 29
            int r41 = r38 << 3
            r40 = r40 | r41
            r39 = r39 ^ r40
            int r40 = r38 >>> 6
            r39 = r39 ^ r40
            int r40 = r37 >>> 19
            int r41 = r38 << 13
            r40 = r40 | r41
            int r41 = r38 >>> 29
            int r42 = r37 << 3
            r41 = r41 | r42
            r40 = r40 ^ r41
            r35 = 6
            int r37 = r37 >>> 6
            int r38 = r38 << 26
            r37 = r37 | r38
            r37 = r40 ^ r37
            r38 = r37 & r24
            int r23 = r23 + r38
            r5 = 16
            int r37 = r37 >>> 16
            int r19 = r19 + r37
            r37 = r39 & r24
            int r27 = r27 + r37
            int r37 = r39 >>> 16
            int r12 = r12 + r37
            int r37 = r23 >>> 16
            int r19 = r19 + r37
            int r37 = r19 >>> 16
            int r27 = r27 + r37
            int r37 = r27 >>> 16
            int r12 = r12 + r37
            r27 = r27 & r24
            r5 = 16
            int r12 = r12 << r5
            r12 = r27 | r12
            r15[r0] = r12
            r12 = r23 & r24
            int r19 = r19 << 16
            r12 = r12 | r19
            r2[r0] = r12
            r0 = r36
            r5 = 16
            goto L_0x021a
        L_0x02e8:
            int r9 = r9 + 1
            r12 = r10
            r1 = r15
            r19 = r18
            r23 = r22
            r27 = r26
            r0 = 16
            r5 = 1
            r15 = 6
            r10 = r8
            r18 = r16
            r22 = r21
            r26 = r25
            r8 = r6
            r25 = r7
            r7 = r11
            r16 = r14
            r21 = r20
            r20 = r30
            r14 = r3
            r6 = r4
            r4 = r31
            r3 = 0
            goto L_0x00b6
        L_0x030e:
            r15 = r1
            r31 = r4
            r0 = r20 & r24
            int r3 = r20 >>> 16
            r4 = r6 & r24
            int r6 = r6 >>> 16
            r1 = 0
            r9 = r43[r1]
            r11 = r44[r1]
            r20 = r11 & r24
            int r0 = r0 + r20
            r5 = 16
            int r11 = r11 >>> r5
            int r3 = r3 + r11
            r11 = r9 & r24
            int r4 = r4 + r11
            int r9 = r9 >>> r5
            int r6 = r6 + r9
            int r9 = r0 >>> 16
            int r3 = r3 + r9
            int r9 = r3 >>> 16
            int r4 = r4 + r9
            int r9 = r4 >>> 16
            int r6 = r6 + r9
            r4 = r4 & r24
            r5 = 16
            int r6 = r6 << r5
            r6 = r6 | r4
            r1 = 0
            r43[r1] = r6
            r0 = r0 & r24
            int r3 = r3 << r5
            r20 = r0 | r3
            r44[r1] = r20
            r0 = r21 & r24
            int r3 = r21 >>> 16
            r4 = r8 & r24
            int r8 = r8 >>> 16
            r9 = 1
            r11 = r43[r9]
            r21 = r44[r9]
            r9 = r21 & r24
            int r0 = r0 + r9
            r5 = 16
            int r9 = r21 >>> 16
            int r3 = r3 + r9
            r9 = r11 & r24
            int r4 = r4 + r9
            int r9 = r11 >>> 16
            int r8 = r8 + r9
            int r9 = r0 >>> 16
            int r3 = r3 + r9
            int r9 = r3 >>> 16
            int r4 = r4 + r9
            int r9 = r4 >>> 16
            int r8 = r8 + r9
            r4 = r4 & r24
            r5 = 16
            int r8 = r8 << r5
            r8 = r8 | r4
            r4 = 1
            r43[r4] = r8
            r0 = r0 & r24
            int r3 = r3 << r5
            r21 = r0 | r3
            r44[r4] = r21
            r0 = r22 & r24
            int r3 = r22 >>> 16
            r9 = r10 & r24
            int r10 = r10 >>> 16
            r11 = 2
            r22 = r43[r11]
            r30 = r44[r11]
            r11 = r30 & r24
            int r0 = r0 + r11
            r5 = 16
            int r11 = r30 >>> 16
            int r3 = r3 + r11
            r11 = r22 & r24
            int r9 = r9 + r11
            int r11 = r22 >>> 16
            int r10 = r10 + r11
            int r11 = r0 >>> 16
            int r3 = r3 + r11
            int r11 = r3 >>> 16
            int r9 = r9 + r11
            int r11 = r9 >>> 16
            int r10 = r10 + r11
            r9 = r9 & r24
            r5 = 16
            int r10 = r10 << r5
            r10 = r10 | r9
            r9 = 2
            r43[r9] = r10
            r0 = r0 & r24
            int r3 = r3 << r5
            r22 = r0 | r3
            r44[r9] = r22
            r0 = r23 & r24
            int r3 = r23 >>> 16
            r11 = r12 & r24
            int r12 = r12 >>> 16
            r23 = 3
            r30 = r43[r23]
            r33 = r44[r23]
            r23 = r33 & r24
            int r0 = r0 + r23
            r5 = 16
            int r23 = r33 >>> 16
            int r3 = r3 + r23
            r23 = r30 & r24
            int r11 = r11 + r23
            int r23 = r30 >>> 16
            int r12 = r12 + r23
            int r23 = r0 >>> 16
            int r3 = r3 + r23
            int r23 = r3 >>> 16
            int r11 = r11 + r23
            int r23 = r11 >>> 16
            int r12 = r12 + r23
            r11 = r11 & r24
            r5 = 16
            int r12 = r12 << r5
            r12 = r12 | r11
            r11 = 3
            r43[r11] = r12
            r0 = r0 & r24
            int r3 = r3 << r5
            r23 = r0 | r3
            r44[r11] = r23
            r0 = r7 & r24
            int r3 = r7 >>> 16
            r7 = r14 & r24
            int r14 = r14 >>> 16
            r29 = 4
            r30 = r43[r29]
            r32 = r44[r29]
            r33 = r32 & r24
            int r0 = r0 + r33
            r5 = 16
            int r32 = r32 >>> 16
            int r3 = r3 + r32
            r32 = r30 & r24
            int r7 = r7 + r32
            int r30 = r30 >>> 16
            int r14 = r14 + r30
            int r30 = r0 >>> 16
            int r3 = r3 + r30
            int r30 = r3 >>> 16
            int r7 = r7 + r30
            int r30 = r7 >>> 16
            int r14 = r14 + r30
            r7 = r7 & r24
            r5 = 16
            int r14 = r14 << r5
            r14 = r14 | r7
            r7 = 4
            r43[r7] = r14
            r0 = r0 & r24
            int r3 = r3 << r5
            r0 = r0 | r3
            r44[r7] = r0
            r3 = r25 & r24
            int r25 = r25 >>> 16
            r29 = r16 & r24
            int r16 = r16 >>> 16
            r28 = 5
            r30 = r43[r28]
            r32 = r44[r28]
            r33 = r32 & r24
            int r3 = r3 + r33
            r5 = 16
            int r32 = r32 >>> 16
            int r25 = r25 + r32
            r32 = r30 & r24
            int r29 = r29 + r32
            int r30 = r30 >>> 16
            int r16 = r16 + r30
            int r30 = r3 >>> 16
            int r25 = r25 + r30
            int r30 = r25 >>> 16
            int r29 = r29 + r30
            int r30 = r29 >>> 16
            int r16 = r16 + r30
            r29 = r29 & r24
            r5 = 16
            int r16 = r16 << 16
            r16 = r29 | r16
            r28 = 5
            r43[r28] = r16
            r3 = r3 & r24
            int r25 = r25 << 16
            r25 = r3 | r25
            r44[r28] = r25
            r3 = r26 & r24
            int r26 = r26 >>> 16
            r29 = r18 & r24
            int r18 = r18 >>> 16
            r30 = 6
            r32 = r43[r30]
            r33 = r44[r30]
            r30 = r33 & r24
            int r3 = r3 + r30
            r5 = 16
            int r30 = r33 >>> 16
            int r26 = r26 + r30
            r30 = r32 & r24
            int r29 = r29 + r30
            int r30 = r32 >>> 16
            int r18 = r18 + r30
            int r30 = r3 >>> 16
            int r26 = r26 + r30
            int r30 = r26 >>> 16
            int r29 = r29 + r30
            int r30 = r29 >>> 16
            int r18 = r18 + r30
            r29 = r29 & r24
            r5 = 16
            int r18 = r18 << 16
            r18 = r29 | r18
            r29 = 6
            r43[r29] = r18
            r3 = r3 & r24
            int r26 = r26 << 16
            r26 = r3 | r26
            r44[r29] = r26
            r3 = r27 & r24
            int r27 = r27 >>> 16
            r30 = r19 & r24
            int r19 = r19 >>> 16
            r32 = r43[r17]
            r33 = r44[r17]
            r34 = r33 & r24
            int r3 = r3 + r34
            r5 = 16
            int r33 = r33 >>> 16
            int r27 = r27 + r33
            r33 = r32 & r24
            int r30 = r30 + r33
            int r32 = r32 >>> 16
            int r19 = r19 + r32
            int r32 = r3 >>> 16
            int r27 = r27 + r32
            int r32 = r27 >>> 16
            int r30 = r30 + r32
            int r32 = r30 >>> 16
            int r19 = r19 + r32
            r30 = r30 & r24
            r5 = 16
            int r19 = r19 << 16
            r19 = r30 | r19
            r43[r17] = r19
            r3 = r3 & r24
            int r24 = r27 << 16
            r27 = r3 | r24
            r44[r17] = r27
            int r13 = r13 + 128
            int r3 = r31 + -128
            r24 = r0
            r0 = r5
            r7 = r9
            r9 = r11
            r5 = r4
            r4 = r3
            r3 = r1
            r1 = r15
            r15 = r29
            goto L_0x004d
        L_0x04f0:
            r31 = r4
            return r31
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.xy6.m74156h(int[], int[], byte[], int, int):int");
    }

    /* renamed from: i */
    public static int m74157i(byte[] bArr, byte[] bArr2, boolean z) {
        byte[] bArr3 = new byte[64];
        long[][] jArr = {new long[16], new long[16], new long[16], new long[16]};
        if (!z) {
            m74165q(bArr2, 32);
        }
        m74155g(bArr3, bArr2, 0, 32);
        bArr3[0] = (byte) (bArr3[0] & 248);
        byte b = (byte) (bArr3[31] & Byte.MAX_VALUE);
        bArr3[31] = b;
        bArr3[31] = (byte) (64 | b);
        m74166r(jArr, bArr3, 0);
        m74160l(bArr, jArr);
        for (int i = 0; i < 32; i++) {
            bArr2[i + 32] = bArr[i];
        }
        return 0;
    }

    /* renamed from: j */
    public static void m74158j(long[][] jArr, long[][] jArr2, byte b) {
        for (int i = 0; i < 4; i++) {
            m74168t(jArr[i], 0, jArr2[i], 0, b);
        }
    }

    /* renamed from: k */
    public static void m74159k(long[] jArr, int i, long[] jArr2, int i2) {
        long[] jArr3 = new long[16];
        for (int i3 = 0; i3 < 16; i3++) {
            jArr3[i3] = jArr2[i3 + i2];
        }
        for (int i4 = 253; i4 >= 0; i4--) {
            m74151c(jArr3, 0, jArr3, 0);
            if (!(i4 == 2 || i4 == 4)) {
                m74150b(jArr3, 0, jArr3, 0, jArr2, i2);
            }
        }
        for (int i5 = 0; i5 < 16; i5++) {
            jArr[i5 + i] = jArr3[i5];
        }
    }

    /* renamed from: l */
    public static void m74160l(byte[] bArr, long[][] jArr) {
        long[] jArr2 = new long[16];
        long[] jArr3 = new long[16];
        long[] jArr4 = new long[16];
        m74159k(jArr4, 0, jArr[2], 0);
        long[] jArr5 = jArr4;
        m74150b(jArr2, 0, jArr[0], 0, jArr5, 0);
        m74150b(jArr3, 0, jArr[1], 0, jArr5, 0);
        m74161m(bArr, jArr3, 0);
        bArr[31] = (byte) (bArr[31] ^ (m74162n(jArr2, 0) << 7));
    }

    /* renamed from: m */
    public static void m74161m(byte[] bArr, long[] jArr, int i) {
        long[] jArr2 = new long[16];
        long[] jArr3 = new long[16];
        for (int i2 = 0; i2 < 16; i2++) {
            jArr3[i2] = jArr[i2 + i];
        }
        m74154f(jArr3);
        m74154f(jArr3);
        m74154f(jArr3);
        for (int i3 = 0; i3 < 2; i3++) {
            jArr2[0] = jArr3[0] - 65517;
            for (int i4 = 1; i4 < 15; i4++) {
                int i5 = i4 - 1;
                jArr2[i4] = (jArr3[i4] - WebSocketProtocol.PAYLOAD_SHORT_MAX) - (1 & (jArr2[i5] >> 16));
                jArr2[i5] = WebSocketProtocol.PAYLOAD_SHORT_MAX & jArr2[i5];
            }
            long j = jArr2[14];
            long j2 = (jArr3[15] - 32767) - ((j >> 16) & 1);
            jArr2[15] = j2;
            jArr2[14] = WebSocketProtocol.PAYLOAD_SHORT_MAX & j;
            m74168t(jArr3, 0, jArr2, 0, 1 - ((int) (1 & (j2 >> 16))));
        }
        for (int i6 = 0; i6 < 16; i6++) {
            int i7 = i6 * 2;
            long j3 = jArr3[i6];
            bArr[i7] = (byte) ((int) (255 & j3));
            bArr[i7 + 1] = (byte) ((int) (j3 >> 8));
        }
    }

    /* renamed from: n */
    public static byte m74162n(long[] jArr, int i) {
        byte[] bArr = new byte[32];
        m74161m(bArr, jArr, i);
        return (byte) (bArr[0] & 1);
    }

    /* renamed from: o */
    public static byte[] m74163o(int i) {
        return m74164p(new byte[i]);
    }

    /* renamed from: p */
    public static byte[] m74164p(byte[] bArr) {
        f46078n.nextBytes(bArr);
        return bArr;
    }

    /* renamed from: q */
    public static byte[] m74165q(byte[] bArr, int i) {
        System.arraycopy(m74163o(i), 0, bArr, 0, i);
        return bArr;
    }

    /* renamed from: r */
    public static void m74166r(long[][] jArr, byte[] bArr, int i) {
        long[] jArr2 = new long[16];
        long[][] jArr3 = {jArr2, new long[16], new long[16], new long[16]};
        long[] jArr4 = f46072h;
        m74169u(jArr2, jArr4);
        long[] jArr5 = jArr3[1];
        long[] jArr6 = f46073i;
        m74169u(jArr5, jArr6);
        m74169u(jArr3[2], f46068d);
        m74150b(jArr3[3], 0, jArr4, 0, jArr6, 0);
        m74167s(jArr, jArr3, bArr, i);
    }

    /* renamed from: s */
    public static void m74167s(long[][] jArr, long[][] jArr2, byte[] bArr, int i) {
        long[] jArr3 = jArr[0];
        long[] jArr4 = f46067c;
        m74169u(jArr3, jArr4);
        long[] jArr5 = jArr[1];
        long[] jArr6 = f46068d;
        m74169u(jArr5, jArr6);
        m74169u(jArr[2], jArr6);
        m74169u(jArr[3], jArr4);
        for (int i2 = 255; i2 >= 0; i2--) {
            byte b = (byte) ((bArr[(i2 / 8) + i] >>> (i2 & 7)) & 1);
            m74158j(jArr, jArr2, b);
            m74153e(jArr2, jArr);
            m74153e(jArr, jArr);
            m74158j(jArr, jArr2, b);
        }
    }

    /* renamed from: t */
    public static void m74168t(long[] jArr, int i, long[] jArr2, int i2, int i3) {
        long j = (long) (~(i3 - 1));
        for (int i4 = 0; i4 < 16; i4++) {
            int i5 = i4 + i;
            long j2 = jArr[i5];
            int i6 = i4 + i2;
            long j3 = (jArr2[i6] ^ j2) & j;
            jArr[i5] = j2 ^ j3;
            jArr2[i6] = jArr2[i6] ^ j3;
        }
    }

    /* renamed from: u */
    public static void m74169u(long[] jArr, long[] jArr2) {
        for (int i = 0; i < 16; i++) {
            jArr[i] = jArr2[i];
        }
    }

    /* renamed from: v */
    public static void m74170v(byte[] bArr, int i, long j) {
        bArr[i + 7] = (byte) ((int) (j & 255));
        long j2 = j >>> 8;
        bArr[i + 6] = (byte) ((int) (j2 & 255));
        long j3 = j2 >>> 8;
        bArr[i + 5] = (byte) ((int) (j3 & 255));
        long j4 = j3 >>> 8;
        bArr[i + 4] = (byte) ((int) (j4 & 255));
        long j5 = j4 >>> 8;
        bArr[i + 3] = (byte) ((int) (j5 & 255));
        long j6 = j5 >>> 8;
        bArr[i + 2] = (byte) ((int) (j6 & 255));
        long j7 = j6 >>> 8;
        bArr[i + 1] = (byte) ((int) (j7 & 255));
        bArr[i + 0] = (byte) ((int) ((j7 >>> 8) & 255));
    }
}
