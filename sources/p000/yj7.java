package p000;

import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0002\u0004\u000bJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH&J\b\u0010\r\u001a\u00020\fH&¨\u0006\u000e"}, mo44877d2 = {"Lyj7;", "", "Lia6;", "Lyj7$a;", "a", "Liu3;", "message", "", "c", "Ly06;", "shutdownReason", "b", "Lr37;", "cancel", "scarlet-core"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* renamed from: yj7 */
/* compiled from: WebSocket.kt */
public interface yj7 {

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, mo44877d2 = {"Lyj7$a;", "", "<init>", "()V", "a", "b", "c", "d", "e", "Lyj7$a$d;", "Lyj7$a$e;", "Lyj7$a$b;", "Lyj7$a$a;", "Lyj7$a$c;", "scarlet-core"}, mo44878k = 1, mo44879mv = {1, 5, 1})
    /* renamed from: yj7$a */
    /* compiled from: WebSocket.kt */
    public static abstract class C6739a {

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, mo44877d2 = {"Lyj7$a$a;", "Lyj7$a;", "", "toString", "", "hashCode", "", "other", "", "equals", "Ly06;", "a", "Ly06;", "()Ly06;", "shutdownReason", "<init>", "(Ly06;)V", "scarlet-core"}, mo44878k = 1, mo44879mv = {1, 5, 1})
        /* renamed from: yj7$a$a */
        /* compiled from: WebSocket.kt */
        public static final class C6740a extends C6739a {

            /* renamed from: a */
            public final y06 f35894a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C6740a(y06 y06) {
                super((DefaultConstructorMarker) null);
                vx2.m53591g(y06, "shutdownReason");
                this.f35894a = y06;
            }

            /* renamed from: a */
            public final y06 mo49689a() {
                return this.f35894a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C6740a) && vx2.m53586b(this.f35894a, ((C6740a) obj).f35894a);
            }

            public int hashCode() {
                return this.f35894a.hashCode();
            }

            public String toString() {
                return "OnConnectionClosed(shutdownReason=" + this.f35894a + ')';
            }
        }

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, mo44877d2 = {"Lyj7$a$b;", "Lyj7$a;", "", "toString", "", "hashCode", "", "other", "", "equals", "Ly06;", "a", "Ly06;", "()Ly06;", "shutdownReason", "<init>", "(Ly06;)V", "scarlet-core"}, mo44878k = 1, mo44879mv = {1, 5, 1})
        /* renamed from: yj7$a$b */
        /* compiled from: WebSocket.kt */
        public static final class C6741b extends C6739a {

            /* renamed from: a */
            public final y06 f35895a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C6741b(y06 y06) {
                super((DefaultConstructorMarker) null);
                vx2.m53591g(y06, "shutdownReason");
                this.f35895a = y06;
            }

            /* renamed from: a */
            public final y06 mo49693a() {
                return this.f35895a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C6741b) && vx2.m53586b(this.f35895a, ((C6741b) obj).f35895a);
            }

            public int hashCode() {
                return this.f35895a.hashCode();
            }

            public String toString() {
                return "OnConnectionClosing(shutdownReason=" + this.f35895a + ')';
            }
        }

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, mo44877d2 = {"Lyj7$a$c;", "Lyj7$a;", "", "toString", "", "hashCode", "", "other", "", "equals", "", "a", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "throwable", "<init>", "(Ljava/lang/Throwable;)V", "scarlet-core"}, mo44878k = 1, mo44879mv = {1, 5, 1})
        /* renamed from: yj7$a$c */
        /* compiled from: WebSocket.kt */
        public static final class C6742c extends C6739a {

            /* renamed from: a */
            public final Throwable f35896a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C6742c(Throwable th) {
                super((DefaultConstructorMarker) null);
                vx2.m53591g(th, "throwable");
                this.f35896a = th;
            }

            /* renamed from: a */
            public final Throwable mo49697a() {
                return this.f35896a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C6742c) && vx2.m53586b(this.f35896a, ((C6742c) obj).f35896a);
            }

            public int hashCode() {
                return this.f35896a.hashCode();
            }

            public String toString() {
                return "OnConnectionFailed(throwable=" + this.f35896a + ')';
            }
        }

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, mo44877d2 = {"Lyj7$a$d;", "", "WEB_SOCKET", "Lyj7$a;", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "webSocket", "<init>", "(Ljava/lang/Object;)V", "scarlet-core"}, mo44878k = 1, mo44879mv = {1, 5, 1})
        /* renamed from: yj7$a$d */
        /* compiled from: WebSocket.kt */
        public static final class C6743d<WEB_SOCKET> extends C6739a {

            /* renamed from: a */
            public final WEB_SOCKET f35897a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C6743d(WEB_SOCKET web_socket) {
                super((DefaultConstructorMarker) null);
                vx2.m53591g(web_socket, "webSocket");
                this.f35897a = web_socket;
            }

            /* renamed from: a */
            public final WEB_SOCKET mo49701a() {
                return this.f35897a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C6743d) && vx2.m53586b(this.f35897a, ((C6743d) obj).f35897a);
            }

            public int hashCode() {
                return this.f35897a.hashCode();
            }

            public String toString() {
                return "OnConnectionOpened(webSocket=" + this.f35897a + ')';
            }
        }

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, mo44877d2 = {"Lyj7$a$e;", "Lyj7$a;", "", "toString", "", "hashCode", "", "other", "", "equals", "Liu3;", "a", "Liu3;", "()Liu3;", "message", "<init>", "(Liu3;)V", "scarlet-core"}, mo44878k = 1, mo44879mv = {1, 5, 1})
        /* renamed from: yj7$a$e */
        /* compiled from: WebSocket.kt */
        public static final class C6744e extends C6739a {

            /* renamed from: a */
            public final iu3 f35898a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C6744e(iu3 iu3) {
                super((DefaultConstructorMarker) null);
                vx2.m53591g(iu3, ThrowableDeserializer.PROP_NAME_MESSAGE);
                this.f35898a = iu3;
            }

            /* renamed from: a */
            public final iu3 mo49705a() {
                return this.f35898a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C6744e) && vx2.m53586b(this.f35898a, ((C6744e) obj).f35898a);
            }

            public int hashCode() {
                return this.f35898a.hashCode();
            }

            public String toString() {
                return "OnMessageReceived(message=" + this.f35898a + ')';
            }
        }

        public C6739a() {
        }

        public /* synthetic */ C6739a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0004"}, mo44877d2 = {"Lyj7$b;", "", "Lyj7;", "a", "scarlet-core"}, mo44878k = 1, mo44879mv = {1, 5, 1})
    /* renamed from: yj7$b */
    /* compiled from: WebSocket.kt */
    public interface C6745b {
        /* renamed from: a */
        yj7 mo46731a();
    }

    /* renamed from: a */
    ia6<C6739a> mo46725a();

    /* renamed from: b */
    boolean mo46726b(y06 y06);

    /* renamed from: c */
    boolean mo46727c(iu3 iu3);

    void cancel();
}
