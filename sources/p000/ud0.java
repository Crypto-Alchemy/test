package p000;

import java.util.Arrays;

/* renamed from: ud0 */
/* compiled from: CharTypes */
public final class ud0 {

    /* renamed from: a */
    public static final char[] f18422a;

    /* renamed from: b */
    public static final byte[] f18423b;

    /* renamed from: c */
    public static final int[] f18424c;

    /* renamed from: d */
    public static final int[] f18425d;

    /* renamed from: e */
    public static final int[] f18426e;

    /* renamed from: f */
    public static final int[] f18427f;

    /* renamed from: g */
    public static final int[] f18428g;

    /* renamed from: h */
    public static final int[] f18429h;

    /* renamed from: i */
    public static final int[] f18430i;

    /* renamed from: j */
    public static final int[] f18431j;

    /* renamed from: ud0$a */
    /* compiled from: CharTypes */
    public static class C3400a {

        /* renamed from: b */
        public static final C3400a f18432b = new C3400a();

        /* renamed from: a */
        public int[][] f18433a = new int[128][];

        /* renamed from: a */
        public int[] mo26733a(int i) {
            int[] iArr = this.f18433a[i];
            if (iArr == null) {
                iArr = Arrays.copyOf(ud0.f18430i, 128);
                if (iArr[i] == 0) {
                    iArr[i] = -1;
                }
                this.f18433a[i] = iArr;
            }
            return iArr;
        }
    }

    static {
        int i;
        char[] charArray = "0123456789ABCDEF".toCharArray();
        f18422a = charArray;
        int length = charArray.length;
        f18423b = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            f18423b[i2] = (byte) f18422a[i2];
        }
        int[] iArr = new int[256];
        for (int i3 = 0; i3 < 32; i3++) {
            iArr[i3] = -1;
        }
        iArr[34] = 1;
        iArr[92] = 1;
        f18424c = iArr;
        int length2 = iArr.length;
        int[] iArr2 = new int[length2];
        System.arraycopy(iArr, 0, iArr2, 0, length2);
        for (int i4 = 128; i4 < 256; i4++) {
            if ((i4 & 224) == 192) {
                i = 2;
            } else if ((i4 & 240) == 224) {
                i = 3;
            } else if ((i4 & 248) == 240) {
                i = 4;
            } else {
                i = -1;
            }
            iArr2[i4] = i;
        }
        f18425d = iArr2;
        int[] iArr3 = new int[256];
        Arrays.fill(iArr3, -1);
        for (int i5 = 33; i5 < 256; i5++) {
            if (Character.isJavaIdentifierPart((char) i5)) {
                iArr3[i5] = 0;
            }
        }
        iArr3[64] = 0;
        iArr3[35] = 0;
        iArr3[42] = 0;
        iArr3[45] = 0;
        iArr3[43] = 0;
        f18426e = iArr3;
        int[] iArr4 = new int[256];
        System.arraycopy(iArr3, 0, iArr4, 0, 256);
        Arrays.fill(iArr4, 128, 128, 0);
        f18427f = iArr4;
        int[] iArr5 = new int[256];
        int[] iArr6 = f18425d;
        System.arraycopy(iArr6, 128, iArr5, 128, 128);
        Arrays.fill(iArr5, 0, 32, -1);
        iArr5[9] = 0;
        iArr5[10] = 10;
        iArr5[13] = 13;
        iArr5[42] = 42;
        f18428g = iArr5;
        int[] iArr7 = new int[256];
        System.arraycopy(iArr6, 128, iArr7, 128, 128);
        Arrays.fill(iArr7, 0, 32, -1);
        iArr7[32] = 1;
        iArr7[9] = 1;
        iArr7[10] = 10;
        iArr7[13] = 13;
        iArr7[47] = 47;
        iArr7[35] = 35;
        f18429h = iArr7;
        int[] iArr8 = new int[128];
        for (int i6 = 0; i6 < 32; i6++) {
            iArr8[i6] = -1;
        }
        iArr8[34] = 34;
        iArr8[92] = 92;
        iArr8[8] = 98;
        iArr8[9] = 116;
        iArr8[12] = 102;
        iArr8[10] = 110;
        iArr8[13] = 114;
        f18430i = iArr8;
        int[] iArr9 = new int[256];
        f18431j = iArr9;
        Arrays.fill(iArr9, -1);
        for (int i7 = 0; i7 < 10; i7++) {
            f18431j[i7 + 48] = i7;
        }
        for (int i8 = 0; i8 < 6; i8++) {
            int[] iArr10 = f18431j;
            int i9 = i8 + 10;
            iArr10[i8 + 97] = i9;
            iArr10[i8 + 65] = i9;
        }
    }

    /* renamed from: a */
    public static void m28141a(StringBuilder sb, String str) {
        int[] iArr = f18430i;
        int length = iArr.length;
        int length2 = str.length();
        for (int i = 0; i < length2; i++) {
            char charAt = str.charAt(i);
            if (charAt >= length || iArr[charAt] == 0) {
                sb.append(charAt);
            } else {
                sb.append('\\');
                int i2 = iArr[charAt];
                if (i2 < 0) {
                    sb.append('u');
                    sb.append('0');
                    sb.append('0');
                    char[] cArr = f18422a;
                    sb.append(cArr[charAt >> 4]);
                    sb.append(cArr[charAt & 15]);
                } else {
                    sb.append((char) i2);
                }
            }
        }
    }

    /* renamed from: b */
    public static int m28142b(int i) {
        return f18431j[i & 255];
    }

    /* renamed from: c */
    public static byte[] m28143c() {
        return (byte[]) f18423b.clone();
    }

    /* renamed from: d */
    public static char[] m28144d() {
        return (char[]) f18422a.clone();
    }

    /* renamed from: e */
    public static int[] m28145e() {
        return f18430i;
    }

    /* renamed from: f */
    public static int[] m28146f(int i) {
        if (i == 34) {
            return f18430i;
        }
        return C3400a.f18432b.mo26733a(i);
    }

    /* renamed from: g */
    public static int[] m28147g() {
        return f18428g;
    }

    /* renamed from: h */
    public static int[] m28148h() {
        return f18424c;
    }

    /* renamed from: i */
    public static int[] m28149i() {
        return f18426e;
    }

    /* renamed from: j */
    public static int[] m28150j() {
        return f18425d;
    }

    /* renamed from: k */
    public static int[] m28151k() {
        return f18427f;
    }

    /* renamed from: l */
    public static char m28152l(int i) {
        return f18422a[i];
    }
}
