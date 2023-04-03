package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.List;
import kotlin.Metadata;
import kotlin.text.StringsKt__StringsKt;
import net.safemoon.androidwallet.R;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\t\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ4\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007J\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u000e\u001a\u00020\tJ$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0002R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, mo44877d2 = {"Lwg;", "", "Landroid/content/Context;", "context", "Landroid/view/View;", "anchorView", "root", "Lkotlin/Function1;", "", "Lr37;", "onItemClickListener", "g", "", "f", "e", "view", "", "count", "Landroid/widget/PopupWindow;", "c", "", "a", "Ljava/util/List;", "list", "b", "Landroid/widget/PopupWindow;", "window", "<init>", "(Ljava/util/List;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: wg */
/* compiled from: AnchorSelectSecurityQuestions.kt */
public final class C9517wg {

    /* renamed from: a */
    public final List<String> f45516a;

    /* renamed from: b */
    public PopupWindow f45517b;

    public C9517wg(List<String> list) {
        vx2.m53591g(list, "list");
        this.f45516a = list;
    }

    /* renamed from: d */
    public static /* synthetic */ PopupWindow m73598d(C9517wg wgVar, View view, View view2, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 4;
        }
        return wgVar.mo66696c(view, view2, i);
    }

    /* renamed from: h */
    public static final void m73599h(rc2 rc2, String str, C9517wg wgVar, View view) {
        vx2.m53591g(rc2, "$onItemClickListener");
        vx2.m53591g(str, "$question");
        vx2.m53591g(wgVar, "this$0");
        rc2.invoke(str);
        wgVar.mo66697e();
    }

    /* renamed from: i */
    public static final void m73600i(rc2 rc2, String str, C9517wg wgVar, View view) {
        vx2.m53591g(rc2, "$onItemClickListener");
        vx2.m53591g(str, "$question");
        vx2.m53591g(wgVar, "this$0");
        rc2.invoke(str);
        wgVar.mo66697e();
    }

    /* renamed from: c */
    public final PopupWindow mo66696c(View view, View view2, int i) {
        int i2;
        if (view2 != null) {
            i2 = view2.getWidth();
        } else {
            i2 = -1;
        }
        PopupWindow popupWindow = new PopupWindow(view, i2, view.getContext().getResources().getDimensionPixelSize(R.dimen._150sdp));
        popupWindow.setOutsideTouchable(true);
        popupWindow.setFocusable(true);
        popupWindow.setInputMethodMode(1);
        popupWindow.setAttachedInDecor(false);
        return popupWindow;
    }

    /* renamed from: e */
    public final void mo66697e() {
        PopupWindow popupWindow;
        if (mo66698f() && (popupWindow = this.f45517b) != null) {
            popupWindow.dismiss();
        }
    }

    /* renamed from: f */
    public final boolean mo66698f() {
        PopupWindow popupWindow = this.f45517b;
        if (popupWindow != null) {
            return popupWindow.isShowing();
        }
        return false;
    }

    /* renamed from: g */
    public final C9517wg mo66699g(Context context, View view, View view2, rc2<? super String, r37> rc2) {
        vx2.m53591g(context, "context");
        vx2.m53591g(view, "anchorView");
        vx2.m53591g(rc2, "onItemClickListener");
        Object systemService = context.getSystemService("layout_inflater");
        vx2.m53589e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        LayoutInflater layoutInflater = (LayoutInflater) systemService;
        View inflate = layoutInflater.inflate(R.layout.dialog_anchor_select_security_questions, (ViewGroup) null);
        ze1 a = ze1.m55075a(inflate);
        vx2.m53590f(a, "bind(view)");
        a.f36132b.removeAllViews();
        try {
            for (String str : this.f45516a) {
                String[] strArr = (String[]) StringsKt__StringsKt.m63061B0(str, new String[]{"="}, false, 0, 6, (Object) null).toArray(new String[0]);
                if (strArr.length > 1) {
                    iz2 c = iz2.m46062c(layoutInflater, a.f36132b, false);
                    c.f30171c.setText(strArr[1]);
                    a.f36132b.addView(c.mo43983b());
                    c.mo43983b().setOnClickListener(new C9400ug(rc2, str, this));
                } else if (strArr.length == 1) {
                    iz2 c2 = iz2.m46062c(layoutInflater, a.f36132b, false);
                    c2.f30171c.setText(strArr[0]);
                    a.f36132b.addView(c2.mo43983b());
                    c2.mo43983b().setOnClickListener(new C9455vg(rc2, str, this));
                }
            }
        } catch (Exception unused) {
        }
        vx2.m53590f(inflate, "view");
        PopupWindow d = m73598d(this, inflate, view2, 0, 4, (Object) null);
        this.f45517b = d;
        if (d != null) {
            d.showAsDropDown(view);
        }
        return this;
    }
}
