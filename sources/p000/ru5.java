package p000;

import com.google.auto.value.AutoValue;
import p000.C6129jv;

@AutoValue
/* renamed from: ru5 */
/* compiled from: SendRequest */
public abstract class ru5 {

    @AutoValue.Builder
    /* renamed from: ru5$a */
    /* compiled from: SendRequest */
    public static abstract class C6457a {
        /* renamed from: a */
        public abstract ru5 mo44611a();

        /* renamed from: b */
        public abstract C6457a mo44612b(qp1 qp1);

        /* renamed from: c */
        public abstract C6457a mo44613c(gt1<?> gt1);

        /* renamed from: d */
        public abstract C6457a mo44614d(tw6<?, byte[]> tw6);

        /* renamed from: e */
        public abstract C6457a mo44615e(hx6 hx6);

        /* renamed from: f */
        public abstract C6457a mo44616f(String str);
    }

    /* renamed from: a */
    public static C6457a m51328a() {
        return new C6129jv.C6131b();
    }

    /* renamed from: b */
    public abstract qp1 mo44603b();

    /* renamed from: c */
    public abstract gt1<?> mo44604c();

    /* renamed from: d */
    public byte[] mo47506d() {
        return mo44605e().apply(mo44604c().mo29136b());
    }

    /* renamed from: e */
    public abstract tw6<?, byte[]> mo44605e();

    /* renamed from: f */
    public abstract hx6 mo44607f();

    /* renamed from: g */
    public abstract String mo44608g();
}
