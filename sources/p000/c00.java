package p000;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java8.util.concurrent.CompletableFuture;

/* renamed from: c00 */
/* compiled from: BatchRequest */
public class c00 {
    private List<zd5<?, ? extends ag5<?>>> requests = new ArrayList();
    private xj7 web3jService;

    public c00(xj7 xj7) {
        this.web3jService = xj7;
    }

    public c00 add(zd5<?, ? extends ag5<?>> zd5) {
        this.requests.add(zd5);
        return this;
    }

    public List<zd5<?, ? extends ag5<?>>> getRequests() {
        return this.requests;
    }

    public d00 send() throws IOException {
        return this.web3jService.sendBatch(this);
    }

    public CompletableFuture<d00> sendAsync() {
        return this.web3jService.sendBatchAsync(this);
    }
}
