package p000;

import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import com.google.auto.value.AutoValue;
import p000.C5850fv;

@AutoValue
/* renamed from: ik3 */
/* compiled from: LogEvent */
public abstract class ik3 {

    @AutoValue.Builder
    /* renamed from: ik3$a */
    /* compiled from: LogEvent */
    public static abstract class C5967a {
        /* renamed from: a */
        public abstract ik3 mo42672a();

        /* renamed from: b */
        public abstract C5967a mo42673b(Integer num);

        /* renamed from: c */
        public abstract C5967a mo42674c(long j);

        /* renamed from: d */
        public abstract C5967a mo42675d(long j);

        /* renamed from: e */
        public abstract C5967a mo42676e(NetworkConnectionInfo networkConnectionInfo);

        /* renamed from: f */
        public abstract C5967a mo42677f(byte[] bArr);

        /* renamed from: g */
        public abstract C5967a mo42678g(String str);

        /* renamed from: h */
        public abstract C5967a mo42679h(long j);
    }

    /* renamed from: a */
    public static C5967a m45745a() {
        return new C5850fv.C5852b();
    }

    /* renamed from: i */
    public static C5967a m45746i(String str) {
        return m45745a().mo42678g(str);
    }

    /* renamed from: j */
    public static C5967a m45747j(byte[] bArr) {
        return m45745a().mo42677f(bArr);
    }

    /* renamed from: b */
    public abstract Integer mo42662b();

    /* renamed from: c */
    public abstract long mo42663c();

    /* renamed from: d */
    public abstract long mo42664d();

    /* renamed from: e */
    public abstract NetworkConnectionInfo mo42665e();

    /* renamed from: f */
    public abstract byte[] mo42667f();

    /* renamed from: g */
    public abstract String mo42668g();

    /* renamed from: h */
    public abstract long mo42669h();
}
