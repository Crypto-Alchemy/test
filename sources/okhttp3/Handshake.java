package okhttp3;

import java.io.IOException;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.C6169a;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.Util;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 *2\u00020\u0001:\u0001*B;\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0012\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0&¢\u0006\u0004\b(\u0010)J\u000f\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007¢\u0006\u0004\b\u0013\u0010\rJ\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0004\b\u0015\u0010\u0011J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u001b\u001a\u00020\u001aH\u0016J\b\u0010\u001d\u001a\u00020\u001cH\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u0005\u0010\u0004R\u0017\u0010\t\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b\t\u0010\bR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0007¢\u0006\f\n\u0004\b\u0014\u0010 \u001a\u0004\b\u0014\u0010\rR!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8GX\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u000e\u0010\rR\u0018\u0010%\u001a\u00020\u001c*\u00020\u000b8BX\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000f8G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u000f8G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0011¨\u0006+"}, mo44877d2 = {"Lokhttp3/Handshake;", "", "Lokhttp3/TlsVersion;", "-deprecated_tlsVersion", "()Lokhttp3/TlsVersion;", "tlsVersion", "Lokhttp3/CipherSuite;", "-deprecated_cipherSuite", "()Lokhttp3/CipherSuite;", "cipherSuite", "", "Ljava/security/cert/Certificate;", "-deprecated_peerCertificates", "()Ljava/util/List;", "peerCertificates", "Ljava/security/Principal;", "-deprecated_peerPrincipal", "()Ljava/security/Principal;", "peerPrincipal", "-deprecated_localCertificates", "localCertificates", "-deprecated_localPrincipal", "localPrincipal", "other", "", "equals", "", "hashCode", "", "toString", "Lokhttp3/TlsVersion;", "Lokhttp3/CipherSuite;", "Ljava/util/List;", "peerCertificates$delegate", "Lef3;", "getName", "(Ljava/security/cert/Certificate;)Ljava/lang/String;", "name", "Lkotlin/Function0;", "peerCertificatesFn", "<init>", "(Lokhttp3/TlsVersion;Lokhttp3/CipherSuite;Ljava/util/List;Lpc2;)V", "Companion", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: Handshake.kt */
public final class Handshake {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final CipherSuite cipherSuite;
    private final List<Certificate> localCertificates;
    private final ef3 peerCertificates$delegate;
    private final TlsVersion tlsVersion;

    public Handshake(TlsVersion tlsVersion2, CipherSuite cipherSuite2, List<? extends Certificate> list, pc2<? extends List<? extends Certificate>> pc2) {
        vx2.m53591g(tlsVersion2, "tlsVersion");
        vx2.m53591g(cipherSuite2, "cipherSuite");
        vx2.m53591g(list, "localCertificates");
        vx2.m53591g(pc2, "peerCertificatesFn");
        this.tlsVersion = tlsVersion2;
        this.cipherSuite = cipherSuite2;
        this.localCertificates = list;
        this.peerCertificates$delegate = C6169a.m47232a(new Handshake$peerCertificates$2(pc2));
    }

    public static final Handshake get(SSLSession sSLSession) throws IOException {
        return Companion.get(sSLSession);
    }

    public static final Handshake get(TlsVersion tlsVersion2, CipherSuite cipherSuite2, List<? extends Certificate> list, List<? extends Certificate> list2) {
        return Companion.get(tlsVersion2, cipherSuite2, list, list2);
    }

    private final String getName(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        vx2.m53590f(type, "type");
        return type;
    }

    /* renamed from: -deprecated_cipherSuite  reason: not valid java name */
    public final CipherSuite m75687deprecated_cipherSuite() {
        return this.cipherSuite;
    }

    /* renamed from: -deprecated_localCertificates  reason: not valid java name */
    public final List<Certificate> m75688deprecated_localCertificates() {
        return this.localCertificates;
    }

    /* renamed from: -deprecated_localPrincipal  reason: not valid java name */
    public final Principal m75689deprecated_localPrincipal() {
        return localPrincipal();
    }

    /* renamed from: -deprecated_peerCertificates  reason: not valid java name */
    public final List<Certificate> m75690deprecated_peerCertificates() {
        return peerCertificates();
    }

    /* renamed from: -deprecated_peerPrincipal  reason: not valid java name */
    public final Principal m75691deprecated_peerPrincipal() {
        return peerPrincipal();
    }

    /* renamed from: -deprecated_tlsVersion  reason: not valid java name */
    public final TlsVersion m75692deprecated_tlsVersion() {
        return this.tlsVersion;
    }

    public final CipherSuite cipherSuite() {
        return this.cipherSuite;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Handshake) {
            Handshake handshake = (Handshake) obj;
            if (handshake.tlsVersion != this.tlsVersion || !vx2.m53586b(handshake.cipherSuite, this.cipherSuite) || !vx2.m53586b(handshake.peerCertificates(), peerCertificates()) || !vx2.m53586b(handshake.localCertificates, this.localCertificates)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((527 + this.tlsVersion.hashCode()) * 31) + this.cipherSuite.hashCode()) * 31) + peerCertificates().hashCode()) * 31) + this.localCertificates.hashCode();
    }

    public final List<Certificate> localCertificates() {
        return this.localCertificates;
    }

    public final Principal localPrincipal() {
        X509Certificate x509Certificate;
        Object b0 = CollectionsKt___CollectionsKt.m47331b0(this.localCertificates);
        if (b0 instanceof X509Certificate) {
            x509Certificate = (X509Certificate) b0;
        } else {
            x509Certificate = null;
        }
        if (x509Certificate == null) {
            return null;
        }
        return x509Certificate.getSubjectX500Principal();
    }

    public final List<Certificate> peerCertificates() {
        return (List) this.peerCertificates$delegate.getValue();
    }

    public final Principal peerPrincipal() {
        X509Certificate x509Certificate;
        Object b0 = CollectionsKt___CollectionsKt.m47331b0(peerCertificates());
        if (b0 instanceof X509Certificate) {
            x509Certificate = (X509Certificate) b0;
        } else {
            x509Certificate = null;
        }
        if (x509Certificate == null) {
            return null;
        }
        return x509Certificate.getSubjectX500Principal();
    }

    public final TlsVersion tlsVersion() {
        return this.tlsVersion;
    }

    public String toString() {
        List<Certificate> peerCertificates = peerCertificates();
        ArrayList arrayList = new ArrayList(dk0.m43495u(peerCertificates, 10));
        for (Certificate name : peerCertificates) {
            arrayList.add(getName(name));
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("Handshake{tlsVersion=");
        sb.append(this.tlsVersion);
        sb.append(" cipherSuite=");
        sb.append(this.cipherSuite);
        sb.append(" peerCertificates=");
        sb.append(obj);
        sb.append(" localCertificates=");
        List<Certificate> list = this.localCertificates;
        ArrayList arrayList2 = new ArrayList(dk0.m43495u(list, 10));
        for (Certificate name2 : list) {
            arrayList2.add(getName(name2));
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }

    @Metadata(mo44876d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u0007J4\u0010\u0003\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0007J\u0011\u0010\u0010\u001a\u00020\u0004*\u00020\u0006H\u0007¢\u0006\u0002\b\u0003J!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r*\f\u0012\u0006\b\u0001\u0012\u00020\u000e\u0018\u00010\u0012H\u0002¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, mo44877d2 = {"Lokhttp3/Handshake$Companion;", "", "()V", "get", "Lokhttp3/Handshake;", "sslSession", "Ljavax/net/ssl/SSLSession;", "-deprecated_get", "tlsVersion", "Lokhttp3/TlsVersion;", "cipherSuite", "Lokhttp3/CipherSuite;", "peerCertificates", "", "Ljava/security/cert/Certificate;", "localCertificates", "handshake", "toImmutableList", "", "([Ljava/security/cert/Certificate;)Ljava/util/List;", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0}, mo44881xi = 48)
    /* compiled from: Handshake.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final List<Certificate> toImmutableList(Certificate[] certificateArr) {
            if (certificateArr != null) {
                return Util.immutableListOf(Arrays.copyOf(certificateArr, certificateArr.length));
            }
            return ck0.m33062j();
        }

        /* renamed from: -deprecated_get  reason: not valid java name */
        public final Handshake m75693deprecated_get(SSLSession sSLSession) throws IOException {
            vx2.m53591g(sSLSession, "sslSession");
            return get(sSLSession);
        }

        public final Handshake get(SSLSession sSLSession) throws IOException {
            List<Certificate> list;
            vx2.m53591g(sSLSession, "<this>");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite != null) {
                if (!(vx2.m53586b(cipherSuite, "TLS_NULL_WITH_NULL_NULL") ? true : vx2.m53586b(cipherSuite, "SSL_NULL_WITH_NULL_NULL"))) {
                    CipherSuite forJavaName = CipherSuite.Companion.forJavaName(cipherSuite);
                    String protocol = sSLSession.getProtocol();
                    if (protocol == null) {
                        throw new IllegalStateException("tlsVersion == null".toString());
                    } else if (!vx2.m53586b("NONE", protocol)) {
                        TlsVersion forJavaName2 = TlsVersion.Companion.forJavaName(protocol);
                        try {
                            list = toImmutableList(sSLSession.getPeerCertificates());
                        } catch (SSLPeerUnverifiedException unused) {
                            list = ck0.m33062j();
                        }
                        return new Handshake(forJavaName2, forJavaName, toImmutableList(sSLSession.getLocalCertificates()), new Handshake$Companion$handshake$1(list));
                    } else {
                        throw new IOException("tlsVersion == NONE");
                    }
                } else {
                    throw new IOException(vx2.m53598n("cipherSuite == ", cipherSuite));
                }
            } else {
                throw new IllegalStateException("cipherSuite == null".toString());
            }
        }

        public final Handshake get(TlsVersion tlsVersion, CipherSuite cipherSuite, List<? extends Certificate> list, List<? extends Certificate> list2) {
            vx2.m53591g(tlsVersion, "tlsVersion");
            vx2.m53591g(cipherSuite, "cipherSuite");
            vx2.m53591g(list, "peerCertificates");
            vx2.m53591g(list2, "localCertificates");
            return new Handshake(tlsVersion, cipherSuite, Util.toImmutableList(list2), new Handshake$Companion$get$1(Util.toImmutableList(list)));
        }
    }
}
