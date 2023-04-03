package androidx.compose.p004ui.text.font;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@v21(mo48631c = "androidx.compose.ui.text.font.AsyncFontListLoader", mo48632f = "FontListFontFamilyTypefaceAdapter.kt", mo48633l = {304}, mo48634m = "loadWithTimeoutOrNull$ui_text_release")
/* renamed from: androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1 */
/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
public final class AsyncFontListLoader$loadWithTimeoutOrNull$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AsyncFontListLoader this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AsyncFontListLoader$loadWithTimeoutOrNull$1(AsyncFontListLoader asyncFontListLoader, ns0<? super AsyncFontListLoader$loadWithTimeoutOrNull$1> ns0) {
        super(ns0);
        this.this$0 = asyncFontListLoader;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo4092h((y62) null, this);
    }
}
