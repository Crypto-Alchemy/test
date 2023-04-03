package p000;

import java.io.IOException;
import java8.util.concurrent.CompletableFuture;

/* renamed from: xj7 */
/* compiled from: Web3jService */
public interface xj7 {
    void close() throws IOException;

    <T extends ag5> T send(zd5 zd5, Class<T> cls) throws IOException;

    <T extends ag5> CompletableFuture<T> sendAsync(zd5 zd5, Class<T> cls);

    d00 sendBatch(c00 c00) throws IOException;

    CompletableFuture<d00> sendBatchAsync(c00 c00);

    <T extends u84<?>> g52<T> subscribe(zd5 zd5, String str, Class<T> cls);
}
