package androidx.compose.p004ui.text.font;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2", mo48632f = "FontListFontFamilyTypefaceAdapter.kt", mo48633l = {305}, mo48634m = "invokeSuspend")
/* renamed from: androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2 */
/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
public final class AsyncFontListLoader$loadWithTimeoutOrNull$2 extends SuspendLambda implements fd2<hu0, ns0<? super Object>, Object> {
    public final /* synthetic */ y62 $this_loadWithTimeoutOrNull;
    public int label;
    public final /* synthetic */ AsyncFontListLoader this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AsyncFontListLoader$loadWithTimeoutOrNull$2(AsyncFontListLoader asyncFontListLoader, y62 y62, ns0<? super AsyncFontListLoader$loadWithTimeoutOrNull$2> ns0) {
        super(2, ns0);
        this.this$0 = asyncFontListLoader;
        this.$this_loadWithTimeoutOrNull = y62;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new AsyncFontListLoader$loadWithTimeoutOrNull$2(this.this$0, this.$this_loadWithTimeoutOrNull, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<Object> ns0) {
        return ((AsyncFontListLoader$loadWithTimeoutOrNull$2) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            fp4 d2 = this.this$0.f2185k;
            y62 y62 = this.$this_loadWithTimeoutOrNull;
            this.label = 1;
            obj = d2.mo4085a(y62, this);
            if (obj == d) {
                return d;
            }
        } else if (i == 1) {
            hg5.m45199b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
