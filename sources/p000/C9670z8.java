package p000;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import net.safemoon.androidwallet.MyApplicationClass;
import net.safemoon.androidwallet.common.MyCoinType;
import net.safemoon.androidwallet.model.wallets.Wallet;
import net.safemoon.androidwallet.viewmodels.wcv2.common.Chains;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000\u001a\u0006\u0010\u0005\u001a\u00020\u0003\u001a\u0016\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0007"}, mo44877d2 = {"", "Lkotlin/Pair;", "Lnet/safemoon/androidwallet/viewmodels/wcv2/common/Chains;", "", "a", "b", "c", "development-V3.40(117)_netMainRelease"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: z8 */
/* compiled from: Accounts.kt */
public final class C9670z8 {
    /* renamed from: a */
    public static final List<Pair<Chains, String>> m74815a() {
        String str;
        String address;
        MyApplicationClass c = MyApplicationClass.m64669c();
        vx2.m53590f(c, "get()");
        Wallet c2 = ol0.m70351c(c);
        String str2 = "";
        if (c2 == null || (str = Wallet.getAddress$default(c2, 0, 1, (Object) null)) == null) {
            str = str2;
        }
        MyApplicationClass c3 = MyApplicationClass.m64669c();
        vx2.m53590f(c3, "get()");
        Wallet c4 = ol0.m70351c(c3);
        if (!(c4 == null || (address = c4.getAddress(MyCoinType.SOLANA.getValue())) == null)) {
            str2 = address;
        }
        return ck0.m33065m(wy6.m54142a(Chains.ETHEREUM_MAIN, str), wy6.m54142a(Chains.POLYGON_MATIC, str), wy6.m54142a(Chains.BSC_MAIN, str), wy6.m54142a(Chains.AVALANCHE_C, str), wy6.m54142a(Chains.SOLANA, str2));
    }

    /* renamed from: b */
    public static final String m74816b() {
        List<Pair<Chains, String>> a = m74815a();
        ArrayList arrayList = new ArrayList(dk0.m43495u(a, 10));
        for (Pair c : a) {
            arrayList.add(m74817c(c));
        }
        return (String) CollectionsKt___CollectionsKt.m47329Z(arrayList);
    }

    /* renamed from: c */
    public static final String m74817c(Pair<? extends Chains, String> pair) {
        vx2.m53591g(pair, "<this>");
        String chainWcId = ((Chains) pair.getFirst()).getChainWcId();
        String second = pair.getSecond();
        return "did:pkh:" + chainWcId + ":" + second;
    }
}
