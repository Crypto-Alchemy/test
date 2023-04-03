package p000;

/* renamed from: mz3 */
/* compiled from: MultiClassKey */
public class mz3 {

    /* renamed from: a */
    public Class<?> f15294a;

    /* renamed from: b */
    public Class<?> f15295b;

    /* renamed from: c */
    public Class<?> f15296c;

    public mz3() {
    }

    /* renamed from: a */
    public void mo23435a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.f15294a = cls;
        this.f15295b = cls2;
        this.f15296c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        mz3 mz3 = (mz3) obj;
        if (this.f15294a.equals(mz3.f15294a) && this.f15295b.equals(mz3.f15295b) && p67.m24676d(this.f15296c, mz3.f15296c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = ((this.f15294a.hashCode() * 31) + this.f15295b.hashCode()) * 31;
        Class<?> cls = this.f15296c;
        if (cls != null) {
            i = cls.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f15294a + ", second=" + this.f15295b + '}';
    }

    public mz3(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        mo23435a(cls, cls2, cls3);
    }
}
