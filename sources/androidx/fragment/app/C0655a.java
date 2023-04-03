package androidx.fragment.app;

import androidx.fragment.app.C0684j;
import androidx.fragment.app.FragmentManager;
import java.io.PrintWriter;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.a */
/* compiled from: BackStackRecord */
public final class C0655a extends C0684j implements FragmentManager.C0644m {

    /* renamed from: t */
    public final FragmentManager f3774t;

    /* renamed from: u */
    public boolean f3775u;

    /* renamed from: v */
    public int f3776v;

    /* renamed from: w */
    public boolean f3777w;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0655a(androidx.fragment.app.FragmentManager r3) {
        /*
            r2 = this;
            androidx.fragment.app.d r0 = r3.mo6012v0()
            androidx.fragment.app.e r1 = r3.mo6018x0()
            if (r1 == 0) goto L_0x0017
            androidx.fragment.app.e r1 = r3.mo6018x0()
            android.content.Context r1 = r1.mo6184f()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            r2.<init>(r0, r1)
            r0 = -1
            r2.f3776v = r0
            r0 = 0
            r2.f3777w = r0
            r2.f3774t = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0655a.<init>(androidx.fragment.app.FragmentManager):void");
    }

    /* renamed from: A */
    public void mo6131A(String str, PrintWriter printWriter) {
        mo6132B(str, printWriter, true);
    }

    /* renamed from: B */
    public void mo6132B(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f3866k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f3776v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f3775u);
            if (this.f3863h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f3863h));
            }
            if (!(this.f3859d == 0 && this.f3860e == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f3859d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f3860e));
            }
            if (!(this.f3861f == 0 && this.f3862g == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f3861f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f3862g));
            }
            if (!(this.f3867l == 0 && this.f3868m == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f3867l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f3868m);
            }
            if (!(this.f3869n == 0 && this.f3870o == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f3869n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f3870o);
            }
        }
        if (!this.f3858c.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.f3858c.size();
            for (int i = 0; i < size; i++) {
                C0684j.C0685a aVar = this.f3858c.get(i);
                switch (aVar.f3875a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + aVar.f3875a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f3876b);
                if (z) {
                    if (!(aVar.f3878d == 0 && aVar.f3879e == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f3878d));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f3879e));
                    }
                    if (aVar.f3880f != 0 || aVar.f3881g != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f3880f));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f3881g));
                    }
                }
            }
        }
    }

    /* renamed from: C */
    public void mo6133C() {
        int size = this.f3858c.size();
        for (int i = 0; i < size; i++) {
            C0684j.C0685a aVar = this.f3858c.get(i);
            Fragment fragment = aVar.f3876b;
            if (fragment != null) {
                fragment.mBeingSaved = this.f3777w;
                fragment.setPopDirection(false);
                fragment.setNextTransition(this.f3863h);
                fragment.setSharedElementNames(this.f3871p, this.f3872q);
            }
            switch (aVar.f3875a) {
                case 1:
                    fragment.setAnimations(aVar.f3878d, aVar.f3879e, aVar.f3880f, aVar.f3881g);
                    this.f3774t.mo6010u1(fragment, false);
                    this.f3774t.mo5977j(fragment);
                    break;
                case 3:
                    fragment.setAnimations(aVar.f3878d, aVar.f3879e, aVar.f3880f, aVar.f3881g);
                    this.f3774t.mo5988m1(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.f3878d, aVar.f3879e, aVar.f3880f, aVar.f3881g);
                    this.f3774t.mo5928H0(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.f3878d, aVar.f3879e, aVar.f3880f, aVar.f3881g);
                    this.f3774t.mo6010u1(fragment, false);
                    this.f3774t.mo6022y1(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.f3878d, aVar.f3879e, aVar.f3880f, aVar.f3881g);
                    this.f3774t.mo6023z(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.f3878d, aVar.f3879e, aVar.f3880f, aVar.f3881g);
                    this.f3774t.mo6010u1(fragment, false);
                    this.f3774t.mo5993p(fragment);
                    break;
                case 8:
                    this.f3774t.mo6016w1(fragment);
                    break;
                case 9:
                    this.f3774t.mo6016w1((Fragment) null);
                    break;
                case 10:
                    this.f3774t.mo6013v1(fragment, aVar.f3883i);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f3875a);
            }
        }
    }

    /* renamed from: D */
    public void mo6134D() {
        for (int size = this.f3858c.size() - 1; size >= 0; size--) {
            C0684j.C0685a aVar = this.f3858c.get(size);
            Fragment fragment = aVar.f3876b;
            if (fragment != null) {
                fragment.mBeingSaved = this.f3777w;
                fragment.setPopDirection(true);
                fragment.setNextTransition(FragmentManager.m4647r1(this.f3863h));
                fragment.setSharedElementNames(this.f3872q, this.f3871p);
            }
            switch (aVar.f3875a) {
                case 1:
                    fragment.setAnimations(aVar.f3878d, aVar.f3879e, aVar.f3880f, aVar.f3881g);
                    this.f3774t.mo6010u1(fragment, true);
                    this.f3774t.mo5988m1(fragment);
                    break;
                case 3:
                    fragment.setAnimations(aVar.f3878d, aVar.f3879e, aVar.f3880f, aVar.f3881g);
                    this.f3774t.mo5977j(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.f3878d, aVar.f3879e, aVar.f3880f, aVar.f3881g);
                    this.f3774t.mo6022y1(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.f3878d, aVar.f3879e, aVar.f3880f, aVar.f3881g);
                    this.f3774t.mo6010u1(fragment, true);
                    this.f3774t.mo5928H0(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.f3878d, aVar.f3879e, aVar.f3880f, aVar.f3881g);
                    this.f3774t.mo5993p(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.f3878d, aVar.f3879e, aVar.f3880f, aVar.f3881g);
                    this.f3774t.mo6010u1(fragment, true);
                    this.f3774t.mo6023z(fragment);
                    break;
                case 8:
                    this.f3774t.mo6016w1((Fragment) null);
                    break;
                case 9:
                    this.f3774t.mo6016w1(fragment);
                    break;
                case 10:
                    this.f3774t.mo6013v1(fragment, aVar.f3882h);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f3875a);
            }
        }
    }

    /* renamed from: E */
    public Fragment mo6135E(ArrayList<Fragment> arrayList, Fragment fragment) {
        ArrayList<Fragment> arrayList2 = arrayList;
        Fragment fragment2 = fragment;
        int i = 0;
        while (i < this.f3858c.size()) {
            C0684j.C0685a aVar = this.f3858c.get(i);
            int i2 = aVar.f3875a;
            if (i2 != 1) {
                if (i2 == 2) {
                    Fragment fragment3 = aVar.f3876b;
                    int i3 = fragment3.mContainerId;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = arrayList2.get(size);
                        if (fragment4.mContainerId == i3) {
                            if (fragment4 == fragment3) {
                                z = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.f3858c.add(i, new C0684j.C0685a(9, fragment4, true));
                                    i++;
                                    fragment2 = null;
                                }
                                C0684j.C0685a aVar2 = new C0684j.C0685a(3, fragment4, true);
                                aVar2.f3878d = aVar.f3878d;
                                aVar2.f3880f = aVar.f3880f;
                                aVar2.f3879e = aVar.f3879e;
                                aVar2.f3881g = aVar.f3881g;
                                this.f3858c.add(i, aVar2);
                                arrayList2.remove(fragment4);
                                i++;
                            }
                        }
                    }
                    if (z) {
                        this.f3858c.remove(i);
                        i--;
                    } else {
                        aVar.f3875a = 1;
                        aVar.f3877c = true;
                        arrayList2.add(fragment3);
                    }
                } else if (i2 == 3 || i2 == 6) {
                    arrayList2.remove(aVar.f3876b);
                    Fragment fragment5 = aVar.f3876b;
                    if (fragment5 == fragment2) {
                        this.f3858c.add(i, new C0684j.C0685a(9, fragment5));
                        i++;
                        fragment2 = null;
                    }
                } else if (i2 != 7) {
                    if (i2 == 8) {
                        this.f3858c.add(i, new C0684j.C0685a(9, fragment2, true));
                        aVar.f3877c = true;
                        i++;
                        fragment2 = aVar.f3876b;
                    }
                }
                i++;
            }
            arrayList2.add(aVar.f3876b);
            i++;
        }
        return fragment2;
    }

    /* renamed from: F */
    public String mo6136F() {
        return this.f3866k;
    }

    /* renamed from: G */
    public void mo6137G() {
        if (this.f3874s != null) {
            for (int i = 0; i < this.f3874s.size(); i++) {
                this.f3874s.get(i).run();
            }
            this.f3874s = null;
        }
    }

    /* renamed from: H */
    public Fragment mo6138H(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.f3858c.size() - 1; size >= 0; size--) {
            C0684j.C0685a aVar = this.f3858c.get(size);
            int i = aVar.f3875a;
            if (i != 1) {
                if (i != 3) {
                    switch (i) {
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.f3876b;
                            break;
                        case 10:
                            aVar.f3883i = aVar.f3882h;
                            break;
                    }
                }
                arrayList.add(aVar.f3876b);
            }
            arrayList.remove(aVar.f3876b);
        }
        return fragment;
    }

    /* renamed from: a */
    public boolean mo6063a(ArrayList<C0655a> arrayList, ArrayList<Boolean> arrayList2) {
        if (FragmentManager.m4630K0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Run: ");
            sb.append(this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f3864i) {
            return true;
        }
        this.f3774t.mo5974i(this);
        return true;
    }

    /* renamed from: j */
    public int mo6139j() {
        return mo6151z(false);
    }

    /* renamed from: k */
    public int mo6140k() {
        return mo6151z(true);
    }

    /* renamed from: l */
    public void mo6141l() {
        mo6269o();
        this.f3774t.mo5967e0(this, false);
    }

    /* renamed from: m */
    public void mo6142m() {
        mo6269o();
        this.f3774t.mo5967e0(this, true);
    }

    /* renamed from: n */
    public C0684j mo6143n(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f3774t) {
            return super.mo6143n(fragment);
        }
        throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    /* renamed from: p */
    public void mo6144p(int i, Fragment fragment, String str, int i2) {
        super.mo6144p(i, fragment, str, i2);
        fragment.mFragmentManager = this.f3774t;
    }

    /* renamed from: q */
    public C0684j mo6145q(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f3774t) {
            return super.mo6145q(fragment);
        }
        throw new IllegalStateException("Cannot hide Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    /* renamed from: r */
    public C0684j mo6146r(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f3774t) {
            return super.mo6146r(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f3776v >= 0) {
            sb.append(" #");
            sb.append(this.f3776v);
        }
        if (this.f3866k != null) {
            sb.append(" ");
            sb.append(this.f3866k);
        }
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: v */
    public C0684j mo6148v(Fragment fragment) {
        FragmentManager fragmentManager;
        if (fragment == null || (fragmentManager = fragment.mFragmentManager) == null || fragmentManager == this.f3774t) {
            return super.mo6148v(fragment);
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    /* renamed from: x */
    public C0684j mo6149x(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f3774t) {
            return super.mo6149x(fragment);
        }
        throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    /* renamed from: y */
    public void mo6150y(int i) {
        if (this.f3864i) {
            if (FragmentManager.m4630K0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Bump nesting in ");
                sb.append(this);
                sb.append(" by ");
                sb.append(i);
            }
            int size = this.f3858c.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0684j.C0685a aVar = this.f3858c.get(i2);
                Fragment fragment = aVar.f3876b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i;
                    if (FragmentManager.m4630K0(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Bump nesting of ");
                        sb2.append(aVar.f3876b);
                        sb2.append(" to ");
                        sb2.append(aVar.f3876b.mBackStackNesting);
                    }
                }
            }
        }
    }

    /* renamed from: z */
    public int mo6151z(boolean z) {
        if (!this.f3775u) {
            if (FragmentManager.m4630K0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Commit: ");
                sb.append(this);
                PrintWriter printWriter = new PrintWriter(new pk3("FragmentManager"));
                mo6131A("  ", printWriter);
                printWriter.close();
            }
            this.f3775u = true;
            if (this.f3864i) {
                this.f3776v = this.f3774t.mo5989n();
            } else {
                this.f3776v = -1;
            }
            this.f3774t.mo5961b0(this, z);
            return this.f3776v;
        }
        throw new IllegalStateException("commit already called");
    }
}
