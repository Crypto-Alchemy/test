package p000;

import java.util.NoSuchElementException;

/* renamed from: hw2 */
/* compiled from: IntArrayQueue */
public final class hw2 {

    /* renamed from: a */
    public int f13080a = 0;

    /* renamed from: b */
    public int f13081b = -1;

    /* renamed from: c */
    public int f13082c = 0;

    /* renamed from: d */
    public int[] f13083d;

    /* renamed from: e */
    public int f13084e;

    public hw2() {
        int[] iArr = new int[16];
        this.f13083d = iArr;
        this.f13084e = iArr.length - 1;
    }

    /* renamed from: a */
    public void mo21408a(int i) {
        if (this.f13082c == this.f13083d.length) {
            mo21410c();
        }
        int i2 = (this.f13081b + 1) & this.f13084e;
        this.f13081b = i2;
        this.f13083d[i2] = i;
        this.f13082c++;
    }

    /* renamed from: b */
    public void mo21409b() {
        this.f13080a = 0;
        this.f13081b = -1;
        this.f13082c = 0;
    }

    /* renamed from: c */
    public final void mo21410c() {
        int[] iArr = this.f13083d;
        int length = iArr.length << 1;
        if (length >= 0) {
            int[] iArr2 = new int[length];
            int length2 = iArr.length;
            int i = this.f13080a;
            int i2 = length2 - i;
            System.arraycopy(iArr, i, iArr2, 0, i2);
            System.arraycopy(this.f13083d, 0, iArr2, i2, i);
            this.f13080a = 0;
            this.f13081b = this.f13082c - 1;
            this.f13083d = iArr2;
            this.f13084e = iArr2.length - 1;
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: d */
    public boolean mo21411d() {
        if (this.f13082c == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public int mo21412e() {
        int i = this.f13082c;
        if (i != 0) {
            int[] iArr = this.f13083d;
            int i2 = this.f13080a;
            int i3 = iArr[i2];
            this.f13080a = (i2 + 1) & this.f13084e;
            this.f13082c = i - 1;
            return i3;
        }
        throw new NoSuchElementException();
    }
}
