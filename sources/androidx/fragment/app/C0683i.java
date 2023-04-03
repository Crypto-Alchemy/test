package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.fragment.app.i */
/* compiled from: FragmentStore */
public class C0683i {

    /* renamed from: a */
    public final ArrayList<Fragment> f3852a = new ArrayList<>();

    /* renamed from: b */
    public final HashMap<String, C0680h> f3853b = new HashMap<>();

    /* renamed from: c */
    public final HashMap<String, FragmentState> f3854c = new HashMap<>();

    /* renamed from: d */
    public fa2 f3855d;

    /* renamed from: A */
    public void mo6233A(fa2 fa2) {
        this.f3855d = fa2;
    }

    /* renamed from: B */
    public FragmentState mo6234B(String str, FragmentState fragmentState) {
        if (fragmentState != null) {
            return this.f3854c.put(str, fragmentState);
        }
        return this.f3854c.remove(str);
    }

    /* renamed from: a */
    public void mo6235a(Fragment fragment) {
        if (!this.f3852a.contains(fragment)) {
            synchronized (this.f3852a) {
                this.f3852a.add(fragment);
            }
            fragment.mAdded = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    /* renamed from: b */
    public void mo6236b() {
        this.f3853b.values().removeAll(Collections.singleton((Object) null));
    }

    /* renamed from: c */
    public boolean mo6237c(String str) {
        if (this.f3853b.get(str) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public void mo6238d(int i) {
        for (C0680h next : this.f3853b.values()) {
            if (next != null) {
                next.mo6228t(i);
            }
        }
    }

    /* renamed from: e */
    public void mo6239e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f3853b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C0680h next : this.f3853b.values()) {
                printWriter.print(str);
                if (next != null) {
                    Fragment k = next.mo6219k();
                    printWriter.println(k);
                    k.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f3852a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size; i++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(this.f3852a.get(i).toString());
            }
        }
    }

    /* renamed from: f */
    public Fragment mo6240f(String str) {
        C0680h hVar = this.f3853b.get(str);
        if (hVar != null) {
            return hVar.mo6219k();
        }
        return null;
    }

    /* renamed from: g */
    public Fragment mo6241g(int i) {
        for (int size = this.f3852a.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f3852a.get(size);
            if (fragment != null && fragment.mFragmentId == i) {
                return fragment;
            }
        }
        for (C0680h next : this.f3853b.values()) {
            if (next != null) {
                Fragment k = next.mo6219k();
                if (k.mFragmentId == i) {
                    return k;
                }
            }
        }
        return null;
    }

    /* renamed from: h */
    public Fragment mo6242h(String str) {
        if (str != null) {
            for (int size = this.f3852a.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f3852a.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (C0680h next : this.f3853b.values()) {
            if (next != null) {
                Fragment k = next.mo6219k();
                if (str.equals(k.mTag)) {
                    return k;
                }
            }
        }
        return null;
    }

    /* renamed from: i */
    public Fragment mo6243i(String str) {
        Fragment findFragmentByWho;
        for (C0680h next : this.f3853b.values()) {
            if (next != null && (findFragmentByWho = next.mo6219k().findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    /* renamed from: j */
    public int mo6244j(Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup == null) {
            return -1;
        }
        int indexOf = this.f3852a.indexOf(fragment);
        for (int i = indexOf - 1; i >= 0; i--) {
            Fragment fragment2 = this.f3852a.get(i);
            if (fragment2.mContainer == viewGroup && (view2 = fragment2.mView) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            indexOf++;
            if (indexOf >= this.f3852a.size()) {
                return -1;
            }
            Fragment fragment3 = this.f3852a.get(indexOf);
            if (fragment3.mContainer == viewGroup && (view = fragment3.mView) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    /* renamed from: k */
    public List<C0680h> mo6245k() {
        ArrayList arrayList = new ArrayList();
        for (C0680h next : this.f3853b.values()) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: l */
    public List<Fragment> mo6246l() {
        ArrayList arrayList = new ArrayList();
        for (C0680h next : this.f3853b.values()) {
            if (next != null) {
                arrayList.add(next.mo6219k());
            } else {
                arrayList.add((Object) null);
            }
        }
        return arrayList;
    }

    /* renamed from: m */
    public ArrayList<FragmentState> mo6247m() {
        return new ArrayList<>(this.f3854c.values());
    }

    /* renamed from: n */
    public C0680h mo6248n(String str) {
        return this.f3853b.get(str);
    }

    /* renamed from: o */
    public List<Fragment> mo6249o() {
        ArrayList arrayList;
        if (this.f3852a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f3852a) {
            arrayList = new ArrayList(this.f3852a);
        }
        return arrayList;
    }

    /* renamed from: p */
    public fa2 mo6250p() {
        return this.f3855d;
    }

    /* renamed from: q */
    public FragmentState mo6251q(String str) {
        return this.f3854c.get(str);
    }

    /* renamed from: r */
    public void mo6252r(C0680h hVar) {
        Fragment k = hVar.mo6219k();
        if (!mo6237c(k.mWho)) {
            this.f3853b.put(k.mWho, hVar);
            if (k.mRetainInstanceChangedWhileDetached) {
                if (k.mRetainInstance) {
                    this.f3855d.mo19826b(k);
                } else {
                    this.f3855d.mo19837l(k);
                }
                k.mRetainInstanceChangedWhileDetached = false;
            }
            if (FragmentManager.m4630K0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Added fragment to active set ");
                sb.append(k);
            }
        }
    }

    /* renamed from: s */
    public void mo6253s(C0680h hVar) {
        Fragment k = hVar.mo6219k();
        if (k.mRetainInstance) {
            this.f3855d.mo19837l(k);
        }
        if (this.f3853b.put(k.mWho, (Object) null) != null && FragmentManager.m4630K0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Removed fragment from active set ");
            sb.append(k);
        }
    }

    /* renamed from: t */
    public void mo6254t() {
        boolean z;
        Iterator<Fragment> it = this.f3852a.iterator();
        while (it.hasNext()) {
            C0680h hVar = this.f3853b.get(it.next().mWho);
            if (hVar != null) {
                hVar.mo6221m();
            }
        }
        for (C0680h next : this.f3853b.values()) {
            if (next != null) {
                next.mo6221m();
                Fragment k = next.mo6219k();
                if (!k.mRemoving || k.isInBackStack()) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    if (k.mBeingSaved && !this.f3854c.containsKey(k.mWho)) {
                        next.mo6226r();
                    }
                    mo6253s(next);
                }
            }
        }
    }

    /* renamed from: u */
    public void mo6255u(Fragment fragment) {
        synchronized (this.f3852a) {
            this.f3852a.remove(fragment);
        }
        fragment.mAdded = false;
    }

    /* renamed from: v */
    public void mo6256v() {
        this.f3853b.clear();
    }

    /* renamed from: w */
    public void mo6257w(List<String> list) {
        this.f3852a.clear();
        if (list != null) {
            for (String next : list) {
                Fragment f = mo6240f(next);
                if (f != null) {
                    if (FragmentManager.m4630K0(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("restoreSaveState: added (");
                        sb.append(next);
                        sb.append("): ");
                        sb.append(f);
                    }
                    mo6235a(f);
                } else {
                    throw new IllegalStateException("No instantiated fragment for (" + next + ")");
                }
            }
        }
    }

    /* renamed from: x */
    public void mo6258x(ArrayList<FragmentState> arrayList) {
        this.f3854c.clear();
        Iterator<FragmentState> it = arrayList.iterator();
        while (it.hasNext()) {
            FragmentState next = it.next();
            this.f3854c.put(next.f3731d, next);
        }
    }

    /* renamed from: y */
    public ArrayList<String> mo6259y() {
        ArrayList<String> arrayList = new ArrayList<>(this.f3853b.size());
        for (C0680h next : this.f3853b.values()) {
            if (next != null) {
                Fragment k = next.mo6219k();
                next.mo6226r();
                arrayList.add(k.mWho);
                if (FragmentManager.m4630K0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Saved state of ");
                    sb.append(k);
                    sb.append(": ");
                    sb.append(k.mSavedFragmentState);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: z */
    public ArrayList<String> mo6260z() {
        synchronized (this.f3852a) {
            if (this.f3852a.isEmpty()) {
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<>(this.f3852a.size());
            Iterator<Fragment> it = this.f3852a.iterator();
            while (it.hasNext()) {
                Fragment next = it.next();
                arrayList.add(next.mWho);
                if (FragmentManager.m4630K0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("saveAllState: adding fragment (");
                    sb.append(next.mWho);
                    sb.append("): ");
                    sb.append(next);
                }
            }
            return arrayList;
        }
    }
}
