package net.safemoon.androidwallet.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import kotlin.C6169a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.activity.common.BasicActivity;
import p000.dq6;
import p000.wo2;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002J\b\u0010\n\u001a\u00020\u0004H\u0002J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002R\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001c"}, mo44877d2 = {"Lnet/safemoon/androidwallet/activity/EnterPasswordActivity;", "Lnet/safemoon/androidwallet/activity/common/BasicActivity;", "Landroid/os/Bundle;", "savedInstanceState", "Lr37;", "onCreate", "onBackPressed", "b0", "h0", "Z", "g0", "", "isActive", "i0", "Lba;", "r", "Lef3;", "a0", "()Lba;", "mBinding", "Lwo2;", "s", "Lwo2;", "requestBiometricAuthUseCase", "<init>", "()V", "x", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
@SuppressLint({"ClickableViewAccessibility"})
/* compiled from: EnterPasswordActivity.kt */
public final class EnterPasswordActivity extends BasicActivity {

    /* renamed from: x */
    public static final C8183a f41442x = new C8183a((DefaultConstructorMarker) null);

    /* renamed from: y */
    public static final String f41443y;

    /* renamed from: r */
    public final ef3 f41444r = C6169a.m47232a(new EnterPasswordActivity$mBinding$2(this));

    /* renamed from: s */
    public wo2 f41445s = new y12();

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, mo44877d2 = {"Lnet/safemoon/androidwallet/activity/EnterPasswordActivity$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.activity.EnterPasswordActivity$a */
    /* compiled from: EnterPasswordActivity.kt */
    public static final class C8183a {
        public C8183a() {
        }

        public /* synthetic */ C8183a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, mo44877d2 = {"net/safemoon/androidwallet/activity/EnterPasswordActivity$b", "Lwo2$a;", "", "errorCode", "Lr37;", "a", "b", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.activity.EnterPasswordActivity$b */
    /* compiled from: EnterPasswordActivity.kt */
    public static final class C8184b implements wo2.C9557a {

        /* renamed from: a */
        public final /* synthetic */ EnterPasswordActivity f41446a;

        /* renamed from: b */
        public final /* synthetic */ boolean f41447b;

        public C8184b(EnterPasswordActivity enterPasswordActivity, boolean z) {
            this.f41446a = enterPasswordActivity;
            this.f41447b = z;
        }

        /* renamed from: a */
        public void mo56680a(int i) {
            this.f41446a.mo56838a0().f21199e.setChecked(!this.f41447b);
            this.f41446a.mo56842i0(!this.f41447b);
            f06.m57523n(this.f41446a, "TWO_FACTOR", Boolean.valueOf(!this.f41447b));
        }

        /* renamed from: b */
        public void mo56681b() {
            this.f41446a.mo56842i0(this.f41447b);
            f06.m57523n(this.f41446a, "TWO_FACTOR", Boolean.valueOf(this.f41447b));
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J(\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\fH\u0016¨\u0006\u000e"}, mo44877d2 = {"net/safemoon/androidwallet/activity/EnterPasswordActivity$c", "Landroid/text/TextWatcher;", "", "s", "", "start", "count", "after", "Lr37;", "beforeTextChanged", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.activity.EnterPasswordActivity$c */
    /* compiled from: EnterPasswordActivity.kt */
    public static final class C8185c implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ EnterPasswordActivity f41448a;

        public C8185c(EnterPasswordActivity enterPasswordActivity) {
            this.f41448a = enterPasswordActivity;
        }

        public void afterTextChanged(Editable editable) {
            boolean z;
            vx2.m53591g(editable, "s");
            if (editable.toString().length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f41448a.mo56838a0().f21201g.setVisibility(8);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            vx2.m53591g(charSequence, "s");
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            vx2.m53591g(charSequence, "s");
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, mo44877d2 = {"net/safemoon/androidwallet/activity/EnterPasswordActivity$d", "Lwo2$a;", "", "errorCode", "Lr37;", "a", "b", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.activity.EnterPasswordActivity$d */
    /* compiled from: EnterPasswordActivity.kt */
    public static final class C8186d implements wo2.C9557a {

        /* renamed from: a */
        public final /* synthetic */ EnterPasswordActivity f41449a;

        public C8186d(EnterPasswordActivity enterPasswordActivity) {
            this.f41449a = enterPasswordActivity;
        }

        /* renamed from: a */
        public void mo56680a(int i) {
            dq6.C6999b e = dq6.f37375a.mo51267e(EnterPasswordActivity.f41443y);
            e.mo51264a("OnBioAuthenticationCallback: error" + i, new Object[0]);
        }

        /* renamed from: b */
        public void mo56681b() {
            dq6.f37375a.mo51267e(EnterPasswordActivity.f41443y).mo51264a("OnBioAuthenticationCallback: onSucceed", new Object[0]);
            this.f41449a.mo56840g0();
        }
    }

    static {
        String simpleName = EnterPasswordActivity.class.getSimpleName();
        vx2.m53590f(simpleName, "EnterPasswordActivity::class.java.simpleName");
        f41443y = simpleName;
    }

    /* renamed from: c0 */
    public static final void m65331c0(EnterPasswordActivity enterPasswordActivity, CompoundButton compoundButton, boolean z) {
        vx2.m53591g(enterPasswordActivity, "this$0");
        enterPasswordActivity.f41445s.mo66750b(enterPasswordActivity, new C8184b(enterPasswordActivity, z));
    }

    /* renamed from: d0 */
    public static final void m65332d0(EnterPasswordActivity enterPasswordActivity, View view) {
        vx2.m53591g(enterPasswordActivity, "this$0");
        enterPasswordActivity.mo56841h0();
    }

    /* renamed from: e0 */
    public static final boolean m65333e0(EnterPasswordActivity enterPasswordActivity, TextView textView, int i, KeyEvent keyEvent) {
        vx2.m53591g(enterPasswordActivity, "this$0");
        if ((keyEvent == null || keyEvent.getKeyCode() != 66) && i != 6) {
            return false;
        }
        enterPasswordActivity.mo56837Z();
        return false;
    }

    /* renamed from: f0 */
    public static final void m65334f0(EnterPasswordActivity enterPasswordActivity, View view) {
        vx2.m53591g(enterPasswordActivity, "this$0");
        enterPasswordActivity.startActivity(new Intent(enterPasswordActivity, WipeDataActivity.class));
    }

    /* renamed from: Z */
    public final void mo56837Z() {
        Editable editable;
        String j = f06.m57519j(this, "SAFEMOON_PASSWORD", "");
        vx2.m53590f(j, "getString(this, SharedPrefs.SAFEMOON_PASSWORD, \"\")");
        EditText editText = mo56838a0().f21200f.getEditText();
        if (editText != null) {
            editable = editText.getText();
        } else {
            editable = null;
        }
        if (vx2.m53586b(String.valueOf(editable), j)) {
            mo56840g0();
            return;
        }
        mo56838a0().f21201g.setVisibility(0);
        EditText editText2 = mo56838a0().f21200f.getEditText();
        if (editText2 != null) {
            editText2.setText("");
        }
    }

    /* renamed from: a0 */
    public final C3887ba mo56838a0() {
        return (C3887ba) this.f41444r.getValue();
    }

    /* renamed from: b0 */
    public final void mo56839b0() {
        boolean z;
        if (!f06.m57514e(this, "TWO_FACTOR", false) || ol0.m70351c(this) == null) {
            z = false;
        } else {
            z = true;
        }
        boolean e = f06.m57514e(this, "TWO_FACTOR", false);
        mo56838a0().f21199e.setChecked(e);
        mo56842i0(e);
        mo56838a0().f21199e.setOnCheckedChangeListener(new rq1(this));
        mo56838a0().f21196b.setOnClickListener(new sq1(this));
        EditText editText = mo56838a0().f21200f.getEditText();
        if (editText != null) {
            editText.setOnEditorActionListener(new tq1(this));
        }
        EditText editText2 = mo56838a0().f21200f.getEditText();
        if (editText2 != null) {
            editText2.addTextChangedListener(new C8185c(this));
        }
        if (z && a77.m55426d(this)) {
            mo56841h0();
        }
    }

    /* renamed from: g0 */
    public final void mo56840g0() {
        startActivity(new Intent(this, AKTRegisterGuideActivity.class));
    }

    /* renamed from: h0 */
    public final void mo56841h0() {
        this.f41445s.mo66750b(this, new C8186d(this));
    }

    /* renamed from: i0 */
    public final void mo56842i0(boolean z) {
        if (z) {
            mo56838a0().f21196b.setVisibility(0);
        } else {
            mo56838a0().f21196b.setVisibility(8);
        }
    }

    public void onBackPressed() {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((View) mo56838a0().mo29509b());
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo959l();
        }
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(zr0.m31440c(this, 17170445));
        getWindow().setBackgroundDrawable(new ColorDrawable(getColor(R.color.akt_night_background)));
        mo56839b0();
        mo56838a0().f21204j.setOnClickListener(new qq1(this));
    }
}
