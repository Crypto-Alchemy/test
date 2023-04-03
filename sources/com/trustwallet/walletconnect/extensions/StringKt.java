package com.trustwallet.walletconnect.extensions;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.text.StringsKt__StringsKt;

@Metadata(mo44876d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\u001a\n\u0010\u0002\u001a\u00020\u0003*\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001XD¢\u0006\u0002\n\u0000¨\u0006\u0004"}, mo44877d2 = {"HEX_CHARS", "", "hexStringToByteArray", "", "library-walletconnect_release"}, mo44878k = 2, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: String.kt */
public final class StringKt {
    private static final String HEX_CHARS = "0123456789abcdef";

    public static final byte[] hexStringToByteArray(String str) {
        vx2.m53591g(str, "<this>");
        Locale locale = Locale.getDefault();
        vx2.m53590f(locale, "getDefault()");
        String lowerCase = str.toLowerCase(locale);
        vx2.m53590f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        byte[] bArr = new byte[(str.length() / 2)];
        pw2 p = d75.m43394p(d75.m43395q(0, lowerCase.length()), 2);
        int n = p.mo46910n();
        int q = p.mo46911q();
        int r = p.mo46912r();
        if ((r > 0 && n <= q) || (r < 0 && q <= n)) {
            while (true) {
                String str2 = HEX_CHARS;
                int d0 = StringsKt__StringsKt.m63099d0(str2, lowerCase.charAt(n), 0, false, 6, (Object) null);
                bArr[n >> 1] = (byte) (StringsKt__StringsKt.m63099d0(str2, lowerCase.charAt(n + 1), 0, false, 6, (Object) null) | (d0 << 4));
                if (n == q) {
                    break;
                }
                n += r;
            }
        }
        return bArr;
    }
}
