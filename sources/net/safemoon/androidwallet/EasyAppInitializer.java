package net.safemoon.androidwallet;

import android.content.Context;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\n"}, mo44877d2 = {"Lnet/safemoon/androidwallet/EasyAppInitializer;", "Lao;", "Lhu0;", "b", "Lhu0;", "job", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: EasyAppInitializer.kt */
public final class EasyAppInitializer extends C6833ao {

    /* renamed from: b */
    public final hu0 f41178b;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    @v21(mo48631c = "net.safemoon.androidwallet.EasyAppInitializer$1", mo48632f = "EasyAppInitializer.kt", mo48633l = {}, mo48634m = "invokeSuspend")
    /* renamed from: net.safemoon.androidwallet.EasyAppInitializer$1 */
    /* compiled from: EasyAppInitializer.kt */
    public static final class C79961 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
        public int label;

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            return new C79961(ns0);
        }

        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
            return ((C79961) create(hu0, ns0)).invokeSuspend(r37.f33317a);
        }

        public final Object invokeSuspend(Object obj) {
            wx2.m54101d();
            if (this.label == 0) {
                hg5.m45199b(obj);
                return r37.f33317a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EasyAppInitializer(Context context) {
        super(context);
        vx2.m53591g(context, "context");
        hu0 a = iu0.m59111a(qh1.m71265b());
        this.f41178b = a;
        y23 unused = d50.m56748b(a, (CoroutineContext) null, (CoroutineStart) null, new C79961((ns0<? super C79961>) null), 3, (Object) null);
    }
}
