package p000;

import kotlin.Metadata;
import okio.ByteString;
import p000.m40;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000B\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0010\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u001a \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0000\u001a\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0006H\u0000\u001a\f\u0010\t\u001a\u00020\b*\u00020\bH\u0000\u001a0\u0010\u000b\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\bH\u0000\u001a\f\u0010\u0011\u001a\u00020\u0010*\u00020\u000fH\u0000\u001a\f\u0010\u0012\u001a\u00020\u0010*\u00020\bH\u0000\u001a\u0010\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0000\u001a\u0014\u0010\u0018\u001a\u00020\b*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\bH\u0000\" \u0010\u001e\u001a\u00020\u00138\u0000X\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0019\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001b\"\u001a\u0010\"\u001a\u00020\b8\u0000XD¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, mo44877d2 = {"", "size", "offset", "byteCount", "Lr37;", "b", "", "h", "", "g", "", "a", "aOffset", "bOffset", "", "", "", "i", "j", "Lm40$c;", "unsafeCursor", "f", "Lokio/ByteString;", "position", "e", "Lm40$c;", "d", "()Lm40$c;", "getDEFAULT__new_UnsafeCursor$annotations", "()V", "DEFAULT__new_UnsafeCursor", "I", "c", "()I", "DEFAULT__ByteString_size", "okio"}, mo44878k = 2, mo44879mv = {1, 5, 1})
/* renamed from: zp7 */
/* compiled from: -Util.kt */
public final class zp7 {

    /* renamed from: a */
    public static final m40.C7863c f46479a = new m40.C7863c();

    /* renamed from: b */
    public static final int f46480b = -1234567890;

    /* renamed from: a */
    public static final boolean m75203a(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        vx2.m53591g(bArr, "a");
        vx2.m53591g(bArr2, "b");
        if (i3 <= 0) {
            return true;
        }
        int i4 = 0;
        while (true) {
            int i5 = i4 + 1;
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
            if (i5 >= i3) {
                return true;
            }
            i4 = i5;
        }
    }

    /* renamed from: b */
    public static final void m75204b(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j2 + " byteCount=" + j3);
        }
    }

    /* renamed from: c */
    public static final int m75205c() {
        return f46480b;
    }

    /* renamed from: d */
    public static final m40.C7863c m75206d() {
        return f46479a;
    }

    /* renamed from: e */
    public static final int m75207e(ByteString byteString, int i) {
        vx2.m53591g(byteString, "<this>");
        if (i == f46480b) {
            return byteString.size();
        }
        return i;
    }

    /* renamed from: f */
    public static final m40.C7863c m75208f(m40.C7863c cVar) {
        vx2.m53591g(cVar, "unsafeCursor");
        if (cVar == f46479a) {
            return new m40.C7863c();
        }
        return cVar;
    }

    /* renamed from: g */
    public static final int m75209g(int i) {
        return ((i & 255) << 24) | ((-16777216 & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    /* renamed from: h */
    public static final short m75210h(short s) {
        short s2 = s & 65535;
        return (short) (((s2 & 255) << 8) | ((65280 & s2) >>> 8));
    }

    /* renamed from: i */
    public static final String m75211i(byte b) {
        return yb6.m74337r(new char[]{vp7.m73365f()[(b >> 4) & 15], vp7.m73365f()[b & 15]});
    }

    /* renamed from: j */
    public static final String m75212j(int i) {
        if (i == 0) {
            return "0";
        }
        int i2 = 0;
        char[] cArr = {vp7.m73365f()[(i >> 28) & 15], vp7.m73365f()[(i >> 24) & 15], vp7.m73365f()[(i >> 20) & 15], vp7.m73365f()[(i >> 16) & 15], vp7.m73365f()[(i >> 12) & 15], vp7.m73365f()[(i >> 8) & 15], vp7.m73365f()[(i >> 4) & 15], vp7.m73365f()[i & 15]};
        while (i2 < 8 && cArr[i2] == '0') {
            i2++;
        }
        return yb6.m74338s(cArr, i2, 8);
    }
}
