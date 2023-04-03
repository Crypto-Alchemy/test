package net.safemoon.androidwallet.extension;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.extension.ThreadExtension$wrapAsync$1", mo48632f = "ThreadExtension.kt", mo48633l = {12}, mo48634m = "invokeSuspend")
/* compiled from: ThreadExtension.kt */
public final class ThreadExtension$wrapAsync$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ fd2<hu0, ns0<? super r37>, Object> $block;
    public int label;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    @v21(mo48631c = "net.safemoon.androidwallet.extension.ThreadExtension$wrapAsync$1$1", mo48632f = "ThreadExtension.kt", mo48633l = {13}, mo48634m = "invokeSuspend")
    /* renamed from: net.safemoon.androidwallet.extension.ThreadExtension$wrapAsync$1$1 */
    /* compiled from: ThreadExtension.kt */
    public static final class C83451 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
        private /* synthetic */ Object L$0;
        public int label;

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            C83451 r0 = new C83451(fd2, ns0);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
            return ((C83451) create(hu0, ns0)).invokeSuspend(r37.f33317a);
        }

        public final Object invokeSuspend(Object obj) {
            Object d = wx2.m54101d();
            int i = this.label;
            if (i == 0) {
                hg5.m45199b(obj);
                fd2<hu0, ns0<? super r37>, Object> fd2 = fd2;
                this.label = 1;
                if (fd2.invoke((hu0) this.L$0, this) == d) {
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ThreadExtension$wrapAsync$1(fd2<? super hu0, ? super ns0<? super r37>, ? extends Object> fd2, ns0<? super ThreadExtension$wrapAsync$1> ns0) {
        super(2, ns0);
        this.$block = fd2;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new ThreadExtension$wrapAsync$1(this.$block, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((ThreadExtension$wrapAsync$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            CoroutineDispatcher b = qh1.m71265b();
            final fd2<hu0, ns0<? super r37>, Object> fd2 = this.$block;
            C83451 r1 = new C83451((ns0<? super C83451>) null);
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
