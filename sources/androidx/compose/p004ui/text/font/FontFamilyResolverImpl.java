package androidx.compose.p004ui.text.font;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.z62;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0015\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001a\u0012\b\b\u0002\u0010!\u001a\u00020\u001e\u0012\b\b\u0002\u0010%\u001a\u00020\"¢\u0006\u0004\b)\u0010*J=\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002R\u001a\u0010\u0015\u001a\u00020\u00118\u0000X\u0004¢\u0006\f\n\u0004\b\f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R \u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0&8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010'\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006+"}, mo44877d2 = {"Landroidx/compose/ui/text/font/FontFamilyResolverImpl;", "Lz62$b;", "Lz62;", "fontFamily", "Lr72;", "fontWeight", "Ln72;", "fontStyle", "Lo72;", "fontSynthesis", "Lr86;", "", "a", "(Lz62;Lr72;II)Lr86;", "Ls27;", "typefaceRequest", "g", "Lfp4;", "Lfp4;", "f", "()Lfp4;", "platformFontLoader", "Lpp4;", "b", "Lpp4;", "platformResolveInterceptor", "Landroidx/compose/ui/text/font/TypefaceRequestCache;", "c", "Landroidx/compose/ui/text/font/TypefaceRequestCache;", "typefaceRequestCache", "Landroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter;", "d", "Landroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter;", "fontListFontFamilyTypefaceAdapter", "Lep4;", "e", "Lep4;", "platformFamilyTypefaceAdapter", "Lkotlin/Function1;", "Lrc2;", "createDefaultTypeface", "<init>", "(Lfp4;Lpp4;Landroidx/compose/ui/text/font/TypefaceRequestCache;Landroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter;Lep4;)V", "ui-text_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.text.font.FontFamilyResolverImpl */
/* compiled from: FontFamilyResolver.kt */
public final class FontFamilyResolverImpl implements z62.C3714b {

    /* renamed from: a */
    public final fp4 f2195a;

    /* renamed from: b */
    public final pp4 f2196b;

    /* renamed from: c */
    public final TypefaceRequestCache f2197c;

    /* renamed from: d */
    public final FontListFontFamilyTypefaceAdapter f2198d;

    /* renamed from: e */
    public final ep4 f2199e;

    /* renamed from: f */
    public final rc2<s27, Object> f2200f;

    public FontFamilyResolverImpl(fp4 fp4, pp4 pp4, TypefaceRequestCache typefaceRequestCache, FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter, ep4 ep4) {
        vx2.m53591g(fp4, "platformFontLoader");
        vx2.m53591g(pp4, "platformResolveInterceptor");
        vx2.m53591g(typefaceRequestCache, "typefaceRequestCache");
        vx2.m53591g(fontListFontFamilyTypefaceAdapter, "fontListFontFamilyTypefaceAdapter");
        vx2.m53591g(ep4, "platformFamilyTypefaceAdapter");
        this.f2195a = fp4;
        this.f2196b = pp4;
        this.f2197c = typefaceRequestCache;
        this.f2198d = fontListFontFamilyTypefaceAdapter;
        this.f2199e = ep4;
        this.f2200f = new FontFamilyResolverImpl$createDefaultTypeface$1(this);
    }

    /* renamed from: a */
    public r86<Object> mo4107a(z62 z62, r72 r72, int i, int i2) {
        vx2.m53591g(r72, "fontWeight");
        return mo4109g(new s27(this.f2196b.mo22312b(z62), this.f2196b.mo22314d(r72), this.f2196b.mo22311a(i), this.f2196b.mo22313c(i2), this.f2195a.mo4086b(), (DefaultConstructorMarker) null));
    }

    /* renamed from: f */
    public final fp4 mo4108f() {
        return this.f2195a;
    }

    /* renamed from: g */
    public final r86<Object> mo4109g(s27 s27) {
        return this.f2197c.mo4116c(s27, new FontFamilyResolverImpl$resolve$result$1(this, s27));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FontFamilyResolverImpl(fp4 fp4, pp4 pp4, TypefaceRequestCache typefaceRequestCache, FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter, ep4 ep4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fp4, (i & 2) != 0 ? pp4.f16603a.mo24757a() : pp4, (i & 4) != 0 ? b72.m11137b() : typefaceRequestCache, (i & 8) != 0 ? new FontListFontFamilyTypefaceAdapter(b72.m11136a(), (CoroutineContext) null, 2, (DefaultConstructorMarker) null) : fontListFontFamilyTypefaceAdapter, (i & 16) != 0 ? new ep4() : ep4);
    }
}
