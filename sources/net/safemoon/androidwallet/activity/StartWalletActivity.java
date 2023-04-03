package net.safemoon.androidwallet.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.FragmentManager;
import com.AKT.anonymouskey.p008ui.login.AKTServerFunctions;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.C6169a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt__StringsKt;
import net.safemoon.androidwallet.MyApplicationClass;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.dialogs.ProgressLoading;
import net.safemoon.androidwallet.model.wallets.Wallet;
import net.safemoon.androidwallet.utils.Common;
import net.safemoon.androidwallet.viewmodels.AKTWebSocketHandlingViewModel;
import net.safemoon.androidwallet.viewmodels.MultiWalletViewModel;
import wallet.core.jni.CoinType;
import wallet.core.jni.HDWallet;
import wallet.core.jni.Mnemonic;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001[B\u0007¢\u0006\u0004\bY\u0010ZJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0002J\b\u0010\u000b\u001a\u00020\u0004H\u0002J\b\u0010\f\u001a\u00020\u0004H\u0002J\b\u0010\r\u001a\u00020\u0004H\u0002J\b\u0010\u000e\u001a\u00020\u0004H\u0002J\u001e\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0002J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0002H\u0002J\u0012\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u0011H\u0002J\b\u0010\u0018\u001a\u00020\u0004H\u0002J\u0012\u0010\u001b\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014J\b\u0010\u001c\u001a\u00020\u0004H\u0014J\b\u0010\u001d\u001a\u00020\u0004H\u0014J\u0012\u0010\u001f\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010 \u001a\u00020\u0004H\u0016J\u001a\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010$\u001a\u00020\u0004H\u0016J\b\u0010%\u001a\u00020\u0004H\u0016R\u001b\u0010+\u001a\u00020&8BX\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0016\u0010.\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00100\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b/\u0010-R\u0016\u00102\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b1\u0010-R\u0016\u00105\u001a\u0002038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b4\u00104R\u0016\u00107\u001a\u0002038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b6\u00104R\u0016\u0010;\u001a\u0002088\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u001b\u0010?\u001a\u00020\u00118BX\u0002¢\u0006\f\n\u0004\b<\u0010(\u001a\u0004\b=\u0010>R\u001b\u0010C\u001a\u00020\u00028BX\u0002¢\u0006\f\n\u0004\b@\u0010(\u001a\u0004\bA\u0010BR\u001b\u0010F\u001a\u00020\u00118BX\u0002¢\u0006\f\n\u0004\bD\u0010(\u001a\u0004\bE\u0010>R\u001b\u0010J\u001a\u00020G8BX\u0002¢\u0006\f\n\u0004\b$\u0010(\u001a\u0004\bH\u0010IR\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00020K8\u0002X\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010O\u001a\u0002038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b-\u00104R\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00020K8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010MR \u0010T\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020Q8\u0002X\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0018\u0010X\u001a\u0004\u0018\u00010U8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bV\u0010W¨\u0006\\"}, mo44877d2 = {"Lnet/safemoon/androidwallet/activity/StartWalletActivity;", "Lcom/AKT/anonymouskey/ui/login/AKTServerFunctions;", "", "mnemonic", "Lr37;", "h1", "k1", "j1", "R0", "blob", "S0", "l1", "N0", "a1", "b1", "message", "Lkotlin/Pair;", "", "O0", "c1", "walletStr", "M0", "updateWalletInfo", "T0", "W0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onResume", "onPause", "toSend", "i1", "d1", "Low7;", "safeMoonppp", "e0", "X", "onBackPressed", "Lnet/safemoon/androidwallet/viewmodels/AKTWebSocketHandlingViewModel;", "A", "Lef3;", "Z0", "()Lnet/safemoon/androidwallet/viewmodels/AKTWebSocketHandlingViewModel;", "webSocketModel", "B", "Z", "isOnResume", "C", "isGoToHome", "H", "isExistingUpgradeWallets", "", "I", "tryingGetBlobCount", "L", "tryingPutBlobCount", "Lnet/safemoon/androidwallet/utils/Common$RequestSocketState;", "M", "Lnet/safemoon/androidwallet/utils/Common$RequestSocketState;", "socketState", "P", "g1", "()Z", "isRegister", "Q", "Y0", "()Ljava/lang/String;", "masterMnemonic", "U", "f1", "isImportNewWalletOnRegister", "Lab;", "V0", "()Lab;", "binding", "", "Y", "Ljava/util/List;", "listWalletStr", "importedCount", "listBlobAddress", "", "k0", "Ljava/util/Map;", "mapBlobAddressName", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "v0", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "currentActiveWallet", "<init>", "()V", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: StartWalletActivity.kt */
public final class StartWalletActivity extends AKTServerFunctions {

    /* renamed from: b1 */
    public static final C8198a f41482b1 = new C8198a((DefaultConstructorMarker) null);

    /* renamed from: A */
    public final ef3 f41483A = new dd7(ua5.m52727b(AKTWebSocketHandlingViewModel.class), new StartWalletActivity$special$$inlined$viewModels$default$2(this), new StartWalletActivity$special$$inlined$viewModels$default$1(this), new StartWalletActivity$special$$inlined$viewModels$default$3((pc2) null, this));

    /* renamed from: B */
    public boolean f41484B;

    /* renamed from: C */
    public boolean f41485C;

    /* renamed from: H */
    public boolean f41486H;

    /* renamed from: I */
    public int f41487I = 2;

    /* renamed from: L */
    public int f41488L = 2;

    /* renamed from: M */
    public Common.RequestSocketState f41489M = Common.RequestSocketState.NONE;

    /* renamed from: P */
    public final ef3 f41490P = C6169a.m47232a(new StartWalletActivity$isRegister$2(this));

    /* renamed from: Q */
    public final ef3 f41491Q = C6169a.m47232a(new StartWalletActivity$masterMnemonic$2(this));

    /* renamed from: U */
    public final ef3 f41492U = C6169a.m47232a(new StartWalletActivity$isImportNewWalletOnRegister$2(this));

    /* renamed from: X */
    public final ef3 f41493X = C6169a.m47232a(new StartWalletActivity$binding$2(this));

    /* renamed from: Y */
    public final List<String> f41494Y = new ArrayList();

    /* renamed from: Z */
    public int f41495Z;

    /* renamed from: e0 */
    public final List<String> f41496e0 = new ArrayList();

    /* renamed from: k0 */
    public final Map<String, String> f41497k0 = new LinkedHashMap();

    /* renamed from: v0 */
    public Wallet f41498v0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0004R\u0014\u0010\u000b\u001a\u00020\u00068\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00068\u0002XT¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00068\u0002XT¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u0011"}, mo44877d2 = {"Lnet/safemoon/androidwallet/activity/StartWalletActivity$a;", "", "Landroid/content/Context;", "context", "", "isRegister", "", "masterMnemonic", "isImportNewWalletOnRegister", "Lr37;", "a", "KEY_IS_IMPORT_NEW_WALLET", "Ljava/lang/String;", "KEY_MASTER_MNEMONIC", "KEY_START_WHEN_REGISTER", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.activity.StartWalletActivity$a */
    /* compiled from: StartWalletActivity.kt */
    public static final class C8198a {
        public C8198a() {
        }

        public /* synthetic */ C8198a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ void m65518b(C8198a aVar, Context context, boolean z, String str, boolean z2, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            if ((i & 8) != 0) {
                z2 = false;
            }
            aVar.mo56907a(context, z, str, z2);
        }

        /* renamed from: a */
        public final void mo56907a(Context context, boolean z, String str, boolean z2) {
            vx2.m53591g(context, "context");
            vx2.m53591g(str, "masterMnemonic");
            Intent intent = new Intent(context, StartWalletActivity.class);
            intent.putExtra("KEY_START_WHEN_REGISTER", z);
            intent.putExtra("KEY_MASTER_MNEMONIC", str);
            intent.putExtra("KEY_IS_IMPORT_NEW_WALLET", z2);
            context.startActivity(intent);
        }
    }

    /* renamed from: P0 */
    public static final void m65477P0(StartWalletActivity startWalletActivity) {
        vx2.m53591g(startWalletActivity, "this$0");
        startWalletActivity.mo56893W0();
    }

    /* renamed from: Q0 */
    public static final void m65478Q0(StartWalletActivity startWalletActivity) {
        vx2.m53591g(startWalletActivity, "this$0");
        startWalletActivity.mo56889R0();
    }

    /* renamed from: U0 */
    public static /* synthetic */ void m65479U0(StartWalletActivity startWalletActivity, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        startWalletActivity.mo56891T0(z);
    }

    /* renamed from: X0 */
    public static final void m65480X0(StartWalletActivity startWalletActivity) {
        vx2.m53591g(startWalletActivity, "this$0");
        String a0 = AKTServerFunctions.m12038a0(startWalletActivity);
        startWalletActivity.f41489M = Common.RequestSocketState.GET_BLOB;
        startWalletActivity.mo56903i1(a0);
    }

    /* renamed from: e1 */
    public static final void m65481e1(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: M0 */
    public final void mo56886M0(String str) {
        String str2;
        boolean z;
        boolean z2;
        String I;
        List B0 = StringsKt__StringsKt.m63061B0(str, new String[]{","}, false, 0, 6, (Object) null);
        if (B0.size() >= 3) {
            String e = C9377u.m72500e(this, (String) B0.get(2));
            if (e == null || (I = yb6.m74332I(e, "|", " ", false, 4, (Object) null)) == null) {
                str2 = null;
            } else {
                str2 = StringsKt__StringsKt.m63090V0(I).toString();
            }
            if (str2 != null) {
                if (str2.length() > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    z = true;
                    if (z && Mnemonic.isValid(str2)) {
                        HDWallet hDWallet = new HDWallet(str2, "");
                        CoinType coinType = CoinType.ETHEREUM;
                        String addressForCoin = hDWallet.getAddressForCoin(coinType);
                        byte[] data = hDWallet.getKeyForCoin(coinType).data();
                        vx2.m53590f(data, "secretPrivateKey.data()");
                        String e0 = ol0.m70356e0(data, false);
                        List<String> list = this.f41496e0;
                        vx2.m53590f(addressForCoin, "addressEth");
                        list.add(addressForCoin);
                        this.f41497k0.put(addressForCoin, B0.get(0));
                        MultiWalletViewModel multiWalletViewModel = this.f8530x;
                        vx2.m53590f(multiWalletViewModel, "walletViewModel");
                        vx2.m53590f(e, "mnemonic");
                        MultiWalletViewModel.m68673p(multiWalletViewModel, e0, addressForCoin, e, (String) B0.get(0), false, false, new StartWalletActivity$addWalletToDatabase$1(this), 32, (Object) null);
                        return;
                    }
                }
            }
            z = false;
            HDWallet hDWallet2 = new HDWallet(str2, "");
            CoinType coinType2 = CoinType.ETHEREUM;
            String addressForCoin2 = hDWallet2.getAddressForCoin(coinType2);
            byte[] data2 = hDWallet2.getKeyForCoin(coinType2).data();
            vx2.m53590f(data2, "secretPrivateKey.data()");
            String e02 = ol0.m70356e0(data2, false);
            List<String> list2 = this.f41496e0;
            vx2.m53590f(addressForCoin2, "addressEth");
            list2.add(addressForCoin2);
            this.f41497k0.put(addressForCoin2, B0.get(0));
            MultiWalletViewModel multiWalletViewModel2 = this.f8530x;
            vx2.m53590f(multiWalletViewModel2, "walletViewModel");
            vx2.m53590f(e, "mnemonic");
            MultiWalletViewModel.m68673p(multiWalletViewModel2, e02, addressForCoin2, e, (String) B0.get(0), false, false, new StartWalletActivity$addWalletToDatabase$1(this), 32, (Object) null);
            return;
        }
        if (B0.size() >= 2) {
            String str3 = (String) B0.get(1);
            cw0 create = cw0.create(str3);
            List<String> list3 = this.f41496e0;
            String address = create.getAddress();
            vx2.m53590f(address, "credential.address");
            list3.add(address);
            Map<String, String> map = this.f41497k0;
            String address2 = create.getAddress();
            vx2.m53590f(address2, "credential.address");
            map.put(address2, B0.get(0));
            MultiWalletViewModel multiWalletViewModel3 = this.f8530x;
            vx2.m53590f(multiWalletViewModel3, "walletViewModel");
            String address3 = create.getAddress();
            vx2.m53590f(address3, "credential.address");
            MultiWalletViewModel.m68673p(multiWalletViewModel3, str3, address3, "", (String) B0.get(0), false, false, new StartWalletActivity$addWalletToDatabase$2(this), 32, (Object) null);
            return;
        }
        int i = this.f41495Z + 1;
        this.f41495Z = i;
        if (i >= this.f41494Y.size()) {
            mo56889R0();
        } else {
            mo56886M0(this.f41494Y.get(this.f41495Z));
        }
    }

    /* renamed from: N0 */
    public final void mo56887N0() {
        this.f8530x.mo61256r(new StartWalletActivity$checkActiveWalletBeforeGoHome$1(this));
    }

    /* renamed from: O0 */
    public final Pair<Boolean, Boolean> mo56888O0(String str) {
        String str2;
        int i;
        int i2;
        if (str != null) {
            str2 = str.toUpperCase(Locale.ROOT);
            vx2.m53590f(str2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        } else {
            str2 = null;
        }
        boolean b = vx2.m53586b(str2, "CONNECTION_REFUSED");
        if (b && this.f41489M == Common.RequestSocketState.GET_BLOB && (i2 = this.f41487I) > 0) {
            this.f41487I = i2 - 1;
            mo12159X();
            new Handler(Looper.getMainLooper()).postDelayed(new l86(this), 300);
            return new Pair<>(Boolean.TRUE, Boolean.FALSE);
        } else if (b && this.f41489M == Common.RequestSocketState.PUT_BLOB && (i = this.f41488L) > 0) {
            this.f41488L = i - 1;
            mo12159X();
            new Handler(Looper.getMainLooper()).postDelayed(new m86(this), 300);
            return new Pair<>(Boolean.TRUE, Boolean.FALSE);
        } else if (b) {
            this.f41489M = Common.RequestSocketState.NONE;
            ProgressLoading progressLoading = this.f8528r;
            if (progressLoading != null) {
                progressLoading.mo22266k();
            }
            mo57001Q(true);
            mo12159X();
            Boolean bool = Boolean.TRUE;
            return new Pair<>(bool, bool);
        } else {
            Boolean bool2 = Boolean.FALSE;
            return new Pair<>(bool2, bool2);
        }
    }

    /* renamed from: R0 */
    public final void mo56889R0() {
        if (this.f41486H || mo56901g1()) {
            this.f8530x.mo61256r(new StartWalletActivity$checkSyncAllWalletsByDefault$1(this, new StringBuilder()));
            return;
        }
        m65479U0(this, false, 1, (Object) null);
    }

    /* renamed from: S0 */
    public final String mo56890S0(String str) {
        String i = f06.m57518i(this, "U5");
        String g0 = AKTServerFunctions.m12039g0(this, i + ">" + str);
        vx2.m53590f(g0, "putBlob(this, newBlob)");
        return g0;
    }

    /* renamed from: T0 */
    public final void mo56891T0(boolean z) {
        this.f8530x.mo61256r(new StartWalletActivity$finishHandleBlob$1(ol0.m70351c(this), this, z));
    }

    /* renamed from: V0 */
    public final C3805ab mo56892V0() {
        return (C3805ab) this.f41493X.getValue();
    }

    /* renamed from: W0 */
    public final void mo56893W0() {
        new Handler(Looper.getMainLooper()).post(new k86(this));
    }

    /* renamed from: X */
    public void mo12159X() {
        mo56895Z0().mo60951g();
    }

    /* renamed from: Y0 */
    public final String mo56894Y0() {
        return (String) this.f41491Q.getValue();
    }

    /* renamed from: Z0 */
    public final AKTWebSocketHandlingViewModel mo56895Z0() {
        return (AKTWebSocketHandlingViewModel) this.f41483A.getValue();
    }

    /* renamed from: a1 */
    public final void mo56896a1() {
        if (this.f41484B) {
            ProgressLoading progressLoading = this.f8528r;
            if (progressLoading != null) {
                progressLoading.mo22266k();
            }
            if (mo56900f1()) {
                mo56897b1();
            } else {
                MyApplicationClass.m64669c().f41193y = true;
                AKTHomeActivity.m64858g1(this);
                finish();
            }
        }
        this.f41485C = true;
    }

    /* renamed from: b1 */
    public final void mo56897b1() {
        startActivity(new Intent(this, AKTImportWalletOptionActivity.class));
        finish();
    }

    /* renamed from: c1 */
    public final void mo56898c1(String str) {
        this.f41494Y.addAll(StringsKt__StringsKt.m63061B0(str, new String[]{"|"}, false, 0, 6, (Object) null));
        this.f41495Z = 0;
        this.f41498v0 = ol0.m70351c(this);
        if (!this.f41494Y.isEmpty()) {
            mo56886M0(this.f41494Y.get(this.f41495Z));
        } else {
            mo56889R0();
        }
    }

    /* renamed from: d1 */
    public void mo56899d1() {
        mo56895Z0().mo60953i().observe(this, new j86(new StartWalletActivity$initReceiveResponse$1(this)));
    }

    /* renamed from: e0 */
    public void mo12164e0(ow7 ow7, String str) {
        boolean z;
        String str2 = str;
        vx2.m53591g(ow7, "safeMoonppp");
        Pair<Boolean, Boolean> O0 = mo56888O0(str2);
        if (!O0.getFirst().booleanValue()) {
            this.f41489M = Common.RequestSocketState.NONE;
            String[] w = C2127d2.m14658w(Common.f42577a.mo60918y(this, str2), "|");
            vx2.m53590f(w, "parts");
            if (w.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                String str3 = w[0];
                vx2.m53590f(str3, "parts[0]");
                if (StringsKt__StringsKt.m63061B0(str3, new String[]{"="}, false, 0, 6, (Object) null).size() >= 2) {
                    String str4 = w[0];
                    vx2.m53590f(str4, "parts[0]");
                    String upperCase = ((String) StringsKt__StringsKt.m63061B0(str4, new String[]{"="}, false, 0, 6, (Object) null).get(1)).toUpperCase(Locale.ROOT);
                    vx2.m53590f(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    mo12159X();
                    int hashCode = upperCase.hashCode();
                    if (hashCode != -1549417970) {
                        if (hashCode != -282391275) {
                            if (hashCode == 325952731 && upperCase.equals("AKTSERVERERROR")) {
                                m65479U0(this, false, 1, (Object) null);
                                return;
                            }
                        } else if (upperCase.equals("GETBLOB02")) {
                            mo12159X();
                            this.f41494Y.clear();
                            this.f41496e0.clear();
                            this.f41497k0.clear();
                            if (w.length > 2) {
                                String str5 = w[1];
                                vx2.m53590f(str5, "u5EncryptBlob");
                                if (!StringsKt__StringsKt.m63081R(str5, "BLOB=", false, 2, (Object) null) || !StringsKt__StringsKt.m63081R(str5, ">", false, 2, (Object) null)) {
                                    mo56889R0();
                                    return;
                                }
                                String a = C9377u.m72496a(this, ((String[]) StringsKt__StringsKt.m63061B0(str5, new String[]{">"}, false, 0, 6, (Object) null).toArray(new String[0]))[1]);
                                vx2.m53590f(a, "decryptedBlob");
                                mo56898c1(a);
                                return;
                            }
                            m65479U0(this, false, 1, (Object) null);
                            return;
                        }
                    } else if (upperCase.equals("PUTBLOB02")) {
                        this.f8530x.mo61256r(new StartWalletActivity$parseMessage$1(this));
                        return;
                    }
                    super.mo12164e0(ow7, str);
                }
            }
        } else if (O0.getSecond().booleanValue()) {
            mo56887N0();
        }
    }

    /* renamed from: f1 */
    public final boolean mo56900f1() {
        return ((Boolean) this.f41492U.getValue()).booleanValue();
    }

    /* renamed from: g1 */
    public final boolean mo56901g1() {
        return ((Boolean) this.f41490P.getValue()).booleanValue();
    }

    /* renamed from: h1 */
    public final void mo56902h1(String str) {
        boolean z;
        String Y0 = mo56894Y0();
        vx2.m53590f(Y0, "masterMnemonic");
        if (Y0.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            mo56906l1();
            return;
        }
        HDWallet hDWallet = new HDWallet(StringsKt__StringsKt.m63090V0(yb6.m74332I(str, "|", " ", false, 4, (Object) null)).toString(), "");
        CoinType coinType = CoinType.ETHEREUM;
        String addressForCoin = hDWallet.getAddressForCoin(coinType);
        byte[] data = hDWallet.getKeyForCoin(coinType).data();
        vx2.m53590f(data, "secretPrivateKey.data()");
        String e0 = ol0.m70356e0(data, false);
        MultiWalletViewModel multiWalletViewModel = this.f8530x;
        vx2.m53590f(addressForCoin, "addressEth");
        multiWalletViewModel.mo61254o(e0, addressForCoin, str, "Primary Wallet", false, true, new StartWalletActivity$proceedMasterWallet$1(this));
    }

    /* renamed from: i1 */
    public void mo56903i1(String str) {
        if (str != null) {
            mo56895Z0().mo60956l(str);
        }
    }

    /* renamed from: j1 */
    public final void mo56904j1() {
        this.f8530x.mo61256r(new StartWalletActivity$updateImportedWalletAfterLogin$1(this));
    }

    /* renamed from: k1 */
    public final void mo56905k1() {
        f06.m57524o(this, "DEFAULT_GATEWAY", TokenType.BEP_20.getName());
        if (ol0.m70351c(this) == null) {
            mo56887N0();
        } else {
            this.f8530x.mo61256r(new StartWalletActivity$updateImportedWalletAfterRegister$1(this));
        }
    }

    /* renamed from: l1 */
    public final void mo56906l1() {
        boolean z;
        String j = f06.m57519j(this, "DEFAULT_GATEWAY", "");
        vx2.m53590f(j, "getString(this, SharedPrefs.DEFAULT_GATEWAY, \"\")");
        if (j.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f06.m57524o(this, "DEFAULT_GATEWAY", TokenType.BEP_20.getName());
        }
        mo56893W0();
    }

    public void onBackPressed() {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((View) mo56892V0().mo28905b());
        mo56895Z0().mo60957m();
        mo56899d1();
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo959l();
        }
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(zr0.m31440c(this, 17170445));
        getWindow().setBackgroundDrawable(new ColorDrawable(getColor(R.color.akt_night_background)));
        ProgressLoading.C8308a aVar = ProgressLoading.f41785Y;
        String string = getString(R.string.loading);
        vx2.m53590f(string, "getString(R.string.loading)");
        ProgressLoading a = aVar.mo57297a(false, string, "");
        this.f8528r = a;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        vx2.m53590f(supportFragmentManager, "supportFragmentManager");
        a.mo57295D(supportFragmentManager);
        this.f8530x.mo61256r(new StartWalletActivity$onCreate$1(this));
        if (f06.m57512c(this, "TEMPKA")) {
            f06.m57520k(this, "TEMPKA");
        }
    }

    public void onPause() {
        this.f41484B = false;
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.f41484B = true;
        if (this.f41485C) {
            mo56896a1();
        }
    }
}
