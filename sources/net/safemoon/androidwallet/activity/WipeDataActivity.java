package net.safemoon.androidwallet.activity;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import kotlin.C6169a;
import kotlin.Metadata;
import net.safemoon.androidwallet.R;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0006\u0010\u0007\u001a\u00020\u0004J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002R\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, mo44877d2 = {"Lnet/safemoon/androidwallet/activity/WipeDataActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/os/Bundle;", "savedInstanceState", "Lr37;", "onCreate", "onPostCreate", "L", "Landroid/app/Dialog;", "dialog", "N", "Leb;", "a", "Lef3;", "F", "()Leb;", "mBinding", "", "d", "I", "G", "()I", "K", "(I)V", "time", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: WipeDataActivity.kt */
public final class WipeDataActivity extends AppCompatActivity {

    /* renamed from: a */
    public final ef3 f41534a = C6169a.m47232a(new WipeDataActivity$mBinding$2(this));

    /* renamed from: d */
    public int f41535d = 5;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\b\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, mo44877d2 = {"net/safemoon/androidwallet/activity/WipeDataActivity$a", "Landroid/os/CountDownTimer;", "", "millisUntilFinished", "Lr37;", "onTick", "onFinish", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.activity.WipeDataActivity$a */
    /* compiled from: WipeDataActivity.kt */
    public static final class C8215a extends CountDownTimer {

        /* renamed from: a */
        public final /* synthetic */ TextView f41536a;

        /* renamed from: b */
        public final /* synthetic */ WipeDataActivity f41537b;

        /* renamed from: c */
        public final /* synthetic */ Dialog f41538c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8215a(TextView textView, WipeDataActivity wipeDataActivity, Dialog dialog) {
            super(5000, 1000);
            this.f41536a = textView;
            this.f41537b = wipeDataActivity;
            this.f41538c = dialog;
        }

        public void onFinish() {
            this.f41537b.mo56985N(this.f41538c);
        }

        @SuppressLint({"SetTextI18n"})
        public void onTick(long j) {
            TextView textView = this.f41536a;
            int G = this.f41537b.mo56982G();
            StringBuilder sb = new StringBuilder();
            sb.append(G);
            textView.setText(sb.toString());
            WipeDataActivity wipeDataActivity = this.f41537b;
            wipeDataActivity.mo56983K(wipeDataActivity.mo56982G() - 1);
        }
    }

    /* renamed from: H */
    public static final void m65661H(WipeDataActivity wipeDataActivity, View view) {
        vx2.m53591g(wipeDataActivity, "this$0");
        wipeDataActivity.onBackPressed();
    }

    /* renamed from: I */
    public static final void m65662I(WipeDataActivity wipeDataActivity, View view) {
        vx2.m53591g(wipeDataActivity, "this$0");
        wipeDataActivity.onBackPressed();
    }

    /* renamed from: J */
    public static final void m65663J(WipeDataActivity wipeDataActivity, View view) {
        vx2.m53591g(wipeDataActivity, "this$0");
        wipeDataActivity.mo56984L();
    }

    /* renamed from: M */
    public static final void m65664M(CountDownTimer countDownTimer, WipeDataActivity wipeDataActivity, Dialog dialog, View view) {
        vx2.m53591g(countDownTimer, "$countDownTimer");
        vx2.m53591g(wipeDataActivity, "this$0");
        vx2.m53591g(dialog, "$dialog");
        countDownTimer.cancel();
        wipeDataActivity.f41535d = 5;
        dialog.dismiss();
    }

    /* renamed from: F */
    public final C5761eb mo56981F() {
        return (C5761eb) this.f41534a.getValue();
    }

    /* renamed from: G */
    public final int mo56982G() {
        return this.f41535d;
    }

    /* renamed from: K */
    public final void mo56983K(int i) {
        this.f41535d = i;
    }

    /* renamed from: L */
    public final void mo56984L() {
        Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(1);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.dialog_wipe);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        dialog.show();
        C8215a aVar = new C8215a((TextView) dialog.findViewById(R.id.textView19), this, dialog);
        aVar.start();
        ((TextView) dialog.findViewById(R.id.tv_abort)).setOnClickListener(new vl7(aVar, this, dialog));
    }

    /* renamed from: N */
    public final void mo56985N(Dialog dialog) {
        Context applicationContext = getApplicationContext();
        vx2.m53590f(applicationContext, "applicationContext");
        rl7.m71598a(applicationContext).execute();
        f06.m57510a(this);
        up1.m72956a(this);
        if (dialog != null) {
            dialog.dismiss();
            ee3 ee3 = ee3.f37527a;
            ee3.mo51454c(this, ee3.mo51452a());
            AKTConfigurationsActivity.f41249x.mo56591b(this);
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((View) mo56981F().mo42200b());
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
        C5761eb F = mo56981F();
        F.f28526f.f21597e.setText(R.string.akt_reset_wallets_title);
        F.f28526f.f21594b.setVisibility(0);
        F.f28526f.f21594b.setOnClickListener(new sl7(this));
        F.f28522b.setOnClickListener(new tl7(this));
        F.f28523c.setOnClickListener(new ul7(this));
    }
}
