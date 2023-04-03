package com.google.crypto.tink.shaded.protobuf;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import org.slf4j.Marker;

public abstract class ByteString implements Iterable<Byte>, Serializable {
    public static final int CONCATENATE_BY_COPY_SIZE = 128;
    public static final ByteString EMPTY = new LiteralByteString(C4758t.f25294d);
    public static final int MAX_READ_FROM_CHUNK_SIZE = 8192;
    public static final int MIN_READ_FROM_CHUNK_SIZE = 256;

    /* renamed from: a */
    public static final C4672e f25073a;

    /* renamed from: d */
    public static final Comparator<ByteString> f25074d = new C4669b();
    private int hash = 0;

    public static final class BoundedByteString extends LiteralByteString {
        private static final long serialVersionUID = 1;
        private final int bytesLength;
        private final int bytesOffset;

        public BoundedByteString(byte[] bArr, int i, int i2) {
            super(bArr);
            ByteString.checkRange(i, i + i2, bArr.length);
            this.bytesOffset = i;
            this.bytesLength = i2;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        public byte byteAt(int i) {
            ByteString.checkIndex(i, size());
            return this.bytes[this.bytesOffset + i];
        }

        public void copyToInternal(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.bytes, getOffsetIntoBytes() + i, bArr, i2, i3);
        }

        public int getOffsetIntoBytes() {
            return this.bytesOffset;
        }

        public byte internalByteAt(int i) {
            return this.bytes[this.bytesOffset + i];
        }

        public int size() {
            return this.bytesLength;
        }

        public Object writeReplace() {
            return ByteString.wrap(toByteArray());
        }
    }

    public static abstract class LeafByteString extends ByteString {
        public abstract boolean equalsRange(ByteString byteString, int i, int i2);

        public final int getTreeDepth() {
            return 0;
        }

        public final boolean isBalanced() {
            return true;
        }

        public void writeToReverse(x60 x60) throws IOException {
            writeTo(x60);
        }
    }

    public static class LiteralByteString extends LeafByteString {
        private static final long serialVersionUID = 1;
        public final byte[] bytes;

        public LiteralByteString(byte[] bArr) {
            bArr.getClass();
            this.bytes = bArr;
        }

        public final ByteBuffer asReadOnlyByteBuffer() {
            return ByteBuffer.wrap(this.bytes, getOffsetIntoBytes(), size()).asReadOnlyBuffer();
        }

        public final List<ByteBuffer> asReadOnlyByteBufferList() {
            return Collections.singletonList(asReadOnlyByteBuffer());
        }

        public byte byteAt(int i) {
            return this.bytes[i];
        }

        public final void copyTo(ByteBuffer byteBuffer) {
            byteBuffer.put(this.bytes, getOffsetIntoBytes(), size());
        }

        public void copyToInternal(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.bytes, i, bArr, i2, i3);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ByteString) || size() != ((ByteString) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof LiteralByteString)) {
                return obj.equals(this);
            }
            LiteralByteString literalByteString = (LiteralByteString) obj;
            int peekCachedHashCode = peekCachedHashCode();
            int peekCachedHashCode2 = literalByteString.peekCachedHashCode();
            if (peekCachedHashCode == 0 || peekCachedHashCode2 == 0 || peekCachedHashCode == peekCachedHashCode2) {
                return equalsRange(literalByteString, 0, size());
            }
            return false;
        }

        public final boolean equalsRange(ByteString byteString, int i, int i2) {
            if (i2 <= byteString.size()) {
                int i3 = i + i2;
                if (i3 > byteString.size()) {
                    throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + byteString.size());
                } else if (!(byteString instanceof LiteralByteString)) {
                    return byteString.substring(i, i3).equals(substring(0, i2));
                } else {
                    LiteralByteString literalByteString = (LiteralByteString) byteString;
                    byte[] bArr = this.bytes;
                    byte[] bArr2 = literalByteString.bytes;
                    int offsetIntoBytes = getOffsetIntoBytes() + i2;
                    int offsetIntoBytes2 = getOffsetIntoBytes();
                    int offsetIntoBytes3 = literalByteString.getOffsetIntoBytes() + i;
                    while (offsetIntoBytes2 < offsetIntoBytes) {
                        if (bArr[offsetIntoBytes2] != bArr2[offsetIntoBytes3]) {
                            return false;
                        }
                        offsetIntoBytes2++;
                        offsetIntoBytes3++;
                    }
                    return true;
                }
            } else {
                throw new IllegalArgumentException("Length too large: " + i2 + size());
            }
        }

        public int getOffsetIntoBytes() {
            return 0;
        }

        public byte internalByteAt(int i) {
            return this.bytes[i];
        }

        public final boolean isValidUtf8() {
            int offsetIntoBytes = getOffsetIntoBytes();
            return Utf8.m37407t(this.bytes, offsetIntoBytes, size() + offsetIntoBytes);
        }

        public final C4717g newCodedInput() {
            return C4717g.m37762l(this.bytes, getOffsetIntoBytes(), size(), true);
        }

        public final InputStream newInput() {
            return new ByteArrayInputStream(this.bytes, getOffsetIntoBytes(), size());
        }

        public final int partialHash(int i, int i2, int i3) {
            return C4758t.m38328i(i, this.bytes, getOffsetIntoBytes() + i2, i3);
        }

        public final int partialIsValidUtf8(int i, int i2, int i3) {
            int offsetIntoBytes = getOffsetIntoBytes() + i2;
            return Utf8.m37409v(i, this.bytes, offsetIntoBytes, i3 + offsetIntoBytes);
        }

        public int size() {
            return this.bytes.length;
        }

        public final ByteString substring(int i, int i2) {
            int checkRange = ByteString.checkRange(i, i2, size());
            if (checkRange == 0) {
                return ByteString.EMPTY;
            }
            return new BoundedByteString(this.bytes, getOffsetIntoBytes() + i, checkRange);
        }

        public final String toStringInternal(Charset charset) {
            return new String(this.bytes, getOffsetIntoBytes(), size(), charset);
        }

        public final void writeTo(OutputStream outputStream) throws IOException {
            outputStream.write(toByteArray());
        }

        public final void writeToInternal(OutputStream outputStream, int i, int i2) throws IOException {
            outputStream.write(this.bytes, getOffsetIntoBytes() + i, i2);
        }

        public final void writeTo(x60 x60) throws IOException {
            x60.mo35399b(this.bytes, getOffsetIntoBytes(), size());
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.ByteString$a */
    public class C4668a extends C4670c {

        /* renamed from: a */
        public int f25075a = 0;

        /* renamed from: d */
        public final int f25076d;

        public C4668a() {
            this.f25076d = ByteString.this.size();
        }

        /* renamed from: e */
        public byte mo35366e() {
            int i = this.f25075a;
            if (i < this.f25076d) {
                this.f25075a = i + 1;
                return ByteString.this.internalByteAt(i);
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            if (this.f25075a < this.f25076d) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.ByteString$b */
    public class C4669b implements Comparator<ByteString> {
        /* renamed from: a */
        public int compare(ByteString byteString, ByteString byteString2) {
            C4673f it = byteString.iterator();
            C4673f it2 = byteString2.iterator();
            while (it.hasNext() && it2.hasNext()) {
                int compare = Integer.compare(ByteString.m37179k(it.mo35366e()), ByteString.m37179k(it2.mo35366e()));
                if (compare != 0) {
                    return compare;
                }
            }
            return Integer.compare(byteString.size(), byteString2.size());
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.ByteString$c */
    public static abstract class C4670c implements C4673f {
        /* renamed from: a */
        public final Byte next() {
            return Byte.valueOf(mo35366e());
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.ByteString$d */
    public static final class C4671d implements C4672e {
        public C4671d() {
        }

        public /* synthetic */ C4671d(C4668a aVar) {
            this();
        }

        /* renamed from: a */
        public byte[] mo35373a(byte[] bArr, int i, int i2) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.ByteString$e */
    public interface C4672e {
        /* renamed from: a */
        byte[] mo35373a(byte[] bArr, int i, int i2);
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.ByteString$f */
    public interface C4673f extends Iterator<Byte> {
        /* renamed from: e */
        byte mo35366e();
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.ByteString$g */
    public static final class C4674g {

        /* renamed from: a */
        public final CodedOutputStream f25078a;

        /* renamed from: b */
        public final byte[] f25079b;

        public /* synthetic */ C4674g(int i, C4668a aVar) {
            this(i);
        }

        /* renamed from: a */
        public ByteString mo35374a() {
            this.f25078a.mo35401d();
            return new LiteralByteString(this.f25079b);
        }

        /* renamed from: b */
        public CodedOutputStream mo35375b() {
            return this.f25078a;
        }

        public C4674g(int i) {
            byte[] bArr = new byte[i];
            this.f25079b = bArr;
            this.f25078a = CodedOutputStream.m37221e0(bArr);
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.ByteString$i */
    public static final class C4676i implements C4672e {
        public C4676i() {
        }

        public /* synthetic */ C4676i(C4668a aVar) {
            this();
        }

        /* renamed from: a */
        public byte[] mo35373a(byte[] bArr, int i, int i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }
    }

    static {
        C4672e eVar;
        if (C3894bh.m32522c()) {
            eVar = new C4676i((C4668a) null);
        } else {
            eVar = new C4671d((C4668a) null);
        }
        f25073a = eVar;
    }

    public static void checkIndex(int i, int i2) {
        if (((i2 - (i + 1)) | i) >= 0) {
            return;
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
    }

    public static int checkRange(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i + " < 0");
        } else if (i2 < i) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i + ", " + i2);
        } else {
            throw new IndexOutOfBoundsException("End index: " + i2 + " >= " + i3);
        }
    }

    public static ByteString copyFrom(byte[] bArr, int i, int i2) {
        checkRange(i, i + i2, bArr.length);
        return new LiteralByteString(f25073a.mo35373a(bArr, i, i2));
    }

    public static ByteString copyFromUtf8(String str) {
        return new LiteralByteString(str.getBytes(C4758t.f25292b));
    }

    /* renamed from: e */
    public static ByteString m37177e(Iterator<ByteString> it, int i) {
        if (i < 1) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", new Object[]{Integer.valueOf(i)}));
        } else if (i == 1) {
            return it.next();
        } else {
            int i2 = i >>> 1;
            return m37177e(it, i2).concat(m37177e(it, i - i2));
        }
    }

    /* renamed from: j */
    public static ByteString m37178j(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read == -1) {
                break;
            }
            i2 += read;
        }
        if (i2 == 0) {
            return null;
        }
        return copyFrom(bArr, 0, i2);
    }

    /* renamed from: k */
    public static int m37179k(byte b) {
        return b & 255;
    }

    public static C4674g newCodedBuilder(int i) {
        return new C4674g(i, (C4668a) null);
    }

    public static C4675h newOutput(int i) {
        return new C4675h(i);
    }

    public static ByteString readFrom(InputStream inputStream) throws IOException {
        return readFrom(inputStream, 256, 8192);
    }

    public static Comparator<ByteString> unsignedLexicographicalComparator() {
        return f25074d;
    }

    public static ByteString wrap(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasArray()) {
            return new NioByteString(byteBuffer);
        }
        return wrap(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
    }

    public abstract ByteBuffer asReadOnlyByteBuffer();

    public abstract List<ByteBuffer> asReadOnlyByteBufferList();

    public abstract byte byteAt(int i);

    public final ByteString concat(ByteString byteString) {
        if (Integer.MAX_VALUE - size() >= byteString.size()) {
            return RopeByteString.concatenate(this, byteString);
        }
        throw new IllegalArgumentException("ByteString would be too long: " + size() + Marker.ANY_NON_NULL_MARKER + byteString.size());
    }

    public abstract void copyTo(ByteBuffer byteBuffer);

    public void copyTo(byte[] bArr, int i) {
        copyTo(bArr, 0, i, size());
    }

    public abstract void copyToInternal(byte[] bArr, int i, int i2, int i3);

    public final boolean endsWith(ByteString byteString) {
        if (size() < byteString.size() || !substring(size() - byteString.size()).equals(byteString)) {
            return false;
        }
        return true;
    }

    public abstract boolean equals(Object obj);

    public abstract int getTreeDepth();

    public final int hashCode() {
        int i = this.hash;
        if (i == 0) {
            int size = size();
            i = partialHash(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.hash = i;
        }
        return i;
    }

    public abstract byte internalByteAt(int i);

    public abstract boolean isBalanced();

    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public abstract boolean isValidUtf8();

    /* renamed from: n */
    public final String mo35342n() {
        if (size() <= 50) {
            return pn6.m50022b(this);
        }
        return pn6.m50022b(substring(0, 47)) + "...";
    }

    public abstract C4717g newCodedInput();

    public abstract InputStream newInput();

    public abstract int partialHash(int i, int i2, int i3);

    public abstract int partialIsValidUtf8(int i, int i2, int i3);

    public final int peekCachedHashCode() {
        return this.hash;
    }

    public abstract int size();

    public final boolean startsWith(ByteString byteString) {
        if (size() < byteString.size() || !substring(0, byteString.size()).equals(byteString)) {
            return false;
        }
        return true;
    }

    public final ByteString substring(int i) {
        return substring(i, size());
    }

    public abstract ByteString substring(int i, int i2);

    public final byte[] toByteArray() {
        int size = size();
        if (size == 0) {
            return C4758t.f25294d;
        }
        byte[] bArr = new byte[size];
        copyToInternal(bArr, 0, 0, size);
        return bArr;
    }

    public final String toString(String str) throws UnsupportedEncodingException {
        try {
            return toString(Charset.forName(str));
        } catch (UnsupportedCharsetException e) {
            UnsupportedEncodingException unsupportedEncodingException = new UnsupportedEncodingException(str);
            unsupportedEncodingException.initCause(e);
            throw unsupportedEncodingException;
        }
    }

    public abstract String toStringInternal(Charset charset);

    public final String toStringUtf8() {
        return toString(C4758t.f25292b);
    }

    public abstract void writeTo(OutputStream outputStream) throws IOException;

    public final void writeTo(OutputStream outputStream, int i, int i2) throws IOException {
        checkRange(i, i + i2, size());
        if (i2 > 0) {
            writeToInternal(outputStream, i, i2);
        }
    }

    public abstract void writeTo(x60 x60) throws IOException;

    public abstract void writeToInternal(OutputStream outputStream, int i, int i2) throws IOException;

    public abstract void writeToReverse(x60 x60) throws IOException;

    public static C4675h newOutput() {
        return new C4675h(128);
    }

    public static ByteString readFrom(InputStream inputStream, int i) throws IOException {
        return readFrom(inputStream, i, i);
    }

    @Deprecated
    public final void copyTo(byte[] bArr, int i, int i2, int i3) {
        checkRange(i, i + i3, size());
        checkRange(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            copyToInternal(bArr, i, i2, i3);
        }
    }

    public C4673f iterator() {
        return new C4668a();
    }

    public static ByteString copyFrom(byte[] bArr) {
        return copyFrom(bArr, 0, bArr.length);
    }

    public static ByteString readFrom(InputStream inputStream, int i, int i2) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (true) {
            ByteString j = m37178j(inputStream, i);
            if (j == null) {
                return copyFrom((Iterable<ByteString>) arrayList);
            }
            arrayList.add(j);
            i = Math.min(i * 2, i2);
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.ByteString$h */
    public static final class C4675h extends OutputStream {

        /* renamed from: r */
        public static final byte[] f25080r = new byte[0];

        /* renamed from: a */
        public final int f25081a;

        /* renamed from: d */
        public final ArrayList<ByteString> f25082d;

        /* renamed from: e */
        public int f25083e;

        /* renamed from: g */
        public byte[] f25084g;

        /* renamed from: k */
        public int f25085k;

        public C4675h(int i) {
            if (i >= 0) {
                this.f25081a = i;
                this.f25082d = new ArrayList<>();
                this.f25084g = new byte[i];
                return;
            }
            throw new IllegalArgumentException("Buffer size < 0");
        }

        /* renamed from: a */
        public final void mo35376a(int i) {
            this.f25082d.add(new LiteralByteString(this.f25084g));
            int length = this.f25083e + this.f25084g.length;
            this.f25083e = length;
            this.f25084g = new byte[Math.max(this.f25081a, Math.max(i, length >>> 1))];
            this.f25085k = 0;
        }

        public synchronized int size() {
            return this.f25083e + this.f25085k;
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size())});
        }

        public synchronized void write(int i) {
            if (this.f25085k == this.f25084g.length) {
                mo35376a(1);
            }
            byte[] bArr = this.f25084g;
            int i2 = this.f25085k;
            this.f25085k = i2 + 1;
            bArr[i2] = (byte) i;
        }

        public synchronized void write(byte[] bArr, int i, int i2) {
            byte[] bArr2 = this.f25084g;
            int length = bArr2.length;
            int i3 = this.f25085k;
            if (i2 <= length - i3) {
                System.arraycopy(bArr, i, bArr2, i3, i2);
                this.f25085k += i2;
            } else {
                int length2 = bArr2.length - i3;
                System.arraycopy(bArr, i, bArr2, i3, length2);
                int i4 = i2 - length2;
                mo35376a(i4);
                System.arraycopy(bArr, i + length2, this.f25084g, 0, i4);
                this.f25085k = i4;
            }
        }
    }

    public static ByteString copyFrom(ByteBuffer byteBuffer, int i) {
        checkRange(0, i, byteBuffer.remaining());
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        return new LiteralByteString(bArr);
    }

    public static ByteString wrap(byte[] bArr) {
        return new LiteralByteString(bArr);
    }

    public final String toString(Charset charset) {
        return size() == 0 ? "" : toStringInternal(charset);
    }

    public static ByteString wrap(byte[] bArr, int i, int i2) {
        return new BoundedByteString(bArr, i, i2);
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), mo35342n()});
    }

    public static ByteString copyFrom(ByteBuffer byteBuffer) {
        return copyFrom(byteBuffer, byteBuffer.remaining());
    }

    public static ByteString copyFrom(String str, String str2) throws UnsupportedEncodingException {
        return new LiteralByteString(str.getBytes(str2));
    }

    public static ByteString copyFrom(String str, Charset charset) {
        return new LiteralByteString(str.getBytes(charset));
    }

    public static ByteString copyFrom(Iterable<ByteString> iterable) {
        int i;
        if (!(iterable instanceof Collection)) {
            i = 0;
            Iterator<ByteString> it = iterable.iterator();
            while (it.hasNext()) {
                it.next();
                i++;
            }
        } else {
            i = ((Collection) iterable).size();
        }
        if (i == 0) {
            return EMPTY;
        }
        return m37177e(iterable.iterator(), i);
    }
}
