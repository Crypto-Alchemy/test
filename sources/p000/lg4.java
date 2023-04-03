package p000;

import kotlin.Metadata;
import okhttp3.OkHttpClient;
import okhttp3.WebSocketListener;
import p000.pg4;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, mo44877d2 = {"Llg4;", "Lpg4$a;", "Lokhttp3/WebSocketListener;", "webSocketListener", "Lr37;", "a", "Lokhttp3/OkHttpClient;", "Lokhttp3/OkHttpClient;", "okHttpClient", "Lge5;", "b", "Lge5;", "requestFactory", "<init>", "(Lokhttp3/OkHttpClient;Lge5;)V", "scarlet-websocket-okhttp"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* renamed from: lg4 */
/* compiled from: OkHttpClientWebSocketConnectionEstablisher.kt */
public final class lg4 implements pg4.C6357a {

    /* renamed from: a */
    public final OkHttpClient f31309a;

    /* renamed from: b */
    public final ge5 f31310b;

    public lg4(OkHttpClient okHttpClient, ge5 ge5) {
        vx2.m53591g(okHttpClient, "okHttpClient");
        vx2.m53591g(ge5, "requestFactory");
        this.f31309a = okHttpClient;
        this.f31310b = ge5;
    }

    /* renamed from: a */
    public void mo45430a(WebSocketListener webSocketListener) {
        vx2.m53591g(webSocketListener, "webSocketListener");
        this.f31309a.newWebSocket(this.f31310b.mo42885a(), webSocketListener);
    }
}
