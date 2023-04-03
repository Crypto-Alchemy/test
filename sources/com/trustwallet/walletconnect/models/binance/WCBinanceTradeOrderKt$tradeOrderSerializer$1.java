package com.trustwallet.walletconnect.models.binance;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.trustwallet.walletconnect.models.binance.WCBinanceTradeOrder;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"Lvw5;", "Lcom/trustwallet/walletconnect/models/binance/WCBinanceTradeOrder$Message;", "it", "Lcom/google/gson/JsonElement;", "invoke", "(Lvw5;)Lcom/google/gson/JsonElement;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: WCBinanceTradeOrder.kt */
public final class WCBinanceTradeOrderKt$tradeOrderSerializer$1 extends Lambda implements rc2<vw5<WCBinanceTradeOrder.Message>, JsonElement> {
    public static final WCBinanceTradeOrderKt$tradeOrderSerializer$1 INSTANCE = new WCBinanceTradeOrderKt$tradeOrderSerializer$1();

    public WCBinanceTradeOrderKt$tradeOrderSerializer$1() {
        super(1);
    }

    public final JsonElement invoke(vw5<WCBinanceTradeOrder.Message> vw5) {
        vx2.m53591g(vw5, "it");
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(WCBinanceTradeOrder.MessageKey.ID.getKey(), vw5.mo27350b().getId());
        jsonObject.addProperty(WCBinanceTradeOrder.MessageKey.ORDER_TYPE.getKey(), (Number) Integer.valueOf(vw5.mo27350b().getOrderType()));
        jsonObject.addProperty(WCBinanceTradeOrder.MessageKey.PRICE.getKey(), (Number) Long.valueOf(vw5.mo27350b().getPrice()));
        jsonObject.addProperty(WCBinanceTradeOrder.MessageKey.QUANTITY.getKey(), (Number) Long.valueOf(vw5.mo27350b().getQuantity()));
        jsonObject.addProperty(WCBinanceTradeOrder.MessageKey.SENDER.getKey(), vw5.mo27350b().getSender());
        jsonObject.addProperty(WCBinanceTradeOrder.MessageKey.SIDE.getKey(), (Number) Integer.valueOf(vw5.mo27350b().getSide()));
        jsonObject.addProperty(WCBinanceTradeOrder.MessageKey.SYMBOL.getKey(), vw5.mo27350b().getSymbol());
        jsonObject.addProperty(WCBinanceTradeOrder.MessageKey.TIME_INFORCE.getKey(), (Number) Integer.valueOf(vw5.mo27350b().getTimeInforce()));
        return jsonObject;
    }
}
