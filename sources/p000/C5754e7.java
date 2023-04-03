package p000;

/* renamed from: e7 */
/* compiled from: AbstractSpinedBuffer */
public abstract class C5754e7 {

    /* renamed from: a */
    public final int f28407a = 4;

    /* renamed from: b */
    public int f28408b;

    /* renamed from: c */
    public int f28409c;

    /* renamed from: d */
    public long[] f28410d;

    /* renamed from: d */
    public int mo42137d(int i) {
        int i2;
        if (i == 0 || i == 1) {
            i2 = this.f28407a;
        } else {
            i2 = Math.min((this.f28407a + i) - 1, 30);
        }
        return 1 << i2;
    }
}
