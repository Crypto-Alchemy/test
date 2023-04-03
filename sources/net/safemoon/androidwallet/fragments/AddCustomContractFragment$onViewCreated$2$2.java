package net.safemoon.androidwallet.fragments;

import android.widget.EditText;
import com.bumptech.glide.C1710a;
import com.google.mlkit.common.MlKitException;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.common.TokenType;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"Lnet/safemoon/androidwallet/common/TokenType;", "kotlin.jvm.PlatformType", "it", "Lr37;", "invoke", "(Lnet/safemoon/androidwallet/common/TokenType;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: AddCustomContractFragment.kt */
public final class AddCustomContractFragment$onViewCreated$2$2 extends Lambda implements rc2<TokenType, r37> {
    public final /* synthetic */ a92 $this_apply;
    public final /* synthetic */ AddCustomContractFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddCustomContractFragment$onViewCreated$2$2(a92 a92, AddCustomContractFragment addCustomContractFragment) {
        super(1);
        this.$this_apply = a92;
        this.this$0 = addCustomContractFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((TokenType) obj);
        return r37.f33317a;
    }

    public final void invoke(TokenType tokenType) {
        if (tokenType != null) {
            a92 a92 = this.$this_apply;
            AddCustomContractFragment addCustomContractFragment = this.this$0;
            a92.f20833b.setText(tokenType.getTitle());
            ((be5) C1710a.m12225u(a92.f20836e).mo23162w(Integer.valueOf(tokenType.getIcon())).mo22581g0(MlKitException.CODE_SCANNER_UNAVAILABLE, MlKitException.CODE_SCANNER_UNAVAILABLE)).mo11567a(qe5.m25623x0()).mo11553K0(a92.f20836e);
            addCustomContractFragment.mo57381D().mo60966m(tokenType);
            EditText editText = a92.f20839h.getEditText();
            if (editText != null) {
                editText.setText("");
            }
        }
    }
}
