package p000;

import android.content.Context;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import net.safemoon.androidwallet.model.token.abstraction.IToken;
import net.safemoon.androidwallet.p020ui.displayModel.UserTokenItemDisplayModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\b¨\u0006\f"}, mo44877d2 = {"Ly57;", "Lhp2;", "", "Lnet/safemoon/androidwallet/model/token/abstraction/IToken;", "tokenList", "Lnet/safemoon/androidwallet/ui/displayModel/UserTokenItemDisplayModel;", "a", "Landroid/content/Context;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: y57 */
/* compiled from: UserTokenDisplayModelMapper.kt */
public final class y57 implements hp2 {

    /* renamed from: a */
    public final Context f46128a;

    public y57(Context context) {
        vx2.m53591g(context, "context");
        this.f46128a = context;
    }

    /* renamed from: a */
    public List<UserTokenItemDisplayModel> mo52298a(List<? extends IToken> list) {
        int i;
        double d;
        vx2.m53591g(list, "tokenList");
        ArrayList arrayList = new ArrayList();
        for (IToken iToken : list) {
            if (xb6.m73916n(iToken.getIconResName()) == null) {
                i = this.f46128a.getResources().getIdentifier(iToken.getIconResName(), "drawable", this.f46128a.getPackageName());
            } else {
                i = 0;
            }
            int i2 = i;
            String iconResName = iToken.getIconResName();
            String name = iToken.getName();
            String symbol = iToken.getSymbol();
            String contractAddress = iToken.getContractAddress();
            int decimals = iToken.getDecimals();
            int chainId = iToken.getChainId();
            String symbolWithType = iToken.getSymbolWithType();
            boolean allowSwap = iToken.getAllowSwap();
            double priceInUsdt = iToken.getPriceInUsdt();
            double nativeBalance = iToken.getNativeBalance();
            double percentChange1h = iToken.getPercentChange1h();
            try {
                d = iToken.getPriceInUsdt() * iToken.getNativeBalance();
            } catch (Exception unused) {
                d = Utils.DOUBLE_EPSILON;
            }
            arrayList.add(new UserTokenItemDisplayModel(symbolWithType, i2, name, symbol, contractAddress, decimals, chainId, allowSwap, priceInUsdt, nativeBalance, percentChange1h, d, iconResName, q70.m71186b(iToken.getContractAddress(), iToken.getSymbol(), xb6.m73916n(iToken.getIconResName()))));
        }
        return arrayList;
    }
}
