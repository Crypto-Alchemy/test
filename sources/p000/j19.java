package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: j19 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public final class j19 extends kw8<Float> implements j69, RandomAccess {

    /* renamed from: g */
    public static final j19 f30208g;

    /* renamed from: d */
    public float[] f30209d;

    /* renamed from: e */
    public int f30210e;

    static {
        j19 j19 = new j19(new float[0], 0);
        f30208g = j19;
        j19.zzb();
    }

    public j19() {
        this(new float[10], 0);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        mo45307e();
        if (i < 0 || i > (i2 = this.f30210e)) {
            throw new IndexOutOfBoundsException(mo44005n(i));
        }
        float[] fArr = this.f30209d;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f30209d, i, fArr2, i + 1, this.f30210e - i);
            this.f30209d = fArr2;
        }
        this.f30209d[i] = floatValue;
        this.f30210e++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        mo45307e();
        t19.m52047d(collection);
        if (!(collection instanceof j19)) {
            return super.addAll(collection);
        }
        j19 j19 = (j19) collection;
        int i = j19.f30210e;
        if (i == 0) {
            return false;
        }
        int i2 = this.f30210e;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f30209d;
            if (i3 > fArr.length) {
                this.f30209d = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(j19.f30209d, 0, this.f30209d, this.f30210e, j19.f30210e);
            this.f30210e = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final /* synthetic */ h29 mo28813d(int i) {
        if (i >= this.f30210e) {
            return new j19(Arrays.copyOf(this.f30209d, i), this.f30210e);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j19)) {
            return super.equals(obj);
        }
        j19 j19 = (j19) obj;
        if (this.f30210e != j19.f30210e) {
            return false;
        }
        float[] fArr = j19.f30209d;
        for (int i = 0; i < this.f30210e; i++) {
            if (Float.floatToIntBits(this.f30209d[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        mo44004k(i);
        return Float.valueOf(this.f30209d[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f30210e; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f30209d[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f30209d[i] == floatValue) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: j */
    public final void mo44003j(float f) {
        mo45307e();
        int i = this.f30210e;
        float[] fArr = this.f30209d;
        if (i == fArr.length) {
            float[] fArr2 = new float[(((i * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f30209d = fArr2;
        }
        float[] fArr3 = this.f30209d;
        int i2 = this.f30210e;
        this.f30210e = i2 + 1;
        fArr3[i2] = f;
    }

    /* renamed from: k */
    public final void mo44004k(int i) {
        if (i < 0 || i >= this.f30210e) {
            throw new IndexOutOfBoundsException(mo44005n(i));
        }
    }

    /* renamed from: n */
    public final String mo44005n(int i) {
        int i2 = this.f30210e;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ Object remove(int i) {
        mo45307e();
        mo44004k(i);
        float[] fArr = this.f30209d;
        float f = fArr[i];
        int i2 = this.f30210e;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f30210e--;
        this.modCount++;
        return Float.valueOf(f);
    }

    public final void removeRange(int i, int i2) {
        mo45307e();
        if (i2 >= i) {
            float[] fArr = this.f30209d;
            System.arraycopy(fArr, i2, fArr, i, this.f30210e - i2);
            this.f30210e -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        mo45307e();
        mo44004k(i);
        float[] fArr = this.f30209d;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    public final int size() {
        return this.f30210e;
    }

    public j19(float[] fArr, int i) {
        this.f30209d = fArr;
        this.f30210e = i;
    }

    public final /* synthetic */ boolean add(Object obj) {
        mo44003j(((Float) obj).floatValue());
        return true;
    }
}
