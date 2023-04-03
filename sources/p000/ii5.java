package p000;

/* renamed from: ii5 */
/* compiled from: RtlSpacingHelper */
public class ii5 {

    /* renamed from: a */
    public int f13270a = 0;

    /* renamed from: b */
    public int f13271b = 0;

    /* renamed from: c */
    public int f13272c = Integer.MIN_VALUE;

    /* renamed from: d */
    public int f13273d = Integer.MIN_VALUE;

    /* renamed from: e */
    public int f13274e = 0;

    /* renamed from: f */
    public int f13275f = 0;

    /* renamed from: g */
    public boolean f13276g = false;

    /* renamed from: h */
    public boolean f13277h = false;

    /* renamed from: a */
    public int mo21542a() {
        if (this.f13276g) {
            return this.f13270a;
        }
        return this.f13271b;
    }

    /* renamed from: b */
    public int mo21543b() {
        return this.f13270a;
    }

    /* renamed from: c */
    public int mo21544c() {
        return this.f13271b;
    }

    /* renamed from: d */
    public int mo21545d() {
        if (this.f13276g) {
            return this.f13271b;
        }
        return this.f13270a;
    }

    /* renamed from: e */
    public void mo21546e(int i, int i2) {
        this.f13277h = false;
        if (i != Integer.MIN_VALUE) {
            this.f13274e = i;
            this.f13270a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f13275f = i2;
            this.f13271b = i2;
        }
    }

    /* renamed from: f */
    public void mo21547f(boolean z) {
        if (z != this.f13276g) {
            this.f13276g = z;
            if (!this.f13277h) {
                this.f13270a = this.f13274e;
                this.f13271b = this.f13275f;
            } else if (z) {
                int i = this.f13273d;
                if (i == Integer.MIN_VALUE) {
                    i = this.f13274e;
                }
                this.f13270a = i;
                int i2 = this.f13272c;
                if (i2 == Integer.MIN_VALUE) {
                    i2 = this.f13275f;
                }
                this.f13271b = i2;
            } else {
                int i3 = this.f13272c;
                if (i3 == Integer.MIN_VALUE) {
                    i3 = this.f13274e;
                }
                this.f13270a = i3;
                int i4 = this.f13273d;
                if (i4 == Integer.MIN_VALUE) {
                    i4 = this.f13275f;
                }
                this.f13271b = i4;
            }
        }
    }

    /* renamed from: g */
    public void mo21548g(int i, int i2) {
        this.f13272c = i;
        this.f13273d = i2;
        this.f13277h = true;
        if (this.f13276g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f13270a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f13271b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f13270a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f13271b = i2;
        }
    }
}
