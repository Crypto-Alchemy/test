package p000;

import com.google.auto.value.AutoValue;
import com.google.mlkit.common.MlKitException;
import p000.C5716cv;

@AutoValue
/* renamed from: eu1 */
/* compiled from: EventStoreConfig */
public abstract class eu1 {

    /* renamed from: a */
    public static final eu1 f28672a = m44073a().mo41734f(10485760).mo41732d(MlKitException.CODE_SCANNER_UNAVAILABLE).mo41730b(10000).mo41731c(604800000).mo41733e(81920).mo41729a();

    @AutoValue.Builder
    /* renamed from: eu1$a */
    /* compiled from: EventStoreConfig */
    public static abstract class C5819a {
        /* renamed from: a */
        public abstract eu1 mo41729a();

        /* renamed from: b */
        public abstract C5819a mo41730b(int i);

        /* renamed from: c */
        public abstract C5819a mo41731c(long j);

        /* renamed from: d */
        public abstract C5819a mo41732d(int i);

        /* renamed from: e */
        public abstract C5819a mo41733e(int i);

        /* renamed from: f */
        public abstract C5819a mo41734f(long j);
    }

    /* renamed from: a */
    public static C5819a m44073a() {
        return new C5716cv.C5718b();
    }

    /* renamed from: b */
    public abstract int mo41721b();

    /* renamed from: c */
    public abstract long mo41722c();

    /* renamed from: d */
    public abstract int mo41723d();

    /* renamed from: e */
    public abstract int mo41724e();

    /* renamed from: f */
    public abstract long mo41726f();
}
