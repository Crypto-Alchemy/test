package okhttp3.internal.platform.android;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.SuppressSignatureCheck;
import okhttp3.internal.tls.CertificateChainCleaner;

@Metadata(mo44876d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0017J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, mo44877d2 = {"Lokhttp3/internal/platform/android/AndroidCertificateChainCleaner;", "Lokhttp3/internal/tls/CertificateChainCleaner;", "trustManager", "Ljavax/net/ssl/X509TrustManager;", "x509TrustManagerExtensions", "Landroid/net/http/X509TrustManagerExtensions;", "(Ljavax/net/ssl/X509TrustManager;Landroid/net/http/X509TrustManagerExtensions;)V", "clean", "", "Ljava/security/cert/Certificate;", "chain", "hostname", "", "equals", "", "other", "", "hashCode", "", "Companion", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0}, mo44881xi = 48)
/* compiled from: AndroidCertificateChainCleaner.kt */
public final class AndroidCertificateChainCleaner extends CertificateChainCleaner {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final X509TrustManager trustManager;
    private final X509TrustManagerExtensions x509TrustManagerExtensions;

    @Metadata(mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, mo44877d2 = {"Lokhttp3/internal/platform/android/AndroidCertificateChainCleaner$Companion;", "", "()V", "buildIfSupported", "Lokhttp3/internal/platform/android/AndroidCertificateChainCleaner;", "trustManager", "Ljavax/net/ssl/X509TrustManager;", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0}, mo44881xi = 48)
    /* compiled from: AndroidCertificateChainCleaner.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @SuppressSignatureCheck
        public final AndroidCertificateChainCleaner buildIfSupported(X509TrustManager x509TrustManager) {
            X509TrustManagerExtensions x509TrustManagerExtensions;
            vx2.m53591g(x509TrustManager, "trustManager");
            try {
                x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
            } catch (IllegalArgumentException unused) {
                x509TrustManagerExtensions = null;
            }
            if (x509TrustManagerExtensions != null) {
                return new AndroidCertificateChainCleaner(x509TrustManager, x509TrustManagerExtensions);
            }
            return null;
        }
    }

    public AndroidCertificateChainCleaner(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions2) {
        vx2.m53591g(x509TrustManager, "trustManager");
        vx2.m53591g(x509TrustManagerExtensions2, "x509TrustManagerExtensions");
        this.trustManager = x509TrustManager;
        this.x509TrustManagerExtensions = x509TrustManagerExtensions2;
    }

    @SuppressSignatureCheck
    public List<Certificate> clean(List<? extends Certificate> list, String str) throws SSLPeerUnverifiedException {
        vx2.m53591g(list, "chain");
        vx2.m53591g(str, "hostname");
        Object[] array = list.toArray(new X509Certificate[0]);
        if (array != null) {
            try {
                List<X509Certificate> checkServerTrusted = this.x509TrustManagerExtensions.checkServerTrusted((X509Certificate[]) array, "RSA", str);
                vx2.m53590f(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
                return checkServerTrusted;
            } catch (CertificateException e) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
                sSLPeerUnverifiedException.initCause(e);
                throw sSLPeerUnverifiedException;
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AndroidCertificateChainCleaner) || ((AndroidCertificateChainCleaner) obj).trustManager != this.trustManager) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return System.identityHashCode(this.trustManager);
    }
}
