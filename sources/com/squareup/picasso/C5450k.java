package com.squareup.picasso;

import android.graphics.Bitmap;
import android.net.Uri;
import com.github.mikephil.charting.utils.Utils;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.squareup.picasso.k */
/* compiled from: Request */
public final class C5450k {

    /* renamed from: u */
    public static final long f26887u = TimeUnit.SECONDS.toNanos(5);

    /* renamed from: a */
    public int f26888a;

    /* renamed from: b */
    public long f26889b;

    /* renamed from: c */
    public int f26890c;

    /* renamed from: d */
    public final Uri f26891d;

    /* renamed from: e */
    public final int f26892e;

    /* renamed from: f */
    public final String f26893f;

    /* renamed from: g */
    public final List<lw6> f26894g;

    /* renamed from: h */
    public final int f26895h;

    /* renamed from: i */
    public final int f26896i;

    /* renamed from: j */
    public final boolean f26897j;

    /* renamed from: k */
    public final int f26898k;

    /* renamed from: l */
    public final boolean f26899l;

    /* renamed from: m */
    public final boolean f26900m;

    /* renamed from: n */
    public final float f26901n;

    /* renamed from: o */
    public final float f26902o;

    /* renamed from: p */
    public final float f26903p;

    /* renamed from: q */
    public final boolean f26904q;

    /* renamed from: r */
    public final boolean f26905r;

    /* renamed from: s */
    public final Bitmap.Config f26906s;

    /* renamed from: t */
    public final Picasso.Priority f26907t;

    /* renamed from: com.squareup.picasso.k$b */
    /* compiled from: Request */
    public static final class C5452b {

        /* renamed from: a */
        public Uri f26908a;

        /* renamed from: b */
        public int f26909b;

        /* renamed from: c */
        public String f26910c;

        /* renamed from: d */
        public int f26911d;

        /* renamed from: e */
        public int f26912e;

        /* renamed from: f */
        public boolean f26913f;

        /* renamed from: g */
        public int f26914g;

        /* renamed from: h */
        public boolean f26915h;

        /* renamed from: i */
        public boolean f26916i;

        /* renamed from: j */
        public float f26917j;

        /* renamed from: k */
        public float f26918k;

        /* renamed from: l */
        public float f26919l;

        /* renamed from: m */
        public boolean f26920m;

        /* renamed from: n */
        public boolean f26921n;

        /* renamed from: o */
        public List<lw6> f26922o;

        /* renamed from: p */
        public Bitmap.Config f26923p;

        /* renamed from: q */
        public Picasso.Priority f26924q;

        public C5452b(Uri uri, int i, Bitmap.Config config) {
            this.f26908a = uri;
            this.f26909b = i;
            this.f26923p = config;
        }

        /* renamed from: a */
        public C5450k mo39574a() {
            boolean z = this.f26915h;
            if (z && this.f26913f) {
                throw new IllegalStateException("Center crop and center inside can not be used together.");
            } else if (this.f26913f && this.f26911d == 0 && this.f26912e == 0) {
                throw new IllegalStateException("Center crop requires calling resize with positive width and height.");
            } else if (z && this.f26911d == 0 && this.f26912e == 0) {
                throw new IllegalStateException("Center inside requires calling resize with positive width and height.");
            } else {
                if (this.f26924q == null) {
                    this.f26924q = Picasso.Priority.NORMAL;
                }
                C5450k kVar = r2;
                C5450k kVar2 = new C5450k(this.f26908a, this.f26909b, this.f26910c, this.f26922o, this.f26911d, this.f26912e, this.f26913f, this.f26915h, this.f26914g, this.f26916i, this.f26917j, this.f26918k, this.f26919l, this.f26920m, this.f26921n, this.f26923p, this.f26924q);
                return kVar;
            }
        }

        /* renamed from: b */
        public C5452b mo39575b(int i) {
            if (!this.f26915h) {
                this.f26913f = true;
                this.f26914g = i;
                return this;
            }
            throw new IllegalStateException("Center crop can not be used after calling centerInside");
        }

        /* renamed from: c */
        public boolean mo39576c() {
            if (this.f26908a == null && this.f26909b == 0) {
                return false;
            }
            return true;
        }

        /* renamed from: d */
        public boolean mo39577d() {
            if (this.f26911d == 0 && this.f26912e == 0) {
                return false;
            }
            return true;
        }

        /* renamed from: e */
        public C5452b mo39578e(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Width must be positive number or 0.");
            } else if (i2 < 0) {
                throw new IllegalArgumentException("Height must be positive number or 0.");
            } else if (i2 == 0 && i == 0) {
                throw new IllegalArgumentException("At least one dimension has to be positive number.");
            } else {
                this.f26911d = i;
                this.f26912e = i2;
                return this;
            }
        }

        /* renamed from: f */
        public C5452b mo39579f(lw6 lw6) {
            if (lw6 == null) {
                throw new IllegalArgumentException("Transformation must not be null.");
            } else if (lw6.key() != null) {
                if (this.f26922o == null) {
                    this.f26922o = new ArrayList(2);
                }
                this.f26922o.add(lw6);
                return this;
            } else {
                throw new IllegalArgumentException("Transformation key must not be null.");
            }
        }
    }

    /* renamed from: a */
    public String mo39566a() {
        Uri uri = this.f26891d;
        if (uri != null) {
            return String.valueOf(uri.getPath());
        }
        return Integer.toHexString(this.f26892e);
    }

    /* renamed from: b */
    public boolean mo39567b() {
        if (this.f26894g != null) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public boolean mo39568c() {
        if (this.f26895h == 0 && this.f26896i == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public String mo39569d() {
        long nanoTime = System.nanoTime() - this.f26889b;
        if (nanoTime > f26887u) {
            return mo39572g() + '+' + TimeUnit.NANOSECONDS.toSeconds(nanoTime) + 's';
        }
        return mo39572g() + '+' + TimeUnit.NANOSECONDS.toMillis(nanoTime) + "ms";
    }

    /* renamed from: e */
    public boolean mo39570e() {
        if (mo39568c() || this.f26901n != Utils.FLOAT_EPSILON) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo39571f() {
        if (mo39570e() || mo39567b()) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public String mo39572g() {
        return "[R" + this.f26888a + ']';
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Request{");
        int i = this.f26892e;
        if (i > 0) {
            sb.append(i);
        } else {
            sb.append(this.f26891d);
        }
        List<lw6> list = this.f26894g;
        if (list != null && !list.isEmpty()) {
            for (lw6 key : this.f26894g) {
                sb.append(' ');
                sb.append(key.key());
            }
        }
        if (this.f26893f != null) {
            sb.append(" stableKey(");
            sb.append(this.f26893f);
            sb.append(')');
        }
        if (this.f26895h > 0) {
            sb.append(" resize(");
            sb.append(this.f26895h);
            sb.append(',');
            sb.append(this.f26896i);
            sb.append(')');
        }
        if (this.f26897j) {
            sb.append(" centerCrop");
        }
        if (this.f26899l) {
            sb.append(" centerInside");
        }
        if (this.f26901n != Utils.FLOAT_EPSILON) {
            sb.append(" rotation(");
            sb.append(this.f26901n);
            if (this.f26904q) {
                sb.append(" @ ");
                sb.append(this.f26902o);
                sb.append(',');
                sb.append(this.f26903p);
            }
            sb.append(')');
        }
        if (this.f26905r) {
            sb.append(" purgeable");
        }
        if (this.f26906s != null) {
            sb.append(' ');
            sb.append(this.f26906s);
        }
        sb.append('}');
        return sb.toString();
    }

    public C5450k(Uri uri, int i, String str, List<lw6> list, int i2, int i3, boolean z, boolean z2, int i4, boolean z3, float f, float f2, float f3, boolean z4, boolean z5, Bitmap.Config config, Picasso.Priority priority) {
        this.f26891d = uri;
        this.f26892e = i;
        this.f26893f = str;
        if (list == null) {
            this.f26894g = null;
        } else {
            this.f26894g = Collections.unmodifiableList(list);
        }
        this.f26895h = i2;
        this.f26896i = i3;
        this.f26897j = z;
        this.f26899l = z2;
        this.f26898k = i4;
        this.f26900m = z3;
        this.f26901n = f;
        this.f26902o = f2;
        this.f26903p = f3;
        this.f26904q = z4;
        this.f26905r = z5;
        this.f26906s = config;
        this.f26907t = priority;
    }
}
