package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import kotlin.Metadata;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.viewmodels.MyTokensListViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u001b\u0010\u001cJ \u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004J\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\u000b\u001a\u00020\nJ\u001a\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0002R\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002XD¢\u0006\u0006\n\u0004\b\u000e\u0010\u0019¨\u0006\u001d"}, mo44877d2 = {"Leg;", "", "Landroid/content/Context;", "context", "Landroid/view/View;", "anchorView", "root", "f", "", "e", "Lr37;", "d", "view", "Landroid/widget/PopupWindow;", "c", "Lnet/safemoon/androidwallet/viewmodels/MyTokensListViewModel;", "a", "Lnet/safemoon/androidwallet/viewmodels/MyTokensListViewModel;", "getViewModel", "()Lnet/safemoon/androidwallet/viewmodels/MyTokensListViewModel;", "viewModel", "b", "Landroid/widget/PopupWindow;", "window", "", "I", "selectedColor", "<init>", "(Lnet/safemoon/androidwallet/viewmodels/MyTokensListViewModel;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: eg */
/* compiled from: AnchorChainBalance.kt */
public final class C7047eg {

    /* renamed from: a */
    public final MyTokensListViewModel f37534a;

    /* renamed from: b */
    public PopupWindow f37535b;

    /* renamed from: c */
    public final int f37536c = R.color.curve_green;

    public C7047eg(MyTokensListViewModel myTokensListViewModel) {
        vx2.m53591g(myTokensListViewModel, "viewModel");
        this.f37534a = myTokensListViewModel;
    }

    /* renamed from: g */
    public static final void m57317g(C7047eg egVar, View view) {
        vx2.m53591g(egVar, "this$0");
        egVar.f37534a.mo61303P(false);
        egVar.mo51461d();
    }

    /* renamed from: h */
    public static final void m57318h(C7047eg egVar, View view) {
        vx2.m53591g(egVar, "this$0");
        egVar.f37534a.mo61303P(true);
        egVar.mo51461d();
    }

    /* renamed from: c */
    public final PopupWindow mo51460c(View view, View view2) {
        int i;
        if (view2 != null) {
            i = view2.getWidth();
        } else {
            i = -1;
        }
        PopupWindow popupWindow = new PopupWindow(view, i, -2);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setFocusable(true);
        popupWindow.setInputMethodMode(1);
        popupWindow.setAttachedInDecor(false);
        return popupWindow;
    }

    /* renamed from: d */
    public final void mo51461d() {
        PopupWindow popupWindow;
        if (mo51462e() && (popupWindow = this.f37535b) != null) {
            popupWindow.dismiss();
        }
    }

    /* renamed from: e */
    public final boolean mo51462e() {
        PopupWindow popupWindow = this.f37535b;
        if (popupWindow != null) {
            return popupWindow.isShowing();
        }
        return false;
    }

    /* renamed from: f */
    public final C7047eg mo51463f(Context context, View view, View view2) {
        vx2.m53591g(context, "context");
        vx2.m53591g(view, "anchorView");
        Object systemService = context.getSystemService("layout_inflater");
        vx2.m53589e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        View inflate = ((LayoutInflater) systemService).inflate(R.layout.dialog_anchor_chain_balance, (ViewGroup) null);
        te1 a = te1.m52272a(inflate);
        vx2.m53590f(a, "bind(view)");
        if (vx2.m53586b(this.f37534a.mo61299K().getValue(), Boolean.TRUE)) {
            a.f34247c.setTextColor(zr0.m31440c(context, this.f37536c));
        } else {
            a.f34246b.setTextColor(zr0.m31440c(context, this.f37536c));
        }
        a.f34246b.setOnClickListener(new C6939cg(this));
        a.f34247c.setOnClickListener(new C6973dg(this));
        vx2.m53590f(inflate, "view");
        PopupWindow c = mo51460c(inflate, view2);
        this.f37535b = c;
        if (c != null) {
            c.showAsDropDown(view);
        }
        return this;
    }
}
