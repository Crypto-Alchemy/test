package p000;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.web3j.ens.contracts.generated.ENS;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u0012*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\rB\u0007¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0005H\u0017J\u0019\u0010\n\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00018\u0000H\u0017¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0013"}, mo44877d2 = {"Lj36;", "T", "Lk04;", "Lug3;", "owner", "Lpf4;", "observer", "Lr37;", "observe", "t", "setValue", "(Ljava/lang/Object;)V", "Ljava/util/concurrent/atomic/AtomicBoolean;", "a", "Ljava/util/concurrent/atomic/AtomicBoolean;", "mPending", "<init>", "()V", "b", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: j36 */
/* compiled from: SingleLiveEvent.kt */
public final class j36<T> extends k04<T> {

    /* renamed from: b */
    public static final C7241a f38583b = new C7241a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final String f38584c = "SingleLiveEvent";

    /* renamed from: a */
    public final AtomicBoolean f38585a = new AtomicBoolean(false);

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002XD¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, mo44877d2 = {"Lj36$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: j36$a */
    /* compiled from: SingleLiveEvent.kt */
    public static final class C7241a {
        public C7241a() {
        }

        public /* synthetic */ C7241a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo44877d2 = {"j36$b", "Lpf4;", "t", "Lr37;", "onChanged", "(Ljava/lang/Object;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: j36$b */
    /* compiled from: SingleLiveEvent.kt */
    public static final class C7242b implements pf4<T> {

        /* renamed from: a */
        public final /* synthetic */ j36<T> f38586a;

        /* renamed from: b */
        public final /* synthetic */ pf4<? super T> f38587b;

        public C7242b(j36<T> j36, pf4<? super T> pf4) {
            this.f38586a = j36;
            this.f38587b = pf4;
        }

        public void onChanged(T t) {
            if (this.f38586a.f38585a.compareAndSet(true, false)) {
                this.f38587b.onChanged(t);
            }
        }
    }

    public void observe(ug3 ug3, pf4<? super T> pf4) {
        vx2.m53591g(ug3, ENS.FUNC_OWNER);
        vx2.m53591g(pf4, "observer");
        hasActiveObservers();
        super.observe(ug3, new C7242b(this, pf4));
    }

    public void setValue(T t) {
        this.f38585a.set(true);
        super.setValue(t);
    }
}
