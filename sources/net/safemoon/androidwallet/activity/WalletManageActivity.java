package net.safemoon.androidwallet.activity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import com.AKT.anonymouskey.p008ui.login.AKTServerFunctions;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import kotlin.C6169a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt__StringsKt;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.common.MyCoinType;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.dialogs.G2FAVerfication;
import net.safemoon.androidwallet.dialogs.ProgressLoading;
import net.safemoon.androidwallet.model.wallets.Wallet;
import net.safemoon.androidwallet.utils.Common;
import net.safemoon.androidwallet.viewmodels.AKTWebSocketHandlingViewModel;
import p000.wo2;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 ]2\u00020\u0001:\u0001~B\u0007¢\u0006\u0004\b|\u0010}J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\u000f\u001a\u00020\u0004H\u0002J\b\u0010\u0010\u001a\u00020\u0004H\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\b\u0010\u0013\u001a\u00020\rH\u0002J\b\u0010\u0014\u001a\u00020\u0004H\u0002J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0002H\u0002J\b\u0010\u0018\u001a\u00020\u0011H\u0002J\b\u0010\u0019\u001a\u00020\u0011H\u0002J\b\u0010\u001a\u001a\u00020\u0011H\u0002J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0002J\b\u0010\u001e\u001a\u00020\u0004H\u0002J\u0010\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0002J\b\u0010 \u001a\u00020\u0004H\u0002J\u0010\u0010!\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\"\u001a\u00020\u0004H\u0002J\b\u0010#\u001a\u00020\u0004H\u0002J\b\u0010$\u001a\u00020\u0004H\u0002J\u0010\u0010&\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\bH\u0002J\u0010\u0010(\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u0002H\u0002J\b\u0010)\u001a\u00020\u0004H\u0002J\b\u0010*\u001a\u00020\u0004H\u0002J\u0010\u0010,\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0002H\u0002J\u0012\u0010/\u001a\u00020\u00042\b\u0010.\u001a\u0004\u0018\u00010-H\u0014J\u0012\u00100\u001a\u00020\u00042\b\u0010.\u001a\u0004\u0018\u00010-H\u0014J\b\u00101\u001a\u00020\u0004H\u0014J\u0012\u00103\u001a\u00020\u00042\b\u00102\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u00104\u001a\u00020\u0004H\u0016J\b\u00105\u001a\u00020\u0004H\u0016J\u001a\u00109\u001a\u00020\u00042\u0006\u00107\u001a\u0002062\b\u00108\u001a\u0004\u0018\u00010\u0002H\u0016R\u001a\u0010>\u001a\u00020\u00028\u0006XD¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001a\u0010A\u001a\u00020\u00028\u0006XD¢\u0006\f\n\u0004\b?\u0010;\u001a\u0004\b@\u0010=R\u001a\u0010D\u001a\u00020\u00028\u0006XD¢\u0006\f\n\u0004\bB\u0010;\u001a\u0004\bC\u0010=R\u001a\u0010G\u001a\u00020\u00028\u0006XD¢\u0006\f\n\u0004\bE\u0010;\u001a\u0004\bF\u0010=R\u001a\u0010J\u001a\u00020\u00028\u0006XD¢\u0006\f\n\u0004\bH\u0010;\u001a\u0004\bI\u0010=R\u001a\u0010M\u001a\u00020\u00028\u0006XD¢\u0006\f\n\u0004\bK\u0010;\u001a\u0004\bL\u0010=R\u001a\u0010P\u001a\u00020\u00028\u0006XD¢\u0006\f\n\u0004\bN\u0010;\u001a\u0004\bO\u0010=R\u001a\u0010S\u001a\u00020\u00028\u0006XD¢\u0006\f\n\u0004\bQ\u0010;\u001a\u0004\bR\u0010=R\u001a\u0010V\u001a\u00020\u00028\u0006XD¢\u0006\f\n\u0004\bT\u0010;\u001a\u0004\bU\u0010=R\u001b\u0010[\u001a\u00020\u001b8BX\u0002¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR\u001b\u0010_\u001a\u00020\\8BX\u0002¢\u0006\f\n\u0004\b5\u0010X\u001a\u0004\b]\u0010^R\u001d\u0010\t\u001a\u0004\u0018\u00010\b8BX\u0002¢\u0006\f\n\u0004\b`\u0010X\u001a\u0004\ba\u0010bR\u001b\u0010g\u001a\u00020c8BX\u0002¢\u0006\f\n\u0004\bd\u0010X\u001a\u0004\be\u0010fR\"\u0010l\u001a\u0010\u0012\f\u0012\n j*\u0004\u0018\u00010i0i0h8\u0002X\u0004¢\u0006\u0006\n\u0004\b9\u0010kR\u0016\u0010n\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bm\u0010HR\u001b\u0010s\u001a\u00020o8BX\u0002¢\u0006\f\n\u0004\bp\u0010X\u001a\u0004\bq\u0010rR\u0016\u0010u\u001a\u00020\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bt\u0010dR\u0016\u0010w\u001a\u00020\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bv\u0010dR\u0016\u0010x\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010HR\u0014\u0010{\u001a\u00020y8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010z¨\u0006"}, mo44877d2 = {"Lnet/safemoon/androidwallet/activity/WalletManageActivity;", "Lcom/AKT/anonymouskey/ui/login/AKTServerFunctions;", "", "name", "Lr37;", "o2", "U1", "n2", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "wallet", "k1", "", "checkType", "Lnet/safemoon/androidwallet/dialogs/G2FAVerfication$b;", "o1", "j1", "k2", "Lwo2$a;", "m1", "p1", "W1", "p2", "copyText", "z1", "s1", "r1", "l2", "", "isVisible", "e2", "d2", "h2", "g2", "a2", "V1", "i1", "m2", "selected", "y1", "blob", "l1", "X1", "Y1", "link", "T1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onPostCreate", "onResume", "toSend", "Z1", "v1", "X", "Low7;", "safeMoonppp", "message", "e0", "A", "Ljava/lang/String;", "getTAG_ON", "()Ljava/lang/String;", "TAG_ON", "B", "getTAG_OFF", "TAG_OFF", "C", "getBSCSCAN_LINK", "BSCSCAN_LINK", "H", "getETHERSCAN_LINK", "ETHERSCAN_LINK", "I", "getMATICSCAN_LINK", "MATICSCAN_LINK", "L", "getAVAXSCAN_LINK", "AVAXSCAN_LINK", "M", "getSOLSCAN_LINK", "SOLSCAN_LINK", "P", "getBTC_SCAN_LINK", "BTC_SCAN_LINK", "Q", "getDOGE_SCAN_LINK", "DOGE_SCAN_LINK", "U", "Lef3;", "x1", "()Z", "isBioAuth", "Landroid/content/ClipboardManager;", "q1", "()Landroid/content/ClipboardManager;", "manager", "Y", "t1", "()Lnet/safemoon/androidwallet/model/wallets/Wallet;", "Ldb;", "Z", "n1", "()Ldb;", "binding", "Lwa;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "Lwa;", "startActivityIntent", "k0", "currentCheckType", "Lnet/safemoon/androidwallet/viewmodels/AKTWebSocketHandlingViewModel;", "v0", "u1", "()Lnet/safemoon/androidwallet/viewmodels/AKTWebSocketHandlingViewModel;", "webSocketModel", "b1", "isDeletedWallet", "e1", "isUpdateWalletName", "walletsCount", "Ly12;", "Ly12;", "requestBiometricAuthUseCase", "<init>", "()V", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: WalletManageActivity.kt */
public final class WalletManageActivity extends AKTServerFunctions {

    /* renamed from: q1 */
    public static final C8206a f41504q1 = new C8206a((DefaultConstructorMarker) null);

    /* renamed from: A */
    public final String f41505A = "on";

    /* renamed from: B */
    public final String f41506B = "off";

    /* renamed from: C */
    public final String f41507C = "https://bscscan.com/address/";

    /* renamed from: H */
    public final String f41508H = "https://etherscan.io/address/";

    /* renamed from: I */
    public final String f41509I = "https://polygonscan.com/address/";

    /* renamed from: L */
    public final String f41510L = "https://snowtrace.io/address/";

    /* renamed from: M */
    public final String f41511M = "https://solscan.io/account/";

    /* renamed from: P */
    public final String f41512P = "https://blockchair.com/bitcoin/address/";

    /* renamed from: Q */
    public final String f41513Q = "https://blockchair.com/dogecoin/address/";

    /* renamed from: U */
    public final ef3 f41514U = C6169a.m47232a(new WalletManageActivity$isBioAuth$2(this));

    /* renamed from: X */
    public final ef3 f41515X = C6169a.m47232a(new WalletManageActivity$manager$2(this));

    /* renamed from: Y */
    public final ef3 f41516Y = C6169a.m47232a(new WalletManageActivity$wallet$2(this));

    /* renamed from: Z */
    public final ef3 f41517Z = C6169a.m47232a(new WalletManageActivity$binding$2(this));

    /* renamed from: b1 */
    public boolean f41518b1;

    /* renamed from: e0 */
    public final C3529wa<Intent> f41519e0;

    /* renamed from: e1 */
    public boolean f41520e1;

    /* renamed from: k0 */
    public int f41521k0;

    /* renamed from: o1 */
    public int f41522o1;

    /* renamed from: p1 */
    public final y12 f41523p1;

    /* renamed from: v0 */
    public final ef3 f41524v0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0014\u0010\t\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u000f"}, mo44877d2 = {"Lnet/safemoon/androidwallet/activity/WalletManageActivity$a;", "", "Landroid/content/Context;", "context", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "wallet", "Lr37;", "a", "", "CHECK_TYPE_PASS", "I", "CHECK_TYPE_PRIVATE", "CHECK_TYPE_SYNC_WALLETS", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.activity.WalletManageActivity$a */
    /* compiled from: WalletManageActivity.kt */
    public static final class C8206a {
        public C8206a() {
        }

        public /* synthetic */ C8206a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo56966a(Context context, Wallet wallet2) {
            vx2.m53591g(context, "context");
            vx2.m53591g(wallet2, "wallet");
            Intent intent = new Intent(context, WalletManageActivity.class);
            intent.putExtra("argWallet", wallet2.toString());
            context.startActivity(intent);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, mo44877d2 = {"net/safemoon/androidwallet/activity/WalletManageActivity$b", "Lwo2$a;", "Lr37;", "b", "", "errorCode", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.activity.WalletManageActivity$b */
    /* compiled from: WalletManageActivity.kt */
    public static final class C8207b implements wo2.C9557a {

        /* renamed from: a */
        public final /* synthetic */ WalletManageActivity f41525a;

        public C8207b(WalletManageActivity walletManageActivity) {
            this.f41525a = walletManageActivity;
        }

        /* renamed from: a */
        public void mo56680a(int i) {
        }

        /* renamed from: b */
        public void mo56681b() {
            this.f41525a.mo56934W1();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0005"}, mo44877d2 = {"net/safemoon/androidwallet/activity/WalletManageActivity$c", "Lnet/safemoon/androidwallet/dialogs/G2FAVerfication$b;", "Lr37;", "onSuccess", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.activity.WalletManageActivity$c */
    /* compiled from: WalletManageActivity.kt */
    public static final class C8208c implements G2FAVerfication.C8290b {

        /* renamed from: a */
        public final /* synthetic */ WalletManageActivity f41526a;

        /* renamed from: b */
        public final /* synthetic */ int f41527b;

        public C8208c(WalletManageActivity walletManageActivity, int i) {
            this.f41526a = walletManageActivity;
            this.f41527b = i;
        }

        /* renamed from: a */
        public void mo56967a() {
            dq6.f37375a.mo51267e("Khang").mo51264a("G2FAVerificationCallback onError() called", new Object[0]);
        }

        public void onSuccess() {
            if (this.f41526a.mo56963x1()) {
                this.f41526a.mo56956p2(this.f41527b);
                return;
            }
            int i = this.f41527b;
            if (i == 3) {
                this.f41526a.mo56932U1();
            } else {
                this.f41526a.mo56938a2(i);
            }
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0005"}, mo44877d2 = {"net/safemoon/androidwallet/activity/WalletManageActivity$d", "Lnet/safemoon/androidwallet/dialogs/G2FAVerfication$b;", "Lr37;", "onSuccess", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.activity.WalletManageActivity$d */
    /* compiled from: WalletManageActivity.kt */
    public static final class C8209d implements G2FAVerfication.C8290b {

        /* renamed from: a */
        public final /* synthetic */ WalletManageActivity f41528a;

        public C8209d(WalletManageActivity walletManageActivity) {
            this.f41528a = walletManageActivity;
        }

        /* renamed from: a */
        public void mo56967a() {
            dq6.f37375a.mo51267e("Khang").mo51264a("G2FAVerificationCallback onError() called", new Object[0]);
        }

        public void onSuccess() {
            if (this.f41528a.mo56963x1()) {
                y12 Q0 = this.f41528a.f41523p1;
                WalletManageActivity walletManageActivity = this.f41528a;
                Q0.mo66750b(walletManageActivity, walletManageActivity.mo56949m1());
                return;
            }
            this.f41528a.mo56934W1();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, mo44877d2 = {"net/safemoon/androidwallet/activity/WalletManageActivity$e", "Lwo2$a;", "Lr37;", "b", "", "errorCode", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.activity.WalletManageActivity$e */
    /* compiled from: WalletManageActivity.kt */
    public static final class C8210e implements wo2.C9557a {

        /* renamed from: a */
        public final /* synthetic */ WalletManageActivity f41529a;

        public C8210e(WalletManageActivity walletManageActivity) {
            this.f41529a = walletManageActivity;
        }

        /* renamed from: a */
        public void mo56680a(int i) {
        }

        /* renamed from: b */
        public void mo56681b() {
            this.f41529a.mo56940e2(true);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, mo44877d2 = {"net/safemoon/androidwallet/activity/WalletManageActivity$f", "Lwo2$a;", "Lr37;", "b", "", "errorCode", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.activity.WalletManageActivity$f */
    /* compiled from: WalletManageActivity.kt */
    public static final class C8211f implements wo2.C9557a {

        /* renamed from: a */
        public final /* synthetic */ WalletManageActivity f41530a;

        public C8211f(WalletManageActivity walletManageActivity) {
            this.f41530a = walletManageActivity;
        }

        /* renamed from: a */
        public void mo56680a(int i) {
        }

        /* renamed from: b */
        public void mo56681b() {
            this.f41530a.mo56942h2(true);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J(\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\fH\u0016¨\u0006\u000e"}, mo44877d2 = {"net/safemoon/androidwallet/activity/WalletManageActivity$g", "Landroid/text/TextWatcher;", "", "s", "", "start", "count", "after", "Lr37;", "beforeTextChanged", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.activity.WalletManageActivity$g */
    /* compiled from: WalletManageActivity.kt */
    public static final class C8212g implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ C5729db f41531a;

        /* renamed from: d */
        public final /* synthetic */ WalletManageActivity f41532d;

        public C8212g(C5729db dbVar, WalletManageActivity walletManageActivity) {
            this.f41531a = dbVar;
            this.f41532d = walletManageActivity;
        }

        public void afterTextChanged(Editable editable) {
            boolean z;
            vx2.m53591g(editable, "s");
            String obj = editable.toString();
            String I = yb6.m74332I(yb6.m74332I(obj, "|", "", false, 4, (Object) null), ",", "", false, 4, (Object) null);
            if (!vx2.m53586b(obj, I)) {
                EditText editText = this.f41531a.f28114v.getEditText();
                if (editText != null) {
                    editText.setText(I);
                }
                EditText editText2 = this.f41531a.f28114v.getEditText();
                if (editText2 != null) {
                    editText2.setSelection(I.length());
                    return;
                }
                return;
            }
            this.f41532d.mo56954o2(obj);
            if (sq0.f44593a.mo65889a().contains(StringsKt__StringsKt.m63090V0(obj).toString())) {
                Wallet S0 = this.f41532d.mo56960t1();
                if (S0 == null || S0.isPrimaryWallet()) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    this.f41531a.f28114v.setError(this.f41532d.getString(R.string.akt_err_name_cant_be_same_master_wallet));
                    this.f41531a.f28115w.f34992b.setEnabled(false);
                    this.f41531a.f28115w.f34992b.setAlpha(0.5f);
                    return;
                }
            }
            this.f41531a.f28114v.setError((CharSequence) null);
            this.f41531a.f28115w.f34992b.setEnabled(true);
            this.f41531a.f28115w.f34992b.setAlpha(1.0f);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            vx2.m53591g(charSequence, "s");
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            vx2.m53591g(charSequence, "s");
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, mo44877d2 = {"net/safemoon/androidwallet/activity/WalletManageActivity$h", "Lwo2$a;", "Lr37;", "b", "", "errorCode", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.activity.WalletManageActivity$h */
    /* compiled from: WalletManageActivity.kt */
    public static final class C8213h implements wo2.C9557a {

        /* renamed from: a */
        public final /* synthetic */ WalletManageActivity f41533a;

        public C8213h(WalletManageActivity walletManageActivity) {
            this.f41533a = walletManageActivity;
        }

        /* renamed from: a */
        public void mo56680a(int i) {
        }

        /* renamed from: b */
        public void mo56681b() {
            this.f41533a.mo56932U1();
        }
    }

    public WalletManageActivity() {
        C3529wa<Intent> registerForActivityResult = registerForActivityResult(new C3474va(), new yh7(this));
        vx2.m53590f(registerForActivityResult, "registerForActivityResul…heckType)\n        }\n    }");
        this.f41519e0 = registerForActivityResult;
        this.f41521k0 = 1;
        this.f41524v0 = new dd7(ua5.m52727b(AKTWebSocketHandlingViewModel.class), new WalletManageActivity$special$$inlined$viewModels$default$2(this), new WalletManageActivity$special$$inlined$viewModels$default$1(this), new WalletManageActivity$special$$inlined$viewModels$default$3((pc2) null, this));
        this.f41522o1 = 1;
        this.f41523p1 = new y12();
    }

    /* renamed from: A1 */
    public static final void m65537A1(WalletManageActivity walletManageActivity, View view) {
        vx2.m53591g(walletManageActivity, "this$0");
        walletManageActivity.onBackPressed();
    }

    /* renamed from: B1 */
    public static final void m65539B1(C5729db dbVar, WalletManageActivity walletManageActivity, View view) {
        Editable text;
        boolean z;
        vx2.m53591g(dbVar, "$this_apply");
        vx2.m53591g(walletManageActivity, "this$0");
        EditText editText = dbVar.f28114v.getEditText();
        if (editText != null && (text = editText.getText()) != null) {
            if (StringsKt__StringsKt.m63090V0(text).length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                dbVar.f28114v.setError(walletManageActivity.getString(R.string.err_required_field));
            } else if (sq0.f44593a.mo65889a().contains(StringsKt__StringsKt.m63090V0(text).toString())) {
                dbVar.f28114v.setError(walletManageActivity.getString(R.string.akt_err_name_cant_be_same_master_wallet));
            } else {
                ProgressLoading.C8308a aVar = ProgressLoading.f41785Y;
                String string = walletManageActivity.getString(R.string.loading);
                vx2.m53590f(string, "getString(R.string.loading)");
                ProgressLoading a = aVar.mo57297a(false, string, "");
                walletManageActivity.f8528r = a;
                FragmentManager supportFragmentManager = walletManageActivity.getSupportFragmentManager();
                vx2.m53590f(supportFragmentManager, "supportFragmentManager");
                a.mo57295D(supportFragmentManager);
                walletManageActivity.f8530x.mo61249H(walletManageActivity.mo56960t1(), StringsKt__StringsKt.m63090V0(text).toString(), new WalletManageActivity$onPostCreate$1$1$2$1$1(walletManageActivity, text));
            }
        }
    }

    /* renamed from: C1 */
    public static final void m65541C1(WalletManageActivity walletManageActivity, View view) {
        vx2.m53591g(walletManageActivity, "this$0");
        if (walletManageActivity.mo56960t1() == null) {
            return;
        }
        if (f06.m57513d(walletManageActivity, "AUTH_2FA_IS_ENABLE")) {
            G2FAVerfication a = G2FAVerfication.f41732v0.mo57216a(walletManageActivity.mo56953o1(3), walletManageActivity.mo56963x1());
            FragmentManager supportFragmentManager = walletManageActivity.getSupportFragmentManager();
            vx2.m53590f(supportFragmentManager, "supportFragmentManager");
            a.mo57214K(supportFragmentManager);
        } else if (walletManageActivity.mo56963x1()) {
            walletManageActivity.f41523p1.mo66750b(walletManageActivity, walletManageActivity.mo56948l2());
        } else {
            walletManageActivity.mo56932U1();
        }
    }

    /* renamed from: D1 */
    public static final void m65543D1(WalletManageActivity walletManageActivity, View view) {
        boolean z;
        int i;
        int i2;
        vx2.m53591g(walletManageActivity, "this$0");
        LinearLayoutCompat linearLayoutCompat = walletManageActivity.mo56951n1().f28094b;
        vx2.m53590f(linearLayoutCompat, "binding.coinContainer");
        LinearLayoutCompat linearLayoutCompat2 = walletManageActivity.mo56951n1().f28094b;
        vx2.m53590f(linearLayoutCompat2, "binding.coinContainer");
        boolean z2 = true;
        if (linearLayoutCompat2.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            i = 0;
        } else {
            i = 8;
        }
        linearLayoutCompat.setVisibility(i);
        TextView textView = walletManageActivity.mo56951n1().f28107o;
        vx2.m53590f(textView, "binding.textNativeWalletAddressTitle");
        LinearLayoutCompat linearLayoutCompat3 = walletManageActivity.mo56951n1().f28094b;
        vx2.m53590f(linearLayoutCompat3, "binding.coinContainer");
        if (linearLayoutCompat3.getVisibility() != 0) {
            z2 = false;
        }
        if (z2) {
            i2 = R.drawable.ic_baseline_keyboard_arrow_up_24;
        } else {
            i2 = R.drawable.ic_baseline_keyboard_arrow_down_24;
        }
        po6.m71046a(textView, zr0.m31442e(walletManageActivity, i2));
    }

    /* renamed from: E1 */
    public static final void m65545E1(C5729db dbVar, WalletManageActivity walletManageActivity, View view) {
        boolean z;
        int i;
        int i2;
        vx2.m53591g(dbVar, "$this_apply");
        vx2.m53591g(walletManageActivity, "this$0");
        LinearLayoutCompat linearLayoutCompat = dbVar.f28105m;
        vx2.m53590f(linearLayoutCompat, "groupOfWalletLink");
        LinearLayoutCompat linearLayoutCompat2 = dbVar.f28105m;
        vx2.m53590f(linearLayoutCompat2, "groupOfWalletLink");
        boolean z2 = true;
        if (linearLayoutCompat2.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            i = 0;
        } else {
            i = 8;
        }
        linearLayoutCompat.setVisibility(i);
        TextView textView = walletManageActivity.mo56951n1().f28113u;
        vx2.m53590f(textView, "binding.textViewWalletLinkTitle");
        LinearLayoutCompat linearLayoutCompat3 = dbVar.f28105m;
        vx2.m53590f(linearLayoutCompat3, "groupOfWalletLink");
        if (linearLayoutCompat3.getVisibility() != 0) {
            z2 = false;
        }
        if (z2) {
            i2 = R.drawable.ic_baseline_keyboard_arrow_up_24;
        } else {
            i2 = R.drawable.ic_baseline_keyboard_arrow_down_24;
        }
        po6.m71046a(textView, zr0.m31442e(walletManageActivity, i2));
    }

    /* renamed from: F1 */
    public static final void m65547F1(WalletManageActivity walletManageActivity, TokenType tokenType, View view) {
        String address;
        vx2.m53591g(walletManageActivity, "this$0");
        vx2.m53591g(tokenType, "$it");
        Wallet t1 = walletManageActivity.mo56960t1();
        if (t1 != null && (address = t1.getAddress(tokenType.getCoinType().getValue())) != null) {
            walletManageActivity.mo56965z1(address);
        }
    }

    /* renamed from: G1 */
    public static final void m65549G1(WalletManageActivity walletManageActivity, View view) {
        vx2.m53591g(walletManageActivity, "this$0");
        walletManageActivity.mo56965z1(walletManageActivity.mo56951n1().f28085I.getText().toString());
    }

    /* renamed from: H1 */
    public static final void m65551H1(WalletManageActivity walletManageActivity, View view) {
        vx2.m53591g(walletManageActivity, "this$0");
        walletManageActivity.mo56944j1();
    }

    /* renamed from: I1 */
    public static final void m65553I1(WalletManageActivity walletManageActivity, View view) {
        vx2.m53591g(walletManageActivity, "this$0");
        if (f06.m57513d(walletManageActivity, "AUTH_2FA_IS_ENABLE")) {
            G2FAVerfication a = G2FAVerfication.f41732v0.mo57216a(walletManageActivity.mo56953o1(1), walletManageActivity.mo56963x1());
            FragmentManager supportFragmentManager = walletManageActivity.getSupportFragmentManager();
            vx2.m53590f(supportFragmentManager, "supportFragmentManager");
            a.mo57214K(supportFragmentManager);
        } else if (!vx2.m53586b(walletManageActivity.mo56951n1().f28118z.getTag().toString(), "off")) {
        } else {
            if (walletManageActivity.mo56963x1()) {
                walletManageActivity.f41523p1.mo66750b(walletManageActivity, walletManageActivity.mo56958r1());
            } else {
                walletManageActivity.mo56938a2(1);
            }
        }
    }

    /* renamed from: J1 */
    public static final void m65555J1(WalletManageActivity walletManageActivity, View view) {
        vx2.m53591g(walletManageActivity, "this$0");
        if (f06.m57513d(walletManageActivity, "AUTH_2FA_IS_ENABLE")) {
            G2FAVerfication a = G2FAVerfication.f41732v0.mo57216a(walletManageActivity.mo56953o1(2), walletManageActivity.mo56963x1());
            FragmentManager supportFragmentManager = walletManageActivity.getSupportFragmentManager();
            vx2.m53590f(supportFragmentManager, "supportFragmentManager");
            a.mo57214K(supportFragmentManager);
        } else if (!vx2.m53586b(walletManageActivity.mo56951n1().f28081E.getTag().toString(), "off")) {
        } else {
            if (walletManageActivity.mo56963x1()) {
                walletManageActivity.f41523p1.mo66750b(walletManageActivity, walletManageActivity.mo56959s1());
                return;
            }
            walletManageActivity.mo56938a2(2);
        }
    }

    /* renamed from: K1 */
    public static final void m65557K1(WalletManageActivity walletManageActivity, View view) {
        vx2.m53591g(walletManageActivity, "this$0");
        walletManageActivity.mo56965z1(walletManageActivity.mo56951n1().f28077A.getText().toString());
    }

    /* renamed from: L1 */
    public static final void m65559L1(WalletManageActivity walletManageActivity, View view) {
        vx2.m53591g(walletManageActivity, "this$0");
        walletManageActivity.mo56965z1(walletManageActivity.mo56951n1().f28079C.getText().toString());
    }

    /* renamed from: M1 */
    public static final void m65561M1(WalletManageActivity walletManageActivity, View view) {
        String str;
        String address;
        String obj;
        vx2.m53591g(walletManageActivity, "this$0");
        String str2 = walletManageActivity.f41507C;
        Wallet t1 = walletManageActivity.mo56960t1();
        if (t1 == null || (address = t1.getAddress(MyCoinType.SMARTCHAIN.getValue())) == null || (obj = StringsKt__StringsKt.m63090V0(address).toString()) == null) {
            str = null;
        } else {
            str = obj.toLowerCase(Locale.ROOT);
            vx2.m53590f(str, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        }
        walletManageActivity.mo56931T1(str2 + str);
    }

    /* renamed from: N1 */
    public static final void m65563N1(WalletManageActivity walletManageActivity, View view) {
        String str;
        String address;
        String obj;
        vx2.m53591g(walletManageActivity, "this$0");
        String str2 = walletManageActivity.f41508H;
        Wallet t1 = walletManageActivity.mo56960t1();
        if (t1 == null || (address = t1.getAddress(MyCoinType.ETHEREUM.getValue())) == null || (obj = StringsKt__StringsKt.m63090V0(address).toString()) == null) {
            str = null;
        } else {
            str = obj.toLowerCase(Locale.ROOT);
            vx2.m53590f(str, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        }
        walletManageActivity.mo56931T1(str2 + str);
    }

    /* renamed from: O1 */
    public static final void m65565O1(WalletManageActivity walletManageActivity, View view) {
        String str;
        String address;
        String obj;
        vx2.m53591g(walletManageActivity, "this$0");
        String str2 = walletManageActivity.f41509I;
        Wallet t1 = walletManageActivity.mo56960t1();
        if (t1 == null || (address = t1.getAddress(MyCoinType.POLYGON.getValue())) == null || (obj = StringsKt__StringsKt.m63090V0(address).toString()) == null) {
            str = null;
        } else {
            str = obj.toLowerCase(Locale.ROOT);
            vx2.m53590f(str, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        }
        walletManageActivity.mo56931T1(str2 + str);
    }

    /* renamed from: P1 */
    public static final void m65567P1(WalletManageActivity walletManageActivity, View view) {
        String str;
        String address;
        String obj;
        vx2.m53591g(walletManageActivity, "this$0");
        String str2 = walletManageActivity.f41510L;
        Wallet t1 = walletManageActivity.mo56960t1();
        if (t1 == null || (address = t1.getAddress(MyCoinType.MY_AVALANCHE.getValue())) == null || (obj = StringsKt__StringsKt.m63090V0(address).toString()) == null) {
            str = null;
        } else {
            str = obj.toLowerCase(Locale.ROOT);
            vx2.m53590f(str, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        }
        walletManageActivity.mo56931T1(str2 + str);
    }

    /* renamed from: Q1 */
    public static final void m65569Q1(WalletManageActivity walletManageActivity, View view) {
        String str;
        String address;
        vx2.m53591g(walletManageActivity, "this$0");
        String str2 = walletManageActivity.f41511M;
        Wallet t1 = walletManageActivity.mo56960t1();
        if (t1 == null || (address = t1.getAddress(MyCoinType.SOLANA.getValue())) == null) {
            str = null;
        } else {
            str = StringsKt__StringsKt.m63090V0(address).toString();
        }
        walletManageActivity.mo56931T1(str2 + str);
    }

    /* renamed from: R1 */
    public static final void m65571R1(WalletManageActivity walletManageActivity, View view) {
        String str;
        String address;
        vx2.m53591g(walletManageActivity, "this$0");
        String str2 = walletManageActivity.f41512P;
        Wallet t1 = walletManageActivity.mo56960t1();
        if (t1 == null || (address = t1.getAddress(MyCoinType.BITCOIN.getValue())) == null) {
            str = null;
        } else {
            str = StringsKt__StringsKt.m63090V0(address).toString();
        }
        walletManageActivity.mo56931T1(str2 + str);
    }

    /* renamed from: S1 */
    public static final void m65573S1(WalletManageActivity walletManageActivity, View view) {
        String str;
        String address;
        vx2.m53591g(walletManageActivity, "this$0");
        String str2 = walletManageActivity.f41513Q;
        Wallet t1 = walletManageActivity.mo56960t1();
        if (t1 == null || (address = t1.getAddress(MyCoinType.DOGECOIN.getValue())) == null) {
            str = null;
        } else {
            str = StringsKt__StringsKt.m63090V0(address).toString();
        }
        walletManageActivity.mo56931T1(str2 + str);
    }

    /* renamed from: b2 */
    public static final void m65583b2(int i, WalletManageActivity walletManageActivity, View view) {
        vx2.m53591g(walletManageActivity, "this$0");
        if (i == 1) {
            walletManageActivity.mo56939d2();
        } else {
            walletManageActivity.mo56941g2();
        }
    }

    /* renamed from: c2 */
    public static final void m65585c2(int i, WalletManageActivity walletManageActivity, View view) {
        vx2.m53591g(walletManageActivity, "this$0");
        if (i == 1) {
            walletManageActivity.mo56935X1();
        } else {
            walletManageActivity.mo56936Y1();
        }
    }

    /* renamed from: f2 */
    public static final void m65589f2(WalletManageActivity walletManageActivity, boolean z) {
        vx2.m53591g(walletManageActivity, "this$0");
        walletManageActivity.mo56951n1();
        if (z) {
            walletManageActivity.mo56938a2(1);
        }
    }

    /* renamed from: i2 */
    public static final void m65592i2(WalletManageActivity walletManageActivity, boolean z) {
        vx2.m53591g(walletManageActivity, "this$0");
        walletManageActivity.mo56951n1();
        if (z) {
            walletManageActivity.mo56938a2(2);
        }
    }

    /* renamed from: j2 */
    public static final void m65593j2(WalletManageActivity walletManageActivity, ActivityResult activityResult) {
        vx2.m53591g(walletManageActivity, "this$0");
        vx2.m53591g(activityResult, "result");
        if (activityResult.mo918b() == -1) {
            walletManageActivity.mo56938a2(walletManageActivity.f41521k0);
        }
    }

    /* renamed from: w1 */
    public static final void m65604w1(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: T1 */
    public final void mo56931T1(String str) {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }

    /* renamed from: U1 */
    public final void mo56932U1() {
        Wallet t1 = mo56960t1();
        if (t1 == null) {
            return;
        }
        if (!g06.f37938a.mo51835d(this) || !t1.isPrimaryWallet()) {
            mo56964y1(t1);
        } else {
            mo56945k1(t1);
        }
    }

    /* renamed from: V1 */
    public final void mo56933V1() {
        ProgressLoading progressLoading = this.f8528r;
        if (progressLoading != null) {
            progressLoading.mo22266k();
        }
        if (this.f41518b1) {
            finish();
        } else if (this.f41520e1) {
            onBackPressed();
        } else {
            C9001np.m69943a0(new WeakReference(this), (Integer) null, Integer.valueOf(R.string.akt_manage_wallets_link_wallet_error_message), 0, (pc2) null, 24, (Object) null);
        }
    }

    /* renamed from: W1 */
    public final void mo56934W1() {
        Wallet t1 = mo56960t1();
        if (t1 != null) {
            this.f8530x.mo61255q(t1);
        }
        Wallet t12 = mo56960t1();
        boolean z = false;
        if (t12 != null && t12.isLinked()) {
            z = true;
        }
        if (z) {
            this.f41518b1 = true;
            Wallet t13 = mo56960t1();
            vx2.m53588d(t13);
            mo56964y1(t13);
            return;
        }
        finish();
    }

    /* renamed from: X */
    public void mo12159X() {
        mo56961u1().mo60951g();
    }

    /* renamed from: X1 */
    public final void mo56935X1() {
        C5729db n1 = mo56951n1();
        n1.f28118z.setTag(this.f41506B);
        n1.f28118z.setVisibility(0);
        n1.f28103k.setVisibility(0);
        n1.f28104l.setVisibility(8);
        n1.f28078B.setVisibility(0);
    }

    /* renamed from: Y1 */
    public final void mo56936Y1() {
        C5729db n1 = mo56951n1();
        n1.f28081E.setTag(this.f41506B);
        n1.f28081E.setVisibility(0);
        n1.f28102j.setVisibility(8);
        n1.f28082F.setVisibility(0);
    }

    /* renamed from: Z1 */
    public void mo56937Z1(String str) {
        if (str != null) {
            mo56961u1().mo60956l(str);
        }
    }

    /* renamed from: a2 */
    public final void mo56938a2(int i) {
        C9001np.m69921G(new WeakReference(this), new ni7(i, this), new oi7(i, this));
    }

    /* renamed from: d2 */
    public final void mo56939d2() {
        String passPhrase;
        C5729db n1 = mo56951n1();
        n1.f28078B.setVisibility(8);
        n1.f28118z.setVisibility(8);
        n1.f28104l.setVisibility(0);
        n1.f28077A.setVisibility(0);
        Wallet t1 = mo56960t1();
        if (t1 != null && (passPhrase = t1.getPassPhrase()) != null) {
            String e = C9377u.m72500e(this, passPhrase);
            vx2.m53590f(e, "getDecryptedRecoveryPhra…WalletManageActivity, it)");
            n1.f28077A.setText(StringsKt__StringsKt.m63090V0(yb6.m74332I(e, "|", " ", false, 4, (Object) null)).toString());
        }
    }

    /* renamed from: e0 */
    public void mo12164e0(ow7 ow7, String str) {
        boolean z;
        String str2 = str;
        vx2.m53591g(ow7, "safeMoonppp");
        if (mo12163d0(str2)) {
            if (this.f41518b1) {
                finish();
            }
            if (this.f41520e1) {
                onBackPressed();
                return;
            }
            return;
        }
        ProgressLoading progressLoading = this.f8528r;
        if (progressLoading != null) {
            progressLoading.mo22266k();
        }
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
                if (vx2.m53586b(upperCase, "AKTSERVERERROR")) {
                    mo56933V1();
                } else if (!vx2.m53586b(upperCase, "PUTBLOB02")) {
                    super.mo12164e0(ow7, str);
                } else if (this.f41518b1) {
                    finish();
                } else if (this.f41520e1) {
                    onBackPressed();
                } else {
                    Wallet t1 = mo56960t1();
                    if (t1 != null) {
                        if (t1.isPrimaryWallet()) {
                            g06 g06 = g06.f37938a;
                            g06.mo51839h(this, !g06.mo51835d(this));
                            mo56950m2();
                        } else {
                            t1.updateLinkedState(!t1.isLinked());
                            this.f8530x.mo61247F(mo56960t1(), t1.getLinkedState(), new WalletManageActivity$parseMessage$1$1(this));
                        }
                    }
                    mo56952n2();
                }
            }
        }
    }

    /* renamed from: e2 */
    public final void mo56940e2(boolean z) {
        new Handler(Looper.getMainLooper()).post(new li7(this, z));
    }

    /* renamed from: g2 */
    public final void mo56941g2() {
        String str;
        C5729db n1 = mo56951n1();
        n1.f28082F.setVisibility(8);
        n1.f28081E.setVisibility(8);
        n1.f28102j.setVisibility(0);
        n1.f28079C.setVisibility(0);
        TextView textView = n1.f28079C;
        Wallet t1 = mo56960t1();
        if (t1 != null) {
            str = t1.getPrivateKey(ol0.m70355e(this).getCoinType().getValue());
        } else {
            str = null;
        }
        textView.setText(str);
    }

    /* renamed from: h2 */
    public final void mo56942h2(boolean z) {
        new Handler(Looper.getMainLooper()).post(new mi7(this, z));
    }

    /* renamed from: i1 */
    public final void mo56943i1() {
        this.f8530x.mo61256r(new WalletManageActivity$checkLinkedAllStatus$1(this));
    }

    /* renamed from: j1 */
    public final void mo56944j1() {
        C9001np.m69926K(new WeakReference(this), Integer.valueOf(R.string.delete_wallet_title), R.string.delete_wallet_msg, R.string.confirm, R.string.cancel, new WalletManageActivity$confirmRemoveWallet$1(this), WalletManageActivity$confirmRemoveWallet$2.INSTANCE);
    }

    /* renamed from: k1 */
    public final void mo56945k1(Wallet wallet2) {
        C9001np.m69911A0(new WeakReference(this), R.string.akt_switch_wallet_unlink_all_wallets, R.string.akt_manage_wallets_unlink_all_wallets_content, R.string.action_no, R.string.action_yes, WalletManageActivity$confirmUnlinkAllWallets$1.INSTANCE, new WalletManageActivity$confirmUnlinkAllWallets$2(this, wallet2));
    }

    /* renamed from: k2 */
    public final void mo56946k2() {
        if (f06.m57513d(this, "AUTH_2FA_IS_ENABLE")) {
            G2FAVerfication a = G2FAVerfication.f41732v0.mo57216a(mo56955p1(), mo56963x1());
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            vx2.m53590f(supportFragmentManager, "supportFragmentManager");
            a.mo57214K(supportFragmentManager);
        } else if (mo56963x1()) {
            this.f41523p1.mo66750b(this, mo56949m1());
        } else {
            mo56934W1();
        }
    }

    /* renamed from: l1 */
    public final String mo56947l1(String str) {
        String i = f06.m57518i(this, "U5");
        String g0 = AKTServerFunctions.m12039g0(this, i + ">" + str);
        vx2.m53590f(g0, "putBlob(this, newBlob)");
        return g0;
    }

    /* renamed from: l2 */
    public final wo2.C9557a mo56948l2() {
        return new C8213h(this);
    }

    /* renamed from: m1 */
    public final wo2.C9557a mo56949m1() {
        return new C8207b(this);
    }

    /* renamed from: m2 */
    public final void mo56950m2() {
        this.f8530x.mo61256r(new WalletManageActivity$updateAllWalletsLinkedStatus$1(this, g06.f37938a.mo51835d(this) ? 1 : 0));
    }

    /* renamed from: n1 */
    public final C5729db mo56951n1() {
        return (C5729db) this.f41517Z.getValue();
    }

    /* renamed from: n2 */
    public final void mo56952n2() {
        boolean z;
        C5729db n1 = mo56951n1();
        Wallet t1 = mo56960t1();
        boolean z2 = true;
        if (t1 == null || !t1.isPrimaryWallet()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            ViewGroup.LayoutParams layoutParams = n1.f28106n.getLayoutParams();
            vx2.m53589e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.width = getResources().getDimensionPixelSize(R.dimen._22sdp);
            layoutParams2.height = getResources().getDimensionPixelSize(R.dimen._29sdp);
            n1.f28106n.setLayoutParams(layoutParams2);
            if (this.f41522o1 > 1) {
                n1.f28106n.setVisibility(0);
                if (g06.f37938a.mo51835d(this)) {
                    n1.f28106n.setImageResource(R.drawable.ic_wallets_link_all);
                } else {
                    n1.f28106n.setImageResource(R.drawable.ic_wallets_unlink_all);
                }
            } else {
                n1.f28106n.setVisibility(8);
            }
        } else {
            n1.f28106n.setVisibility(0);
            ViewGroup.LayoutParams layoutParams3 = n1.f28106n.getLayoutParams();
            vx2.m53589e(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
            layoutParams4.width = getResources().getDimensionPixelSize(R.dimen._22sdp);
            layoutParams4.height = getResources().getDimensionPixelSize(R.dimen._22sdp);
            n1.f28106n.setLayoutParams(layoutParams4);
            Wallet t12 = mo56960t1();
            if (t12 == null || !t12.isLinked()) {
                z2 = false;
            }
            if (z2) {
                n1.f28106n.setImageResource(R.drawable.ic_wallet_linked);
            } else {
                n1.f28106n.setImageResource(R.drawable.ic_wallet_unlinked);
            }
        }
    }

    /* renamed from: o1 */
    public final G2FAVerfication.C8290b mo56953o1(int i) {
        return new C8208c(this, i);
    }

    /* renamed from: o2 */
    public final void mo56954o2(String str) {
        String c = Common.f42577a.mo60897c(str);
        int length = c.length() + ((str.length() - c.length()) / 2);
        TextView textView = mo56951n1().f28117y;
        cb6 cb6 = cb6.f21669a;
        String format = String.format("%d/25", Arrays.copyOf(new Object[]{Integer.valueOf(length)}, 1));
        vx2.m53590f(format, "format(format, *args)");
        textView.setText(format);
        int length2 = ((str.length() - c.length()) / 2) + 25;
        if ((str.length() - c.length()) / 2 == 24) {
            length2++;
        }
        EditText editText = mo56951n1().f28114v.getEditText();
        if (editText != null) {
            editText.setFilters((InputFilter[]) new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(length2)});
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((View) mo56951n1().mo41885b());
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo959l();
        }
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(zr0.m31440c(this, 17170445));
        getWindow().setBackgroundDrawableResource(R.drawable.bottom_curve);
        if (!y40.f35760b.booleanValue()) {
            mo56999O(true);
            k85.m20571a(this, true);
        }
        mo56961u1().mo60957m();
        mo56962v1();
        this.f8530x.mo61256r(new WalletManageActivity$onCreate$1(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0186 A[LOOP:1: B:35:0x0180->B:37:0x0186, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0254  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0256  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPostCreate(android.os.Bundle r13) {
        /*
            r12 = this;
            super.onPostCreate(r13)
            db r13 = r12.mo56951n1()
            vr6 r0 = r13.f28115w
            android.widget.ImageView r1 = r0.f34993c
            ji7 r2 = new ji7
            r2.<init>(r12)
            r1.setOnClickListener(r2)
            android.widget.TextView r1 = r0.f34994d
            r2 = 2131952263(0x7f130287, float:1.9540964E38)
            r1.setText(r2)
            com.google.android.material.button.MaterialButton r0 = r0.f34992b
            ai7 r1 = new ai7
            r1.<init>(r13, r12)
            r0.setOnClickListener(r1)
            com.google.android.material.textfield.TextInputLayout r0 = r13.f28114v
            android.widget.EditText r0 = r0.getEditText()
            r1 = 0
            if (r0 == 0) goto L_0x0057
            net.safemoon.androidwallet.model.wallets.Wallet r2 = r12.mo56960t1()
            if (r2 == 0) goto L_0x0039
            java.lang.String r2 = r2.getName()
            goto L_0x003a
        L_0x0039:
            r2 = r1
        L_0x003a:
            r0.setText(r2)
            android.text.Editable r2 = r0.getText()
            java.lang.String r2 = r2.toString()
            int r2 = r2.length()
            r0.setSelection(r2)
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            r12.mo56954o2(r0)
        L_0x0057:
            com.google.android.material.textfield.TextInputLayout r0 = r13.f28114v
            android.widget.EditText r0 = r0.getEditText()
            if (r0 == 0) goto L_0x0067
            net.safemoon.androidwallet.activity.WalletManageActivity$g r2 = new net.safemoon.androidwallet.activity.WalletManageActivity$g
            r2.<init>(r13, r12)
            r0.addTextChangedListener(r2)
        L_0x0067:
            r12.mo56952n2()
            androidx.appcompat.widget.AppCompatImageView r0 = r13.f28106n
            bi7 r2 = new bi7
            r2.<init>(r12)
            r0.setOnClickListener(r2)
            android.widget.TextView r0 = r13.f28107o
            ci7 r2 = new ci7
            r2.<init>(r12)
            r0.setOnClickListener(r2)
            android.widget.TextView r0 = r13.f28113u
            di7 r2 = new di7
            r2.<init>(r13, r12)
            r0.setOnClickListener(r2)
            net.safemoon.androidwallet.common.TokenType$a r13 = net.safemoon.androidwallet.common.TokenType.Companion
            net.safemoon.androidwallet.common.TokenType r0 = p000.ol0.m70355e(r12)
            int r0 = r0.getChainId()
            net.safemoon.androidwallet.common.TokenType r0 = r13.mo57099b(r0)
            net.safemoon.androidwallet.common.MyCoinType r2 = r0.getCoinType()
            net.safemoon.androidwallet.common.SimilarTypeGroup r2 = r2.getSimilarTypeGroup()
            net.safemoon.androidwallet.common.SimilarTypeGroup r3 = net.safemoon.androidwallet.common.SimilarTypeGroup.EVM_CAPABILITY
            r4 = 8
            r5 = 0
            if (r2 != r3) goto L_0x00af
            db r2 = r12.mo56951n1()
            androidx.cardview.widget.CardView r2 = r2.f28097e
            r2.setVisibility(r5)
            goto L_0x00b8
        L_0x00af:
            db r2 = r12.mo56951n1()
            androidx.cardview.widget.CardView r2 = r2.f28097e
            r2.setVisibility(r4)
        L_0x00b8:
            int r2 = r0.getChainId()
            net.safemoon.androidwallet.common.TokenType r6 = net.safemoon.androidwallet.common.TokenType.MULTI_COIN
            int r6 = r6.getChainId()
            java.lang.String r7 = "binding.cvNativeChainWalletAddress"
            java.lang.String r8 = "binding.cvWalletAddress"
            r9 = 1
            if (r2 != r6) goto L_0x0196
            db r13 = r12.mo56951n1()
            androidx.cardview.widget.CardView r13 = r13.f28099g
            p000.vx2.m53590f(r13, r8)
            r13.setVisibility(r4)
            db r13 = r12.mo56951n1()
            androidx.cardview.widget.CardView r13 = r13.f28095c
            p000.vx2.m53590f(r13, r7)
            net.safemoon.androidwallet.model.wallets.Wallet r0 = r12.mo56960t1()
            p000.vx2.m53588d(r0)
            boolean r0 = r0.hasPassphrase()
            if (r0 != 0) goto L_0x0109
            net.safemoon.androidwallet.model.wallets.Wallet r0 = r12.mo56960t1()
            p000.vx2.m53588d(r0)
            java.lang.Integer r0 = r0.getMyCoinType()
            if (r0 != 0) goto L_0x0107
            net.safemoon.androidwallet.common.TokenType r0 = p000.ol0.m70355e(r12)
            net.safemoon.androidwallet.common.MyCoinType r0 = r0.getCoinType()
            net.safemoon.androidwallet.common.SimilarTypeGroup r0 = r0.getSimilarTypeGroup()
            if (r0 != r3) goto L_0x0107
            goto L_0x0109
        L_0x0107:
            r0 = r5
            goto L_0x010a
        L_0x0109:
            r0 = r9
        L_0x010a:
            if (r0 == 0) goto L_0x010e
            r0 = r5
            goto L_0x010f
        L_0x010e:
            r0 = r4
        L_0x010f:
            r13.setVisibility(r0)
            r13 = 2
            net.safemoon.androidwallet.common.TokenType[] r0 = new net.safemoon.androidwallet.common.TokenType[r13]
            net.safemoon.androidwallet.common.TokenType r2 = net.safemoon.androidwallet.common.TokenType.MULTI_COIN_BITCOIN
            r0[r5] = r2
            net.safemoon.androidwallet.common.TokenType r2 = net.safemoon.androidwallet.common.TokenType.MULTI_COIN_DOGE
            r0[r9] = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r13)
            r3 = r5
        L_0x0123:
            if (r3 >= r13) goto L_0x017c
            r6 = r0[r3]
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r12)
            r8 = 2131558625(0x7f0d00e1, float:1.8742571E38)
            android.view.View r7 = r7.inflate(r8, r1)
            sy2 r8 = p000.sy2.m51998a(r7)
            java.lang.String r10 = "bind(this)"
            p000.vx2.m53590f(r8, r10)
            com.google.android.material.button.MaterialButton r10 = r8.f34058b
            ei7 r11 = new ei7
            r11.<init>(r12, r6)
            r10.setOnClickListener(r11)
            android.widget.TextView r8 = r8.f34059c
            java.lang.String r10 = r6.getChainTitle()
            net.safemoon.androidwallet.model.wallets.Wallet r11 = r12.mo56960t1()
            if (r11 == 0) goto L_0x015e
            net.safemoon.androidwallet.common.MyCoinType r6 = r6.getCoinType()
            int r6 = r6.getValue()
            java.lang.String r6 = r11.getAddress(r6)
            goto L_0x015f
        L_0x015e:
            r6 = r1
        L_0x015f:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r10)
            java.lang.String r10 = ": "
            r11.append(r10)
            r11.append(r6)
            java.lang.String r6 = r11.toString()
            r8.setText(r6)
            r2.add(r7)
            int r3 = r3 + 1
            goto L_0x0123
        L_0x017c:
            java.util.Iterator r13 = r2.iterator()
        L_0x0180:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0268
            java.lang.Object r0 = r13.next()
            android.view.View r0 = (android.view.View) r0
            db r2 = r12.mo56951n1()
            androidx.appcompat.widget.LinearLayoutCompat r2 = r2.f28094b
            r2.addView(r0)
            goto L_0x0180
        L_0x0196:
            r2 = 2131952778(0x7f13048a, float:1.9542008E38)
            java.lang.String r2 = r12.getString(r2)
            java.lang.String r6 = "getString(R.string.wallet_address)"
            p000.vx2.m53590f(r2, r6)
            net.safemoon.androidwallet.model.wallets.Wallet r6 = r12.mo56960t1()
            p000.vx2.m53588d(r6)
            boolean r6 = r6.hasPassphrase()
            if (r6 == 0) goto L_0x01b4
            java.lang.String r13 = r0.getTitle()
            goto L_0x01d3
        L_0x01b4:
            int r6 = r0.getChainId()
            net.safemoon.androidwallet.common.TokenType r10 = net.safemoon.androidwallet.common.TokenType.SOLANA
            int r10 = r10.getChainId()
            if (r6 != r10) goto L_0x01cf
            net.safemoon.androidwallet.common.TokenType r0 = net.safemoon.androidwallet.common.TokenType.BEP_20
            int r0 = r0.getChainId()
            net.safemoon.androidwallet.common.TokenType r13 = r13.mo57099b(r0)
            java.lang.String r13 = r13.getTitle()
            goto L_0x01d3
        L_0x01cf:
            java.lang.String r13 = r0.getTitle()
        L_0x01d3:
            db r0 = r12.mo56951n1()
            androidx.cardview.widget.CardView r0 = r0.f28095c
            p000.vx2.m53590f(r0, r7)
            r0.setVisibility(r4)
            db r0 = r12.mo56951n1()
            android.widget.TextView r0 = r0.f28112t
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r13)
            java.lang.String r13 = " "
            r6.append(r13)
            r6.append(r2)
            java.lang.String r13 = r6.toString()
            r0.setText(r13)
            db r13 = r12.mo56951n1()
            android.widget.TextView r13 = r13.f28085I
            net.safemoon.androidwallet.model.wallets.Wallet r0 = r12.mo56960t1()
            if (r0 == 0) goto L_0x0219
            net.safemoon.androidwallet.common.TokenType r2 = p000.ol0.m70355e(r12)
            net.safemoon.androidwallet.common.MyCoinType r2 = r2.getCoinType()
            int r2 = r2.getValue()
            java.lang.String r0 = r0.getAddress(r2)
            goto L_0x021a
        L_0x0219:
            r0 = r1
        L_0x021a:
            r13.setText(r0)
            db r13 = r12.mo56951n1()
            androidx.cardview.widget.CardView r13 = r13.f28099g
            p000.vx2.m53590f(r13, r8)
            net.safemoon.androidwallet.model.wallets.Wallet r0 = r12.mo56960t1()
            p000.vx2.m53588d(r0)
            boolean r0 = r0.hasPassphrase()
            if (r0 != 0) goto L_0x0251
            net.safemoon.androidwallet.model.wallets.Wallet r0 = r12.mo56960t1()
            p000.vx2.m53588d(r0)
            java.lang.Integer r0 = r0.getMyCoinType()
            if (r0 != 0) goto L_0x024f
            net.safemoon.androidwallet.common.TokenType r0 = p000.ol0.m70355e(r12)
            net.safemoon.androidwallet.common.MyCoinType r0 = r0.getCoinType()
            net.safemoon.androidwallet.common.SimilarTypeGroup r0 = r0.getSimilarTypeGroup()
            if (r0 != r3) goto L_0x024f
            goto L_0x0251
        L_0x024f:
            r0 = r5
            goto L_0x0252
        L_0x0251:
            r0 = r9
        L_0x0252:
            if (r0 == 0) goto L_0x0256
            r0 = r5
            goto L_0x0257
        L_0x0256:
            r0 = r4
        L_0x0257:
            r13.setVisibility(r0)
            db r13 = r12.mo56951n1()
            android.widget.TextView r13 = r13.f28084H
            fi7 r0 = new fi7
            r0.<init>(r12)
            r13.setOnClickListener(r0)
        L_0x0268:
            db r13 = r12.mo56951n1()
            android.widget.TextView r13 = r13.f28083G
            gi7 r0 = new gi7
            r0.<init>(r12)
            r13.setOnClickListener(r0)
            db r13 = r12.mo56951n1()
            androidx.cardview.widget.CardView r13 = r13.f28096d
            net.safemoon.androidwallet.model.wallets.Wallet r0 = r12.mo56960t1()
            if (r0 == 0) goto L_0x0287
            java.lang.String r0 = r0.getPassPhrase()
            goto L_0x0288
        L_0x0287:
            r0 = r1
        L_0x0288:
            if (r0 == 0) goto L_0x02a7
            net.safemoon.androidwallet.model.wallets.Wallet r0 = r12.mo56960t1()
            if (r0 == 0) goto L_0x0295
            java.lang.String r0 = r0.getPassPhrase()
            goto L_0x0296
        L_0x0295:
            r0 = r1
        L_0x0296:
            p000.vx2.m53588d(r0)
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x02a1
            r0 = r9
            goto L_0x02a2
        L_0x02a1:
            r0 = r5
        L_0x02a2:
            int r0 = p000.ol0.m70370l0(r0)
            goto L_0x02a8
        L_0x02a7:
            r0 = r4
        L_0x02a8:
            r13.setVisibility(r0)
            db r13 = r12.mo56951n1()
            android.widget.TextView r13 = r13.f28118z
            hi7 r0 = new hi7
            r0.<init>(r12)
            r13.setOnClickListener(r0)
            db r13 = r12.mo56951n1()
            android.widget.TextView r13 = r13.f28081E
            ii7 r0 = new ii7
            r0.<init>(r12)
            r13.setOnClickListener(r0)
            db r13 = r12.mo56951n1()
            android.widget.TextView r13 = r13.f28116x
            pi7 r0 = new pi7
            r0.<init>(r12)
            r13.setOnClickListener(r0)
            db r13 = r12.mo56951n1()
            android.widget.TextView r13 = r13.f28080D
            qi7 r0 = new qi7
            r0.<init>(r12)
            r13.setOnClickListener(r0)
            db r13 = r12.mo56951n1()
            android.widget.TextView r13 = r13.f28087K
            ri7 r0 = new ri7
            r0.<init>(r12)
            r13.setOnClickListener(r0)
            db r13 = r12.mo56951n1()
            android.widget.TextView r13 = r13.f28090N
            si7 r0 = new si7
            r0.<init>(r12)
            r13.setOnClickListener(r0)
            db r13 = r12.mo56951n1()
            android.widget.TextView r13 = r13.f28091O
            ti7 r0 = new ti7
            r0.<init>(r12)
            r13.setOnClickListener(r0)
            db r13 = r12.mo56951n1()
            android.widget.TextView r13 = r13.f28086J
            ui7 r0 = new ui7
            r0.<init>(r12)
            r13.setOnClickListener(r0)
            net.safemoon.androidwallet.model.wallets.Wallet r13 = r12.mo56960t1()
            p000.vx2.m53588d(r13)
            boolean r13 = r13.hasPassphrase()
            if (r13 == 0) goto L_0x032a
            r13 = r5
            goto L_0x032b
        L_0x032a:
            r13 = r4
        L_0x032b:
            db r0 = r12.mo56951n1()
            android.widget.TextView r0 = r0.f28092P
            r0.setVisibility(r13)
            db r0 = r12.mo56951n1()
            android.widget.TextView r0 = r0.f28088L
            r0.setVisibility(r13)
            db r0 = r12.mo56951n1()
            android.widget.TextView r0 = r0.f28089M
            r0.setVisibility(r13)
            db r13 = r12.mo56951n1()
            android.widget.TextView r13 = r13.f28092P
            vi7 r0 = new vi7
            r0.<init>(r12)
            r13.setOnClickListener(r0)
            db r13 = r12.mo56951n1()
            android.widget.TextView r13 = r13.f28088L
            wi7 r0 = new wi7
            r0.<init>(r12)
            r13.setOnClickListener(r0)
            db r13 = r12.mo56951n1()
            android.widget.TextView r13 = r13.f28089M
            zh7 r0 = new zh7
            r0.<init>(r12)
            r13.setOnClickListener(r0)
            net.safemoon.androidwallet.model.wallets.Wallet r13 = p000.ol0.m70351c(r12)
            if (r13 == 0) goto L_0x037b
            java.lang.Long r13 = r13.getId()
            goto L_0x037c
        L_0x037b:
            r13 = r1
        L_0x037c:
            net.safemoon.androidwallet.model.wallets.Wallet r0 = r12.mo56960t1()
            if (r0 == 0) goto L_0x0387
            java.lang.Long r0 = r0.getId()
            goto L_0x0388
        L_0x0387:
            r0 = r1
        L_0x0388:
            boolean r13 = p000.vx2.m53586b(r13, r0)
            if (r13 == 0) goto L_0x0398
            db r13 = r12.mo56951n1()
            androidx.cardview.widget.CardView r13 = r13.f28098f
            r13.setVisibility(r4)
            goto L_0x03a1
        L_0x0398:
            db r13 = r12.mo56951n1()
            androidx.cardview.widget.CardView r13 = r13.f28098f
            r13.setVisibility(r5)
        L_0x03a1:
            net.safemoon.androidwallet.model.wallets.Wallet r13 = r12.mo56960t1()
            if (r13 == 0) goto L_0x03ae
            boolean r13 = r13.isPrimaryWallet()
            if (r13 != r9) goto L_0x03ae
            goto L_0x03af
        L_0x03ae:
            r9 = r5
        L_0x03af:
            if (r9 == 0) goto L_0x0443
            db r13 = r12.mo56951n1()
            com.google.android.material.textfield.TextInputLayout r13 = r13.f28114v
            android.widget.EditText r13 = r13.getEditText()
            if (r13 == 0) goto L_0x03ca
            net.safemoon.androidwallet.model.wallets.Wallet r0 = r12.mo56960t1()
            if (r0 == 0) goto L_0x03c7
            java.lang.String r1 = r0.displayName()
        L_0x03c7:
            r13.setText(r1)
        L_0x03ca:
            db r13 = r12.mo56951n1()
            com.google.android.material.textfield.TextInputLayout r13 = r13.f28114v
            android.widget.EditText r13 = r13.getEditText()
            if (r13 != 0) goto L_0x03d7
            goto L_0x03da
        L_0x03d7:
            r13.setInputType(r5)
        L_0x03da:
            db r13 = r12.mo56951n1()
            androidx.cardview.widget.CardView r13 = r13.f28098f
            r0 = 4
            r13.setVisibility(r0)
            db r13 = r12.mo56951n1()
            vr6 r13 = r13.f28115w
            com.google.android.material.button.MaterialButton r13 = r13.f34992b
            r13.setVisibility(r4)
            db r13 = r12.mo56951n1()
            com.google.android.material.textfield.TextInputLayout r13 = r13.f28114v
            r13.setEndIconMode(r5)
            db r13 = r12.mo56951n1()
            com.google.android.material.textfield.TextInputLayout r13 = r13.f28114v
            r13.setCounterEnabled(r5)
            db r13 = r12.mo56951n1()
            com.google.android.material.textfield.TextInputLayout r13 = r13.f28114v
            android.widget.EditText r13 = r13.getEditText()
            if (r13 == 0) goto L_0x0417
            r0 = 2131099992(0x7f060158, float:1.7812353E38)
            int r0 = r12.getColor(r0)
            r13.setTextColor(r0)
        L_0x0417:
            db r13 = r12.mo56951n1()
            androidx.appcompat.widget.AppCompatImageView r13 = r13.f28106n
            android.view.ViewGroup$LayoutParams r13 = r13.getLayoutParams()
            java.lang.String r0 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams"
            p000.vx2.m53589e(r13, r0)
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r13 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r13
            android.content.res.Resources r0 = r12.getResources()
            r1 = 2131165255(0x7f070047, float:1.7944722E38)
            int r0 = r0.getDimensionPixelSize(r1)
            r13.setMarginEnd(r0)
            r0 = 1056964608(0x3f000000, float:0.5)
            r13.f3109G = r0
            db r13 = r12.mo56951n1()
            androidx.appcompat.widget.AppCompatImageView r13 = r13.f28106n
            r13.requestLayout()
        L_0x0443:
            r12.mo56995J()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.activity.WalletManageActivity.onPostCreate(android.os.Bundle):void");
    }

    public void onResume() {
        super.onResume();
        mo56935X1();
        mo56936Y1();
    }

    /* renamed from: p1 */
    public final G2FAVerfication.C8290b mo56955p1() {
        return new C8209d(this);
    }

    /* renamed from: p2 */
    public final void mo56956p2(int i) {
        if (i == 1) {
            this.f41523p1.mo66750b(this, mo56958r1());
        } else {
            this.f41523p1.mo66750b(this, mo56959s1());
        }
    }

    /* renamed from: q1 */
    public final ClipboardManager mo56957q1() {
        return (ClipboardManager) this.f41515X.getValue();
    }

    /* renamed from: r1 */
    public final wo2.C9557a mo56958r1() {
        return new C8210e(this);
    }

    /* renamed from: s1 */
    public final wo2.C9557a mo56959s1() {
        return new C8211f(this);
    }

    /* renamed from: t1 */
    public final Wallet mo56960t1() {
        return (Wallet) this.f41516Y.getValue();
    }

    /* renamed from: u1 */
    public final AKTWebSocketHandlingViewModel mo56961u1() {
        return (AKTWebSocketHandlingViewModel) this.f41524v0.getValue();
    }

    /* renamed from: v1 */
    public void mo56962v1() {
        mo56961u1().mo60953i().observe(this, new ki7(new WalletManageActivity$initReceiveResponse$1(this)));
    }

    /* renamed from: x1 */
    public final boolean mo56963x1() {
        return ((Boolean) this.f41514U.getValue()).booleanValue();
    }

    /* renamed from: y1 */
    public final void mo56964y1(Wallet wallet2) {
        ProgressLoading.C8308a aVar = ProgressLoading.f41785Y;
        String string = getString(R.string.loading);
        vx2.m53590f(string, "getString(R.string.loading)");
        ProgressLoading a = aVar.mo57297a(false, string, "");
        this.f8528r = a;
        if (a != null) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            vx2.m53590f(supportFragmentManager, "supportFragmentManager");
            a.mo57295D(supportFragmentManager);
        }
        this.f8530x.mo61256r(new WalletManageActivity$makeBlobFromWallets$1(wallet2, this, new StringBuilder()));
    }

    /* renamed from: z1 */
    public final void mo56965z1(String str) {
        boolean z;
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            mo56957q1().setPrimaryClip(ClipData.newPlainText("label", str));
            ol0.m70345Y(this, R.string.copied_to_clipboard);
        }
    }
}
