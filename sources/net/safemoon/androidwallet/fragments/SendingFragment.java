package net.safemoon.androidwallet.fragments;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.C0729l;
import com.bumptech.glide.C1710a;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.button.MaterialButton;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.ref.WeakReference;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.dialogs.ProgressLoading;
import net.safemoon.androidwallet.fragments.common.BaseMainFragment;
import net.safemoon.androidwallet.model.contact.abstraction.IContact;
import net.safemoon.androidwallet.model.request.EvmRequestTransaction;
import net.safemoon.androidwallet.p020ui.displayModel.UserTokenItemDisplayModel;
import net.safemoon.androidwallet.viewmodels.ContactViewModel;
import net.safemoon.androidwallet.viewmodels.TransferViewModel;
import net.safemoon.androidwallet.viewmodels.factory.MyViewModelFactory;

public class SendingFragment extends BaseMainFragment {

    /* renamed from: A */
    public TransferViewModel f42093A;

    /* renamed from: B */
    public ContactViewModel f42094B;

    /* renamed from: C */
    public IContact f42095C;

    /* renamed from: H */
    public final Long f42096H = 5000L;

    /* renamed from: I */
    public final k04<Long> f42097I = new k04<>(0L);

    /* renamed from: L */
    public CountDownTimer f42098L;

    /* renamed from: M */
    public ProgressLoading f42099M;

    /* renamed from: P */
    public ho2 f42100P;

    /* renamed from: k */
    public String f42101k = "";

    /* renamed from: r */
    public Double f42102r = Double.valueOf(Utils.DOUBLE_EPSILON);

    /* renamed from: s */
    public ArrayList<String> f42103s = new ArrayList<>();

    /* renamed from: x */
    public sa2 f42104x;

    /* renamed from: y */
    public UserTokenItemDisplayModel f42105y;

    /* renamed from: net.safemoon.androidwallet.fragments.SendingFragment$a */
    public class C8447a extends CountDownTimer {
        public C8447a(long j, long j2) {
            super(j, j2);
        }

        public void onFinish() {
            try {
                ol0.m70325E(SendingFragment.this.requireContext());
                SendingFragment.this.mo57665P();
            } catch (Exception e) {
                Context requireContext = SendingFragment.this.requireContext();
                String message = e.getMessage();
                Objects.requireNonNull(message);
                ol0.m70346Z(requireContext, message);
            }
        }

        public void onTick(long j) {
            SendingFragment.this.f42097I.setValue(Long.valueOf((SendingFragment.this.f42096H.longValue() + 50) - j));
        }
    }

    /* renamed from: net.safemoon.androidwallet.fragments.SendingFragment$b */
    public class C8448b extends TypeToken<ArrayList<String>> {
        public C8448b() {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public /* synthetic */ void m67004F(TransferViewModel.C8862a aVar) {
        if (aVar != null) {
            if (!aVar.mo61772b() || aVar.mo61771a() == null) {
                this.f42104x.f33807c.setVisibility(ol0.m70370l0(false));
                String n = this.f42093A.mo61766o().mo61866n();
                if (this.f42093A.mo61766o().mo61871s()) {
                    TextView textView = this.f42104x.f33819o;
                    textView.setText("Insufficient " + n + " balance for this transaction");
                } else {
                    TextView textView2 = this.f42104x.f33819o;
                    textView2.setText("Not enough " + n + " available as gas for transaction");
                }
            } else {
                this.f42104x.f33807c.setVisibility(ol0.m70370l0(true));
                this.f42104x.f33819o.setText(String.format(Locale.US, "Max Fee %s%s", new Object[]{ol0.m70373o(aVar.mo61771a().doubleValue(), 5, RoundingMode.HALF_UP, true), TokenType.fromValue(this.f42105y.getChainId()).getNativeToken()}));
            }
            this.f42104x.f33819o.setVisibility(0);
            return;
        }
        this.f42104x.f33807c.setVisibility(ol0.m70370l0(false));
        this.f42104x.f33819o.setVisibility(4);
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public /* synthetic */ void m67005G(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            IContact iContact = (IContact) it.next();
            if (iContact.getAddress().toLowerCase().equals(this.f42101k.toLowerCase(Locale.ROOT))) {
                this.f42095C = iContact;
                this.f42104x.f33818n.setText(iContact.getName());
                ((be5) ((be5) C1710a.m12225u(this.f42104x.f33810f).mo23164y(iContact.getProfilePath()).mo22582h0(R.drawable.contact_no_icon)).mo22591m(R.drawable.contact_no_icon)).mo11567a(qe5.m25623x0()).mo11553K0(this.f42104x.f33810f);
                this.f42104x.f33813i.setVisibility(0);
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public /* synthetic */ void m67006H(View view) {
        mo50752i();
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public /* synthetic */ void m67007I(Long l) {
        int longValue = (int) ((l.longValue() * 100) / this.f42096H.longValue());
        this.f42104x.f33814j.setProgress(longValue);
        if (l.longValue() > 0) {
            this.f42104x.f33814j.setVisibility(0);
            int round = Math.round(((float) (100 - longValue)) / 20.0f);
            MaterialButton materialButton = this.f42104x.f33806b;
            materialButton.setText("" + Math.max(1, round));
            return;
        }
        this.f42104x.f33814j.setVisibility(8);
        this.f42104x.f33806b.setText(R.string.send);
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public /* synthetic */ boolean m67008J(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            ol0.m70325E(requireContext());
            ol0.m70345Y(requireContext(), R.string.alert_hold_to_send);
            mo57664O();
        }
        if (motionEvent.getAction() != 1 || this.f42098L == null) {
            return false;
        }
        this.f42097I.setValue(0L);
        this.f42098L.cancel();
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public /* synthetic */ r37 m67009K(DialogInterface dialogInterface) {
        this.f42093A.mo61760i().setValue(null);
        this.f42093A.mo61759h(this.f42105y.toToken(), this.f42101k, this.f42102r.doubleValue());
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public /* synthetic */ r37 m67010L(Double d) {
        if (!isVisible()) {
            return null;
        }
        mo57660C();
        C9001np npVar = C9001np.f43524a;
        C9001np.m69933R(new WeakReference(requireContext()), Integer.valueOf(R.string.gas_price_updated), (String) null, (Integer) null, getString(R.string.gas_price_updated_content), Integer.valueOf(R.string.action_ok), (Integer) null, (Integer) null, (Integer) null, new ov5(this), (rc2<? super DialogInterface, r37>) null).show();
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public /* synthetic */ void m67011M(TransferViewModel.C8863b bVar) {
        if (bVar != null) {
            mo57660C();
            if (bVar.mo61776a()) {
                ho2 ho2 = this.f42100P;
                if (ho2 != null) {
                    ho2.mo52262a();
                    if (!bVar.mo61778c().booleanValue()) {
                        ho2 ho22 = this.f42100P;
                        EvmRequestTransaction q = this.f42093A.mo61768q(this.f42105y.toToken(), bVar.mo61777b());
                        Objects.requireNonNull(q);
                        EvmRequestTransaction evmRequestTransaction = q;
                        ho22.mo52263b(q);
                    }
                }
                mo50753j(C8567e.m68004a(this.f42093A.mo61764m(this.f42105y.toToken()), this.f42105y.getChainId(), true));
                return;
            }
            this.f42104x.f33819o.setText(R.string.transfer_refuse);
            this.f42104x.f33806b.setVisibility(8);
        }
    }

    /* renamed from: C */
    public final void mo57660C() {
        ProgressLoading progressLoading = this.f42099M;
        if (progressLoading != null) {
            progressLoading.mo22266k();
        }
    }

    /* renamed from: D */
    public ArrayList<String> mo57661D() {
        return (ArrayList) new Gson().fromJson(f06.m57519j(getActivity(), "localTransaction", ""), new C8448b().getType());
    }

    /* renamed from: E */
    public final void mo57662E() {
        this.f42093A.mo61760i().setValue(null);
        this.f42093A.mo61759h(this.f42105y.toToken(), this.f42101k, this.f42102r.doubleValue());
        this.f42093A.mo61760i().observe(getViewLifecycleOwner(), new lv5(this));
    }

    /* renamed from: N */
    public final void mo57663N(Boolean bool, String str, String str2) {
        ProgressLoading progressLoading = this.f42099M;
        if (progressLoading != null && progressLoading.isVisible()) {
            this.f42099M.mo22266k();
        }
        ProgressLoading a = ProgressLoading.f41785Y.mo57297a(bool.booleanValue(), str, str2);
        this.f42099M = a;
        a.mo57295D(getChildFragmentManager());
    }

    /* renamed from: O */
    public final void mo57664O() {
        CountDownTimer countDownTimer = this.f42098L;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        C8447a aVar = new C8447a(this.f42096H.longValue(), this.f42096H.longValue() / 100);
        this.f42098L = aVar;
        aVar.start();
    }

    /* renamed from: P */
    public final void mo57665P() {
        mo57663N(Boolean.FALSE, getString(R.string.transfer_loading_title), getString(R.string.transfer_loading_msg));
        this.f42093A.mo61769r(this.f42105y.toToken(), new nv5(this));
    }

    /* renamed from: Q */
    public final void mo57666Q() {
        this.f42093A.mo61767p().setValue(null);
        this.f42093A.mo61767p().observe(getViewLifecycleOwner(), new mv5(this));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (requireActivity() instanceof ho2) {
            this.f42100P = (ho2) requireActivity();
        }
    }

    @SuppressLint({"SetTextI18n"})
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_sending, viewGroup, false);
        this.f42104x = sa2.m51633a(inflate);
        this.f42093A = (TransferViewModel) new C0729l(requireActivity()).mo6421a(TransferViewModel.class);
        this.f42094B = (ContactViewModel) new C0729l((hd7) this, (C0729l.C0733b) new MyViewModelFactory(new WeakReference(requireActivity()))).mo6421a(ContactViewModel.class);
        if (getActivity() != null) {
            getActivity().getWindow().addFlags(Integer.MIN_VALUE);
            getActivity().getWindow().setBackgroundDrawableResource(R.drawable.bottom_curve);
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f42105y = (UserTokenItemDisplayModel) arguments.getSerializable(SendtoFragment.f42109Z);
            if (arguments.containsKey("balance")) {
                Double valueOf = Double.valueOf(ol0.m70330J(arguments.getString("balance")));
                this.f42102r = valueOf;
                this.f42104x.f33816l.setText(ol0.m70373o(valueOf.doubleValue(), 18, RoundingMode.HALF_UP, true));
                ol0.m70340T(this.f42104x.f33816l, this.f42102r.doubleValue(), this.f42105y.getSymbol());
                String o = ol0.m70373o(sz1.m72124a(this.f42102r.doubleValue() * this.f42105y.getPriceInUsdt()), 0, RoundingMode.DOWN, false);
                TextView textView = this.f42104x.f33817m;
                textView.setText("~ " + rz1.f44501a.mo65772b() + " " + o);
            }
            if (arguments.containsKey("etAddress")) {
                String string = arguments.getString("etAddress");
                this.f42101k = string;
                this.f42104x.f33815k.setText(ol0.m70353d(string));
                this.f42094B.mo61100j().observe(getViewLifecycleOwner(), new jv5(this));
            }
        }
        ArrayList<String> D = mo57661D();
        this.f42103s = D;
        if (D == null) {
            this.f42103s = new ArrayList<>();
        }
        this.f42104x.f33809e.setOnClickListener(new kv5(this));
        return inflate;
    }

    public void onDetach() {
        super.onDetach();
        this.f42100P = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        mo57662E();
        mo57666Q();
        this.f42097I.observe(getViewLifecycleOwner(), new hv5(this));
        this.f42104x.f33806b.setOnTouchListener(new iv5(this));
    }
}
