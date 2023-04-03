package net.safemoon.androidwallet.dialogs;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import kotlin.C6169a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.viewmodels.SwapViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 $2\u00020\u0001:\u0001%B\u0007¢\u0006\u0004\b\"\u0010#J&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u000e\u001a\u00020\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u000f\u001a\u00020\u000bH\u0016J\u000e\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010J\u0010\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0002R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001b\u0010!\u001a\u00020\u001c8BX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006&"}, mo44877d2 = {"Lnet/safemoon/androidwallet/dialogs/SwapAutoSlippage;", "Lkf1;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "Lr37;", "onViewCreated", "Landroid/app/Dialog;", "p", "onStart", "Landroidx/fragment/app/FragmentManager;", "manager", "G", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "", "B", "Lcf1;", "P", "Lcf1;", "binding", "Lnet/safemoon/androidwallet/viewmodels/SwapViewModel;", "Q", "Lef3;", "C", "()Lnet/safemoon/androidwallet/viewmodels/SwapViewModel;", "swapViewModel", "<init>", "()V", "U", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: SwapAutoSlippage.kt */
public final class SwapAutoSlippage extends kf1 {

    /* renamed from: U */
    public static final C8309a f41790U = new C8309a((DefaultConstructorMarker) null);

    /* renamed from: X */
    public static boolean f41791X;

    /* renamed from: P */
    public cf1 f41792P;

    /* renamed from: Q */
    public final ef3 f41793Q;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, mo44877d2 = {"Lnet/safemoon/androidwallet/dialogs/SwapAutoSlippage$a;", "", "Lnet/safemoon/androidwallet/dialogs/SwapAutoSlippage;", "a", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.dialogs.SwapAutoSlippage$a */
    /* compiled from: SwapAutoSlippage.kt */
    public static final class C8309a {
        public C8309a() {
        }

        public /* synthetic */ C8309a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final SwapAutoSlippage mo57301a() {
            SwapAutoSlippage swapAutoSlippage = new SwapAutoSlippage();
            swapAutoSlippage.setArguments(new Bundle());
            return swapAutoSlippage;
        }
    }

    public SwapAutoSlippage() {
        ef3 b = C6169a.m47233b(LazyThreadSafetyMode.NONE, new SwapAutoSlippage$special$$inlined$viewModels$default$1(new SwapAutoSlippage$swapViewModel$2(this)));
        this.f41793Q = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(SwapViewModel.class), new SwapAutoSlippage$special$$inlined$viewModels$default$2(b), new SwapAutoSlippage$special$$inlined$viewModels$default$3((pc2) null, b), new SwapAutoSlippage$special$$inlined$viewModels$default$4(this, b));
    }

    /* renamed from: D */
    public static final void m66199D(SwapAutoSlippage swapAutoSlippage, View view) {
        vx2.m53591g(swapAutoSlippage, "this$0");
        swapAutoSlippage.mo22266k();
    }

    /* renamed from: E */
    public static final void m66200E(SwapAutoSlippage swapAutoSlippage, View view) {
        vx2.m53591g(swapAutoSlippage, "this$0");
        swapAutoSlippage.mo22266k();
    }

    /* renamed from: F */
    public static final void m66201F(SwapAutoSlippage swapAutoSlippage, View view) {
        vx2.m53591g(swapAutoSlippage, "this$0");
        f06.m57523n(swapAutoSlippage.requireContext(), "SWAP_PAIR_DONT_SHOW_ME", Boolean.FALSE);
        swapAutoSlippage.mo22266k();
    }

    /* renamed from: B */
    public final double mo57298B() {
        return ol0.m70322B(wy6.m54142a(mo57299C().mo61553B0().getValue(), mo57299C().mo61604c0().getValue()));
    }

    /* renamed from: C */
    public final SwapViewModel mo57299C() {
        return (SwapViewModel) this.f41793Q.getValue();
    }

    /* renamed from: G */
    public final void mo57300G(FragmentManager fragmentManager) {
        vx2.m53591g(fragmentManager, "manager");
        if (!f41791X) {
            super.mo22281x(fragmentManager, SwapAutoSlippage.class.getCanonicalName());
            f41791X = true;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        vx2.m53591g(layoutInflater, "inflater");
        return LayoutInflater.from(requireContext()).inflate(R.layout.dialog_auto_slippage, viewGroup, false);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        vx2.m53591g(dialogInterface, "dialog");
        f41791X = false;
        super.onDismiss(dialogInterface);
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
        vx2.m53591g(view, "view");
        super.onViewCreated(view, bundle);
        cf1 a = cf1.m32977a(view);
        vx2.m53590f(a, "bind(view)");
        this.f41792P = a;
        cf1 cf1 = null;
        if (a == null) {
            vx2.m53605u("binding");
            a = null;
        }
        a.f21714d.setOnClickListener(new re6(this));
        cf1 cf12 = this.f41792P;
        if (cf12 == null) {
            vx2.m53605u("binding");
            cf12 = null;
        }
        da7 da7 = cf12.f21725o;
        da7.f28076c.setOnClickListener(new se6(this));
        da7.f28075b.setText(R.string.auto_slippage_ok);
        cf1 cf13 = this.f41792P;
        if (cf13 == null) {
            vx2.m53605u("binding");
            cf13 = null;
        }
        cf13.f21712b.setOnClickListener(new te6(this));
        cf1 cf14 = this.f41792P;
        if (cf14 == null) {
            vx2.m53605u("binding");
        } else {
            cf1 = cf14;
        }
        cf1.f21724n.setText(mo57298B() + "%");
    }

    /* renamed from: p */
    public Dialog mo22273p(Bundle bundle) {
        Dialog p = super.mo22273p(bundle);
        vx2.m53590f(p, "super.onCreateDialog(savedInstanceState)");
        p.requestWindowFeature(1);
        return p;
    }
}
