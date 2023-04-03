package com.trustwallet.walletconnect.models.binance;

import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializer;
import com.trustwallet.walletconnect.models.binance.WCBinanceCancelOrder;
import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, mo44877d2 = {"cancelOrderDeserializer", "Lcom/google/gson/JsonDeserializer;", "Lcom/trustwallet/walletconnect/models/binance/WCBinanceCancelOrder$Message;", "getCancelOrderDeserializer", "()Lcom/google/gson/JsonDeserializer;", "cancelOrderSerializer", "Lcom/google/gson/JsonSerializer;", "getCancelOrderSerializer", "()Lcom/google/gson/JsonSerializer;", "library-walletconnect_release"}, mo44878k = 2, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: WCBinanceCancelOrder.kt */
public final class WCBinanceCancelOrderKt {
    private static final JsonDeserializer<WCBinanceCancelOrder.Message> cancelOrderDeserializer = xj2.m30137b(WCBinanceCancelOrderKt$cancelOrderDeserializer$1.INSTANCE);
    private static final JsonSerializer<WCBinanceCancelOrder.Message> cancelOrderSerializer = xj2.m30138c(WCBinanceCancelOrderKt$cancelOrderSerializer$1.INSTANCE);

    public static final JsonDeserializer<WCBinanceCancelOrder.Message> getCancelOrderDeserializer() {
        return cancelOrderDeserializer;
    }

    public static final JsonSerializer<WCBinanceCancelOrder.Message> getCancelOrderSerializer() {
        return cancelOrderSerializer;
    }
}
