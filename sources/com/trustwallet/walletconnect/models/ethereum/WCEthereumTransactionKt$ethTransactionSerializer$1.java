package com.trustwallet.walletconnect.models.ethereum;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p000.ae1;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"Lae1;", "it", "", "Lcom/trustwallet/walletconnect/models/ethereum/WCEthereumTransaction;", "invoke", "(Lae1;)Ljava/util/List;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: WCEthereumTransaction.kt */
public final class WCEthereumTransactionKt$ethTransactionSerializer$1 extends Lambda implements rc2<ae1, List<? extends WCEthereumTransaction>> {
    public static final WCEthereumTransactionKt$ethTransactionSerializer$1 INSTANCE = new WCEthereumTransactionKt$ethTransactionSerializer$1();

    public WCEthereumTransactionKt$ethTransactionSerializer$1() {
        super(1);
    }

    public final List<WCEthereumTransaction> invoke(ae1 ae1) {
        Type type;
        vx2.m53591g(ae1, "it");
        ArrayList arrayList = new ArrayList();
        JsonArray<JsonElement> asJsonArray = ae1.mo165b().getAsJsonArray();
        vx2.m53590f(asJsonArray, "it.json.asJsonArray");
        for (JsonElement jsonElement : asJsonArray) {
            if (jsonElement.isJsonObject()) {
                ae1.C0018a a = ae1.mo164a();
                vx2.m53590f(jsonElement, "tx");
                JsonDeserializationContext a2 = a.mo169a();
                Type type2 = new C5505xfe0080b4().getType();
                vx2.m53587c(type2, "object : TypeToken<T>() {} .type");
                if (type2 instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type2;
                    if (xj2.m30136a(parameterizedType)) {
                        type = parameterizedType.getRawType();
                        vx2.m53587c(type, "type.rawType");
                        Object deserialize = a2.deserialize(jsonElement, type);
                        vx2.m53590f(deserialize, "it.context.deserialize(tx)");
                        arrayList.add(deserialize);
                    }
                }
                type = xj2.m30139d(type2);
                Object deserialize2 = a2.deserialize(jsonElement, type);
                vx2.m53590f(deserialize2, "it.context.deserialize(tx)");
                arrayList.add(deserialize2);
            }
        }
        return arrayList;
    }
}
