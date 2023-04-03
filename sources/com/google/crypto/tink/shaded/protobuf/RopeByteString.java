package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

final class RopeByteString extends ByteString {
    public static final int[] minLengthByDepth = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private static final long serialVersionUID = 1;
    /* access modifiers changed from: private */
    public final ByteString left;
    private final int leftLength;
    /* access modifiers changed from: private */
    public final ByteString right;
    private final int totalLength;
    private final int treeDepth;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.RopeByteString$a */
    public class C4686a extends ByteString.C4670c {

        /* renamed from: a */
        public final C4688c f25118a;

        /* renamed from: d */
        public ByteString.C4673f f25119d = mo35520b();

        public C4686a() {
            this.f25118a = new C4688c(RopeByteString.this, (C4686a) null);
        }

        /* renamed from: b */
        public final ByteString.C4673f mo35520b() {
            if (this.f25118a.hasNext()) {
                return this.f25118a.next().iterator();
            }
            return null;
        }

        /* renamed from: e */
        public byte mo35366e() {
            ByteString.C4673f fVar = this.f25119d;
            if (fVar != null) {
                byte e = fVar.mo35366e();
                if (!this.f25119d.hasNext()) {
                    this.f25119d = mo35520b();
                }
                return e;
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            if (this.f25119d != null) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.RopeByteString$c */
    public static final class C4688c implements Iterator<ByteString.LeafByteString> {

        /* renamed from: a */
        public final ArrayDeque<RopeByteString> f25122a;

        /* renamed from: d */
        public ByteString.LeafByteString f25123d;

        public /* synthetic */ C4688c(ByteString byteString, C4686a aVar) {
            this(byteString);
        }

        /* renamed from: a */
        public final ByteString.LeafByteString mo35526a(ByteString byteString) {
            while (byteString instanceof RopeByteString) {
                RopeByteString ropeByteString = (RopeByteString) byteString;
                this.f25122a.push(ropeByteString);
                byteString = ropeByteString.left;
            }
            return (ByteString.LeafByteString) byteString;
        }

        /* renamed from: b */
        public final ByteString.LeafByteString mo35527b() {
            ByteString.LeafByteString a;
            do {
                ArrayDeque<RopeByteString> arrayDeque = this.f25122a;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    return null;
                }
                a = mo35526a(this.f25122a.pop().right);
            } while (a.isEmpty());
            return a;
        }

        /* renamed from: c */
        public ByteString.LeafByteString next() {
            ByteString.LeafByteString leafByteString = this.f25123d;
            if (leafByteString != null) {
                this.f25123d = mo35527b();
                return leafByteString;
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            if (this.f25123d != null) {
                return true;
            }
            return false;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public C4688c(ByteString byteString) {
            if (byteString instanceof RopeByteString) {
                RopeByteString ropeByteString = (RopeByteString) byteString;
                ArrayDeque<RopeByteString> arrayDeque = new ArrayDeque<>(ropeByteString.getTreeDepth());
                this.f25122a = arrayDeque;
                arrayDeque.push(ropeByteString);
                this.f25123d = mo35526a(ropeByteString.left);
                return;
            }
            this.f25122a = null;
            this.f25123d = (ByteString.LeafByteString) byteString;
        }
    }

    public /* synthetic */ RopeByteString(ByteString byteString, ByteString byteString2, C4686a aVar) {
        this(byteString, byteString2);
    }

    public static ByteString concatenate(ByteString byteString, ByteString byteString2) {
        if (byteString2.size() == 0) {
            return byteString;
        }
        if (byteString.size() == 0) {
            return byteString2;
        }
        int size = byteString.size() + byteString2.size();
        if (size < 128) {
            return m37371o(byteString, byteString2);
        }
        if (byteString instanceof RopeByteString) {
            RopeByteString ropeByteString = (RopeByteString) byteString;
            if (ropeByteString.right.size() + byteString2.size() < 128) {
                return new RopeByteString(ropeByteString.left, m37371o(ropeByteString.right, byteString2));
            } else if (ropeByteString.left.getTreeDepth() > ropeByteString.right.getTreeDepth() && ropeByteString.getTreeDepth() > byteString2.getTreeDepth()) {
                return new RopeByteString(ropeByteString.left, new RopeByteString(ropeByteString.right, byteString2));
            }
        }
        if (size >= minLength(Math.max(byteString.getTreeDepth(), byteString2.getTreeDepth()) + 1)) {
            return new RopeByteString(byteString, byteString2);
        }
        return new C4687b((C4686a) null).mo35522b(byteString, byteString2);
    }

    public static int minLength(int i) {
        int[] iArr = minLengthByDepth;
        if (i >= iArr.length) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    public static RopeByteString newInstanceForTest(ByteString byteString, ByteString byteString2) {
        return new RopeByteString(byteString, byteString2);
    }

    /* renamed from: o */
    public static ByteString m37371o(ByteString byteString, ByteString byteString2) {
        int size = byteString.size();
        int size2 = byteString2.size();
        byte[] bArr = new byte[(size + size2)];
        byteString.copyTo(bArr, 0, 0, size);
        byteString2.copyTo(bArr, 0, size, size2);
        return ByteString.wrap(bArr);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    public ByteBuffer asReadOnlyByteBuffer() {
        return ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
    }

    public List<ByteBuffer> asReadOnlyByteBufferList() {
        ArrayList arrayList = new ArrayList();
        C4688c cVar = new C4688c(this, (C4686a) null);
        while (cVar.hasNext()) {
            arrayList.add(cVar.next().asReadOnlyByteBuffer());
        }
        return arrayList;
    }

    public byte byteAt(int i) {
        ByteString.checkIndex(i, this.totalLength);
        return internalByteAt(i);
    }

    public void copyTo(ByteBuffer byteBuffer) {
        this.left.copyTo(byteBuffer);
        this.right.copyTo(byteBuffer);
    }

    public void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.leftLength;
        if (i4 <= i5) {
            this.left.copyToInternal(bArr, i, i2, i3);
        } else if (i >= i5) {
            this.right.copyToInternal(bArr, i - i5, i2, i3);
        } else {
            int i6 = i5 - i;
            this.left.copyToInternal(bArr, i, i2, i6);
            this.right.copyToInternal(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString)) {
            return false;
        }
        ByteString byteString = (ByteString) obj;
        if (this.totalLength != byteString.size()) {
            return false;
        }
        if (this.totalLength == 0) {
            return true;
        }
        int peekCachedHashCode = peekCachedHashCode();
        int peekCachedHashCode2 = byteString.peekCachedHashCode();
        if (peekCachedHashCode == 0 || peekCachedHashCode2 == 0 || peekCachedHashCode == peekCachedHashCode2) {
            return mo35518q(byteString);
        }
        return false;
    }

    public int getTreeDepth() {
        return this.treeDepth;
    }

    public byte internalByteAt(int i) {
        int i2 = this.leftLength;
        if (i < i2) {
            return this.left.internalByteAt(i);
        }
        return this.right.internalByteAt(i - i2);
    }

    public boolean isBalanced() {
        if (this.totalLength >= minLength(this.treeDepth)) {
            return true;
        }
        return false;
    }

    public boolean isValidUtf8() {
        int partialIsValidUtf8 = this.left.partialIsValidUtf8(0, 0, this.leftLength);
        ByteString byteString = this.right;
        if (byteString.partialIsValidUtf8(partialIsValidUtf8, 0, byteString.size()) == 0) {
            return true;
        }
        return false;
    }

    public C4717g newCodedInput() {
        return C4717g.m37758h(asReadOnlyByteBufferList(), true);
    }

    public InputStream newInput() {
        return new C4689d();
    }

    public int partialHash(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.leftLength;
        if (i4 <= i5) {
            return this.left.partialHash(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.right.partialHash(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.right.partialHash(this.left.partialHash(i, i2, i6), 0, i3 - i6);
    }

    public int partialIsValidUtf8(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.leftLength;
        if (i4 <= i5) {
            return this.left.partialIsValidUtf8(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.right.partialIsValidUtf8(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.right.partialIsValidUtf8(this.left.partialIsValidUtf8(i, i2, i6), 0, i3 - i6);
    }

    /* renamed from: q */
    public final boolean mo35518q(ByteString byteString) {
        boolean z;
        C4688c cVar = new C4688c(this, (C4686a) null);
        ByteString.LeafByteString leafByteString = (ByteString.LeafByteString) cVar.next();
        C4688c cVar2 = new C4688c(byteString, (C4686a) null);
        ByteString.LeafByteString leafByteString2 = (ByteString.LeafByteString) cVar2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int size = leafByteString.size() - i;
            int size2 = leafByteString2.size() - i2;
            int min = Math.min(size, size2);
            if (i == 0) {
                z = leafByteString.equalsRange(leafByteString2, i2, min);
            } else {
                z = leafByteString2.equalsRange(leafByteString, i, min);
            }
            if (!z) {
                return false;
            }
            i3 += min;
            int i4 = this.totalLength;
            if (i3 < i4) {
                if (min == size) {
                    leafByteString = (ByteString.LeafByteString) cVar.next();
                    i = 0;
                } else {
                    i += min;
                }
                if (min == size2) {
                    leafByteString2 = (ByteString.LeafByteString) cVar2.next();
                    i2 = 0;
                } else {
                    i2 += min;
                }
            } else if (i3 == i4) {
                return true;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public int size() {
        return this.totalLength;
    }

    public ByteString substring(int i, int i2) {
        int checkRange = ByteString.checkRange(i, i2, this.totalLength);
        if (checkRange == 0) {
            return ByteString.EMPTY;
        }
        if (checkRange == this.totalLength) {
            return this;
        }
        int i3 = this.leftLength;
        if (i2 <= i3) {
            return this.left.substring(i, i2);
        }
        if (i >= i3) {
            return this.right.substring(i - i3, i2 - i3);
        }
        return new RopeByteString(this.left.substring(i), this.right.substring(0, i2 - this.leftLength));
    }

    public String toStringInternal(Charset charset) {
        return new String(toByteArray(), charset);
    }

    public Object writeReplace() {
        return ByteString.wrap(toByteArray());
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        this.left.writeTo(outputStream);
        this.right.writeTo(outputStream);
    }

    public void writeToInternal(OutputStream outputStream, int i, int i2) throws IOException {
        int i3 = i + i2;
        int i4 = this.leftLength;
        if (i3 <= i4) {
            this.left.writeToInternal(outputStream, i, i2);
        } else if (i >= i4) {
            this.right.writeToInternal(outputStream, i - i4, i2);
        } else {
            int i5 = i4 - i;
            this.left.writeToInternal(outputStream, i, i5);
            this.right.writeToInternal(outputStream, 0, i2 - i5);
        }
    }

    public void writeToReverse(x60 x60) throws IOException {
        this.right.writeToReverse(x60);
        this.left.writeToReverse(x60);
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.RopeByteString$b */
    public static class C4687b {

        /* renamed from: a */
        public final ArrayDeque<ByteString> f25121a;

        public C4687b() {
            this.f25121a = new ArrayDeque<>();
        }

        /* renamed from: b */
        public final ByteString mo35522b(ByteString byteString, ByteString byteString2) {
            mo35523c(byteString);
            mo35523c(byteString2);
            ByteString pop = this.f25121a.pop();
            while (!this.f25121a.isEmpty()) {
                pop = new RopeByteString(this.f25121a.pop(), pop, (C4686a) null);
            }
            return pop;
        }

        /* renamed from: c */
        public final void mo35523c(ByteString byteString) {
            if (byteString.isBalanced()) {
                mo35525e(byteString);
            } else if (byteString instanceof RopeByteString) {
                RopeByteString ropeByteString = (RopeByteString) byteString;
                mo35523c(ropeByteString.left);
                mo35523c(ropeByteString.right);
            } else {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + byteString.getClass());
            }
        }

        /* renamed from: d */
        public final int mo35524d(int i) {
            int binarySearch = Arrays.binarySearch(RopeByteString.minLengthByDepth, i);
            if (binarySearch < 0) {
                return (-(binarySearch + 1)) - 1;
            }
            return binarySearch;
        }

        /* renamed from: e */
        public final void mo35525e(ByteString byteString) {
            int d = mo35524d(byteString.size());
            int minLength = RopeByteString.minLength(d + 1);
            if (this.f25121a.isEmpty() || this.f25121a.peek().size() >= minLength) {
                this.f25121a.push(byteString);
                return;
            }
            int minLength2 = RopeByteString.minLength(d);
            ByteString pop = this.f25121a.pop();
            while (!this.f25121a.isEmpty() && this.f25121a.peek().size() < minLength2) {
                pop = new RopeByteString(this.f25121a.pop(), pop, (C4686a) null);
            }
            RopeByteString ropeByteString = new RopeByteString(pop, byteString, (C4686a) null);
            while (!this.f25121a.isEmpty() && this.f25121a.peek().size() < RopeByteString.minLength(mo35524d(ropeByteString.size()) + 1)) {
                ropeByteString = new RopeByteString(this.f25121a.pop(), ropeByteString, (C4686a) null);
            }
            this.f25121a.push(ropeByteString);
        }

        public /* synthetic */ C4687b(C4686a aVar) {
            this();
        }
    }

    public RopeByteString(ByteString byteString, ByteString byteString2) {
        this.left = byteString;
        this.right = byteString2;
        int size = byteString.size();
        this.leftLength = size;
        this.totalLength = size + byteString2.size();
        this.treeDepth = Math.max(byteString.getTreeDepth(), byteString2.getTreeDepth()) + 1;
    }

    public ByteString.C4673f iterator() {
        return new C4686a();
    }

    public void writeTo(x60 x60) throws IOException {
        this.left.writeTo(x60);
        this.right.writeTo(x60);
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.RopeByteString$d */
    public class C4689d extends InputStream {

        /* renamed from: a */
        public C4688c f25124a;

        /* renamed from: d */
        public ByteString.LeafByteString f25125d;

        /* renamed from: e */
        public int f25126e;

        /* renamed from: g */
        public int f25127g;

        /* renamed from: k */
        public int f25128k;

        /* renamed from: r */
        public int f25129r;

        public C4689d() {
            mo35535c();
        }

        /* renamed from: a */
        public final void mo35532a() {
            int i;
            if (this.f25125d != null && this.f25127g == (i = this.f25126e)) {
                this.f25128k += i;
                this.f25127g = 0;
                if (this.f25124a.hasNext()) {
                    ByteString.LeafByteString c = this.f25124a.next();
                    this.f25125d = c;
                    this.f25126e = c.size();
                    return;
                }
                this.f25125d = null;
                this.f25126e = 0;
            }
        }

        public int available() throws IOException {
            return mo35534b();
        }

        /* renamed from: b */
        public final int mo35534b() {
            return RopeByteString.this.size() - (this.f25128k + this.f25127g);
        }

        /* renamed from: c */
        public final void mo35535c() {
            C4688c cVar = new C4688c(RopeByteString.this, (C4686a) null);
            this.f25124a = cVar;
            ByteString.LeafByteString c = cVar.next();
            this.f25125d = c;
            this.f25126e = c.size();
            this.f25127g = 0;
            this.f25128k = 0;
        }

        /* renamed from: d */
        public final int mo35536d(byte[] bArr, int i, int i2) {
            int i3 = i2;
            while (i3 > 0) {
                mo35532a();
                if (this.f25125d == null) {
                    break;
                }
                int min = Math.min(this.f25126e - this.f25127g, i3);
                if (bArr != null) {
                    this.f25125d.copyTo(bArr, this.f25127g, i, min);
                    i += min;
                }
                this.f25127g += min;
                i3 -= min;
            }
            return i2 - i3;
        }

        public void mark(int i) {
            this.f25129r = this.f25128k + this.f25127g;
        }

        public boolean markSupported() {
            return true;
        }

        public int read(byte[] bArr, int i, int i2) {
            bArr.getClass();
            if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
                throw new IndexOutOfBoundsException();
            }
            int d = mo35536d(bArr, i, i2);
            if (d != 0) {
                return d;
            }
            if (i2 > 0 || mo35534b() == 0) {
                return -1;
            }
            return d;
        }

        public synchronized void reset() {
            mo35535c();
            mo35536d((byte[]) null, 0, this.f25129r);
        }

        public long skip(long j) {
            if (j >= 0) {
                if (j > 2147483647L) {
                    j = 2147483647L;
                }
                return (long) mo35536d((byte[]) null, 0, (int) j);
            }
            throw new IndexOutOfBoundsException();
        }

        public int read() throws IOException {
            mo35532a();
            ByteString.LeafByteString leafByteString = this.f25125d;
            if (leafByteString == null) {
                return -1;
            }
            int i = this.f25127g;
            this.f25127g = i + 1;
            return leafByteString.byteAt(i) & 255;
        }
    }
}
