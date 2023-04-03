package p000;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: d21 */
/* compiled from: DataSpec */
public final class d21 {

    /* renamed from: a */
    public final Uri f10437a;

    /* renamed from: b */
    public final long f10438b;

    /* renamed from: c */
    public final int f10439c;

    /* renamed from: d */
    public final byte[] f10440d;

    /* renamed from: e */
    public final Map<String, String> f10441e;
    @Deprecated

    /* renamed from: f */
    public final long f10442f;

    /* renamed from: g */
    public final long f10443g;

    /* renamed from: h */
    public final long f10444h;

    /* renamed from: i */
    public final String f10445i;

    /* renamed from: j */
    public final int f10446j;

    /* renamed from: k */
    public final Object f10447k;

    /* renamed from: d21$b */
    /* compiled from: DataSpec */
    public static final class C2129b {

        /* renamed from: a */
        public Uri f10448a;

        /* renamed from: b */
        public long f10449b;

        /* renamed from: c */
        public int f10450c;

        /* renamed from: d */
        public byte[] f10451d;

        /* renamed from: e */
        public Map<String, String> f10452e;

        /* renamed from: f */
        public long f10453f;

        /* renamed from: g */
        public long f10454g;

        /* renamed from: h */
        public String f10455h;

        /* renamed from: i */
        public int f10456i;

        /* renamed from: j */
        public Object f10457j;

        /* renamed from: a */
        public d21 mo18403a() {
            C2725kr.m20990j(this.f10448a, "The uri must be set.");
            return new d21(this.f10448a, this.f10449b, this.f10450c, this.f10451d, this.f10452e, this.f10453f, this.f10454g, this.f10455h, this.f10456i, this.f10457j);
        }

        /* renamed from: b */
        public C2129b mo18404b(int i) {
            this.f10456i = i;
            return this;
        }

        /* renamed from: c */
        public C2129b mo18405c(byte[] bArr) {
            this.f10451d = bArr;
            return this;
        }

        /* renamed from: d */
        public C2129b mo18406d(int i) {
            this.f10450c = i;
            return this;
        }

        /* renamed from: e */
        public C2129b mo18407e(Map<String, String> map) {
            this.f10452e = map;
            return this;
        }

        /* renamed from: f */
        public C2129b mo18408f(String str) {
            this.f10455h = str;
            return this;
        }

        /* renamed from: g */
        public C2129b mo18409g(long j) {
            this.f10454g = j;
            return this;
        }

        /* renamed from: h */
        public C2129b mo18410h(long j) {
            this.f10453f = j;
            return this;
        }

        /* renamed from: i */
        public C2129b mo18411i(Uri uri) {
            this.f10448a = uri;
            return this;
        }

        /* renamed from: j */
        public C2129b mo18412j(String str) {
            this.f10448a = Uri.parse(str);
            return this;
        }

        public C2129b() {
            this.f10450c = 1;
            this.f10452e = Collections.emptyMap();
            this.f10454g = -1;
        }

        public C2129b(d21 d21) {
            this.f10448a = d21.f10437a;
            this.f10449b = d21.f10438b;
            this.f10450c = d21.f10439c;
            this.f10451d = d21.f10440d;
            this.f10452e = d21.f10441e;
            this.f10453f = d21.f10443g;
            this.f10454g = d21.f10444h;
            this.f10455h = d21.f10445i;
            this.f10456i = d21.f10446j;
            this.f10457j = d21.f10447k;
        }
    }

    static {
        ir3.m19787a("media3.datasource");
    }

    /* renamed from: c */
    public static String m14663c(int i) {
        if (i == 1) {
            return "GET";
        }
        if (i == 2) {
            return "POST";
        }
        if (i == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public C2129b mo18397a() {
        return new C2129b();
    }

    /* renamed from: b */
    public final String mo18398b() {
        return m14663c(this.f10439c);
    }

    /* renamed from: d */
    public boolean mo18399d(int i) {
        if ((this.f10446j & i) == i) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public d21 mo18400e(long j) {
        long j2 = this.f10444h;
        long j3 = -1;
        if (j2 != -1) {
            j3 = j2 - j;
        }
        return mo18401f(j, j3);
    }

    /* renamed from: f */
    public d21 mo18401f(long j, long j2) {
        if (j == 0 && this.f10444h == j2) {
            return this;
        }
        return new d21(this.f10437a, this.f10438b, this.f10439c, this.f10440d, this.f10441e, this.f10443g + j, j2, this.f10445i, this.f10446j, this.f10447k);
    }

    public String toString() {
        return "DataSpec[" + mo18398b() + " " + this.f10437a + ", " + this.f10443g + ", " + this.f10444h + ", " + this.f10445i + ", " + this.f10446j + "]";
    }

    public d21(Uri uri, long j, int i, byte[] bArr, Map<String, String> map, long j2, long j3, String str, int i2, Object obj) {
        long j4 = j;
        byte[] bArr2 = bArr;
        long j5 = j2;
        long j6 = j3;
        long j7 = j4 + j5;
        boolean z = true;
        C2725kr.m20981a(j7 >= 0);
        C2725kr.m20981a(j5 >= 0);
        if (j6 <= 0 && j6 != -1) {
            z = false;
        }
        C2725kr.m20981a(z);
        this.f10437a = uri;
        this.f10438b = j4;
        this.f10439c = i;
        this.f10440d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f10441e = Collections.unmodifiableMap(new HashMap(map));
        this.f10443g = j5;
        this.f10442f = j7;
        this.f10444h = j6;
        this.f10445i = str;
        this.f10446j = i2;
        this.f10447k = obj;
    }
}
