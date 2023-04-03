package p000;

import androidx.media3.common.PlaybackException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0001\u0005¨\u0006\u0006"}, mo44877d2 = {"Lw75;", "Lar1;", "<init>", "()V", "a", "Lw75$a;", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: w75 */
/* compiled from: PeerError.kt */
public abstract class w75 implements ar1 {

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00028\u0016XD¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016XD¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, mo44877d2 = {"Lw75$a;", "Lw75;", "", "b", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "message", "", "c", "I", "getCode", "()I", "code", "<init>", "()V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: w75$a */
    /* compiled from: PeerError.kt */
    public static final class C6644a extends w75 {

        /* renamed from: a */
        public static final C6644a f35243a = new C6644a();

        /* renamed from: b */
        public static final String f35244b = "User disconnected";

        /* renamed from: c */
        public static final int f35245c = PlaybackException.ERROR_CODE_DRM_UNSPECIFIED;

        public C6644a() {
            super((DefaultConstructorMarker) null);
        }

        public int getCode() {
            return f35245c;
        }

        public String getMessage() {
            return f35244b;
        }
    }

    public w75() {
    }

    public /* synthetic */ w75(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
