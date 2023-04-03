package okhttp3;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(mo44876d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, mo44877d2 = {"Lokhttp3/Credentials;", "", "()V", "basic", "", "username", "password", "charset", "Ljava/nio/charset/Charset;", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0}, mo44881xi = 48)
/* compiled from: Credentials.kt */
public final class Credentials {
    public static final Credentials INSTANCE = new Credentials();

    private Credentials() {
    }

    public static final String basic(String str, String str2) {
        vx2.m53591g(str, "username");
        vx2.m53591g(str2, "password");
        return basic$default(str, str2, (Charset) null, 4, (Object) null);
    }

    public static final String basic(String str, String str2, Charset charset) {
        vx2.m53591g(str, "username");
        vx2.m53591g(str2, "password");
        vx2.m53591g(charset, "charset");
        return vx2.m53598n("Basic ", ByteString.Companion.mo64479c(str + ':' + str2, charset).base64());
    }

    public static /* synthetic */ String basic$default(String str, String str2, Charset charset, int i, Object obj) {
        if ((i & 4) != 0) {
            charset = StandardCharsets.ISO_8859_1;
            vx2.m53590f(charset, "ISO_8859_1");
        }
        return basic(str, str2, charset);
    }
}
