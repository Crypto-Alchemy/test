package androidx.compose.p004ui.text.font;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@v21(mo48631c = "androidx.compose.ui.text.font.AsyncTypefaceCache", mo48632f = "FontListFontFamilyTypefaceAdapter.kt", mo48633l = {399}, mo48634m = "runCached")
/* renamed from: androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1 */
/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
public final class AsyncTypefaceCache$runCached$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AsyncTypefaceCache this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AsyncTypefaceCache$runCached$1(AsyncTypefaceCache asyncTypefaceCache, ns0<? super AsyncTypefaceCache$runCached$1> ns0) {
        super(ns0);
        this.this$0 = asyncTypefaceCache;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo4099g((y62) null, (fp4) null, false, (rc2<? super ns0<Object>, ? extends Object>) null, this);
    }
}
