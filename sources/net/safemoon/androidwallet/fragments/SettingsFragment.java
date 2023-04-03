package net.safemoon.androidwallet.fragments;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.appcompat.app.C0149b;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.C0729l;
import java.util.List;
import java.util.Locale;
import net.safemoon.androidwallet.MyApplicationClass;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.activity.AKTHomeActivity;
import net.safemoon.androidwallet.activity.AKTLoginActivity;
import net.safemoon.androidwallet.database.mainRoom.MainRoomDatabase;
import net.safemoon.androidwallet.fragments.common.BaseMainFragment;
import net.safemoon.androidwallet.model.wallets.Wallet;
import net.safemoon.androidwallet.viewmodels.MultiWalletViewModel;
import zendesk.configurations.Configuration;
import zendesk.support.RequestUpdates;
import zendesk.support.Support;
import zendesk.support.requestlist.RequestListActivity;

public class SettingsFragment extends BaseMainFragment implements View.OnClickListener {

    /* renamed from: k */
    public ua2 f42133k;

    /* renamed from: r */
    public MultiWalletViewModel f42134r;

    /* renamed from: s */
    public Wallet f42135s;

    /* renamed from: net.safemoon.androidwallet.fragments.SettingsFragment$a */
    public class C8457a extends op7<RequestUpdates> {
        public C8457a() {
        }

        public void onError(hr1 hr1) {
        }

        public void onSuccess(RequestUpdates requestUpdates) {
            if (requestUpdates.hasUpdatedRequests() || f06.m57514e(SettingsFragment.this.getActivity(), "ZENDESK_HAVE_NEW_REPLY", false)) {
                SettingsFragment.this.f42133k.f34505H.setVisibility(0);
            } else {
                SettingsFragment.this.f42133k.f34505H.setVisibility(4);
            }
        }
    }

    /* renamed from: net.safemoon.androidwallet.fragments.SettingsFragment$b */
    public class C8458b implements CompoundButton.OnCheckedChangeListener {
        public C8458b() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                C0149b.m869G(2);
                f06.m57521l(SettingsFragment.this.getContext(), "MODE_NIGHT", 2);
                return;
            }
            C0149b.m869G(1);
            f06.m57521l(SettingsFragment.this.getContext(), "MODE_NIGHT", 1);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public /* synthetic */ void m67094A(View view) {
        gv1.m58261d(requireContext(), new cz5(this), new dz5()).show();
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public /* synthetic */ void m67095B(Wallet wallet2, CompoundButton compoundButton, boolean z) {
        Wallet wallet3;
        g06.f37938a.mo51838g(requireActivity(), z);
        if (!z && wallet2 != null && wallet2.isPrimaryWallet() && (wallet3 = this.f42135s) != null) {
            this.f42134r.mo61245D(wallet3);
            AKTHomeActivity.m64858g1(requireActivity());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public /* synthetic */ void m67096C(Wallet wallet2, List list) {
        this.f42135s = null;
        if (list.size() > 1) {
            this.f42133k.f34538h.setVisibility(0);
            this.f42133k.f34509L.setVisibility(0);
            this.f42133k.f34509L.setChecked(g06.f37938a.mo51834c(requireActivity()));
            this.f42135s = (Wallet) list.get(1);
            this.f42133k.f34509L.setOnCheckedChangeListener(new gz5(this, wallet2));
            return;
        }
        this.f42133k.f34538h.setVisibility(8);
        this.f42133k.f34509L.setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public /* synthetic */ void m67097D(List list) {
        boolean z;
        AppCompatImageView appCompatImageView = this.f42133k.f34504G;
        if (list == null || list.size() <= 0) {
            z = false;
        } else {
            z = true;
        }
        appCompatImageView.setVisibility(ol0.m70370l0(z));
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public /* synthetic */ void m67105y(DialogInterface dialogInterface, int i) {
        AKTLoginActivity.f41302L.mo56679b(requireContext(), false);
        MyApplicationClass.m64669c().f41188g = true;
        if (getActivity() != null) {
            getActivity().finish();
        }
    }

    /* renamed from: E */
    public final void mo57697E() {
        this.f42133k.f34521X.setText("V3.40");
    }

    /* renamed from: F */
    public final void mo57698F() {
        boolean z;
        this.f42133k.f34508K.setOnClickListener(this);
        this.f42133k.f34511N.setOnClickListener(this);
        this.f42133k.f34559r0.setOnClickListener(this);
        this.f42133k.f34525a0.setOnClickListener(this);
        this.f42133k.f34523Z.setOnClickListener(this);
        this.f42133k.f34531d0.setOnClickListener(this);
        this.f42133k.f34530d.setOnClickListener(this);
        this.f42133k.f34532e.setOnClickListener(this);
        this.f42133k.f34536g.setOnClickListener(this);
        this.f42133k.f34534f.setOnClickListener(this);
        this.f42133k.f34528c.setOnClickListener(this);
        this.f42133k.f34527b0.setOnClickListener(this);
        this.f42133k.f34521X.setOnClickListener(this);
        this.f42133k.f34522Y.setOnClickListener(this);
        this.f42133k.f34540i.setOnClickListener(this);
        this.f42133k.f34506I.setOnClickListener(this);
        this.f42133k.f34520W.f21127e.setText(getText(R.string.setting));
        this.f42133k.f34520W.f21125c.setVisibility(8);
        boolean z2 = false;
        if (C0149b.m874l() == 2) {
            z = true;
        } else {
            z = false;
        }
        this.f42133k.f34510M.setChecked(z);
        this.f42133k.f34510M.setOnCheckedChangeListener(new C8458b());
        this.f42134r.mo61261w().observe(getViewLifecycleOwner(), new ez5(this, ol0.m70351c(requireContext())));
        MainRoomDatabase.f41647p.mo57110b(requireContext()).mo57106O().mo55947b().observe(getViewLifecycleOwner(), new fz5(this));
        if (getArguments() != null && getArguments().containsKey("isNotification") && getArguments().getBoolean("isNotification")) {
            this.f42133k.f34523Z.performClick();
        }
        mo57697E();
        if (jo6.m20327a(Locale.getDefault()) == 1) {
            z2 = true;
        }
        if (z2) {
            this.f42133k.f34540i.setGravity(8388629);
        }
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnChangeAppIcon:
                mo50753j(C8569f.m68011b());
                return;
            case R.id.btnDefaultCurrency:
                mo50753j(C8569f.m68014e());
                return;
            case R.id.btnDefaultDateFormat:
                mo50753j(C8569f.m68010a());
                return;
            case R.id.btnDefaultLanguage:
                mo50753j(C8569f.m68012c());
                return;
            case R.id.btnDefaultScreen:
                mo50753j(C8569f.m68013d());
                return;
            case R.id.btn_wallet_connect:
                mo50753j(C8569f.m68021l());
                return;
            case R.id.joinCommunityButton:
                mo50753j(C8569f.m68015f());
                return;
            case R.id.privacy:
                mo50753j(C8569f.m68020k("https://safemoon.com/legal/privacy", R.string.privacy_policy));
                return;
            case R.id.terms:
                mo50753j(C8569f.m68020k("https://safemoon.com/legal/wallet/eula", R.string.terms_of_service));
                return;
            case R.id.tv_my_contacts:
                mo50753j(C8569f.m68016g());
                return;
            case R.id.tv_notification:
                mo50753j(C8569f.m68017h());
                return;
            case R.id.tv_security:
                mo50753j(C8569f.m68018i());
                return;
            case R.id.tv_switch_wallet:
                mo50753j(C8569f.m68019j());
                return;
            case R.id.zendeskSupport:
                RequestListActivity.builder().withContactUsButtonVisible(true).show((Context) requireActivity(), new Configuration[0]);
                f06.m57523n(getActivity(), "ZENDESK_HAVE_NEW_REPLY", Boolean.FALSE);
                return;
            default:
                return;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f42133k = ua2.m52706a(layoutInflater.inflate(R.layout.fragment_setting, viewGroup, false));
        this.f42134r = (MultiWalletViewModel) new C0729l(requireActivity()).mo6421a(MultiWalletViewModel.class);
        return this.f42133k.mo48368b();
    }

    public void onResume() {
        super.onResume();
        Support support = Support.INSTANCE;
        if (support.provider() != null) {
            support.provider().requestProvider().getUpdatesForDevice(new C8457a());
        }
    }

    public void onStart() {
        super.onStart();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f42133k.f34507J.setOnClickListener(new bz5(this));
        mo57698F();
    }
}
