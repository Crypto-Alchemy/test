package p000;

import java.util.NoSuchElementException;

/* renamed from: l68 */
/* compiled from: com.google.mlkit:common@@18.5.0 */
public abstract class l68 extends jb8 {

    /* renamed from: a */
    public final int f31193a;

    /* renamed from: d */
    public int f31194d;

    public l68(int i, int i2) {
        v58.m53232b(i2, i, "index");
        this.f31193a = i;
        this.f31194d = i2;
    }

    /* renamed from: a */
    public abstract Object mo42164a(int i);

    public final boolean hasNext() {
        return this.f31194d < this.f31193a;
    }

    public final boolean hasPrevious() {
        return this.f31194d > 0;
    }

    public final Object next() {
        if (hasNext()) {
            int i = this.f31194d;
            this.f31194d = i + 1;
            return mo42164a(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f31194d;
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f31194d - 1;
            this.f31194d = i;
            return mo42164a(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f31194d - 1;
    }
}
