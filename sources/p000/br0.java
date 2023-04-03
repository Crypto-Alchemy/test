package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.RecyclerView;
import com.google.mlkit.common.MlKitException;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.model.contact.abstraction.IContact;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ6\u0010\r\u001a\u00020\u00002\b\b\u0001\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u0011\u001a\u00020\u0010J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002R\u0016\u0010\u001a\u001a\u00020\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006 "}, mo44877d2 = {"Lbr0;", "", "Landroid/content/Context;", "context", "", "Lnet/safemoon/androidwallet/model/contact/abstraction/IContact;", "itemData", "Landroid/widget/EditText;", "editText", "Lrn2;", "onIContactItemClickListener", "Landroid/widget/PopupWindow$OnDismissListener;", "dismissListener", "i", "", "h", "Lr37;", "g", "Landroid/view/View;", "view", "", "count", "Landroid/widget/PopupWindow;", "f", "b", "I", "prevItemCount", "c", "Landroid/widget/PopupWindow;", "window", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: br0 */
/* compiled from: ContactAddressPopUp.kt */
public final class br0 {

    /* renamed from: a */
    public static final br0 f36938a = new br0();

    /* renamed from: b */
    public static int f36939b;

    /* renamed from: c */
    public static PopupWindow f36940c;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo44877d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    /* renamed from: br0$a */
    /* compiled from: Comparisons.kt */
    public static final class C6875a<T> implements Comparator {
        public final int compare(T t, T t2) {
            String name = ((IContact) t).getName();
            Locale locale = Locale.ROOT;
            String lowerCase = name.toLowerCase(locale);
            vx2.m53590f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            String lowerCase2 = ((IContact) t2).getName().toLowerCase(locale);
            vx2.m53590f(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            return xl0.m54426a(lowerCase, lowerCase2);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, mo44877d2 = {"br0$b", "Landroidx/recyclerview/widget/RecyclerView$i;", "Lr37;", "onChanged", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: br0$b */
    /* compiled from: ContactAddressPopUp.kt */
    public static final class C6876b extends RecyclerView.C1239i {

        /* renamed from: a */
        public final /* synthetic */ kr0 f36941a;

        /* renamed from: b */
        public final /* synthetic */ View f36942b;

        /* renamed from: c */
        public final /* synthetic */ EditText f36943c;

        /* renamed from: d */
        public final /* synthetic */ PopupWindow.OnDismissListener f36944d;

        public C6876b(kr0 kr0, View view, EditText editText, PopupWindow.OnDismissListener onDismissListener) {
            this.f36941a = kr0;
            this.f36942b = view;
            this.f36943c = editText;
            this.f36944d = onDismissListener;
        }

        public void onChanged() {
            super.onChanged();
            if (br0.f36940c != null) {
                PopupWindow c = br0.f36940c;
                boolean z = true;
                if (c == null || !c.isShowing()) {
                    z = false;
                }
                if (z && this.f36941a.getItemCount() != br0.f36939b) {
                    br0.f36939b = this.f36941a.getItemCount();
                    PopupWindow c2 = br0.f36940c;
                    vx2.m53588d(c2);
                    c2.setOnDismissListener((PopupWindow.OnDismissListener) null);
                    PopupWindow c3 = br0.f36940c;
                    vx2.m53588d(c3);
                    c3.dismiss();
                    br0 br0 = br0.f36938a;
                    View view = this.f36942b;
                    vx2.m53590f(view, "view");
                    br0.f36940c = br0.mo50701f(view, br0.f36939b);
                    PopupWindow c4 = br0.f36940c;
                    if (c4 != null) {
                        c4.showAsDropDown(this.f36943c);
                    }
                    this.f36943c.requestFocus();
                    PopupWindow c5 = br0.f36940c;
                    vx2.m53588d(c5);
                    c5.setOnDismissListener(this.f36944d);
                }
            }
        }
    }

    /* renamed from: f */
    public final PopupWindow mo50701f(View view, int i) {
        int i2;
        if (i <= 3) {
            i2 = -2;
        } else {
            i2 = (int) ho0.m58584a(Integer.valueOf(MlKitException.CODE_SCANNER_UNAVAILABLE));
        }
        PopupWindow popupWindow = new PopupWindow(view, -1, i2);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setFocusable(false);
        popupWindow.setInputMethodMode(1);
        popupWindow.setAttachedInDecor(false);
        return popupWindow;
    }

    /* renamed from: g */
    public final void mo50702g() {
        PopupWindow popupWindow = f36940c;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    /* renamed from: h */
    public final boolean mo50703h() {
        PopupWindow popupWindow = f36940c;
        if (popupWindow != null) {
            return popupWindow.isShowing();
        }
        return false;
    }

    /* renamed from: i */
    public final br0 mo50704i(Context context, List<? extends IContact> list, EditText editText, rn2 rn2, PopupWindow.OnDismissListener onDismissListener) {
        vx2.m53591g(context, "context");
        vx2.m53591g(list, "itemData");
        vx2.m53591g(editText, "editText");
        vx2.m53591g(rn2, "onIContactItemClickListener");
        vx2.m53591g(onDismissListener, "dismissListener");
        f36939b = list.size();
        Object systemService = context.getSystemService("layout_inflater");
        vx2.m53589e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        View inflate = ((LayoutInflater) systemService).inflate(R.layout.dialog_contact_search, (ViewGroup) null);
        kr0 kr0 = new kr0(CollectionsKt___CollectionsKt.m47304D0(list, new C6875a()), editText, rn2);
        ((RecyclerView) inflate.findViewById(R.id.recyclerView)).setAdapter(kr0);
        vx2.m53590f(inflate, "view");
        f36940c = mo50701f(inflate, list.size());
        kr0.registerAdapterDataObserver(new C6876b(kr0, inflate, editText, onDismissListener));
        PopupWindow popupWindow = f36940c;
        if (popupWindow != null) {
            popupWindow.setOnDismissListener(onDismissListener);
        }
        PopupWindow popupWindow2 = f36940c;
        if (popupWindow2 != null) {
            popupWindow2.showAsDropDown(editText);
        }
        editText.requestFocus();
        return this;
    }
}
