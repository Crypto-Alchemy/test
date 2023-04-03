package okhttp3.internal.platform.android;

import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import okhttp3.internal.platform.ConscryptPlatform;
import okhttp3.internal.platform.android.DeferredSocketAdapter;
import org.conscrypt.Conscrypt;

@Metadata(mo44876d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\b"}, mo44877d2 = {"okhttp3/internal/platform/android/ConscryptSocketAdapter$Companion$factory$1", "Lokhttp3/internal/platform/android/DeferredSocketAdapter$Factory;", "create", "Lokhttp3/internal/platform/android/SocketAdapter;", "sslSocket", "Ljavax/net/ssl/SSLSocket;", "matchesSocket", "", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0}, mo44881xi = 48)
/* compiled from: ConscryptSocketAdapter.kt */
public final class ConscryptSocketAdapter$Companion$factory$1 implements DeferredSocketAdapter.Factory {
    public SocketAdapter create(SSLSocket sSLSocket) {
        vx2.m53591g(sSLSocket, "sslSocket");
        return new ConscryptSocketAdapter();
    }

    public boolean matchesSocket(SSLSocket sSLSocket) {
        vx2.m53591g(sSLSocket, "sslSocket");
        if (!ConscryptPlatform.Companion.isSupported() || !Conscrypt.isConscrypt(sSLSocket)) {
            return false;
        }
        return true;
    }
}
