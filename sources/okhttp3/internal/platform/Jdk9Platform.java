package okhttp3.internal.platform;

import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Protocol;
import okhttp3.internal.SuppressSignatureCheck;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J(\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0017J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¨\u0006\u0013"}, mo44877d2 = {"Lokhttp3/internal/platform/Jdk9Platform;", "Lokhttp3/internal/platform/Platform;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lokhttp3/Protocol;", "protocols", "Lr37;", "configureTlsExtensions", "getSelectedProtocol", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "<init>", "()V", "Companion", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: Jdk9Platform.kt */
public class Jdk9Platform extends Platform {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final boolean isAvailable;

    @Metadata(mo44876d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0005¨\u0006\b"}, mo44877d2 = {"Lokhttp3/internal/platform/Jdk9Platform$Companion;", "", "()V", "isAvailable", "", "()Z", "buildIfSupported", "Lokhttp3/internal/platform/Jdk9Platform;", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0}, mo44881xi = 48)
    /* compiled from: Jdk9Platform.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Jdk9Platform buildIfSupported() {
            if (isAvailable()) {
                return new Jdk9Platform();
            }
            return null;
        }

        public final boolean isAvailable() {
            return Jdk9Platform.isAvailable;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001f, code lost:
        if (r1.intValue() >= 9) goto L_0x002d;
     */
    static {
        /*
            okhttp3.internal.platform.Jdk9Platform$Companion r0 = new okhttp3.internal.platform.Jdk9Platform$Companion
            r1 = 0
            r0.<init>(r1)
            Companion = r0
            java.lang.String r0 = "java.specification.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 != 0) goto L_0x0011
            goto L_0x0015
        L_0x0011:
            java.lang.Integer r1 = p000.xb6.m73916n(r0)
        L_0x0015:
            r0 = 1
            r2 = 0
            if (r1 == 0) goto L_0x0024
            int r1 = r1.intValue()
            r3 = 9
            if (r1 < r3) goto L_0x0022
            goto L_0x002d
        L_0x0022:
            r0 = r2
            goto L_0x002d
        L_0x0024:
            java.lang.Class<javax.net.ssl.SSLSocket> r1 = javax.net.ssl.SSLSocket.class
            java.lang.String r3 = "getApplicationProtocol"
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x0022 }
            r1.getMethod(r3, r4)     // Catch:{ NoSuchMethodException -> 0x0022 }
        L_0x002d:
            isAvailable = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.platform.Jdk9Platform.<clinit>():void");
    }

    @SuppressSignatureCheck
    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<Protocol> list) {
        vx2.m53591g(sSLSocket, "sslSocket");
        vx2.m53591g(list, "protocols");
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        Object[] array = Platform.Companion.alpnProtocolNames(list).toArray(new String[0]);
        if (array != null) {
            sSLParameters.setApplicationProtocols((String[]) array);
            sSLSocket.setSSLParameters(sSLParameters);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    @SuppressSignatureCheck
    public String getSelectedProtocol(SSLSocket sSLSocket) {
        boolean z;
        vx2.m53591g(sSLSocket, "sslSocket");
        try {
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
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    public X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
        vx2.m53591g(sSLSocketFactory, "sslSocketFactory");
        throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on JDK 9+");
    }
}
