package p000;

import android.util.Pair;
import java.util.Collections;
import java.util.List;

/* renamed from: yh0 */
/* compiled from: CodecSpecificDataUtil */
public final class yh0 {

    /* renamed from: a */
    public static final byte[] f20214a = {0, 0, 0, 1};

    /* renamed from: b */
    public static final String[] f20215b = {"", "A", "B", "C"};

    /* renamed from: a */
    public static String m30584a(int i, int i2, int i3) {
        return String.format("avc1.%02X%02X%02X", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
    }

    /* renamed from: b */
    public static List<byte[]> m30585b(boolean z) {
        return Collections.singletonList(z ? new byte[]{1} : new byte[]{0});
    }

    /* renamed from: c */
    public static String m30586c(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
        char c;
        Object[] objArr = new Object[5];
        objArr[0] = f20215b[i];
        objArr[1] = Integer.valueOf(i2);
        objArr[2] = Integer.valueOf(i3);
        if (z) {
            c = 'H';
        } else {
            c = 'L';
        }
        objArr[3] = Character.valueOf(c);
        objArr[4] = Integer.valueOf(i4);
        StringBuilder sb = new StringBuilder(w67.m29294A("hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i5 = 0; i5 < length; i5++) {
            sb.append(String.format(".%02X", new Object[]{Integer.valueOf(iArr[i5])}));
        }
        return sb.toString();
    }

    /* renamed from: d */
    public static byte[] m30587d(byte[] bArr, int i, int i2) {
        byte[] bArr2 = f20214a;
        byte[] bArr3 = new byte[(bArr2.length + i2)];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i, bArr3, bArr2.length, i2);
        return bArr3;
    }

    /* renamed from: e */
    public static Pair<Integer, Integer> m30588e(byte[] bArr) {
        gm4 gm4 = new gm4(bArr);
        gm4.mo20674P(9);
        int D = gm4.mo20662D();
        gm4.mo20674P(20);
        return Pair.create(Integer.valueOf(gm4.mo20666H()), Integer.valueOf(D));
    }

    /* renamed from: f */
    public static boolean m30589f(List<byte[]> list) {
        if (list.size() == 1 && list.get(0).length == 1 && list.get(0)[0] == 1) {
            return true;
        }
        return false;
    }
}
