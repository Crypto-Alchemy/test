package p000;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: fx */
/* compiled from: BandwidthMeter */
public interface C2332fx {

    /* renamed from: fx$a */
    /* compiled from: BandwidthMeter */
    public interface C2333a {

        /* renamed from: fx$a$a */
        /* compiled from: BandwidthMeter */
        public static final class C2334a {

            /* renamed from: a */
            public final CopyOnWriteArrayList<C2335a> f12100a = new CopyOnWriteArrayList<>();

            /* renamed from: fx$a$a$a */
            /* compiled from: BandwidthMeter */
            public static final class C2335a {

                /* renamed from: a */
                public final Handler f12101a;

                /* renamed from: b */
                public final C2333a f12102b;

                /* renamed from: c */
                public boolean f12103c;

                public C2335a(Handler handler, C2333a aVar) {
                    this.f12101a = handler;
                    this.f12102b = aVar;
                }

                /* renamed from: d */
                public void mo20263d() {
                    this.f12103c = true;
                }
            }

            /* renamed from: b */
            public void mo20260b(Handler handler, C2333a aVar) {
                C2725kr.m20985e(handler);
                C2725kr.m20985e(aVar);
                mo20262e(aVar);
                this.f12100a.add(new C2335a(handler, aVar));
            }

            /* renamed from: c */
            public void mo20261c(int i, long j, long j2) {
                Iterator<C2335a> it = this.f12100a.iterator();
                while (it.hasNext()) {
                    C2335a next = it.next();
                    if (!next.f12103c) {
                        next.f12101a.post(new C2251ex(next, i, j, j2));
                    }
                }
            }

            /* renamed from: e */
            public void mo20262e(C2333a aVar) {
                Iterator<C2335a> it = this.f12100a.iterator();
                while (it.hasNext()) {
                    C2335a next = it.next();
                    if (next.f12102b == aVar) {
                        next.mo20263d();
                        this.f12100a.remove(next);
                    }
                }
            }
        }

        /* renamed from: p */
        void mo19152p(int i, long j, long j2);
    }

    /* renamed from: a */
    long mo20255a();

    /* renamed from: d */
    ov6 mo20256d();

    /* renamed from: e */
    long mo20257e();

    /* renamed from: h */
    void mo20258h(Handler handler, C2333a aVar);

    /* renamed from: i */
    void mo20259i(C2333a aVar);
}
