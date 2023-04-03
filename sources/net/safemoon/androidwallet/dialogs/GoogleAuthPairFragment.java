package net.safemoon.androidwallet.dialogs;

import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import kotlin.C6169a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.viewmodels.GoogleAuthViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 '2\u00020\u0001:\u0001(B\u0007¢\u0006\u0004\b%\u0010&J&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u000e\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rJ\b\u0010\u0010\u001a\u00020\u000bH\u0016J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u000bH\u0016J\b\u0010\u0015\u001a\u00020\u000bH\u0002J\b\u0010\u0016\u001a\u00020\u000bH\u0002R\u001d\u0010\u001c\u001a\u0004\u0018\u00010\u00178BX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001b\u0010$\u001a\u00020!8BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\"\u0010#¨\u0006)"}, mo44877d2 = {"Lnet/safemoon/androidwallet/dialogs/GoogleAuthPairFragment;", "Lkf1;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "Lr37;", "onViewCreated", "Landroidx/fragment/app/FragmentManager;", "manager", "T", "onStart", "Landroid/content/Context;", "context", "onAttach", "onDetach", "V", "U", "Lgo2;", "P", "Lef3;", "J", "()Lgo2;", "iGoogleAuthPair", "Lt92;", "Q", "Lt92;", "binding", "Lnet/safemoon/androidwallet/viewmodels/GoogleAuthViewModel;", "I", "()Lnet/safemoon/androidwallet/viewmodels/GoogleAuthViewModel;", "authModel", "<init>", "()V", "X", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: GoogleAuthPairFragment.kt */
public final class GoogleAuthPairFragment extends kf1 {

    /* renamed from: X */
    public static final C8299a f41752X = new C8299a((DefaultConstructorMarker) null);

    /* renamed from: P */
    public final ef3 f41753P = C6169a.m47232a(new GoogleAuthPairFragment$iGoogleAuthPair$2(this));

    /* renamed from: Q */
    public t92 f41754Q;

    /* renamed from: U */
    public final ef3 f41755U = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(GoogleAuthViewModel.class), new C8300xf2184381(this), new C8301xf2184382((pc2) null, this), new C8302xf2184383(this));

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, mo44877d2 = {"Lnet/safemoon/androidwallet/dialogs/GoogleAuthPairFragment$a;", "", "Lnet/safemoon/androidwallet/dialogs/GoogleAuthPairFragment;", "a", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.dialogs.GoogleAuthPairFragment$a */
    /* compiled from: GoogleAuthPairFragment.kt */
    public static final class C8299a {
        public C8299a() {
        }

        public /* synthetic */ C8299a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final GoogleAuthPairFragment mo57241a() {
            return new GoogleAuthPairFragment();
        }
    }

    /* renamed from: K */
    public static final void m66078K(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: L */
    public static final void m66079L(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: M */
    public static final void m66080M(GoogleAuthPairFragment googleAuthPairFragment, View view) {
        vx2.m53591g(googleAuthPairFragment, "this$0");
        googleAuthPairFragment.mo57239U();
    }

    /* renamed from: N */
    public static final void m66081N(GoogleAuthPairFragment googleAuthPairFragment, View view) {
        vx2.m53591g(googleAuthPairFragment, "this$0");
        googleAuthPairFragment.mo57239U();
    }

    /* renamed from: O */
    public static final void m66082O(GoogleAuthPairFragment googleAuthPairFragment, View view) {
        vx2.m53591g(googleAuthPairFragment, "this$0");
        googleAuthPairFragment.mo57240V();
    }

    /* renamed from: P */
    public static final void m66083P(GoogleAuthPairFragment googleAuthPairFragment, View view) {
        vx2.m53591g(googleAuthPairFragment, "this$0");
        googleAuthPairFragment.mo57240V();
    }

    /* renamed from: Q */
    public static final void m66084Q(GoogleAuthPairFragment googleAuthPairFragment, View view) {
        vx2.m53591g(googleAuthPairFragment, "this$0");
        Object systemService = googleAuthPairFragment.requireContext().getSystemService("clipboard");
        vx2.m53589e(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("label", googleAuthPairFragment.mo57236I().mo61205h().getValue()));
        Context requireContext = googleAuthPairFragment.requireContext();
        vx2.m53590f(requireContext, "requireContext()");
        ol0.m70345Y(requireContext, R.string.copied_to_clipboard);
    }

    /* renamed from: R */
    public static final void m66085R(GoogleAuthPairFragment googleAuthPairFragment, View view) {
        vx2.m53591g(googleAuthPairFragment, "this$0");
        go2 J = googleAuthPairFragment.mo57237J();
        if (J != null) {
            J.mo51950a();
        }
        googleAuthPairFragment.mo22266k();
    }

    /* renamed from: S */
    public static final void m66086S(GoogleAuthPairFragment googleAuthPairFragment, View view) {
        vx2.m53591g(googleAuthPairFragment, "this$0");
        Dialog n = googleAuthPairFragment.mo22269n();
        if (n != null) {
            n.dismiss();
        }
    }

    /* renamed from: I */
    public final GoogleAuthViewModel mo57236I() {
        return (GoogleAuthViewModel) this.f41755U.getValue();
    }

    /* renamed from: J */
    public final go2 mo57237J() {
        return (go2) this.f41753P.getValue();
    }

    /* renamed from: T */
    public final void mo57238T(FragmentManager fragmentManager) {
        vx2.m53591g(fragmentManager, "manager");
        super.mo22281x(fragmentManager, GoogleAuthPairFragment.class.getCanonicalName());
    }

    /* renamed from: U */
    public final void mo57239U() {
        t92 t92 = this.f41754Q;
        t92 t922 = null;
        if (t92 == null) {
            vx2.m53605u("binding");
            t92 = null;
        }
        t92.f34158f.setVisibility(0);
        t92 t923 = this.f41754Q;
        if (t923 == null) {
            vx2.m53605u("binding");
        } else {
            t922 = t923;
        }
        t922.f34159g.setVisibility(8);
    }

    /* renamed from: V */
    public final void mo57240V() {
        t92 t92 = this.f41754Q;
        t92 t922 = null;
        if (t92 == null) {
            vx2.m53605u("binding");
            t92 = null;
        }
        t92.f34158f.setVisibility(8);
        t92 t923 = this.f41754Q;
        if (t923 == null) {
            vx2.m53605u("binding");
        } else {
            t922 = t923;
        }
        t922.f34159g.setVisibility(0);
    }

    public void onAttach(Context context) {
        vx2.m53591g(context, "context");
        super.onAttach(context);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        vx2.m53591g(layoutInflater, "inflater");
        return LayoutInflater.from(requireContext()).inflate(R.layout.fragment_google_auth_pair, viewGroup, false);
    }

    public void onDetach() {
        super.onDetach();
    }

    public void onStart() {
        Window window;
        super.onStart();
        Dialog n = mo22269n();
        if (n != null && (window = n.getWindow()) != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setLayout(-1, -2);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        vx2.m53591g(view, "view");
        super.onViewCreated(view, bundle);
        t92 a = t92.m52143a(view);
        vx2.m53590f(a, "bind(view)");
        this.f41754Q = a;
        mo57236I().mo61205h().observe(getViewLifecycleOwner(), new ci2(new GoogleAuthPairFragment$onViewCreated$1(this)));
        mo57236I().mo61204g().observe(getViewLifecycleOwner(), new di2(new GoogleAuthPairFragment$onViewCreated$2(this)));
        t92 t92 = this.f41754Q;
        t92 t922 = null;
        if (t92 == null) {
            vx2.m53605u("binding");
            t92 = null;
        }
        t92.f34167o.setOnClickListener(new ei2(this));
        t92 t923 = this.f41754Q;
        if (t923 == null) {
            vx2.m53605u("binding");
            t923 = null;
        }
        t923.f34162j.setOnClickListener(new fi2(this));
        t92 t924 = this.f41754Q;
        if (t924 == null) {
            vx2.m53605u("binding");
            t924 = null;
        }
        t924.f34168p.setOnClickListener(new gi2(this));
        t92 t925 = this.f41754Q;
        if (t925 == null) {
            vx2.m53605u("binding");
            t925 = null;
        }
        t925.f34163k.setOnClickListener(new hi2(this));
        t92 t926 = this.f41754Q;
        if (t926 == null) {
            vx2.m53605u("binding");
            t926 = null;
        }
        t926.f34165m.setOnCloseIconClickListener(new ii2(this));
        t92 t927 = this.f41754Q;
        if (t927 == null) {
            vx2.m53605u("binding");
            t927 = null;
        }
        t927.f34155c.setOnClickListener(new ji2(this));
        t92 t928 = this.f41754Q;
        if (t928 == null) {
            vx2.m53605u("binding");
        } else {
            t922 = t928;
        }
        t922.f34156d.setOnClickListener(new ki2(this));
        mo57236I().mo61201d();
    }
}
