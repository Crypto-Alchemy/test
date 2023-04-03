package com.trustwallet.walletconnect.models.binance;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.trustwallet.walletconnect.models.binance.WCBinanceCancelOrder;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"Lvw5;", "Lcom/trustwallet/walletconnect/models/binance/WCBinanceCancelOrder$Message;", "it", "Lcom/google/gson/JsonElement;", "invoke", "(Lvw5;)Lcom/google/gson/JsonElement;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: WCBinanceCancelOrder.kt */
public final class WCBinanceCancelOrderKt$cancelOrderSerializer$1 extends Lambda implements rc2<vw5<WCBinanceCancelOrder.Message>, JsonElement> {
    public static final WCBinanceCancelOrderKt$cancelOrderSerializer$1 INSTANCE = new WCBinanceCancelOrderKt$cancelOrderSerializer$1();

    public WCBinanceCancelOrderKt$cancelOrderSerializer$1() {
        super(1);
    }

    public final JsonElement invoke(vw5<WCBinanceCancelOrder.Message> vw5) {
        vx2.m53591g(vw5, "it");
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("refid", vw5.mo27350b().getRefid());
        jsonObject.addProperty("sender", vw5.mo27350b().getSender());
        jsonObject.addProperty("symbol", vw5.mo27350b().getSymbol());
        return jsonObject;
    }
}
