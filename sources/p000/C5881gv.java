package p000;

import com.google.android.datatransport.cct.internal.ClientInfo;
import com.google.android.datatransport.cct.internal.QosTier;
import java.util.List;
import p000.mk3;

/* renamed from: gv */
/* compiled from: AutoValue_LogRequest */
public final class C5881gv extends mk3 {

    /* renamed from: a */
    public final long f29360a;

    /* renamed from: b */
    public final long f29361b;

    /* renamed from: c */
    public final ClientInfo f29362c;

    /* renamed from: d */
    public final Integer f29363d;

    /* renamed from: e */
    public final String f29364e;

    /* renamed from: f */
    public final List<ik3> f29365f;

    /* renamed from: g */
    public final QosTier f29366g;

    /* renamed from: gv$b */
    /* compiled from: AutoValue_LogRequest */
    public static final class C5883b extends mk3.C6252a {

        /* renamed from: a */
        public Long f29367a;

        /* renamed from: b */
        public Long f29368b;

        /* renamed from: c */
        public ClientInfo f29369c;

        /* renamed from: d */
        public Integer f29370d;

        /* renamed from: e */
        public String f29371e;

        /* renamed from: f */
        public List<ik3> f29372f;

        /* renamed from: g */
        public QosTier f29373g;

        /* renamed from: a */
        public mk3 mo43004a() {
            String str = "";
            if (this.f29367a == null) {
                str = str + " requestTimeMs";
            }
            if (this.f29368b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new C5881gv(this.f29367a.longValue(), this.f29368b.longValue(), this.f29369c, this.f29370d, this.f29371e, this.f29372f, this.f29373g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public mk3.C6252a mo43005b(ClientInfo clientInfo) {
            this.f29369c = clientInfo;
            return this;
        }

        /* renamed from: c */
        public mk3.C6252a mo43006c(List<ik3> list) {
            this.f29372f = list;
            return this;
        }

        /* renamed from: d */
        public mk3.C6252a mo43007d(Integer num) {
            this.f29370d = num;
            return this;
        }

        /* renamed from: e */
        public mk3.C6252a mo43008e(String str) {
            this.f29371e = str;
            return this;
        }

        /* renamed from: f */
        public mk3.C6252a mo43009f(QosTier qosTier) {
            this.f29373g = qosTier;
            return this;
        }

        /* renamed from: g */
        public mk3.C6252a mo43010g(long j) {
            this.f29367a = Long.valueOf(j);
            return this;
        }

        /* renamed from: h */
        public mk3.C6252a mo43011h(long j) {
            this.f29368b = Long.valueOf(j);
            return this;
        }
    }

    /* renamed from: b */
    public ClientInfo mo42994b() {
        return this.f29362c;
    }

    /* renamed from: c */
    public List<ik3> mo42995c() {
        return this.f29365f;
    }

    /* renamed from: d */
    public Integer mo42996d() {
        return this.f29363d;
    }

    /* renamed from: e */
    public String mo42997e() {
        return this.f29364e;
    }

    public boolean equals(Object obj) {
        ClientInfo clientInfo;
        Integer num;
        String str;
        List<ik3> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mk3)) {
            return false;
        }
        mk3 mk3 = (mk3) obj;
        if (this.f29360a == mk3.mo43000g() && this.f29361b == mk3.mo43001h() && ((clientInfo = this.f29362c) != null ? clientInfo.equals(mk3.mo42994b()) : mk3.mo42994b() == null) && ((num = this.f29363d) != null ? num.equals(mk3.mo42996d()) : mk3.mo42996d() == null) && ((str = this.f29364e) != null ? str.equals(mk3.mo42997e()) : mk3.mo42997e() == null) && ((list = this.f29365f) != null ? list.equals(mk3.mo42995c()) : mk3.mo42995c() == null)) {
            QosTier qosTier = this.f29366g;
            if (qosTier == null) {
                if (mk3.mo42999f() == null) {
                    return true;
                }
            } else if (qosTier.equals(mk3.mo42999f())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public QosTier mo42999f() {
        return this.f29366g;
    }

    /* renamed from: g */
    public long mo43000g() {
        return this.f29360a;
    }

    /* renamed from: h */
    public long mo43001h() {
        return this.f29361b;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        long j = this.f29360a;
        long j2 = this.f29361b;
        int i5 = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        ClientInfo clientInfo = this.f29362c;
        int i6 = 0;
        if (clientInfo == null) {
            i = 0;
        } else {
            i = clientInfo.hashCode();
        }
        int i7 = (i5 ^ i) * 1000003;
        Integer num = this.f29363d;
        if (num == null) {
            i2 = 0;
        } else {
            i2 = num.hashCode();
        }
        int i8 = (i7 ^ i2) * 1000003;
        String str = this.f29364e;
        if (str == null) {
            i3 = 0;
        } else {
            i3 = str.hashCode();
        }
        int i9 = (i8 ^ i3) * 1000003;
        List<ik3> list = this.f29365f;
        if (list == null) {
            i4 = 0;
        } else {
            i4 = list.hashCode();
        }
        int i10 = (i9 ^ i4) * 1000003;
        QosTier qosTier = this.f29366g;
        if (qosTier != null) {
            i6 = qosTier.hashCode();
        }
        return i10 ^ i6;
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f29360a + ", requestUptimeMs=" + this.f29361b + ", clientInfo=" + this.f29362c + ", logSource=" + this.f29363d + ", logSourceName=" + this.f29364e + ", logEvents=" + this.f29365f + ", qosTier=" + this.f29366g + "}";
    }

    public C5881gv(long j, long j2, ClientInfo clientInfo, Integer num, String str, List<ik3> list, QosTier qosTier) {
        this.f29360a = j;
        this.f29361b = j2;
        this.f29362c = clientInfo;
        this.f29363d = num;
        this.f29364e = str;
        this.f29365f = list;
        this.f29366g = qosTier;
    }
}
