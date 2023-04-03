package net.safemoon.androidwallet.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.C1710a;
import com.google.android.material.textview.MaterialTextView;
import kotlin.C6169a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.safemoon.androidwallet.R;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000 +2\u00020\u0001:\u0001,B\u0007¢\u0006\u0004\b)\u0010*J&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u000e\u001a\u00020\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u000f\u001a\u00020\u000bH\u0016J\u000e\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010J\u0010\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0016\u001a\u00020\u000bH\u0016R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001b\u0010 \u001a\u00020\u001b8BX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020!8BX\u0002¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010$R\u001b\u0010(\u001a\u00020!8BX\u0002¢\u0006\f\n\u0004\b&\u0010\u001d\u001a\u0004\b'\u0010$¨\u0006-"}, mo44877d2 = {"Lnet/safemoon/androidwallet/dialogs/ProgressLoading;", "Lkf1;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "Lr37;", "onViewCreated", "Landroid/app/Dialog;", "p", "onStart", "Landroidx/fragment/app/FragmentManager;", "manager", "D", "Landroid/content/Context;", "context", "onAttach", "onDetach", "Lmf1;", "P", "Lmf1;", "binding", "", "Q", "Lef3;", "z", "()Z", "canCancel", "", "U", "B", "()Ljava/lang/String;", "title", "X", "A", "message", "<init>", "()V", "Y", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: ProgressLoading.kt */
public final class ProgressLoading extends kf1 {

    /* renamed from: Y */
    public static final C8308a f41785Y = new C8308a((DefaultConstructorMarker) null);

    /* renamed from: P */
    public mf1 f41786P;

    /* renamed from: Q */
    public final ef3 f41787Q = C6169a.m47232a(new ProgressLoading$canCancel$2(this));

    /* renamed from: U */
    public final ef3 f41788U = C6169a.m47232a(new ProgressLoading$title$2(this));

    /* renamed from: X */
    public final ef3 f41789X = C6169a.m47232a(new ProgressLoading$message$2(this));

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004R\u0014\u0010\t\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u000f"}, mo44877d2 = {"Lnet/safemoon/androidwallet/dialogs/ProgressLoading$a;", "", "", "canCancel", "", "title", "msg", "Lnet/safemoon/androidwallet/dialogs/ProgressLoading;", "a", "ARG_CAN_CANCEL", "Ljava/lang/String;", "ARG_MSG", "ARG_TITLE", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.dialogs.ProgressLoading$a */
    /* compiled from: ProgressLoading.kt */
    public static final class C8308a {
        public C8308a() {
        }

        public /* synthetic */ C8308a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final ProgressLoading mo57297a(boolean z, String str, String str2) {
            vx2.m53591g(str, "title");
            vx2.m53591g(str2, "msg");
            ProgressLoading progressLoading = new ProgressLoading();
            Bundle bundle = new Bundle();
            bundle.putBoolean("CAN_CANCEL", z);
            bundle.putString("TITLE", str);
            bundle.putString("MSG", str2);
            progressLoading.setArguments(bundle);
            return progressLoading;
        }
    }

    /* renamed from: C */
    public static final void m66190C(ProgressLoading progressLoading, View view) {
        vx2.m53591g(progressLoading, "this$0");
        progressLoading.mo22266k();
    }

    /* renamed from: A */
    public final String mo57293A() {
        return (String) this.f41789X.getValue();
    }

    /* renamed from: B */
    public final String mo57294B() {
        return (String) this.f41788U.getValue();
    }

    /* renamed from: D */
    public final void mo57295D(FragmentManager fragmentManager) {
        vx2.m53591g(fragmentManager, "manager");
        super.mo22281x(fragmentManager, ProgressLoading.class.getCanonicalName());
    }

    public void onAttach(Context context) {
        vx2.m53591g(context, "context");
        super.onAttach(context);
        a77.m55424b(requireActivity(), Boolean.TRUE);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        vx2.m53591g(layoutInflater, "inflater");
        return LayoutInflater.from(requireContext()).inflate(R.layout.dialog_progress_loading, viewGroup, false);
    }

    public void onDetach() {
        super.onDetach();
        a77.m55424b(requireActivity(), Boolean.FALSE);
    }

    public void onStart() {
        super.onStart();
        Dialog n = mo22269n();
        if (n != null) {
            n.setCanceledOnTouchOutside(false);
            n.setCancelable(false);
            Window window = n.getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
            Window window2 = n.getWindow();
            if (window2 != null) {
                window2.setLayout(-1, -2);
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        boolean z;
        vx2.m53591g(view, "view");
        super.onViewCreated(view, bundle);
        mf1 a = mf1.m48276a(view);
        vx2.m53590f(a, "bind(view)");
        this.f41786P = a;
        mf1 mf1 = null;
        if (a == null) {
            vx2.m53605u("binding");
            a = null;
        }
        a.f31687b.setVisibility(ol0.m70370l0(mo57296z()));
        a.f31687b.setOnClickListener(new nw4(this));
        a.f31689d.setText(mo57294B());
        a.f31688c.setText(mo57293A());
        MaterialTextView materialTextView = a.f31688c;
        if (mo57293A().length() == 0) {
            z = true;
        } else {
            z = false;
        }
        materialTextView.setVisibility(ol0.m70366j0(z));
        be5<Drawable> w = C1710a.m12226v(this).mo23162w(Integer.valueOf(R.raw.safemoon_animated_logo));
        mf1 mf12 = this.f41786P;
        if (mf12 == null) {
            vx2.m53605u("binding");
        } else {
            mf1 = mf12;
        }
        w.mo11553K0(mf1.f31690e);
    }

    /* renamed from: p */
    public Dialog mo22273p(Bundle bundle) {
        Dialog p = super.mo22273p(bundle);
        vx2.m53590f(p, "super.onCreateDialog(savedInstanceState)");
        p.requestWindowFeature(1);
        return p;
    }

    /* renamed from: z */
    public final boolean mo57296z() {
        return ((Boolean) this.f41787Q.getValue()).booleanValue();
    }
}
