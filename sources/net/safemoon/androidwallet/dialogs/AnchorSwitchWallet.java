package net.safemoon.androidwallet.dialogs;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import kotlin.Metadata;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.viewmodels.MultiWalletViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0017\u001a\u00020\r¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004J\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\u000b\u001a\u00020\nJ$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0002R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\r8\u0002XD¢\u0006\u0006\n\u0004\b\u0010\u0010\u0016¨\u0006\u001e"}, mo44877d2 = {"Lnet/safemoon/androidwallet/dialogs/AnchorSwitchWallet;", "", "Landroid/content/Context;", "context", "Landroid/view/View;", "anchorView", "root", "h", "", "g", "Lr37;", "f", "view", "", "count", "Landroid/widget/PopupWindow;", "d", "Lnet/safemoon/androidwallet/viewmodels/MultiWalletViewModel;", "a", "Lnet/safemoon/androidwallet/viewmodels/MultiWalletViewModel;", "multiWalletVM", "b", "I", "actionId", "c", "Landroid/widget/PopupWindow;", "window", "selectedColor", "<init>", "(Lnet/safemoon/androidwallet/viewmodels/MultiWalletViewModel;I)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: AnchorSwitchWallet.kt */
public final class AnchorSwitchWallet {

    /* renamed from: a */
    public final MultiWalletViewModel f41706a;

    /* renamed from: b */
    public final int f41707b;

    /* renamed from: c */
    public PopupWindow f41708c;

    /* renamed from: d */
    public final int f41709d = R.color.curve_green;

    public AnchorSwitchWallet(MultiWalletViewModel multiWalletViewModel, int i) {
        vx2.m53591g(multiWalletViewModel, "multiWalletVM");
        this.f41706a = multiWalletViewModel;
        this.f41707b = i;
    }

    /* renamed from: e */
    public static /* synthetic */ PopupWindow m65927e(AnchorSwitchWallet anchorSwitchWallet, View view, View view2, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 4;
        }
        return anchorSwitchWallet.mo57157d(view, view2, i);
    }

    /* renamed from: d */
    public final PopupWindow mo57157d(View view, View view2, int i) {
        int i2;
        if (view2 != null) {
            i2 = view2.getWidth();
        } else {
            i2 = -1;
        }
        PopupWindow popupWindow = new PopupWindow(view, i2, -2);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setFocusable(true);
        popupWindow.setInputMethodMode(1);
        popupWindow.setAttachedInDecor(false);
        return popupWindow;
    }

    /* renamed from: f */
    public final void mo57158f() {
        PopupWindow popupWindow;
        if (mo57159g() && (popupWindow = this.f41708c) != null) {
            popupWindow.dismiss();
        }
    }

    /* renamed from: g */
    public final boolean mo57159g() {
        PopupWindow popupWindow = this.f41708c;
        if (popupWindow != null) {
            return popupWindow.isShowing();
        }
        return false;
    }

    /* renamed from: h */
    public final AnchorSwitchWallet mo57160h(Context context, View view, View view2) {
        vx2.m53591g(context, "context");
        vx2.m53591g(view, "anchorView");
        Object systemService = context.getSystemService("layout_inflater");
        vx2.m53589e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        LayoutInflater layoutInflater = (LayoutInflater) systemService;
        View inflate = layoutInflater.inflate(R.layout.dialog_anchor_switch_wallet, (ViewGroup) null);
        bf1 a = bf1.m32509a(inflate);
        vx2.m53590f(a, "bind(view)");
        a.f21274b.removeAllViews();
        this.f41706a.mo61256r(new AnchorSwitchWallet$show$1$1(context, layoutInflater, a, ol0.m70351c(context), this));
        vx2.m53590f(inflate, "view");
        PopupWindow e = m65927e(this, inflate, view2, 0, 4, (Object) null);
        this.f41708c = e;
        if (e != null) {
            e.showAsDropDown(view);
        }
        return this;
    }
}
