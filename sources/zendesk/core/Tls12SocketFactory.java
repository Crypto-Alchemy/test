package zendesk.core;

import com.zendesk.logger.Logger;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Collections;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.ConnectionSpec;
import okhttp3.OkHttpClient;
import okhttp3.TlsVersion;

class Tls12SocketFactory extends SSLSocketFactory {
    private static final String[] TLS_V12_ONLY = {TlsVersion.TLS_1_2.javaName()};
    public final SSLSocketFactory delegate;

    public Tls12SocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.delegate = sSLSocketFactory;
    }

    public static OkHttpClient.Builder enableTls12(OkHttpClient.Builder builder) {
        Logger.m43078b("Tls12SocketFactory", "Skipping TLS 1.2 patch", new Object[0]);
        builder.connectionSpecs(Collections.singletonList(new ConnectionSpec.Builder(ConnectionSpec.MODERN_TLS).tlsVersions(TlsVersion.TLS_1_2, TlsVersion.TLS_1_3).build()));
        return builder;
    }

    private static Socket patch(Socket socket) {
        if (socket instanceof SSLSocket) {
            ((SSLSocket) socket).setEnabledProtocols(TLS_V12_ONLY);
        }
        return socket;
    }

    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        return patch(this.delegate.createSocket(socket, str, i, z));
    }

    public String[] getDefaultCipherSuites() {
        return this.delegate.getDefaultCipherSuites();
    }

    public String[] getSupportedCipherSuites() {
        return this.delegate.getSupportedCipherSuites();
    }

    public Socket createSocket(String str, int i) throws IOException {
        return patch(this.delegate.createSocket(str, i));
    }

    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        return patch(this.delegate.createSocket(str, i, inetAddress, i2));
    }

    public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        return patch(this.delegate.createSocket(inetAddress, i));
    }

    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        return patch(this.delegate.createSocket(inetAddress, i, inetAddress2, i2));
    }
}
