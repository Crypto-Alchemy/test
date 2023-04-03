package net.safemoon.androidwallet.dialogs;

import com.google.android.material.textview.MaterialTextView;
import java.math.BigInteger;
import java.math.RoundingMode;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.model.token.room.RoomToken;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.dialogs.WalletConnectSmartContractCall$loadingSolPrice$2$2", mo48632f = "WalletConnectSmartContractCall.kt", mo48633l = {}, mo48634m = "invokeSuspend")
/* compiled from: WalletConnectSmartContractCall.kt */
public final class WalletConnectSmartContractCall$loadingSolPrice$2$2 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ Ref$ObjectRef<BigInteger> $estimateGas;
    public final /* synthetic */ RoomToken $nativeToken;
    public final /* synthetic */ TokenType $tt;
    public int label;
    public final /* synthetic */ WalletConnectSmartContractCall this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WalletConnectSmartContractCall$loadingSolPrice$2$2(WalletConnectSmartContractCall walletConnectSmartContractCall, RoomToken roomToken, Ref$ObjectRef<BigInteger> ref$ObjectRef, TokenType tokenType, ns0<? super WalletConnectSmartContractCall$loadingSolPrice$2$2> ns0) {
        super(2, ns0);
        this.this$0 = walletConnectSmartContractCall;
        this.$nativeToken = roomToken;
        this.$estimateGas = ref$ObjectRef;
        this.$tt = tokenType;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new WalletConnectSmartContractCall$loadingSolPrice$2$2(this.this$0, this.$nativeToken, this.$estimateGas, this.$tt, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((WalletConnectSmartContractCall$loadingSolPrice$2$2) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        ProgressLoading V;
        wx2.m54101d();
        if (this.label == 0) {
            hg5.m45199b(obj);
            if (!(this.this$0.f41837q1 == null || (V = this.this$0.mo57338V()) == null)) {
                V.mo22266k();
            }
            pb2 K = this.this$0.f41833e1;
            if (K == null) {
                return null;
            }
            RoomToken roomToken = this.$nativeToken;
            Ref$ObjectRef<BigInteger> ref$ObjectRef = this.$estimateGas;
            TokenType tokenType = this.$tt;
            if (roomToken == null) {
                return null;
            }
            BigInteger bigInteger = (BigInteger) ref$ObjectRef.element;
            if (bigInteger != null) {
                double doubleValue = ol0.m70376r(bigInteger, 9).doubleValue();
                double priceInUsdt = roomToken.getPriceInUsdt() * doubleValue;
                MaterialTextView materialTextView = K.f32647k;
                String p = ol0.m70374p(doubleValue, 0, (RoundingMode) null, false, 6, (Object) null);
                String nativeToken = tokenType.getNativeToken();
                String b = rz1.f44501a.mo65772b();
                String p2 = ol0.m70374p(sz1.m72124a(priceInUsdt), 2, (RoundingMode) null, false, 6, (Object) null);
                materialTextView.setText(p + nativeToken + "(" + b + p2 + ")");
            }
            MaterialTextView materialTextView2 = K.f32642f;
            String name = roomToken.getName();
            String symbol = roomToken.getSymbol();
            materialTextView2.setText(name + "(" + symbol + ")");
            return r37.f33317a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
