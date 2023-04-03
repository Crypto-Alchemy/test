package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0011¨\u0006\u0015"}, mo44877d2 = {"Ljp6;", "", "", "key", "b", "value", "", "d", "c", "", "a", "I", "size", "", "[J", "keys", "", "[Ljava/lang/Object;", "values", "<init>", "(I[J[Ljava/lang/Object;)V", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: jp6 */
/* compiled from: ThreadMap.kt */
public final class jp6 {

    /* renamed from: a */
    public final int f13780a;

    /* renamed from: b */
    public final long[] f13781b;

    /* renamed from: c */
    public final Object[] f13782c;

    public jp6(int i, long[] jArr, Object[] objArr) {
        vx2.m53591g(jArr, "keys");
        vx2.m53591g(objArr, "values");
        this.f13780a = i;
        this.f13781b = jArr;
        this.f13782c = objArr;
    }

    /* renamed from: a */
    public final int mo22031a(long j) {
        int i = this.f13780a - 1;
        if (i == -1) {
            return -1;
        }
        int i2 = 0;
        if (i != 0) {
            while (i2 <= i) {
                int i3 = (i2 + i) >>> 1;
                int i4 = ((this.f13781b[i3] - j) > 0 ? 1 : ((this.f13781b[i3] - j) == 0 ? 0 : -1));
                if (i4 < 0) {
                    i2 = i3 + 1;
                } else if (i4 <= 0) {
                    return i3;
                } else {
                    i = i3 - 1;
                }
            }
            return -(i2 + 1);
        }
        long j2 = this.f13781b[0];
        if (j2 == j) {
            return 0;
        }
        if (j2 > j) {
            return -2;
        }
        return -1;
    }

    /* renamed from: b */
    public final Object mo22032b(long j) {
        int a = mo22031a(j);
        if (a >= 0) {
            return this.f13782c[a];
        }
        return null;
    }

    /* renamed from: c */
    public final jp6 mo22033c(long j, Object obj) {
        int i = this.f13780a;
        Object[] objArr = this.f13782c;
        int length = objArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            boolean z = true;
            if (i3 >= length) {
                break;
            }
            if (objArr[i3] == null) {
                z = false;
            }
            if (z) {
                i4++;
            }
            i3++;
        }
        int i5 = i4 + 1;
        long[] jArr = new long[i5];
        Object[] objArr2 = new Object[i5];
        if (i5 > 1) {
            int i6 = 0;
            while (true) {
                if (i2 >= i5 || i6 >= i) {
                    break;
                }
                long j2 = this.f13781b[i6];
                Object obj2 = this.f13782c[i6];
                if (j2 > j) {
                    jArr[i2] = j;
                    objArr2[i2] = obj;
                    i2++;
                    break;
                }
                if (obj2 != null) {
                    jArr[i2] = j2;
                    objArr2[i2] = obj2;
                    i2++;
                }
                i6++;
            }
            if (i6 == i) {
                int i7 = i5 - 1;
                jArr[i7] = j;
                objArr2[i7] = obj;
            } else {
                while (i2 < i5) {
                    long j3 = this.f13781b[i6];
                    Object obj3 = this.f13782c[i6];
                    if (obj3 != null) {
                        jArr[i2] = j3;
                        objArr2[i2] = obj3;
                        i2++;
                    }
                    i6++;
                }
            }
        } else {
            jArr[0] = j;
            objArr2[0] = obj;
        }
        return new jp6(i5, jArr, objArr2);
    }

    /* renamed from: d */
    public final boolean mo22034d(long j, Object obj) {
        int a = mo22031a(j);
        if (a < 0) {
            return false;
        }
        this.f13782c[a] = obj;
        return true;
    }
}
