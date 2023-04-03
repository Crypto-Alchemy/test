package okhttp3.internal.connection;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import okhttp3.Handshake;

@Metadata(mo44876d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, mo44877d2 = {"<anonymous>", "", "Ljava/security/cert/X509Certificate;", "invoke"}, mo44878k = 3, mo44879mv = {1, 6, 0}, mo44881xi = 48)
/* compiled from: RealConnection.kt */
public final class RealConnection$connectTls$2 extends Lambda implements pc2<List<? extends X509Certificate>> {
    public final /* synthetic */ RealConnection this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RealConnection$connectTls$2(RealConnection realConnection) {
        super(0);
        this.this$0 = realConnection;
    }

    public final List<X509Certificate> invoke() {
        Handshake access$getHandshake$p = this.this$0.handshake;
        vx2.m53588d(access$getHandshake$p);
        List<Certificate> peerCertificates = access$getHandshake$p.peerCertificates();
        ArrayList arrayList = new ArrayList(dk0.m43495u(peerCertificates, 10));
        for (Certificate certificate : peerCertificates) {
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }
}
