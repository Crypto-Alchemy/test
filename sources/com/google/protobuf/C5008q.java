package com.google.protobuf;

import com.google.protobuf.C5011t;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.q */
/* compiled from: FloatArrayList */
public final class C5008q extends C4955c<Float> implements C5011t.C5017f, RandomAccess, bv4 {

    /* renamed from: g */
    public static final C5008q f25740g;

    /* renamed from: d */
    public float[] f25741d;

    /* renamed from: e */
    public int f25742e;

    static {
        C5008q qVar = new C5008q(new float[0], 0);
        f25740g = qVar;
        qVar.mo37085p();
    }

    public C5008q() {
        this(new float[10], 0);
    }

    /* renamed from: q */
    public static C5008q m39896q() {
        return f25740g;
    }

    /* renamed from: A */
    public Float set(int i, Float f) {
        return Float.valueOf(mo37487B(i, f.floatValue()));
    }

    /* renamed from: B */
    public float mo37487B(int i, float f) {
        mo37082e();
        mo37496r(i);
        float[] fArr = this.f25741d;
        float f2 = fArr[i];
        fArr[i] = f;
        return f2;
    }

    public boolean addAll(Collection<? extends Float> collection) {
        mo37082e();
        C5011t.m39927a(collection);
        if (!(collection instanceof C5008q)) {
            return super.addAll(collection);
        }
        C5008q qVar = (C5008q) collection;
        int i = qVar.f25742e;
        if (i == 0) {
            return false;
        }
        int i2 = this.f25742e;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f25741d;
            if (i3 > fArr.length) {
                this.f25741d = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(qVar.f25741d, 0, this.f25741d, this.f25742e, qVar.f25742e);
            this.f25742e = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5008q)) {
            return super.equals(obj);
        }
        C5008q qVar = (C5008q) obj;
        if (this.f25742e != qVar.f25742e) {
            return false;
        }
        float[] fArr = qVar.f25741d;
        for (int i = 0; i < this.f25742e; i++) {
            if (Float.floatToIntBits(this.f25741d[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f25742e; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f25741d[i2]);
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f25741d[i] == floatValue) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: j */
    public void add(int i, Float f) {
        mo37495o(i, f.floatValue());
    }

    /* renamed from: k */
    public boolean add(Float f) {
        mo37494n(f.floatValue());
        return true;
    }

    /* renamed from: n */
    public void mo37494n(float f) {
        mo37082e();
        int i = this.f25742e;
        float[] fArr = this.f25741d;
        if (i == fArr.length) {
            float[] fArr2 = new float[(((i * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f25741d = fArr2;
        }
        float[] fArr3 = this.f25741d;
        int i2 = this.f25742e;
        this.f25742e = i2 + 1;
        fArr3[i2] = f;
    }

    /* renamed from: o */
    public final void mo37495o(int i, float f) {
        int i2;
        mo37082e();
        if (i < 0 || i > (i2 = this.f25742e)) {
            throw new IndexOutOfBoundsException(mo37502u(i));
        }
        float[] fArr = this.f25741d;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f25741d, i, fArr2, i + 1, this.f25742e - i);
            this.f25741d = fArr2;
        }
        this.f25741d[i] = f;
        this.f25742e++;
        this.modCount++;
    }

    /* renamed from: r */
    public final void mo37496r(int i) {
        if (i < 0 || i >= this.f25742e) {
            throw new IndexOutOfBoundsException(mo37502u(i));
        }
    }

    public void removeRange(int i, int i2) {
        mo37082e();
        if (i2 >= i) {
            float[] fArr = this.f25741d;
            System.arraycopy(fArr, i2, fArr, i, this.f25742e - i2);
            this.f25742e -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* renamed from: s */
    public Float get(int i) {
        return Float.valueOf(mo37501t(i));
    }

    public int size() {
        return this.f25742e;
    }

    /* renamed from: t */
    public float mo37501t(int i) {
        mo37496r(i);
        return this.f25741d[i];
    }

    /* renamed from: u */
    public final String mo37502u(int i) {
        return "Index:" + i + ", Size:" + this.f25742e;
    }

    /* renamed from: w */
    public Float remove(int i) {
        mo37082e();
        mo37496r(i);
        float[] fArr = this.f25741d;
        float f = fArr[i];
        int i2 = this.f25742e;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f25742e--;
        this.modCount++;
        return Float.valueOf(f);
    }

    public C5008q(float[] fArr, int i) {
        this.f25741d = fArr;
        this.f25742e = i;
    }

    /* renamed from: a */
    public C5011t.C5017f m39900a(int i) {
        if (i >= this.f25742e) {
            return new C5008q(Arrays.copyOf(this.f25741d, i), this.f25742e);
        }
        throw new IllegalArgumentException();
    }
}
