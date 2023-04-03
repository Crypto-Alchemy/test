package p000;

import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import java.util.Arrays;
import p000.ik3;

/* renamed from: fv */
/* compiled from: AutoValue_LogEvent */
public final class C5850fv extends ik3 {

    /* renamed from: a */
    public final long f28994a;

    /* renamed from: b */
    public final Integer f28995b;

    /* renamed from: c */
    public final long f28996c;

    /* renamed from: d */
    public final byte[] f28997d;

    /* renamed from: e */
    public final String f28998e;

    /* renamed from: f */
    public final long f28999f;

    /* renamed from: g */
    public final NetworkConnectionInfo f29000g;

    /* renamed from: fv$b */
    /* compiled from: AutoValue_LogEvent */
    public static final class C5852b extends ik3.C5967a {

        /* renamed from: a */
        public Long f29001a;

        /* renamed from: b */
        public Integer f29002b;

        /* renamed from: c */
        public Long f29003c;

        /* renamed from: d */
        public byte[] f29004d;

        /* renamed from: e */
        public String f29005e;

        /* renamed from: f */
        public Long f29006f;

        /* renamed from: g */
        public NetworkConnectionInfo f29007g;

        /* renamed from: a */
        public ik3 mo42672a() {
            String str = "";
            if (this.f29001a == null) {
                str = str + " eventTimeMs";
            }
            if (this.f29003c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f29006f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new C5850fv(this.f29001a.longValue(), this.f29002b, this.f29003c.longValue(), this.f29004d, this.f29005e, this.f29006f.longValue(), this.f29007g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public ik3.C5967a mo42673b(Integer num) {
            this.f29002b = num;
            return this;
        }

        /* renamed from: c */
        public ik3.C5967a mo42674c(long j) {
            this.f29001a = Long.valueOf(j);
            return this;
        }

        /* renamed from: d */
        public ik3.C5967a mo42675d(long j) {
            this.f29003c = Long.valueOf(j);
            return this;
        }

        /* renamed from: e */
        public ik3.C5967a mo42676e(NetworkConnectionInfo networkConnectionInfo) {
            this.f29007g = networkConnectionInfo;
            return this;
        }

        /* renamed from: f */
        public ik3.C5967a mo42677f(byte[] bArr) {
            this.f29004d = bArr;
            return this;
        }

        /* renamed from: g */
        public ik3.C5967a mo42678g(String str) {
            this.f29005e = str;
            return this;
        }

        /* renamed from: h */
        public ik3.C5967a mo42679h(long j) {
            this.f29006f = Long.valueOf(j);
            return this;
        }
    }

    /* renamed from: b */
    public Integer mo42662b() {
        return this.f28995b;
    }

    /* renamed from: c */
    public long mo42663c() {
        return this.f28994a;
    }

    /* renamed from: d */
    public long mo42664d() {
        return this.f28996c;
    }

    /* renamed from: e */
    public NetworkConnectionInfo mo42665e() {
        return this.f29000g;
    }

    public boolean equals(Object obj) {
        Integer num;
        byte[] bArr;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ik3)) {
            return false;
        }
        ik3 ik3 = (ik3) obj;
        if (this.f28994a == ik3.mo42663c() && ((num = this.f28995b) != null ? num.equals(ik3.mo42662b()) : ik3.mo42662b() == null) && this.f28996c == ik3.mo42664d()) {
            byte[] bArr2 = this.f28997d;
            if (ik3 instanceof C5850fv) {
                bArr = ((C5850fv) ik3).f28997d;
            } else {
                bArr = ik3.mo42667f();
            }
            if (Arrays.equals(bArr2, bArr) && ((str = this.f28998e) != null ? str.equals(ik3.mo42668g()) : ik3.mo42668g() == null) && this.f28999f == ik3.mo42669h()) {
                NetworkConnectionInfo networkConnectionInfo = this.f29000g;
                if (networkConnectionInfo == null) {
                    if (ik3.mo42665e() == null) {
                        return true;
                    }
                } else if (networkConnectionInfo.equals(ik3.mo42665e())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public byte[] mo42667f() {
        return this.f28997d;
    }

    /* renamed from: g */
    public String mo42668g() {
        return this.f28998e;
    }

    /* renamed from: h */
    public long mo42669h() {
        return this.f28999f;
    }

    public int hashCode() {
        int i;
        int i2;
        long j = this.f28994a;
        int i3 = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f28995b;
        int i4 = 0;
        if (num == null) {
            i = 0;
        } else {
            i = num.hashCode();
        }
        long j2 = this.f28996c;
        int hashCode = (((((i3 ^ i) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f28997d)) * 1000003;
        String str = this.f28998e;
        if (str == null) {
            i2 = 0;
        } else {
            i2 = str.hashCode();
        }
        long j3 = this.f28999f;
        int i5 = (((hashCode ^ i2) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        NetworkConnectionInfo networkConnectionInfo = this.f29000g;
        if (networkConnectionInfo != null) {
            i4 = networkConnectionInfo.hashCode();
        }
        return i5 ^ i4;
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f28994a + ", eventCode=" + this.f28995b + ", eventUptimeMs=" + this.f28996c + ", sourceExtension=" + Arrays.toString(this.f28997d) + ", sourceExtensionJsonProto3=" + this.f28998e + ", timezoneOffsetSeconds=" + this.f28999f + ", networkConnectionInfo=" + this.f29000g + "}";
    }

    public C5850fv(long j, Integer num, long j2, byte[] bArr, String str, long j3, NetworkConnectionInfo networkConnectionInfo) {
        this.f28994a = j;
        this.f28995b = num;
        this.f28996c = j2;
        this.f28997d = bArr;
        this.f28998e = str;
        this.f28999f = j3;
        this.f29000g = networkConnectionInfo;
    }
}
