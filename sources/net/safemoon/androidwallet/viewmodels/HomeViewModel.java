package net.safemoon.androidwallet.viewmodels;

import android.app.Application;
import android.net.Uri;
import androidx.paging.CachedPagingDataKt;
import androidx.paging.Pager;
import java.util.Map;
import kotlin.C6169a;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineStart;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.common.ActiveTokenListMode;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.model.AllCryptoList;
import net.safemoon.androidwallet.model.Coin;
import net.safemoon.androidwallet.model.MoonPaySignURL;
import net.safemoon.androidwallet.model.common.PaymentMethod;
import net.safemoon.androidwallet.model.wallets.Wallet;
import net.safemoon.androidwallet.model.wyre.CheckoutPage;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010K\u001a\u00020J¢\u0006\u0004\bL\u0010MJ\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002JR\u0010\u0016\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0014\u0010\u0014\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u00070\u00122\u0014\u0010\u0015\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00070\u0012J\u000e\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0017J\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00170\u001aR\u001b\u0010!\u001a\u00020\u001c8BX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010&\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b%\u0010#R$\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001a8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b'\u0010(R$\u0010/\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b*\u0010#\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R)\u00105\u001a\u0010\u0012\f\u0012\n 1*\u0004\u0018\u00010\u00170\u0017008FX\u0002¢\u0006\f\n\u0004\b2\u0010\u001e\u001a\u0004\b3\u00104R%\u00109\u001a\u0010\u0012\f\u0012\n 1*\u0004\u0018\u00010\u00100\u0010008\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00104R\u001d\u0010;\u001a\b\u0012\u0004\u0012\u00020\u0002008\u0006¢\u0006\f\n\u0004\b+\u00107\u001a\u0004\b:\u00104R\u001d\u0010<\u001a\b\u0012\u0004\u0012\u00020\u0005008\u0006¢\u0006\f\n\u0004\b\u0016\u00107\u001a\u0004\b*\u00104R%\u0010>\u001a\u0010\u0012\f\u0012\n 1*\u0004\u0018\u00010\u00020\u0002008\u0006¢\u0006\f\n\u0004\b=\u00107\u001a\u0004\b'\u00104R\u001d\u0010@\u001a\b\u0012\u0004\u0012\u00020?008\u0006¢\u0006\f\n\u0004\b\u001f\u00107\u001a\u0004\b6\u00104R#\u0010F\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020C0B0A8\u0006¢\u0006\f\n\u0004\b8\u0010D\u001a\u0004\b=\u0010ER%\u0010H\u001a\u0010\u0012\f\u0012\n 1*\u0004\u0018\u00010\u00100\u0010008\u0006¢\u0006\f\n\u0004\b3\u00107\u001a\u0004\bG\u00104R\u001d\u0010I\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020C0B0A8F¢\u0006\u0006\u001a\u0004\b2\u0010E¨\u0006N"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/HomeViewModel;", "Lwj;", "", "valueSortDir", "valueSort", "Lnet/safemoon/androidwallet/common/ActiveTokenListMode;", "activeTokenListMode", "Lr37;", "t", "filter", "u", "Lnet/safemoon/androidwallet/model/common/PaymentMethod;", "paymentMethod", "currencyCode", "", "coinTypeValue", "", "isBuy", "Lkotlin/Function1;", "Lnet/safemoon/androidwallet/model/wyre/CheckoutPage;", "responseCall", "errorCall", "j", "Lnet/safemoon/androidwallet/common/TokenType;", "tokenType", "r", "", "o", "Ldo2;", "b", "Lef3;", "l", "()Ldo2;", "getTokenTypeMapUseCase", "c", "Ljava/lang/String;", "coinValueSort", "d", "coinValueSortDirectory", "e", "Ljava/util/Map;", "tokenTypeListValues", "f", "i", "()Ljava/lang/String;", "s", "(Ljava/lang/String;)V", "browserPackageOpenDeeplink", "Lk04;", "kotlin.jvm.PlatformType", "g", "n", "()Lk04;", "selectedTokenType", "h", "Lk04;", "m", "openMoonPayByDeeplink", "p", "walletConnectUrl", "activeTopModeData", "k", "activeTopFilterData", "Lnet/safemoon/androidwallet/model/AllCryptoList;", "allCryptoListData", "Lz42;", "Lcl4;", "Lnet/safemoon/androidwallet/model/Coin;", "Lz42;", "()Lz42;", "coinListFlow", "q", "isNewTokenLaunch", "allCoinListFlow", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: HomeViewModel.kt */
public final class HomeViewModel extends C3552wj {

    /* renamed from: b */
    public final ef3 f42739b;

    /* renamed from: c */
    public String f42740c = "";

    /* renamed from: d */
    public String f42741d = "";

    /* renamed from: e */
    public Map<String, ? extends TokenType> f42742e;

    /* renamed from: f */
    public String f42743f;

    /* renamed from: g */
    public final ef3 f42744g;

    /* renamed from: h */
    public final k04<Boolean> f42745h;

    /* renamed from: i */
    public final k04<String> f42746i;

    /* renamed from: j */
    public final k04<ActiveTokenListMode> f42747j;

    /* renamed from: k */
    public final k04<String> f42748k;

    /* renamed from: l */
    public final k04<AllCryptoList> f42749l;

    /* renamed from: m */
    public final z42<cl4<Coin>> f42750m;

    /* renamed from: n */
    public final k04<Boolean> f42751n;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    @v21(mo48631c = "net.safemoon.androidwallet.viewmodels.HomeViewModel$1", mo48632f = "HomeViewModel.kt", mo48633l = {54}, mo48634m = "invokeSuspend")
    /* renamed from: net.safemoon.androidwallet.viewmodels.HomeViewModel$1 */
    /* compiled from: HomeViewModel.kt */
    public static final class C86911 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
        public int label;
        public final /* synthetic */ HomeViewModel this$0;

        {
            this.this$0 = r1;
        }

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            return new C86911(this.this$0, ns0);
        }

        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
            return ((C86911) create(hu0, ns0)).invokeSuspend(r37.f33317a);
        }

        public final Object invokeSuspend(Object obj) {
            Object d = wx2.m54101d();
            int i = this.label;
            if (i == 0) {
                hg5.m45199b(obj);
                CoroutineDispatcher b = qh1.m71265b();
                final HomeViewModel homeViewModel = this.this$0;
                C86921 r1 = new fd2<hu0, ns0<? super r37>, Object>((ns0<? super C86921>) null) {
                    public int label;

                    public final ns0<r37> create(Object obj, ns0<?> ns0) {
                        return 

                        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J$\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0016J\u001e\u0010\u000b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\f"}, mo44877d2 = {"net/safemoon/androidwallet/viewmodels/HomeViewModel$a", "Lp90;", "Lnet/safemoon/androidwallet/model/MoonPaySignURL;", "Lk90;", "call", "Lbg5;", "response", "Lr37;", "b", "", "t", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
                        /* renamed from: net.safemoon.androidwallet.viewmodels.HomeViewModel$a */
                        /* compiled from: HomeViewModel.kt */
                        public static final class C8693a implements p90<MoonPaySignURL> {

                            /* renamed from: a */
                            public final /* synthetic */ rc2<CheckoutPage, r37> f42752a;

                            /* renamed from: b */
                            public final /* synthetic */ rc2<String, r37> f42753b;

                            /* renamed from: c */
                            public final /* synthetic */ HomeViewModel f42754c;

                            public C8693a(rc2<? super CheckoutPage, r37> rc2, rc2<? super String, r37> rc22, HomeViewModel homeViewModel) {
                                this.f42752a = rc2;
                                this.f42753b = rc22;
                                this.f42754c = homeViewModel;
                            }

                            /* renamed from: a */
                            public void mo47103a(k90<MoonPaySignURL> k90, Throwable th) {
                                vx2.m53591g(k90, "call");
                                vx2.m53591g(th, "t");
                                this.f42753b.invoke(this.f42754c.mo27549b().getString(R.string.error_text));
                            }

                            /* renamed from: b */
                            public void mo47104b(k90<MoonPaySignURL> k90, bg5<MoonPaySignURL> bg5) {
                                String str;
                                vx2.m53591g(k90, "call");
                                vx2.m53591g(bg5, "response");
                                if (bg5.mo50581e()) {
                                    rc2<CheckoutPage, r37> rc2 = this.f42752a;
                                    CheckoutPage checkoutPage = new CheckoutPage();
                                    MoonPaySignURL a = bg5.mo50578a();
                                    if (a != null) {
                                        str = a.urlWithSignature;
                                    } else {
                                        str = null;
                                    }
                                    checkoutPage.setUrl(str);
                                    rc2.invoke(checkoutPage);
                                    return;
                                }
                                this.f42753b.invoke(this.f42754c.mo27549b().getString(R.string.error_text));
                            }
                        }

                        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J$\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0016J\u001e\u0010\u000b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\f"}, mo44877d2 = {"net/safemoon/androidwallet/viewmodels/HomeViewModel$b", "Lp90;", "Lnet/safemoon/androidwallet/model/MoonPaySignURL;", "Lk90;", "call", "Lbg5;", "response", "Lr37;", "b", "", "t", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
                        /* renamed from: net.safemoon.androidwallet.viewmodels.HomeViewModel$b */
                        /* compiled from: HomeViewModel.kt */
                        public static final class C8694b implements p90<MoonPaySignURL> {

                            /* renamed from: a */
                            public final /* synthetic */ rc2<CheckoutPage, r37> f42755a;

                            /* renamed from: b */
                            public final /* synthetic */ rc2<String, r37> f42756b;

                            /* renamed from: c */
                            public final /* synthetic */ HomeViewModel f42757c;

                            public C8694b(rc2<? super CheckoutPage, r37> rc2, rc2<? super String, r37> rc22, HomeViewModel homeViewModel) {
                                this.f42755a = rc2;
                                this.f42756b = rc22;
                                this.f42757c = homeViewModel;
                            }

                            /* renamed from: a */
                            public void mo47103a(k90<MoonPaySignURL> k90, Throwable th) {
                                vx2.m53591g(k90, "call");
                                vx2.m53591g(th, "t");
                                this.f42756b.invoke(this.f42757c.mo27549b().getString(R.string.error_text));
                            }

                            /* renamed from: b */
                            public void mo47104b(k90<MoonPaySignURL> k90, bg5<MoonPaySignURL> bg5) {
                                String str;
                                vx2.m53591g(k90, "call");
                                vx2.m53591g(bg5, "response");
                                if (bg5.mo50581e()) {
                                    rc2<CheckoutPage, r37> rc2 = this.f42755a;
                                    CheckoutPage checkoutPage = new CheckoutPage();
                                    MoonPaySignURL a = bg5.mo50578a();
                                    if (a != null) {
                                        str = a.urlWithSignature;
                                    } else {
                                        str = null;
                                    }
                                    checkoutPage.setUrl(str);
                                    rc2.invoke(checkoutPage);
                                    return;
                                }
                                this.f42756b.invoke(this.f42757c.mo27549b().getString(R.string.error_text));
                            }
                        }

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public HomeViewModel(Application application) {
                            super(application);
                            vx2.m53591g(application, "application");
                            this.f42739b = C6169a.m47232a(new HomeViewModel$getTokenTypeMapUseCase$2(application));
                            this.f42744g = C6169a.m47232a(new HomeViewModel$selectedTokenType$2(application));
                            Boolean bool = Boolean.FALSE;
                            this.f42745h = new k04<>(bool);
                            y23 unused = d50.m56748b(ih2.f38385a, (CoroutineContext) null, (CoroutineStart) null, new C86911(this, (ns0<? super C86911>) null), 3, (Object) null);
                            this.f42746i = new k04<>(null);
                            this.f42747j = new k04<>();
                            this.f42748k = new k04<>("");
                            this.f42749l = new k04<>();
                            this.f42750m = CachedPagingDataKt.m8399a(new Pager(new bl4(100, 2, false, 100, 0, 0, 48, (DefaultConstructorMarker) null), (Object) null, new HomeViewModel$coinListFlow$1(this), 2, (DefaultConstructorMarker) null).mo8734a(), cd7.m11843a(this));
                            this.f42751n = new k04<>(bool);
                        }

                        /* renamed from: e */
                        public final k04<String> mo61223e() {
                            return this.f42748k;
                        }

                        /* renamed from: f */
                        public final k04<ActiveTokenListMode> mo61224f() {
                            return this.f42747j;
                        }

                        /* renamed from: g */
                        public final z42<cl4<Coin>> mo61225g() {
                            return CachedPagingDataKt.m8399a(new Pager(new bl4(100, 2, false, 100, 0, 0, 48, (DefaultConstructorMarker) null), (Object) null, new HomeViewModel$allCoinListFlow$1(this), 2, (DefaultConstructorMarker) null).mo8734a(), cd7.m11843a(this));
                        }

                        /* renamed from: h */
                        public final k04<AllCryptoList> mo61226h() {
                            return this.f42749l;
                        }

                        /* renamed from: i */
                        public final String mo61227i() {
                            return this.f42743f;
                        }

                        /* renamed from: j */
                        public final void mo61228j(PaymentMethod paymentMethod, String str, int i, boolean z, rc2<? super CheckoutPage, r37> rc2, rc2<? super String, r37> rc22) {
                            String address;
                            String uri;
                            String uri2;
                            vx2.m53591g(paymentMethod, "paymentMethod");
                            vx2.m53591g(str, "currencyCode");
                            vx2.m53591g(rc2, "responseCall");
                            vx2.m53591g(rc22, "errorCall");
                            Application b = mo27549b();
                            vx2.m53590f(b, "getApplication<Application>()");
                            Wallet c = ol0.m70351c(b);
                            if (c != null && (address = c.getAddress(i)) != null && paymentMethod == PaymentMethod.MOONPAY) {
                                if (z) {
                                    Uri build = by3.f37021a.mo50750b(address, str).build();
                                    if (build != null && (uri2 = build.toString()) != null) {
                                        C9384u3.m72571l().mo52285n(uri2).mo50512X(new C8693a(rc2, rc22, this));
                                        return;
                                    }
                                    return;
                                }
                                Uri build2 = by3.f37021a.mo50749a(address, str).build();
                                if (build2 != null && (uri = build2.toString()) != null) {
                                    C9384u3.m72571l().mo52285n(uri).mo50512X(new C8694b(rc2, rc22, this));
                                }
                            }
                        }

                        /* renamed from: k */
                        public final z42<cl4<Coin>> mo61229k() {
                            return this.f42750m;
                        }

                        /* renamed from: l */
                        public final do2 mo61230l() {
                            return (do2) this.f42739b.getValue();
                        }

                        /* renamed from: m */
                        public final k04<Boolean> mo61231m() {
                            return this.f42745h;
                        }

                        /* renamed from: n */
                        public final k04<TokenType> mo61232n() {
                            return (k04) this.f42744g.getValue();
                        }

                        /* renamed from: o */
                        public final Map<String, TokenType> mo61233o() {
                            if (this.f42742e == null) {
                                this.f42742e = mo61230l().get();
                            }
                            Map<String, ? extends TokenType> map = this.f42742e;
                            vx2.m53588d(map);
                            return map;
                        }

                        /* renamed from: p */
                        public final k04<String> mo61234p() {
                            return this.f42746i;
                        }

                        /* renamed from: q */
                        public final k04<Boolean> mo61235q() {
                            return this.f42751n;
                        }

                        /* renamed from: r */
                        public final void mo61236r(TokenType tokenType) {
                            vx2.m53591g(tokenType, "tokenType");
                            mo61232n().setValue(tokenType);
                        }

                        /* renamed from: s */
                        public final void mo61237s(String str) {
                            this.f42743f = str;
                        }

                        /* renamed from: t */
                        public final void mo61238t(String str, String str2, ActiveTokenListMode activeTokenListMode) {
                            vx2.m53591g(str, "valueSortDir");
                            vx2.m53591g(str2, "valueSort");
                            vx2.m53591g(activeTokenListMode, "activeTokenListMode");
                            this.f42740c = str2;
                            this.f42741d = str;
                            this.f42747j.setValue(activeTokenListMode);
                        }

                        /* renamed from: u */
                        public final void mo61239u(String str) {
                            vx2.m53591g(str, "filter");
                            this.f42748k.setValue(str);
                        }
                    }
