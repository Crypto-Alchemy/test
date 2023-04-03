package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0001\u0005¨\u0006\u0006"}, mo44877d2 = {"Lbn4;", "Lar1;", "<init>", "()V", "a", "Lbn4$a;", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: bn4 */
/* compiled from: PeerError.kt */
public abstract class bn4 implements ar1 {

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00028\u0016XD¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016XD¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, mo44877d2 = {"Lbn4$a;", "Lbn4;", "", "b", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "message", "", "c", "I", "getCode", "()I", "code", "<init>", "()V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: bn4$a */
    /* compiled from: PeerError.kt */
    public static final class C3903a extends bn4 {

        /* renamed from: a */
        public static final C3903a f21400a = new C3903a();

        /* renamed from: b */
        public static final String f21401b = "Signature verification failed";

        /* renamed from: c */
        public static final int f21402c = 11004;

        public C3903a() {
            super((DefaultConstructorMarker) null);
        }

        public int getCode() {
            return f21402c;
        }

        public String getMessage() {
            return f21401b;
        }
    }

    public bn4() {
    }

    public /* synthetic */ bn4(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
