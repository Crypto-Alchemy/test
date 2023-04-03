package okhttp3.internal.platform.android;

import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Protocol;
import okhttp3.internal.SuppressSignatureCheck;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.platform.android.SocketAdapter;

@SuppressSignatureCheck
@SuppressLint({"NewApi"})
@Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J(\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0017¨\u0006\u0012"}, mo44877d2 = {"Lokhttp3/internal/platform/android/Android10SocketAdapter;", "Lokhttp3/internal/platform/android/SocketAdapter;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "matchesSocket", "isSupported", "", "getSelectedProtocol", "hostname", "", "Lokhttp3/Protocol;", "protocols", "Lr37;", "configureTlsExtensions", "<init>", "()V", "Companion", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: Android10SocketAdapter.kt */
public final class Android10SocketAdapter implements SocketAdapter {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    @SuppressSignatureCheck
    @Metadata(mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, mo44877d2 = {"Lokhttp3/internal/platform/android/Android10SocketAdapter$Companion;", "", "()V", "buildIfSupported", "Lokhttp3/internal/platform/android/SocketAdapter;", "isSupported", "", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0}, mo44881xi = 48)
    /* compiled from: Android10SocketAdapter.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SocketAdapter buildIfSupported() {
            if (isSupported()) {
                return new Android10SocketAdapter();
            }
            return null;
        }

        public final boolean isSupported() {
            if (!Platform.Companion.isAndroid() || Build.VERSION.SDK_INT < 29) {
                return false;
            }
            return true;
        }
    }

    @SuppressLint({"NewApi"})
    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        vx2.m53591g(sSLSocket, "sslSocket");
        vx2.m53591g(list, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            Object[] array = Platform.Companion.alpnProtocolNames(list).toArray(new String[0]);
            if (array != null) {
                sSLParameters.setApplicationProtocols((String[]) array);
                sSLSocket.setSSLParameters(sSLParameters);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }

    @SuppressLint({"NewApi"})
    public String getSelectedProtocol(SSLSocket sSLSocket) {
        boolean z;
        vx2.m53591g(sSLSocket, "sslSocket");
        String a = sSLSocket.getApplicationProtocol();
        if (a == null) {
            z = true;
        } else {
            z = vx2.m53586b(a, "");
        }
        if (z) {
            return null;
        }
        return a;
    }

    public boolean isSupported() {
        return Companion.isSupported();
    }

    public boolean matchesSocket(SSLSocket sSLSocket) {
        vx2.m53591g(sSLSocket, "sslSocket");
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    public boolean matchesSocketFactory(SSLSocketFactory sSLSocketFactory) {
        return SocketAdapter.DefaultImpls.matchesSocketFactory(this, sSLSocketFactory);
    }

    public X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
        return SocketAdapter.DefaultImpls.trustManager(this, sSLSocketFactory);
    }
}
