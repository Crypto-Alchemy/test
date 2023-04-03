package com.google.android.gms.internal.clearcut;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.clearcut.h */
public final class C4064h {

    /* renamed from: a */
    public static final C4065i f22468a = (qp8.m50772x() && qp8.m50773y() ? new C4067k() : new C4066j());

    /* renamed from: a */
    public static int m33889a(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                throw new zzfi(i2, length2);
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(((long) i3) + 4294967296L);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    public static int m33890b(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return f22468a.mo30787b(charSequence, bArr, i, i2);
    }

    /* renamed from: c */
    public static void m33891c(CharSequence charSequence, ByteBuffer byteBuffer) {
        C4065i iVar = f22468a;
        if (byteBuffer.hasArray()) {
            int arrayOffset = byteBuffer.arrayOffset();
            byteBuffer.position(m33890b(charSequence, byteBuffer.array(), byteBuffer.position() + arrayOffset, byteBuffer.remaining()) - arrayOffset);
        } else if (byteBuffer.isDirect()) {
            iVar.mo30788c(charSequence, byteBuffer);
        } else {
            C4065i.m33902d(charSequence, byteBuffer);
        }
    }

    /* renamed from: d */
    public static int m33892d(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* renamed from: f */
    public static int m33894f(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    /* renamed from: h */
    public static boolean m33896h(byte[] bArr) {
        return f22468a.mo30789e(bArr, 0, bArr.length);
    }

    /* renamed from: i */
    public static boolean m33897i(byte[] bArr, int i, int i2) {
        return f22468a.mo30789e(bArr, i, i2);
    }

    /* renamed from: j */
    public static int m33898j(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            return m33892d(b);
        }
        if (i3 == 1) {
            return m33900l(b, bArr[i]);
        }
        if (i3 == 2) {
            return m33894f(b, bArr[i], bArr[i + 1]);
        }
        throw new AssertionError();
    }

    /* renamed from: l */
    public static int m33900l(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }
}
