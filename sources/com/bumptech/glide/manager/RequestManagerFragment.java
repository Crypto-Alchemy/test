package com.bumptech.glide.manager;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import com.bumptech.glide.C1710a;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Deprecated
public class RequestManagerFragment extends Fragment {

    /* renamed from: a */
    public final C1672ca f8974a;

    /* renamed from: d */
    public final pe5 f8975d;

    /* renamed from: e */
    public final Set<RequestManagerFragment> f8976e;

    /* renamed from: g */
    public me5 f8977g;

    /* renamed from: k */
    public RequestManagerFragment f8978k;

    /* renamed from: r */
    public Fragment f8979r;

    /* renamed from: com.bumptech.glide.manager.RequestManagerFragment$a */
    public class C1806a implements pe5 {
        public C1806a() {
        }

        /* renamed from: a */
        public Set<me5> mo197a() {
            Set<RequestManagerFragment> b = RequestManagerFragment.this.mo12636b();
            HashSet hashSet = new HashSet(b.size());
            for (RequestManagerFragment next : b) {
                if (next.mo12639e() != null) {
                    hashSet.add(next.mo12639e());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + "{fragment=" + RequestManagerFragment.this + "}";
        }
    }

    public RequestManagerFragment() {
        this(new C1672ca());
    }

    /* renamed from: a */
    public final void mo12635a(RequestManagerFragment requestManagerFragment) {
        this.f8976e.add(requestManagerFragment);
    }

    @TargetApi(17)
    /* renamed from: b */
    public Set<RequestManagerFragment> mo12636b() {
        if (equals(this.f8978k)) {
            return Collections.unmodifiableSet(this.f8976e);
        }
        if (this.f8978k == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet();
        for (RequestManagerFragment next : this.f8978k.mo12636b()) {
            if (mo12641g(next.getParentFragment())) {
                hashSet.add(next);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: c */
    public C1672ca mo12637c() {
        return this.f8974a;
    }

    @TargetApi(17)
    /* renamed from: d */
    public final Fragment mo12638d() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        return this.f8979r;
    }

    /* renamed from: e */
    public me5 mo12639e() {
        return this.f8977g;
    }

    /* renamed from: f */
    public pe5 mo12640f() {
        return this.f8975d;
    }

    @TargetApi(17)
    /* renamed from: g */
    public final boolean mo12641g(Fragment fragment) {
        Fragment parentFragment = getParentFragment();
        while (true) {
            Fragment parentFragment2 = fragment.getParentFragment();
            if (parentFragment2 == null) {
                return false;
            }
            if (parentFragment2.equals(parentFragment)) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
    }

    /* renamed from: h */
    public final void mo12642h(Activity activity) {
        mo12646l();
        RequestManagerFragment q = C1710a.m12218c(activity).mo12364k().mo23933q(activity);
        this.f8978k = q;
        if (!equals(q)) {
            this.f8978k.mo12635a(this);
        }
    }

    /* renamed from: i */
    public final void mo12643i(RequestManagerFragment requestManagerFragment) {
        this.f8976e.remove(requestManagerFragment);
    }

    /* renamed from: j */
    public void mo12644j(Fragment fragment) {
        this.f8979r = fragment;
        if (fragment != null && fragment.getActivity() != null) {
            mo12642h(fragment.getActivity());
        }
    }

    /* renamed from: k */
    public void mo12645k(me5 me5) {
        this.f8977g = me5;
    }

    /* renamed from: l */
    public final void mo12646l() {
        RequestManagerFragment requestManagerFragment = this.f8978k;
        if (requestManagerFragment != null) {
            requestManagerFragment.mo12643i(this);
            this.f8978k = null;
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mo12642h(activity);
        } catch (IllegalStateException unused) {
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f8974a.mo12021c();
        mo12646l();
    }

    public void onDetach() {
        super.onDetach();
        mo12646l();
    }

    public void onStart() {
        super.onStart();
        this.f8974a.mo12022d();
    }

    public void onStop() {
        super.onStop();
        this.f8974a.mo12023e();
    }

    public String toString() {
        return super.toString() + "{parent=" + mo12638d() + "}";
    }

    @SuppressLint({"ValidFragment"})
    public RequestManagerFragment(C1672ca caVar) {
        this.f8975d = new C1806a();
        this.f8976e = new HashSet();
        this.f8974a = caVar;
    }
}
