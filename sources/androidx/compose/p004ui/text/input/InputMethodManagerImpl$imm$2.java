package androidx.compose.p004ui.text.input;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44876d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo44877d2 = {"<anonymous>", "Landroid/view/inputmethod/InputMethodManager;", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* renamed from: androidx.compose.ui.text.input.InputMethodManagerImpl$imm$2 */
/* compiled from: InputMethodManager.kt */
public final class InputMethodManagerImpl$imm$2 extends Lambda implements pc2<InputMethodManager> {
    public final /* synthetic */ Context $context;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InputMethodManagerImpl$imm$2(Context context) {
        super(0);
        this.$context = context;
    }

    public final InputMethodManager invoke() {
        Object systemService = this.$context.getSystemService("input_method");
        vx2.m53589e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        return (InputMethodManager) systemService;
    }
}
