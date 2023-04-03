package p000;

import androidx.recyclerview.widget.C1294g;
import kotlin.Metadata;
import net.safemoon.androidwallet.model.priceAlert.PAToken;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\n"}, mo44877d2 = {"Lvn2;", "Landroidx/recyclerview/widget/g$f;", "Lnet/safemoon/androidwallet/model/priceAlert/PAToken;", "oldItem", "newItem", "", "b", "a", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: vn2 */
/* compiled from: PATokenAdapter.kt */
public final class vn2 extends C1294g.C1300f<PAToken> {

    /* renamed from: a */
    public static final vn2 f45332a = new vn2();

    /* renamed from: a */
    public boolean areContentsTheSame(PAToken pAToken, PAToken pAToken2) {
        vx2.m53591g(pAToken, "oldItem");
        vx2.m53591g(pAToken2, "newItem");
        if (pAToken.getHasPriceAlert() == pAToken2.getHasPriceAlert() || vx2.m53586b(pAToken.getContractAddress(), pAToken2.getContractAddress()) || vx2.m53586b(pAToken.getSymbol(), pAToken2.getSymbol()) || vx2.m53586b(pAToken.getName(), pAToken2.getName())) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public boolean areItemsTheSame(PAToken pAToken, PAToken pAToken2) {
        vx2.m53591g(pAToken, "oldItem");
        vx2.m53591g(pAToken2, "newItem");
        return vx2.m53586b(pAToken, pAToken2);
    }
}
