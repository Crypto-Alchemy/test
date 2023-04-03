package net.safemoon.androidwallet.activity;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import kotlin.C6169a;
import kotlin.Metadata;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.activity.AKTGetEmailActivity;
import net.safemoon.androidwallet.activity.common.BasicActivity;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\u001b\u0010\f\u001a\u00020\u00078BX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, mo44877d2 = {"Lnet/safemoon/androidwallet/activity/AKTRegisterGuideActivity;", "Lnet/safemoon/androidwallet/activity/common/BasicActivity;", "Landroid/os/Bundle;", "savedInstanceState", "Lr37;", "onCreate", "onPostCreate", "Lq9;", "r", "Lef3;", "U", "()Lq9;", "binding", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: AKTRegisterGuideActivity.kt */
public final class AKTRegisterGuideActivity extends BasicActivity {

    /* renamed from: r */
    public final ef3 f41326r = C6169a.m47232a(new AKTRegisterGuideActivity$binding$2(this));

    /* renamed from: V */
    public static final void m65079V(AKTRegisterGuideActivity aKTRegisterGuideActivity, View view) {
        vx2.m53591g(aKTRegisterGuideActivity, "this$0");
        aKTRegisterGuideActivity.onBackPressed();
    }

    /* renamed from: W */
    public static final void m65080W(AKTRegisterGuideActivity aKTRegisterGuideActivity, View view) {
        vx2.m53591g(aKTRegisterGuideActivity, "this$0");
        AKTGetEmailActivity.C8128a.m64833b(AKTGetEmailActivity.f41252M, aKTRegisterGuideActivity, false, true, false, 10, (Object) null);
    }

    /* renamed from: X */
    public static final void m65081X(AKTRegisterGuideActivity aKTRegisterGuideActivity, View view) {
        vx2.m53591g(aKTRegisterGuideActivity, "this$0");
        AKTLoginActivity.f41302L.mo56678a(aKTRegisterGuideActivity, true);
    }

    /* renamed from: U */
    public final C6395q9 mo56711U() {
        return (C6395q9) this.f41326r.getValue();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((View) mo56711U().mo47022b());
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo959l();
        }
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(zr0.m31440c(this, 17170445));
        getWindow().setBackgroundDrawable(new ColorDrawable(getColor(R.color.akt_night_background)));
    }

    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        C6395q9 U = mo56711U();
        U.f32985c.f21597e.setText(getString(R.string.akt_activity_register_txt));
        U.f32985c.f21595c.setVisibility(8);
        U.f32985c.f21596d.setVisibility(8);
        U.f32985c.f21594b.setOnClickListener(new C9476w1(this));
        U.f32984b.setOnClickListener(new C9580x1(this));
        U.f32988f.setOnClickListener(new C9618y1(this));
    }
}
