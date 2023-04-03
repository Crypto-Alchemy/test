package net.safemoon.androidwallet.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.C0729l;
import java.util.List;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.activity.common.BasicActivity;
import net.safemoon.androidwallet.viewmodels.CreateWalletViewModel;

public class CreateWalletActivity extends BasicActivity {

    /* renamed from: r */
    public C3804aa f41440r;

    /* renamed from: s */
    public CreateWalletViewModel f41441s;

    /* access modifiers changed from: private */
    /* renamed from: V */
    public /* synthetic */ void m65319V(TextView[] textViewArr, List list) {
        if (list != null && list.size() >= 12) {
            for (int i = 0; i < list.size(); i++) {
                textViewArr[i].setText((String) list.get(i));
            }
            this.f41440r.f20853c.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: W */
    public /* synthetic */ void m65320W(View view) {
        Intent intent = new Intent(this, ConfirmPassphraseActivity.class);
        intent.putExtra("mnemonic", TextUtils.join(" ", this.f41441s.mo61125f().getValue()));
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: X */
    public /* synthetic */ void m65321X(View view) {
        finish();
    }

    /* renamed from: U */
    public final void mo56836U() {
        C3804aa aaVar = this.f41440r;
        TextView[] textViewArr = {aaVar.f20867q, aaVar.f20871u, aaVar.f20872v, aaVar.f20873w, aaVar.f20874x, aaVar.f20875y, aaVar.f20876z, aaVar.f20849A, aaVar.f20850B, aaVar.f20868r, aaVar.f20869s, aaVar.f20870t};
        this.f41441s.mo61123d();
        this.f41441s.mo61125f().observe(this, new vv0(this, textViewArr));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C3804aa c = C3804aa.m31754c(getLayoutInflater());
        this.f41440r = c;
        setContentView((View) c.mo28898b());
        if (getSupportActionBar() != null) {
            getSupportActionBar().mo959l();
        }
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(zr0.m31440c(this, 17170445));
        getWindow().setBackgroundDrawableResource(R.drawable.ic_bg);
        this.f41441s = (CreateWalletViewModel) new C0729l(this).mo6421a(CreateWalletViewModel.class);
        mo56836U();
        this.f41440r.f20853c.setOnClickListener(new tv0(this));
        this.f41440r.f20852b.setOnClickListener(new uv0(this));
    }

    public void onPause() {
        super.onPause();
        if (!y40.f35760b.booleanValue()) {
            getWindow().clearFlags(8192);
        }
    }

    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        mo56995J();
    }

    public void onResume() {
        super.onResume();
        if (!y40.f35760b.booleanValue()) {
            getWindow().addFlags(8192);
        }
    }
}
