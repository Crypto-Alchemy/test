package p000;

import androidx.lifecycle.LiveData;
import java.util.List;
import kotlin.Metadata;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.model.token.abstraction.IToken;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J$\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u000b"}, mo44877d2 = {"Lon2;", "", "Lnet/safemoon/androidwallet/common/TokenType;", "tokenType", "", "filterPhrase", "Landroidx/lifecycle/LiveData;", "", "Lnet/safemoon/androidwallet/model/token/abstraction/IToken;", "b", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: on2 */
/* compiled from: IAllTokenListRepository.kt */
public interface on2 {
    /* renamed from: a */
    List<IToken> mo51655a(TokenType tokenType);

    /* renamed from: b */
    LiveData<List<IToken>> mo51656b(TokenType tokenType, String str);
}
