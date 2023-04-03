package p000;

import androidx.lifecycle.LiveData;

/* renamed from: qw6 */
/* compiled from: Transformations */
public class qw6 {

    /* renamed from: qw6$a */
    /* compiled from: Transformations */
    public class C3174a implements pf4<X> {

        /* renamed from: a */
        public final /* synthetic */ ls3 f17081a;

        /* renamed from: b */
        public final /* synthetic */ sd2 f17082b;

        public C3174a(ls3 ls3, sd2 sd2) {
            this.f17081a = ls3;
            this.f17082b = sd2;
        }

        public void onChanged(X x) {
            this.f17081a.setValue(this.f17082b.apply(x));
        }
    }

    /* renamed from: qw6$b */
    /* compiled from: Transformations */
    public class C3175b implements pf4<X> {

        /* renamed from: a */
        public LiveData<Y> f17083a;

        /* renamed from: b */
        public final /* synthetic */ sd2 f17084b;

        /* renamed from: c */
        public final /* synthetic */ ls3 f17085c;

        /* renamed from: qw6$b$a */
        /* compiled from: Transformations */
        public class C3176a implements pf4<Y> {
            public C3176a() {
            }

            public void onChanged(Y y) {
                C3175b.this.f17085c.setValue(y);
            }
        }

        public C3175b(sd2 sd2, ls3 ls3) {
            this.f17084b = sd2;
            this.f17085c = ls3;
        }

        public void onChanged(X x) {
            LiveData<Y> liveData = (LiveData) this.f17084b.apply(x);
            LiveData<Y> liveData2 = this.f17083a;
            if (liveData2 != liveData) {
                if (liveData2 != null) {
                    this.f17085c.mo22952b(liveData2);
                }
                this.f17083a = liveData;
                if (liveData != null) {
                    this.f17085c.mo22951a(liveData, new C3176a());
                }
            }
        }
    }

    /* renamed from: qw6$c */
    /* compiled from: Transformations */
    public class C3177c implements pf4<X> {

        /* renamed from: a */
        public boolean f17087a = true;

        /* renamed from: b */
        public final /* synthetic */ ls3 f17088b;

        public C3177c(ls3 ls3) {
            this.f17088b = ls3;
        }

        public void onChanged(X x) {
            Object value = this.f17088b.getValue();
            if (this.f17087a || ((value == null && x != null) || (value != null && !value.equals(x)))) {
                this.f17087a = false;
                this.f17088b.setValue(x);
            }
        }
    }

    /* renamed from: a */
    public static <X> LiveData<X> m25941a(LiveData<X> liveData) {
        ls3 ls3 = new ls3();
        ls3.mo22951a(liveData, new C3177c(ls3));
        return ls3;
    }

    /* renamed from: b */
    public static <X, Y> LiveData<Y> m25942b(LiveData<X> liveData, sd2<X, Y> sd2) {
        ls3 ls3 = new ls3();
        ls3.mo22951a(liveData, new C3174a(ls3, sd2));
        return ls3;
    }

    /* renamed from: c */
    public static <X, Y> LiveData<Y> m25943c(LiveData<X> liveData, sd2<X, LiveData<Y>> sd2) {
        ls3 ls3 = new ls3();
        ls3.mo22951a(liveData, new C3175b(sd2, ls3));
        return ls3;
    }
}
