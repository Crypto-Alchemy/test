package p000;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.model.wallets.Wallet;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB[\u0012\u0006\u0010\u001f\u001a\u00020\u001a\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0015\u0012\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\n\u0018\u00010$\u0012\u0014\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\n\u0018\u00010$\u0012\u0014\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\n\u0018\u00010$¢\u0006\u0004\b3\u00104J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016J\u0016\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005J\u0010\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010J\u0014\u0010\u0017\u001a\u00020\n2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014J\u001a\u0010\u0019\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0018\u001a\u00020\u0012H\u0002R\u0017\u0010\u001f\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010#\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b!\u0010\"R%\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\n\u0018\u00010$8\u0006¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010'R%\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\n\u0018\u00010$8\u0006¢\u0006\f\n\u0004\b\u0017\u0010%\u001a\u0004\b)\u0010'R%\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\n\u0018\u00010$8\u0006¢\u0006\f\n\u0004\b+\u0010%\u001a\u0004\b,\u0010'R\u001d\u00102\u001a\b\u0012\u0004\u0012\u00020\u00150.8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b\u001b\u00101¨\u00065"}, mo44877d2 = {"Ld24;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Ld24$a;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "e", "holder", "position", "Lr37;", "d", "getItemCount", "fromPosition", "toPosition", "c", "Landroidx/recyclerview/widget/RecyclerView$a0;", "viewHolder", "", "b", "", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "newItemList", "g", "isAllowed", "f", "Landroid/content/Context;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "getActiveWallet", "()Lnet/safemoon/androidwallet/model/wallets/Wallet;", "activeWallet", "Lkotlin/Function1;", "Lrc2;", "getCallBack", "()Lrc2;", "callBack", "getCallMenu", "callMenu", "k", "getCallLink", "callLink", "", "r", "Ljava/util/List;", "()Ljava/util/List;", "movingList", "<init>", "(Landroid/content/Context;Lnet/safemoon/androidwallet/model/wallets/Wallet;Lrc2;Lrc2;Lrc2;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: d24 */
/* compiled from: MyWalletsAdapter.kt */
public final class d24 extends RecyclerView.Adapter<C6959a> {

    /* renamed from: a */
    public final Context f37230a;

    /* renamed from: d */
    public final Wallet f37231d;

    /* renamed from: e */
    public final rc2<Wallet, r37> f37232e;

    /* renamed from: g */
    public final rc2<Wallet, r37> f37233g;

    /* renamed from: k */
    public final rc2<Wallet, r37> f37234k;

    /* renamed from: r */
    public final List<Wallet> f37235r = new ArrayList();

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013JX\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006R\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, mo44877d2 = {"Ld24$a;", "Landroidx/recyclerview/widget/RecyclerView$a0;", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "wallet", "", "listSize", "Lkotlin/Function1;", "Lr37;", "callBack", "callMenu", "callLink", "d", "Lsm2;", "a", "Lsm2;", "getBinding", "()Lsm2;", "binding", "<init>", "(Lsm2;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: d24$a */
    /* compiled from: MyWalletsAdapter.kt */
    public static final class C6959a extends RecyclerView.C1231a0 {

        /* renamed from: a */
        public final sm2 f37236a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6959a(sm2 sm2) {
            super(sm2.mo47831b());
            vx2.m53591g(sm2, "binding");
            this.f37236a = sm2;
        }

        /* renamed from: e */
        public static final void m56639e(rc2 rc2, Wallet wallet2, View view) {
            vx2.m53591g(wallet2, "$wallet");
            if (rc2 != null) {
                rc2.invoke(wallet2);
            }
        }

        /* renamed from: f */
        public static final void m56640f(rc2 rc2, Wallet wallet2, View view) {
            vx2.m53591g(wallet2, "$wallet");
            if (rc2 != null) {
                rc2.invoke(wallet2);
            }
        }

        /* renamed from: g */
        public static final void m56641g(rc2 rc2, Wallet wallet2, View view) {
            vx2.m53591g(wallet2, "$wallet");
            if (rc2 != null) {
                rc2.invoke(wallet2);
            }
        }

        /* renamed from: d */
        public final void mo51041d(Wallet wallet2, int i, rc2<? super Wallet, r37> rc2, rc2<? super Wallet, r37> rc22, rc2<? super Wallet, r37> rc23) {
            Long l;
            vx2.m53591g(wallet2, "wallet");
            sm2 sm2 = this.f37236a;
            Context context = sm2.mo47831b().getContext();
            vx2.m53590f(context, "context");
            Wallet c = ol0.m70351c(context);
            sm2.f33953h.setText(wallet2.displayName());
            sm2.f33952g.setOnClickListener(new a24(rc2, wallet2));
            sm2.f33948c.setOnClickListener(new b24(rc22, wallet2));
            sm2.f33950e.setOnClickListener(new c24(rc23, wallet2));
            if (c != null) {
                l = c.getId();
            } else {
                l = null;
            }
            if (vx2.m53586b(l, wallet2.getId())) {
                sm2.f33953h.setTypeface((Typeface) null, 1);
                sm2.f33953h.setTextColor(context.getColorStateList(R.color.dark_green));
                sm2.f33949d.setBackgroundTintList(sm2.mo47831b().getContext().getColorStateList(R.color.active_wallet));
            } else {
                sm2.f33949d.setBackgroundTintList(sm2.mo47831b().getContext().getColorStateList(R.color.card_bg_1));
                sm2.f33953h.setTypeface((Typeface) null, 0);
                sm2.f33953h.setTextColor(context.getColorStateList(R.color.t1));
            }
            if (!wallet2.isPrimaryWallet()) {
                sm2.f33950e.setVisibility(0);
                ViewGroup.LayoutParams layoutParams = sm2.f33950e.getLayoutParams();
                vx2.m53589e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                layoutParams2.width = context.getResources().getDimensionPixelSize(R.dimen._22sdp);
                layoutParams2.height = context.getResources().getDimensionPixelSize(R.dimen._22sdp);
                sm2.f33950e.setLayoutParams(layoutParams2);
                ViewGroup.LayoutParams layoutParams3 = sm2.f33953h.getLayoutParams();
                vx2.m53589e(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
                layoutParams4.setMarginStart(context.getResources().getDimensionPixelSize(R.dimen._8sdp));
                sm2.f33953h.setLayoutParams(layoutParams4);
                if (wallet2.isLinked()) {
                    sm2.f33950e.setImageResource(R.drawable.ic_wallet_linked);
                } else {
                    sm2.f33950e.setImageResource(R.drawable.ic_wallet_unlinked);
                }
            } else if (i > 1) {
                ViewGroup.LayoutParams layoutParams5 = sm2.f33950e.getLayoutParams();
                vx2.m53589e(layoutParams5, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.LayoutParams layoutParams6 = (ConstraintLayout.LayoutParams) layoutParams5;
                layoutParams6.width = context.getResources().getDimensionPixelSize(R.dimen._22sdp);
                layoutParams6.height = context.getResources().getDimensionPixelSize(R.dimen._29sdp);
                sm2.f33950e.setLayoutParams(layoutParams6);
                ViewGroup.LayoutParams layoutParams7 = sm2.f33953h.getLayoutParams();
                vx2.m53589e(layoutParams7, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.LayoutParams layoutParams8 = (ConstraintLayout.LayoutParams) layoutParams7;
                layoutParams8.setMarginStart(context.getResources().getDimensionPixelSize(R.dimen._8sdp));
                sm2.f33953h.setLayoutParams(layoutParams8);
                sm2.f33950e.setVisibility(0);
                if (g06.f37938a.mo51835d(context)) {
                    sm2.f33950e.setImageResource(R.drawable.ic_wallets_link_all);
                } else {
                    sm2.f33950e.setImageResource(R.drawable.ic_wallets_unlink_all);
                }
            } else {
                ViewGroup.LayoutParams layoutParams9 = sm2.f33953h.getLayoutParams();
                vx2.m53589e(layoutParams9, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.LayoutParams layoutParams10 = (ConstraintLayout.LayoutParams) layoutParams9;
                layoutParams10.setMarginStart(context.getResources().getDimensionPixelSize(R.dimen._3sdp));
                sm2.f33953h.setLayoutParams(layoutParams10);
                sm2.f33950e.setVisibility(8);
            }
        }
    }

    public d24(Context context, Wallet wallet2, rc2<? super Wallet, r37> rc2, rc2<? super Wallet, r37> rc22, rc2<? super Wallet, r37> rc23) {
        vx2.m53591g(context, "context");
        this.f37230a = context;
        this.f37231d = wallet2;
        this.f37232e = rc2;
        this.f37233g = rc22;
        this.f37234k = rc23;
    }

    /* renamed from: a */
    public final List<Wallet> mo51034a() {
        return this.f37235r;
    }

    /* renamed from: b */
    public final boolean mo51035b(RecyclerView.C1231a0 a0Var) {
        if (a0Var == null) {
            return false;
        }
        return a0Var.itemView.isSelected();
    }

    /* renamed from: c */
    public final void mo51036c(int i, int i2) {
        Wallet wallet2 = this.f37235r.get(i2);
        if (!this.f37235r.get(i).isPrimaryWallet() && !wallet2.isPrimaryWallet()) {
            Collections.swap(this.f37235r, i, i2);
            notifyItemMoved(i, i2);
        }
    }

    /* renamed from: d */
    public void onBindViewHolder(C6959a aVar, int i) {
        boolean z;
        Long l;
        vx2.m53591g(aVar, "holder");
        Wallet wallet2 = this.f37235r.get(i);
        aVar.mo51041d(wallet2, this.f37235r.size(), this.f37232e, this.f37233g, this.f37234k);
        if (!wallet2.isPrimaryWallet()) {
            Long id = wallet2.getId();
            Wallet wallet3 = this.f37231d;
            if (wallet3 != null) {
                l = wallet3.getId();
            } else {
                l = null;
            }
            if (!vx2.m53586b(id, l)) {
                z = true;
                mo51039f(aVar, z);
            }
        }
        z = false;
        mo51039f(aVar, z);
    }

    /* renamed from: e */
    public C6959a onCreateViewHolder(ViewGroup viewGroup, int i) {
        vx2.m53591g(viewGroup, "parent");
        sm2 a = sm2.m51858a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.holder_wallet, viewGroup, false));
        vx2.m53590f(a, "bind(\n                La…ent, false)\n            )");
        return new C6959a(a);
    }

    /* renamed from: f */
    public final void mo51039f(RecyclerView.C1231a0 a0Var, boolean z) {
        if (a0Var != null) {
            a0Var.itemView.setSelected(z);
        }
    }

    /* renamed from: g */
    public final void mo51040g(List<Wallet> list) {
        vx2.m53591g(list, "newItemList");
        this.f37235r.clear();
        this.f37235r.addAll(list);
        notifyDataSetChanged();
    }

    public int getItemCount() {
        return this.f37235r.size();
    }
}
