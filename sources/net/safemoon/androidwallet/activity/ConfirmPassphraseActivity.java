package net.safemoon.androidwallet.activity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0729l;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import net.safemoon.androidwallet.MyApplicationClass;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.dialogs.ProgressLoading;
import net.safemoon.androidwallet.viewmodels.CreateWalletViewModel;
import net.safemoon.androidwallet.viewmodels.MultiWalletViewModel;

public class ConfirmPassphraseActivity extends AppCompatActivity {

    /* renamed from: A */
    public TextView f41403A;

    /* renamed from: B */
    public TextView f41404B;

    /* renamed from: C */
    public TextView f41405C;

    /* renamed from: H */
    public TextView f41406H;

    /* renamed from: I */
    public TextView f41407I;

    /* renamed from: L */
    public TextView f41408L;

    /* renamed from: M */
    public TextView f41409M;

    /* renamed from: P */
    public TextView f41410P;

    /* renamed from: Q */
    public TextView f41411Q;

    /* renamed from: U */
    public TextView f41412U;

    /* renamed from: X */
    public TextView f41413X;

    /* renamed from: Y */
    public TextView f41414Y;

    /* renamed from: Z */
    public TextView f41415Z;

    /* renamed from: a */
    public C6759z9 f41416a;

    /* renamed from: b1 */
    public TextView f41417b1;

    /* renamed from: d */
    public String f41418d;

    /* renamed from: e */
    public int f41419e = 0;

    /* renamed from: e0 */
    public TextView f41420e0;

    /* renamed from: e1 */
    public TextView f41421e1;

    /* renamed from: g */
    public Button f41422g;

    /* renamed from: k */
    public TextView f41423k;

    /* renamed from: k0 */
    public TextView f41424k0;

    /* renamed from: o1 */
    public TextView f41425o1;

    /* renamed from: p1 */
    public TextView[] f41426p1;

    /* renamed from: q1 */
    public TextView[] f41427q1;

    /* renamed from: r */
    public TextView f41428r;

    /* renamed from: r1 */
    public View[] f41429r1;

    /* renamed from: s */
    public TextView f41430s;

    /* renamed from: s1 */
    public ImageView[] f41431s1;

    /* renamed from: t1 */
    public String[] f41432t1;

    /* renamed from: u1 */
    public String[] f41433u1;

    /* renamed from: v0 */
    public TextView f41434v0;

    /* renamed from: v1 */
    public String[] f41435v1;

    /* renamed from: w1 */
    public CreateWalletViewModel f41436w1;

    /* renamed from: x */
    public TextView f41437x;

    /* renamed from: x1 */
    public MultiWalletViewModel f41438x1;

    /* renamed from: y */
    public TextView f41439y;

    /* renamed from: I */
    public static boolean m65304I(String[] strArr, String[] strArr2) {
        int length;
        if (strArr == strArr2) {
            return true;
        }
        if (strArr == null || strArr2 == null || (length = strArr.length) != strArr2.length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (!strArr[i].equals(strArr2[i])) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public /* synthetic */ void m65305J(int i, List list, View view) {
        if (!this.f41426p1[i].getTag().toString().equals("complete")) {
            this.f41435v1[this.f41419e] = (String) list.get(i);
            this.f41427q1[this.f41419e].setText(this.f41426p1[i].getText().toString());
            this.f41427q1[this.f41419e].setTextColor(zr0.m31440c(this, R.color.btn_light_green));
            this.f41426p1[i].setTextColor(zr0.m31440c(this, R.color.dark_grey));
            this.f41426p1[i].setTag("complete");
            this.f41429r1[this.f41419e].setBackgroundColor(zr0.m31440c(this, R.color.btn_light_green));
            this.f41431s1[this.f41419e].setVisibility(0);
            int i2 = this.f41419e + 1;
            this.f41419e = i2;
            if (i2 == this.f41432t1.length) {
                this.f41416a.f36037c.setText(getResources().getString(R.string.confirm));
                this.f41416a.f36037c.setTag("confirm");
            }
            int i3 = this.f41419e;
            if (i3 < this.f41429r1.length) {
                this.f41427q1[i3].setTextColor(zr0.m31440c(this, R.color.btn_light_green));
                this.f41429r1[this.f41419e].setBackgroundColor(zr0.m31440c(this, R.color.btn_light_green));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public /* synthetic */ void m65306K(View view) {
        if (this.f41422g.getTag().toString().equals("reset")) {
            mo56833R();
            return;
        }
        int i = this.f41419e;
        String[] strArr = this.f41432t1;
        if (i != strArr.length) {
            ol0.m70346Z(this, "Please fill all boxes");
        } else if (m65304I(strArr, this.f41435v1)) {
            mo56834S();
        } else {
            mo56835T();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public /* synthetic */ void m65307L(View view) {
        finish();
    }

    /* renamed from: M */
    public static /* synthetic */ void m65308M(DialogInterface dialogInterface) {
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public /* synthetic */ r37 m65309N(ProgressLoading progressLoading, Long l) {
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
    /* renamed from: O */
    public /* synthetic */ r37 m65310O(ProgressLoading progressLoading, String str, String str2, String str3, Boolean bool) {
        if (bool.booleanValue()) {
            progressLoading.mo22266k();
            fy0.m57956e(this, Integer.valueOf(R.string.warning_title), R.string.warning_black_list_address, true, new ap0());
            return null;
        } else if (str != null) {
            this.f41438x1.mo61254o(str2, str, str3, (String) null, true, false, new bp0(this, progressLoading));
            return null;
        } else {
            progressLoading.mo22266k();
            ol0.m70346Z(this, getString(R.string.nft_get_data_error));
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public /* synthetic */ void m65311P(Dialog dialog) {
        dialog.dismiss();
        if (ol0.m70351c(this) != null) {
            ProgressLoading a = ProgressLoading.f41785Y.mo57297a(false, getString(R.string.loading), "");
            a.mo57295D(getSupportFragmentManager());
            this.f41436w1.mo61122c(this.f41418d, CreateWalletViewModel.KEY_TYPE.PASSPHRASE, new zo0(this, a));
            return;
        }
        SetPasswordActivity.m65463K(this, this.f41418d, CreateWalletViewModel.KEY_TYPE.PASSPHRASE);
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: Q */
    public /* synthetic */ void m65312Q(DialogInterface dialogInterface, int i) {
        mo56833R();
        dialogInterface.dismiss();
    }

    @SuppressLint({"SetTextI18n"})
    /* renamed from: R */
    public final void mo56833R() {
        this.f41419e = 0;
        this.f41435v1 = new String[]{"", "", "", "", "", "", "", "", "", "", "", ""};
        for (int i = 0; i < this.f41426p1.length; i++) {
            this.f41427q1[i].setText("");
            this.f41427q1[i].setTextColor(zr0.m31440c(this, R.color.white));
            this.f41426p1[i].setTextColor(zr0.m31440c(this, R.color.white));
            this.f41426p1[i].setTag("incomplete");
            this.f41429r1[i].setBackgroundColor(zr0.m31440c(this, R.color.white));
            this.f41431s1[i].setVisibility(8);
        }
        this.f41429r1[0].setBackgroundColor(zr0.m31440c(this, R.color.btn_light_green));
        this.f41427q1[0].setTextColor(zr0.m31440c(this, R.color.btn_light_green));
        this.f41416a.f36037c.setText(getResources().getString(R.string.reset));
        this.f41416a.f36037c.setTag("reset");
    }

    /* renamed from: S */
    public void mo56834S() {
        Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(1);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.dialog_success);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        dialog.show();
        new Handler().postDelayed(new xo0(this, dialog), 1500);
    }

    /* renamed from: T */
    public final void mo56835T() {
        new AlertDialog.Builder(this).setTitle(getString(R.string.title_invalid_passphrase)).setMessage(getString(R.string.message_invalid_passphrase)).setPositiveButton("Ok", new yo0(this)).show();
    }

    @SuppressLint({"SetTextI18n"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C6759z9 c = C6759z9.m55021c(getLayoutInflater());
        this.f41416a = c;
        setContentView((View) c.mo49809b());
        this.f41436w1 = (CreateWalletViewModel) new C0729l(this).mo6421a(CreateWalletViewModel.class);
        this.f41438x1 = (MultiWalletViewModel) new C0729l(this).mo6421a(MultiWalletViewModel.class);
        if (!y40.f35760b.booleanValue()) {
            getWindow().setFlags(8192, 8192);
        }
        if (getSupportActionBar() != null) {
            getSupportActionBar().mo959l();
            getWindow().addFlags(Integer.MIN_VALUE);
            getWindow().setStatusBarColor(zr0.m31440c(this, 17170445));
            getWindow().setBackgroundDrawableResource(R.drawable.ic_bg);
        }
        this.f41422g = (Button) findViewById(R.id.btnConfirm);
        this.f41423k = (TextView) findViewById(R.id.word1);
        this.f41428r = (TextView) findViewById(R.id.word2);
        this.f41430s = (TextView) findViewById(R.id.word3);
        this.f41437x = (TextView) findViewById(R.id.word4);
        this.f41439y = (TextView) findViewById(R.id.word5);
        this.f41403A = (TextView) findViewById(R.id.word6);
        this.f41404B = (TextView) findViewById(R.id.word7);
        this.f41405C = (TextView) findViewById(R.id.word8);
        this.f41406H = (TextView) findViewById(R.id.word9);
        this.f41407I = (TextView) findViewById(R.id.word10);
        this.f41408L = (TextView) findViewById(R.id.word11);
        this.f41409M = (TextView) findViewById(R.id.word12);
        this.f41410P = (TextView) findViewById(R.id.sepratedword1);
        this.f41411Q = (TextView) findViewById(R.id.sepratedword2);
        this.f41412U = (TextView) findViewById(R.id.sepratedword3);
        this.f41413X = (TextView) findViewById(R.id.sepratedword4);
        this.f41414Y = (TextView) findViewById(R.id.sepratedword5);
        this.f41415Z = (TextView) findViewById(R.id.sepratedword6);
        this.f41420e0 = (TextView) findViewById(R.id.sepratedword7);
        this.f41424k0 = (TextView) findViewById(R.id.sepratedword8);
        this.f41434v0 = (TextView) findViewById(R.id.sepratedword9);
        this.f41417b1 = (TextView) findViewById(R.id.sepratedword10);
        this.f41421e1 = (TextView) findViewById(R.id.sepratedword11);
        this.f41425o1 = (TextView) findViewById(R.id.sepratedword12);
        String stringExtra = getIntent().getStringExtra("mnemonic");
        this.f41418d = stringExtra;
        this.f41435v1 = new String[]{"", "", "", "", "", "", "", "", "", "", "", ""};
        this.f41432t1 = stringExtra.split("\\s+");
        String[] split = this.f41418d.split("\\s+");
        this.f41433u1 = split;
        List asList = Arrays.asList(split);
        Collections.shuffle(asList);
        this.f41427q1 = new TextView[]{this.f41423k, this.f41428r, this.f41430s, this.f41437x, this.f41439y, this.f41403A, this.f41404B, this.f41405C, this.f41406H, this.f41407I, this.f41408L, this.f41409M};
        this.f41426p1 = new TextView[]{this.f41410P, this.f41411Q, this.f41412U, this.f41413X, this.f41414Y, this.f41415Z, this.f41420e0, this.f41424k0, this.f41434v0, this.f41417b1, this.f41421e1, this.f41425o1};
        C6759z9 z9Var = this.f41416a;
        this.f41429r1 = new View[]{z9Var.f36021O, z9Var.f36025S, z9Var.f36026T, z9Var.f36027U, z9Var.f36028V, z9Var.f36029W, z9Var.f36030X, z9Var.f36031Y, z9Var.f36032Z, z9Var.f36022P, z9Var.f36023Q, z9Var.f36024R};
        this.f41431s1 = new ImageView[]{z9Var.f36060p, z9Var.f36064t, z9Var.f36065u, z9Var.f36066v, z9Var.f36067w, z9Var.f36068x, z9Var.f36069y, z9Var.f36070z, z9Var.f36007A, z9Var.f36061q, z9Var.f36062r, z9Var.f36063s};
        int i = 0;
        while (true) {
            TextView[] textViewArr = this.f41426p1;
            if (i < textViewArr.length) {
                textViewArr[i].setText((CharSequence) asList.get(i));
                this.f41426p1[i].setTag("incomplete");
                this.f41426p1[i].setOnClickListener(new uo0(this, i, asList));
                i++;
            } else {
                this.f41429r1[0].setBackgroundColor(zr0.m31440c(this, R.color.btn_light_green));
                this.f41427q1[0].setTextColor(zr0.m31440c(this, R.color.btn_light_green));
                this.f41422g.setOnClickListener(new vo0(this));
                this.f41416a.f36035b.setOnClickListener(new wo0(this));
                return;
            }
        }
    }

    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
    }
}
