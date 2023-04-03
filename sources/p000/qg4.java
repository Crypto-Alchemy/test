package p000;

import kotlin.Metadata;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okio.ByteString;
import org.web3j.ens.contracts.generated.PublicResolver;
import p000.iu3;
import p000.yj7;
import p018io.reactivex.processors.BehaviorProcessor;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0006\u0010\u0006\u001a\u00020\u0005J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\u000e\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0016J\u0018\u0010\u000e\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J \u0010\u0014\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J \u0010\u0015\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\"\u0010\u0018\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016R\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u00030\u00030\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001b¨\u0006\u001f"}, mo44877d2 = {"Lqg4;", "Lokhttp3/WebSocketListener;", "Lg52;", "Lyj7$a;", "a", "Lr37;", "b", "Lokhttp3/WebSocket;", "webSocket", "Lokhttp3/Response;", "response", "onOpen", "Lokio/ByteString;", "bytes", "onMessage", "", "text", "", "code", "reason", "onClosing", "onClosed", "", "t", "onFailure", "Lv52;", "kotlin.jvm.PlatformType", "Lv52;", "processor", "<init>", "()V", "scarlet-websocket-okhttp"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* renamed from: qg4 */
/* compiled from: OkHttpWebSocketEventObserver.kt */
public final class qg4 extends WebSocketListener {

    /* renamed from: a */
    public final v52<yj7.C6739a> f33092a;

    public qg4() {
        v52<yj7.C6739a> R = BehaviorProcessor.m45878T().mo48661R();
        vx2.m53590f(R, "create<WebSocket.Event>().toSerialized()");
        this.f33092a = R;
    }

    /* renamed from: a */
    public final g52<yj7.C6739a> mo47101a() {
        g52<yj7.C6739a> G = this.f33092a.mo42756G();
        vx2.m53590f(G, "processor.onBackpressureBuffer()");
        return G;
    }

    /* renamed from: b */
    public final void mo47102b() {
        this.f33092a.onComplete();
    }

    public void onClosed(WebSocket webSocket, int i, String str) {
        vx2.m53591g(webSocket, "webSocket");
        vx2.m53591g(str, "reason");
        this.f33092a.onNext(new yj7.C6739a.C6740a(new y06(i, str)));
    }

    public void onClosing(WebSocket webSocket, int i, String str) {
        vx2.m53591g(webSocket, "webSocket");
        vx2.m53591g(str, "reason");
        this.f33092a.onNext(new yj7.C6739a.C6741b(new y06(i, str)));
    }

    public void onFailure(WebSocket webSocket, Throwable th, Response response) {
        vx2.m53591g(webSocket, "webSocket");
        vx2.m53591g(th, "t");
        this.f33092a.onNext(new yj7.C6739a.C6742c(th));
    }

    public void onMessage(WebSocket webSocket, ByteString byteString) {
        vx2.m53591g(webSocket, "webSocket");
        vx2.m53591g(byteString, "bytes");
        this.f33092a.onNext(new yj7.C6739a.C6744e(new iu3.C6006a(byteString.toByteArray())));
    }

    public void onOpen(WebSocket webSocket, Response response) {
        vx2.m53591g(webSocket, "webSocket");
        vx2.m53591g(response, "response");
        this.f33092a.onNext(new yj7.C6739a.C6743d(webSocket));
    }

    public void onMessage(WebSocket webSocket, String str) {
        vx2.m53591g(webSocket, "webSocket");
        vx2.m53591g(str, PublicResolver.FUNC_TEXT);
        this.f33092a.onNext(new yj7.C6739a.C6744e(new iu3.C6007b(str)));
    }
}
