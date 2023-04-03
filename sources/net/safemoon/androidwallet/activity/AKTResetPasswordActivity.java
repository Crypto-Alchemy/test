package net.safemoon.androidwallet.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.ActionBar;
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
import net.safemoon.androidwallet.dialogs.ProgressLoading;
import net.safemoon.androidwallet.utils.Common;
import net.safemoon.androidwallet.viewmodels.AKTWebSocketHandlingViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 /2\u00020\u0001:\u00010B\u0007¢\u0006\u0004\b-\u0010.J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\u001c\u0010\u000e\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0016J+\u0010\u0013\u001a\u00020\u00042\u0010\u0010\u0011\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0007\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0015\u001a\u00020\u0004H\u0002J\b\u0010\u0016\u001a\u00020\u0004H\u0002J\b\u0010\u0017\u001a\u00020\u0004H\u0002J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0002R\u001b\u0010\u001f\u001a\u00020\u00078BX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010\"\u001a\u00020\u00078BX\u0002¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u001eR\u001b\u0010'\u001a\u00020#8BX\u0002¢\u0006\f\n\u0004\b$\u0010\u001c\u001a\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020(8BX\u0002¢\u0006\f\n\u0004\b)\u0010\u001c\u001a\u0004\b*\u0010+¨\u00061"}, mo44877d2 = {"Lnet/safemoon/androidwallet/activity/AKTResetPasswordActivity;", "Lcom/AKT/anonymouskey/ui/login/AKTServerFunctions;", "Landroid/os/Bundle;", "savedInstanceState", "Lr37;", "onCreate", "onPostCreate", "", "toSend", "G0", "B0", "Low7;", "safeMoonppp", "message", "e0", "X", "", "parts", "aktapiid", "f0", "([Ljava/lang/String;Ljava/lang/String;)V", "H0", "A0", "v0", "Landroid/text/Editable;", "s", "w0", "A", "Lef3;", "getAktKs", "()Ljava/lang/String;", "aktKs", "B", "x0", "aktPBHex", "Lr9;", "C", "y0", "()Lr9;", "binding", "Lnet/safemoon/androidwallet/viewmodels/AKTWebSocketHandlingViewModel;", "H", "z0", "()Lnet/safemoon/androidwallet/viewmodels/AKTWebSocketHandlingViewModel;", "webSocketModel", "<init>", "()V", "I", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: AKTResetPasswordActivity.kt */
public final class AKTResetPasswordActivity extends AKTServerFunctions {

    /* renamed from: I */
    public static final C8155a f41327I = new C8155a((DefaultConstructorMarker) null);

    /* renamed from: A */
    public final ef3 f41328A = C6169a.m47232a(new AKTResetPasswordActivity$aktKs$2(this));

    /* renamed from: B */
    public final ef3 f41329B = C6169a.m47232a(new AKTResetPasswordActivity$aktPBHex$2(this));

    /* renamed from: C */
    public final ef3 f41330C = C6169a.m47232a(new AKTResetPasswordActivity$binding$2(this));

    /* renamed from: H */
    public final ef3 f41331H = new dd7(ua5.m52727b(AKTWebSocketHandlingViewModel.class), new AKTResetPasswordActivity$special$$inlined$viewModels$default$2(this), new AKTResetPasswordActivity$special$$inlined$viewModels$default$1(this), new AKTResetPasswordActivity$special$$inlined$viewModels$default$3((pc2) null, this));

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004R\u0014\u0010\t\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\u000e"}, mo44877d2 = {"Lnet/safemoon/androidwallet/activity/AKTResetPasswordActivity$a;", "", "Landroid/content/Context;", "context", "", "aktKs", "aktPBHex", "Lr37;", "a", "AKT_KS", "Ljava/lang/String;", "AKT_PBHEX", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.activity.AKTResetPasswordActivity$a */
    /* compiled from: AKTResetPasswordActivity.kt */
    public static final class C8155a {
        public C8155a() {
        }

        public /* synthetic */ C8155a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo56721a(Context context, String str, String str2) {
            vx2.m53591g(context, "context");
            vx2.m53591g(str, "aktKs");
            vx2.m53591g(str2, "aktPBHex");
            Intent intent = new Intent(context, AKTResetPasswordActivity.class);
            intent.putExtra("AKT_KS", str);
            intent.putExtra("AKT_PB", str2);
            context.startActivity(intent);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J(\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\fH\u0016¨\u0006\u000e"}, mo44877d2 = {"net/safemoon/androidwallet/activity/AKTResetPasswordActivity$b", "Landroid/text/TextWatcher;", "", "s", "", "start", "count", "after", "Lr37;", "beforeTextChanged", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.activity.AKTResetPasswordActivity$b */
    /* compiled from: AKTResetPasswordActivity.kt */
    public static final class C8156b implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ C6431r9 f41332a;

        /* renamed from: d */
        public final /* synthetic */ AKTResetPasswordActivity f41333d;

        public C8156b(C6431r9 r9Var, AKTResetPasswordActivity aKTResetPasswordActivity) {
            this.f41332a = r9Var;
            this.f41333d = aKTResetPasswordActivity;
        }

        public void afterTextChanged(Editable editable) {
            vx2.m53591g(editable, "s");
            String obj = editable.toString();
            String c = Common.f42577a.mo60897c(obj);
            if (!vx2.m53586b(obj, c)) {
                EditText editText = this.f41332a.f33344g.getEditText();
                if (editText != null) {
                    editText.setText(c);
                }
                EditText editText2 = this.f41332a.f33344g.getEditText();
                if (editText2 != null) {
                    editText2.setSelection(c.length());
                    return;
                }
                return;
            }
            this.f41333d.mo56716v0();
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            vx2.m53591g(charSequence, "s");
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            vx2.m53591g(charSequence, "s");
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J(\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\fH\u0016¨\u0006\u000e"}, mo44877d2 = {"net/safemoon/androidwallet/activity/AKTResetPasswordActivity$c", "Landroid/text/TextWatcher;", "", "s", "", "start", "count", "after", "Lr37;", "beforeTextChanged", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.activity.AKTResetPasswordActivity$c */
    /* compiled from: AKTResetPasswordActivity.kt */
    public static final class C8157c implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ C6431r9 f41334a;

        /* renamed from: d */
        public final /* synthetic */ AKTResetPasswordActivity f41335d;

        public C8157c(C6431r9 r9Var, AKTResetPasswordActivity aKTResetPasswordActivity) {
            this.f41334a = r9Var;
            this.f41335d = aKTResetPasswordActivity;
        }

        public void afterTextChanged(Editable editable) {
            vx2.m53591g(editable, "s");
            String obj = editable.toString();
            String c = Common.f42577a.mo60897c(obj);
            if (!vx2.m53586b(obj, c)) {
                EditText editText = this.f41334a.f33343f.getEditText();
                if (editText != null) {
                    editText.setText(c);
                }
                EditText editText2 = this.f41334a.f33343f.getEditText();
                if (editText2 != null) {
                    editText2.setSelection(c.length());
                    return;
                }
                return;
            }
            this.f41335d.mo56716v0();
            this.f41335d.mo56717w0(editable);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            vx2.m53591g(charSequence, "s");
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            vx2.m53591g(charSequence, "s");
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J(\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\fH\u0016¨\u0006\u000e"}, mo44877d2 = {"net/safemoon/androidwallet/activity/AKTResetPasswordActivity$d", "Landroid/text/TextWatcher;", "", "s", "", "start", "count", "after", "Lr37;", "beforeTextChanged", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.activity.AKTResetPasswordActivity$d */
    /* compiled from: AKTResetPasswordActivity.kt */
    public static final class C8158d implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ C6431r9 f41336a;

        /* renamed from: d */
        public final /* synthetic */ AKTResetPasswordActivity f41337d;

        public C8158d(C6431r9 r9Var, AKTResetPasswordActivity aKTResetPasswordActivity) {
            this.f41336a = r9Var;
            this.f41337d = aKTResetPasswordActivity;
        }

        public void afterTextChanged(Editable editable) {
            vx2.m53591g(editable, "s");
            String obj = editable.toString();
            String c = Common.f42577a.mo60897c(obj);
            if (!vx2.m53586b(obj, c)) {
                EditText editText = this.f41336a.f33342e.getEditText();
                if (editText != null) {
                    editText.setText(c);
                }
                EditText editText2 = this.f41336a.f33342e.getEditText();
                if (editText2 != null) {
                    editText2.setSelection(c.length());
                    return;
                }
                return;
            }
            this.f41337d.mo56716v0();
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            vx2.m53591g(charSequence, "s");
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            vx2.m53591g(charSequence, "s");
        }
    }

    /* renamed from: C0 */
    public static final void m65083C0(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: D0 */
    public static final void m65084D0(AKTResetPasswordActivity aKTResetPasswordActivity, View view) {
        vx2.m53591g(aKTResetPasswordActivity, "this$0");
        aKTResetPasswordActivity.onBackPressed();
    }

    /* renamed from: E0 */
    public static final void m65085E0(AKTResetPasswordActivity aKTResetPasswordActivity, View view) {
        vx2.m53591g(aKTResetPasswordActivity, "this$0");
        aKTResetPasswordActivity.mo56715H0();
    }

    /* renamed from: F0 */
    public static final void m65086F0(AKTResetPasswordActivity aKTResetPasswordActivity, View view) {
        vx2.m53591g(aKTResetPasswordActivity, "this$0");
        a77.m55427e(aKTResetPasswordActivity);
    }

    /* renamed from: A0 */
    public final void mo56712A0() {
        Editable editable;
        mo56719y0().f33339b.setEnabled(false);
        ProgressLoading.C8308a aVar = ProgressLoading.f41785Y;
        String string = getString(R.string.loading);
        vx2.m53590f(string, "getString(R.string.loading)");
        ProgressLoading a = aVar.mo57297a(false, string, "");
        this.f8528r = a;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        vx2.m53590f(supportFragmentManager, "supportFragmentManager");
        a.mo57295D(supportFragmentManager);
        EditText editText = mo56719y0().f33344g.getEditText();
        Editable editable2 = null;
        if (editText != null) {
            editable = editText.getText();
        } else {
            editable = null;
        }
        String valueOf = String.valueOf(editable);
        EditText editText2 = mo56719y0().f33342e.getEditText();
        if (editText2 != null) {
            editable2 = editText2.getText();
        }
        String valueOf2 = String.valueOf(editable2);
        Common common = Common.f42577a;
        String q = common.mo60910q(valueOf);
        String q2 = common.mo60910q(valueOf2);
        String x0 = mo56718x0();
        vx2.m53590f(x0, "aktPBHex");
        String m0 = mo12169m0(x0, q, q2);
        vx2.m53590f(m0, "updateKAandU5(pbHex, newUsername, newPassword)");
        mo56714G0(m0);
    }

    /* renamed from: B0 */
    public void mo56713B0() {
        mo56720z0().mo60953i().observe(this, new C6920c2(new AKTResetPasswordActivity$initReceiveResponse$1(this)));
    }

    /* renamed from: G0 */
    public void mo56714G0(String str) {
        if (str != null) {
            mo56720z0().mo60956l(str);
        }
    }

    /* renamed from: H0 */
    public final void mo56715H0() {
        Editable editable;
        EditText editText = mo56719y0().f33344g.getEditText();
        if (editText != null) {
            editable = editText.getText();
        } else {
            editable = null;
        }
        cb6 cb6 = cb6.f21669a;
        String string = getString(R.string.akt_reset_password_confirm_dialog_content);
        vx2.m53590f(string, "getString(R.string.akt_r…d_confirm_dialog_content)");
        String format = String.format(string, Arrays.copyOf(new Object[]{"<b>" + editable + "</b>"}, 1));
        vx2.m53590f(format, "format(format, *args)");
        C9001np.m69949d0(new WeakReference(this), Integer.valueOf(R.string.akt_reset_password_confirm_dialog_header), (Integer) null, format, R.string.confirm, R.string.ca_alert_save_continue_editing, new AKTResetPasswordActivity$showConfirmResetPasswordDialog$1(this), AKTResetPasswordActivity$showConfirmResetPasswordDialog$2.INSTANCE, 4, (Object) null);
    }

    /* renamed from: X */
    public void mo12159X() {
        mo56720z0().mo60951g();
    }

    /* renamed from: e0 */
    public void mo12164e0(ow7 ow7, String str) {
        boolean z;
        String str2 = str;
        mo56719y0().f33339b.setEnabled(true);
        if (!mo12163d0(str2)) {
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
                        mo12165f0(w, (String) null);
                    } else {
                        C9001np.m69939X(new WeakReference(this), Integer.valueOf(R.string.akt_reset_password_dialog_success_content), (Integer) null, R.string.akt_reset_password_back_to_login, new AKTResetPasswordActivity$parseMessage$1(ow7, this), 4, (Object) null);
                    }
                }
            }
        }
    }

    /* renamed from: f0 */
    public void mo12165f0(String[] strArr, String str) {
        C9001np.m69939X(new WeakReference(this), (Integer) null, Integer.valueOf(R.string.akt_error_cannot_register_new_key_message), 0, (pc2) null, 26, (Object) null);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((View) mo56719y0().mo47348b());
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo959l();
        }
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(zr0.m31440c(this, 17170445));
        getWindow().setBackgroundDrawable(new ColorDrawable(getColor(R.color.akt_night_background)));
        mo56720z0().mo60957m();
        mo56713B0();
    }

    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        C6431r9 y0 = mo56719y0();
        y0.f33350m.f21597e.setText(getString(R.string.akt_reset_password_header_title));
        y0.f33350m.f21594b.setVisibility(0);
        y0.f33350m.f21594b.setOnClickListener(new C9660z1(this));
        EditText editText = y0.f33344g.getEditText();
        if (editText != null) {
            editText.addTextChangedListener(new C8156b(y0, this));
        }
        EditText editText2 = y0.f33343f.getEditText();
        if (editText2 != null) {
            editText2.addTextChangedListener(new C8157c(y0, this));
        }
        EditText editText3 = y0.f33342e.getEditText();
        if (editText3 != null) {
            editText3.addTextChangedListener(new C8158d(y0, this));
        }
        mo56716v0();
        EditText editText4 = y0.f33343f.getEditText();
        vx2.m53588d(editText4);
        Editable text = editText4.getText();
        vx2.m53590f(text, "etPassword.editText!!.text");
        mo56717w0(text);
        y0.f33339b.setOnClickListener(new C6791a2(this));
        y0.f33340c.setOnClickListener(new C6841b2(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0109  */
    /* renamed from: v0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo56716v0() {
        /*
            r9 = this;
            r9 r0 = r9.mo56719y0()
            com.google.android.material.textfield.TextInputLayout r1 = r0.f33344g
            android.widget.EditText r1 = r1.getEditText()
            r2 = 0
            if (r1 == 0) goto L_0x0012
            android.text.Editable r1 = r1.getText()
            goto L_0x0013
        L_0x0012:
            r1 = r2
        L_0x0013:
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0020
            int r1 = r1.length()
            if (r1 != 0) goto L_0x001e
            goto L_0x0020
        L_0x001e:
            r1 = r4
            goto L_0x0021
        L_0x0020:
            r1 = r3
        L_0x0021:
            if (r1 != 0) goto L_0x005e
            com.google.android.material.textfield.TextInputLayout r1 = r0.f33343f
            android.widget.EditText r1 = r1.getEditText()
            if (r1 == 0) goto L_0x0030
            android.text.Editable r1 = r1.getText()
            goto L_0x0031
        L_0x0030:
            r1 = r2
        L_0x0031:
            if (r1 == 0) goto L_0x003c
            int r1 = r1.length()
            if (r1 != 0) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            r1 = r4
            goto L_0x003d
        L_0x003c:
            r1 = r3
        L_0x003d:
            if (r1 != 0) goto L_0x005e
            com.google.android.material.textfield.TextInputLayout r1 = r0.f33342e
            android.widget.EditText r1 = r1.getEditText()
            if (r1 == 0) goto L_0x004c
            android.text.Editable r1 = r1.getText()
            goto L_0x004d
        L_0x004c:
            r1 = r2
        L_0x004d:
            if (r1 == 0) goto L_0x0058
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0056
            goto L_0x0058
        L_0x0056:
            r1 = r4
            goto L_0x0059
        L_0x0058:
            r1 = r3
        L_0x0059:
            if (r1 == 0) goto L_0x005c
            goto L_0x005e
        L_0x005c:
            r1 = r3
            goto L_0x005f
        L_0x005e:
            r1 = r4
        L_0x005f:
            com.google.android.material.textfield.TextInputLayout r5 = r0.f33343f
            android.widget.EditText r5 = r5.getEditText()
            if (r5 == 0) goto L_0x006c
            android.text.Editable r5 = r5.getText()
            goto L_0x006d
        L_0x006c:
            r5 = r2
        L_0x006d:
            java.lang.String r5 = java.lang.String.valueOf(r5)
            com.google.android.material.textfield.TextInputLayout r6 = r0.f33342e
            android.widget.EditText r6 = r6.getEditText()
            if (r6 == 0) goto L_0x007e
            android.text.Editable r6 = r6.getText()
            goto L_0x007f
        L_0x007e:
            r6 = r2
        L_0x007f:
            java.lang.String r6 = java.lang.String.valueOf(r6)
            int r7 = r5.length()
            r8 = 8
            if (r7 < r8) goto L_0x0091
            boolean r7 = p000.ko6.m59873f(r5)
            if (r7 != 0) goto L_0x0092
        L_0x0091:
            r1 = r4
        L_0x0092:
            boolean r5 = p000.vx2.m53586b(r5, r6)
            if (r5 != 0) goto L_0x00aa
            int r5 = r6.length()
            if (r5 <= 0) goto L_0x00a0
            r5 = r3
            goto L_0x00a1
        L_0x00a0:
            r5 = r4
        L_0x00a1:
            if (r5 == 0) goto L_0x00aa
            android.widget.TextView r1 = r0.f33351n
            r1.setVisibility(r4)
            r1 = r4
            goto L_0x00af
        L_0x00aa:
            android.widget.TextView r5 = r0.f33351n
            r5.setVisibility(r8)
        L_0x00af:
            r9 r5 = r9.mo56719y0()
            com.google.android.material.textfield.TextInputLayout r5 = r5.f33344g
            android.widget.EditText r5 = r5.getEditText()
            if (r5 == 0) goto L_0x00bf
            android.text.Editable r2 = r5.getText()
        L_0x00bf:
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r5 = r2.length()
            if (r5 <= 0) goto L_0x00cb
            r5 = r3
            goto L_0x00cc
        L_0x00cb:
            r5 = r4
        L_0x00cc:
            if (r5 == 0) goto L_0x00e4
            int r5 = r2.length()
            r6 = 7
            if (r5 < r6) goto L_0x00dd
            int r2 = r2.length()
            r5 = 18
            if (r2 <= r5) goto L_0x00e4
        L_0x00dd:
            android.widget.TextView r1 = r0.f33357t
            r1.setVisibility(r4)
            r1 = r4
            goto L_0x00e9
        L_0x00e4:
            android.widget.TextView r2 = r0.f33357t
            r2.setVisibility(r8)
        L_0x00e9:
            if (r1 == 0) goto L_0x0109
            com.google.android.material.button.MaterialButton r1 = r0.f33339b
            r2 = 2131099707(0x7f06003b, float:1.7811775E38)
            int r2 = r9.getColor(r2)
            r1.setTextColor(r2)
            com.google.android.material.button.MaterialButton r1 = r0.f33339b
            r1.setEnabled(r3)
            com.google.android.material.button.MaterialButton r0 = r0.f33339b
            r1 = 2131099676(0x7f06001c, float:1.7811712E38)
            android.content.res.ColorStateList r1 = r9.getColorStateList(r1)
            r0.setBackgroundTintList(r1)
            goto L_0x0126
        L_0x0109:
            com.google.android.material.button.MaterialButton r1 = r0.f33339b
            r2 = 2131100019(0x7f060173, float:1.7812408E38)
            int r2 = r9.getColor(r2)
            r1.setTextColor(r2)
            com.google.android.material.button.MaterialButton r1 = r0.f33339b
            r1.setEnabled(r4)
            com.google.android.material.button.MaterialButton r0 = r0.f33339b
            r1 = 2131099677(0x7f06001d, float:1.7811714E38)
            android.content.res.ColorStateList r1 = r9.getColorStateList(r1)
            r0.setBackgroundTintList(r1)
        L_0x0126:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.activity.AKTResetPasswordActivity.mo56716v0():void");
    }

    /* renamed from: w0 */
    public final void mo56717w0(Editable editable) {
        int c = zr0.m31440c(this, R.color.akt_sign_in_wipe);
        ColorStateList d = zr0.m31441d(this, R.color.akt_sign_in_wipe);
        int c2 = zr0.m31440c(this, R.color.akt_button_inactive);
        ColorStateList d2 = zr0.m31441d(this, R.color.akt_button_inactive);
        if (editable.toString().length() > 7) {
            mo56719y0().f33348k.setTextColor(c);
            mo56719y0().f33345h.setImageTintList(d);
            mo56719y0().f33348k.setTag("complete");
        } else {
            mo56719y0().f33348k.setTextColor(c2);
            mo56719y0().f33345h.setImageTintList(d2);
            mo56719y0().f33348k.setTag("incomplete");
        }
        if (ko6.m59874g(editable.toString())) {
            mo56719y0().f33353p.setTextColor(c);
            mo56719y0().f33346i.setImageTintList(d);
            mo56719y0().f33353p.setTag("complete");
        } else {
            mo56719y0().f33353p.setTextColor(c2);
            mo56719y0().f33346i.setImageTintList(d2);
            mo56719y0().f33353p.setTag("incomplete");
        }
        if (ko6.m59872e(editable.toString())) {
            mo56719y0().f33352o.setTextColor(c);
            mo56719y0().f33347j.setImageTintList(d);
            mo56719y0().f33352o.setTag("complete");
            return;
        }
        mo56719y0().f33352o.setTextColor(c2);
        mo56719y0().f33347j.setImageTintList(d2);
        mo56719y0().f33352o.setTag("incomplete");
    }

    /* renamed from: x0 */
    public final String mo56718x0() {
        return (String) this.f41329B.getValue();
    }

    /* renamed from: y0 */
    public final C6431r9 mo56719y0() {
        return (C6431r9) this.f41330C.getValue();
    }

    /* renamed from: z0 */
    public final AKTWebSocketHandlingViewModel mo56720z0() {
        return (AKTWebSocketHandlingViewModel) this.f41331H.getValue();
    }
}
