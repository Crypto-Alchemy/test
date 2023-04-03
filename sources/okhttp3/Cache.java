package okhttp3;

import com.fasterxml.jackson.core.JsonFactory;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.cache.CacheStrategy;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.p022io.FileSystem;
import okhttp3.internal.platform.Platform;
import okio.ByteString;
import org.slf4j.Marker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010)\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 K2\u00020\u00012\u00020\u0002:\u0004LKMNB!\b\u0000\u0012\u0006\u0010,\u001a\u00020)\u0012\u0006\u0010&\u001a\u00020$\u0012\u0006\u0010G\u001a\u00020F¢\u0006\u0004\bH\u0010IB\u0019\b\u0016\u0012\u0006\u0010,\u001a\u00020)\u0012\u0006\u0010&\u001a\u00020$¢\u0006\u0004\bH\u0010JJ\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0018\u00010\u0003R\u00020\u0004H\u0002J\u0019\u0010\r\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0006\u0010\u001b\u001a\u00020\u0006J\u0006\u0010\u001c\u001a\u00020\u0006J\u0006\u0010\u001d\u001a\u00020\u0006J\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eJ\u0006\u0010\"\u001a\u00020!J\u0006\u0010#\u001a\u00020!J\u0006\u0010%\u001a\u00020$J\u0006\u0010&\u001a\u00020$J\b\u0010'\u001a\u00020\u0006H\u0016J\b\u0010(\u001a\u00020\u0006H\u0016J\u000f\u0010,\u001a\u00020)H\u0007¢\u0006\u0004\b*\u0010+J\u0017\u00101\u001a\u00020\u00062\u0006\u0010.\u001a\u00020-H\u0000¢\u0006\u0004\b/\u00100J\u000f\u00104\u001a\u00020\u0006H\u0000¢\u0006\u0004\b2\u00103J\u0006\u00105\u001a\u00020!J\u0006\u00106\u001a\u00020!J\u0006\u00107\u001a\u00020!R\u001a\u00108\u001a\u00020\u00048\u0000X\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\"\u0010#\u001a\u00020!8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b#\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010\"\u001a\u00020!8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\"\u0010<\u001a\u0004\bA\u0010>\"\u0004\bB\u0010@R\u0016\u00105\u001a\u00020!8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b5\u0010<R\u0016\u00106\u001a\u00020!8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b6\u0010<R\u0016\u00107\u001a\u00020!8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b7\u0010<R\u0011\u0010D\u001a\u00020C8F¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0011\u0010,\u001a\u00020)8G¢\u0006\u0006\u001a\u0004\b,\u0010+¨\u0006O"}, mo44877d2 = {"Lokhttp3/Cache;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "Lokhttp3/internal/cache/DiskLruCache;", "editor", "Lr37;", "abortQuietly", "Lokhttp3/Request;", "request", "Lokhttp3/Response;", "get$okhttp", "(Lokhttp3/Request;)Lokhttp3/Response;", "get", "response", "Lokhttp3/internal/cache/CacheRequest;", "put$okhttp", "(Lokhttp3/Response;)Lokhttp3/internal/cache/CacheRequest;", "put", "remove$okhttp", "(Lokhttp3/Request;)V", "remove", "cached", "network", "update$okhttp", "(Lokhttp3/Response;Lokhttp3/Response;)V", "update", "initialize", "delete", "evictAll", "", "", "urls", "", "writeAbortCount", "writeSuccessCount", "", "size", "maxSize", "flush", "close", "Ljava/io/File;", "-deprecated_directory", "()Ljava/io/File;", "directory", "Lokhttp3/internal/cache/CacheStrategy;", "cacheStrategy", "trackResponse$okhttp", "(Lokhttp3/internal/cache/CacheStrategy;)V", "trackResponse", "trackConditionalCacheHit$okhttp", "()V", "trackConditionalCacheHit", "networkCount", "hitCount", "requestCount", "cache", "Lokhttp3/internal/cache/DiskLruCache;", "getCache$okhttp", "()Lokhttp3/internal/cache/DiskLruCache;", "I", "getWriteSuccessCount$okhttp", "()I", "setWriteSuccessCount$okhttp", "(I)V", "getWriteAbortCount$okhttp", "setWriteAbortCount$okhttp", "", "isClosed", "()Z", "Lokhttp3/internal/io/FileSystem;", "fileSystem", "<init>", "(Ljava/io/File;JLokhttp3/internal/io/FileSystem;)V", "(Ljava/io/File;J)V", "Companion", "CacheResponseBody", "Entry", "RealCacheRequest", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: Cache.kt */
public final class Cache implements Closeable, Flushable {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final int ENTRY_BODY = 1;
    private static final int ENTRY_COUNT = 2;
    private static final int ENTRY_METADATA = 0;
    private static final int VERSION = 201105;
    private final DiskLruCache cache;
    private int hitCount;
    private int networkCount;
    private int requestCount;
    private int writeAbortCount;
    private int writeSuccessCount;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B'\u0012\n\u0010\n\u001a\u00060\bR\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u001b\u0010\n\u001a\u00060\bR\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, mo44877d2 = {"Lokhttp3/Cache$CacheResponseBody;", "Lokhttp3/ResponseBody;", "Lokhttp3/MediaType;", "contentType", "", "contentLength", "Lw40;", "source", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Lokhttp3/internal/cache/DiskLruCache;", "snapshot", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "getSnapshot", "()Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "", "Ljava/lang/String;", "bodySource", "Lw40;", "<init>", "(Lokhttp3/internal/cache/DiskLruCache$Snapshot;Ljava/lang/String;Ljava/lang/String;)V", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* compiled from: Cache.kt */
    public static final class CacheResponseBody extends ResponseBody {
        private final w40 bodySource;
        private final String contentLength;
        private final String contentType;
        private final DiskLruCache.Snapshot snapshot;

        public CacheResponseBody(DiskLruCache.Snapshot snapshot2, String str, String str2) {
            vx2.m53591g(snapshot2, "snapshot");
            this.snapshot = snapshot2;
            this.contentType = str;
            this.contentLength = str2;
            this.bodySource = sg4.m71929d(new q82(snapshot2.getSource(1), this) {
                public final /* synthetic */ z56 $source;
                public final /* synthetic */ CacheResponseBody this$0;

                {
                    this.$source = r1;
                    this.this$0 = r2;
                }

                public void close() throws IOException {
                    this.this$0.getSnapshot().close();
                    super.close();
                }
            });
        }

        public long contentLength() {
            String str = this.contentLength;
            if (str == null) {
                return -1;
            }
            return Util.toLongOrDefault(str, -1);
        }

        public MediaType contentType() {
            String str = this.contentType;
            if (str == null) {
                return null;
            }
            return MediaType.Companion.parse(str);
        }

        public final DiskLruCache.Snapshot getSnapshot() {
            return this.snapshot;
        }

        public w40 source() {
            return this.bodySource;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\b\u001a\u00060\u0006R\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0018\u0010\b\u001a\u00060\u0006R\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000bR\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, mo44877d2 = {"Lokhttp3/Cache$RealCacheRequest;", "Lokhttp3/internal/cache/CacheRequest;", "Lr37;", "abort", "Ls36;", "body", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "Lokhttp3/internal/cache/DiskLruCache;", "editor", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "cacheOut", "Ls36;", "", "done", "Z", "getDone", "()Z", "setDone", "(Z)V", "<init>", "(Lokhttp3/Cache;Lokhttp3/internal/cache/DiskLruCache$Editor;)V", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* compiled from: Cache.kt */
    public final class RealCacheRequest implements CacheRequest {
        private final s36 body;
        private final s36 cacheOut;
        private boolean done;
        /* access modifiers changed from: private */
        public final DiskLruCache.Editor editor;
        public final /* synthetic */ Cache this$0;

        public RealCacheRequest(final Cache cache, DiskLruCache.Editor editor2) {
            vx2.m53591g(cache, "this$0");
            vx2.m53591g(editor2, "editor");
            this.this$0 = cache;
            this.editor = editor2;
            s36 newSink = editor2.newSink(1);
            this.cacheOut = newSink;
            this.body = new p82(newSink) {
                public void close() throws IOException {
                    Cache cache = cache;
                    RealCacheRequest realCacheRequest = this;
                    synchronized (cache) {
                        if (!realCacheRequest.getDone()) {
                            realCacheRequest.setDone(true);
                            cache.setWriteSuccessCount$okhttp(cache.getWriteSuccessCount$okhttp() + 1);
                            super.close();
                            this.editor.commit();
                        }
                    }
                }
            };
        }

        public void abort() {
            Cache cache = this.this$0;
            synchronized (cache) {
                if (!getDone()) {
                    setDone(true);
                    cache.setWriteAbortCount$okhttp(cache.getWriteAbortCount$okhttp() + 1);
                    Util.closeQuietly((Closeable) this.cacheOut);
                    try {
                        this.editor.abort();
                    } catch (IOException unused) {
                    }
                }
            }
        }

        public s36 body() {
            return this.body;
        }

        public final boolean getDone() {
            return this.done;
        }

        public final void setDone(boolean z) {
            this.done = z;
        }
    }

    public Cache(File file, long j, FileSystem fileSystem) {
        vx2.m53591g(file, "directory");
        vx2.m53591g(fileSystem, "fileSystem");
        this.cache = new DiskLruCache(fileSystem, file, VERSION, 2, j, TaskRunner.INSTANCE);
    }

    private final void abortQuietly(DiskLruCache.Editor editor) {
        if (editor != null) {
            try {
                editor.abort();
            } catch (IOException unused) {
            }
        }
    }

    public static final String key(HttpUrl httpUrl) {
        return Companion.key(httpUrl);
    }

    /* renamed from: -deprecated_directory  reason: not valid java name */
    public final File m75657deprecated_directory() {
        return this.cache.getDirectory();
    }

    public void close() throws IOException {
        this.cache.close();
    }

    public final void delete() throws IOException {
        this.cache.delete();
    }

    public final File directory() {
        return this.cache.getDirectory();
    }

    public final void evictAll() throws IOException {
        this.cache.evictAll();
    }

    public void flush() throws IOException {
        this.cache.flush();
    }

    public final Response get$okhttp(Request request) {
        vx2.m53591g(request, "request");
        try {
            DiskLruCache.Snapshot snapshot = this.cache.get(Companion.key(request.url()));
            if (snapshot == null) {
                return null;
            }
            try {
                Entry entry = new Entry(snapshot.getSource(0));
                Response response = entry.response(snapshot);
                if (entry.matches(request, response)) {
                    return response;
                }
                ResponseBody body = response.body();
                if (body != null) {
                    Util.closeQuietly((Closeable) body);
                }
                return null;
            } catch (IOException unused) {
                Util.closeQuietly((Closeable) snapshot);
                return null;
            }
        } catch (IOException unused2) {
            return null;
        }
    }

    public final DiskLruCache getCache$okhttp() {
        return this.cache;
    }

    public final int getWriteAbortCount$okhttp() {
        return this.writeAbortCount;
    }

    public final int getWriteSuccessCount$okhttp() {
        return this.writeSuccessCount;
    }

    public final synchronized int hitCount() {
        return this.hitCount;
    }

    public final void initialize() throws IOException {
        this.cache.initialize();
    }

    public final boolean isClosed() {
        return this.cache.isClosed();
    }

    public final long maxSize() {
        return this.cache.getMaxSize();
    }

    public final synchronized int networkCount() {
        return this.networkCount;
    }

    public final CacheRequest put$okhttp(Response response) {
        DiskLruCache.Editor editor;
        vx2.m53591g(response, "response");
        String method = response.request().method();
        if (HttpMethod.INSTANCE.invalidatesCache(response.request().method())) {
            try {
                remove$okhttp(response.request());
            } catch (IOException unused) {
            }
            return null;
        } else if (!vx2.m53586b(method, "GET")) {
            return null;
        } else {
            Companion companion = Companion;
            if (companion.hasVaryAll(response)) {
                return null;
            }
            Entry entry = new Entry(response);
            try {
                editor = DiskLruCache.edit$default(this.cache, companion.key(response.request().url()), 0, 2, (Object) null);
                if (editor == null) {
                    return null;
                }
                try {
                    entry.writeTo(editor);
                    return new RealCacheRequest(this, editor);
                } catch (IOException unused2) {
                    abortQuietly(editor);
                    return null;
                }
            } catch (IOException unused3) {
                editor = null;
                abortQuietly(editor);
                return null;
            }
        }
    }

    public final void remove$okhttp(Request request) throws IOException {
        vx2.m53591g(request, "request");
        this.cache.remove(Companion.key(request.url()));
    }

    public final synchronized int requestCount() {
        return this.requestCount;
    }

    public final void setWriteAbortCount$okhttp(int i) {
        this.writeAbortCount = i;
    }

    public final void setWriteSuccessCount$okhttp(int i) {
        this.writeSuccessCount = i;
    }

    public final long size() throws IOException {
        return this.cache.size();
    }

    public final synchronized void trackConditionalCacheHit$okhttp() {
        this.hitCount++;
    }

    public final synchronized void trackResponse$okhttp(CacheStrategy cacheStrategy) {
        vx2.m53591g(cacheStrategy, "cacheStrategy");
        this.requestCount++;
        if (cacheStrategy.getNetworkRequest() != null) {
            this.networkCount++;
        } else if (cacheStrategy.getCacheResponse() != null) {
            this.hitCount++;
        }
    }

    public final void update$okhttp(Response response, Response response2) {
        vx2.m53591g(response, "cached");
        vx2.m53591g(response2, "network");
        Entry entry = new Entry(response2);
        ResponseBody body = response.body();
        if (body != null) {
            try {
                DiskLruCache.Editor edit = ((CacheResponseBody) body).getSnapshot().edit();
                if (edit != null) {
                    entry.writeTo(edit);
                    edit.commit();
                }
            } catch (IOException unused) {
                abortQuietly((DiskLruCache.Editor) null);
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
        }
    }

    public final Iterator<String> urls() throws IOException {
        return new Cache$urls$1(this);
    }

    public final synchronized int writeAbortCount() {
        return this.writeAbortCount;
    }

    public final synchronized int writeSuccessCount() {
        return this.writeSuccessCount;
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015J\n\u0010\u0019\u001a\u00020\u0017*\u00020\u0012J\n\u0010\b\u001a\u00020\u0002*\u00020\u0012R\u0014\u0010\u001a\u001a\u00020\u000e8\u0002XT¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u000e8\u0002XT¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u000e8\u0002XT¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u000e8\u0002XT¢\u0006\u0006\n\u0004\b\u001e\u0010\u001b¨\u0006!"}, mo44877d2 = {"Lokhttp3/Cache$Companion;", "", "Lokhttp3/Headers;", "", "", "varyFields", "requestHeaders", "responseHeaders", "varyHeaders", "Lokhttp3/HttpUrl;", "url", "key", "Lw40;", "source", "", "readInt$okhttp", "(Lw40;)I", "readInt", "Lokhttp3/Response;", "cachedResponse", "cachedRequest", "Lokhttp3/Request;", "newRequest", "", "varyMatches", "hasVaryAll", "ENTRY_BODY", "I", "ENTRY_COUNT", "ENTRY_METADATA", "VERSION", "<init>", "()V", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* compiled from: Cache.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Set<String> varyFields(Headers headers) {
            int size = headers.size();
            TreeSet treeSet = null;
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                if (yb6.m74344y("Vary", headers.name(i), true)) {
                    String value = headers.value(i);
                    if (treeSet == null) {
                        treeSet = new TreeSet(yb6.m74324A(cb6.f21669a));
                    }
                    for (String V0 : StringsKt__StringsKt.m63060A0(value, new char[]{','}, false, 0, 6, (Object) null)) {
                        treeSet.add(StringsKt__StringsKt.m63090V0(V0).toString());
                    }
                }
                i = i2;
            }
            if (treeSet == null) {
                return ny5.m49095e();
            }
            return treeSet;
        }

        public final boolean hasVaryAll(Response response) {
            vx2.m53591g(response, "<this>");
            return varyFields(response.headers()).contains(Marker.ANY_MARKER);
        }

        public final String key(HttpUrl httpUrl) {
            vx2.m53591g(httpUrl, "url");
            return ByteString.Companion.mo64480d(httpUrl.toString()).md5().hex();
        }

        public final int readInt$okhttp(w40 w40) throws IOException {
            boolean z;
            vx2.m53591g(w40, "source");
            try {
                long M0 = w40.mo56031M0();
                String m0 = w40.mo56072m0();
                if (M0 >= 0 && M0 <= 2147483647L) {
                    if (m0.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        return (int) M0;
                    }
                }
                throw new IOException("expected an int but was \"" + M0 + m0 + JsonFactory.DEFAULT_QUOTE_CHAR);
            } catch (NumberFormatException e) {
                throw new IOException(e.getMessage());
            }
        }

        public final Headers varyHeaders(Response response) {
            vx2.m53591g(response, "<this>");
            Response networkResponse = response.networkResponse();
            vx2.m53588d(networkResponse);
            return varyHeaders(networkResponse.request().headers(), response.headers());
        }

        public final boolean varyMatches(Response response, Headers headers, Request request) {
            vx2.m53591g(response, "cachedResponse");
            vx2.m53591g(headers, "cachedRequest");
            vx2.m53591g(request, "newRequest");
            Set<String> varyFields = varyFields(response.headers());
            if ((varyFields instanceof Collection) && varyFields.isEmpty()) {
                return true;
            }
            for (String str : varyFields) {
                if (!vx2.m53586b(headers.values(str), request.headers(str))) {
                    return false;
                }
            }
            return true;
        }

        private final Headers varyHeaders(Headers headers, Headers headers2) {
            Set<String> varyFields = varyFields(headers2);
            if (varyFields.isEmpty()) {
                return Util.EMPTY_HEADERS;
            }
            Headers.Builder builder = new Headers.Builder();
            int i = 0;
            int size = headers.size();
            while (i < size) {
                int i2 = i + 1;
                String name = headers.name(i);
                if (varyFields.contains(name)) {
                    builder.add(name, headers.value(i));
                }
                i = i2;
            }
            return builder.build();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Cache(File file, long j) {
        this(file, j, FileSystem.SYSTEM);
        vx2.m53591g(file, "directory");
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000 72\u00020\u0001:\u00017B\u0011\b\u0016\u0012\u0006\u00103\u001a\u000202¢\u0006\u0004\b4\u00105B\u0011\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b4\u00106J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u0012\u0010\u000f\u001a\u00020\n2\n\u0010\u000e\u001a\u00060\fR\u00020\rJ\u0016\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012J\u0012\u0010\u0013\u001a\u00020\u00122\n\u0010\u0017\u001a\u00060\u0016R\u00020\rR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010 R\u0014\u0010(\u001a\u00020\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010\u001dR\u0016\u0010*\u001a\u0004\u0018\u00010)8\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020,8\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u0010.R\u0014\u00100\u001a\u00020\u00148BX\u0004¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00068"}, mo44877d2 = {"Lokhttp3/Cache$Entry;", "", "Lw40;", "source", "", "Ljava/security/cert/Certificate;", "readCertificateList", "Lv40;", "sink", "certificates", "Lr37;", "writeCertList", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "Lokhttp3/internal/cache/DiskLruCache;", "editor", "writeTo", "Lokhttp3/Request;", "request", "Lokhttp3/Response;", "response", "", "matches", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "snapshot", "Lokhttp3/HttpUrl;", "url", "Lokhttp3/HttpUrl;", "Lokhttp3/Headers;", "varyHeaders", "Lokhttp3/Headers;", "", "requestMethod", "Ljava/lang/String;", "Lokhttp3/Protocol;", "protocol", "Lokhttp3/Protocol;", "", "code", "I", "message", "responseHeaders", "Lokhttp3/Handshake;", "handshake", "Lokhttp3/Handshake;", "", "sentRequestMillis", "J", "receivedResponseMillis", "isHttps", "()Z", "Lz56;", "rawSource", "<init>", "(Lz56;)V", "(Lokhttp3/Response;)V", "Companion", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* compiled from: Cache.kt */
    public static final class Entry {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        private static final String RECEIVED_MILLIS;
        private static final String SENT_MILLIS;
        private final int code;
        private final Handshake handshake;
        private final String message;
        private final Protocol protocol;
        private final long receivedResponseMillis;
        private final String requestMethod;
        private final Headers responseHeaders;
        private final long sentRequestMillis;
        private final HttpUrl url;
        private final Headers varyHeaders;

        @Metadata(mo44876d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, mo44877d2 = {"Lokhttp3/Cache$Entry$Companion;", "", "()V", "RECEIVED_MILLIS", "", "SENT_MILLIS", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0}, mo44881xi = 48)
        /* compiled from: Cache.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            Platform.Companion companion = Platform.Companion;
            SENT_MILLIS = vx2.m53598n(companion.get().getPrefix(), "-Sent-Millis");
            RECEIVED_MILLIS = vx2.m53598n(companion.get().getPrefix(), "-Received-Millis");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:41:0x011a, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x011b, code lost:
            p000.lh0.m47807a(r10, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x011e, code lost:
            throw r1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public Entry(p000.z56 r10) throws java.io.IOException {
            /*
                r9 = this;
                java.lang.String r0 = "rawSource"
                p000.vx2.m53591g(r10, r0)
                r9.<init>()
                w40 r0 = p000.sg4.m71929d(r10)     // Catch:{ all -> 0x0118 }
                java.lang.String r1 = r0.mo56072m0()     // Catch:{ all -> 0x0118 }
                okhttp3.HttpUrl$Companion r2 = okhttp3.HttpUrl.Companion     // Catch:{ all -> 0x0118 }
                okhttp3.HttpUrl r2 = r2.parse(r1)     // Catch:{ all -> 0x0118 }
                if (r2 == 0) goto L_0x0100
                r9.url = r2     // Catch:{ all -> 0x0118 }
                java.lang.String r1 = r0.mo56072m0()     // Catch:{ all -> 0x0118 }
                r9.requestMethod = r1     // Catch:{ all -> 0x0118 }
                okhttp3.Headers$Builder r1 = new okhttp3.Headers$Builder     // Catch:{ all -> 0x0118 }
                r1.<init>()     // Catch:{ all -> 0x0118 }
                okhttp3.Cache$Companion r2 = okhttp3.Cache.Companion     // Catch:{ all -> 0x0118 }
                int r2 = r2.readInt$okhttp(r0)     // Catch:{ all -> 0x0118 }
                r3 = 0
                r4 = r3
            L_0x002d:
                if (r4 >= r2) goto L_0x0039
                int r4 = r4 + 1
                java.lang.String r5 = r0.mo56072m0()     // Catch:{ all -> 0x0118 }
                r1.addLenient$okhttp(r5)     // Catch:{ all -> 0x0118 }
                goto L_0x002d
            L_0x0039:
                okhttp3.Headers r1 = r1.build()     // Catch:{ all -> 0x0118 }
                r9.varyHeaders = r1     // Catch:{ all -> 0x0118 }
                okhttp3.internal.http.StatusLine$Companion r1 = okhttp3.internal.http.StatusLine.Companion     // Catch:{ all -> 0x0118 }
                java.lang.String r2 = r0.mo56072m0()     // Catch:{ all -> 0x0118 }
                okhttp3.internal.http.StatusLine r1 = r1.parse(r2)     // Catch:{ all -> 0x0118 }
                okhttp3.Protocol r2 = r1.protocol     // Catch:{ all -> 0x0118 }
                r9.protocol = r2     // Catch:{ all -> 0x0118 }
                int r2 = r1.code     // Catch:{ all -> 0x0118 }
                r9.code = r2     // Catch:{ all -> 0x0118 }
                java.lang.String r1 = r1.message     // Catch:{ all -> 0x0118 }
                r9.message = r1     // Catch:{ all -> 0x0118 }
                okhttp3.Headers$Builder r1 = new okhttp3.Headers$Builder     // Catch:{ all -> 0x0118 }
                r1.<init>()     // Catch:{ all -> 0x0118 }
                okhttp3.Cache$Companion r2 = okhttp3.Cache.Companion     // Catch:{ all -> 0x0118 }
                int r2 = r2.readInt$okhttp(r0)     // Catch:{ all -> 0x0118 }
                r4 = r3
            L_0x0061:
                if (r4 >= r2) goto L_0x006d
                int r4 = r4 + 1
                java.lang.String r5 = r0.mo56072m0()     // Catch:{ all -> 0x0118 }
                r1.addLenient$okhttp(r5)     // Catch:{ all -> 0x0118 }
                goto L_0x0061
            L_0x006d:
                java.lang.String r2 = SENT_MILLIS     // Catch:{ all -> 0x0118 }
                java.lang.String r4 = r1.get(r2)     // Catch:{ all -> 0x0118 }
                java.lang.String r5 = RECEIVED_MILLIS     // Catch:{ all -> 0x0118 }
                java.lang.String r6 = r1.get(r5)     // Catch:{ all -> 0x0118 }
                r1.removeAll(r2)     // Catch:{ all -> 0x0118 }
                r1.removeAll(r5)     // Catch:{ all -> 0x0118 }
                r7 = 0
                if (r4 != 0) goto L_0x0085
                r4 = r7
                goto L_0x0089
            L_0x0085:
                long r4 = java.lang.Long.parseLong(r4)     // Catch:{ all -> 0x0118 }
            L_0x0089:
                r9.sentRequestMillis = r4     // Catch:{ all -> 0x0118 }
                if (r6 != 0) goto L_0x008e
                goto L_0x0092
            L_0x008e:
                long r7 = java.lang.Long.parseLong(r6)     // Catch:{ all -> 0x0118 }
            L_0x0092:
                r9.receivedResponseMillis = r7     // Catch:{ all -> 0x0118 }
                okhttp3.Headers r1 = r1.build()     // Catch:{ all -> 0x0118 }
                r9.responseHeaders = r1     // Catch:{ all -> 0x0118 }
                boolean r1 = r9.isHttps()     // Catch:{ all -> 0x0118 }
                r2 = 0
                if (r1 == 0) goto L_0x00f8
                java.lang.String r1 = r0.mo56072m0()     // Catch:{ all -> 0x0118 }
                int r4 = r1.length()     // Catch:{ all -> 0x0118 }
                if (r4 <= 0) goto L_0x00ac
                r3 = 1
            L_0x00ac:
                if (r3 != 0) goto L_0x00dc
                java.lang.String r1 = r0.mo56072m0()     // Catch:{ all -> 0x0118 }
                okhttp3.CipherSuite$Companion r3 = okhttp3.CipherSuite.Companion     // Catch:{ all -> 0x0118 }
                okhttp3.CipherSuite r1 = r3.forJavaName(r1)     // Catch:{ all -> 0x0118 }
                java.util.List r3 = r9.readCertificateList(r0)     // Catch:{ all -> 0x0118 }
                java.util.List r4 = r9.readCertificateList(r0)     // Catch:{ all -> 0x0118 }
                boolean r5 = r0.mo56024I0()     // Catch:{ all -> 0x0118 }
                if (r5 != 0) goto L_0x00d1
                okhttp3.TlsVersion$Companion r5 = okhttp3.TlsVersion.Companion     // Catch:{ all -> 0x0118 }
                java.lang.String r0 = r0.mo56072m0()     // Catch:{ all -> 0x0118 }
                okhttp3.TlsVersion r0 = r5.forJavaName(r0)     // Catch:{ all -> 0x0118 }
                goto L_0x00d3
            L_0x00d1:
                okhttp3.TlsVersion r0 = okhttp3.TlsVersion.SSL_3_0     // Catch:{ all -> 0x0118 }
            L_0x00d3:
                okhttp3.Handshake$Companion r5 = okhttp3.Handshake.Companion     // Catch:{ all -> 0x0118 }
                okhttp3.Handshake r0 = r5.get(r0, r1, r3, r4)     // Catch:{ all -> 0x0118 }
                r9.handshake = r0     // Catch:{ all -> 0x0118 }
                goto L_0x00fa
            L_0x00dc:
                java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0118 }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0118 }
                r2.<init>()     // Catch:{ all -> 0x0118 }
                java.lang.String r3 = "expected \"\" but was \""
                r2.append(r3)     // Catch:{ all -> 0x0118 }
                r2.append(r1)     // Catch:{ all -> 0x0118 }
                r1 = 34
                r2.append(r1)     // Catch:{ all -> 0x0118 }
                java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x0118 }
                r0.<init>(r1)     // Catch:{ all -> 0x0118 }
                throw r0     // Catch:{ all -> 0x0118 }
            L_0x00f8:
                r9.handshake = r2     // Catch:{ all -> 0x0118 }
            L_0x00fa:
                r37 r0 = p000.r37.f33317a     // Catch:{ all -> 0x0118 }
                p000.lh0.m47807a(r10, r2)
                return
            L_0x0100:
                java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0118 }
                java.lang.String r2 = "Cache corruption for "
                java.lang.String r1 = p000.vx2.m53598n(r2, r1)     // Catch:{ all -> 0x0118 }
                r0.<init>(r1)     // Catch:{ all -> 0x0118 }
                okhttp3.internal.platform.Platform$Companion r1 = okhttp3.internal.platform.Platform.Companion     // Catch:{ all -> 0x0118 }
                okhttp3.internal.platform.Platform r1 = r1.get()     // Catch:{ all -> 0x0118 }
                java.lang.String r2 = "cache corruption"
                r3 = 5
                r1.log(r2, r3, r0)     // Catch:{ all -> 0x0118 }
                throw r0     // Catch:{ all -> 0x0118 }
            L_0x0118:
                r0 = move-exception
                throw r0     // Catch:{ all -> 0x011a }
            L_0x011a:
                r1 = move-exception
                p000.lh0.m47807a(r10, r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.Cache.Entry.<init>(z56):void");
        }

        private final boolean isHttps() {
            return vx2.m53586b(this.url.scheme(), "https");
        }

        private final List<Certificate> readCertificateList(w40 w40) throws IOException {
            int readInt$okhttp = Cache.Companion.readInt$okhttp(w40);
            if (readInt$okhttp == -1) {
                return ck0.m33062j();
            }
            try {
                CertificateFactory instance = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(readInt$okhttp);
                int i = 0;
                while (i < readInt$okhttp) {
                    i++;
                    String m0 = w40.mo56072m0();
                    m40 m40 = new m40();
                    ByteString a = ByteString.Companion.mo64477a(m0);
                    vx2.m53588d(a);
                    m40.mo56054e1(a);
                    arrayList.add(instance.generateCertificate(m40.mo56078p1()));
                }
                return arrayList;
            } catch (CertificateException e) {
                throw new IOException(e.getMessage());
            }
        }

        private final void writeCertList(v40 v40, List<? extends Certificate> list) throws IOException {
            try {
                v40.mo56096w0((long) list.size()).writeByte(10);
                for (Certificate encoded : list) {
                    byte[] encoded2 = encoded.getEncoded();
                    ByteString.C9034a aVar = ByteString.Companion;
                    vx2.m53590f(encoded2, "bytes");
                    v40.mo56044Z(ByteString.C9034a.m70311h(aVar, encoded2, 0, 0, 3, (Object) null).base64()).writeByte(10);
                }
            } catch (CertificateEncodingException e) {
                throw new IOException(e.getMessage());
            }
        }

        public final boolean matches(Request request, Response response) {
            vx2.m53591g(request, "request");
            vx2.m53591g(response, "response");
            if (!vx2.m53586b(this.url, request.url()) || !vx2.m53586b(this.requestMethod, request.method()) || !Cache.Companion.varyMatches(response, this.varyHeaders, request)) {
                return false;
            }
            return true;
        }

        public final Response response(DiskLruCache.Snapshot snapshot) {
            vx2.m53591g(snapshot, "snapshot");
            String str = this.responseHeaders.get("Content-Type");
            String str2 = this.responseHeaders.get("Content-Length");
            return new Response.Builder().request(new Request.Builder().url(this.url).method(this.requestMethod, (RequestBody) null).headers(this.varyHeaders).build()).protocol(this.protocol).code(this.code).message(this.message).headers(this.responseHeaders).body(new CacheResponseBody(snapshot, str, str2)).handshake(this.handshake).sentRequestAtMillis(this.sentRequestMillis).receivedResponseAtMillis(this.receivedResponseMillis).build();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:0x011a, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x011b, code lost:
            p000.lh0.m47807a(r8, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x011e, code lost:
            throw r1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void writeTo(okhttp3.internal.cache.DiskLruCache.Editor r8) throws java.io.IOException {
            /*
                r7 = this;
                java.lang.String r0 = "editor"
                p000.vx2.m53591g(r8, r0)
                r0 = 0
                s36 r8 = r8.newSink(r0)
                v40 r8 = p000.sg4.m71928c(r8)
                okhttp3.HttpUrl r1 = r7.url     // Catch:{ all -> 0x0118 }
                java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0118 }
                v40 r1 = r8.mo56044Z(r1)     // Catch:{ all -> 0x0118 }
                r2 = 10
                r1.writeByte(r2)     // Catch:{ all -> 0x0118 }
                java.lang.String r1 = r7.requestMethod     // Catch:{ all -> 0x0118 }
                v40 r1 = r8.mo56044Z(r1)     // Catch:{ all -> 0x0118 }
                r1.writeByte(r2)     // Catch:{ all -> 0x0118 }
                okhttp3.Headers r1 = r7.varyHeaders     // Catch:{ all -> 0x0118 }
                int r1 = r1.size()     // Catch:{ all -> 0x0118 }
                long r3 = (long) r1     // Catch:{ all -> 0x0118 }
                v40 r1 = r8.mo56096w0(r3)     // Catch:{ all -> 0x0118 }
                r1.writeByte(r2)     // Catch:{ all -> 0x0118 }
                okhttp3.Headers r1 = r7.varyHeaders     // Catch:{ all -> 0x0118 }
                int r1 = r1.size()     // Catch:{ all -> 0x0118 }
                r3 = r0
            L_0x003b:
                java.lang.String r4 = ": "
                if (r3 >= r1) goto L_0x005e
                int r5 = r3 + 1
                okhttp3.Headers r6 = r7.varyHeaders     // Catch:{ all -> 0x0118 }
                java.lang.String r6 = r6.name(r3)     // Catch:{ all -> 0x0118 }
                v40 r6 = r8.mo56044Z(r6)     // Catch:{ all -> 0x0118 }
                v40 r4 = r6.mo56044Z(r4)     // Catch:{ all -> 0x0118 }
                okhttp3.Headers r6 = r7.varyHeaders     // Catch:{ all -> 0x0118 }
                java.lang.String r3 = r6.value(r3)     // Catch:{ all -> 0x0118 }
                v40 r3 = r4.mo56044Z(r3)     // Catch:{ all -> 0x0118 }
                r3.writeByte(r2)     // Catch:{ all -> 0x0118 }
                r3 = r5
                goto L_0x003b
            L_0x005e:
                okhttp3.internal.http.StatusLine r1 = new okhttp3.internal.http.StatusLine     // Catch:{ all -> 0x0118 }
                okhttp3.Protocol r3 = r7.protocol     // Catch:{ all -> 0x0118 }
                int r5 = r7.code     // Catch:{ all -> 0x0118 }
                java.lang.String r6 = r7.message     // Catch:{ all -> 0x0118 }
                r1.<init>(r3, r5, r6)     // Catch:{ all -> 0x0118 }
                java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0118 }
                v40 r1 = r8.mo56044Z(r1)     // Catch:{ all -> 0x0118 }
                r1.writeByte(r2)     // Catch:{ all -> 0x0118 }
                okhttp3.Headers r1 = r7.responseHeaders     // Catch:{ all -> 0x0118 }
                int r1 = r1.size()     // Catch:{ all -> 0x0118 }
                int r1 = r1 + 2
                long r5 = (long) r1     // Catch:{ all -> 0x0118 }
                v40 r1 = r8.mo56096w0(r5)     // Catch:{ all -> 0x0118 }
                r1.writeByte(r2)     // Catch:{ all -> 0x0118 }
                okhttp3.Headers r1 = r7.responseHeaders     // Catch:{ all -> 0x0118 }
                int r1 = r1.size()     // Catch:{ all -> 0x0118 }
            L_0x008a:
                if (r0 >= r1) goto L_0x00ab
                int r3 = r0 + 1
                okhttp3.Headers r5 = r7.responseHeaders     // Catch:{ all -> 0x0118 }
                java.lang.String r5 = r5.name(r0)     // Catch:{ all -> 0x0118 }
                v40 r5 = r8.mo56044Z(r5)     // Catch:{ all -> 0x0118 }
                v40 r5 = r5.mo56044Z(r4)     // Catch:{ all -> 0x0118 }
                okhttp3.Headers r6 = r7.responseHeaders     // Catch:{ all -> 0x0118 }
                java.lang.String r0 = r6.value(r0)     // Catch:{ all -> 0x0118 }
                v40 r0 = r5.mo56044Z(r0)     // Catch:{ all -> 0x0118 }
                r0.writeByte(r2)     // Catch:{ all -> 0x0118 }
                r0 = r3
                goto L_0x008a
            L_0x00ab:
                java.lang.String r0 = SENT_MILLIS     // Catch:{ all -> 0x0118 }
                v40 r0 = r8.mo56044Z(r0)     // Catch:{ all -> 0x0118 }
                v40 r0 = r0.mo56044Z(r4)     // Catch:{ all -> 0x0118 }
                long r5 = r7.sentRequestMillis     // Catch:{ all -> 0x0118 }
                v40 r0 = r0.mo56096w0(r5)     // Catch:{ all -> 0x0118 }
                r0.writeByte(r2)     // Catch:{ all -> 0x0118 }
                java.lang.String r0 = RECEIVED_MILLIS     // Catch:{ all -> 0x0118 }
                v40 r0 = r8.mo56044Z(r0)     // Catch:{ all -> 0x0118 }
                v40 r0 = r0.mo56044Z(r4)     // Catch:{ all -> 0x0118 }
                long r3 = r7.receivedResponseMillis     // Catch:{ all -> 0x0118 }
                v40 r0 = r0.mo56096w0(r3)     // Catch:{ all -> 0x0118 }
                r0.writeByte(r2)     // Catch:{ all -> 0x0118 }
                boolean r0 = r7.isHttps()     // Catch:{ all -> 0x0118 }
                if (r0 == 0) goto L_0x0111
                r8.writeByte(r2)     // Catch:{ all -> 0x0118 }
                okhttp3.Handshake r0 = r7.handshake     // Catch:{ all -> 0x0118 }
                p000.vx2.m53588d(r0)     // Catch:{ all -> 0x0118 }
                okhttp3.CipherSuite r0 = r0.cipherSuite()     // Catch:{ all -> 0x0118 }
                java.lang.String r0 = r0.javaName()     // Catch:{ all -> 0x0118 }
                v40 r0 = r8.mo56044Z(r0)     // Catch:{ all -> 0x0118 }
                r0.writeByte(r2)     // Catch:{ all -> 0x0118 }
                okhttp3.Handshake r0 = r7.handshake     // Catch:{ all -> 0x0118 }
                java.util.List r0 = r0.peerCertificates()     // Catch:{ all -> 0x0118 }
                r7.writeCertList(r8, r0)     // Catch:{ all -> 0x0118 }
                okhttp3.Handshake r0 = r7.handshake     // Catch:{ all -> 0x0118 }
                java.util.List r0 = r0.localCertificates()     // Catch:{ all -> 0x0118 }
                r7.writeCertList(r8, r0)     // Catch:{ all -> 0x0118 }
                okhttp3.Handshake r0 = r7.handshake     // Catch:{ all -> 0x0118 }
                okhttp3.TlsVersion r0 = r0.tlsVersion()     // Catch:{ all -> 0x0118 }
                java.lang.String r0 = r0.javaName()     // Catch:{ all -> 0x0118 }
                v40 r0 = r8.mo56044Z(r0)     // Catch:{ all -> 0x0118 }
                r0.writeByte(r2)     // Catch:{ all -> 0x0118 }
            L_0x0111:
                r37 r0 = p000.r37.f33317a     // Catch:{ all -> 0x0118 }
                r0 = 0
                p000.lh0.m47807a(r8, r0)
                return
            L_0x0118:
                r0 = move-exception
                throw r0     // Catch:{ all -> 0x011a }
            L_0x011a:
                r1 = move-exception
                p000.lh0.m47807a(r8, r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.Cache.Entry.writeTo(okhttp3.internal.cache.DiskLruCache$Editor):void");
        }

        public Entry(Response response) {
            vx2.m53591g(response, "response");
            this.url = response.request().url();
            this.varyHeaders = Cache.Companion.varyHeaders(response);
            this.requestMethod = response.request().method();
            this.protocol = response.protocol();
            this.code = response.code();
            this.message = response.message();
            this.responseHeaders = response.headers();
            this.handshake = response.handshake();
            this.sentRequestMillis = response.sentRequestAtMillis();
            this.receivedResponseMillis = response.receivedResponseAtMillis();
        }
    }
}
