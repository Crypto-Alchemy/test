package p000;

import java.util.Arrays;

/* renamed from: i32 */
/* compiled from: FixedFrameRateEstimator */
public final class i32 {

    /* renamed from: a */
    public C2522a f13134a = new C2522a();

    /* renamed from: b */
    public C2522a f13135b = new C2522a();

    /* renamed from: c */
    public boolean f13136c;

    /* renamed from: d */
    public boolean f13137d;

    /* renamed from: e */
    public long f13138e = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;

    /* renamed from: f */
    public int f13139f;

    /* renamed from: i32$a */
    /* compiled from: FixedFrameRateEstimator */
    public static final class C2522a {

        /* renamed from: a */
        public long f13140a;

        /* renamed from: b */
        public long f13141b;

        /* renamed from: c */
        public long f13142c;

        /* renamed from: d */
        public long f13143d;

        /* renamed from: e */
        public long f13144e;

        /* renamed from: f */
        public long f13145f;

        /* renamed from: g */
        public final boolean[] f13146g = new boolean[15];

        /* renamed from: h */
        public int f13147h;

        /* renamed from: c */
        public static int m19378c(long j) {
            return (int) (j % 15);
        }

        /* renamed from: a */
        public long mo21442a() {
            long j = this.f13144e;
            if (j == 0) {
                return 0;
            }
            return this.f13145f / j;
        }

        /* renamed from: b */
        public long mo21443b() {
            return this.f13145f;
        }

        /* renamed from: d */
        public boolean mo21444d() {
            long j = this.f13143d;
            if (j == 0) {
                return false;
            }
            return this.f13146g[m19378c(j - 1)];
        }

        /* renamed from: e */
        public boolean mo21445e() {
            if (this.f13143d <= 15 || this.f13147h != 0) {
                return false;
            }
            return true;
        }

        /* renamed from: f */
        public void mo21446f(long j) {
            long j2 = this.f13143d;
            if (j2 == 0) {
                this.f13140a = j;
            } else if (j2 == 1) {
                long j3 = j - this.f13140a;
                this.f13141b = j3;
                this.f13145f = j3;
                this.f13144e = 1;
            } else {
                long j4 = j - this.f13142c;
                int c = m19378c(j2);
                if (Math.abs(j4 - this.f13141b) <= 1000000) {
                    this.f13144e++;
                    this.f13145f += j4;
                    boolean[] zArr = this.f13146g;
                    if (zArr[c]) {
                        zArr[c] = false;
                        this.f13147h--;
                    }
                } else {
                    boolean[] zArr2 = this.f13146g;
                    if (!zArr2[c]) {
                        zArr2[c] = true;
                        this.f13147h++;
                    }
                }
            }
            this.f13143d++;
            this.f13142c = j;
        }

        /* renamed from: g */
        public void mo21447g() {
            this.f13143d = 0;
            this.f13144e = 0;
            this.f13145f = 0;
            this.f13147h = 0;
            Arrays.fill(this.f13146g, false);
        }
    }

    /* renamed from: a */
    public long mo21435a() {
        if (mo21439e()) {
            return this.f13134a.mo21442a();
        }
        return CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
    }

    /* renamed from: b */
    public float mo21436b() {
        if (mo21439e()) {
            return (float) (1.0E9d / ((double) this.f13134a.mo21442a()));
        }
        return -1.0f;
    }

    /* renamed from: c */
    public int mo21437c() {
        return this.f13139f;
    }

    /* renamed from: d */
    public long mo21438d() {
        if (mo21439e()) {
            return this.f13134a.mo21443b();
        }
        return CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
    }

    /* renamed from: e */
    public boolean mo21439e() {
        return this.f13134a.mo21445e();
    }

    /* renamed from: f */
    public void mo21440f(long j) {
        this.f13134a.mo21446f(j);
        int i = 0;
        if (this.f13134a.mo21445e() && !this.f13137d) {
            this.f13136c = false;
        } else if (this.f13138e != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            if (!this.f13136c || this.f13135b.mo21444d()) {
                this.f13135b.mo21447g();
                this.f13135b.mo21446f(this.f13138e);
            }
            this.f13136c = true;
            this.f13135b.mo21446f(j);
        }
        if (this.f13136c && this.f13135b.mo21445e()) {
            C2522a aVar = this.f13134a;
            this.f13134a = this.f13135b;
            this.f13135b = aVar;
            this.f13136c = false;
            this.f13137d = false;
        }
        this.f13138e = j;
        if (!this.f13134a.mo21445e()) {
            i = this.f13139f + 1;
        }
        this.f13139f = i;
    }

    /* renamed from: g */
    public void mo21441g() {
        this.f13134a.mo21447g();
        this.f13135b.mo21447g();
        this.f13136c = false;
        this.f13138e = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        this.f13139f = 0;
    }
}
