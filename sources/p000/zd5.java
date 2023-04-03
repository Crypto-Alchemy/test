package p000;

import com.trustwallet.walletconnect.WCClientKt;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java8.util.concurrent.CompletableFuture;
import p000.ag5;

/* renamed from: zd5 */
/* compiled from: Request */
public class zd5<S, T extends ag5> {
    private static AtomicLong nextId = new AtomicLong(0);

    /* renamed from: id */
    private long f46367id;
    private String jsonrpc = WCClientKt.JSONRPC_VERSION;
    private String method;
    private List<S> params;
    private Class<T> responseType;
    private xj7 web3jService;

    public zd5() {
    }

    public g52<T> flowable() {
        return new pc5(new yd5(this)).flowable();
    }

    public long getId() {
        return this.f46367id;
    }

    public String getJsonrpc() {
        return this.jsonrpc;
    }

    public String getMethod() {
        return this.method;
    }

    public List<S> getParams() {
        return this.params;
    }

    @y43
    public Class<T> getResponseType() {
        return this.responseType;
    }

    public T send() throws IOException {
        return this.web3jService.send(this, this.responseType);
    }

    public CompletableFuture<T> sendAsync() {
        return this.web3jService.sendAsync(this, this.responseType);
    }

    public void setId(long j) {
        this.f46367id = j;
    }

    public void setJsonrpc(String str) {
        this.jsonrpc = str;
    }

    public void setMethod(String str) {
        this.method = str;
    }

    public void setParams(List<S> list) {
        this.params = list;
    }

    public zd5(String str, List<S> list, xj7 xj7, Class<T> cls) {
        this.method = str;
        this.params = list;
        this.f46367id = nextId.getAndIncrement();
        this.web3jService = xj7;
        this.responseType = cls;
    }
}
