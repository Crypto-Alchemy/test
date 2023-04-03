package p000;

import java.util.Arrays;

/* renamed from: cl3 */
/* compiled from: LongArray */
public final class cl3 {

    /* renamed from: a */
    public int f8460a;

    /* renamed from: b */
    public long[] f8461b;

    public cl3() {
        this(32);
    }

    /* renamed from: a */
    public void mo12103a(long j) {
        int i = this.f8460a;
        long[] jArr = this.f8461b;
        if (i == jArr.length) {
            this.f8461b = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = this.f8461b;
        int i2 = this.f8460a;
        this.f8460a = i2 + 1;
        jArr2[i2] = j;
    }

    /* renamed from: b */
    public long mo12104b(int i) {
        if (i >= 0 && i < this.f8460a) {
            return this.f8461b[i];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i + ", size is " + this.f8460a);
    }

    /* renamed from: c */
    public int mo12105c() {
        return this.f8460a;
    }

    /* renamed from: d */
    public long[] mo12106d() {
        return Arrays.copyOf(this.f8461b, this.f8460a);
    }

    public cl3(int i) {
        this.f8461b = new long[i];
    }
}
