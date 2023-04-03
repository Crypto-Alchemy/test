package net.safemoon.androidwallet.fragments;

import android.content.Context;
import android.content.DialogInterface;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.model.swap.Swap;
import net.safemoon.androidwallet.utils.Common;
import net.safemoon.androidwallet.viewmodels.SwapViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/SwapViewModel$e;", "kotlin.jvm.PlatformType", "it", "Lr37;", "invoke", "(Lnet/safemoon/androidwallet/viewmodels/SwapViewModel$e;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SwapFragment.kt */
public final class SwapFragment$onViewCreated$38 extends Lambda implements rc2<SwapViewModel.C8790e, r37> {
    public final /* synthetic */ SwapFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwapFragment$onViewCreated$38(SwapFragment swapFragment) {
        super(1);
        this.this$0 = swapFragment;
    }

    /* renamed from: b */
    public static final void m67269b(SwapFragment swapFragment, DialogInterface dialogInterface) {
        vx2.m53591g(swapFragment, "this$0");
        swapFragment.mo57712g1().mo61595X0();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SwapViewModel.C8790e) obj);
        return r37.f33317a;
    }

    public final void invoke(SwapViewModel.C8790e eVar) {
        if (eVar == null) {
            return;
        }
        if (eVar.mo61652b()) {
            Common common = Common.f42577a;
            TokenType.C8246a aVar = TokenType.Companion;
            Swap value = this.this$0.mo57712g1().mo61553B0().getValue();
            vx2.m53588d(value);
            Integer num = value.chainId;
            vx2.m53590f(num, "swapViewModel.sourceLiveData.value!!.chainId");
            this.this$0.mo57712g1().mo61573M0().postValue(null);
            wf1.m73588e(new WeakReference(this.this$0.requireActivity()), common.mo60911r(aVar.mo57099b(num.intValue())) + eVar.mo61651a(), new C8571g(this.this$0));
            ho2 z0 = this.this$0.mo57706a1();
            if (z0 != null) {
                z0.mo52262a();
                return;
            }
            return;
        }
        Context context = this.this$0.getContext();
        if (context != null) {
            ol0.m70346Z(context, eVar.mo61651a());
        }
        this.this$0.mo57712g1().mo61573M0().postValue(null);
    }
}
