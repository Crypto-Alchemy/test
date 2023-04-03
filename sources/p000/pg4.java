package p000;

import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okio.ByteString;
import p000.iu3;
import p000.yj7;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u000bB!\b\u0000\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0003H\u0002J\b\u0010\u0010\u001a\u00020\fH\u0002R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0018¨\u0006\u001c"}, mo44877d2 = {"Lpg4;", "Lyj7;", "Lia6;", "Lyj7$a;", "a", "Liu3;", "message", "", "c", "Ly06;", "shutdownReason", "b", "Lr37;", "cancel", "event", "g", "f", "Lrg4;", "Lrg4;", "okHttpWebSocketHolder", "Lqg4;", "Lqg4;", "okHttpWebSocketEventObserver", "Lpg4$a;", "Lpg4$a;", "connectionEstablisher", "<init>", "(Lrg4;Lqg4;Lpg4$a;)V", "scarlet-websocket-okhttp"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* renamed from: pg4 */
/* compiled from: OkHttpWebSocket.kt */
public final class pg4 implements yj7 {

    /* renamed from: a */
    public final rg4 f32699a;

    /* renamed from: b */
    public final qg4 f32700b;

    /* renamed from: c */
    public final C6357a f32701c;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, mo44877d2 = {"Lpg4$a;", "", "Lokhttp3/WebSocketListener;", "webSocketListener", "Lr37;", "a", "scarlet-websocket-okhttp"}, mo44878k = 1, mo44879mv = {1, 5, 1})
    /* renamed from: pg4$a */
    /* compiled from: OkHttpWebSocket.kt */
    public interface C6357a {
        /* renamed from: a */
        void mo45430a(WebSocketListener webSocketListener);
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005¨\u0006\t"}, mo44877d2 = {"Lpg4$b;", "Lyj7$b;", "Lyj7;", "a", "Lpg4$a;", "Lpg4$a;", "connectionEstablisher", "<init>", "(Lpg4$a;)V", "scarlet-websocket-okhttp"}, mo44878k = 1, mo44879mv = {1, 5, 1})
    /* renamed from: pg4$b */
    /* compiled from: OkHttpWebSocket.kt */
    public static final class C6358b implements yj7.C6745b {

        /* renamed from: a */
        public final C6357a f32702a;

        public C6358b(C6357a aVar) {
            vx2.m53591g(aVar, "connectionEstablisher");
            this.f32702a = aVar;
        }

        /* renamed from: a */
        public yj7 mo46731a() {
            return new pg4(new rg4(), new qg4(), this.f32702a);
        }
    }

    public pg4(rg4 rg4, qg4 qg4, C6357a aVar) {
        vx2.m53591g(rg4, "okHttpWebSocketHolder");
        vx2.m53591g(qg4, "okHttpWebSocketEventObserver");
        vx2.m53591g(aVar, "connectionEstablisher");
        this.f32699a = rg4;
        this.f32700b = qg4;
        this.f32701c = aVar;
    }

    /* renamed from: h */
    public static final void m49933h(pg4 pg4, pc6 pc6) {
        vx2.m53591g(pg4, "this$0");
        pg4.f32701c.mo45430a(pg4.f32700b);
    }

    /* renamed from: a */
    public ia6<yj7.C6739a> mo46725a() {
        g52<yj7.C6739a> p = this.f32700b.mo47101a().mo42773q(new ng4(this)).mo42772p(new og4(this));
        vx2.m53590f(p, "okHttpWebSocketEventObse…is::handleWebSocketEvent)");
        return a62.m31731a(p);
    }

    /* renamed from: b */
    public synchronized boolean mo46726b(y06 y06) {
        vx2.m53591g(y06, "shutdownReason");
        return this.f32699a.close(y06.mo49578a(), y06.mo49579b());
    }

    /* renamed from: c */
    public synchronized boolean mo46727c(iu3 iu3) {
        boolean z;
        vx2.m53591g(iu3, ThrowableDeserializer.PROP_NAME_MESSAGE);
        if (iu3 instanceof iu3.C6007b) {
            z = this.f32699a.send(((iu3.C6007b) iu3).mo43937a());
        } else if (iu3 instanceof iu3.C6006a) {
            byte[] a = ((iu3.C6006a) iu3).mo43936a();
            z = this.f32699a.send(ByteString.Companion.mo64483g(a, 0, a.length));
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return z;
    }

    public synchronized void cancel() {
        this.f32699a.cancel();
    }

    /* renamed from: f */
    public final synchronized void mo46729f() {
        this.f32699a.mo47409d();
        this.f32700b.mo47102b();
    }

    /* renamed from: g */
    public final void mo46730g(yj7.C6739a aVar) {
        boolean z;
        if (aVar instanceof yj7.C6739a.C6743d) {
            this.f32699a.mo47404a((WebSocket) ((yj7.C6739a.C6743d) aVar).mo49701a());
        } else if (aVar instanceof yj7.C6739a.C6741b) {
            mo46726b(y06.f35745f);
        } else {
            if (aVar instanceof yj7.C6739a.C6740a) {
                z = true;
            } else {
                z = aVar instanceof yj7.C6739a.C6742c;
            }
            if (z) {
                mo46729f();
            }
        }
    }
}
