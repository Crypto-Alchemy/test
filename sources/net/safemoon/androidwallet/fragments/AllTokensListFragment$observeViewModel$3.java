package net.safemoon.androidwallet.fragments;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import net.safemoon.androidwallet.model.Coin;
import net.safemoon.androidwallet.viewmodels.HomeViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.fragments.AllTokensListFragment$observeViewModel$3", mo48632f = "AllTokensListFragment.kt", mo48633l = {220}, mo48634m = "invokeSuspend")
/* compiled from: AllTokensListFragment.kt */
public final class AllTokensListFragment$observeViewModel$3 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public int label;
    public final /* synthetic */ AllTokensListFragment this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, mo44877d2 = {"Lcl4;", "Lnet/safemoon/androidwallet/model/Coin;", "it", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    @v21(mo48631c = "net.safemoon.androidwallet.fragments.AllTokensListFragment$observeViewModel$3$1", mo48632f = "AllTokensListFragment.kt", mo48633l = {222}, mo48634m = "invokeSuspend")
    /* renamed from: net.safemoon.androidwallet.fragments.AllTokensListFragment$observeViewModel$3$1 */
    /* compiled from: AllTokensListFragment.kt */
    public static final class C83671 extends SuspendLambda implements fd2<cl4<Coin>, ns0<? super r37>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            C83671 r0 = new C83671(allTokensListFragment, ns0);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(cl4<Coin> cl4, ns0<? super r37> ns0) {
            return ((C83671) create(cl4, ns0)).invokeSuspend(r37.f33317a);
        }

        public final Object invokeSuspend(Object obj) {
            Object d = wx2.m54101d();
            int i = this.label;
            if (i == 0) {
                hg5.m45199b(obj);
                gw0 x = allTokensListFragment.f41889Q;
                vx2.m53588d(x);
                x.mo52025j(allTokensListFragment.f41890U);
                gw0 x2 = allTokensListFragment.f41889Q;
                vx2.m53588d(x2);
                this.label = 1;
                if (x2.mo8739e((cl4) this.L$0, this) == d) {
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
    public AllTokensListFragment$observeViewModel$3(AllTokensListFragment allTokensListFragment, ns0<? super AllTokensListFragment$observeViewModel$3> ns0) {
        super(2, ns0);
        this.this$0 = allTokensListFragment;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new AllTokensListFragment$observeViewModel$3(this.this$0, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((AllTokensListFragment$observeViewModel$3) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            HomeViewModel y = this.this$0.f41886L;
            vx2.m53588d(y);
            z42<cl4<Coin>> g = y.mo61225g();
            final AllTokensListFragment allTokensListFragment = this.this$0;
            C83671 r1 = new C83671((ns0<? super C83671>) null);
            this.label = 1;
            if (e52.m57217i(g, r1, this) == d) {
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
