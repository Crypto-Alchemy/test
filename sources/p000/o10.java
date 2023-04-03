package p000;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: o10 */
/* compiled from: BinaryVersion.kt */
public abstract class o10 {

    /* renamed from: f */
    public static final C9010a f43573f = new C9010a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final int[] f43574a;

    /* renamed from: b */
    public final int f43575b;

    /* renamed from: c */
    public final int f43576c;

    /* renamed from: d */
    public final int f43577d;

    /* renamed from: e */
    public final List<Integer> f43578e;

    /* renamed from: o10$a */
    /* compiled from: BinaryVersion.kt */
    public static final class C9010a {
        public C9010a() {
        }

        public /* synthetic */ C9010a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public o10(int... iArr) {
        int i;
        int i2;
        List<Integer> list;
        vx2.m53591g(iArr, "numbers");
        this.f43574a = iArr;
        Integer N = ArraysKt___ArraysKt.m47262N(iArr, 0);
        int i3 = -1;
        if (N != null) {
            i = N.intValue();
        } else {
            i = -1;
        }
        this.f43575b = i;
        Integer N2 = ArraysKt___ArraysKt.m47262N(iArr, 1);
        if (N2 != null) {
            i2 = N2.intValue();
        } else {
            i2 = -1;
        }
        this.f43576c = i2;
        Integer N3 = ArraysKt___ArraysKt.m47262N(iArr, 2);
        this.f43577d = N3 != null ? N3.intValue() : i3;
        if (iArr.length <= 3) {
            list = ck0.m33062j();
        } else if (iArr.length <= 1024) {
            list = CollectionsKt___CollectionsKt.m47311K0(C6706xq.m54489c(iArr).subList(3, iArr.length));
        } else {
            throw new IllegalArgumentException("BinaryVersion with length more than 1024 are not supported. Provided length " + iArr.length + '.');
        }
        this.f43578e = list;
    }

    /* renamed from: a */
    public final int mo62813a() {
        return this.f43575b;
    }

    /* renamed from: b */
    public final int mo62814b() {
        return this.f43576c;
    }

    /* renamed from: c */
    public final boolean mo62815c(int i, int i2, int i3) {
        int i4 = this.f43575b;
        if (i4 > i) {
            return true;
        }
        if (i4 < i) {
            return false;
        }
        int i5 = this.f43576c;
        if (i5 > i2) {
            return true;
        }
        if (i5 < i2) {
            return false;
        }
        if (this.f43577d >= i3) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo62816d(o10 o10) {
        vx2.m53591g(o10, "version");
        return mo62815c(o10.f43575b, o10.f43576c, o10.f43577d);
    }

    /* renamed from: e */
    public final boolean mo62817e(int i, int i2, int i3) {
        int i4 = this.f43575b;
        if (i4 < i) {
            return true;
        }
        if (i4 > i) {
            return false;
        }
        int i5 = this.f43576c;
        if (i5 < i2) {
            return true;
        }
        if (i5 > i2) {
            return false;
        }
        if (this.f43577d <= i3) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj != null && vx2.m53586b(getClass(), obj.getClass())) {
            o10 o10 = (o10) obj;
            if (this.f43575b == o10.f43575b && this.f43576c == o10.f43576c && this.f43577d == o10.f43577d && vx2.m53586b(this.f43578e, o10.f43578e)) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo62819f(o10 o10) {
        vx2.m53591g(o10, "ourVersion");
        int i = this.f43575b;
        if (i == 0) {
            if (o10.f43575b == 0 && this.f43576c == o10.f43576c) {
                return true;
            }
        } else if (i == o10.f43575b && this.f43576c <= o10.f43576c) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final int[] mo62820g() {
        return this.f43574a;
    }

    public int hashCode() {
        int i = this.f43575b;
        int i2 = i + (i * 31) + this.f43576c;
        int i3 = i2 + (i2 * 31) + this.f43577d;
        return i3 + (i3 * 31) + this.f43578e.hashCode();
    }

    public String toString() {
        boolean z;
        int[] g = mo62820g();
        ArrayList arrayList = new ArrayList();
        for (int i : g) {
            if (i != -1) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                break;
            }
            arrayList.add(Integer.valueOf(i));
        }
        if (arrayList.isEmpty()) {
            return "unknown";
        }
        return CollectionsKt___CollectionsKt.m47338i0(arrayList, ".", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (rc2) null, 62, (Object) null);
    }
}
