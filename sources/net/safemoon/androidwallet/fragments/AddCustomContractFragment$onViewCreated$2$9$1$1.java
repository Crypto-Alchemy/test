package net.safemoon.androidwallet.fragments;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.viewmodels.CustomContractTokenViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/CustomContractTokenViewModel$SaveReturnCode;", "ctr", "Lr37;", "invoke", "(Lnet/safemoon/androidwallet/viewmodels/CustomContractTokenViewModel$SaveReturnCode;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: AddCustomContractFragment.kt */
public final class AddCustomContractFragment$onViewCreated$2$9$1$1 extends Lambda implements rc2<CustomContractTokenViewModel.SaveReturnCode, r37> {
    public final /* synthetic */ AddCustomContractFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddCustomContractFragment$onViewCreated$2$9$1$1(AddCustomContractFragment addCustomContractFragment) {
        super(1);
        this.this$0 = addCustomContractFragment;
    }

    /* renamed from: b */
    public static final void m66373b(DialogInterface dialogInterface) {
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((CustomContractTokenViewModel.SaveReturnCode) obj);
        return r37.f33317a;
    }

    public final void invoke(CustomContractTokenViewModel.SaveReturnCode saveReturnCode) {
        vx2.m53591g(saveReturnCode, "ctr");
        if (saveReturnCode == CustomContractTokenViewModel.SaveReturnCode.BLACKLIST) {
            FragmentActivity requireActivity = this.this$0.requireActivity();
            vx2.m53590f(requireActivity, "requireActivity()");
            fy0.m57956e(requireActivity, Integer.valueOf(R.string.warning_title), R.string.warning_black_list_cc, true, new C8515a());
        } else if (this.this$0.isAdded() && this.this$0.isVisible()) {
            this.this$0.mo50752i();
        }
    }
}
