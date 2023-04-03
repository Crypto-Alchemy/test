package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C4758t;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.crypto.tink.shaded.protobuf.q */
/* compiled from: FloatArrayList */
public final class C4755q extends C4704c<Float> implements C4758t.C4764f, RandomAccess, cv4 {

    /* renamed from: g */
    public static final C4755q f25284g;

    /* renamed from: d */
    public float[] f25285d;

    /* renamed from: e */
    public int f25286e;

    static {
        C4755q qVar = new C4755q(new float[0], 0);
        f25284g = qVar;
        qVar.mo35628p();
    }

    public C4755q() {
        this(new float[10], 0);
    }

    /* renamed from: A */
    public Float set(int i, Float f) {
        return Float.valueOf(mo36002B(i, f.floatValue()));
    }

    /* renamed from: B */
    public float mo36002B(int i, float f) {
        mo35625e();
        mo36011q(i);
        float[] fArr = this.f25285d;
        float f2 = fArr[i];
        fArr[i] = f;
        return f2;
    }

    public boolean addAll(Collection<? extends Float> collection) {
        mo35625e();
        C4758t.m38320a(collection);
        if (!(collection instanceof C4755q)) {
            return super.addAll(collection);
        }
        C4755q qVar = (C4755q) collection;
        int i = qVar.f25286e;
        if (i == 0) {
            return false;
        }
        int i2 = this.f25286e;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f25285d;
            if (i3 > fArr.length) {
                this.f25285d = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(qVar.f25285d, 0, this.f25285d, this.f25286e, qVar.f25286e);
            this.f25286e = i3;
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
        if (!(obj instanceof C4755q)) {
            return super.equals(obj);
        }
        C4755q qVar = (C4755q) obj;
        if (this.f25286e != qVar.f25286e) {
            return false;
        }
        float[] fArr = qVar.f25285d;
        for (int i = 0; i < this.f25286e; i++) {
            if (Float.floatToIntBits(this.f25285d[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f25286e; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f25285d[i2]);
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
            if (this.f25285d[i] == floatValue) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: j */
    public void add(int i, Float f) {
        mo36010o(i, f.floatValue());
    }

    /* renamed from: k */
    public boolean add(Float f) {
        mo36009n(f.floatValue());
        return true;
    }

    /* renamed from: n */
    public void mo36009n(float f) {
        mo35625e();
        int i = this.f25286e;
        float[] fArr = this.f25285d;
        if (i == fArr.length) {
            float[] fArr2 = new float[(((i * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f25285d = fArr2;
        }
        float[] fArr3 = this.f25285d;
        int i2 = this.f25286e;
        this.f25286e = i2 + 1;
        fArr3[i2] = f;
    }

    /* renamed from: o */
    public final void mo36010o(int i, float f) {
        int i2;
        mo35625e();
        if (i < 0 || i > (i2 = this.f25286e)) {
            throw new IndexOutOfBoundsException(mo36017t(i));
        }
        float[] fArr = this.f25285d;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f25285d, i, fArr2, i + 1, this.f25286e - i);
            this.f25285d = fArr2;
        }
        this.f25285d[i] = f;
        this.f25286e++;
        this.modCount++;
    }

    /* renamed from: q */
    public final void mo36011q(int i) {
        if (i < 0 || i >= this.f25286e) {
            throw new IndexOutOfBoundsException(mo36017t(i));
        }
    }

    /* renamed from: r */
    public Float get(int i) {
        return Float.valueOf(mo36014s(i));
    }

    public void removeRange(int i, int i2) {
        mo35625e();
        if (i2 >= i) {
            float[] fArr = this.f25285d;
            System.arraycopy(fArr, i2, fArr, i, this.f25286e - i2);
            this.f25286e -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* renamed from: s */
    public float mo36014s(int i) {
        mo36011q(i);
        return this.f25285d[i];
    }

    public int size() {
        return this.f25286e;
    }

    /* renamed from: t */
    public final String mo36017t(int i) {
        return "Index:" + i + ", Size:" + this.f25286e;
    }

    /* renamed from: u */
    public C4758t.C4764f mo35757a(int i) {
        if (i >= this.f25286e) {
            return new C4755q(Arrays.copyOf(this.f25285d, i), this.f25286e);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: w */
    public Float remove(int i) {
        mo35625e();
        mo36011q(i);
        float[] fArr = this.f25285d;
        float f = fArr[i];
        int i2 = this.f25286e;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f25286e--;
        this.modCount++;
        return Float.valueOf(f);
    }

    public C4755q(float[] fArr, int i) {
        this.f25285d = fArr;
        this.f25286e = i;
    }
}
