package net.safemoon.androidwallet.domain.useCase.wipe;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.domain.useCase.wipe.AsyncWipeDataUseCase$execute$1", mo48632f = "AsyncWipeDataUseCase.kt", mo48633l = {14}, mo48634m = "invokeSuspend")
/* compiled from: AsyncWipeDataUseCase.kt */
public final class AsyncWipeDataUseCase$execute$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public int label;
    public final /* synthetic */ AsyncWipeDataUseCase this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    @v21(mo48631c = "net.safemoon.androidwallet.domain.useCase.wipe.AsyncWipeDataUseCase$execute$1$1", mo48632f = "AsyncWipeDataUseCase.kt", mo48633l = {}, mo48634m = "invokeSuspend")
    /* renamed from: net.safemoon.androidwallet.domain.useCase.wipe.AsyncWipeDataUseCase$execute$1$1 */
    /* compiled from: AsyncWipeDataUseCase.kt */
    public static final class C83441 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
        public int label;

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            return new C83441(asyncWipeDataUseCase, ns0);
        }

        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
            return ((C83441) create(hu0, ns0)).invokeSuspend(r37.f33317a);
        }

        public final Object invokeSuspend(Object obj) {
            wx2.m54101d();
            if (this.label == 0) {
                hg5.m45199b(obj);
                asyncWipeDataUseCase.f41855a.execute();
                return r37.f33317a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AsyncWipeDataUseCase$execute$1(AsyncWipeDataUseCase asyncWipeDataUseCase, ns0<? super AsyncWipeDataUseCase$execute$1> ns0) {
        super(2, ns0);
        this.this$0 = asyncWipeDataUseCase;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new AsyncWipeDataUseCase$execute$1(this.this$0, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((AsyncWipeDataUseCase$execute$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            CoroutineDispatcher b = qh1.m71265b();
            final AsyncWipeDataUseCase asyncWipeDataUseCase = this.this$0;
            C83441 r1 = new C83441((ns0<? super C83441>) null);
            this.label = 1;
            if (b50.m55768e(b, r1, this) == d) {
                return d;
            }
        } else if (i == 1) {
            hg5.m45199b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return r37.f33317a;
    }
}
