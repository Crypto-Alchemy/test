package okio;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\t\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0019\b\u0016\u0018\u0000 g2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001ZB\u0011\b\u0000\u0012\u0006\u0010W\u001a\u000202¢\u0006\u0004\be\u0010fJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\nH\u0016J\u0006\u0010\u0010\u001a\u00020\u0000J\u0006\u0010\u0011\u001a\u00020\u0000J\u0006\u0010\u0012\u001a\u00020\u0000J\u0006\u0010\u0013\u001a\u00020\u0000J\u0017\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\nH\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0000H\u0016J\u0010\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0000H\u0016J\u0010\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0000H\u0016J\u001f\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0000H\u0010¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u001f\u001a\u00020\nH\u0016J\b\u0010 \u001a\u00020\nH\u0016J\b\u0010!\u001a\u00020\u0000H\u0016J\b\u0010\"\u001a\u00020\u0000H\u0016J\u001c\u0010&\u001a\u00020\u00002\b\b\u0002\u0010$\u001a\u00020#2\b\b\u0002\u0010%\u001a\u00020#H\u0017J\u0017\u0010+\u001a\u00020(2\u0006\u0010'\u001a\u00020#H\u0010¢\u0006\u0004\b)\u0010*J\u0018\u0010.\u001a\u00020(2\u0006\u0010,\u001a\u00020#H\u0002¢\u0006\u0004\b-\u0010*J\u000f\u00101\u001a\u00020#H\u0010¢\u0006\u0004\b/\u00100J\b\u00103\u001a\u000202H\u0016J\u000f\u00106\u001a\u000202H\u0010¢\u0006\u0004\b4\u00105J\b\u00108\u001a\u000207H\u0016J\u0010\u0010:\u001a\u00020\u00052\u0006\u0010\b\u001a\u000209H\u0016J'\u0010:\u001a\u00020\u00052\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u00020#2\u0006\u0010>\u001a\u00020#H\u0010¢\u0006\u0004\b?\u0010@J(\u0010D\u001a\u00020C2\u0006\u0010=\u001a\u00020#2\u0006\u0010A\u001a\u00020\u00002\u0006\u0010B\u001a\u00020#2\u0006\u0010>\u001a\u00020#H\u0016J(\u0010D\u001a\u00020C2\u0006\u0010=\u001a\u00020#2\u0006\u0010A\u001a\u0002022\u0006\u0010B\u001a\u00020#2\u0006\u0010>\u001a\u00020#H\u0016J,\u0010G\u001a\u00020\u00052\b\b\u0002\u0010=\u001a\u00020#2\u0006\u0010E\u001a\u0002022\b\b\u0002\u0010F\u001a\u00020#2\u0006\u0010>\u001a\u00020#H\u0016J\u000e\u0010I\u001a\u00020C2\u0006\u0010H\u001a\u00020\u0000J\u000e\u0010I\u001a\u00020C2\u0006\u0010H\u001a\u000202J\u000e\u0010K\u001a\u00020C2\u0006\u0010J\u001a\u00020\u0000J\u000e\u0010K\u001a\u00020C2\u0006\u0010J\u001a\u000202J\u001a\u0010M\u001a\u00020#2\u0006\u0010A\u001a\u00020\u00002\b\b\u0002\u0010L\u001a\u00020#H\u0007J\u001a\u0010M\u001a\u00020#2\u0006\u0010A\u001a\u0002022\b\b\u0002\u0010L\u001a\u00020#H\u0017J\u001a\u0010N\u001a\u00020#2\u0006\u0010A\u001a\u00020\u00002\b\b\u0002\u0010L\u001a\u00020#H\u0007J\u001a\u0010N\u001a\u00020#2\u0006\u0010A\u001a\u0002022\b\b\u0002\u0010L\u001a\u00020#H\u0017J\u0013\u0010P\u001a\u00020C2\b\u0010A\u001a\u0004\u0018\u00010OH\u0002J\b\u0010Q\u001a\u00020#H\u0016J\u0011\u0010R\u001a\u00020#2\u0006\u0010A\u001a\u00020\u0000H\u0002J\b\u0010S\u001a\u00020\nH\u0016J\u0017\u0010-\u001a\u00020(2\u0006\u0010,\u001a\u00020#H\u0007¢\u0006\u0004\bT\u0010*J\u000f\u0010V\u001a\u00020#H\u0007¢\u0006\u0004\bU\u00100R\u001a\u0010W\u001a\u0002028\u0000X\u0004¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u00105R\"\u0010Q\u001a\u00020#8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u00100\"\u0004\b]\u0010^R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\u0011\u0010V\u001a\u00020#8G¢\u0006\u0006\u001a\u0004\bV\u00100¨\u0006h"}, mo44877d2 = {"Lokio/ByteString;", "Ljava/io/Serializable;", "", "Ljava/io/ObjectInputStream;", "in", "Lr37;", "readObject", "Ljava/io/ObjectOutputStream;", "out", "writeObject", "", "utf8", "Ljava/nio/charset/Charset;", "charset", "string", "base64", "md5", "sha1", "sha256", "sha512", "algorithm", "digest$okio", "(Ljava/lang/String;)Lokio/ByteString;", "digest", "key", "hmacSha1", "hmacSha256", "hmacSha512", "hmac$okio", "(Ljava/lang/String;Lokio/ByteString;)Lokio/ByteString;", "hmac", "base64Url", "hex", "toAsciiLowercase", "toAsciiUppercase", "", "beginIndex", "endIndex", "substring", "pos", "", "internalGet$okio", "(I)B", "internalGet", "index", "getByte", "get", "getSize$okio", "()I", "getSize", "", "toByteArray", "internalArray$okio", "()[B", "internalArray", "Ljava/nio/ByteBuffer;", "asByteBuffer", "Ljava/io/OutputStream;", "write", "Lm40;", "buffer", "offset", "byteCount", "write$okio", "(Lm40;II)V", "other", "otherOffset", "", "rangeEquals", "target", "targetOffset", "copyInto", "prefix", "startsWith", "suffix", "endsWith", "fromIndex", "indexOf", "lastIndexOf", "", "equals", "hashCode", "compareTo", "toString", "-deprecated_getByte", "-deprecated_size", "size", "data", "[B", "getData$okio", "a", "I", "getHashCode$okio", "setHashCode$okio", "(I)V", "d", "Ljava/lang/String;", "getUtf8$okio", "()Ljava/lang/String;", "setUtf8$okio", "(Ljava/lang/String;)V", "<init>", "([B)V", "Companion", "okio"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* compiled from: ByteString.kt */
public class ByteString implements Serializable, Comparable<ByteString> {
    public static final C9034a Companion = new C9034a((DefaultConstructorMarker) null);
    public static final ByteString EMPTY = new ByteString(new byte[0]);
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    public transient int f43728a;

    /* renamed from: d */
    public transient String f43729d;
    private final byte[] data;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001f\u0010 J\u0014\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00020\u0002\"\u00020\u0003H\u0007J'\u0010\n\u001a\u00020\u0005*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\u0005*\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\f\u0010\u0010\u001a\u00020\u0005*\u00020\u000fH\u0007J\u001d\u0010\u0013\u001a\u00020\u0005*\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0015\u001a\u0004\u0018\u00010\u0005*\u00020\u000fH\u0007J\f\u0010\u0016\u001a\u00020\u0005*\u00020\u000fH\u0007J\u001b\u0010\u0018\u001a\u00020\u0005*\u00020\u00172\u0006\u0010\t\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002XT¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006!"}, mo44877d2 = {"Lokio/ByteString$a;", "", "", "", "data", "Lokio/ByteString;", "f", "", "offset", "byteCount", "g", "([BII)Lokio/ByteString;", "Ljava/nio/ByteBuffer;", "e", "(Ljava/nio/ByteBuffer;)Lokio/ByteString;", "", "d", "Ljava/nio/charset/Charset;", "charset", "c", "(Ljava/lang/String;Ljava/nio/charset/Charset;)Lokio/ByteString;", "a", "b", "Ljava/io/InputStream;", "i", "(Ljava/io/InputStream;I)Lokio/ByteString;", "EMPTY", "Lokio/ByteString;", "", "serialVersionUID", "J", "<init>", "()V", "okio"}, mo44878k = 1, mo44879mv = {1, 5, 1})
    /* renamed from: okio.ByteString$a */
    /* compiled from: ByteString.kt */
    public static final class C9034a {
        public C9034a() {
        }

        public /* synthetic */ C9034a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: h */
        public static /* synthetic */ ByteString m70311h(C9034a aVar, byte[] bArr, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = bArr.length;
            }
            return aVar.mo64483g(bArr, i, i2);
        }

        /* renamed from: a */
        public final ByteString mo64477a(String str) {
            vx2.m53591g(str, "<this>");
            byte[] a = tp7.m72408a(str);
            if (a != null) {
                return new ByteString(a);
            }
            return null;
        }

        /* renamed from: b */
        public final ByteString mo64478b(String str) {
            boolean z;
            vx2.m53591g(str, "<this>");
            int i = 0;
            if (str.length() % 2 == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int length = str.length() / 2;
                byte[] bArr = new byte[length];
                int i2 = length - 1;
                if (i2 >= 0) {
                    while (true) {
                        int i3 = i + 1;
                        int i4 = i * 2;
                        bArr[i] = (byte) ((vp7.m73364e(str.charAt(i4)) << 4) + vp7.m73364e(str.charAt(i4 + 1)));
                        if (i3 > i2) {
                            break;
                        }
                        i = i3;
                    }
                }
                return new ByteString(bArr);
            }
            throw new IllegalArgumentException(vx2.m53598n("Unexpected hex string: ", str).toString());
        }

        /* renamed from: c */
        public final ByteString mo64479c(String str, Charset charset) {
            vx2.m53591g(str, "<this>");
            vx2.m53591g(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            vx2.m53590f(bytes, "(this as java.lang.String).getBytes(charset)");
            return new ByteString(bytes);
        }

        /* renamed from: d */
        public final ByteString mo64480d(String str) {
            vx2.m53591g(str, "<this>");
            ByteString byteString = new ByteString(wp7.m73729a(str));
            byteString.setUtf8$okio(str);
            return byteString;
        }

        /* renamed from: e */
        public final ByteString mo64481e(ByteBuffer byteBuffer) {
            vx2.m53591g(byteBuffer, "<this>");
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            return new ByteString(bArr);
        }

        /* renamed from: f */
        public final ByteString mo64482f(byte... bArr) {
            vx2.m53591g(bArr, "data");
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            vx2.m53590f(copyOf, "java.util.Arrays.copyOf(this, size)");
            return new ByteString(copyOf);
        }

        /* renamed from: g */
        public final ByteString mo64483g(byte[] bArr, int i, int i2) {
            vx2.m53591g(bArr, "<this>");
            zp7.m75204b((long) bArr.length, (long) i, (long) i2);
            return new ByteString(C6706xq.m54500n(bArr, i, i2 + i));
        }

        /* renamed from: i */
        public final ByteString mo64484i(InputStream inputStream, int i) throws IOException {
            boolean z;
            vx2.m53591g(inputStream, "<this>");
            int i2 = 0;
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                byte[] bArr = new byte[i];
                while (i2 < i) {
                    int read = inputStream.read(bArr, i2, i - i2);
                    if (read != -1) {
                        i2 += read;
                    } else {
                        throw new EOFException();
                    }
                }
                return new ByteString(bArr);
            }
            throw new IllegalArgumentException(vx2.m53598n("byteCount < 0: ", Integer.valueOf(i)).toString());
        }
    }

    public ByteString(byte[] bArr) {
        vx2.m53591g(bArr, "data");
        this.data = bArr;
    }

    public static /* synthetic */ void copyInto$default(ByteString byteString, int i, byte[] bArr, int i2, int i3, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 1) != 0) {
                i = 0;
            }
            if ((i4 & 4) != 0) {
                i2 = 0;
            }
            byteString.copyInto(i, bArr, i2, i3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copyInto");
    }

    public static final ByteString decodeBase64(String str) {
        return Companion.mo64477a(str);
    }

    public static final ByteString decodeHex(String str) {
        return Companion.mo64478b(str);
    }

    public static final ByteString encodeString(String str, Charset charset) {
        return Companion.mo64479c(str, charset);
    }

    public static final ByteString encodeUtf8(String str) {
        return Companion.mo64480d(str);
    }

    public static /* synthetic */ int indexOf$default(ByteString byteString, ByteString byteString2, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return byteString.indexOf(byteString2, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
    }

    public static /* synthetic */ int lastIndexOf$default(ByteString byteString, ByteString byteString2, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = zp7.m75205c();
            }
            return byteString.lastIndexOf(byteString2, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
    }

    /* renamed from: of */
    public static final ByteString m70308of(ByteBuffer byteBuffer) {
        return Companion.mo64481e(byteBuffer);
    }

    /* renamed from: of */
    public static final ByteString m70309of(byte... bArr) {
        return Companion.mo64482f(bArr);
    }

    /* renamed from: of */
    public static final ByteString m70310of(byte[] bArr, int i, int i2) {
        return Companion.mo64483g(bArr, i, i2);
    }

    public static final ByteString read(InputStream inputStream, int i) throws IOException {
        return Companion.mo64484i(inputStream, i);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws IOException {
        ByteString i = Companion.mo64484i(objectInputStream, objectInputStream.readInt());
        Field declaredField = ByteString.class.getDeclaredField("data");
        declaredField.setAccessible(true);
        declaredField.set(this, i.data);
    }

    public static /* synthetic */ ByteString substring$default(ByteString byteString, int i, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = zp7.m75205c();
            }
            return byteString.substring(i, i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.data.length);
        objectOutputStream.write(this.data);
    }

    /* renamed from: -deprecated_getByte  reason: not valid java name */
    public final byte m75783deprecated_getByte(int i) {
        return getByte(i);
    }

    /* renamed from: -deprecated_size  reason: not valid java name */
    public final int m75784deprecated_size() {
        return size();
    }

    public ByteBuffer asByteBuffer() {
        ByteBuffer asReadOnlyBuffer = ByteBuffer.wrap(this.data).asReadOnlyBuffer();
        vx2.m53590f(asReadOnlyBuffer, "wrap(data).asReadOnlyBuffer()");
        return asReadOnlyBuffer;
    }

    public String base64() {
        return tp7.m72410c(getData$okio(), (byte[]) null, 1, (Object) null);
    }

    public String base64Url() {
        return tp7.m72409b(getData$okio(), tp7.m72411d());
    }

    public void copyInto(int i, byte[] bArr, int i2, int i3) {
        vx2.m53591g(bArr, "target");
        C6706xq.m54491e(getData$okio(), bArr, i2, i, i3 + i);
    }

    public ByteString digest$okio(String str) {
        vx2.m53591g(str, "algorithm");
        MessageDigest instance = MessageDigest.getInstance(str);
        instance.update(getData$okio(), 0, size());
        byte[] digest = instance.digest();
        vx2.m53590f(digest, "digestBytes");
        return new ByteString(digest);
    }

    public final boolean endsWith(ByteString byteString) {
        vx2.m53591g(byteString, "suffix");
        return rangeEquals(size() - byteString.size(), byteString, 0, byteString.size());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == getData$okio().length && byteString.rangeEquals(0, getData$okio(), 0, getData$okio().length)) {
                return true;
            }
        }
        return false;
    }

    public final byte getByte(int i) {
        return internalGet$okio(i);
    }

    public final byte[] getData$okio() {
        return this.data;
    }

    public final int getHashCode$okio() {
        return this.f43728a;
    }

    public int getSize$okio() {
        return getData$okio().length;
    }

    public final String getUtf8$okio() {
        return this.f43729d;
    }

    public int hashCode() {
        int hashCode$okio = getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int hashCode = Arrays.hashCode(getData$okio());
        setHashCode$okio(hashCode);
        return hashCode;
    }

    public String hex() {
        char[] cArr = new char[(getData$okio().length * 2)];
        byte[] data$okio = getData$okio();
        int length = data$okio.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            byte b = data$okio[i];
            i++;
            int i3 = i2 + 1;
            cArr[i2] = vp7.m73365f()[(b >> 4) & 15];
            i2 = i3 + 1;
            cArr[i3] = vp7.m73365f()[b & 15];
        }
        return yb6.m74337r(cArr);
    }

    public ByteString hmac$okio(String str, ByteString byteString) {
        vx2.m53591g(str, "algorithm");
        vx2.m53591g(byteString, "key");
        try {
            Mac instance = Mac.getInstance(str);
            instance.init(new SecretKeySpec(byteString.toByteArray(), str));
            byte[] doFinal = instance.doFinal(this.data);
            vx2.m53590f(doFinal, "mac.doFinal(data)");
            return new ByteString(doFinal);
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public ByteString hmacSha1(ByteString byteString) {
        vx2.m53591g(byteString, "key");
        return hmac$okio("HmacSHA1", byteString);
    }

    public ByteString hmacSha256(ByteString byteString) {
        vx2.m53591g(byteString, "key");
        return hmac$okio("HmacSHA256", byteString);
    }

    public ByteString hmacSha512(ByteString byteString) {
        vx2.m53591g(byteString, "key");
        return hmac$okio("HmacSHA512", byteString);
    }

    public final int indexOf(ByteString byteString) {
        vx2.m53591g(byteString, "other");
        return indexOf$default(this, byteString, 0, 2, (Object) null);
    }

    public final int indexOf(ByteString byteString, int i) {
        vx2.m53591g(byteString, "other");
        return indexOf(byteString.internalArray$okio(), i);
    }

    public final int indexOf(byte[] bArr) {
        vx2.m53591g(bArr, "other");
        return indexOf$default(this, bArr, 0, 2, (Object) null);
    }

    public byte[] internalArray$okio() {
        return getData$okio();
    }

    public byte internalGet$okio(int i) {
        return getData$okio()[i];
    }

    public final int lastIndexOf(ByteString byteString) {
        vx2.m53591g(byteString, "other");
        return lastIndexOf$default(this, byteString, 0, 2, (Object) null);
    }

    public final int lastIndexOf(ByteString byteString, int i) {
        vx2.m53591g(byteString, "other");
        return lastIndexOf(byteString.internalArray$okio(), i);
    }

    public final int lastIndexOf(byte[] bArr) {
        vx2.m53591g(bArr, "other");
        return lastIndexOf$default(this, bArr, 0, 2, (Object) null);
    }

    public final ByteString md5() {
        return digest$okio("MD5");
    }

    public boolean rangeEquals(int i, ByteString byteString, int i2, int i3) {
        vx2.m53591g(byteString, "other");
        return byteString.rangeEquals(i2, getData$okio(), i, i3);
    }

    public final void setHashCode$okio(int i) {
        this.f43728a = i;
    }

    public final void setUtf8$okio(String str) {
        this.f43729d = str;
    }

    public final ByteString sha1() {
        return digest$okio("SHA-1");
    }

    public final ByteString sha256() {
        return digest$okio("SHA-256");
    }

    public final ByteString sha512() {
        return digest$okio("SHA-512");
    }

    public final int size() {
        return getSize$okio();
    }

    public final boolean startsWith(ByteString byteString) {
        vx2.m53591g(byteString, "prefix");
        return rangeEquals(0, byteString, 0, byteString.size());
    }

    public String string(Charset charset) {
        vx2.m53591g(charset, "charset");
        return new String(this.data, charset);
    }

    public final ByteString substring() {
        return substring$default(this, 0, 0, 3, (Object) null);
    }

    public final ByteString substring(int i) {
        return substring$default(this, i, 0, 2, (Object) null);
    }

    public ByteString substring(int i, int i2) {
        boolean z;
        boolean z2;
        int e = zp7.m75207e(this, i2);
        boolean z3 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (e <= getData$okio().length) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (e - i < 0) {
                    z3 = false;
                }
                if (!z3) {
                    throw new IllegalArgumentException("endIndex < beginIndex".toString());
                } else if (i == 0 && e == getData$okio().length) {
                    return this;
                } else {
                    return new ByteString(C6706xq.m54500n(getData$okio(), i, e));
                }
            } else {
                throw new IllegalArgumentException(("endIndex > length(" + getData$okio().length + ')').toString());
            }
        } else {
            throw new IllegalArgumentException("beginIndex < 0".toString());
        }
    }

    public ByteString toAsciiLowercase() {
        byte b;
        int i = 0;
        while (i < getData$okio().length) {
            byte b2 = getData$okio()[i];
            byte b3 = (byte) 65;
            if (b2 < b3 || b2 > (b = (byte) 90)) {
                i++;
            } else {
                byte[] data$okio = getData$okio();
                byte[] copyOf = Arrays.copyOf(data$okio, data$okio.length);
                vx2.m53590f(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i] = (byte) (b2 + 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b4 = copyOf[i2];
                    if (b4 >= b3 && b4 <= b) {
                        copyOf[i2] = (byte) (b4 + 32);
                    }
                }
                return new ByteString(copyOf);
            }
        }
        return this;
    }

    public ByteString toAsciiUppercase() {
        byte b;
        int i = 0;
        while (i < getData$okio().length) {
            byte b2 = getData$okio()[i];
            byte b3 = (byte) 97;
            if (b2 < b3 || b2 > (b = (byte) 122)) {
                i++;
            } else {
                byte[] data$okio = getData$okio();
                byte[] copyOf = Arrays.copyOf(data$okio, data$okio.length);
                vx2.m53590f(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i] = (byte) (b2 - 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b4 = copyOf[i2];
                    if (b4 >= b3 && b4 <= b) {
                        copyOf[i2] = (byte) (b4 - 32);
                    }
                }
                return new ByteString(copyOf);
            }
        }
        return this;
    }

    public byte[] toByteArray() {
        byte[] data$okio = getData$okio();
        byte[] copyOf = Arrays.copyOf(data$okio, data$okio.length);
        vx2.m53590f(copyOf, "java.util.Arrays.copyOf(this, size)");
        return copyOf;
    }

    public String toString() {
        boolean z;
        boolean z2;
        ByteString byteString;
        String str;
        boolean z3 = true;
        if (getData$okio().length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str = "[size=0]";
        } else {
            int a = vp7.m73362c(getData$okio(), 64);
            if (a != -1) {
                String utf8 = utf8();
                if (utf8 != null) {
                    String substring = utf8.substring(0, a);
                    vx2.m53590f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    String I = yb6.m74332I(yb6.m74332I(yb6.m74332I(substring, "\\", "\\\\", false, 4, (Object) null), "\n", "\\n", false, 4, (Object) null), "\r", "\\r", false, 4, (Object) null);
                    if (a < utf8.length()) {
                        return "[size=" + getData$okio().length + " text=" + I + "…]";
                    }
                    return "[text=" + I + ']';
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            } else if (getData$okio().length <= 64) {
                str = "[hex=" + hex() + ']';
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("[size=");
                sb.append(getData$okio().length);
                sb.append(" hex=");
                int e = zp7.m75207e(this, 64);
                if (e <= getData$okio().length) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    if (e + 0 < 0) {
                        z3 = false;
                    }
                    if (z3) {
                        if (e == getData$okio().length) {
                            byteString = this;
                        } else {
                            byteString = new ByteString(C6706xq.m54500n(getData$okio(), 0, e));
                        }
                        sb.append(byteString.hex());
                        sb.append("…]");
                        return sb.toString();
                    }
                    throw new IllegalArgumentException("endIndex < beginIndex".toString());
                }
                throw new IllegalArgumentException(("endIndex > length(" + getData$okio().length + ')').toString());
            }
        }
        return str;
    }

    public String utf8() {
        String utf8$okio = getUtf8$okio();
        if (utf8$okio != null) {
            return utf8$okio;
        }
        String b = wp7.m73730b(internalArray$okio());
        setUtf8$okio(b);
        return b;
    }

    public void write(OutputStream outputStream) throws IOException {
        vx2.m53591g(outputStream, "out");
        outputStream.write(this.data);
    }

    public void write$okio(m40 m40, int i, int i2) {
        vx2.m53591g(m40, "buffer");
        vp7.m73363d(this, m40, i, i2);
    }

    public static /* synthetic */ int indexOf$default(ByteString byteString, byte[] bArr, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return byteString.indexOf(bArr, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0028, code lost:
        if (r7 < r8) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        if (r0 < r1) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compareTo(okio.ByteString r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            p000.vx2.m53591g(r10, r0)
            int r0 = r9.size()
            int r1 = r10.size()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L_0x0013:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L_0x002b
            byte r7 = r9.getByte(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.getByte(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L_0x0028
            int r4 = r4 + 1
            goto L_0x0013
        L_0x0028:
            if (r7 >= r8) goto L_0x0032
            goto L_0x0030
        L_0x002b:
            if (r0 != r1) goto L_0x002e
            goto L_0x0033
        L_0x002e:
            if (r0 >= r1) goto L_0x0032
        L_0x0030:
            r3 = r5
            goto L_0x0033
        L_0x0032:
            r3 = r6
        L_0x0033:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.ByteString.compareTo(okio.ByteString):int");
    }

    public final boolean endsWith(byte[] bArr) {
        vx2.m53591g(bArr, "suffix");
        return rangeEquals(size() - bArr.length, bArr, 0, bArr.length);
    }

    public int indexOf(byte[] bArr, int i) {
        vx2.m53591g(bArr, "other");
        int length = getData$okio().length - bArr.length;
        int max = Math.max(i, 0);
        if (max <= length) {
            while (true) {
                int i2 = max + 1;
                if (zp7.m75203a(getData$okio(), max, bArr, 0, bArr.length)) {
                    return max;
                }
                if (max == length) {
                    break;
                }
                max = i2;
            }
        }
        return -1;
    }

    public int lastIndexOf(byte[] bArr, int i) {
        vx2.m53591g(bArr, "other");
        int min = Math.min(zp7.m75207e(this, i), getData$okio().length - bArr.length);
        if (min >= 0) {
            while (true) {
                int i2 = min - 1;
                if (zp7.m75203a(getData$okio(), min, bArr, 0, bArr.length)) {
                    return min;
                }
                if (i2 < 0) {
                    break;
                }
                min = i2;
            }
        }
        return -1;
    }

    public boolean rangeEquals(int i, byte[] bArr, int i2, int i3) {
        vx2.m53591g(bArr, "other");
        return i >= 0 && i <= getData$okio().length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && zp7.m75203a(getData$okio(), i, bArr, i2, i3);
    }

    public final boolean startsWith(byte[] bArr) {
        vx2.m53591g(bArr, "prefix");
        return rangeEquals(0, bArr, 0, bArr.length);
    }

    public static /* synthetic */ int lastIndexOf$default(ByteString byteString, byte[] bArr, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = zp7.m75205c();
            }
            return byteString.lastIndexOf(bArr, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
    }
}
