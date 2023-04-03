package p000;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.checkbox.MaterialCheckBox;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.database.room.ApplicationRoomDatabase;
import net.safemoon.androidwallet.utils.Common;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0013'B'\u0012\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000ej\b\u0012\u0004\u0012\u00020\f`\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0016¢\u0006\u0004\b%\u0010&J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0005J\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000ej\b\u0012\u0004\u0012\u00020\f`\u000fJ\b\u0010\u0011\u001a\u00020\u0005H\u0016J\u000e\u0010\u0012\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0005R$\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000ej\b\u0012\u0004\u0012\u00020\f`\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020!0 8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006("}, mo44877d2 = {"Lyc;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lyc$a;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "h", "holder", "position", "Lr37;", "e", "Lvc;", "c", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "d", "getItemCount", "removeItem", "a", "Ljava/util/ArrayList;", "items", "Lyc$b;", "Lyc$b;", "onItemCheckChangedListener", "Lry2;", "Lry2;", "binding", "Landroid/content/res/Resources;", "g", "Landroid/content/res/Resources;", "resources", "", "", "k", "Ljava/util/List;", "defaultTokens", "<init>", "(Ljava/util/ArrayList;Lyc$b;)V", "b", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: yc */
/* compiled from: AddNewTokensAdapter.kt */
public final class C9633yc extends RecyclerView.Adapter<C9634a> {

    /* renamed from: a */
    public final ArrayList<C9449vc> f46152a;

    /* renamed from: d */
    public final C9635b f46153d;

    /* renamed from: e */
    public ry2 f46154e;

    /* renamed from: g */
    public Resources f46155g;

    /* renamed from: k */
    public final List<String> f46156k;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0017\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\t\u0010\u0016R\u0017\u0010\u001c\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010 \u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001e\u001a\u0004\b\u0003\u0010\u001fR\u0017\u0010\"\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\u000f\u0010\u001b¨\u0006%"}, mo44877d2 = {"Lyc$a;", "Landroidx/recyclerview/widget/RecyclerView$a0;", "Lry2;", "a", "Lry2;", "getBinding", "()Lry2;", "binding", "Landroid/widget/ImageView;", "b", "Landroid/widget/ImageView;", "d", "()Landroid/widget/ImageView;", "ivTokenIcon", "Landroid/widget/TextView;", "c", "Landroid/widget/TextView;", "f", "()Landroid/widget/TextView;", "tvTokenNameAndSymbol", "Lcom/google/android/material/checkbox/MaterialCheckBox;", "Lcom/google/android/material/checkbox/MaterialCheckBox;", "()Lcom/google/android/material/checkbox/MaterialCheckBox;", "cbAddToken", "Lcom/google/android/material/card/MaterialCardView;", "e", "Lcom/google/android/material/card/MaterialCardView;", "()Lcom/google/android/material/card/MaterialCardView;", "rowBG", "Lcom/google/android/material/button/MaterialButton;", "Lcom/google/android/material/button/MaterialButton;", "()Lcom/google/android/material/button/MaterialButton;", "btnDelete", "g", "itemContainer", "<init>", "(Lry2;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: yc$a */
    /* compiled from: AddNewTokensAdapter.kt */
    public static final class C9634a extends RecyclerView.C1231a0 {

        /* renamed from: a */
        public final ry2 f46157a;

        /* renamed from: b */
        public final ImageView f46158b;

        /* renamed from: c */
        public final TextView f46159c;

        /* renamed from: d */
        public final MaterialCheckBox f46160d;

        /* renamed from: e */
        public final MaterialCardView f46161e;

        /* renamed from: f */
        public final MaterialButton f46162f;

        /* renamed from: g */
        public final MaterialCardView f46163g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9634a(ry2 ry2) {
            super(ry2.mo47565b());
            vx2.m53591g(ry2, "binding");
            this.f46157a = ry2;
            ImageView imageView = ry2.f33667d;
            vx2.m53590f(imageView, "binding.ivTokenIcon");
            this.f46158b = imageView;
            TextView textView = ry2.f33670g;
            vx2.m53590f(textView, "binding.tvTokenNameAndSymbol");
            this.f46159c = textView;
            MaterialCheckBox materialCheckBox = ry2.f33666c;
            vx2.m53590f(materialCheckBox, "binding.cbAddToken");
            this.f46160d = materialCheckBox;
            MaterialCardView materialCardView = ry2.f33668e;
            vx2.m53590f(materialCardView, "binding.rowBG");
            this.f46161e = materialCardView;
            MaterialButton materialButton = ry2.f33665b;
            vx2.m53590f(materialButton, "binding.btnDelete");
            this.f46162f = materialButton;
            MaterialCardView materialCardView2 = ry2.f33669f;
            vx2.m53590f(materialCardView2, "binding.rowFG");
            this.f46163g = materialCardView2;
        }

        /* renamed from: a */
        public final MaterialButton mo67061a() {
            return this.f46162f;
        }

        /* renamed from: b */
        public final MaterialCheckBox mo67062b() {
            return this.f46160d;
        }

        /* renamed from: c */
        public final MaterialCardView mo67063c() {
            return this.f46163g;
        }

        /* renamed from: d */
        public final ImageView mo67064d() {
            return this.f46158b;
        }

        /* renamed from: e */
        public final MaterialCardView mo67065e() {
            return this.f46161e;
        }

        /* renamed from: f */
        public final TextView mo67066f() {
            return this.f46159c;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\b"}, mo44877d2 = {"Lyc$b;", "", "Lvc;", "item", "", "isSelected", "Lr37;", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: yc$b */
    /* compiled from: AddNewTokensAdapter.kt */
    public interface C9635b {
        /* renamed from: a */
        void mo57418a(C9449vc vcVar, boolean z);
    }

    public C9633yc(ArrayList<C9449vc> arrayList, C9635b bVar) {
        vx2.m53591g(arrayList, "items");
        vx2.m53591g(bVar, "onItemCheckChangedListener");
        this.f46152a = arrayList;
        this.f46153d = bVar;
        ArrayList arrayList2 = new ArrayList();
        for (Pair<TokenType, List<String>> second : ApplicationRoomDatabase.f41664p.mo57121d()) {
            arrayList2.addAll((Collection) second.getSecond());
        }
        this.f46156k = arrayList2;
    }

    /* renamed from: f */
    public static final void m74348f(C9449vc vcVar, C9633yc ycVar, int i, View view) {
        vx2.m53591g(vcVar, "$model");
        vx2.m53591g(ycVar, "this$0");
        boolean z = !vcVar.mo66478i();
        ycVar.f46152a.get(i).mo66479j(z);
        ycVar.f46153d.mo57418a(vcVar, z);
    }

    /* renamed from: g */
    public static final void m74349g(C9449vc vcVar, C9633yc ycVar, int i, C9634a aVar, View view) {
        vx2.m53591g(vcVar, "$model");
        vx2.m53591g(ycVar, "this$0");
        vx2.m53591g(aVar, "$holder");
        boolean z = !vcVar.mo66478i();
        ycVar.f46152a.get(i).mo66479j(z);
        aVar.mo67062b().setChecked(z);
        ycVar.f46153d.mo57418a(vcVar, z);
    }

    /* renamed from: c */
    public final C9449vc mo67056c(int i) {
        C9449vc vcVar = this.f46152a.get(i);
        vx2.m53590f(vcVar, "items[position]");
        return vcVar;
    }

    /* renamed from: d */
    public final ArrayList<C9449vc> mo67057d() {
        return this.f46152a;
    }

    /* renamed from: e */
    public void onBindViewHolder(C9634a aVar, int i) {
        vx2.m53591g(aVar, "holder");
        C9449vc vcVar = this.f46152a.get(i);
        vx2.m53590f(vcVar, "items[position]");
        C9449vc vcVar2 = vcVar;
        aVar.mo67062b().setChecked(vcVar2.mo66478i());
        TextView f = aVar.mo67066f();
        Resources resources = this.f46155g;
        if (resources == null) {
            vx2.m53605u("resources");
            resources = null;
        }
        f.setText(resources.getString(R.string.add_new_tokens_item_name, new Object[]{vcVar2.mo66474f(), vcVar2.mo66475g()}));
        ol0.m70336P(aVar.mo67064d(), vcVar2.mo66472e(), vcVar2.mo66471d(), vcVar2.mo66475g());
        if (ol0.m70328H(vcVar2.mo66475g())) {
            ol0.m70335O(aVar.mo67064d(), q70.m71187c(vcVar2.mo66468a(), vcVar2.mo66475g(), (Integer) null, 2, (Object) null), vcVar2.mo66475g());
        }
        aVar.mo67062b().setOnClickListener(new C9512wc(vcVar2, this, i));
        aVar.mo67063c().setOnClickListener(new C9592xc(vcVar2, this, i, aVar));
        aVar.mo67062b().setVisibility(ol0.m70366j0(this.f46156k.contains(vcVar2.mo66476h())));
        MaterialCardView e = aVar.mo67065e();
        Common common = Common.f42577a;
        e.setVisibility(ol0.m70368k0(!common.mo60915v(vcVar2.mo66476h())));
        aVar.mo67061a().setEnabled(common.mo60915v(vcVar2.mo66476h()));
    }

    public int getItemCount() {
        return this.f46152a.size();
    }

    /* renamed from: h */
    public C9634a onCreateViewHolder(ViewGroup viewGroup, int i) {
        vx2.m53591g(viewGroup, "parent");
        ry2 a = ry2.m51433a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_add_new_token, viewGroup, false));
        vx2.m53590f(a, "bind(\n            Layout… parent, false)\n        )");
        this.f46154e = a;
        ry2 ry2 = null;
        if (a == null) {
            vx2.m53605u("binding");
            a = null;
        }
        Resources resources = a.mo47565b().getContext().getResources();
        vx2.m53590f(resources, "binding.root.context.resources");
        this.f46155g = resources;
        ry2 ry22 = this.f46154e;
        if (ry22 == null) {
            vx2.m53605u("binding");
        } else {
            ry2 = ry22;
        }
        return new C9634a(ry2);
    }

    public final void removeItem(int i) {
        this.f46152a.remove(i);
        notifyDataSetChanged();
    }
}
