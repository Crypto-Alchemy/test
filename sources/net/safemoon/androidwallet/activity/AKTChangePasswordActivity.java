package net.safemoon.androidwallet.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
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

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 +2\u00020\u0001:\u0001,B\u0007¢\u0006\u0004\b)\u0010*J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\u001c\u0010\u000e\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0016J+\u0010\u0013\u001a\u00020\u00042\u0010\u0010\u0011\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0007\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0015\u001a\u00020\u0004H\u0002J\b\u0010\u0016\u001a\u00020\u0004H\u0002J\u0018\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0007H\u0002J\b\u0010\u001a\u001a\u00020\u0004H\u0002J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0002R\u001b\u0010#\u001a\u00020\u001e8BX\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020$8BX\u0002¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010'¨\u0006-"}, mo44877d2 = {"Lnet/safemoon/androidwallet/activity/AKTChangePasswordActivity;", "Lcom/AKT/anonymouskey/ui/login/AKTServerFunctions;", "Landroid/os/Bundle;", "savedInstanceState", "Lr37;", "onCreate", "onPostCreate", "", "toSend", "G0", "A0", "Low7;", "safeMoonppp", "message", "e0", "X", "", "parts", "aktapiid", "f0", "([Ljava/lang/String;Ljava/lang/String;)V", "H0", "z0", "username", "password", "F0", "v0", "Landroid/text/Editable;", "s", "w0", "Lm9;", "A", "Lef3;", "x0", "()Lm9;", "binding", "Lnet/safemoon/androidwallet/viewmodels/AKTWebSocketHandlingViewModel;", "B", "y0", "()Lnet/safemoon/androidwallet/viewmodels/AKTWebSocketHandlingViewModel;", "webSocketModel", "<init>", "()V", "C", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: AKTChangePasswordActivity.kt */
public final class AKTChangePasswordActivity extends AKTServerFunctions {

    /* renamed from: C */
    public static final C8123a f41240C = new C8123a((DefaultConstructorMarker) null);

    /* renamed from: A */
    public final ef3 f41241A = C6169a.m47232a(new AKTChangePasswordActivity$binding$2(this));

    /* renamed from: B */
    public final ef3 f41242B = new dd7(ua5.m52727b(AKTWebSocketHandlingViewModel.class), new AKTChangePasswordActivity$special$$inlined$viewModels$default$2(this), new AKTChangePasswordActivity$special$$inlined$viewModels$default$1(this), new AKTChangePasswordActivity$special$$inlined$viewModels$default$3((pc2) null, this));

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, mo44877d2 = {"Lnet/safemoon/androidwallet/activity/AKTChangePasswordActivity$a;", "", "Landroid/content/Context;", "context", "Lr37;", "a", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.activity.AKTChangePasswordActivity$a */
    /* compiled from: AKTChangePasswordActivity.kt */
    public static final class C8123a {
        public C8123a() {
        }

        public /* synthetic */ C8123a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo56575a(Context context) {
            vx2.m53591g(context, "context");
            context.startActivity(new Intent(context, AKTChangePasswordActivity.class));
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J(\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\fH\u0016¨\u0006\u000e"}, mo44877d2 = {"net/safemoon/androidwallet/activity/AKTChangePasswordActivity$b", "Landroid/text/TextWatcher;", "", "s", "", "start", "count", "after", "Lr37;", "beforeTextChanged", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.activity.AKTChangePasswordActivity$b */
    /* compiled from: AKTChangePasswordActivity.kt */
    public static final class C8124b implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ C6237m9 f41243a;

        /* renamed from: d */
        public final /* synthetic */ AKTChangePasswordActivity f41244d;

        public C8124b(C6237m9 m9Var, AKTChangePasswordActivity aKTChangePasswordActivity) {
            this.f41243a = m9Var;
            this.f41244d = aKTChangePasswordActivity;
        }

        public void afterTextChanged(Editable editable) {
            vx2.m53591g(editable, "s");
            String obj = editable.toString();
            String c = Common.f42577a.mo60897c(obj);
            if (!vx2.m53586b(obj, c)) {
                this.f41243a.f31558i.setText(c);
                this.f41243a.f31558i.setSelection(c.length());
                return;
            }
            this.f41244d.mo56570v0();
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            vx2.m53591g(charSequence, "s");
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            vx2.m53591g(charSequence, "s");
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J(\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\fH\u0016¨\u0006\u000e"}, mo44877d2 = {"net/safemoon/androidwallet/activity/AKTChangePasswordActivity$c", "Landroid/text/TextWatcher;", "", "s", "", "start", "count", "after", "Lr37;", "beforeTextChanged", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.activity.AKTChangePasswordActivity$c */
    /* compiled from: AKTChangePasswordActivity.kt */
    public static final class C8125c implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ C6237m9 f41245a;

        /* renamed from: d */
        public final /* synthetic */ AKTChangePasswordActivity f41246d;

        public C8125c(C6237m9 m9Var, AKTChangePasswordActivity aKTChangePasswordActivity) {
            this.f41245a = m9Var;
            this.f41246d = aKTChangePasswordActivity;
        }

        public void afterTextChanged(Editable editable) {
            vx2.m53591g(editable, "s");
            String obj = editable.toString();
            String c = Common.f42577a.mo60897c(obj);
            if (!vx2.m53586b(obj, c)) {
                this.f41245a.f31557h.setText(c);
                this.f41245a.f31557h.setSelection(c.length());
                return;
            }
            this.f41246d.mo56570v0();
            this.f41246d.mo56571w0(editable);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            vx2.m53591g(charSequence, "s");
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            vx2.m53591g(charSequence, "s");
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J(\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\fH\u0016¨\u0006\u000e"}, mo44877d2 = {"net/safemoon/androidwallet/activity/AKTChangePasswordActivity$d", "Landroid/text/TextWatcher;", "", "s", "", "start", "count", "after", "Lr37;", "beforeTextChanged", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.activity.AKTChangePasswordActivity$d */
    /* compiled from: AKTChangePasswordActivity.kt */
    public static final class C8126d implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ C6237m9 f41247a;

        /* renamed from: d */
        public final /* synthetic */ AKTChangePasswordActivity f41248d;

        public C8126d(C6237m9 m9Var, AKTChangePasswordActivity aKTChangePasswordActivity) {
            this.f41247a = m9Var;
            this.f41248d = aKTChangePasswordActivity;
        }

        public void afterTextChanged(Editable editable) {
            vx2.m53591g(editable, "s");
            String obj = editable.toString();
            String c = Common.f42577a.mo60897c(obj);
            if (!vx2.m53586b(obj, c)) {
                this.f41247a.f31556g.setText(c);
                this.f41247a.f31556g.setSelection(c.length());
                return;
            }
            this.f41248d.mo56570v0();
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            vx2.m53591g(charSequence, "s");
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            vx2.m53591g(charSequence, "s");
        }
    }

    /* renamed from: B0 */
    public static final void m64767B0(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: C0 */
    public static final void m64768C0(AKTChangePasswordActivity aKTChangePasswordActivity, View view) {
        vx2.m53591g(aKTChangePasswordActivity, "this$0");
        aKTChangePasswordActivity.onBackPressed();
    }

    /* renamed from: D0 */
    public static final void m64769D0(AKTChangePasswordActivity aKTChangePasswordActivity, View view) {
        boolean z;
        vx2.m53591g(aKTChangePasswordActivity, "this$0");
        if (view.getAlpha() == 1.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            aKTChangePasswordActivity.mo56569H0();
        }
    }

    /* renamed from: E0 */
    public static final void m64770E0(AKTChangePasswordActivity aKTChangePasswordActivity, View view) {
        vx2.m53591g(aKTChangePasswordActivity, "this$0");
        a77.m55427e(aKTChangePasswordActivity);
    }

    /* renamed from: A0 */
    public void mo56566A0() {
        mo56573y0().mo60953i().observe(this, new C7917n(new AKTChangePasswordActivity$initReceiveResponse$1(this)));
    }

    /* renamed from: F0 */
    public final String mo56567F0(String str, String str2) {
        boolean z;
        String i = f06.m57518i(this, "KA");
        String c = up1.m72958c(this, "UK5");
        if (c == null || c.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            c = C2127d2.m14652q(this.f8531y, "UK5");
        }
        String m0 = mo12169m0(C2935o.m23571f(c, i), str, str2);
        vx2.m53590f(m0, "updateKAandU5(pbHex, username, password)");
        return m0;
    }

    /* renamed from: G0 */
    public void mo56568G0(String str) {
        if (str != null) {
            mo56573y0().mo60956l(str);
        }
    }

    /* renamed from: H0 */
    public final void mo56569H0() {
        cb6 cb6 = cb6.f21669a;
        String string = getString(R.string.akt_reset_password_confirm_dialog_content);
        vx2.m53590f(string, "getString(R.string.akt_r…d_confirm_dialog_content)");
        String format = String.format(string, Arrays.copyOf(new Object[]{"<b>" + mo56572x0().f31558i.getText() + "</b>"}, 1));
        vx2.m53590f(format, "format(format, *args)");
        C9001np.m69971o0(new WeakReference(this), Integer.valueOf(R.string.akt_reset_password_confirm_dialog_header), (Integer) null, format, R.string.akt_reset_password_confirm_dialog_accept, R.string.ca_alert_save_continue_editing, new AKTChangePasswordActivity$showConfirmChangePasswordDialog$1(this), AKTChangePasswordActivity$showConfirmChangePasswordDialog$2.INSTANCE, 4, (Object) null);
    }

    /* renamed from: X */
    public void mo12159X() {
        mo56573y0().mo60951g();
    }

    /* renamed from: e0 */
    public void mo12164e0(ow7 ow7, String str) {
        boolean z;
        String str2;
        String str3;
        String str4;
        ow7 ow72 = ow7;
        String str5 = str;
        mo56572x0().f31551b.setEnabled(true);
        if (!mo12163d0(str5)) {
            ProgressLoading progressLoading = this.f8528r;
            if (progressLoading != null) {
                progressLoading.mo22266k();
            }
            String[] w = C2127d2.m14658w(Common.f42577a.mo60918y(this, str5), "|");
            vx2.m53590f(w, "parts");
            if (w.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                String str6 = w[0];
                vx2.m53590f(str6, "parts[0]");
                if (StringsKt__StringsKt.m63061B0(str6, new String[]{"="}, false, 0, 6, (Object) null).size() >= 2) {
                    String str7 = w[0];
                    vx2.m53590f(str7, "parts[0]");
                    String upperCase = ((String) StringsKt__StringsKt.m63061B0(str7, new String[]{"="}, false, 0, 6, (Object) null).get(1)).toUpperCase(Locale.ROOT);
                    vx2.m53590f(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    mo12159X();
                    String str8 = null;
                    if (vx2.m53586b(upperCase, "AKTSERVERERROR")) {
                        mo12165f0(w, (String) null);
                        return;
                    }
                    if (ow72 != null) {
                        str2 = ow72.mo24213g("tempU5");
                    } else {
                        str2 = null;
                    }
                    if (ow72 != null) {
                        str3 = ow72.mo24213g("tempKA");
                    } else {
                        str3 = null;
                    }
                    if (ow72 != null) {
                        str4 = ow72.mo24213g("tempUK5");
                    } else {
                        str4 = null;
                    }
                    if (ow72 != null) {
                        str8 = ow72.mo24213g("tempK5");
                    }
                    if (str2 != null) {
                        f06.m57524o(this, "U5", str2);
                        ow72.mo24209c("U5", str2);
                    }
                    if (str3 != null) {
                        f06.m57524o(this, "KA", str3);
                        ow72.mo24209c("KA", str3);
                    }
                    if (str8 != null) {
                        up1.m72960e(this, "K5", str8);
                        ow72.mo24209c("K5", str8);
                    }
                    if (str4 != null) {
                        up1.m72960e(this, "UK5", str4);
                        ow72.mo24209c("UK5", str4);
                    }
                    C9001np.m69943a0(new WeakReference(this), (Integer) null, Integer.valueOf(R.string.akt_change_password_dialog_success_content), R.string.action_ok, new AKTChangePasswordActivity$parseMessage$5(this), 2, (Object) null);
                }
            }
        }
    }

    /* renamed from: f0 */
    public void mo12165f0(String[] strArr, String str) {
        C9001np.m69943a0(new WeakReference(this), (Integer) null, Integer.valueOf(R.string.akt_error_change_password_message), 0, (pc2) null, 26, (Object) null);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((View) mo56572x0().mo45703b());
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo959l();
        }
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(zr0.m31440c(this, 17170445));
        getWindow().setBackgroundDrawableResource(R.drawable.bottom_curve);
        mo56573y0().mo60957m();
        mo56566A0();
    }

    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        C6237m9 x0 = mo56572x0();
        x0.f31563n.f21125c.setOnClickListener(new C7321k(this));
        x0.f31563n.f21127e.setText(R.string.screen_change_login_credential_title);
        x0.f31558i.addTextChangedListener(new C8124b(x0, this));
        x0.f31557h.addTextChangedListener(new C8125c(x0, this));
        x0.f31556g.addTextChangedListener(new C8126d(x0, this));
        x0.f31551b.setOnClickListener(new C7813l(this));
        x0.f31552c.setOnClickListener(new C7852m(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c7  */
    /* renamed from: v0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo56570v0() {
        /*
            r8 = this;
            m9 r0 = r8.mo56572x0()
            androidx.appcompat.widget.AppCompatEditText r1 = r0.f31558i
            android.text.Editable r1 = r1.getText()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0017
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r1 = r3
            goto L_0x0018
        L_0x0017:
            r1 = r2
        L_0x0018:
            if (r1 != 0) goto L_0x0045
            androidx.appcompat.widget.AppCompatEditText r1 = r0.f31557h
            android.text.Editable r1 = r1.getText()
            if (r1 == 0) goto L_0x002b
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0029
            goto L_0x002b
        L_0x0029:
            r1 = r3
            goto L_0x002c
        L_0x002b:
            r1 = r2
        L_0x002c:
            if (r1 != 0) goto L_0x0045
            androidx.appcompat.widget.AppCompatEditText r1 = r0.f31556g
            android.text.Editable r1 = r1.getText()
            if (r1 == 0) goto L_0x003f
            int r1 = r1.length()
            if (r1 != 0) goto L_0x003d
            goto L_0x003f
        L_0x003d:
            r1 = r3
            goto L_0x0040
        L_0x003f:
            r1 = r2
        L_0x0040:
            if (r1 == 0) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            r1 = r2
            goto L_0x0046
        L_0x0045:
            r1 = r3
        L_0x0046:
            androidx.appcompat.widget.AppCompatEditText r4 = r0.f31557h
            android.text.Editable r4 = r4.getText()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            androidx.appcompat.widget.AppCompatEditText r5 = r0.f31556g
            android.text.Editable r5 = r5.getText()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r6 = r4.length()
            r7 = 8
            if (r6 < r7) goto L_0x0068
            boolean r6 = p000.ko6.m59873f(r4)
            if (r6 != 0) goto L_0x0069
        L_0x0068:
            r1 = r3
        L_0x0069:
            boolean r4 = p000.vx2.m53586b(r4, r5)
            if (r4 != 0) goto L_0x0083
            int r4 = r5.length()
            if (r4 <= 0) goto L_0x0077
            r4 = r2
            goto L_0x0078
        L_0x0077:
            r4 = r3
        L_0x0078:
            if (r4 == 0) goto L_0x0083
            bf3 r1 = r0.f31559j
            android.widget.TextView r1 = r1.f21283h
            r1.setVisibility(r3)
            r1 = r3
            goto L_0x008a
        L_0x0083:
            bf3 r4 = r0.f31559j
            android.widget.TextView r4 = r4.f21283h
            r4.setVisibility(r7)
        L_0x008a:
            m9 r4 = r8.mo56572x0()
            androidx.appcompat.widget.AppCompatEditText r4 = r4.f31558i
            android.text.Editable r4 = r4.getText()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r5 = r4.length()
            if (r5 <= 0) goto L_0x009f
            goto L_0x00a0
        L_0x009f:
            r2 = r3
        L_0x00a0:
            if (r2 == 0) goto L_0x00b7
            int r2 = r4.length()
            r5 = 7
            if (r2 < r5) goto L_0x00b1
            int r2 = r4.length()
            r4 = 18
            if (r2 <= r4) goto L_0x00b7
        L_0x00b1:
            android.widget.TextView r1 = r0.f31567r
            r1.setVisibility(r3)
            goto L_0x00bd
        L_0x00b7:
            android.widget.TextView r2 = r0.f31567r
            r2.setVisibility(r7)
            r3 = r1
        L_0x00bd:
            if (r3 == 0) goto L_0x00c7
            androidx.appcompat.widget.AppCompatButton r1 = r0.f31551b
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r2)
            goto L_0x00ce
        L_0x00c7:
            androidx.appcompat.widget.AppCompatButton r1 = r0.f31551b
            r2 = 1056964608(0x3f000000, float:0.5)
            r1.setAlpha(r2)
        L_0x00ce:
            androidx.appcompat.widget.AppCompatButton r0 = r0.f31551b
            r0.setEnabled(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.activity.AKTChangePasswordActivity.mo56570v0():void");
    }

    /* renamed from: w0 */
    public final void mo56571w0(Editable editable) {
        boolean z;
        if (editable.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            bf3 bf3 = mo56572x0().f31559j;
            vx2.m53590f(bf3, "binding.lPasswordRequirements");
            String obj = editable.toString();
            if (obj.length() > 7) {
                bf3.f21280e.setTextColor(zr0.m31440c(this, R.color.btn_light_green));
                bf3.f21277b.setColorFilter(zr0.m31440c(this, R.color.btn_light_green), PorterDuff.Mode.MULTIPLY);
                bf3.f21280e.setTag("complete");
            } else {
                bf3.f21280e.setTextColor(zr0.m31440c(this, R.color.color_edit));
                bf3.f21277b.setColorFilter(zr0.m31440c(this, R.color.color_edit), PorterDuff.Mode.MULTIPLY);
                bf3.f21280e.setTag("incomplete");
            }
            if (ko6.m59874g(obj)) {
                bf3.f21284i.setTextColor(zr0.m31440c(this, R.color.btn_light_green));
                bf3.f21278c.setColorFilter(zr0.m31440c(this, R.color.btn_light_green), PorterDuff.Mode.MULTIPLY);
                bf3.f21284i.setTag("complete");
            } else {
                bf3.f21284i.setTextColor(zr0.m31440c(this, R.color.color_edit));
                bf3.f21278c.setColorFilter(zr0.m31440c(this, R.color.color_edit), PorterDuff.Mode.MULTIPLY);
                bf3.f21284i.setTag("incomplete");
            }
            if (ko6.m59872e(obj)) {
                bf3.f21282g.setTextColor(zr0.m31440c(this, R.color.btn_light_green));
                bf3.f21279d.setColorFilter(zr0.m31440c(this, R.color.btn_light_green), PorterDuff.Mode.MULTIPLY);
                bf3.f21282g.setTag("complete");
                return;
            }
            bf3.f21282g.setTextColor(zr0.m31440c(this, R.color.color_edit));
            bf3.f21279d.setColorFilter(zr0.m31440c(this, R.color.color_edit), PorterDuff.Mode.MULTIPLY);
            bf3.f21282g.setTag("incomplete");
        }
    }

    /* renamed from: x0 */
    public final C6237m9 mo56572x0() {
        return (C6237m9) this.f41241A.getValue();
    }

    /* renamed from: y0 */
    public final AKTWebSocketHandlingViewModel mo56573y0() {
        return (AKTWebSocketHandlingViewModel) this.f41242B.getValue();
    }

    /* renamed from: z0 */
    public final void mo56574z0() {
        mo56572x0().f31551b.setEnabled(false);
        ProgressLoading.C8308a aVar = ProgressLoading.f41785Y;
        String string = getString(R.string.loading);
        vx2.m53590f(string, "getString(R.string.loading)");
        ProgressLoading a = aVar.mo57297a(false, string, "");
        this.f8528r = a;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        vx2.m53590f(supportFragmentManager, "supportFragmentManager");
        a.mo57295D(supportFragmentManager);
        String valueOf = String.valueOf(mo56572x0().f31558i.getText());
        String valueOf2 = String.valueOf(mo56572x0().f31557h.getText());
        Common common = Common.f42577a;
        mo56568G0(mo56567F0(common.mo60910q(valueOf), common.mo60910q(valueOf2)));
    }
}
