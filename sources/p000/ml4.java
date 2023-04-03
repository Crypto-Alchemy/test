package p000;

import com.walletconnect.android.internal.common.model.AppMetaData;
import com.walletconnect.android.internal.common.model.Redirect;
import java.util.List;
import kotlin.Metadata;
import p000.tt0;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0000\u001a\f\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0000\u001a\n\u0010\t\u001a\u00020\u0006*\u00020\u0007¨\u0006\n"}, mo44877d2 = {"Laq1$a;", "Ltt0$b;", "c", "Lkl4;", "Ltt0$d;", "d", "Ltt0$a;", "Lcom/walletconnect/android/internal/common/model/AppMetaData;", "a", "b", "sdk_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: ml4 */
/* compiled from: PairingMapper.kt */
public final class ml4 {
    /* renamed from: b */
    public static final tt0.C6536a m48364b(AppMetaData appMetaData) {
        String str;
        vx2.m53591g(appMetaData, "<this>");
        String c = appMetaData.mo40311c();
        String a = appMetaData.mo40309a();
        String e = appMetaData.mo40314e();
        List<String> b = appMetaData.mo40310b();
        Redirect d = appMetaData.mo40313d();
        if (d != null) {
            str = d.mo40322a();
        } else {
            str = null;
        }
        return new tt0.C6536a(c, a, e, b, str);
    }

    /* renamed from: d */
    public static final /* synthetic */ tt0.C6539d m48366d(kl4 kl4) {
        tt0.C6536a aVar;
        vx2.m53591g(kl4, "<this>");
        String a = kl4.mo44832f().mo42395a();
        long a2 = kl4.mo44826a().mo46241a();
        AppMetaData b = kl4.mo44827b();
        if (b != null) {
            aVar = m48364b(b);
        } else {
            aVar = null;
        }
        return new tt0.C6539d(a, a2, aVar, kl4.mo44830e(), kl4.mo44829d(), kl4.mo44833g(), kl4.mo44834h(), kl4.mo44828c());
    }
}
