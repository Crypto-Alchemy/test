package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.appcompat.view.menu.e */
/* compiled from: MenuBuilder */
public class C0173e implements xd6 {

    /* renamed from: A */
    public static final int[] f766A = {1, 4, 5, 3, 2, 0};

    /* renamed from: a */
    public final Context f767a;

    /* renamed from: b */
    public final Resources f768b;

    /* renamed from: c */
    public boolean f769c;

    /* renamed from: d */
    public boolean f770d;

    /* renamed from: e */
    public C0174a f771e;

    /* renamed from: f */
    public ArrayList<C0177g> f772f;

    /* renamed from: g */
    public ArrayList<C0177g> f773g;

    /* renamed from: h */
    public boolean f774h;

    /* renamed from: i */
    public ArrayList<C0177g> f775i;

    /* renamed from: j */
    public ArrayList<C0177g> f776j;

    /* renamed from: k */
    public boolean f777k;

    /* renamed from: l */
    public int f778l = 0;

    /* renamed from: m */
    public ContextMenu.ContextMenuInfo f779m;

    /* renamed from: n */
    public CharSequence f780n;

    /* renamed from: o */
    public Drawable f781o;

    /* renamed from: p */
    public View f782p;

    /* renamed from: q */
    public boolean f783q = false;

    /* renamed from: r */
    public boolean f784r = false;

    /* renamed from: s */
    public boolean f785s = false;

    /* renamed from: t */
    public boolean f786t = false;

    /* renamed from: u */
    public boolean f787u = false;

    /* renamed from: v */
    public ArrayList<C0177g> f788v = new ArrayList<>();

    /* renamed from: w */
    public CopyOnWriteArrayList<WeakReference<C0182i>> f789w = new CopyOnWriteArrayList<>();

    /* renamed from: x */
    public C0177g f790x;

    /* renamed from: y */
    public boolean f791y = false;

    /* renamed from: z */
    public boolean f792z;

    /* renamed from: androidx.appcompat.view.menu.e$a */
    /* compiled from: MenuBuilder */
    public interface C0174a {
        /* renamed from: a */
        boolean mo1098a(C0173e eVar, MenuItem menuItem);

        /* renamed from: b */
        void mo1100b(C0173e eVar);
    }

    /* renamed from: androidx.appcompat.view.menu.e$b */
    /* compiled from: MenuBuilder */
    public interface C0175b {
        /* renamed from: b */
        boolean mo1285b(C0177g gVar);
    }

    public C0173e(Context context) {
        this.f767a = context;
        this.f768b = context.getResources();
        this.f772f = new ArrayList<>();
        this.f773g = new ArrayList<>();
        this.f774h = true;
        this.f775i = new ArrayList<>();
        this.f776j = new ArrayList<>();
        this.f777k = true;
        mo1422f0(true);
    }

    /* renamed from: D */
    public static int m1071D(int i) {
        int i2 = (-65536 & i) >> 16;
        if (i2 >= 0) {
            int[] iArr = f766A;
            if (i2 < iArr.length) {
                return (i & 65535) | (iArr[i2] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    /* renamed from: p */
    public static int m1072p(ArrayList<C0177g> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).mo1471f() <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    /* renamed from: A */
    public View mo1374A() {
        return this.f782p;
    }

    /* renamed from: B */
    public ArrayList<C0177g> mo1375B() {
        mo1451t();
        return this.f776j;
    }

    /* renamed from: C */
    public boolean mo1376C() {
        return this.f786t;
    }

    /* renamed from: E */
    public Resources mo1377E() {
        return this.f768b;
    }

    /* renamed from: F */
    public C0173e mo1378F() {
        return this;
    }

    /* renamed from: G */
    public ArrayList<C0177g> mo1379G() {
        if (!this.f774h) {
            return this.f773g;
        }
        this.f773g.clear();
        int size = this.f772f.size();
        for (int i = 0; i < size; i++) {
            C0177g gVar = this.f772f.get(i);
            if (gVar.isVisible()) {
                this.f773g.add(gVar);
            }
        }
        this.f774h = false;
        this.f777k = true;
        return this.f773g;
    }

    /* renamed from: H */
    public boolean mo1380H() {
        return this.f791y;
    }

    /* renamed from: I */
    public boolean mo1381I() {
        return this.f769c;
    }

    /* renamed from: J */
    public boolean mo1382J() {
        return this.f770d;
    }

    /* renamed from: K */
    public void mo1383K(C0177g gVar) {
        this.f777k = true;
        mo1385M(true);
    }

    /* renamed from: L */
    public void mo1384L(C0177g gVar) {
        this.f774h = true;
        mo1385M(true);
    }

    /* renamed from: M */
    public void mo1385M(boolean z) {
        if (!this.f783q) {
            if (z) {
                this.f774h = true;
                this.f777k = true;
            }
            mo1430i(z);
            return;
        }
        this.f784r = true;
        if (z) {
            this.f785s = true;
        }
    }

    /* renamed from: N */
    public boolean mo1386N(MenuItem menuItem, int i) {
        return mo1387O(menuItem, (C0182i) null, i);
    }

    /* renamed from: O */
    public boolean mo1387O(MenuItem menuItem, C0182i iVar, int i) {
        boolean z;
        C0177g gVar = (C0177g) menuItem;
        if (gVar == null || !gVar.isEnabled()) {
            return false;
        }
        boolean k = gVar.mo1501k();
        C2532i9 b = gVar.mo1466b();
        if (b == null || !b.mo11872a()) {
            z = false;
        } else {
            z = true;
        }
        if (gVar.mo1500j()) {
            k |= gVar.expandActionView();
            if (k) {
                mo1419e(true);
            }
        } else if (gVar.hasSubMenu() || z) {
            if ((i & 4) == 0) {
                mo1419e(false);
            }
            if (!gVar.hasSubMenu()) {
                gVar.mo1542x(new C0189l(mo1454w(), this, gVar));
            }
            C0189l lVar = (C0189l) gVar.getSubMenu();
            if (z) {
                b.mo11875f(lVar);
            }
            k |= mo1434l(lVar, iVar);
            if (!k) {
                mo1419e(true);
            }
        } else if ((i & 1) == 0) {
            mo1419e(true);
        }
        return k;
    }

    /* renamed from: P */
    public final void mo1388P(int i, boolean z) {
        if (i >= 0 && i < this.f772f.size()) {
            this.f772f.remove(i);
            if (z) {
                mo1385M(true);
            }
        }
    }

    /* renamed from: Q */
    public void mo1389Q(C0182i iVar) {
        Iterator<WeakReference<C0182i>> it = this.f789w.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            C0182i iVar2 = (C0182i) next.get();
            if (iVar2 == null || iVar2 == iVar) {
                this.f789w.remove(next);
            }
        }
    }

    /* renamed from: R */
    public void mo1390R(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(mo1453v());
            int size = size();
            for (int i = 0; i < size; i++) {
                MenuItem item = getItem(i);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((C0189l) item.getSubMenu()).mo1390R(bundle);
                }
            }
            int i2 = bundle.getInt("android:menu:expandedactionview");
            if (i2 > 0 && (findItem = findItem(i2)) != null) {
                findItem.expandActionView();
            }
        }
    }

    /* renamed from: S */
    public void mo1391S(Bundle bundle) {
        mo1432j(bundle);
    }

    /* renamed from: T */
    public void mo1392T(Bundle bundle) {
        int size = size();
        SparseArray sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((C0189l) item.getSubMenu()).mo1392T(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo1453v(), sparseArray);
        }
    }

    /* renamed from: U */
    public void mo1393U(Bundle bundle) {
        mo1433k(bundle);
    }

    /* renamed from: V */
    public void mo1394V(C0174a aVar) {
        this.f771e = aVar;
    }

    /* renamed from: W */
    public C0173e mo1395W(int i) {
        this.f778l = i;
        return this;
    }

    /* renamed from: X */
    public void mo1396X(MenuItem menuItem) {
        boolean z;
        int groupId = menuItem.getGroupId();
        int size = this.f772f.size();
        mo1428h0();
        for (int i = 0; i < size; i++) {
            C0177g gVar = this.f772f.get(i);
            if (gVar.getGroupId() == groupId && gVar.mo1503m() && gVar.isCheckable()) {
                if (gVar == menuItem) {
                    z = true;
                } else {
                    z = false;
                }
                gVar.mo1509s(z);
            }
        }
        mo1425g0();
    }

    /* renamed from: Y */
    public C0173e mo1397Y(int i) {
        mo1400a0(0, (CharSequence) null, i, (Drawable) null, (View) null);
        return this;
    }

    /* renamed from: Z */
    public C0173e mo1398Z(Drawable drawable) {
        mo1400a0(0, (CharSequence) null, 0, drawable, (View) null);
        return this;
    }

    /* renamed from: a */
    public MenuItem mo1399a(int i, int i2, int i3, CharSequence charSequence) {
        int D = m1071D(i3);
        C0177g g = mo1424g(i, i2, i3, D, charSequence, this.f778l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f779m;
        if (contextMenuInfo != null) {
            g.mo1540v(contextMenuInfo);
        }
        ArrayList<C0177g> arrayList = this.f772f;
        arrayList.add(m1072p(arrayList, D), g);
        mo1385M(true);
        return g;
    }

    /* renamed from: a0 */
    public final void mo1400a0(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources E = mo1377E();
        if (view != null) {
            this.f782p = view;
            this.f780n = null;
            this.f781o = null;
        } else {
            if (i > 0) {
                this.f780n = E.getText(i);
            } else if (charSequence != null) {
                this.f780n = charSequence;
            }
            if (i2 > 0) {
                this.f781o = zr0.m31442e(mo1454w(), i2);
            } else if (drawable != null) {
                this.f781o = drawable;
            }
            this.f782p = null;
        }
        mo1385M(false);
    }

    public MenuItem add(CharSequence charSequence) {
        return mo1399a(0, 0, 0, charSequence);
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        Intent intent2;
        int i6;
        PackageManager packageManager = this.f767a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        if (queryIntentActivityOptions != null) {
            i5 = queryIntentActivityOptions.size();
        } else {
            i5 = 0;
        }
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i7 = 0; i7 < i5; i7++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i7);
            int i8 = resolveInfo.specificIndex;
            if (i8 < 0) {
                intent2 = intent;
            } else {
                intent2 = intentArr[i8];
            }
            Intent intent3 = new Intent(intent2);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent3.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent4 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent3);
            if (menuItemArr != null && (i6 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i6] = intent4;
            }
        }
        return i5;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* renamed from: b */
    public void mo1410b(C0182i iVar) {
        mo1412c(iVar, this.f767a);
    }

    /* renamed from: b0 */
    public C0173e mo1411b0(int i) {
        mo1400a0(i, (CharSequence) null, 0, (Drawable) null, (View) null);
        return this;
    }

    /* renamed from: c */
    public void mo1412c(C0182i iVar, Context context) {
        this.f789w.add(new WeakReference(iVar));
        iVar.mo1312l(context, this);
        this.f777k = true;
    }

    /* renamed from: c0 */
    public C0173e mo1413c0(CharSequence charSequence) {
        mo1400a0(0, charSequence, 0, (Drawable) null, (View) null);
        return this;
    }

    public void clear() {
        C0177g gVar = this.f790x;
        if (gVar != null) {
            mo1421f(gVar);
        }
        this.f772f.clear();
        mo1385M(true);
    }

    public void clearHeader() {
        this.f781o = null;
        this.f780n = null;
        this.f782p = null;
        mo1385M(false);
    }

    public void close() {
        mo1419e(true);
    }

    /* renamed from: d */
    public void mo1417d() {
        C0174a aVar = this.f771e;
        if (aVar != null) {
            aVar.mo1100b(this);
        }
    }

    /* renamed from: d0 */
    public C0173e mo1418d0(View view) {
        mo1400a0(0, (CharSequence) null, 0, (Drawable) null, view);
        return this;
    }

    /* renamed from: e */
    public final void mo1419e(boolean z) {
        if (!this.f787u) {
            this.f787u = true;
            Iterator<WeakReference<C0182i>> it = this.f789w.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0182i iVar = (C0182i) next.get();
                if (iVar == null) {
                    this.f789w.remove(next);
                } else {
                    iVar.mo1304b(this, z);
                }
            }
            this.f787u = false;
        }
    }

    /* renamed from: e0 */
    public void mo1420e0(boolean z) {
        this.f792z = z;
    }

    /* renamed from: f */
    public boolean mo1421f(C0177g gVar) {
        boolean z = false;
        if (!this.f789w.isEmpty() && this.f790x == gVar) {
            mo1428h0();
            Iterator<WeakReference<C0182i>> it = this.f789w.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0182i iVar = (C0182i) next.get();
                if (iVar == null) {
                    this.f789w.remove(next);
                } else {
                    z = iVar.mo1311k(this, gVar);
                    if (z) {
                        break;
                    }
                }
            }
            mo1425g0();
            if (z) {
                this.f790x = null;
            }
        }
        return z;
    }

    /* renamed from: f0 */
    public final void mo1422f0(boolean z) {
        boolean z2 = true;
        if (!z || this.f768b.getConfiguration().keyboard == 1 || !wb7.m29442e(ViewConfiguration.get(this.f767a), this.f767a)) {
            z2 = false;
        }
        this.f770d = z2;
    }

    public MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C0177g gVar = this.f772f.get(i2);
            if (gVar.getItemId() == i) {
                return gVar;
            }
            if (gVar.hasSubMenu() && (findItem = gVar.getSubMenu().findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    /* renamed from: g */
    public final C0177g mo1424g(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        return new C0177g(this, i, i2, i3, i4, charSequence, i5);
    }

    /* renamed from: g0 */
    public void mo1425g0() {
        this.f783q = false;
        if (this.f784r) {
            this.f784r = false;
            mo1385M(this.f785s);
        }
    }

    public MenuItem getItem(int i) {
        return this.f772f.get(i);
    }

    /* renamed from: h */
    public boolean mo1427h(C0173e eVar, MenuItem menuItem) {
        C0174a aVar = this.f771e;
        if (aVar == null || !aVar.mo1098a(eVar, menuItem)) {
            return false;
        }
        return true;
    }

    /* renamed from: h0 */
    public void mo1428h0() {
        if (!this.f783q) {
            this.f783q = true;
            this.f784r = false;
            this.f785s = false;
        }
    }

    public boolean hasVisibleItems() {
        if (this.f792z) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f772f.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public final void mo1430i(boolean z) {
        if (!this.f789w.isEmpty()) {
            mo1428h0();
            Iterator<WeakReference<C0182i>> it = this.f789w.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0182i iVar = (C0182i) next.get();
                if (iVar == null) {
                    this.f789w.remove(next);
                } else {
                    iVar.mo1310i(z);
                }
            }
            mo1425g0();
        }
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        if (mo1441r(i, keyEvent) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final void mo1432j(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null && !this.f789w.isEmpty()) {
            Iterator<WeakReference<C0182i>> it = this.f789w.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0182i iVar = (C0182i) next.get();
                if (iVar == null) {
                    this.f789w.remove(next);
                } else {
                    int id = iVar.getId();
                    if (id > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id)) != null) {
                        iVar.mo1331f(parcelable);
                    }
                }
            }
        }
    }

    /* renamed from: k */
    public final void mo1433k(Bundle bundle) {
        Parcelable h;
        if (!this.f789w.isEmpty()) {
            SparseArray sparseArray = new SparseArray();
            Iterator<WeakReference<C0182i>> it = this.f789w.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0182i iVar = (C0182i) next.get();
                if (iVar == null) {
                    this.f789w.remove(next);
                } else {
                    int id = iVar.getId();
                    if (id > 0 && (h = iVar.mo1332h()) != null) {
                        sparseArray.put(id, h);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        }
    }

    /* renamed from: l */
    public final boolean mo1434l(C0189l lVar, C0182i iVar) {
        boolean z = false;
        if (this.f789w.isEmpty()) {
            return false;
        }
        if (iVar != null) {
            z = iVar.mo1308g(lVar);
        }
        Iterator<WeakReference<C0182i>> it = this.f789w.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            C0182i iVar2 = (C0182i) next.get();
            if (iVar2 == null) {
                this.f789w.remove(next);
            } else if (!z) {
                z = iVar2.mo1308g(lVar);
            }
        }
        return z;
    }

    /* renamed from: m */
    public boolean mo1435m(C0177g gVar) {
        boolean z = false;
        if (this.f789w.isEmpty()) {
            return false;
        }
        mo1428h0();
        Iterator<WeakReference<C0182i>> it = this.f789w.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            C0182i iVar = (C0182i) next.get();
            if (iVar == null) {
                this.f789w.remove(next);
            } else {
                z = iVar.mo1306d(this, gVar);
                if (z) {
                    break;
                }
            }
        }
        mo1425g0();
        if (z) {
            this.f790x = gVar;
        }
        return z;
    }

    /* renamed from: n */
    public int mo1436n(int i) {
        return mo1437o(i, 0);
    }

    /* renamed from: o */
    public int mo1437o(int i, int i2) {
        int size = size();
        if (i2 < 0) {
            i2 = 0;
        }
        while (i2 < size) {
            if (this.f772f.get(i2).getGroupId() == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public boolean performIdentifierAction(int i, int i2) {
        return mo1386N(findItem(i), i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        boolean z;
        C0177g r = mo1441r(i, keyEvent);
        if (r != null) {
            z = mo1386N(r, i2);
        } else {
            z = false;
        }
        if ((i2 & 2) != 0) {
            mo1419e(true);
        }
        return z;
    }

    /* renamed from: q */
    public int mo1440q(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f772f.get(i2).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: r */
    public C0177g mo1441r(int i, KeyEvent keyEvent) {
        char c;
        ArrayList<C0177g> arrayList = this.f788v;
        arrayList.clear();
        mo1444s(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean I = mo1381I();
        for (int i2 = 0; i2 < size; i2++) {
            C0177g gVar = arrayList.get(i2);
            if (I) {
                c = gVar.getAlphabeticShortcut();
            } else {
                c = gVar.getNumericShortcut();
            }
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (I && c == 8 && i == 67))) {
                return gVar;
            }
        }
        return null;
    }

    public void removeGroup(int i) {
        int n = mo1436n(i);
        if (n >= 0) {
            int size = this.f772f.size() - n;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= size || this.f772f.get(n).getGroupId() != i) {
                    mo1385M(true);
                } else {
                    mo1388P(n, false);
                    i2 = i3;
                }
            }
            mo1385M(true);
        }
    }

    public void removeItem(int i) {
        mo1388P(mo1440q(i), true);
    }

    /* renamed from: s */
    public void mo1444s(List<C0177g> list, int i, KeyEvent keyEvent) {
        char c;
        int i2;
        boolean z;
        boolean I = mo1381I();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f772f.size();
            for (int i3 = 0; i3 < size; i3++) {
                C0177g gVar = this.f772f.get(i3);
                if (gVar.hasSubMenu()) {
                    ((C0173e) gVar.getSubMenu()).mo1444s(list, i, keyEvent);
                }
                if (I) {
                    c = gVar.getAlphabeticShortcut();
                } else {
                    c = gVar.getNumericShortcut();
                }
                if (I) {
                    i2 = gVar.getAlphabeticModifiers();
                } else {
                    i2 = gVar.getNumericModifiers();
                }
                if ((modifiers & 69647) == (i2 & 69647)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && c != 0) {
                    char[] cArr = keyData.meta;
                    if ((c == cArr[0] || c == cArr[2] || (I && c == 8 && i == 67)) && gVar.isEnabled()) {
                        list.add(gVar);
                    }
                }
            }
        }
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f772f.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0177g gVar = this.f772f.get(i2);
            if (gVar.getGroupId() == i) {
                gVar.mo1537t(z2);
                gVar.setCheckable(z);
            }
        }
    }

    public void setGroupDividerEnabled(boolean z) {
        this.f791y = z;
    }

    public void setGroupEnabled(int i, boolean z) {
        int size = this.f772f.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0177g gVar = this.f772f.get(i2);
            if (gVar.getGroupId() == i) {
                gVar.setEnabled(z);
            }
        }
    }

    public void setGroupVisible(int i, boolean z) {
        int size = this.f772f.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C0177g gVar = this.f772f.get(i2);
            if (gVar.getGroupId() == i && gVar.mo1543y(z)) {
                z2 = true;
            }
        }
        if (z2) {
            mo1385M(true);
        }
    }

    public void setQwertyMode(boolean z) {
        this.f769c = z;
        mo1385M(false);
    }

    public int size() {
        return this.f772f.size();
    }

    /* renamed from: t */
    public void mo1451t() {
        ArrayList<C0177g> G = mo1379G();
        if (this.f777k) {
            Iterator<WeakReference<C0182i>> it = this.f789w.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0182i iVar = (C0182i) next.get();
                if (iVar == null) {
                    this.f789w.remove(next);
                } else {
                    z |= iVar.mo1333j();
                }
            }
            if (z) {
                this.f775i.clear();
                this.f776j.clear();
                int size = G.size();
                for (int i = 0; i < size; i++) {
                    C0177g gVar = G.get(i);
                    if (gVar.mo1502l()) {
                        this.f775i.add(gVar);
                    } else {
                        this.f776j.add(gVar);
                    }
                }
            } else {
                this.f775i.clear();
                this.f776j.clear();
                this.f776j.addAll(mo1379G());
            }
            this.f777k = false;
        }
    }

    /* renamed from: u */
    public ArrayList<C0177g> mo1452u() {
        mo1451t();
        return this.f775i;
    }

    /* renamed from: v */
    public String mo1453v() {
        return "android:menu:actionviewstates";
    }

    /* renamed from: w */
    public Context mo1454w() {
        return this.f767a;
    }

    /* renamed from: x */
    public C0177g mo1455x() {
        return this.f790x;
    }

    /* renamed from: y */
    public Drawable mo1456y() {
        return this.f781o;
    }

    /* renamed from: z */
    public CharSequence mo1457z() {
        return this.f780n;
    }

    public MenuItem add(int i) {
        return mo1399a(0, 0, 0, this.f768b.getString(i));
    }

    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, (CharSequence) this.f768b.getString(i));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo1399a(i, i2, i3, charSequence);
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0177g gVar = (C0177g) mo1399a(i, i2, i3, charSequence);
        C0189l lVar = new C0189l(this.f767a, this, gVar);
        gVar.mo1542x(lVar);
        return lVar;
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo1399a(i, i2, i3, this.f768b.getString(i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, (CharSequence) this.f768b.getString(i4));
    }
}
