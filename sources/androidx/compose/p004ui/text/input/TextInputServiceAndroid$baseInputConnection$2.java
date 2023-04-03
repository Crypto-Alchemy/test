package androidx.compose.p004ui.text.input;

import android.view.inputmethod.BaseInputConnection;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44876d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo44877d2 = {"<anonymous>", "Landroid/view/inputmethod/BaseInputConnection;", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* renamed from: androidx.compose.ui.text.input.TextInputServiceAndroid$baseInputConnection$2 */
/* compiled from: TextInputServiceAndroid.android.kt */
public final class TextInputServiceAndroid$baseInputConnection$2 extends Lambda implements pc2<BaseInputConnection> {
    public final /* synthetic */ TextInputServiceAndroid this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextInputServiceAndroid$baseInputConnection$2(TextInputServiceAndroid textInputServiceAndroid) {
        super(0);
        this.this$0 = textInputServiceAndroid;
    }

    public final BaseInputConnection invoke() {
        return new BaseInputConnection(this.this$0.mo4131g(), false);
    }
}
