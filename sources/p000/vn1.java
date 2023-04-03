package p000;

import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a-\u0010\u0007\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a@\u0010\r\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00000\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\"\u0014\u0010\u0010\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000f\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, mo44877d2 = {"", "key1", "Lkotlin/Function1;", "Lxh1;", "Lwh1;", "effect", "Lr37;", "a", "(Ljava/lang/Object;Lrc2;Lnn0;I)V", "Lkotlin/Function2;", "Lhu0;", "Lns0;", "block", "b", "(Ljava/lang/Object;Lfd2;Lnn0;I)V", "Lxh1;", "InternalDisposableEffectScope", "runtime_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: vn1 */
/* compiled from: Effects.kt */
public final class vn1 {

    /* renamed from: a */
    public static final xh1 f18856a = new xh1();

    /* renamed from: a */
    public static final void m28921a(Object obj, rc2<? super xh1, ? extends wh1> rc2, nn0 nn0, int i) {
        vx2.m53591g(rc2, "effect");
        nn0.mo2953i(-1371986847);
        if (ComposerKt.m1997O()) {
            ComposerKt.m2008Z(-1371986847, i, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:150)");
        }
        nn0.mo2953i(1157296644);
        boolean p = nn0.mo2971p(obj);
        Object j = nn0.mo2956j();
        if (p || j == nn0.f15626a.mo23753a()) {
            nn0.mo2941e(new vh1(rc2));
        }
        nn0.mo2968o();
        if (ComposerKt.m1997O()) {
            ComposerKt.m2007Y();
        }
        nn0.mo2968o();
    }

    /* renamed from: b */
    public static final void m28922b(Object obj, fd2<? super hu0, ? super ns0<? super r37>, ? extends Object> fd2, nn0 nn0, int i) {
        vx2.m53591g(fd2, "block");
        nn0.mo2953i(1179185413);
        if (ComposerKt.m1997O()) {
            ComposerKt.m2008Z(1179185413, i, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:331)");
        }
        CoroutineContext d = nn0.mo2938d();
        nn0.mo2953i(1157296644);
        boolean p = nn0.mo2971p(obj);
        Object j = nn0.mo2956j();
        if (p || j == nn0.f15626a.mo23753a()) {
            nn0.mo2941e(new ge3(d, fd2));
        }
        nn0.mo2968o();
        if (ComposerKt.m1997O()) {
            ComposerKt.m2007Y();
        }
        nn0.mo2968o();
    }
}
