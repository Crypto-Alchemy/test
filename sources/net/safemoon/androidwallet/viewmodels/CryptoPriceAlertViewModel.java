package net.safemoon.androidwallet.viewmodels;

import android.app.Application;
import androidx.lifecycle.LiveData;
import java.util.ArrayList;
import java.util.List;
import kotlin.C6169a;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlinx.coroutines.CoroutineStart;
import net.safemoon.androidwallet.model.common.LoadingState;
import net.safemoon.androidwallet.model.priceAlert.PAToken;
import net.safemoon.androidwallet.model.priceAlert.PriceAlertToken;
import net.safemoon.androidwallet.model.wallets.Wallet;
import net.safemoon.androidwallet.repository.FcmDataSource;
import net.safemoon.androidwallet.repository.PriceFetchDataSource;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010I\u001a\u00020H¢\u0006\u0004\bJ\u0010KJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J!\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u000e\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bJ\u0016\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007J\u0016\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u0012\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0005J7\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0016j\b\u0012\u0004\u0012\u00020\u0005`\u00172\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013H@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019JA\u0010\u001d\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u001b\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u0007H@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eR#\u0010%\u001a\n  *\u0004\u0018\u00010\u001f0\u001f8BX\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010*\u001a\u0004\u0018\u00010&8BX\u0002¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020+8BX\u0002¢\u0006\f\n\u0004\b,\u0010\"\u001a\u0004\b-\u0010.R\u001b\u00104\u001a\u0002008BX\u0002¢\u0006\f\n\u0004\b1\u0010\"\u001a\u0004\b2\u00103R%\u0010;\u001a\u0010\u0012\f\u0012\n  *\u0004\u0018\u00010606058\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R#\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050<058\u0006¢\u0006\f\n\u0004\b=\u00108\u001a\u0004\b>\u0010:R\u001d\u0010B\u001a\b\u0012\u0004\u0012\u00020\u0007058\u0006¢\u0006\f\n\u0004\b@\u00108\u001a\u0004\bA\u0010:R\u001f\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050C8\u0006¢\u0006\f\n\u0004\b\u000e\u0010D\u001a\u0004\bE\u0010F\u0002\u0004\n\u0002\b\u0019¨\u0006L"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/CryptoPriceAlertViewModel;", "Lwj;", "Lr37;", "y", "z", "Lnet/safemoon/androidwallet/model/priceAlert/PriceAlertToken;", "priceToken", "", "position", "A", "(Lnet/safemoon/androidwallet/model/priceAlert/PriceAlertToken;Ljava/lang/Integer;)V", "Lnet/safemoon/androidwallet/model/priceAlert/PAToken;", "paToken", "m", "i", "priceAlertData", "j", "l", "k", "", "tokenAddress", "tokenSymbol", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "w", "(Ljava/lang/String;Ljava/lang/String;Lns0;)Ljava/lang/Object;", "tokenName", "chainId", "cmcId", "r", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;Lns0;)Ljava/lang/Object;", "Ltk5;", "kotlin.jvm.PlatformType", "b", "Lef3;", "q", "()Ltk5;", "mainNetApiInterface", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "c", "n", "()Lnet/safemoon/androidwallet/model/wallets/Wallet;", "activeWallet", "Lnet/safemoon/androidwallet/repository/PriceFetchDataSource;", "d", "t", "()Lnet/safemoon/androidwallet/repository/PriceFetchDataSource;", "priceFetch", "Lnet/safemoon/androidwallet/repository/FcmDataSource;", "e", "o", "()Lnet/safemoon/androidwallet/repository/FcmDataSource;", "fcmDataSource", "Lk04;", "Lnet/safemoon/androidwallet/model/common/LoadingState;", "f", "Lk04;", "p", "()Lk04;", "loading", "", "g", "s", "priceAlertTokenLiveData", "h", "u", "selectedIndex", "Landroidx/lifecycle/LiveData;", "Landroidx/lifecycle/LiveData;", "v", "()Landroidx/lifecycle/LiveData;", "selectedPriceAlert", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: CryptoPriceAlertViewModel.kt */
public final class CryptoPriceAlertViewModel extends C3552wj {

    /* renamed from: b */
    public final ef3 f42677b = C6169a.m47232a(CryptoPriceAlertViewModel$mainNetApiInterface$2.INSTANCE);

    /* renamed from: c */
    public final ef3 f42678c;

    /* renamed from: d */
    public final ef3 f42679d;

    /* renamed from: e */
    public final ef3 f42680e;

    /* renamed from: f */
    public final k04<LoadingState> f42681f;

    /* renamed from: g */
    public final k04<List<PriceAlertToken>> f42682g;

    /* renamed from: h */
    public final k04<Integer> f42683h;

    /* renamed from: i */
    public final LiveData<PriceAlertToken> f42684i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CryptoPriceAlertViewModel(Application application) {
        super(application);
        vx2.m53591g(application, "application");
        this.f42678c = C6169a.m47232a(new CryptoPriceAlertViewModel$activeWallet$2(application));
        this.f42679d = C6169a.m47232a(new CryptoPriceAlertViewModel$priceFetch$2(application));
        this.f42680e = C6169a.m47232a(new CryptoPriceAlertViewModel$fcmDataSource$2(application));
        this.f42681f = new k04<>(LoadingState.Loading);
        this.f42682g = new k04<>();
        k04<Integer> k04 = new k04<>(null);
        this.f42683h = k04;
        LiveData<PriceAlertToken> c = qw6.m25943c(k04, new zw0(this));
        vx2.m53590f(c, "switchMap(selectedIndex)…e?.getOrNull(it) })\n    }");
        this.f42684i = c;
    }

    /* renamed from: B */
    public static /* synthetic */ void m68532B(CryptoPriceAlertViewModel cryptoPriceAlertViewModel, PriceAlertToken priceAlertToken, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            num = cryptoPriceAlertViewModel.f42683h.getValue();
        }
        cryptoPriceAlertViewModel.mo61126A(priceAlertToken, num);
    }

    /* renamed from: x */
    public static final LiveData m68539x(CryptoPriceAlertViewModel cryptoPriceAlertViewModel, Integer num) {
        vx2.m53591g(cryptoPriceAlertViewModel, "this$0");
        PriceAlertToken priceAlertToken = null;
        if (num != null) {
            int intValue = num.intValue();
            List value = cryptoPriceAlertViewModel.f42682g.getValue();
            if (value != null) {
                vx2.m53590f(value, "value");
                priceAlertToken = (PriceAlertToken) CollectionsKt___CollectionsKt.m47332c0(value, intValue);
            }
        }
        return new k04(priceAlertToken);
    }

    /* renamed from: A */
    public final void mo61126A(PriceAlertToken priceAlertToken, Integer num) {
        int i;
        List M0;
        vx2.m53591g(priceAlertToken, "priceToken");
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        List value = this.f42682g.getValue();
        if (value != null && (M0 = CollectionsKt___CollectionsKt.m47313M0(value)) != null) {
            M0.set(i, priceAlertToken);
            this.f42682g.postValue(M0);
            this.f42683h.postValue(Integer.valueOf(i));
        }
    }

    /* renamed from: i */
    public final void mo61127i(PAToken pAToken) {
        vx2.m53591g(pAToken, "paToken");
        y23 unused = d50.m56748b(cd7.m11843a(this), qh1.m71265b(), (CoroutineStart) null, new CryptoPriceAlertViewModel$addBlankPriceAlert$1(this, pAToken, (ns0<? super CryptoPriceAlertViewModel$addBlankPriceAlert$1>) null), 2, (Object) null);
    }

    /* renamed from: j */
    public final void mo61128j(PriceAlertToken priceAlertToken, int i) {
        vx2.m53591g(priceAlertToken, "priceAlertData");
        y23 unused = d50.m56748b(ih2.f38385a, qh1.m71265b(), (CoroutineStart) null, new CryptoPriceAlertViewModel$createUpdatePriceAlert$1(this, priceAlertToken, i, (ns0<? super CryptoPriceAlertViewModel$createUpdatePriceAlert$1>) null), 2, (Object) null);
    }

    /* renamed from: k */
    public final void mo61129k(PriceAlertToken priceAlertToken) {
        vx2.m53591g(priceAlertToken, "paToken");
        if (mo61132n() != null) {
            y23 unused = d50.m56748b(cd7.m11843a(this), qh1.m71265b(), (CoroutineStart) null, new CryptoPriceAlertViewModel$deleteAllPriceAlert$1(this, priceAlertToken, (ns0<? super CryptoPriceAlertViewModel$deleteAllPriceAlert$1>) null), 2, (Object) null);
        }
    }

    /* renamed from: l */
    public final void mo61130l(PriceAlertToken priceAlertToken, int i) {
        List list;
        boolean z;
        vx2.m53591g(priceAlertToken, "priceAlertData");
        if (priceAlertToken.getId() != null) {
            y23 unused = d50.m56748b(ih2.f38385a, qh1.m71265b(), (CoroutineStart) null, new CryptoPriceAlertViewModel$deletePriceAlert$1(this, priceAlertToken, i, (ns0<? super CryptoPriceAlertViewModel$deletePriceAlert$1>) null), 2, (Object) null);
            return;
        }
        List value = this.f42682g.getValue();
        if (value != null) {
            list = new ArrayList();
            int i2 = 0;
            for (Object next : value) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    ck0.m33072t();
                }
                PriceAlertToken priceAlertToken2 = (PriceAlertToken) next;
                if (i2 != i) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    list.add(next);
                }
                i2 = i3;
            }
        } else {
            list = ck0.m33062j();
        }
        this.f42682g.postValue(list);
        if (i >= list.size()) {
            this.f42683h.postValue(Integer.valueOf(list.size() - 1));
        } else {
            this.f42683h.postValue(Integer.valueOf(i));
        }
    }

    /* renamed from: m */
    public final void mo61131m(PAToken pAToken) {
        vx2.m53591g(pAToken, "paToken");
        y23 unused = d50.m56748b(cd7.m11843a(this), qh1.m71265b(), (CoroutineStart) null, new CryptoPriceAlertViewModel$fetchPriceAlert$1(this, pAToken, (ns0<? super CryptoPriceAlertViewModel$fetchPriceAlert$1>) null), 2, (Object) null);
    }

    /* renamed from: n */
    public final Wallet mo61132n() {
        return (Wallet) this.f42678c.getValue();
    }

    /* renamed from: o */
    public final FcmDataSource mo61133o() {
        return (FcmDataSource) this.f42680e.getValue();
    }

    /* renamed from: p */
    public final k04<LoadingState> mo61134p() {
        return this.f42681f;
    }

    /* renamed from: q */
    public final tk5 mo61135q() {
        return (tk5) this.f42677b.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00f8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x018a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0030  */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo61136r(java.lang.String r40, java.lang.String r41, java.lang.String r42, int r43, java.lang.Integer r44, p000.ns0<? super net.safemoon.androidwallet.model.priceAlert.PriceAlertToken> r45) {
        /*
            r39 = this;
            r0 = r39
            r1 = r40
            r2 = r42
            r3 = r43
            r4 = r45
            boolean r5 = r4 instanceof net.safemoon.androidwallet.viewmodels.CryptoPriceAlertViewModel$getNewEmptyToken$1
            if (r5 == 0) goto L_0x001d
            r5 = r4
            net.safemoon.androidwallet.viewmodels.CryptoPriceAlertViewModel$getNewEmptyToken$1 r5 = (net.safemoon.androidwallet.viewmodels.CryptoPriceAlertViewModel$getNewEmptyToken$1) r5
            int r6 = r5.label
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L_0x001d
            int r6 = r6 - r7
            r5.label = r6
            goto L_0x0022
        L_0x001d:
            net.safemoon.androidwallet.viewmodels.CryptoPriceAlertViewModel$getNewEmptyToken$1 r5 = new net.safemoon.androidwallet.viewmodels.CryptoPriceAlertViewModel$getNewEmptyToken$1
            r5.<init>(r0, r4)
        L_0x0022:
            java.lang.Object r4 = r5.result
            java.lang.Object r6 = p000.wx2.m54101d()
            int r7 = r5.label
            r8 = 3
            r9 = 2
            r10 = 1
            r11 = 0
            if (r7 == 0) goto L_0x0090
            if (r7 == r10) goto L_0x0072
            if (r7 == r9) goto L_0x0057
            if (r7 != r8) goto L_0x004f
            java.lang.Object r1 = r5.L$4
            net.safemoon.androidwallet.model.priceAlert.PriceAlertToken r1 = (net.safemoon.androidwallet.model.priceAlert.PriceAlertToken) r1
            java.lang.Object r2 = r5.L$3
            net.safemoon.androidwallet.model.priceAlert.PriceAlertToken r2 = (net.safemoon.androidwallet.model.priceAlert.PriceAlertToken) r2
            java.lang.Object r3 = r5.L$2
            net.safemoon.androidwallet.model.priceAlert.PriceAlertToken r3 = (net.safemoon.androidwallet.model.priceAlert.PriceAlertToken) r3
            java.lang.Object r6 = r5.L$1
            java.lang.Double r6 = (java.lang.Double) r6
            java.lang.Object r5 = r5.L$0
            java.lang.Integer r5 = (java.lang.Integer) r5
            p000.hg5.m45199b(r4)
            goto L_0x0191
        L_0x004f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0057:
            int r1 = r5.I$0
            java.lang.Object r2 = r5.L$4
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r3 = r5.L$3
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r7 = r5.L$2
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r9 = r5.L$1
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r5.L$0
            net.safemoon.androidwallet.viewmodels.CryptoPriceAlertViewModel r10 = (net.safemoon.androidwallet.viewmodels.CryptoPriceAlertViewModel) r10
            p000.hg5.m45199b(r4)
            goto L_0x00fe
        L_0x0072:
            int r1 = r5.I$0
            java.lang.Object r2 = r5.L$4
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r3 = r5.L$3
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r7 = r5.L$2
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r10 = r5.L$1
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r12 = r5.L$0
            net.safemoon.androidwallet.viewmodels.CryptoPriceAlertViewModel r12 = (net.safemoon.androidwallet.viewmodels.CryptoPriceAlertViewModel) r12
            p000.hg5.m45199b(r4)
            r13 = r2
            r2 = r3
            r3 = r12
            r12 = r7
            goto L_0x00c3
        L_0x0090:
            p000.hg5.m45199b(r4)
            net.safemoon.androidwallet.model.wallets.Wallet r4 = r39.mo61132n()
            if (r4 != 0) goto L_0x009a
            return r11
        L_0x009a:
            r4 = -1
            if (r3 == r4) goto L_0x00cc
            java.lang.String r4 = p000.ol0.m70323C(r1, r3, r2)
            if (r4 == 0) goto L_0x00cc
            net.safemoon.androidwallet.repository.PriceFetchDataSource r7 = r39.mo61138t()
            r5.L$0 = r0
            r5.L$1 = r1
            r12 = r41
            r5.L$2 = r12
            r5.L$3 = r2
            r13 = r44
            r5.L$4 = r13
            r5.I$0 = r3
            r5.label = r10
            java.lang.Object r4 = r7.mo60735b(r4, r5)
            if (r4 != r6) goto L_0x00c0
            return r6
        L_0x00c0:
            r10 = r1
            r1 = r3
            r3 = r0
        L_0x00c3:
            net.safemoon.androidwallet.model.tokensInfo.CurrencyTokenInfo r4 = (net.safemoon.androidwallet.model.tokensInfo.CurrencyTokenInfo) r4
            r38 = r3
            r3 = r1
            r1 = r10
            r10 = r38
            goto L_0x00d2
        L_0x00cc:
            r12 = r41
            r13 = r44
            r10 = r0
            r4 = r11
        L_0x00d2:
            if (r4 == 0) goto L_0x00e0
            java.lang.String r4 = r4.getPriceUsd()
            if (r4 == 0) goto L_0x00e0
            java.lang.Double r4 = p000.wb6.m73530l(r4)
            if (r4 != 0) goto L_0x011c
        L_0x00e0:
            net.safemoon.androidwallet.repository.PriceFetchDataSource r4 = r10.mo61138t()
            r5.L$0 = r10
            r5.L$1 = r1
            r5.L$2 = r12
            r5.L$3 = r2
            r5.L$4 = r13
            r5.I$0 = r3
            r5.label = r9
            java.lang.Object r4 = r4.mo60734a(r3, r1, r13, r5)
            if (r4 != r6) goto L_0x00f9
            return r6
        L_0x00f9:
            r9 = r1
            r1 = r3
            r7 = r12
            r3 = r2
            r2 = r13
        L_0x00fe:
            net.safemoon.androidwallet.model.Coin r4 = (net.safemoon.androidwallet.model.Coin) r4
            if (r4 == 0) goto L_0x0116
            net.safemoon.androidwallet.model.Quote r4 = r4.getQuote()
            if (r4 == 0) goto L_0x0116
            net.safemoon.androidwallet.model.USDT r4 = r4.getUSD()
            if (r4 == 0) goto L_0x0116
            java.lang.Double r4 = r4.getPrice()
            r13 = r2
            r2 = r3
            r12 = r7
            goto L_0x011a
        L_0x0116:
            r13 = r2
            r2 = r3
            r12 = r7
            r4 = r11
        L_0x011a:
            r3 = r1
            r1 = r9
        L_0x011c:
            net.safemoon.androidwallet.model.priceAlert.PriceAlertToken r7 = new net.safemoon.androidwallet.model.priceAlert.PriceAlertToken
            r14 = r7
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 2097151(0x1fffff, float:2.938734E-39)
            r37 = 0
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            net.safemoon.androidwallet.model.wallets.Wallet r9 = r10.mo61132n()
            p000.vx2.m53588d(r9)
            net.safemoon.androidwallet.common.MyCoinType r14 = net.safemoon.androidwallet.common.MyCoinType.ETHEREUM
            int r14 = r14.getValue()
            java.lang.String r9 = r9.getAddress(r14)
            r7.setWalletAddress(r9)
            r7.setTokenSymbol(r1)
            r7.setTokenName(r12)
            r7.setTokenAddress(r2)
            java.lang.Integer r1 = p000.a40.m31673d(r3)
            r7.setChainId(r1)
            net.safemoon.androidwallet.repository.FcmDataSource r1 = r10.mo61133o()
            r5.L$0 = r13
            r5.L$1 = r4
            r5.L$2 = r7
            r5.L$3 = r7
            r5.L$4 = r7
            r5.label = r8
            java.lang.Object r1 = r1.mo60724c(r5)
            if (r1 != r6) goto L_0x018b
            return r6
        L_0x018b:
            r6 = r4
            r2 = r7
            r3 = r2
            r5 = r13
            r4 = r1
            r1 = r3
        L_0x0191:
            java.lang.String r4 = (java.lang.String) r4
            r1.setFcmToken(r4)
            if (r5 == 0) goto L_0x019d
            java.lang.String r1 = r5.toString()
            goto L_0x019e
        L_0x019d:
            r1 = r11
        L_0x019e:
            r2.setTokenId(r1)
            rz1$a r1 = p000.rz1.f44501a
            net.safemoon.androidwallet.model.fiat.gson.Fiat r4 = r1.mo65771a()
            java.lang.String r4 = r4.getSymbol()
            r2.setCurrencySymbol(r4)
            net.safemoon.androidwallet.model.fiat.gson.Fiat r1 = r1.mo65771a()
            java.lang.Double r1 = r1.getRate()
            r2.setCurrencyPrice(r1)
            r1 = 18
            if (r6 == 0) goto L_0x01dd
            double r4 = r6.doubleValue()
            double r4 = p000.sz1.m72124a(r4)
            java.math.BigDecimal r7 = new java.math.BigDecimal
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r7.<init>(r4)
            java.lang.String r4 = p000.ol0.m70358f0(r7, r1)
            if (r4 == 0) goto L_0x01dd
            double r4 = p000.ol0.m70330J(r4)
            java.lang.Double r4 = p000.a40.m31671b(r4)
            goto L_0x01de
        L_0x01dd:
            r4 = r11
        L_0x01de:
            r2.setPriceReaches(r4)
            if (r6 == 0) goto L_0x01fe
            java.math.BigDecimal r4 = new java.math.BigDecimal
            double r5 = r6.doubleValue()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r4.<init>(r5)
            java.lang.String r1 = p000.ol0.m70358f0(r4, r1)
            if (r1 == 0) goto L_0x01fe
            double r4 = p000.ol0.m70330J(r1)
            java.lang.Double r11 = p000.a40.m31671b(r4)
        L_0x01fe:
            r2.setPrice(r11)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.CryptoPriceAlertViewModel.mo61136r(java.lang.String, java.lang.String, java.lang.String, int, java.lang.Integer, ns0):java.lang.Object");
    }

    /* renamed from: s */
    public final k04<List<PriceAlertToken>> mo61137s() {
        return this.f42682g;
    }

    /* renamed from: t */
    public final PriceFetchDataSource mo61138t() {
        return (PriceFetchDataSource) this.f42679d.getValue();
    }

    /* renamed from: u */
    public final k04<Integer> mo61139u() {
        return this.f42683h;
    }

    /* renamed from: v */
    public final LiveData<PriceAlertToken> mo61140v() {
        return this.f42684i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a8 A[Catch:{ Exception -> 0x00ac }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo61141w(java.lang.String r9, java.lang.String r10, p000.ns0<? super java.util.ArrayList<net.safemoon.androidwallet.model.priceAlert.PriceAlertToken>> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof net.safemoon.androidwallet.viewmodels.CryptoPriceAlertViewModel$loadPriceAlert$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            net.safemoon.androidwallet.viewmodels.CryptoPriceAlertViewModel$loadPriceAlert$1 r0 = (net.safemoon.androidwallet.viewmodels.CryptoPriceAlertViewModel$loadPriceAlert$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            net.safemoon.androidwallet.viewmodels.CryptoPriceAlertViewModel$loadPriceAlert$1 r0 = new net.safemoon.androidwallet.viewmodels.CryptoPriceAlertViewModel$loadPriceAlert$1
            r0.<init>(r8, r11)
        L_0x0018:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x004d
            if (r2 == r4) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            p000.hg5.m45199b(r11)     // Catch:{ Exception -> 0x00ac }
            goto L_0x00a9
        L_0x002e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0036:
            java.lang.Object r9 = r0.L$3
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r0.L$2
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r2 = r0.L$1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r0.L$0
            tk5 r4 = (p000.tk5) r4
            p000.hg5.m45199b(r11)     // Catch:{ Exception -> 0x00ac }
            r7 = r10
            r10 = r9
            r9 = r7
            goto L_0x008d
        L_0x004d:
            p000.hg5.m45199b(r11)
            net.safemoon.androidwallet.model.wallets.Wallet r11 = r8.mo61132n()
            if (r11 != 0) goto L_0x005c
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            return r9
        L_0x005c:
            net.safemoon.androidwallet.model.wallets.Wallet r11 = r8.mo61132n()
            p000.vx2.m53588d(r11)
            net.safemoon.androidwallet.common.MyCoinType r2 = net.safemoon.androidwallet.common.MyCoinType.ETHEREUM
            int r2 = r2.getValue()
            java.lang.String r2 = r11.getAddress(r2)
            tk5 r11 = r8.mo61135q()     // Catch:{ Exception -> 0x00ac }
            if (r9 != 0) goto L_0x0074
            goto L_0x0075
        L_0x0074:
            r10 = r5
        L_0x0075:
            net.safemoon.androidwallet.repository.FcmDataSource r6 = r8.mo61133o()     // Catch:{ Exception -> 0x00ac }
            r0.L$0 = r11     // Catch:{ Exception -> 0x00ac }
            r0.L$1 = r2     // Catch:{ Exception -> 0x00ac }
            r0.L$2 = r9     // Catch:{ Exception -> 0x00ac }
            r0.L$3 = r10     // Catch:{ Exception -> 0x00ac }
            r0.label = r4     // Catch:{ Exception -> 0x00ac }
            java.lang.Object r4 = r6.mo60724c(r0)     // Catch:{ Exception -> 0x00ac }
            if (r4 != r1) goto L_0x008a
            return r1
        L_0x008a:
            r7 = r4
            r4 = r11
            r11 = r7
        L_0x008d:
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ Exception -> 0x00ac }
            k90 r9 = r4.mo66084c(r2, r9, r10, r11)     // Catch:{ Exception -> 0x00ac }
            java.lang.String r10 = "mainNetApiInterface.getP…DataSource.getFCMToken())"
            p000.vx2.m53590f(r9, r10)     // Catch:{ Exception -> 0x00ac }
            r0.L$0 = r5     // Catch:{ Exception -> 0x00ac }
            r0.L$1 = r5     // Catch:{ Exception -> 0x00ac }
            r0.L$2 = r5     // Catch:{ Exception -> 0x00ac }
            r0.L$3 = r5     // Catch:{ Exception -> 0x00ac }
            r0.label = r3     // Catch:{ Exception -> 0x00ac }
            java.lang.Object r11 = retrofit2.KotlinExtensions.m71521c(r9, r0)     // Catch:{ Exception -> 0x00ac }
            if (r11 != r1) goto L_0x00a9
            return r1
        L_0x00a9:
            bg5 r11 = (p000.bg5) r11     // Catch:{ Exception -> 0x00ac }
            r5 = r11
        L_0x00ac:
            if (r5 == 0) goto L_0x00e4
            boolean r9 = r5.mo50581e()
            if (r9 == 0) goto L_0x00e4
            java.lang.Object r9 = r5.mo50578a()
            if (r9 == 0) goto L_0x00e4
            java.lang.Object r9 = r5.mo50578a()
            net.safemoon.androidwallet.model.priceAlert.PriceAlertTokenListData r9 = (net.safemoon.androidwallet.model.priceAlert.PriceAlertTokenListData) r9
            if (r9 == 0) goto L_0x00cd
            java.util.ArrayList r9 = r9.getResult()
            if (r9 == 0) goto L_0x00cd
            int r9 = r9.size()
            goto L_0x00ce
        L_0x00cd:
            r9 = 0
        L_0x00ce:
            if (r9 <= 0) goto L_0x00e4
            java.lang.Object r9 = r5.mo50578a()
            net.safemoon.androidwallet.model.priceAlert.PriceAlertTokenListData r9 = (net.safemoon.androidwallet.model.priceAlert.PriceAlertTokenListData) r9
            if (r9 == 0) goto L_0x00de
            java.util.ArrayList r9 = r9.getResult()
            if (r9 != 0) goto L_0x00e9
        L_0x00de:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            goto L_0x00e9
        L_0x00e4:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L_0x00e9:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.CryptoPriceAlertViewModel.mo61141w(java.lang.String, java.lang.String, ns0):java.lang.Object");
    }

    /* renamed from: y */
    public final void mo61142y() {
        this.f42681f.postValue(LoadingState.Loading);
    }

    /* renamed from: z */
    public final void mo61143z() {
        this.f42681f.postValue(LoadingState.Normal);
    }
}
