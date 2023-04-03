package net.safemoon.androidwallet.fragments;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.C6169a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.dialogs.ProgressLoading;
import net.safemoon.androidwallet.fragments.common.BaseMainFragment;
import net.safemoon.androidwallet.model.swap.Swap;
import net.safemoon.androidwallet.viewmodels.SwapViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 /2\u00020\u0001:\u000201B\u0007¢\u0006\u0004\b-\u0010.J&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\r\u001a\u00020\u000bH\u0002J\b\u0010\u000e\u001a\u00020\u000bH\u0002J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002R\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u00148BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0002¢\u0006\f\n\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\"R\u0018\u0010'\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020(8BX\u0002¢\u0006\f\n\u0004\b)\u0010\u0016\u001a\u0004\b*\u0010+¨\u00062"}, mo44877d2 = {"Lnet/safemoon/androidwallet/fragments/SelectCurrencyFragment;", "Lnet/safemoon/androidwallet/fragments/common/BaseMainFragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "Lr37;", "onViewCreated", "L", "F", "Lnet/safemoon/androidwallet/model/swap/Swap;", "source", "swap", "", "K", "Lpa2;", "k", "Lef3;", "B", "()Lpa2;", "binding", "Lbj6;", "r", "C", "()Lbj6;", "swapTokenAdapter", "Lnet/safemoon/androidwallet/viewmodels/SwapViewModel;", "s", "D", "()Lnet/safemoon/androidwallet/viewmodels/SwapViewModel;", "swapViewModel", "Lnet/safemoon/androidwallet/dialogs/ProgressLoading;", "x", "Lnet/safemoon/androidwallet/dialogs/ProgressLoading;", "loader", "Lnet/safemoon/androidwallet/fragments/SelectCurrencyFragment$SWAPPATH;", "y", "E", "()Lnet/safemoon/androidwallet/fragments/SelectCurrencyFragment$SWAPPATH;", "_swapPath", "<init>", "()V", "A", "a", "SWAPPATH", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: SelectCurrencyFragment.kt */
public final class SelectCurrencyFragment extends BaseMainFragment {

    /* renamed from: A */
    public static final C8441a f42080A = new C8441a((DefaultConstructorMarker) null);

    /* renamed from: k */
    public final ef3 f42081k = C6169a.m47232a(new SelectCurrencyFragment$binding$2(this));

    /* renamed from: r */
    public final ef3 f42082r = C6169a.m47232a(SelectCurrencyFragment$swapTokenAdapter$2.INSTANCE);

    /* renamed from: s */
    public final ef3 f42083s;

    /* renamed from: x */
    public ProgressLoading f42084x;

    /* renamed from: y */
    public final ef3 f42085y;

    @Metadata(mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, mo44877d2 = {"Lnet/safemoon/androidwallet/fragments/SelectCurrencyFragment$SWAPPATH;", "", "(Ljava/lang/String;I)V", "Source", "Destination", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* compiled from: SelectCurrencyFragment.kt */
    public enum SWAPPATH {
        Source,
        Destination
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, mo44877d2 = {"Lnet/safemoon/androidwallet/fragments/SelectCurrencyFragment$a;", "", "Lnet/safemoon/androidwallet/fragments/SelectCurrencyFragment$SWAPPATH;", "arg", "Lnet/safemoon/androidwallet/fragments/SelectCurrencyFragment;", "a", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.SelectCurrencyFragment$a */
    /* compiled from: SelectCurrencyFragment.kt */
    public static final class C8441a {
        public C8441a() {
        }

        public /* synthetic */ C8441a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final SelectCurrencyFragment mo57647a(SWAPPATH swappath) {
            vx2.m53591g(swappath, "arg");
            SelectCurrencyFragment selectCurrencyFragment = new SelectCurrencyFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("SWAPPATH", swappath);
            selectCurrencyFragment.setArguments(bundle);
            return selectCurrencyFragment;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/SelectCurrencyFragment$b", "Lyg4;", "Lr37;", "b", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.SelectCurrencyFragment$b */
    /* compiled from: SelectCurrencyFragment.kt */
    public static final class C8442b extends yg4 {

        /* renamed from: c */
        public final /* synthetic */ SelectCurrencyFragment f42087c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8442b(SelectCurrencyFragment selectCurrencyFragment) {
            super(true);
            this.f42087c = selectCurrencyFragment;
        }

        /* renamed from: b */
        public void mo6034b() {
            this.f42087c.getParentFragmentManager().mo5968e1();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J*\u0010\f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016J*\u0010\u000e\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000f"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/SelectCurrencyFragment$c", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "Lr37;", "afterTextChanged", "", "text", "", "start", "count", "after", "beforeTextChanged", "before", "onTextChanged", "core-ktx_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.SelectCurrencyFragment$c */
    /* compiled from: TextView.kt */
    public static final class C8443c implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ SelectCurrencyFragment f42088a;

        public C8443c(SelectCurrencyFragment selectCurrencyFragment) {
            this.f42088a = selectCurrencyFragment;
        }

        public void afterTextChanged(Editable editable) {
            this.f42088a.mo57641C().getFilter().filter(editable);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public SelectCurrencyFragment() {
        ef3 b = C6169a.m47233b(LazyThreadSafetyMode.NONE, new SelectCurrencyFragment$special$$inlined$viewModels$default$1(new SelectCurrencyFragment$swapViewModel$2(this)));
        this.f42083s = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(SwapViewModel.class), new SelectCurrencyFragment$special$$inlined$viewModels$default$2(b), new SelectCurrencyFragment$special$$inlined$viewModels$default$3((pc2) null, b), new SelectCurrencyFragment$special$$inlined$viewModels$default$4(this, b));
        this.f42085y = C6169a.m47232a(new SelectCurrencyFragment$_swapPath$2(this));
    }

    /* renamed from: G */
    public static final void m66967G(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: H */
    public static final void m66968H(SelectCurrencyFragment selectCurrencyFragment, View view) {
        vx2.m53591g(selectCurrencyFragment, "this$0");
        a77.m55427e(selectCurrencyFragment.requireActivity());
        selectCurrencyFragment.requireActivity().onBackPressed();
    }

    /* renamed from: I */
    public static final void m66969I(pa2 pa2, SelectCurrencyFragment selectCurrencyFragment) {
        vx2.m53591g(pa2, "$this_apply");
        vx2.m53591g(selectCurrencyFragment, "this$0");
        pa2.f32622e.setRefreshing(false);
        selectCurrencyFragment.mo57646L();
    }

    /* renamed from: J */
    public static final void m66970J(SelectCurrencyFragment selectCurrencyFragment, View view) {
        vx2.m53591g(selectCurrencyFragment, "this$0");
        selectCurrencyFragment.mo57646L();
    }

    /* renamed from: B */
    public final pa2 mo57640B() {
        return (pa2) this.f42081k.getValue();
    }

    /* renamed from: C */
    public final bj6 mo57641C() {
        return (bj6) this.f42082r.getValue();
    }

    /* renamed from: D */
    public final SwapViewModel mo57642D() {
        return (SwapViewModel) this.f42083s.getValue();
    }

    /* renamed from: E */
    public final SWAPPATH mo57643E() {
        return (SWAPPATH) this.f42085y.getValue();
    }

    /* renamed from: F */
    public final void mo57644F() {
        mo57642D().mo61559F0().observe(getViewLifecycleOwner(), new ot5(new SelectCurrencyFragment$observeViewModel$1(this)));
    }

    /* renamed from: K */
    public final boolean mo57645K(Swap swap, Swap swap2) {
        if (((vx2.m53586b(swap2.symbol, "BNB") || vx2.m53586b(swap2.symbol, "WBNB")) && (vx2.m53586b(swap.symbol, "BNB") || vx2.m53586b(swap.symbol, "WBNB"))) || (((vx2.m53586b(swap2.symbol, "ETH") || vx2.m53586b(swap2.symbol, "WETH")) && (vx2.m53586b(swap.symbol, "ETH") || vx2.m53586b(swap.symbol, "WETH"))) || (((vx2.m53586b(swap2.symbol, "USDT") || vx2.m53586b(swap2.symbol, "USDC")) && (vx2.m53586b(swap.symbol, "USDT") || vx2.m53586b(swap.symbol, "USDC"))) || ((vx2.m53586b(swap2.symbol, "SAFEMOON") || vx2.m53586b(swap2.symbol, "SFM")) && (vx2.m53586b(swap.symbol, "SAFEMOON") || vx2.m53586b(swap.symbol, "SFM")))))) {
            return true;
        }
        return false;
    }

    /* renamed from: L */
    public final void mo57646L() {
        mo57642D().mo61591V0();
        ProgressLoading.C8308a aVar = ProgressLoading.f41785Y;
        String string = getString(R.string.loading);
        vx2.m53590f(string, "getString(R.string.loading)");
        ProgressLoading a = aVar.mo57297a(false, string, "");
        this.f42084x = a;
        if (a != null) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            vx2.m53590f(childFragmentManager, "childFragmentManager");
            a.mo57295D(childFragmentManager);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        vx2.m53591g(layoutInflater, "inflater");
        return LayoutInflater.from(requireContext()).inflate(R.layout.fragment_select_currency, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        vx2.m53591g(view, "view");
        super.onViewCreated(view, bundle);
        pa2 B = mo57640B();
        if (B != null) {
            B.f32623f.f34318d.setOnClickListener(new lt5(this));
            B.f32623f.f34320f.setText(getString(R.string.select_token_screen_title));
            B.f32621d.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
            B.f32621d.setAdapter(mo57641C());
            AppCompatEditText appCompatEditText = B.f32619b;
            vx2.m53590f(appCompatEditText, "etSearch");
            appCompatEditText.addTextChangedListener(new C8443c(this));
            B.f32621d.requestFocus();
            B.f32622e.setOnRefreshListener(new mt5(B, this));
            B.f32623f.f34319e.setVisibility(0);
            B.f32623f.f34319e.setOnClickListener(new nt5(this));
            B.f32623f.f34317c.setVisibility(8);
        }
        mo57641C().mo50607h(new SelectCurrencyFragment$onViewCreated$2(this));
        mo57644F();
        if (bundle == null) {
            requireActivity().getOnBackPressedDispatcher().mo912a(getViewLifecycleOwner(), new C8442b(this));
        }
    }
}
