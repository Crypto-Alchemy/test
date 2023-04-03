package net.safemoon.androidwallet.dialogs;

import androidx.appcompat.widget.AppCompatTextView;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.textview.MaterialTextView;
import com.trustwallet.walletconnect.models.ethereum.WCEthereumTransaction;
import java.math.BigInteger;
import java.math.RoundingMode;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.model.token.room.RoomToken;
import p000.rz1;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.dialogs.WalletConnectSmartContractCall$loadingPrice$2$1", mo48632f = "WalletConnectSmartContractCall.kt", mo48633l = {}, mo48634m = "invokeSuspend")
/* compiled from: WalletConnectSmartContractCall.kt */
public final class WalletConnectSmartContractCall$loadingPrice$2$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ BigInteger $gasLimit;
    public final /* synthetic */ BigInteger $gasPrice;
    public final /* synthetic */ RoomToken $nativeToken;
    public final /* synthetic */ TokenType $tt;
    public int label;
    public final /* synthetic */ WalletConnectSmartContractCall this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WalletConnectSmartContractCall$loadingPrice$2$1(WalletConnectSmartContractCall walletConnectSmartContractCall, RoomToken roomToken, BigInteger bigInteger, BigInteger bigInteger2, TokenType tokenType, ns0<? super WalletConnectSmartContractCall$loadingPrice$2$1> ns0) {
        super(2, ns0);
        this.this$0 = walletConnectSmartContractCall;
        this.$nativeToken = roomToken;
        this.$gasLimit = bigInteger;
        this.$gasPrice = bigInteger2;
        this.$tt = tokenType;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new WalletConnectSmartContractCall$loadingPrice$2$1(this.this$0, this.$nativeToken, this.$gasLimit, this.$gasPrice, this.$tt, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((WalletConnectSmartContractCall$loadingPrice$2$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        double d;
        wx2.m54101d();
        if (this.label == 0) {
            hg5.m45199b(obj);
            pb2 K = this.this$0.f41833e1;
            String str2 = null;
            if (K == null) {
                return null;
            }
            RoomToken roomToken = this.$nativeToken;
            WalletConnectSmartContractCall walletConnectSmartContractCall = this.this$0;
            BigInteger bigInteger = this.$gasLimit;
            BigInteger bigInteger2 = this.$gasPrice;
            TokenType tokenType = this.$tt;
            if (roomToken == null) {
                return null;
            }
            K.f32642f.setText(roomToken.getName() + "(" + roomToken.getSymbol() + ")");
            WCEthereumTransaction P = walletConnectSmartContractCall.f41832e0;
            if (P != null) {
                str = P.getValue();
            } else {
                str = null;
            }
            if (str != null) {
                WCEthereumTransaction P2 = walletConnectSmartContractCall.f41832e0;
                if (P2 != null) {
                    str2 = P2.getValue();
                }
                BigInteger decodeQuantity = pc4.decodeQuantity(str2);
                vx2.m53590f(decodeQuantity, "decodeQuantity(transaction?.value)");
                d = ol0.m70376r(decodeQuantity, 18).doubleValue();
            } else {
                d = Utils.DOUBLE_EPSILON;
            }
            double d2 = ((double) -1) * d;
            K.f32644h.setText(ol0.m70374p(d2, 0, (RoundingMode) null, false, 6, (Object) null) + roomToken.getSymbol());
            AppCompatTextView appCompatTextView = K.f32643g;
            rz1.C9291a aVar = rz1.f44501a;
            appCompatTextView.setText(aVar.mo65772b() + ol0.m70374p(sz1.m72124a(d2 * roomToken.getPriceInUsdt()), 0, (RoundingMode) null, false, 7, (Object) null));
            BigInteger multiply = bigInteger.multiply(bigInteger2);
            vx2.m53590f(multiply, "gasLimit.multiply(gasPrice)");
            double doubleValue = ol0.m70376r(multiply, 18).doubleValue();
            double priceInUsdt = roomToken.getPriceInUsdt() * doubleValue;
            K.f32647k.setText(ol0.m70374p(doubleValue, 0, (RoundingMode) null, false, 6, (Object) null) + tokenType.getNativeToken() + "(" + aVar.mo65772b() + ol0.m70374p(sz1.m72124a(priceInUsdt), 2, (RoundingMode) null, false, 6, (Object) null) + ")");
            MaterialTextView materialTextView = K.f32646j;
            String b = aVar.mo65772b();
            String p = ol0.m70374p(sz1.m72124a((doubleValue + d) * roomToken.getPriceInUsdt()), 2, (RoundingMode) null, false, 6, (Object) null);
            StringBuilder sb = new StringBuilder();
            sb.append(b);
            sb.append(p);
            materialTextView.setText(sb.toString());
            return r37.f33317a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
