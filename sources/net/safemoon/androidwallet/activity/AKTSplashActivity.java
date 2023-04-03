package net.safemoon.androidwallet.activity;

import android.app.NotificationManager;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationUtils;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import com.github.mikephil.charting.utils.Utils;
import kotlin.C6169a;
import kotlin.Metadata;
import net.safemoon.androidwallet.MyApplicationClass;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.model.wallets.Wallet;
import net.safemoon.androidwallet.utils.Common;
import net.safemoon.androidwallet.viewmodels.MultiWalletViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b$\u0010%J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002R\u001b\u0010\u000e\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001d8BX\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u000b\u001a\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u00020\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u0016¨\u0006&"}, mo44877d2 = {"Lnet/safemoon/androidwallet/activity/AKTSplashActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/os/Bundle;", "savedInstanceState", "Lr37;", "onCreate", "onPostCreate", "L", "R", "Lza;", "a", "Lef3;", "I", "()Lza;", "binding", "Lnet/safemoon/androidwallet/viewmodels/MultiWalletViewModel;", "d", "J", "()Lnet/safemoon/androidwallet/viewmodels/MultiWalletViewModel;", "multiWalletVM", "", "e", "Z", "isExistingMasterWallet", "Lwa;", "", "g", "Lwa;", "requestPermissionLauncher", "Landroid/app/NotificationManager;", "k", "K", "()Landroid/app/NotificationManager;", "notificationManager", "r", "isConfirmNotificationPermission", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: AKTSplashActivity.kt */
public final class AKTSplashActivity extends AppCompatActivity {

    /* renamed from: a */
    public final ef3 f41378a = C6169a.m47232a(new AKTSplashActivity$binding$2(this));

    /* renamed from: d */
    public final ef3 f41379d = new dd7(ua5.m52727b(MultiWalletViewModel.class), new AKTSplashActivity$special$$inlined$viewModels$default$2(this), new AKTSplashActivity$special$$inlined$viewModels$default$1(this), new AKTSplashActivity$special$$inlined$viewModels$default$3((pc2) null, this));

    /* renamed from: e */
    public boolean f41380e;

    /* renamed from: g */
    public C3529wa<String> f41381g;

    /* renamed from: k */
    public final ef3 f41382k = C6169a.m47232a(new AKTSplashActivity$notificationManager$2(this));

    /* renamed from: r */
    public boolean f41383r;

    /* renamed from: M */
    public static final void m65229M(AKTSplashActivity aKTSplashActivity, Boolean bool) {
        vx2.m53591g(aKTSplashActivity, "this$0");
        aKTSplashActivity.f41383r = true;
        aKTSplashActivity.mo56800L();
    }

    /* renamed from: N */
    public static final void m65230N(AKTSplashActivity aKTSplashActivity) {
        vx2.m53591g(aKTSplashActivity, "this$0");
        aKTSplashActivity.mo56800L();
    }

    /* renamed from: O */
    public static final void m65231O(AKTSplashActivity aKTSplashActivity) {
        vx2.m53591g(aKTSplashActivity, "this$0");
        aKTSplashActivity.mo56797I().f36073c.setVisibility(0);
        aKTSplashActivity.mo56797I().f36073c.setAnimation(AnimationUtils.loadAnimation(aKTSplashActivity, R.anim.rotate_animation));
        aKTSplashActivity.mo56797I().f36074d.setVisibility(0);
        aKTSplashActivity.mo56797I().f36075e.setVisibility(0);
        aKTSplashActivity.mo56797I().f36076f.setVisibility(0);
        aKTSplashActivity.mo56797I().f36077g.setVisibility(0);
    }

    /* renamed from: P */
    public static final void m65232P(AKTSplashActivity aKTSplashActivity) {
        vx2.m53591g(aKTSplashActivity, "this$0");
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, Utils.FLOAT_EPSILON);
        alphaAnimation.setDuration(200);
        aKTSplashActivity.mo56797I().f36072b.setAnimation(alphaAnimation);
    }

    /* renamed from: Q */
    public static final void m65233Q(AKTSplashActivity aKTSplashActivity) {
        vx2.m53591g(aKTSplashActivity, "this$0");
        aKTSplashActivity.mo56797I().f36072b.setVisibility(4);
        aKTSplashActivity.mo56797I().f36073c.setVisibility(4);
        aKTSplashActivity.mo56797I().f36074d.setVisibility(4);
        aKTSplashActivity.mo56797I().f36075e.setVisibility(4);
        aKTSplashActivity.mo56797I().f36076f.setVisibility(4);
        aKTSplashActivity.mo56797I().f36077g.setVisibility(4);
    }

    /* renamed from: I */
    public final C6760za mo56797I() {
        return (C6760za) this.f41378a.getValue();
    }

    /* renamed from: J */
    public final MultiWalletViewModel mo56798J() {
        return (MultiWalletViewModel) this.f41379d.getValue();
    }

    /* renamed from: K */
    public final NotificationManager mo56799K() {
        return (NotificationManager) this.f41382k.getValue();
    }

    /* renamed from: L */
    public final void mo56800L() {
        boolean z;
        if (this.f41383r) {
            Wallet c = ol0.m70351c(this);
            if (this.f41380e) {
                String i = f06.m57518i(this, "KA");
                vx2.m53590f(i, "getString(this, SharedPrefs.KA)");
                if (i.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    AKTLoginActivity.f41302L.mo56678a(this, false);
                    finish();
                }
            }
            if (c == null || c.getU5B64() != null) {
                AKTConfigurationsActivity.f41249x.mo56590a(this);
            } else {
                startActivity(new Intent(this, EnterPasswordActivity.class));
            }
            finish();
        }
    }

    /* renamed from: R */
    public final void mo56801R() {
        if (!this.f41380e && ol0.m70351c(this) == null) {
            ee3 ee3 = ee3.f37527a;
            ee3.mo51454c(this, ee3.mo51452a());
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Common.f42577a.mo60898d(this);
        Intent intent = getIntent();
        boolean z = false;
        if (intent != null && intent.hasExtra("ticket_id")) {
            z = true;
        }
        if (z) {
            MyApplicationClass.m64669c().f41184C = true;
            f06.m57523n(this, "ZENDESK_HAVE_NEW_REPLY", Boolean.TRUE);
        }
        setContentView((View) mo56797I().mo49812b());
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo959l();
        }
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(zr0.m31440c(this, 17170445));
        getWindow().setBackgroundDrawable(new ColorDrawable(getColor(R.color.akt_night_background)));
        mo56797I().f36077g.setText("V3.40");
        mo56798J().mo61256r(new AKTSplashActivity$onCreate$1(this));
        C3529wa<String> registerForActivityResult = registerForActivityResult(new C3399ua(), new C9434v2(this));
        vx2.m53590f(registerForActivityResult, "registerForActivityResul…leFirstScreen()\n        }");
        this.f41381g = registerForActivityResult;
        if (!mo56799K().areNotificationsEnabled()) {
            C3529wa<String> waVar = this.f41381g;
            if (waVar == null) {
                vx2.m53605u("requestPermissionLauncher");
                waVar = null;
            }
            waVar.mo27473a("android.permission.POST_NOTIFICATIONS");
            return;
        }
        this.f41383r = true;
    }

    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        new Handler(Looper.getMainLooper()).postDelayed(new C9477w2(this), 2200);
        mo56797I().f36072b.setVisibility(0);
        AlphaAnimation alphaAnimation = new AlphaAnimation(Utils.FLOAT_EPSILON, 1.0f);
        alphaAnimation.setDuration(300);
        mo56797I().f36072b.setAnimation(alphaAnimation);
        new Handler(Looper.getMainLooper()).postDelayed(new C9583x2(this), 500);
        new Handler(Looper.getMainLooper()).postDelayed(new C9620y2(this), 1785);
        new Handler(Looper.getMainLooper()).postDelayed(new C9662z2(this), 2000);
    }
}
