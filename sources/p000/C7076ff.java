package p000;

import androidx.lifecycle.LiveData;
import java.util.List;
import kotlin.Metadata;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.model.token.abstraction.IToken;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000f¨\u0006\u0013"}, mo44877d2 = {"Lff;", "Lon2;", "Lnet/safemoon/androidwallet/common/TokenType;", "tokenType", "", "filterPhrase", "Landroidx/lifecycle/LiveData;", "", "Lnet/safemoon/androidwallet/model/token/abstraction/IToken;", "b", "a", "Lnn2;", "Lnn2;", "localTokenDataSource", "Lyn2;", "Lyn2;", "filterTokenListByPhraseUseCase", "<init>", "(Lnn2;Lyn2;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: ff */
/* compiled from: AllTokenListRepository.kt */
public final class C7076ff implements on2 {

    /* renamed from: a */
    public final nn2 f37788a;

    /* renamed from: b */
    public final yn2 f37789b;

    public C7076ff(nn2 nn2, yn2 yn2) {
        vx2.m53591g(nn2, "localTokenDataSource");
        vx2.m53591g(yn2, "filterTokenListByPhraseUseCase");
        this.f37788a = nn2;
        this.f37789b = yn2;
    }

    /* renamed from: a */
    public List<IToken> mo51655a(TokenType tokenType) {
        vx2.m53591g(tokenType, "tokenType");
        return this.f37788a.mo62766a(tokenType);
    }

    /* renamed from: b */
    public LiveData<List<IToken>> mo51656b(TokenType tokenType, String str) {
        vx2.m53591g(tokenType, "tokenType");
        vx2.m53591g(str, "filterPhrase");
        return new k04(this.f37789b.mo65415a(mo51655a(tokenType), str));
    }
}
