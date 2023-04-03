package net.safemoon.androidwallet.fragments;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.math.BigInteger;
import java.math.RoundingMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.model.transaction.history.Result;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/transaction/history/Result;", "kotlin.jvm.PlatformType", "details", "Lr37;", "invoke", "(Lnet/safemoon/androidwallet/model/transaction/history/Result;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: TransferNotificationDetailsFragment.kt */
public final class TransferNotificationDetailsFragment$observeViewModel$2 extends Lambda implements rc2<Result, r37> {
    public final /* synthetic */ Ref$ObjectRef<TokenType> $chainForDetails;
    public final /* synthetic */ TransferNotificationDetailsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransferNotificationDetailsFragment$observeViewModel$2(Ref$ObjectRef<TokenType> ref$ObjectRef, TransferNotificationDetailsFragment transferNotificationDetailsFragment) {
        super(1);
        this.$chainForDetails = ref$ObjectRef;
        this.this$0 = transferNotificationDetailsFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Result) obj);
        return r37.f33317a;
    }

    public final void invoke(Result result) {
        Result result2 = result;
        if (result2 != null) {
            ConstraintLayout constraintLayout = null;
            if (this.$chainForDetails.element == TokenType.MULTI_COIN_DOGE) {
                String str = result2.gasUsed;
                vx2.m53590f(str, "details.gasUsed");
                BigInteger bigInteger = new BigInteger(str);
                String str2 = result2.gasPrice;
                vx2.m53590f(str2, "details.gasPrice");
                BigInteger multiply = bigInteger.multiply(new BigInteger(str2));
                vx2.m53590f(multiply, "details.gasUsed.toBigInt….gasPrice.toBigInteger())");
                String p = ol0.m70374p(ol0.m70376r(multiply, 18).doubleValue(), 0, (RoundingMode) null, true, 2, (Object) null);
                String string = this.this$0.getString(R.string.tx_network_fee);
                T t = this.$chainForDetails.element;
                vx2.m53588d(t);
                String str3 = string + " " + p + " " + ((TokenType) t).getNativeToken();
                cb2 w = this.this$0.f42274y;
                vx2.m53588d(w);
                w.f21663k.setText(str3);
                cb2 w2 = this.this$0.f42274y;
                ConstraintLayout constraintLayout2 = w2 != null ? w2.f21654b : null;
                if (constraintLayout2 != null) {
                    constraintLayout2.setVisibility(0);
                }
            }
            if (this.$chainForDetails.element == TokenType.MULTI_COIN_BITCOIN) {
                String str4 = result2.gasUsed;
                vx2.m53590f(str4, "details.gasUsed");
                BigInteger bigInteger2 = new BigInteger(str4);
                String str5 = result2.gasPrice;
                vx2.m53590f(str5, "details.gasPrice");
                BigInteger multiply2 = bigInteger2.multiply(new BigInteger(str5));
                vx2.m53590f(multiply2, "details.gasUsed.toBigInt….gasPrice.toBigInteger())");
                String p2 = ol0.m70374p(ol0.m70376r(multiply2, 18).doubleValue(), 0, (RoundingMode) null, true, 2, (Object) null);
                String string2 = this.this$0.getString(R.string.tx_network_fee);
                T t2 = this.$chainForDetails.element;
                vx2.m53588d(t2);
                String str6 = string2 + " " + p2 + " " + ((TokenType) t2).getNativeToken();
                cb2 w3 = this.this$0.f42274y;
                vx2.m53588d(w3);
                w3.f21663k.setText(str6);
                cb2 w4 = this.this$0.f42274y;
                if (w4 != null) {
                    constraintLayout = w4.f21654b;
                }
                if (constraintLayout != null) {
                    constraintLayout.setVisibility(0);
                }
            }
        }
    }
}
