package p000;

import java.util.NoSuchElementException;

/* renamed from: z88 */
/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.1.0 */
public abstract class z88 extends ki8 {

    /* renamed from: a */
    public final int f36003a;

    /* renamed from: d */
    public int f36004d;

    public z88(int i, int i2) {
        t88.m52125b(i2, i, "index");
        this.f36003a = i;
        this.f36004d = i2;
    }

    /* renamed from: a */
    public abstract Object mo49640a(int i);

    public final boolean hasNext() {
        return this.f36004d < this.f36003a;
    }

    public final boolean hasPrevious() {
        return this.f36004d > 0;
    }

    public final Object next() {
        if (hasNext()) {
            int i = this.f36004d;
            this.f36004d = i + 1;
            return mo49640a(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f36004d;
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f36004d - 1;
            this.f36004d = i;
            return mo49640a(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f36004d - 1;
    }
}
