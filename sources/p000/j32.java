package p000;

/* renamed from: j32 */
/* compiled from: FixedNumberBitmapFramePreparationStrategy */
public class j32 implements g20 {

    /* renamed from: b */
    public static final Class<?> f13500b = j32.class;

    /* renamed from: a */
    public final int f13501a;

    public j32() {
        this(3);
    }

    /* renamed from: a */
    public void mo20333a(h20 h20, f20 f20, C3418uk ukVar, int i) {
        int i2 = 1;
        while (i2 <= this.f13501a) {
            int a = (i + i2) % ukVar.mo11695a();
            if (oy1.m24426m(2)) {
                oy1.m24429p(f13500b, "Preparing frame %d, last drawn: %d", Integer.valueOf(a), Integer.valueOf(i));
            }
            if (h20.mo20926a(f20, ukVar, a)) {
                i2++;
            } else {
                return;
            }
        }
    }

    public j32(int i) {
        this.f13501a = i;
    }
}
