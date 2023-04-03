package p000;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.kg3;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u000bB5\b\u0000\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dB\u001b\b\u0010\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010 B\u0013\b\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010!J$\u0010\u0006\u001a\u00020\u00012\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0004\"\u00020\u0001H\u0001¢\u0006\u0004\b\u0006\u0010\u0007J9\u0010\u000b\u001a\u00020\n2.\u0010\t\u001a*\u0012\u000e\b\u0000\u0012\n \b*\u0004\u0018\u00010\u00030\u0003 \b*\u0014\u0012\u000e\b\u0000\u0012\n \b*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u0002H\u0001J\u0019\u0010\f\u001a\u00020\n2\u000e\u0010\t\u001a\n \b*\u0004\u0018\u00010\u00030\u0003H\u0001J\u0019\u0010\u000e\u001a\u00020\n2\u000e\u0010\t\u001a\n \b*\u0004\u0018\u00010\r0\rH\u0001J\b\u0010\u000f\u001a\u00020\nH\u0016J\u0012\u0010\u0012\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014¨\u0006\""}, mo44877d2 = {"Lyg3;", "Lkg3;", "Lnc6;", "Lkg3$a;", "", "others", "f", "([Lkg3;)Lkg3;", "kotlin.jvm.PlatformType", "p0", "Lr37;", "a", "g", "Lpc6;", "onSubscribe", "onComplete", "", "t", "onError", "Lv52;", "Lv52;", "upstreamProcessor", "d", "downstreamProcessor", "", "throttleDurationMillis", "Lnm5;", "throttleScheduler", "<init>", "(Lv52;Lv52;JLnm5;)V", "throttleTimeoutMillis", "scheduler", "(JLnm5;)V", "(J)V", "scarlet"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* renamed from: yg3 */
/* compiled from: LifecycleRegistry.kt */
public final class yg3 implements kg3, nc6<kg3.C6147a> {

    /* renamed from: a */
    public final v52<kg3.C6147a> f35876a;

    /* renamed from: d */
    public final v52<kg3.C6147a> f35877d;

    /* renamed from: e */
    public final /* synthetic */ t52 f35878e;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016¨\u0006\f"}, mo44877d2 = {"Lyg3$a;", "Lbi1;", "Lkg3$a;", "state", "Lr37;", "d", "", "throwable", "onError", "onComplete", "<init>", "(Lyg3;)V", "scarlet"}, mo44878k = 1, mo44879mv = {1, 5, 1})
    /* renamed from: yg3$a */
    /* compiled from: LifecycleRegistry.kt */
    public final class C6736a extends bi1<kg3.C6147a> {

        /* renamed from: d */
        public final /* synthetic */ yg3 f35879d;

        public C6736a(yg3 yg3) {
            vx2.m53591g(yg3, "this$0");
            this.f35879d = yg3;
        }

        /* renamed from: d */
        public void onNext(kg3.C6147a aVar) {
            vx2.m53591g(aVar, "state");
            this.f35879d.f35877d.onNext(aVar);
            if (vx2.m53586b(aVar, kg3.C6147a.C6148a.f30870a)) {
                this.f35879d.f35877d.onComplete();
                dispose();
            }
        }

        public void onComplete() {
            throw new IllegalStateException("Stream is terminated");
        }

        public void onError(Throwable th) {
            vx2.m53591g(th, "throwable");
            throw new IllegalStateException("Stream is terminated", th);
        }
    }

    public yg3(v52<kg3.C6147a> v52, v52<kg3.C6147a> v522, long j, nm5 nm5) {
        vx2.m53591g(v52, "upstreamProcessor");
        vx2.m53591g(v522, "downstreamProcessor");
        vx2.m53591g(nm5, "throttleScheduler");
        this.f35876a = v52;
        this.f35877d = v522;
        g52<kg3.C6147a> I = v522.mo42758I();
        vx2.m53590f(I, "downstreamProcessor.onBackpressureLatest()");
        this.f35878e = new t52(I, nm5);
        v52.mo42758I().mo42769m(new wg3()).mo42767g(new xg3(j, nm5)).mo42769m(new wg3()).mo42759J(new C6736a(this));
    }

    /* renamed from: d */
    public static final vy4 m54746d(long j, nm5 nm5, g52 g52) {
        vx2.m53591g(nm5, "$throttleScheduler");
        vx2.m53591g(g52, "it");
        if (j != 0) {
            return g52.mo42763N(j, TimeUnit.MILLISECONDS, nm5);
        }
        return g52;
    }

    /* renamed from: a */
    public void mo40232a(nc6<? super kg3.C6147a> nc6) {
        this.f35878e.mo40232a(nc6);
    }

    /* renamed from: f */
    public kg3 mo49646f(kg3... kg3Arr) {
        vx2.m53591g(kg3Arr, "others");
        return this.f35878e.mo47992c(kg3Arr);
    }

    /* renamed from: g */
    public void onNext(kg3.C6147a aVar) {
        this.f35876a.onNext(aVar);
    }

    public void onComplete() {
        this.f35876a.onNext(kg3.C6147a.C6148a.f30870a);
    }

    public void onError(Throwable th) {
        this.f35876a.onNext(kg3.C6147a.C6148a.f30870a);
    }

    public void onSubscribe(pc6 pc6) {
        this.f35876a.onSubscribe(pc6);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public yg3(long r8, p000.nm5 r10) {
        /*
            r7 = this;
            java.lang.String r0 = "scheduler"
            p000.vx2.m53591g(r10, r0)
            io.reactivex.processors.PublishProcessor r2 = p018io.reactivex.processors.PublishProcessor.m45884T()
            java.lang.String r0 = "create()"
            p000.vx2.m53590f(r2, r0)
            io.reactivex.processors.BehaviorProcessor r3 = p018io.reactivex.processors.BehaviorProcessor.m45878T()
            p000.vx2.m53590f(r3, r0)
            r1 = r7
            r4 = r8
            r6 = r10
            r1.<init>(r2, r3, r4, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.yg3.<init>(long, nm5):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yg3(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : j);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public yg3(long r3) {
        /*
            r2 = this;
            nm5 r0 = p000.sm5.m51860a()
            java.lang.String r1 = "computation()"
            p000.vx2.m53590f(r0, r1)
            r2.<init>(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.yg3.<init>(long):void");
    }
}
