package net.safemoon.androidwallet.fragments;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.textfield.TextInputEditText;
import kotlin.C6169a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.fragments.common.BaseMainFragment;
import net.safemoon.androidwallet.model.common.PaymentMethod;
import net.safemoon.androidwallet.viewmodels.AddNewTokensViewModel;
import net.safemoon.androidwallet.viewmodels.HomeViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u0000 \u00192\u00020\u0001:\u00011B\u0007¢\u0006\u0004\b/\u00100J&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0002J \u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8BX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010*\u001a\u00020%8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b)\u0010'R\u001b\u0010.\u001a\u00020%8BX\u0002¢\u0006\f\n\u0004\b+\u0010\u0018\u001a\u0004\b,\u0010-¨\u00062"}, mo44877d2 = {"Lnet/safemoon/androidwallet/fragments/TokenListFragment;", "Lnet/safemoon/androidwallet/fragments/common/BaseMainFragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "Lr37;", "onViewCreated", "onResume", "F", "Lnet/safemoon/androidwallet/model/common/PaymentMethod;", "paymentMethod", "", "currencyCode", "", "coinTypeValue", "C", "Lnet/safemoon/androidwallet/viewmodels/AddNewTokensViewModel;", "k", "Lef3;", "B", "()Lnet/safemoon/androidwallet/viewmodels/AddNewTokensViewModel;", "addNewTokensViewModel", "Lnet/safemoon/androidwallet/viewmodels/HomeViewModel;", "r", "D", "()Lnet/safemoon/androidwallet/viewmodels/HomeViewModel;", "homeViewModel", "Lab2;", "s", "Lab2;", "binding", "", "x", "Z", "isProceedingMoonPay", "y", "isGettingCheckoutUrl", "A", "E", "()Z", "isBuy", "<init>", "()V", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: TokenListFragment.kt */
public final class TokenListFragment extends BaseMainFragment {

    /* renamed from: B */
    public static final C8485a f42231B = new C8485a((DefaultConstructorMarker) null);

    /* renamed from: A */
    public final ef3 f42232A = C6169a.m47232a(new TokenListFragment$isBuy$2(this));

    /* renamed from: k */
    public final ef3 f42233k;

    /* renamed from: r */
    public final ef3 f42234r = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(HomeViewModel.class), new TokenListFragment$special$$inlined$activityViewModels$default$1(this), new TokenListFragment$special$$inlined$activityViewModels$default$2((pc2) null, this), new TokenListFragment$special$$inlined$activityViewModels$default$3(this));

    /* renamed from: s */
    public ab2 f42235s;

    /* renamed from: x */
    public boolean f42236x;

    /* renamed from: y */
    public boolean f42237y;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, mo44877d2 = {"Lnet/safemoon/androidwallet/fragments/TokenListFragment$a;", "", "", "ARG_IS_BUY", "Ljava/lang/String;", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.TokenListFragment$a */
    /* compiled from: TokenListFragment.kt */
    public static final class C8485a {
        public C8485a() {
        }

        public /* synthetic */ C8485a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J*\u0010\f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016J*\u0010\u000e\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000f"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/TokenListFragment$b", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "Lr37;", "afterTextChanged", "", "text", "", "start", "count", "after", "beforeTextChanged", "before", "onTextChanged", "core-ktx_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.TokenListFragment$b */
    /* compiled from: TextView.kt */
    public static final class C8486b implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ TokenListFragment f42238a;

        public C8486b(TokenListFragment tokenListFragment) {
            this.f42238a = tokenListFragment;
        }

        public void afterTextChanged(Editable editable) {
            this.f42238a.mo57853B().mo60968o(String.valueOf(editable));
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public TokenListFragment() {
        TokenListFragment$addNewTokensViewModel$2 tokenListFragment$addNewTokensViewModel$2 = new TokenListFragment$addNewTokensViewModel$2(this);
        ef3 b = C6169a.m47233b(LazyThreadSafetyMode.NONE, new TokenListFragment$special$$inlined$viewModels$default$2(new TokenListFragment$special$$inlined$viewModels$default$1(this)));
        this.f42233k = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(AddNewTokensViewModel.class), new TokenListFragment$special$$inlined$viewModels$default$3(b), new TokenListFragment$special$$inlined$viewModels$default$4((pc2) null, b), tokenListFragment$addNewTokensViewModel$2);
    }

    /* renamed from: G */
    public static final void m67483G(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: H */
    public static final void m67484H(TokenListFragment tokenListFragment, View view) {
        vx2.m53591g(tokenListFragment, "this$0");
        tokenListFragment.mo50752i();
    }

    /* renamed from: I */
    public static final boolean m67485I(ab2 ab2, TextView textView, int i, KeyEvent keyEvent) {
        vx2.m53591g(ab2, "$this_apply");
        if (i == 6) {
            ab2.f20881c.f34626b.clearFocus();
        }
        return false;
    }

    /* renamed from: J */
    public static final void m67486J(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: B */
    public final AddNewTokensViewModel mo57853B() {
        return (AddNewTokensViewModel) this.f42233k.getValue();
    }

    /* renamed from: C */
    public final void mo57854C(PaymentMethod paymentMethod, String str, int i) {
        if (!this.f42237y) {
            this.f42237y = true;
            mo57855D().mo61228j(paymentMethod, str, i, mo57856E(), new TokenListFragment$getCheckoutUrl$1(this), new TokenListFragment$getCheckoutUrl$2(this));
        }
    }

    /* renamed from: D */
    public final HomeViewModel mo57855D() {
        return (HomeViewModel) this.f42234r.getValue();
    }

    /* renamed from: E */
    public final boolean mo57856E() {
        return ((Boolean) this.f42232A.getValue()).booleanValue();
    }

    /* renamed from: F */
    public final void mo57857F() {
        mo57853B().mo60968o("");
        ab2 ab2 = this.f42235s;
        if (ab2 != null) {
            mo57853B().mo60964k().observe(getViewLifecycleOwner(), new pr6(new TokenListFragment$loadTokens$1$1(ab2, this)));
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        vx2.m53591g(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_token_list, viewGroup, false);
    }

    public void onResume() {
        super.onResume();
        if (this.f42236x) {
            this.f42236x = false;
            a77.m55424b(requireActivity(), Boolean.FALSE);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        un5 un5;
        TextInputEditText textInputEditText;
        vx2.m53591g(view, "view");
        super.onViewCreated(view, bundle);
        ab2 a = ab2.m31767a(view);
        this.f42235s = a;
        if (a != null) {
            a.f20882d.f21125c.setOnClickListener(new mr6(this));
            if (mo57856E()) {
                a.f20882d.f21127e.setText(getResources().getText(R.string.screen_title_purchase_tokens));
            } else {
                a.f20882d.f21127e.setText(getResources().getText(R.string.screen_title_sell_tokens));
            }
            a.f20880b.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
            TextInputEditText textInputEditText2 = a.f20881c.f34626b;
            vx2.m53590f(textInputEditText2, "searchBar.etSearch");
            textInputEditText2.addTextChangedListener(new C8486b(this));
            a.f20881c.f34626b.setOnEditorActionListener(new nr6(a));
            a.f20881c.f34626b.clearFocus();
        }
        mo57855D().mo61232n().observe(getViewLifecycleOwner(), new or6(new TokenListFragment$onViewCreated$2(this)));
        ab2 ab2 = this.f42235s;
        if (ab2 != null && (un5 = ab2.f20881c) != null && (textInputEditText = un5.f34626b) != null) {
            textInputEditText.clearFocus();
        }
    }
}
