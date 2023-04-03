package net.safemoon.androidwallet.fragments;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.creageek.segmentedbutton.SegmentedButton;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.C6169a;
import kotlin.Metadata;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.adapter.touchHelper.RecyclerTouchListener;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.domain.listener.dalog.OnSelectTokenTypeClickListener;
import net.safemoon.androidwallet.fragments.common.BaseMainFragment;
import net.safemoon.androidwallet.model.reflections.RoomReflectionsToken;
import net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel;
import p000.ft4;
import p000.xb5;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b7\u00108J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J&\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0006\u0010\u000e\u001a\u00020\u0004J\u0006\u0010\u000f\u001a\u00020\u0004J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\b\u0010\u0011\u001a\u00020\u0004H\u0002J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u001e\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002R\u001b\u0010 \u001a\u00020\u001b8BX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020!8BX\u0002¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010$R\u0018\u0010)\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b+\u0010,R\u001b\u00102\u001a\u00020.8BX\u0002¢\u0006\f\n\u0004\b/\u0010\u001d\u001a\u0004\b0\u00101R\u0014\u00106\u001a\u0002038\u0002X\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00069"}, mo44877d2 = {"Lnet/safemoon/androidwallet/fragments/ReflectionsFragment;", "Lnet/safemoon/androidwallet/fragments/common/BaseMainFragment;", "Landroid/os/Bundle;", "savedInstanceState", "Lr37;", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "view", "onViewCreated", "U", "T", "onPause", "E", "", "canDrag", "S", "Lnet/safemoon/androidwallet/adapter/touchHelper/RecyclerTouchListener;", "touchListener", "", "Lnet/safemoon/androidwallet/model/reflections/RoomReflectionsToken;", "list", "I", "Lob4;", "k", "Lef3;", "F", "()Lob4;", "notificationHistoryViewModel", "Lnet/safemoon/androidwallet/viewmodels/ReflectionTrackerViewModel;", "r", "H", "()Lnet/safemoon/androidwallet/viewmodels/ReflectionTrackerViewModel;", "reflectionViewModel", "Lnet/safemoon/androidwallet/domain/listener/dalog/OnSelectTokenTypeClickListener;", "s", "Lnet/safemoon/androidwallet/domain/listener/dalog/OnSelectTokenTypeClickListener;", "onSelectTokenTypeClickListener", "Lla2;", "x", "Lla2;", "binding", "Lya5;", "y", "G", "()Lya5;", "reflectionTokenAdapter", "Landroid/os/Handler;", "A", "Landroid/os/Handler;", "handlerRefresh", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: ReflectionsFragment.kt */
public final class ReflectionsFragment extends BaseMainFragment {

    /* renamed from: A */
    public final Handler f42039A = new Handler(Looper.getMainLooper());

    /* renamed from: k */
    public final ef3 f42040k = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(ob4.class), new C8421xfc55ab2e(this), new C8422xfc55ab2f((pc2) null, this), new C8423xfc55ab30(this));

    /* renamed from: r */
    public final ef3 f42041r = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(ReflectionTrackerViewModel.class), new C8424xfc55ab31(this), new C8425xfc55ab32((pc2) null, this), new C8426xfc55ab33(this));

    /* renamed from: s */
    public OnSelectTokenTypeClickListener f42042s;

    /* renamed from: x */
    public la2 f42043x;

    /* renamed from: y */
    public final ef3 f42044y = C6169a.m47232a(ReflectionsFragment$reflectionTokenAdapter$2.INSTANCE);

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/ReflectionsFragment$a", "Lnet/safemoon/androidwallet/domain/listener/dalog/OnSelectTokenTypeClickListener;", "Lnet/safemoon/androidwallet/common/TokenType;", "c", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.ReflectionsFragment$a */
    /* compiled from: ReflectionsFragment.kt */
    public static final class C8419a extends OnSelectTokenTypeClickListener {

        /* renamed from: r */
        public final /* synthetic */ ReflectionsFragment f42045r;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8419a(ReflectionsFragment reflectionsFragment, C8420b bVar, WeakReference<Activity> weakReference, Map<String, ? extends TokenType> map) {
            super(bVar, weakReference, map);
            this.f42045r = reflectionsFragment;
        }

        /* renamed from: c */
        public TokenType mo57366c() {
            TokenType value = this.f42045r.mo57595H().mo61349u().getValue();
            if (value == null) {
                Context requireContext = this.f42045r.requireContext();
                vx2.m53590f(requireContext, "requireContext()");
                value = ol0.m70355e(requireContext);
            }
            vx2.m53590f(value, "reflectionViewModel.sele… requireContext().chain()");
            return value;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/ReflectionsFragment$b", "Lft4$a;", "Lnet/safemoon/androidwallet/common/TokenType;", "token", "Lr37;", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.ReflectionsFragment$b */
    /* compiled from: ReflectionsFragment.kt */
    public static final class C8420b implements ft4.C7102a {

        /* renamed from: a */
        public final /* synthetic */ ReflectionsFragment f42046a;

        public C8420b(ReflectionsFragment reflectionsFragment) {
            this.f42046a = reflectionsFragment;
        }

        /* renamed from: a */
        public void mo51798a(TokenType tokenType) {
            vx2.m53591g(tokenType, "token");
            this.f42046a.mo57595H().mo61349u().postValue(tokenType);
        }
    }

    /* renamed from: J */
    public static final void m66830J(ReflectionsFragment reflectionsFragment, List list, RecyclerTouchListener recyclerTouchListener) {
        vx2.m53591g(reflectionsFragment, "this$0");
        vx2.m53591g(list, "$list");
        vx2.m53591g(recyclerTouchListener, "$touchListener");
        if (reflectionsFragment.f42043x == null) {
            vx2.m53605u("binding");
        }
        reflectionsFragment.mo57597S(!list.isEmpty());
        reflectionsFragment.mo57594G().submitList((List) null);
        reflectionsFragment.mo57594G().submitList(list);
        reflectionsFragment.mo57594G().notifyDataSetChanged();
        ArrayList arrayList = new ArrayList();
        if (arrayList.size() > 0) {
            Integer[] numArr = (Integer[]) arrayList.toArray(new Integer[0]);
            recyclerTouchListener.mo57038z((Integer[]) Arrays.copyOf(numArr, numArr.length));
            return;
        }
        recyclerTouchListener.mo57038z(new Integer[0]);
    }

    /* renamed from: K */
    public static final void m66831K(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: L */
    public static final void m66832L(ReflectionsFragment reflectionsFragment, View view) {
        vx2.m53591g(reflectionsFragment, "this$0");
        if (reflectionsFragment.mo57594G().getCurrentList().size() >= 3) {
            C9001np.m69961j0(new WeakReference(reflectionsFragment.requireActivity()), R.string.reflection_limit_message, R.string.ok);
            return;
        }
        TokenType value = reflectionsFragment.mo57595H().mo61349u().getValue();
        vx2.m53588d(value);
        xb5.C9590a a = xb5.m73907a(value.getChainId());
        vx2.m53590f(a, "actionReflectionsFragmen…                        )");
        reflectionsFragment.mo50753j(a);
    }

    /* renamed from: M */
    public static final void m66833M(ReflectionsFragment reflectionsFragment, View view) {
        vx2.m53591g(reflectionsFragment, "this$0");
        j44 b = xb5.m73908b();
        vx2.m53590f(b, "actionReflectionsFragmen…ficationHistoryFragment()");
        reflectionsFragment.mo50753j(b);
    }

    /* renamed from: N */
    public static final void m66834N(ReflectionsFragment reflectionsFragment, View view) {
        vx2.m53591g(reflectionsFragment, "this$0");
        FragmentActivity requireActivity = reflectionsFragment.requireActivity();
        vx2.m53590f(requireActivity, "requireActivity()");
        fy0.m57958g(requireActivity, Integer.valueOf(R.string.reflection_tracker_title), R.string.reflection_tracker_detail, false, new ub5(), 8, (Object) null);
    }

    /* renamed from: O */
    public static final void m66835O(DialogInterface dialogInterface) {
    }

    /* renamed from: P */
    public static final void m66836P(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: Q */
    public static final void m66837Q(ReflectionsFragment reflectionsFragment, int i, int i2) {
        vx2.m53591g(reflectionsFragment, "this$0");
        if (i == R.id.btnDelete) {
            RoomReflectionsToken roomReflectionsToken = (RoomReflectionsToken) reflectionsFragment.mo57594G().getCurrentList().get(i2);
            ReflectionTrackerViewModel H = reflectionsFragment.mo57595H();
            vx2.m53590f(roomReflectionsToken, "item");
            H.mo61339k(roomReflectionsToken);
        }
    }

    /* renamed from: R */
    public static final void m66838R(DialogInterface dialogInterface) {
    }

    /* renamed from: E */
    public final void mo57592E() {
        Float f;
        SegmentedButton segmentedButton;
        Resources resources;
        DisplayMetrics displayMetrics;
        boolean z = true;
        if (jo6.m20327a(Locale.getDefault()) != 1) {
            z = false;
        }
        if (z) {
            int i = Resources.getSystem().getDisplayMetrics().widthPixels;
            FragmentActivity activity = getActivity();
            ViewGroup.LayoutParams layoutParams = null;
            if (activity == null || (resources = activity.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
                f = null;
            } else {
                f = Float.valueOf(displayMetrics.density);
            }
            vx2.m53588d(f);
            int b = i - ap3.m31899b(((float) 85) * f.floatValue());
            la2 la2 = this.f42043x;
            if (la2 == null) {
                vx2.m53605u("binding");
                la2 = null;
            }
            C5872go goVar = la2.f31268i;
            if (goVar != null) {
                segmentedButton = goVar.f29306j;
            } else {
                segmentedButton = null;
            }
            if (segmentedButton != null) {
                layoutParams = segmentedButton.getLayoutParams();
            }
            if (layoutParams != null) {
                layoutParams.width = b;
            }
            if (segmentedButton != null) {
                segmentedButton.setLayoutParams(layoutParams);
            }
        }
    }

    /* renamed from: F */
    public final ob4 mo57593F() {
        return (ob4) this.f42040k.getValue();
    }

    /* renamed from: G */
    public final ya5 mo57594G() {
        return (ya5) this.f42044y.getValue();
    }

    /* renamed from: H */
    public final ReflectionTrackerViewModel mo57595H() {
        return (ReflectionTrackerViewModel) this.f42041r.getValue();
    }

    /* renamed from: I */
    public final void mo57596I(RecyclerTouchListener recyclerTouchListener, List<RoomReflectionsToken> list) {
        this.f42039A.removeCallbacksAndMessages((Object) null);
        this.f42039A.postDelayed(new vb5(this, list, recyclerTouchListener), 500);
    }

    /* renamed from: S */
    public final void mo57597S(boolean z) {
        if (z) {
            mo57598T();
        } else {
            mo57599U();
        }
    }

    /* renamed from: T */
    public final void mo57598T() {
        la2 la2 = this.f42043x;
        if (la2 == null) {
            vx2.m53605u("binding");
            la2 = null;
        }
        ViewGroup.LayoutParams layoutParams = la2.f31262c.getLayoutParams();
        vx2.m53589e(layoutParams, "null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout.LayoutParams");
        AppBarLayout.LayoutParams layoutParams2 = (AppBarLayout.LayoutParams) layoutParams;
        layoutParams2.mo31600d(5);
        la2.f31262c.setLayoutParams(layoutParams2);
        ViewGroup.LayoutParams layoutParams3 = la2.f31261b.getLayoutParams();
        vx2.m53589e(layoutParams3, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        CoordinatorLayout.C0546e eVar = (CoordinatorLayout.C0546e) layoutParams3;
        eVar.mo5303o(new AppBarLayout.Behavior());
        la2.f31261b.setLayoutParams(eVar);
    }

    /* renamed from: U */
    public final void mo57599U() {
        la2 la2 = this.f42043x;
        if (la2 == null) {
            vx2.m53605u("binding");
            la2 = null;
        }
        ViewGroup.LayoutParams layoutParams = la2.f31262c.getLayoutParams();
        vx2.m53589e(layoutParams, "null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout.LayoutParams");
        AppBarLayout.LayoutParams layoutParams2 = (AppBarLayout.LayoutParams) layoutParams;
        layoutParams2.mo31600d(0);
        la2.f31262c.setLayoutParams(layoutParams2);
        ViewGroup.LayoutParams layoutParams3 = la2.f31261b.getLayoutParams();
        vx2.m53589e(layoutParams3, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        CoordinatorLayout.C0546e eVar = (CoordinatorLayout.C0546e) layoutParams3;
        eVar.mo5303o((CoordinatorLayout.Behavior) null);
        la2.f31261b.setLayoutParams(eVar);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo57595H().mo61349u().postValue(mo57595H().mo61348t());
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        vx2.m53591g(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_reflections, viewGroup, false);
    }

    public void onPause() {
        super.onPause();
        OnSelectTokenTypeClickListener onSelectTokenTypeClickListener = this.f42042s;
        if (onSelectTokenTypeClickListener != null) {
            onSelectTokenTypeClickListener.mo57365b();
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        vx2.m53591g(view, "view");
        super.onViewCreated(view, bundle);
        la2 a = la2.m47749a(view);
        vx2.m53590f(a, "bind(view)");
        this.f42043x = a;
        mo57593F().mo62867g().observe(getViewLifecycleOwner(), new nb5(new ReflectionsFragment$onViewCreated$1(this)));
        la2 la2 = this.f42043x;
        if (la2 == null) {
            vx2.m53605u("binding");
            la2 = null;
        }
        la2.f31268i.f29304h.setChecked(true);
        RecyclerView recyclerView = la2.f31267h;
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
        recyclerView.setAdapter(mo57594G());
        la2.f31268i.f29299c.setVisibility(4);
        la2.f31268i.f29300d.setVisibility(0);
        la2.f31268i.f29300d.setOnClickListener(new ob5(this));
        la2.f31268i.f29298b.setOnClickListener(new pb5(this));
        SegmentedButton segmentedButton = la2.f31268i.f29306j;
        vx2.m53590f(segmentedButton, "it.topBar.segmentedGroup");
        mo58057q(segmentedButton);
        la2.f31265f.setOnClickListener(new qb5(this));
        mo57592E();
        this.f42042s = new C8419a(this, new C8420b(this), new WeakReference(requireActivity()), mo57595H().mo61350v());
        la2 la22 = this.f42043x;
        if (la22 == null) {
            vx2.m53605u("binding");
            la22 = null;
        }
        la22.f31266g.f21727b.setOnClickListener(this.f42042s);
        mo57595H().mo61349u().observe(getViewLifecycleOwner(), new rb5(new ReflectionsFragment$onViewCreated$5(this)));
        mo57594G().mo67052g(new ReflectionsFragment$onViewCreated$6(this));
        mo57594G().mo67050e(new ReflectionsFragment$onViewCreated$7(this));
        FragmentActivity requireActivity = requireActivity();
        la2 la23 = this.f42043x;
        if (la23 == null) {
            vx2.m53605u("binding");
            la23 = null;
        }
        RecyclerTouchListener recyclerTouchListener = new RecyclerTouchListener(requireActivity, la23.f31267h);
        recyclerTouchListener.mo57036x(Integer.valueOf(R.id.btnDelete)).mo57037y(R.id.rowFG, R.id.rowBG, new sb5(this));
        la2 la24 = this.f42043x;
        if (la24 == null) {
            vx2.m53605u("binding");
            la24 = null;
        }
        la24.f31267h.mo9079k(recyclerTouchListener);
        vg3.m28804a(this).mo6301b(new ReflectionsFragment$onViewCreated$9(this, recyclerTouchListener, (ns0<? super ReflectionsFragment$onViewCreated$9>) null));
        zi7 zi7 = zi7.f46397a;
        Context requireContext = requireContext();
        vx2.m53590f(requireContext, "requireContext()");
        if (zi7.mo67313a(requireContext, "REFLECTION_INTRO", true)) {
            FragmentActivity requireActivity2 = requireActivity();
            vx2.m53590f(requireActivity2, "requireActivity()");
            fy0.m57958g(requireActivity2, Integer.valueOf(R.string.reflection_tracker_title), R.string.reflection_tracker_detail, false, new tb5(), 8, (Object) null);
        }
    }
}
