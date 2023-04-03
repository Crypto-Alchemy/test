package p000;

import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator;
import p000.bd3;

/* renamed from: ag0 */
/* compiled from: ClassicTypeCheckerState.kt */
public final class ag0 {
    /* renamed from: a */
    public static final TypeCheckerState m55487a(boolean z, boolean z2, bg0 bg0, KotlinTypePreparator kotlinTypePreparator, bd3 bd3) {
        vx2.m53591g(bg0, "typeSystemContext");
        vx2.m53591g(kotlinTypePreparator, "kotlinTypePreparator");
        vx2.m53591g(bd3, "kotlinTypeRefiner");
        return new TypeCheckerState(z, z2, true, bg0, kotlinTypePreparator, bd3);
    }

    /* renamed from: b */
    public static /* synthetic */ TypeCheckerState m55488b(boolean z, boolean z2, bg0 bg0, KotlinTypePreparator kotlinTypePreparator, bd3 bd3, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        if ((i & 4) != 0) {
            bg0 = d26.f37237a;
        }
        if ((i & 8) != 0) {
            kotlinTypePreparator = KotlinTypePreparator.C7727a.f40292a;
        }
        if ((i & 16) != 0) {
            bd3 = bd3.C6859a.f36799a;
        }
        return m55487a(z, z2, bg0, kotlinTypePreparator, bd3);
    }
}
