package net.safemoon.androidwallet.fragments;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.activity.result.ActivityResult;
import androidx.lifecycle.C0729l;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.google.android.material.textview.MaterialTextView;
import java.lang.ref.WeakReference;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.activity.AKTChangePasswordActivity;
import net.safemoon.androidwallet.activity.AKTGetEmailActivity;
import net.safemoon.androidwallet.dialogs.G2FAVerfication;
import net.safemoon.androidwallet.dialogs.Google2FAVerfiedAuthFragment;
import net.safemoon.androidwallet.dialogs.GoogleAuthPairFragment;
import net.safemoon.androidwallet.fragments.common.BaseMainFragment;
import net.safemoon.androidwallet.model.wallets.Wallet;
import net.safemoon.androidwallet.provider.RequiredAuthorizeProvider;
import net.safemoon.androidwallet.viewmodels.GoogleAuthViewModel;
import p000.wo2;

public class SecurityFragment extends BaseMainFragment implements go2, jp2 {

    /* renamed from: A */
    public final int f42049A = 5;

    /* renamed from: B */
    public final int f42050B = 6;

    /* renamed from: C */
    public final int f42051C = 0;

    /* renamed from: H */
    public na2 f42052H;

    /* renamed from: I */
    public GoogleAuthViewModel f42053I;

    /* renamed from: L */
    public wo2 f42054L;

    /* renamed from: M */
    public C3529wa<Intent> f42055M;

    /* renamed from: P */
    public int f42056P = 1;

    /* renamed from: k */
    public final String f42057k = "off";

    /* renamed from: r */
    public final int f42058r = 1;

    /* renamed from: s */
    public final int f42059s = 2;

    /* renamed from: x */
    public final int f42060x = 3;

    /* renamed from: y */
    public final int f42061y = 4;

    /* renamed from: net.safemoon.androidwallet.fragments.SecurityFragment$a */
    public class C8430a implements wo2.C9557a {
        public C8430a() {
        }

        /* renamed from: a */
        public void mo56680a(int i) {
        }

        /* renamed from: b */
        public void mo56681b() {
            SecurityFragment.this.mo57626g0();
        }
    }

    /* renamed from: net.safemoon.androidwallet.fragments.SecurityFragment$b */
    public class C8431b implements View.OnClickListener {
        public C8431b() {
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ r37 m66945c(boolean z) {
            SecurityFragment.this.f42052H.f32048o.setChecked(z);
            f06.m57523n(SecurityFragment.this.requireContext(), "ASK_AUTH_TRANSACTION_SIGN", Boolean.valueOf(z));
            return null;
        }

        /* renamed from: d */
        public static /* synthetic */ r37 m66946d() {
            return null;
        }

        public void onClick(View view) {
            boolean isChecked = SecurityFragment.this.f42052H.f32048o.isChecked();
            SecurityFragment.this.f42052H.f32048o.setChecked(!isChecked);
            new RequiredAuthorizeProvider(SecurityFragment.this.requireContext(), SecurityFragment.this.mo58053m()).mo60708a(new us5(this, isChecked), new vs5());
        }
    }

    /* renamed from: net.safemoon.androidwallet.fragments.SecurityFragment$c */
    public class C8432c implements G2FAVerfication.C8290b {

        /* renamed from: a */
        public final /* synthetic */ int f42064a;

        public C8432c(int i) {
            this.f42064a = i;
        }

        /* renamed from: a */
        public void mo56967a() {
            dq6.m57042b("Khang").mo51264a("G2FAVerificationCallback onError() called", new Object[0]);
        }

        public void onSuccess() {
            switch (this.f42064a) {
                case 1:
                case 2:
                    if (SecurityFragment.this.mo57630k0()) {
                        SecurityFragment.this.mo57619S0(this.f42064a);
                        return;
                    } else {
                        SecurityFragment.this.mo57608H0(this.f42064a);
                        return;
                    }
                case 3:
                    SecurityFragment.this.mo57617Q0();
                    return;
                case 4:
                    SecurityFragment.this.mo57618R0();
                    return;
                case 5:
                    SecurityFragment.this.mo57606F0();
                    return;
                case 6:
                    SecurityFragment.this.mo57616P0();
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: net.safemoon.androidwallet.fragments.SecurityFragment$d */
    public class C8433d implements wo2.C9557a {

        /* renamed from: a */
        public final /* synthetic */ boolean f42066a;

        public C8433d(boolean z) {
            this.f42066a = z;
        }

        /* renamed from: a */
        public void mo56680a(int i) {
            SecurityFragment.this.mo57614N0(!this.f42066a);
        }

        /* renamed from: b */
        public void mo56681b() {
            f06.m57523n(SecurityFragment.this.getActivity(), "TWO_FACTOR", Boolean.valueOf(this.f42066a));
        }
    }

    /* renamed from: net.safemoon.androidwallet.fragments.SecurityFragment$e */
    public class C8434e implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ boolean f42068a;

        public C8434e(boolean z) {
            this.f42068a = z;
        }

        public void run() {
            if (this.f42068a) {
                SecurityFragment.this.mo57608H0(1);
            }
        }
    }

    /* renamed from: net.safemoon.androidwallet.fragments.SecurityFragment$f */
    public class C8435f implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ boolean f42070a;

        public C8435f(boolean z) {
            this.f42070a = z;
        }

        public void run() {
            if (this.f42070a) {
                SecurityFragment.this.mo57608H0(2);
            } else {
                SecurityFragment.this.f42052H.f32028C.setVisibility(8);
            }
        }
    }

    /* renamed from: net.safemoon.androidwallet.fragments.SecurityFragment$g */
    public class C8436g implements wo2.C9557a {
        public C8436g() {
        }

        /* renamed from: a */
        public void mo56680a(int i) {
        }

        /* renamed from: b */
        public void mo56681b() {
            SecurityFragment.this.mo57615O0();
        }
    }

    /* renamed from: net.safemoon.androidwallet.fragments.SecurityFragment$h */
    public class C8437h implements wo2.C9557a {
        public C8437h() {
        }

        /* renamed from: a */
        public void mo56680a(int i) {
        }

        /* renamed from: b */
        public void mo56681b() {
            SecurityFragment.this.mo57613M0(true);
        }
    }

    /* renamed from: net.safemoon.androidwallet.fragments.SecurityFragment$i */
    public class C8438i implements wo2.C9557a {
        public C8438i() {
        }

        /* renamed from: a */
        public void mo56680a(int i) {
        }

        /* renamed from: b */
        public void mo56681b() {
            SecurityFragment.this.mo57611K0(true);
        }
    }

    /* renamed from: net.safemoon.androidwallet.fragments.SecurityFragment$j */
    public class C8439j implements wo2.C9557a {
        public C8439j() {
        }

        /* renamed from: a */
        public void mo56680a(int i) {
        }

        /* renamed from: b */
        public void mo56681b() {
            SecurityFragment.this.mo57609I0();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A0 */
    public /* synthetic */ void m66860A0(int i, View view) {
        if (i == 1) {
            mo57612L0();
        } else {
            mo57610J0();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B0 */
    public /* synthetic */ void m66862B0(int i, View view) {
        if (i == 1) {
            mo57627h0();
        } else {
            mo57628i0();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C0 */
    public /* synthetic */ r37 m66864C0() {
        AKTChangePasswordActivity.f41240C.mo56575a(getActivity());
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: D0 */
    public /* synthetic */ r37 m66866D0() {
        boolean z = !this.f42053I.mo61203f().getValue().booleanValue();
        f06.m57525p(requireContext(), "AUTH_2FA_IS_ENABLE", z);
        this.f42053I.mo61203f().setValue(Boolean.valueOf(z));
        return null;
    }

    /* renamed from: E0 */
    public static /* synthetic */ r37 m66868E0() {
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: l0 */
    public /* synthetic */ void m66890l0(CompoundButton compoundButton, boolean z) {
        if (getActivity() != null) {
            mo57607G0(z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m0 */
    public /* synthetic */ void m66891m0(Boolean bool) {
        int i;
        MaterialButton materialButton = this.f42052H.f32035b;
        int i2 = 0;
        if (bool.booleanValue()) {
            i = 0;
        } else {
            i = 8;
        }
        materialButton.setVisibility(i);
        MaterialTextView materialTextView = this.f42052H.f32058y;
        if (bool.booleanValue()) {
            i2 = 8;
        }
        materialTextView.setVisibility(i2);
        this.f42052H.f32047n.setChecked(bool.booleanValue());
    }

    /* access modifiers changed from: private */
    /* renamed from: n0 */
    public /* synthetic */ void m66892n0(View view) {
        ((ClipboardManager) getActivity().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", this.f42052H.f32028C.getText().toString()));
        ol0.m70345Y(requireActivity(), R.string.copied_to_clipboard);
    }

    /* access modifiers changed from: private */
    /* renamed from: o0 */
    public /* synthetic */ void m66893o0(View view) {
        mo50752i();
    }

    /* access modifiers changed from: private */
    /* renamed from: p0 */
    public /* synthetic */ void m66894p0(View view) {
        if (f06.m57513d(requireContext(), "AUTH_2FA_IS_ENABLE")) {
            G2FAVerfication.f41732v0.mo57216a(mo57622c0(3), mo57630k0()).mo57214K(getChildFragmentManager());
        } else if (mo57630k0()) {
            this.f42054L.mo66749a(this, mo57621b0());
        } else {
            mo57609I0();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q0 */
    public /* synthetic */ void m66895q0(View view) {
        if (f06.m57513d(requireContext(), "AUTH_2FA_IS_ENABLE")) {
            G2FAVerfication.f41732v0.mo57216a(mo57622c0(6), mo57630k0()).mo57214K(getChildFragmentManager());
        } else if (mo57630k0()) {
            this.f42054L.mo66749a(this, mo57620a0());
        } else {
            mo57626g0();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r0 */
    public /* synthetic */ void m66897r0(CompoundButton compoundButton, boolean z) {
        if (this.f42053I.mo61203f().getValue().booleanValue() != z) {
            this.f42053I.mo61203f().setValue(this.f42053I.mo61203f().getValue());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s0 */
    public /* synthetic */ r37 m66899s0(String str) {
        if (str.isEmpty()) {
            GoogleAuthPairFragment.f41752X.mo57241a().mo57238T(getChildFragmentManager());
            return null;
        }
        boolean z = !this.f42053I.mo61203f().getValue().booleanValue();
        f06.m57525p(requireContext(), "AUTH_2FA_IS_ENABLE", z);
        this.f42053I.mo61203f().setValue(Boolean.valueOf(z));
        return null;
    }

    /* renamed from: t0 */
    public static /* synthetic */ r37 m66901t0() {
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: u0 */
    public /* synthetic */ void m66903u0(View view) {
        String j = f06.m57519j(requireContext(), "AUTH_2FA_KEY", "");
        boolean booleanValue = this.f42053I.mo61203f().getValue().booleanValue();
        if (j.isEmpty() || !booleanValue) {
            new RequiredAuthorizeProvider(requireContext(), mo58053m()).mo60708a(new es5(this, j), new fs5());
        } else {
            G2FAVerfication.f41732v0.mo57216a(mo57622c0(4), false).mo57214K(getChildFragmentManager());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v0 */
    public /* synthetic */ void m66905v0(View view) {
        G2FAVerfication.f41732v0.mo57216a(mo57622c0(5), mo57630k0()).mo57214K(getChildFragmentManager());
    }

    /* access modifiers changed from: private */
    /* renamed from: w0 */
    public /* synthetic */ void m66907w0(View view) {
        if (f06.m57513d(requireContext(), "AUTH_2FA_IS_ENABLE")) {
            G2FAVerfication.f41732v0.mo57216a(mo57622c0(1), mo57630k0()).mo57214K(getChildFragmentManager());
        } else if (!this.f42052H.f32026A.getTag().toString().equals("off")) {
        } else {
            if (mo57630k0()) {
                this.f42054L.mo66749a(this, mo57623d0());
            } else {
                mo57608H0(1);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x0 */
    public /* synthetic */ void m66909x0(View view) {
        if (f06.m57513d(requireContext(), "AUTH_2FA_IS_ENABLE")) {
            G2FAVerfication.f41732v0.mo57216a(mo57622c0(2), mo57630k0()).mo57214K(getChildFragmentManager());
        } else if (!this.f42052H.f32030E.getTag().toString().equals("off")) {
        } else {
            if (mo57630k0()) {
                this.f42054L.mo66749a(this, mo57624e0());
            } else {
                mo57608H0(2);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y0 */
    public /* synthetic */ void m66911y0(View view) {
        ((ClipboardManager) getActivity().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", this.f42052H.f32027B.getText().toString()));
        ol0.m70345Y(requireActivity(), R.string.copied_to_clipboard);
    }

    /* access modifiers changed from: private */
    /* renamed from: z0 */
    public /* synthetic */ void m66913z0(ActivityResult activityResult) {
        if (activityResult.mo918b() == -1) {
            int i = this.f42056P;
            if (i == 3) {
                mo57609I0();
            } else {
                mo57608H0(i);
            }
        }
    }

    /* renamed from: F0 */
    public final void mo57606F0() {
        if (mo57630k0()) {
            this.f42054L.mo66749a(this, new C8436g());
        } else {
            mo57615O0();
        }
    }

    /* renamed from: G0 */
    public final void mo57607G0(boolean z) {
        this.f42054L.mo66749a(this, new C8433d(z));
    }

    /* renamed from: H0 */
    public final void mo57608H0(int i) {
        C9001np.m69921G(new WeakReference(requireActivity()), new gs5(this, i), new hs5(this, i));
    }

    /* renamed from: I0 */
    public final void mo57609I0() {
        C9001np.m69941Z(new WeakReference(getActivity()), (Integer) null, Integer.valueOf(R.string.akt_reset_password_dialog_remind_content), R.string.acknowledgment_confirm_button_text, new ds5(this));
    }

    /* renamed from: J0 */
    public final void mo57610J0() {
        this.f42052H.f32030E.setVisibility(8);
        this.f42052H.f32045l.setVisibility(0);
        this.f42052H.f32028C.setVisibility(0);
        this.f42052H.f32028C.setText("-");
        this.f42052H.f32051r.setVisibility(8);
    }

    /* renamed from: K0 */
    public final void mo57611K0(boolean z) {
        new Handler(Looper.getMainLooper()).post(new C8435f(z));
    }

    /* renamed from: L0 */
    public final void mo57612L0() {
        Wallet c;
        this.f42052H.f32026A.setVisibility(8);
        this.f42052H.f32050q.setVisibility(8);
        this.f42052H.f32046m.setVisibility(0);
        this.f42052H.f32027B.setVisibility(0);
        if (getActivity() != null && (c = ol0.m70351c(getActivity())) != null && c.getPassPhrase() != null) {
            this.f42052H.f32027B.setText(C9377u.m72500e(getActivity(), f06.m57518i(getActivity(), "SAFEMOON_RECOVERY_PHRASE")).replace("|", " ").trim());
        }
    }

    /* renamed from: M0 */
    public final void mo57613M0(boolean z) {
        new Handler(Looper.getMainLooper()).post(new C8434e(z));
    }

    /* renamed from: N0 */
    public final void mo57614N0(boolean z) {
        this.f42052H.f32049p.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        this.f42052H.f32049p.setChecked(z);
        this.f42052H.f32049p.setOnCheckedChangeListener(mo57625f0());
    }

    /* renamed from: O0 */
    public final void mo57615O0() {
        f06.m57520k(requireContext(), "AUTH_2FA_KEY");
        f06.m57520k(requireContext(), "AUTH_2FA_IS_ENABLE");
        this.f42053I.mo61203f().setValue(Boolean.FALSE);
    }

    /* renamed from: P0 */
    public final void mo57616P0() {
        if (mo57630k0()) {
            this.f42054L.mo66749a(this, mo57620a0());
        } else {
            mo57626g0();
        }
    }

    /* renamed from: Q0 */
    public final void mo57617Q0() {
        if (mo57630k0()) {
            this.f42054L.mo66749a(this, mo57621b0());
        } else {
            mo57609I0();
        }
    }

    /* renamed from: R0 */
    public final void mo57618R0() {
        new RequiredAuthorizeProvider(requireContext(), mo58053m()).mo60708a(new js5(this), new ks5());
    }

    /* renamed from: S0 */
    public final void mo57619S0(int i) {
        if (i == 1) {
            this.f42054L.mo66749a(this, mo57623d0());
        } else {
            this.f42054L.mo66749a(this, mo57624e0());
        }
    }

    /* renamed from: a */
    public void mo51950a() {
        Google2FAVerfiedAuthFragment.f41746Y.mo57232a().mo57231K(getChildFragmentManager());
    }

    /* renamed from: a0 */
    public final wo2.C9557a mo57620a0() {
        return new C8430a();
    }

    /* renamed from: b0 */
    public final wo2.C9557a mo57621b0() {
        return new C8439j();
    }

    /* renamed from: c0 */
    public final G2FAVerfication.C8290b mo57622c0(int i) {
        return new C8432c(i);
    }

    /* renamed from: d0 */
    public final wo2.C9557a mo57623d0() {
        return new C8437h();
    }

    /* renamed from: e0 */
    public final wo2.C9557a mo57624e0() {
        return new C8438i();
    }

    /* renamed from: f */
    public void mo52764f() {
    }

    /* renamed from: f0 */
    public final CompoundButton.OnCheckedChangeListener mo57625f0() {
        return new is5(this);
    }

    /* renamed from: g0 */
    public final void mo57626g0() {
        AKTGetEmailActivity.f41252M.mo56605a(getActivity(), false, false, true);
    }

    /* renamed from: h0 */
    public final void mo57627h0() {
        this.f42052H.f32027B.setVisibility(8);
        this.f42052H.f32059z.setVisibility(8);
        this.f42052H.f32046m.setVisibility(8);
        this.f42052H.f32050q.setVisibility(0);
        this.f42052H.f32026A.setVisibility(0);
        this.f42052H.f32026A.setTag("off");
    }

    /* renamed from: i0 */
    public final void mo57628i0() {
        this.f42052H.f32028C.setVisibility(8);
        this.f42052H.f32045l.setVisibility(8);
        this.f42052H.f32030E.setVisibility(0);
        this.f42052H.f32030E.setTag("off");
        this.f42052H.f32051r.setVisibility(0);
    }

    /* renamed from: j0 */
    public final void mo57629j0() {
        if (getActivity() != null) {
            this.f42052H.f32049p.setChecked(f06.m57514e(getActivity(), "TWO_FACTOR", false));
            this.f42052H.f32048o.setChecked(f06.m57514e(requireActivity(), "ASK_AUTH_TRANSACTION_SIGN", true));
        }
        this.f42052H.f32049p.setOnCheckedChangeListener(mo57625f0());
        this.f42053I.mo61203f().observe(getViewLifecycleOwner(), new ls5(this));
        this.f42052H.f32047n.setOnCheckedChangeListener(new ns5(this));
        this.f42052H.f32047n.setOnClickListener(new os5(this));
        this.f42052H.f32048o.setOnClickListener(new C8431b());
        this.f42052H.f32035b.setOnClickListener(new ps5(this));
        this.f42052H.f32037d.setVisibility(8);
        this.f42052H.f32039f.setVisibility(8);
        this.f42052H.f32026A.setOnClickListener(new qs5(this));
        this.f42052H.f32030E.setOnClickListener(new rs5(this));
        this.f42052H.f32059z.setOnClickListener(new ss5(this));
        this.f42052H.f32029D.setOnClickListener(new ts5(this));
        this.f42052H.f32056w.f21125c.setOnClickListener(new bs5(this));
        this.f42052H.f32056w.f21127e.setText(getText(R.string.security));
        this.f42052H.f32041h.setOnClickListener(new cs5(this));
        this.f42052H.f32040g.setOnClickListener(new ms5(this));
    }

    /* renamed from: k0 */
    public final boolean mo57630k0() {
        return f06.m57514e(requireContext(), "TWO_FACTOR", false);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f42055M = registerForActivityResult(new C3474va(), new as5(this));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f42052H = na2.m48714a(layoutInflater.inflate(R.layout.fragment_security, viewGroup, false));
        this.f42053I = (GoogleAuthViewModel) new C0729l(requireActivity()).mo6421a(GoogleAuthViewModel.class);
        this.f42054L = new y12();
        return this.f42052H.mo46048b();
    }

    public void onPause() {
        super.onPause();
        if (!y40.f35760b.booleanValue()) {
            requireActivity().getWindow().clearFlags(8192);
        }
    }

    public void onResume() {
        super.onResume();
        if (!y40.f35760b.booleanValue()) {
            requireActivity().getWindow().addFlags(8192);
        }
        mo57628i0();
        mo57627h0();
    }

    public void onStart() {
        super.onStart();
        if (!y40.f35760b.booleanValue()) {
            requireActivity().getWindow().addFlags(8192);
        }
    }

    public void onStop() {
        super.onStop();
        if (!y40.f35760b.booleanValue()) {
            requireActivity().getWindow().clearFlags(8192);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        int i;
        super.onViewCreated(view, bundle);
        mo57629j0();
        if (a77.m55426d(requireContext())) {
            i = 0;
        } else {
            i = 8;
        }
        this.f42052H.f32038e.setVisibility(i);
        this.f42052H.f32058y.setMovementMethod(LinkMovementMethod.getInstance());
        PackageManager packageManager = getActivity().getPackageManager();
        SwitchMaterial switchMaterial = (SwitchMaterial) this.f42052H.f32038e.findViewById(R.id.switchTwoLayerConfirmation);
        if (packageManager.hasSystemFeature("android.hardware.fingerprint")) {
            if (((FingerprintManager) getContext().getSystemService("fingerprint")).hasEnrolledFingerprints()) {
                switchMaterial.setText(getResources().getString(R.string.require_fingerprint_or_device_passcode));
            }
        } else if (packageManager.hasSystemFeature("android.hardware.biometrics.face")) {
            switchMaterial.setText(getResources().getString(R.string.require_face_id_or_device_passcode));
        }
    }
}
