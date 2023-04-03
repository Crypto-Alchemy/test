package p000;

import java.nio.ByteBuffer;
import java.nio.charset.CodingErrorAction;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.text.StringsKt__StringsKt;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000D\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a \u0010\u0004\u001a\u00020\u0002*\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u001a$\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u001a$\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u001a\f\u0010\r\u001a\u00020\u0000*\u00020\fH\u0007\u001a \u0010\u0011\u001a\u00020\u0000*\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000eH\u0007\u001a*\u0010\u0014\u001a\u00020\u0000*\u00020\u00122\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u0002H\u0007\u001a\f\u0010\u0015\u001a\u00020\u0012*\u00020\u0000H\u0007\u001a\u001c\u0010\u0017\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u001a$\u0010\u0018\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u001a\u001c\u0010\u001a\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u001a\n\u0010\u001c\u001a\u00020\u0002*\u00020\u001b\u001a4\u0010 \u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u001a\u0012\u0010\"\u001a\u00020\u0000*\u00020\u001b2\u0006\u0010!\u001a\u00020\u000e\"%\u0010(\u001a\u0012\u0012\u0004\u0012\u00020\u00000$j\b\u0012\u0004\u0012\u00020\u0000`%*\u00020#8F¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, mo44877d2 = {"", "other", "", "ignoreCase", "y", "", "oldChar", "newChar", "F", "oldValue", "newValue", "G", "", "r", "", "startIndex", "endIndex", "s", "", "throwOnInvalidSequence", "t", "v", "prefix", "K", "J", "suffix", "w", "", "B", "thisOffset", "otherOffset", "length", "C", "n", "E", "Lkotlin/String$Companion;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "A", "(Lcb6;)Ljava/util/Comparator;", "CASE_INSENSITIVE_ORDER", "kotlin-stdlib"}, mo44878k = 5, mo44879mv = {1, 7, 1}, mo44882xs = "kotlin/text/StringsKt")
/* renamed from: yb6 */
/* compiled from: StringsJVM.kt */
public class yb6 extends xb6 {
    /* renamed from: A */
    public static final Comparator<String> m74324A(cb6 cb6) {
        vx2.m53591g(cb6, "<this>");
        Comparator<String> comparator = String.CASE_INSENSITIVE_ORDER;
        vx2.m53590f(comparator, "CASE_INSENSITIVE_ORDER");
        return comparator;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m74325B(java.lang.CharSequence r4) {
        /*
            java.lang.String r0 = "<this>"
            p000.vx2.m53591g(r4, r0)
            int r0 = r4.length()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x003e
            rw2 r0 = kotlin.text.StringsKt__StringsKt.m63093X(r4)
            boolean r3 = r0 instanceof java.util.Collection
            if (r3 == 0) goto L_0x0020
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0020
        L_0x001e:
            r4 = r2
            goto L_0x003c
        L_0x0020:
            java.util.Iterator r0 = r0.iterator()
        L_0x0024:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x001e
            r3 = r0
            lw2 r3 = (p000.lw2) r3
            int r3 = r3.nextInt()
            char r3 = r4.charAt(r3)
            boolean r3 = p000.wd0.m73571c(r3)
            if (r3 != 0) goto L_0x0024
            r4 = r1
        L_0x003c:
            if (r4 == 0) goto L_0x003f
        L_0x003e:
            r1 = r2
        L_0x003f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.yb6.m74325B(java.lang.CharSequence):boolean");
    }

    /* renamed from: C */
    public static final boolean m74326C(String str, int i, String str2, int i2, int i3, boolean z) {
        vx2.m53591g(str, "<this>");
        vx2.m53591g(str2, "other");
        if (!z) {
            return str.regionMatches(i, str2, i2, i3);
        }
        return str.regionMatches(z, i, str2, i2, i3);
    }

    /* renamed from: D */
    public static /* synthetic */ boolean m74327D(String str, int i, String str2, int i2, int i3, boolean z, int i4, Object obj) {
        if ((i4 & 16) != 0) {
            z = false;
        }
        return m74326C(str, i, str2, i2, i3, z);
    }

    /* renamed from: E */
    public static final String m74328E(CharSequence charSequence, int i) {
        boolean z;
        vx2.m53591g(charSequence, "<this>");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i + '.').toString());
        } else if (i == 0) {
            return "";
        } else {
            if (i == 1) {
                return charSequence.toString();
            }
            int length = charSequence.length();
            if (length == 0) {
                return "";
            }
            if (length != 1) {
                StringBuilder sb = new StringBuilder(charSequence.length() * i);
                lw2 s = new rw2(1, i).iterator();
                while (s.hasNext()) {
                    s.nextInt();
                    sb.append(charSequence);
                }
                String sb2 = sb.toString();
                vx2.m53590f(sb2, "{\n                    va…tring()\n                }");
                return sb2;
            }
            char charAt = charSequence.charAt(0);
            char[] cArr = new char[i];
            for (int i2 = 0; i2 < i; i2++) {
                cArr[i2] = charAt;
            }
            return new String(cArr);
        }
    }

    /* renamed from: F */
    public static final String m74329F(String str, char c, char c2, boolean z) {
        vx2.m53591g(str, "<this>");
        if (!z) {
            String replace = str.replace(c, c2);
            vx2.m53590f(replace, "this as java.lang.String…replace(oldChar, newChar)");
            return replace;
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (xd0.m73931d(charAt, c, z)) {
                charAt = c2;
            }
            sb.append(charAt);
        }
        String sb2 = sb.toString();
        vx2.m53590f(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    /* renamed from: G */
    public static final String m74330G(String str, String str2, String str3, boolean z) {
        vx2.m53591g(str, "<this>");
        vx2.m53591g(str2, "oldValue");
        vx2.m53591g(str3, "newValue");
        int i = 0;
        int a0 = StringsKt__StringsKt.m63096a0(str, str2, 0, z);
        if (a0 < 0) {
            return str;
        }
        int length = str2.length();
        int d = d75.m43382d(length, 1);
        int length2 = (str.length() - length) + str3.length();
        if (length2 >= 0) {
            StringBuilder sb = new StringBuilder(length2);
            do {
                sb.append(str, i, a0);
                sb.append(str3);
                i = a0 + length;
                if (a0 >= str.length() || (a0 = StringsKt__StringsKt.m63096a0(str, str2, a0 + d, z)) <= 0) {
                    sb.append(str, i, str.length());
                    String sb2 = sb.toString();
                    vx2.m53590f(sb2, "stringBuilder.append(this, i, length).toString()");
                }
                sb.append(str, i, a0);
                sb.append(str3);
                i = a0 + length;
                break;
            } while ((a0 = StringsKt__StringsKt.m63096a0(str, str2, a0 + d, z)) <= 0);
            sb.append(str, i, str.length());
            String sb22 = sb.toString();
            vx2.m53590f(sb22, "stringBuilder.append(this, i, length).toString()");
            return sb22;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: H */
    public static /* synthetic */ String m74331H(String str, char c, char c2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return m74329F(str, c, c2, z);
    }

    /* renamed from: I */
    public static /* synthetic */ String m74332I(String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return m74330G(str, str2, str3, z);
    }

    /* renamed from: J */
    public static final boolean m74333J(String str, String str2, int i, boolean z) {
        vx2.m53591g(str, "<this>");
        vx2.m53591g(str2, "prefix");
        if (!z) {
            return str.startsWith(str2, i);
        }
        return m74326C(str, i, str2, 0, str2.length(), z);
    }

    /* renamed from: K */
    public static final boolean m74334K(String str, String str2, boolean z) {
        vx2.m53591g(str, "<this>");
        vx2.m53591g(str2, "prefix");
        if (!z) {
            return str.startsWith(str2);
        }
        return m74326C(str, 0, str2, 0, str2.length(), z);
    }

    /* renamed from: L */
    public static /* synthetic */ boolean m74335L(String str, String str2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m74333J(str, str2, i, z);
    }

    /* renamed from: M */
    public static /* synthetic */ boolean m74336M(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m74334K(str, str2, z);
    }

    /* renamed from: r */
    public static final String m74337r(char[] cArr) {
        vx2.m53591g(cArr, "<this>");
        return new String(cArr);
    }

    /* renamed from: s */
    public static final String m74338s(char[] cArr, int i, int i2) {
        vx2.m53591g(cArr, "<this>");
        C5946i6.f29820a.mo43483a(i, i2, cArr.length);
        return new String(cArr, i, i2 - i);
    }

    /* renamed from: t */
    public static final String m74339t(byte[] bArr, int i, int i2, boolean z) {
        vx2.m53591g(bArr, "<this>");
        C5946i6.f29820a.mo43483a(i, i2, bArr.length);
        if (!z) {
            return new String(bArr, i, i2 - i, ae0.f36435b);
        }
        String charBuffer = ae0.f36435b.newDecoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT).decode(ByteBuffer.wrap(bArr, i, i2 - i)).toString();
        vx2.m53590f(charBuffer, "decoder.decode(ByteBuffe…- startIndex)).toString()");
        return charBuffer;
    }

    /* renamed from: u */
    public static /* synthetic */ String m74340u(byte[] bArr, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = bArr.length;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return m74339t(bArr, i, i2, z);
    }

    /* renamed from: v */
    public static final byte[] m74341v(String str) {
        vx2.m53591g(str, "<this>");
        byte[] bytes = str.getBytes(ae0.f36435b);
        vx2.m53590f(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    /* renamed from: w */
    public static final boolean m74342w(String str, String str2, boolean z) {
        vx2.m53591g(str, "<this>");
        vx2.m53591g(str2, "suffix");
        if (!z) {
            return str.endsWith(str2);
        }
        return m74326C(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    /* renamed from: x */
    public static /* synthetic */ boolean m74343x(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m74342w(str, str2, z);
    }

    /* renamed from: y */
    public static final boolean m74344y(String str, String str2, boolean z) {
        if (str == null) {
            if (str2 == null) {
                return true;
            }
            return false;
        } else if (!z) {
            return str.equals(str2);
        } else {
            return str.equalsIgnoreCase(str2);
        }
    }

    /* renamed from: z */
    public static /* synthetic */ boolean m74345z(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m74344y(str, str2, z);
    }
}
