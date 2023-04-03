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
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.viewmodels.GoogleAuthViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \"2\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b \u0010!J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J&\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eJ\b\u0010\u0011\u001a\u00020\u0004H\u0016J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u0004H\u0016R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006$"}, mo44877d2 = {"Lnet/safemoon/androidwallet/dialogs/Google2FABackup;", "Lkf1;", "Landroid/os/Bundle;", "savedInstanceState", "Lr37;", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "view", "onViewCreated", "Landroidx/fragment/app/FragmentManager;", "manager", "K", "onStart", "Landroid/content/Context;", "context", "onAttach", "onDetach", "Lu92;", "P", "Lu92;", "binding", "Lnet/safemoon/androidwallet/viewmodels/GoogleAuthViewModel;", "Q", "Lef3;", "E", "()Lnet/safemoon/androidwallet/viewmodels/GoogleAuthViewModel;", "authModel", "<init>", "()V", "U", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: Google2FABackup.kt */
public final class Google2FABackup extends kf1 {

    /* renamed from: U */
    public static final C8293a f41743U = new C8293a((DefaultConstructorMarker) null);

    /* renamed from: P */
    public u92 f41744P;

    /* renamed from: Q */
    public final ef3 f41745Q = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(GoogleAuthViewModel.class), new Google2FABackup$special$$inlined$activityViewModels$default$1(this), new Google2FABackup$special$$inlined$activityViewModels$default$2((pc2) null, this), new Google2FABackup$special$$inlined$activityViewModels$default$3(this));

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, mo44877d2 = {"Lnet/safemoon/androidwallet/dialogs/Google2FABackup$a;", "", "Lnet/safemoon/androidwallet/dialogs/Google2FABackup;", "a", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.dialogs.Google2FABackup$a */
    /* compiled from: Google2FABackup.kt */
    public static final class C8293a {
        public C8293a() {
        }

        public /* synthetic */ C8293a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Google2FABackup mo57225a() {
            return new Google2FABackup();
        }
    }

    /* renamed from: F */
    public static final void m66046F(Google2FABackup google2FABackup, View view) {
        vx2.m53591g(google2FABackup, "this$0");
        Dialog n = google2FABackup.mo22269n();
        if (n != null) {
            n.dismiss();
        }
    }

    /* renamed from: G */
    public static final void m66047G(Google2FABackup google2FABackup, View view) {
        vx2.m53591g(google2FABackup, "this$0");
        google2FABackup.mo22266k();
    }

    /* renamed from: H */
    public static final void m66048H(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: I */
    public static final void m66049I(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: J */
    public static final void m66050J(Google2FABackup google2FABackup, View view) {
        vx2.m53591g(google2FABackup, "this$0");
        Object systemService = google2FABackup.requireContext().getSystemService("clipboard");
        vx2.m53589e(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("label", google2FABackup.mo57223E().mo61205h().getValue()));
        Context requireContext = google2FABackup.requireContext();
        vx2.m53590f(requireContext, "requireContext()");
        ol0.m70345Y(requireContext, R.string.copied_to_clipboard);
    }

    /* renamed from: E */
    public final GoogleAuthViewModel mo57223E() {
        return (GoogleAuthViewModel) this.f41745Q.getValue();
    }

    /* renamed from: K */
    public final void mo57224K(FragmentManager fragmentManager) {
        vx2.m53591g(fragmentManager, "manager");
        super.mo22281x(fragmentManager, Google2FABackup.class.getCanonicalName());
    }

    public void onAttach(Context context) {
        vx2.m53591g(context, "context");
        super.onAttach(context);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        vx2.m53591g(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_google_backup, viewGroup, false);
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
        u92 a = u92.m52688a(view);
        vx2.m53590f(a, "bind(view)");
        this.f41744P = a;
        u92 u92 = null;
        if (a == null) {
            vx2.m53605u("binding");
            a = null;
        }
        a.f34484c.setOnClickListener(new ph2(this));
        u92 u922 = this.f41744P;
        if (u922 == null) {
            vx2.m53605u("binding");
            u922 = null;
        }
        u922.f34483b.setOnClickListener(new qh2(this));
        mo57223E().mo61205h().observe(getViewLifecycleOwner(), new rh2(new Google2FABackup$onViewCreated$3(this)));
        mo57223E().mo61204g().observe(getViewLifecycleOwner(), new sh2(new Google2FABackup$onViewCreated$4(this)));
        u92 u923 = this.f41744P;
        if (u923 == null) {
            vx2.m53605u("binding");
        } else {
            u92 = u923;
        }
        u92.f34490i.setOnClickListener(new th2(this));
    }
}
