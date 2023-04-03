package androidx.compose.p004ui.text.input;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@v21(mo48631c = "androidx.compose.ui.text.input.TextInputServiceAndroid", mo48632f = "TextInputServiceAndroid.android.kt", mo48633l = {204}, mo48634m = "textInputCommandEventLoop")
/* renamed from: androidx.compose.ui.text.input.TextInputServiceAndroid$textInputCommandEventLoop$1 */
/* compiled from: TextInputServiceAndroid.android.kt */
public final class TextInputServiceAndroid$textInputCommandEventLoop$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ TextInputServiceAndroid this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextInputServiceAndroid$textInputCommandEventLoop$1(TextInputServiceAndroid textInputServiceAndroid, ns0<? super TextInputServiceAndroid$textInputCommandEventLoop$1> ns0) {
        super(ns0);
        this.this$0 = textInputServiceAndroid;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo4135k(this);
    }
}
