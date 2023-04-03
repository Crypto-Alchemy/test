package p000;

import java.security.SecureRandom;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.random.Random;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001a\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002\u001a\n\u0010\u0007\u001a\u00020\u0006*\u00020\u0004\u001a\n\u0010\b\u001a\u00020\u0004*\u00020\u0006¨\u0006\t"}, mo44877d2 = {"", "b", "", "size", "", "d", "", "a", "c", "foundation"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: x67 */
/* compiled from: UtilFunctions.kt */
public final class x67 {
    /* renamed from: a */
    public static final String m54245a(byte[] bArr) {
        vx2.m53591g(bArr, "<this>");
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        Iterator it = ArraysKt___ArraysKt.m47258J(bArr).iterator();
        while (it.hasNext()) {
            String hexString = Integer.toHexString(bArr[((lw2) it).nextInt()] & 255);
            if (hexString.length() == 1) {
                sb.append('0');
            }
            sb.append(hexString);
        }
        String sb2 = sb.toString();
        vx2.m53590f(sb2, "hexString.toString()");
        return sb2;
    }

    /* renamed from: b */
    public static final long m54246b() {
        return System.currentTimeMillis() + ((long) d75.m43393o(new rw2(100, 999), Random.Default));
    }

    /* renamed from: c */
    public static final byte[] m54247c(String str) {
        vx2.m53591g(str, "<this>");
        int length = str.length();
        byte[] bArr = new byte[(length / 2)];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }

    /* renamed from: d */
    public static final byte[] m54248d(int i) {
        byte[] bArr = new byte[i];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }
}
