package p000;

import com.fasterxml.jackson.core.C1979c;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java8.util.concurrent.CompletableFuture;

/* renamed from: gx5 */
/* compiled from: Service */
public abstract class gx5 implements xj7 {
    public final ObjectMapper objectMapper;

    public gx5(boolean z) {
        this.objectMapper = ef4.getObjectMapper(z);
    }

    public abstract /* synthetic */ void close() throws IOException;

    public abstract InputStream performIO(String str) throws IOException;

    /* renamed from: send */
    public <T extends ag5> T lambda$sendAsync$0(zd5 zd5, Class<T> cls) throws IOException {
        InputStream performIO = performIO(this.objectMapper.writeValueAsString(zd5));
        if (performIO != null) {
            try {
                return (ag5) this.objectMapper.readValue(performIO, cls);
            } finally {
                performIO.close();
            }
        } else {
            if (performIO != null) {
                performIO.close();
            }
            return null;
        }
    }

    public <T extends ag5> CompletableFuture<T> sendAsync(zd5 zd5, Class<T> cls) {
        return C9649yr.run(new ex5(this, zd5, cls));
    }

    /* renamed from: sendBatch */
    public d00 lambda$sendBatchAsync$1(c00 c00) throws IOException {
        if (c00.getRequests().isEmpty()) {
            return new d00(Collections.emptyList(), Collections.emptyList());
        }
        InputStream performIO = performIO(this.objectMapper.writeValueAsString(c00.getRequests()));
        if (performIO == null) {
            return null;
        }
        try {
            ArrayNode arrayNode = (ArrayNode) this.objectMapper.readTree(performIO);
            ArrayList arrayList = new ArrayList(arrayNode.size());
            for (int i = 0; i < arrayNode.size(); i++) {
                arrayList.add((ag5) this.objectMapper.treeToValue((C1979c) arrayNode.get(i), c00.getRequests().get(i).getResponseType()));
            }
            return new d00(c00.getRequests(), arrayList);
        } catch (IOException e) {
            performIO.close();
            throw e;
        }
    }

    public CompletableFuture<d00> sendBatchAsync(c00 c00) {
        return C9649yr.run(new dx5(this, c00));
    }

    public <T extends u84<?>> g52<T> subscribe(zd5 zd5, String str, Class<T> cls) {
        throw new UnsupportedOperationException(String.format("Service %s does not support subscriptions", new Object[]{getClass().getSimpleName()}));
    }
}
