package androidx.compose.p004ui.text.input;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import kotlin.C6169a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016R\u001b\u0010\u000e\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\t\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0013"}, mo44877d2 = {"Landroidx/compose/ui/text/input/InputMethodManagerImpl;", "Lav2;", "Landroid/view/View;", "view", "Lr37;", "c", "b", "Landroid/os/IBinder;", "windowToken", "a", "Landroid/view/inputmethod/InputMethodManager;", "Lef3;", "d", "()Landroid/view/inputmethod/InputMethodManager;", "imm", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.text.input.InputMethodManagerImpl */
/* compiled from: InputMethodManager.kt */
public final class InputMethodManagerImpl implements av2 {

    /* renamed from: a */
    public final ef3 f2208a;

    public InputMethodManagerImpl(Context context) {
        vx2.m53591g(context, "context");
        this.f2208a = C6169a.m47233b(LazyThreadSafetyMode.NONE, new InputMethodManagerImpl$imm$2(context));
    }

    /* renamed from: a */
    public void mo4118a(IBinder iBinder) {
        mo4121d().hideSoftInputFromWindow(iBinder, 0);
    }

    /* renamed from: b */
    public void mo4119b(View view) {
        vx2.m53591g(view, "view");
        mo4121d().showSoftInput(view, 0);
    }

    /* renamed from: c */
    public void mo4120c(View view) {
        vx2.m53591g(view, "view");
        mo4121d().restartInput(view);
    }

    /* renamed from: d */
    public final InputMethodManager mo4121d() {
        return (InputMethodManager) this.f2208a.getValue();
    }
}
