package okhttp3.internal.platform;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Protocol;
import okhttp3.internal.SuppressSignatureCheck;
import okhttp3.internal.platform.android.AndroidCertificateChainCleaner;
import okhttp3.internal.platform.android.AndroidSocketAdapter;
import okhttp3.internal.platform.android.BouncyCastleSocketAdapter;
import okhttp3.internal.platform.android.CloseGuard;
import okhttp3.internal.platform.android.ConscryptSocketAdapter;
import okhttp3.internal.platform.android.DeferredSocketAdapter;
import okhttp3.internal.platform.android.SocketAdapter;
import okhttp3.internal.platform.android.StandardAndroidSocketAdapter;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.TrustRootIndex;
import org.web3j.abi.datatypes.Address;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 +2\u00020\u0001:\u0002+,B\u0007¢\u0006\u0004\b)\u0010*J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0012\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J(\u0010\u0015\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0017\u001a\u00020\u0010H\u0016J\u001a\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\u0018H\u0016J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010 \u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\"\u001a\u00020!2\u0006\u0010\r\u001a\u00020\fH\u0016R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006-"}, mo44877d2 = {"Lokhttp3/internal/platform/AndroidPlatform;", "Lokhttp3/internal/platform/Platform;", "Ljava/net/Socket;", "socket", "Ljava/net/InetSocketAddress;", "address", "", "connectTimeout", "Lr37;", "connectSocket", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lokhttp3/Protocol;", "protocols", "configureTlsExtensions", "getSelectedProtocol", "closer", "", "getStackTraceForCloseable", "message", "stackTrace", "logCloseableLeak", "", "isCleartextTrafficPermitted", "Lokhttp3/internal/tls/CertificateChainCleaner;", "buildCertificateChainCleaner", "Lokhttp3/internal/tls/TrustRootIndex;", "buildTrustRootIndex", "Lokhttp3/internal/platform/android/SocketAdapter;", "socketAdapters", "Ljava/util/List;", "Lokhttp3/internal/platform/android/CloseGuard;", "closeGuard", "Lokhttp3/internal/platform/android/CloseGuard;", "<init>", "()V", "Companion", "CustomTrustRootIndex", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0})
@SuppressSignatureCheck
/* compiled from: AndroidPlatform.kt */
public final class AndroidPlatform extends Platform {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final boolean isSupported;
    private final CloseGuard closeGuard;
    private final List<SocketAdapter> socketAdapters;

    @Metadata(mo44876d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0005¨\u0006\b"}, mo44877d2 = {"Lokhttp3/internal/platform/AndroidPlatform$Companion;", "", "()V", "isSupported", "", "()Z", "buildIfSupported", "Lokhttp3/internal/platform/Platform;", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0}, mo44881xi = 48)
    /* compiled from: AndroidPlatform.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Platform buildIfSupported() {
            if (isSupported()) {
                return new AndroidPlatform();
            }
            return null;
        }

        public final boolean isSupported() {
            return AndroidPlatform.isSupported;
        }
    }

    @Metadata(mo44876d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u0007\u001a\u00020\u0003HÂ\u0003J\t\u0010\b\u001a\u00020\u0005HÂ\u0003J\u001d\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, mo44877d2 = {"Lokhttp3/internal/platform/AndroidPlatform$CustomTrustRootIndex;", "Lokhttp3/internal/tls/TrustRootIndex;", "trustManager", "Ljavax/net/ssl/X509TrustManager;", "findByIssuerAndSignatureMethod", "Ljava/lang/reflect/Method;", "(Ljavax/net/ssl/X509TrustManager;Ljava/lang/reflect/Method;)V", "component1", "component2", "copy", "equals", "", "other", "", "findByIssuerAndSignature", "Ljava/security/cert/X509Certificate;", "cert", "hashCode", "", "toString", "", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0}, mo44881xi = 48)
    /* compiled from: AndroidPlatform.kt */
    public static final class CustomTrustRootIndex implements TrustRootIndex {
        private final Method findByIssuerAndSignatureMethod;
        private final X509TrustManager trustManager;

        public CustomTrustRootIndex(X509TrustManager x509TrustManager, Method method) {
            vx2.m53591g(x509TrustManager, "trustManager");
            vx2.m53591g(method, "findByIssuerAndSignatureMethod");
            this.trustManager = x509TrustManager;
            this.findByIssuerAndSignatureMethod = method;
        }

        private final X509TrustManager component1() {
            return this.trustManager;
        }

        private final Method component2() {
            return this.findByIssuerAndSignatureMethod;
        }

        public static /* synthetic */ CustomTrustRootIndex copy$default(CustomTrustRootIndex customTrustRootIndex, X509TrustManager x509TrustManager, Method method, int i, Object obj) {
            if ((i & 1) != 0) {
                x509TrustManager = customTrustRootIndex.trustManager;
            }
            if ((i & 2) != 0) {
                method = customTrustRootIndex.findByIssuerAndSignatureMethod;
            }
            return customTrustRootIndex.copy(x509TrustManager, method);
        }

        public final CustomTrustRootIndex copy(X509TrustManager x509TrustManager, Method method) {
            vx2.m53591g(x509TrustManager, "trustManager");
            vx2.m53591g(method, "findByIssuerAndSignatureMethod");
            return new CustomTrustRootIndex(x509TrustManager, method);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CustomTrustRootIndex)) {
                return false;
            }
            CustomTrustRootIndex customTrustRootIndex = (CustomTrustRootIndex) obj;
            return vx2.m53586b(this.trustManager, customTrustRootIndex.trustManager) && vx2.m53586b(this.findByIssuerAndSignatureMethod, customTrustRootIndex.findByIssuerAndSignatureMethod);
        }

        public X509Certificate findByIssuerAndSignature(X509Certificate x509Certificate) {
            vx2.m53591g(x509Certificate, "cert");
            try {
                Object invoke = this.findByIssuerAndSignatureMethod.invoke(this.trustManager, new Object[]{x509Certificate});
                if (invoke != null) {
                    return ((TrustAnchor) invoke).getTrustedCert();
                }
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.TrustAnchor");
            } catch (IllegalAccessException e) {
                throw new AssertionError("unable to get issues and signature", e);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public int hashCode() {
            return (this.trustManager.hashCode() * 31) + this.findByIssuerAndSignatureMethod.hashCode();
        }

        public String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.trustManager + ", findByIssuerAndSignatureMethod=" + this.findByIssuerAndSignatureMethod + ')';
        }
    }

    static {
        boolean z = false;
        if (Platform.Companion.isAndroid() && Build.VERSION.SDK_INT < 30) {
            z = true;
        }
        isSupported = z;
    }

    public AndroidPlatform() {
        List o = ck0.m33067o(StandardAndroidSocketAdapter.Companion.buildIfSupported$default(StandardAndroidSocketAdapter.Companion, (String) null, 1, (Object) null), new DeferredSocketAdapter(AndroidSocketAdapter.Companion.getPlayProviderFactory()), new DeferredSocketAdapter(ConscryptSocketAdapter.Companion.getFactory()), new DeferredSocketAdapter(BouncyCastleSocketAdapter.Companion.getFactory()));
        ArrayList arrayList = new ArrayList();
        for (Object next : o) {
            if (((SocketAdapter) next).isSupported()) {
                arrayList.add(next);
            }
        }
        this.socketAdapters = arrayList;
        this.closeGuard = CloseGuard.Companion.get();
    }

    public CertificateChainCleaner buildCertificateChainCleaner(X509TrustManager x509TrustManager) {
        vx2.m53591g(x509TrustManager, "trustManager");
        AndroidCertificateChainCleaner buildIfSupported = AndroidCertificateChainCleaner.Companion.buildIfSupported(x509TrustManager);
        if (buildIfSupported == null) {
            return super.buildCertificateChainCleaner(x509TrustManager);
        }
        return buildIfSupported;
    }

    public TrustRootIndex buildTrustRootIndex(X509TrustManager x509TrustManager) {
        vx2.m53591g(x509TrustManager, "trustManager");
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", new Class[]{X509Certificate.class});
            declaredMethod.setAccessible(true);
            vx2.m53590f(declaredMethod, "method");
            return new CustomTrustRootIndex(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.buildTrustRootIndex(x509TrustManager);
        }
    }

    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<Protocol> list) {
        T t;
        vx2.m53591g(sSLSocket, "sslSocket");
        vx2.m53591g(list, "protocols");
        Iterator<T> it = this.socketAdapters.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((SocketAdapter) t).matchesSocket(sSLSocket)) {
                break;
            }
        }
        SocketAdapter socketAdapter = (SocketAdapter) t;
        if (socketAdapter != null) {
            socketAdapter.configureTlsExtensions(sSLSocket, str, list);
        }
    }

    public void connectSocket(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        vx2.m53591g(socket, "socket");
        vx2.m53591g(inetSocketAddress, Address.TYPE_NAME);
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e) {
            if (Build.VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", e);
            }
            throw e;
        }
    }

    public String getSelectedProtocol(SSLSocket sSLSocket) {
        T t;
        vx2.m53591g(sSLSocket, "sslSocket");
        Iterator<T> it = this.socketAdapters.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((SocketAdapter) t).matchesSocket(sSLSocket)) {
                break;
            }
        }
        SocketAdapter socketAdapter = (SocketAdapter) t;
        if (socketAdapter == null) {
            return null;
        }
        return socketAdapter.getSelectedProtocol(sSLSocket);
    }

    public Object getStackTraceForCloseable(String str) {
        vx2.m53591g(str, "closer");
        return this.closeGuard.createAndOpen(str);
    }

    public boolean isCleartextTrafficPermitted(String str) {
        vx2.m53591g(str, "hostname");
        if (Build.VERSION.SDK_INT >= 24) {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
        }
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
    }

    public void logCloseableLeak(String str, Object obj) {
        vx2.m53591g(str, ThrowableDeserializer.PROP_NAME_MESSAGE);
        if (!this.closeGuard.warnIfOpen(obj)) {
            Platform.log$default(this, str, 5, (Throwable) null, 4, (Object) null);
        }
    }

    public X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
        T t;
        vx2.m53591g(sSLSocketFactory, "sslSocketFactory");
        Iterator<T> it = this.socketAdapters.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((SocketAdapter) t).matchesSocketFactory(sSLSocketFactory)) {
                break;
            }
        }
        SocketAdapter socketAdapter = (SocketAdapter) t;
        if (socketAdapter == null) {
            return null;
        }
        return socketAdapter.trustManager(sSLSocketFactory);
    }
}
