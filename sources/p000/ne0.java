package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C1710a;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.mlkit.common.MlKitException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.text.StringsKt__StringsKt;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.utils.Common;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u00012\u00020\u0003:\u0002\u0011\u001fB#\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000b0\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u001c\u0010\b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u001c\u0010\f\u001a\u00020\u000b2\n\u0010\t\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\n\u001a\u00020\u0006H\u0016J\b\u0010\r\u001a\u00020\u0006H\u0016J\f\u0010\u000f\u001a\u00060\u000eR\u00020\u0000H\u0016R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000b0\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00100\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00100\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019¨\u0006 "}, mo44877d2 = {"Lne0;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lne0$b;", "Landroid/widget/Filterable;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "g", "holder", "position", "Lr37;", "f", "getItemCount", "Lne0$a;", "e", "Lnet/safemoon/androidwallet/common/TokenType;", "a", "Lnet/safemoon/androidwallet/common/TokenType;", "tokenType", "Lkotlin/Function1;", "d", "Lrc2;", "callBack", "", "Ljava/util/List;", "chains", "", "listOfChain", "<init>", "(Lnet/safemoon/androidwallet/common/TokenType;Lrc2;)V", "b", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: ne0 */
/* compiled from: ChooseNetworkAdapter.kt */
public final class ne0 extends RecyclerView.Adapter<C7938b> implements Filterable {

    /* renamed from: a */
    public final TokenType f41156a;

    /* renamed from: d */
    public final rc2<TokenType, r37> f41157d;

    /* renamed from: e */
    public final List<TokenType> f41158e;

    /* renamed from: g */
    public final List<TokenType> f41159g;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u001c\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0014¨\u0006\u000b"}, mo44877d2 = {"Lne0$a;", "Landroid/widget/Filter;", "", "constraint", "Landroid/widget/Filter$FilterResults;", "performFiltering", "results", "Lr37;", "publishResults", "<init>", "(Lne0;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: ne0$a */
    /* compiled from: ChooseNetworkAdapter.kt */
    public final class C7937a extends Filter {
        public C7937a() {
        }

        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            String obj;
            String obj2;
            boolean z;
            Filter.FilterResults filterResults = new Filter.FilterResults();
            filterResults.values = ne0.this.f41158e;
            if (!(charSequence == null || (obj = charSequence.toString()) == null || (obj2 = StringsKt__StringsKt.m63090V0(obj).toString()) == null)) {
                String lowerCase = obj2.toLowerCase(Locale.ROOT);
                vx2.m53590f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                if (lowerCase != null) {
                    List b = ne0.this.f41158e;
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
                ne0 ne0 = ne0.this;
                ne0.f41159g.clear();
                List c = ne0.f41159g;
                Object obj = filterResults.values;
                vx2.m53589e(obj, "null cannot be cast to non-null type java.util.ArrayList<net.safemoon.androidwallet.common.TokenType>{ kotlin.collections.TypeAliasesKt.ArrayList<net.safemoon.androidwallet.common.TokenType> }");
                c.addAll((ArrayList) obj);
                ne0.notifyDataSetChanged();
            }
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, mo44877d2 = {"Lne0$b;", "Landroidx/recyclerview/widget/RecyclerView$a0;", "Lnet/safemoon/androidwallet/common/TokenType;", "_tokenType", "Lr37;", "b", "Llm2;", "a", "Llm2;", "binding", "<init>", "(Lne0;Llm2;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: ne0$b */
    /* compiled from: ChooseNetworkAdapter.kt */
    public final class C7938b extends RecyclerView.C1231a0 {

        /* renamed from: a */
        public final lm2 f41161a;

        /* renamed from: b */
        public final /* synthetic */ ne0 f41162b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7938b(ne0 ne0, lm2 lm2) {
            super(lm2.mo45448b());
            vx2.m53591g(lm2, "binding");
            this.f41162b = ne0;
            this.f41161a = lm2;
        }

        /* renamed from: c */
        public static final void m64641c(ne0 ne0, TokenType tokenType, View view) {
            vx2.m53591g(ne0, "this$0");
            vx2.m53591g(tokenType, "$tt");
            ne0.f41157d.invoke(tokenType);
        }

        /* renamed from: b */
        public final void mo56468b(TokenType tokenType) {
            boolean z;
            vx2.m53591g(tokenType, "_tokenType");
            ne0 ne0 = this.f41162b;
            lm2 lm2 = this.f41161a;
            lm2.f31338e.setText(tokenType.getTitle());
            ((be5) C1710a.m12225u(lm2.f31337d).mo23162w(Integer.valueOf(tokenType.getIcon())).mo22581g0(MlKitException.CODE_SCANNER_UNAVAILABLE, MlKitException.CODE_SCANNER_UNAVAILABLE)).mo11567a(qe5.m25623x0()).mo11553K0(lm2.f31337d);
            lm2.mo45448b().setOnClickListener(new oe0(ne0, tokenType));
            MaterialCheckBox materialCheckBox = lm2.f31335b;
            if (ne0.f41156a.getChainId() == tokenType.getChainId()) {
                z = true;
            } else {
                z = false;
            }
            materialCheckBox.setChecked(z);
        }
    }

    public ne0(TokenType tokenType, rc2<? super TokenType, r37> rc2) {
        vx2.m53591g(tokenType, "tokenType");
        vx2.m53591g(rc2, "callBack");
        this.f41156a = tokenType;
        this.f41157d = rc2;
        List<TokenType> E = Common.f42577a.mo60895E();
        this.f41158e = E;
        ArrayList arrayList = new ArrayList();
        this.f41159g = arrayList;
        arrayList.addAll(E);
    }

    /* renamed from: e */
    public C7937a getFilter() {
        return new C7937a();
    }

    /* renamed from: f */
    public void onBindViewHolder(C7938b bVar, int i) {
        vx2.m53591g(bVar, "holder");
        bVar.mo56468b(this.f41159g.get(i));
    }

    /* renamed from: g */
    public C7938b onCreateViewHolder(ViewGroup viewGroup, int i) {
        vx2.m53591g(viewGroup, "parent");
        lm2 a = lm2.m47842a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.holder_choose_network, viewGroup, false));
        vx2.m53590f(a, "bind(\n                La…ent, false)\n            )");
        return new C7938b(this, a);
    }

    public int getItemCount() {
        return this.f41159g.size();
    }
}
