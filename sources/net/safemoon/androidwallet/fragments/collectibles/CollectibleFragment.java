package net.safemoon.androidwallet.fragments.collectibles;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.recyclerview.widget.C1314k;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.C6169a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.dialogs.AnchorSwitchWallet;
import net.safemoon.androidwallet.dialogs.ProgressLoading;
import net.safemoon.androidwallet.domain.listener.dalog.OnSelectTokenTypeClickListener;
import net.safemoon.androidwallet.fragments.common.BaseMainFragment;
import net.safemoon.androidwallet.model.collectible.RoomCollection;
import net.safemoon.androidwallet.model.collectible.RoomCollectionAndNft;
import net.safemoon.androidwallet.model.collectible.TYPE_DELETE_NFT;
import net.safemoon.androidwallet.model.wallets.Wallet;
import net.safemoon.androidwallet.viewmodels.CollectibleViewModel;
import net.safemoon.androidwallet.viewmodels.MultiWalletViewModel;
import p000.ft4;
import p000.yi0;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 >2\u00020\u0001:\u0001?B\u0007¢\u0006\u0004\b<\u0010=J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J&\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u001a\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u0016\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012J\b\u0010\u0016\u001a\u00020\u0002H\u0016R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R$\u0010\"\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001b\u0010(\u001a\u00020#8BX\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001b\u0010-\u001a\u00020)8BX\u0002¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b+\u0010,R\u001b\u00102\u001a\u00020.8BX\u0002¢\u0006\f\n\u0004\b/\u0010%\u001a\u0004\b0\u00101R\u001b\u00107\u001a\u0002038BX\u0002¢\u0006\f\n\u0004\b4\u0010%\u001a\u0004\b5\u00106R\u0018\u0010;\u001a\u0004\u0018\u0001088\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006@"}, mo44877d2 = {"Lnet/safemoon/androidwallet/fragments/collectibles/CollectibleFragment;", "Lnet/safemoon/androidwallet/fragments/common/BaseMainFragment;", "Lr37;", "P", "d0", "Lnet/safemoon/androidwallet/model/collectible/RoomCollection;", "collection", "O", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "onViewCreated", "", "from", "to", "Q", "onPause", "Lnet/safemoon/androidwallet/dialogs/ProgressLoading;", "k", "Lnet/safemoon/androidwallet/dialogs/ProgressLoading;", "loading", "Lh92;", "r", "Lh92;", "K", "()Lh92;", "setBinding", "(Lh92;)V", "binding", "Lqj0;", "s", "Lef3;", "M", "()Lqj0;", "collectionsAdapter", "Lnet/safemoon/androidwallet/viewmodels/CollectibleViewModel;", "x", "L", "()Lnet/safemoon/androidwallet/viewmodels/CollectibleViewModel;", "collectibleViewModel", "Lnet/safemoon/androidwallet/viewmodels/MultiWalletViewModel;", "y", "N", "()Lnet/safemoon/androidwallet/viewmodels/MultiWalletViewModel;", "multiWalletVM", "Lhg;", "A", "J", "()Lhg;", "anchorCollectionsOption", "Lnet/safemoon/androidwallet/domain/listener/dalog/OnSelectTokenTypeClickListener;", "B", "Lnet/safemoon/androidwallet/domain/listener/dalog/OnSelectTokenTypeClickListener;", "onSelectTokenTypeClickListener", "<init>", "()V", "C", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: CollectibleFragment.kt */
public final class CollectibleFragment extends BaseMainFragment {

    /* renamed from: C */
    public static final C8518a f42294C = new C8518a((DefaultConstructorMarker) null);

    /* renamed from: H */
    public static String f42295H = "https://www.safemoon.education/sfm-wallet-nfts";

    /* renamed from: A */
    public final ef3 f42296A;

    /* renamed from: B */
    public OnSelectTokenTypeClickListener f42297B;

    /* renamed from: k */
    public ProgressLoading f42298k;

    /* renamed from: r */
    public h92 f42299r;

    /* renamed from: s */
    public final ef3 f42300s = C6169a.m47232a(new CollectibleFragment$collectionsAdapter$2(this));

    /* renamed from: x */
    public final ef3 f42301x;

    /* renamed from: y */
    public final ef3 f42302y;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000b"}, mo44877d2 = {"Lnet/safemoon/androidwallet/fragments/collectibles/CollectibleFragment$a;", "", "", "NFT_EDUCATION_LINK", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "setNFT_EDUCATION_LINK", "(Ljava/lang/String;)V", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.collectibles.CollectibleFragment$a */
    /* compiled from: CollectibleFragment.kt */
    public static final class C8518a {
        public C8518a() {
        }

        public /* synthetic */ C8518a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String mo57966a() {
            return CollectibleFragment.f42295H;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/collectibles/CollectibleFragment$b", "Lyg4;", "Lr37;", "b", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.collectibles.CollectibleFragment$b */
    /* compiled from: CollectibleFragment.kt */
    public static final class C8519b extends yg4 {

        /* renamed from: c */
        public final /* synthetic */ CollectibleFragment f42303c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8519b(CollectibleFragment collectibleFragment) {
            super(true);
            this.f42303c = collectibleFragment;
        }

        /* renamed from: b */
        public void mo6034b() {
            boolean z;
            TYPE_DELETE_NFT value = this.f42303c.mo57959L().mo61047P().getValue();
            if (value == null || value.getValue() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                this.f42303c.mo50752i();
            } else {
                this.f42303c.mo57959L().mo61058i0(false);
            }
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006H\u0016¨\u0006\u000b"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/collectibles/CollectibleFragment$c", "Landroidx/recyclerview/widget/RecyclerView$q;", "Landroidx/recyclerview/widget/RecyclerView;", "rv", "Landroid/view/MotionEvent;", "e", "", "c", "Lr37;", "a", "disallowIntercept", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.collectibles.CollectibleFragment$c */
    /* compiled from: CollectibleFragment.kt */
    public static final class C8520c implements RecyclerView.C1250q {

        /* renamed from: a */
        public final /* synthetic */ CollectibleFragment f42304a;

        public C8520c(CollectibleFragment collectibleFragment) {
            this.f42304a = collectibleFragment;
        }

        /* renamed from: a */
        public void mo9441a(RecyclerView recyclerView, MotionEvent motionEvent) {
            vx2.m53591g(recyclerView, "rv");
            vx2.m53591g(motionEvent, "e");
        }

        /* renamed from: c */
        public boolean mo9442c(RecyclerView recyclerView, MotionEvent motionEvent) {
            vx2.m53591g(recyclerView, "rv");
            vx2.m53591g(motionEvent, "e");
            View S = recyclerView.mo8998S(motionEvent.getX(), motionEvent.getY());
            if (this.f42304a.mo57959L().mo61047P().getValue() != TYPE_DELETE_NFT.VISIBLE || !vx2.m53586b(this.f42304a.mo57959L().mo61046O().getValue(), Boolean.TRUE) || S != null) {
                return false;
            }
            this.f42304a.mo57959L().mo61046O().postValue(Boolean.FALSE);
            return false;
        }

        /* renamed from: e */
        public void mo9443e(boolean z) {
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J \u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0016J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0006H\u0016J\u001a\u0010\u000f\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u0006H\u0016J\u0018\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0011"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/collectibles/CollectibleFragment$d", "Landroidx/recyclerview/widget/k$e;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView$a0;", "viewHolder", "", "k", "target", "", "y", "direction", "Lr37;", "B", "actionState", "A", "c", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.collectibles.CollectibleFragment$d */
    /* compiled from: CollectibleFragment.kt */
    public static final class C8521d extends C1314k.C1319e {

        /* renamed from: d */
        public final /* synthetic */ CollectibleFragment f42305d;

        public C8521d(CollectibleFragment collectibleFragment) {
            this.f42305d = collectibleFragment;
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
            CollectibleViewModel C = this.f42305d.mo57959L();
            List currentList = this.f42305d.mo57960M().getCurrentList();
            vx2.m53590f(currentList, "collectionsAdapter.currentList");
            ArrayList arrayList = new ArrayList(dk0.m43495u(currentList, 10));
            int i = 0;
            for (Object next : currentList) {
                int i2 = i + 1;
                if (i < 0) {
                    ck0.m33072t();
                }
                arrayList.add(new Pair(((RoomCollectionAndNft) next).getCollection().getId(), Integer.valueOf(i)));
                i = i2;
            }
            C.mo61063p0(arrayList);
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
            this.f42305d.mo57964Q(a0Var.getAbsoluteAdapterPosition(), a0Var2.getAbsoluteAdapterPosition());
            return true;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/collectibles/CollectibleFragment$e", "Lnet/safemoon/androidwallet/domain/listener/dalog/OnSelectTokenTypeClickListener;", "Lnet/safemoon/androidwallet/common/TokenType;", "c", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.collectibles.CollectibleFragment$e */
    /* compiled from: CollectibleFragment.kt */
    public static final class C8522e extends OnSelectTokenTypeClickListener {

        /* renamed from: r */
        public final /* synthetic */ CollectibleFragment f42306r;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8522e(CollectibleFragment collectibleFragment, C8523f fVar, WeakReference<Activity> weakReference, Map<String, ? extends TokenType> map) {
            super(fVar, weakReference, map);
            this.f42306r = collectibleFragment;
        }

        /* renamed from: c */
        public TokenType mo57366c() {
            TokenType value = this.f42306r.mo57959L().mo61045N().getValue();
            if (value == null) {
                return this.f42306r.mo57959L().mo61033B();
            }
            return value;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/collectibles/CollectibleFragment$f", "Lft4$a;", "Lnet/safemoon/androidwallet/common/TokenType;", "token", "Lr37;", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.collectibles.CollectibleFragment$f */
    /* compiled from: CollectibleFragment.kt */
    public static final class C8523f implements ft4.C7102a {

        /* renamed from: a */
        public final /* synthetic */ CollectibleFragment f42307a;

        public C8523f(CollectibleFragment collectibleFragment) {
            this.f42307a = collectibleFragment;
        }

        /* renamed from: a */
        public void mo51798a(TokenType tokenType) {
            vx2.m53591g(tokenType, "token");
            this.f42307a.mo57959L().mo61058i0(false);
            this.f42307a.mo57959L().mo61045N().postValue(tokenType);
            f06.m57524o(this.f42307a.requireContext(), "DEFAULT_GATEWAY_COLLECTIONS", tokenType.name());
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\t"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/collectibles/CollectibleFragment$g", "Landroid/text/style/ClickableSpan;", "Landroid/view/View;", "widget", "Lr37;", "onClick", "Landroid/text/TextPaint;", "ds", "updateDrawState", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.collectibles.CollectibleFragment$g */
    /* compiled from: CollectibleFragment.kt */
    public static final class C8524g extends ClickableSpan {

        /* renamed from: a */
        public final /* synthetic */ CollectibleFragment f42308a;

        public C8524g(CollectibleFragment collectibleFragment) {
            this.f42308a = collectibleFragment;
        }

        public void onClick(View view) {
            vx2.m53591g(view, "widget");
            this.f42308a.mo57959L().mo61057h0();
        }

        public void updateDrawState(TextPaint textPaint) {
            vx2.m53591g(textPaint, "ds");
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    public CollectibleFragment() {
        CollectibleFragment$special$$inlined$viewModels$default$1 collectibleFragment$special$$inlined$viewModels$default$1 = new CollectibleFragment$special$$inlined$viewModels$default$1(this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        ef3 b = C6169a.m47233b(lazyThreadSafetyMode, new CollectibleFragment$special$$inlined$viewModels$default$2(collectibleFragment$special$$inlined$viewModels$default$1));
        this.f42301x = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(CollectibleViewModel.class), new CollectibleFragment$special$$inlined$viewModels$default$3(b), new CollectibleFragment$special$$inlined$viewModels$default$4((pc2) null, b), new CollectibleFragment$special$$inlined$viewModels$default$5(this, b));
        ef3 b2 = C6169a.m47233b(lazyThreadSafetyMode, new CollectibleFragment$special$$inlined$viewModels$default$7(new CollectibleFragment$special$$inlined$viewModels$default$6(this)));
        this.f42302y = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(MultiWalletViewModel.class), new CollectibleFragment$special$$inlined$viewModels$default$8(b2), new CollectibleFragment$special$$inlined$viewModels$default$9((pc2) null, b2), new CollectibleFragment$special$$inlined$viewModels$default$10(this, b2));
        this.f42296A = C6169a.m47232a(new CollectibleFragment$anchorCollectionsOption$2(this));
    }

    /* renamed from: R */
    public static final void m67691R(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: S */
    public static final void m67692S(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: T */
    public static final void m67693T(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: U */
    public static final void m67694U(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: V */
    public static final void m67695V(h92 h92) {
        vx2.m53591g(h92, "$it");
        h92.f29476k.setRefreshing(false);
    }

    /* renamed from: W */
    public static final void m67696W(CollectibleFragment collectibleFragment, View view) {
        vx2.m53591g(collectibleFragment, "this$0");
        collectibleFragment.mo57965d0();
    }

    /* renamed from: X */
    public static final void m67697X(CollectibleFragment collectibleFragment, View view) {
        vx2.m53591g(collectibleFragment, "this$0");
        TYPE_DELETE_NFT value = collectibleFragment.mo57959L().mo61047P().getValue();
        boolean z = false;
        if (value != null && value.getValue() == 0) {
            z = true;
        }
        if (z) {
            C7182hg J = collectibleFragment.mo57957J();
            Context requireContext = collectibleFragment.requireContext();
            vx2.m53590f(requireContext, "requireContext()");
            vx2.m53590f(view, "btn");
            J.mo52199j(requireContext, view, new CollectibleFragment$onViewCreated$2$7$1(collectibleFragment));
            return;
        }
        collectibleFragment.requireActivity().onBackPressed();
    }

    /* renamed from: Y */
    public static final void m67698Y(CollectibleFragment collectibleFragment, h92 h92, View view) {
        vx2.m53591g(collectibleFragment, "this$0");
        vx2.m53591g(h92, "$it");
        AnchorSwitchWallet anchorSwitchWallet = new AnchorSwitchWallet(collectibleFragment.mo57961N(), R.id.navigation_collectibles);
        Context requireContext = collectibleFragment.requireContext();
        vx2.m53590f(requireContext, "requireContext()");
        vx2.m53590f(view, "view");
        anchorSwitchWallet.mo57160h(requireContext, view, h92.f29472g);
    }

    /* renamed from: Z */
    public static final void m67699Z(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: a0 */
    public static final void m67700a0(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0055, code lost:
        if (r0 == true) goto L_0x0059;
     */
    /* renamed from: b0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m67701b0(net.safemoon.androidwallet.fragments.collectibles.CollectibleFragment r10) {
        /*
            boolean r0 = r10.isVisible()
            if (r0 == 0) goto L_0x01ec
            h92 r0 = r10.f42299r
            r1 = 0
            if (r0 == 0) goto L_0x000e
            android.widget.LinearLayout r0 = r0.f29471f
            goto L_0x000f
        L_0x000e:
            r0 = r1
        L_0x000f:
            r2 = 1
            r3 = 8
            r4 = 0
            if (r0 != 0) goto L_0x0016
            goto L_0x0044
        L_0x0016:
            qj0 r5 = r10.mo57960M()
            java.util.List r5 = r5.getCurrentList()
            int r5 = r5.size()
            if (r5 > 0) goto L_0x003b
            net.safemoon.androidwallet.viewmodels.CollectibleViewModel r5 = r10.mo57959L()
            k04 r5 = r5.mo61051T()
            java.lang.Object r5 = r5.getValue()
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            boolean r5 = p000.vx2.m53586b(r5, r6)
            if (r5 != 0) goto L_0x0039
            goto L_0x003b
        L_0x0039:
            r5 = r4
            goto L_0x003c
        L_0x003b:
            r5 = r2
        L_0x003c:
            if (r5 == 0) goto L_0x0040
            r5 = r3
            goto L_0x0041
        L_0x0040:
            r5 = r4
        L_0x0041:
            r0.setVisibility(r5)
        L_0x0044:
            h92 r0 = r10.f42299r
            if (r0 == 0) goto L_0x0058
            android.widget.LinearLayout r0 = r0.f29471f
            if (r0 == 0) goto L_0x0058
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0054
            r0 = r2
            goto L_0x0055
        L_0x0054:
            r0 = r4
        L_0x0055:
            if (r0 != r2) goto L_0x0058
            goto L_0x0059
        L_0x0058:
            r2 = r4
        L_0x0059:
            if (r2 == 0) goto L_0x01ec
            net.safemoon.androidwallet.viewmodels.CollectibleViewModel r0 = r10.mo57959L()
            k04 r0 = r0.mo61047P()
            java.lang.Object r0 = r0.getValue()
            net.safemoon.androidwallet.model.collectible.TYPE_DELETE_NFT r2 = net.safemoon.androidwallet.model.collectible.TYPE_DELETE_NFT.HIDE
            if (r0 != r2) goto L_0x00a7
            net.safemoon.androidwallet.viewmodels.CollectibleViewModel r0 = r10.mo57959L()
            java.util.List r0 = r0.mo61039H()
            if (r0 == 0) goto L_0x007a
            int r0 = r0.size()
            goto L_0x007b
        L_0x007a:
            r0 = r4
        L_0x007b:
            if (r0 != 0) goto L_0x00a7
            h92 r0 = r10.f42299r
            if (r0 == 0) goto L_0x0084
            android.widget.TextView r0 = r0.f29479n
            goto L_0x0085
        L_0x0084:
            r0 = r1
        L_0x0085:
            if (r0 != 0) goto L_0x0088
            goto L_0x008b
        L_0x0088:
            r0.setVisibility(r3)
        L_0x008b:
            h92 r0 = r10.f42299r
            if (r0 == 0) goto L_0x0092
            android.widget.TextView r0 = r0.f29474i
            goto L_0x0093
        L_0x0092:
            r0 = r1
        L_0x0093:
            if (r0 != 0) goto L_0x0096
            goto L_0x0099
        L_0x0096:
            r0.setVisibility(r3)
        L_0x0099:
            h92 r0 = r10.f42299r
            if (r0 == 0) goto L_0x00a7
            android.widget.TextView r0 = r0.f29470e
            if (r0 == 0) goto L_0x00a7
            r2 = 2131952061(0x7f1301bd, float:1.9540554E38)
            r0.setText(r2)
        L_0x00a7:
            net.safemoon.androidwallet.viewmodels.CollectibleViewModel r0 = r10.mo57959L()
            k04 r0 = r0.mo61047P()
            java.lang.Object r0 = r0.getValue()
            net.safemoon.androidwallet.model.collectible.TYPE_DELETE_NFT r2 = net.safemoon.androidwallet.model.collectible.TYPE_DELETE_NFT.VISIBLE
            if (r0 != r2) goto L_0x01ec
            net.safemoon.androidwallet.viewmodels.CollectibleViewModel r0 = r10.mo57959L()
            java.util.List r0 = r0.mo61039H()
            if (r0 == 0) goto L_0x00c6
            int r0 = r0.size()
            goto L_0x00c7
        L_0x00c6:
            r0 = r4
        L_0x00c7:
            if (r0 <= 0) goto L_0x01a6
            h92 r0 = r10.f42299r
            if (r0 == 0) goto L_0x00d0
            android.widget.TextView r0 = r0.f29479n
            goto L_0x00d1
        L_0x00d0:
            r0 = r1
        L_0x00d1:
            if (r0 != 0) goto L_0x00d4
            goto L_0x00d7
        L_0x00d4:
            r0.setVisibility(r3)
        L_0x00d7:
            h92 r0 = r10.f42299r
            if (r0 == 0) goto L_0x00de
            android.widget.TextView r0 = r0.f29474i
            goto L_0x00df
        L_0x00de:
            r0 = r1
        L_0x00df:
            if (r0 != 0) goto L_0x00e2
            goto L_0x00e5
        L_0x00e2:
            r0.setVisibility(r3)
        L_0x00e5:
            r0 = 2131952060(0x7f1301bc, float:1.9540552E38)
            java.lang.String r0 = r10.getString(r0)
            java.lang.String r2 = "getString(R.string.empty…ctions_but_it_has_hidden)"
            p000.vx2.m53590f(r0, r2)
            r2 = 2131951663(0x7f13002f, float:1.9539747E38)
            java.lang.String r9 = r10.getString(r2)
            java.lang.String r2 = "getString(R.string.action_here)"
            p000.vx2.m53590f(r9, r2)
            r4 = 0
            r5 = 1
            r6 = 2
            r7 = 0
            r2 = r0
            r3 = r9
            int r2 = kotlin.text.StringsKt__StringsKt.m63100e0(r2, r3, r4, r5, r6, r7)
            if (r2 >= 0) goto L_0x012c
            r6 = 0
            r7 = 4
            r8 = 0
            java.lang.String r4 = "."
            java.lang.String r5 = ""
            r3 = r9
            java.lang.String r3 = p000.yb6.m74332I(r3, r4, r5, r6, r7, r8)
            r4 = 0
            r5 = 1
            r6 = 2
            r7 = 0
            r2 = r0
            int r2 = kotlin.text.StringsKt__StringsKt.m63100e0(r2, r3, r4, r5, r6, r7)
            if (r2 < 0) goto L_0x012c
            r6 = 0
            r7 = 4
            r8 = 0
            java.lang.String r4 = "."
            java.lang.String r5 = ""
            r3 = r9
            java.lang.String r9 = p000.yb6.m74332I(r3, r4, r5, r6, r7, r8)
        L_0x012c:
            if (r2 >= 0) goto L_0x0151
            r6 = 0
            r7 = 4
            r8 = 0
            java.lang.String r4 = "।"
            java.lang.String r5 = ""
            r3 = r9
            java.lang.String r3 = p000.yb6.m74332I(r3, r4, r5, r6, r7, r8)
            r4 = 0
            r5 = 1
            r6 = 2
            r7 = 0
            r2 = r0
            int r2 = kotlin.text.StringsKt__StringsKt.m63100e0(r2, r3, r4, r5, r6, r7)
            if (r2 < 0) goto L_0x0151
            r6 = 0
            r7 = 4
            r8 = 0
            java.lang.String r4 = "।"
            java.lang.String r5 = ""
            r3 = r9
            java.lang.String r9 = p000.yb6.m74332I(r3, r4, r5, r6, r7, r8)
        L_0x0151:
            android.text.SpannableString r8 = new android.text.SpannableString
            r8.<init>(r0)
            r4 = 0
            r5 = 1
            r6 = 2
            r7 = 0
            r2 = r0
            r3 = r9
            int r0 = kotlin.text.StringsKt__StringsKt.m63100e0(r2, r3, r4, r5, r6, r7)
            android.text.style.ForegroundColorSpan r2 = new android.text.style.ForegroundColorSpan
            android.content.Context r3 = r10.requireContext()
            r4 = 2131099754(0x7f06006a, float:1.781187E38)
            int r3 = p000.zr0.m31440c(r3, r4)
            r2.<init>(r3)
            int r3 = r9.length()
            int r3 = r3 + r0
            r4 = 33
            r8.setSpan(r2, r0, r3, r4)
            net.safemoon.androidwallet.fragments.collectibles.CollectibleFragment$g r2 = new net.safemoon.androidwallet.fragments.collectibles.CollectibleFragment$g
            r2.<init>(r10)
            int r3 = r9.length()
            int r3 = r3 + r0
            r8.setSpan(r2, r0, r3, r4)
            h92 r0 = r10.f42299r
            if (r0 == 0) goto L_0x018e
            android.widget.TextView r0 = r0.f29470e
            goto L_0x018f
        L_0x018e:
            r0 = r1
        L_0x018f:
            if (r0 != 0) goto L_0x0192
            goto L_0x0199
        L_0x0192:
            android.text.method.MovementMethod r2 = android.text.method.LinkMovementMethod.getInstance()
            r0.setMovementMethod(r2)
        L_0x0199:
            h92 r10 = r10.f42299r
            if (r10 == 0) goto L_0x019f
            android.widget.TextView r1 = r10.f29470e
        L_0x019f:
            if (r1 != 0) goto L_0x01a2
            goto L_0x01ec
        L_0x01a2:
            r1.setText(r8)
            goto L_0x01ec
        L_0x01a6:
            h92 r0 = r10.f42299r
            if (r0 == 0) goto L_0x01ad
            android.widget.TextView r0 = r0.f29479n
            goto L_0x01ae
        L_0x01ad:
            r0 = r1
        L_0x01ae:
            if (r0 != 0) goto L_0x01b1
            goto L_0x01b4
        L_0x01b1:
            r0.setVisibility(r4)
        L_0x01b4:
            h92 r0 = r10.f42299r
            if (r0 == 0) goto L_0x01ba
            android.widget.TextView r1 = r0.f29474i
        L_0x01ba:
            if (r1 != 0) goto L_0x01bd
            goto L_0x01c0
        L_0x01bd:
            r1.setVisibility(r4)
        L_0x01c0:
            h92 r0 = r10.f42299r
            if (r0 == 0) goto L_0x01ce
            android.widget.TextView r0 = r0.f29470e
            if (r0 == 0) goto L_0x01ce
            r1 = 2131952059(0x7f1301bb, float:1.954055E38)
            r0.setText(r1)
        L_0x01ce:
            h92 r0 = r10.f42299r
            if (r0 == 0) goto L_0x01dc
            android.widget.TextView r0 = r0.f29474i
            if (r0 == 0) goto L_0x01dc
            r1 = 2131952241(0x7f130271, float:1.954092E38)
            r0.setText(r1)
        L_0x01dc:
            h92 r0 = r10.f42299r
            if (r0 == 0) goto L_0x01ec
            android.widget.TextView r0 = r0.f29474i
            if (r0 == 0) goto L_0x01ec
            ni0 r1 = new ni0
            r1.<init>(r10)
            r0.setOnClickListener(r1)
        L_0x01ec:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.fragments.collectibles.CollectibleFragment.m67701b0(net.safemoon.androidwallet.fragments.collectibles.CollectibleFragment):void");
    }

    /* renamed from: c0 */
    public static final void m67702c0(CollectibleFragment collectibleFragment, View view) {
        vx2.m53591g(collectibleFragment, "this$0");
        collectibleFragment.mo57965d0();
    }

    /* renamed from: J */
    public final C7182hg mo57957J() {
        return (C7182hg) this.f42296A.getValue();
    }

    /* renamed from: K */
    public final h92 mo57958K() {
        return this.f42299r;
    }

    /* renamed from: L */
    public final CollectibleViewModel mo57959L() {
        return (CollectibleViewModel) this.f42301x.getValue();
    }

    /* renamed from: M */
    public final qj0 mo57960M() {
        return (qj0) this.f42300s.getValue();
    }

    /* renamed from: N */
    public final MultiWalletViewModel mo57961N() {
        return (MultiWalletViewModel) this.f42302y.getValue();
    }

    /* renamed from: O */
    public final void mo57962O(RoomCollection roomCollection) {
        yi0.C9640a a = yi0.m74449a(roomCollection);
        vx2.m53590f(a, "actionNavigationCollecti…              collection)");
        mo50753j(a);
    }

    /* renamed from: P */
    public final void mo57963P() {
        AppCompatImageView appCompatImageView;
        int i;
        h92 h92 = this.f42299r;
        if (h92 != null) {
            appCompatImageView = h92.f29467b;
        } else {
            appCompatImageView = null;
        }
        if (appCompatImageView != null) {
            List value = mo57959L().mo61041J().getValue();
            boolean z = false;
            if (value != null && (!value.isEmpty())) {
                z = true;
            }
            if (z || mo57957J().mo62906e() || vx2.m53586b(mo57959L().mo61046O().getValue(), Boolean.TRUE)) {
                i = zr0.m31440c(requireContext(), R.color.wallet_name_color);
            } else {
                i = zr0.m31440c(requireContext(), R.color.t_all_light);
            }
            appCompatImageView.setImageTintList(ColorStateList.valueOf(i));
        }
    }

    /* renamed from: Q */
    public final void mo57964Q(int i, int i2) {
        try {
            mo57960M().mo65477e(i, i2);
        } catch (Exception unused) {
        }
    }

    /* renamed from: d0 */
    public final void mo57965d0() {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(f42295H)));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        vx2.m53591g(layoutInflater, "inflater");
        h92 a = h92.m45069a(LayoutInflater.from(requireContext()).inflate(R.layout.fragment_collectibles, viewGroup, false));
        this.f42299r = a;
        if (a != null) {
            return a.mo43107b();
        }
        return null;
    }

    public void onPause() {
        super.onPause();
        OnSelectTokenTypeClickListener onSelectTokenTypeClickListener = this.f42297B;
        if (onSelectTokenTypeClickListener != null) {
            onSelectTokenTypeClickListener.mo57365b();
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        String str;
        cf3 cf3;
        MaterialButton materialButton;
        vx2.m53591g(view, "view");
        super.onViewCreated(view, bundle);
        if (bundle == null) {
            requireActivity().getOnBackPressedDispatcher().mo912a(getViewLifecycleOwner(), new C8519b(this));
        }
        ProgressLoading.C8308a aVar = ProgressLoading.f41785Y;
        String string = getString(R.string.loading);
        vx2.m53590f(string, "getString(R.string.loading)");
        this.f42298k = aVar.mo57297a(false, string, "");
        h92 h92 = this.f42299r;
        if (h92 != null) {
            h92.f29475j.setLayoutManager(new GridLayoutManager(getContext(), 2));
            h92.f29475j.setAdapter(mo57960M());
            h92.f29475j.mo9079k(new C8520c(this));
            new C1314k(new C8521d(this)).mo9836g(h92.f29475j);
            C8522e eVar = new C8522e(this, new C8523f(this), new WeakReference(requireActivity()), mo57959L().mo61032A());
            this.f42297B = eVar;
            h92 h922 = this.f42299r;
            if (!(h922 == null || (cf3 = h922.f29473h) == null || (materialButton = cf3.f21727b) == null)) {
                materialButton.setOnClickListener(eVar);
            }
            h92.f29476k.setOnRefreshListener(new mi0(h92));
            h92.f29468c.setOnClickListener(new oi0(this));
            h92.f29467b.setOnClickListener(new pi0(this));
            Wallet.Companion companion = Wallet.Companion;
            String j = f06.m57519j(getContext(), "SAFEMOON_ACTIVE_WALLET", "");
            vx2.m53590f(j, "getString(\n             …     \"\"\n                )");
            Wallet wallet2 = companion.toWallet(j);
            if (wallet2 != null) {
                str = wallet2.displayName();
            } else {
                str = null;
            }
            h92.f29478m.setText(str);
            h92.f29478m.setOnClickListener(new qi0(this, h92));
        }
        mo57959L().mo61041J().observe(getViewLifecycleOwner(), new ri0(new CollectibleFragment$onViewCreated$3(this)));
        mo57959L().mo61046O().observe(getViewLifecycleOwner(), new si0(new CollectibleFragment$onViewCreated$4(this)));
        mo57959L().mo61051T().observe(getViewLifecycleOwner(), new ti0(new CollectibleFragment$onViewCreated$5(this)));
        mo57959L().mo61040I().observe(getViewLifecycleOwner(), new ui0(new CollectibleFragment$onViewCreated$6(this)));
        mo57959L().mo61047P().observe(getViewLifecycleOwner(), new vi0(new CollectibleFragment$onViewCreated$7(this)));
        mo57959L().mo61045N().observe(getViewLifecycleOwner(), new wi0(new CollectibleFragment$onViewCreated$8(this)));
    }
}
