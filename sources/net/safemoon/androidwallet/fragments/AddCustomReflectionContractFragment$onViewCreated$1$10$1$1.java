package net.safemoon.androidwallet.fragments;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.viewmodels.CustomReflectionContractTokenViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/CustomReflectionContractTokenViewModel$SaveReturnCode;", "errorId", "Lr37;", "invoke", "(Lnet/safemoon/androidwallet/viewmodels/CustomReflectionContractTokenViewModel$SaveReturnCode;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: AddCustomReflectionContractFragment.kt */
public final class AddCustomReflectionContractFragment$onViewCreated$1$10$1$1 extends Lambda implements rc2<CustomReflectionContractTokenViewModel.SaveReturnCode, r37> {
    public final /* synthetic */ a92 $this_apply;
    public final /* synthetic */ AddCustomReflectionContractFragment this$0;

    @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* renamed from: net.safemoon.androidwallet.fragments.AddCustomReflectionContractFragment$onViewCreated$1$10$1$1$a */
    /* compiled from: AddCustomReflectionContractFragment.kt */
    public /* synthetic */ class C8354a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f41870a;

        static {
            int[] iArr = new int[CustomReflectionContractTokenViewModel.SaveReturnCode.values().length];
            try {
                iArr[CustomReflectionContractTokenViewModel.SaveReturnCode.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f41870a = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddCustomReflectionContractFragment$onViewCreated$1$10$1$1(a92 a92, AddCustomReflectionContractFragment addCustomReflectionContractFragment) {
        super(1);
        this.$this_apply = a92;
        this.this$0 = addCustomReflectionContractFragment;
    }

    /* renamed from: b */
    public static final void m66397b(DialogInterface dialogInterface) {
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((CustomReflectionContractTokenViewModel.SaveReturnCode) obj);
        return r37.f33317a;
    }

    public final void invoke(CustomReflectionContractTokenViewModel.SaveReturnCode saveReturnCode) {
        this.$this_apply.f20834c.setEnabled(true);
        if (saveReturnCode != null) {
            if (C8354a.f41870a[saveReturnCode.ordinal()] == 1) {
                FragmentActivity requireActivity = this.this$0.requireActivity();
                vx2.m53590f(requireActivity, "requireActivity()");
                fy0.m57958g(requireActivity, Integer.valueOf(R.string.warning_title), R.string.mr_error_initiate_wallet, false, new C8516b(), 8, (Object) null);
            }
        } else if (this.this$0.isAdded() && this.this$0.isVisible()) {
            this.this$0.mo50752i();
        }
    }
}
