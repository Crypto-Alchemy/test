package net.safemoon.androidwallet.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.navigation.NavBackStackEntry;
import com.bumptech.glide.C1710a;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.slider.Slider;
import com.google.android.material.switchmaterial.SwitchMaterial;
import java.math.BigDecimal;
import kotlin.C6169a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.model.priceAlert.PAToken;
import net.safemoon.androidwallet.model.priceAlert.PriceAlertToken;
import net.safemoon.androidwallet.viewmodels.CryptoPriceAlertViewModel;
import net.safemoon.androidwallet.views.editText.autoSize.AutofitEdittext;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b0\u00101J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J$\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0016J\u0012\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u001b\u0010\u001d\u001a\u00020\u001a8BX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001b\u0010&\u001a\u00020\"8BX\u0002¢\u0006\f\n\u0004\b#\u0010\u0017\u001a\u0004\b$\u0010%R\u001b\u0010+\u001a\u00020'8BX\u0002¢\u0006\f\n\u0004\b(\u0010\u0017\u001a\u0004\b)\u0010*R\u001b\u0010/\u001a\u00020,8BX\u0002¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b-\u0010.¨\u00062"}, mo44877d2 = {"Lnet/safemoon/androidwallet/dialogs/CryptoPriceAlertFragment;", "Lkf1;", "Landroid/os/Bundle;", "savedInstanceState", "Lr37;", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "view", "onViewCreated", "k", "Landroid/app/Dialog;", "p", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "onStart", "Lm92;", "P", "Lef3;", "()Lm92;", "binding", "Lnet/safemoon/androidwallet/viewmodels/CryptoPriceAlertViewModel;", "Q", "()Lnet/safemoon/androidwallet/viewmodels/CryptoPriceAlertViewModel;", "cryptoPriceAlertViewModel", "", "U", "Z", "changesForPriceAlert", "Lnet/safemoon/androidwallet/model/priceAlert/PAToken;", "X", "S", "()Lnet/safemoon/androidwallet/model/priceAlert/PAToken;", "paToken", "Lnet/safemoon/androidwallet/dialogs/ProgressLoading;", "Y", "R", "()Lnet/safemoon/androidwallet/dialogs/ProgressLoading;", "loader", "Lxx0;", "O", "()Lxx0;", "alertDialog", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: CryptoPriceAlertFragment.kt */
public final class CryptoPriceAlertFragment extends kf1 {

    /* renamed from: P */
    public final ef3 f41726P = C6169a.m47232a(new CryptoPriceAlertFragment$binding$2(this));

    /* renamed from: Q */
    public final ef3 f41727Q;

    /* renamed from: U */
    public boolean f41728U;

    /* renamed from: X */
    public final ef3 f41729X;

    /* renamed from: Y */
    public final ef3 f41730Y;

    /* renamed from: Z */
    public final ef3 f41731Z;

    public CryptoPriceAlertFragment() {
        ef3 b = C6169a.m47233b(LazyThreadSafetyMode.NONE, new CryptoPriceAlertFragment$special$$inlined$viewModels$default$2(new CryptoPriceAlertFragment$special$$inlined$viewModels$default$1(this)));
        this.f41727Q = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(CryptoPriceAlertViewModel.class), new CryptoPriceAlertFragment$special$$inlined$viewModels$default$3(b), new CryptoPriceAlertFragment$special$$inlined$viewModels$default$4((pc2) null, b), new CryptoPriceAlertFragment$special$$inlined$viewModels$default$5(this, b));
        this.f41729X = C6169a.m47232a(new CryptoPriceAlertFragment$paToken$2(this));
        this.f41730Y = C6169a.m47232a(new CryptoPriceAlertFragment$loader$2(this));
        this.f41731Z = C6169a.m47232a(new CryptoPriceAlertFragment$alertDialog$2(this));
    }

    /* renamed from: T */
    public static final boolean m66002T(CryptoPriceAlertFragment cryptoPriceAlertFragment, DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        vx2.m53591g(cryptoPriceAlertFragment, "this$0");
        if (i != 4) {
            return false;
        }
        cryptoPriceAlertFragment.mo22266k();
        return true;
    }

    /* renamed from: U */
    public static final boolean m66003U(CryptoPriceAlertFragment cryptoPriceAlertFragment, View view, MotionEvent motionEvent) {
        vx2.m53591g(cryptoPriceAlertFragment, "this$0");
        if (motionEvent.getAction() != 0) {
            return true;
        }
        Rect rect = new Rect();
        view.getHitRect(rect);
        if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return true;
        }
        cryptoPriceAlertFragment.mo22266k();
        return false;
    }

    /* renamed from: V */
    public static final void m66004V(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: W */
    public static final void m66005W(CryptoPriceAlertFragment cryptoPriceAlertFragment, View view) {
        vx2.m53591g(cryptoPriceAlertFragment, "this$0");
        cryptoPriceAlertFragment.mo22266k();
    }

    /* renamed from: X */
    public static final void m66006X(CryptoPriceAlertFragment cryptoPriceAlertFragment, View view) {
        vx2.m53591g(cryptoPriceAlertFragment, "this$0");
        Context requireContext = cryptoPriceAlertFragment.requireContext();
        vx2.m53590f(requireContext, "requireContext()");
        xx0.m74124c(new xx0(requireContext, yw0.m74665b(), new CryptoPriceAlertFragment$onViewCreated$1$6$1(cryptoPriceAlertFragment)), false, false, 3, (Object) null).mo66964f();
    }

    /* renamed from: Y */
    public static final void m66007Y(CryptoPriceAlertFragment cryptoPriceAlertFragment, View view) {
        Integer value;
        vx2.m53591g(cryptoPriceAlertFragment, "this$0");
        PriceAlertToken value2 = cryptoPriceAlertFragment.mo57192Q().mo61140v().getValue();
        if (value2 != null && (value = cryptoPriceAlertFragment.mo57192Q().mo61139u().getValue()) != null) {
            if (value2.getId() == null) {
                CryptoPriceAlertViewModel Q = cryptoPriceAlertFragment.mo57192Q();
                vx2.m53590f(value, "index");
                Q.mo61130l(value2, value.intValue());
                return;
            }
            Context requireContext = cryptoPriceAlertFragment.requireContext();
            vx2.m53590f(requireContext, "requireContext()");
            xx0.m74124c(new xx0(requireContext, yw0.m74664a(), new CryptoPriceAlertFragment$onViewCreated$1$7$1$1$1(cryptoPriceAlertFragment, value2, value)), false, false, 3, (Object) null).mo66964f();
        }
    }

    /* renamed from: Z */
    public static final void m66008Z(CryptoPriceAlertFragment cryptoPriceAlertFragment, View view) {
        vx2.m53591g(cryptoPriceAlertFragment, "this$0");
        cryptoPriceAlertFragment.f41728U = true;
        cryptoPriceAlertFragment.mo57192Q().mo61127i(cryptoPriceAlertFragment.mo57194S());
    }

    /* renamed from: a0 */
    public static final void m66009a0(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: b0 */
    public static final void m66010b0(CryptoPriceAlertFragment cryptoPriceAlertFragment, Slider slider, float f, boolean z) {
        vx2.m53591g(cryptoPriceAlertFragment, "this$0");
        vx2.m53591g(slider, "<anonymous parameter 0>");
        if (z) {
            cryptoPriceAlertFragment.f41728U = true;
            PriceAlertToken value = cryptoPriceAlertFragment.mo57192Q().mo61140v().getValue();
            if (value != null) {
                value.setIncreasePercentString(ol0.m70360g0(new BigDecimal(String.valueOf(f)), 0, 1, (Object) null));
                CryptoPriceAlertViewModel.m68532B(cryptoPriceAlertFragment.mo57192Q(), value, (Integer) null, 2, (Object) null);
            }
        }
    }

    /* renamed from: c0 */
    public static final void m66011c0(CryptoPriceAlertFragment cryptoPriceAlertFragment, Slider slider, float f, boolean z) {
        vx2.m53591g(cryptoPriceAlertFragment, "this$0");
        vx2.m53591g(slider, "<anonymous parameter 0>");
        if (z) {
            cryptoPriceAlertFragment.f41728U = true;
            PriceAlertToken value = cryptoPriceAlertFragment.mo57192Q().mo61140v().getValue();
            if (value != null) {
                value.setDecreasePercentString(ol0.m70360g0(new BigDecimal(String.valueOf(f)), 0, 1, (Object) null));
                CryptoPriceAlertViewModel.m68532B(cryptoPriceAlertFragment.mo57192Q(), value, (Integer) null, 2, (Object) null);
            }
        }
    }

    /* renamed from: d0 */
    public static final void m66012d0(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: e0 */
    public static final void m66013e0(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: O */
    public final xx0 mo57190O() {
        return (xx0) this.f41731Z.getValue();
    }

    /* renamed from: P */
    public final m92 mo57191P() {
        return (m92) this.f41726P.getValue();
    }

    /* renamed from: Q */
    public final CryptoPriceAlertViewModel mo57192Q() {
        return (CryptoPriceAlertViewModel) this.f41727Q.getValue();
    }

    /* renamed from: R */
    public final ProgressLoading mo57193R() {
        return (ProgressLoading) this.f41730Y.getValue();
    }

    /* renamed from: S */
    public final PAToken mo57194S() {
        return (PAToken) this.f41729X.getValue();
    }

    /* renamed from: k */
    public void mo22266k() {
        if (!this.f41728U) {
            super.mo22266k();
        } else if (!mo57190O().mo66963e()) {
            mo57190O().mo66964f();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        vx2.m53591g(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_crypto_price_alert, viewGroup, false);
        vx2.m53590f(inflate, "inflater.inflate(R.layou…_alert, container, false)");
        return inflate;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        dl5 dl5;
        vx2.m53591g(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        NavBackStackEntry H = x92.m29982a(this).mo8452H();
        if (H != null) {
            dl5 = H.mo8428i();
        } else {
            dl5 = null;
        }
        if (dl5 != null) {
            dl5.mo18833j("RESULT_FROM_CRYPTO_PRICE_ALERT", Boolean.TRUE);
        }
        x92.m29982a(this).mo8464U();
    }

    public void onStart() {
        Window window;
        super.onStart();
        Dialog n = mo22269n();
        if (n != null && (window = n.getWindow()) != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setLayout(-1, -2);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        vx2.m53591g(view, "view");
        super.onViewCreated(view, bundle);
        m92 P = mo57191P();
        PAToken S = mo57194S();
        mo57192Q().mo61131m(mo57194S());
        C1710a.m12225u(P.f31576i).mo23163x(S.getIcon()).mo11553K0(P.f31576i);
        P.f31582o.setText(getString(R.string.ca_notify_title_token, S.getName()));
        SwitchMaterial switchMaterial = P.f31582o;
        vx2.m53590f(switchMaterial, "titleSwitch");
        tc7.m72257j(switchMaterial, new CryptoPriceAlertFragment$onViewCreated$1$1$1(this));
        SwitchMaterial switchMaterial2 = P.f31580m;
        vx2.m53590f(switchMaterial2, "switchPersistent");
        tc7.m72257j(switchMaterial2, new CryptoPriceAlertFragment$onViewCreated$1$1$2(this, P));
        AutofitEdittext autofitEdittext = P.f31571d;
        vx2.m53590f(autofitEdittext, "edtMaximum");
        tc7.m72256i(autofitEdittext, new CryptoPriceAlertFragment$onViewCreated$1$1$3(this));
        AutofitEdittext autofitEdittext2 = P.f31571d;
        Double valueOf = Double.valueOf(Utils.DOUBLE_EPSILON);
        autofitEdittext2.setFilters(new InputFilter[]{new xu2(valueOf, Double.valueOf(10.0d))});
        et2 et2 = P.f31577j;
        et2.f28667h.setText(getString(R.string.ca_notify_on_increase));
        et2.f28666g.setText("%");
        MaterialCheckBox materialCheckBox = et2.f28661b;
        vx2.m53590f(materialCheckBox, "cbEnableBox");
        tc7.m72257j(materialCheckBox, new CryptoPriceAlertFragment$onViewCreated$1$1$4$1(this));
        AutofitEdittext autofitEdittext3 = et2.f28664e;
        Double valueOf2 = Double.valueOf(100.0d);
        autofitEdittext3.setFilters(new InputFilter[]{new xu2(valueOf, valueOf2)});
        AutofitEdittext autofitEdittext4 = et2.f28664e;
        vx2.m53590f(autofitEdittext4, "newValue");
        autofitEdittext4.addTextChangedListener(new nc4(autofitEdittext4));
        et2.f28665f.mo33390h(new mw0(this));
        AutofitEdittext autofitEdittext5 = et2.f28664e;
        vx2.m53590f(autofitEdittext5, "newValue");
        tc7.m72256i(autofitEdittext5, new CryptoPriceAlertFragment$onViewCreated$1$1$4$3(this, et2));
        et2.f28661b.setChecked(false);
        et2 et22 = P.f31570c;
        et22.f28667h.setText(getString(R.string.ca_notify_on_decrease));
        et22.f28666g.setText("%");
        MaterialCheckBox materialCheckBox2 = et22.f28661b;
        vx2.m53590f(materialCheckBox2, "cbEnableBox");
        tc7.m72257j(materialCheckBox2, new CryptoPriceAlertFragment$onViewCreated$1$1$5$1(this));
        et22.f28664e.setFilters(new InputFilter[]{new xu2(valueOf, valueOf2)});
        AutofitEdittext autofitEdittext6 = et22.f28664e;
        vx2.m53590f(autofitEdittext6, "newValue");
        autofitEdittext6.addTextChangedListener(new nc4(autofitEdittext6));
        et22.f28665f.mo33390h(new pw0(this));
        AutofitEdittext autofitEdittext7 = et22.f28664e;
        vx2.m53590f(autofitEdittext7, "newValue");
        tc7.m72256i(autofitEdittext7, new CryptoPriceAlertFragment$onViewCreated$1$1$5$3(this, et22));
        et22.f28661b.setChecked(false);
        et2 et23 = P.f31572e;
        et23.f28667h.setText(getString(R.string.ca_notify_when_equal));
        MaterialCheckBox materialCheckBox3 = et23.f28662c;
        vx2.m53590f(materialCheckBox3, "cbEnablepriceReachesOrHigher");
        tc7.m72257j(materialCheckBox3, new CryptoPriceAlertFragment$onViewCreated$1$1$6$1(this));
        MaterialCheckBox materialCheckBox4 = et23.f28663d;
        vx2.m53590f(materialCheckBox4, "cbEnablepriceReachesOrLower");
        tc7.m72257j(materialCheckBox4, new CryptoPriceAlertFragment$onViewCreated$1$1$6$2(this));
        Slider slider = et23.f28665f;
        vx2.m53590f(slider, "slider");
        slider.setVisibility(8);
        AutofitEdittext autofitEdittext8 = et23.f28664e;
        vx2.m53590f(autofitEdittext8, "newValue");
        autofitEdittext8.addTextChangedListener(new nc4(autofitEdittext8));
        MaterialCheckBox materialCheckBox5 = et23.f28662c;
        vx2.m53590f(materialCheckBox5, "cbEnablepriceReachesOrHigher");
        materialCheckBox5.setVisibility(0);
        MaterialCheckBox materialCheckBox6 = et23.f28663d;
        vx2.m53590f(materialCheckBox6, "cbEnablepriceReachesOrLower");
        materialCheckBox6.setVisibility(0);
        MaterialCheckBox materialCheckBox7 = et23.f28661b;
        vx2.m53590f(materialCheckBox7, "cbEnableBox");
        materialCheckBox7.setVisibility(8);
        AutofitEdittext autofitEdittext9 = et23.f28664e;
        vx2.m53590f(autofitEdittext9, "newValue");
        tc7.m72256i(autofitEdittext9, new CryptoPriceAlertFragment$onViewCreated$1$1$6$3(this));
        mo57192Q().mo61140v().observe(getViewLifecycleOwner(), new qw0(new CryptoPriceAlertFragment$onViewCreated$1$2(P, this)));
        mo57192Q().mo61137s().observe(getViewLifecycleOwner(), new rw0(new CryptoPriceAlertFragment$onViewCreated$1$3(P, this)));
        mo57192Q().mo61139u().observe(getViewLifecycleOwner(), new sw0(new CryptoPriceAlertFragment$onViewCreated$1$4(P)));
        P.f31573f.setOnClickListener(new tw0(this));
        P.f31569b.setOnClickListener(new uw0(this));
        P.f31575h.setOnClickListener(new vw0(this));
        P.f31574g.setOnClickListener(new ww0(this));
        ho0.m58585b(mo57192Q().mo61134p()).observe(getViewLifecycleOwner(), new xw0(new CryptoPriceAlertFragment$onViewCreated$1$9(this)));
    }

    /* renamed from: p */
    public Dialog mo22273p(Bundle bundle) {
        View decorView;
        Dialog p = super.mo22273p(bundle);
        vx2.m53590f(p, "super.onCreateDialog(savedInstanceState)");
        Window window = p.getWindow();
        if (window != null) {
            window.addFlags(262144);
        }
        p.setOnKeyListener(new nw0(this));
        Window window2 = p.getWindow();
        if (!(window2 == null || (decorView = window2.getDecorView()) == null)) {
            decorView.setOnTouchListener(new ow0(this));
        }
        return p;
    }
}
