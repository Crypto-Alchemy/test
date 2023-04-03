package com.fasterxml.jackson.core;

import java.io.Serializable;
import java.util.Arrays;

public final class Base64Variant implements Serializable {
    public static final int BASE64_VALUE_INVALID = -1;
    public static final int BASE64_VALUE_PADDING = -2;
    public static final char PADDING_CHAR_NONE = '\u0000';
    private static final long serialVersionUID = 1;
    private final int _maxLineLength;
    public final String _name;
    private final char _paddingChar;
    private final PaddingReadBehaviour _paddingReadBehaviour;
    private final boolean _writePadding;

    /* renamed from: a */
    public final transient int[] f9808a;

    /* renamed from: d */
    public final transient char[] f9809d;

    /* renamed from: e */
    public final transient byte[] f9810e;

    public enum PaddingReadBehaviour {
        PADDING_FORBIDDEN,
        PADDING_REQUIRED,
        PADDING_ALLOWED
    }

    public Base64Variant(String str, String str2, boolean z, char c, int i) {
        int[] iArr = new int[128];
        this.f9808a = iArr;
        char[] cArr = new char[64];
        this.f9809d = cArr;
        this.f9810e = new byte[64];
        this._name = str;
        this._writePadding = z;
        this._paddingChar = c;
        this._maxLineLength = i;
        int length = str2.length();
        if (length == 64) {
            str2.getChars(0, length, cArr, 0);
            Arrays.fill(iArr, -1);
            for (int i2 = 0; i2 < length; i2++) {
                char c2 = this.f9809d[i2];
                this.f9810e[i2] = (byte) c2;
                this.f9808a[c2] = i2;
            }
            if (z) {
                this.f9808a[c] = -2;
            }
            this._paddingReadBehaviour = z ? PaddingReadBehaviour.PADDING_REQUIRED : PaddingReadBehaviour.PADDING_FORBIDDEN;
            return;
        }
        throw new IllegalArgumentException("Base64Alphabet length must be exactly 64 (was " + length + ")");
    }

    public void _reportBase64EOF() throws IllegalArgumentException {
        throw new IllegalArgumentException(missingPaddingMessage());
    }

    public void _reportBase64UnexpectedPadding() throws IllegalArgumentException {
        throw new IllegalArgumentException(unexpectedPaddingMessage());
    }

    public void _reportInvalidBase64(char c, int i, String str) throws IllegalArgumentException {
        String str2;
        if (c <= ' ') {
            str2 = "Illegal white space character (code 0x" + Integer.toHexString(c) + ") as character #" + (i + 1) + " of 4-char base64 unit: can only used between units";
        } else if (usesPaddingChar(c)) {
            str2 = "Unexpected padding character ('" + getPaddingChar() + "') as character #" + (i + 1) + " of 4-char base64 unit: padding only legal as 3rd or 4th character";
        } else if (!Character.isDefined(c) || Character.isISOControl(c)) {
            str2 = "Illegal character (code 0x" + Integer.toHexString(c) + ") in base64 content";
        } else {
            str2 = "Illegal character '" + c + "' (code 0x" + Integer.toHexString(c) + ") in base64 content";
        }
        if (str != null) {
            str2 = str2 + ": " + str;
        }
        throw new IllegalArgumentException(str2);
    }

    public boolean acceptsPaddingOnRead() {
        if (this._paddingReadBehaviour != PaddingReadBehaviour.PADDING_FORBIDDEN) {
            return true;
        }
        return false;
    }

    public byte[] decode(String str) throws IllegalArgumentException {
        g60 g60 = new g60();
        decode(str, g60);
        return g60.mo20400n();
    }

    public int decodeBase64Byte(byte b) {
        if (b < 0) {
            return -1;
        }
        return this.f9808a[b];
    }

    public int decodeBase64Char(char c) {
        if (c <= 127) {
            return this.f9808a[c];
        }
        return -1;
    }

    public String encode(byte[] bArr) {
        return encode(bArr, false);
    }

    public byte encodeBase64BitsAsByte(int i) {
        return this.f9810e[i];
    }

    public char encodeBase64BitsAsChar(int i) {
        return this.f9809d[i];
    }

    public int encodeBase64Chunk(int i, char[] cArr, int i2) {
        int i3 = i2 + 1;
        char[] cArr2 = this.f9809d;
        cArr[i2] = cArr2[(i >> 18) & 63];
        int i4 = i3 + 1;
        cArr[i3] = cArr2[(i >> 12) & 63];
        int i5 = i4 + 1;
        cArr[i4] = cArr2[(i >> 6) & 63];
        int i6 = i5 + 1;
        cArr[i5] = cArr2[i & 63];
        return i6;
    }

    public int encodeBase64Partial(int i, int i2, char[] cArr, int i3) {
        int i4 = i3 + 1;
        char[] cArr2 = this.f9809d;
        cArr[i3] = cArr2[(i >> 18) & 63];
        int i5 = i4 + 1;
        cArr[i4] = cArr2[(i >> 12) & 63];
        if (usesPadding()) {
            int i6 = i5 + 1;
            cArr[i5] = i2 == 2 ? this.f9809d[(i >> 6) & 63] : this._paddingChar;
            int i7 = i6 + 1;
            cArr[i6] = this._paddingChar;
            return i7;
        } else if (i2 != 2) {
            return i5;
        } else {
            cArr[i5] = this.f9809d[(i >> 6) & 63];
            return i5 + 1;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != Base64Variant.class) {
            return false;
        }
        Base64Variant base64Variant = (Base64Variant) obj;
        if (base64Variant._paddingChar == this._paddingChar && base64Variant._maxLineLength == this._maxLineLength && base64Variant._writePadding == this._writePadding && base64Variant._paddingReadBehaviour == this._paddingReadBehaviour && this._name.equals(base64Variant._name)) {
            return true;
        }
        return false;
    }

    public int getMaxLineLength() {
        return this._maxLineLength;
    }

    public String getName() {
        return this._name;
    }

    public byte getPaddingByte() {
        return (byte) this._paddingChar;
    }

    public char getPaddingChar() {
        return this._paddingChar;
    }

    public int hashCode() {
        return this._name.hashCode();
    }

    public String missingPaddingMessage() {
        return String.format("Unexpected end of base64-encoded String: base64 variant '%s' expects padding (one or more '%c' characters) at the end. This Base64Variant might have been incorrectly configured", new Object[]{getName(), Character.valueOf(getPaddingChar())});
    }

    public PaddingReadBehaviour paddingReadBehaviour() {
        return this._paddingReadBehaviour;
    }

    public Object readResolve() {
        Base64Variant b = C3514vx.m29160b(this._name);
        boolean z = this._writePadding;
        boolean z2 = b._writePadding;
        if (z == z2 && this._paddingChar == b._paddingChar && this._paddingReadBehaviour == b._paddingReadBehaviour && this._maxLineLength == b._maxLineLength && z == z2) {
            return b;
        }
        return new Base64Variant(b, this._name, z, this._paddingChar, this._paddingReadBehaviour, this._maxLineLength);
    }

    public boolean requiresPaddingOnRead() {
        if (this._paddingReadBehaviour == PaddingReadBehaviour.PADDING_REQUIRED) {
            return true;
        }
        return false;
    }

    public String toString() {
        return this._name;
    }

    public String unexpectedPaddingMessage() {
        return String.format("Unexpected end of base64-encoded String: base64 variant '%s' expects no padding at the end while decoding. This Base64Variant might have been incorrectly configured", new Object[]{getName()});
    }

    public boolean usesPadding() {
        return this._writePadding;
    }

    public boolean usesPaddingChar(char c) {
        return c == this._paddingChar;
    }

    public Base64Variant withPaddingAllowed() {
        return withReadPadding(PaddingReadBehaviour.PADDING_ALLOWED);
    }

    public Base64Variant withPaddingForbidden() {
        return withReadPadding(PaddingReadBehaviour.PADDING_FORBIDDEN);
    }

    public Base64Variant withPaddingRequired() {
        return withReadPadding(PaddingReadBehaviour.PADDING_REQUIRED);
    }

    public Base64Variant withReadPadding(PaddingReadBehaviour paddingReadBehaviour) {
        if (paddingReadBehaviour == this._paddingReadBehaviour) {
            return this;
        }
        return new Base64Variant(this, paddingReadBehaviour);
    }

    public Base64Variant withWritePadding(boolean z) {
        if (z == this._writePadding) {
            return this;
        }
        return new Base64Variant(this, this._name, z, this._paddingChar, this._maxLineLength);
    }

    public int decodeBase64Char(int i) {
        if (i <= 127) {
            return this.f9808a[i];
        }
        return -1;
    }

    public String encode(byte[] bArr, boolean z) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder((length >> 2) + length + (length >> 3));
        if (z) {
            sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
        }
        int maxLineLength = getMaxLineLength() >> 2;
        int i = 0;
        int i2 = length - 3;
        while (i <= i2) {
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = i4 + 1;
            encodeBase64Chunk(sb, (((bArr[i] << 8) | (bArr[i3] & 255)) << 8) | (bArr[i4] & 255));
            maxLineLength--;
            if (maxLineLength <= 0) {
                sb.append('\\');
                sb.append('n');
                maxLineLength = getMaxLineLength() >> 2;
            }
            i = i5;
        }
        int i6 = length - i;
        if (i6 > 0) {
            int i7 = i + 1;
            int i8 = bArr[i] << 16;
            if (i6 == 2) {
                i8 |= (bArr[i7] & 255) << 8;
            }
            encodeBase64Partial(sb, i8, i6);
        }
        if (z) {
            sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
        }
        return sb.toString();
    }

    public boolean usesPaddingChar(int i) {
        return i == this._paddingChar;
    }

    public void decode(String str, g60 g60) throws IllegalArgumentException {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            char charAt = str.charAt(i);
            if (charAt > ' ') {
                int decodeBase64Char = decodeBase64Char(charAt);
                if (decodeBase64Char < 0) {
                    _reportInvalidBase64(charAt, 0, (String) null);
                }
                if (i2 >= length) {
                    _reportBase64EOF();
                }
                int i3 = i2 + 1;
                char charAt2 = str.charAt(i2);
                int decodeBase64Char2 = decodeBase64Char(charAt2);
                if (decodeBase64Char2 < 0) {
                    _reportInvalidBase64(charAt2, 1, (String) null);
                }
                int i4 = (decodeBase64Char << 6) | decodeBase64Char2;
                if (i3 >= length) {
                    if (!requiresPaddingOnRead()) {
                        g60.mo20387b(i4 >> 4);
                        return;
                    }
                    _reportBase64EOF();
                }
                int i5 = i3 + 1;
                char charAt3 = str.charAt(i3);
                int decodeBase64Char3 = decodeBase64Char(charAt3);
                if (decodeBase64Char3 < 0) {
                    if (decodeBase64Char3 != -2) {
                        _reportInvalidBase64(charAt3, 2, (String) null);
                    }
                    if (!acceptsPaddingOnRead()) {
                        _reportBase64UnexpectedPadding();
                    }
                    if (i5 >= length) {
                        _reportBase64EOF();
                    }
                    i = i5 + 1;
                    char charAt4 = str.charAt(i5);
                    if (!usesPaddingChar(charAt4)) {
                        _reportInvalidBase64(charAt4, 3, "expected padding character '" + getPaddingChar() + "'");
                    }
                    g60.mo20387b(i4 >> 4);
                } else {
                    int i6 = (i4 << 6) | decodeBase64Char3;
                    if (i5 >= length) {
                        if (!requiresPaddingOnRead()) {
                            g60.mo20390d(i6 >> 2);
                            return;
                        }
                        _reportBase64EOF();
                    }
                    i2 = i5 + 1;
                    char charAt5 = str.charAt(i5);
                    int decodeBase64Char4 = decodeBase64Char(charAt5);
                    if (decodeBase64Char4 < 0) {
                        if (decodeBase64Char4 != -2) {
                            _reportInvalidBase64(charAt5, 3, (String) null);
                        }
                        if (!acceptsPaddingOnRead()) {
                            _reportBase64UnexpectedPadding();
                        }
                        g60.mo20390d(i6 >> 2);
                    } else {
                        g60.mo20388c((i6 << 6) | decodeBase64Char4);
                    }
                }
            }
            i = i2;
        }
    }

    public void encodeBase64Chunk(StringBuilder sb, int i) {
        sb.append(this.f9809d[(i >> 18) & 63]);
        sb.append(this.f9809d[(i >> 12) & 63]);
        sb.append(this.f9809d[(i >> 6) & 63]);
        sb.append(this.f9809d[i & 63]);
    }

    public void encodeBase64Partial(StringBuilder sb, int i, int i2) {
        sb.append(this.f9809d[(i >> 18) & 63]);
        sb.append(this.f9809d[(i >> 12) & 63]);
        if (usesPadding()) {
            sb.append(i2 == 2 ? this.f9809d[(i >> 6) & 63] : this._paddingChar);
            sb.append(this._paddingChar);
        } else if (i2 == 2) {
            sb.append(this.f9809d[(i >> 6) & 63]);
        }
    }

    public int encodeBase64Chunk(int i, byte[] bArr, int i2) {
        int i3 = i2 + 1;
        byte[] bArr2 = this.f9810e;
        bArr[i2] = bArr2[(i >> 18) & 63];
        int i4 = i3 + 1;
        bArr[i3] = bArr2[(i >> 12) & 63];
        int i5 = i4 + 1;
        bArr[i4] = bArr2[(i >> 6) & 63];
        int i6 = i5 + 1;
        bArr[i5] = bArr2[i & 63];
        return i6;
    }

    public int encodeBase64Partial(int i, int i2, byte[] bArr, int i3) {
        int i4 = i3 + 1;
        byte[] bArr2 = this.f9810e;
        bArr[i3] = bArr2[(i >> 18) & 63];
        int i5 = i4 + 1;
        bArr[i4] = bArr2[(i >> 12) & 63];
        if (usesPadding()) {
            byte b = (byte) this._paddingChar;
            int i6 = i5 + 1;
            bArr[i5] = i2 == 2 ? this.f9810e[(i >> 6) & 63] : b;
            int i7 = i6 + 1;
            bArr[i6] = b;
            return i7;
        } else if (i2 != 2) {
            return i5;
        } else {
            bArr[i5] = this.f9810e[(i >> 6) & 63];
            return i5 + 1;
        }
    }

    public Base64Variant(Base64Variant base64Variant, String str, int i) {
        this(base64Variant, str, base64Variant._writePadding, base64Variant._paddingChar, i);
    }

    public String encode(byte[] bArr, boolean z, String str) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder((length >> 2) + length + (length >> 3));
        if (z) {
            sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
        }
        int maxLineLength = getMaxLineLength() >> 2;
        int i = 0;
        int i2 = length - 3;
        while (i <= i2) {
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = i4 + 1;
            encodeBase64Chunk(sb, (((bArr[i] << 8) | (bArr[i3] & 255)) << 8) | (bArr[i4] & 255));
            maxLineLength--;
            if (maxLineLength <= 0) {
                sb.append(str);
                maxLineLength = getMaxLineLength() >> 2;
            }
            i = i5;
        }
        int i6 = length - i;
        if (i6 > 0) {
            int i7 = i + 1;
            int i8 = bArr[i] << 16;
            if (i6 == 2) {
                i8 |= (bArr[i7] & 255) << 8;
            }
            encodeBase64Partial(sb, i8, i6);
        }
        if (z) {
            sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
        }
        return sb.toString();
    }

    public Base64Variant(Base64Variant base64Variant, String str, boolean z, char c, int i) {
        this(base64Variant, str, z, c, base64Variant._paddingReadBehaviour, i);
    }

    public Base64Variant(Base64Variant base64Variant, String str, boolean z, char c, PaddingReadBehaviour paddingReadBehaviour, int i) {
        int[] iArr = new int[128];
        this.f9808a = iArr;
        char[] cArr = new char[64];
        this.f9809d = cArr;
        byte[] bArr = new byte[64];
        this.f9810e = bArr;
        this._name = str;
        byte[] bArr2 = base64Variant.f9810e;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        char[] cArr2 = base64Variant.f9809d;
        System.arraycopy(cArr2, 0, cArr, 0, cArr2.length);
        int[] iArr2 = base64Variant.f9808a;
        System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
        this._writePadding = z;
        this._paddingChar = c;
        this._maxLineLength = i;
        this._paddingReadBehaviour = paddingReadBehaviour;
    }

    public Base64Variant(Base64Variant base64Variant, PaddingReadBehaviour paddingReadBehaviour) {
        this(base64Variant, base64Variant._name, base64Variant._writePadding, base64Variant._paddingChar, paddingReadBehaviour, base64Variant._maxLineLength);
    }
}
