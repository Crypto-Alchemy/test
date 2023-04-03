package net.safemoon.androidwallet.dialogs;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textview.MaterialTextView;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import kotlin.C6169a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.model.swap.Swap;
import net.safemoon.androidwallet.viewmodels.SwapViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 *2\u00020\u0001:\u0001+B\u0007¢\u0006\u0004\b(\u0010)J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J&\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J\u001a\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fJ\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\nH\u0002J\u0018\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\b\u0010\u0017\u001a\u00020\u0004H\u0002R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001e8BX\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010!R\u001b\u0010'\u001a\u00020#8BX\u0002¢\u0006\f\n\u0004\b$\u0010\u001a\u001a\u0004\b%\u0010&¨\u0006,"}, mo44877d2 = {"Lnet/safemoon/androidwallet/dialogs/ConfirmSwapTransactionFragment;", "Lkf1;", "Landroid/os/Bundle;", "savedInstanceState", "Lr37;", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "onStart", "view", "onViewCreated", "Landroidx/fragment/app/FragmentManager;", "manager", "R", "S", "anchor", "", "text", "W", "J", "Lnet/safemoon/androidwallet/viewmodels/SwapViewModel;", "P", "Lef3;", "N", "()Lnet/safemoon/androidwallet/viewmodels/SwapViewModel;", "swapViewModel", "Lj92;", "Q", "L", "()Lj92;", "binding", "", "U", "M", "()I", "ccWrapperWidth", "<init>", "()V", "X", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: ConfirmSwapTransactionFragment.kt */
public final class ConfirmSwapTransactionFragment extends kf1 {

    /* renamed from: X */
    public static final C8281a f41721X = new C8281a((DefaultConstructorMarker) null);

    /* renamed from: P */
    public final ef3 f41722P;

    /* renamed from: Q */
    public final ef3 f41723Q = C6169a.m47232a(new ConfirmSwapTransactionFragment$binding$2(this));

    /* renamed from: U */
    public final ef3 f41724U = C6169a.m47232a(new ConfirmSwapTransactionFragment$ccWrapperWidth$2(this));

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, mo44877d2 = {"Lnet/safemoon/androidwallet/dialogs/ConfirmSwapTransactionFragment$a;", "", "Lnet/safemoon/androidwallet/dialogs/ConfirmSwapTransactionFragment;", "a", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.dialogs.ConfirmSwapTransactionFragment$a */
    /* compiled from: ConfirmSwapTransactionFragment.kt */
    public static final class C8281a {
        public C8281a() {
        }

        public /* synthetic */ C8281a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final ConfirmSwapTransactionFragment mo57185a() {
            return new ConfirmSwapTransactionFragment();
        }
    }

    public ConfirmSwapTransactionFragment() {
        ef3 b = C6169a.m47233b(LazyThreadSafetyMode.NONE, new C8282x1332bd42(new ConfirmSwapTransactionFragment$swapViewModel$2(this)));
        this.f41722P = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(SwapViewModel.class), new C8283x1332bd43(b), new C8284x1332bd44((pc2) null, b), new C8285x1332bd45(this, b));
    }

    /* renamed from: K */
    public static final void m65969K(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: O */
    public static final void m65970O(ConfirmSwapTransactionFragment confirmSwapTransactionFragment, View view) {
        vx2.m53591g(confirmSwapTransactionFragment, "this$0");
        confirmSwapTransactionFragment.mo22266k();
    }

    /* renamed from: P */
    public static final void m65971P(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: Q */
    public static final void m65972Q(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: T */
    public static final void m65973T(ConfirmSwapTransactionFragment confirmSwapTransactionFragment, View view) {
        vx2.m53591g(confirmSwapTransactionFragment, "this$0");
        vx2.m53590f(view, "it");
        String string = confirmSwapTransactionFragment.getResources().getString(R.string.minimum_received_description);
        vx2.m53590f(string, "resources.getString(R.st…mum_received_description)");
        confirmSwapTransactionFragment.mo57184W(view, string);
    }

    /* renamed from: U */
    public static final void m65974U(ConfirmSwapTransactionFragment confirmSwapTransactionFragment, View view) {
        vx2.m53591g(confirmSwapTransactionFragment, "this$0");
        vx2.m53590f(view, "it");
        String string = confirmSwapTransactionFragment.getResources().getString(R.string.price_impact_description);
        vx2.m53590f(string, "resources.getString(R.st…price_impact_description)");
        confirmSwapTransactionFragment.mo57184W(view, string);
    }

    /* renamed from: V */
    public static final void m65975V(ConfirmSwapTransactionFragment confirmSwapTransactionFragment, View view) {
        vx2.m53591g(confirmSwapTransactionFragment, "this$0");
        vx2.m53590f(view, "it");
        String string = confirmSwapTransactionFragment.getResources().getString(R.string.swap_fee_description);
        vx2.m53590f(string, "resources.getString(R.string.swap_fee_description)");
        confirmSwapTransactionFragment.mo57184W(view, string);
    }

    /* renamed from: X */
    public static final boolean m65976X(PopupWindow popupWindow, View view, MotionEvent motionEvent) {
        vx2.m53591g(popupWindow, "$popupWindow");
        popupWindow.dismiss();
        return true;
    }

    /* renamed from: J */
    public final void mo57178J() {
        Swap value;
        BigDecimal bigDecimal;
        SwapViewModel.C8786a value2;
        BigDecimal bigDecimal2;
        String str;
        j92 L = mo57179L();
        SwapViewModel N = mo57181N();
        kt6 J0 = N.mo61567J0();
        String str2 = null;
        if (J0 != null) {
            ue6 S = N.mo61584S();
            if (S != null) {
                bigDecimal2 = S.mo66262q(J0);
            } else {
                bigDecimal2 = null;
            }
            if (bigDecimal2 != null) {
                MaterialTextView materialTextView = L.f30267k;
                if (bigDecimal2.doubleValue() < 0.01d) {
                    str = "<0.01%";
                } else {
                    str = ol0.m70371m(bigDecimal2.doubleValue()) + "%";
                }
                materialTextView.setText(str);
            }
        }
        kt6 J02 = N.mo61567J0();
        if (!(J02 == null || (value2 = N.mo61561G0().getValue()) == null)) {
            if (value2.mo61635b()) {
                Swap value3 = N.mo61604c0().getValue();
                if (value3 != null) {
                    L.f30265i.setText(R.string.cst_min_received);
                    MaterialTextView materialTextView2 = L.f30266j;
                    BigInteger F = N.mo61558F(J02.mo55777b());
                    Integer num = value3.decimals;
                    vx2.m53590f(num, "swap.decimals");
                    materialTextView2.setText(ol0.m70374p(ol0.m70376r(F, num.intValue()).doubleValue(), 0, (RoundingMode) null, false, 6, (Object) null) + " " + value3.symbol);
                }
            } else {
                Swap value4 = N.mo61553B0().getValue();
                if (value4 != null) {
                    L.f30265i.setText(R.string.cst_max_sold);
                    MaterialTextView materialTextView3 = L.f30266j;
                    BigInteger E = N.mo61556E(J02.mo55776a());
                    Integer num2 = value4.decimals;
                    vx2.m53590f(num2, "swap.decimals");
                    materialTextView3.setText(ol0.m70374p(ol0.m70376r(E, num2.intValue()).doubleValue(), 0, (RoundingMode) null, false, 6, (Object) null) + " " + value4.symbol);
                }
            }
        }
        kt6 J03 = N.mo61567J0();
        if (J03 != null && (value = N.mo61553B0().getValue()) != null) {
            if (mo57181N().mo61581Q0()) {
                mo57181N().mo61571L0().observe(getViewLifecycleOwner(), new ip0(new ConfirmSwapTransactionFragment$bindValues$1$1$4$1(L, value)));
                return;
            }
            ue6 S2 = N.mo61584S();
            if (S2 != null) {
                BigInteger a = J03.mo55776a();
                Integer num3 = value.decimals;
                vx2.m53590f(num3, "swap.decimals");
                BigDecimal r = ol0.m70376r(a, num3.intValue());
                vx2.m53590f(r, "it.amountIn.fromWEI(swap.decimals)");
                bigDecimal = S2.mo66252f(r, J03);
            } else {
                bigDecimal = null;
            }
            TextInputEditText textInputEditText = L.f30268l;
            if (bigDecimal != null) {
                str2 = ol0.m70374p(bigDecimal.doubleValue(), 2, (RoundingMode) null, false, 6, (Object) null);
            }
            textInputEditText.setText(str2 + " " + value.symbol);
        }
    }

    /* renamed from: L */
    public final j92 mo57179L() {
        return (j92) this.f41723Q.getValue();
    }

    /* renamed from: M */
    public final int mo57180M() {
        return ((Number) this.f41724U.getValue()).intValue();
    }

    /* renamed from: N */
    public final SwapViewModel mo57181N() {
        return (SwapViewModel) this.f41722P.getValue();
    }

    /* renamed from: R */
    public final void mo57182R(FragmentManager fragmentManager) {
        vx2.m53591g(fragmentManager, "manager");
        super.mo22281x(fragmentManager, ConfirmSwapTransactionFragment.class.getCanonicalName());
    }

    /* renamed from: S */
    public final void mo57183S(View view) {
        mo57179L().f30262f.setOnClickListener(new fp0(this));
        mo57179L().f30263g.setOnClickListener(new gp0(this));
        mo57179L().f30264h.setOnClickListener(new hp0(this));
    }

    /* renamed from: W */
    public final void mo57184W(View view, String str) {
        View view2;
        LayoutInflater layoutInflater;
        FragmentActivity activity = getActivity();
        TextView textView = null;
        if (activity == null || (layoutInflater = activity.getLayoutInflater()) == null) {
            view2 = null;
        } else {
            view2 = layoutInflater.inflate(R.layout.tooltip_view, (ViewGroup) null);
        }
        int M = (int) (((double) mo57180M()) * 0.6d);
        if (view2 != null) {
            textView = (TextView) view2.findViewById(R.id.tooltipText);
        }
        if (textView != null) {
            textView.setText(str);
        }
        PopupWindow popupWindow = new PopupWindow(view2, M, -2, true);
        popupWindow.showAsDropDown(view, -((int) (((double) M) * 0.2d)), 0);
        if (view2 != null) {
            view2.setOnTouchListener(new jp0(popupWindow));
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        vx2.m53591g(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_confirm_swap_transaction, viewGroup, false);
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
        j92 L = mo57179L();
        L.f30260d.setOnClickListener(new cp0(this));
        mo57181N().mo61592W().observe(getViewLifecycleOwner(), new dp0(new ConfirmSwapTransactionFragment$onViewCreated$1$2(L, this)));
        mo57181N().mo61588U().observe(getViewLifecycleOwner(), new ep0(new ConfirmSwapTransactionFragment$onViewCreated$1$3(L, this)));
        L.f30259c.setOnSlideCompleteListener(new ConfirmSwapTransactionFragment$onViewCreated$1$4(this));
        mo57183S(view);
    }
}
