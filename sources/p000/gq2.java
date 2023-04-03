package p000;

import java.util.Arrays;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0018\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b9\u0010 J\u001d\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0001H\u0002J\u0006\u0010\u000b\u001a\u00020\nJ\u001d\u0010\f\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\u0007J\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\u0003\u001a\u00020\u0001H\u0002J\u0012\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0002J\"\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0016\u001a\u00020\u000fH\u0002R(\u0010!\u001a\u00020\u00188\u0000@\u0000X\u000e¢\u0006\u0018\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR0\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\"8\u0000@\u0000X\u000e¢\u0006\u0018\n\u0004\b#\u0010$\u0012\u0004\b)\u0010 \u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R6\u00101\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00110\"8\u0000@\u0000X\u000e¢\u0006\u0018\n\u0004\b\u0006\u0010+\u0012\u0004\b0\u0010 \u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R(\u00108\u001a\u00020\u000f8\u0000@\u0000X\u000e¢\u0006\u0018\n\u0004\b\u000b\u00102\u0012\u0004\b7\u0010 \u001a\u0004\b3\u00104\"\u0004\b5\u00106¨\u0006:"}, mo44877d2 = {"Lgq2;", "", "T", "value", "scope", "", "c", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "element", "e", "Lr37;", "d", "m", "n", "(Ljava/lang/Object;)V", "", "index", "Lfq2;", "o", "h", "f", "midIndex", "valueHash", "g", "", "a", "[I", "k", "()[I", "setValueOrder", "([I)V", "getValueOrder$annotations", "()V", "valueOrder", "", "b", "[Ljava/lang/Object;", "l", "()[Ljava/lang/Object;", "setValues", "([Ljava/lang/Object;)V", "getValues$annotations", "values", "[Lfq2;", "i", "()[Lfq2;", "setScopeSets", "([Lfq2;)V", "getScopeSets$annotations", "scopeSets", "I", "j", "()I", "p", "(I)V", "getSize$annotations", "size", "<init>", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: gq2 */
/* compiled from: IdentityScopeMap.kt */
public final class gq2<T> {

    /* renamed from: a */
    public int[] f12562a;

    /* renamed from: b */
    public Object[] f12563b;

    /* renamed from: c */
    public fq2<T>[] f12564c;

    /* renamed from: d */
    public int f12565d;

    public gq2() {
        int[] iArr = new int[50];
        for (int i = 0; i < 50; i++) {
            iArr[i] = i;
        }
        this.f12562a = iArr;
        this.f12563b = new Object[50];
        this.f12564c = new fq2[50];
    }

    /* renamed from: c */
    public final boolean mo20796c(Object obj, T t) {
        vx2.m53591g(obj, "value");
        vx2.m53591g(t, "scope");
        return mo20801h(obj).add(t);
    }

    /* renamed from: d */
    public final void mo20797d() {
        int length = this.f12564c.length;
        for (int i = 0; i < length; i++) {
            fq2<T> fq2 = this.f12564c[i];
            if (fq2 != null) {
                fq2.clear();
            }
            this.f12562a[i] = i;
            this.f12563b[i] = null;
        }
        this.f12565d = 0;
    }

    /* renamed from: e */
    public final boolean mo20798e(Object obj) {
        vx2.m53591g(obj, "element");
        if (mo20799f(obj) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final int mo20799f(Object obj) {
        int a = C2283fb.m16819a(obj);
        int i = this.f12565d - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            Object obj2 = this.f12563b[this.f12562a[i3]];
            vx2.m53588d(obj2);
            int a2 = C2283fb.m16819a(obj2);
            if (a2 < a) {
                i2 = i3 + 1;
            } else if (a2 > a) {
                i = i3 - 1;
            } else if (obj == obj2) {
                return i3;
            } else {
                return mo20800g(i3, obj, a);
            }
        }
        return -(i2 + 1);
    }

    /* renamed from: g */
    public final int mo20800g(int i, Object obj, int i2) {
        for (int i3 = i - 1; -1 < i3; i3--) {
            Object obj2 = this.f12563b[this.f12562a[i3]];
            vx2.m53588d(obj2);
            if (obj2 == obj) {
                return i3;
            }
            if (C2283fb.m16819a(obj2) != i2) {
                break;
            }
        }
        int i4 = i + 1;
        int i5 = this.f12565d;
        while (true) {
            if (i4 >= i5) {
                i4 = this.f12565d;
                break;
            }
            Object obj3 = this.f12563b[this.f12562a[i4]];
            vx2.m53588d(obj3);
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

    /* renamed from: h */
    public final fq2<T> mo20801h(Object obj) {
        int i;
        if (this.f12565d > 0) {
            i = mo20799f(obj);
            if (i >= 0) {
                return mo20808o(i);
            }
        } else {
            i = -1;
        }
        int i2 = -(i + 1);
        int i3 = this.f12565d;
        int[] iArr = this.f12562a;
        if (i3 < iArr.length) {
            int i4 = iArr[i3];
            this.f12563b[i4] = obj;
            fq2<T> fq2 = this.f12564c[i4];
            if (fq2 == null) {
                fq2 = new fq2<>();
                this.f12564c[i4] = fq2;
            }
            int i5 = this.f12565d;
            if (i2 < i5) {
                int[] iArr2 = this.f12562a;
                C6706xq.m54493g(iArr2, iArr2, i2 + 1, i2, i5);
            }
            this.f12562a[i2] = i4;
            this.f12565d++;
            return fq2;
        }
        int length = iArr.length * 2;
        Object[] copyOf = Arrays.copyOf(this.f12564c, length);
        vx2.m53590f(copyOf, "copyOf(this, newSize)");
        this.f12564c = (fq2[]) copyOf;
        fq2<T> fq22 = new fq2<>();
        this.f12564c[i3] = fq22;
        Object[] copyOf2 = Arrays.copyOf(this.f12563b, length);
        vx2.m53590f(copyOf2, "copyOf(this, newSize)");
        this.f12563b = copyOf2;
        copyOf2[i3] = obj;
        int[] iArr3 = new int[length];
        int i6 = this.f12565d;
        while (true) {
            i6++;
            if (i6 >= length) {
                break;
            }
            iArr3[i6] = i6;
        }
        int i7 = this.f12565d;
        if (i2 < i7) {
            C6706xq.m54493g(this.f12562a, iArr3, i2 + 1, i2, i7);
        }
        iArr3[i2] = i3;
        if (i2 > 0) {
            C6706xq.m54498l(this.f12562a, iArr3, 0, 0, i2, 6, (Object) null);
        }
        this.f12562a = iArr3;
        this.f12565d++;
        return fq22;
    }

    /* renamed from: i */
    public final fq2<T>[] mo20802i() {
        return this.f12564c;
    }

    /* renamed from: j */
    public final int mo20803j() {
        return this.f12565d;
    }

    /* renamed from: k */
    public final int[] mo20804k() {
        return this.f12562a;
    }

    /* renamed from: l */
    public final Object[] mo20805l() {
        return this.f12563b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r1 = r4.f12562a[r5];
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo20806m(java.lang.Object r5, T r6) {
        /*
            r4 = this;
            java.lang.String r0 = "value"
            p000.vx2.m53591g(r5, r0)
            java.lang.String r0 = "scope"
            p000.vx2.m53591g(r6, r0)
            int r5 = r4.mo20799f(r5)
            r0 = 0
            if (r5 < 0) goto L_0x0043
            int[] r1 = r4.f12562a
            r1 = r1[r5]
            fq2<T>[] r2 = r4.f12564c
            r2 = r2[r1]
            if (r2 != 0) goto L_0x001c
            return r0
        L_0x001c:
            boolean r6 = r2.remove(r6)
            int r0 = r2.size()
            if (r0 != 0) goto L_0x0042
            int r0 = r5 + 1
            int r2 = r4.f12565d
            if (r0 >= r2) goto L_0x0031
            int[] r3 = r4.f12562a
            p000.C6706xq.m54493g(r3, r3, r5, r0, r2)
        L_0x0031:
            int[] r5 = r4.f12562a
            int r0 = r4.f12565d
            int r2 = r0 + -1
            r5[r2] = r1
            java.lang.Object[] r5 = r4.f12563b
            r2 = 0
            r5[r1] = r2
            int r0 = r0 + -1
            r4.f12565d = r0
        L_0x0042:
            return r6
        L_0x0043:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.gq2.mo20806m(java.lang.Object, java.lang.Object):boolean");
    }

    /* renamed from: n */
    public final void mo20807n(T t) {
        vx2.m53591g(t, "scope");
        int j = mo20803j();
        int i = 0;
        for (int i2 = 0; i2 < j; i2++) {
            int i3 = mo20804k()[i2];
            fq2 fq2 = mo20802i()[i3];
            vx2.m53588d(fq2);
            fq2.remove(t);
            if (fq2.size() > 0) {
                if (i != i2) {
                    int i4 = mo20804k()[i];
                    mo20804k()[i] = i3;
                    mo20804k()[i2] = i4;
                }
                i++;
            }
        }
        int j2 = mo20803j();
        for (int i5 = i; i5 < j2; i5++) {
            mo20805l()[mo20804k()[i5]] = null;
        }
        mo20809p(i);
    }

    /* renamed from: o */
    public final fq2<T> mo20808o(int i) {
        fq2<T> fq2 = this.f12564c[this.f12562a[i]];
        vx2.m53588d(fq2);
        return fq2;
    }

    /* renamed from: p */
    public final void mo20809p(int i) {
        this.f12565d = i;
    }
}
