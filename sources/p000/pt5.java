package p000;

import android.app.Application;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.model.token.room.RoomToken;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR.\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006!"}, mo44877d2 = {"Lpt5;", "Lwj;", "Lon2;", "b", "Lon2;", "allTokenListRepository", "", "c", "Ljava/lang/String;", "searchPhrase", "Lnet/safemoon/androidwallet/common/TokenType;", "d", "Lnet/safemoon/androidwallet/common/TokenType;", "tokenType", "Lk04;", "", "", "e", "Lk04;", "getTokenDisplayModelListData", "()Lk04;", "setTokenDisplayModelListData", "(Lk04;)V", "tokenDisplayModelListData", "", "Lnet/safemoon/androidwallet/model/token/room/RoomToken;", "f", "Ljava/util/List;", "balanceList", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;Lon2;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: pt5 */
/* compiled from: SelectCurrencyViewModel.kt */
public final class pt5 extends C3552wj {

    /* renamed from: b */
    public final on2 f44114b;

    /* renamed from: c */
    public String f44115c = "";

    /* renamed from: d */
    public TokenType f44116d = TokenType.BEP_20;

    /* renamed from: e */
    public k04<List<Object>> f44117e = new k04<>(ck0.m33062j());

    /* renamed from: f */
    public final List<RoomToken> f44118f = new ArrayList();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pt5(Application application, on2 on2) {
        super(application);
        vx2.m53591g(application, "application");
        vx2.m53591g(on2, "allTokenListRepository");
        this.f44114b = on2;
    }
}
