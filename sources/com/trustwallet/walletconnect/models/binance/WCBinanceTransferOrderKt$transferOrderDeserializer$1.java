package com.trustwallet.walletconnect.models.binance;

import com.trustwallet.walletconnect.models.binance.WCBinanceTransferOrder;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Lae1;", "it", "Lcom/trustwallet/walletconnect/models/binance/WCBinanceTransferOrder$Message;", "invoke", "(Lae1;)Lcom/trustwallet/walletconnect/models/binance/WCBinanceTransferOrder$Message;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: WCBinanceTransferOrder.kt */
public final class WCBinanceTransferOrderKt$transferOrderDeserializer$1 extends Lambda implements rc2<ae1, WCBinanceTransferOrder.Message> {
    public static final WCBinanceTransferOrderKt$transferOrderDeserializer$1 INSTANCE = new WCBinanceTransferOrderKt$transferOrderDeserializer$1();

    public WCBinanceTransferOrderKt$transferOrderDeserializer$1() {
        super(1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x007f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.trustwallet.walletconnect.models.binance.WCBinanceTransferOrder.Message invoke(p000.ae1 r9) {
        /*
            r8 = this;
            java.lang.String r0 = "it"
            p000.vx2.m53591g(r9, r0)
            com.trustwallet.walletconnect.models.binance.WCBinanceTransferOrder$Message r0 = new com.trustwallet.walletconnect.models.binance.WCBinanceTransferOrder$Message
            ae1$a r1 = r9.mo164a()
            com.google.gson.JsonElement r2 = r9.mo165b()
            com.trustwallet.walletconnect.models.binance.WCBinanceTransferOrder$MessageKey r3 = com.trustwallet.walletconnect.models.binance.WCBinanceTransferOrder.MessageKey.INPUTS
            java.lang.String r3 = r3.getKey()
            com.google.gson.JsonElement r2 = p000.xn1.m30225b(r2, r3)
            com.google.gson.JsonArray r2 = p000.xn1.m30226c(r2)
            com.google.gson.JsonDeserializationContext r1 = r1.mo169a()
            com.trustwallet.walletconnect.models.binance.WCBinanceTransferOrderKt$transferOrderDeserializer$1$invoke$$inlined$deserialize$1 r3 = new com.trustwallet.walletconnect.models.binance.WCBinanceTransferOrderKt$transferOrderDeserializer$1$invoke$$inlined$deserialize$1
            r3.<init>()
            java.lang.reflect.Type r3 = r3.getType()
            java.lang.String r4 = "object : TypeToken<T>() {} .type"
            p000.vx2.m53587c(r3, r4)
            boolean r5 = r3 instanceof java.lang.reflect.ParameterizedType
            java.lang.String r6 = "type.rawType"
            if (r5 == 0) goto L_0x0046
            r5 = r3
            java.lang.reflect.ParameterizedType r5 = (java.lang.reflect.ParameterizedType) r5
            boolean r7 = p000.xj2.m30136a(r5)
            if (r7 == 0) goto L_0x0046
            java.lang.reflect.Type r3 = r5.getRawType()
            p000.vx2.m53587c(r3, r6)
            goto L_0x004a
        L_0x0046:
            java.lang.reflect.Type r3 = p000.xj2.m30139d(r3)
        L_0x004a:
            java.lang.Object r1 = r1.deserialize(r2, r3)
            java.lang.String r2 = "it.context.deserialize(i…ageKey.INPUTS.key].array)"
            p000.vx2.m53590f(r1, r2)
            java.util.List r1 = (java.util.List) r1
            ae1$a r2 = r9.mo164a()
            com.google.gson.JsonElement r9 = r9.mo165b()
            com.trustwallet.walletconnect.models.binance.WCBinanceTransferOrder$MessageKey r3 = com.trustwallet.walletconnect.models.binance.WCBinanceTransferOrder.MessageKey.OUTPUTS
            java.lang.String r3 = r3.getKey()
            com.google.gson.JsonElement r9 = p000.xn1.m30225b(r9, r3)
            com.google.gson.JsonArray r9 = p000.xn1.m30226c(r9)
            com.google.gson.JsonDeserializationContext r2 = r2.mo169a()
            com.trustwallet.walletconnect.models.binance.WCBinanceTransferOrderKt$transferOrderDeserializer$1$invoke$$inlined$deserialize$2 r3 = new com.trustwallet.walletconnect.models.binance.WCBinanceTransferOrderKt$transferOrderDeserializer$1$invoke$$inlined$deserialize$2
            r3.<init>()
            java.lang.reflect.Type r3 = r3.getType()
            p000.vx2.m53587c(r3, r4)
            boolean r4 = r3 instanceof java.lang.reflect.ParameterizedType
            if (r4 == 0) goto L_0x0090
            r4 = r3
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            boolean r5 = p000.xj2.m30136a(r4)
            if (r5 == 0) goto L_0x0090
            java.lang.reflect.Type r3 = r4.getRawType()
            p000.vx2.m53587c(r3, r6)
            goto L_0x0094
        L_0x0090:
            java.lang.reflect.Type r3 = p000.xj2.m30139d(r3)
        L_0x0094:
            java.lang.Object r9 = r2.deserialize(r9, r3)
            java.lang.String r2 = "it.context.deserialize(i…geKey.OUTPUTS.key].array)"
            p000.vx2.m53590f(r9, r2)
            java.util.List r9 = (java.util.List) r9
            r0.<init>(r1, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.trustwallet.walletconnect.models.binance.WCBinanceTransferOrderKt$transferOrderDeserializer$1.invoke(ae1):com.trustwallet.walletconnect.models.binance.WCBinanceTransferOrder$Message");
    }
}
