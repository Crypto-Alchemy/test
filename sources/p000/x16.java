package p000;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u000b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0013\b\u0017\u0012\b\b\u0002\u0010(\u001a\u00020\u0005¢\u0006\u0004\b)\u0010&J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0004J\b\u0010\b\u001a\u00020\u0005H\u0004J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003J\u001a\u0010\r\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00028\u00012\u0006\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0011J\u0006\u0010\u0013\u001a\u00020\tJ\u001f\u0010\u0015\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0018\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u0002J\b\u0010\u0019\u001a\u00020\u0005H\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016R\u0016\u0010\u001e\u001a\u00020\u001c8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001dR\u001e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u001f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010 R\"\u0010'\u001a\u00020\u00058\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006*"}, mo44877d2 = {"Lx16;", "K", "V", "", "key", "", "hash", "c", "e", "", "a", "(Ljava/lang/Object;)Z", "d", "b", "(Ljava/lang/Object;)Ljava/lang/Object;", "index", "g", "(I)Ljava/lang/Object;", "i", "f", "value", "h", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "other", "equals", "hashCode", "", "toString", "", "[I", "hashes", "", "[Ljava/lang/Object;", "keyValues", "I", "get_size", "()I", "set_size", "(I)V", "_size", "capacity", "<init>", "ui-text_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: x16 */
/* compiled from: SimpleArrayMap.kt */
public final class x16<K, V> {

    /* renamed from: a */
    public int[] f19274a;

    /* renamed from: b */
    public Object[] f19275b;

    /* renamed from: c */
    public int f19276c;

    public x16() {
        this(0, 1, (DefaultConstructorMarker) null);
    }

    public x16(int i) {
        if (i == 0) {
            this.f19274a = or0.f15973a;
            this.f19275b = or0.f15974b;
        } else {
            this.f19274a = new int[i];
            this.f19275b = new Object[(i << 1)];
        }
        this.f19276c = 0;
    }

    /* renamed from: a */
    public final boolean mo27648a(K k) {
        if (mo27651d(k) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final V mo27649b(K k) {
        int d = mo27651d(k);
        if (d >= 0) {
            return this.f19275b[(d << 1) + 1];
        }
        return null;
    }

    /* renamed from: c */
    public final int mo27650c(Object obj, int i) {
        vx2.m53591g(obj, "key");
        int i2 = this.f19276c;
        if (i2 == 0) {
            return -1;
        }
        int a = or0.m23962a(this.f19274a, i2, i);
        if (a < 0 || vx2.m53586b(obj, this.f19275b[a << 1])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f19274a[i3] == i) {
            if (vx2.m53586b(obj, this.f19275b[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        int i4 = a - 1;
        while (i4 >= 0 && this.f19274a[i4] == i) {
            if (vx2.m53586b(obj, this.f19275b[i4 << 1])) {
                return i4;
            }
            i4--;
        }
        return ~i3;
    }

    /* renamed from: d */
    public final int mo27651d(Object obj) {
        if (obj == null) {
            return mo27652e();
        }
        return mo27650c(obj, obj.hashCode());
    }

    /* renamed from: e */
    public final int mo27652e() {
        int i = this.f19276c;
        if (i == 0) {
            return -1;
        }
        int a = or0.m23962a(this.f19274a, i, 0);
        if (a < 0 || this.f19275b[a << 1] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f19274a[i2] == 0) {
            if (this.f19275b[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = a - 1;
        while (i3 >= 0 && this.f19274a[i3] == 0) {
            if (this.f19275b[i3 << 1] == null) {
                return i3;
            }
            i3--;
        }
        return ~i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof x16) {
                x16 x16 = (x16) obj;
                int i = this.f19276c;
                if (i != x16.f19276c) {
                    return false;
                }
                for (int i2 = 0; i2 < i; i2++) {
                    Object g = mo27655g(i2);
                    Object i3 = mo27658i(i2);
                    Object b = x16.mo27649b(g);
                    if (i3 == null) {
                        if (b != null || !x16.mo27648a(g)) {
                            return false;
                        }
                    } else if (!vx2.m53586b(i3, b)) {
                        return false;
                    }
                }
                return true;
            } else if (!(obj instanceof Map) || this.f19276c != ((Map) obj).size()) {
                return false;
            } else {
                int i4 = this.f19276c;
                for (int i5 = 0; i5 < i4; i5++) {
                    Object g2 = mo27655g(i5);
                    Object i6 = mo27658i(i5);
                    Object obj2 = ((Map) obj).get(g2);
                    if (i6 == null) {
                        if (obj2 != null || !((Map) obj).containsKey(g2)) {
                            return false;
                        }
                    } else if (!vx2.m53586b(i6, obj2)) {
                        return false;
                    }
                }
                return true;
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo27654f() {
        if (this.f19276c <= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final K mo27655g(int i) {
        return this.f19275b[i << 1];
    }

    /* renamed from: h */
    public final V mo27656h(K k, V v) {
        int i;
        int i2;
        int i3 = this.f19276c;
        if (k == null) {
            i2 = 0;
            i = mo27652e();
        } else {
            i2 = k.hashCode();
            i = mo27650c(k, i2);
        }
        if (i >= 0) {
            int i4 = (i << 1) + 1;
            V[] vArr = this.f19275b;
            V v2 = vArr[i4];
            vArr[i4] = v;
            return v2;
        }
        int i5 = ~i;
        int[] iArr = this.f19274a;
        if (i3 >= iArr.length) {
            int i6 = 4;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i6 = 8;
            }
            int[] copyOf = Arrays.copyOf(iArr, i6);
            vx2.m53590f(copyOf, "copyOf(this, newSize)");
            this.f19274a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f19275b, i6 << 1);
            vx2.m53590f(copyOf2, "copyOf(this, newSize)");
            this.f19275b = copyOf2;
            if (i3 != this.f19276c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i5 < i3) {
            int[] iArr2 = this.f19274a;
            int i7 = i5 + 1;
            C6706xq.m54493g(iArr2, iArr2, i7, i5, i3);
            Object[] objArr = this.f19275b;
            C6706xq.m54495i(objArr, objArr, i7 << 1, i5 << 1, this.f19276c << 1);
        }
        int i8 = this.f19276c;
        if (i3 == i8) {
            int[] iArr3 = this.f19274a;
            if (i5 < iArr3.length) {
                iArr3[i5] = i2;
                Object[] objArr2 = this.f19275b;
                int i9 = i5 << 1;
                objArr2[i9] = k;
                objArr2[i9 + 1] = v;
                this.f19276c = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public int hashCode() {
        int i;
        int[] iArr = this.f19274a;
        Object[] objArr = this.f19275b;
        int i2 = this.f19276c;
        int i3 = 1;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            Object obj = objArr[i3];
            int i6 = iArr[i4];
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i5 += i ^ i6;
            i4++;
            i3 += 2;
        }
        return i5;
    }

    /* renamed from: i */
    public final V mo27658i(int i) {
        return this.f19275b[(i << 1) + 1];
    }

    public String toString() {
        if (mo27654f()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f19276c * 28);
        sb.append('{');
        int i = this.f19276c;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object g = mo27655g(i2);
            if (g != this) {
                sb.append(g);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object i3 = mo27658i(i2);
            if (i3 != this) {
                sb.append(i3);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        vx2.m53590f(sb2, "buffer.toString()");
        return sb2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x16(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
