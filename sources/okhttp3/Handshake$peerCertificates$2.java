package okhttp3;

import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44876d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, mo44877d2 = {"<anonymous>", "", "Ljava/security/cert/Certificate;", "invoke"}, mo44878k = 3, mo44879mv = {1, 6, 0}, mo44881xi = 48)
/* compiled from: Handshake.kt */
public final class Handshake$peerCertificates$2 extends Lambda implements pc2<List<? extends Certificate>> {
    public final /* synthetic */ pc2<List<Certificate>> $peerCertificatesFn;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Handshake$peerCertificates$2(pc2<? extends List<? extends Certificate>> pc2) {
        super(0);
        this.$peerCertificatesFn = pc2;
    }

    public final List<Certificate> invoke() {
        try {
            return this.$peerCertificatesFn.invoke();
        } catch (SSLPeerUnverifiedException unused) {
            return ck0.m33062j();
        }
    }
}
