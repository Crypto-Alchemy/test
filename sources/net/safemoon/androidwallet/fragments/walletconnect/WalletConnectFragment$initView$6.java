package net.safemoon.androidwallet.fragments.walletconnect;

import androidx.fragment.app.FragmentManager;
import com.google.android.material.button.MaterialButton;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import net.safemoon.androidwallet.dialogs.WalletConnectInterfaceV2Fragment;
import net.safemoon.androidwallet.viewmodels.wcv2.WCDelegate;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@"}, mo44877d2 = {"Ltj7;", "event", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.fragments.walletconnect.WalletConnectFragment$initView$6", mo48632f = "WalletConnectFragment.kt", mo48633l = {}, mo48634m = "invokeSuspend")
/* compiled from: WalletConnectFragment.kt */
public final class WalletConnectFragment$initView$6 extends SuspendLambda implements fd2<tj7, ns0<? super r37>, Object> {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ WalletConnectFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WalletConnectFragment$initView$6(WalletConnectFragment walletConnectFragment, ns0<? super WalletConnectFragment$initView$6> ns0) {
        super(2, ns0);
        this.this$0 = walletConnectFragment;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        WalletConnectFragment$initView$6 walletConnectFragment$initView$6 = new WalletConnectFragment$initView$6(this.this$0, ns0);
        walletConnectFragment$initView$6.L$0 = obj;
        return walletConnectFragment$initView$6;
    }

    public final Object invoke(tj7 tj7, ns0<? super r37> ns0) {
        return ((WalletConnectFragment$initView$6) create(tj7, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        MaterialButton materialButton;
        wx2.m54101d();
        if (this.label == 0) {
            hg5.m45199b(obj);
            tj7 tj7 = (tj7) this.L$0;
            if (tj7 instanceof i16) {
                if (this.this$0.mo58159L()) {
                    this.this$0.f42426C = new WalletConnectInterfaceV2Fragment();
                    WalletConnectInterfaceV2Fragment E = this.this$0.f42426C;
                    if (E != null) {
                        FragmentManager childFragmentManager = this.this$0.getChildFragmentManager();
                        vx2.m53590f(childFragmentManager, "childFragmentManager");
                        E.mo57336W(childFragmentManager);
                    }
                    lb2 v = this.this$0.f42428I;
                    if (v != null) {
                        materialButton = v.f31274b;
                    } else {
                        materialButton = null;
                    }
                    if (materialButton != null) {
                        materialButton.setEnabled(true);
                    }
                } else {
                    WCDelegate.f43174a.mo62022p();
                }
            } else if (tj7 instanceof k16) {
                this.this$0.mo58169Y(((k16) tj7).mo52843a());
            }
            return r37.f33317a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
