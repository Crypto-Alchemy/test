package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0173e;
import androidx.appcompat.view.menu.C0177g;
import androidx.appcompat.view.menu.C0182i;
import androidx.appcompat.view.menu.C0184j;
import androidx.appcompat.view.menu.C0189l;
import androidx.recyclerview.widget.C1339s;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.internal.NavigationMenuItemView;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.internal.ParcelableSparseArray;
import java.util.ArrayList;
import p000.C3335t8;

/* renamed from: x44 */
/* compiled from: NavigationMenuPresenter */
public class x44 implements C0182i {

    /* renamed from: A */
    public ColorStateList f35502A;

    /* renamed from: B */
    public ColorStateList f35503B;

    /* renamed from: C */
    public Drawable f35504C;

    /* renamed from: H */
    public int f35505H;

    /* renamed from: I */
    public int f35506I;

    /* renamed from: L */
    public int f35507L;

    /* renamed from: M */
    public boolean f35508M;

    /* renamed from: P */
    public boolean f35509P = true;

    /* renamed from: Q */
    public int f35510Q;

    /* renamed from: U */
    public int f35511U;

    /* renamed from: X */
    public int f35512X;

    /* renamed from: Y */
    public int f35513Y = -1;

    /* renamed from: Z */
    public final View.OnClickListener f35514Z = new C6680a();

    /* renamed from: a */
    public NavigationMenuView f35515a;

    /* renamed from: d */
    public LinearLayout f35516d;

    /* renamed from: e */
    public C0182i.C0183a f35517e;

    /* renamed from: g */
    public C0173e f35518g;

    /* renamed from: k */
    public int f35519k;

    /* renamed from: r */
    public C6682c f35520r;

    /* renamed from: s */
    public LayoutInflater f35521s;

    /* renamed from: x */
    public int f35522x;

    /* renamed from: y */
    public boolean f35523y;

    /* renamed from: x44$a */
    /* compiled from: NavigationMenuPresenter */
    public class C6680a implements View.OnClickListener {
        public C6680a() {
        }

        public void onClick(View view) {
            boolean z = true;
            x44.this.mo49357J(true);
            C0177g itemData = ((NavigationMenuItemView) view).getItemData();
            x44 x44 = x44.this;
            boolean O = x44.f35518g.mo1387O(itemData, x44, 0);
            if (itemData == null || !itemData.isCheckable() || !O) {
                z = false;
            } else {
                x44.this.f35520r.mo49384j(itemData);
            }
            x44.this.mo49357J(false);
            if (z) {
                x44.this.mo1310i(false);
            }
        }
    }

    /* renamed from: x44$b */
    /* compiled from: NavigationMenuPresenter */
    public static class C6681b extends C6691l {
        public C6681b(View view) {
            super(view);
        }
    }

    /* renamed from: x44$c */
    /* compiled from: NavigationMenuPresenter */
    public class C6682c extends RecyclerView.Adapter<C6691l> {

        /* renamed from: a */
        public final ArrayList<C6684e> f35525a = new ArrayList<>();

        /* renamed from: d */
        public C0177g f35526d;

        /* renamed from: e */
        public boolean f35527e;

        public C6682c() {
            mo49382h();
        }

        /* renamed from: a */
        public final void mo49375a(int i, int i2) {
            while (i < i2) {
                ((C6686g) this.f35525a.get(i)).f35532b = true;
                i++;
            }
        }

        /* renamed from: b */
        public Bundle mo49376b() {
            View view;
            Bundle bundle = new Bundle();
            C0177g gVar = this.f35526d;
            if (gVar != null) {
                bundle.putInt("android:menu:checked", gVar.getItemId());
            }
            SparseArray sparseArray = new SparseArray();
            int size = this.f35525a.size();
            for (int i = 0; i < size; i++) {
                C6684e eVar = this.f35525a.get(i);
                if (eVar instanceof C6686g) {
                    C0177g a = ((C6686g) eVar).mo49389a();
                    if (a != null) {
                        view = a.getActionView();
                    } else {
                        view = null;
                    }
                    if (view != null) {
                        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                        view.saveHierarchyState(parcelableSparseArray);
                        sparseArray.put(a.getItemId(), parcelableSparseArray);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:action_views", sparseArray);
            return bundle;
        }

        /* renamed from: c */
        public C0177g mo49377c() {
            return this.f35526d;
        }

        /* renamed from: d */
        public int mo49378d() {
            int i;
            if (x44.this.f35516d.getChildCount() == 0) {
                i = 0;
            } else {
                i = 1;
            }
            for (int i2 = 0; i2 < x44.this.f35520r.getItemCount(); i2++) {
                if (x44.this.f35520r.getItemViewType(i2) == 0) {
                    i++;
                }
            }
            return i;
        }

        /* renamed from: e */
        public void onBindViewHolder(C6691l lVar, int i) {
            Drawable drawable;
            int itemViewType = getItemViewType(i);
            if (itemViewType == 0) {
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) lVar.itemView;
                navigationMenuItemView.setIconTintList(x44.this.f35503B);
                x44 x44 = x44.this;
                if (x44.f35523y) {
                    navigationMenuItemView.setTextAppearance(x44.f35522x);
                }
                ColorStateList colorStateList = x44.this.f35502A;
                if (colorStateList != null) {
                    navigationMenuItemView.setTextColor(colorStateList);
                }
                Drawable drawable2 = x44.this.f35504C;
                if (drawable2 != null) {
                    drawable = drawable2.getConstantState().newDrawable();
                } else {
                    drawable = null;
                }
                ga7.m17793t0(navigationMenuItemView, drawable);
                C6686g gVar = (C6686g) this.f35525a.get(i);
                navigationMenuItemView.setNeedsEmptyIcon(gVar.f35532b);
                navigationMenuItemView.setHorizontalPadding(x44.this.f35505H);
                navigationMenuItemView.setIconPadding(x44.this.f35506I);
                x44 x442 = x44.this;
                if (x442.f35508M) {
                    navigationMenuItemView.setIconSize(x442.f35507L);
                }
                navigationMenuItemView.setMaxLines(x44.this.f35510Q);
                navigationMenuItemView.mo1260c(gVar.mo49389a(), 0);
            } else if (itemViewType == 1) {
                ((TextView) lVar.itemView).setText(((C6686g) this.f35525a.get(i)).mo49389a().getTitle());
            } else if (itemViewType == 2) {
                C6685f fVar = (C6685f) this.f35525a.get(i);
                lVar.itemView.setPadding(0, fVar.mo49388b(), 0, fVar.mo49387a());
            }
        }

        /* renamed from: f */
        public C6691l onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i == 0) {
                x44 x44 = x44.this;
                return new C6688i(x44.f35521s, viewGroup, x44.f35514Z);
            } else if (i == 1) {
                return new C6690k(x44.this.f35521s, viewGroup);
            } else {
                if (i == 2) {
                    return new C6689j(x44.this.f35521s, viewGroup);
                }
                if (i != 3) {
                    return null;
                }
                return new C6681b(x44.this.f35516d);
            }
        }

        /* renamed from: g */
        public void onViewRecycled(C6691l lVar) {
            if (lVar instanceof C6688i) {
                ((NavigationMenuItemView) lVar.itemView).mo32961g();
            }
        }

        public int getItemCount() {
            return this.f35525a.size();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public int getItemViewType(int i) {
            C6684e eVar = this.f35525a.get(i);
            if (eVar instanceof C6685f) {
                return 2;
            }
            if (eVar instanceof C6683d) {
                return 3;
            }
            if (!(eVar instanceof C6686g)) {
                throw new RuntimeException("Unknown item type.");
            } else if (((C6686g) eVar).mo49389a().hasSubMenu()) {
                return 1;
            } else {
                return 0;
            }
        }

        /* renamed from: h */
        public final void mo49382h() {
            if (!this.f35527e) {
                boolean z = true;
                this.f35527e = true;
                this.f35525a.clear();
                this.f35525a.add(new C6683d());
                int i = -1;
                int size = x44.this.f35518g.mo1379G().size();
                int i2 = 0;
                boolean z2 = false;
                int i3 = 0;
                while (i2 < size) {
                    C0177g gVar = x44.this.f35518g.mo1379G().get(i2);
                    if (gVar.isChecked()) {
                        mo49384j(gVar);
                    }
                    if (gVar.isCheckable()) {
                        gVar.mo1537t(false);
                    }
                    if (gVar.hasSubMenu()) {
                        SubMenu subMenu = gVar.getSubMenu();
                        if (subMenu.hasVisibleItems()) {
                            if (i2 != 0) {
                                this.f35525a.add(new C6685f(x44.this.f35512X, 0));
                            }
                            this.f35525a.add(new C6686g(gVar));
                            int size2 = this.f35525a.size();
                            int size3 = subMenu.size();
                            int i4 = 0;
                            boolean z3 = false;
                            while (i4 < size3) {
                                C0177g gVar2 = (C0177g) subMenu.getItem(i4);
                                if (gVar2.isVisible()) {
                                    if (!z3 && gVar2.getIcon() != null) {
                                        z3 = z;
                                    }
                                    if (gVar2.isCheckable()) {
                                        gVar2.mo1537t(false);
                                    }
                                    if (gVar.isChecked()) {
                                        mo49384j(gVar);
                                    }
                                    this.f35525a.add(new C6686g(gVar2));
                                }
                                i4++;
                                z = true;
                            }
                            if (z3) {
                                mo49375a(size2, this.f35525a.size());
                            }
                        }
                    } else {
                        int groupId = gVar.getGroupId();
                        if (groupId != i) {
                            i3 = this.f35525a.size();
                            if (gVar.getIcon() != null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (i2 != 0) {
                                i3++;
                                ArrayList<C6684e> arrayList = this.f35525a;
                                int i5 = x44.this.f35512X;
                                arrayList.add(new C6685f(i5, i5));
                            }
                        } else if (!z2 && gVar.getIcon() != null) {
                            mo49375a(i3, this.f35525a.size());
                            z2 = true;
                        }
                        C6686g gVar3 = new C6686g(gVar);
                        gVar3.f35532b = z2;
                        this.f35525a.add(gVar3);
                        i = groupId;
                    }
                    i2++;
                    z = true;
                }
                this.f35527e = false;
            }
        }

        /* renamed from: i */
        public void mo49383i(Bundle bundle) {
            C0177g a;
            View actionView;
            ParcelableSparseArray parcelableSparseArray;
            C0177g a2;
            int i = bundle.getInt("android:menu:checked", 0);
            if (i != 0) {
                this.f35527e = true;
                int size = this.f35525a.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    C6684e eVar = this.f35525a.get(i2);
                    if ((eVar instanceof C6686g) && (a2 = ((C6686g) eVar).mo49389a()) != null && a2.getItemId() == i) {
                        mo49384j(a2);
                        break;
                    }
                    i2++;
                }
                this.f35527e = false;
                mo49382h();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:action_views");
            if (sparseParcelableArray != null) {
                int size2 = this.f35525a.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    C6684e eVar2 = this.f35525a.get(i3);
                    if (!(!(eVar2 instanceof C6686g) || (a = ((C6686g) eVar2).mo49389a()) == null || (actionView = a.getActionView()) == null || (parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray.get(a.getItemId())) == null)) {
                        actionView.restoreHierarchyState(parcelableSparseArray);
                    }
                }
            }
        }

        /* renamed from: j */
        public void mo49384j(C0177g gVar) {
            if (this.f35526d != gVar && gVar.isCheckable()) {
                C0177g gVar2 = this.f35526d;
                if (gVar2 != null) {
                    gVar2.setChecked(false);
                }
                this.f35526d = gVar;
                gVar.setChecked(true);
            }
        }

        /* renamed from: k */
        public void mo49385k(boolean z) {
            this.f35527e = z;
        }

        /* renamed from: l */
        public void mo49386l() {
            mo49382h();
            notifyDataSetChanged();
        }
    }

    /* renamed from: x44$d */
    /* compiled from: NavigationMenuPresenter */
    public static class C6683d implements C6684e {
    }

    /* renamed from: x44$e */
    /* compiled from: NavigationMenuPresenter */
    public interface C6684e {
    }

    /* renamed from: x44$f */
    /* compiled from: NavigationMenuPresenter */
    public static class C6685f implements C6684e {

        /* renamed from: a */
        public final int f35529a;

        /* renamed from: b */
        public final int f35530b;

        public C6685f(int i, int i2) {
            this.f35529a = i;
            this.f35530b = i2;
        }

        /* renamed from: a */
        public int mo49387a() {
            return this.f35530b;
        }

        /* renamed from: b */
        public int mo49388b() {
            return this.f35529a;
        }
    }

    /* renamed from: x44$g */
    /* compiled from: NavigationMenuPresenter */
    public static class C6686g implements C6684e {

        /* renamed from: a */
        public final C0177g f35531a;

        /* renamed from: b */
        public boolean f35532b;

        public C6686g(C0177g gVar) {
            this.f35531a = gVar;
        }

        /* renamed from: a */
        public C0177g mo49389a() {
            return this.f35531a;
        }
    }

    /* renamed from: x44$h */
    /* compiled from: NavigationMenuPresenter */
    public class C6687h extends C1339s {
        public C6687h(RecyclerView recyclerView) {
            super(recyclerView);
        }

        /* renamed from: g */
        public void mo5479g(View view, C3335t8 t8Var) {
            super.mo5479g(view, t8Var);
            t8Var.mo26243h0(C3335t8.C3337b.m27594a(x44.this.f35520r.mo49378d(), 0, false));
        }
    }

    /* renamed from: x44$i */
    /* compiled from: NavigationMenuPresenter */
    public static class C6688i extends C6691l {
        public C6688i(LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(c45.design_navigation_item, viewGroup, false));
            this.itemView.setOnClickListener(onClickListener);
        }
    }

    /* renamed from: x44$j */
    /* compiled from: NavigationMenuPresenter */
    public static class C6689j extends C6691l {
        public C6689j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(c45.design_navigation_item_separator, viewGroup, false));
        }
    }

    /* renamed from: x44$k */
    /* compiled from: NavigationMenuPresenter */
    public static class C6690k extends C6691l {
        public C6690k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(c45.design_navigation_item_subheader, viewGroup, false));
        }
    }

    /* renamed from: x44$l */
    /* compiled from: NavigationMenuPresenter */
    public static abstract class C6691l extends RecyclerView.C1231a0 {
        public C6691l(View view) {
            super(view);
        }
    }

    /* renamed from: A */
    public void mo49348A(Drawable drawable) {
        this.f35504C = drawable;
        mo1310i(false);
    }

    /* renamed from: B */
    public void mo49349B(int i) {
        this.f35505H = i;
        mo1310i(false);
    }

    /* renamed from: C */
    public void mo49350C(int i) {
        this.f35506I = i;
        mo1310i(false);
    }

    /* renamed from: D */
    public void mo49351D(int i) {
        if (this.f35507L != i) {
            this.f35507L = i;
            this.f35508M = true;
            mo1310i(false);
        }
    }

    /* renamed from: E */
    public void mo49352E(ColorStateList colorStateList) {
        this.f35503B = colorStateList;
        mo1310i(false);
    }

    /* renamed from: F */
    public void mo49353F(int i) {
        this.f35510Q = i;
        mo1310i(false);
    }

    /* renamed from: G */
    public void mo49354G(int i) {
        this.f35522x = i;
        this.f35523y = true;
        mo1310i(false);
    }

    /* renamed from: H */
    public void mo49355H(ColorStateList colorStateList) {
        this.f35502A = colorStateList;
        mo1310i(false);
    }

    /* renamed from: I */
    public void mo49356I(int i) {
        this.f35513Y = i;
        NavigationMenuView navigationMenuView = this.f35515a;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(i);
        }
    }

    /* renamed from: J */
    public void mo49357J(boolean z) {
        C6682c cVar = this.f35520r;
        if (cVar != null) {
            cVar.mo49385k(z);
        }
    }

    /* renamed from: K */
    public final void mo49358K() {
        int i;
        if (this.f35516d.getChildCount() != 0 || !this.f35509P) {
            i = 0;
        } else {
            i = this.f35511U;
        }
        NavigationMenuView navigationMenuView = this.f35515a;
        navigationMenuView.setPadding(0, i, 0, navigationMenuView.getPaddingBottom());
    }

    /* renamed from: b */
    public void mo1304b(C0173e eVar, boolean z) {
        C0182i.C0183a aVar = this.f35517e;
        if (aVar != null) {
            aVar.mo1168b(eVar, z);
        }
    }

    /* renamed from: c */
    public void mo49359c(View view) {
        this.f35516d.addView(view);
        NavigationMenuView navigationMenuView = this.f35515a;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    /* renamed from: d */
    public boolean mo1306d(C0173e eVar, C0177g gVar) {
        return false;
    }

    /* renamed from: f */
    public void mo1331f(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f35515a.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                this.f35520r.mo49383i(bundle2);
            }
            SparseArray sparseParcelableArray2 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray2 != null) {
                this.f35516d.restoreHierarchyState(sparseParcelableArray2);
            }
        }
    }

    /* renamed from: g */
    public boolean mo1308g(C0189l lVar) {
        return false;
    }

    public int getId() {
        return this.f35519k;
    }

    /* renamed from: h */
    public Parcelable mo1332h() {
        Bundle bundle = new Bundle();
        if (this.f35515a != null) {
            SparseArray sparseArray = new SparseArray();
            this.f35515a.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        C6682c cVar = this.f35520r;
        if (cVar != null) {
            bundle.putBundle("android:menu:adapter", cVar.mo49376b());
        }
        if (this.f35516d != null) {
            SparseArray sparseArray2 = new SparseArray();
            this.f35516d.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray2);
        }
        return bundle;
    }

    /* renamed from: i */
    public void mo1310i(boolean z) {
        C6682c cVar = this.f35520r;
        if (cVar != null) {
            cVar.mo49386l();
        }
    }

    /* renamed from: j */
    public boolean mo1333j() {
        return false;
    }

    /* renamed from: k */
    public boolean mo1311k(C0173e eVar, C0177g gVar) {
        return false;
    }

    /* renamed from: l */
    public void mo1312l(Context context, C0173e eVar) {
        this.f35521s = LayoutInflater.from(context);
        this.f35518g = eVar;
        this.f35512X = context.getResources().getDimensionPixelOffset(k25.design_navigation_separator_vertical_padding);
    }

    /* renamed from: m */
    public void mo49360m(hl7 hl7) {
        int m = hl7.mo21240m();
        if (this.f35511U != m) {
            this.f35511U = m;
            mo49358K();
        }
        NavigationMenuView navigationMenuView = this.f35515a;
        navigationMenuView.setPadding(0, navigationMenuView.getPaddingTop(), 0, hl7.mo21237j());
        ga7.m17766g(this.f35516d, hl7);
    }

    /* renamed from: n */
    public C0177g mo49361n() {
        return this.f35520r.mo49377c();
    }

    /* renamed from: o */
    public int mo49362o() {
        return this.f35516d.getChildCount();
    }

    /* renamed from: p */
    public Drawable mo49363p() {
        return this.f35504C;
    }

    /* renamed from: q */
    public int mo49364q() {
        return this.f35505H;
    }

    /* renamed from: r */
    public int mo49365r() {
        return this.f35506I;
    }

    /* renamed from: s */
    public int mo49366s() {
        return this.f35510Q;
    }

    /* renamed from: t */
    public ColorStateList mo49367t() {
        return this.f35502A;
    }

    /* renamed from: u */
    public ColorStateList mo49368u() {
        return this.f35503B;
    }

    /* renamed from: v */
    public C0184j mo49369v(ViewGroup viewGroup) {
        if (this.f35515a == null) {
            NavigationMenuView navigationMenuView = (NavigationMenuView) this.f35521s.inflate(c45.design_navigation_menu, viewGroup, false);
            this.f35515a = navigationMenuView;
            navigationMenuView.setAccessibilityDelegateCompat(new C6687h(this.f35515a));
            if (this.f35520r == null) {
                this.f35520r = new C6682c();
            }
            int i = this.f35513Y;
            if (i != -1) {
                this.f35515a.setOverScrollMode(i);
            }
            this.f35516d = (LinearLayout) this.f35521s.inflate(c45.design_navigation_item_header, this.f35515a, false);
            this.f35515a.setAdapter(this.f35520r);
        }
        return this.f35515a;
    }

    /* renamed from: w */
    public View mo49370w(int i) {
        View inflate = this.f35521s.inflate(i, this.f35516d, false);
        mo49359c(inflate);
        return inflate;
    }

    /* renamed from: x */
    public void mo49371x(boolean z) {
        if (this.f35509P != z) {
            this.f35509P = z;
            mo49358K();
        }
    }

    /* renamed from: y */
    public void mo49372y(C0177g gVar) {
        this.f35520r.mo49384j(gVar);
    }

    /* renamed from: z */
    public void mo49373z(int i) {
        this.f35519k = i;
    }
}
