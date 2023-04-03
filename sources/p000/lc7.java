package p000;

import android.content.ClipboardManager;
import android.view.View;
import android.widget.EditText;

/* renamed from: lc7 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class lc7 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ClipboardManager f40599a;

    /* renamed from: d */
    public final /* synthetic */ EditText f40600d;

    /* renamed from: e */
    public final /* synthetic */ ba7 f40601e;

    /* renamed from: g */
    public final /* synthetic */ pc2 f40602g;

    public /* synthetic */ lc7(ClipboardManager clipboardManager, EditText editText, ba7 ba7, pc2 pc2) {
        this.f40599a = clipboardManager;
        this.f40600d = editText;
        this.f40601e = ba7;
        this.f40602g = pc2;
    }

    public final void onClick(View view) {
        tc7.m72267t(this.f40599a, this.f40600d, this.f40601e, this.f40602g, view);
    }
}
