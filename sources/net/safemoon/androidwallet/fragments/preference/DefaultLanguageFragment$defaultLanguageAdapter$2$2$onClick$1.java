package net.safemoon.androidwallet.fragments.preference;

import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.activity.AKTHomeActivity;
import net.safemoon.androidwallet.model.common.LanguageItem;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"", "it", "Lr37;", "invoke", "(Z)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: DefaultLanguageFragment.kt */
public final class DefaultLanguageFragment$defaultLanguageAdapter$2$2$onClick$1 extends Lambda implements rc2<Boolean, r37> {
    public final /* synthetic */ LanguageItem $item;
    public final /* synthetic */ DefaultLanguageFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultLanguageFragment$defaultLanguageAdapter$2$2$onClick$1(DefaultLanguageFragment defaultLanguageFragment, LanguageItem languageItem) {
        super(1);
        this.this$0 = defaultLanguageFragment;
        this.$item = languageItem;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return r37.f33317a;
    }

    public final void invoke(boolean z) {
        this.this$0.mo58125A().mo22266k();
        if (z) {
            ee3 ee3 = ee3.f37527a;
            FragmentActivity requireActivity = this.this$0.requireActivity();
            vx2.m53590f(requireActivity, "requireActivity()");
            ee3.mo51454c(requireActivity, this.$item);
            AKTHomeActivity.m64859h1(this.this$0.requireContext(), Integer.valueOf(R.id.navigation_settings));
        }
    }
}
