package okio;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\f\u0010F\u001a\b\u0012\u0004\u0012\u00020!0A\u0012\u0006\u0010L\u001a\u00020G¢\u0006\u0004\bM\u0010NJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0001H\u0016J\b\u0010\u000b\u001a\u00020\u0001H\u0016J\u0017\u0010\u000f\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0014\u001a\u00020\u0006H\u0016J\u0018\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0016J\u0017\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0015H\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010 \u001a\u00020\u0015H\u0010¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\"\u001a\u00020!H\u0016J\b\u0010$\u001a\u00020#H\u0016J\u0010\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020%H\u0016J'\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u00152\u0006\u0010,\u001a\u00020\u0015H\u0010¢\u0006\u0004\b-\u0010.J(\u00102\u001a\u0002012\u0006\u0010+\u001a\u00020\u00152\u0006\u0010/\u001a\u00020\u00012\u0006\u00100\u001a\u00020\u00152\u0006\u0010,\u001a\u00020\u0015H\u0016J(\u00102\u001a\u0002012\u0006\u0010+\u001a\u00020\u00152\u0006\u0010/\u001a\u00020!2\u0006\u00100\u001a\u00020\u00152\u0006\u0010,\u001a\u00020\u0015H\u0016J(\u00105\u001a\u00020'2\u0006\u0010+\u001a\u00020\u00152\u0006\u00103\u001a\u00020!2\u0006\u00104\u001a\u00020\u00152\u0006\u0010,\u001a\u00020\u0015H\u0016J\u0018\u00107\u001a\u00020\u00152\u0006\u0010/\u001a\u00020!2\u0006\u00106\u001a\u00020\u0015H\u0016J\u0018\u00108\u001a\u00020\u00152\u0006\u0010/\u001a\u00020!2\u0006\u00106\u001a\u00020\u0015H\u0016J\u000f\u0010;\u001a\u00020!H\u0010¢\u0006\u0004\b9\u0010:J\u0013\u0010=\u001a\u0002012\b\u0010/\u001a\u0004\u0018\u00010<H\u0002J\b\u0010>\u001a\u00020\u0015H\u0016J\b\u0010?\u001a\u00020\u0006H\u0016J\b\u0010@\u001a\u00020\u0001H\u0002R \u0010F\u001a\b\u0012\u0004\u0012\u00020!0A8\u0000X\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u001a\u0010L\u001a\u00020G8\u0000X\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K¨\u0006O"}, mo44877d2 = {"Lokio/SegmentedByteString;", "Lokio/ByteString;", "Ljava/lang/Object;", "writeReplace", "Ljava/nio/charset/Charset;", "charset", "", "string", "base64", "hex", "toAsciiLowercase", "toAsciiUppercase", "algorithm", "digest$okio", "(Ljava/lang/String;)Lokio/ByteString;", "digest", "key", "hmac$okio", "(Ljava/lang/String;Lokio/ByteString;)Lokio/ByteString;", "hmac", "base64Url", "", "beginIndex", "endIndex", "substring", "pos", "", "internalGet$okio", "(I)B", "internalGet", "getSize$okio", "()I", "getSize", "", "toByteArray", "Ljava/nio/ByteBuffer;", "asByteBuffer", "Ljava/io/OutputStream;", "out", "Lr37;", "write", "Lm40;", "buffer", "offset", "byteCount", "write$okio", "(Lm40;II)V", "other", "otherOffset", "", "rangeEquals", "target", "targetOffset", "copyInto", "fromIndex", "indexOf", "lastIndexOf", "internalArray$okio", "()[B", "internalArray", "", "equals", "hashCode", "toString", "a", "", "e", "[[B", "getSegments$okio", "()[[B", "segments", "", "g", "[I", "getDirectory$okio", "()[I", "directory", "<init>", "([[B[I)V", "okio"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* compiled from: SegmentedByteString.kt */
public final class SegmentedByteString extends ByteString {

    /* renamed from: e */
    public final transient byte[][] f43730e;

    /* renamed from: g */
    public final transient int[] f43731g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SegmentedByteString(byte[][] bArr, int[] iArr) {
        super(ByteString.EMPTY.getData$okio());
        vx2.m53591g(bArr, "segments");
        vx2.m53591g(iArr, "directory");
        this.f43730e = bArr;
        this.f43731g = iArr;
    }

    private final Object writeReplace() {
        return mo64485a();
    }

    /* renamed from: a */
    public final ByteString mo64485a() {
        return new ByteString(toByteArray());
    }

    public ByteBuffer asByteBuffer() {
        ByteBuffer asReadOnlyBuffer = ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
        vx2.m53590f(asReadOnlyBuffer, "wrap(toByteArray()).asReadOnlyBuffer()");
        return asReadOnlyBuffer;
    }

    public String base64() {
        return mo64485a().base64();
    }

    public String base64Url() {
        return mo64485a().base64Url();
    }

    public void copyInto(int i, byte[] bArr, int i2, int i3) {
        int i4;
        vx2.m53591g(bArr, "target");
        long j = (long) i3;
        zp7.m75204b((long) size(), (long) i, j);
        zp7.m75204b((long) bArr.length, (long) i2, j);
        int i5 = i3 + i;
        int b = yp7.m74584b(this, i);
        while (i < i5) {
            if (b == 0) {
                i4 = 0;
            } else {
                i4 = getDirectory$okio()[b - 1];
            }
            int i6 = getDirectory$okio()[getSegments$okio().length + b];
            int min = Math.min(i5, (getDirectory$okio()[b] - i4) + i4) - i;
            int i7 = i6 + (i - i4);
            C6706xq.m54491e(getSegments$okio()[b], bArr, i2, i7, i7 + min);
            i2 += min;
            i += min;
            b++;
        }
    }

    public ByteString digest$okio(String str) {
        vx2.m53591g(str, "algorithm");
        MessageDigest instance = MessageDigest.getInstance(str);
        int length = getSegments$okio().length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = getDirectory$okio()[length + i];
            int i4 = getDirectory$okio()[i];
            instance.update(getSegments$okio()[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] digest = instance.digest();
        vx2.m53590f(digest, "digestBytes");
        return new ByteString(digest);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == size() && rangeEquals(0, byteString, 0, size())) {
                return true;
            }
        }
        return false;
    }

    public final int[] getDirectory$okio() {
        return this.f43731g;
    }

    public final byte[][] getSegments$okio() {
        return this.f43730e;
    }

    public int getSize$okio() {
        return getDirectory$okio()[getSegments$okio().length - 1];
    }

    public int hashCode() {
        int hashCode$okio = getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int length = getSegments$okio().length;
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        while (i < length) {
            int i4 = getDirectory$okio()[length + i];
            int i5 = getDirectory$okio()[i];
            byte[] bArr = getSegments$okio()[i];
            int i6 = (i5 - i3) + i4;
            while (i4 < i6) {
                i2 = (i2 * 31) + bArr[i4];
                i4++;
            }
            i++;
            i3 = i5;
        }
        setHashCode$okio(i2);
        return i2;
    }

    public String hex() {
        return mo64485a().hex();
    }

    public ByteString hmac$okio(String str, ByteString byteString) {
        vx2.m53591g(str, "algorithm");
        vx2.m53591g(byteString, "key");
        try {
            Mac instance = Mac.getInstance(str);
            instance.init(new SecretKeySpec(byteString.toByteArray(), str));
            int length = getSegments$okio().length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int i3 = getDirectory$okio()[length + i];
                int i4 = getDirectory$okio()[i];
                instance.update(getSegments$okio()[i], i3, i4 - i2);
                i++;
                i2 = i4;
            }
            byte[] doFinal = instance.doFinal();
            vx2.m53590f(doFinal, "mac.doFinal()");
            return new ByteString(doFinal);
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public int indexOf(byte[] bArr, int i) {
        vx2.m53591g(bArr, "other");
        return mo64485a().indexOf(bArr, i);
    }

    public byte[] internalArray$okio() {
        return toByteArray();
    }

    public byte internalGet$okio(int i) {
        int i2;
        zp7.m75204b((long) getDirectory$okio()[getSegments$okio().length - 1], (long) i, 1);
        int b = yp7.m74584b(this, i);
        if (b == 0) {
            i2 = 0;
        } else {
            i2 = getDirectory$okio()[b - 1];
        }
        return getSegments$okio()[b][(i - i2) + getDirectory$okio()[getSegments$okio().length + b]];
    }

    public int lastIndexOf(byte[] bArr, int i) {
        vx2.m53591g(bArr, "other");
        return mo64485a().lastIndexOf(bArr, i);
    }

    public boolean rangeEquals(int i, ByteString byteString, int i2, int i3) {
        int i4;
        vx2.m53591g(byteString, "other");
        if (i < 0 || i > size() - i3) {
            return false;
        }
        int i5 = i3 + i;
        int b = yp7.m74584b(this, i);
        while (i < i5) {
            if (b == 0) {
                i4 = 0;
            } else {
                i4 = getDirectory$okio()[b - 1];
            }
            int i6 = getDirectory$okio()[getSegments$okio().length + b];
            int min = Math.min(i5, (getDirectory$okio()[b] - i4) + i4) - i;
            if (!byteString.rangeEquals(i2, getSegments$okio()[b], i6 + (i - i4), min)) {
                return false;
            }
            i2 += min;
            i += min;
            b++;
        }
        return true;
    }

    public String string(Charset charset) {
        vx2.m53591g(charset, "charset");
        return mo64485a().string(charset);
    }

    public ByteString substring(int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        int e = zp7.m75207e(this, i2);
        int i3 = 0;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (e <= size()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                int i4 = e - i;
                if (i4 >= 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    throw new IllegalArgumentException(("endIndex=" + e + " < beginIndex=" + i).toString());
                } else if (i == 0 && e == size()) {
                    return this;
                } else {
                    if (i == e) {
                        return ByteString.EMPTY;
                    }
                    int b = yp7.m74584b(this, i);
                    int b2 = yp7.m74584b(this, e - 1);
                    byte[][] bArr = (byte[][]) C6706xq.m54501o(getSegments$okio(), b, b2 + 1);
                    int[] iArr = new int[(bArr.length * 2)];
                    if (b <= b2) {
                        int i5 = 0;
                        int i6 = b;
                        while (true) {
                            int i7 = i6 + 1;
                            iArr[i5] = Math.min(getDirectory$okio()[i6] - i, i4);
                            int i8 = i5 + 1;
                            iArr[i5 + bArr.length] = getDirectory$okio()[getSegments$okio().length + i6];
                            if (i6 == b2) {
                                break;
                            }
                            i6 = i7;
                            i5 = i8;
                        }
                    }
                    if (b != 0) {
                        i3 = getDirectory$okio()[b - 1];
                    }
                    int length = bArr.length;
                    iArr[length] = iArr[length] + (i - i3);
                    return new SegmentedByteString(bArr, iArr);
                }
            } else {
                throw new IllegalArgumentException(("endIndex=" + e + " > length(" + size() + ')').toString());
            }
        } else {
            throw new IllegalArgumentException(("beginIndex=" + i + " < 0").toString());
        }
    }

    public ByteString toAsciiLowercase() {
        return mo64485a().toAsciiLowercase();
    }

    public ByteString toAsciiUppercase() {
        return mo64485a().toAsciiUppercase();
    }

    public byte[] toByteArray() {
        byte[] bArr = new byte[size()];
        int length = getSegments$okio().length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int i4 = getDirectory$okio()[length + i];
            int i5 = getDirectory$okio()[i];
            int i6 = i5 - i2;
            C6706xq.m54491e(getSegments$okio()[i], bArr, i3, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    public String toString() {
        return mo64485a().toString();
    }

    public void write(OutputStream outputStream) throws IOException {
        vx2.m53591g(outputStream, "out");
        int length = getSegments$okio().length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = getDirectory$okio()[length + i];
            int i4 = getDirectory$okio()[i];
            outputStream.write(getSegments$okio()[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
    }

    public void write$okio(m40 m40, int i, int i2) {
        int i3;
        vx2.m53591g(m40, "buffer");
        int i4 = i + i2;
        int b = yp7.m74584b(this, i);
        while (i < i4) {
            if (b == 0) {
                i3 = 0;
            } else {
                i3 = getDirectory$okio()[b - 1];
            }
            int i5 = getDirectory$okio()[getSegments$okio().length + b];
            int min = Math.min(i4, (getDirectory$okio()[b] - i3) + i3) - i;
            int i6 = i5 + (i - i3);
            ct5 ct5 = new ct5(getSegments$okio()[b], i6, i6 + min, true, false);
            ct5 ct52 = m40.f40752a;
            if (ct52 == null) {
                ct5.f37206g = ct5;
                ct5.f37205f = ct5;
                m40.f40752a = ct5;
            } else {
                vx2.m53588d(ct52);
                ct5 ct53 = ct52.f37206g;
                vx2.m53588d(ct53);
                ct53.mo51004c(ct5);
            }
            i += min;
            b++;
        }
        m40.mo56027K(m40.size() + ((long) i2));
    }

    public boolean rangeEquals(int i, byte[] bArr, int i2, int i3) {
        int i4;
        vx2.m53591g(bArr, "other");
        if (i < 0 || i > size() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i5 = i3 + i;
        int b = yp7.m74584b(this, i);
        while (i < i5) {
            if (b == 0) {
                i4 = 0;
            } else {
                i4 = getDirectory$okio()[b - 1];
            }
            int i6 = getDirectory$okio()[getSegments$okio().length + b];
            int min = Math.min(i5, (getDirectory$okio()[b] - i4) + i4) - i;
            if (!zp7.m75203a(getSegments$okio()[b], i6 + (i - i4), bArr, i2, min)) {
                return false;
            }
            i2 += min;
            i += min;
            b++;
        }
        return true;
    }
}
