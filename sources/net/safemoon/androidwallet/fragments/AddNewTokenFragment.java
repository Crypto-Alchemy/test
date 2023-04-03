package net.safemoon.androidwallet.fragments;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputEditText;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.C6169a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.adapter.touchHelper.RecyclerTouchListener;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.dialogs.ProgressLoading;
import net.safemoon.androidwallet.fragments.common.BaseMainFragment;
import net.safemoon.androidwallet.utils.Common;
import net.safemoon.androidwallet.viewmodels.AddNewTokensViewModel;
import net.safemoon.androidwallet.viewmodels.CustomContractTokenViewModel;
import net.safemoon.androidwallet.viewmodels.HomeViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b:\u0010;J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001e\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J&\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\u001a\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016R\u0014\u0010\u001a\u001a\u00020\u00178\u0002XD¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001b\u0010$\u001a\u00020\u001f8BX\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0018\u0010(\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010+\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u001b\u00104\u001a\u0002008BX\u0002¢\u0006\f\n\u0004\b1\u0010!\u001a\u0004\b2\u00103R\u001b\u00109\u001a\u0002058BX\u0002¢\u0006\f\n\u0004\b6\u0010!\u001a\u0004\b7\u00108¨\u0006<"}, mo44877d2 = {"Lnet/safemoon/androidwallet/fragments/AddNewTokenFragment;", "Lnet/safemoon/androidwallet/fragments/common/BaseMainFragment;", "Lr37;", "P", "Lnet/safemoon/androidwallet/adapter/touchHelper/RecyclerTouchListener;", "touchListener", "", "Lvc;", "items", "O", "V", "U", "a0", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "onViewCreated", "", "k", "I", "ZERO_SIZE", "Lc92;", "r", "Lc92;", "binding", "Lnet/safemoon/androidwallet/viewmodels/HomeViewModel;", "s", "Lef3;", "N", "()Lnet/safemoon/androidwallet/viewmodels/HomeViewModel;", "homeViewModel", "Lyc;", "x", "Lyc;", "addNewTokensAdapter", "y", "Lnet/safemoon/androidwallet/adapter/touchHelper/RecyclerTouchListener;", "recyclerTouchListener", "Lnet/safemoon/androidwallet/dialogs/ProgressLoading;", "A", "Lnet/safemoon/androidwallet/dialogs/ProgressLoading;", "loader", "Lnet/safemoon/androidwallet/viewmodels/AddNewTokensViewModel;", "B", "L", "()Lnet/safemoon/androidwallet/viewmodels/AddNewTokensViewModel;", "addNewTokensViewModel", "Lnet/safemoon/androidwallet/viewmodels/CustomContractTokenViewModel;", "C", "M", "()Lnet/safemoon/androidwallet/viewmodels/CustomContractTokenViewModel;", "customContractTokenViewModel", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: AddNewTokenFragment.kt */
public final class AddNewTokenFragment extends BaseMainFragment {

    /* renamed from: A */
    public ProgressLoading f41871A;

    /* renamed from: B */
    public final ef3 f41872B;

    /* renamed from: C */
    public final ef3 f41873C;

    /* renamed from: k */
    public final int f41874k;

    /* renamed from: r */
    public c92 f41875r;

    /* renamed from: s */
    public final ef3 f41876s = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(HomeViewModel.class), new C8356x4d0fb000(this), new C8357x4d0fb001((pc2) null, this), new C8358x4d0fb002(this));

    /* renamed from: x */
    public C9633yc f41877x;

    /* renamed from: y */
    public RecyclerTouchListener f41878y;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J*\u0010\f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016J*\u0010\u000e\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000f"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/AddNewTokenFragment$a", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "Lr37;", "afterTextChanged", "", "text", "", "start", "count", "after", "beforeTextChanged", "before", "onTextChanged", "core-ktx_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.AddNewTokenFragment$a */
    /* compiled from: TextView.kt */
    public static final class C8355a implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ AddNewTokenFragment f41879a;

        public C8355a(AddNewTokenFragment addNewTokenFragment) {
            this.f41879a = addNewTokenFragment;
        }

        public void afterTextChanged(Editable editable) {
            this.f41879a.mo57405L().mo60968o(String.valueOf(editable));
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public AddNewTokenFragment() {
        AddNewTokenFragment$addNewTokensViewModel$2 addNewTokenFragment$addNewTokensViewModel$2 = new AddNewTokenFragment$addNewTokensViewModel$2(this);
        AddNewTokenFragment$special$$inlined$viewModels$default$1 addNewTokenFragment$special$$inlined$viewModels$default$1 = new AddNewTokenFragment$special$$inlined$viewModels$default$1(this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        ef3 b = C6169a.m47233b(lazyThreadSafetyMode, new AddNewTokenFragment$special$$inlined$viewModels$default$2(addNewTokenFragment$special$$inlined$viewModels$default$1));
        this.f41872B = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(AddNewTokensViewModel.class), new AddNewTokenFragment$special$$inlined$viewModels$default$3(b), new AddNewTokenFragment$special$$inlined$viewModels$default$4((pc2) null, b), addNewTokenFragment$addNewTokensViewModel$2);
        AddNewTokenFragment$customContractTokenViewModel$2 addNewTokenFragment$customContractTokenViewModel$2 = new AddNewTokenFragment$customContractTokenViewModel$2(this);
        ef3 b2 = C6169a.m47233b(lazyThreadSafetyMode, new AddNewTokenFragment$special$$inlined$viewModels$default$7(new AddNewTokenFragment$special$$inlined$viewModels$default$6(this)));
        this.f41873C = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(CustomContractTokenViewModel.class), new AddNewTokenFragment$special$$inlined$viewModels$default$8(b2), new AddNewTokenFragment$special$$inlined$viewModels$default$9((pc2) null, b2), addNewTokenFragment$customContractTokenViewModel$2);
    }

    /* renamed from: Q */
    public static final void m66409Q(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: R */
    public static final void m66410R(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: S */
    public static final void m66411S(AddNewTokenFragment addNewTokenFragment, View view) {
        vx2.m53591g(addNewTokenFragment, "this$0");
        j44 a = C9395uc.m72693a();
        vx2.m53590f(a, "actionAddNewTokenFragmen…dCustomContractFragment()");
        addNewTokenFragment.mo50753j(a);
    }

    /* renamed from: T */
    public static final void m66412T(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: W */
    public static final void m66413W(AddNewTokenFragment addNewTokenFragment, int i, int i2) {
        C9449vc vcVar;
        ArrayList<C9449vc> d;
        RecyclerTouchListener recyclerTouchListener;
        vx2.m53591g(addNewTokenFragment, "this$0");
        if (i == R.id.btnDelete) {
            C9633yc ycVar = addNewTokenFragment.f41877x;
            if (ycVar != null) {
                vcVar = ycVar.mo67056c(i2);
            } else {
                vcVar = null;
            }
            if (vcVar != null && Common.f42577a.mo60915v(vcVar.mo66476h())) {
                addNewTokenFragment.mo57405L().mo60970q(vcVar);
                addNewTokenFragment.mo57405L().mo60967n(vcVar, false);
                addNewTokenFragment.mo57406M().mo61155n(vcVar.mo66476h());
                C9633yc ycVar2 = addNewTokenFragment.f41877x;
                if (ycVar2 != null) {
                    ycVar2.removeItem(i2);
                }
                C9633yc ycVar3 = addNewTokenFragment.f41877x;
                if (ycVar3 != null && (d = ycVar3.mo67057d()) != null && (recyclerTouchListener = addNewTokenFragment.f41878y) != null) {
                    vx2.m53588d(recyclerTouchListener);
                    addNewTokenFragment.mo57408O(recyclerTouchListener, d);
                }
            }
        }
    }

    /* renamed from: X */
    public static final void m66414X(c92 c92, AddNewTokenFragment addNewTokenFragment) {
        vx2.m53591g(c92, "$this_apply");
        vx2.m53591g(addNewTokenFragment, "this$0");
        c92.f21631d.setRefreshing(false);
        addNewTokenFragment.mo57410U();
    }

    /* renamed from: Y */
    public static final void m66415Y(AddNewTokenFragment addNewTokenFragment, View view) {
        vx2.m53591g(addNewTokenFragment, "this$0");
        addNewTokenFragment.mo57410U();
    }

    /* renamed from: Z */
    public static final void m66416Z(AddNewTokenFragment addNewTokenFragment, View view) {
        vx2.m53591g(addNewTokenFragment, "this$0");
        addNewTokenFragment.mo50752i();
    }

    /* renamed from: b0 */
    public static final void m66417b0(AddNewTokenFragment addNewTokenFragment) {
        ProgressLoading progressLoading;
        vx2.m53591g(addNewTokenFragment, "this$0");
        if (addNewTokenFragment.isVisible() && (progressLoading = addNewTokenFragment.f41871A) != null) {
            progressLoading.mo22266k();
        }
    }

    /* renamed from: L */
    public final AddNewTokensViewModel mo57405L() {
        return (AddNewTokensViewModel) this.f41872B.getValue();
    }

    /* renamed from: M */
    public final CustomContractTokenViewModel mo57406M() {
        return (CustomContractTokenViewModel) this.f41873C.getValue();
    }

    /* renamed from: N */
    public final HomeViewModel mo57407N() {
        return (HomeViewModel) this.f41876s.getValue();
    }

    /* renamed from: O */
    public final void mo57408O(RecyclerTouchListener recyclerTouchListener, List<C9449vc> list) {
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!Common.f42577a.mo60915v(list.get(i).mo66476h())) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (arrayList.size() > this.f41874k) {
            Integer[] numArr = (Integer[]) arrayList.toArray(new Integer[0]);
            recyclerTouchListener.mo57038z((Integer[]) Arrays.copyOf(numArr, numArr.length));
            return;
        }
        recyclerTouchListener.mo57038z(new Integer[0]);
    }

    /* renamed from: P */
    public final void mo57409P() {
        mo57407N().mo61235q().observe(getViewLifecycleOwner(), new C9307sc(new AddNewTokenFragment$observeViewModel$1(this)));
        mo57405L().mo60964k().observe(getViewLifecycleOwner(), new C9340tc(new AddNewTokenFragment$observeViewModel$2(this)));
    }

    /* renamed from: U */
    public final void mo57410U() {
        mo57405L().mo60969p();
        mo57412a0();
    }

    /* renamed from: V */
    public final void mo57411V() {
        int i;
        c92 c92 = this.f41875r;
        c92 c922 = null;
        if (c92 == null) {
            vx2.m53605u("binding");
            c92 = null;
        }
        c92.f21631d.setOnRefreshListener(new C9023oc(c92, this));
        c92.f21632e.f34319e.setVisibility(0);
        c92.f21632e.f34319e.setOnClickListener(new C9176pc(this));
        c92 c923 = this.f41875r;
        if (c923 == null) {
            vx2.m53605u("binding");
            c923 = null;
        }
        c923.f21632e.f34318d.setOnClickListener(new C9209qc(this));
        c92 c924 = this.f41875r;
        if (c924 == null) {
            vx2.m53605u("binding");
            c924 = null;
        }
        TextView textView = c924.f21632e.f34320f;
        Context requireContext = requireContext();
        vx2.m53590f(requireContext, "requireContext()");
        if (ol0.m70355e(requireContext) == TokenType.MULTI_COIN) {
            i = R.string.add_new_coins_screen_title;
        } else {
            i = R.string.add_new_tokens_screen_title;
        }
        textView.setText(i);
        c92 c925 = this.f41875r;
        if (c925 == null) {
            vx2.m53605u("binding");
            c925 = null;
        }
        c925.f21630c.f34980b.setText("");
        c92 c926 = this.f41875r;
        if (c926 == null) {
            vx2.m53605u("binding");
            c926 = null;
        }
        TextInputEditText textInputEditText = c926.f21630c.f34980b;
        vx2.m53590f(textInputEditText, "binding.searchBar.etSearch");
        textInputEditText.addTextChangedListener(new C8355a(this));
        FragmentActivity requireActivity = requireActivity();
        c92 c927 = this.f41875r;
        if (c927 == null) {
            vx2.m53605u("binding");
            c927 = null;
        }
        RecyclerTouchListener recyclerTouchListener = new RecyclerTouchListener(requireActivity, c927.f21629b);
        this.f41878y = recyclerTouchListener;
        vx2.m53588d(recyclerTouchListener);
        recyclerTouchListener.mo57036x(Integer.valueOf(R.id.btnDelete)).mo57037y(R.id.rowFG, R.id.rowBG, new C9243rc(this));
        c92 c928 = this.f41875r;
        if (c928 == null) {
            vx2.m53605u("binding");
        } else {
            c922 = c928;
        }
        RecyclerView recyclerView = c922.f21629b;
        RecyclerTouchListener recyclerTouchListener2 = this.f41878y;
        vx2.m53588d(recyclerTouchListener2);
        recyclerView.mo9079k(recyclerTouchListener2);
    }

    /* renamed from: a0 */
    public final void mo57412a0() {
        ProgressLoading.C8308a aVar = ProgressLoading.f41785Y;
        String string = getString(R.string.loading);
        vx2.m53590f(string, "getString(R.string.loading)");
        ProgressLoading a = aVar.mo57297a(false, string, "");
        this.f41871A = a;
        if (a != null) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            vx2.m53590f(childFragmentManager, "childFragmentManager");
            a.mo57295D(childFragmentManager);
        }
        new Handler(Looper.getMainLooper()).postDelayed(new C7932nc(this), 2000);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        vx2.m53591g(layoutInflater, "inflater");
        c92 a = c92.m32871a(layoutInflater.inflate(R.layout.fragment_add_new_token, viewGroup, false));
        vx2.m53590f(a, "bind(\n            inflat…ntainer, false)\n        )");
        this.f41875r = a;
        if (a == null) {
            vx2.m53605u("binding");
            a = null;
        }
        return a.mo29895b();
    }

    public void onViewCreated(View view, Bundle bundle) {
        vx2.m53591g(view, "view");
        super.onViewCreated(view, bundle);
        c92 c92 = this.f41875r;
        if (c92 == null) {
            vx2.m53605u("binding");
            c92 = null;
        }
        c92.f21632e.f34317c.setOnClickListener(new C7826lc(this));
        mo57407N().mo61232n().observe(getViewLifecycleOwner(), new C7900mc(new AddNewTokenFragment$onViewCreated$2(this)));
    }
}
