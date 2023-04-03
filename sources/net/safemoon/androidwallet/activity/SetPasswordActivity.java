package net.safemoon.androidwallet.activity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0729l;
import java.lang.ref.WeakReference;
import net.safemoon.androidwallet.MyApplicationClass;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.dialogs.ProgressLoading;
import net.safemoon.androidwallet.viewmodels.CreateWalletViewModel;
import net.safemoon.androidwallet.viewmodels.MultiWalletViewModel;

public class SetPasswordActivity extends AppCompatActivity {

    /* renamed from: a */
    public C6727ya f41475a;

    /* renamed from: d */
    public CreateWalletViewModel f41476d;

    /* renamed from: e */
    public MultiWalletViewModel f41477e;

    /* renamed from: g */
    public String f41478g = "";

    /* renamed from: k */
    public CreateWalletViewModel.KEY_TYPE f41479k;

    /* renamed from: net.safemoon.androidwallet.activity.SetPasswordActivity$a */
    public class C8196a implements TextWatcher {
        public C8196a() {
        }

        public void afterTextChanged(Editable editable) {
            String obj = SetPasswordActivity.this.f41475a.f35809c.getText().toString();
            if (editable.length() > 0 && obj.length() > 0) {
                if (editable.toString().equals(obj)) {
                    SetPasswordActivity.this.f41475a.f35824r.setVisibility(8);
                    SetPasswordActivity.this.f41475a.f35808b.setAlpha(1.0f);
                    return;
                }
                SetPasswordActivity.this.f41475a.f35824r.setVisibility(0);
                SetPasswordActivity.this.f41475a.f35808b.setAlpha(0.5f);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: net.safemoon.androidwallet.activity.SetPasswordActivity$b */
    public class C8197b implements TextWatcher {
        public C8197b() {
        }

        public void afterTextChanged(Editable editable) {
            String obj = SetPasswordActivity.this.f41475a.f35810d.getText().toString();
            if (editable.length() > 0 && obj.length() > 0) {
                if (editable.toString().equals(obj)) {
                    SetPasswordActivity.this.f41475a.f35824r.setVisibility(8);
                    SetPasswordActivity.this.f41475a.f35808b.setAlpha(1.0f);
                } else {
                    SetPasswordActivity.this.f41475a.f35824r.setVisibility(0);
                    SetPasswordActivity.this.f41475a.f35808b.setAlpha(0.5f);
                }
                if (editable.toString().length() > 7) {
                    SetPasswordActivity.this.f41475a.f35818l.setTextColor(zr0.m31440c(SetPasswordActivity.this, R.color.btn_light_green));
                    SetPasswordActivity.this.f41475a.f35814h.setColorFilter(zr0.m31440c(SetPasswordActivity.this, R.color.btn_light_green), PorterDuff.Mode.MULTIPLY);
                    SetPasswordActivity.this.f41475a.f35818l.setTag("complete");
                } else {
                    SetPasswordActivity.this.f41475a.f35818l.setTextColor(zr0.m31440c(SetPasswordActivity.this, R.color.color_edit));
                    SetPasswordActivity.this.f41475a.f35814h.setColorFilter(zr0.m31440c(SetPasswordActivity.this, R.color.color_edit), PorterDuff.Mode.MULTIPLY);
                    SetPasswordActivity.this.f41475a.f35818l.setTag("incomplete");
                }
                if (ko6.m59874g(editable.toString())) {
                    SetPasswordActivity.this.f41475a.f35826t.setTextColor(zr0.m31440c(SetPasswordActivity.this, R.color.btn_light_green));
                    SetPasswordActivity.this.f41475a.f35815i.setColorFilter(zr0.m31440c(SetPasswordActivity.this, R.color.btn_light_green), PorterDuff.Mode.MULTIPLY);
                    SetPasswordActivity.this.f41475a.f35826t.setTag("complete");
                } else {
                    SetPasswordActivity.this.f41475a.f35826t.setTextColor(zr0.m31440c(SetPasswordActivity.this, R.color.color_edit));
                    SetPasswordActivity.this.f41475a.f35815i.setColorFilter(zr0.m31440c(SetPasswordActivity.this, R.color.color_edit), PorterDuff.Mode.MULTIPLY);
                    SetPasswordActivity.this.f41475a.f35826t.setTag("incomplete");
                }
                if (ko6.m59870b(editable.toString())) {
                    SetPasswordActivity.this.f41475a.f35823q.setTextColor(zr0.m31440c(SetPasswordActivity.this, R.color.btn_light_green));
                    SetPasswordActivity.this.f41475a.f35816j.setColorFilter(zr0.m31440c(SetPasswordActivity.this, R.color.btn_light_green), PorterDuff.Mode.MULTIPLY);
                    SetPasswordActivity.this.f41475a.f35823q.setTag("complete");
                } else {
                    SetPasswordActivity.this.f41475a.f35823q.setTextColor(zr0.m31440c(SetPasswordActivity.this, R.color.color_edit));
                    SetPasswordActivity.this.f41475a.f35816j.setColorFilter(zr0.m31440c(SetPasswordActivity.this, R.color.color_edit), PorterDuff.Mode.MULTIPLY);
                    SetPasswordActivity.this.f41475a.f35823q.setTag("incomplete");
                }
                if (ko6.m59872e(editable.toString())) {
                    SetPasswordActivity.this.f41475a.f35825s.setTextColor(zr0.m31440c(SetPasswordActivity.this, R.color.btn_light_green));
                    SetPasswordActivity.this.f41475a.f35817k.setColorFilter(zr0.m31440c(SetPasswordActivity.this, R.color.btn_light_green), PorterDuff.Mode.MULTIPLY);
                    SetPasswordActivity.this.f41475a.f35825s.setTag("complete");
                    return;
                }
                SetPasswordActivity.this.f41475a.f35825s.setTextColor(zr0.m31440c(SetPasswordActivity.this, R.color.color_edit));
                SetPasswordActivity.this.f41475a.f35817k.setColorFilter(zr0.m31440c(SetPasswordActivity.this, R.color.color_edit), PorterDuff.Mode.MULTIPLY);
                SetPasswordActivity.this.f41475a.f35825s.setTag("incomplete");
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: G */
    public static /* synthetic */ void m65459G(DialogInterface dialogInterface) {
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public /* synthetic */ r37 m65460H(ProgressLoading progressLoading, Long l) {
        progressLoading.mo22266k();
        if (l == null || l.longValue() <= 0) {
            C9001np.m69938W(new WeakReference(this), Integer.valueOf(R.string.warning_iw_failed_title), Integer.valueOf(R.string.warning_iw_failed_msg), R.string.action_ok, (pc2<r37>) null);
        } else {
            MyApplicationClass.m64669c().f41193y = true;
            AKTHomeActivity.m64858g1(this);
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public /* synthetic */ r37 m65461I(ProgressLoading progressLoading, String str, String str2, String str3, String str4, Boolean bool) {
        if (bool.booleanValue()) {
            progressLoading.mo22266k();
            fy0.m57956e(this, Integer.valueOf(R.string.warning_title), R.string.warning_black_list_address, true, new iy5());
            return null;
        } else if (str2 != null) {
            f06.m57524o(this, "SAFEMOON_PASSWORD", str);
            f06.m57524o(this, "DEFAULT_GATEWAY", TokenType.BEP_20.getName());
            this.f41477e.mo61254o(str3, str2, str4, (String) null, true, false, new jy5(this, progressLoading));
            return null;
        } else {
            progressLoading.mo22266k();
            ol0.m70346Z(this, getString(R.string.nft_get_data_error));
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public /* synthetic */ void m65462J(View view) {
        if (this.f41475a.f35808b.getAlpha() != 1.0f) {
            ol0.m70346Z(this, "Password does not match");
        } else if (this.f41475a.f35810d.getText().toString().length() <= 7 || !ko6.m59873f(this.f41475a.f35810d.getText().toString())) {
            this.f41475a.f35811e.setVisibility(0);
        } else {
            String trim = this.f41475a.f35810d.getText().toString().trim();
            ProgressLoading a = ProgressLoading.f41785Y.mo57297a(false, getString(R.string.loading), "");
            a.mo57295D(getSupportFragmentManager());
            this.f41476d.mo61122c(this.f41478g, this.f41479k, new hy5(this, a, trim));
        }
    }

    /* renamed from: K */
    public static void m65463K(Context context, String str, CreateWalletViewModel.KEY_TYPE key_type) {
        Intent intent = new Intent(context, SetPasswordActivity.class);
        intent.putExtra("argKey", str);
        intent.putExtra("argKeyType", key_type);
        context.startActivity(intent);
    }

    /* renamed from: F */
    public final void mo56878F() {
        this.f41475a.f35808b.setOnClickListener(new gy5(this));
    }

    public final void initViews() {
        this.f41475a.f35810d.addTextChangedListener(new C8196a());
        this.f41475a.f35809c.addTextChangedListener(new C8197b());
    }

    public void onCreate(Bundle bundle) {
        this.f41478g = getIntent().getStringExtra("argKey");
        this.f41479k = (CreateWalletViewModel.KEY_TYPE) getIntent().getSerializableExtra("argKeyType");
        super.onCreate(bundle);
        C6727ya c = C6727ya.m54662c(getLayoutInflater());
        this.f41475a = c;
        setContentView((View) c.mo49618b());
        this.f41476d = (CreateWalletViewModel) new C0729l(this).mo6421a(CreateWalletViewModel.class);
        this.f41477e = (MultiWalletViewModel) new C0729l(this).mo6421a(MultiWalletViewModel.class);
        if (getSupportActionBar() != null) {
            getSupportActionBar().mo959l();
        }
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(zr0.m31440c(this, 17170445));
        getWindow().setBackgroundDrawableResource(R.drawable.ic_bg);
        initViews();
        mo56878F();
    }
}
