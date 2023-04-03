package com.trustwallet.walletconnect.extensions;

import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0000\u001a\n\u0010\u0002\u001a\u00020\u0003*\u00020\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo44877d2 = {"HEX_CHARS", "", "toHex", "", "", "library-walletconnect_release"}, mo44878k = 2, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: ByteArray.kt */
public final class ByteArrayKt {
    private static final char[] HEX_CHARS;

    static {
        char[] charArray = "0123456789abcdef".toCharArray();
        vx2.m53590f(charArray, "this as java.lang.String).toCharArray()");
        HEX_CHARS = charArray;
    }

    public static final String toHex(byte[] bArr) {
        vx2.m53591g(bArr, "<this>");
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b : bArr) {
            char[] cArr = HEX_CHARS;
            stringBuffer.append(cArr[(b & 240) >>> 4]);
            stringBuffer.append(cArr[b & 15]);
        }
        String stringBuffer2 = stringBuffer.toString();
        vx2.m53590f(stringBuffer2, "result.toString()");
        return stringBuffer2;
    }
}
