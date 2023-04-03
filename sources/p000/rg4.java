package p000;

import kotlin.Metadata;
import okhttp3.Request;
import okhttp3.WebSocket;
import okio.ByteString;
import org.web3j.ens.contracts.generated.PublicResolver;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001J\u0006\u0010\u0005\u001a\u00020\u0003J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u001a\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\u0013\u001a\u00020\u0003H\u0016R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014¨\u0006\u0017"}, mo44877d2 = {"Lrg4;", "Lokhttp3/WebSocket;", "webSocket", "Lr37;", "a", "d", "", "b", "c", "", "text", "", "send", "Lokio/ByteString;", "bytes", "", "code", "reason", "close", "cancel", "Lokhttp3/WebSocket;", "<init>", "()V", "scarlet-websocket-okhttp"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* renamed from: rg4 */
/* compiled from: OkHttpWebSocketHolder.kt */
public final class rg4 implements WebSocket {

    /* renamed from: a */
    public WebSocket f33433a;

    /* renamed from: a */
    public final void mo47404a(WebSocket webSocket) {
        vx2.m53591g(webSocket, "webSocket");
        this.f33433a = webSocket;
    }

    /* renamed from: b */
    public Void mo47405b() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public Void mo47406c() {
        throw new UnsupportedOperationException();
    }

    public void cancel() {
        WebSocket webSocket = this.f33433a;
        if (webSocket != null) {
            webSocket.cancel();
            r37 r37 = r37.f33317a;
        }
    }

    public boolean close(int i, String str) {
        WebSocket webSocket = this.f33433a;
        if (webSocket == null) {
            return false;
        }
        return webSocket.close(i, str);
    }

    /* renamed from: d */
    public final void mo47409d() {
        this.f33433a = null;
    }

    public /* bridge */ /* synthetic */ long queueSize() {
        return ((Number) mo47405b()).longValue();
    }

    public /* bridge */ /* synthetic */ Request request() {
        return (Request) mo47406c();
    }

    public boolean send(String str) {
        vx2.m53591g(str, PublicResolver.FUNC_TEXT);
        WebSocket webSocket = this.f33433a;
        if (webSocket == null) {
            return false;
        }
        return webSocket.send(str);
    }

    public boolean send(ByteString byteString) {
        vx2.m53591g(byteString, "bytes");
        WebSocket webSocket = this.f33433a;
        if (webSocket == null) {
            return false;
        }
        return webSocket.send(byteString);
    }
}
