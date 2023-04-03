package p000;

import android.graphics.Typeface;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.t27;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011JB\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0006H\u0016R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u0012"}, mo44877d2 = {"Lep4;", "", "Ls27;", "typefaceRequest", "Lfp4;", "platformFontLoader", "Lkotlin/Function1;", "Lt27$b;", "Lr37;", "onAsyncCompletion", "createDefaultTypeface", "Lt27;", "a", "Ltp4;", "Ltp4;", "platformTypefaceResolver", "<init>", "()V", "ui-text_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: ep4 */
/* compiled from: PlatformFontFamilyTypefaceAdapter.android.kt */
public final class ep4 {

    /* renamed from: a */
    public final tp4 f11300a = wp4.m29683a();

    /* renamed from: a */
    public t27 mo19451a(s27 s27, fp4 fp4, rc2<? super t27.C3322b, r37> rc2, rc2<? super s27, ? extends Object> rc22) {
        boolean z;
        Typeface typeface;
        vx2.m53591g(s27, "typefaceRequest");
        vx2.m53591g(fp4, "platformFontLoader");
        vx2.m53591g(rc2, "onAsyncCompletion");
        vx2.m53591g(rc22, "createDefaultTypeface");
        z62 c = s27.mo25615c();
        if (c == null) {
            z = true;
        } else {
            z = c instanceof f81;
        }
        if (z) {
            typeface = this.f11300a.mo26526a(s27.mo25619f(), s27.mo25616d());
        } else if (c instanceof jf2) {
            typeface = this.f11300a.mo26527b((jf2) s27.mo25615c(), s27.mo25619f(), s27.mo25616d());
        } else if (!(c instanceof aj3)) {
            return null;
        } else {
            f27 e = ((aj3) s27.mo25615c()).mo320e();
            vx2.m53589e(e, "null cannot be cast to non-null type androidx.compose.ui.text.platform.AndroidTypeface");
            typeface = ((C3147qj) e).mo25117a(s27.mo25619f(), s27.mo25616d(), s27.mo25617e());
        }
        return new t27.C3322b(typeface, false, 2, (DefaultConstructorMarker) null);
    }
}
