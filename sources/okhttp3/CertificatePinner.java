package okhttp3;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.tls.CertificateChainCleaner;
import okio.ByteString;
import org.slf4j.Marker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0002\b\r\u0018\u0000 &2\u00020\u0001:\u0003'&(B#\b\u0000\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00100\u001c\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b$\u0010%J\u001c\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J+\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00040\tH\u0000¢\u0006\u0004\b\f\u0010\rJ+\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u000e\"\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\u000fJ\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0017\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u001b\u001a\u00020\u001aH\u0016R\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00100\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0000X\u0004¢\u0006\f\n\u0004\b\u0013\u0010!\u001a\u0004\b\"\u0010#¨\u0006)"}, mo44877d2 = {"Lokhttp3/CertificatePinner;", "", "", "hostname", "", "Ljava/security/cert/Certificate;", "peerCertificates", "Lr37;", "check", "Lkotlin/Function0;", "Ljava/security/cert/X509Certificate;", "cleanedPeerCertificatesFn", "check$okhttp", "(Ljava/lang/String;Lpc2;)V", "", "(Ljava/lang/String;[Ljava/security/cert/Certificate;)V", "Lokhttp3/CertificatePinner$Pin;", "findMatchingPins", "Lokhttp3/internal/tls/CertificateChainCleaner;", "certificateChainCleaner", "withCertificateChainCleaner$okhttp", "(Lokhttp3/internal/tls/CertificateChainCleaner;)Lokhttp3/CertificatePinner;", "withCertificateChainCleaner", "other", "", "equals", "", "hashCode", "", "pins", "Ljava/util/Set;", "getPins", "()Ljava/util/Set;", "Lokhttp3/internal/tls/CertificateChainCleaner;", "getCertificateChainCleaner$okhttp", "()Lokhttp3/internal/tls/CertificateChainCleaner;", "<init>", "(Ljava/util/Set;Lokhttp3/internal/tls/CertificateChainCleaner;)V", "Companion", "Builder", "Pin", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: CertificatePinner.kt */
public final class CertificatePinner {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final CertificatePinner DEFAULT = new Builder().build();
    private final CertificateChainCleaner certificateChainCleaner;
    private final Set<Pin> pins;

    @Metadata(mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J'\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\u000b\"\u00020\n¢\u0006\u0002\u0010\fJ\u0006\u0010\r\u001a\u00020\u000eR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, mo44877d2 = {"Lokhttp3/CertificatePinner$Builder;", "", "()V", "pins", "", "Lokhttp3/CertificatePinner$Pin;", "getPins", "()Ljava/util/List;", "add", "pattern", "", "", "(Ljava/lang/String;[Ljava/lang/String;)Lokhttp3/CertificatePinner$Builder;", "build", "Lokhttp3/CertificatePinner;", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0}, mo44881xi = 48)
    /* compiled from: CertificatePinner.kt */
    public static final class Builder {
        private final List<Pin> pins = new ArrayList();

        public final Builder add(String str, String... strArr) {
            vx2.m53591g(str, "pattern");
            vx2.m53591g(strArr, "pins");
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                String str2 = strArr[i];
                i++;
                getPins().add(new Pin(str, str2));
            }
            return this;
        }

        public final CertificatePinner build() {
            return new CertificatePinner(CollectionsKt___CollectionsKt.m47315O0(this.pins), (CertificateChainCleaner) null, 2, (DefaultConstructorMarker) null);
        }

        public final List<Pin> getPins() {
            return this.pins;
        }
    }

    @Metadata(mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\f\u0010\t\u001a\u00020\n*\u00020\u000bH\u0007J\f\u0010\f\u001a\u00020\n*\u00020\u000bH\u0007R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, mo44877d2 = {"Lokhttp3/CertificatePinner$Companion;", "", "()V", "DEFAULT", "Lokhttp3/CertificatePinner;", "pin", "", "certificate", "Ljava/security/cert/Certificate;", "sha1Hash", "Lokio/ByteString;", "Ljava/security/cert/X509Certificate;", "sha256Hash", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0}, mo44881xi = 48)
    /* compiled from: CertificatePinner.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String pin(Certificate certificate) {
            vx2.m53591g(certificate, "certificate");
            if (certificate instanceof X509Certificate) {
                return vx2.m53598n("sha256/", sha256Hash((X509Certificate) certificate).base64());
            }
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates".toString());
        }

        public final ByteString sha1Hash(X509Certificate x509Certificate) {
            vx2.m53591g(x509Certificate, "<this>");
            ByteString.C9034a aVar = ByteString.Companion;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            vx2.m53590f(encoded, "publicKey.encoded");
            return ByteString.C9034a.m70311h(aVar, encoded, 0, 0, 3, (Object) null).sha1();
        }

        public final ByteString sha256Hash(X509Certificate x509Certificate) {
            vx2.m53591g(x509Certificate, "<this>");
            ByteString.C9034a aVar = ByteString.Companion;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            vx2.m53590f(encoded, "publicKey.encoded");
            return ByteString.C9034a.m70311h(aVar, encoded, 0, 0, 3, (Object) null).sha256();
        }
    }

    @Metadata(mo44876d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u000e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0003J\b\u0010\u0018\u001a\u00020\u0003H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, mo44877d2 = {"Lokhttp3/CertificatePinner$Pin;", "", "pattern", "", "pin", "(Ljava/lang/String;Ljava/lang/String;)V", "hash", "Lokio/ByteString;", "getHash", "()Lokio/ByteString;", "hashAlgorithm", "getHashAlgorithm", "()Ljava/lang/String;", "getPattern", "equals", "", "other", "hashCode", "", "matchesCertificate", "certificate", "Ljava/security/cert/X509Certificate;", "matchesHostname", "hostname", "toString", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0}, mo44881xi = 48)
    /* compiled from: CertificatePinner.kt */
    public static final class Pin {
        private final ByteString hash;
        private final String hashAlgorithm;
        private final String pattern;

        public Pin(String str, String str2) {
            boolean z;
            vx2.m53591g(str, "pattern");
            vx2.m53591g(str2, "pin");
            if ((!yb6.m74336M(str, "*.", false, 2, (Object) null) || StringsKt__StringsKt.m63100e0(str, Marker.ANY_MARKER, 1, false, 4, (Object) null) != -1) && ((!yb6.m74336M(str, "**.", false, 2, (Object) null) || StringsKt__StringsKt.m63100e0(str, Marker.ANY_MARKER, 2, false, 4, (Object) null) != -1) && StringsKt__StringsKt.m63100e0(str, Marker.ANY_MARKER, 0, false, 6, (Object) null) != -1)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                String canonicalHost = HostnamesKt.toCanonicalHost(str);
                if (canonicalHost != null) {
                    this.pattern = canonicalHost;
                    if (yb6.m74336M(str2, "sha1/", false, 2, (Object) null)) {
                        this.hashAlgorithm = "sha1";
                        ByteString.C9034a aVar = ByteString.Companion;
                        String substring = str2.substring(5);
                        vx2.m53590f(substring, "this as java.lang.String).substring(startIndex)");
                        ByteString a = aVar.mo64477a(substring);
                        if (a != null) {
                            this.hash = a;
                            return;
                        }
                        throw new IllegalArgumentException(vx2.m53598n("Invalid pin hash: ", str2));
                    } else if (yb6.m74336M(str2, "sha256/", false, 2, (Object) null)) {
                        this.hashAlgorithm = "sha256";
                        ByteString.C9034a aVar2 = ByteString.Companion;
                        String substring2 = str2.substring(7);
                        vx2.m53590f(substring2, "this as java.lang.String).substring(startIndex)");
                        ByteString a2 = aVar2.mo64477a(substring2);
                        if (a2 != null) {
                            this.hash = a2;
                            return;
                        }
                        throw new IllegalArgumentException(vx2.m53598n("Invalid pin hash: ", str2));
                    } else {
                        throw new IllegalArgumentException(vx2.m53598n("pins must start with 'sha256/' or 'sha1/': ", str2));
                    }
                } else {
                    throw new IllegalArgumentException(vx2.m53598n("Invalid pattern: ", str));
                }
            } else {
                throw new IllegalArgumentException(vx2.m53598n("Unexpected pattern: ", str).toString());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Pin)) {
                return false;
            }
            Pin pin = (Pin) obj;
            if (vx2.m53586b(this.pattern, pin.pattern) && vx2.m53586b(this.hashAlgorithm, pin.hashAlgorithm) && vx2.m53586b(this.hash, pin.hash)) {
                return true;
            }
            return false;
        }

        public final ByteString getHash() {
            return this.hash;
        }

        public final String getHashAlgorithm() {
            return this.hashAlgorithm;
        }

        public final String getPattern() {
            return this.pattern;
        }

        public int hashCode() {
            return (((this.pattern.hashCode() * 31) + this.hashAlgorithm.hashCode()) * 31) + this.hash.hashCode();
        }

        public final boolean matchesCertificate(X509Certificate x509Certificate) {
            vx2.m53591g(x509Certificate, "certificate");
            String str = this.hashAlgorithm;
            if (vx2.m53586b(str, "sha256")) {
                return vx2.m53586b(this.hash, CertificatePinner.Companion.sha256Hash(x509Certificate));
            }
            if (vx2.m53586b(str, "sha1")) {
                return vx2.m53586b(this.hash, CertificatePinner.Companion.sha1Hash(x509Certificate));
            }
            return false;
        }

        public final boolean matchesHostname(String str) {
            vx2.m53591g(str, "hostname");
            if (yb6.m74336M(this.pattern, "**.", false, 2, (Object) null)) {
                int length = this.pattern.length() - 3;
                int length2 = str.length() - length;
                if (!yb6.m74327D(str, str.length() - length, this.pattern, 3, length, false, 16, (Object) null)) {
                    return false;
                }
                if (!(length2 == 0 || str.charAt(length2 - 1) == '.')) {
                    return false;
                }
            } else if (!yb6.m74336M(this.pattern, "*.", false, 2, (Object) null)) {
                return vx2.m53586b(str, this.pattern);
            } else {
                int length3 = this.pattern.length() - 1;
                int length4 = str.length() - length3;
                if (!yb6.m74327D(str, str.length() - length3, this.pattern, 1, length3, false, 16, (Object) null)) {
                    return false;
                }
                if (StringsKt__StringsKt.m63104i0(str, '.', length4 - 1, false, 4, (Object) null) != -1) {
                    return false;
                }
            }
            return true;
        }

        public String toString() {
            return this.hashAlgorithm + '/' + this.hash.base64();
        }
    }

    public CertificatePinner(Set<Pin> set, CertificateChainCleaner certificateChainCleaner2) {
        vx2.m53591g(set, "pins");
        this.pins = set;
        this.certificateChainCleaner = certificateChainCleaner2;
    }

    public static final String pin(Certificate certificate) {
        return Companion.pin(certificate);
    }

    public static final ByteString sha1Hash(X509Certificate x509Certificate) {
        return Companion.sha1Hash(x509Certificate);
    }

    public static final ByteString sha256Hash(X509Certificate x509Certificate) {
        return Companion.sha256Hash(x509Certificate);
    }

    public final void check(String str, List<? extends Certificate> list) throws SSLPeerUnverifiedException {
        vx2.m53591g(str, "hostname");
        vx2.m53591g(list, "peerCertificates");
        check$okhttp(str, new CertificatePinner$check$1(this, list, str));
    }

    public final void check$okhttp(String str, pc2<? extends List<? extends X509Certificate>> pc2) {
        vx2.m53591g(str, "hostname");
        vx2.m53591g(pc2, "cleanedPeerCertificatesFn");
        List<Pin> findMatchingPins = findMatchingPins(str);
        if (!findMatchingPins.isEmpty()) {
            List<X509Certificate> list = (List) pc2.invoke();
            for (X509Certificate x509Certificate : list) {
                Iterator<Pin> it = findMatchingPins.iterator();
                ByteString byteString = null;
                ByteString byteString2 = null;
                while (true) {
                    if (it.hasNext()) {
                        Pin next = it.next();
                        String hashAlgorithm = next.getHashAlgorithm();
                        if (vx2.m53586b(hashAlgorithm, "sha256")) {
                            if (byteString == null) {
                                byteString = Companion.sha256Hash(x509Certificate);
                            }
                            if (vx2.m53586b(next.getHash(), byteString)) {
                                return;
                            }
                        } else if (vx2.m53586b(hashAlgorithm, "sha1")) {
                            if (byteString2 == null) {
                                byteString2 = Companion.sha1Hash(x509Certificate);
                            }
                            if (vx2.m53586b(next.getHash(), byteString2)) {
                                return;
                            }
                        } else {
                            throw new AssertionError(vx2.m53598n("unsupported hashAlgorithm: ", next.getHashAlgorithm()));
                        }
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Certificate pinning failure!");
            sb.append("\n  Peer certificate chain:");
            for (X509Certificate x509Certificate2 : list) {
                sb.append("\n    ");
                sb.append(Companion.pin(x509Certificate2));
                sb.append(": ");
                sb.append(x509Certificate2.getSubjectDN().getName());
            }
            sb.append("\n  Pinned certificates for ");
            sb.append(str);
            sb.append(":");
            for (Pin append : findMatchingPins) {
                sb.append("\n    ");
                sb.append(append);
            }
            String sb2 = sb.toString();
            vx2.m53590f(sb2, "StringBuilder().apply(builderAction).toString()");
            throw new SSLPeerUnverifiedException(sb2);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof CertificatePinner) {
            CertificatePinner certificatePinner = (CertificatePinner) obj;
            if (!vx2.m53586b(certificatePinner.pins, this.pins) || !vx2.m53586b(certificatePinner.certificateChainCleaner, this.certificateChainCleaner)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final List<Pin> findMatchingPins(String str) {
        vx2.m53591g(str, "hostname");
        Set<Pin> set = this.pins;
        List<Pin> j = ck0.m33062j();
        for (T next : set) {
            if (((Pin) next).matchesHostname(str)) {
                if (j.isEmpty()) {
                    j = new ArrayList<>();
                }
                t07.m52024c(j).add(next);
            }
        }
        return j;
    }

    public final CertificateChainCleaner getCertificateChainCleaner$okhttp() {
        return this.certificateChainCleaner;
    }

    public final Set<Pin> getPins() {
        return this.pins;
    }

    public int hashCode() {
        int i;
        int hashCode = (1517 + this.pins.hashCode()) * 41;
        CertificateChainCleaner certificateChainCleaner2 = this.certificateChainCleaner;
        if (certificateChainCleaner2 != null) {
            i = certificateChainCleaner2.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public final CertificatePinner withCertificateChainCleaner$okhttp(CertificateChainCleaner certificateChainCleaner2) {
        vx2.m53591g(certificateChainCleaner2, "certificateChainCleaner");
        if (vx2.m53586b(this.certificateChainCleaner, certificateChainCleaner2)) {
            return this;
        }
        return new CertificatePinner(this.pins, certificateChainCleaner2);
    }

    public final void check(String str, Certificate... certificateArr) throws SSLPeerUnverifiedException {
        vx2.m53591g(str, "hostname");
        vx2.m53591g(certificateArr, "peerCertificates");
        check(str, (List<? extends Certificate>) ArraysKt___ArraysKt.m47291q0(certificateArr));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CertificatePinner(Set set, CertificateChainCleaner certificateChainCleaner2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(set, (i & 2) != 0 ? null : certificateChainCleaner2);
    }
}
