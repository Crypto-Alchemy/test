package p000;

import android.util.SparseArray;

/* renamed from: g66 */
/* compiled from: SpannedData */
public final class g66<V> {

    /* renamed from: a */
    public int f12191a;

    /* renamed from: b */
    public final SparseArray<V> f12192b = new SparseArray<>();

    /* renamed from: c */
    public final uq0<V> f12193c;

    public g66(uq0<V> uq0) {
        this.f12193c = uq0;
        this.f12191a = -1;
    }

    /* renamed from: a */
    public void mo20404a(int i, V v) {
        boolean z;
        boolean z2 = false;
        if (this.f12191a == -1) {
            if (this.f12192b.size() == 0) {
                z = true;
            } else {
                z = false;
            }
            C2725kr.m20987g(z);
            this.f12191a = 0;
        }
        if (this.f12192b.size() > 0) {
            SparseArray<V> sparseArray = this.f12192b;
            int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
            if (i >= keyAt) {
                z2 = true;
            }
            C2725kr.m20981a(z2);
            if (keyAt == i) {
                uq0<V> uq0 = this.f12193c;
                SparseArray<V> sparseArray2 = this.f12192b;
                uq0.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f12192b.append(i, v);
    }

    /* renamed from: b */
    public void mo20405b() {
        for (int i = 0; i < this.f12192b.size(); i++) {
            this.f12193c.accept(this.f12192b.valueAt(i));
        }
        this.f12191a = -1;
        this.f12192b.clear();
    }

    /* renamed from: c */
    public void mo20406c(int i) {
        int i2;
        int size = this.f12192b.size() - 1;
        while (size >= 0 && i < this.f12192b.keyAt(size)) {
            this.f12193c.accept(this.f12192b.valueAt(size));
            this.f12192b.removeAt(size);
            size--;
        }
        if (this.f12192b.size() > 0) {
            i2 = Math.min(this.f12191a, this.f12192b.size() - 1);
        } else {
            i2 = -1;
        }
        this.f12191a = i2;
    }

    /* renamed from: d */
    public void mo20407d(int i) {
        int i2 = 0;
        while (i2 < this.f12192b.size() - 1) {
            int i3 = i2 + 1;
            if (i >= this.f12192b.keyAt(i3)) {
                this.f12193c.accept(this.f12192b.valueAt(i2));
                this.f12192b.removeAt(i2);
                int i4 = this.f12191a;
                if (i4 > 0) {
                    this.f12191a = i4 - 1;
                }
                i2 = i3;
            } else {
                return;
            }
        }
    }

    /* renamed from: e */
    public V mo20408e(int i) {
        if (this.f12191a == -1) {
            this.f12191a = 0;
        }
        while (true) {
            int i2 = this.f12191a;
            if (i2 > 0 && i < this.f12192b.keyAt(i2)) {
                this.f12191a--;
            }
        }
        while (this.f12191a < this.f12192b.size() - 1 && i >= this.f12192b.keyAt(this.f12191a + 1)) {
            this.f12191a++;
        }
        return this.f12192b.valueAt(this.f12191a);
    }

    /* renamed from: f */
    public V mo20409f() {
        SparseArray<V> sparseArray = this.f12192b;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    /* renamed from: g */
    public boolean mo20410g() {
        if (this.f12192b.size() == 0) {
            return true;
        }
        return false;
    }
}
