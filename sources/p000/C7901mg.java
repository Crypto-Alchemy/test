package p000;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.textfield.TextInputEditText;
import kotlin.Metadata;
import net.safemoon.androidwallet.R;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0015\u001a\u00020\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u0016\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u001f¢\u0006\u0004\b$\u0010%J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\b\u001a\u00020\u0007J\u0012\u0010\u000b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH&J\u001a\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0002R\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u001b\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010 R\u0018\u0010#\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\"¨\u0006&"}, mo44877d2 = {"Lmg;", "", "Landroid/view/View;", "anchorView", "g", "", "e", "Lr37;", "d", "", "text", "f", "view", "root", "Landroid/widget/PopupWindow;", "c", "Landroid/content/Context;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "Ltz1;", "b", "Ltz1;", "getAdapter", "()Ltz1;", "adapter", "Landroid/view/View;", "getRoot", "()Landroid/view/View;", "Lkotlin/Function0;", "Lpc2;", "onDismissListener", "Landroid/widget/PopupWindow;", "window", "<init>", "(Landroid/content/Context;Ltz1;Landroid/view/View;Lpc2;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: mg */
/* compiled from: AnchorFiatCurrency.kt */
public abstract class C7901mg {

    /* renamed from: a */
    public final Context f40906a;

    /* renamed from: b */
    public final tz1 f40907b;

    /* renamed from: c */
    public final View f40908c;

    /* renamed from: d */
    public final pc2<r37> f40909d;

    /* renamed from: e */
    public PopupWindow f40910e;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J*\u0010\f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016J*\u0010\u000e\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000f"}, mo44877d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "Lr37;", "afterTextChanged", "", "text", "", "start", "count", "after", "beforeTextChanged", "before", "onTextChanged", "core-ktx_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: mg$a */
    /* compiled from: TextView.kt */
    public static final class C7902a implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ C7901mg f40911a;

        public C7902a(C7901mg mgVar) {
            this.f40911a = mgVar;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            String str;
            C7901mg mgVar = this.f40911a;
            if (charSequence != null) {
                str = charSequence.toString();
            } else {
                str = null;
            }
            mgVar.mo56249f(str);
        }
    }

    public C7901mg(Context context, tz1 tz1, View view, pc2<r37> pc2) {
        vx2.m53591g(context, "context");
        vx2.m53591g(tz1, "adapter");
        vx2.m53591g(pc2, "onDismissListener");
        this.f40906a = context;
        this.f40907b = tz1;
        this.f40908c = view;
        this.f40909d = pc2;
        Object systemService = context.getSystemService("layout_inflater");
        vx2.m53589e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        View inflate = ((LayoutInflater) systemService).inflate(R.layout.dialog_anchor_fiat_currency, (ViewGroup) null);
        we1 a = we1.m53866a(inflate);
        vx2.m53590f(a, "bind(view)");
        a.f35313c.setLayoutManager(new LinearLayoutManager(context, 1, false));
        a.f35313c.setAdapter(tz1);
        TextInputEditText textInputEditText = a.f35314d.f34980b;
        vx2.m53590f(textInputEditText, "searchBar.etSearch");
        textInputEditText.addTextChangedListener(new C7902a(this));
        vx2.m53590f(inflate, "view");
        PopupWindow c = mo56246c(inflate, view);
        this.f40910e = c;
        if (c != null) {
            c.setOnDismissListener(new C7830lg(pc2));
        }
    }

    /* renamed from: b */
    public static final void m64320b(pc2 pc2) {
        vx2.m53591g(pc2, "$tmp0");
        pc2.invoke();
    }

    /* renamed from: c */
    public final PopupWindow mo56246c(View view, View view2) {
        int i;
        if (view2 != null) {
            i = view2.getWidth();
        } else {
            i = -1;
        }
        PopupWindow popupWindow = new PopupWindow(view, (int) (((double) i) * 0.8d), (int) ho0.m58584a(400));
        popupWindow.setOutsideTouchable(true);
        popupWindow.setFocusable(true);
        popupWindow.setInputMethodMode(1);
        popupWindow.setAttachedInDecor(false);
        return popupWindow;
    }

    /* renamed from: d */
    public final void mo56247d() {
        PopupWindow popupWindow;
        if (mo56248e() && (popupWindow = this.f40910e) != null) {
            popupWindow.dismiss();
        }
    }

    /* renamed from: e */
    public final boolean mo56248e() {
        PopupWindow popupWindow = this.f40910e;
        if (popupWindow != null) {
            return popupWindow.isShowing();
        }
        return false;
    }

    /* renamed from: f */
    public abstract void mo56249f(String str);

    /* renamed from: g */
    public final C7901mg mo56250g(View view) {
        vx2.m53591g(view, "anchorView");
        PopupWindow popupWindow = this.f40910e;
        if (popupWindow != null) {
            popupWindow.showAsDropDown(view);
        }
        return this;
    }
}
