package p000;

import p000.xz2;

/* renamed from: yz2 */
/* compiled from: JacksonFeatureSet */
public final class yz2<F extends xz2> {

    /* renamed from: a */
    public int f20410a;

    public yz2(int i) {
        this.f20410a = i;
    }

    /* renamed from: a */
    public static <F extends xz2> yz2<F> m30875a(F[] fArr) {
        if (fArr.length <= 31) {
            int i = 0;
            for (F f : fArr) {
                if (f.enabledByDefault()) {
                    i |= f.getMask();
                }
            }
            return new yz2<>(i);
        }
        throw new IllegalArgumentException(String.format("Can not use type `%s` with JacksonFeatureSet: too many entries (%d > 31)", new Object[]{fArr[0].getClass().getName(), Integer.valueOf(fArr.length)}));
    }

    /* renamed from: b */
    public boolean mo28276b(F f) {
        if ((f.getMask() & this.f20410a) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public yz2<F> mo28277c(F f) {
        int mask = f.getMask() | this.f20410a;
        if (mask == this.f20410a) {
            return this;
        }
        return new yz2<>(mask);
    }
}
