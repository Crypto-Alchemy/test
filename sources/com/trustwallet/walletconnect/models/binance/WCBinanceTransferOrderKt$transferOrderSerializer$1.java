package com.trustwallet.walletconnect.models.binance;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.trustwallet.walletconnect.models.binance.WCBinanceTransferOrder;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"Lvw5;", "Lcom/trustwallet/walletconnect/models/binance/WCBinanceTransferOrder$Message;", "it", "Lcom/google/gson/JsonElement;", "invoke", "(Lvw5;)Lcom/google/gson/JsonElement;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: WCBinanceTransferOrder.kt */
public final class WCBinanceTransferOrderKt$transferOrderSerializer$1 extends Lambda implements rc2<vw5<WCBinanceTransferOrder.Message>, JsonElement> {
    public static final WCBinanceTransferOrderKt$transferOrderSerializer$1 INSTANCE = new WCBinanceTransferOrderKt$transferOrderSerializer$1();

    public WCBinanceTransferOrderKt$transferOrderSerializer$1() {
        super(1);
    }

    public final JsonElement invoke(vw5<WCBinanceTransferOrder.Message> vw5) {
        vx2.m53591g(vw5, "it");
        JsonObject jsonObject = new JsonObject();
        xn1.m30224a(jsonObject, WCBinanceTransferOrder.MessageKey.INPUTS.getKey(), vw5.mo27349a().serialize(vw5.mo27350b().getInputs()));
        xn1.m30224a(jsonObject, WCBinanceTransferOrder.MessageKey.OUTPUTS.getKey(), vw5.mo27349a().serialize(vw5.mo27350b().getOutputs()));
        return jsonObject;
    }
}
