package okhttp3.internal.platform.android;

import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import okhttp3.Protocol;
import okhttp3.internal.platform.android.SocketAdapter;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J(\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, mo44877d2 = {"Lokhttp3/internal/platform/android/DeferredSocketAdapter;", "Lokhttp3/internal/platform/android/SocketAdapter;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "getDelegate", "", "isSupported", "matchesSocket", "", "hostname", "", "Lokhttp3/Protocol;", "protocols", "Lr37;", "configureTlsExtensions", "getSelectedProtocol", "Lokhttp3/internal/platform/android/DeferredSocketAdapter$Factory;", "socketAdapterFactory", "Lokhttp3/internal/platform/android/DeferredSocketAdapter$Factory;", "delegate", "Lokhttp3/internal/platform/android/SocketAdapter;", "<init>", "(Lokhttp3/internal/platform/android/DeferredSocketAdapter$Factory;)V", "Factory", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: DeferredSocketAdapter.kt */
public final class DeferredSocketAdapter implements SocketAdapter {
    private SocketAdapter delegate;
    private final Factory socketAdapterFactory;

    @Metadata(mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\b"}, mo44877d2 = {"Lokhttp3/internal/platform/android/DeferredSocketAdapter$Factory;", "", "create", "Lokhttp3/internal/platform/android/SocketAdapter;", "sslSocket", "Ljavax/net/ssl/SSLSocket;", "matchesSocket", "", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0}, mo44881xi = 48)
    /* compiled from: DeferredSocketAdapter.kt */
    public interface Factory {
        SocketAdapter create(SSLSocket sSLSocket);

        boolean matchesSocket(SSLSocket sSLSocket);
    }

    public DeferredSocketAdapter(Factory factory) {
        vx2.m53591g(factory, "socketAdapterFactory");
        this.socketAdapterFactory = factory;
    }

    private final synchronized SocketAdapter getDelegate(SSLSocket sSLSocket) {
        if (this.delegate == null && this.socketAdapterFactory.matchesSocket(sSLSocket)) {
            this.delegate = this.socketAdapterFactory.create(sSLSocket);
        }
        return this.delegate;
    }

    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        vx2.m53591g(sSLSocket, "sslSocket");
        vx2.m53591g(list, "protocols");
        SocketAdapter delegate2 = getDelegate(sSLSocket);
        if (delegate2 != null) {
            delegate2.configureTlsExtensions(sSLSocket, str, list);
        }
    }

    public String getSelectedProtocol(SSLSocket sSLSocket) {
        vx2.m53591g(sSLSocket, "sslSocket");
        SocketAdapter delegate2 = getDelegate(sSLSocket);
        if (delegate2 == null) {
            return null;
        }
        return delegate2.getSelectedProtocol(sSLSocket);
    }

    public boolean isSupported() {
        return true;
    }

    public boolean matchesSocket(SSLSocket sSLSocket) {
        vx2.m53591g(sSLSocket, "sslSocket");
        return this.socketAdapterFactory.matchesSocket(sSLSocket);
    }

    public boolean matchesSocketFactory(SSLSocketFactory sSLSocketFactory) {
        return SocketAdapter.DefaultImpls.matchesSocketFactory(this, sSLSocketFactory);
    }

    public X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
        return SocketAdapter.DefaultImpls.trustManager(this, sSLSocketFactory);
    }
}
