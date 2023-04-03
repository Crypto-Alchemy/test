package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: t66 */
/* compiled from: SpinedBuffer */
public class t66<E> extends C5754e7 implements xq0<E> {

    /* renamed from: e */
    public E[] f34120e = new Object[(1 << this.f28407a)];

    /* renamed from: f */
    public E[][] f34121f;

    /* renamed from: t66$a */
    /* compiled from: SpinedBuffer */
    public class C6514a implements z66<E> {

        /* renamed from: a */
        public int f34122a;

        /* renamed from: b */
        public final int f34123b;

        /* renamed from: c */
        public int f34124c;

        /* renamed from: d */
        public final int f34125d;

        /* renamed from: e */
        public E[] f34126e;

        public C6514a(int i, int i2, int i3, int i4) {
            E[] eArr;
            this.f34122a = i;
            this.f34123b = i2;
            this.f34124c = i3;
            this.f34125d = i4;
            E[][] eArr2 = t66.this.f34121f;
            if (eArr2 == null) {
                eArr = t66.this.f34120e;
            } else {
                eArr = eArr2[i];
            }
            this.f34126e = eArr;
        }

        /* renamed from: a */
        public void mo29473a(xq0<? super E> xq0) {
            int i;
            E[] eArr;
            kf4.m47057e(xq0);
            int i2 = this.f34122a;
            int i3 = this.f34123b;
            if (i2 < i3 || (i2 == i3 && this.f34124c < this.f34125d)) {
                int i4 = this.f34124c;
                while (true) {
                    i = this.f34123b;
                    if (i2 >= i) {
                        break;
                    }
                    E[] eArr2 = t66.this.f34121f[i2];
                    while (i4 < eArr2.length) {
                        xq0.accept(eArr2[i4]);
                        i4++;
                    }
                    i4 = 0;
                    i2++;
                }
                if (this.f34122a == i) {
                    eArr = this.f34126e;
                } else {
                    eArr = t66.this.f34121f[i];
                }
                int i5 = this.f34125d;
                while (i4 < i5) {
                    xq0.accept(eArr[i4]);
                    i4++;
                }
                this.f34122a = this.f34123b;
                this.f34124c = this.f34125d;
            }
        }

        /* renamed from: c */
        public boolean mo29474c(xq0<? super E> xq0) {
            kf4.m47057e(xq0);
            int i = this.f34122a;
            int i2 = this.f34123b;
            if (i >= i2 && (i != i2 || this.f34124c >= this.f34125d)) {
                return false;
            }
            E[] eArr = this.f34126e;
            int i3 = this.f34124c;
            this.f34124c = i3 + 1;
            xq0.accept(eArr[i3]);
            if (this.f34124c == this.f34126e.length) {
                this.f34124c = 0;
                int i4 = this.f34122a + 1;
                this.f34122a = i4;
                E[][] eArr2 = t66.this.f34121f;
                if (eArr2 != null && i4 <= this.f34123b) {
                    this.f34126e = eArr2[i4];
                }
            }
            return true;
        }

        public int characteristics() {
            return 16464;
        }

        public long estimateSize() {
            int i = this.f34122a;
            int i2 = this.f34123b;
            if (i == i2) {
                return ((long) this.f34125d) - ((long) this.f34124c);
            }
            long[] jArr = t66.this.f28410d;
            return ((jArr[i2] + ((long) this.f34125d)) - jArr[i]) - ((long) this.f34124c);
        }

        public Comparator<? super E> getComparator() {
            return b76.m32376h(this);
        }

        public long getExactSizeIfKnown() {
            return b76.m32377i(this);
        }

        public boolean hasCharacteristics(int i) {
            return b76.m32379k(this, i);
        }

        public z66<E> trySplit() {
            int i = this.f34122a;
            int i2 = this.f34123b;
            if (i < i2) {
                t66 t66 = t66.this;
                C6514a aVar = new C6514a(i, i2 - 1, this.f34124c, t66.f34121f[i2 - 1].length);
                int i3 = this.f34123b;
                this.f34122a = i3;
                this.f34124c = 0;
                this.f34126e = t66.this.f34121f[i3];
                return aVar;
            } else if (i != i2) {
                return null;
            } else {
                int i4 = this.f34125d;
                int i5 = this.f34124c;
                int i6 = (i4 - i5) / 2;
                if (i6 == 0) {
                    return null;
                }
                z66<E> a = rz2.m51438a(this.f34126e, i5, i5 + i6);
                this.f34124c += i6;
                return a;
            }
        }
    }

    public void accept(E e) {
        if (this.f28408b == this.f34120e.length) {
            mo48003k();
            int i = this.f28409c;
            int i2 = i + 1;
            E[][] eArr = this.f34121f;
            if (i2 >= eArr.length || eArr[i + 1] == null) {
                mo48002j();
            }
            this.f28408b = 0;
            int i3 = this.f28409c + 1;
            this.f28409c = i3;
            this.f34120e = this.f34121f[i3];
        }
        E[] eArr2 = this.f34120e;
        int i4 = this.f28408b;
        this.f28408b = i4 + 1;
        eArr2[i4] = e;
    }

    /* renamed from: c */
    public void mo44368c(xq0<? super E> xq0) {
        for (int i = 0; i < this.f28409c; i++) {
            for (E accept : this.f34121f[i]) {
                xq0.accept(accept);
            }
        }
        for (int i2 = 0; i2 < this.f28408b; i2++) {
            xq0.accept(this.f34120e[i2]);
        }
    }

    /* renamed from: g */
    public long mo47999g() {
        int i = this.f28409c;
        if (i == 0) {
            return (long) this.f34120e.length;
        }
        return ((long) this.f34121f[i].length) + this.f28410d[i];
    }

    /* renamed from: h */
    public void mo48000h() {
        E[][] eArr = this.f34121f;
        if (eArr != null) {
            this.f34120e = eArr[0];
            int i = 0;
            while (true) {
                E[] eArr2 = this.f34120e;
                if (i >= eArr2.length) {
                    break;
                }
                eArr2[i] = null;
                i++;
            }
            this.f34121f = null;
            this.f28410d = null;
        } else {
            for (int i2 = 0; i2 < this.f28408b; i2++) {
                this.f34120e[i2] = null;
            }
        }
        this.f28408b = 0;
        this.f28409c = 0;
    }

    /* renamed from: i */
    public final void mo48001i(long j) {
        long g = mo47999g();
        if (j > g) {
            mo48003k();
            int i = this.f28409c;
            while (true) {
                i++;
                if (j > g) {
                    E[][] eArr = this.f34121f;
                    if (i >= eArr.length) {
                        int length = eArr.length * 2;
                        this.f34121f = (Object[][]) Arrays.copyOf(eArr, length);
                        this.f28410d = Arrays.copyOf(this.f28410d, length);
                    }
                    int d = mo42137d(i);
                    E[][] eArr2 = this.f34121f;
                    eArr2[i] = new Object[d];
                    long[] jArr = this.f28410d;
                    int i2 = i - 1;
                    jArr[i] = jArr[i2] + ((long) eArr2[i2].length);
                    g += (long) d;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: j */
    public void mo48002j() {
        mo48001i(mo47999g() + 1);
    }

    /* renamed from: k */
    public final void mo48003k() {
        if (this.f34121f == null) {
            E[][] eArr = new Object[8][];
            this.f34121f = eArr;
            this.f28410d = new long[8];
            eArr[0] = this.f34120e;
        }
    }

    public z66<E> spliterator() {
        return new C6514a(0, this.f28409c, 0, this.f28408b);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        mo44368c(s66.m51610a(arrayList));
        return "SpinedBuffer:" + arrayList.toString();
    }
}
