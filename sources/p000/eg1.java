package p000;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.button.MaterialButton;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.safemoon.androidwallet.R;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u001f2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u000e\u001a\u00020\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u000f\u001a\u00020\u000bH\u0016J\u000e\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019¨\u0006!"}, mo44877d2 = {"Leg1;", "Lkf1;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "Lr37;", "onViewCreated", "Landroid/app/Dialog;", "p", "onStart", "Landroidx/fragment/app/FragmentManager;", "manager", "G", "Lfg1;", "P", "Lfg1;", "binding", "Lkotlin/Function0;", "Q", "Lpc2;", "consolidateListener", "U", "dontShowMeListener", "<init>", "()V", "X", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: eg1 */
/* compiled from: DialogV2Help.kt */
public final class eg1 extends kf1 {

    /* renamed from: X */
    public static final C7048a f37537X = new C7048a((DefaultConstructorMarker) null);

    /* renamed from: P */
    public fg1 f37538P;

    /* renamed from: Q */
    public pc2<r37> f37539Q;

    /* renamed from: U */
    public pc2<r37> f37540U;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ*\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¨\u0006\n"}, mo44877d2 = {"Leg1$a;", "", "Lkotlin/Function0;", "Lr37;", "consolidateListener", "dontShowMeListener", "Leg1;", "a", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: eg1$a */
    /* compiled from: DialogV2Help.kt */
    public static final class C7048a {
        public C7048a() {
        }

        public /* synthetic */ C7048a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final eg1 mo51466a(pc2<r37> pc2, pc2<r37> pc22) {
            eg1 eg1 = new eg1();
            eg1.setArguments(new Bundle());
            eg1.f37539Q = pc2;
            eg1.f37540U = pc22;
            return eg1;
        }
    }

    /* renamed from: D */
    public static final void m57329D(eg1 eg1, View view) {
        vx2.m53591g(eg1, "this$0");
        eg1.mo22266k();
    }

    /* renamed from: E */
    public static final void m57330E(eg1 eg1, View view) {
        vx2.m53591g(eg1, "this$0");
        eg1.mo22266k();
        pc2<r37> pc2 = eg1.f37539Q;
        if (pc2 != null) {
            pc2.invoke();
        }
    }

    /* renamed from: F */
    public static final void m57331F(eg1 eg1, View view) {
        vx2.m53591g(eg1, "this$0");
        eg1.mo22266k();
        pc2<r37> pc2 = eg1.f37540U;
        if (pc2 != null) {
            pc2.invoke();
        }
    }

    /* renamed from: G */
    public final void mo51465G(FragmentManager fragmentManager) {
        vx2.m53591g(fragmentManager, "manager");
        super.mo22281x(fragmentManager, eg1.class.getCanonicalName());
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        vx2.m53591g(layoutInflater, "inflater");
        return LayoutInflater.from(requireContext()).inflate(R.layout.dialog_v2_help, viewGroup, false);
    }

    public void onStart() {
        super.onStart();
        Dialog n = mo22269n();
        if (n != null) {
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
        fg1 a = fg1.m44310a(view);
        vx2.m53590f(a, "bind(view)");
        this.f37538P = a;
        fg1 fg1 = null;
        if (a == null) {
            vx2.m53605u("binding");
            a = null;
        }
        a.f28861e.setOnClickListener(new bg1(this));
        fg1 fg12 = this.f37538P;
        if (fg12 == null) {
            vx2.m53605u("binding");
            fg12 = null;
        }
        fg12.f28858b.setOnClickListener(new cg1(this));
        fg1 fg13 = this.f37538P;
        if (fg13 == null) {
            vx2.m53605u("binding");
            fg13 = null;
        }
        fg13.f28859c.setOnClickListener(new dg1(this));
        fg1 fg14 = this.f37538P;
        if (fg14 == null) {
            vx2.m53605u("binding");
        } else {
            fg1 = fg14;
        }
        MaterialButton materialButton = fg1.f28859c;
        if (this.f37540U != null) {
            z = true;
        } else {
            z = false;
        }
        materialButton.setVisibility(ol0.m70370l0(z));
    }

    /* renamed from: p */
    public Dialog mo22273p(Bundle bundle) {
        Dialog p = super.mo22273p(bundle);
        vx2.m53590f(p, "super.onCreateDialog(savedInstanceState)");
        p.requestWindowFeature(1);
        return p;
    }
}
