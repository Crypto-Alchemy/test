package net.safemoon.androidwallet.viewmodels;

import android.app.Application;
import android.graphics.Bitmap;
import android.util.Log;
import androidx.lifecycle.LiveData;
import java.util.ArrayList;
import java.util.List;
import kotlin.C6169a;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineStart;
import net.safemoon.androidwallet.common.SimilarTypeGroup;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.model.cmcTokenInfo.CmcTokenInfo;
import net.safemoon.androidwallet.model.cmcTokenInfo.TokenDetail;
import net.safemoon.androidwallet.model.reflections.RoomReflectionsToken;
import net.safemoon.androidwallet.model.rpc2.CommonTokenInfo;
import net.safemoon.androidwallet.model.transaction.history.Result;
import net.safemoon.androidwallet.model.transaction.history.TransactionHistoryModel;
import net.safemoon.androidwallet.repository.ReflectionDataSource;
import net.safemoon.androidwallet.utils.ReflectionCustomContract;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \n2\u00020\u0001:\u0002IJB\u000f\u0012\u0006\u0010F\u001a\u00020E¢\u0006\u0004\bG\u0010HJ\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJD\u0010\u0012\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0014\u0010\u0011\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00060\u000fJ\u0006\u0010\u0013\u001a\u00020\u0006J\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014J\u0010\u0010\u0016\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0018\u0010\u0018\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0002H\u0002R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0002¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\"R\u001f\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R1\u00102\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020, -*\n\u0012\u0004\u0012\u00020,\u0018\u00010+0+0*8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001f\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030$8\u0006¢\u0006\f\n\u0004\b4\u0010&\u001a\u0004\b5\u0010(R\u001f\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001070$8\u0006¢\u0006\f\n\u0004\b\u0013\u0010&\u001a\u0004\b8\u0010(R\u001f\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010:0$8\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b;\u0010(R\u001e\u0010?\u001a\n\u0012\u0004\u0012\u000203\u0018\u00010=8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010>R\u001e\u0010A\u001a\n\u0012\u0004\u0012\u00020@\u0018\u00010=8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010>R\u001f\u0010D\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010B0$8\u0006¢\u0006\f\n\u0004\b0\u0010&\u001a\u0004\bC\u0010(¨\u0006K"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/CustomReflectionContractTokenViewModel;", "Lwj;", "Lnet/safemoon/androidwallet/common/TokenType;", "h", "t", "reflectionTokenType", "Lr37;", "w", "", "contractAddress", "l", "j", "contractName", "contractSymbol", "contractDecimal", "Lkotlin/Function1;", "Lnet/safemoon/androidwallet/viewmodels/CustomReflectionContractTokenViewModel$SaveReturnCode;", "callBack", "x", "g", "Lnet/safemoon/androidwallet/model/transaction/history/Result;", "n", "i", "tokenType", "m", "Lnet/safemoon/androidwallet/repository/ReflectionDataSource;", "b", "Lef3;", "r", "()Lnet/safemoon/androidwallet/repository/ReflectionDataSource;", "reflectionDataSource", "Lnet/safemoon/androidwallet/utils/ReflectionCustomContract;", "c", "q", "()Lnet/safemoon/androidwallet/utils/ReflectionCustomContract;", "reflectionCustomContract", "Lk04;", "d", "Lk04;", "s", "()Lk04;", "selectedNetwork", "Landroidx/lifecycle/LiveData;", "", "Lnet/safemoon/androidwallet/model/reflections/RoomReflectionsToken;", "kotlin.jvm.PlatformType", "e", "Landroidx/lifecycle/LiveData;", "k", "()Landroidx/lifecycle/LiveData;", "alreadyAddedToken", "Lnet/safemoon/androidwallet/model/transaction/history/TransactionHistoryModel;", "f", "u", "tokenInfo", "Lnet/safemoon/androidwallet/model/cmcTokenInfo/TokenDetail;", "v", "tokenInfoCMC", "Landroid/graphics/Bitmap;", "o", "identicon", "Lk90;", "Lk90;", "callTokenInfo", "Lnet/safemoon/androidwallet/model/cmcTokenInfo/CmcTokenInfo;", "callCMCTokenInfo", "Lnet/safemoon/androidwallet/model/rpc2/CommonTokenInfo;", "p", "nonEvmTokenInfo", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "a", "SaveReturnCode", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: CustomReflectionContractTokenViewModel.kt */
public final class CustomReflectionContractTokenViewModel extends C3552wj {

    /* renamed from: l */
    public static final C8675a f42706l = new C8675a((DefaultConstructorMarker) null);

    /* renamed from: b */
    public final ef3 f42707b;

    /* renamed from: c */
    public final ef3 f42708c = C6169a.m47232a(new C8680xba288847(this));

    /* renamed from: d */
    public final k04<TokenType> f42709d;

    /* renamed from: e */
    public final LiveData<List<RoomReflectionsToken>> f42710e;

    /* renamed from: f */
    public final k04<TransactionHistoryModel> f42711f;

    /* renamed from: g */
    public final k04<TokenDetail> f42712g;

    /* renamed from: h */
    public final k04<Bitmap> f42713h;

    /* renamed from: i */
    public k90<TransactionHistoryModel> f42714i;

    /* renamed from: j */
    public k90<CmcTokenInfo> f42715j;

    /* renamed from: k */
    public final k04<CommonTokenInfo> f42716k;

    @Metadata(mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/CustomReflectionContractTokenViewModel$SaveReturnCode;", "", "(Ljava/lang/String;I)V", "ERROR", "SUCCESS", "PROGRESS", "BLACKLIST", "DUPLICATE", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* compiled from: CustomReflectionContractTokenViewModel.kt */
    public enum SaveReturnCode {
        ERROR,
        SUCCESS,
        PROGRESS,
        BLACKLIST,
        DUPLICATE
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/CustomReflectionContractTokenViewModel$a;", "", "", "PRE_CUSTOM_CONTRACT", "Ljava/lang/String;", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.viewmodels.CustomReflectionContractTokenViewModel$a */
    /* compiled from: CustomReflectionContractTokenViewModel.kt */
    public static final class C8675a {
        public C8675a() {
        }

        public /* synthetic */ C8675a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J$\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0016J\u001e\u0010\u000b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\f"}, mo44877d2 = {"net/safemoon/androidwallet/viewmodels/CustomReflectionContractTokenViewModel$b", "Lp90;", "Lnet/safemoon/androidwallet/model/cmcTokenInfo/CmcTokenInfo;", "Lk90;", "call", "Lbg5;", "response", "Lr37;", "b", "", "t", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.viewmodels.CustomReflectionContractTokenViewModel$b */
    /* compiled from: CustomReflectionContractTokenViewModel.kt */
    public static final class C8676b implements p90<CmcTokenInfo> {

        /* renamed from: a */
        public final /* synthetic */ CustomReflectionContractTokenViewModel f42718a;

        /* renamed from: b */
        public final /* synthetic */ String f42719b;

        public C8676b(CustomReflectionContractTokenViewModel customReflectionContractTokenViewModel, String str) {
            this.f42718a = customReflectionContractTokenViewModel;
            this.f42719b = str;
        }

        /* renamed from: a */
        public void mo47103a(k90<CmcTokenInfo> k90, Throwable th) {
            vx2.m53591g(k90, "call");
            vx2.m53591g(th, "t");
            Log.println(7, "Error", String.valueOf(th));
        }

        /* renamed from: b */
        public void mo47104b(k90<CmcTokenInfo> k90, bg5<CmcTokenInfo> bg5) {
            vx2.m53591g(k90, "call");
            vx2.m53591g(bg5, "response");
            if (bg5.mo50581e()) {
                CmcTokenInfo a = bg5.mo50578a();
                if (a != null) {
                    CustomReflectionContractTokenViewModel customReflectionContractTokenViewModel = this.f42718a;
                    String str = this.f42719b;
                    try {
                        customReflectionContractTokenViewModel.mo61192v().postValue(a.getTokenDetails().get(0));
                        customReflectionContractTokenViewModel.mo61185o().postValue(null);
                    } catch (Exception unused) {
                        customReflectionContractTokenViewModel.mo61180j(str);
                    }
                }
            } else {
                this.f42718a.mo61180j(this.f42719b);
            }
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J$\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0016J\u001e\u0010\u000b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\f"}, mo44877d2 = {"net/safemoon/androidwallet/viewmodels/CustomReflectionContractTokenViewModel$c", "Lp90;", "Lnet/safemoon/androidwallet/model/transaction/history/TransactionHistoryModel;", "Lk90;", "call", "Lbg5;", "response", "Lr37;", "b", "", "t", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.viewmodels.CustomReflectionContractTokenViewModel$c */
    /* compiled from: CustomReflectionContractTokenViewModel.kt */
    public static final class C8677c implements p90<TransactionHistoryModel> {

        /* renamed from: a */
        public final /* synthetic */ CustomReflectionContractTokenViewModel f42720a;

        public C8677c(CustomReflectionContractTokenViewModel customReflectionContractTokenViewModel) {
            this.f42720a = customReflectionContractTokenViewModel;
        }

        /* renamed from: a */
        public void mo47103a(k90<TransactionHistoryModel> k90, Throwable th) {
            vx2.m53591g(k90, "call");
            vx2.m53591g(th, "t");
        }

        /* renamed from: b */
        public void mo47104b(k90<TransactionHistoryModel> k90, bg5<TransactionHistoryModel> bg5) {
            vx2.m53591g(k90, "call");
            vx2.m53591g(bg5, "response");
            TransactionHistoryModel a = bg5.mo50578a();
            if (a != null) {
                CustomReflectionContractTokenViewModel customReflectionContractTokenViewModel = this.f42720a;
                if (a.result.size() > 0) {
                    customReflectionContractTokenViewModel.mo61191u().postValue(a);
                } else {
                    customReflectionContractTokenViewModel.mo61191u().postValue(null);
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomReflectionContractTokenViewModel(Application application) {
        super(application);
        vx2.m53591g(application, "application");
        this.f42707b = C6169a.m47232a(new CustomReflectionContractTokenViewModel$reflectionDataSource$2(application));
        k04<TokenType> k04 = new k04<>(mo61178h());
        this.f42709d = k04;
        LiveData<List<RoomReflectionsToken>> c = qw6.m25943c(k04, new ky0(this));
        vx2.m53590f(c, "switchMap(selectedNetwor…iveData()\n        }\n    }");
        this.f42710e = c;
        this.f42711f = new k04<>();
        this.f42712g = new k04<>();
        this.f42713h = new k04<>();
        this.f42716k = new k04<>(null);
    }

    /* renamed from: f */
    public static final LiveData m68593f(CustomReflectionContractTokenViewModel customReflectionContractTokenViewModel, TokenType tokenType) {
        vx2.m53591g(customReflectionContractTokenViewModel, "this$0");
        if (tokenType != null) {
            return customReflectionContractTokenViewModel.mo61188r().mo60743d(tokenType);
        }
        return new k04();
    }

    /* renamed from: g */
    public final void mo61177g() {
        k90<CmcTokenInfo> k90 = this.f42715j;
        if (k90 != null) {
            k90.cancel();
        }
        k90<TransactionHistoryModel> k902 = this.f42714i;
        if (k902 != null) {
            k902.cancel();
        }
        this.f42711f.postValue(null);
        this.f42712g.postValue(null);
        this.f42713h.postValue(null);
    }

    /* renamed from: h */
    public final TokenType mo61178h() {
        Application b = mo27549b();
        vx2.m53590f(b, "getApplication<Application>()");
        return ol0.m70355e(b);
    }

    /* renamed from: i */
    public final void mo61179i(String str) {
        k90<CmcTokenInfo> k90;
        k90<CmcTokenInfo> k902 = this.f42715j;
        if (k902 != null) {
            k902.cancel();
        }
        p70 g = C9384u3.m72566g();
        if (g != null) {
            k90 = g.mo65252d(str);
        } else {
            k90 = null;
        }
        this.f42715j = k90;
        if (k90 != null) {
            k90.mo50512X(new C8676b(this, str));
        }
    }

    /* renamed from: j */
    public final void mo61180j(String str) {
        vx2.m53591g(str, "contractAddress");
        y23 unused = d50.m56748b(cd7.m11843a(this), (CoroutineContext) null, (CoroutineStart) null, new CustomReflectionContractTokenViewModel$generateIdentiIcon$1(this, str, (ns0<? super CustomReflectionContractTokenViewModel$generateIdentiIcon$1>) null), 3, (Object) null);
    }

    /* renamed from: k */
    public final LiveData<List<RoomReflectionsToken>> mo61181k() {
        return this.f42710e;
    }

    /* renamed from: l */
    public final void mo61182l(String str) {
        vx2.m53591g(str, "contractAddress");
        TokenType t = mo61190t();
        if (t != null) {
            k90<TransactionHistoryModel> k90 = this.f42714i;
            if (k90 != null) {
                k90.cancel();
            }
            if (t.getCoinType().getSimilarTypeGroup() == SimilarTypeGroup.EVM_CAPABILITY) {
                k90<TransactionHistoryModel> o = ol0.m70377s(t).mo52393o(str, ol0.m70382x(t));
                this.f42714i = o;
                if (o != null) {
                    o.mo50512X(new C8677c(this));
                }
            } else {
                mo61183m(str, t);
            }
        }
        mo61179i(str);
    }

    /* renamed from: m */
    public final void mo61183m(String str, TokenType tokenType) {
        y23 unused = d50.m56748b(cd7.m11843a(this), qh1.m71265b(), (CoroutineStart) null, new CustomReflectionContractTokenViewModel$getContractInfoNonEvm$1(tokenType, str, this, (ns0<? super CustomReflectionContractTokenViewModel$getContractInfoNonEvm$1>) null), 2, (Object) null);
    }

    /* renamed from: n */
    public final Result mo61184n() {
        ArrayList<Result> arrayList;
        TransactionHistoryModel value = this.f42711f.getValue();
        if (value == null || (arrayList = value.result) == null) {
            return null;
        }
        return arrayList.get(0);
    }

    /* renamed from: o */
    public final k04<Bitmap> mo61185o() {
        return this.f42713h;
    }

    /* renamed from: p */
    public final k04<CommonTokenInfo> mo61186p() {
        return this.f42716k;
    }

    /* renamed from: q */
    public final ReflectionCustomContract mo61187q() {
        return (ReflectionCustomContract) this.f42708c.getValue();
    }

    /* renamed from: r */
    public final ReflectionDataSource mo61188r() {
        return (ReflectionDataSource) this.f42707b.getValue();
    }

    /* renamed from: s */
    public final k04<TokenType> mo61189s() {
        return this.f42709d;
    }

    /* renamed from: t */
    public final TokenType mo61190t() {
        return this.f42709d.getValue();
    }

    /* renamed from: u */
    public final k04<TransactionHistoryModel> mo61191u() {
        return this.f42711f;
    }

    /* renamed from: v */
    public final k04<TokenDetail> mo61192v() {
        return this.f42712g;
    }

    /* renamed from: w */
    public final void mo61193w(TokenType tokenType) {
        if (tokenType != null) {
            this.f42709d.setValue(tokenType);
        }
    }

    /* renamed from: x */
    public final void mo61194x(String str, String str2, String str3, String str4, rc2<? super SaveReturnCode, r37> rc2) {
        Integer num;
        vx2.m53591g(rc2, "callBack");
        if (str != null && str2 != null && str3 != null && str4 != null && xb6.m73916n(str4) != null) {
            TokenType t = mo61190t();
            if (t != null) {
                num = Integer.valueOf(t.getChainId());
            } else {
                num = null;
            }
            if (num != null) {
                y23 unused = d50.m56748b(cd7.m11843a(this), (CoroutineContext) null, (CoroutineStart) null, new CustomReflectionContractTokenViewModel$save$1(this, str, str2, str3, str4, rc2, (ns0<? super CustomReflectionContractTokenViewModel$save$1>) null), 3, (Object) null);
            }
        }
    }
}
