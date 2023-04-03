package p000;

import com.walletconnect.android.internal.common.cacao.Cacao;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\u0014\u0010\u0006\u001a\u00020\u0004*\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0004¨\u0006\u0007"}, mo44877d2 = {"Lcom/walletconnect/android/internal/common/cacao/Cacao$Signature;", "Lr16;", "c", "Lcom/walletconnect/android/internal/common/cacao/Cacao$Payload;", "", "chainName", "a", "sdk_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: a80 */
/* compiled from: Cacao.kt */
public final class a80 {
    /* renamed from: a */
    public static final /* synthetic */ String m31746a(Cacao.Payload payload, String str) {
        String str2;
        boolean z;
        vx2.m53591g(payload, "<this>");
        vx2.m53591g(str, "chainName");
        String str3 = payload.mo40196b() + " wants you to sign in with your " + str + " account:\n" + new qy2(payload.mo40200e()).mo47305b() + "\n";
        if (payload.mo40207j() != null) {
            str3 = str3 + "\n" + payload.mo40207j() + "\n";
        }
        String str4 = str3 + "\nURI: " + payload.mo40195a() + "\nVersion: " + payload.mo40208k() + "\nChain ID: " + new qy2(payload.mo40200e()).mo47307d() + "\nNonce: " + payload.mo40203g() + "\nIssued At: " + payload.mo40199d();
        if (payload.mo40197c() != null) {
            str4 = str4 + "\nExpiration Time: " + payload.mo40197c();
        }
        if (payload.mo40202f() != null) {
            str4 = str4 + "\nNot Before: " + payload.mo40202f();
        }
        if (payload.mo40204h() != null) {
            str4 = str4 + "\nRequest ID: " + payload.mo40204h();
        }
        List<String> i = payload.mo40206i();
        if (i == null || i.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            str2 = str2 + "\nResources:";
            List<String> i2 = payload.mo40206i();
            vx2.m53588d(i2);
            for (String str5 : i2) {
                str2 = str2 + "\n- " + str5;
            }
        }
        return str2;
    }

    /* renamed from: b */
    public static /* synthetic */ String m31747b(Cacao.Payload payload, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "Ethereum";
        }
        return m31746a(payload, str);
    }
}
