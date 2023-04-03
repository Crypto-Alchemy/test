package com.trustwallet.walletconnect.models.ethereum;

import com.google.gson.JsonDeserializer;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001d\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo44877d2 = {"ethTransactionSerializer", "Lcom/google/gson/JsonDeserializer;", "", "Lcom/trustwallet/walletconnect/models/ethereum/WCEthereumTransaction;", "getEthTransactionSerializer", "()Lcom/google/gson/JsonDeserializer;", "library-walletconnect_release"}, mo44878k = 2, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: WCEthereumTransaction.kt */
public final class WCEthereumTransactionKt {
    private static final JsonDeserializer<List<WCEthereumTransaction>> ethTransactionSerializer = xj2.m30137b(WCEthereumTransactionKt$ethTransactionSerializer$1.INSTANCE);

    public static final JsonDeserializer<List<WCEthereumTransaction>> getEthTransactionSerializer() {
        return ethTransactionSerializer;
    }
}
