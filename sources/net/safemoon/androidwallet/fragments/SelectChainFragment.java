package net.safemoon.androidwallet.fragments;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.navigation.NavBackStackEntry;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.textfield.TextInputEditText;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C6169a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.text.StringsKt__StringsKt;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.fragments.common.BaseMainFragment;
import net.safemoon.androidwallet.model.MyTokenType;
import net.safemoon.androidwallet.model.arguments.TokenTypes;
import net.safemoon.androidwallet.utils.Common;
import net.safemoon.androidwallet.viewmodels.SelectedChainViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b \u0010!J&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\r\u001a\u00020\u000bH\u0002R$\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, mo44877d2 = {"Lnet/safemoon/androidwallet/fragments/SelectChainFragment;", "Lnet/safemoon/androidwallet/fragments/common/BaseMainFragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "Lr37;", "onViewCreated", "w", "Loa2;", "k", "Loa2;", "getBinding", "()Loa2;", "setBinding", "(Loa2;)V", "binding", "Lht5;", "r", "Lht5;", "selectChainAdapter", "Lnet/safemoon/androidwallet/viewmodels/SelectedChainViewModel;", "s", "Lef3;", "v", "()Lnet/safemoon/androidwallet/viewmodels/SelectedChainViewModel;", "selectedChainViewModel", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: SelectChainFragment.kt */
public class SelectChainFragment extends BaseMainFragment {

    /* renamed from: k */
    public oa2 f42076k;

    /* renamed from: r */
    public ht5 f42077r;

    /* renamed from: s */
    public final ef3 f42078s;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J*\u0010\f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016J*\u0010\u000e\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000f"}, mo44877d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "Lr37;", "afterTextChanged", "", "text", "", "start", "count", "after", "beforeTextChanged", "before", "onTextChanged", "core-ktx_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.SelectChainFragment$a */
    /* compiled from: TextView.kt */
    public static final class C8440a implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ SelectChainFragment f42079a;

        public C8440a(SelectChainFragment selectChainFragment) {
            this.f42079a = selectChainFragment;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            String str;
            String obj;
            k04<String> k = this.f42079a.mo57634v().mo61394k();
            if (charSequence == null || (obj = charSequence.toString()) == null) {
                str = null;
            } else {
                str = StringsKt__StringsKt.m63090V0(obj).toString();
            }
            k.postValue(str);
        }
    }

    public SelectChainFragment() {
        ef3 b = C6169a.m47233b(LazyThreadSafetyMode.NONE, new SelectChainFragment$special$$inlined$viewModels$default$2(new SelectChainFragment$special$$inlined$viewModels$default$1(this)));
        this.f42078s = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(SelectedChainViewModel.class), new SelectChainFragment$special$$inlined$viewModels$default$3(b), new SelectChainFragment$special$$inlined$viewModels$default$4((pc2) null, b), new SelectChainFragment$special$$inlined$viewModels$default$5(this, b));
    }

    /* renamed from: x */
    public static final void m66962x(SelectChainFragment selectChainFragment, View view) {
        vx2.m53591g(selectChainFragment, "this$0");
        selectChainFragment.mo50752i();
    }

    /* renamed from: y */
    public static final void m66963y(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        vx2.m53591g(layoutInflater, "inflater");
        oa2 a = oa2.m49226a(layoutInflater.inflate(R.layout.fragment_select_chain, viewGroup, false));
        this.f42076k = a;
        if (a != null) {
            return a.mo46369b();
        }
        return null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        TokenTypes tokenTypes;
        boolean z;
        boolean z2;
        vx2.m53591g(view, "view");
        super.onViewCreated(view, bundle);
        mo57635w();
        if (requireArguments().getSerializable("selectedChain") instanceof TokenTypes) {
            Serializable serializable = requireArguments().getSerializable("selectedChain");
            vx2.m53589e(serializable, "null cannot be cast to non-null type net.safemoon.androidwallet.model.arguments.TokenTypes");
            tokenTypes = (TokenTypes) serializable;
        } else {
            tokenTypes = null;
        }
        k04<List<MyTokenType>> i = mo57634v().mo61392i();
        List<TokenType> a = Common.f42577a.mo60896a(true);
        ArrayList arrayList = new ArrayList(dk0.m43495u(a, 10));
        for (TokenType tokenType : a) {
            boolean z3 = false;
            if (tokenTypes != null) {
                if (!tokenTypes.isEmpty()) {
                    Iterator it = tokenTypes.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (tokenType == ((TokenType) it.next())) {
                            z2 = true;
                            continue;
                        } else {
                            z2 = false;
                            continue;
                        }
                        if (z2) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                if (z) {
                    z3 = true;
                }
            }
            arrayList.add(new MyTokenType(tokenType, z3));
        }
        i.postValue(CollectionsKt___CollectionsKt.m47313M0(arrayList));
        mo57634v().mo61393j().observe(getViewLifecycleOwner(), new jt5(new SelectChainFragment$onViewCreated$2(this)));
    }

    /* renamed from: v */
    public final SelectedChainViewModel mo57634v() {
        return (SelectedChainViewModel) this.f42078s.getValue();
    }

    /* renamed from: w */
    public final void mo57635w() {
        dl5 dl5;
        NavBackStackEntry H = x92.m29982a(this).mo8452H();
        if (H != null) {
            dl5 = H.mo8428i();
        } else {
            dl5 = null;
        }
        oa2 oa2 = this.f42076k;
        if (oa2 != null) {
            oa2.f32345d.f21125c.setOnClickListener(new kt5(this));
            oa2.f32345d.f21127e.setText(getText(R.string.select_chain));
            this.f42077r = new ht5(new SelectChainFragment$initView$1$2(this, dl5));
            TextInputEditText textInputEditText = oa2.f32344c.f34980b;
            vx2.m53590f(textInputEditText, "it.searchBar.etSearch");
            textInputEditText.addTextChangedListener(new C8440a(this));
            oa2.f32343b.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
            oa2.f32343b.setAdapter(this.f42077r);
        }
    }
}
