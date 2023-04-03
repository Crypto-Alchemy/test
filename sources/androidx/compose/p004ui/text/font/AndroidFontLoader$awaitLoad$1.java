package androidx.compose.p004ui.text.font;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@v21(mo48631c = "androidx.compose.ui.text.font.AndroidFontLoader", mo48632f = "AndroidFontLoader.android.kt", mo48633l = {61, 62}, mo48634m = "awaitLoad")
/* renamed from: androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1 */
/* compiled from: AndroidFontLoader.android.kt */
public final class AndroidFontLoader$awaitLoad$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AndroidFontLoader this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidFontLoader$awaitLoad$1(AndroidFontLoader androidFontLoader, ns0<? super AndroidFontLoader$awaitLoad$1> ns0) {
        super(ns0);
        this.this$0 = androidFontLoader;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo4085a((y62) null, this);
    }
}
