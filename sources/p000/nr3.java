package p000;

/* renamed from: nr3 */
/* compiled from: MediaPeriodId */
public class nr3 {

    /* renamed from: a */
    public final Object f15659a;

    /* renamed from: b */
    public final int f15660b;

    /* renamed from: c */
    public final int f15661c;

    /* renamed from: d */
    public final long f15662d;

    /* renamed from: e */
    public final int f15663e;

    public nr3(Object obj) {
        this(obj, -1);
    }

    /* renamed from: a */
    public nr3 mo23780a(Object obj) {
        if (this.f15659a.equals(obj)) {
            return this;
        }
        return new nr3(obj, this.f15660b, this.f15661c, this.f15662d, this.f15663e);
    }

    /* renamed from: b */
    public boolean mo23781b() {
        if (this.f15660b != -1) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nr3)) {
            return false;
        }
        nr3 nr3 = (nr3) obj;
        if (this.f15659a.equals(nr3.f15659a) && this.f15660b == nr3.f15660b && this.f15661c == nr3.f15661c && this.f15662d == nr3.f15662d && this.f15663e == nr3.f15663e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + this.f15659a.hashCode()) * 31) + this.f15660b) * 31) + this.f15661c) * 31) + ((int) this.f15662d)) * 31) + this.f15663e;
    }

    public nr3(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public nr3(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }

    public nr3(Object obj, int i, int i2, long j) {
        this(obj, i, i2, j, -1);
    }

    public nr3(nr3 nr3) {
        this.f15659a = nr3.f15659a;
        this.f15660b = nr3.f15660b;
        this.f15661c = nr3.f15661c;
        this.f15662d = nr3.f15662d;
        this.f15663e = nr3.f15663e;
    }

    public nr3(Object obj, int i, int i2, long j, int i3) {
        this.f15659a = obj;
        this.f15660b = i;
        this.f15661c = i2;
        this.f15662d = j;
        this.f15663e = i3;
    }
}
