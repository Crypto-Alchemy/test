package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C1710a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.model.contact.abstraction.IContact;
import net.sqlcipher.database.SQLiteDatabase;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u000fB\u001d\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\u001c\u0010\u001dJ\u001c\u0010\u0007\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001c\u0010\u000b\u001a\u00020\n2\n\u0010\b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0010R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, mo44877d2 = {"Lir0;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lir0$a;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "d", "holder", "position", "Lr37;", "b", "getItemCount", "", "Lnet/safemoon/androidwallet/model/contact/abstraction/IContact;", "a", "Ljava/util/List;", "mainItem", "Lrn2;", "Lrn2;", "clickListener", "", "e", "items", "Laz2;", "g", "Laz2;", "binding", "<init>", "(Ljava/util/List;Lrn2;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: ir0 */
/* compiled from: ContactListAddressAdapter.kt */
public final class ir0 extends RecyclerView.Adapter<C7224a> {

    /* renamed from: a */
    public final List<IContact> f38503a;

    /* renamed from: d */
    public final rn2 f38504d;

    /* renamed from: e */
    public final List<IContact> f38505e;

    /* renamed from: g */
    public az2 f38506g;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u0003\u0010\fR\u0017\u0010\u0013\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u000e\u0010\u0012R\u0017\u0010\u0017\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\t\u0010\u0016¨\u0006\u001c"}, mo44877d2 = {"Lir0$a;", "Landroidx/recyclerview/widget/RecyclerView$a0;", "Landroid/widget/ImageView;", "a", "Landroid/widget/ImageView;", "d", "()Landroid/widget/ImageView;", "icon", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "e", "()Landroid/widget/TextView;", "name", "c", "address", "Landroid/view/View;", "Landroid/view/View;", "()Landroid/view/View;", "divider", "Landroid/widget/LinearLayout;", "Landroid/widget/LinearLayout;", "()Landroid/widget/LinearLayout;", "container", "Laz2;", "binding", "<init>", "(Lir0;Laz2;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: ir0$a */
    /* compiled from: ContactListAddressAdapter.kt */
    public final class C7224a extends RecyclerView.C1231a0 {

        /* renamed from: a */
        public final ImageView f38507a;

        /* renamed from: b */
        public final TextView f38508b;

        /* renamed from: c */
        public final TextView f38509c;

        /* renamed from: d */
        public final View f38510d;

        /* renamed from: e */
        public final LinearLayout f38511e;

        /* renamed from: f */
        public final /* synthetic */ ir0 f38512f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7224a(ir0 ir0, az2 az2) {
            super(az2.mo29402b());
            vx2.m53591g(az2, "binding");
            this.f38512f = ir0;
            ImageView imageView = az2.f21097d;
            vx2.m53590f(imageView, "binding.ivContactIcon");
            this.f38507a = imageView;
            TextView textView = az2.f21099f;
            vx2.m53590f(textView, "binding.tvContactName");
            this.f38508b = textView;
            TextView textView2 = az2.f21098e;
            vx2.m53590f(textView2, "binding.tvContactAddress");
            this.f38509c = textView2;
            View view = az2.f21100g;
            vx2.m53590f(view, "binding.vDivider");
            this.f38510d = view;
            LinearLayout linearLayout = az2.f21095b;
            vx2.m53590f(linearLayout, "binding.container");
            this.f38511e = linearLayout;
        }

        /* renamed from: a */
        public final TextView mo52524a() {
            return this.f38509c;
        }

        /* renamed from: b */
        public final LinearLayout mo52525b() {
            return this.f38511e;
        }

        /* renamed from: c */
        public final View mo52526c() {
            return this.f38510d;
        }

        /* renamed from: d */
        public final ImageView mo52527d() {
            return this.f38507a;
        }

        /* renamed from: e */
        public final TextView mo52528e() {
            return this.f38508b;
        }
    }

    public ir0(List<? extends IContact> list, rn2 rn2) {
        vx2.m53591g(list, "mainItem");
        vx2.m53591g(rn2, "clickListener");
        this.f38503a = list;
        this.f38504d = rn2;
        ArrayList arrayList = new ArrayList();
        this.f38505e = arrayList;
        arrayList.addAll(list);
    }

    /* renamed from: c */
    public static final void m59079c(ir0 ir0, IContact iContact, View view) {
        vx2.m53591g(ir0, "this$0");
        vx2.m53591g(iContact, "$model");
        ir0.f38504d.mo57499a(iContact);
    }

    /* renamed from: b */
    public void onBindViewHolder(C7224a aVar, int i) {
        vx2.m53591g(aVar, "holder");
        IContact iContact = this.f38505e.get(i);
        aVar.mo52528e().setText(iContact.getName());
        aVar.mo52524a().setText(iContact.getAddress());
        View c = aVar.mo52526c();
        boolean z = true;
        int i2 = 0;
        if (i == this.f38505e.size() - 1) {
            z = false;
        }
        if (!z) {
            i2 = 8;
        }
        c.setVisibility(i2);
        ((be5) ((be5) ((be5) C1710a.m12225u(aVar.mo52527d()).mo23164y(iContact.getProfilePath()).mo22582h0(R.drawable.contact_no_icon)).mo22591m(R.drawable.contact_no_icon)).mo11567a(qe5.m25623x0()).mo22581g0(SQLiteDatabase.MAX_SQL_CACHE_SIZE, SQLiteDatabase.MAX_SQL_CACHE_SIZE)).mo11553K0(aVar.mo52527d());
        aVar.mo52525b().setOnClickListener(new hr0(this, iContact));
    }

    /* renamed from: d */
    public C7224a onCreateViewHolder(ViewGroup viewGroup, int i) {
        vx2.m53591g(viewGroup, "parent");
        az2 a = az2.m32312a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_drop_down_contact_address, viewGroup, false));
        vx2.m53590f(a, "bind(\n            Layout… parent, false)\n        )");
        this.f38506g = a;
        az2 az2 = this.f38506g;
        if (az2 == null) {
            vx2.m53605u("binding");
            az2 = null;
        }
        return new C7224a(this, az2);
    }

    public int getItemCount() {
        return this.f38505e.size();
    }
}
