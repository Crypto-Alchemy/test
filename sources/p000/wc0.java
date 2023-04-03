package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C1710a;
import com.google.mlkit.common.MlKitException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.text.StringsKt__StringsKt;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.utils.Common;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u00012\u00020\u0003:\u0002\u0012\u001cB\u001b\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000b0\u0010¢\u0006\u0004\b\u001a\u0010\u001bJ\u001c\u0010\b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u001c\u0010\f\u001a\u00020\u000b2\n\u0010\t\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\n\u001a\u00020\u0006H\u0016J\b\u0010\r\u001a\u00020\u0006H\u0016J\f\u0010\u000f\u001a\u00060\u000eR\u00020\u0000H\u0016R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000b0\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00110\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0016¨\u0006\u001d"}, mo44877d2 = {"Lwc0;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lwc0$b;", "Landroid/widget/Filterable;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "f", "holder", "position", "Lr37;", "e", "getItemCount", "Lwc0$a;", "d", "Lkotlin/Function1;", "Lnet/safemoon/androidwallet/common/TokenType;", "a", "Lrc2;", "callBack", "", "Ljava/util/List;", "chains", "", "listOfChain", "<init>", "(Lrc2;)V", "b", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: wc0 */
/* compiled from: ChainNetworkAdapter.kt */
public final class wc0 extends RecyclerView.Adapter<C9514b> implements Filterable {

    /* renamed from: a */
    public final rc2<TokenType, r37> f45492a;

    /* renamed from: d */
    public final List<TokenType> f45493d;

    /* renamed from: e */
    public final List<TokenType> f45494e;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u001c\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0014¨\u0006\u000b"}, mo44877d2 = {"Lwc0$a;", "Landroid/widget/Filter;", "", "constraint", "Landroid/widget/Filter$FilterResults;", "performFiltering", "results", "Lr37;", "publishResults", "<init>", "(Lwc0;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: wc0$a */
    /* compiled from: ChainNetworkAdapter.kt */
    public final class C9513a extends Filter {
        public C9513a() {
        }

        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            String obj;
            String obj2;
            boolean z;
            Filter.FilterResults filterResults = new Filter.FilterResults();
            filterResults.values = wc0.this.f45493d;
            if (!(charSequence == null || (obj = charSequence.toString()) == null || (obj2 = StringsKt__StringsKt.m63090V0(obj).toString()) == null)) {
                String lowerCase = obj2.toLowerCase(Locale.ROOT);
                vx2.m53590f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                if (lowerCase != null) {
                    List b = wc0.this.f45493d;
                    ArrayList arrayList = new ArrayList();
                    for (Object next : b) {
                        TokenType tokenType = (TokenType) next;
                        boolean z2 = true;
                        if (lowerCase.length() == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            String lowerCase2 = tokenType.getPlaneName().toLowerCase(Locale.ROOT);
                            vx2.m53590f(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                            if (!StringsKt__StringsKt.m63081R(lowerCase2, lowerCase, false, 2, (Object) null)) {
                                z2 = false;
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
                wc0 wc0 = wc0.this;
                wc0.f45494e.clear();
                List c = wc0.f45494e;
                Object obj = filterResults.values;
                vx2.m53589e(obj, "null cannot be cast to non-null type java.util.ArrayList<net.safemoon.androidwallet.common.TokenType>{ kotlin.collections.TypeAliasesKt.ArrayList<net.safemoon.androidwallet.common.TokenType> }");
                c.addAll((ArrayList) obj);
                wc0.notifyDataSetChanged();
            }
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, mo44877d2 = {"Lwc0$b;", "Landroidx/recyclerview/widget/RecyclerView$a0;", "Lnet/safemoon/androidwallet/common/TokenType;", "tokenType", "Lr37;", "b", "Lkm2;", "a", "Lkm2;", "binding", "<init>", "(Lwc0;Lkm2;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: wc0$b */
    /* compiled from: ChainNetworkAdapter.kt */
    public final class C9514b extends RecyclerView.C1231a0 {

        /* renamed from: a */
        public final km2 f45496a;

        /* renamed from: b */
        public final /* synthetic */ wc0 f45497b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9514b(wc0 wc0, km2 km2) {
            super(km2.mo44842b());
            vx2.m53591g(km2, "binding");
            this.f45497b = wc0;
            this.f45496a = km2;
        }

        /* renamed from: c */
        public static final void m73539c(wc0 wc0, TokenType tokenType, View view) {
            vx2.m53591g(wc0, "this$0");
            vx2.m53591g(tokenType, "$tt");
            wc0.f45492a.invoke(tokenType);
        }

        /* renamed from: b */
        public final void mo66678b(TokenType tokenType) {
            vx2.m53591g(tokenType, "tokenType");
            wc0 wc0 = this.f45497b;
            km2 km2 = this.f45496a;
            km2.f30930e.setText(tokenType.getTitle());
            ((be5) C1710a.m12225u(km2.f30929d).mo23162w(Integer.valueOf(tokenType.getIcon())).mo22581g0(MlKitException.CODE_SCANNER_UNAVAILABLE, MlKitException.CODE_SCANNER_UNAVAILABLE)).mo11567a(qe5.m25623x0()).mo11553K0(km2.f30929d);
            km2.mo44842b().setOnClickListener(new xc0(wc0, tokenType));
        }
    }

    public wc0(rc2<? super TokenType, r37> rc2) {
        vx2.m53591g(rc2, "callBack");
        this.f45492a = rc2;
        List<TokenType> b = Common.m68290b(Common.f42577a, false, 1, (Object) null);
        this.f45493d = b;
        ArrayList arrayList = new ArrayList();
        this.f45494e = arrayList;
        arrayList.addAll(b);
    }

    /* renamed from: d */
    public C9513a getFilter() {
        return new C9513a();
    }

    /* renamed from: e */
    public void onBindViewHolder(C9514b bVar, int i) {
        vx2.m53591g(bVar, "holder");
        bVar.mo66678b(this.f45494e.get(i));
    }

    /* renamed from: f */
    public C9514b onCreateViewHolder(ViewGroup viewGroup, int i) {
        vx2.m53591g(viewGroup, "parent");
        km2 a = km2.m47174a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.holder_chain_network, viewGroup, false));
        vx2.m53590f(a, "bind(\n                La…ent, false)\n            )");
        return new C9514b(this, a);
    }

    public int getItemCount() {
        return this.f45494e.size();
    }
}
