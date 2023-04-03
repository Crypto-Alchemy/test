package p000;

import com.walletconnect.android.internal.common.cacao.Cacao;
import com.walletconnect.auth.common.model.PayloadParams;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\u001e\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0000¨\u0006\b"}, mo44877d2 = {"Lcom/walletconnect/auth/common/model/PayloadParams;", "Lqy2;", "iss", "Lcom/walletconnect/android/internal/common/cacao/Cacao$Payload;", "c", "", "chainName", "a", "sdk_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: hq1 */
/* compiled from: EngineMapper.kt */
public final class hq1 {
    /* renamed from: a */
    public static final /* synthetic */ String m45346a(PayloadParams payloadParams, qy2 qy2, String str) {
        vx2.m53591g(payloadParams, "<this>");
        vx2.m53591g(qy2, "iss");
        vx2.m53591g(str, "chainName");
        return a80.m31746a(m45348c(payloadParams, qy2), str);
    }

    /* renamed from: b */
    public static /* synthetic */ String m45347b(PayloadParams payloadParams, qy2 qy2, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "Ethereum";
        }
        return m45346a(payloadParams, qy2, str);
    }

    /* renamed from: c */
    public static final /* synthetic */ Cacao.Payload m45348c(PayloadParams payloadParams, qy2 qy2) {
        vx2.m53591g(payloadParams, "<this>");
        vx2.m53591g(qy2, "iss");
        return new Cacao.Payload(qy2.mo47308e(), payloadParams.mo40639c(), payloadParams.mo40637a(), payloadParams.mo40651l(), payloadParams.mo40645g(), payloadParams.mo40642e(), payloadParams.mo40644f(), payloadParams.mo40641d(), payloadParams.mo40649j(), payloadParams.mo40646h(), payloadParams.mo40648i());
    }
}
