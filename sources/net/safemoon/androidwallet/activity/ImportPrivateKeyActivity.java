package net.safemoon.androidwallet.activity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import com.google.android.material.textfield.TextInputEditText;
import kotlin.C6169a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.safemoon.androidwallet.R;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002J\u0012\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002R\u001b\u0010\u0012\u001a\u00020\r8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, mo44877d2 = {"Lnet/safemoon/androidwallet/activity/ImportPrivateKeyActivity;", "Lnet/safemoon/androidwallet/activity/RecoverWalletActivity;", "Landroid/os/Bundle;", "savedInstanceState", "Lr37;", "onCreate", "onPostCreate", "u0", "y0", "", "key", "", "z0", "Lfa;", "y", "Lef3;", "t0", "()Lfa;", "binding", "<init>", "()V", "A", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: ImportPrivateKeyActivity.kt */
public final class ImportPrivateKeyActivity extends RecoverWalletActivity {

    /* renamed from: A */
    public static final C8187a f41450A = new C8187a((DefaultConstructorMarker) null);

    /* renamed from: y */
    public final ef3 f41451y = C6169a.m47232a(new ImportPrivateKeyActivity$binding$2(this));

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, mo44877d2 = {"Lnet/safemoon/androidwallet/activity/ImportPrivateKeyActivity$a;", "", "Landroid/content/Context;", "context", "Lr37;", "a", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.activity.ImportPrivateKeyActivity$a */
    /* compiled from: ImportPrivateKeyActivity.kt */
    public static final class C8187a {
        public C8187a() {
        }

        public /* synthetic */ C8187a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo56850a(Context context) {
            vx2.m53591g(context, "context");
            context.startActivity(new Intent(context, ImportPrivateKeyActivity.class));
        }
    }

    /* renamed from: v0 */
    public static final void m65350v0(C5837fa faVar, ImportPrivateKeyActivity importPrivateKeyActivity, View view) {
        String str;
        vx2.m53591g(faVar, "$this_apply");
        vx2.m53591g(importPrivateKeyActivity, "this$0");
        Editable text = faVar.f28797d.getText();
        if (text != null) {
            str = text.toString();
        } else {
            str = null;
        }
        if (!importPrivateKeyActivity.mo56849z0(str)) {
            fy0.m57956e(importPrivateKeyActivity, Integer.valueOf(R.string.invalid_private_key), R.string.invalid_private_key_description, true, new ss2());
        } else if (faVar.f28797d.getText() != null) {
            importPrivateKeyActivity.mo56864a0(String.valueOf(faVar.f28797d.getText()));
        }
    }

    /* renamed from: w0 */
    public static final void m65351w0(DialogInterface dialogInterface) {
    }

    /* renamed from: x0 */
    public static final void m65352x0(ImportPrivateKeyActivity importPrivateKeyActivity, View view) {
        vx2.m53591g(importPrivateKeyActivity, "this$0");
        importPrivateKeyActivity.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((View) mo56846t0().mo42542b());
    }

    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        mo56847u0();
    }

    /* renamed from: t0 */
    public final C5837fa mo56846t0() {
        return (C5837fa) this.f41451y.getValue();
    }

    /* renamed from: u0 */
    public final void mo56847u0() {
        C5837fa t0 = mo56846t0();
        ba7 ba7 = t0.f28806m;
        vx2.m53590f(ba7, "viewBarcodeComponentLayout");
        TextInputEditText textInputEditText = t0.f28797d;
        vx2.m53590f(textInputEditText, "editPrivateKey");
        tc7.m72261n(ba7, textInputEditText, new ImportPrivateKeyActivity$setView$1$1(this));
        t0.f28796c.setOnClickListener(new qs2(t0, this));
        t0.f28795b.setOnClickListener(new rs2(this));
    }

    /* renamed from: y0 */
    public final void mo56848y0() {
        C3529wa<Intent> b;
        ji4 K = mo56996K();
        if (K != null && (b = K.mo52724b(new ImportPrivateKeyActivity$startScanQRCode$1(this))) != null) {
            b.mo27473a(new Intent(this, ScannedCodeActivity.class));
        }
    }

    /* renamed from: z0 */
    public final boolean mo56849z0(String str) {
        if (str == null || str.length() < 64) {
            return false;
        }
        return true;
    }
}
