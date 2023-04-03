package androidx.media3.common;

import android.media.AudioAttributes;
import android.os.Bundle;
import androidx.media3.common.C0785d;

/* renamed from: androidx.media3.common.b */
/* compiled from: AudioAttributes */
public final class C0778b implements C0785d {

    /* renamed from: s */
    public static final C0778b f4142s = new C0783e().mo6589a();

    /* renamed from: x */
    public static final C0785d.C0786a<C0778b> f4143x = new C2851ms();

    /* renamed from: a */
    public final int f4144a;

    /* renamed from: d */
    public final int f4145d;

    /* renamed from: e */
    public final int f4146e;

    /* renamed from: g */
    public final int f4147g;

    /* renamed from: k */
    public final int f4148k;

    /* renamed from: r */
    public C0782d f4149r;

    /* renamed from: androidx.media3.common.b$b */
    /* compiled from: AudioAttributes */
    public static final class C0780b {
        /* renamed from: a */
        public static void m5295a(AudioAttributes.Builder builder, int i) {
            AudioAttributes.Builder unused = builder.setAllowedCapturePolicy(i);
        }
    }

    /* renamed from: androidx.media3.common.b$c */
    /* compiled from: AudioAttributes */
    public static final class C0781c {
        /* renamed from: a */
        public static void m5296a(AudioAttributes.Builder builder, int i) {
            builder.setSpatializationBehavior(i);
        }
    }

    /* renamed from: androidx.media3.common.b$d */
    /* compiled from: AudioAttributes */
    public static final class C0782d {

        /* renamed from: a */
        public final AudioAttributes f4150a;

        public C0782d(C0778b bVar) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(bVar.f4144a).setFlags(bVar.f4145d).setUsage(bVar.f4146e);
            int i = w67.f19021a;
            if (i >= 29) {
                C0780b.m5295a(usage, bVar.f4147g);
            }
            if (i >= 32) {
                C0781c.m5296a(usage, bVar.f4148k);
            }
            this.f4150a = usage.build();
        }
    }

    /* renamed from: androidx.media3.common.b$e */
    /* compiled from: AudioAttributes */
    public static final class C0783e {

        /* renamed from: a */
        public int f4151a = 0;

        /* renamed from: b */
        public int f4152b = 0;

        /* renamed from: c */
        public int f4153c = 1;

        /* renamed from: d */
        public int f4154d = 1;

        /* renamed from: e */
        public int f4155e = 0;

        /* renamed from: a */
        public C0778b mo6589a() {
            return new C0778b(this.f4151a, this.f4152b, this.f4153c, this.f4154d, this.f4155e);
        }

        /* renamed from: b */
        public C0783e mo6590b(int i) {
            this.f4154d = i;
            return this;
        }

        /* renamed from: c */
        public C0783e mo6591c(int i) {
            this.f4151a = i;
            return this;
        }

        /* renamed from: d */
        public C0783e mo6592d(int i) {
            this.f4152b = i;
            return this;
        }

        /* renamed from: e */
        public C0783e mo6593e(int i) {
            this.f4155e = i;
            return this;
        }

        /* renamed from: f */
        public C0783e mo6594f(int i) {
            this.f4153c = i;
            return this;
        }
    }

    /* renamed from: c */
    public static String m5292c(int i) {
        return Integer.toString(i, 36);
    }

    /* renamed from: d */
    public static /* synthetic */ C0778b m5293d(Bundle bundle) {
        C0783e eVar = new C0783e();
        if (bundle.containsKey(m5292c(0))) {
            eVar.mo6591c(bundle.getInt(m5292c(0)));
        }
        if (bundle.containsKey(m5292c(1))) {
            eVar.mo6592d(bundle.getInt(m5292c(1)));
        }
        if (bundle.containsKey(m5292c(2))) {
            eVar.mo6594f(bundle.getInt(m5292c(2)));
        }
        if (bundle.containsKey(m5292c(3))) {
            eVar.mo6590b(bundle.getInt(m5292c(3)));
        }
        if (bundle.containsKey(m5292c(4))) {
            eVar.mo6593e(bundle.getInt(m5292c(4)));
        }
        return eVar.mo6589a();
    }

    /* renamed from: b */
    public C0782d mo6586b() {
        if (this.f4149r == null) {
            this.f4149r = new C0782d();
        }
        return this.f4149r;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0778b.class != obj.getClass()) {
            return false;
        }
        C0778b bVar = (C0778b) obj;
        if (this.f4144a == bVar.f4144a && this.f4145d == bVar.f4145d && this.f4146e == bVar.f4146e && this.f4147g == bVar.f4147g && this.f4148k == bVar.f4148k) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + this.f4144a) * 31) + this.f4145d) * 31) + this.f4146e) * 31) + this.f4147g) * 31) + this.f4148k;
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(m5292c(0), this.f4144a);
        bundle.putInt(m5292c(1), this.f4145d);
        bundle.putInt(m5292c(2), this.f4146e);
        bundle.putInt(m5292c(3), this.f4147g);
        bundle.putInt(m5292c(4), this.f4148k);
        return bundle;
    }

    public C0778b(int i, int i2, int i3, int i4, int i5) {
        this.f4144a = i;
        this.f4145d = i2;
        this.f4146e = i3;
        this.f4147g = i4;
        this.f4148k = i5;
    }
}
