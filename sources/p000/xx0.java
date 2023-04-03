package p000;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import java.util.List;
import kotlin.Metadata;
import net.safemoon.androidwallet.R;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0018\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00060\u0015¢\u0006\u0004\b\"\u0010#J\u001a\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\b\u001a\u00020\u0002R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R)\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00060\u00158\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020\u00168\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\b\u0010 ¨\u0006$"}, mo44877d2 = {"Lxx0;", "", "", "isCancelable", "isCanceledOnTouchOutside", "b", "Lr37;", "f", "e", "Landroid/content/Context;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "", "Lm70;", "Ljava/util/List;", "getButtons", "()Ljava/util/List;", "buttons", "Lkotlin/Function2;", "Landroid/app/Dialog;", "c", "Lfd2;", "getCallBack", "()Lfd2;", "callBack", "Lff1;", "d", "Lff1;", "dialogCustomConfirmationBinding", "Landroid/app/Dialog;", "alertDialog", "<init>", "(Landroid/content/Context;Ljava/util/List;Lfd2;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: xx0 */
/* compiled from: CustomConfirmation.kt */
public final class xx0 {

    /* renamed from: a */
    public final Context f46045a;

    /* renamed from: b */
    public final List<m70> f46046b;

    /* renamed from: c */
    public final fd2<m70, Dialog, r37> f46047c;

    /* renamed from: d */
    public ff1 f46048d;

    /* renamed from: e */
    public Dialog f46049e;

    public xx0(Context context, List<m70> list, fd2<? super m70, ? super Dialog, r37> fd2) {
        vx2.m53591g(context, "context");
        vx2.m53591g(list, "buttons");
        vx2.m53591g(fd2, "callBack");
        this.f46045a = context;
        this.f46046b = list;
        this.f46047c = fd2;
    }

    /* renamed from: c */
    public static /* synthetic */ xx0 m74124c(xx0 xx0, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        return xx0.mo66962b(z, z2);
    }

    /* renamed from: d */
    public static final void m74125d(xx0 xx0, m70 m70, View view) {
        vx2.m53591g(xx0, "this$0");
        vx2.m53591g(m70, "$it");
        fd2<m70, Dialog, r37> fd2 = xx0.f46047c;
        Dialog dialog = xx0.f46049e;
        if (dialog == null) {
            vx2.m53605u("alertDialog");
            dialog = null;
        }
        fd2.invoke(m70, dialog);
    }

    /* renamed from: b */
    public final xx0 mo66962b(boolean z, boolean z2) {
        View inflate = LayoutInflater.from(this.f46045a).inflate(R.layout.dialog_custom_confirmation, (ViewGroup) null);
        ff1 a = ff1.m44308a(inflate);
        this.f46048d = a;
        vx2.m53588d(a);
        for (m70 m70 : this.f46046b) {
            View inflate2 = LayoutInflater.from(this.f46045a).inflate(R.layout.item_simple_text_button, (ViewGroup) null);
            vx2.m53589e(inflate2, "null cannot be cast to non-null type android.widget.Button");
            Button button = (Button) inflate2;
            String c = m70.mo56150c();
            if (c != null) {
                button.setText(c);
            }
            Integer b = m70.mo56149b();
            if (b != null) {
                button.setText(b.intValue());
            }
            int a2 = m70.mo56148a();
            if (a2 == -3 || a2 == -2 || a2 == -1) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(button.getText());
                spannableStringBuilder.setSpan(new StyleSpan(1), 0, spannableStringBuilder.length(), 0);
                button.setText(spannableStringBuilder);
            }
            button.setTextColor(zr0.m31440c(this.f46045a, R.color.t5));
            if (m70.mo56151d()) {
                button.setOnClickListener(new wx0(this, m70));
            }
            a.f28851b.addView(button);
        }
        Dialog dialog = new Dialog(this.f46045a, 2132017235);
        dialog.requestWindowFeature(1);
        dialog.setCancelable(z);
        dialog.setCanceledOnTouchOutside(z2);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.getAttributes().gravity = 17;
            window.getAttributes().width = -1;
        }
        dialog.setContentView(inflate);
        this.f46049e = dialog;
        return this;
    }

    /* renamed from: e */
    public final boolean mo66963e() {
        Dialog dialog = this.f46049e;
        if (dialog != null) {
            if (dialog == null) {
                vx2.m53605u("alertDialog");
                dialog = null;
            }
            if (dialog.isShowing()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final void mo66964f() {
        Dialog dialog = this.f46049e;
        if (dialog != null) {
            if (dialog == null) {
                vx2.m53605u("alertDialog");
                dialog = null;
            }
            dialog.show();
        }
    }
}
