package androidx.work;

import androidx.work.ListenableWorker;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 5, 1})
@v21(mo48631c = "androidx.work.CoroutineWorker$startWork$1", mo48632f = "CoroutineWorker.kt", mo48633l = {68}, mo48634m = "invokeSuspend")
/* compiled from: CoroutineWorker.kt */
public final class CoroutineWorker$startWork$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public int label;
    public final /* synthetic */ CoroutineWorker this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoroutineWorker$startWork$1(CoroutineWorker coroutineWorker, ns0<? super CoroutineWorker$startWork$1> ns0) {
        super(2, ns0);
        this.this$0 = coroutineWorker;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new CoroutineWorker$startWork$1(this.this$0, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((CoroutineWorker$startWork$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            CoroutineWorker coroutineWorker = this.this$0;
            this.label = 1;
            obj = coroutineWorker.mo10853r(this);
            if (obj == d) {
                return d;
            }
        } else if (i == 1) {
            try {
                hg5.m45199b(obj);
            } catch (Throwable th) {
                this.this$0.mo10856v().mo11045q(th);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.this$0.mo10856v().mo11044p((ListenableWorker.C1509a) obj);
        return r37.f33317a;
    }
}
