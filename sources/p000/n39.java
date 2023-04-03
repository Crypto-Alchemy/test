package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: n39 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
public final class n39 extends vz8<Float> implements RandomAccess, f89 {

    /* renamed from: g */
    public static final n39 f31964g;

    /* renamed from: d */
    public float[] f31965d;

    /* renamed from: e */
    public int f31966e;

    static {
        n39 n39 = new n39(new float[0], 0);
        f31964g = n39;
        n39.zzb();
    }

    public n39() {
        this(new float[10], 0);
    }

    /* renamed from: I */
    public final /* bridge */ /* synthetic */ m59 mo43048I(int i) {
        if (i >= this.f31966e) {
            return new n39(Arrays.copyOf(this.f31965d, i), this.f31966e);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        mo48873e();
        if (i < 0 || i > (i2 = this.f31966e)) {
            throw new IndexOutOfBoundsException(mo45965n(i));
        }
        float[] fArr = this.f31965d;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f31965d, i, fArr2, i + 1, this.f31966e - i);
            this.f31965d = fArr2;
        }
        this.f31965d[i] = floatValue;
        this.f31966e++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        mo48873e();
        p59.m49796a(collection);
        if (!(collection instanceof n39)) {
            return super.addAll(collection);
        }
        n39 n39 = (n39) collection;
        int i = n39.f31966e;
        if (i == 0) {
            return false;
        }
        int i2 = this.f31966e;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f31965d;
            if (i3 > fArr.length) {
                this.f31965d = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(n39.f31965d, 0, this.f31965d, this.f31966e, n39.f31966e);
            this.f31966e = i3;
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n39)) {
            return super.equals(obj);
        }
        n39 n39 = (n39) obj;
        if (this.f31966e != n39.f31966e) {
            return false;
        }
        float[] fArr = n39.f31965d;
        for (int i = 0; i < this.f31966e; i++) {
            if (Float.floatToIntBits(this.f31965d[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        mo45964k(i);
        return Float.valueOf(this.f31965d[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f31966e; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f31965d[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i = this.f31966e;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f31965d[i2] == floatValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: j */
    public final void mo45963j(float f) {
        mo48873e();
        int i = this.f31966e;
        float[] fArr = this.f31965d;
        if (i == fArr.length) {
            float[] fArr2 = new float[(((i * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f31965d = fArr2;
        }
        float[] fArr3 = this.f31965d;
        int i2 = this.f31966e;
        this.f31966e = i2 + 1;
        fArr3[i2] = f;
    }

    /* renamed from: k */
    public final void mo45964k(int i) {
        if (i < 0 || i >= this.f31966e) {
            throw new IndexOutOfBoundsException(mo45965n(i));
        }
    }

    /* renamed from: n */
    public final String mo45965n(int i) {
        int i2 = this.f31966e;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo48873e();
        mo45964k(i);
        float[] fArr = this.f31965d;
        float f = fArr[i];
        int i2 = this.f31966e;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f31966e--;
        this.modCount++;
        return Float.valueOf(f);
    }

    public final void removeRange(int i, int i2) {
        mo48873e();
        if (i2 >= i) {
            float[] fArr = this.f31965d;
            System.arraycopy(fArr, i2, fArr, i, this.f31966e - i2);
            this.f31966e -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        mo48873e();
        mo45964k(i);
        float[] fArr = this.f31965d;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    public final int size() {
        return this.f31966e;
    }

    public n39(float[] fArr, int i) {
        this.f31965d = fArr;
        this.f31966e = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo45963j(((Float) obj).floatValue());
        return true;
    }
}
