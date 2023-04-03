package androidx.compose.p004ui.text.font;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"Lkotlin/Function1;", "Lt27;", "Lr37;", "onAsyncCompletion", "invoke", "(Lrc2;)Lt27;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.text.font.FontFamilyResolverImpl$resolve$result$1 */
/* compiled from: FontFamilyResolver.kt */
public final class FontFamilyResolverImpl$resolve$result$1 extends Lambda implements rc2<rc2<? super t27, ? extends r37>, t27> {
    public final /* synthetic */ s27 $typefaceRequest;
    public final /* synthetic */ FontFamilyResolverImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FontFamilyResolverImpl$resolve$result$1(FontFamilyResolverImpl fontFamilyResolverImpl, s27 s27) {
        super(1);
        this.this$0 = fontFamilyResolverImpl;
        this.$typefaceRequest = s27;
    }

    public final t27 invoke(rc2<? super t27, r37> rc2) {
        vx2.m53591g(rc2, "onAsyncCompletion");
        t27 a = this.this$0.f2198d.mo4112a(this.$typefaceRequest, this.this$0.mo4108f(), rc2, this.this$0.f2200f);
        if (a != null || (a = this.this$0.f2199e.mo19451a(this.$typefaceRequest, this.this$0.mo4108f(), rc2, this.this$0.f2200f)) != null) {
            return a;
        }
        throw new IllegalStateException("Could not load font");
    }
}
