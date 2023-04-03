package net.safemoon.androidwallet.fragments;

import android.widget.EditText;
import com.bumptech.glide.C1710a;
import com.google.mlkit.common.MlKitException;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.common.TokenType;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Lnet/safemoon/androidwallet/common/TokenType;", "it", "Lr37;", "invoke", "(Lnet/safemoon/androidwallet/common/TokenType;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: AddCustomReflectionContractFragment.kt */
public final class AddCustomReflectionContractFragment$onViewCreated$1$2 extends Lambda implements rc2<TokenType, r37> {
    public final /* synthetic */ a92 $this_apply;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddCustomReflectionContractFragment$onViewCreated$1$2(a92 a92) {
        super(1);
        this.$this_apply = a92;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((TokenType) obj);
        return r37.f33317a;
    }

    public final void invoke(TokenType tokenType) {
        if (tokenType != null) {
            a92 a92 = this.$this_apply;
            a92.f20833b.setText(tokenType.getTitle());
            ((be5) C1710a.m12225u(a92.f20836e).mo23162w(Integer.valueOf(tokenType.getIcon())).mo22581g0(MlKitException.CODE_SCANNER_UNAVAILABLE, MlKitException.CODE_SCANNER_UNAVAILABLE)).mo11567a(qe5.m25623x0()).mo11553K0(a92.f20836e);
            EditText editText = a92.f20839h.getEditText();
            if (editText != null) {
                EditText editText2 = a92.f20839h.getEditText();
                editText.setText(editText2 != null ? editText2.getText() : null);
            }
        }
    }
}
