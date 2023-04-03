package p000;

import java.net.URI;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.java_websocket.drafts.C9059a;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000%\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0005*\u0001\u000e\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0011\u0010\fJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0004R$\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0012"}, mo44877d2 = {"Ldk7;", "", "Lak7;", "b", "Lr37;", "a", "d", "Le24;", "Le24;", "c", "()Le24;", "setWebInterface", "(Le24;)V", "webInterface", "dk7$a", "Ldk7$a;", "mWebSocketClient", "<init>", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: dk7 */
/* compiled from: AKTWebSocketUtill.kt */
public final class dk7 {

    /* renamed from: a */
    public e24 f37314a;

    /* renamed from: b */
    public final C6982a f37315b;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\"\u0010\u000e\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\fH\u0016J\u0018\u0010\u0012\u001a\u00020\u00042\u000e\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010H\u0016¨\u0006\u0013"}, mo44877d2 = {"dk7$a", "Lak7;", "Lbx5;", "handshakedata", "Lr37;", "S", "", "message", "Q", "", "code", "reason", "", "remote", "M", "Ljava/lang/Exception;", "Lkotlin/Exception;", "ex", "P", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: dk7$a */
    /* compiled from: AKTWebSocketUtill.kt */
    public static final class C6982a extends ak7 {

        /* renamed from: P */
        public final /* synthetic */ dk7 f37316P;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6982a(dk7 dk7, URI uri, C9059a aVar) {
            super(uri, aVar, (Map<String, String>) null, 30000);
            this.f37316P = dk7;
        }

        /* renamed from: M */
        public void mo50230M(int i, String str, boolean z) {
            e24 c = this.f37316P.mo51222c();
            if (c != null) {
                c.mo51351a(i, str, z);
            }
            if (str != null) {
                ol0.m70350b0(str, "WebSocket");
            }
        }

        /* renamed from: P */
        public void mo50233P(Exception exc) {
            String str;
            e24 c = this.f37316P.mo51222c();
            if (c != null) {
                c.mo51352b(exc);
            }
            if (exc == null || (str = exc.getLocalizedMessage()) == null) {
                if (exc != null) {
                    str = exc.getMessage();
                } else {
                    str = null;
                }
            }
            if (str != null) {
                ol0.m70350b0(str, "WebSocket");
            }
        }

        /* renamed from: Q */
        public void mo50234Q(String str) {
            e24 c = this.f37316P.mo51222c();
            if (c != null) {
                c.mo51353c(str);
            }
            if (str != null) {
                ol0.m70350b0(str, "WebSocket");
            }
        }

        /* renamed from: S */
        public void mo50236S(bx5 bx5) {
            e24 c = this.f37316P.mo51222c();
            if (c != null) {
                c.mo51354d(bx5);
            }
            ol0.m70350b0("Opened", "WebSocket");
        }
    }

    public dk7() {
        this((e24) null, 1, (DefaultConstructorMarker) null);
    }

    public dk7(e24 e24) {
        this.f37314a = e24;
        C6982a aVar = new C6982a(this, new URI(C7857m3.m64051a()), new C9059a());
        this.f37315b = aVar;
        aVar.mo50224G();
    }

    /* renamed from: a */
    public final void mo51220a() {
        this.f37315b.mo50221D();
    }

    /* renamed from: b */
    public final ak7 mo51221b() {
        return this.f37315b;
    }

    /* renamed from: c */
    public final e24 mo51222c() {
        return this.f37314a;
    }

    /* renamed from: d */
    public final void mo51223d() {
        this.f37315b.mo50237T();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dk7(e24 e24, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : e24);
    }
}
