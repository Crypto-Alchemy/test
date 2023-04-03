package okhttp3;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import okhttp3.internal.tls.CertificateChainCleaner;

@Metadata(mo44876d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, mo44877d2 = {"<anonymous>", "", "Ljava/security/cert/X509Certificate;", "invoke"}, mo44878k = 3, mo44879mv = {1, 6, 0}, mo44881xi = 48)
/* compiled from: CertificatePinner.kt */
public final class CertificatePinner$check$1 extends Lambda implements pc2<List<? extends X509Certificate>> {
    public final /* synthetic */ String $hostname;
    public final /* synthetic */ List<Certificate> $peerCertificates;
    public final /* synthetic */ CertificatePinner this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CertificatePinner$check$1(CertificatePinner certificatePinner, List<? extends Certificate> list, String str) {
        super(0);
        this.this$0 = certificatePinner;
        this.$peerCertificates = list;
        this.$hostname = str;
    }

    public final List<X509Certificate> invoke() {
        CertificateChainCleaner certificateChainCleaner$okhttp = this.this$0.getCertificateChainCleaner$okhttp();
        List<Certificate> clean = certificateChainCleaner$okhttp == null ? null : certificateChainCleaner$okhttp.clean(this.$peerCertificates, this.$hostname);
        if (clean == null) {
            clean = this.$peerCertificates;
        }
        ArrayList arrayList = new ArrayList(dk0.m43495u(clean, 10));
        for (Certificate certificate : clean) {
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }
}
