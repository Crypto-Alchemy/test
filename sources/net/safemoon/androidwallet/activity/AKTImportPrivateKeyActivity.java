package net.safemoon.androidwallet.activity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.textfield.TextInputEditText;
import kotlin.C6169a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.dialogs.ProgressLoading;
import net.safemoon.androidwallet.viewmodels.CreateWalletViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\b\u0010\u000b\u001a\u00020\u0004H\u0002J\u0012\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\bH\u0002R\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, mo44877d2 = {"Lnet/safemoon/androidwallet/activity/AKTImportPrivateKeyActivity;", "Lnet/safemoon/androidwallet/activity/AKTRecoverWalletActivity;", "Landroid/os/Bundle;", "savedInstanceState", "Lr37;", "onCreate", "onPostCreate", "H0", "", "_privateKey", "E0", "L0", "key", "", "M0", "Lfa;", "B", "Lef3;", "G0", "()Lfa;", "binding", "<init>", "()V", "C", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: AKTImportPrivateKeyActivity.kt */
public final class AKTImportPrivateKeyActivity extends AKTRecoverWalletActivity {

    /* renamed from: C */
    public static final C8141a f41294C = new C8141a((DefaultConstructorMarker) null);

    /* renamed from: B */
    public final ef3 f41295B = C6169a.m47232a(new AKTImportPrivateKeyActivity$binding$2(this));

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, mo44877d2 = {"Lnet/safemoon/androidwallet/activity/AKTImportPrivateKeyActivity$a;", "", "Landroid/content/Context;", "context", "Lr37;", "a", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.activity.AKTImportPrivateKeyActivity$a */
    /* compiled from: AKTImportPrivateKeyActivity.kt */
    public static final class C8141a {
        public C8141a() {
        }

        public /* synthetic */ C8141a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo56654a(Context context) {
            vx2.m53591g(context, "context");
            context.startActivity(new Intent(context, AKTImportPrivateKeyActivity.class));
        }
    }

    /* renamed from: F0 */
    public static final void m64958F0(DialogInterface dialogInterface) {
    }

    /* renamed from: I0 */
    public static final void m64959I0(C5837fa faVar, AKTImportPrivateKeyActivity aKTImportPrivateKeyActivity, View view) {
        String str;
        vx2.m53591g(faVar, "$this_apply");
        vx2.m53591g(aKTImportPrivateKeyActivity, "this$0");
        Editable text = faVar.f28797d.getText();
        if (text != null) {
            str = text.toString();
        } else {
            str = null;
        }
        if (!aKTImportPrivateKeyActivity.mo56653M0(str)) {
            fy0.m57956e(aKTImportPrivateKeyActivity, Integer.valueOf(R.string.invalid_private_key), R.string.invalid_private_key_description, true, new C9617y0());
        } else if (faVar.f28797d.getText() != null) {
            ProgressLoading.C8308a aVar = ProgressLoading.f41785Y;
            String string = aKTImportPrivateKeyActivity.getString(R.string.loading);
            vx2.m53590f(string, "getString(R.string.loading)");
            ProgressLoading a = aVar.mo57297a(false, string, "");
            aKTImportPrivateKeyActivity.f8528r = a;
            FragmentManager supportFragmentManager = aKTImportPrivateKeyActivity.getSupportFragmentManager();
            vx2.m53590f(supportFragmentManager, "supportFragmentManager");
            a.mo57295D(supportFragmentManager);
            aKTImportPrivateKeyActivity.mo56649E0(str);
        }
    }

    /* renamed from: J0 */
    public static final void m64960J0(DialogInterface dialogInterface) {
    }

    /* renamed from: K0 */
    public static final void m64961K0(AKTImportPrivateKeyActivity aKTImportPrivateKeyActivity, View view) {
        vx2.m53591g(aKTImportPrivateKeyActivity, "this$0");
        aKTImportPrivateKeyActivity.onBackPressed();
    }

    /* renamed from: E0 */
    public final void mo56649E0(String str) {
        try {
            CreateWalletViewModel r0 = mo56688r0();
            vx2.m53588d(str);
            r0.mo61124e(str);
            mo56688r0().mo61122c(str, CreateWalletViewModel.KEY_TYPE.PRIVATE_KEY, new AKTImportPrivateKeyActivity$checkUser$1(this));
        } catch (Exception unused) {
            fy0.m57956e(this, Integer.valueOf(R.string.error_iw_title), R.string.error_iw_msg, true, new C9659z0());
        }
    }

    /* renamed from: G0 */
    public final C5837fa mo56650G0() {
        return (C5837fa) this.f41295B.getValue();
    }

    /* renamed from: H0 */
    public final void mo56651H0() {
        C5837fa G0 = mo56650G0();
        ba7 ba7 = G0.f28806m;
        vx2.m53590f(ba7, "viewBarcodeComponentLayout");
        TextInputEditText textInputEditText = G0.f28797d;
        vx2.m53590f(textInputEditText, "editPrivateKey");
        tc7.m72261n(ba7, textInputEditText, new AKTImportPrivateKeyActivity$setView$1$1(this));
        G0.f28796c.setOnClickListener(new C9475w0(G0, this));
        G0.f28795b.setOnClickListener(new C9577x0(this));
    }

    /* renamed from: L0 */
    public final void mo56652L0() {
        C3529wa<Intent> b;
        ji4 K = mo56996K();
        if (K != null && (b = K.mo52724b(new AKTImportPrivateKeyActivity$startScanQRCode$1(this))) != null) {
            b.mo27473a(new Intent(this, ScannedCodeActivity.class));
        }
    }

    /* renamed from: M0 */
    public final boolean mo56653M0(String str) {
        if (str == null || str.length() < 64) {
            return false;
        }
        return true;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((View) mo56650G0().mo42542b());
    }

    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        mo56651H0();
    }
}
