package net.safemoon.androidwallet.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.CompoundButton;
import androidx.fragment.app.C0684j;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.activity.common.BasicActivity;
import net.safemoon.androidwallet.fragments.FullScreenWebViewFragment;

public class MainActivity extends BasicActivity {

    /* renamed from: r */
    public C6240ma f41458r;

    /* renamed from: s */
    public k04<Boolean> f41459s = new k04<>(Boolean.FALSE);

    /* access modifiers changed from: private */
    /* renamed from: W */
    public /* synthetic */ void m65392W(View view) {
        if (this.f41459s.getValue().booleanValue()) {
            startActivity(new Intent(this, CreateWalletActivity.class));
        } else {
            mo56862b0();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: X */
    public /* synthetic */ void m65393X(View view) {
        if (this.f41459s.getValue().booleanValue()) {
            ImportWalletOptionActivity.f41452s.mo56853a(this);
        } else {
            mo56862b0();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public /* synthetic */ void m65394Y(View view) {
        a77.m55427e(this);
        C0684j q = getSupportFragmentManager().mo5996q();
        q.mo6270s(R.id.content_main, FullScreenWebViewFragment.f41947s.mo57487a("https://safemoon.com/legal/wallet/eula ", R.string.terms_of_service, false));
        q.mo6267h(FullScreenWebViewFragment.class.getSimpleName());
        q.mo6139j();
    }

    /* access modifiers changed from: private */
    /* renamed from: Z */
    public /* synthetic */ void m65395Z(CompoundButton compoundButton, boolean z) {
        this.f41459s.setValue(Boolean.valueOf(z));
    }

    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public /* synthetic */ void m65396a0(View view) {
        onBackPressed();
    }

    /* renamed from: b0 */
    public final void mo56862b0() {
        ol0.m70325E(this);
        this.f41458r.f31607b.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.shake));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C6240ma c = C6240ma.m48198c(getLayoutInflater());
        this.f41458r = c;
        setContentView((View) c.mo45729b());
        if (getSupportActionBar() != null) {
            getSupportActionBar().mo959l();
        }
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(zr0.m31440c(this, 17170445));
        getWindow().setBackgroundDrawableResource(R.drawable.ic_bg);
        this.f41458r.f31610e.setOnClickListener(new qm3(this));
        this.f41458r.f31617l.setOnClickListener(new rm3(this));
        this.f41458r.f31608c.setOnClickListener(new sm3(this));
        this.f41458r.f31607b.setOnCheckedChangeListener(new tm3(this));
        this.f41458r.f31616k.setOnClickListener(new um3(this));
    }

    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        mo56995J();
    }
}
