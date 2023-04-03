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
import java.util.Locale;
import kotlin.C6169a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt__StringsKt;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.dialogs.ProgressLoading;
import net.safemoon.androidwallet.utils.Common;
import net.safemoon.androidwallet.viewmodels.AKTWebSocketHandlingViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 ,2\u00020\u0001:\u0001-B\u0007¢\u0006\u0004\b*\u0010+J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\u001c\u0010\u000e\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0016J+\u0010\u0013\u001a\u00020\u00042\u0010\u0010\u0011\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0007\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\b\u0010\u0018\u001a\u00020\u0004H\u0002J\b\u0010\u0019\u001a\u00020\u0004H\u0002R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020 8BX\u0002¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010#R\u0016\u0010'\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010)\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b(\u0010&¨\u0006."}, mo44877d2 = {"Lnet/safemoon/androidwallet/activity/AKTRegisterActivity;", "Lcom/AKT/anonymouskey/ui/login/AKTServerFunctions;", "Landroid/os/Bundle;", "savedInstanceState", "Lr37;", "onCreate", "onPostCreate", "", "toSend", "E0", "A0", "Low7;", "safeMoonppp", "message", "e0", "X", "", "parts", "aktapiid", "f0", "([Ljava/lang/String;Ljava/lang/String;)V", "Landroid/text/Editable;", "s", "x0", "w0", "u0", "Lqa;", "A", "Lef3;", "y0", "()Lqa;", "binding", "Lnet/safemoon/androidwallet/viewmodels/AKTWebSocketHandlingViewModel;", "B", "z0", "()Lnet/safemoon/androidwallet/viewmodels/AKTWebSocketHandlingViewModel;", "webSocketModel", "C", "Ljava/lang/String;", "username", "H", "password", "<init>", "()V", "I", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: AKTRegisterActivity.kt */
public final class AKTRegisterActivity extends AKTServerFunctions {

    /* renamed from: I */
    public static final C8151a f41315I = new C8151a((DefaultConstructorMarker) null);

    /* renamed from: A */
    public final ef3 f41316A = C6169a.m47232a(new AKTRegisterActivity$binding$2(this));

    /* renamed from: B */
    public final ef3 f41317B = new dd7(ua5.m52727b(AKTWebSocketHandlingViewModel.class), new AKTRegisterActivity$special$$inlined$viewModels$default$2(this), new AKTRegisterActivity$special$$inlined$viewModels$default$1(this), new AKTRegisterActivity$special$$inlined$viewModels$default$3((pc2) null, this));

    /* renamed from: C */
    public String f41318C = "";

    /* renamed from: H */
    public String f41319H = "";

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, mo44877d2 = {"Lnet/safemoon/androidwallet/activity/AKTRegisterActivity$a;", "", "Landroid/content/Context;", "context", "Lr37;", "a", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.activity.AKTRegisterActivity$a */
    /* compiled from: AKTRegisterActivity.kt */
    public static final class C8151a {
        public C8151a() {
        }

        public /* synthetic */ C8151a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo56700a(Context context) {
            vx2.m53591g(context, "context");
            context.startActivity(new Intent(context, AKTRegisterActivity.class));
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J(\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\fH\u0016¨\u0006\u000e"}, mo44877d2 = {"net/safemoon/androidwallet/activity/AKTRegisterActivity$b", "Landroid/text/TextWatcher;", "", "s", "", "start", "count", "after", "Lr37;", "beforeTextChanged", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.activity.AKTRegisterActivity$b */
    /* compiled from: AKTRegisterActivity.kt */
    public static final class C8152b implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ C6398qa f41320a;

        /* renamed from: d */
        public final /* synthetic */ AKTRegisterActivity f41321d;

        public C8152b(C6398qa qaVar, AKTRegisterActivity aKTRegisterActivity) {
            this.f41320a = qaVar;
            this.f41321d = aKTRegisterActivity;
        }

        public void afterTextChanged(Editable editable) {
            vx2.m53591g(editable, "s");
            String obj = editable.toString();
            String c = Common.f42577a.mo60897c(obj);
            if (!vx2.m53586b(obj, c)) {
                EditText editText = this.f41320a.f33011g.getEditText();
                if (editText != null) {
                    editText.setText(c);
                }
                EditText editText2 = this.f41320a.f33011g.getEditText();
                if (editText2 != null) {
                    editText2.setSelection(c.length());
                    return;
                }
                return;
            }
            this.f41321d.mo56696w0();
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            vx2.m53591g(charSequence, "s");
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            vx2.m53591g(charSequence, "s");
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J(\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\fH\u0016¨\u0006\u000e"}, mo44877d2 = {"net/safemoon/androidwallet/activity/AKTRegisterActivity$c", "Landroid/text/TextWatcher;", "", "s", "", "start", "count", "after", "Lr37;", "beforeTextChanged", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.activity.AKTRegisterActivity$c */
    /* compiled from: AKTRegisterActivity.kt */
    public static final class C8153c implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ C6398qa f41322a;

        /* renamed from: d */
        public final /* synthetic */ AKTRegisterActivity f41323d;

        public C8153c(C6398qa qaVar, AKTRegisterActivity aKTRegisterActivity) {
            this.f41322a = qaVar;
            this.f41323d = aKTRegisterActivity;
        }

        public void afterTextChanged(Editable editable) {
            vx2.m53591g(editable, "s");
            String obj = editable.toString();
            String c = Common.f42577a.mo60897c(obj);
            if (!vx2.m53586b(obj, c)) {
                EditText editText = this.f41322a.f33010f.getEditText();
                if (editText != null) {
                    editText.setText(c);
                }
                EditText editText2 = this.f41322a.f33010f.getEditText();
                if (editText2 != null) {
                    editText2.setSelection(c.length());
                    return;
                }
                return;
            }
            this.f41323d.mo56696w0();
            this.f41323d.mo56697x0(editable);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            vx2.m53591g(charSequence, "s");
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            vx2.m53591g(charSequence, "s");
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J(\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\fH\u0016¨\u0006\u000e"}, mo44877d2 = {"net/safemoon/androidwallet/activity/AKTRegisterActivity$d", "Landroid/text/TextWatcher;", "", "s", "", "start", "count", "after", "Lr37;", "beforeTextChanged", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.activity.AKTRegisterActivity$d */
    /* compiled from: AKTRegisterActivity.kt */
    public static final class C8154d implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ C6398qa f41324a;

        /* renamed from: d */
        public final /* synthetic */ AKTRegisterActivity f41325d;

        public C8154d(C6398qa qaVar, AKTRegisterActivity aKTRegisterActivity) {
            this.f41324a = qaVar;
            this.f41325d = aKTRegisterActivity;
        }

        public void afterTextChanged(Editable editable) {
            vx2.m53591g(editable, "s");
            String obj = editable.toString();
            String c = Common.f42577a.mo60897c(obj);
            if (!vx2.m53586b(obj, c)) {
                EditText editText = this.f41324a.f33009e.getEditText();
                if (editText != null) {
                    editText.setText(c);
                }
                EditText editText2 = this.f41324a.f33009e.getEditText();
                if (editText2 != null) {
                    editText2.setSelection(c.length());
                    return;
                }
                return;
            }
            this.f41325d.mo56696w0();
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            vx2.m53591g(charSequence, "s");
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            vx2.m53591g(charSequence, "s");
        }
    }

    /* renamed from: B0 */
    public static final void m65054B0(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: C0 */
    public static final void m65055C0(AKTRegisterActivity aKTRegisterActivity, View view) {
        vx2.m53591g(aKTRegisterActivity, "this$0");
        aKTRegisterActivity.onBackPressed();
    }

    /* renamed from: D0 */
    public static final void m65056D0(AKTRegisterActivity aKTRegisterActivity, View view) {
        vx2.m53591g(aKTRegisterActivity, "this$0");
        a77.m55427e(aKTRegisterActivity);
    }

    /* renamed from: v0 */
    public static final void m65064v0(AKTRegisterActivity aKTRegisterActivity, View view) {
        Editable editable;
        vx2.m53591g(aKTRegisterActivity, "this$0");
        aKTRegisterActivity.mo56698y0().f33006b.setEnabled(false);
        ProgressLoading.C8308a aVar = ProgressLoading.f41785Y;
        String string = aKTRegisterActivity.getString(R.string.loading);
        vx2.m53590f(string, "getString(R.string.loading)");
        ProgressLoading a = aVar.mo57297a(false, string, "");
        aKTRegisterActivity.f8528r = a;
        FragmentManager supportFragmentManager = aKTRegisterActivity.getSupportFragmentManager();
        vx2.m53590f(supportFragmentManager, "supportFragmentManager");
        a.mo57295D(supportFragmentManager);
        EditText editText = aKTRegisterActivity.mo56698y0().f33011g.getEditText();
        Editable editable2 = null;
        if (editText != null) {
            editable = editText.getText();
        } else {
            editable = null;
        }
        aKTRegisterActivity.f41318C = String.valueOf(editable);
        EditText editText2 = aKTRegisterActivity.mo56698y0().f33010f.getEditText();
        if (editText2 != null) {
            editable2 = editText2.getText();
        }
        aKTRegisterActivity.f41319H = String.valueOf(editable2);
        Common common = Common.f42577a;
        aKTRegisterActivity.mo56694E0(aKTRegisterActivity.mo12157V(common.mo60910q(aKTRegisterActivity.f41318C), common.mo60910q(aKTRegisterActivity.f41319H)));
    }

    /* renamed from: A0 */
    public void mo56693A0() {
        mo56699z0().mo60953i().observe(this, new C9322t1(new AKTRegisterActivity$initReceiveResponse$1(this)));
    }

    /* renamed from: E0 */
    public void mo56694E0(String str) {
        if (str != null) {
            mo56699z0().mo60956l(str);
        }
    }

    /* renamed from: X */
    public void mo12159X() {
        mo56699z0().mo60951g();
    }

    /* renamed from: e0 */
    public void mo12164e0(ow7 ow7, String str) {
        boolean z;
        String str2 = str;
        mo56698y0().f33006b.setEnabled(true);
        if (!mo12163d0(str2)) {
            this.f8528r.mo22266k();
            Common common = Common.f42577a;
            String[] w = C2127d2.m14658w(common.mo60918y(this, str2), "|");
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
                        AKTSecurityQuestionsActivity.f41338q1.mo56758a(this, common.mo60910q(this.f41318C), common.mo60910q(this.f41319H), this.f41318C);
                        return;
                    }
                    mo12165f0(w, (String) null);
                }
            }
        }
    }

    /* renamed from: f0 */
    public void mo12165f0(String[] strArr, String str) {
        C9001np.m69939X(new WeakReference(this), (Integer) null, Integer.valueOf(R.string.akt_error_password_error_message), 0, (pc2) null, 26, (Object) null);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((View) mo56698y0().mo47037b());
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo959l();
        }
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(zr0.m31440c(this, 17170445));
        getWindow().setBackgroundDrawable(new ColorDrawable(getColor(R.color.akt_night_background)));
        mo56699z0().mo60957m();
        mo56693A0();
        mo56695u0();
    }

    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        String i = f06.m57518i(this, "EMAILRAW");
        C6398qa y0 = mo56698y0();
        y0.f33022r.setText(i);
        mo56696w0();
        EditText editText = y0.f33011g.getEditText();
        if (editText != null) {
            editText.addTextChangedListener(new C8152b(y0, this));
        }
        EditText editText2 = y0.f33010f.getEditText();
        if (editText2 != null) {
            editText2.addTextChangedListener(new C8153c(y0, this));
        }
        EditText editText3 = y0.f33009e.getEditText();
        if (editText3 != null) {
            editText3.addTextChangedListener(new C8154d(y0, this));
        }
        EditText editText4 = y0.f33010f.getEditText();
        vx2.m53588d(editText4);
        Editable text = editText4.getText();
        vx2.m53590f(text, "etPassword.editText!!.text");
        mo56697x0(text);
        y0.f33017m.f21597e.setText(getString(R.string.akt_activity_register_txt));
        y0.f33017m.f21594b.setVisibility(0);
        y0.f33017m.f21594b.setOnClickListener(new C9379u1(this));
        y0.f33007c.setOnClickListener(new C9430v1(this));
    }

    /* renamed from: u0 */
    public final void mo56695u0() {
        mo56698y0().f33006b.setOnClickListener(new C9295s1(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0111  */
    /* renamed from: w0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo56696w0() {
        /*
            r9 = this;
            qa r0 = r9.mo56698y0()
            com.google.android.material.textfield.TextInputLayout r1 = r0.f33011g
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
            com.google.android.material.textfield.TextInputLayout r1 = r0.f33010f
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
            com.google.android.material.textfield.TextInputLayout r1 = r0.f33009e
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
            com.google.android.material.textfield.TextInputLayout r5 = r0.f33010f
            android.widget.EditText r5 = r5.getEditText()
            if (r5 == 0) goto L_0x006c
            android.text.Editable r5 = r5.getText()
            goto L_0x006d
        L_0x006c:
            r5 = r2
        L_0x006d:
            java.lang.String r5 = java.lang.String.valueOf(r5)
            com.google.android.material.textfield.TextInputLayout r6 = r0.f33009e
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
            android.widget.TextView r1 = r0.f33018n
            r1.setVisibility(r4)
            r1 = r4
            goto L_0x00af
        L_0x00aa:
            android.widget.TextView r5 = r0.f33018n
            r5.setVisibility(r8)
        L_0x00af:
            qa r5 = r9.mo56698y0()
            com.google.android.material.textfield.TextInputLayout r5 = r5.f33011g
            android.widget.EditText r5 = r5.getEditText()
            if (r5 == 0) goto L_0x00bf
            android.text.Editable r2 = r5.getText()
        L_0x00bf:
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.CharSequence r2 = kotlin.text.StringsKt__StringsKt.m63092W0(r2)
            java.lang.String r2 = r2.toString()
            int r5 = r2.length()
            if (r5 <= 0) goto L_0x00d3
            r5 = r3
            goto L_0x00d4
        L_0x00d3:
            r5 = r4
        L_0x00d4:
            if (r5 == 0) goto L_0x00ec
            int r5 = r2.length()
            r6 = 7
            if (r5 < r6) goto L_0x00e5
            int r2 = r2.length()
            r5 = 18
            if (r2 <= r5) goto L_0x00ec
        L_0x00e5:
            android.widget.TextView r1 = r0.f33026v
            r1.setVisibility(r4)
            r1 = r4
            goto L_0x00f1
        L_0x00ec:
            android.widget.TextView r2 = r0.f33026v
            r2.setVisibility(r8)
        L_0x00f1:
            if (r1 == 0) goto L_0x0111
            com.google.android.material.button.MaterialButton r1 = r0.f33006b
            r2 = 2131099707(0x7f06003b, float:1.7811775E38)
            int r2 = r9.getColor(r2)
            r1.setTextColor(r2)
            com.google.android.material.button.MaterialButton r1 = r0.f33006b
            r1.setEnabled(r3)
            com.google.android.material.button.MaterialButton r0 = r0.f33006b
            r1 = 2131099676(0x7f06001c, float:1.7811712E38)
            android.content.res.ColorStateList r1 = r9.getColorStateList(r1)
            r0.setBackgroundTintList(r1)
            goto L_0x012e
        L_0x0111:
            com.google.android.material.button.MaterialButton r1 = r0.f33006b
            r2 = 2131100019(0x7f060173, float:1.7812408E38)
            int r2 = r9.getColor(r2)
            r1.setTextColor(r2)
            com.google.android.material.button.MaterialButton r1 = r0.f33006b
            r1.setEnabled(r4)
            com.google.android.material.button.MaterialButton r0 = r0.f33006b
            r1 = 2131099677(0x7f06001d, float:1.7811714E38)
            android.content.res.ColorStateList r1 = r9.getColorStateList(r1)
            r0.setBackgroundTintList(r1)
        L_0x012e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.activity.AKTRegisterActivity.mo56696w0():void");
    }

    /* renamed from: x0 */
    public final void mo56697x0(Editable editable) {
        int c = zr0.m31440c(this, R.color.akt_sign_in_wipe);
        ColorStateList d = zr0.m31441d(this, R.color.akt_sign_in_wipe);
        int c2 = zr0.m31440c(this, R.color.akt_button_inactive);
        ColorStateList d2 = zr0.m31441d(this, R.color.akt_button_inactive);
        if (editable.toString().length() > 7) {
            mo56698y0().f33015k.setTextColor(c);
            mo56698y0().f33012h.setImageTintList(d);
            mo56698y0().f33015k.setTag("complete");
        } else {
            mo56698y0().f33015k.setTextColor(c2);
            mo56698y0().f33012h.setImageTintList(d2);
            mo56698y0().f33015k.setTag("incomplete");
        }
        if (ko6.m59874g(editable.toString())) {
            mo56698y0().f33020p.setTextColor(c);
            mo56698y0().f33013i.setImageTintList(d);
            mo56698y0().f33020p.setTag("complete");
        } else {
            mo56698y0().f33020p.setTextColor(c2);
            mo56698y0().f33013i.setImageTintList(d2);
            mo56698y0().f33020p.setTag("incomplete");
        }
        if (ko6.m59872e(editable.toString())) {
            mo56698y0().f33019o.setTextColor(c);
            mo56698y0().f33014j.setImageTintList(d);
            mo56698y0().f33019o.setTag("complete");
            return;
        }
        mo56698y0().f33019o.setTextColor(c2);
        mo56698y0().f33014j.setImageTintList(d2);
        mo56698y0().f33019o.setTag("incomplete");
    }

    /* renamed from: y0 */
    public final C6398qa mo56698y0() {
        return (C6398qa) this.f41316A.getValue();
    }

    /* renamed from: z0 */
    public final AKTWebSocketHandlingViewModel mo56699z0() {
        return (AKTWebSocketHandlingViewModel) this.f41317B.getValue();
    }
}
