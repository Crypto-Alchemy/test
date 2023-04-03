package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C1710a;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.textview.MaterialTextView;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.text.StringsKt__StringsKt;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.model.swap.Swap;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\t\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u00012\u00020\u0003:\u0002\u0018\u001fB\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0014\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u001c\u0010\f\u001a\u00020\u00072\n\u0010\t\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u001c\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nH\u0016J\u001c\u0010\u0013\u001a\u00020\u00072\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0011J\b\u0010\u0014\u001a\u00020\nH\u0016J\f\u0010\u0016\u001a\u00060\u0015R\u00020\u0000H\u0016R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0019R$\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001b¨\u0006 "}, mo44877d2 = {"Lbj6;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lbj6$a;", "Landroid/widget/Filterable;", "", "Lnet/safemoon/androidwallet/model/swap/Swap;", "tokens", "Lr37;", "g", "holder", "", "position", "e", "Landroid/view/ViewGroup;", "parent", "viewType", "f", "Lkotlin/Function1;", "onClick", "h", "getItemCount", "Lbj6$b;", "d", "", "a", "Ljava/util/List;", "backUpTokens", "Lrc2;", "onClickListner", "<init>", "()V", "b", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: bj6 */
/* compiled from: SwapTokenAdapter.kt */
public final class bj6 extends RecyclerView.Adapter<C6866a> implements Filterable {

    /* renamed from: a */
    public List<Swap> f36835a = new ArrayList();

    /* renamed from: d */
    public final List<Swap> f36836d = new ArrayList();

    /* renamed from: e */
    public rc2<? super Swap, r37> f36837e;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, mo44877d2 = {"Lbj6$a;", "Landroidx/recyclerview/widget/RecyclerView$a0;", "", "position", "Lr37;", "b", "Lkc7;", "a", "Lkc7;", "getBinding", "()Lkc7;", "binding", "<init>", "(Lbj6;Lkc7;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: bj6$a */
    /* compiled from: SwapTokenAdapter.kt */
    public final class C6866a extends RecyclerView.C1231a0 {

        /* renamed from: a */
        public final kc7 f36838a;

        /* renamed from: b */
        public final /* synthetic */ bj6 f36839b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6866a(bj6 bj6, kc7 kc7) {
            super(kc7.mo44742b());
            vx2.m53591g(kc7, "binding");
            this.f36839b = bj6;
            this.f36838a = kc7;
        }

        /* renamed from: c */
        public static final void m56004c(bj6 bj6, Swap swap, View view) {
            vx2.m53591g(bj6, "this$0");
            vx2.m53591g(swap, "$item");
            rc2 b = bj6.f36837e;
            if (b != null) {
                b.invoke(swap);
            }
        }

        /* renamed from: b */
        public final void mo50608b(int i) {
            boolean z;
            boolean z2;
            Object obj;
            Swap swap = (Swap) this.f36839b.f36835a.get(i);
            kc7 kc7 = this.f36838a;
            bj6 bj6 = this.f36839b;
            String str = swap.logoURI;
            vx2.m53590f(str, "item.logoURI");
            boolean z3 = true;
            int i2 = 0;
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z || swap.imageResource > 0) {
                me5 u = C1710a.m12225u(kc7.f30801b);
                String str2 = swap.logoURI;
                vx2.m53590f(str2, "item.logoURI");
                if (str2.length() > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    obj = swap.logoURI;
                } else {
                    obj = Integer.valueOf(swap.imageResource);
                }
                ((be5) u.mo23163x(obj).mo22581g0(150, 150)).mo11567a(qe5.m25623x0()).mo11553K0(kc7.f30801b);
            }
            kc7.f30805f.setText(swap.name + " (" + swap.symbol + ")");
            MaterialTextView materialTextView = kc7.f30802c;
            vx2.m53590f(materialTextView, "txtTokenBal");
            Double d = swap.nativeBalance;
            vx2.m53590f(d, "it.nativeBalance");
            if (d.doubleValue() <= Utils.DOUBLE_EPSILON) {
                z3 = false;
            }
            if (!z3) {
                i2 = 8;
            }
            materialTextView.setVisibility(i2);
            MaterialTextView materialTextView2 = kc7.f30802c;
            Double d2 = swap.nativeBalance;
            vx2.m53590f(d2, "it.nativeBalance");
            materialTextView2.setText(ol0.m70374p(d2.doubleValue(), 0, (RoundingMode) null, false, 7, (Object) null));
            kc7.mo44742b().setOnClickListener(new aj6(bj6, swap));
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u001c\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0014¨\u0006\u000b"}, mo44877d2 = {"Lbj6$b;", "Landroid/widget/Filter;", "", "constraint", "Landroid/widget/Filter$FilterResults;", "performFiltering", "results", "Lr37;", "publishResults", "<init>", "(Lbj6;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: bj6$b */
    /* compiled from: SwapTokenAdapter.kt */
    public final class C6867b extends Filter {
        public C6867b() {
        }

        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            String obj;
            String obj2;
            boolean z;
            Filter.FilterResults filterResults = new Filter.FilterResults();
            filterResults.values = bj6.this.f36836d;
            if (!(charSequence == null || (obj = charSequence.toString()) == null || (obj2 = StringsKt__StringsKt.m63090V0(obj).toString()) == null)) {
                String lowerCase = obj2.toLowerCase(Locale.ROOT);
                vx2.m53590f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                if (lowerCase != null) {
                    List a = bj6.this.f36836d;
                    ArrayList arrayList = new ArrayList();
                    for (Object next : a) {
                        Swap swap = (Swap) next;
                        boolean z2 = true;
                        if (lowerCase.length() == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            String str = swap.name;
                            vx2.m53590f(str, "it.name");
                            Locale locale = Locale.ROOT;
                            String lowerCase2 = str.toLowerCase(locale);
                            vx2.m53590f(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                            if (!StringsKt__StringsKt.m63081R(lowerCase2, lowerCase, false, 2, (Object) null)) {
                                String str2 = swap.symbol;
                                vx2.m53590f(str2, "it.symbol");
                                String lowerCase3 = str2.toLowerCase(locale);
                                vx2.m53590f(lowerCase3, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                if (!StringsKt__StringsKt.m63081R(lowerCase3, lowerCase, false, 2, (Object) null)) {
                                    z2 = false;
                                }
                            }
                        }
                        if (z2) {
                            arrayList.add(next);
                        }
                    }
                    filterResults.values = arrayList;
                }
            }
            return filterResults;
        }

        public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            if (filterResults != null && filterResults.values != null) {
                bj6 bj6 = bj6.this;
                bj6.f36835a.clear();
                List c = bj6.f36835a;
                Object obj = filterResults.values;
                vx2.m53589e(obj, "null cannot be cast to non-null type kotlin.collections.Collection<net.safemoon.androidwallet.model.swap.Swap>");
                c.addAll((Collection) obj);
                bj6.notifyDataSetChanged();
            }
        }
    }

    /* renamed from: d */
    public C6867b getFilter() {
        return new C6867b();
    }

    /* renamed from: e */
    public void onBindViewHolder(C6866a aVar, int i) {
        vx2.m53591g(aVar, "holder");
        aVar.mo50608b(i);
    }

    /* renamed from: f */
    public C6866a onCreateViewHolder(ViewGroup viewGroup, int i) {
        vx2.m53591g(viewGroup, "parent");
        kc7 a = kc7.m46957a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.view_holder_swap, viewGroup, false));
        vx2.m53590f(a, "bind(LayoutInflater.from…der_swap, parent, false))");
        return new C6866a(this, a);
    }

    /* renamed from: g */
    public final void mo50605g(List<? extends Swap> list) {
        vx2.m53591g(list, "tokens");
        this.f36836d.clear();
        this.f36836d.addAll(list);
    }

    public int getItemCount() {
        return this.f36835a.size();
    }

    /* renamed from: h */
    public final void mo50607h(rc2<? super Swap, r37> rc2) {
        this.f36837e = rc2;
    }
}
