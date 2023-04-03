package p000;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.model.wallets.Wallet;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, mo44877d2 = {"Lbg2;", "Ldo2;", "", "", "Lnet/safemoon/androidwallet/common/TokenType;", "get", "Landroid/content/Context;", "a", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: bg2 */
/* compiled from: GetTokenTypeMapUseCase.kt */
public final class bg2 implements do2 {

    /* renamed from: a */
    public final Context f36804a;

    public bg2(Context context) {
        vx2.m53591g(context, "context");
        this.f36804a = context;
    }

    public Map<String, TokenType> get() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Boolean bool = y40.f35761c;
        vx2.m53590f(bool, "IS_TEST_NET");
        if (bool.booleanValue()) {
            String string = this.f36804a.getString(R.string.my_tokens_screen_select_bep);
            vx2.m53590f(string, "context.getString(R.stri…tokens_screen_select_bep)");
            linkedHashMap.put(string, TokenType.BEP_20_TEST);
            String string2 = this.f36804a.getString(R.string.my_tokens_screen_select_erc);
            vx2.m53590f(string2, "context.getString(R.stri…tokens_screen_select_erc)");
            linkedHashMap.put(string2, TokenType.ERC_20_TEST);
            String string3 = this.f36804a.getString(R.string.my_tokens_screen_select_matic);
            vx2.m53590f(string3, "context.getString(R.stri…kens_screen_select_matic)");
            linkedHashMap.put(string3, TokenType.POLYGON_TEST);
            String string4 = this.f36804a.getString(R.string.my_tokens_screen_select_avalanche_c);
            vx2.m53590f(string4, "context.getString(R.stri…creen_select_avalanche_c)");
            linkedHashMap.put(string4, TokenType.AVALANCHE_FUJI_TEST);
        } else {
            String string5 = this.f36804a.getString(R.string.my_tokens_screen_select_bep);
            vx2.m53590f(string5, "context.getString(R.stri…tokens_screen_select_bep)");
            linkedHashMap.put(string5, TokenType.BEP_20);
            String string6 = this.f36804a.getString(R.string.my_tokens_screen_select_erc);
            vx2.m53590f(string6, "context.getString(R.stri…tokens_screen_select_erc)");
            linkedHashMap.put(string6, TokenType.ERC_20);
            String string7 = this.f36804a.getString(R.string.my_tokens_screen_select_matic);
            vx2.m53590f(string7, "context.getString(R.stri…kens_screen_select_matic)");
            linkedHashMap.put(string7, TokenType.POLYGON);
            String string8 = this.f36804a.getString(R.string.my_tokens_screen_select_avalanche_c);
            vx2.m53590f(string8, "context.getString(R.stri…creen_select_avalanche_c)");
            linkedHashMap.put(string8, TokenType.AVALANCHE_C);
            Wallet c = ol0.m70351c(this.f36804a);
            boolean z = true;
            if (c == null || !c.hasPassphrase()) {
                z = false;
            }
            if (z) {
                String string9 = this.f36804a.getString(R.string.my_tokens_screen_select_solana);
                vx2.m53590f(string9, "context.getString(R.stri…ens_screen_select_solana)");
                linkedHashMap.put(string9, TokenType.SOLANA);
                String string10 = this.f36804a.getString(R.string.my_tokens_screen_select_multicoin);
                vx2.m53590f(string10, "context.getString(R.stri…_screen_select_multicoin)");
                linkedHashMap.put(string10, TokenType.MULTI_COIN);
            }
        }
        return linkedHashMap;
    }
}
