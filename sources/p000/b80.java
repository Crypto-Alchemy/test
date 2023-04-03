package p000;

import com.walletconnect.android.cacao.signature.SignatureType;
import com.walletconnect.android.internal.common.cacao.Cacao;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\b\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001d\u0010\b\u001a\u00020\u00068\u0002X\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000b"}, mo44877d2 = {"Lb80;", "", "Lcom/walletconnect/android/internal/common/cacao/Cacao;", "cacao", "", "a", "Lxw4;", "Ljava/lang/String;", "projectId", "<init>", "(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: b80 */
/* compiled from: CacaoVerifier.kt */
public final class b80 {

    /* renamed from: a */
    public final String f21170a;

    public b80(String str) {
        this.f21170a = str;
    }

    public /* synthetic */ b80(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* renamed from: a */
    public final boolean mo29492a(Cacao cacao) {
        vx2.m53591g(cacao, "cacao");
        String t = cacao.mo40185c().getT();
        if (vx2.m53586b(t, SignatureType.EIP191.getHeader())) {
            return xm1.f35658a.mo49510b(vx2.m53591g(cacao.mo40185c(), "<this>"), a80.m31747b(cacao.mo40184b(), (String) null, 1, (Object) null), new qy2(cacao.mo40184b().mo40200e()).mo47305b());
        }
        if (vx2.m53586b(t, SignatureType.EIP1271.getHeader())) {
            return wm1.f35387a.mo49241d(vx2.m53591g(cacao.mo40185c(), "<this>"), a80.m31747b(cacao.mo40184b(), (String) null, 1, (Object) null), new qy2(cacao.mo40184b().mo40200e()).mo47305b(), this.f21170a);
        }
        throw new RuntimeException("Invalid header");
    }
}
