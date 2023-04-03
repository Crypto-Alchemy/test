package p000;

/* renamed from: g00 */
/* compiled from: BatchingListUpdateCallback */
public class g00 implements di3 {

    /* renamed from: a */
    public final di3 f12138a;

    /* renamed from: d */
    public int f12139d = 0;

    /* renamed from: e */
    public int f12140e = -1;

    /* renamed from: g */
    public int f12141g = -1;

    /* renamed from: k */
    public Object f12142k = null;

    public g00(di3 di3) {
        this.f12138a = di3;
    }

    /* renamed from: a */
    public void mo20307a() {
        int i = this.f12139d;
        if (i != 0) {
            if (i == 1) {
                this.f12138a.onInserted(this.f12140e, this.f12141g);
            } else if (i == 2) {
                this.f12138a.onRemoved(this.f12140e, this.f12141g);
            } else if (i == 3) {
                this.f12138a.onChanged(this.f12140e, this.f12141g, this.f12142k);
            }
            this.f12142k = null;
            this.f12139d = 0;
        }
    }

    public void onChanged(int i, int i2, Object obj) {
        int i3;
        if (this.f12139d == 3) {
            int i4 = this.f12140e;
            int i5 = this.f12141g;
            if (i <= i4 + i5 && (i3 = i + i2) >= i4 && this.f12142k == obj) {
                this.f12140e = Math.min(i, i4);
                this.f12141g = Math.max(i5 + i4, i3) - this.f12140e;
                return;
            }
        }
        mo20307a();
        this.f12140e = i;
        this.f12141g = i2;
        this.f12142k = obj;
        this.f12139d = 3;
    }

    public void onInserted(int i, int i2) {
        int i3;
        if (this.f12139d == 1 && i >= (i3 = this.f12140e)) {
            int i4 = this.f12141g;
            if (i <= i3 + i4) {
                this.f12141g = i4 + i2;
                this.f12140e = Math.min(i, i3);
                return;
            }
        }
        mo20307a();
        this.f12140e = i;
        this.f12141g = i2;
        this.f12139d = 1;
    }

    public void onMoved(int i, int i2) {
        mo20307a();
        this.f12138a.onMoved(i, i2);
    }

    public void onRemoved(int i, int i2) {
        int i3;
        if (this.f12139d != 2 || (i3 = this.f12140e) < i || i3 > i + i2) {
            mo20307a();
            this.f12140e = i;
            this.f12141g = i2;
            this.f12139d = 2;
            return;
        }
        this.f12141g += i2;
        this.f12140e = i;
    }
}
