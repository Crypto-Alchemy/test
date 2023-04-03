package net.safemoon.androidwallet.viewmodels;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.database.room.ApplicationRoomDatabase;
import net.safemoon.androidwallet.model.token.abstraction.IToken;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0010!\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u0006\u0010#\u001a\u00020 ¢\u0006\u0004\b:\u0010;J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u000f\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\fH\u0002R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R.\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070%0$8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0016\u0010/\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00102\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u001c\u00105\u001a\b\u0012\u0004\u0012\u00020\u00120%8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b3\u00104R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\u0012068\u0002X\u0004¢\u0006\u0006\n\u0004\b7\u00104R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\f068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u00104¨\u0006<"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/AddNewTokensViewModel;", "Lad7;", "Lr37;", "p", "Lnet/safemoon/androidwallet/common/TokenType;", "type", "m", "Lvc;", "item", "", "selected", "n", "", "phrase", "o", "q", "l", "symbolWithType", "Lnet/safemoon/androidwallet/model/token/abstraction/IToken;", "j", "Lon2;", "a", "Lon2;", "allTokenListRepository", "Lyo2;", "b", "Lyo2;", "tokenDisplayModelMapper", "Lip2;", "c", "Lip2;", "userTokenListRepository", "Lxy0;", "d", "Lxy0;", "customTokenDataSource", "Lk04;", "", "e", "Lk04;", "k", "()Lk04;", "setTokenDisplayModelListData", "(Lk04;)V", "tokenDisplayModelListData", "f", "Ljava/lang/String;", "searchPhrase", "g", "Lnet/safemoon/androidwallet/common/TokenType;", "tokenType", "h", "Ljava/util/List;", "selectedTokenList", "", "i", "allTokens", "defaultTokens", "<init>", "(Lon2;Lyo2;Lip2;Lxy0;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: AddNewTokensViewModel.kt */
public final class AddNewTokensViewModel extends ad7 {

    /* renamed from: a */
    public final on2 f42608a;

    /* renamed from: b */
    public final yo2 f42609b;

    /* renamed from: c */
    public final ip2 f42610c;

    /* renamed from: d */
    public final xy0 f42611d;

    /* renamed from: e */
    public k04<List<C9449vc>> f42612e = new k04<>(ck0.m33062j());

    /* renamed from: f */
    public String f42613f = "";

    /* renamed from: g */
    public TokenType f42614g = TokenType.BEP_20;

    /* renamed from: h */
    public List<? extends IToken> f42615h;

    /* renamed from: i */
    public final List<IToken> f42616i = new ArrayList();

    /* renamed from: j */
    public final List<String> f42617j;

    public AddNewTokensViewModel(on2 on2, yo2 yo2, ip2 ip2, xy0 xy0) {
        vx2.m53591g(on2, "allTokenListRepository");
        vx2.m53591g(yo2, "tokenDisplayModelMapper");
        vx2.m53591g(ip2, "userTokenListRepository");
        vx2.m53591g(xy0, "customTokenDataSource");
        this.f42608a = on2;
        this.f42609b = yo2;
        this.f42610c = ip2;
        this.f42611d = xy0;
        ArrayList arrayList = new ArrayList();
        for (Pair<TokenType, List<String>> second : ApplicationRoomDatabase.f41664p.mo57121d()) {
            arrayList.addAll((Collection) second.getSecond());
        }
        this.f42617j = arrayList;
    }

    /* renamed from: j */
    public final IToken mo60963j(String str) {
        List<? extends IToken> list = this.f42615h;
        T t = null;
        if (list == null) {
            vx2.m53605u("selectedTokenList");
            list = null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (vx2.m53586b(((IToken) next).getSymbolWithType(), str)) {
                t = next;
                break;
            }
        }
        return (IToken) t;
    }

    /* renamed from: k */
    public final k04<List<C9449vc>> mo60964k() {
        return this.f42612e;
    }

    /* renamed from: l */
    public final void mo60965l(C9449vc vcVar, boolean z) {
        IToken j = mo60963j(vcVar.mo66476h());
        if (j == null) {
            return;
        }
        if (z) {
            this.f42610c.mo50495g(j);
        } else if (!this.f42617j.contains(vcVar.mo66476h())) {
            this.f42610c.mo50498j(j);
        }
    }

    /* renamed from: m */
    public final void mo60966m(TokenType tokenType) {
        vx2.m53591g(tokenType, "type");
        this.f42614g = tokenType;
        y23 unused = d50.m56748b(cd7.m11843a(this), (CoroutineContext) null, (CoroutineStart) null, new AddNewTokensViewModel$loadTokens$1(this, (ns0<? super AddNewTokensViewModel$loadTokens$1>) null), 3, (Object) null);
    }

    /* renamed from: n */
    public final void mo60967n(C9449vc vcVar, boolean z) {
        vx2.m53591g(vcVar, "item");
        y23 unused = d50.m56748b(cd7.m11843a(this), (CoroutineContext) null, (CoroutineStart) null, new AddNewTokensViewModel$onItemChanged$1(this, vcVar, z, (ns0<? super AddNewTokensViewModel$onItemChanged$1>) null), 3, (Object) null);
    }

    /* renamed from: o */
    public final void mo60968o(String str) {
        vx2.m53591g(str, "phrase");
        this.f42613f = str;
        y23 unused = d50.m56748b(cd7.m11843a(this), (CoroutineContext) null, (CoroutineStart) null, new AddNewTokensViewModel$onSearch$1(this, (ns0<? super AddNewTokensViewModel$onSearch$1>) null), 3, (Object) null);
    }

    /* renamed from: p */
    public final void mo60969p() {
        mo60966m(this.f42614g);
    }

    /* renamed from: q */
    public final void mo60970q(C9449vc vcVar) {
        vx2.m53591g(vcVar, "item");
        hk0.m45270E(this.f42616i, new AddNewTokensViewModel$removeDeletableItem$1(vcVar));
    }
}
