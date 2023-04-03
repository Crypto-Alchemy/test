package androidx.compose.p004ui.text.font;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Lt27;", "finalResult", "Lr37;", "invoke", "(Lt27;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.text.font.TypefaceRequestCache$runCached$currentTypefaceResult$1 */
/* compiled from: FontFamilyResolver.kt */
public final class TypefaceRequestCache$runCached$currentTypefaceResult$1 extends Lambda implements rc2<t27, r37> {
    public final /* synthetic */ s27 $typefaceRequest;
    public final /* synthetic */ TypefaceRequestCache this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TypefaceRequestCache$runCached$currentTypefaceResult$1(TypefaceRequestCache typefaceRequestCache, s27 s27) {
        super(1);
        this.this$0 = typefaceRequestCache;
        this.$typefaceRequest = s27;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((t27) obj);
        return r37.f33317a;
    }

    public final void invoke(t27 t27) {
        vx2.m53591g(t27, "finalResult");
        ck6 b = this.this$0.mo4115b();
        TypefaceRequestCache typefaceRequestCache = this.this$0;
        s27 s27 = this.$typefaceRequest;
        synchronized (b) {
            if (t27.mo26029b()) {
                typefaceRequestCache.f2207b.mo12116e(s27, t27);
            } else {
                typefaceRequestCache.f2207b.mo12117f(s27);
            }
            r37 r37 = r37.f33317a;
        }
    }
}
