package com.trustwallet.walletconnect.models.binance;

import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializer;
import com.trustwallet.walletconnect.models.binance.WCBinanceTradeOrder;
import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, mo44877d2 = {"tradeOrderDeserializer", "Lcom/google/gson/JsonDeserializer;", "Lcom/trustwallet/walletconnect/models/binance/WCBinanceTradeOrder$Message;", "getTradeOrderDeserializer", "()Lcom/google/gson/JsonDeserializer;", "tradeOrderSerializer", "Lcom/google/gson/JsonSerializer;", "getTradeOrderSerializer", "()Lcom/google/gson/JsonSerializer;", "library-walletconnect_release"}, mo44878k = 2, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: WCBinanceTradeOrder.kt */
public final class WCBinanceTradeOrderKt {
    private static final JsonDeserializer<WCBinanceTradeOrder.Message> tradeOrderDeserializer = xj2.m30137b(WCBinanceTradeOrderKt$tradeOrderDeserializer$1.INSTANCE);
    private static final JsonSerializer<WCBinanceTradeOrder.Message> tradeOrderSerializer = xj2.m30138c(WCBinanceTradeOrderKt$tradeOrderSerializer$1.INSTANCE);

    public static final JsonDeserializer<WCBinanceTradeOrder.Message> getTradeOrderDeserializer() {
        return tradeOrderDeserializer;
    }

    public static final JsonSerializer<WCBinanceTradeOrder.Message> getTradeOrderSerializer() {
        return tradeOrderSerializer;
    }
}
