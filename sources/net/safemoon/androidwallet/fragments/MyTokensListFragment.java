package net.safemoon.androidwallet.fragments;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.recyclerview.widget.RecyclerView;
import com.creageek.segmentedbutton.SegmentedButton;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.C6169a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.adapter.touchHelper.RecyclerTouchListener;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.dialogs.AnchorSwitchWallet;
import net.safemoon.androidwallet.domain.listener.dalog.OnSelectTokenTypeClickListener;
import net.safemoon.androidwallet.fragments.common.BaseMainFragment;
import net.safemoon.androidwallet.model.wallets.Wallet;
import net.safemoon.androidwallet.p020ui.displayModel.UserTokenItemDisplayModel;
import net.safemoon.androidwallet.viewmodels.HomeViewModel;
import net.safemoon.androidwallet.viewmodels.MultiWalletViewModel;
import net.safemoon.androidwallet.viewmodels.MyTokensListViewModel;
import net.safemoon.androidwallet.views.FixedForAppBarLayoutManager;
import net.safemoon.androidwallet.views.gesture.RecyclerItemSwipeHelper;
import p000.ft4;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b=\u0010>J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\u0002H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0002J$\u0010\u0012\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\u001a\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0014\u001a\u00020\u0002H\u0016R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0002¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020$8BX\u0002¢\u0006\f\n\u0004\b%\u0010\u001b\u001a\u0004\b&\u0010'R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u00100\u001a\u00020-8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00104\u001a\u0004\u0018\u0001018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00108\u001a\u0004\u0018\u0001058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u001b\u0010<\u001a\u0002098BX\u0002¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b:\u0010;¨\u0006?"}, mo44877d2 = {"Lnet/safemoon/androidwallet/fragments/MyTokensListFragment;", "Lnet/safemoon/androidwallet/fragments/common/BaseMainFragment;", "Lr37;", "R", "S", "V", "Landroid/view/View;", "view", "c0", "T", "O", "L", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "onViewCreated", "onPause", "Lbb2;", "k", "Lbb2;", "binding", "Lnet/safemoon/androidwallet/viewmodels/MyTokensListViewModel;", "r", "Lef3;", "J", "()Lnet/safemoon/androidwallet/viewmodels/MyTokensListViewModel;", "myTokenListViewModel", "Lnet/safemoon/androidwallet/viewmodels/HomeViewModel;", "s", "H", "()Lnet/safemoon/androidwallet/viewmodels/HomeViewModel;", "homeViewModel", "Lnet/safemoon/androidwallet/viewmodels/MultiWalletViewModel;", "x", "I", "()Lnet/safemoon/androidwallet/viewmodels/MultiWalletViewModel;", "multiWalletVM", "Lf14;", "y", "Lf14;", "adapter", "Lnet/safemoon/androidwallet/views/FixedForAppBarLayoutManager;", "A", "Lnet/safemoon/androidwallet/views/FixedForAppBarLayoutManager;", "layoutManager", "Lnet/safemoon/androidwallet/domain/listener/dalog/OnSelectTokenTypeClickListener;", "B", "Lnet/safemoon/androidwallet/domain/listener/dalog/OnSelectTokenTypeClickListener;", "onSelectTokenTypeClickListener", "Lnet/safemoon/androidwallet/adapter/touchHelper/RecyclerTouchListener;", "C", "Lnet/safemoon/androidwallet/adapter/touchHelper/RecyclerTouchListener;", "itemTouchListener", "Lob4;", "K", "()Lob4;", "notificationHistoryViewModel", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: MyTokensListFragment.kt */
public final class MyTokensListFragment extends BaseMainFragment {

    /* renamed from: A */
    public FixedForAppBarLayoutManager f41976A;

    /* renamed from: B */
    public OnSelectTokenTypeClickListener f41977B;

    /* renamed from: C */
    public RecyclerTouchListener f41978C;

    /* renamed from: H */
    public final ef3 f41979H;

    /* renamed from: k */
    public bb2 f41980k;

    /* renamed from: r */
    public final ef3 f41981r = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(MyTokensListViewModel.class), new C8398xe4ace8ea(this), new C8399xe4ace8eb((pc2) null, this), new MyTokensListFragment$myTokenListViewModel$2(this));

    /* renamed from: s */
    public final ef3 f41982s = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(HomeViewModel.class), new C8400xe4ace8ed(this), new C8401xe4ace8ee((pc2) null, this), new C8402xe4ace8ef(this));

    /* renamed from: x */
    public final ef3 f41983x;

    /* renamed from: y */
    public f14 f41984y;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J&\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0006\u001a\u000e\u0012\b\u0012\u00060\u0005R\u00020\u0001\u0018\u00010\u0004H\u0016¨\u0006\t"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/MyTokensListFragment$a", "Lnet/safemoon/androidwallet/views/gesture/RecyclerItemSwipeHelper;", "Landroidx/recyclerview/widget/RecyclerView$a0;", "viewHolder", "", "Lnet/safemoon/androidwallet/views/gesture/RecyclerItemSwipeHelper$c;", "itemActionButtons", "Lr37;", "n", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.MyTokensListFragment$a */
    /* compiled from: MyTokensListFragment.kt */
    public static final class C8394a extends RecyclerItemSwipeHelper {

        /* renamed from: k */
        public final /* synthetic */ MyTokensListFragment f41985k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8394a(MyTokensListFragment myTokensListFragment, Context context, RecyclerView recyclerView, f14 f14, C8395b bVar) {
            super(context, bVar, recyclerView, f14);
            this.f41985k = myTokensListFragment;
            vx2.m53590f(context, "requireContext()");
            vx2.m53590f(recyclerView, "rvMyTokenList");
        }

        /* renamed from: n */
        public void mo57512n(RecyclerView.C1231a0 a0Var, List<RecyclerItemSwipeHelper.C8958c> list) {
            vx2.m53588d(list);
            list.add(new RecyclerItemSwipeHelper.C8958c(uf5.m28223f(this.f41985k.getResources(), R.drawable.ic_baseline_delete_24, (Resources.Theme) null), new ColorDrawable(uf5.m28221d(this.f41985k.getResources(), R.color.red, (Resources.Theme) null))));
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/MyTokensListFragment$b", "Lez2;", "", "itemPosition", "Lr37;", "b", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.MyTokensListFragment$b */
    /* compiled from: MyTokensListFragment.kt */
    public static final class C8395b implements ez2 {

        /* renamed from: a */
        public final /* synthetic */ MyTokensListFragment f41986a;

        public C8395b(MyTokensListFragment myTokensListFragment) {
            this.f41986a = myTokensListFragment;
        }

        /* renamed from: a */
        public void mo51553a() {
            if (this.f41986a.f41984y != null) {
                MyTokensListViewModel F = this.f41986a.mo57503J();
                f14 C = this.f41986a.f41984y;
                if (C == null) {
                    vx2.m53605u("adapter");
                    C = null;
                }
                F.mo61311a0(C.mo51560b());
            }
        }

        /* renamed from: b */
        public void mo51554b(int i) {
            f14 C = this.f41986a.f41984y;
            f14 f14 = null;
            if (C == null) {
                vx2.m53605u("adapter");
                C = null;
            }
            UserTokenItemDisplayModel userTokenItemDisplayModel = C.mo51560b().get(i);
            MyTokensListFragment myTokensListFragment = this.f41986a;
            UserTokenItemDisplayModel userTokenItemDisplayModel2 = userTokenItemDisplayModel;
            f14 C2 = myTokensListFragment.f41984y;
            if (C2 == null) {
                vx2.m53605u("adapter");
            } else {
                f14 = C2;
            }
            f14.mo51565h(i);
            myTokensListFragment.mo57503J().mo61304Q(userTokenItemDisplayModel2);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/MyTokensListFragment$c", "Lnet/safemoon/androidwallet/domain/listener/dalog/OnSelectTokenTypeClickListener;", "Lnet/safemoon/androidwallet/common/TokenType;", "c", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.MyTokensListFragment$c */
    /* compiled from: MyTokensListFragment.kt */
    public static final class C8396c extends OnSelectTokenTypeClickListener {

        /* renamed from: r */
        public final /* synthetic */ MyTokensListFragment f41987r;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8396c(MyTokensListFragment myTokensListFragment, C8397d dVar, WeakReference<Activity> weakReference, Map<String, ? extends TokenType> map) {
            super(dVar, weakReference, map);
            this.f41987r = myTokensListFragment;
        }

        /* renamed from: c */
        public TokenType mo57366c() {
            Context requireContext = this.f41987r.requireContext();
            vx2.m53590f(requireContext, "requireContext()");
            return ol0.m70355e(requireContext);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/MyTokensListFragment$d", "Lft4$a;", "Lnet/safemoon/androidwallet/common/TokenType;", "token", "Lr37;", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.MyTokensListFragment$d */
    /* compiled from: MyTokensListFragment.kt */
    public static final class C8397d implements ft4.C7102a {

        /* renamed from: a */
        public final /* synthetic */ MyTokensListFragment f41988a;

        public C8397d(MyTokensListFragment myTokensListFragment) {
            this.f41988a = myTokensListFragment;
        }

        /* renamed from: a */
        public void mo51798a(TokenType tokenType) {
            vx2.m53591g(tokenType, "token");
            this.f41988a.mo57503J().mo61306T(tokenType);
            this.f41988a.mo57501H().mo61236r(tokenType);
        }
    }

    public MyTokensListFragment() {
        ef3 b = C6169a.m47233b(LazyThreadSafetyMode.NONE, new MyTokensListFragment$special$$inlined$viewModels$default$2(new MyTokensListFragment$special$$inlined$viewModels$default$1(this)));
        this.f41983x = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(MultiWalletViewModel.class), new MyTokensListFragment$special$$inlined$viewModels$default$3(b), new MyTokensListFragment$special$$inlined$viewModels$default$4((pc2) null, b), new MyTokensListFragment$special$$inlined$viewModels$default$5(this, b));
        this.f41979H = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(ob4.class), new C8403xe4ace8f0(this), new C8404xe4ace8f1((pc2) null, this), new C8405xe4ace8f2(this));
    }

    /* renamed from: M */
    public static final void m66616M(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: N */
    public static final void m66617N(MyTokensListFragment myTokensListFragment, List list) {
        RecyclerTouchListener recyclerTouchListener;
        vx2.m53591g(myTokensListFragment, "this$0");
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (myTokensListFragment.mo57503J().mo61292D().contains(((UserTokenItemDisplayModel) list.get(i)).getSymbol())) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (arrayList.size() > 0 && (recyclerTouchListener = myTokensListFragment.f41978C) != null) {
            Integer[] numArr = (Integer[]) arrayList.toArray(new Integer[0]);
            recyclerTouchListener.mo57038z((Integer[]) Arrays.copyOf(numArr, numArr.length));
        }
        f14 f14 = myTokensListFragment.f41984y;
        if (f14 == null) {
            vx2.m53605u("adapter");
            f14 = null;
        }
        vx2.m53590f(list, "items");
        f14.mo51569l(list);
    }

    /* renamed from: P */
    public static final void m66618P(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: Q */
    public static final void m66619Q(MyTokensListFragment myTokensListFragment, View view) {
        vx2.m53591g(myTokensListFragment, "this$0");
        j44 e = s14.m71755e();
        vx2.m53590f(e, "actionNavigationMyTokens…ficationHistoryFragment()");
        myTokensListFragment.mo50753j(e);
    }

    /* renamed from: U */
    public static final void m66620U(MyTokensListFragment myTokensListFragment, View view) {
        vx2.m53591g(myTokensListFragment, "this$0");
        j44 a = s14.m71751a();
        vx2.m53590f(a, "actionMyTokensListFragmentToAddNewTokenFragment()");
        myTokensListFragment.mo50753j(a);
    }

    /* renamed from: W */
    public static final void m66621W(MyTokensListFragment myTokensListFragment, View view) {
        vx2.m53591g(myTokensListFragment, "this$0");
        j44 b = s14.m71752b();
        vx2.m53590f(b, "actionMyTokensListFragmentToReceiveFragment()");
        myTokensListFragment.mo50753j(b);
    }

    /* renamed from: X */
    public static final void m66622X(MyTokensListFragment myTokensListFragment, View view) {
        vx2.m53591g(myTokensListFragment, "this$0");
        j44 c = s14.m71753c();
        vx2.m53590f(c, "actionMyTokensListFragmentToSendFragment()");
        myTokensListFragment.mo50753j(c);
    }

    /* renamed from: Y */
    public static final void m66623Y(bb2 bb2, MyTokensListFragment myTokensListFragment) {
        vx2.m53591g(bb2, "$this_apply");
        vx2.m53591g(myTokensListFragment, "this$0");
        bb2.f21227j.setRefreshing(false);
        if (myTokensListFragment.mo57501H().mo61232n().getValue() != null) {
            myTokensListFragment.mo57503J().mo61307U();
        }
    }

    /* renamed from: Z */
    public static final boolean m66624Z(MyTokensListFragment myTokensListFragment, View view) {
        vx2.m53591g(myTokensListFragment, "this$0");
        C7047eg egVar = new C7047eg(myTokensListFragment.mo57503J());
        Context requireContext = myTokensListFragment.requireContext();
        vx2.m53590f(requireContext, "requireContext()");
        vx2.m53590f(view, "v");
        bb2 bb2 = myTokensListFragment.f41980k;
        if (bb2 == null) {
            vx2.m53605u("binding");
            bb2 = null;
        }
        egVar.mo51463f(requireContext, view, bb2.f21219b);
        return true;
    }

    /* renamed from: a0 */
    public static final void m66625a0(MyTokensListFragment myTokensListFragment, View view) {
        vx2.m53591g(myTokensListFragment, "this$0");
        AnchorSwitchWallet anchorSwitchWallet = new AnchorSwitchWallet(myTokensListFragment.mo57502I(), R.id.myTokensListFragment);
        Context requireContext = myTokensListFragment.requireContext();
        vx2.m53590f(requireContext, "requireContext()");
        vx2.m53590f(view, "v");
        bb2 bb2 = myTokensListFragment.f41980k;
        if (bb2 == null) {
            vx2.m53605u("binding");
            bb2 = null;
        }
        anchorSwitchWallet.mo57160h(requireContext, view, bb2.f21219b);
    }

    /* renamed from: b0 */
    public static final void m66626b0(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: H */
    public final HomeViewModel mo57501H() {
        return (HomeViewModel) this.f41982s.getValue();
    }

    /* renamed from: I */
    public final MultiWalletViewModel mo57502I() {
        return (MultiWalletViewModel) this.f41983x.getValue();
    }

    /* renamed from: J */
    public final MyTokensListViewModel mo57503J() {
        return (MyTokensListViewModel) this.f41981r.getValue();
    }

    /* renamed from: K */
    public final ob4 mo57504K() {
        return (ob4) this.f41979H.getValue();
    }

    /* renamed from: L */
    public final void mo57505L() {
        mo57501H().mo61232n().observe(getViewLifecycleOwner(), new g14(new MyTokensListFragment$observeViewModel$1(this)));
        mo57503J().mo61297I().observe(getViewLifecycleOwner(), new t05(new i14(this)));
    }

    /* renamed from: O */
    public final void mo57506O() {
        bb2 bb2 = this.f41980k;
        bb2 bb22 = null;
        if (bb2 == null) {
            vx2.m53605u("binding");
            bb2 = null;
        }
        bb2.f21228k.f29298b.setVisibility(0);
        bb2 bb23 = this.f41980k;
        if (bb23 == null) {
            vx2.m53605u("binding");
        } else {
            bb22 = bb23;
        }
        bb22.f21228k.f29298b.setOnClickListener(new j14(this));
        mo57504K().mo62867g().observe(getViewLifecycleOwner(), new k14(new MyTokensListFragment$renderNotification$2(this)));
    }

    /* renamed from: R */
    public final void mo57507R() {
        f14 f14 = new f14();
        this.f41984y = f14;
        f14.mo51568k(new MyTokensListFragment$setupAdapter$1(this));
        f14 f142 = this.f41984y;
        f14 f143 = null;
        if (f142 == null) {
            vx2.m53605u("adapter");
            f142 = null;
        }
        FixedForAppBarLayoutManager fixedForAppBarLayoutManager = this.f41976A;
        if (fixedForAppBarLayoutManager == null) {
            vx2.m53605u("layoutManager");
            fixedForAppBarLayoutManager = null;
        }
        f142.mo51567j(fixedForAppBarLayoutManager);
        bb2 bb2 = this.f41980k;
        if (bb2 == null) {
            vx2.m53605u("binding");
            bb2 = null;
        }
        RecyclerView recyclerView = bb2.f21226i;
        f14 f144 = this.f41984y;
        if (f144 == null) {
            vx2.m53605u("adapter");
        } else {
            f143 = f144;
        }
        recyclerView.setAdapter(f143);
        mo57508S();
    }

    /* renamed from: S */
    public final void mo57508S() {
        f14 f14;
        Context requireContext = requireContext();
        bb2 bb2 = this.f41980k;
        if (bb2 == null) {
            vx2.m53605u("binding");
            bb2 = null;
        }
        RecyclerView recyclerView = bb2.f21226i;
        f14 f142 = this.f41984y;
        if (f142 == null) {
            vx2.m53605u("adapter");
            f14 = null;
        } else {
            f14 = f142;
        }
        new C8394a(this, requireContext, recyclerView, f14, new C8395b(this));
    }

    /* renamed from: T */
    public final void mo57509T() {
        bb2 bb2 = this.f41980k;
        bb2 bb22 = null;
        if (bb2 == null) {
            vx2.m53605u("binding");
            bb2 = null;
        }
        bb2.f21228k.f29307k.setVisibility(4);
        bb2 bb23 = this.f41980k;
        if (bb23 == null) {
            vx2.m53605u("binding");
            bb23 = null;
        }
        bb23.f21228k.f29298b.setVisibility(4);
        bb2 bb24 = this.f41980k;
        if (bb24 == null) {
            vx2.m53605u("binding");
            bb24 = null;
        }
        bb24.f21228k.f29299c.setVisibility(4);
        bb2 bb25 = this.f41980k;
        if (bb25 == null) {
            vx2.m53605u("binding");
            bb25 = null;
        }
        bb25.f21228k.f29300d.setVisibility(0);
        bb2 bb26 = this.f41980k;
        if (bb26 == null) {
            vx2.m53605u("binding");
            bb26 = null;
        }
        bb26.f21228k.f29305i.setChecked(true);
        bb2 bb27 = this.f41980k;
        if (bb27 == null) {
            vx2.m53605u("binding");
            bb27 = null;
        }
        SegmentedButton segmentedButton = bb27.f21228k.f29306j;
        vx2.m53590f(segmentedButton, "binding.topBar.segmentedGroup");
        mo58057q(segmentedButton);
        bb2 bb28 = this.f41980k;
        if (bb28 == null) {
            vx2.m53605u("binding");
        } else {
            bb22 = bb28;
        }
        bb22.f21228k.f29300d.setOnClickListener(new h14(this));
    }

    /* renamed from: V */
    public final void mo57510V() {
        mo57509T();
        this.f41976A = new FixedForAppBarLayoutManager(requireContext());
        bb2 bb2 = this.f41980k;
        bb2 bb22 = null;
        if (bb2 == null) {
            vx2.m53605u("binding");
            bb2 = null;
        }
        RecyclerView recyclerView = bb2.f21226i;
        FixedForAppBarLayoutManager fixedForAppBarLayoutManager = this.f41976A;
        if (fixedForAppBarLayoutManager == null) {
            vx2.m53605u("layoutManager");
            fixedForAppBarLayoutManager = null;
        }
        recyclerView.setLayoutManager(fixedForAppBarLayoutManager);
        this.f41977B = new C8396c(this, new C8397d(this), new WeakReference(requireActivity()), mo57501H().mo61233o());
        bb2 bb23 = this.f41980k;
        if (bb23 == null) {
            vx2.m53605u("binding");
            bb23 = null;
        }
        bb23.f21225h.f21727b.setOnClickListener(this.f41977B);
        bb2 bb24 = this.f41980k;
        if (bb24 == null) {
            vx2.m53605u("binding");
            bb24 = null;
        }
        bb24.f21220c.setOnClickListener(new l14(this));
        bb2 bb25 = this.f41980k;
        if (bb25 == null) {
            vx2.m53605u("binding");
            bb25 = null;
        }
        bb25.f21221d.setOnClickListener(new m14(this));
        bb2 bb26 = this.f41980k;
        if (bb26 == null) {
            vx2.m53605u("binding");
            bb26 = null;
        }
        bb26.f21227j.setOnRefreshListener(new n14(bb26, this));
        bb2 bb27 = this.f41980k;
        if (bb27 == null) {
            vx2.m53605u("binding");
            bb27 = null;
        }
        TextView textView = bb27.f21231n;
        vx2.m53590f(textView, "binding.tvWalletBlnc");
        ol0.m70343W(textView, new MyTokensListFragment$setupView$6(this));
        bb2 bb28 = this.f41980k;
        if (bb28 == null) {
            vx2.m53605u("binding");
            bb28 = null;
        }
        bb28.f21231n.setOnLongClickListener(new o14(this));
        bb2 bb29 = this.f41980k;
        if (bb29 == null) {
            vx2.m53605u("binding");
        } else {
            bb22 = bb29;
        }
        bb22.f21229l.setOnClickListener(new p14(this));
        mo57503J().mo61298J().observe(getViewLifecycleOwner(), new q14(new MyTokensListFragment$setupView$9(this)));
    }

    /* renamed from: c0 */
    public final void mo57511c0(View view) {
        String str;
        Wallet.Companion companion = Wallet.Companion;
        String j = f06.m57519j(getContext(), "SAFEMOON_ACTIVE_WALLET", "");
        vx2.m53590f(j, "getString(context, Share…FEMOON_ACTIVE_WALLET, \"\")");
        Wallet wallet2 = companion.toWallet(j);
        if (wallet2 != null) {
            str = wallet2.displayName();
        } else {
            str = null;
        }
        TextView textView = (TextView) view.findViewById(R.id.tvMainWallet);
        if (textView != null) {
            textView.setText(str);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        vx2.m53591g(layoutInflater, "inflater");
        bb2 a = bb2.m32454a(layoutInflater.inflate(R.layout.fragment_tokenslist, viewGroup, false));
        vx2.m53590f(a, "bind(\n            inflat…e\n            )\n        )");
        this.f41980k = a;
        if (a == null) {
            vx2.m53605u("binding");
            a = null;
        }
        ConstraintLayout b = a.mo29517b();
        vx2.m53590f(b, "binding.root");
        return b;
    }

    public void onPause() {
        super.onPause();
        OnSelectTokenTypeClickListener onSelectTokenTypeClickListener = this.f41977B;
        if (onSelectTokenTypeClickListener != null) {
            onSelectTokenTypeClickListener.mo57365b();
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        vx2.m53591g(view, "view");
        super.onViewCreated(view, bundle);
        mo57510V();
        mo57507R();
        mo57505L();
        mo57506O();
        mo57511c0(view);
    }
}
