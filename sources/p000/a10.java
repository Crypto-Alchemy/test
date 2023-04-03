package p000;

import androidx.compose.p004ui.focus.FocusModifier;
import kotlin.Metadata;
import p000.j62;
import p000.z00;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a?\u0010\u0007\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\t"}, mo44877d2 = {"T", "Landroidx/compose/ui/focus/FocusModifier;", "Lj62;", "direction", "Lkotlin/Function1;", "Lz00$a;", "block", "a", "(Landroidx/compose/ui/focus/FocusModifier;ILrc2;)Ljava/lang/Object;", "ui_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: a10 */
/* compiled from: BeyondBoundsLayout.kt */
public final class a10 {
    /* renamed from: a */
    public static final <T> T m7a(FocusModifier focusModifier, int i, rc2<? super z00.C3703a, ? extends T> rc2) {
        int i2;
        vx2.m53591g(focusModifier, "$this$searchBeyondBounds");
        vx2.m53591g(rc2, "block");
        z00 r = focusModifier.mo3224r();
        if (r == null) {
            return null;
        }
        j62.C2583a aVar = j62.f13517b;
        if (j62.m19989l(i, aVar.mo21748h())) {
            i2 = z00.C3704b.f20413a.mo28281a();
        } else if (j62.m19989l(i, aVar.mo21741a())) {
            i2 = z00.C3704b.f20413a.mo28284d();
        } else if (j62.m19989l(i, aVar.mo21744d())) {
            i2 = z00.C3704b.f20413a.mo28285e();
        } else if (j62.m19989l(i, aVar.mo21747g())) {
            i2 = z00.C3704b.f20413a.mo28286f();
        } else if (j62.m19989l(i, aVar.mo21745e())) {
            i2 = z00.C3704b.f20413a.mo28282b();
        } else if (j62.m19989l(i, aVar.mo21746f())) {
            i2 = z00.C3704b.f20413a.mo28283c();
        } else {
            throw new IllegalStateException("Unsupported direction for beyond bounds layout".toString());
        }
        return r.mo28279a(i2, rc2);
    }
}
