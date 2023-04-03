package p000;

import java.lang.reflect.Array;
import java.util.List;

/* renamed from: we4 */
/* compiled from: ObjectBuffer */
public final class we4 {

    /* renamed from: a */
    public th3<Object[]> f19074a;

    /* renamed from: b */
    public th3<Object[]> f19075b;

    /* renamed from: c */
    public int f19076c;

    /* renamed from: d */
    public Object[] f19077d;

    /* renamed from: a */
    public final void mo27490a(Object obj, int i, Object[] objArr, int i2) {
        int i3 = 0;
        for (th3<Object[]> th3 = this.f19074a; th3 != null; th3 = th3.mo26448c()) {
            Object[] d = th3.mo26449d();
            int length = d.length;
            System.arraycopy(d, 0, obj, i3, length);
            i3 += length;
        }
        System.arraycopy(objArr, 0, obj, i3, i2);
        int i4 = i3 + i2;
        if (i4 != i) {
            throw new IllegalStateException("Should have gotten " + i + " entries, got " + i4);
        }
    }

    /* renamed from: b */
    public void mo27491b() {
        th3<Object[]> th3 = this.f19075b;
        if (th3 != null) {
            this.f19077d = th3.mo26449d();
        }
        this.f19075b = null;
        this.f19074a = null;
        this.f19076c = 0;
    }

    /* renamed from: c */
    public Object[] mo27492c(Object[] objArr) {
        th3<Object[]> th3 = new th3<>(objArr, (th3) null);
        if (this.f19074a == null) {
            this.f19075b = th3;
            this.f19074a = th3;
        } else {
            this.f19075b.mo26447b(th3);
            this.f19075b = th3;
        }
        int length = objArr.length;
        this.f19076c += length;
        if (length < 16384) {
            length += length;
        } else if (length < 262144) {
            length += length >> 2;
        }
        return new Object[length];
    }

    /* renamed from: d */
    public int mo27493d() {
        return this.f19076c;
    }

    /* renamed from: e */
    public void mo27494e(Object[] objArr, int i, List<Object> list) {
        int i2;
        th3<Object[]> th3 = this.f19074a;
        while (true) {
            i2 = 0;
            if (th3 == null) {
                break;
            }
            Object[] d = th3.mo26449d();
            int length = d.length;
            while (i2 < length) {
                list.add(d[i2]);
                i2++;
            }
            th3 = th3.mo26448c();
        }
        while (i2 < i) {
            list.add(objArr[i2]);
            i2++;
        }
        mo27491b();
    }

    /* renamed from: f */
    public Object[] mo27495f(Object[] objArr, int i) {
        int i2 = this.f19076c + i;
        Object[] objArr2 = new Object[i2];
        mo27490a(objArr2, i2, objArr, i);
        mo27491b();
        return objArr2;
    }

    /* renamed from: g */
    public <T> T[] mo27496g(Object[] objArr, int i, Class<T> cls) {
        int i2 = this.f19076c + i;
        T[] tArr = (Object[]) Array.newInstance(cls, i2);
        mo27490a(tArr, i2, objArr, i);
        mo27491b();
        return tArr;
    }

    /* renamed from: h */
    public int mo27497h() {
        Object[] objArr = this.f19077d;
        if (objArr == null) {
            return 0;
        }
        return objArr.length;
    }

    /* renamed from: i */
    public Object[] mo27498i() {
        mo27491b();
        Object[] objArr = this.f19077d;
        if (objArr != null) {
            return objArr;
        }
        Object[] objArr2 = new Object[12];
        this.f19077d = objArr2;
        return objArr2;
    }

    /* renamed from: j */
    public Object[] mo27499j(Object[] objArr, int i) {
        mo27491b();
        Object[] objArr2 = this.f19077d;
        if (objArr2 == null || objArr2.length < i) {
            this.f19077d = new Object[Math.max(12, i)];
        }
        System.arraycopy(objArr, 0, this.f19077d, 0, i);
        return this.f19077d;
    }
}
