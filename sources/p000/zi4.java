package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* renamed from: zi4 */
/* compiled from: OpusUtil */
public class zi4 {
    /* renamed from: a */
    public static List<byte[]> m31246a(byte[] bArr) {
        long e = m31250e((long) m31249d(bArr));
        long e2 = m31250e(3840);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(m31247b(e));
        arrayList.add(m31247b(e2));
        return arrayList;
    }

    /* renamed from: b */
    public static byte[] m31247b(long j) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j).array();
    }

    /* renamed from: c */
    public static int m31248c(byte[] bArr) {
        return bArr[9] & 255;
    }

    /* renamed from: d */
    public static int m31249d(byte[] bArr) {
        return (bArr[10] & 255) | ((bArr[11] & 255) << 8);
    }

    /* renamed from: e */
    public static long m31250e(long j) {
        return (j * 1000000000) / 48000;
    }
}
