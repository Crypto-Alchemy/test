package net.safemoon.androidwallet.activity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.ActionBar;
import com.AKT.anonymouskey.p008ui.login.AKTServerFunctions;
import kotlin.Metadata;
import net.safemoon.androidwallet.MyApplicationClass;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.viewmodels.CreateWalletViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J&\u0010\n\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0004J\b\u0010\u000b\u001a\u00020\u0004H\u0004J\b\u0010\f\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\u0004H\u0002R\u001b\u0010\u0013\u001a\u00020\u000e8DX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, mo44877d2 = {"Lnet/safemoon/androidwallet/activity/AKTRecoverWalletActivity;", "Lcom/AKT/anonymouskey/ui/login/AKTServerFunctions;", "Landroid/os/Bundle;", "savedInstanceState", "Lr37;", "onCreate", "", "address", "privateKey", "mnemonic", "t0", "v0", "X", "s0", "Lnet/safemoon/androidwallet/viewmodels/CreateWalletViewModel;", "A", "Lef3;", "r0", "()Lnet/safemoon/androidwallet/viewmodels/CreateWalletViewModel;", "createWalletViewModel", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: AKTRecoverWalletActivity.kt */
public class AKTRecoverWalletActivity extends AKTServerFunctions {

    /* renamed from: A */
    public final ef3 f41314A = new dd7(ua5.m52727b(CreateWalletViewModel.class), new AKTRecoverWalletActivity$special$$inlined$viewModels$default$2(this), new AKTRecoverWalletActivity$special$$inlined$viewModels$default$1(this), new AKTRecoverWalletActivity$special$$inlined$viewModels$default$3((pc2) null, this));

    /* renamed from: u0 */
    public static final void m65047u0(DialogInterface dialogInterface) {
    }

    /* renamed from: w0 */
    public static final void m65048w0(DialogInterface dialogInterface, int i) {
        vx2.m53591g(dialogInterface, "dialog");
        dialogInterface.dismiss();
    }

    /* renamed from: X */
    public void mo12159X() {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo959l();
        }
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(zr0.m31440c(this, 17170445));
        getWindow().setBackgroundDrawableResource(R.drawable.ic_bg);
    }

    /* renamed from: r0 */
    public final CreateWalletViewModel mo56688r0() {
        return (CreateWalletViewModel) this.f41314A.getValue();
    }

    /* renamed from: s0 */
    public final void mo56689s0() {
        MyApplicationClass.m64669c().f41193y = true;
        f06.m57524o(this, "DEFAULT_GATEWAY", TokenType.BEP_20.getName());
        AKTHomeActivity.m64858g1(this);
        finish();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0014  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0045  */
    /* renamed from: t0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo56690t0(java.lang.String r13, java.lang.String r14, java.lang.String r15) {
        /*
            r12 = this;
            r0 = 0
            r1 = 1
            if (r13 == 0) goto L_0x0011
            int r2 = r13.length()
            if (r2 <= 0) goto L_0x000c
            r2 = r1
            goto L_0x000d
        L_0x000c:
            r2 = r0
        L_0x000d:
            if (r2 != r1) goto L_0x0011
            r2 = r1
            goto L_0x0012
        L_0x0011:
            r2 = r0
        L_0x0012:
            if (r2 == 0) goto L_0x0041
            if (r14 == 0) goto L_0x0022
            int r2 = r14.length()
            if (r2 <= 0) goto L_0x001e
            r2 = r1
            goto L_0x001f
        L_0x001e:
            r2 = r0
        L_0x001f:
            if (r2 != r1) goto L_0x0022
            r0 = r1
        L_0x0022:
            if (r0 == 0) goto L_0x0041
            net.safemoon.androidwallet.viewmodels.MultiWalletViewModel r2 = r12.f8530x
            java.lang.String r0 = "walletViewModel"
            p000.vx2.m53590f(r2, r0)
            if (r15 != 0) goto L_0x002f
            java.lang.String r15 = ""
        L_0x002f:
            r5 = r15
            r6 = 0
            r7 = 0
            r8 = 0
            net.safemoon.androidwallet.activity.AKTRecoverWalletActivity$importWallet$1 r9 = new net.safemoon.androidwallet.activity.AKTRecoverWalletActivity$importWallet$1
            r9.<init>(r12)
            r10 = 56
            r11 = 0
            r3 = r14
            r4 = r13
            net.safemoon.androidwallet.viewmodels.MultiWalletViewModel.m68673p(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0054
        L_0x0041:
            net.safemoon.androidwallet.dialogs.ProgressLoading r13 = r12.f8528r
            if (r13 == 0) goto L_0x0048
            r13.mo22266k()
        L_0x0048:
            r13 = 0
            r14 = 2131952375(0x7f1302f7, float:1.954119E38)
            r1 r15 = new r1
            r15.<init>()
            p000.fy0.m57956e(r12, r13, r14, r1, r15)
        L_0x0054:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.activity.AKTRecoverWalletActivity.mo56690t0(java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* renamed from: v0 */
    public final void mo56691v0() {
        new AlertDialog.Builder(this).setTitle(getString(R.string.title_invalid_passphrase)).setMessage(getString(R.string.message_invalid_passphrase)).setPositiveButton("Ok", new C9200q1()).show();
    }
}
