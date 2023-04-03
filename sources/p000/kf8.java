package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: kf8 */
public final class kf8 extends k98<Float> implements RandomAccess {

    /* renamed from: g */
    public static final kf8 f30867g;

    /* renamed from: d */
    public float[] f30868d;

    /* renamed from: e */
    public int f30869e;

    static {
        kf8 kf8 = new kf8();
        f30867g = kf8;
        kf8.mo43294z();
    }

    public kf8() {
        this(new float[10], 0);
    }

    public kf8(float[] fArr, int i) {
        this.f30868d = fArr;
        this.f30869e = i;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        mo44782k(i, ((Float) obj).floatValue());
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        mo44712e();
        vf8.m53375a(collection);
        if (!(collection instanceof kf8)) {
            return super.addAll(collection);
        }
        kf8 kf8 = (kf8) collection;
        int i = kf8.f30869e;
        if (i == 0) {
            return false;
        }
        int i2 = this.f30869e;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f30868d;
            if (i3 > fArr.length) {
                this.f30868d = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(kf8.f30868d, 0, this.f30868d, this.f30869e, kf8.f30869e);
            this.f30869e = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kf8)) {
            return super.equals(obj);
        }
        kf8 kf8 = (kf8) obj;
        if (this.f30869e != kf8.f30869e) {
            return false;
        }
        float[] fArr = kf8.f30868d;
        for (int i = 0; i < this.f30869e; i++) {
            if (this.f30868d[i] != fArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        mo44783n(i);
        return Float.valueOf(this.f30868d[i]);
    }

    /* renamed from: h0 */
    public final /* synthetic */ hg8 mo43292h0(int i) {
        if (i >= this.f30869e) {
            return new kf8(Arrays.copyOf(this.f30868d, i), this.f30869e);
        }
        throw new IllegalArgumentException();
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f30869e; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f30868d[i2]);
        }
        return i;
    }

    /* renamed from: j */
    public final void mo44781j(float f) {
        mo44782k(this.f30869e, f);
    }

    /* renamed from: k */
    public final void mo44782k(int i, float f) {
        int i2;
        mo44712e();
        if (i < 0 || i > (i2 = this.f30869e)) {
            throw new IndexOutOfBoundsException(mo44784o(i));
        }
        float[] fArr = this.f30868d;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f30868d, i, fArr2, i + 1, this.f30869e - i);
            this.f30868d = fArr2;
        }
        this.f30868d[i] = f;
        this.f30869e++;
        this.modCount++;
    }

    /* renamed from: n */
    public final void mo44783n(int i) {
        if (i < 0 || i >= this.f30869e) {
            throw new IndexOutOfBoundsException(mo44784o(i));
        }
    }

    /* renamed from: o */
    public final String mo44784o(int i) {
        int i2 = this.f30869e;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ Object remove(int i) {
        mo44712e();
        mo44783n(i);
        float[] fArr = this.f30868d;
        float f = fArr[i];
        int i2 = this.f30869e;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, i2 - i);
        }
        this.f30869e--;
        this.modCount++;
        return Float.valueOf(f);
    }

    public final boolean remove(Object obj) {
        mo44712e();
        for (int i = 0; i < this.f30869e; i++) {
            if (obj.equals(Float.valueOf(this.f30868d[i]))) {
                float[] fArr = this.f30868d;
                System.arraycopy(fArr, i + 1, fArr, i, this.f30869e - i);
                this.f30869e--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    public final void removeRange(int i, int i2) {
        mo44712e();
        if (i2 >= i) {
            float[] fArr = this.f30868d;
            System.arraycopy(fArr, i2, fArr, i, this.f30869e - i2);
            this.f30869e -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        mo44712e();
        mo44783n(i);
        float[] fArr = this.f30868d;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    public final int size() {
        return this.f30869e;
    }
}
