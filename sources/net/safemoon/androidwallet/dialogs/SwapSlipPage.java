package net.safemoon.androidwallet.dialogs;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.textfield.TextInputEditText;
import kotlin.C6169a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.utils.Common;
import net.safemoon.androidwallet.viewmodels.SwapViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u001f2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u000e\u001a\u00020\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u000f\u001a\u00020\u000bH\u0016J\u000e\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006!"}, mo44877d2 = {"Lnet/safemoon/androidwallet/dialogs/SwapSlipPage;", "Lkf1;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "Lr37;", "onViewCreated", "Landroid/app/Dialog;", "p", "onStart", "Landroidx/fragment/app/FragmentManager;", "manager", "R", "Lsf1;", "P", "Lsf1;", "binding", "Lnet/safemoon/androidwallet/viewmodels/SwapViewModel;", "Q", "Lef3;", "I", "()Lnet/safemoon/androidwallet/viewmodels/SwapViewModel;", "swapViewModel", "<init>", "()V", "U", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: SwapSlipPage.kt */
public final class SwapSlipPage extends kf1 {

    /* renamed from: U */
    public static final C8310a f41794U = new C8310a((DefaultConstructorMarker) null);

    /* renamed from: P */
    public sf1 f41795P;

    /* renamed from: Q */
    public final ef3 f41796Q;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, mo44877d2 = {"Lnet/safemoon/androidwallet/dialogs/SwapSlipPage$a;", "", "Lnet/safemoon/androidwallet/dialogs/SwapSlipPage;", "a", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.dialogs.SwapSlipPage$a */
    /* compiled from: SwapSlipPage.kt */
    public static final class C8310a {
        public C8310a() {
        }

        public /* synthetic */ C8310a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final SwapSlipPage mo57304a() {
            SwapSlipPage swapSlipPage = new SwapSlipPage();
            swapSlipPage.setArguments(new Bundle());
            return swapSlipPage;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo44877d2 = {"net/safemoon/androidwallet/dialogs/SwapSlipPage$b", "Lpf4;", "", "t", "Lr37;", "a", "(Ljava/lang/Double;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.dialogs.SwapSlipPage$b */
    /* compiled from: SwapSlipPage.kt */
    public static final class C8311b implements pf4<Double> {

        /* renamed from: a */
        public final /* synthetic */ SwapSlipPage f41797a;

        public C8311b(SwapSlipPage swapSlipPage) {
            this.f41797a = swapSlipPage;
        }

        /* renamed from: a */
        public void onChanged(Double d) {
            this.f41797a.mo57302I().mo61631x0().removeObserver(this);
            SwapSlipPage swapSlipPage = this.f41797a;
            String str = null;
            if (vx2.m53585a(d, 0.1d)) {
                sf1 G = swapSlipPage.f41795P;
                if (G == null) {
                    vx2.m53605u("binding");
                    G = null;
                }
                G.f33852c.setChecked(true);
            } else if (vx2.m53585a(d, 0.5d)) {
                sf1 G2 = swapSlipPage.f41795P;
                if (G2 == null) {
                    vx2.m53605u("binding");
                    G2 = null;
                }
                G2.f33853d.setChecked(true);
            } else if (vx2.m53585a(d, 1.0d)) {
                sf1 G3 = swapSlipPage.f41795P;
                if (G3 == null) {
                    vx2.m53605u("binding");
                    G3 = null;
                }
                G3.f33854e.setChecked(true);
            }
            sf1 G4 = swapSlipPage.f41795P;
            if (G4 == null) {
                vx2.m53605u("binding");
                G4 = null;
            }
            TextInputEditText textInputEditText = G4.f33858i;
            if (d != null) {
                str = ol0.m70372n(d.doubleValue());
            }
            textInputEditText.setText(str);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo44877d2 = {"net/safemoon/androidwallet/dialogs/SwapSlipPage$c", "Lnc4;", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.dialogs.SwapSlipPage$c */
    /* compiled from: SwapSlipPage.kt */
    public static final class C8312c extends nc4 {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8312c(TextInputEditText textInputEditText) {
            super(textInputEditText);
            vx2.m53590f(textInputEditText, "edtSlippageManually");
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J(\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\fH\u0016¨\u0006\u000e"}, mo44877d2 = {"net/safemoon/androidwallet/dialogs/SwapSlipPage$d", "Landroid/text/TextWatcher;", "", "s", "", "start", "count", "after", "Lr37;", "beforeTextChanged", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.dialogs.SwapSlipPage$d */
    /* compiled from: SwapSlipPage.kt */
    public static final class C8313d implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ SwapSlipPage f41798a;

        public C8313d(SwapSlipPage swapSlipPage) {
            this.f41798a = swapSlipPage;
        }

        public void afterTextChanged(Editable editable) {
            vx2.m53591g(editable, "s");
            Float m = wb6.m73531m(editable.toString());
            if (m != null) {
                SwapSlipPage swapSlipPage = this.f41798a;
                if (m.floatValue() > 49.0f) {
                    sf1 G = swapSlipPage.f41795P;
                    sf1 sf1 = null;
                    if (G == null) {
                        vx2.m53605u("binding");
                        G = null;
                    }
                    G.f33858i.setText("49");
                    sf1 G2 = swapSlipPage.f41795P;
                    if (G2 == null) {
                        vx2.m53605u("binding");
                    } else {
                        sf1 = G2;
                    }
                    sf1.f33858i.setSelection(2);
                }
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            vx2.m53591g(charSequence, "s");
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            vx2.m53591g(charSequence, "s");
        }
    }

    public SwapSlipPage() {
        ef3 b = C6169a.m47233b(LazyThreadSafetyMode.NONE, new SwapSlipPage$special$$inlined$viewModels$default$1(new SwapSlipPage$swapViewModel$2(this)));
        this.f41796Q = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(SwapViewModel.class), new SwapSlipPage$special$$inlined$viewModels$default$2(b), new SwapSlipPage$special$$inlined$viewModels$default$3((pc2) null, b), new SwapSlipPage$special$$inlined$viewModels$default$4(this, b));
    }

    /* renamed from: J */
    public static final void m66217J(SwapSlipPage swapSlipPage, View view) {
        double d;
        boolean z;
        vx2.m53591g(swapSlipPage, "this$0");
        sf1 sf1 = swapSlipPage.f41795P;
        if (sf1 == null) {
            vx2.m53605u("binding");
            sf1 = null;
        }
        Editable text = sf1.f33858i.getText();
        k04<Double> x0 = swapSlipPage.mo57302I().mo61631x0();
        if (text != null) {
            if (text.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                d = Utils.DOUBLE_EPSILON;
                x0.setValue(Double.valueOf(Math.min(100.0d, Math.max(0.1d, d))));
                swapSlipPage.mo22266k();
            }
        }
        d = ol0.m70330J(String.valueOf(text));
        x0.setValue(Double.valueOf(Math.min(100.0d, Math.max(0.1d, d))));
        swapSlipPage.mo22266k();
    }

    /* renamed from: K */
    public static final boolean m66218K(SwapSlipPage swapSlipPage, TextView textView, int i, KeyEvent keyEvent) {
        vx2.m53591g(swapSlipPage, "this$0");
        if (i != 6) {
            return false;
        }
        swapSlipPage.mo22266k();
        return true;
    }

    /* renamed from: L */
    public static final void m66219L(SwapSlipPage swapSlipPage, CompoundButton compoundButton, boolean z) {
        vx2.m53591g(swapSlipPage, "this$0");
        f06.m57523n(swapSlipPage.requireContext(), "SWAP_PAIR_DONT_SHOW_ME", Boolean.valueOf(z));
    }

    /* renamed from: M */
    public static final void m66220M(SwapSlipPage swapSlipPage, View view) {
        vx2.m53591g(swapSlipPage, "this$0");
        sf1 sf1 = swapSlipPage.f41795P;
        if (sf1 == null) {
            vx2.m53605u("binding");
            sf1 = null;
        }
        TextInputEditText textInputEditText = sf1.f33858i;
        char B = Common.f42577a.mo60892B();
        textInputEditText.setText("0" + B + "1");
    }

    /* renamed from: N */
    public static final void m66221N(SwapSlipPage swapSlipPage, View view) {
        vx2.m53591g(swapSlipPage, "this$0");
        sf1 sf1 = swapSlipPage.f41795P;
        if (sf1 == null) {
            vx2.m53605u("binding");
            sf1 = null;
        }
        TextInputEditText textInputEditText = sf1.f33858i;
        char B = Common.f42577a.mo60892B();
        textInputEditText.setText("0" + B + "5");
    }

    /* renamed from: O */
    public static final void m66222O(SwapSlipPage swapSlipPage, View view) {
        vx2.m53591g(swapSlipPage, "this$0");
        sf1 sf1 = swapSlipPage.f41795P;
        if (sf1 == null) {
            vx2.m53605u("binding");
            sf1 = null;
        }
        sf1.f33858i.setText("1");
    }

    /* renamed from: P */
    public static final void m66223P(SwapSlipPage swapSlipPage, View view) {
        vx2.m53591g(swapSlipPage, "this$0");
        swapSlipPage.mo22266k();
    }

    /* renamed from: Q */
    public static final void m66224Q(SwapSlipPage swapSlipPage, View view) {
        vx2.m53591g(swapSlipPage, "this$0");
        ri6 a = ri6.f44377Q.mo65657a();
        FragmentManager childFragmentManager = swapSlipPage.getChildFragmentManager();
        vx2.m53590f(childFragmentManager, "childFragmentManager");
        a.mo65656A(childFragmentManager);
    }

    /* renamed from: I */
    public final SwapViewModel mo57302I() {
        return (SwapViewModel) this.f41796Q.getValue();
    }

    /* renamed from: R */
    public final void mo57303R(FragmentManager fragmentManager) {
        vx2.m53591g(fragmentManager, "manager");
        super.mo22281x(fragmentManager, SwapSlipPage.class.getCanonicalName());
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        vx2.m53591g(layoutInflater, "inflater");
        return LayoutInflater.from(requireContext()).inflate(R.layout.dialog_swap_slippage, viewGroup, false);
    }

    public void onStart() {
        super.onStart();
        Dialog n = mo22269n();
        if (n != null) {
            Window window = n.getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
            Window window2 = n.getWindow();
            if (window2 != null) {
                window2.setLayout(-1, -2);
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        vx2.m53591g(view, "view");
        super.onViewCreated(view, bundle);
        sf1 a = sf1.m51747a(view);
        vx2.m53590f(a, "bind(view)");
        this.f41795P = a;
        mo57302I().mo61631x0().observe(getViewLifecycleOwner(), new C8311b(this));
        sf1 sf1 = this.f41795P;
        sf1 sf12 = null;
        if (sf1 == null) {
            vx2.m53605u("binding");
            sf1 = null;
        }
        sf1.f33858i.setFilters(new InputFilter[]{new xu2(Double.valueOf(Utils.DOUBLE_EPSILON), Double.valueOf(100.0d))});
        sf1 sf13 = this.f41795P;
        if (sf13 == null) {
            vx2.m53605u("binding");
            sf13 = null;
        }
        TextInputEditText textInputEditText = sf13.f33858i;
        sf1 sf14 = this.f41795P;
        if (sf14 == null) {
            vx2.m53605u("binding");
            sf14 = null;
        }
        textInputEditText.addTextChangedListener(new C8312c(sf14.f33858i));
        sf1 sf15 = this.f41795P;
        if (sf15 == null) {
            vx2.m53605u("binding");
            sf15 = null;
        }
        sf15.f33858i.addTextChangedListener(new C8313d(this));
        sf1 sf16 = this.f41795P;
        if (sf16 == null) {
            vx2.m53605u("binding");
            sf16 = null;
        }
        sf16.f33851b.setOnClickListener(new si6(this));
        sf1 sf17 = this.f41795P;
        if (sf17 == null) {
            vx2.m53605u("binding");
            sf17 = null;
        }
        TextInputEditText textInputEditText2 = sf17.f33858i;
        Common common = Common.f42577a;
        textInputEditText2.setHint(getString(R.string.hint_0, Character.valueOf(common.mo60892B())));
        sf1 sf18 = this.f41795P;
        if (sf18 == null) {
            vx2.m53605u("binding");
            sf18 = null;
        }
        sf18.f33858i.setOnEditorActionListener(new ti6(this));
        sf1 sf19 = this.f41795P;
        if (sf19 == null) {
            vx2.m53605u("binding");
            sf19 = null;
        }
        RadioButton radioButton = sf19.f33852c;
        radioButton.setText(getString(R.string.chip_slippage_tolerance_0_1, Character.valueOf(common.mo60892B())));
        radioButton.setOnClickListener(new ui6(this));
        sf1 sf110 = this.f41795P;
        if (sf110 == null) {
            vx2.m53605u("binding");
            sf110 = null;
        }
        RadioButton radioButton2 = sf110.f33853d;
        radioButton2.setText(getString(R.string.chip_slippage_tolerance_0_5, Character.valueOf(common.mo60892B())));
        radioButton2.setOnClickListener(new vi6(this));
        sf1 sf111 = this.f41795P;
        if (sf111 == null) {
            vx2.m53605u("binding");
            sf111 = null;
        }
        RadioButton radioButton3 = sf111.f33854e;
        radioButton3.setText(getString(R.string.chip_slippage_tolerance_1));
        radioButton3.setOnClickListener(new wi6(this));
        sf1 sf112 = this.f41795P;
        if (sf112 == null) {
            vx2.m53605u("binding");
            sf112 = null;
        }
        sf112.f33855f.setOnClickListener(new xi6(this));
        sf1 sf113 = this.f41795P;
        if (sf113 == null) {
            vx2.m53605u("binding");
            sf113 = null;
        }
        sf113.f33860k.setOnClickListener(new yi6(this));
        boolean e = f06.m57514e(requireContext(), "SWAP_PAIR_DONT_SHOW_ME", true);
        sf1 sf114 = this.f41795P;
        if (sf114 == null) {
            vx2.m53605u("binding");
            sf114 = null;
        }
        sf114.f33861l.setChecked(e);
        sf1 sf115 = this.f41795P;
        if (sf115 == null) {
            vx2.m53605u("binding");
        } else {
            sf12 = sf115;
        }
        sf12.f33861l.setOnCheckedChangeListener(new zi6(this));
    }

    /* renamed from: p */
    public Dialog mo22273p(Bundle bundle) {
        Dialog p = super.mo22273p(bundle);
        vx2.m53590f(p, "super.onCreateDialog(savedInstanceState)");
        p.requestWindowFeature(1);
        return p;
    }
}
