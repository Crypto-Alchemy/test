package p000;

import androidx.media3.common.PlaybackException;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0004\b\t\n\u000b¨\u0006\f"}, mo44877d2 = {"Lcn4;", "Lar1;", "<init>", "()V", "a", "b", "c", "d", "Lcn4$a;", "Lcn4$b;", "Lcn4$c;", "Lcn4$d;", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: cn4 */
/* compiled from: PeerError.kt */
public abstract class cn4 implements ar1 {

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, mo44877d2 = {"Lcn4$a;", "Lcn4;", "<init>", "()V", "a", "b", "c", "d", "e", "f", "Lcn4$a$a;", "Lcn4$a$b;", "Lcn4$a$c;", "Lcn4$a$d;", "Lcn4$a$e;", "Lcn4$a$f;", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: cn4$a */
    /* compiled from: PeerError.kt */
    public static abstract class C3947a extends cn4 {

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u001a\u0010\u000e\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0013\u001a\u00020\u00048\u0016XD¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, mo44877d2 = {"Lcn4$a$a;", "Lcn4$a;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "message", "b", "I", "getCode", "()I", "code", "<init>", "(Ljava/lang/String;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: cn4$a$a */
        /* compiled from: PeerError.kt */
        public static final class C3948a extends C3947a {

            /* renamed from: a */
            public final String f21820a;

            /* renamed from: b */
            public final int f21821b = 5100;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3948a(String str) {
                super((DefaultConstructorMarker) null);
                vx2.m53591g(str, ThrowableDeserializer.PROP_NAME_MESSAGE);
                this.f21820a = str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3948a) && vx2.m53586b(getMessage(), ((C3948a) obj).getMessage());
            }

            public int getCode() {
                return this.f21821b;
            }

            public String getMessage() {
                return this.f21820a;
            }

            public int hashCode() {
                return getMessage().hashCode();
            }

            public String toString() {
                String message = getMessage();
                return "UnsupportedChains(message=" + message + ")";
            }
        }

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u001a\u0010\u000e\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0013\u001a\u00020\u00048\u0016XD¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, mo44877d2 = {"Lcn4$a$b;", "Lcn4$a;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "message", "b", "I", "getCode", "()I", "code", "<init>", "(Ljava/lang/String;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: cn4$a$b */
        /* compiled from: PeerError.kt */
        public static final class C3949b extends C3947a {

            /* renamed from: a */
            public final String f21822a;

            /* renamed from: b */
            public final int f21823b = 5104;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3949b(String str) {
                super((DefaultConstructorMarker) null);
                vx2.m53591g(str, ThrowableDeserializer.PROP_NAME_MESSAGE);
                this.f21822a = str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3949b) && vx2.m53586b(getMessage(), ((C3949b) obj).getMessage());
            }

            public int getCode() {
                return this.f21823b;
            }

            public String getMessage() {
                return this.f21822a;
            }

            public int hashCode() {
                return getMessage().hashCode();
            }

            public String toString() {
                String message = getMessage();
                return "UnsupportedNamespaceKey(message=" + message + ")";
            }
        }

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u001a\u0010\u000e\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0013\u001a\u00020\u00048\u0016XD¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, mo44877d2 = {"Lcn4$a$c;", "Lcn4$a;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "message", "b", "I", "getCode", "()I", "code", "<init>", "(Ljava/lang/String;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: cn4$a$c */
        /* compiled from: PeerError.kt */
        public static final class C3950c extends C3947a {

            /* renamed from: a */
            public final String f21824a;

            /* renamed from: b */
            public final int f21825b = 5000;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3950c(String str) {
                super((DefaultConstructorMarker) null);
                vx2.m53591g(str, ThrowableDeserializer.PROP_NAME_MESSAGE);
                this.f21824a = str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3950c) && vx2.m53586b(getMessage(), ((C3950c) obj).getMessage());
            }

            public int getCode() {
                return this.f21825b;
            }

            public String getMessage() {
                return this.f21824a;
            }

            public int hashCode() {
                return getMessage().hashCode();
            }

            public String toString() {
                String message = getMessage();
                return "UserRejected(message=" + message + ")";
            }
        }

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u001a\u0010\u000e\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0013\u001a\u00020\u00048\u0016XD¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, mo44877d2 = {"Lcn4$a$d;", "Lcn4$a;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "message", "b", "I", "getCode", "()I", "code", "<init>", "(Ljava/lang/String;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: cn4$a$d */
        /* compiled from: PeerError.kt */
        public static final class C3951d extends C3947a {

            /* renamed from: a */
            public final String f21826a;

            /* renamed from: b */
            public final int f21827b = PlaybackException.ERROR_CODE_AUDIO_TRACK_INIT_FAILED;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3951d(String str) {
                super((DefaultConstructorMarker) null);
                vx2.m53591g(str, ThrowableDeserializer.PROP_NAME_MESSAGE);
                this.f21826a = str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3951d) && vx2.m53586b(getMessage(), ((C3951d) obj).getMessage());
            }

            public int getCode() {
                return this.f21827b;
            }

            public String getMessage() {
                return this.f21826a;
            }

            public int hashCode() {
                return getMessage().hashCode();
            }

            public String toString() {
                String message = getMessage();
                return "UserRejectedChains(message=" + message + ")";
            }
        }

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u001a\u0010\u000e\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0013\u001a\u00020\u00048\u0016XD¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, mo44877d2 = {"Lcn4$a$e;", "Lcn4$a;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "message", "b", "I", "getCode", "()I", "code", "<init>", "(Ljava/lang/String;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: cn4$a$e */
        /* compiled from: PeerError.kt */
        public static final class C3952e extends C3947a {

            /* renamed from: a */
            public final String f21828a;

            /* renamed from: b */
            public final int f21829b = 5003;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3952e(String str) {
                super((DefaultConstructorMarker) null);
                vx2.m53591g(str, ThrowableDeserializer.PROP_NAME_MESSAGE);
                this.f21828a = str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3952e) && vx2.m53586b(getMessage(), ((C3952e) obj).getMessage());
            }

            public int getCode() {
                return this.f21829b;
            }

            public String getMessage() {
                return this.f21828a;
            }

            public int hashCode() {
                return getMessage().hashCode();
            }

            public String toString() {
                String message = getMessage();
                return "UserRejectedEvents(message=" + message + ")";
            }
        }

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u001a\u0010\u000e\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0013\u001a\u00020\u00048\u0016XD¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, mo44877d2 = {"Lcn4$a$f;", "Lcn4$a;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "message", "b", "I", "getCode", "()I", "code", "<init>", "(Ljava/lang/String;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: cn4$a$f */
        /* compiled from: PeerError.kt */
        public static final class C3953f extends C3947a {

            /* renamed from: a */
            public final String f21830a;

            /* renamed from: b */
            public final int f21831b = PlaybackException.ERROR_CODE_AUDIO_TRACK_WRITE_FAILED;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3953f(String str) {
                super((DefaultConstructorMarker) null);
                vx2.m53591g(str, ThrowableDeserializer.PROP_NAME_MESSAGE);
                this.f21830a = str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3953f) && vx2.m53586b(getMessage(), ((C3953f) obj).getMessage());
            }

            public int getCode() {
                return this.f21831b;
            }

            public String getMessage() {
                return this.f21830a;
            }

            public int hashCode() {
                return getMessage().hashCode();
            }

            public String toString() {
                String message = getMessage();
                return "UserRejectedMethods(message=" + message + ")";
            }
        }

        public C3947a() {
            super((DefaultConstructorMarker) null);
        }

        public /* synthetic */ C3947a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0001\u0005¨\u0006\u0006"}, mo44877d2 = {"Lcn4$b;", "Lcn4;", "<init>", "()V", "a", "Lcn4$b$a;", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: cn4$b */
    /* compiled from: PeerError.kt */
    public static abstract class C3954b extends cn4 {

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001a\u0010\u0016\u001a\u00020\u00048\u0016XD¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, mo44877d2 = {"Lcn4$b$a;", "Lcn4$b;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getReason", "()Ljava/lang/String;", "reason", "b", "getMessage", "message", "c", "I", "getCode", "()I", "code", "<init>", "(Ljava/lang/String;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: cn4$b$a */
        /* compiled from: PeerError.kt */
        public static final class C3955a extends C3954b {

            /* renamed from: a */
            public final String f21832a;

            /* renamed from: b */
            public final String f21833b;

            /* renamed from: c */
            public final int f21834c = 7000;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3955a(String str) {
                super((DefaultConstructorMarker) null);
                vx2.m53591g(str, "reason");
                this.f21832a = str;
                this.f21833b = "Invalid Session Settle Request: " + str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3955a) && vx2.m53586b(this.f21832a, ((C3955a) obj).f21832a);
            }

            public int getCode() {
                return this.f21834c;
            }

            public String getMessage() {
                return this.f21833b;
            }

            public int hashCode() {
                return this.f21832a.hashCode();
            }

            public String toString() {
                String str = this.f21832a;
                return "SessionSettlementFailed(reason=" + str + ")";
            }
        }

        public C3954b() {
            super((DefaultConstructorMarker) null);
        }

        public /* synthetic */ C3954b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0004\b\t\n\u000b¨\u0006\f"}, mo44877d2 = {"Lcn4$c;", "Lcn4;", "<init>", "()V", "a", "b", "c", "d", "Lcn4$c$a;", "Lcn4$c$b;", "Lcn4$c$c;", "Lcn4$c$d;", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: cn4$c */
    /* compiled from: PeerError.kt */
    public static abstract class C3956c extends cn4 {

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001a\u0010\u0016\u001a\u00020\u00048\u0016XD¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, mo44877d2 = {"Lcn4$c$a;", "Lcn4$c;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getReason", "()Ljava/lang/String;", "reason", "b", "getMessage", "message", "c", "I", "getCode", "()I", "code", "<init>", "(Ljava/lang/String;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: cn4$c$a */
        /* compiled from: PeerError.kt */
        public static final class C3957a extends C3956c {

            /* renamed from: a */
            public final String f21835a;

            /* renamed from: b */
            public final String f21836b;

            /* renamed from: c */
            public final int f21837c = PlaybackException.ERROR_CODE_BEHIND_LIVE_WINDOW;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3957a(String str) {
                super((DefaultConstructorMarker) null);
                vx2.m53591g(str, "reason");
                this.f21835a = str;
                this.f21836b = "Invalid event request: " + str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3957a) && vx2.m53586b(this.f21835a, ((C3957a) obj).f21835a);
            }

            public int getCode() {
                return this.f21837c;
            }

            public String getMessage() {
                return this.f21836b;
            }

            public int hashCode() {
                return this.f21835a.hashCode();
            }

            public String toString() {
                String str = this.f21835a;
                return "Event(reason=" + str + ")";
            }
        }

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001a\u0010\u0016\u001a\u00020\u00048\u0016XD¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, mo44877d2 = {"Lcn4$c$b;", "Lcn4$c;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getReason", "()Ljava/lang/String;", "reason", "b", "getMessage", "message", "c", "I", "getCode", "()I", "code", "<init>", "(Ljava/lang/String;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: cn4$c$b */
        /* compiled from: PeerError.kt */
        public static final class C3958b extends C3956c {

            /* renamed from: a */
            public final String f21838a;

            /* renamed from: b */
            public final String f21839b;

            /* renamed from: c */
            public final int f21840c = PlaybackException.ERROR_CODE_FAILED_RUNTIME_CHECK;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3958b(String str) {
                super((DefaultConstructorMarker) null);
                vx2.m53591g(str, "reason");
                this.f21838a = str;
                this.f21839b = "Invalid session extend request: " + str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3958b) && vx2.m53586b(this.f21838a, ((C3958b) obj).f21838a);
            }

            public int getCode() {
                return this.f21840c;
            }

            public String getMessage() {
                return this.f21839b;
            }

            public int hashCode() {
                return this.f21838a.hashCode();
            }

            public String toString() {
                String str = this.f21838a;
                return "ExtendRequest(reason=" + str + ")";
            }
        }

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001a\u0010\u0016\u001a\u00020\u00048\u0016XD¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, mo44877d2 = {"Lcn4$c$c;", "Lcn4$c;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getReason", "()Ljava/lang/String;", "reason", "b", "getMessage", "message", "c", "I", "getCode", "()I", "code", "<init>", "(Ljava/lang/String;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: cn4$c$c */
        /* compiled from: PeerError.kt */
        public static final class C3959c extends C3956c {

            /* renamed from: a */
            public final String f21841a;

            /* renamed from: b */
            public final String f21842b;

            /* renamed from: c */
            public final int f21843c = 1001;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3959c(String str) {
                super((DefaultConstructorMarker) null);
                vx2.m53591g(str, "reason");
                this.f21841a = str;
                this.f21842b = "Invalid session request: " + str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3959c) && vx2.m53586b(this.f21841a, ((C3959c) obj).f21841a);
            }

            public int getCode() {
                return this.f21843c;
            }

            public String getMessage() {
                return this.f21842b;
            }

            public int hashCode() {
                return this.f21841a.hashCode();
            }

            public String toString() {
                String str = this.f21841a;
                return "Method(reason=" + str + ")";
            }
        }

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001a\u0010\u0016\u001a\u00020\u00048\u0016XD¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, mo44877d2 = {"Lcn4$c$d;", "Lcn4$c;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getReason", "()Ljava/lang/String;", "reason", "b", "getMessage", "message", "c", "I", "getCode", "()I", "code", "<init>", "(Ljava/lang/String;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: cn4$c$d */
        /* compiled from: PeerError.kt */
        public static final class C3960d extends C3956c {

            /* renamed from: a */
            public final String f21844a;

            /* renamed from: b */
            public final String f21845b;

            /* renamed from: c */
            public final int f21846c = PlaybackException.ERROR_CODE_TIMEOUT;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3960d(String str) {
                super((DefaultConstructorMarker) null);
                vx2.m53591g(str, "reason");
                this.f21844a = str;
                this.f21845b = "Invalid update namespace request: " + str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3960d) && vx2.m53586b(this.f21844a, ((C3960d) obj).f21844a);
            }

            public int getCode() {
                return this.f21846c;
            }

            public String getMessage() {
                return this.f21845b;
            }

            public int hashCode() {
                return this.f21844a.hashCode();
            }

            public String toString() {
                String str = this.f21844a;
                return "UpdateRequest(reason=" + str + ")";
            }
        }

        public C3956c() {
            super((DefaultConstructorMarker) null);
        }

        public /* synthetic */ C3956c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0004\b\t\n\u000b¨\u0006\f"}, mo44877d2 = {"Lcn4$d;", "Lcn4;", "<init>", "()V", "a", "b", "c", "d", "Lcn4$d$a;", "Lcn4$d$b;", "Lcn4$d$c;", "Lcn4$d$d;", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: cn4$d */
    /* compiled from: PeerError.kt */
    public static abstract class C3961d extends cn4 {

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001a\u0010\u0016\u001a\u00020\u00048\u0016XD¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, mo44877d2 = {"Lcn4$d$a;", "Lcn4$d;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getReason", "()Ljava/lang/String;", "reason", "b", "getMessage", "message", "c", "I", "getCode", "()I", "code", "<init>", "(Ljava/lang/String;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: cn4$d$a */
        /* compiled from: PeerError.kt */
        public static final class C3962a extends C3961d {

            /* renamed from: a */
            public final String f21847a;

            /* renamed from: b */
            public final String f21848b;

            /* renamed from: c */
            public final int f21849c = PlaybackException.ERROR_CODE_PARSING_MANIFEST_MALFORMED;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3962a(String str) {
                super((DefaultConstructorMarker) null);
                vx2.m53591g(str, "reason");
                this.f21847a = str;
                this.f21848b = "Unauthorized event request: " + str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3962a) && vx2.m53586b(this.f21847a, ((C3962a) obj).f21847a);
            }

            public int getCode() {
                return this.f21849c;
            }

            public String getMessage() {
                return this.f21848b;
            }

            public int hashCode() {
                return this.f21847a.hashCode();
            }

            public String toString() {
                String str = this.f21847a;
                return "Event(reason=" + str + ")";
            }
        }

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001a\u0010\u0016\u001a\u00020\u00048\u0016XD¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, mo44877d2 = {"Lcn4$d$b;", "Lcn4$d;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getSequence", "()Ljava/lang/String;", "sequence", "b", "getMessage", "message", "c", "I", "getCode", "()I", "code", "<init>", "(Ljava/lang/String;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: cn4$d$b */
        /* compiled from: PeerError.kt */
        public static final class C3963b extends C3961d {

            /* renamed from: a */
            public final String f21850a;

            /* renamed from: b */
            public final String f21851b;

            /* renamed from: c */
            public final int f21852c = PlaybackException.ERROR_CODE_PARSING_MANIFEST_UNSUPPORTED;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3963b(String str) {
                super((DefaultConstructorMarker) null);
                vx2.m53591g(str, "sequence");
                this.f21850a = str;
                this.f21851b = "Unauthorized " + str + " extend request";
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3963b) && vx2.m53586b(this.f21850a, ((C3963b) obj).f21850a);
            }

            public int getCode() {
                return this.f21852c;
            }

            public String getMessage() {
                return this.f21851b;
            }

            public int hashCode() {
                return this.f21850a.hashCode();
            }

            public String toString() {
                String str = this.f21850a;
                return "ExtendRequest(sequence=" + str + ")";
            }
        }

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001a\u0010\u0016\u001a\u00020\u00048\u0016XD¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, mo44877d2 = {"Lcn4$d$c;", "Lcn4$d;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getReason", "()Ljava/lang/String;", "reason", "b", "getMessage", "message", "c", "I", "getCode", "()I", "code", "<init>", "(Ljava/lang/String;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: cn4$d$c */
        /* compiled from: PeerError.kt */
        public static final class C3964c extends C3961d {

            /* renamed from: a */
            public final String f21853a;

            /* renamed from: b */
            public final String f21854b;

            /* renamed from: c */
            public final int f21855c = PlaybackException.ERROR_CODE_PARSING_CONTAINER_MALFORMED;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3964c(String str) {
                super((DefaultConstructorMarker) null);
                vx2.m53591g(str, "reason");
                this.f21853a = str;
                this.f21854b = "Unauthorized session request: " + str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3964c) && vx2.m53586b(this.f21853a, ((C3964c) obj).f21853a);
            }

            public int getCode() {
                return this.f21855c;
            }

            public String getMessage() {
                return this.f21854b;
            }

            public int hashCode() {
                return this.f21853a.hashCode();
            }

            public String toString() {
                String str = this.f21853a;
                return "Method(reason=" + str + ")";
            }
        }

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001a\u0010\u0016\u001a\u00020\u00048\u0016XD¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, mo44877d2 = {"Lcn4$d$d;", "Lcn4$d;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getSequence", "()Ljava/lang/String;", "sequence", "b", "getMessage", "message", "c", "I", "getCode", "()I", "code", "<init>", "(Ljava/lang/String;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: cn4$d$d */
        /* compiled from: PeerError.kt */
        public static final class C3965d extends C3961d {

            /* renamed from: a */
            public final String f21856a;

            /* renamed from: b */
            public final String f21857b;

            /* renamed from: c */
            public final int f21858c = PlaybackException.ERROR_CODE_PARSING_CONTAINER_UNSUPPORTED;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3965d(String str) {
                super((DefaultConstructorMarker) null);
                vx2.m53591g(str, "sequence");
                this.f21856a = str;
                this.f21857b = "Unauthorized update " + str + " namespace request";
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3965d) && vx2.m53586b(this.f21856a, ((C3965d) obj).f21856a);
            }

            public int getCode() {
                return this.f21858c;
            }

            public String getMessage() {
                return this.f21857b;
            }

            public int hashCode() {
                return this.f21856a.hashCode();
            }

            public String toString() {
                String str = this.f21856a;
                return "UpdateRequest(sequence=" + str + ")";
            }
        }

        public C3961d() {
            super((DefaultConstructorMarker) null);
        }

        public /* synthetic */ C3961d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public cn4() {
    }

    public /* synthetic */ cn4(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
