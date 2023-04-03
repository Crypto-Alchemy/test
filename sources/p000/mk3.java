package p000;

import com.google.android.datatransport.cct.internal.ClientInfo;
import com.google.android.datatransport.cct.internal.QosTier;
import com.google.auto.value.AutoValue;
import java.util.List;
import p000.C5881gv;

@AutoValue
/* renamed from: mk3 */
/* compiled from: LogRequest */
public abstract class mk3 {

    @AutoValue.Builder
    /* renamed from: mk3$a */
    /* compiled from: LogRequest */
    public static abstract class C6252a {
        /* renamed from: a */
        public abstract mk3 mo43004a();

        /* renamed from: b */
        public abstract C6252a mo43005b(ClientInfo clientInfo);

        /* renamed from: c */
        public abstract C6252a mo43006c(List<ik3> list);

        /* renamed from: d */
        public abstract C6252a mo43007d(Integer num);

        /* renamed from: e */
        public abstract C6252a mo43008e(String str);

        /* renamed from: f */
        public abstract C6252a mo43009f(QosTier qosTier);

        /* renamed from: g */
        public abstract C6252a mo43010g(long j);

        /* renamed from: h */
        public abstract C6252a mo43011h(long j);

        /* renamed from: i */
        public C6252a mo45805i(int i) {
            return mo43007d(Integer.valueOf(i));
        }

        /* renamed from: j */
        public C6252a mo45806j(String str) {
            return mo43008e(str);
        }
    }

    /* renamed from: a */
    public static C6252a m48333a() {
        return new C5881gv.C5883b();
    }

    /* renamed from: b */
    public abstract ClientInfo mo42994b();

    /* renamed from: c */
    public abstract List<ik3> mo42995c();

    /* renamed from: d */
    public abstract Integer mo42996d();

    /* renamed from: e */
    public abstract String mo42997e();

    /* renamed from: f */
    public abstract QosTier mo42999f();

    /* renamed from: g */
    public abstract long mo43000g();

    /* renamed from: h */
    public abstract long mo43001h();
}
