package net.safemoon.androidwallet.activity;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.FragmentManager;
import com.AKT.anonymouskey.p008ui.login.AKTServerFunctions;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Locale;
import kotlin.C6169a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.dialogs.ProgressLoading;
import net.safemoon.androidwallet.model.wallets.Wallet;
import net.safemoon.androidwallet.utils.Common;
import net.safemoon.androidwallet.viewmodels.AKTWebSocketHandlingViewModel;
import net.safemoon.androidwallet.viewmodels.MultiWalletViewModel;
import net.safemoon.androidwallet.views.CustomRecoveryWalletLayout;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 S2\u00020\u0001:\u0001TB\u0007¢\u0006\u0004\bQ\u0010RJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0005H\u0002J\b\u0010\t\u001a\u00020\u0005H\u0002J\"\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fH\u0002J\b\u0010\u0010\u001a\u00020\u0005H\u0002J\u001d\u0010\u0013\u001a\u00020\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0017\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014J\u0012\u0010\u0018\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014J\u0012\u0010\u001a\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\nH\u0016J\u001c\u0010\u001d\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0019\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010\u001f\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010 \u001a\u00020\u0005H\u0016J\b\u0010!\u001a\u00020\u0005H\u0016J+\u0010#\u001a\u00020\u00052\u0010\u0010\u0012\u001a\f\u0012\u0006\b\u0001\u0012\u00020\n\u0018\u00010\u00112\b\u0010\"\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020%8BX\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\"\u0010/\u001a\u0010\u0012\f\u0012\n ,*\u0004\u0018\u00010\f0\f0+8\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001b\u00104\u001a\u0002008BX\u0002¢\u0006\f\n\u0004\b1\u0010'\u001a\u0004\b2\u00103R\u001b\u00108\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b5\u0010'\u001a\u0004\b6\u00107R\u001b\u0010<\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b9\u0010'\u001a\u0004\b:\u0010;R\u001b\u0010?\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b=\u0010'\u001a\u0004\b>\u00107R\u001b\u0010B\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b@\u0010'\u001a\u0004\bA\u00107R\u001b\u0010E\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\bC\u0010'\u001a\u0004\bD\u00107R\u0016\u0010H\u001a\u00020F8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bG\u00109R\u0016\u0010L\u001a\u00020I8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u001b\u0010P\u001a\u00020M8BX\u0002¢\u0006\f\n\u0004\b!\u0010'\u001a\u0004\bN\u0010O¨\u0006U"}, mo44877d2 = {"Lnet/safemoon/androidwallet/activity/AKTImportExistingWalletsActivity;", "Lcom/AKT/anonymouskey/ui/login/AKTServerFunctions;", "", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "wallets", "Lr37;", "W0", "U0", "X0", "b1", "", "mnemonic", "", "isRegister", "isImportExistingWalletsOnLogin", "Z0", "Y0", "", "parts", "T0", "([Ljava/lang/String;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onPostCreate", "message", "d0", "Low7;", "safeMoonppp", "e0", "toSend", "V0", "K0", "X", "aktapiid", "f0", "([Ljava/lang/String;Ljava/lang/String;)V", "Lo9;", "A", "Lef3;", "D0", "()Lo9;", "binding", "Lk04;", "kotlin.jvm.PlatformType", "B", "Lk04;", "copiedMyWallet", "Lnet/safemoon/androidwallet/viewmodels/MultiWalletViewModel;", "C", "F0", "()Lnet/safemoon/androidwallet/viewmodels/MultiWalletViewModel;", "multiWalletVM", "H", "H0", "()Ljava/lang/String;", "registerParam", "I", "N0", "()Z", "isLoginCase", "L", "E0", "masterMnemonic", "M", "I0", "username", "P", "G0", "password", "", "Q", "tryingLoginCount", "Lnet/safemoon/androidwallet/utils/Common$RequestSocketState;", "U", "Lnet/safemoon/androidwallet/utils/Common$RequestSocketState;", "socketState", "Lnet/safemoon/androidwallet/viewmodels/AKTWebSocketHandlingViewModel;", "J0", "()Lnet/safemoon/androidwallet/viewmodels/AKTWebSocketHandlingViewModel;", "webSocketModel", "<init>", "()V", "Y", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: AKTImportExistingWalletsActivity.kt */
public final class AKTImportExistingWalletsActivity extends AKTServerFunctions {

    /* renamed from: Y */
    public static final C8133a f41282Y = new C8133a((DefaultConstructorMarker) null);

    /* renamed from: A */
    public final ef3 f41283A = C6169a.m47232a(new AKTImportExistingWalletsActivity$binding$2(this));

    /* renamed from: B */
    public final k04<Boolean> f41284B = new k04<>(Boolean.FALSE);

    /* renamed from: C */
    public final ef3 f41285C = new dd7(ua5.m52727b(MultiWalletViewModel.class), new C8135x77893f57(this), new C8134x77893f56(this), new C8136x77893f58((pc2) null, this));

    /* renamed from: H */
    public final ef3 f41286H = C6169a.m47232a(new AKTImportExistingWalletsActivity$registerParam$2(this));

    /* renamed from: I */
    public final ef3 f41287I = C6169a.m47232a(new AKTImportExistingWalletsActivity$isLoginCase$2(this));

    /* renamed from: L */
    public final ef3 f41288L = C6169a.m47232a(new AKTImportExistingWalletsActivity$masterMnemonic$2(this));

    /* renamed from: M */
    public final ef3 f41289M = C6169a.m47232a(new AKTImportExistingWalletsActivity$username$2(this));

    /* renamed from: P */
    public final ef3 f41290P = C6169a.m47232a(new AKTImportExistingWalletsActivity$password$2(this));

    /* renamed from: Q */
    public int f41291Q = 2;

    /* renamed from: U */
    public Common.RequestSocketState f41292U = Common.RequestSocketState.NONE;

    /* renamed from: X */
    public final ef3 f41293X = new dd7(ua5.m52727b(AKTWebSocketHandlingViewModel.class), new C8138x77893f5a(this), new C8137x77893f59(this), new C8139x77893f5b((pc2) null, this));

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J@\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0004R\u0014\u0010\r\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e¨\u0006\u0013"}, mo44877d2 = {"Lnet/safemoon/androidwallet/activity/AKTImportExistingWalletsActivity$a;", "", "Landroid/content/Context;", "context", "", "registerParam", "", "isLoginCase", "masterMnemonic", "username", "password", "Lr37;", "a", "KEY_IS_LOGIN", "Ljava/lang/String;", "KEY_MASTER_MNEMONIC", "KEY_REGISTER_PARAM", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.activity.AKTImportExistingWalletsActivity$a */
    /* compiled from: AKTImportExistingWalletsActivity.kt */
    public static final class C8133a {
        public C8133a() {
        }

        public /* synthetic */ C8133a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ void m64946b(C8133a aVar, Context context, String str, boolean z, String str2, String str3, String str4, int i, Object obj) {
            String str5;
            boolean z2;
            String str6;
            String str7;
            String str8 = "";
            if ((i & 2) != 0) {
                str5 = str8;
            } else {
                str5 = str;
            }
            if ((i & 4) != 0) {
                z2 = false;
            } else {
                z2 = z;
            }
            if ((i & 8) != 0) {
                str6 = str8;
            } else {
                str6 = str2;
            }
            if ((i & 16) != 0) {
                str7 = str8;
            } else {
                str7 = str3;
            }
            if ((i & 32) == 0) {
                str8 = str4;
            }
            aVar.mo56646a(context, str5, z2, str6, str7, str8);
        }

        /* renamed from: a */
        public final void mo56646a(Context context, String str, boolean z, String str2, String str3, String str4) {
            vx2.m53591g(context, "context");
            vx2.m53591g(str, "registerParam");
            vx2.m53591g(str2, "masterMnemonic");
            vx2.m53591g(str3, "username");
            vx2.m53591g(str4, "password");
            Intent intent = new Intent(context, AKTImportExistingWalletsActivity.class);
            intent.putExtra("KEY_REGISTER_PARAM", str);
            intent.putExtra("KEY_IS_LOGIN", z);
            intent.putExtra("KEY_MASTER_MNEMONIC", str2);
            intent.putExtra("KEY_USERNAME", str3);
            intent.putExtra("KEY_PASSWORD", str4);
            context.startActivity(intent);
        }
    }

    /* renamed from: L0 */
    public static final void m64904L0(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: M0 */
    public static final void m64905M0(AKTImportExistingWalletsActivity aKTImportExistingWalletsActivity) {
        vx2.m53591g(aKTImportExistingWalletsActivity, "this$0");
        aKTImportExistingWalletsActivity.mo56643Y0();
    }

    /* renamed from: O0 */
    public static final void m64906O0(AKTImportExistingWalletsActivity aKTImportExistingWalletsActivity, View view) {
        vx2.m53591g(aKTImportExistingWalletsActivity, "this$0");
        aKTImportExistingWalletsActivity.onBackPressed();
    }

    /* renamed from: P0 */
    public static final void m64907P0(AKTImportExistingWalletsActivity aKTImportExistingWalletsActivity, CompoundButton compoundButton, boolean z) {
        vx2.m53591g(aKTImportExistingWalletsActivity, "this$0");
        aKTImportExistingWalletsActivity.f41284B.setValue(Boolean.valueOf(z));
        aKTImportExistingWalletsActivity.mo56645b1();
    }

    /* renamed from: Q0 */
    public static final void m64908Q0(AKTImportExistingWalletsActivity aKTImportExistingWalletsActivity, View view) {
        vx2.m53591g(aKTImportExistingWalletsActivity, "this$0");
        ProgressLoading.C8308a aVar = ProgressLoading.f41785Y;
        String string = aKTImportExistingWalletsActivity.getString(R.string.loading);
        vx2.m53590f(string, "getString(R.string.loading)");
        ProgressLoading a = aVar.mo57297a(false, string, "");
        aKTImportExistingWalletsActivity.f8528r = a;
        if (a != null) {
            FragmentManager supportFragmentManager = aKTImportExistingWalletsActivity.getSupportFragmentManager();
            vx2.m53590f(supportFragmentManager, "supportFragmentManager");
            a.mo57295D(supportFragmentManager);
        }
        aKTImportExistingWalletsActivity.mo56640V0(aKTImportExistingWalletsActivity.mo56633H0());
    }

    /* renamed from: R0 */
    public static final void m64909R0(AKTImportExistingWalletsActivity aKTImportExistingWalletsActivity, View view) {
        vx2.m53591g(aKTImportExistingWalletsActivity, "this$0");
        C9001np.m69930O(new WeakReference(aKTImportExistingWalletsActivity), Integer.valueOf(R.string.akt_login_and_import_existing_wallets_confirm_dialog_header), R.string.akt_login_and_import_existing_wallets_confirm_dialog_content, R.string.confirm, R.string.cancel, new AKTImportExistingWalletsActivity$onPostCreate$1$4$1(aKTImportExistingWalletsActivity), AKTImportExistingWalletsActivity$onPostCreate$1$4$2.INSTANCE);
    }

    /* renamed from: S0 */
    public static final void m64910S0(AKTImportExistingWalletsActivity aKTImportExistingWalletsActivity, View view) {
        vx2.m53591g(aKTImportExistingWalletsActivity, "this$0");
        C9001np.m69930O(new WeakReference(aKTImportExistingWalletsActivity), Integer.valueOf(R.string.akt_login_and_not_import_existing_wallets_confirm_dialog_header), R.string.akt_login_and_not_import_existing_wallets_confirm_dialog_content, R.string.confirm, R.string.cancel, new AKTImportExistingWalletsActivity$onPostCreate$1$5$1(aKTImportExistingWalletsActivity), AKTImportExistingWalletsActivity$onPostCreate$1$5$2.INSTANCE);
    }

    /* renamed from: a1 */
    public static /* synthetic */ void m64911a1(AKTImportExistingWalletsActivity aKTImportExistingWalletsActivity, String str, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z2 = false;
        }
        aKTImportExistingWalletsActivity.mo56644Z0(str, z, z2);
    }

    /* renamed from: D0 */
    public final C6309o9 mo56629D0() {
        return (C6309o9) this.f41283A.getValue();
    }

    /* renamed from: E0 */
    public final String mo56630E0() {
        return (String) this.f41288L.getValue();
    }

    /* renamed from: F0 */
    public final MultiWalletViewModel mo56631F0() {
        return (MultiWalletViewModel) this.f41285C.getValue();
    }

    /* renamed from: G0 */
    public final String mo56632G0() {
        return (String) this.f41290P.getValue();
    }

    /* renamed from: H0 */
    public final String mo56633H0() {
        return (String) this.f41286H.getValue();
    }

    /* renamed from: I0 */
    public final String mo56634I0() {
        return (String) this.f41289M.getValue();
    }

    /* renamed from: J0 */
    public final AKTWebSocketHandlingViewModel mo56635J0() {
        return (AKTWebSocketHandlingViewModel) this.f41293X.getValue();
    }

    /* renamed from: K0 */
    public void mo56636K0() {
        mo56635J0().mo60953i().observe(this, new C9148p0(new AKTImportExistingWalletsActivity$initReceiveResponse$1(this)));
    }

    /* renamed from: N0 */
    public final boolean mo56637N0() {
        return ((Boolean) this.f41287I.getValue()).booleanValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0055, code lost:
        if (r0 == true) goto L_0x0059;
     */
    /* renamed from: T0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo56638T0(java.lang.String[] r12) {
        /*
            r11 = this;
            int r0 = r12.length
            r1 = 1
            r2 = 0
            r3 = r1
        L_0x0004:
            r4 = 0
            if (r3 >= r0) goto L_0x0032
            r5 = r12[r3]
            java.lang.String r6 = "="
            java.lang.String[] r6 = new java.lang.String[]{r6}
            r7 = 0
            r8 = 0
            r9 = 6
            r10 = 0
            java.util.List r5 = kotlin.text.StringsKt__StringsKt.m63061B0(r5, r6, r7, r8, r9, r10)
            java.lang.String[] r6 = new java.lang.String[r4]
            java.lang.Object[] r5 = r5.toArray(r6)
            java.lang.String[] r5 = (java.lang.String[]) r5
            int r6 = r5.length
            r7 = 2
            if (r6 < r7) goto L_0x002f
            r4 = r5[r4]
            java.lang.String r6 = "APIKEY"
            boolean r4 = p000.vx2.m53586b(r4, r6)
            if (r4 == 0) goto L_0x002f
            r2 = r5[r1]
        L_0x002f:
            int r3 = r3 + 1
            goto L_0x0004
        L_0x0032:
            java.lang.String r12 = "PB5K"
            java.lang.String r0 = ""
            java.lang.String r12 = p000.f06.m57519j(r11, r12, r0)
            ex7 r0 = new ex7
            r0.<init>()
            java.lang.String r12 = p000.C3311sx.m27171a(r12)
            r0.mo19535t(r12)
            java.lang.String r12 = r0.mo19517b(r2)
            if (r12 == 0) goto L_0x0058
            int r0 = r12.length()
            if (r0 <= 0) goto L_0x0054
            r0 = r1
            goto L_0x0055
        L_0x0054:
            r0 = r4
        L_0x0055:
            if (r0 != r1) goto L_0x0058
            goto L_0x0059
        L_0x0058:
            r1 = r4
        L_0x0059:
            if (r1 == 0) goto L_0x0060
            java.lang.String r0 = "API_KEY"
            p000.up1.m72960e(r11, r0, r12)
        L_0x0060:
            net.safemoon.androidwallet.utils.Common r12 = net.safemoon.androidwallet.utils.Common.f42577a
            r12.mo60898d(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.activity.AKTImportExistingWalletsActivity.mo56638T0(java.lang.String[]):void");
    }

    /* renamed from: U0 */
    public final void mo56639U0() {
        f06.m57522m(this, "TIMENOW", C2127d2.m14635B());
        String g = this.f8531y.mo24213g("EMAIL");
        String g2 = this.f8531y.mo24213g("KA");
        String g3 = this.f8531y.mo24213g("PBU5");
        String g4 = this.f8531y.mo24213g("PB5K");
        String g5 = this.f8531y.mo24213g("U5");
        String g6 = this.f8531y.mo24213g("K5");
        String g7 = this.f8531y.mo24213g("UK5");
        this.f8531y.mo24213g("PBHEX");
        f06.m57524o(this, "EMAIL", g);
        f06.m57524o(this, "KA", g2);
        f06.m57524o(this, "PBU5", g3);
        f06.m57524o(this, "U5", g5);
        f06.m57524o(this, "PB5K", g4);
        if (f06.m57512c(this, "TEMPU5")) {
            f06.m57520k(this, "TEMPU5");
        }
        if (f06.m57512c(this, "TEMPK5")) {
            f06.m57520k(this, "TEMPK5");
        }
        mo12167j0("K5", g6);
        mo12167j0("UK5", g7);
    }

    /* renamed from: V0 */
    public void mo56640V0(String str) {
        if (str != null) {
            mo56635J0().mo60956l(str);
        }
    }

    /* renamed from: W0 */
    public final void mo56641W0(List<Wallet> list) {
        if (!list.isEmpty()) {
            C6309o9 D0 = mo56629D0();
            for (Wallet wallet2 : list) {
                CustomRecoveryWalletLayout customRecoveryWalletLayout = new CustomRecoveryWalletLayout(this);
                customRecoveryWalletLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                D0.f32307g.addView(customRecoveryWalletLayout);
                customRecoveryWalletLayout.setAttachedActivity(this);
                customRecoveryWalletLayout.setupRecoveryWallet(wallet2);
            }
        }
    }

    /* renamed from: X */
    public void mo12159X() {
        mo56635J0().mo60951g();
    }

    /* renamed from: X0 */
    public final void mo56642X0() {
        ProgressLoading progressLoading = this.f8528r;
        if (progressLoading != null) {
            progressLoading.mo22266k();
        }
        Dialog W = C9001np.m69938W(new WeakReference(this), Integer.valueOf(R.string.akt_login_and_import_existing_wallets_success_dialog_header), Integer.valueOf(R.string.akt_login_and_import_existing_wallets_success_dialog_content), R.string.akt_register_success_dialog_button, new C8140x3f97cdf5(this));
        if (W != null) {
            W.setCancelable(false);
        }
        if (W != null) {
            W.setCanceledOnTouchOutside(false);
        }
    }

    /* renamed from: Y0 */
    public final void mo56643Y0() {
        String str;
        if (C9198q.f44131b) {
            str = C2127d2.m14640e(this.f8531y, mo56634I0(), mo56632G0());
            vx2.m53590f(str, "{\n            AKTSecpUti…d\n            )\n        }");
        } else {
            str = mo12156T(this.f8531y, mo56634I0(), mo56632G0());
            vx2.m53590f(str, "{\n            anonymizeA…name, password)\n        }");
        }
        this.f41292U = Common.RequestSocketState.LOGIN;
        mo56635J0().mo60956l(str);
    }

    /* renamed from: Z0 */
    public final void mo56644Z0(String str, boolean z, boolean z2) {
        ProgressLoading progressLoading = this.f8528r;
        if (progressLoading != null) {
            progressLoading.mo22266k();
        }
        StartWalletActivity.f41482b1.mo56907a(this, z, str, false);
        finish();
    }

    /* renamed from: b1 */
    public final void mo56645b1() {
        if (vx2.m53586b(this.f41284B.getValue(), Boolean.FALSE)) {
            mo56629D0().f32302b.setTextColor(getColor(R.color.white));
            mo56629D0().f32302b.setEnabled(false);
            mo56629D0().f32302b.setBackgroundTintList(getColorStateList(R.color.akt_button_inactive));
            return;
        }
        mo56629D0().f32302b.setTextColor(getColor(R.color.black));
        mo56629D0().f32302b.setEnabled(true);
        mo56629D0().f32302b.setBackgroundTintList(getColorStateList(R.color.akt_button_active));
    }

    /* renamed from: d0 */
    public boolean mo12163d0(String str) {
        String str2;
        int i;
        if (str != null) {
            str2 = str.toUpperCase(Locale.ROOT);
            vx2.m53590f(str2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        } else {
            str2 = null;
        }
        boolean b = vx2.m53586b(str2, "CONNECTION_REFUSED");
        if (b && this.f41292U == Common.RequestSocketState.LOGIN && (i = this.f41291Q) > 0) {
            this.f41291Q = i - 1;
            mo12159X();
            new Handler(Looper.getMainLooper()).postDelayed(new C9427v0(this), 300);
            return true;
        } else if (!b) {
            return false;
        } else {
            this.f41292U = Common.RequestSocketState.NONE;
            ProgressLoading progressLoading = this.f8528r;
            if (progressLoading != null) {
                progressLoading.mo22266k();
            }
            mo57001Q(true);
            mo12159X();
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f1, code lost:
        if (r4.equals("GR8REG02") == false) goto L_0x0129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0107, code lost:
        if (r4.equals("AKTSFMREG02") == false) goto L_0x0129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0110, code lost:
        if (r4.equals("SFMREG02") == false) goto L_0x0129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0113, code lost:
        if (r1 == null) goto L_0x011c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0115, code lost:
        r1.mo24209c("KA", p000.f06.m57518i(r0, "KA"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x011c, code lost:
        p000.f06.m57522m(r0, "TIMENOW", p000.C2127d2.m14635B());
        mo56643Y0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0129, code lost:
        super.mo12164e0(r21, r22);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        return;
     */
    /* renamed from: e0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo12164e0(p000.ow7 r21, java.lang.String r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            boolean r3 = r0.mo12163d0(r2)
            if (r3 == 0) goto L_0x000d
            return
        L_0x000d:
            net.safemoon.androidwallet.utils.Common$RequestSocketState r3 = net.safemoon.androidwallet.utils.Common.RequestSocketState.NONE
            r0.f41292U = r3
            net.safemoon.androidwallet.utils.Common r3 = net.safemoon.androidwallet.utils.Common.f42577a
            java.lang.String r3 = r3.mo60918y(r0, r2)
            java.lang.String r4 = "|"
            java.lang.String[] r3 = p000.C2127d2.m14658w(r3, r4)
            net.safemoon.androidwallet.dialogs.ProgressLoading r4 = r0.f8528r
            if (r4 == 0) goto L_0x0024
            r4.mo22266k()
        L_0x0024:
            java.lang.String r4 = "parts"
            p000.vx2.m53590f(r3, r4)
            int r4 = r3.length
            r5 = 1
            r6 = 0
            if (r4 != 0) goto L_0x0030
            r4 = r5
            goto L_0x0031
        L_0x0030:
            r4 = r6
        L_0x0031:
            r4 = r4 ^ r5
            if (r4 == 0) goto L_0x012c
            r7 = r3[r6]
            java.lang.String r4 = "parts[0]"
            p000.vx2.m53590f(r7, r4)
            java.lang.String r13 = "="
            java.lang.String[] r8 = new java.lang.String[]{r13}
            r9 = 0
            r10 = 0
            r11 = 6
            r12 = 0
            java.util.List r7 = kotlin.text.StringsKt__StringsKt.m63061B0(r7, r8, r9, r10, r11, r12)
            int r7 = r7.size()
            r8 = 2
            if (r7 < r8) goto L_0x012c
            r14 = r3[r6]
            p000.vx2.m53590f(r14, r4)
            java.lang.String[] r15 = new java.lang.String[]{r13}
            r16 = 0
            r17 = 0
            r18 = 6
            r19 = 0
            java.util.List r4 = kotlin.text.StringsKt__StringsKt.m63061B0(r14, r15, r16, r17, r18, r19)
            java.lang.Object r4 = r4.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Locale r5 = java.util.Locale.ROOT
            java.lang.String r4 = r4.toUpperCase(r5)
            java.lang.String r5 = "this as java.lang.String).toUpperCase(Locale.ROOT)"
            p000.vx2.m53590f(r4, r5)
            r20.mo12159X()
            int r5 = r4.hashCode()
            r7 = 0
            java.lang.String r8 = "KA"
            switch(r5) {
                case -1392583332: goto L_0x010a;
                case -1291267898: goto L_0x0101;
                case 325952731: goto L_0x00f4;
                case 627426537: goto L_0x00eb;
                case 789732987: goto L_0x0085;
                default: goto L_0x0083;
            }
        L_0x0083:
            goto L_0x0129
        L_0x0085:
            java.lang.String r5 = "AKTSFMUSER"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x008f
            goto L_0x0129
        L_0x008f:
            net.safemoon.androidwallet.dialogs.ProgressLoading r2 = r0.f8528r
            if (r2 == 0) goto L_0x0096
            r2.mo22266k()
        L_0x0096:
            r0.mo56638T0(r3)
            if (r1 == 0) goto L_0x00a0
            java.lang.String r2 = r1.mo24213g(r8)
            goto L_0x00a1
        L_0x00a0:
            r2 = r7
        L_0x00a1:
            if (r1 == 0) goto L_0x00a9
            java.lang.String r4 = "UK5"
            java.lang.String r7 = r1.mo24213g(r4)
        L_0x00a9:
            p000.C2127d2.m14660y(r1, r3)
            java.lang.String r3 = p000.C2935o.m23571f(r7, r2)
            java.lang.String r3 = p000.C2127d2.m14648m(r3)
            java.lang.String r4 = "MNEMONIC"
            if (r1 == 0) goto L_0x00bb
            r1.mo24209c(r4, r3)
        L_0x00bb:
            p000.f06.m57524o(r0, r4, r3)
            p000.f06.m57524o(r0, r8, r2)
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r0)
            r2 = 2131951748(0x7f130084, float:1.953992E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4 = 2131951731(0x7f130073, float:1.9539885E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 2131951746(0x7f130082, float:1.9539915E38)
            net.safemoon.androidwallet.activity.AKTImportExistingWalletsActivity$parseMessage$dialog$1 r7 = new net.safemoon.androidwallet.activity.AKTImportExistingWalletsActivity$parseMessage$dialog$1
            r7.<init>(r0, r3)
            android.app.Dialog r1 = p000.C9001np.m69938W(r1, r2, r4, r5, r7)
            if (r1 == 0) goto L_0x00e5
            r1.setCancelable(r6)
        L_0x00e5:
            if (r1 == 0) goto L_0x012c
            r1.setCanceledOnTouchOutside(r6)
            goto L_0x012c
        L_0x00eb:
            java.lang.String r3 = "GR8REG02"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L_0x0113
            goto L_0x0129
        L_0x00f4:
            java.lang.String r5 = "AKTSERVERERROR"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x00fd
            goto L_0x0129
        L_0x00fd:
            r0.mo12165f0(r3, r7)
            goto L_0x012c
        L_0x0101:
            java.lang.String r3 = "AKTSFMREG02"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L_0x0113
            goto L_0x0129
        L_0x010a:
            java.lang.String r3 = "SFMREG02"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L_0x0113
            goto L_0x0129
        L_0x0113:
            if (r1 == 0) goto L_0x011c
            java.lang.String r2 = p000.f06.m57518i(r0, r8)
            r1.mo24209c(r8, r2)
        L_0x011c:
            long r1 = p000.C2127d2.m14635B()
            java.lang.String r3 = "TIMENOW"
            p000.f06.m57522m(r0, r3, r1)
            r20.mo56643Y0()
            goto L_0x012c
        L_0x0129:
            super.mo12164e0(r21, r22)
        L_0x012c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.activity.AKTImportExistingWalletsActivity.mo12164e0(ow7, java.lang.String):void");
    }

    /* renamed from: f0 */
    public void mo12165f0(String[] strArr, String str) {
        this.f8528r.mo22266k();
        C9001np.m69939X(new WeakReference(this), (Integer) null, Integer.valueOf(R.string.akt_error_cannot_register_new_key_message), 0, (pc2) null, 26, (Object) null);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((View) mo56629D0().mo46356b());
        mo56635J0().mo60957m();
        mo56636K0();
        if (!y40.f35760b.booleanValue()) {
            mo56999O(true);
            k85.m20571a(this, true);
        }
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo959l();
        }
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(zr0.m31440c(this, 17170445));
        getWindow().setBackgroundDrawable(new ColorDrawable(getColor(R.color.akt_night_background)));
        mo56631F0().mo61256r(new AKTImportExistingWalletsActivity$onCreate$1(this));
    }

    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        C6309o9 D0 = mo56629D0();
        D0.f32309i.f21597e.setText(R.string.akt_existing_wallets_title);
        D0.f32309i.f21594b.setOnClickListener(new C9199q0(this));
        D0.f32305e.setOnCheckedChangeListener(new C9227r0(this));
        mo56645b1();
        D0.f32302b.setOnClickListener(new C9294s0(this));
        if (mo56637N0()) {
            D0.f32305e.setVisibility(8);
            D0.f32302b.setVisibility(8);
            D0.f32311k.setVisibility(0);
            D0.f32312l.setVisibility(0);
            D0.f32304d.setVisibility(0);
            D0.f32303c.setVisibility(0);
            D0.f32310j.setText(R.string.akt_existing_wallets_on_login_header);
            D0.f32313m.setText(R.string.akt_existing_wallets_on_login_notice_content);
            D0.f32304d.setOnClickListener(new C9318t0(this));
            D0.f32303c.setOnClickListener(new C9378u0(this));
        }
    }
}
