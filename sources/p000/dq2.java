package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\"\u0010\u0010J\u0016\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002J\"\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\u0003H\u0002R(\u0010\u0011\u001a\u00020\u00038\u0000@\u0000X\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010\n\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR0\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00128\u0000@\u0000X\u000e¢\u0006\u0018\n\u0004\b\u0006\u0010\u0013\u0012\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R(\u0010!\u001a\u00020\u001a8\u0000@\u0000X\u000e¢\u0006\u0018\n\u0004\b\t\u0010\u001b\u0012\u0004\b \u0010\u0010\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006#"}, mo44877d2 = {"Ldq2;", "", "key", "", "value", "a", "b", "midIndex", "valueHash", "c", "I", "e", "()I", "g", "(I)V", "getSize$annotations", "()V", "size", "", "[Ljava/lang/Object;", "d", "()[Ljava/lang/Object;", "setKeys", "([Ljava/lang/Object;)V", "getKeys$annotations", "keys", "", "[I", "f", "()[I", "setValues", "([I)V", "getValues$annotations", "values", "<init>", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: dq2 */
/* compiled from: IdentityArrayIntMap.kt */
public final class dq2 {

    /* renamed from: a */
    public int f10814a;

    /* renamed from: b */
    public Object[] f10815b = new Object[4];

    /* renamed from: c */
    public int[] f10816c = new int[4];

    /* renamed from: a */
    public final int mo18876a(Object obj, int i) {
        int i2;
        vx2.m53591g(obj, "key");
        if (this.f10814a > 0) {
            i2 = mo18877b(obj);
            if (i2 >= 0) {
                int[] iArr = this.f10816c;
                int i3 = iArr[i2];
                iArr[i2] = i;
                return i3;
            }
        } else {
            i2 = -1;
        }
        int i4 = -(i2 + 1);
        int i5 = this.f10814a;
        Object[] objArr = this.f10815b;
        if (i5 == objArr.length) {
            Object[] objArr2 = new Object[(objArr.length * 2)];
            int[] iArr2 = new int[(objArr.length * 2)];
            int i6 = i4 + 1;
            C6706xq.m54495i(objArr, objArr2, i6, i4, i5);
            C6706xq.m54493g(this.f10816c, iArr2, i6, i4, this.f10814a);
            int i7 = i4;
            C6706xq.m54499m(this.f10815b, objArr2, 0, 0, i7, 6, (Object) null);
            C6706xq.m54498l(this.f10816c, iArr2, 0, 0, i7, 6, (Object) null);
            this.f10815b = objArr2;
            this.f10816c = iArr2;
        } else {
            int i8 = i4 + 1;
            C6706xq.m54495i(objArr, objArr, i8, i4, i5);
            int[] iArr3 = this.f10816c;
            C6706xq.m54493g(iArr3, iArr3, i8, i4, this.f10814a);
        }
        this.f10815b[i4] = obj;
        this.f10816c[i4] = i;
        this.f10814a++;
        return -1;
    }

    /* renamed from: b */
    public final int mo18877b(Object obj) {
        int i = this.f10814a - 1;
        int a = C2283fb.m16819a(obj);
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            Object obj2 = this.f10815b[i3];
            int a2 = C2283fb.m16819a(obj2);
            if (a2 < a) {
                i2 = i3 + 1;
            } else if (a2 > a) {
                i = i3 - 1;
            } else if (obj2 == obj) {
                return i3;
            } else {
                return mo18878c(i3, obj, a);
            }
        }
        return -(i2 + 1);
    }

    /* renamed from: c */
    public final int mo18878c(int i, Object obj, int i2) {
        for (int i3 = i - 1; -1 < i3; i3--) {
            Object obj2 = this.f10815b[i3];
            if (obj2 == obj) {
                return i3;
            }
            if (C2283fb.m16819a(obj2) != i2) {
                break;
            }
        }
        int i4 = i + 1;
        int i5 = this.f10814a;
        while (true) {
            if (i4 >= i5) {
                i4 = this.f10814a;
                break;
            }
            Object obj3 = this.f10815b[i4];
            if (obj3 == obj) {
                return i4;
            }
            if (C2283fb.m16819a(obj3) != i2) {
                break;
            }
            i4++;
        }
        return -(i4 + 1);
    }

    /* renamed from: d */
    public final Object[] mo18879d() {
        return this.f10815b;
    }

    /* renamed from: e */
    public final int mo18880e() {
        return this.f10814a;
    }

    /* renamed from: f */
    public final int[] mo18881f() {
        return this.f10816c;
    }

    /* renamed from: g */
    public final void mo18882g(int i) {
        this.f10814a = i;
    }
}
