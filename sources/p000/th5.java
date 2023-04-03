package p000;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;
import kotlin.reflect.jvm.internal.impl.protobuf.C7614c;
import p000.c70;

/* renamed from: th5 */
/* compiled from: RopeByteString */
public class th5 extends c70 {

    /* renamed from: x */
    public static final int[] f44740x;

    /* renamed from: d */
    public final int f44741d;

    /* renamed from: e */
    public final c70 f44742e;

    /* renamed from: g */
    public final c70 f44743g;

    /* renamed from: k */
    public final int f44744k;

    /* renamed from: r */
    public final int f44745r;

    /* renamed from: s */
    public int f44746s;

    /* renamed from: th5$b */
    /* compiled from: RopeByteString */
    public static class C9359b {

        /* renamed from: a */
        public final Stack<c70> f44747a;

        public C9359b() {
            this.f44747a = new Stack<>();
        }

        /* renamed from: b */
        public final c70 mo66052b(c70 c70, c70 c702) {
            mo66053c(c70);
            mo66053c(c702);
            c70 pop = this.f44747a.pop();
            while (!this.f44747a.isEmpty()) {
                pop = new th5(this.f44747a.pop(), pop);
            }
            return pop;
        }

        /* renamed from: c */
        public final void mo66053c(c70 c70) {
            if (c70.mo50832u()) {
                mo66055e(c70);
            } else if (c70 instanceof th5) {
                th5 th5 = (th5) c70;
                mo66053c(th5.f44742e);
                mo66053c(th5.f44743g);
            } else {
                String valueOf = String.valueOf(c70.getClass());
                StringBuilder sb = new StringBuilder(valueOf.length() + 49);
                sb.append("Has a new type of ByteString been created? Found ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
        }

        /* renamed from: d */
        public final int mo66054d(int i) {
            int binarySearch = Arrays.binarySearch(th5.f44740x, i);
            if (binarySearch < 0) {
                return (-(binarySearch + 1)) - 1;
            }
            return binarySearch;
        }

        /* renamed from: e */
        public final void mo66055e(c70 c70) {
            int d = mo66054d(c70.size());
            int i = th5.f44740x[d + 1];
            if (this.f44747a.isEmpty() || this.f44747a.peek().size() >= i) {
                this.f44747a.push(c70);
                return;
            }
            int i2 = th5.f44740x[d];
            c70 pop = this.f44747a.pop();
            while (!this.f44747a.isEmpty() && this.f44747a.peek().size() < i2) {
                pop = new th5(this.f44747a.pop(), pop);
            }
            th5 th5 = new th5(pop, c70);
            while (!this.f44747a.isEmpty()) {
                if (this.f44747a.peek().size() >= th5.f44740x[mo66054d(th5.size()) + 1]) {
                    break;
                }
                th5 = new th5(this.f44747a.pop(), th5);
            }
            this.f44747a.push(th5);
        }
    }

    /* renamed from: th5$c */
    /* compiled from: RopeByteString */
    public static class C9360c implements Iterator<ni3> {

        /* renamed from: a */
        public final Stack<th5> f44748a;

        /* renamed from: d */
        public ni3 f44749d;

        /* renamed from: a */
        public final ni3 mo66056a(c70 c70) {
            while (c70 instanceof th5) {
                th5 th5 = (th5) c70;
                this.f44748a.push(th5);
                c70 = th5.f44742e;
            }
            return (ni3) c70;
        }

        /* renamed from: b */
        public final ni3 mo66057b() {
            while (!this.f44748a.isEmpty()) {
                ni3 a = mo66056a(this.f44748a.pop().f44743g);
                if (!a.isEmpty()) {
                    return a;
                }
            }
            return null;
        }

        /* renamed from: c */
        public ni3 next() {
            ni3 ni3 = this.f44749d;
            if (ni3 != null) {
                this.f44749d = mo66057b();
                return ni3;
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            if (this.f44749d != null) {
                return true;
            }
            return false;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public C9360c(c70 c70) {
            this.f44748a = new Stack<>();
            this.f44749d = mo66056a(c70);
        }
    }

    /* renamed from: th5$d */
    /* compiled from: RopeByteString */
    public class C9361d implements c70.C6927a {

        /* renamed from: a */
        public final C9360c f44750a;

        /* renamed from: d */
        public c70.C6927a f44751d;

        /* renamed from: e */
        public int f44752e;

        /* renamed from: a */
        public Byte next() {
            return Byte.valueOf(mo50834e());
        }

        /* renamed from: e */
        public byte mo50834e() {
            if (!this.f44751d.hasNext()) {
                this.f44751d = this.f44750a.next().iterator();
            }
            this.f44752e--;
            return this.f44751d.mo50834e();
        }

        public boolean hasNext() {
            if (this.f44752e > 0) {
                return true;
            }
            return false;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public C9361d() {
            C9360c cVar = new C9360c(th5.this);
            this.f44750a = cVar;
            this.f44751d = cVar.next().iterator();
            this.f44752e = th5.this.size();
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 1;
        while (i > 0) {
            arrayList.add(Integer.valueOf(i));
            int i3 = i2 + i;
            i2 = i;
            i = i3;
        }
        arrayList.add(Integer.MAX_VALUE);
        f44740x = new int[arrayList.size()];
        int i4 = 0;
        while (true) {
            int[] iArr = f44740x;
            if (i4 < iArr.length) {
                iArr[i4] = ((Integer) arrayList.get(i4)).intValue();
                i4++;
            } else {
                return;
            }
        }
    }

    /* renamed from: T */
    public static c70 m72316T(c70 c70, c70 c702) {
        th5 th5;
        if (c70 instanceof th5) {
            th5 = (th5) c70;
        } else {
            th5 = null;
        }
        if (c702.size() == 0) {
            return c70;
        }
        if (c70.size() != 0) {
            int size = c70.size() + c702.size();
            if (size < 128) {
                return m72317U(c70, c702);
            }
            if (th5 != null && th5.f44743g.size() + c702.size() < 128) {
                c702 = new th5(th5.f44742e, m72317U(th5.f44743g, c702));
            } else if (th5 == null || th5.f44742e.mo50830t() <= th5.f44743g.mo50830t() || th5.mo50830t() <= c702.mo50830t()) {
                if (size >= f44740x[Math.max(c70.mo50830t(), c702.mo50830t()) + 1]) {
                    return new th5(c70, c702);
                }
                return new C9359b().mo66052b(c70, c702);
            } else {
                c702 = new th5(th5.f44742e, new th5(th5.f44743g, c702));
            }
        }
        return c702;
    }

    /* renamed from: U */
    public static ni3 m72317U(c70 c70, c70 c702) {
        int size = c70.size();
        int size2 = c702.size();
        byte[] bArr = new byte[(size + size2)];
        c70.mo50827r(bArr, 0, 0, size);
        c702.mo50827r(bArr, 0, size, size2);
        return new ni3(bArr);
    }

    /* renamed from: A */
    public c70.C6927a iterator() {
        return new C9361d();
    }

    /* renamed from: B */
    public C7614c mo50815B() {
        return C7614c.m61965h(new C9362e());
    }

    /* renamed from: E */
    public int mo50816E(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.f44744k;
        if (i4 <= i5) {
            return this.f44742e.mo50816E(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.f44743g.mo50816E(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.f44743g.mo50816E(this.f44742e.mo50816E(i, i2, i6), 0, i3 - i6);
    }

    /* renamed from: F */
    public int mo50817F(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.f44744k;
        if (i4 <= i5) {
            return this.f44742e.mo50817F(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.f44743g.mo50817F(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.f44743g.mo50817F(this.f44742e.mo50817F(i, i2, i6), 0, i3 - i6);
    }

    /* renamed from: H */
    public int mo50818H() {
        return this.f44746s;
    }

    /* renamed from: L */
    public String mo50820L(String str) throws UnsupportedEncodingException {
        return new String(mo50819J(), str);
    }

    /* renamed from: O */
    public void mo50823O(OutputStream outputStream, int i, int i2) throws IOException {
        int i3 = i + i2;
        int i4 = this.f44744k;
        if (i3 <= i4) {
            this.f44742e.mo50823O(outputStream, i, i2);
        } else if (i >= i4) {
            this.f44743g.mo50823O(outputStream, i - i4, i2);
        } else {
            int i5 = i4 - i;
            this.f44742e.mo50823O(outputStream, i, i5);
            this.f44743g.mo50823O(outputStream, 0, i2 - i5);
        }
    }

    /* renamed from: V */
    public final boolean mo66049V(c70 c70) {
        boolean z;
        C9360c cVar = new C9360c(this);
        ni3 ni3 = (ni3) cVar.next();
        C9360c cVar2 = new C9360c(c70);
        ni3 ni32 = (ni3) cVar2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int size = ni3.size() - i;
            int size2 = ni32.size() - i2;
            int min = Math.min(size, size2);
            if (i == 0) {
                z = ni3.mo62691R(ni32, i2, min);
            } else {
                z = ni32.mo62691R(ni3, i, min);
            }
            if (!z) {
                return false;
            }
            i3 += min;
            int i4 = this.f44741d;
            if (i3 < i4) {
                if (min == size) {
                    ni3 = (ni3) cVar.next();
                    i = 0;
                } else {
                    i += min;
                }
                if (min == size2) {
                    ni32 = (ni3) cVar2.next();
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

    public boolean equals(Object obj) {
        int H;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c70)) {
            return false;
        }
        c70 c70 = (c70) obj;
        if (this.f44741d != c70.size()) {
            return false;
        }
        if (this.f44741d == 0) {
            return true;
        }
        if (this.f44746s == 0 || (H = c70.mo50818H()) == 0 || this.f44746s == H) {
            return mo66049V(c70);
        }
        return false;
    }

    public int hashCode() {
        int i = this.f44746s;
        if (i == 0) {
            int i2 = this.f44741d;
            i = mo50816E(i2, 0, i2);
            if (i == 0) {
                i = 1;
            }
            this.f44746s = i;
        }
        return i;
    }

    /* renamed from: s */
    public void mo50828s(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.f44744k;
        if (i4 <= i5) {
            this.f44742e.mo50828s(bArr, i, i2, i3);
        } else if (i >= i5) {
            this.f44743g.mo50828s(bArr, i - i5, i2, i3);
        } else {
            int i6 = i5 - i;
            this.f44742e.mo50828s(bArr, i, i2, i6);
            this.f44743g.mo50828s(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    public int size() {
        return this.f44741d;
    }

    /* renamed from: t */
    public int mo50830t() {
        return this.f44745r;
    }

    /* renamed from: u */
    public boolean mo50832u() {
        if (this.f44741d >= f44740x[this.f44745r]) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    public boolean mo50833w() {
        int F = this.f44742e.mo50817F(0, 0, this.f44744k);
        c70 c70 = this.f44743g;
        if (c70.mo50817F(F, 0, c70.size()) == 0) {
            return true;
        }
        return false;
    }

    public th5(c70 c70, c70 c702) {
        this.f44746s = 0;
        this.f44742e = c70;
        this.f44743g = c702;
        int size = c70.size();
        this.f44744k = size;
        this.f44741d = size + c702.size();
        this.f44745r = Math.max(c70.mo50830t(), c702.mo50830t()) + 1;
    }

    /* renamed from: th5$e */
    /* compiled from: RopeByteString */
    public class C9362e extends InputStream {

        /* renamed from: a */
        public C9360c f44754a;

        /* renamed from: d */
        public ni3 f44755d;

        /* renamed from: e */
        public int f44756e;

        /* renamed from: g */
        public int f44757g;

        /* renamed from: k */
        public int f44758k;

        /* renamed from: r */
        public int f44759r;

        public C9362e() {
            mo66068b();
        }

        /* renamed from: a */
        public final void mo66066a() {
            int i;
            if (this.f44755d != null && this.f44757g == (i = this.f44756e)) {
                this.f44758k += i;
                this.f44757g = 0;
                if (this.f44754a.hasNext()) {
                    ni3 c = this.f44754a.next();
                    this.f44755d = c;
                    this.f44756e = c.size();
                    return;
                }
                this.f44755d = null;
                this.f44756e = 0;
            }
        }

        public int available() throws IOException {
            return th5.this.size() - (this.f44758k + this.f44757g);
        }

        /* renamed from: b */
        public final void mo66068b() {
            C9360c cVar = new C9360c(th5.this);
            this.f44754a = cVar;
            ni3 c = cVar.next();
            this.f44755d = c;
            this.f44756e = c.size();
            this.f44757g = 0;
            this.f44758k = 0;
        }

        /* renamed from: c */
        public final int mo66069c(byte[] bArr, int i, int i2) {
            int i3 = i2;
            while (true) {
                if (i3 <= 0) {
                    break;
                }
                mo66066a();
                if (this.f44755d != null) {
                    int min = Math.min(this.f44756e - this.f44757g, i3);
                    if (bArr != null) {
                        this.f44755d.mo50827r(bArr, this.f44757g, i, min);
                        i += min;
                    }
                    this.f44757g += min;
                    i3 -= min;
                } else if (i3 == i2) {
                    return -1;
                }
            }
            return i2 - i3;
        }

        public void mark(int i) {
            this.f44759r = this.f44758k + this.f44757g;
        }

        public boolean markSupported() {
            return true;
        }

        public int read(byte[] bArr, int i, int i2) {
            bArr.getClass();
            if (i >= 0 && i2 >= 0 && i2 <= bArr.length - i) {
                return mo66069c(bArr, i, i2);
            }
            throw new IndexOutOfBoundsException();
        }

        public synchronized void reset() {
            mo66068b();
            mo66069c((byte[]) null, 0, this.f44759r);
        }

        public long skip(long j) {
            if (j >= 0) {
                if (j > 2147483647L) {
                    j = 2147483647L;
                }
                return (long) mo66069c((byte[]) null, 0, (int) j);
            }
            throw new IndexOutOfBoundsException();
        }

        public int read() throws IOException {
            mo66066a();
            ni3 ni3 = this.f44755d;
            if (ni3 == null) {
                return -1;
            }
            int i = this.f44757g;
            this.f44757g = i + 1;
            return ni3.mo62690Q(i) & 255;
        }
    }
}
