package androidx.fragment.app.strictmode;

import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C6177b;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003/0&B\t\b\u0002¢\u0006\u0004\b-\u0010.J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u001a\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0007J \u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0007J\u0012\u0010\u0019\u001a\u00020\u00182\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J0\u0010!\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00182\u000e\u0010\u001f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u001e2\u000e\u0010 \u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001a0\u001eH\u0002J\u0018\u0010\"\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u0018\u0010%\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#H\u0002R\"\u0010,\u001a\u00020\u00188\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u00061"}, mo44877d2 = {"Landroidx/fragment/app/strictmode/FragmentStrictMode;", "", "Landroidx/fragment/app/Fragment;", "fragment", "", "previousFragmentId", "Lr37;", "h", "Landroid/view/ViewGroup;", "container", "i", "m", "j", "", "isVisibleToUser", "o", "violatingFragment", "targetFragment", "", "requestCode", "n", "l", "k", "p", "Landroidx/fragment/app/strictmode/FragmentStrictMode$b;", "c", "Landroidx/fragment/app/strictmode/Violation;", "violation", "g", "policy", "Ljava/lang/Class;", "fragmentClass", "violationClass", "r", "d", "Ljava/lang/Runnable;", "runnable", "q", "b", "Landroidx/fragment/app/strictmode/FragmentStrictMode$b;", "getDefaultPolicy", "()Landroidx/fragment/app/strictmode/FragmentStrictMode$b;", "setDefaultPolicy", "(Landroidx/fragment/app/strictmode/FragmentStrictMode$b;)V", "defaultPolicy", "<init>", "()V", "Flag", "a", "fragment_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: FragmentStrictMode.kt */
public final class FragmentStrictMode {

    /* renamed from: a */
    public static final FragmentStrictMode f3884a = new FragmentStrictMode();

    /* renamed from: b */
    public static C0687b f3885b = C0687b.f3888e;

    @Metadata(mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, mo44877d2 = {"Landroidx/fragment/app/strictmode/FragmentStrictMode$Flag;", "", "(Ljava/lang/String;I)V", "PENALTY_LOG", "PENALTY_DEATH", "DETECT_FRAGMENT_REUSE", "DETECT_FRAGMENT_TAG_USAGE", "DETECT_RETAIN_INSTANCE_USAGE", "DETECT_SET_USER_VISIBLE_HINT", "DETECT_TARGET_FRAGMENT_USAGE", "DETECT_WRONG_FRAGMENT_CONTAINER", "fragment_release"}, mo44878k = 1, mo44879mv = {1, 6, 0}, mo44881xi = 48)
    /* compiled from: FragmentStrictMode.kt */
    public enum Flag {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, mo44877d2 = {"Landroidx/fragment/app/strictmode/FragmentStrictMode$a;", "", "Landroidx/fragment/app/strictmode/Violation;", "violation", "Lr37;", "a", "fragment_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: androidx.fragment.app.strictmode.FragmentStrictMode$a */
    /* compiled from: FragmentStrictMode.kt */
    public interface C0686a {
        /* renamed from: a */
        void mo6280a(Violation violation);
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0005\u0018\u0000 \u00192\u00020\u0001:\u0001\u0004BC\b\u0000\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012 \u0010\u0016\u001a\u001c\u0012\u0004\u0012\u00020\u000e\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000f0\u00150\r¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006R\u001c\u0010\f\u001a\u0004\u0018\u00010\b8\u0000X\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR4\u0010\u0014\u001a\u001c\u0012\u0004\u0012\u00020\u000e\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000f0\u00020\r8\u0000X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u001a"}, mo44877d2 = {"Landroidx/fragment/app/strictmode/FragmentStrictMode$b;", "", "", "Landroidx/fragment/app/strictmode/FragmentStrictMode$Flag;", "a", "Ljava/util/Set;", "()Ljava/util/Set;", "flags", "Landroidx/fragment/app/strictmode/FragmentStrictMode$a;", "b", "Landroidx/fragment/app/strictmode/FragmentStrictMode$a;", "()Landroidx/fragment/app/strictmode/FragmentStrictMode$a;", "listener", "", "", "Ljava/lang/Class;", "Landroidx/fragment/app/strictmode/Violation;", "c", "Ljava/util/Map;", "()Ljava/util/Map;", "mAllowedViolations", "", "allowedViolations", "<init>", "(Ljava/util/Set;Landroidx/fragment/app/strictmode/FragmentStrictMode$a;Ljava/util/Map;)V", "d", "fragment_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: androidx.fragment.app.strictmode.FragmentStrictMode$b */
    /* compiled from: FragmentStrictMode.kt */
    public static final class C0687b {

        /* renamed from: d */
        public static final C0688a f3887d = new C0688a((DefaultConstructorMarker) null);

        /* renamed from: e */
        public static final C0687b f3888e = new C0687b(ny5.m49095e(), (C0686a) null, C6177b.m47361i());

        /* renamed from: a */
        public final Set<Flag> f3889a;

        /* renamed from: b */
        public final C0686a f3890b;

        /* renamed from: c */
        public final Map<String, Set<Class<? extends Violation>>> f3891c;

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, mo44877d2 = {"Landroidx/fragment/app/strictmode/FragmentStrictMode$b$a;", "", "Landroidx/fragment/app/strictmode/FragmentStrictMode$b;", "LAX", "Landroidx/fragment/app/strictmode/FragmentStrictMode$b;", "<init>", "()V", "fragment_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
        /* renamed from: androidx.fragment.app.strictmode.FragmentStrictMode$b$a */
        /* compiled from: FragmentStrictMode.kt */
        public static final class C0688a {
            public C0688a() {
            }

            public /* synthetic */ C0688a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public C0687b(Set<? extends Flag> set, C0686a aVar, Map<String, ? extends Set<Class<? extends Violation>>> map) {
            vx2.m53591g(set, "flags");
            vx2.m53591g(map, "allowedViolations");
            this.f3889a = set;
            this.f3890b = aVar;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry next : map.entrySet()) {
                linkedHashMap.put((String) next.getKey(), (Set) next.getValue());
            }
            this.f3891c = linkedHashMap;
        }

        /* renamed from: a */
        public final Set<Flag> mo6281a() {
            return this.f3889a;
        }

        /* renamed from: b */
        public final C0686a mo6282b() {
            return this.f3890b;
        }

        /* renamed from: c */
        public final Map<String, Set<Class<? extends Violation>>> mo6283c() {
            return this.f3891c;
        }
    }

    /* renamed from: e */
    public static final void m4997e(C0687b bVar, Violation violation) {
        vx2.m53591g(bVar, "$policy");
        vx2.m53591g(violation, "$violation");
        bVar.mo6282b().mo6280a(violation);
    }

    /* renamed from: f */
    public static final void m4998f(String str, Violation violation) {
        vx2.m53591g(violation, "$violation");
        StringBuilder sb = new StringBuilder();
        sb.append("Policy violation with PENALTY_DEATH in ");
        sb.append(str);
        throw violation;
    }

    /* renamed from: h */
    public static final void m4999h(Fragment fragment, String str) {
        vx2.m53591g(fragment, "fragment");
        vx2.m53591g(str, "previousFragmentId");
        FragmentReuseViolation fragmentReuseViolation = new FragmentReuseViolation(fragment, str);
        FragmentStrictMode fragmentStrictMode = f3884a;
        fragmentStrictMode.mo6277g(fragmentReuseViolation);
        C0687b c = fragmentStrictMode.mo6275c(fragment);
        if (c.mo6281a().contains(Flag.DETECT_FRAGMENT_REUSE) && fragmentStrictMode.mo6279r(c, fragment.getClass(), fragmentReuseViolation.getClass())) {
            fragmentStrictMode.mo6276d(c, fragmentReuseViolation);
        }
    }

    /* renamed from: i */
    public static final void m5000i(Fragment fragment, ViewGroup viewGroup) {
        vx2.m53591g(fragment, "fragment");
        FragmentTagUsageViolation fragmentTagUsageViolation = new FragmentTagUsageViolation(fragment, viewGroup);
        FragmentStrictMode fragmentStrictMode = f3884a;
        fragmentStrictMode.mo6277g(fragmentTagUsageViolation);
        C0687b c = fragmentStrictMode.mo6275c(fragment);
        if (c.mo6281a().contains(Flag.DETECT_FRAGMENT_TAG_USAGE) && fragmentStrictMode.mo6279r(c, fragment.getClass(), fragmentTagUsageViolation.getClass())) {
            fragmentStrictMode.mo6276d(c, fragmentTagUsageViolation);
        }
    }

    /* renamed from: j */
    public static final void m5001j(Fragment fragment) {
        vx2.m53591g(fragment, "fragment");
        GetRetainInstanceUsageViolation getRetainInstanceUsageViolation = new GetRetainInstanceUsageViolation(fragment);
        FragmentStrictMode fragmentStrictMode = f3884a;
        fragmentStrictMode.mo6277g(getRetainInstanceUsageViolation);
        C0687b c = fragmentStrictMode.mo6275c(fragment);
        if (c.mo6281a().contains(Flag.DETECT_RETAIN_INSTANCE_USAGE) && fragmentStrictMode.mo6279r(c, fragment.getClass(), getRetainInstanceUsageViolation.getClass())) {
            fragmentStrictMode.mo6276d(c, getRetainInstanceUsageViolation);
        }
    }

    /* renamed from: k */
    public static final void m5002k(Fragment fragment) {
        vx2.m53591g(fragment, "fragment");
        GetTargetFragmentRequestCodeUsageViolation getTargetFragmentRequestCodeUsageViolation = new GetTargetFragmentRequestCodeUsageViolation(fragment);
        FragmentStrictMode fragmentStrictMode = f3884a;
        fragmentStrictMode.mo6277g(getTargetFragmentRequestCodeUsageViolation);
        C0687b c = fragmentStrictMode.mo6275c(fragment);
        if (c.mo6281a().contains(Flag.DETECT_TARGET_FRAGMENT_USAGE) && fragmentStrictMode.mo6279r(c, fragment.getClass(), getTargetFragmentRequestCodeUsageViolation.getClass())) {
            fragmentStrictMode.mo6276d(c, getTargetFragmentRequestCodeUsageViolation);
        }
    }

    /* renamed from: l */
    public static final void m5003l(Fragment fragment) {
        vx2.m53591g(fragment, "fragment");
        GetTargetFragmentUsageViolation getTargetFragmentUsageViolation = new GetTargetFragmentUsageViolation(fragment);
        FragmentStrictMode fragmentStrictMode = f3884a;
        fragmentStrictMode.mo6277g(getTargetFragmentUsageViolation);
        C0687b c = fragmentStrictMode.mo6275c(fragment);
        if (c.mo6281a().contains(Flag.DETECT_TARGET_FRAGMENT_USAGE) && fragmentStrictMode.mo6279r(c, fragment.getClass(), getTargetFragmentUsageViolation.getClass())) {
            fragmentStrictMode.mo6276d(c, getTargetFragmentUsageViolation);
        }
    }

    /* renamed from: m */
    public static final void m5004m(Fragment fragment) {
        vx2.m53591g(fragment, "fragment");
        SetRetainInstanceUsageViolation setRetainInstanceUsageViolation = new SetRetainInstanceUsageViolation(fragment);
        FragmentStrictMode fragmentStrictMode = f3884a;
        fragmentStrictMode.mo6277g(setRetainInstanceUsageViolation);
        C0687b c = fragmentStrictMode.mo6275c(fragment);
        if (c.mo6281a().contains(Flag.DETECT_RETAIN_INSTANCE_USAGE) && fragmentStrictMode.mo6279r(c, fragment.getClass(), setRetainInstanceUsageViolation.getClass())) {
            fragmentStrictMode.mo6276d(c, setRetainInstanceUsageViolation);
        }
    }

    /* renamed from: n */
    public static final void m5005n(Fragment fragment, Fragment fragment2, int i) {
        vx2.m53591g(fragment, "violatingFragment");
        vx2.m53591g(fragment2, "targetFragment");
        SetTargetFragmentUsageViolation setTargetFragmentUsageViolation = new SetTargetFragmentUsageViolation(fragment, fragment2, i);
        FragmentStrictMode fragmentStrictMode = f3884a;
        fragmentStrictMode.mo6277g(setTargetFragmentUsageViolation);
        C0687b c = fragmentStrictMode.mo6275c(fragment);
        if (c.mo6281a().contains(Flag.DETECT_TARGET_FRAGMENT_USAGE) && fragmentStrictMode.mo6279r(c, fragment.getClass(), setTargetFragmentUsageViolation.getClass())) {
            fragmentStrictMode.mo6276d(c, setTargetFragmentUsageViolation);
        }
    }

    /* renamed from: o */
    public static final void m5006o(Fragment fragment, boolean z) {
        vx2.m53591g(fragment, "fragment");
        SetUserVisibleHintViolation setUserVisibleHintViolation = new SetUserVisibleHintViolation(fragment, z);
        FragmentStrictMode fragmentStrictMode = f3884a;
        fragmentStrictMode.mo6277g(setUserVisibleHintViolation);
        C0687b c = fragmentStrictMode.mo6275c(fragment);
        if (c.mo6281a().contains(Flag.DETECT_SET_USER_VISIBLE_HINT) && fragmentStrictMode.mo6279r(c, fragment.getClass(), setUserVisibleHintViolation.getClass())) {
            fragmentStrictMode.mo6276d(c, setUserVisibleHintViolation);
        }
    }

    /* renamed from: p */
    public static final void m5007p(Fragment fragment, ViewGroup viewGroup) {
        vx2.m53591g(fragment, "fragment");
        vx2.m53591g(viewGroup, "container");
        WrongFragmentContainerViolation wrongFragmentContainerViolation = new WrongFragmentContainerViolation(fragment, viewGroup);
        FragmentStrictMode fragmentStrictMode = f3884a;
        fragmentStrictMode.mo6277g(wrongFragmentContainerViolation);
        C0687b c = fragmentStrictMode.mo6275c(fragment);
        if (c.mo6281a().contains(Flag.DETECT_WRONG_FRAGMENT_CONTAINER) && fragmentStrictMode.mo6279r(c, fragment.getClass(), wrongFragmentContainerViolation.getClass())) {
            fragmentStrictMode.mo6276d(c, wrongFragmentContainerViolation);
        }
    }

    /* renamed from: c */
    public final C0687b mo6275c(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
                vx2.m53590f(parentFragmentManager, "declaringFragment.parentFragmentManager");
                if (parentFragmentManager.mo5921D0() != null) {
                    C0687b D0 = parentFragmentManager.mo5921D0();
                    vx2.m53588d(D0);
                    return D0;
                }
            }
            fragment = fragment.getParentFragment();
        }
        return f3885b;
    }

    /* renamed from: d */
    public final void mo6276d(C0687b bVar, Violation violation) {
        Fragment fragment = violation.getFragment();
        String name = fragment.getClass().getName();
        if (bVar.mo6281a().contains(Flag.PENALTY_LOG)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Policy violation in ");
            sb.append(name);
        }
        if (bVar.mo6282b() != null) {
            mo6278q(fragment, new va2(bVar, violation));
        }
        if (bVar.mo6281a().contains(Flag.PENALTY_DEATH)) {
            mo6278q(fragment, new wa2(name, violation));
        }
    }

    /* renamed from: g */
    public final void mo6277g(Violation violation) {
        if (FragmentManager.m4630K0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("StrictMode violation in ");
            sb.append(violation.getFragment().getClass().getName());
        }
    }

    /* renamed from: q */
    public final void mo6278q(Fragment fragment, Runnable runnable) {
        if (fragment.isAdded()) {
            Handler g = fragment.getParentFragmentManager().mo6018x0().mo6185g();
            vx2.m53590f(g, "fragment.parentFragmentManager.host.handler");
            if (vx2.m53586b(g.getLooper(), Looper.myLooper())) {
                runnable.run();
            } else {
                g.post(runnable);
            }
        } else {
            runnable.run();
        }
    }

    /* renamed from: r */
    public final boolean mo6279r(C0687b bVar, Class<? extends Fragment> cls, Class<? extends Violation> cls2) {
        Set set = bVar.mo6283c().get(cls.getName());
        if (set == null) {
            return true;
        }
        if (vx2.m53586b(cls2.getSuperclass(), Violation.class) || !CollectionsKt___CollectionsKt.m47320R(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}
