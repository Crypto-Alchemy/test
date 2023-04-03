package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.Lifecycle;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.j */
/* compiled from: FragmentTransaction */
public abstract class C0684j {

    /* renamed from: a */
    public final C0674d f3856a;

    /* renamed from: b */
    public final ClassLoader f3857b;

    /* renamed from: c */
    public ArrayList<C0685a> f3858c = new ArrayList<>();

    /* renamed from: d */
    public int f3859d;

    /* renamed from: e */
    public int f3860e;

    /* renamed from: f */
    public int f3861f;

    /* renamed from: g */
    public int f3862g;

    /* renamed from: h */
    public int f3863h;

    /* renamed from: i */
    public boolean f3864i;

    /* renamed from: j */
    public boolean f3865j = true;

    /* renamed from: k */
    public String f3866k;

    /* renamed from: l */
    public int f3867l;

    /* renamed from: m */
    public CharSequence f3868m;

    /* renamed from: n */
    public int f3869n;

    /* renamed from: o */
    public CharSequence f3870o;

    /* renamed from: p */
    public ArrayList<String> f3871p;

    /* renamed from: q */
    public ArrayList<String> f3872q;

    /* renamed from: r */
    public boolean f3873r = false;

    /* renamed from: s */
    public ArrayList<Runnable> f3874s;

    /* renamed from: androidx.fragment.app.j$a */
    /* compiled from: FragmentTransaction */
    public static final class C0685a {

        /* renamed from: a */
        public int f3875a;

        /* renamed from: b */
        public Fragment f3876b;

        /* renamed from: c */
        public boolean f3877c;

        /* renamed from: d */
        public int f3878d;

        /* renamed from: e */
        public int f3879e;

        /* renamed from: f */
        public int f3880f;

        /* renamed from: g */
        public int f3881g;

        /* renamed from: h */
        public Lifecycle.State f3882h;

        /* renamed from: i */
        public Lifecycle.State f3883i;

        public C0685a() {
        }

        public C0685a(int i, Fragment fragment) {
            this.f3875a = i;
            this.f3876b = fragment;
            this.f3877c = false;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            this.f3882h = state;
            this.f3883i = state;
        }

        public C0685a(int i, Fragment fragment, boolean z) {
            this.f3875a = i;
            this.f3876b = fragment;
            this.f3877c = z;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            this.f3882h = state;
            this.f3883i = state;
        }
    }

    public C0684j(C0674d dVar, ClassLoader classLoader) {
        this.f3856a = dVar;
        this.f3857b = classLoader;
    }

    /* renamed from: b */
    public C0684j mo6261b(int i, Fragment fragment) {
        mo6144p(i, fragment, (String) null, 1);
        return this;
    }

    /* renamed from: c */
    public C0684j mo6262c(int i, Fragment fragment, String str) {
        mo6144p(i, fragment, str, 1);
        return this;
    }

    /* renamed from: d */
    public C0684j mo6263d(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.mContainer = viewGroup;
        return mo6262c(viewGroup.getId(), fragment, str);
    }

    /* renamed from: e */
    public C0684j mo6264e(Fragment fragment, String str) {
        mo6144p(0, fragment, str, 1);
        return this;
    }

    /* renamed from: f */
    public void mo6265f(C0685a aVar) {
        this.f3858c.add(aVar);
        aVar.f3878d = this.f3859d;
        aVar.f3879e = this.f3860e;
        aVar.f3880f = this.f3861f;
        aVar.f3881g = this.f3862g;
    }

    /* renamed from: g */
    public C0684j mo6266g(View view, String str) {
        if (fb2.m16827e()) {
            String K = ga7.m17733K(view);
            if (K != null) {
                if (this.f3871p == null) {
                    this.f3871p = new ArrayList<>();
                    this.f3872q = new ArrayList<>();
                } else if (this.f3872q.contains(str)) {
                    throw new IllegalArgumentException("A shared element with the target name '" + str + "' has already been added to the transaction.");
                } else if (this.f3871p.contains(K)) {
                    throw new IllegalArgumentException("A shared element with the source name '" + K + "' has already been added to the transaction.");
                }
                this.f3871p.add(K);
                this.f3872q.add(str);
            } else {
                throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
            }
        }
        return this;
    }

    /* renamed from: h */
    public C0684j mo6267h(String str) {
        if (this.f3865j) {
            this.f3864i = true;
            this.f3866k = str;
            return this;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    /* renamed from: i */
    public C0684j mo6268i(Fragment fragment) {
        mo6265f(new C0685a(7, fragment));
        return this;
    }

    /* renamed from: j */
    public abstract int mo6139j();

    /* renamed from: k */
    public abstract int mo6140k();

    /* renamed from: l */
    public abstract void mo6141l();

    /* renamed from: m */
    public abstract void mo6142m();

    /* renamed from: n */
    public C0684j mo6143n(Fragment fragment) {
        mo6265f(new C0685a(6, fragment));
        return this;
    }

    /* renamed from: o */
    public C0684j mo6269o() {
        if (!this.f3864i) {
            this.f3865j = false;
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    /* renamed from: p */
    public void mo6144p(int i, Fragment fragment, String str, int i2) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            FragmentStrictMode.m4999h(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = fragment.mTag;
            if (str3 == null || str.equals(str3)) {
                fragment.mTag = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.mTag + " now " + str);
            }
        }
        if (i != 0) {
            if (i != -1) {
                int i3 = fragment.mFragmentId;
                if (i3 == 0 || i3 == i) {
                    fragment.mFragmentId = i;
                    fragment.mContainerId = i;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i);
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
        }
        mo6265f(new C0685a(i2, fragment));
    }

    /* renamed from: q */
    public C0684j mo6145q(Fragment fragment) {
        mo6265f(new C0685a(4, fragment));
        return this;
    }

    /* renamed from: r */
    public C0684j mo6146r(Fragment fragment) {
        mo6265f(new C0685a(3, fragment));
        return this;
    }

    /* renamed from: s */
    public C0684j mo6270s(int i, Fragment fragment) {
        return mo6271t(i, fragment, (String) null);
    }

    /* renamed from: t */
    public C0684j mo6271t(int i, Fragment fragment, String str) {
        if (i != 0) {
            mo6144p(i, fragment, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    /* renamed from: u */
    public C0684j mo6272u(int i, int i2, int i3, int i4) {
        this.f3859d = i;
        this.f3860e = i2;
        this.f3861f = i3;
        this.f3862g = i4;
        return this;
    }

    /* renamed from: v */
    public C0684j mo6148v(Fragment fragment) {
        mo6265f(new C0685a(8, fragment));
        return this;
    }

    /* renamed from: w */
    public C0684j mo6273w(boolean z) {
        this.f3873r = z;
        return this;
    }

    /* renamed from: x */
    public C0684j mo6149x(Fragment fragment) {
        mo6265f(new C0685a(5, fragment));
        return this;
    }
}
