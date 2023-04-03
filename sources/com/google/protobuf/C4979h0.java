package com.google.protobuf;

import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.h0 */
/* compiled from: ProtobufArrayList */
public final class C4979h0<E> extends C4955c<E> implements RandomAccess {

    /* renamed from: g */
    public static final C4979h0<Object> f25688g;

    /* renamed from: d */
    public E[] f25689d;

    /* renamed from: e */
    public int f25690e;

    static {
        C4979h0<Object> h0Var = new C4979h0<>(new Object[0], 0);
        f25688g = h0Var;
        h0Var.mo37085p();
    }

    public C4979h0(E[] eArr, int i) {
        this.f25689d = eArr;
        this.f25690e = i;
    }

    /* renamed from: j */
    public static <E> E[] m39593j(int i) {
        return new Object[i];
    }

    /* renamed from: k */
    public static <E> C4979h0<E> m39594k() {
        return f25688g;
    }

    public boolean add(E e) {
        mo37082e();
        int i = this.f25690e;
        E[] eArr = this.f25689d;
        if (i == eArr.length) {
            this.f25689d = Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f25689d;
        int i2 = this.f25690e;
        this.f25690e = i2 + 1;
        eArr2[i2] = e;
        this.modCount++;
        return true;
    }

    public E get(int i) {
        mo37336n(i);
        return this.f25689d[i];
    }

    /* renamed from: n */
    public final void mo37336n(int i) {
        if (i < 0 || i >= this.f25690e) {
            throw new IndexOutOfBoundsException(mo37337o(i));
        }
    }

    /* renamed from: o */
    public final String mo37337o(int i) {
        return "Index:" + i + ", Size:" + this.f25690e;
    }

    /* renamed from: q */
    public C4979h0<E> mo37216a(int i) {
        if (i >= this.f25690e) {
            return new C4979h0<>(Arrays.copyOf(this.f25689d, i), this.f25690e);
        }
        throw new IllegalArgumentException();
    }

    public E remove(int i) {
        mo37082e();
        mo37336n(i);
        E[] eArr = this.f25689d;
        E e = eArr[i];
        int i2 = this.f25690e;
        if (i < i2 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.f25690e--;
        this.modCount++;
        return e;
    }

    public E set(int i, E e) {
        mo37082e();
        mo37336n(i);
        E[] eArr = this.f25689d;
        E e2 = eArr[i];
        eArr[i] = e;
        this.modCount++;
        return e2;
    }

    public int size() {
        return this.f25690e;
    }

    public void add(int i, E e) {
        int i2;
        mo37082e();
        if (i < 0 || i > (i2 = this.f25690e)) {
            throw new IndexOutOfBoundsException(mo37337o(i));
        }
        E[] eArr = this.f25689d;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] j = m39593j(((i2 * 3) / 2) + 1);
            System.arraycopy(this.f25689d, 0, j, 0, i);
            System.arraycopy(this.f25689d, i, j, i + 1, this.f25690e - i);
            this.f25689d = j;
        }
        this.f25689d[i] = e;
        this.f25690e++;
        this.modCount++;
    }
}
