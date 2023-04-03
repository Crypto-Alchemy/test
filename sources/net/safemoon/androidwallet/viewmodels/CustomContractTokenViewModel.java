package net.safemoon.androidwallet.viewmodels;

import android.app.Application;
import android.graphics.Bitmap;
import java.util.ArrayList;
import kotlin.C6169a;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineStart;
import net.safemoon.androidwallet.common.SimilarTypeGroup;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.model.cmcTokenInfo.CmcTokenInfo;
import net.safemoon.androidwallet.model.cmcTokenInfo.TokenDetail;
import net.safemoon.androidwallet.model.rpc2.CommonTokenInfo;
import net.safemoon.androidwallet.model.transaction.history.Result;
import net.safemoon.androidwallet.model.transaction.history.TransactionHistoryModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \b2\u00020\u0001:\u0002STBG\u0012\u0006\u0010P\u001a\u00020O\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u001c\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u001c\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00070\u001c\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00070\u001c¢\u0006\u0004\bQ\u0010RJ\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005JB\u0010\u0010\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u00052\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00070\rJ\u000e\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0005J\u0006\u0010\u0013\u001a\u00020\u0007J\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014J\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0018\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0002H\u0002J\u001b\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0006\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010\u001eR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00070\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001eR\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00070\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001eR\u001b\u0010+\u001a\u00020&8BX\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001b\u00100\u001a\u00020,8BX\u0002¢\u0006\f\n\u0004\b-\u0010(\u001a\u0004\b.\u0010/R\u001b\u00105\u001a\u0002018BX\u0002¢\u0006\f\n\u0004\b2\u0010(\u001a\u0004\b3\u00104R%\u0010<\u001a\u0010\u0012\f\u0012\n 7*\u0004\u0018\u00010\u00020\u0002068\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001f\u0010@\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010=068\u0006¢\u0006\f\n\u0004\b>\u00109\u001a\u0004\b?\u0010;R\u001f\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010A068\u0006¢\u0006\f\n\u0004\b\u0013\u00109\u001a\u0004\bB\u0010;R\u001f\u0010F\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010D068\u0006¢\u0006\f\n\u0004\b\u0003\u00109\u001a\u0004\bE\u0010;R\u001e\u0010I\u001a\n\u0012\u0004\u0012\u00020=\u0018\u00010G8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010HR\u001e\u0010K\u001a\n\u0012\u0004\u0012\u00020J\u0018\u00010G8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010HR\u001f\u0010N\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010L068\u0006¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\bM\u0010;\u0002\u0004\n\u0002\b\u0019¨\u0006U"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/CustomContractTokenViewModel;", "Lwj;", "Lnet/safemoon/androidwallet/common/TokenType;", "l", "x", "", "contractAddress", "Lr37;", "p", "o", "contractName", "contractSymbol", "contractDecimal", "Lkotlin/Function1;", "Lnet/safemoon/androidwallet/viewmodels/CustomContractTokenViewModel$SaveReturnCode;", "callBack", "C", "symbolWithType", "n", "k", "Lnet/safemoon/androidwallet/model/transaction/history/Result;", "r", "m", "tokenType", "q", "", "B", "(Ljava/lang/String;Lns0;)Ljava/lang/Object;", "Lkotlin/Function0;", "b", "Lpc2;", "showWrongERCAddressPopUp", "c", "showWrongBepAddressPopUp", "d", "showWrongPolygonAddressPopUp", "e", "showWrongAvalancheAddressPopUp", "Lxy0;", "f", "Lef3;", "s", "()Lxy0;", "customTokenDataSource", "Lip2;", "g", "u", "()Lip2;", "localUserTokenDataSource", "Lir6;", "h", "A", "()Lir6;", "tokenInfoDataSource", "Lk04;", "kotlin.jvm.PlatformType", "i", "Lk04;", "w", "()Lk04;", "selectedNetwork", "Lnet/safemoon/androidwallet/model/transaction/history/TransactionHistoryModel;", "j", "y", "tokenInfo", "Lnet/safemoon/androidwallet/model/cmcTokenInfo/TokenDetail;", "z", "tokenInfoCMC", "Landroid/graphics/Bitmap;", "t", "identicon", "Lk90;", "Lk90;", "callTokenInfo", "Lnet/safemoon/androidwallet/model/cmcTokenInfo/CmcTokenInfo;", "callCMCTokenInfo", "Lnet/safemoon/androidwallet/model/rpc2/CommonTokenInfo;", "v", "nonEvmTokenInfo", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;Lpc2;Lpc2;Lpc2;Lpc2;)V", "a", "SaveReturnCode", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: CustomContractTokenViewModel.kt */
public final class CustomContractTokenViewModel extends C3552wj {

    /* renamed from: p */
    public static final C8665a f42685p = new C8665a((DefaultConstructorMarker) null);

    /* renamed from: b */
    public final pc2<r37> f42686b;

    /* renamed from: c */
    public final pc2<r37> f42687c;

    /* renamed from: d */
    public final pc2<r37> f42688d;

    /* renamed from: e */
    public final pc2<r37> f42689e;

    /* renamed from: f */
    public final ef3 f42690f = C6169a.m47232a(new CustomContractTokenViewModel$customTokenDataSource$2(this));

    /* renamed from: g */
    public final ef3 f42691g = C6169a.m47232a(new CustomContractTokenViewModel$localUserTokenDataSource$2(this));

    /* renamed from: h */
    public final ef3 f42692h = C6169a.m47232a(new CustomContractTokenViewModel$tokenInfoDataSource$2(this));

    /* renamed from: i */
    public final k04<TokenType> f42693i = new k04<>(mo61153l());

    /* renamed from: j */
    public final k04<TransactionHistoryModel> f42694j = new k04<>();

    /* renamed from: k */
    public final k04<TokenDetail> f42695k = new k04<>();

    /* renamed from: l */
    public final k04<Bitmap> f42696l = new k04<>();

    /* renamed from: m */
    public k90<TransactionHistoryModel> f42697m;

    /* renamed from: n */
    public k90<CmcTokenInfo> f42698n;

    /* renamed from: o */
    public final k04<CommonTokenInfo> f42699o = new k04<>(null);

    @Metadata(mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/CustomContractTokenViewModel$SaveReturnCode;", "", "(Ljava/lang/String;I)V", "ERROR", "SUCCESS", "PROGRESS", "BLACKLIST", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* compiled from: CustomContractTokenViewModel.kt */
    public enum SaveReturnCode {
        ERROR,
        SUCCESS,
        PROGRESS,
        BLACKLIST
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/CustomContractTokenViewModel$a;", "", "", "PRE_CUSTOM_CONTRACT", "Ljava/lang/String;", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.viewmodels.CustomContractTokenViewModel$a */
    /* compiled from: CustomContractTokenViewModel.kt */
    public static final class C8665a {
        public C8665a() {
        }

        public /* synthetic */ C8665a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J$\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0016J\u001e\u0010\u000b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\f"}, mo44877d2 = {"net/safemoon/androidwallet/viewmodels/CustomContractTokenViewModel$b", "Lp90;", "Lnet/safemoon/androidwallet/model/cmcTokenInfo/CmcTokenInfo;", "Lk90;", "call", "Lbg5;", "response", "Lr37;", "b", "", "t", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.viewmodels.CustomContractTokenViewModel$b */
    /* compiled from: CustomContractTokenViewModel.kt */
    public static final class C8666b implements p90<CmcTokenInfo> {

        /* renamed from: a */
        public final /* synthetic */ CustomContractTokenViewModel f42701a;

        /* renamed from: b */
        public final /* synthetic */ String f42702b;

        public C8666b(CustomContractTokenViewModel customContractTokenViewModel, String str) {
            this.f42701a = customContractTokenViewModel;
            this.f42702b = str;
        }

        /* renamed from: a */
        public void mo47103a(k90<CmcTokenInfo> k90, Throwable th) {
            vx2.m53591g(k90, "call");
            vx2.m53591g(th, "t");
            String message = th.getMessage();
            StringBuilder sb = new StringBuilder();
            sb.append("onFailure: ");
            sb.append(message);
        }

        /* renamed from: b */
        public void mo47104b(k90<CmcTokenInfo> k90, bg5<CmcTokenInfo> bg5) {
            vx2.m53591g(k90, "call");
            vx2.m53591g(bg5, "response");
            if (bg5.mo50581e()) {
                CmcTokenInfo a = bg5.mo50578a();
                if (a != null) {
                    CustomContractTokenViewModel customContractTokenViewModel = this.f42701a;
                    String str = this.f42702b;
                    try {
                        customContractTokenViewModel.mo61167z().postValue(a.getTokenDetails().get(0));
                        customContractTokenViewModel.mo61161t().postValue(null);
                    } catch (Exception unused) {
                        customContractTokenViewModel.mo61156o(str);
                    }
                }
            } else {
                this.f42701a.mo61156o(this.f42702b);
            }
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J$\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0016J\u001e\u0010\u000b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\f"}, mo44877d2 = {"net/safemoon/androidwallet/viewmodels/CustomContractTokenViewModel$c", "Lp90;", "Lnet/safemoon/androidwallet/model/transaction/history/TransactionHistoryModel;", "Lk90;", "call", "Lbg5;", "response", "Lr37;", "b", "", "t", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.viewmodels.CustomContractTokenViewModel$c */
    /* compiled from: CustomContractTokenViewModel.kt */
    public static final class C8667c implements p90<TransactionHistoryModel> {

        /* renamed from: a */
        public final /* synthetic */ CustomContractTokenViewModel f42703a;

        @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
        /* renamed from: net.safemoon.androidwallet.viewmodels.CustomContractTokenViewModel$c$a */
        /* compiled from: CustomContractTokenViewModel.kt */
        public /* synthetic */ class C8668a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f42704a;

            /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
            static {
                /*
                    net.safemoon.androidwallet.common.TokenType[] r0 = net.safemoon.androidwallet.common.TokenType.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    net.safemoon.androidwallet.common.TokenType r1 = net.safemoon.androidwallet.common.TokenType.BEP_20     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    net.safemoon.androidwallet.common.TokenType r1 = net.safemoon.androidwallet.common.TokenType.ERC_20     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    net.safemoon.androidwallet.common.TokenType r1 = net.safemoon.androidwallet.common.TokenType.POLYGON     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    net.safemoon.androidwallet.common.TokenType r1 = net.safemoon.androidwallet.common.TokenType.AVALANCHE_C     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    f42704a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.CustomContractTokenViewModel.C8667c.C8668a.<clinit>():void");
            }
        }

        public C8667c(CustomContractTokenViewModel customContractTokenViewModel) {
            this.f42703a = customContractTokenViewModel;
        }

        /* renamed from: a */
        public void mo47103a(k90<TransactionHistoryModel> k90, Throwable th) {
            vx2.m53591g(k90, "call");
            vx2.m53591g(th, "t");
            String message = th.getMessage();
            StringBuilder sb = new StringBuilder();
            sb.append("onFailure: ");
            sb.append(message);
        }

        /* renamed from: b */
        public void mo47104b(k90<TransactionHistoryModel> k90, bg5<TransactionHistoryModel> bg5) {
            int i;
            vx2.m53591g(k90, "call");
            vx2.m53591g(bg5, "response");
            TransactionHistoryModel a = bg5.mo50578a();
            if (a != null) {
                CustomContractTokenViewModel customContractTokenViewModel = this.f42703a;
                ArrayList<Result> arrayList = a.result;
                if (arrayList == null || arrayList.size() <= 0) {
                    customContractTokenViewModel.mo61166y().postValue(null);
                    TokenType value = customContractTokenViewModel.mo61164w().getValue();
                    if (value == null) {
                        i = -1;
                    } else {
                        i = C8668a.f42704a[value.ordinal()];
                    }
                    if (i == 1) {
                        customContractTokenViewModel.f42687c.invoke();
                    } else if (i == 2) {
                        customContractTokenViewModel.f42686b.invoke();
                    } else if (i == 3) {
                        customContractTokenViewModel.f42688d.invoke();
                    } else if (i == 4) {
                        customContractTokenViewModel.f42689e.invoke();
                    }
                } else {
                    customContractTokenViewModel.mo61166y().postValue(a);
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomContractTokenViewModel(Application application, pc2<r37> pc2, pc2<r37> pc22, pc2<r37> pc23, pc2<r37> pc24) {
        super(application);
        vx2.m53591g(application, "application");
        vx2.m53591g(pc2, "showWrongERCAddressPopUp");
        vx2.m53591g(pc22, "showWrongBepAddressPopUp");
        vx2.m53591g(pc23, "showWrongPolygonAddressPopUp");
        vx2.m53591g(pc24, "showWrongAvalancheAddressPopUp");
        this.f42686b = pc2;
        this.f42687c = pc22;
        this.f42688d = pc23;
        this.f42689e = pc24;
    }

    /* renamed from: A */
    public final ir6 mo61149A() {
        return (ir6) this.f42692h.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005e A[Catch:{ Exception -> 0x009b }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0065 A[Catch:{ Exception -> 0x009b }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007d A[Catch:{ Exception -> 0x009b }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008d A[EDGE_INSN: B:44:0x008d->B:32:0x008d ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo61150B(java.lang.String r7, p000.ns0<? super java.lang.Boolean> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof net.safemoon.androidwallet.viewmodels.CustomContractTokenViewModel$isBlackListed$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            net.safemoon.androidwallet.viewmodels.CustomContractTokenViewModel$isBlackListed$1 r0 = (net.safemoon.androidwallet.viewmodels.CustomContractTokenViewModel$isBlackListed$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            net.safemoon.androidwallet.viewmodels.CustomContractTokenViewModel$isBlackListed$1 r0 = new net.safemoon.androidwallet.viewmodels.CustomContractTokenViewModel$isBlackListed$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r4) goto L_0x002e
            java.lang.Object r7 = r0.L$0
            java.lang.String r7 = (java.lang.String) r7
            p000.hg5.m45199b(r8)     // Catch:{ Exception -> 0x009b }
            goto L_0x0055
        L_0x002e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0036:
            p000.hg5.m45199b(r8)
            ho3 r8 = p000.C9384u3.m72571l()     // Catch:{ Exception -> 0x009b }
            net.safemoon.androidwallet.model.blackListTokens.Request r2 = new net.safemoon.androidwallet.model.blackListTokens.Request     // Catch:{ Exception -> 0x009b }
            java.util.List r5 = p000.bk0.m32598e(r7)     // Catch:{ Exception -> 0x009b }
            r2.<init>(r5)     // Catch:{ Exception -> 0x009b }
            k90 r8 = r8.mo52288q(r2)     // Catch:{ Exception -> 0x009b }
            r0.L$0 = r7     // Catch:{ Exception -> 0x009b }
            r0.label = r4     // Catch:{ Exception -> 0x009b }
            java.lang.Object r8 = retrofit2.KotlinExtensions.m71521c(r8, r0)     // Catch:{ Exception -> 0x009b }
            if (r8 != r1) goto L_0x0055
            return r1
        L_0x0055:
            bg5 r8 = (p000.bg5) r8     // Catch:{ Exception -> 0x009b }
            boolean r0 = r8.mo50581e()     // Catch:{ Exception -> 0x009b }
            r1 = 0
            if (r0 == 0) goto L_0x0065
            java.lang.Object r8 = r8.mo50578a()     // Catch:{ Exception -> 0x009b }
            net.safemoon.androidwallet.model.blackListTokens.BlackListTokens r8 = (net.safemoon.androidwallet.model.blackListTokens.BlackListTokens) r8     // Catch:{ Exception -> 0x009b }
            goto L_0x0069
        L_0x0065:
            r8.mo50580d()     // Catch:{ Exception -> 0x009b }
            r8 = r1
        L_0x0069:
            if (r8 == 0) goto L_0x008f
            java.util.List<net.safemoon.androidwallet.model.blackListTokens.BlackListTokens$Data> r8 = r8.data     // Catch:{ Exception -> 0x009b }
            if (r8 == 0) goto L_0x008f
            int r0 = r8.size()     // Catch:{ Exception -> 0x009b }
            java.util.ListIterator r8 = r8.listIterator(r0)     // Catch:{ Exception -> 0x009b }
        L_0x0077:
            boolean r0 = r8.hasPrevious()     // Catch:{ Exception -> 0x009b }
            if (r0 == 0) goto L_0x008d
            java.lang.Object r0 = r8.previous()     // Catch:{ Exception -> 0x009b }
            r2 = r0
            net.safemoon.androidwallet.model.blackListTokens.BlackListTokens$Data r2 = (net.safemoon.androidwallet.model.blackListTokens.BlackListTokens.Data) r2     // Catch:{ Exception -> 0x009b }
            java.lang.String r2 = r2.tokenContractAddress     // Catch:{ Exception -> 0x009b }
            boolean r2 = p000.vx2.m53586b(r2, r7)     // Catch:{ Exception -> 0x009b }
            if (r2 == 0) goto L_0x0077
            r1 = r0
        L_0x008d:
            net.safemoon.androidwallet.model.blackListTokens.BlackListTokens$Data r1 = (net.safemoon.androidwallet.model.blackListTokens.BlackListTokens.Data) r1     // Catch:{ Exception -> 0x009b }
        L_0x008f:
            if (r1 == 0) goto L_0x00a7
            java.lang.Boolean r7 = r1.isBlacklist     // Catch:{ Exception -> 0x009b }
            boolean r7 = r7.booleanValue()     // Catch:{ Exception -> 0x009b }
            if (r7 == 0) goto L_0x00a7
            r3 = r4
            goto L_0x00a7
        L_0x009b:
            r7 = move-exception
            java.lang.String r7 = r7.getMessage()
            if (r7 == 0) goto L_0x00a7
            java.lang.String r8 = "Err-BlackListed"
            p000.ol0.m70350b0(r7, r8)
        L_0x00a7:
            java.lang.Boolean r7 = p000.a40.m31670a(r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.CustomContractTokenViewModel.mo61150B(java.lang.String, ns0):java.lang.Object");
    }

    /* renamed from: C */
    public final void mo61151C(String str, String str2, String str3, String str4, rc2<? super SaveReturnCode, r37> rc2) {
        Integer num;
        vx2.m53591g(rc2, "callBack");
        if (str != null && str2 != null && str3 != null && str4 != null) {
            TokenType x = mo61165x();
            if (x != null) {
                num = Integer.valueOf(x.getChainId());
            } else {
                num = null;
            }
            if (num != null) {
                y23 unused = d50.m56748b(cd7.m11843a(this), (CoroutineContext) null, (CoroutineStart) null, new CustomContractTokenViewModel$save$1(this, str, rc2, str2, str3, str4, (ns0<? super CustomContractTokenViewModel$save$1>) null), 3, (Object) null);
            }
        }
    }

    /* renamed from: k */
    public final void mo61152k() {
        k90<CmcTokenInfo> k90 = this.f42698n;
        if (k90 != null) {
            k90.cancel();
        }
        k90<TransactionHistoryModel> k902 = this.f42697m;
        if (k902 != null) {
            k902.cancel();
        }
        this.f42694j.postValue(null);
        this.f42695k.postValue(null);
        this.f42696l.postValue(null);
    }

    /* renamed from: l */
    public final TokenType mo61153l() {
        Application b = mo27549b();
        vx2.m53590f(b, "getApplication<Application>()");
        return ol0.m70355e(b);
    }

    /* renamed from: m */
    public final void mo61154m(String str) {
        k90<CmcTokenInfo> k90;
        k90<CmcTokenInfo> k902 = this.f42698n;
        if (k902 != null) {
            k902.cancel();
        }
        p70 g = C9384u3.m72566g();
        if (g != null) {
            k90 = g.mo65252d(str);
        } else {
            k90 = null;
        }
        this.f42698n = k90;
        if (k90 != null) {
            k90.mo50512X(new C8666b(this, str));
        }
    }

    /* renamed from: n */
    public final void mo61155n(String str) {
        vx2.m53591g(str, "symbolWithType");
        y23 unused = d50.m56748b(ih2.f38385a, (CoroutineContext) null, (CoroutineStart) null, new CustomContractTokenViewModel$deleteSymbolWithType$1(this, str, (ns0<? super CustomContractTokenViewModel$deleteSymbolWithType$1>) null), 3, (Object) null);
    }

    /* renamed from: o */
    public final void mo61156o(String str) {
        vx2.m53591g(str, "contractAddress");
        y23 unused = d50.m56748b(cd7.m11843a(this), (CoroutineContext) null, (CoroutineStart) null, new CustomContractTokenViewModel$generateIdentiIcon$1(this, str, (ns0<? super CustomContractTokenViewModel$generateIdentiIcon$1>) null), 3, (Object) null);
    }

    /* renamed from: p */
    public final void mo61157p(String str) {
        vx2.m53591g(str, "contractAddress");
        TokenType x = mo61165x();
        if (x != null) {
            k90<TransactionHistoryModel> k90 = this.f42697m;
            if (k90 != null) {
                k90.cancel();
            }
            if (x.getCoinType().getSimilarTypeGroup() == SimilarTypeGroup.EVM_CAPABILITY) {
                k90<TransactionHistoryModel> o = ol0.m70377s(x).mo52393o(str, ol0.m70382x(x));
                this.f42697m = o;
                if (o != null) {
                    o.mo50512X(new C8667c(this));
                }
            } else {
                mo61158q(str, x);
            }
        }
        mo61154m(str);
    }

    /* renamed from: q */
    public final void mo61158q(String str, TokenType tokenType) {
        y23 unused = d50.m56748b(cd7.m11843a(this), qh1.m71265b(), (CoroutineStart) null, new CustomContractTokenViewModel$getContractInfoNonEvm$1(tokenType, str, this, (ns0<? super CustomContractTokenViewModel$getContractInfoNonEvm$1>) null), 2, (Object) null);
    }

    /* renamed from: r */
    public final Result mo61159r() {
        ArrayList<Result> arrayList;
        TransactionHistoryModel value = this.f42694j.getValue();
        if (value == null || (arrayList = value.result) == null) {
            return null;
        }
        return arrayList.get(0);
    }

    /* renamed from: s */
    public final xy0 mo61160s() {
        return (xy0) this.f42690f.getValue();
    }

    /* renamed from: t */
    public final k04<Bitmap> mo61161t() {
        return this.f42696l;
    }

    /* renamed from: u */
    public final ip2 mo61162u() {
        return (ip2) this.f42691g.getValue();
    }

    /* renamed from: v */
    public final k04<CommonTokenInfo> mo61163v() {
        return this.f42699o;
    }

    /* renamed from: w */
    public final k04<TokenType> mo61164w() {
        return this.f42693i;
    }

    /* renamed from: x */
    public final TokenType mo61165x() {
        return this.f42693i.getValue();
    }

    /* renamed from: y */
    public final k04<TransactionHistoryModel> mo61166y() {
        return this.f42694j;
    }

    /* renamed from: z */
    public final k04<TokenDetail> mo61167z() {
        return this.f42695k;
    }
}
