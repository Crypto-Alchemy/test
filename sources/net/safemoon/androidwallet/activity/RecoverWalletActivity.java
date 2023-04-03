package net.safemoon.androidwallet.activity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import androidx.lifecycle.C0729l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.safemoon.androidwallet.MyApplicationClass;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.activity.common.BasicActivity;
import net.safemoon.androidwallet.common.MyCoinType;
import net.safemoon.androidwallet.dialogs.ProgressLoading;
import net.safemoon.androidwallet.model.wallets.Wallet;
import net.safemoon.androidwallet.viewmodels.CreateWalletViewModel;
import net.safemoon.androidwallet.viewmodels.MultiWalletViewModel;
import wallet.core.jni.Mnemonic;

public class RecoverWalletActivity extends BasicActivity {

    /* renamed from: r */
    public CreateWalletViewModel f41462r;

    /* renamed from: s */
    public MultiWalletViewModel f41463s;

    /* renamed from: x */
    public C3804aa f41464x;

    /* renamed from: c0 */
    public static /* synthetic */ void m65412c0(DialogInterface dialogInterface) {
    }

    /* access modifiers changed from: private */
    /* renamed from: d0 */
    public /* synthetic */ r37 m65413d0(ProgressLoading progressLoading, String str, Long l) {
        progressLoading.mo22266k();
        if (l == null || l.longValue() <= 0) {
            mo56866l0(str);
            return null;
        }
        MyApplicationClass.m64669c().f41193y = true;
        g06.f37938a.mo51839h(this, false);
        AKTHomeActivity.m64858g1(this);
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: e0 */
    public /* synthetic */ r37 m65414e0(ProgressLoading progressLoading, String str, String str2, String str3, Boolean bool) {
        if (bool.booleanValue()) {
            progressLoading.mo22266k();
            fy0.m57956e(this, Integer.valueOf(R.string.warning_title), R.string.warning_black_list_address, true, new v85());
            return null;
        } else if (str != null) {
            this.f41463s.mo61254o(str2, str, str3, (String) null, true, false, new w85(this, progressLoading, str));
            return null;
        } else {
            progressLoading.mo22266k();
            ol0.m70346Z(this, getString(R.string.nft_get_data_error));
            return null;
        }
    }

    /* renamed from: f0 */
    public static /* synthetic */ void m65415f0(DialogInterface dialogInterface) {
    }

    /* access modifiers changed from: private */
    /* renamed from: g0 */
    public /* synthetic */ r37 m65416g0(ProgressLoading progressLoading, String str, Long l) {
        progressLoading.mo22266k();
        if (l == null || l.longValue() <= 0) {
            mo56866l0(str);
            return null;
        }
        MyApplicationClass.m64669c().f41193y = true;
        g06.f37938a.mo51839h(this, false);
        AKTHomeActivity.m64858g1(this);
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: h0 */
    public /* synthetic */ r37 m65417h0(ProgressLoading progressLoading, String str, String str2, String str3, Boolean bool) {
        if (bool.booleanValue()) {
            progressLoading.mo22266k();
            fy0.m57956e(this, Integer.valueOf(R.string.warning_title), R.string.warning_black_list_address, true, new x85());
            return null;
        } else if (str != null) {
            this.f41463s.mo61254o(str2, str, str3, (String) null, true, false, new y85(this, progressLoading, str));
            return null;
        } else {
            progressLoading.mo22266k();
            ol0.m70346Z(this, getString(R.string.nft_get_data_error));
            return null;
        }
    }

    /* renamed from: i0 */
    public static /* synthetic */ void m65418i0(DialogInterface dialogInterface) {
    }

    /* access modifiers changed from: private */
    /* renamed from: j0 */
    public /* synthetic */ r37 m65419j0(String str, List list) {
        Wallet wallet2;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                wallet2 = null;
                break;
            }
            wallet2 = (Wallet) it.next();
            if (wallet2.getAddress(MyCoinType.ETHEREUM.value()).equalsIgnoreCase(str)) {
                break;
            }
        }
        if (wallet2 != null) {
            C9001np.m69965l0(new WeakReference(this), Integer.valueOf(R.string.warning_iw_failed_title), String.format("\"%s\"\n%s", new Object[]{wallet2.displayName(), getString(R.string.warning_iw_failed_msg)}), R.string.action_ok, (pc2<r37>) null);
        } else {
            C9001np.m69938W(new WeakReference(this), Integer.valueOf(R.string.warning_iw_failed_title), Integer.valueOf(R.string.warning_iw_failed_msg), R.string.action_ok, (pc2<r37>) null);
        }
        return null;
    }

    /* renamed from: a0 */
    public void mo56864a0(String str) {
        try {
            this.f41462r.mo61124e(str);
            if (ol0.m70351c(this) != null) {
                ProgressLoading a = ProgressLoading.f41785Y.mo57297a(false, getString(R.string.loading), "");
                a.mo57295D(getSupportFragmentManager());
                this.f41462r.mo61122c(str, CreateWalletViewModel.KEY_TYPE.PRIVATE_KEY, new t85(this, a));
                return;
            }
            SetPasswordActivity.m65463K(this, str, CreateWalletViewModel.KEY_TYPE.PRIVATE_KEY);
            finish();
        } catch (Exception unused) {
            fy0.m57956e(this, Integer.valueOf(R.string.error_iw_title), R.string.error_iw_msg, true, new u85());
        }
    }

    /* renamed from: b0 */
    public void mo56865b0(EditText... editTextArr) {
        if (mo56868n0(new EditText[0])) {
            ArrayList arrayList = new ArrayList();
            for (EditText text : editTextArr) {
                arrayList.add(text.getText().toString().trim().toLowerCase());
            }
            String join = TextUtils.join(" ", arrayList);
            if (!Mnemonic.isValid(join)) {
                mo56867m0();
            } else if (ol0.m70351c(this) != null) {
                ProgressLoading a = ProgressLoading.f41785Y.mo57297a(false, getString(R.string.loading), "");
                a.mo57295D(getSupportFragmentManager());
                this.f41462r.mo61122c(join, CreateWalletViewModel.KEY_TYPE.PASSPHRASE, new r85(this, a));
            } else {
                SetPasswordActivity.m65463K(this, join, CreateWalletViewModel.KEY_TYPE.PASSPHRASE);
                finish();
            }
        }
    }

    /* renamed from: l0 */
    public final void mo56866l0(String str) {
        this.f41463s.mo61256r(new z85(this, str));
    }

    /* renamed from: m0 */
    public final void mo56867m0() {
        new AlertDialog.Builder(this).setTitle(getString(R.string.title_invalid_passphrase)).setMessage(getString(R.string.message_invalid_passphrase)).setPositiveButton("Ok", new s85()).show();
    }

    /* renamed from: n0 */
    public final boolean mo56868n0(EditText... editTextArr) {
        boolean z = true;
        for (EditText editText : editTextArr) {
            if (TextUtils.isEmpty(editText.getText())) {
                editText.setError(getString(R.string.err_required_field));
                z = false;
            }
        }
        return z;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f41462r = (CreateWalletViewModel) new C0729l(this).mo6421a(CreateWalletViewModel.class);
        this.f41463s = (MultiWalletViewModel) new C0729l(this).mo6421a(MultiWalletViewModel.class);
        C3804aa c = C3804aa.m31754c(getLayoutInflater());
        this.f41464x = c;
        setContentView((View) c.mo28898b());
        if (!y40.f35760b.booleanValue()) {
            getWindow().setFlags(8192, 8192);
        }
        if (getSupportActionBar() != null) {
            getSupportActionBar().mo959l();
        }
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(zr0.m31440c(this, 17170445));
        getWindow().setBackgroundDrawableResource(R.drawable.ic_bg);
    }

    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
    }
}
