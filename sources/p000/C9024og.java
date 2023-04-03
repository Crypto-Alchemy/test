package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0016\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012¢\u0006\u0004\b\u001c\u0010\u001dJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\"\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\bH\u0004J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000bH\u0004J\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\bH\u0002R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00128\u0006¢\u0006\f\n\u0004\b\f\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001a¨\u0006\u001e"}, mo44877d2 = {"Log;", "", "", "e", "Lr37;", "d", "Landroid/content/Context;", "context", "", "width", "layout", "Landroid/view/View;", "b", "anchorView", "f", "view", "Landroid/widget/PopupWindow;", "c", "Lkotlin/Function0;", "a", "Lpc2;", "getOnShowListener", "()Lpc2;", "onShowListener", "getOnDismissListener", "onDismissListener", "Landroid/widget/PopupWindow;", "window", "<init>", "(Lpc2;Lpc2;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: og */
/* compiled from: AnchorItemDialog.kt */
public class C9024og {

    /* renamed from: a */
    public final pc2<r37> f43639a;

    /* renamed from: b */
    public final pc2<r37> f43640b;

    /* renamed from: c */
    public PopupWindow f43641c;

    public C9024og(pc2<r37> pc2, pc2<r37> pc22) {
        vx2.m53591g(pc2, "onShowListener");
        vx2.m53591g(pc22, "onDismissListener");
        this.f43639a = pc2;
        this.f43640b = pc22;
    }

    /* renamed from: g */
    public static final void m70257g(C9024og ogVar) {
        vx2.m53591g(ogVar, "this$0");
        ogVar.f43640b.invoke();
    }

    /* renamed from: b */
    public final View mo62903b(Context context, int i, int i2) {
        vx2.m53591g(context, "context");
        Object systemService = context.getSystemService("layout_inflater");
        vx2.m53589e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        View inflate = ((LayoutInflater) systemService).inflate(i2, (ViewGroup) null);
        vx2.m53590f(inflate, "view");
        this.f43641c = mo62904c(inflate, i);
        return inflate;
    }

    /* renamed from: c */
    public final PopupWindow mo62904c(View view, int i) {
        PopupWindow popupWindow = new PopupWindow(view, i, -2);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setFocusable(true);
        popupWindow.setInputMethodMode(1);
        popupWindow.setAttachedInDecor(false);
        return popupWindow;
    }

    /* renamed from: d */
    public final void mo62905d() {
        PopupWindow popupWindow;
        if (mo62906e() && (popupWindow = this.f43641c) != null) {
            popupWindow.dismiss();
        }
    }

    /* renamed from: e */
    public final boolean mo62906e() {
        PopupWindow popupWindow = this.f43641c;
        if (popupWindow != null) {
            return popupWindow.isShowing();
        }
        return false;
    }

    /* renamed from: f */
    public final void mo62907f(View view) {
        vx2.m53591g(view, "anchorView");
        PopupWindow popupWindow = this.f43641c;
        if (popupWindow != null) {
            popupWindow.showAsDropDown(view);
        }
        this.f43639a.invoke();
        PopupWindow popupWindow2 = this.f43641c;
        if (popupWindow2 != null) {
            popupWindow2.setOnDismissListener(new C8988ng(this));
        }
    }
}
