package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0163a;
import androidx.appcompat.view.menu.C0173e;
import androidx.appcompat.view.menu.C0177g;
import androidx.appcompat.view.menu.C0179h;
import androidx.appcompat.view.menu.C0182i;
import androidx.appcompat.view.menu.C0184j;
import androidx.appcompat.view.menu.C0189l;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import p000.C2532i9;

public class ActionMenuPresenter extends C0163a implements C2532i9.C2533a {

    /* renamed from: B */
    public C0200d f926B;

    /* renamed from: C */
    public Drawable f927C;

    /* renamed from: H */
    public boolean f928H;

    /* renamed from: I */
    public boolean f929I;

    /* renamed from: L */
    public boolean f930L;

    /* renamed from: M */
    public int f931M;

    /* renamed from: P */
    public int f932P;

    /* renamed from: Q */
    public int f933Q;

    /* renamed from: U */
    public boolean f934U;

    /* renamed from: X */
    public boolean f935X;

    /* renamed from: Y */
    public boolean f936Y;

    /* renamed from: Z */
    public boolean f937Z;

    /* renamed from: b1 */
    public C0197a f938b1;

    /* renamed from: e0 */
    public int f939e0;

    /* renamed from: e1 */
    public C0199c f940e1;

    /* renamed from: k0 */
    public final SparseBooleanArray f941k0 = new SparseBooleanArray();

    /* renamed from: o1 */
    public C0198b f942o1;

    /* renamed from: p1 */
    public final C0203f f943p1 = new C0203f();

    /* renamed from: q1 */
    public int f944q1;

    /* renamed from: v0 */
    public C0202e f945v0;

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0196a();

        /* renamed from: a */
        public int f946a;

        /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$SavedState$a */
        public class C0196a implements Parcelable.Creator<SavedState> {
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f946a);
        }

        public SavedState(Parcel parcel) {
            this.f946a = parcel.readInt();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$a */
    public class C0197a extends C0179h {
        public C0197a(Context context, C0189l lVar, View view) {
            super(context, lVar, view, false, m15.actionOverflowMenuStyle);
            if (!((C0177g) lVar.getItem()).mo1502l()) {
                View view2 = ActionMenuPresenter.this.f926B;
                mo1551f(view2 == null ? (View) ActionMenuPresenter.this.f710y : view2);
            }
            mo1555j(ActionMenuPresenter.this.f943p1);
        }

        /* renamed from: e */
        public void mo1550e() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            actionMenuPresenter.f938b1 = null;
            actionMenuPresenter.f944q1 = 0;
            super.mo1550e();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$b */
    public class C0198b extends ActionMenuItemView.C0162b {
        public C0198b() {
        }

        /* renamed from: a */
        public w06 mo1283a() {
            C0197a aVar = ActionMenuPresenter.this.f938b1;
            if (aVar != null) {
                return aVar.mo1548c();
            }
            return null;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$c */
    public class C0199c implements Runnable {

        /* renamed from: a */
        public C0202e f949a;

        public C0199c(C0202e eVar) {
            this.f949a = eVar;
        }

        public void run() {
            if (ActionMenuPresenter.this.f704e != null) {
                ActionMenuPresenter.this.f704e.mo1417d();
            }
            View view = (View) ActionMenuPresenter.this.f710y;
            if (!(view == null || view.getWindowToken() == null || !this.f949a.mo1558m())) {
                ActionMenuPresenter.this.f945v0 = this.f949a;
            }
            ActionMenuPresenter.this.f940e1 = null;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$d */
    public class C0200d extends AppCompatImageView implements ActionMenuView.C0204a {

        /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$d$a */
        public class C0201a extends k82 {

            /* renamed from: A */
            public final /* synthetic */ ActionMenuPresenter f952A;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0201a(View view, ActionMenuPresenter actionMenuPresenter) {
                super(view);
                this.f952A = actionMenuPresenter;
            }

            /* renamed from: b */
            public w06 mo1281b() {
                C0202e eVar = ActionMenuPresenter.this.f945v0;
                if (eVar == null) {
                    return null;
                }
                return eVar.mo1548c();
            }

            /* renamed from: c */
            public boolean mo1282c() {
                ActionMenuPresenter.this.mo1702N();
                return true;
            }

            /* renamed from: d */
            public boolean mo1713d() {
                ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
                if (actionMenuPresenter.f940e1 != null) {
                    return false;
                }
                actionMenuPresenter.mo1693E();
                return true;
            }
        }

        public C0200d(Context context) {
            super(context, (AttributeSet) null, m15.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            xr6.m30294a(this, getContentDescription());
            setOnTouchListener(new C0201a(this, ActionMenuPresenter.this));
        }

        /* renamed from: a */
        public boolean mo1258a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo1259b() {
            return false;
        }

        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.mo1702N();
            return true;
        }

        public boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                ij1.m19653l(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$e */
    public class C0202e extends C0179h {
        public C0202e(Context context, C0173e eVar, View view, boolean z) {
            super(context, eVar, view, z, m15.actionOverflowMenuStyle);
            mo1553h(8388613);
            mo1555j(ActionMenuPresenter.this.f943p1);
        }

        /* renamed from: e */
        public void mo1550e() {
            if (ActionMenuPresenter.this.f704e != null) {
                ActionMenuPresenter.this.f704e.close();
            }
            ActionMenuPresenter.this.f945v0 = null;
            super.mo1550e();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$f */
    public class C0203f implements C0182i.C0183a {
        public C0203f() {
        }

        /* renamed from: b */
        public void mo1168b(C0173e eVar, boolean z) {
            if (eVar instanceof C0189l) {
                eVar.mo1378F().mo1419e(false);
            }
            C0182i.C0183a p = ActionMenuPresenter.this.mo1316p();
            if (p != null) {
                p.mo1168b(eVar, z);
            }
        }

        /* renamed from: c */
        public boolean mo1169c(C0173e eVar) {
            if (eVar == ActionMenuPresenter.this.f704e) {
                return false;
            }
            ActionMenuPresenter.this.f944q1 = ((C0189l) eVar).getItem().getItemId();
            C0182i.C0183a p = ActionMenuPresenter.this.mo1316p();
            if (p != null) {
                return p.mo1169c(eVar);
            }
            return false;
        }
    }

    public ActionMenuPresenter(Context context) {
        super(context, i45.abc_action_menu_layout, i45.abc_action_menu_item_layout);
    }

    /* renamed from: B */
    public boolean mo1690B() {
        return mo1693E() | mo1694F();
    }

    /* renamed from: C */
    public final View mo1691C(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f710y;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof C0184j.C0185a) && ((C0184j.C0185a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: D */
    public Drawable mo1692D() {
        C0200d dVar = this.f926B;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f928H) {
            return this.f927C;
        }
        return null;
    }

    /* renamed from: E */
    public boolean mo1693E() {
        C0184j jVar;
        C0199c cVar = this.f940e1;
        if (cVar == null || (jVar = this.f710y) == null) {
            C0202e eVar = this.f945v0;
            if (eVar == null) {
                return false;
            }
            eVar.mo1547b();
            return true;
        }
        ((View) jVar).removeCallbacks(cVar);
        this.f940e1 = null;
        return true;
    }

    /* renamed from: F */
    public boolean mo1694F() {
        C0197a aVar = this.f938b1;
        if (aVar == null) {
            return false;
        }
        aVar.mo1547b();
        return true;
    }

    /* renamed from: G */
    public boolean mo1695G() {
        if (this.f940e1 != null || mo1696H()) {
            return true;
        }
        return false;
    }

    /* renamed from: H */
    public boolean mo1696H() {
        C0202e eVar = this.f945v0;
        if (eVar == null || !eVar.mo1549d()) {
            return false;
        }
        return true;
    }

    /* renamed from: I */
    public void mo1697I(Configuration configuration) {
        if (!this.f934U) {
            this.f933Q = C2215e9.m15978b(this.f703d).mo19210d();
        }
        C0173e eVar = this.f704e;
        if (eVar != null) {
            eVar.mo1385M(true);
        }
    }

    /* renamed from: J */
    public void mo1698J(boolean z) {
        this.f937Z = z;
    }

    /* renamed from: K */
    public void mo1699K(ActionMenuView actionMenuView) {
        this.f710y = actionMenuView;
        actionMenuView.mo1284a(this.f704e);
    }

    /* renamed from: L */
    public void mo1700L(Drawable drawable) {
        C0200d dVar = this.f926B;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        this.f928H = true;
        this.f927C = drawable;
    }

    /* renamed from: M */
    public void mo1701M(boolean z) {
        this.f929I = z;
        this.f930L = true;
    }

    /* renamed from: N */
    public boolean mo1702N() {
        C0173e eVar;
        if (!this.f929I || mo1696H() || (eVar = this.f704e) == null || this.f710y == null || this.f940e1 != null || eVar.mo1375B().isEmpty()) {
            return false;
        }
        C0199c cVar = new C0199c(new C0202e(this.f703d, this.f704e, this.f926B, true));
        this.f940e1 = cVar;
        ((View) this.f710y).post(cVar);
        return true;
    }

    /* renamed from: a */
    public void mo1703a(boolean z) {
        if (z) {
            super.mo1308g((C0189l) null);
            return;
        }
        C0173e eVar = this.f704e;
        if (eVar != null) {
            eVar.mo1419e(false);
        }
    }

    /* renamed from: b */
    public void mo1304b(C0173e eVar, boolean z) {
        mo1690B();
        super.mo1304b(eVar, z);
    }

    /* renamed from: f */
    public void mo1331f(Parcelable parcelable) {
        int i;
        MenuItem findItem;
        if ((parcelable instanceof SavedState) && (i = ((SavedState) parcelable).f946a) > 0 && (findItem = this.f704e.findItem(i)) != null) {
            mo1308g((C0189l) findItem.getSubMenu());
        }
    }

    /* renamed from: g */
    public boolean mo1308g(C0189l lVar) {
        boolean z = false;
        if (!lVar.hasVisibleItems()) {
            return false;
        }
        C0189l lVar2 = lVar;
        while (lVar2.mo1568i0() != this.f704e) {
            lVar2 = (C0189l) lVar2.mo1568i0();
        }
        View C = mo1691C(lVar2.getItem());
        if (C == null) {
            return false;
        }
        this.f944q1 = lVar.getItem().getItemId();
        int size = lVar.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            MenuItem item = lVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i++;
        }
        C0197a aVar = new C0197a(this.f703d, lVar, C);
        this.f938b1 = aVar;
        aVar.mo1552g(z);
        this.f938b1.mo1556k();
        super.mo1308g(lVar);
        return true;
    }

    /* renamed from: h */
    public Parcelable mo1332h() {
        SavedState savedState = new SavedState();
        savedState.f946a = this.f944q1;
        return savedState;
    }

    /* renamed from: i */
    public void mo1310i(boolean z) {
        ArrayList<C0177g> arrayList;
        C0184j jVar;
        super.mo1310i(z);
        ((View) this.f710y).requestLayout();
        C0173e eVar = this.f704e;
        boolean z2 = false;
        if (eVar != null) {
            ArrayList<C0177g> u = eVar.mo1452u();
            int size = u.size();
            for (int i = 0; i < size; i++) {
                C2532i9 b = u.get(i).mo1466b();
                if (b != null) {
                    b.mo21504i(this);
                }
            }
        }
        C0173e eVar2 = this.f704e;
        if (eVar2 != null) {
            arrayList = eVar2.mo1375B();
        } else {
            arrayList = null;
        }
        if (this.f929I && arrayList != null) {
            int size2 = arrayList.size();
            if (size2 == 1) {
                z2 = !arrayList.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.f926B == null) {
                this.f926B = new C0200d(this.f702a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f926B.getParent();
            if (viewGroup != this.f710y) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f926B);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f710y;
                actionMenuView.addView(this.f926B, actionMenuView.mo1727i());
            }
        } else {
            C0200d dVar = this.f926B;
            if (dVar != null && dVar.getParent() == (jVar = this.f710y)) {
                ((ViewGroup) jVar).removeView(this.f926B);
            }
        }
        ((ActionMenuView) this.f710y).setOverflowReserved(this.f929I);
    }

    /* renamed from: j */
    public boolean mo1333j() {
        int i;
        ArrayList<C0177g> arrayList;
        int i2;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        boolean z3;
        ActionMenuPresenter actionMenuPresenter = this;
        C0173e eVar = actionMenuPresenter.f704e;
        View view = null;
        boolean z4 = false;
        if (eVar != null) {
            arrayList = eVar.mo1379G();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i5 = actionMenuPresenter.f933Q;
        int i6 = actionMenuPresenter.f932P;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) actionMenuPresenter.f710y;
        boolean z5 = false;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < i; i9++) {
            C0177g gVar = arrayList.get(i9);
            if (gVar.mo1505o()) {
                i7++;
            } else if (gVar.mo1504n()) {
                i8++;
            } else {
                z5 = true;
            }
            if (actionMenuPresenter.f937Z && gVar.isActionViewExpanded()) {
                i5 = 0;
            }
        }
        if (actionMenuPresenter.f929I && (z5 || i8 + i7 > i5)) {
            i5--;
        }
        int i10 = i5 - i7;
        SparseBooleanArray sparseBooleanArray = actionMenuPresenter.f941k0;
        sparseBooleanArray.clear();
        if (actionMenuPresenter.f935X) {
            int i11 = actionMenuPresenter.f939e0;
            i2 = i6 / i11;
            i3 = i11 + ((i6 % i11) / i2);
        } else {
            i3 = 0;
            i2 = 0;
        }
        int i12 = 0;
        int i13 = 0;
        while (i12 < i) {
            C0177g gVar2 = arrayList.get(i12);
            if (gVar2.mo1505o()) {
                View q = actionMenuPresenter.mo1317q(gVar2, view, viewGroup);
                if (actionMenuPresenter.f935X) {
                    i2 -= ActionMenuView.m1306o(q, i3, i2, makeMeasureSpec, z4 ? 1 : 0);
                } else {
                    q.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = q.getMeasuredWidth();
                i6 -= measuredWidth;
                if (i13 == 0) {
                    i13 = measuredWidth;
                }
                int groupId = gVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                gVar2.mo1539u(true);
                z = z4;
                i4 = i;
            } else if (gVar2.mo1504n()) {
                int groupId2 = gVar2.getGroupId();
                boolean z6 = sparseBooleanArray.get(groupId2);
                if ((i10 > 0 || z6) && i6 > 0 && (!actionMenuPresenter.f935X || i2 > 0)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z7 = z2;
                i4 = i;
                if (z2) {
                    View q2 = actionMenuPresenter.mo1317q(gVar2, (View) null, viewGroup);
                    if (actionMenuPresenter.f935X) {
                        int o = ActionMenuView.m1306o(q2, i3, i2, makeMeasureSpec, 0);
                        i2 -= o;
                        if (o == 0) {
                            z7 = false;
                        }
                    } else {
                        q2.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    boolean z8 = z7;
                    int measuredWidth2 = q2.getMeasuredWidth();
                    i6 -= measuredWidth2;
                    if (i13 == 0) {
                        i13 = measuredWidth2;
                    }
                    if (!actionMenuPresenter.f935X ? i6 + i13 <= 0 : i6 < 0) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    z2 = z8 & z3;
                }
                if (z2 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z6) {
                    sparseBooleanArray.put(groupId2, false);
                    int i14 = 0;
                    while (i14 < i12) {
                        C0177g gVar3 = arrayList.get(i14);
                        if (gVar3.getGroupId() == groupId2) {
                            if (gVar3.mo1502l()) {
                                i10++;
                            }
                            gVar3.mo1539u(false);
                        }
                        i14++;
                    }
                }
                if (z2) {
                    i10--;
                }
                gVar2.mo1539u(z2);
                z = false;
            } else {
                z = z4;
                i4 = i;
                gVar2.mo1539u(z);
            }
            i12++;
            z4 = z;
            i = i4;
            view = null;
            actionMenuPresenter = this;
        }
        return true;
    }

    /* renamed from: l */
    public void mo1312l(Context context, C0173e eVar) {
        super.mo1312l(context, eVar);
        Resources resources = context.getResources();
        C2215e9 b = C2215e9.m15978b(context);
        if (!this.f930L) {
            this.f929I = b.mo19214h();
        }
        if (!this.f936Y) {
            this.f931M = b.mo19209c();
        }
        if (!this.f934U) {
            this.f933Q = b.mo19210d();
        }
        int i = this.f931M;
        if (this.f929I) {
            if (this.f926B == null) {
                C0200d dVar = new C0200d(this.f702a);
                this.f926B = dVar;
                if (this.f928H) {
                    dVar.setImageDrawable(this.f927C);
                    this.f927C = null;
                    this.f928H = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f926B.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.f926B.getMeasuredWidth();
        } else {
            this.f926B = null;
        }
        this.f932P = i;
        this.f939e0 = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    /* renamed from: m */
    public void mo1313m(C0177g gVar, C0184j.C0185a aVar) {
        aVar.mo1260c(gVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f710y);
        if (this.f942o1 == null) {
            this.f942o1 = new C0198b();
        }
        actionMenuItemView.setPopupCallback(this.f942o1);
    }

    /* renamed from: o */
    public boolean mo1315o(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.f926B) {
            return false;
        }
        return super.mo1315o(viewGroup, i);
    }

    /* renamed from: q */
    public View mo1317q(C0177g gVar, View view, ViewGroup viewGroup) {
        int i;
        View actionView = gVar.getActionView();
        if (actionView == null || gVar.mo1500j()) {
            actionView = super.mo1317q(gVar, view, viewGroup);
        }
        if (gVar.isActionViewExpanded()) {
            i = 8;
        } else {
            i = 0;
        }
        actionView.setVisibility(i);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    /* renamed from: r */
    public C0184j mo1318r(ViewGroup viewGroup) {
        C0184j jVar = this.f710y;
        C0184j r = super.mo1318r(viewGroup);
        if (jVar != r) {
            ((ActionMenuView) r).setPresenter(this);
        }
        return r;
    }

    /* renamed from: t */
    public boolean mo1320t(int i, C0177g gVar) {
        return gVar.mo1502l();
    }
}
