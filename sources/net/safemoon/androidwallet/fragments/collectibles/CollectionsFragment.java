package net.safemoon.androidwallet.fragments.collectibles;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.recyclerview.widget.C1314k;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.C6169a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.fragments.common.BaseMainFragment;
import net.safemoon.androidwallet.model.collectible.RoomCollection;
import net.safemoon.androidwallet.model.collectible.RoomNFT;
import net.safemoon.androidwallet.viewmodels.CollectibleViewModel;
import p000.zj0;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b3\u00104J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J&\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0016\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eJ\b\u0010\u0012\u001a\u00020\u0004H\u0002J\u0018\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR$\u0010#\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020\u00138BX\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001b\u0010-\u001a\u00020)8BX\u0002¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b+\u0010,R\u001b\u00102\u001a\u00020.8BX\u0002¢\u0006\f\n\u0004\b/\u0010%\u001a\u0004\b0\u00101¨\u00065"}, mo44877d2 = {"Lnet/safemoon/androidwallet/fragments/collectibles/CollectionsFragment;", "Lnet/safemoon/androidwallet/fragments/common/BaseMainFragment;", "Landroid/os/Bundle;", "savedInstanceState", "Lr37;", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "view", "onViewCreated", "", "from", "to", "E", "M", "Lnet/safemoon/androidwallet/model/collectible/RoomCollection;", "roomCollection", "Lnet/safemoon/androidwallet/model/collectible/RoomNFT;", "nftData", "N", "Li92;", "k", "Li92;", "binding", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "r", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "getSwRefresh", "()Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "setSwRefresh", "(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V", "swRefresh", "s", "Lef3;", "C", "()Lnet/safemoon/androidwallet/model/collectible/RoomCollection;", "collection", "Lnet/safemoon/androidwallet/viewmodels/CollectibleViewModel;", "x", "B", "()Lnet/safemoon/androidwallet/viewmodels/CollectibleViewModel;", "collectibleViewModel", "Lh74;", "y", "D", "()Lh74;", "nftsAdapter", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: CollectionsFragment.kt */
public final class CollectionsFragment extends BaseMainFragment {

    /* renamed from: k */
    public i92 f42311k;

    /* renamed from: r */
    public SwipeRefreshLayout f42312r;

    /* renamed from: s */
    public final ef3 f42313s = C6169a.m47232a(new CollectionsFragment$collection$2(this));

    /* renamed from: x */
    public final ef3 f42314x;

    /* renamed from: y */
    public final ef3 f42315y;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J \u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0016J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0006H\u0016J\u001a\u0010\u000f\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u0006H\u0016J\u0018\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0011"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/collectibles/CollectionsFragment$a", "Landroidx/recyclerview/widget/k$e;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView$a0;", "viewHolder", "", "k", "target", "", "y", "direction", "Lr37;", "B", "actionState", "A", "c", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.collectibles.CollectionsFragment$a */
    /* compiled from: CollectionsFragment.kt */
    public static final class C8537a extends C1314k.C1319e {

        /* renamed from: d */
        public final /* synthetic */ CollectionsFragment f42316d;

        public C8537a(CollectionsFragment collectionsFragment) {
            this.f42316d = collectionsFragment;
        }

        /* renamed from: A */
        public void mo9858A(RecyclerView.C1231a0 a0Var, int i) {
            View view;
            super.mo9858A(a0Var, i);
            if (i == 2) {
                if (a0Var != null) {
                    view = a0Var.itemView;
                } else {
                    view = null;
                }
                if (view != null) {
                    view.setAlpha(0.5f);
                }
            }
        }

        /* renamed from: B */
        public void mo9859B(RecyclerView.C1231a0 a0Var, int i) {
            vx2.m53591g(a0Var, "viewHolder");
        }

        /* renamed from: c */
        public void mo9862c(RecyclerView recyclerView, RecyclerView.C1231a0 a0Var) {
            vx2.m53591g(recyclerView, "recyclerView");
            vx2.m53591g(a0Var, "viewHolder");
            super.mo9862c(recyclerView, a0Var);
            a0Var.itemView.setAlpha(1.0f);
        }

        /* renamed from: k */
        public int mo9869k(RecyclerView recyclerView, RecyclerView.C1231a0 a0Var) {
            vx2.m53591g(recyclerView, "recyclerView");
            vx2.m53591g(a0Var, "viewHolder");
            return C1314k.C1319e.m9585s(2, 51);
        }

        /* renamed from: y */
        public boolean mo9881y(RecyclerView recyclerView, RecyclerView.C1231a0 a0Var, RecyclerView.C1231a0 a0Var2) {
            vx2.m53591g(recyclerView, "recyclerView");
            vx2.m53591g(a0Var, "viewHolder");
            vx2.m53591g(a0Var2, "target");
            this.f42316d.mo57987E(a0Var.getAbsoluteAdapterPosition(), a0Var2.getAbsoluteAdapterPosition());
            return true;
        }
    }

    public CollectionsFragment() {
        ef3 b = C6169a.m47233b(LazyThreadSafetyMode.NONE, new CollectionsFragment$special$$inlined$viewModels$default$2(new CollectionsFragment$special$$inlined$viewModels$default$1(this)));
        this.f42314x = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(CollectibleViewModel.class), new CollectionsFragment$special$$inlined$viewModels$default$3(b), new CollectionsFragment$special$$inlined$viewModels$default$4((pc2) null, b), new CollectionsFragment$special$$inlined$viewModels$default$5(this, b));
        this.f42315y = C6169a.m47232a(new CollectionsFragment$nftsAdapter$2(this));
    }

    /* renamed from: F */
    public static final void m67736F(CollectionsFragment collectionsFragment, View view) {
        vx2.m53591g(collectionsFragment, "this$0");
        FragmentActivity activity = collectionsFragment.getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    /* renamed from: G */
    public static final void m67737G(CollectionsFragment collectionsFragment, View view) {
        vx2.m53591g(collectionsFragment, "this$0");
        collectionsFragment.mo57988M();
    }

    /* renamed from: H */
    public static final void m67738H(CollectionsFragment collectionsFragment, View view) {
        vx2.m53591g(collectionsFragment, "this$0");
        collectionsFragment.mo57988M();
    }

    /* renamed from: I */
    public static final void m67739I(CollectionsFragment collectionsFragment) {
        vx2.m53591g(collectionsFragment, "this$0");
        SwipeRefreshLayout swipeRefreshLayout = collectionsFragment.f42312r;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(false);
        }
    }

    /* renamed from: J */
    public static final void m67740J(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: K */
    public static final void m67741K(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: L */
    public static final void m67742L(CollectionsFragment collectionsFragment) {
        RecyclerView recyclerView;
        boolean z;
        i92 i92 = collectionsFragment.f42311k;
        if (i92 != null) {
            recyclerView = i92.f29862g;
        } else {
            recyclerView = null;
        }
        if (recyclerView != null) {
            int i = 0;
            if (collectionsFragment.mo57986D().mo52125b().mo9695b().size() > 0 || !vx2.m53586b(collectionsFragment.mo57984B().mo61051T().getValue(), Boolean.FALSE)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                i = 8;
            }
            recyclerView.setVisibility(i);
        }
    }

    /* renamed from: B */
    public final CollectibleViewModel mo57984B() {
        return (CollectibleViewModel) this.f42314x.getValue();
    }

    /* renamed from: C */
    public final RoomCollection mo57985C() {
        return (RoomCollection) this.f42313s.getValue();
    }

    /* renamed from: D */
    public final h74 mo57986D() {
        return (h74) this.f42315y.getValue();
    }

    /* renamed from: E */
    public final void mo57987E(int i, int i2) {
        List<RoomNFT> b = mo57986D().mo52125b().mo9695b();
        vx2.m53590f(b, "differ.currentList");
        List<T> M0 = CollectionsKt___CollectionsKt.m47313M0(b);
        Collections.swap(M0, i, i2);
        CollectibleViewModel B = mo57984B();
        ArrayList arrayList = new ArrayList(dk0.m43495u(M0, 10));
        int i3 = 0;
        for (T next : M0) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                ck0.m33072t();
            }
            arrayList.add(new Pair(((RoomNFT) next).getId(), Integer.valueOf(i3)));
            i3 = i4;
        }
        B.mo61064q0(arrayList);
    }

    /* renamed from: M */
    public final void mo57988M() {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(CollectibleFragment.f42294C.mo57966a())));
    }

    /* renamed from: N */
    public final void mo57989N(RoomCollection roomCollection, RoomNFT roomNFT) {
        zj0.C9678a a = zj0.m75001a(roomCollection, roomNFT);
        vx2.m53590f(a, "actionNavigationCollecti…(roomCollection, nftData)");
        mo50753j(a);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        vx2.m53591g(layoutInflater, "inflater");
        i92 a = i92.m45588a(LayoutInflater.from(requireContext()).inflate(R.layout.fragment_collections, viewGroup, false));
        this.f42311k = a;
        if (a != null) {
            return a.mo43522b();
        }
        return null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        AppCompatImageView appCompatImageView;
        TextView textView;
        AppCompatImageView appCompatImageView2;
        AppCompatImageView appCompatImageView3;
        AppCompatTextView appCompatTextView;
        vx2.m53591g(view, "view");
        super.onViewCreated(view, bundle);
        this.f42312r = (SwipeRefreshLayout) view.findViewById(R.id.swRefresh);
        i92 i92 = this.f42311k;
        if (i92 != null) {
            appCompatImageView = i92.f29857b;
        } else {
            appCompatImageView = null;
        }
        if (appCompatImageView != null) {
            appCompatImageView.setVisibility(0);
        }
        i92 i922 = this.f42311k;
        if (!(i922 == null || (appCompatTextView = i922.f29864i) == null)) {
            appCompatTextView.setText(mo57985C().getName());
        }
        i92 i923 = this.f42311k;
        if (!(i923 == null || (appCompatImageView3 = i923.f29857b) == null)) {
            appCompatImageView3.setOnClickListener(new sj0(this));
        }
        i92 i924 = this.f42311k;
        if (!(i924 == null || (appCompatImageView2 = i924.f29858c) == null)) {
            appCompatImageView2.setOnClickListener(new tj0(this));
        }
        i92 i925 = this.f42311k;
        if (!(i925 == null || (textView = i925.f29861f) == null)) {
            textView.setOnClickListener(new uj0(this));
        }
        SwipeRefreshLayout swipeRefreshLayout = this.f42312r;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setOnRefreshListener(new vj0(this));
        }
        i92 i926 = this.f42311k;
        if (i926 != null) {
            i926.f29862g.setLayoutManager(new GridLayoutManager(getContext(), 2));
            i926.f29862g.setAdapter(mo57986D());
            new C1314k(new C8537a(this)).mo9836g(i926.f29862g);
            mo57984B().mo61051T().observe(getViewLifecycleOwner(), new wj0(new CollectionsFragment$onViewCreated$5$2(this)));
            CollectibleViewModel.m68466x(mo57984B(), mo57985C(), 0, 0, 6, (Object) null).observe(getViewLifecycleOwner(), new xj0(new CollectionsFragment$onViewCreated$5$3(this)));
        }
    }
}
