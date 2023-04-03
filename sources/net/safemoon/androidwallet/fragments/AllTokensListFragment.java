package net.safemoon.androidwallet.fragments;

import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C0729l;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.creageek.segmentedbutton.SegmentedButton;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.common.ActiveTokenListMode;
import net.safemoon.androidwallet.fragments.common.BaseMainFragment;
import net.safemoon.androidwallet.viewmodels.HomeViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\bW\u0010XJ&\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\tH\u0016J\u001a\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\u0010\u001a\u00020\fH\u0002J\b\u0010\u0011\u001a\u00020\fH\u0002J\b\u0010\u0012\u001a\u00020\fH\u0002J\b\u0010\u0013\u001a\u00020\fH\u0002J\u001c\u0010\u0018\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002J\u0012\u0010\u0019\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002J\u0012\u0010\u001a\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002J\u0012\u0010\u001b\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002J\b\u0010\u001c\u001a\u00020\fH\u0002J\b\u0010\u001d\u001a\u00020\fH\u0002R\u0014\u0010 \u001a\u00020\u00168\u0002XD¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00168\u0002XD¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u0014\u0010$\u001a\u00020\u00168\u0002XD¢\u0006\u0006\n\u0004\b#\u0010\u001fR\u0018\u0010'\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010)\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b(\u0010&R\u0018\u0010+\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b*\u0010&R\u0018\u0010-\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b,\u0010&R\u0018\u0010/\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b.\u0010&R\u0018\u00100\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010&R\u0018\u00102\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b1\u0010&R\u0018\u00106\u001a\u0004\u0018\u0001038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u0010:\u001a\u0004\u0018\u0001078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010=\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010<R\u0018\u0010@\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010?R\u0016\u0010B\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bA\u0010\u001fR\u0016\u0010D\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bC\u0010\u001fR\u0016\u0010F\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bE\u0010\u001fR\u0016\u0010J\u001a\u00020G8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u001b\u0010P\u001a\u00020K8BX\u0002¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\"\u0010V\u001a\u00020\u00168\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bQ\u0010\u001f\u001a\u0004\bR\u0010S\"\u0004\bT\u0010U¨\u0006Y"}, mo44877d2 = {"Lnet/safemoon/androidwallet/fragments/AllTokensListFragment;", "Lnet/safemoon/androidwallet/fragments/common/BaseMainFragment;", "Landroid/view/View$OnClickListener;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "v", "Lr37;", "onClick", "view", "onViewCreated", "H", "J", "N", "S", "Landroid/widget/TextView;", "selected", "", "title", "O", "R", "P", "Q", "G", "T", "k", "Ljava/lang/String;", "VALUE_1h", "r", "VALUE_24h", "s", "VALUE_7d", "x", "Landroid/widget/TextView;", "btnRecent", "y", "btnTopGainers", "A", "btnTopLosers", "B", "btn1h", "C", "btn24h", "btn7d", "I", "tvTitle", "Lnet/safemoon/androidwallet/viewmodels/HomeViewModel;", "L", "Lnet/safemoon/androidwallet/viewmodels/HomeViewModel;", "homeViewModel", "Ld92;", "M", "Ld92;", "binding", "Landroidx/recyclerview/widget/RecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Lgw0;", "Lgw0;", "cryptoLPagingAdapter", "U", "valueSort", "X", "valueSortDir", "Y", "SORT_ASC", "Lnet/safemoon/androidwallet/common/ActiveTokenListMode;", "Z", "Lnet/safemoon/androidwallet/common/ActiveTokenListMode;", "activeTokenListMode", "Lob4;", "e0", "Lef3;", "E", "()Lob4;", "notificationHistoryViewModel", "k0", "F", "()Ljava/lang/String;", "setTmpValueSortFroGainAndLoser", "(Ljava/lang/String;)V", "tmpValueSortFroGainAndLoser", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: AllTokensListFragment.kt */
public final class AllTokensListFragment extends BaseMainFragment implements View.OnClickListener {

    /* renamed from: A */
    public TextView f41881A;

    /* renamed from: B */
    public TextView f41882B;

    /* renamed from: C */
    public TextView f41883C;

    /* renamed from: H */
    public TextView f41884H;

    /* renamed from: I */
    public TextView f41885I;

    /* renamed from: L */
    public HomeViewModel f41886L;

    /* renamed from: M */
    public d92 f41887M;

    /* renamed from: P */
    public RecyclerView f41888P;

    /* renamed from: Q */
    public gw0 f41889Q;

    /* renamed from: U */
    public String f41890U = "24h";

    /* renamed from: X */
    public String f41891X = "desc";

    /* renamed from: Y */
    public String f41892Y = "asc";

    /* renamed from: Z */
    public ActiveTokenListMode f41893Z = ActiveTokenListMode.GAINER;

    /* renamed from: e0 */
    public final ef3 f41894e0 = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(ob4.class), new C8363x99d5b89f(this), new C8364x99d5b8a0((pc2) null, this), new C8365x99d5b8a1(this));

    /* renamed from: k */
    public final String f41895k = "1h";

    /* renamed from: k0 */
    public String f41896k0 = "24h";

    /* renamed from: r */
    public final String f41897r = "24h";

    /* renamed from: s */
    public final String f41898s = "7d";

    /* renamed from: x */
    public TextView f41899x;

    /* renamed from: y */
    public TextView f41900y;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/AllTokensListFragment$a", "Lbp1;", "Landroid/text/Editable;", "p0", "Lr37;", "afterTextChanged", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.AllTokensListFragment$a */
    /* compiled from: AllTokensListFragment.kt */
    public static final class C8361a extends bp1 {

        /* renamed from: a */
        public final /* synthetic */ AllTokensListFragment f41901a;

        public C8361a(AllTokensListFragment allTokensListFragment) {
            this.f41901a = allTokensListFragment;
        }

        public void afterTextChanged(Editable editable) {
            String str;
            HomeViewModel y = this.f41901a.f41886L;
            if (y != null) {
                if (editable == null || (str = editable.toString()) == null) {
                    str = "";
                }
                y.mo61239u(str);
            }
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/AllTokensListFragment$b", "Landroidx/recyclerview/widget/RecyclerView$i;", "", "positionStart", "itemCount", "Lr37;", "onItemRangeInserted", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.AllTokensListFragment$b */
    /* compiled from: AllTokensListFragment.kt */
    public static final class C8362b extends RecyclerView.C1239i {

        /* renamed from: a */
        public final /* synthetic */ AllTokensListFragment f41902a;

        public C8362b(AllTokensListFragment allTokensListFragment) {
            this.f41902a = allTokensListFragment;
        }

        public void onItemRangeInserted(int i, int i2) {
            RecyclerView z;
            RecyclerView.LayoutManager layoutManager;
            super.onItemRangeInserted(i, i2);
            if (i == 0 && (z = this.f41902a.f41888P) != null && (layoutManager = z.getLayoutManager()) != null) {
                layoutManager.mo8881G1(0);
            }
        }
    }

    /* renamed from: I */
    public static final void m66440I(AllTokensListFragment allTokensListFragment) {
        vx2.m53591g(allTokensListFragment, "this$0");
        allTokensListFragment.mo57431S();
    }

    /* renamed from: K */
    public static final void m66441K(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: L */
    public static final void m66442L(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: M */
    public static final void m66443M(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: E */
    public final ob4 mo57421E() {
        return (ob4) this.f41894e0.getValue();
    }

    /* renamed from: F */
    public final String mo57422F() {
        return this.f41896k0;
    }

    /* renamed from: G */
    public final void mo57423G() {
        LinearLayout linearLayout;
        d92 d92 = this.f41887M;
        if (d92 != null) {
            linearLayout = d92.f28061k;
        } else {
            linearLayout = null;
        }
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
    }

    /* renamed from: H */
    public final void mo57424H() {
        this.f41889Q = new gw0(new AllTokensListFragment$initRecyclerView$1(this));
        RecyclerView recyclerView = this.f41888P;
        vx2.m53588d(recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), 1, false));
        RecyclerView recyclerView2 = this.f41888P;
        vx2.m53588d(recyclerView2);
        recyclerView2.setAdapter(this.f41889Q);
        d92 d92 = this.f41887M;
        vx2.m53588d(d92);
        d92.f28060j.setOnRefreshListener(new C7342kf(this));
        gw0 gw0 = this.f41889Q;
        vx2.m53588d(gw0);
        gw0.mo8736b(new AllTokensListFragment$initRecyclerView$3(this));
    }

    /* renamed from: J */
    public final void mo57425J() {
        HomeViewModel homeViewModel = this.f41886L;
        vx2.m53588d(homeViewModel);
        homeViewModel.mo61224f().observe(getViewLifecycleOwner(), new C7172hf(new AllTokensListFragment$observeViewModel$1(this)));
        HomeViewModel homeViewModel2 = this.f41886L;
        vx2.m53588d(homeViewModel2);
        homeViewModel2.mo61223e().observe(getViewLifecycleOwner(), new C7213if(new AllTokensListFragment$observeViewModel$2(this)));
        mo57426N();
        ug3 viewLifecycleOwner = getViewLifecycleOwner();
        vx2.m53590f(viewLifecycleOwner, "viewLifecycleOwner");
        vg3.m28804a(viewLifecycleOwner).mo6301b(new AllTokensListFragment$observeViewModel$3(this, (ns0<? super AllTokensListFragment$observeViewModel$3>) null));
    }

    /* renamed from: N */
    public final void mo57426N() {
        gw0 gw0 = this.f41889Q;
        vx2.m53588d(gw0);
        gw0.registerAdapterDataObserver(new C8362b(this));
    }

    /* renamed from: O */
    public final void mo57427O(TextView textView, String str) {
        if (getActivity() != null) {
            TextView textView2 = this.f41899x;
            vx2.m53588d(textView2);
            textView2.setBackgroundResource(R.drawable.white_bg_badge);
            TextView textView3 = this.f41881A;
            vx2.m53588d(textView3);
            textView3.setBackgroundResource(R.drawable.white_bg_badge);
            TextView textView4 = this.f41900y;
            vx2.m53588d(textView4);
            textView4.setBackgroundResource(R.drawable.white_bg_badge);
            vx2.m53588d(textView);
            textView.setBackgroundResource(R.drawable.primary_bg_baged);
            TextView textView5 = this.f41885I;
            vx2.m53588d(textView5);
            textView5.setText(str);
        }
    }

    /* renamed from: P */
    public final void mo57428P(TextView textView) {
        if (getActivity() != null) {
            TextView textView2 = this.f41882B;
            vx2.m53588d(textView2);
            textView2.setBackgroundResource(R.drawable.white_bg_badge);
            TextView textView3 = this.f41883C;
            vx2.m53588d(textView3);
            textView3.setBackgroundResource(R.drawable.white_bg_badge);
            TextView textView4 = this.f41884H;
            vx2.m53588d(textView4);
            textView4.setBackgroundResource(R.drawable.white_bg_badge);
            vx2.m53588d(textView);
            textView.setBackgroundResource(R.drawable.primary_bg_baged);
        }
    }

    /* renamed from: Q */
    public final void mo57429Q(TextView textView) {
        TextView textView2 = this.f41882B;
        vx2.m53588d(textView2);
        textView2.setTextColor(zr0.m31440c(requireContext(), R.color.t1));
        TextView textView3 = this.f41883C;
        vx2.m53588d(textView3);
        textView3.setTextColor(zr0.m31440c(requireContext(), R.color.t1));
        TextView textView4 = this.f41884H;
        vx2.m53588d(textView4);
        textView4.setTextColor(zr0.m31440c(requireContext(), R.color.t1));
        vx2.m53588d(textView);
        textView.setTextColor(zr0.m31440c(requireContext(), R.color.white));
    }

    /* renamed from: R */
    public final void mo57430R(TextView textView) {
        TextView textView2 = this.f41899x;
        vx2.m53588d(textView2);
        textView2.setTextColor(zr0.m31440c(requireContext(), R.color.t1));
        TextView textView3 = this.f41900y;
        vx2.m53588d(textView3);
        textView3.setTextColor(zr0.m31440c(requireContext(), R.color.t1));
        TextView textView4 = this.f41881A;
        vx2.m53588d(textView4);
        textView4.setTextColor(zr0.m31440c(requireContext(), R.color.t1));
        vx2.m53588d(textView);
        textView.setTextColor(zr0.m31440c(requireContext(), R.color.white));
    }

    /* renamed from: S */
    public final void mo57431S() {
        HomeViewModel homeViewModel = this.f41886L;
        vx2.m53588d(homeViewModel);
        homeViewModel.mo61238t(this.f41891X, this.f41890U, this.f41893Z);
    }

    /* renamed from: T */
    public final void mo57432T() {
        LinearLayout linearLayout;
        d92 d92 = this.f41887M;
        if (d92 != null) {
            linearLayout = d92.f28061k;
        } else {
            linearLayout = null;
        }
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
    }

    public void onClick(View view) {
        vx2.m53591g(view, "v");
        switch (view.getId()) {
            case R.id.btn1h:
                mo57428P(this.f41882B);
                mo57429Q(this.f41882B);
                String str = this.f41895k;
                this.f41896k0 = str;
                this.f41890U = str;
                mo57431S();
                return;
            case R.id.btn24h:
                mo57428P(this.f41883C);
                mo57429Q(this.f41883C);
                String str2 = this.f41897r;
                this.f41896k0 = str2;
                this.f41890U = str2;
                mo57431S();
                return;
            case R.id.btn7d:
                mo57428P(this.f41884H);
                mo57429Q(this.f41884H);
                String str3 = this.f41898s;
                this.f41896k0 = str3;
                this.f41890U = str3;
                mo57431S();
                return;
            case R.id.btnRecent:
                mo57427O(this.f41899x, getResources().getString(R.string.recently_added));
                mo57430R(this.f41899x);
                mo57423G();
                this.f41891X = this.f41891X;
                this.f41890U = "date_added";
                this.f41893Z = ActiveTokenListMode.RECENT;
                mo57431S();
                return;
            case R.id.btnTopGainers:
                mo57427O(this.f41900y, getResources().getString(R.string.top_gainers));
                mo57430R(this.f41900y);
                mo57432T();
                this.f41891X = this.f41891X;
                this.f41890U = this.f41896k0;
                this.f41893Z = ActiveTokenListMode.GAINER;
                mo57431S();
                return;
            case R.id.btnTopLosers:
                mo57427O(this.f41881A, getResources().getString(R.string.top_losers));
                mo57430R(this.f41881A);
                mo57432T();
                this.f41891X = this.f41892Y;
                this.f41890U = this.f41896k0;
                this.f41893Z = ActiveTokenListMode.LOSER;
                mo57431S();
                return;
            case R.id.ivNotification:
                j44 b = C7829lf.m63807b();
                vx2.m53590f(b, "actionAllTokensListFragm…ficationHistoryFragment()");
                mo50753j(b);
                return;
            case R.id.ivTokenList:
                j44 a = C7829lf.m63806a();
                vx2.m53590f(a, "actionAllTokensListFragm…tToMyTokensListFragment()");
                mo50753j(a);
                return;
            default:
                return;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        vx2.m53591g(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_alltokens_list, viewGroup, false);
        FragmentActivity requireActivity = requireActivity();
        vx2.m53590f(requireActivity, "requireActivity()");
        this.f41886L = (HomeViewModel) new C0729l(requireActivity).mo6421a(HomeViewModel.class);
        d92 a = d92.m43412a(inflate);
        this.f41887M = a;
        vx2.m53588d(a);
        a.f28062l.f29300d.setVisibility(4);
        d92 d92 = this.f41887M;
        vx2.m53588d(d92);
        d92.f28062l.f29307k.setVisibility(4);
        d92 d922 = this.f41887M;
        vx2.m53588d(d922);
        d922.f28062l.f29305i.setChecked(false);
        this.f41885I = (TextView) inflate.findViewById(R.id.tv_title);
        this.f41888P = (RecyclerView) inflate.findViewById(R.id.rView);
        this.f41899x = (TextView) inflate.findViewById(R.id.btnRecent);
        this.f41900y = (TextView) inflate.findViewById(R.id.btnTopGainers);
        this.f41881A = (TextView) inflate.findViewById(R.id.btnTopLosers);
        this.f41882B = (TextView) inflate.findViewById(R.id.btn1h);
        this.f41883C = (TextView) inflate.findViewById(R.id.btn24h);
        this.f41884H = (TextView) inflate.findViewById(R.id.btn7d);
        TextView textView = this.f41899x;
        vx2.m53588d(textView);
        textView.setOnClickListener(this);
        TextView textView2 = this.f41900y;
        vx2.m53588d(textView2);
        textView2.setOnClickListener(this);
        TextView textView3 = this.f41881A;
        vx2.m53588d(textView3);
        textView3.setOnClickListener(this);
        TextView textView4 = this.f41882B;
        vx2.m53588d(textView4);
        textView4.setOnClickListener(this);
        TextView textView5 = this.f41883C;
        vx2.m53588d(textView5);
        textView5.setOnClickListener(this);
        TextView textView6 = this.f41884H;
        vx2.m53588d(textView6);
        textView6.setOnClickListener(this);
        View findViewById = inflate.findViewById(R.id.ivTokenList);
        if (findViewById != null) {
            findViewById.setOnClickListener(this);
        }
        View findViewById2 = inflate.findViewById(R.id.ivNotification);
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(this);
        }
        mo57424H();
        mo57431S();
        HomeViewModel homeViewModel = this.f41886L;
        if (homeViewModel != null) {
            homeViewModel.mo61239u("");
        }
        d92 d923 = this.f41887M;
        vx2.m53588d(d923);
        d923.f28059i.f34980b.addTextChangedListener(new vo6(new C8361a(this), 0, 2, (DefaultConstructorMarker) null));
        mo57421E().mo62867g().observe(getViewLifecycleOwner(), new C7262jf(new AllTokensListFragment$onCreateView$2(this)));
        return inflate;
    }

    public void onViewCreated(View view, Bundle bundle) {
        vx2.m53591g(view, "view");
        super.onViewCreated(view, bundle);
        d92 d92 = this.f41887M;
        vx2.m53588d(d92);
        SegmentedButton segmentedButton = d92.f28062l.f29306j;
        vx2.m53590f(segmentedButton, "binding!!.topBar.segmentedGroup");
        mo58057q(segmentedButton);
        mo57425J();
    }
}
