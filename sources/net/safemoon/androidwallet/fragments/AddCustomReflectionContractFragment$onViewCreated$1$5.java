package net.safemoon.androidwallet.fragments;

import android.widget.EditText;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.model.transaction.history.Result;
import net.safemoon.androidwallet.model.transaction.history.TransactionHistoryModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/transaction/history/TransactionHistoryModel;", "it", "Lr37;", "invoke", "(Lnet/safemoon/androidwallet/model/transaction/history/TransactionHistoryModel;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: AddCustomReflectionContractFragment.kt */
public final class AddCustomReflectionContractFragment$onViewCreated$1$5 extends Lambda implements rc2<TransactionHistoryModel, r37> {
    public final /* synthetic */ a92 $this_apply;
    public final /* synthetic */ AddCustomReflectionContractFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddCustomReflectionContractFragment$onViewCreated$1$5(AddCustomReflectionContractFragment addCustomReflectionContractFragment, a92 a92) {
        super(1);
        this.this$0 = addCustomReflectionContractFragment;
        this.$this_apply = a92;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((TransactionHistoryModel) obj);
        return r37.f33317a;
    }

    public final void invoke(TransactionHistoryModel transactionHistoryModel) {
        if (transactionHistoryModel != null) {
            Result n = this.this$0.mo57393C().mo61184n();
            if (n != null) {
                a92 a92 = this.$this_apply;
                EditText editText = a92.f20841j.getEditText();
                if (editText != null) {
                    editText.setEnabled(false);
                }
                EditText editText2 = a92.f20842k.getEditText();
                if (editText2 != null) {
                    editText2.setEnabled(false);
                }
                EditText editText3 = a92.f20840i.getEditText();
                if (editText3 != null) {
                    editText3.setEnabled(false);
                }
                EditText editText4 = a92.f20841j.getEditText();
                if (editText4 != null) {
                    editText4.setText(n.tokenName);
                }
                EditText editText5 = a92.f20842k.getEditText();
                if (editText5 != null) {
                    editText5.setText(n.tokenSymbol);
                }
                EditText editText6 = a92.f20840i.getEditText();
                if (editText6 != null) {
                    editText6.setText(String.valueOf(n.tokenDecimal));
                    return;
                }
                return;
            }
            return;
        }
        this.$this_apply.f20841j.setEnabled(true);
        this.$this_apply.f20842k.setEnabled(true);
        this.$this_apply.f20840i.setEnabled(true);
        EditText editText7 = this.$this_apply.f20841j.getEditText();
        if (editText7 != null) {
            editText7.setText("");
        }
        EditText editText8 = this.$this_apply.f20842k.getEditText();
        if (editText8 != null) {
            editText8.setText("");
        }
        EditText editText9 = this.$this_apply.f20840i.getEditText();
        if (editText9 != null) {
            editText9.setText("");
        }
    }
}
