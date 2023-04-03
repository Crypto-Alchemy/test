package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C1710a;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.text.StringsKt__StringsKt;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.model.contact.abstraction.IContact;
import net.sqlcipher.database.SQLiteDatabase;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b!\u0010\"J\u0014\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u001c\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u001c\u0010\u0012\u001a\u00020\u00062\n\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\rH\u0016J\b\u0010\u0013\u001a\u00020\rH\u0016J\b\u0010\u0014\u001a\u00020\u0006H\u0002R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001aR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001cR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001aR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006#"}, mo44877d2 = {"Lan3;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lan3$a;", "", "Lnet/safemoon/androidwallet/model/contact/abstraction/IContact;", "items", "Lr37;", "f", "", "search", "g", "Landroid/view/ViewGroup;", "parent", "", "viewType", "d", "holder", "position", "b", "getItemCount", "e", "Lrn2;", "a", "Lrn2;", "clickListener", "", "Ljava/util/List;", "originalItems", "Ljava/lang/String;", "Lfz2;", "k", "Lfz2;", "binding", "<init>", "(Lrn2;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: an3 */
/* compiled from: ManageContactsAdapter.kt */
public final class an3 extends RecyclerView.Adapter<C6831a> {

    /* renamed from: a */
    public final rn2 f36509a;

    /* renamed from: d */
    public final List<IContact> f36510d = new ArrayList();

    /* renamed from: e */
    public String f36511e = "";

    /* renamed from: g */
    public final List<IContact> f36512g = new ArrayList();

    /* renamed from: k */
    public fz2 f36513k;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u0003\u0010\fR\u0017\u0010\u0012\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0010\u001a\u0004\b\t\u0010\u0011¨\u0006\u0017"}, mo44877d2 = {"Lan3$a;", "Landroidx/recyclerview/widget/RecyclerView$a0;", "Landroid/widget/ImageView;", "a", "Landroid/widget/ImageView;", "c", "()Landroid/widget/ImageView;", "icon", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "d", "()Landroid/widget/TextView;", "name", "address", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "container", "Lfz2;", "binding", "<init>", "(Lan3;Lfz2;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: an3$a */
    /* compiled from: ManageContactsAdapter.kt */
    public final class C6831a extends RecyclerView.C1231a0 {

        /* renamed from: a */
        public final ImageView f36514a;

        /* renamed from: b */
        public final TextView f36515b;

        /* renamed from: c */
        public final TextView f36516c;

        /* renamed from: d */
        public final ConstraintLayout f36517d;

        /* renamed from: e */
        public final /* synthetic */ an3 f36518e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6831a(an3 an3, fz2 fz2) {
            super(fz2.mo42700b());
            vx2.m53591g(fz2, "binding");
            this.f36518e = an3;
            ImageView imageView = fz2.f29037d;
            vx2.m53590f(imageView, "binding.ivContactIcon");
            this.f36514a = imageView;
            TextView textView = fz2.f29039f;
            vx2.m53590f(textView, "binding.tvContactName");
            this.f36515b = textView;
            TextView textView2 = fz2.f29038e;
            vx2.m53590f(textView2, "binding.tvContactAddress");
            this.f36516c = textView2;
            ConstraintLayout constraintLayout = fz2.f29035b;
            vx2.m53590f(constraintLayout, "binding.container");
            this.f36517d = constraintLayout;
        }

        /* renamed from: a */
        public final TextView mo50263a() {
            return this.f36516c;
        }

        /* renamed from: b */
        public final ConstraintLayout mo50264b() {
            return this.f36517d;
        }

        /* renamed from: c */
        public final ImageView mo50265c() {
            return this.f36514a;
        }

        /* renamed from: d */
        public final TextView mo50266d() {
            return this.f36515b;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo44877d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    /* renamed from: an3$b */
    /* compiled from: Comparisons.kt */
    public static final class C6832b<T> implements Comparator {
        public final int compare(T t, T t2) {
            String name = ((IContact) t).getName();
            Locale locale = Locale.ROOT;
            String lowerCase = name.toLowerCase(locale);
            vx2.m53590f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            String lowerCase2 = ((IContact) t2).getName().toLowerCase(locale);
            vx2.m53590f(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            return xl0.m54426a(lowerCase, lowerCase2);
        }
    }

    public an3(rn2 rn2) {
        vx2.m53591g(rn2, "clickListener");
        this.f36509a = rn2;
    }

    /* renamed from: c */
    public static final void m55590c(an3 an3, IContact iContact, View view) {
        vx2.m53591g(an3, "this$0");
        vx2.m53591g(iContact, "$model");
        an3.f36509a.mo57499a(iContact);
    }

    /* renamed from: b */
    public void onBindViewHolder(C6831a aVar, int i) {
        vx2.m53591g(aVar, "holder");
        IContact iContact = this.f36512g.get(i);
        aVar.mo50266d().setText(iContact.getName());
        aVar.mo50263a().setText(iContact.getAddress());
        ((be5) ((be5) ((be5) C1710a.m12225u(aVar.mo50265c()).mo23161v(new File(iContact.getProfilePath())).mo22582h0(R.drawable.contact_no_icon)).mo22591m(R.drawable.contact_no_icon)).mo22581g0(SQLiteDatabase.MAX_SQL_CACHE_SIZE, SQLiteDatabase.MAX_SQL_CACHE_SIZE)).mo11567a(qe5.m25623x0()).mo11553K0(aVar.mo50265c());
        aVar.mo50264b().setOnClickListener(new zm3(this, iContact));
    }

    /* renamed from: d */
    public C6831a onCreateViewHolder(ViewGroup viewGroup, int i) {
        vx2.m53591g(viewGroup, "parent");
        fz2 a = fz2.m44459a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_manage_contact, viewGroup, false));
        vx2.m53590f(a, "bind(\n            Layout… parent, false)\n        )");
        this.f36513k = a;
        fz2 fz2 = this.f36513k;
        if (fz2 == null) {
            vx2.m53605u("binding");
            fz2 = null;
        }
        return new C6831a(this, fz2);
    }

    /* renamed from: e */
    public final void mo50260e() {
        boolean z;
        this.f36512g.clear();
        List<IContact> list = this.f36512g;
        List<IContact> list2 = this.f36510d;
        ArrayList arrayList = new ArrayList();
        for (T next : list2) {
            IContact iContact = (IContact) next;
            boolean z2 = true;
            if (this.f36511e.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                String name = iContact.getName();
                Locale locale = Locale.ROOT;
                String lowerCase = name.toLowerCase(locale);
                vx2.m53590f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                String obj = StringsKt__StringsKt.m63090V0(lowerCase).toString();
                String lowerCase2 = this.f36511e.toLowerCase(locale);
                vx2.m53590f(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                if (!StringsKt__StringsKt.m63081R(obj, StringsKt__StringsKt.m63090V0(lowerCase2).toString(), false, 2, (Object) null)) {
                    z2 = false;
                }
            }
            if (z2) {
                arrayList.add(next);
            }
        }
        list.addAll(arrayList);
        notifyDataSetChanged();
    }

    /* renamed from: f */
    public final void mo50261f(List<? extends IContact> list) {
        vx2.m53591g(list, "items");
        this.f36510d.clear();
        this.f36510d.addAll(CollectionsKt___CollectionsKt.m47304D0(list, new C6832b()));
        mo50260e();
    }

    /* renamed from: g */
    public final void mo50262g(String str) {
        vx2.m53591g(str, "search");
        this.f36511e = str;
        mo50260e();
    }

    public int getItemCount() {
        return this.f36512g.size();
    }
}
