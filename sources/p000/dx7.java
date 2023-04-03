package p000;

import java.io.PrintStream;
import java.util.Date;
import java.util.Random;

/* renamed from: dx7 */
/* compiled from: uisPRNG */
public class dx7 {

    /* renamed from: a */
    public static long f10979a;

    /* renamed from: b */
    public static int f10980b;

    /* renamed from: c */
    public static byte[] f10981c = new byte[20];

    /* renamed from: d */
    public static byte[] f10982d = new byte[20];

    public dx7() {
        f10979a = 0;
        mo19007j();
        m15518g(new byte[20]);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m15512a(byte[] r3, byte[] r4, byte[] r5, int r6) {
        /*
            r0 = 19
        L_0x0002:
            if (r0 >= 0) goto L_0x0005
            return
        L_0x0005:
            byte r1 = r4[r0]
            if (r1 < 0) goto L_0x000a
            goto L_0x000c
        L_0x000a:
            int r1 = r1 + 256
        L_0x000c:
            byte r2 = r5[r0]
            if (r2 < 0) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            int r2 = r2 + 256
        L_0x0013:
            int r1 = r1 + r2
            int r6 = r6 + r1
            byte r1 = (byte) r6
            r3[r0] = r1
            int r6 = r6 >> 8
            int r0 = r0 + -1
            goto L_0x0002
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.dx7.m15512a(byte[], byte[], byte[], int):void");
    }

    /* renamed from: b */
    public static boolean m15513b() {
        if (f10979a == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static void m15514c(byte[] bArr) {
        boolean z;
        yi5 yi5 = new yi5();
        yi5.mo28099n();
        yi5.mo22981d(f10981c, 0, 20);
        yi5.mo22981d(new byte[64], 0, 44);
        yi5.mo28098m();
        if (yi5.f20239f) {
            byte[] bArr2 = yi5.f20238e;
            for (int i = 0; i < bArr2.length; i++) {
                bArr[i] = bArr2[i];
            }
        } else {
            for (int i2 = 0; i2 < 20; i2++) {
                bArr[i2] = 0;
            }
        }
        int i3 = 0;
        while (true) {
            if (i3 >= 20) {
                z = true;
                break;
            } else if (f10982d[i3] != bArr[i3]) {
                z = false;
                break;
            } else {
                i3++;
            }
        }
        if (z) {
            f10979a = x70.f19416l;
        }
        for (int i4 = 0; i4 < 20; i4++) {
            f10982d[i4] = bArr[i4];
        }
        byte[] bArr3 = f10981c;
        m15512a(bArr3, bArr3, bArr, 1);
        yi5.mo28095j();
    }

    /* renamed from: d */
    public static void m15515d(byte[] bArr, int i) {
        yi5 yi5 = new yi5();
        yi5.mo28099n();
        if (bArr != null && i >= 1) {
            yi5.mo22981d(bArr, 0, i);
            yi5.mo28098m();
            if (yi5.f20239f) {
                byte[] bArr2 = yi5.f20238e;
                for (int i2 = 0; i2 < bArr2.length; i2++) {
                    f10981c[i2] = bArr2[i2];
                }
            } else {
                for (int i3 = 0; i3 < 20; i3++) {
                    f10981c[i3] = 0;
                }
            }
            yi5.mo28095j();
        }
    }

    /* renamed from: e */
    public static byte[] m15516e() {
        byte[] bArr = new byte[64];
        Random random = new Random(new Date().getTime());
        long nextLong = random.nextLong();
        int i = 0;
        for (int i2 = 0; i2 < 64; i2++) {
            bArr[i2] = (byte) ((int) ((nextLong >> i) & 255));
            i += 8;
            if (i == 56) {
                nextLong = random.nextLong();
                i = 0;
            }
        }
        return bArr;
    }

    /* renamed from: f */
    public static long m15517f() {
        return f10979a;
    }

    /* renamed from: g */
    public static boolean m15518g(byte[] bArr) {
        if (m15513b()) {
            m15514c(bArr);
            if (f10980b == 1) {
                PrintStream printStream = System.out;
                printStream.print("\nPRNG 84 GetRandomString=" + bArr.length + "\n");
                for (int i = 0; i < bArr.length; i++) {
                    PrintStream printStream2 = System.out;
                    printStream2.print(" " + bArr[i]);
                }
                System.out.println("");
            }
        }
        if (f10979a == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public static boolean m15519h(byte[] bArr) {
        return m15520i(bArr, bArr.length);
    }

    /* renamed from: i */
    public static boolean m15520i(byte[] bArr, int i) {
        if (m15513b()) {
            if (f10980b == 1) {
                PrintStream printStream = System.out;
                printStream.print("\n108 random=" + i + "\n");
                for (int i2 = 0; i2 < i; i2++) {
                    PrintStream printStream2 = System.out;
                    printStream2.print(" " + bArr[i2]);
                }
                System.out.println("");
            }
            m15515d(bArr, i);
        }
        if (f10979a == 0) {
            return true;
        }
        return false;
    }

    public void finalize() {
        mo19007j();
    }

    /* renamed from: j */
    public void mo19007j() {
        for (int i = 0; i < 20; i++) {
            f10981c[i] = 0;
            f10982d[i] = 0;
        }
        byte[] e = m15516e();
        m15520i(e, e.length);
    }
}
