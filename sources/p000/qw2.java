package p000;

import java.util.NoSuchElementException;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007¨\u0006\u0015"}, mo44877d2 = {"Lqw2;", "Llw2;", "", "hasNext", "", "nextInt", "a", "I", "getStep", "()I", "step", "d", "finalElement", "e", "Z", "g", "next", "first", "last", "<init>", "(III)V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: qw2 */
/* compiled from: ProgressionIterators.kt */
public final class qw2 extends lw2 {

    /* renamed from: a */
    public final int f33281a;

    /* renamed from: d */
    public final int f33282d;

    /* renamed from: e */
    public boolean f33283e;

    /* renamed from: g */
    public int f33284g;

    public qw2(int i, int i2, int i3) {
        this.f33281a = i3;
        this.f33282d = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.f33283e = z;
        this.f33284g = !z ? i2 : i;
    }

    public boolean hasNext() {
        return this.f33283e;
    }

    public int nextInt() {
        int i = this.f33284g;
        if (i != this.f33282d) {
            this.f33284g = this.f33281a + i;
        } else if (this.f33283e) {
            this.f33283e = false;
        } else {
            throw new NoSuchElementException();
        }
        return i;
    }
}
