package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* compiled from: ReflectionTypes.kt */
public final class ReflectionTypes$kotlinReflectScope$2 extends Lambda implements pc2<MemberScope> {
    public final /* synthetic */ mx3 $module;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReflectionTypes$kotlinReflectScope$2(mx3 mx3) {
        super(0);
        this.$module = mx3;
    }

    public final MemberScope invoke() {
        return this.$module.mo51532N(C7395c.f39110o).mo53288m();
    }
}
