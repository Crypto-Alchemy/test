package net.safemoon.androidwallet.fragments;

import android.content.Context;
import android.content.DialogInterface;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.model.swap.Swap;
import net.safemoon.androidwallet.utils.Common;
import net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/SwapMigrationViewModel$d;", "kotlin.jvm.PlatformType", "it", "Lr37;", "invoke", "(Lnet/safemoon/androidwallet/viewmodels/SwapMigrationViewModel$d;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SwapMigrationFragment.kt */
public final class SwapMigrationFragment$onViewCreated$26 extends Lambda implements rc2<SwapMigrationViewModel.C8741d, r37> {
    public final /* synthetic */ SwapMigrationFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwapMigrationFragment$onViewCreated$26(SwapMigrationFragment swapMigrationFragment) {
        super(1);
        this.this$0 = swapMigrationFragment;
    }

    /* renamed from: b */
    public static final void m67380b(SwapMigrationFragment swapMigrationFragment, DialogInterface dialogInterface) {
        vx2.m53591g(swapMigrationFragment, "this$0");
        ho2 m0 = swapMigrationFragment.mo57759C0();
        if (m0 != null) {
            m0.mo52271r();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SwapMigrationViewModel.C8741d) obj);
        return r37.f33317a;
    }

    public final void invoke(SwapMigrationViewModel.C8741d dVar) {
        if (dVar == null) {
            return;
        }
        if (dVar.mo61494b()) {
            Common common = Common.f42577a;
            TokenType.C8246a aVar = TokenType.Companion;
            Swap value = this.this$0.mo57762F0().mo61459Y().getValue();
            vx2.m53588d(value);
            Integer num = value.chainId;
            vx2.m53590f(num, "swapViewModel.sourceLiveData.value!!.chainId");
            this.this$0.mo57762F0().mo61467g0().postValue(null);
            wf1.m73588e(new WeakReference(this.this$0.requireActivity()), common.mo60911r(aVar.mo57099b(num.intValue())) + dVar.mo61493a(), new C8572h(this.this$0));
            ho2 m0 = this.this$0.mo57759C0();
            if (m0 != null) {
                m0.mo52262a();
                return;
            }
            return;
        }
        Context context = this.this$0.getContext();
        if (context != null) {
            ol0.m70346Z(context, dVar.mo61493a());
        }
        this.this$0.mo57762F0().mo61467g0().postValue(null);
    }
}
