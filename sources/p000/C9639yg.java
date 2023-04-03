package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.List;
import kotlin.Metadata;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.common.MyCoinType;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.model.wallets.Wallet;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ0\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u000f\u001a\u00020\u000eJ$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u0007H\u0002R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019¨\u0006\u001d"}, mo44877d2 = {"Lyg;", "", "Landroid/content/Context;", "context", "Landroid/view/View;", "anchorView", "root", "", "chainId", "Lkp2;", "onWalletItemClickListener", "f", "", "e", "Lr37;", "d", "view", "count", "Landroid/widget/PopupWindow;", "b", "", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "a", "Ljava/util/List;", "list", "Landroid/widget/PopupWindow;", "window", "<init>", "(Ljava/util/List;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: yg */
/* compiled from: AnchorSelectWalletsAddress.kt */
public final class C9639yg {

    /* renamed from: a */
    public final List<Wallet> f46206a;

    /* renamed from: b */
    public PopupWindow f46207b;

    public C9639yg(List<Wallet> list) {
        vx2.m53591g(list, "list");
        this.f46206a = list;
    }

    /* renamed from: c */
    public static /* synthetic */ PopupWindow m74400c(C9639yg ygVar, View view, View view2, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 4;
        }
        return ygVar.mo67093b(view, view2, i);
    }

    /* renamed from: g */
    public static final void m74401g(kp2 kp2, Wallet wallet2, View view) {
        vx2.m53591g(kp2, "$onWalletItemClickListener");
        vx2.m53591g(wallet2, "$wallet");
        kp2.mo55760a(wallet2);
    }

    /* renamed from: b */
    public final PopupWindow mo67093b(View view, View view2, int i) {
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

    /* renamed from: d */
    public final void mo67094d() {
        PopupWindow popupWindow;
        if (mo67095e() && (popupWindow = this.f46207b) != null) {
            popupWindow.dismiss();
        }
    }

    /* renamed from: e */
    public final boolean mo67095e() {
        PopupWindow popupWindow = this.f46207b;
        if (popupWindow != null) {
            return popupWindow.isShowing();
        }
        return false;
    }

    /* renamed from: f */
    public final C9639yg mo67096f(Context context, View view, View view2, int i, kp2 kp2) {
        Long l;
        vx2.m53591g(context, "context");
        vx2.m53591g(view, "anchorView");
        vx2.m53591g(kp2, "onWalletItemClickListener");
        Object systemService = context.getSystemService("layout_inflater");
        vx2.m53589e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        LayoutInflater layoutInflater = (LayoutInflater) systemService;
        View inflate = layoutInflater.inflate(R.layout.dialog_anchor_select_wallets_address, (ViewGroup) null);
        af1 a = af1.m31824a(inflate);
        vx2.m53590f(a, "bind(view)");
        a.f20936b.removeAllViews();
        Wallet c = ol0.m70351c(context);
        MyCoinType coinType = TokenType.Companion.mo57099b(i).getCoinType();
        try {
            for (Wallet wallet2 : this.f46206a) {
                Long id = wallet2.getId();
                if (c != null) {
                    l = c.getId();
                } else {
                    l = null;
                }
                if (!vx2.m53586b(id, l)) {
                    gz2 c2 = gz2.m44996c(layoutInflater, a.f20936b, false);
                    c2.f29406d.setText(wallet2.displayName());
                    c2.f29405c.setText(wallet2.getAddress(coinType.getValue()));
                    a.f20936b.addView(c2.mo43045b());
                    c2.mo43045b().setOnClickListener(new C9597xg(kp2, wallet2));
                }
            }
        } catch (Exception unused) {
        }
        vx2.m53590f(inflate, "view");
        PopupWindow c3 = m74400c(this, inflate, view2, 0, 4, (Object) null);
        this.f46207b = c3;
        if (c3 != null) {
            c3.showAsDropDown(view);
        }
        return this;
    }
}
