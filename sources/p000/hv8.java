package p000;

import java.util.NoSuchElementException;

/* renamed from: hv8 */
/* compiled from: com.google.mlkit:vision-common@@17.2.0 */
public abstract class hv8 extends x58 {

    /* renamed from: a */
    public final int f29743a;

    /* renamed from: d */
    public int f29744d;

    public hv8(int i, int i2) {
        oo8.m49377b(i2, i, "index");
        this.f29743a = i;
        this.f29744d = i2;
    }

    /* renamed from: a */
    public abstract Object mo43405a(int i);

    public final boolean hasNext() {
        return this.f29744d < this.f29743a;
    }

    public final boolean hasPrevious() {
        return this.f29744d > 0;
    }

    public final Object next() {
        if (hasNext()) {
            int i = this.f29744d;
            this.f29744d = i + 1;
            return mo43405a(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f29744d;
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f29744d - 1;
            this.f29744d = i;
            return mo43405a(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f29744d - 1;
    }
}
