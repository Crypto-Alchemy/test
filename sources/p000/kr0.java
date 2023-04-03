package p000;

import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
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

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\"B%\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b \u0010!J\u001c\u0010\u0007\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001c\u0010\u000b\u001a\u00020\n2\n\u0010\b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0010R\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006#"}, mo44877d2 = {"Lkr0;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lkr0$b;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "f", "holder", "position", "Lr37;", "d", "getItemCount", "", "Lnet/safemoon/androidwallet/model/contact/abstraction/IContact;", "a", "Ljava/util/List;", "mainItem", "Landroid/widget/EditText;", "Landroid/widget/EditText;", "editText", "Lrn2;", "e", "Lrn2;", "clickListener", "", "g", "items", "Laz2;", "k", "Laz2;", "binding", "<init>", "(Ljava/util/List;Landroid/widget/EditText;Lrn2;)V", "b", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: kr0 */
/* compiled from: ContactSearchAddressAdapter.kt */
public final class kr0 extends RecyclerView.Adapter<C7806b> {

    /* renamed from: a */
    public final List<IContact> f40512a;

    /* renamed from: d */
    public final EditText f40513d;

    /* renamed from: e */
    public final rn2 f40514e;

    /* renamed from: g */
    public final List<IContact> f40515g;

    /* renamed from: k */
    public az2 f40516k;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J*\u0010\u000b\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0012\u0010\r\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\fH\u0016¨\u0006\u000e"}, mo44877d2 = {"kr0$a", "Landroid/text/TextWatcher;", "", "s", "", "start", "count", "after", "Lr37;", "beforeTextChanged", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: kr0$a */
    /* compiled from: ContactSearchAddressAdapter.kt */
    public static final class C7805a implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ kr0 f40517a;

        public C7805a(kr0 kr0) {
            this.f40517a = kr0;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
            if (r3 == true) goto L_0x0026;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void afterTextChanged(android.text.Editable r11) {
            /*
                r10 = this;
                kr0 r0 = r10.f40517a
                java.util.List r0 = r0.f40515g
                r0.clear()
                kr0 r0 = r10.f40517a
                java.util.List r0 = r0.f40515g
                r1 = 1
                r2 = 0
                if (r11 == 0) goto L_0x0025
                java.lang.CharSequence r3 = kotlin.text.StringsKt__StringsKt.m63090V0(r11)
                if (r3 == 0) goto L_0x0025
                int r3 = r3.length()
                if (r3 != 0) goto L_0x0021
                r3 = r1
                goto L_0x0022
            L_0x0021:
                r3 = r2
            L_0x0022:
                if (r3 != r1) goto L_0x0025
                goto L_0x0026
            L_0x0025:
                r1 = r2
            L_0x0026:
                if (r1 == 0) goto L_0x002f
                kr0 r11 = r10.f40517a
                java.util.List r11 = r11.f40512a
                goto L_0x007a
            L_0x002f:
                kr0 r1 = r10.f40517a
                java.util.List r1 = r1.f40512a
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                java.util.Iterator r1 = r1.iterator()
            L_0x003e:
                boolean r4 = r1.hasNext()
                if (r4 == 0) goto L_0x0079
                java.lang.Object r4 = r1.next()
                r5 = r4
                net.safemoon.androidwallet.model.contact.abstraction.IContact r5 = (net.safemoon.androidwallet.model.contact.abstraction.IContact) r5
                java.lang.String r5 = r5.getName()
                java.util.Locale r6 = java.util.Locale.ROOT
                java.lang.String r5 = r5.toLowerCase(r6)
                java.lang.String r7 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
                p000.vx2.m53590f(r5, r7)
                r8 = 0
                if (r11 == 0) goto L_0x0062
                java.lang.CharSequence r9 = kotlin.text.StringsKt__StringsKt.m63090V0(r11)
                goto L_0x0063
            L_0x0062:
                r9 = r8
            L_0x0063:
                java.lang.String r9 = java.lang.String.valueOf(r9)
                java.lang.String r6 = r9.toLowerCase(r6)
                p000.vx2.m53590f(r6, r7)
                r7 = 2
                boolean r5 = kotlin.text.StringsKt__StringsKt.m63081R(r5, r6, r2, r7, r8)
                if (r5 == 0) goto L_0x003e
                r3.add(r4)
                goto L_0x003e
            L_0x0079:
                r11 = r3
            L_0x007a:
                r0.addAll(r11)
                kr0 r11 = r10.f40517a
                r11.notifyDataSetChanged()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.kr0.C7805a.afterTextChanged(android.text.Editable):void");
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u0003\u0010\fR\u0017\u0010\u0013\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u000e\u0010\u0012R\u0017\u0010\u0017\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\t\u0010\u0016¨\u0006\u001c"}, mo44877d2 = {"Lkr0$b;", "Landroidx/recyclerview/widget/RecyclerView$a0;", "Landroid/widget/ImageView;", "a", "Landroid/widget/ImageView;", "d", "()Landroid/widget/ImageView;", "icon", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "e", "()Landroid/widget/TextView;", "name", "c", "address", "Landroid/view/View;", "Landroid/view/View;", "()Landroid/view/View;", "divider", "Landroid/widget/LinearLayout;", "Landroid/widget/LinearLayout;", "()Landroid/widget/LinearLayout;", "container", "Laz2;", "binding", "<init>", "(Lkr0;Laz2;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: kr0$b */
    /* compiled from: ContactSearchAddressAdapter.kt */
    public final class C7806b extends RecyclerView.C1231a0 {

        /* renamed from: a */
        public final ImageView f40518a;

        /* renamed from: b */
        public final TextView f40519b;

        /* renamed from: c */
        public final TextView f40520c;

        /* renamed from: d */
        public final View f40521d;

        /* renamed from: e */
        public final LinearLayout f40522e;

        /* renamed from: f */
        public final /* synthetic */ kr0 f40523f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7806b(kr0 kr0, az2 az2) {
            super(az2.mo29402b());
            vx2.m53591g(az2, "binding");
            this.f40523f = kr0;
            ImageView imageView = az2.f21097d;
            vx2.m53590f(imageView, "binding.ivContactIcon");
            this.f40518a = imageView;
            TextView textView = az2.f21099f;
            vx2.m53590f(textView, "binding.tvContactName");
            this.f40519b = textView;
            TextView textView2 = az2.f21098e;
            vx2.m53590f(textView2, "binding.tvContactAddress");
            this.f40520c = textView2;
            View view = az2.f21100g;
            vx2.m53590f(view, "binding.vDivider");
            this.f40521d = view;
            LinearLayout linearLayout = az2.f21095b;
            vx2.m53590f(linearLayout, "binding.container");
            this.f40522e = linearLayout;
        }

        /* renamed from: a */
        public final TextView mo55766a() {
            return this.f40520c;
        }

        /* renamed from: b */
        public final LinearLayout mo55767b() {
            return this.f40522e;
        }

        /* renamed from: c */
        public final View mo55768c() {
            return this.f40521d;
        }

        /* renamed from: d */
        public final ImageView mo55769d() {
            return this.f40518a;
        }

        /* renamed from: e */
        public final TextView mo55770e() {
            return this.f40519b;
        }
    }

    public kr0(List<? extends IContact> list, EditText editText, rn2 rn2) {
        vx2.m53591g(list, "mainItem");
        vx2.m53591g(editText, "editText");
        vx2.m53591g(rn2, "clickListener");
        this.f40512a = list;
        this.f40513d = editText;
        this.f40514e = rn2;
        ArrayList arrayList = new ArrayList();
        this.f40515g = arrayList;
        arrayList.addAll(list);
        editText.addTextChangedListener(new C7805a(this));
    }

    /* renamed from: e */
    public static final void m63591e(kr0 kr0, IContact iContact, View view) {
        vx2.m53591g(kr0, "this$0");
        vx2.m53591g(iContact, "$model");
        kr0.f40514e.mo57499a(iContact);
    }

    /* renamed from: d */
    public void onBindViewHolder(C7806b bVar, int i) {
        vx2.m53591g(bVar, "holder");
        IContact iContact = this.f40515g.get(i);
        bVar.mo55770e().setText(iContact.getName());
        bVar.mo55766a().setText(iContact.getAddress());
        View c = bVar.mo55768c();
        boolean z = true;
        int i2 = 0;
        if (i == this.f40515g.size() - 1) {
            z = false;
        }
        if (!z) {
            i2 = 8;
        }
        c.setVisibility(i2);
        ((be5) ((be5) ((be5) C1710a.m12225u(bVar.mo55769d()).mo23164y(iContact.getProfilePath()).mo22582h0(R.drawable.contact_no_icon)).mo22591m(R.drawable.contact_no_icon)).mo11567a(qe5.m25623x0()).mo22581g0(SQLiteDatabase.MAX_SQL_CACHE_SIZE, SQLiteDatabase.MAX_SQL_CACHE_SIZE)).mo11553K0(bVar.mo55769d());
        bVar.mo55767b().setOnClickListener(new jr0(this, iContact));
    }

    /* renamed from: f */
    public C7806b onCreateViewHolder(ViewGroup viewGroup, int i) {
        vx2.m53591g(viewGroup, "parent");
        az2 a = az2.m32312a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_drop_down_contact_address, viewGroup, false));
        vx2.m53590f(a, "bind(\n            Layout… parent, false)\n        )");
        this.f40516k = a;
        az2 az2 = this.f40516k;
        if (az2 == null) {
            vx2.m53605u("binding");
            az2 = null;
        }
        return new C7806b(this, az2);
    }

    public int getItemCount() {
        return this.f40515g.size();
    }
}
