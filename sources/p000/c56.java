package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0015\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0002J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0002H\u0002J\b\u0010\r\u001a\u00020\u0002H\u0002J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0002R$\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00028\u0006@BX\u000e¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0018R\u0016\u0010\n\u001a\u00020\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013¨\u0006\u001e"}, mo44877d2 = {"Lc56;", "", "", "default", "e", "value", "a", "handle", "Lr37;", "f", "index", "h", "g", "b", "i", "atLeast", "c", "d", "<set-?>", "I", "getSize", "()I", "size", "", "[I", "values", "handles", "firstFreeHandle", "<init>", "()V", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: c56 */
/* compiled from: SnapshotDoubleIndexHeap.kt */
public final class c56 {

    /* renamed from: a */
    public int f8338a;

    /* renamed from: b */
    public int[] f8339b = new int[16];

    /* renamed from: c */
    public int[] f8340c = new int[16];

    /* renamed from: d */
    public int[] f8341d;

    /* renamed from: e */
    public int f8342e;

    public c56() {
        int[] iArr = new int[16];
        int i = 0;
        while (i < 16) {
            int i2 = i + 1;
            iArr[i] = i2;
            i = i2;
        }
        this.f8341d = iArr;
    }

    /* renamed from: a */
    public final int mo11977a(int i) {
        mo11979c(this.f8338a + 1);
        int i2 = this.f8338a;
        this.f8338a = i2 + 1;
        int b = mo11978b();
        this.f8339b[i2] = i;
        this.f8340c[i2] = b;
        this.f8341d[b] = i2;
        mo11984h(i2);
        return b;
    }

    /* renamed from: b */
    public final int mo11978b() {
        int length = this.f8341d.length;
        if (this.f8342e >= length) {
            int i = 0;
            int i2 = length * 2;
            int[] iArr = new int[i2];
            while (i < i2) {
                int i3 = i + 1;
                iArr[i] = i3;
                i = i3;
            }
            C6706xq.m54498l(this.f8341d, iArr, 0, 0, 0, 14, (Object) null);
            this.f8341d = iArr;
        }
        int i4 = this.f8342e;
        this.f8342e = this.f8341d[i4];
        return i4;
    }

    /* renamed from: c */
    public final void mo11979c(int i) {
        int[] iArr = this.f8339b;
        int length = iArr.length;
        if (i > length) {
            int i2 = length * 2;
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            C6706xq.m54498l(iArr, iArr2, 0, 0, 0, 14, (Object) null);
            C6706xq.m54498l(this.f8340c, iArr3, 0, 0, 0, 14, (Object) null);
            this.f8339b = iArr2;
            this.f8340c = iArr3;
        }
    }

    /* renamed from: d */
    public final void mo11980d(int i) {
        this.f8341d[i] = this.f8342e;
        this.f8342e = i;
    }

    /* renamed from: e */
    public final int mo11981e(int i) {
        if (this.f8338a > 0) {
            return this.f8339b[0];
        }
        return i;
    }

    /* renamed from: f */
    public final void mo11982f(int i) {
        int i2 = this.f8341d[i];
        mo11985i(i2, this.f8338a - 1);
        this.f8338a--;
        mo11984h(i2);
        mo11983g(i2);
        mo11980d(i);
    }

    /* renamed from: g */
    public final void mo11983g(int i) {
        int i2;
        int[] iArr = this.f8339b;
        int i3 = this.f8338a >> 1;
        while (i < i3) {
            int i4 = (i + 1) << 1;
            int i5 = i4 - 1;
            if (i4 >= this.f8338a || (i2 = iArr[i4]) >= iArr[i5]) {
                if (iArr[i5] < iArr[i]) {
                    mo11985i(i5, i);
                    i = i5;
                } else {
                    return;
                }
            } else if (i2 < iArr[i]) {
                mo11985i(i4, i);
                i = i4;
            } else {
                return;
            }
        }
    }

    /* renamed from: h */
    public final void mo11984h(int i) {
        int[] iArr = this.f8339b;
        int i2 = iArr[i];
        while (i > 0) {
            int i3 = ((i + 1) >> 1) - 1;
            if (iArr[i3] > i2) {
                mo11985i(i3, i);
                i = i3;
            } else {
                return;
            }
        }
    }

    /* renamed from: i */
    public final void mo11985i(int i, int i2) {
        int[] iArr = this.f8339b;
        int[] iArr2 = this.f8340c;
        int[] iArr3 = this.f8341d;
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
        int i4 = iArr2[i];
        iArr2[i] = iArr2[i2];
        iArr2[i2] = i4;
        iArr3[iArr2[i]] = i;
        iArr3[iArr2[i2]] = i2;
    }
}
