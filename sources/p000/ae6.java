package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.C1710a;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: ae6 */
/* compiled from: SupportRequestManagerFragment */
public class ae6 extends Fragment {

    /* renamed from: a */
    public final C1672ca f108a;

    /* renamed from: d */
    public final pe5 f109d;

    /* renamed from: e */
    public final Set<ae6> f110e;

    /* renamed from: g */
    public ae6 f111g;

    /* renamed from: k */
    public me5 f112k;

    /* renamed from: r */
    public Fragment f113r;

    /* renamed from: ae6$a */
    /* compiled from: SupportRequestManagerFragment */
    public class C0019a implements pe5 {
        public C0019a() {
        }

        /* renamed from: a */
        public Set<me5> mo197a() {
            Set<ae6> i = ae6.this.mo180i();
            HashSet hashSet = new HashSet(i.size());
            for (ae6 next : i) {
                if (next.mo183l() != null) {
                    hashSet.add(next.mo183l());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + "{fragment=" + ae6.this + "}";
        }
    }

    public ae6() {
        this(new C1672ca());
    }

    /* renamed from: n */
    public static FragmentManager m210n(Fragment fragment) {
        while (fragment.getParentFragment() != null) {
            fragment = fragment.getParentFragment();
        }
        return fragment.getFragmentManager();
    }

    /* renamed from: h */
    public final void mo179h(ae6 ae6) {
        this.f110e.add(ae6);
    }

    /* renamed from: i */
    public Set<ae6> mo180i() {
        ae6 ae6 = this.f111g;
        if (ae6 == null) {
            return Collections.emptySet();
        }
        if (equals(ae6)) {
            return Collections.unmodifiableSet(this.f110e);
        }
        HashSet hashSet = new HashSet();
        for (ae6 next : this.f111g.mo180i()) {
            if (mo185o(next.mo182k())) {
                hashSet.add(next);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: j */
    public C1672ca mo181j() {
        return this.f108a;
    }

    /* renamed from: k */
    public final Fragment mo182k() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        return this.f113r;
    }

    /* renamed from: l */
    public me5 mo183l() {
        return this.f112k;
    }

    /* renamed from: m */
    public pe5 mo184m() {
        return this.f109d;
    }

    /* renamed from: o */
    public final boolean mo185o(Fragment fragment) {
        Fragment k = mo182k();
        while (true) {
            Fragment parentFragment = fragment.getParentFragment();
            if (parentFragment == null) {
                return false;
            }
            if (parentFragment.equals(k)) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        FragmentManager n = m210n(this);
        if (n != null) {
            try {
                mo191p(getContext(), n);
            } catch (IllegalStateException unused) {
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f108a.mo12021c();
        mo195t();
    }

    public void onDetach() {
        super.onDetach();
        this.f113r = null;
        mo195t();
    }

    public void onStart() {
        super.onStart();
        this.f108a.mo12022d();
    }

    public void onStop() {
        super.onStop();
        this.f108a.mo12023e();
    }

    /* renamed from: p */
    public final void mo191p(Context context, FragmentManager fragmentManager) {
        mo195t();
        ae6 s = C1710a.m12218c(context).mo12364k().mo23935s(fragmentManager);
        this.f111g = s;
        if (!equals(s)) {
            this.f111g.mo179h(this);
        }
    }

    /* renamed from: q */
    public final void mo192q(ae6 ae6) {
        this.f110e.remove(ae6);
    }

    /* renamed from: r */
    public void mo193r(Fragment fragment) {
        FragmentManager n;
        this.f113r = fragment;
        if (fragment != null && fragment.getContext() != null && (n = m210n(fragment)) != null) {
            mo191p(fragment.getContext(), n);
        }
    }

    /* renamed from: s */
    public void mo194s(me5 me5) {
        this.f112k = me5;
    }

    /* renamed from: t */
    public final void mo195t() {
        ae6 ae6 = this.f111g;
        if (ae6 != null) {
            ae6.mo192q(this);
            this.f111g = null;
        }
    }

    public String toString() {
        return super.toString() + "{parent=" + mo182k() + "}";
    }

    @SuppressLint({"ValidFragment"})
    public ae6(C1672ca caVar) {
        this.f109d = new C0019a();
        this.f110e = new HashSet();
        this.f108a = caVar;
    }
}
