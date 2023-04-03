package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: u49 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
public final class u49 extends vz8<Integer> implements RandomAccess, g59, f89 {

    /* renamed from: g */
    public static final u49 f34459g;

    /* renamed from: d */
    public int[] f34460d;

    /* renamed from: e */
    public int f34461e;

    static {
        u49 u49 = new u49(new int[0], 0);
        f34459g = u49;
        u49.zzb();
    }

    public u49() {
        this(new int[10], 0);
    }

    /* renamed from: j */
    public static u49 m52619j() {
        return f34459g;
    }

    /* renamed from: P */
    public final g59 mo43048I(int i) {
        if (i >= this.f34461e) {
            return new u49(Arrays.copyOf(this.f34460d, i), this.f34461e);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        mo48873e();
        if (i < 0 || i > (i2 = this.f34461e)) {
            throw new IndexOutOfBoundsException(mo48315q(i));
        }
        int[] iArr = this.f34460d;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f34460d, i, iArr2, i + 1, this.f34461e - i);
            this.f34460d = iArr2;
        }
        this.f34460d[i] = intValue;
        this.f34461e++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        mo48873e();
        p59.m49796a(collection);
        if (!(collection instanceof u49)) {
            return super.addAll(collection);
        }
        u49 u49 = (u49) collection;
        int i = u49.f34461e;
        if (i == 0) {
            return false;
        }
        int i2 = this.f34461e;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f34460d;
            if (i3 > iArr.length) {
                this.f34460d = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(u49.f34460d, 0, this.f34460d, this.f34461e, u49.f34461e);
            this.f34461e = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u49)) {
            return super.equals(obj);
        }
        u49 u49 = (u49) obj;
        if (this.f34461e != u49.f34461e) {
            return false;
        }
        int[] iArr = u49.f34460d;
        for (int i = 0; i < this.f34461e; i++) {
            if (this.f34460d[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        mo48314o(i);
        return Integer.valueOf(this.f34460d[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f34461e; i2++) {
            i = (i * 31) + this.f34460d[i2];
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.f34461e;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f34460d[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public final int mo48312k(int i) {
        mo48314o(i);
        return this.f34460d[i];
    }

    /* renamed from: n */
    public final void mo48313n(int i) {
        mo48873e();
        int i2 = this.f34461e;
        int[] iArr = this.f34460d;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f34460d = iArr2;
        }
        int[] iArr3 = this.f34460d;
        int i3 = this.f34461e;
        this.f34461e = i3 + 1;
        iArr3[i3] = i;
    }

    /* renamed from: o */
    public final void mo48314o(int i) {
        if (i < 0 || i >= this.f34461e) {
            throw new IndexOutOfBoundsException(mo48315q(i));
        }
    }

    /* renamed from: q */
    public final String mo48315q(int i) {
        int i2 = this.f34461e;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo48873e();
        mo48314o(i);
        int[] iArr = this.f34460d;
        int i2 = iArr[i];
        int i3 = this.f34461e;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f34461e--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public final void removeRange(int i, int i2) {
        mo48873e();
        if (i2 >= i) {
            int[] iArr = this.f34460d;
            System.arraycopy(iArr, i2, iArr, i, this.f34461e - i2);
            this.f34461e -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        mo48873e();
        mo48314o(i);
        int[] iArr = this.f34460d;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.f34461e;
    }

    public u49(int[] iArr, int i) {
        this.f34460d = iArr;
        this.f34461e = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo48313n(((Integer) obj).intValue());
        return true;
    }
}
