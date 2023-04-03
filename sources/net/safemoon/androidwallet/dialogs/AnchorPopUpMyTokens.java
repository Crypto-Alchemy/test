package net.safemoon.androidwallet.dialogs;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputEditText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.text.StringsKt__StringsKt;
import net.safemoon.androidwallet.R;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b%\u0010&J\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002JF\u0010\u0012\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010J\u0006\u0010\u0014\u001a\u00020\u0013J\u0006\u0010\u0015\u001a\u00020\u0005J\"\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00030\"8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010#¨\u0006'"}, mo44877d2 = {"Lnet/safemoon/androidwallet/dialogs/AnchorPopUpMyTokens;", "", "", "Lvc;", "list", "Lr37;", "g", "Landroid/content/Context;", "context", "Landroid/view/View;", "anchorView", "root", "Lkotlin/Function1;", "onItemClick", "", "selectedTokenSymbolType", "Landroid/widget/PopupWindow$OnDismissListener;", "onDismissListener", "f", "", "e", "d", "view", "", "count", "Landroid/widget/PopupWindow;", "c", "a", "Landroid/widget/PopupWindow;", "window", "Lk26;", "b", "Lk26;", "adapter", "", "Ljava/util/List;", "tokenList", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: AnchorPopUpMyTokens.kt */
public final class AnchorPopUpMyTokens {

    /* renamed from: a */
    public PopupWindow f41702a;

    /* renamed from: b */
    public k26 f41703b;

    /* renamed from: c */
    public final List<C9449vc> f41704c = new ArrayList();

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J*\u0010\f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016J*\u0010\u000e\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000f"}, mo44877d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "Lr37;", "afterTextChanged", "", "text", "", "start", "count", "after", "beforeTextChanged", "before", "onTextChanged", "core-ktx_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.dialogs.AnchorPopUpMyTokens$a */
    /* compiled from: TextView.kt */
    public static final class C8277a implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ AnchorPopUpMyTokens f41705a;

        public C8277a(AnchorPopUpMyTokens anchorPopUpMyTokens) {
            this.f41705a = anchorPopUpMyTokens;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            k26 k26;
            boolean z;
            List b = this.f41705a.f41704c;
            ArrayList arrayList = new ArrayList();
            Iterator it = b.iterator();
            while (true) {
                k26 = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                C9449vc vcVar = (C9449vc) next;
                boolean z2 = true;
                if (charSequence != null) {
                    if (StringsKt__StringsKt.m63090V0(charSequence).length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        String g = vcVar.mo66475g();
                        Locale locale = Locale.ROOT;
                        String lowerCase = g.toLowerCase(locale);
                        vx2.m53590f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        String lowerCase2 = StringsKt__StringsKt.m63090V0(charSequence).toString().toLowerCase(locale);
                        vx2.m53590f(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        if (!StringsKt__StringsKt.m63081R(lowerCase, lowerCase2, false, 2, (Object) null)) {
                            String lowerCase3 = vcVar.mo66474f().toLowerCase(locale);
                            vx2.m53590f(lowerCase3, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                            if (!StringsKt__StringsKt.m63081R(lowerCase3, StringsKt__StringsKt.m63090V0(charSequence).toString(), false, 2, (Object) null)) {
                                z2 = false;
                            }
                        }
                    }
                }
                if (z2) {
                    arrayList.add(next);
                }
            }
            k26 a = this.f41705a.f41703b;
            if (a == null) {
                vx2.m53605u("adapter");
            } else {
                k26 = a;
            }
            k26.submitList(arrayList);
        }
    }

    /* renamed from: c */
    public final PopupWindow mo57148c(View view, View view2, int i) {
        int i2;
        int i3;
        if (view2 != null) {
            i2 = view2.getWidth();
        } else {
            i2 = -1;
        }
        int i4 = (int) (((double) i2) * 0.8d);
        if (i <= 3) {
            i3 = -2;
        } else {
            i3 = (int) ho0.m58584a(300);
        }
        PopupWindow popupWindow = new PopupWindow(view, i4, i3);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setFocusable(true);
        popupWindow.setInputMethodMode(1);
        popupWindow.setAttachedInDecor(false);
        return popupWindow;
    }

    /* renamed from: d */
    public final void mo57149d() {
        PopupWindow popupWindow;
        if (mo57150e() && (popupWindow = this.f41702a) != null) {
            popupWindow.dismiss();
        }
    }

    /* renamed from: e */
    public final boolean mo57150e() {
        PopupWindow popupWindow = this.f41702a;
        if (popupWindow != null) {
            return popupWindow.isShowing();
        }
        return false;
    }

    /* renamed from: f */
    public final AnchorPopUpMyTokens mo57151f(Context context, View view, View view2, rc2<? super C9449vc, r37> rc2, String str, PopupWindow.OnDismissListener onDismissListener) {
        vx2.m53591g(context, "context");
        vx2.m53591g(view, "anchorView");
        vx2.m53591g(rc2, "onItemClick");
        vx2.m53591g(onDismissListener, "onDismissListener");
        this.f41703b = new k26(context, str, new AnchorPopUpMyTokens$show$1(rc2, this));
        Object systemService = context.getSystemService("layout_inflater");
        vx2.m53589e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        k26 k26 = null;
        View inflate = ((LayoutInflater) systemService).inflate(R.layout.dialog_anchor_pop_up_my_tokens, (ViewGroup) null);
        ye1 a = ye1.m54726a(inflate);
        vx2.m53590f(a, "bind(view)");
        a.f35855c.setLayoutManager(new LinearLayoutManager(context, 1, false));
        RecyclerView recyclerView = a.f35855c;
        k26 k262 = this.f41703b;
        if (k262 == null) {
            vx2.m53605u("adapter");
            k262 = null;
        }
        recyclerView.setAdapter(k262);
        k26 k263 = this.f41703b;
        if (k263 == null) {
            vx2.m53605u("adapter");
        } else {
            k26 = k263;
        }
        k26.submitList(this.f41704c);
        TextInputEditText textInputEditText = a.f35856d.f34980b;
        vx2.m53590f(textInputEditText, "searchBar.etSearch");
        textInputEditText.addTextChangedListener(new C8277a(this));
        vx2.m53590f(inflate, "view");
        PopupWindow c = mo57148c(inflate, view2, this.f41704c.size());
        this.f41702a = c;
        if (c != null) {
            c.setOnDismissListener(onDismissListener);
        }
        PopupWindow popupWindow = this.f41702a;
        if (popupWindow != null) {
            popupWindow.showAtLocation(view, 8388611, 0, -view.getHeight());
        }
        return this;
    }

    /* renamed from: g */
    public final void mo57152g(List<C9449vc> list) {
        vx2.m53591g(list, "list");
        this.f41704c.clear();
        List<C9449vc> list2 = this.f41704c;
        ArrayList arrayList = new ArrayList();
        for (T next : list) {
            if (!vx2.m53586b(((C9449vc) next).mo66476h(), "ERC_PSAFEMOON")) {
                arrayList.add(next);
            }
        }
        list2.addAll(arrayList);
    }
}
