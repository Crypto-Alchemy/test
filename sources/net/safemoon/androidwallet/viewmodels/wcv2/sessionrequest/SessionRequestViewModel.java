package net.safemoon.androidwallet.viewmodels.wcv2.sessionrequest;

import android.net.Uri;
import com.walletconnect.web3.wallet.client.Web3Wallet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.text.StringsKt__StringsKt;
import net.safemoon.androidwallet.viewmodels.wcv2.WCDelegate;
import net.safemoon.androidwallet.viewmodels.wcv2.common.Chains;
import p000.hg7;
import p000.ig7;
import p000.tt0;
import p000.vx5;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0006\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002J\"\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002J$\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0002J\u0012\u0010\u000f\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\rH\u0002R\u0014\u0010\u000b\u001a\u00020\u000e8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/wcv2/sessionrequest/SessionRequestViewModel;", "Lad7;", "Lkotlin/Function1;", "Landroid/net/Uri;", "Lr37;", "sendSessionRequestResponseDeepLink", "e", "", "ethResult", "b", "Lvx5$a;", "sessionRequest", "f", "Lhg7$j;", "Lvx5;", "c", "d", "()Lvx5;", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: SessionRequestViewModel.kt */
public final class SessionRequestViewModel extends ad7 {
    /* renamed from: b */
    public final void mo62070b(String str, rc2<? super Uri, r37> rc2) {
        vx5.C9471a aVar;
        boolean z;
        vx2.m53591g(str, "ethResult");
        vx2.m53591g(rc2, "sendSessionRequestResponseDeepLink");
        vx5 d = mo62072d();
        if (d instanceof vx5.C9471a) {
            aVar = (vx5.C9471a) d;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            String a = aVar.mo66588a();
            boolean z2 = false;
            if (a == null || !StringsKt__StringsKt.m63077P(a, Chains.C8928a.C8929a.f43189a.mo62049a(), true)) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                String a2 = aVar.mo66588a();
                if (a2 != null && StringsKt__StringsKt.m63077P(a2, Chains.C8928a.C8930b.f43193a.mo62052a(), true)) {
                    z2 = true;
                }
                if (!z2) {
                    throw new Exception("Unsupported Chain");
                }
            }
            Web3Wallet.f27840a.mo41555k(new ig7.C5965f(aVar.mo66590c(), new hg7.C5901d.C5903b(aVar.mo66589b(), str)), SessionRequestViewModel$approve$1.INSTANCE, SessionRequestViewModel$approve$2.INSTANCE);
            mo62074f(aVar, rc2);
            WCDelegate.f43174a.mo62023q();
        }
    }

    /* renamed from: c */
    public final vx5 mo62071c(hg7.C5915j jVar) {
        String str;
        String str2;
        String str3;
        String a;
        List<String> b;
        if (jVar == null) {
            return vx5.C9472b.f45402a;
        }
        tt0.C6536a b2 = jVar.mo43267b();
        String str4 = "";
        if (b2 == null || (str = b2.mo48171c()) == null) {
            str = str4;
        }
        tt0.C6536a b3 = jVar.mo43267b();
        if (b3 == null || (b = b3.mo48170b()) == null || (str2 = (String) CollectionsKt___CollectionsKt.m47331b0(b)) == null) {
            str2 = str4;
        }
        tt0.C6536a b4 = jVar.mo43267b();
        if (b4 == null || (str3 = b4.mo48173e()) == null) {
            str3 = str4;
        }
        tt0.C6536a b5 = jVar.mo43267b();
        if (!(b5 == null || (a = b5.mo48169a()) == null)) {
            str4 = a;
        }
        return new vx5.C9471a(new dn4(str2, str, str3, str4), jVar.mo43269d(), jVar.mo43268c().mo43273a(), jVar.mo43268c().mo43275c(), jVar.mo43266a(), jVar.mo43268c().mo43274b());
    }

    /* renamed from: d */
    public final vx5 mo62072d() {
        return mo62071c(WCDelegate.f43174a.mo62020n());
    }

    /* renamed from: e */
    public final void mo62073e(rc2<? super Uri, r37> rc2) {
        vx5.C9471a aVar;
        vx2.m53591g(rc2, "sendSessionRequestResponseDeepLink");
        vx5 d = mo62072d();
        if (d instanceof vx5.C9471a) {
            aVar = (vx5.C9471a) d;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            Web3Wallet.m43031l(Web3Wallet.f27840a, new ig7.C5965f(aVar.mo66590c(), new hg7.C5901d.C5902a(aVar.mo66589b(), 500, "Kotlin Wallet Error")), (rc2) null, SessionRequestViewModel$reject$1.INSTANCE, 2, (Object) null);
            mo62074f(aVar, rc2);
            WCDelegate.f43174a.mo62023q();
        }
    }

    /* renamed from: f */
    public final void mo62074f(vx5.C9471a aVar, rc2<? super Uri, r37> rc2) {
        String c;
        hg7.C5910g f = Web3Wallet.f27840a.mo41551f(aVar.mo66590c());
        if (f != null && (c = f.mo43245c()) != null) {
            Uri parse = Uri.parse(c);
            vx2.m53590f(parse, "parse(this)");
            if (parse != null) {
                rc2.invoke(parse);
            }
        }
    }
}
