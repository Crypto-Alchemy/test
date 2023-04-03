package net.safemoon.androidwallet.model.rpc2.solana;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.trustwallet.walletconnect.WCClientKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.random.Random;

@Metadata(mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0005j\b\u0012\u0004\u0012\u00020\u0001`\u0006¢\u0006\u0002\u0010\u0007R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\u00038\u0006XD¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR&\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0005j\b\u0012\u0004\u0012\u00020\u0001`\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaRequest;", "", "method", "", "params", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/String;Ljava/util/ArrayList;)V", "id", "", "getId", "()I", "jsonrpc", "getJsonrpc", "()Ljava/lang/String;", "getMethod", "getParams", "()Ljava/util/ArrayList;", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: SolanaRequest.kt */
public class SolanaRequest {
    @SerializedName("id")
    @Expose

    /* renamed from: id */
    private final int f42473id = d75.m43393o(new rw2(1, Integer.MAX_VALUE), Random.Default);
    @SerializedName("jsonrpc")
    @Expose
    private final String jsonrpc = WCClientKt.JSONRPC_VERSION;
    @SerializedName("method")
    @Expose
    private final String method;
    @SerializedName("params")
    @Expose
    private final ArrayList<Object> params;

    public SolanaRequest(String str, ArrayList<Object> arrayList) {
        vx2.m53591g(str, "method");
        vx2.m53591g(arrayList, "params");
        this.method = str;
        this.params = arrayList;
    }

    public final int getId() {
        return this.f42473id;
    }

    public final String getJsonrpc() {
        return this.jsonrpc;
    }

    public final String getMethod() {
        return this.method;
    }

    public final ArrayList<Object> getParams() {
        return this.params;
    }
}
