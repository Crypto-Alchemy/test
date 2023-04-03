package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.C0184j;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.d */
/* compiled from: MenuAdapter */
public class C0172d extends BaseAdapter {

    /* renamed from: a */
    public C0173e f760a;

    /* renamed from: d */
    public int f761d = -1;

    /* renamed from: e */
    public boolean f762e;

    /* renamed from: g */
    public final boolean f763g;

    /* renamed from: k */
    public final LayoutInflater f764k;

    /* renamed from: r */
    public final int f765r;

    public C0172d(C0173e eVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.f763g = z;
        this.f764k = layoutInflater;
        this.f760a = eVar;
        this.f765r = i;
        mo1365a();
    }

    /* renamed from: a */
    public void mo1365a() {
        C0177g x = this.f760a.mo1455x();
        if (x != null) {
            ArrayList<C0177g> B = this.f760a.mo1375B();
            int size = B.size();
            for (int i = 0; i < size; i++) {
                if (B.get(i) == x) {
                    this.f761d = i;
                    return;
                }
            }
        }
        this.f761d = -1;
    }

    /* renamed from: b */
    public C0173e mo1366b() {
        return this.f760a;
    }

    /* renamed from: c */
    public C0177g getItem(int i) {
        ArrayList<C0177g> arrayList;
        if (this.f763g) {
            arrayList = this.f760a.mo1375B();
        } else {
            arrayList = this.f760a.mo1379G();
        }
        int i2 = this.f761d;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return arrayList.get(i);
    }

    /* renamed from: d */
    public void mo1368d(boolean z) {
        this.f762e = z;
    }

    public int getCount() {
        ArrayList<C0177g> arrayList;
        if (this.f763g) {
            arrayList = this.f760a.mo1375B();
        } else {
            arrayList = this.f760a.mo1379G();
        }
        if (this.f761d < 0) {
            return arrayList.size();
        }
        return arrayList.size() - 1;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        boolean z;
        if (view == null) {
            view = this.f764k.inflate(this.f765r, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i3 = i - 1;
        if (i3 >= 0) {
            i2 = getItem(i3).getGroupId();
        } else {
            i2 = groupId;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (!this.f760a.mo1380H() || groupId == i2) {
            z = false;
        } else {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        C0184j.C0185a aVar = (C0184j.C0185a) view;
        if (this.f762e) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.mo1260c(getItem(i), 0);
        return view;
    }

    public void notifyDataSetChanged() {
        mo1365a();
        super.notifyDataSetChanged();
    }
}
