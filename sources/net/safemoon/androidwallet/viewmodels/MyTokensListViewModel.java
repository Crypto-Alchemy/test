package net.safemoon.androidwallet.viewmodels;

import android.app.Application;
import androidx.lifecycle.LiveData;
import com.github.mikephil.charting.utils.Utils;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.C6169a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.database.room.ApplicationRoomDatabase;
import net.safemoon.androidwallet.model.swap.AllSwapTokens;
import net.safemoon.androidwallet.model.swap.Data;
import net.safemoon.androidwallet.model.swap.Swap;
import net.safemoon.androidwallet.model.token.abstraction.IToken;
import net.safemoon.androidwallet.model.token.room.RoomToken;
import net.safemoon.androidwallet.p020ui.displayModel.UserTokenItemDisplayModel;
import net.safemoon.androidwallet.utils.Common;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010#\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\"\u0012\u0007\u0010\u0001\u001a\u00020\u0012\u0006\u0010(\u001a\u00020%\u0012\u0006\u0010,\u001a\u00020)¢\u0006\u0006\b\u0001\u0010\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\u0007\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0016\u0010\u000e\u001a\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0004H\u0002J\u0016\u0010\u000f\u001a\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0004H\u0002J\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0006\u0010\u0015\u001a\u00020\u0002J\u0006\u0010\u0016\u001a\u00020\u0002J\u0006\u0010\u0017\u001a\u00020\u0002J\u0006\u0010\u0018\u001a\u00020\u0002J\u0006\u0010\u0019\u001a\u00020\u0002J\u0006\u0010\u001a\u001a\u00020\u0002J\u000e\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bJ\u000e\u0010\u001e\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\u001f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\"\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 J\u0014\u0010$\u001a\u00020\u00022\f\u0010#\u001a\b\u0012\u0004\u0012\u00020 0\u0004R\u0014\u0010(\u001a\u00020%8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001d\u00102\u001a\b\u0012\u0004\u0012\u00020\u00050-8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001d\u00105\u001a\b\u0012\u0004\u0012\u00020\u00050-8\u0006¢\u0006\f\n\u0004\b3\u0010/\u001a\u0004\b4\u00101R'\u0010=\u001a\u0012\u0012\u0004\u0012\u00020706j\b\u0012\u0004\u0012\u000207`88\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001b\u0010C\u001a\u00020>8BX\u0002¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR#\u0010I\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00040D8\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR \u0010K\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00040D8\u0002X\u0004¢\u0006\u0006\n\u0004\bJ\u0010FR#\u0010N\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040-8\u0006¢\u0006\f\n\u0004\bL\u0010/\u001a\u0004\bM\u00101R\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020\f0O8\u0002X\u0004¢\u0006\u0006\n\u0004\bP\u0010QR!\u0010U\u001a\b\u0012\u0004\u0012\u00020\u001b0D8FX\u0002¢\u0006\f\n\u0004\bS\u0010@\u001a\u0004\bT\u0010HR\u001d\u0010\\\u001a\b\u0012\u0004\u0012\u00020W0V8\u0006¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u001d\u0010_\u001a\b\u0012\u0004\u0012\u00020W0V8\u0006¢\u0006\f\n\u0004\b]\u0010Y\u001a\u0004\b^\u0010[R\u001b\u0010d\u001a\u00020`8BX\u0002¢\u0006\f\n\u0004\ba\u0010@\u001a\u0004\bb\u0010cR \u0010h\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040e8\u0002X\u0004¢\u0006\u0006\n\u0004\bf\u0010gR \u0010j\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00040e8\u0002X\u0004¢\u0006\u0006\n\u0004\bi\u0010gR \u0010l\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00040e8\u0002X\u0004¢\u0006\u0006\n\u0004\bk\u0010gR\"\u0010n\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040e8\u0002X\u0004¢\u0006\u0006\n\u0004\bm\u0010gR$\u0010p\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010-8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bo\u0010/R\"\u0010r\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040e8\u0002X\u0004¢\u0006\u0006\n\u0004\bq\u0010gR\u001d\u0010x\u001a\b\u0012\u0004\u0012\u00020\u00100s8\u0006¢\u0006\f\n\u0004\bt\u0010u\u001a\u0004\bv\u0010wR4\u0010~\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00120y0s8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bz\u0010u\u001a\u0004\b{\u0010w\"\u0004\b|\u0010}¨\u0006\u0001"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/MyTokensListViewModel;", "Lwj;", "Lr37;", "O", "", "Lnet/safemoon/androidwallet/model/token/room/RoomToken;", "tokens", "z", "Lnet/safemoon/androidwallet/common/TokenType;", "tokenType", "M", "L", "Lnet/safemoon/androidwallet/model/token/abstraction/IToken;", "iTokens", "b0", "X", "", "symbol", "", "chainId", "H", "c0", "Y", "x", "U", "d0", "Z", "", "isDefault", "P", "T", "S", "Lnet/safemoon/androidwallet/ui/displayModel/UserTokenItemDisplayModel;", "item", "Q", "orders", "a0", "Lhp2;", "b", "Lhp2;", "userTokenDisplayModelMapper", "Lip2;", "c", "Lip2;", "userTokenListRepository", "Landroidx/lifecycle/LiveData;", "d", "Landroidx/lifecycle/LiveData;", "E", "()Landroidx/lifecycle/LiveData;", "safeMoonLoad", "e", "getSfmMoonLoad", "sfmMoonLoad", "Ljava/util/ArrayList;", "Lnet/safemoon/androidwallet/model/swap/Swap;", "Lkotlin/collections/ArrayList;", "f", "Ljava/util/ArrayList;", "F", "()Ljava/util/ArrayList;", "swapListMap", "Lxy0;", "g", "Lef3;", "C", "()Lxy0;", "customTokenDataSource", "Lk04;", "h", "Lk04;", "I", "()Lk04;", "tokenDisplayModelListData", "i", "onSwapTokenDisplayModelListData", "j", "A", "allMyTokensList", "", "k", "Ljava/util/Set;", "forFetchTokens", "l", "K", "totalBalanceForDefault", "Lls3;", "", "m", "Lls3;", "J", "()Lls3;", "totalAmount", "n", "G", "swapTotalAmount", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "o", "B", "()Lcom/google/firebase/analytics/FirebaseAnalytics;", "analytics", "Lpf4;", "p", "Lpf4;", "totalObserver", "q", "displayTokenObserver", "r", "swapDisplayTokenObserver", "s", "loadTokenObserver", "t", "userTokenLiveList", "u", "onSwapLoadTokenObserver", "", "v", "Ljava/util/List;", "D", "()Ljava/util/List;", "defaultTokens", "Lkotlin/Pair;", "w", "getBackUpOldPair", "setBackUpOldPair", "(Ljava/util/List;)V", "backUpOldPair", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;Lhp2;Lip2;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: MyTokensListViewModel.kt */
public final class MyTokensListViewModel extends C3552wj {

    /* renamed from: b */
    public final hp2 f42770b;

    /* renamed from: c */
    public final ip2 f42771c;

    /* renamed from: d */
    public final LiveData<RoomToken> f42772d;

    /* renamed from: e */
    public final LiveData<RoomToken> f42773e;

    /* renamed from: f */
    public final ArrayList<Swap> f42774f = new ArrayList<>();

    /* renamed from: g */
    public final ef3 f42775g = C6169a.m47232a(new MyTokensListViewModel$customTokenDataSource$2(this));

    /* renamed from: h */
    public final k04<List<UserTokenItemDisplayModel>> f42776h = new k04<>(new ArrayList());

    /* renamed from: i */
    public final k04<List<UserTokenItemDisplayModel>> f42777i = new k04<>(new ArrayList());

    /* renamed from: j */
    public final LiveData<List<RoomToken>> f42778j;

    /* renamed from: k */
    public final Set<IToken> f42779k;

    /* renamed from: l */
    public final ef3 f42780l;

    /* renamed from: m */
    public final ls3<Double> f42781m;

    /* renamed from: n */
    public final ls3<Double> f42782n;

    /* renamed from: o */
    public final ef3 f42783o;

    /* renamed from: p */
    public final pf4<List<RoomToken>> f42784p;

    /* renamed from: q */
    public final pf4<List<UserTokenItemDisplayModel>> f42785q;

    /* renamed from: r */
    public final pf4<List<UserTokenItemDisplayModel>> f42786r;

    /* renamed from: s */
    public final pf4<List<RoomToken>> f42787s;

    /* renamed from: t */
    public LiveData<List<RoomToken>> f42788t;

    /* renamed from: u */
    public final pf4<List<RoomToken>> f42789u;

    /* renamed from: v */
    public final List<String> f42790v;

    /* renamed from: w */
    public List<Pair<String, Integer>> f42791w;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J$\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0016J\u001e\u0010\u000b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\f"}, mo44877d2 = {"net/safemoon/androidwallet/viewmodels/MyTokensListViewModel$a", "Lp90;", "Lnet/safemoon/androidwallet/model/swap/AllSwapTokens;", "Lk90;", "call", "Lbg5;", "response", "Lr37;", "b", "", "t", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.viewmodels.MyTokensListViewModel$a */
    /* compiled from: MyTokensListViewModel.kt */
    public static final class C8714a implements p90<AllSwapTokens> {

        /* renamed from: a */
        public final /* synthetic */ MyTokensListViewModel f42792a;

        public C8714a(MyTokensListViewModel myTokensListViewModel) {
            this.f42792a = myTokensListViewModel;
        }

        /* renamed from: a */
        public void mo47103a(k90<AllSwapTokens> k90, Throwable th) {
            vx2.m53591g(k90, "call");
            vx2.m53591g(th, "t");
        }

        /* renamed from: b */
        public void mo47104b(k90<AllSwapTokens> k90, bg5<AllSwapTokens> bg5) {
            List<Swap> list;
            Data data;
            vx2.m53591g(k90, "call");
            vx2.m53591g(bg5, "response");
            if (bg5.mo50581e() && bg5.mo50578a() != null) {
                this.f42792a.mo61294F().clear();
                ArrayList<Swap> F = this.f42792a.mo61294F();
                AllSwapTokens a = bg5.mo50578a();
                T t = null;
                if (a == null || (data = a.getData()) == null) {
                    list = null;
                } else {
                    list = data.getTokens();
                }
                vx2.m53588d(list);
                F.addAll(list);
                this.f42792a.mo61294F().addAll(Common.f42577a.mo60907n());
                Iterator<T> it = this.f42792a.mo61294F().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    if (vx2.m53586b(((Swap) next).symbol, "WETH")) {
                        t = next;
                        break;
                    }
                }
                Common.f42577a.mo60894D((Swap) t);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MyTokensListViewModel(Application application, hp2 hp2, ip2 ip2) {
        super(application);
        vx2.m53591g(application, "application");
        vx2.m53591g(hp2, "userTokenDisplayModelMapper");
        vx2.m53591g(ip2, "userTokenListRepository");
        this.f42770b = hp2;
        this.f42771c = ip2;
        mo61302O();
        this.f42772d = ip2.mo50492d("BEP_SAFEMOON");
        this.f42773e = ip2.mo50492d("BEP_SAFEMOON_V2");
        LiveData<List<RoomToken>> l = ip2.mo50500l();
        this.f42778j = l;
        this.f42779k = new LinkedHashSet();
        this.f42780l = C6169a.m47232a(new MyTokensListViewModel$totalBalanceForDefault$2(this));
        ls3<Double> ls3 = new ls3<>();
        this.f42781m = ls3;
        this.f42782n = new ls3<>();
        this.f42783o = C6169a.m47232a(new MyTokensListViewModel$analytics$2(application));
        this.f42784p = new t14(this);
        this.f42785q = new u14(this);
        this.f42786r = new v14(this);
        ls3.setValue(Double.valueOf(Utils.DOUBLE_EPSILON));
        mo61299K().observeForever(new w14(new rc2<Boolean, r37>(this) {
            public final /* synthetic */ MyTokensListViewModel this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Boolean) obj);
                return r37.f33317a;
            }

            public final void invoke(Boolean bool) {
                vx2.m53590f(bool, "it");
                if (bool.booleanValue()) {
                    this.this$0.mo61289A().removeObserver(this.this$0.f42784p);
                    this.this$0.mo61297I().observeForever(this.this$0.f42785q);
                    this.this$0.f42777i.observeForever(this.this$0.f42786r);
                    return;
                }
                this.this$0.mo61289A().observeForever(this.this$0.f42784p);
                this.this$0.mo61297I().removeObserver(this.this$0.f42785q);
                this.this$0.f42777i.removeObserver(this.this$0.f42786r);
            }
        }));
        l.observeForever(new x14(new rc2<List<? extends RoomToken>, r37>(this) {
            public final /* synthetic */ MyTokensListViewModel this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((List<RoomToken>) (List) obj);
                return r37.f33317a;
            }

            public final void invoke(List<RoomToken> list) {
                T t;
                if (list != null) {
                    MyTokensListViewModel myTokensListViewModel = this.this$0;
                    ArrayList arrayList = new ArrayList();
                    Iterator<T> it = list.iterator();
                    while (true) {
                        boolean z = true;
                        Object obj = null;
                        if (!it.hasNext()) {
                            break;
                        }
                        T next = it.next();
                        RoomToken roomToken = (RoomToken) next;
                        Iterator it2 = myTokensListViewModel.f42779k.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            Object next2 = it2.next();
                            if (vx2.m53586b(((IToken) next2).getSymbolWithType(), roomToken.getSymbolWithType())) {
                                obj = next2;
                                break;
                            }
                        }
                        if (obj != null) {
                            z = false;
                        }
                        if (z) {
                            arrayList.add(next);
                        }
                    }
                    Set p = this.this$0.f42779k;
                    ArrayList<IToken> arrayList2 = new ArrayList<>();
                    for (Object next3 : p) {
                        IToken iToken = (IToken) next3;
                        Iterator<T> it3 = list.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                t = null;
                                break;
                            }
                            t = it3.next();
                            if (vx2.m53586b(iToken.getSymbolWithType(), ((RoomToken) t).getSymbolWithType())) {
                                break;
                            }
                        }
                        if (t == null) {
                            arrayList2.add(next3);
                        }
                    }
                    MyTokensListViewModel myTokensListViewModel2 = this.this$0;
                    for (IToken remove : arrayList2) {
                        myTokensListViewModel2.f42779k.remove(remove);
                    }
                    this.this$0.f42779k.addAll(arrayList);
                    this.this$0.mo61312b0(arrayList);
                    this.this$0.mo61308X(arrayList);
                    this.this$0.mo61316z(list);
                }
            }
        }));
        this.f42787s = new y14(this);
        this.f42789u = new z14(this);
        ArrayList arrayList = new ArrayList();
        for (Pair<TokenType, List<String>> second : ApplicationRoomDatabase.f41664p.mo57121d()) {
            arrayList.addAll((Collection) second.getSecond());
        }
        this.f42790v = arrayList;
        this.f42791w = new ArrayList();
    }

    /* renamed from: N */
    public static final void m68696N(MyTokensListViewModel myTokensListViewModel, List list) {
        vx2.m53591g(myTokensListViewModel, "this$0");
        if (list != null) {
            myTokensListViewModel.f42776h.postValue(myTokensListViewModel.f42770b.mo52298a(list));
        }
    }

    /* renamed from: R */
    public static final void m68697R(MyTokensListViewModel myTokensListViewModel, List list) {
        vx2.m53591g(myTokensListViewModel, "this$0");
        if (list != null) {
            myTokensListViewModel.f42777i.postValue(myTokensListViewModel.f42770b.mo52298a(list));
        }
    }

    /* renamed from: V */
    public static final void m68698V(MyTokensListViewModel myTokensListViewModel, List list) {
        vx2.m53591g(myTokensListViewModel, "this$0");
        if (list != null) {
            double d = Utils.DOUBLE_EPSILON;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                UserTokenItemDisplayModel userTokenItemDisplayModel = (UserTokenItemDisplayModel) it.next();
                try {
                    d += userTokenItemDisplayModel.getNativeBalance() * userTokenItemDisplayModel.getPriceInUsdt();
                } catch (Exception unused) {
                }
            }
            myTokensListViewModel.f42782n.setValue(Double.valueOf(d));
        }
    }

    /* renamed from: W */
    public static final void m68699W(MyTokensListViewModel myTokensListViewModel, List list) {
        vx2.m53591g(myTokensListViewModel, "this$0");
        if (list != null) {
            double d = Utils.DOUBLE_EPSILON;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                RoomToken roomToken = (RoomToken) it.next();
                try {
                    d += roomToken.getNativeBalance() * roomToken.getPriceInUsdt();
                } catch (Exception unused) {
                }
            }
            myTokensListViewModel.f42781m.setValue(Double.valueOf(d));
            myTokensListViewModel.f42782n.setValue(Double.valueOf(d));
        }
    }

    /* renamed from: j */
    public static final void m68707j(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: k */
    public static final void m68708k(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: y */
    public static final void m68721y(MyTokensListViewModel myTokensListViewModel, List list) {
        vx2.m53591g(myTokensListViewModel, "this$0");
        if (list != null) {
            double d = Utils.DOUBLE_EPSILON;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                UserTokenItemDisplayModel userTokenItemDisplayModel = (UserTokenItemDisplayModel) it.next();
                try {
                    d += userTokenItemDisplayModel.getNativeBalance() * userTokenItemDisplayModel.getPriceInUsdt();
                } catch (Exception unused) {
                }
            }
            myTokensListViewModel.f42781m.setValue(Double.valueOf(d));
        }
    }

    /* renamed from: A */
    public final LiveData<List<RoomToken>> mo61289A() {
        return this.f42778j;
    }

    /* renamed from: B */
    public final FirebaseAnalytics mo61290B() {
        return (FirebaseAnalytics) this.f42783o.getValue();
    }

    /* renamed from: C */
    public final xy0 mo61291C() {
        return (xy0) this.f42775g.getValue();
    }

    /* renamed from: D */
    public final List<String> mo61292D() {
        return this.f42790v;
    }

    /* renamed from: E */
    public final LiveData<RoomToken> mo61293E() {
        return this.f42772d;
    }

    /* renamed from: F */
    public final ArrayList<Swap> mo61294F() {
        return this.f42774f;
    }

    /* renamed from: G */
    public final ls3<Double> mo61295G() {
        return this.f42782n;
    }

    /* renamed from: H */
    public final IToken mo61296H(String str, int i) {
        Object obj;
        boolean z;
        List value = this.f42778j.getValue();
        if (value != null) {
            Iterator it = value.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                RoomToken roomToken = (RoomToken) obj;
                if (!vx2.m53586b(roomToken.getSymbol(), str) || roomToken.getChainId() != i) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            RoomToken roomToken2 = (RoomToken) obj;
            if (roomToken2 != null) {
                return roomToken2;
            }
        }
        throw new NullPointerException("Token for symbol=" + str + " nit found");
    }

    /* renamed from: I */
    public final k04<List<UserTokenItemDisplayModel>> mo61297I() {
        return this.f42776h;
    }

    /* renamed from: J */
    public final ls3<Double> mo61298J() {
        return this.f42781m;
    }

    /* renamed from: K */
    public final k04<Boolean> mo61299K() {
        return (k04) this.f42780l.getValue();
    }

    /* renamed from: L */
    public final void mo61300L(TokenType tokenType) {
        y23 unused = d50.m56748b(cd7.m11843a(this), (CoroutineContext) null, (CoroutineStart) null, new MyTokensListViewModel$loadOnSwapTokenList$1(this, tokenType, (ns0<? super MyTokensListViewModel$loadOnSwapTokenList$1>) null), 3, (Object) null);
    }

    /* renamed from: M */
    public final void mo61301M(TokenType tokenType) {
        LiveData<List<RoomToken>> liveData = this.f42788t;
        if (liveData != null) {
            liveData.removeObserver(this.f42787s);
        }
        LiveData<List<RoomToken>> a = this.f42771c.mo50489a(tokenType);
        this.f42788t = a;
        vx2.m53588d(a);
        a.observeForever(this.f42787s);
    }

    /* renamed from: O */
    public final void mo61302O() {
        C9384u3.m72571l().mo52289r().mo50512X(new C8714a(this));
    }

    /* renamed from: P */
    public final void mo61303P(boolean z) {
        mo61299K().postValue(Boolean.valueOf(z));
        f06.m57523n(mo27549b(), "DEFAULT_CHAIN_BALANCE", Boolean.valueOf(z));
    }

    /* renamed from: Q */
    public final void mo61304Q(UserTokenItemDisplayModel userTokenItemDisplayModel) {
        vx2.m53591g(userTokenItemDisplayModel, "item");
        if (!this.f42790v.contains(userTokenItemDisplayModel.getSymbolWithType())) {
            y23 unused = d50.m56748b(cd7.m11843a(this), qh1.m71265b(), (CoroutineStart) null, new MyTokensListViewModel$onItemRemove$1(this, mo61296H(userTokenItemDisplayModel.getSymbol(), userTokenItemDisplayModel.getChainId()), (ns0<? super MyTokensListViewModel$onItemRemove$1>) null), 2, (Object) null);
        }
    }

    /* renamed from: S */
    public final void mo61305S(TokenType tokenType) {
        vx2.m53591g(tokenType, "tokenType");
        mo61300L(tokenType);
    }

    /* renamed from: T */
    public final void mo61306T(TokenType tokenType) {
        vx2.m53591g(tokenType, "tokenType");
        f06.m57524o(mo27549b(), "DEFAULT_GATEWAY", tokenType.name());
        mo61301M(tokenType);
    }

    /* renamed from: U */
    public final void mo61307U() {
        mo61312b0(CollectionsKt___CollectionsKt.m47311K0(this.f42779k));
        mo61308X(CollectionsKt___CollectionsKt.m47311K0(this.f42779k));
    }

    /* renamed from: X */
    public final void mo61308X(List<? extends IToken> list) {
        if (!list.isEmpty()) {
            for (IToken myTokensListViewModel$updateNativeBalances$1$1 : list) {
                y23 unused = d50.m56748b(ih2.f38385a, (CoroutineContext) null, (CoroutineStart) null, new MyTokensListViewModel$updateNativeBalances$1$1(myTokensListViewModel$updateNativeBalances$1$1, this, (ns0<? super MyTokensListViewModel$updateNativeBalances$1$1>) null), 3, (Object) null);
            }
        }
    }

    /* renamed from: Y */
    public final void mo61309Y() {
        k04<List<UserTokenItemDisplayModel>> k04 = this.f42777i;
        k04.postValue(k04.getValue());
    }

    /* renamed from: Z */
    public final void mo61310Z() {
        ls3<Double> ls3 = this.f42782n;
        ls3.postValue(ls3.getValue());
    }

    /* renamed from: a0 */
    public final void mo61311a0(List<UserTokenItemDisplayModel> list) {
        vx2.m53591g(list, "orders");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (T next : list) {
            int i2 = i + 1;
            if (i < 0) {
                ck0.m33072t();
            }
            arrayList.add(new Pair(((UserTokenItemDisplayModel) next).getSymbolWithType(), Integer.valueOf(i)));
            i = i2;
        }
        if (!vx2.m53586b(this.f42791w, arrayList)) {
            ip2 ip2 = this.f42771c;
            Pair[] pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
            ip2.mo50499k((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
            this.f42791w = arrayList;
        }
    }

    /* renamed from: b0 */
    public final void mo61312b0(List<? extends IToken> list) {
        if (!list.isEmpty()) {
            y23 unused = d50.m56748b(ih2.f38385a, (CoroutineContext) null, (CoroutineStart) null, new MyTokensListViewModel$updatePrice$1(list, this, (ns0<? super MyTokensListViewModel$updatePrice$1>) null), 3, (Object) null);
        }
    }

    /* renamed from: c0 */
    public final void mo61313c0() {
        k04<List<UserTokenItemDisplayModel>> k04 = this.f42776h;
        k04.postValue(k04.getValue());
    }

    /* renamed from: d0 */
    public final void mo61314d0() {
        ls3<Double> ls3 = this.f42781m;
        ls3.postValue(ls3.getValue());
    }

    /* renamed from: x */
    public final void mo61315x() {
        this.f42779k.clear();
    }

    /* renamed from: z */
    public final void mo61316z(List<RoomToken> list) {
        T t;
        String[] strArr = {"BEP_USDT", "BEP_AQUAGOAT"};
        for (int i = 0; i < 2; i++) {
            String str = strArr[i];
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (vx2.m53586b(str, ((RoomToken) t).getSymbolWithType())) {
                    break;
                }
            }
            RoomToken roomToken = (RoomToken) t;
            if (roomToken != null) {
                mo61304Q(new UserTokenItemDisplayModel(roomToken.getSymbolWithType(), 0, roomToken.getName(), roomToken.getSymbol(), roomToken.getContractAddress(), roomToken.getDecimals(), roomToken.getChainId(), roomToken.getAllowSwap(), roomToken.getPriceInUsdt(), roomToken.getNativeBalance(), roomToken.getPercentChange1h(), Utils.DOUBLE_EPSILON, "", (String) null));
            }
        }
    }
}
