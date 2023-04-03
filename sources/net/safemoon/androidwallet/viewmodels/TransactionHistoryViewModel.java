package net.safemoon.androidwallet.viewmodels;

import android.app.Application;
import androidx.paging.CachedPagingDataKt;
import androidx.paging.Pager;
import java.util.List;
import kotlin.C6169a;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineStart;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.model.common.LoadingState;
import net.safemoon.androidwallet.model.priceAlert.PriceAlertToken;
import net.safemoon.androidwallet.model.token.abstraction.IToken;
import net.safemoon.androidwallet.model.tokensInfo.CurrencyTokenInfo;
import net.safemoon.androidwallet.model.transaction.history.Result;
import net.safemoon.androidwallet.model.wallets.Wallet;
import net.safemoon.androidwallet.p020ui.displayModel.UserTokenItemDisplayModel;
import net.safemoon.androidwallet.repository.FcmDataSource;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u00107\u001a\u000206¢\u0006\u0004\b8\u00109J\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bJ\u001a\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\bJ7\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u00102\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\bH@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012R#\u0010\u0019\u001a\n \u0014*\u0004\u0018\u00010\u00130\u00138BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010#\u001a\u0004\u0018\u00010\u001f8BX\u0002¢\u0006\f\n\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\"R1\u0010*\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020& \u0014*\n\u0012\u0004\u0012\u00020&\u0018\u00010%0%0$8\u0006¢\u0006\f\n\u0004\b!\u0010'\u001a\u0004\b(\u0010)R%\u0010-\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010+0+0$8\u0006¢\u0006\f\n\u0004\b(\u0010'\u001a\u0004\b,\u0010)R\u001f\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010.0$8\u0006¢\u0006\f\n\u0004\b/\u0010'\u001a\u0004\b0\u0010)R\u001f\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001020$8\u0006¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b/\u0010)R1\u00105\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000f \u0014*\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010%0%0$8\u0006¢\u0006\f\n\u0004\b\u001c\u0010'\u001a\u0004\b4\u0010)\u0002\u0004\n\u0002\b\u0019¨\u0006:"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/TransactionHistoryViewModel;", "Lwj;", "Lnet/safemoon/androidwallet/ui/displayModel/UserTokenItemDisplayModel;", "userTokenItemDisplayModel", "Lz42;", "Lcl4;", "Lnet/safemoon/androidwallet/model/transaction/history/Result;", "o", "", "tokenAddress", "Lr37;", "h", "tokenSymbol", "k", "Ljava/util/ArrayList;", "Lnet/safemoon/androidwallet/model/priceAlert/PriceAlertToken;", "Lkotlin/collections/ArrayList;", "n", "(Ljava/lang/String;Ljava/lang/String;Lns0;)Ljava/lang/Object;", "Ltk5;", "kotlin.jvm.PlatformType", "b", "Lef3;", "j", "()Ltk5;", "mainNetApiInterface", "Lnet/safemoon/androidwallet/repository/FcmDataSource;", "c", "i", "()Lnet/safemoon/androidwallet/repository/FcmDataSource;", "fcmDataSource", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "d", "e", "()Lnet/safemoon/androidwallet/model/wallets/Wallet;", "activeWallet", "Lk04;", "", "Lnet/safemoon/androidwallet/model/token/abstraction/IToken;", "Lk04;", "f", "()Lk04;", "allTokensList", "Lnet/safemoon/androidwallet/model/common/LoadingState;", "m", "transactionLoadingState", "", "g", "getAppBarOffset", "appBarOffset", "Lnet/safemoon/androidwallet/model/tokensInfo/CurrencyTokenInfo;", "currencyTokenInfo", "l", "priceAlertTokenLiveData", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: TransactionHistoryViewModel.kt */
public final class TransactionHistoryViewModel extends C3552wj {

    /* renamed from: b */
    public final ef3 f42982b = C6169a.m47232a(TransactionHistoryViewModel$mainNetApiInterface$2.INSTANCE);

    /* renamed from: c */
    public final ef3 f42983c;

    /* renamed from: d */
    public final ef3 f42984d;

    /* renamed from: e */
    public final k04<List<IToken>> f42985e;

    /* renamed from: f */
    public final k04<LoadingState> f42986f;

    /* renamed from: g */
    public final k04<Integer> f42987g;

    /* renamed from: h */
    public final k04<CurrencyTokenInfo> f42988h;

    /* renamed from: i */
    public final k04<List<PriceAlertToken>> f42989i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransactionHistoryViewModel(Application application) {
        super(application);
        vx2.m53591g(application, "application");
        this.f42983c = C6169a.m47232a(new TransactionHistoryViewModel$fcmDataSource$2(application));
        this.f42984d = C6169a.m47232a(new TransactionHistoryViewModel$activeWallet$2(this));
        this.f42985e = new k04<>(ck0.m33062j());
        this.f42986f = new k04<>(LoadingState.Normal);
        this.f42987g = new k04<>(null);
        this.f42988h = new k04<>(null);
        this.f42989i = new k04<>(ck0.m33062j());
    }

    /* renamed from: e */
    public final Wallet mo61739e() {
        return (Wallet) this.f42984d.getValue();
    }

    /* renamed from: f */
    public final k04<List<IToken>> mo61740f() {
        return this.f42985e;
    }

    /* renamed from: g */
    public final k04<CurrencyTokenInfo> mo61741g() {
        return this.f42988h;
    }

    /* renamed from: h */
    public final void mo61742h(String str) {
        vx2.m53591g(str, "tokenAddress");
        y23 unused = d50.m56748b(cd7.m11843a(this), (CoroutineContext) null, (CoroutineStart) null, new TransactionHistoryViewModel$getCurrencyTokenInfo$1(str, this, (ns0<? super TransactionHistoryViewModel$getCurrencyTokenInfo$1>) null), 3, (Object) null);
    }

    /* renamed from: i */
    public final FcmDataSource mo61743i() {
        return (FcmDataSource) this.f42983c.getValue();
    }

    /* renamed from: j */
    public final tk5 mo61744j() {
        return (tk5) this.f42982b.getValue();
    }

    /* renamed from: k */
    public final void mo61745k(String str, String str2) {
        y23 unused = d50.m56748b(cd7.m11843a(this), qh1.m71265b(), (CoroutineStart) null, new TransactionHistoryViewModel$getNotificationPriceAlert$1(this, str, str2, (ns0<? super TransactionHistoryViewModel$getNotificationPriceAlert$1>) null), 2, (Object) null);
    }

    /* renamed from: l */
    public final k04<List<PriceAlertToken>> mo61746l() {
        return this.f42989i;
    }

    /* renamed from: m */
    public final k04<LoadingState> mo61747m() {
        return this.f42986f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009e A[Catch:{ Exception -> 0x00a2 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo61748n(java.lang.String r9, java.lang.String r10, p000.ns0<? super java.util.ArrayList<net.safemoon.androidwallet.model.priceAlert.PriceAlertToken>> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof net.safemoon.androidwallet.viewmodels.TransactionHistoryViewModel$loadPriceAlert$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            net.safemoon.androidwallet.viewmodels.TransactionHistoryViewModel$loadPriceAlert$1 r0 = (net.safemoon.androidwallet.viewmodels.TransactionHistoryViewModel$loadPriceAlert$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            net.safemoon.androidwallet.viewmodels.TransactionHistoryViewModel$loadPriceAlert$1 r0 = new net.safemoon.androidwallet.viewmodels.TransactionHistoryViewModel$loadPriceAlert$1
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
            p000.hg5.m45199b(r11)     // Catch:{ Exception -> 0x00a2 }
            goto L_0x009f
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
            p000.hg5.m45199b(r11)     // Catch:{ Exception -> 0x00a2 }
            r7 = r10
            r10 = r9
            r9 = r7
            goto L_0x0083
        L_0x004d:
            p000.hg5.m45199b(r11)
            net.safemoon.androidwallet.model.wallets.Wallet r11 = r8.mo61739e()
            if (r11 == 0) goto L_0x0062
            net.safemoon.androidwallet.common.MyCoinType r2 = net.safemoon.androidwallet.common.MyCoinType.ETHEREUM
            int r2 = r2.getValue()
            java.lang.String r11 = r11.getAddress(r2)
            r2 = r11
            goto L_0x0063
        L_0x0062:
            r2 = r5
        L_0x0063:
            tk5 r11 = r8.mo61744j()     // Catch:{ Exception -> 0x00a2 }
            if (r9 != 0) goto L_0x006a
            goto L_0x006b
        L_0x006a:
            r10 = r5
        L_0x006b:
            net.safemoon.androidwallet.repository.FcmDataSource r6 = r8.mo61743i()     // Catch:{ Exception -> 0x00a2 }
            r0.L$0 = r11     // Catch:{ Exception -> 0x00a2 }
            r0.L$1 = r2     // Catch:{ Exception -> 0x00a2 }
            r0.L$2 = r9     // Catch:{ Exception -> 0x00a2 }
            r0.L$3 = r10     // Catch:{ Exception -> 0x00a2 }
            r0.label = r4     // Catch:{ Exception -> 0x00a2 }
            java.lang.Object r4 = r6.mo60724c(r0)     // Catch:{ Exception -> 0x00a2 }
            if (r4 != r1) goto L_0x0080
            return r1
        L_0x0080:
            r7 = r4
            r4 = r11
            r11 = r7
        L_0x0083:
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ Exception -> 0x00a2 }
            k90 r9 = r4.mo66084c(r2, r9, r10, r11)     // Catch:{ Exception -> 0x00a2 }
            java.lang.String r10 = "mainNetApiInterface.getP…DataSource.getFCMToken())"
            p000.vx2.m53590f(r9, r10)     // Catch:{ Exception -> 0x00a2 }
            r0.L$0 = r5     // Catch:{ Exception -> 0x00a2 }
            r0.L$1 = r5     // Catch:{ Exception -> 0x00a2 }
            r0.L$2 = r5     // Catch:{ Exception -> 0x00a2 }
            r0.L$3 = r5     // Catch:{ Exception -> 0x00a2 }
            r0.label = r3     // Catch:{ Exception -> 0x00a2 }
            java.lang.Object r11 = retrofit2.KotlinExtensions.m71521c(r9, r0)     // Catch:{ Exception -> 0x00a2 }
            if (r11 != r1) goto L_0x009f
            return r1
        L_0x009f:
            bg5 r11 = (p000.bg5) r11     // Catch:{ Exception -> 0x00a2 }
            r5 = r11
        L_0x00a2:
            if (r5 == 0) goto L_0x00db
            boolean r9 = r5.mo50581e()
            if (r9 == 0) goto L_0x00db
            java.lang.Object r9 = r5.mo50578a()
            if (r9 == 0) goto L_0x00db
            java.lang.Object r9 = r5.mo50578a()
            net.safemoon.androidwallet.model.priceAlert.PriceAlertTokenListData r9 = (net.safemoon.androidwallet.model.priceAlert.PriceAlertTokenListData) r9
            if (r9 == 0) goto L_0x00c3
            java.util.ArrayList r9 = r9.getResult()
            if (r9 == 0) goto L_0x00c3
            int r9 = r9.size()
            goto L_0x00c4
        L_0x00c3:
            r9 = 0
        L_0x00c4:
            if (r9 <= 0) goto L_0x00db
            java.lang.Object r9 = r5.mo50578a()
            p000.vx2.m53588d(r9)
            net.safemoon.androidwallet.model.priceAlert.PriceAlertTokenListData r9 = (net.safemoon.androidwallet.model.priceAlert.PriceAlertTokenListData) r9
            java.util.ArrayList r9 = r9.getResult()
            if (r9 != 0) goto L_0x00e0
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            goto L_0x00e0
        L_0x00db:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L_0x00e0:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.TransactionHistoryViewModel.mo61748n(java.lang.String, java.lang.String, ns0):java.lang.Object");
    }

    /* renamed from: o */
    public final z42<cl4<Result>> mo61749o(UserTokenItemDisplayModel userTokenItemDisplayModel) {
        vx2.m53591g(userTokenItemDisplayModel, "userTokenItemDisplayModel");
        TokenType b = TokenType.Companion.mo57099b(userTokenItemDisplayModel.getChainId());
        y23 unused = d50.m56748b(ih2.f38385a, (CoroutineContext) null, (CoroutineStart) null, new TransactionHistoryViewModel$transactionListFlow$1(this, b, (ns0<? super TransactionHistoryViewModel$transactionListFlow$1>) null), 3, (Object) null);
        return CachedPagingDataKt.m8399a(new Pager(new bl4(100, 2, false, 100, 0, 0, 48, (DefaultConstructorMarker) null), (Object) null, new TransactionHistoryViewModel$transactionListFlow$2(this, b, userTokenItemDisplayModel), 2, (DefaultConstructorMarker) null).mo8734a(), cd7.m11843a(this));
    }
}
