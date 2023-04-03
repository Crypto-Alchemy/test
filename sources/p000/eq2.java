package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0012\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u0004\b\u0001\u0010\u00032\u00020\u0001B\u0011\u0012\b\b\u0002\u0010&\u001a\u00020\u0011¢\u0006\u0004\b'\u0010$J\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0006\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\t\u0010\nJ \u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\bJ\u0006\u0010\u0010\u001a\u00020\fJ\u0012\u0010\u0012\u001a\u00020\u00112\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0002J\"\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\b\u0010\u0006\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0014\u001a\u00020\u0011H\u0002R*\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00168\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR*\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00168\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR\"\u0010%\u001a\u00020\u00118\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006("}, mo44877d2 = {"Leq2;", "", "Key", "Value", "", "i", "key", "b", "(Ljava/lang/Object;)Z", "e", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "Lr37;", "k", "(Ljava/lang/Object;Ljava/lang/Object;)V", "j", "a", "", "c", "midIndex", "keyHash", "d", "", "[Ljava/lang/Object;", "f", "()[Ljava/lang/Object;", "setKeys$runtime_release", "([Ljava/lang/Object;)V", "keys", "h", "setValues$runtime_release", "values", "I", "g", "()I", "l", "(I)V", "size", "capacity", "<init>", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: eq2 */
/* compiled from: IdentityArrayMap.kt */
public final class eq2<Key, Value> {

    /* renamed from: a */
    public Object[] f11324a;

    /* renamed from: b */
    public Object[] f11325b;

    /* renamed from: c */
    public int f11326c;

    public eq2(int i) {
        this.f11324a = new Object[i];
        this.f11325b = new Object[i];
    }

    /* renamed from: a */
    public final void mo19455a() {
        this.f11326c = 0;
        C6706xq.m54505s(this.f11324a, (Object) null, 0, 0, 6, (Object) null);
        C6706xq.m54505s(this.f11325b, (Object) null, 0, 0, 6, (Object) null);
    }

    /* renamed from: b */
    public final boolean mo19456b(Key key) {
        vx2.m53591g(key, "key");
        if (mo19457c(key) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final int mo19457c(Object obj) {
        int a = C2283fb.m16819a(obj);
        int i = this.f11326c - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            Object obj2 = this.f11324a[i3];
            int a2 = C2283fb.m16819a(obj2);
            if (a2 < a) {
                i2 = i3 + 1;
            } else if (a2 > a) {
                i = i3 - 1;
            } else if (obj == obj2) {
                return i3;
            } else {
                return mo19458d(i3, obj, a);
            }
        }
        return -(i2 + 1);
    }

    /* renamed from: d */
    public final int mo19458d(int i, Object obj, int i2) {
        for (int i3 = i - 1; -1 < i3; i3--) {
            Object obj2 = this.f11324a[i3];
            if (obj2 == obj) {
                return i3;
            }
            if (C2283fb.m16819a(obj2) != i2) {
                break;
            }
        }
        int i4 = i + 1;
        int i5 = this.f11326c;
        while (true) {
            if (i4 >= i5) {
                i4 = this.f11326c;
                break;
            }
            Object obj3 = this.f11324a[i4];
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

    /* renamed from: e */
    public final Value mo19459e(Key key) {
        vx2.m53591g(key, "key");
        int c = mo19457c(key);
        if (c >= 0) {
            return this.f11325b[c];
        }
        return null;
    }

    /* renamed from: f */
    public final Object[] mo19460f() {
        return this.f11324a;
    }

    /* renamed from: g */
    public final int mo19461g() {
        return this.f11326c;
    }

    /* renamed from: h */
    public final Object[] mo19462h() {
        return this.f11325b;
    }

    /* renamed from: i */
    public final boolean mo19463i() {
        if (this.f11326c > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final boolean mo19464j(Key key) {
        vx2.m53591g(key, "key");
        int c = mo19457c(key);
        if (c < 0) {
            return false;
        }
        int i = this.f11326c;
        Object[] objArr = this.f11324a;
        Object[] objArr2 = this.f11325b;
        int i2 = c + 1;
        C6706xq.m54495i(objArr, objArr, c, i2, i);
        C6706xq.m54495i(objArr2, objArr2, c, i2, i);
        int i3 = i - 1;
        objArr[i3] = null;
        objArr2[i3] = null;
        this.f11326c = i3;
        return true;
    }

    /* renamed from: k */
    public final void mo19465k(Key key, Value value) {
        boolean z;
        Object[] objArr;
        Object[] objArr2;
        vx2.m53591g(key, "key");
        int c = mo19457c(key);
        if (c >= 0) {
            this.f11325b[c] = value;
            return;
        }
        int i = -(c + 1);
        int i2 = this.f11326c;
        Object[] objArr3 = this.f11324a;
        if (i2 == objArr3.length) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            objArr = new Object[(i2 * 2)];
        } else {
            objArr = objArr3;
        }
        int i3 = i + 1;
        C6706xq.m54495i(objArr3, objArr, i3, i, i2);
        if (z) {
            C6706xq.m54499m(this.f11324a, objArr, 0, 0, i, 6, (Object) null);
        }
        objArr[i] = key;
        this.f11324a = objArr;
        if (z) {
            objArr2 = new Object[(this.f11326c * 2)];
        } else {
            objArr2 = this.f11325b;
        }
        C6706xq.m54495i(this.f11325b, objArr2, i3, i, this.f11326c);
        if (z) {
            C6706xq.m54499m(this.f11325b, objArr2, 0, 0, i, 6, (Object) null);
        }
        objArr2[i] = value;
        this.f11325b = objArr2;
        this.f11326c++;
    }

    /* renamed from: l */
    public final void mo19466l(int i) {
        this.f11326c = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eq2(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 16 : i);
    }
}
