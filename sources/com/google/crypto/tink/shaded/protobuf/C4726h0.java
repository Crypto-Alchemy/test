package com.google.crypto.tink.shaded.protobuf;

import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: com.google.crypto.tink.shaded.protobuf.h0 */
/* compiled from: ProtobufArrayList */
public final class C4726h0<E> extends C4704c<E> implements RandomAccess {

    /* renamed from: g */
    public static final C4726h0<Object> f25232g;

    /* renamed from: d */
    public E[] f25233d;

    /* renamed from: e */
    public int f25234e;

    static {
        C4726h0<Object> h0Var = new C4726h0<>(new Object[0], 0);
        f25232g = h0Var;
        h0Var.mo35628p();
    }

    public C4726h0(E[] eArr, int i) {
        this.f25233d = eArr;
        this.f25234e = i;
    }

    /* renamed from: j */
    public static <E> E[] m38002j(int i) {
        return new Object[i];
    }

    /* renamed from: k */
    public static <E> C4726h0<E> m38003k() {
        return f25232g;
    }

    public boolean add(E e) {
        mo35625e();
        int i = this.f25234e;
        E[] eArr = this.f25233d;
        if (i == eArr.length) {
            this.f25233d = Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f25233d;
        int i2 = this.f25234e;
        this.f25234e = i2 + 1;
        eArr2[i2] = e;
        this.modCount++;
        return true;
    }

    public E get(int i) {
        mo35877n(i);
        return this.f25233d[i];
    }

    /* renamed from: n */
    public final void mo35877n(int i) {
        if (i < 0 || i >= this.f25234e) {
            throw new IndexOutOfBoundsException(mo35878o(i));
        }
    }

    /* renamed from: o */
    public final String mo35878o(int i) {
        return "Index:" + i + ", Size:" + this.f25234e;
    }

    /* renamed from: q */
    public C4726h0<E> mo35757a(int i) {
        if (i >= this.f25234e) {
            return new C4726h0<>(Arrays.copyOf(this.f25233d, i), this.f25234e);
        }
        throw new IllegalArgumentException();
    }

    public E remove(int i) {
        mo35625e();
        mo35877n(i);
        E[] eArr = this.f25233d;
        E e = eArr[i];
        int i2 = this.f25234e;
        if (i < i2 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.f25234e--;
        this.modCount++;
        return e;
    }

    public E set(int i, E e) {
        mo35625e();
        mo35877n(i);
        E[] eArr = this.f25233d;
        E e2 = eArr[i];
        eArr[i] = e;
        this.modCount++;
        return e2;
    }

    public int size() {
        return this.f25234e;
    }

    public void add(int i, E e) {
        int i2;
        mo35625e();
        if (i < 0 || i > (i2 = this.f25234e)) {
            throw new IndexOutOfBoundsException(mo35878o(i));
        }
        E[] eArr = this.f25233d;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] j = m38002j(((i2 * 3) / 2) + 1);
            System.arraycopy(this.f25233d, 0, j, 0, i);
            System.arraycopy(this.f25233d, i, j, i + 1, this.f25234e - i);
            this.f25233d = j;
        }
        this.f25233d[i] = e;
        this.f25234e++;
        this.modCount++;
    }
}
