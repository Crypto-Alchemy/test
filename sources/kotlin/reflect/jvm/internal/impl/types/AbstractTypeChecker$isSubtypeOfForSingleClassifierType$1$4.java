package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;

/* compiled from: AbstractTypeChecker.kt */
public final class AbstractTypeChecker$isSubtypeOfForSingleClassifierType$1$4 extends Lambda implements rc2<TypeCheckerState.C7718a, r37> {
    public final /* synthetic */ TypeCheckerState $state;
    public final /* synthetic */ f36 $superType;
    public final /* synthetic */ List<f36> $supertypesWithSameConstructor;
    public final /* synthetic */ s17 $this_with;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractTypeChecker$isSubtypeOfForSingleClassifierType$1$4(List<? extends f36> list, TypeCheckerState typeCheckerState, s17 s17, f36 f36) {
        super(1);
        this.$supertypesWithSameConstructor = list;
        this.$state = typeCheckerState;
        this.$this_with = s17;
        this.$superType = f36;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((TypeCheckerState.C7718a) obj);
        return r37.f33317a;
    }

    public final void invoke(TypeCheckerState.C7718a aVar) {
        vx2.m53591g(aVar, "$this$runForkingPoint");
        for (final f36 next : this.$supertypesWithSameConstructor) {
            final TypeCheckerState typeCheckerState = this.$state;
            final s17 s17 = this.$this_with;
            final f36 f36 = this.$superType;
            aVar.mo55332a(new pc2<Boolean>() {
                public final Boolean invoke() {
                    return Boolean.valueOf(AbstractTypeChecker.f40248a.mo55269q(typeCheckerState, s17.mo51073a0(next), f36));
                }
            });
        }
    }
}
