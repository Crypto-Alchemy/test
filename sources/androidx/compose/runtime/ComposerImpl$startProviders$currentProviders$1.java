package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00030\u0000j\u0002`\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, mo44877d2 = {"Leo4;", "Ldo0;", "", "Lr86;", "Landroidx/compose/runtime/CompositionLocalMap;", "invoke", "(Lnn0;I)Leo4;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: Composer.kt */
public final class ComposerImpl$startProviders$currentProviders$1 extends Lambda implements fd2<nn0, Integer, eo4<do0<Object>, ? extends r86<? extends Object>>> {
    public final /* synthetic */ eo4<do0<Object>, r86<Object>> $parentScope;
    public final /* synthetic */ jy4<?>[] $values;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposerImpl$startProviders$currentProviders$1(jy4<?>[] jy4Arr, eo4<do0<Object>, ? extends r86<? extends Object>> eo4) {
        super(2);
        this.$values = jy4Arr;
        this.$parentScope = eo4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((nn0) obj, ((Number) obj2).intValue());
    }

    public final eo4<do0<Object>, r86<Object>> invoke(nn0 nn0, int i) {
        nn0.mo2953i(935231726);
        if (ComposerKt.m1997O()) {
            ComposerKt.m2008Z(935231726, i, -1, "androidx.compose.runtime.ComposerImpl.startProviders.<anonymous> (Composer.kt:1893)");
        }
        eo4<do0<Object>, r86<Object>> d = ComposerKt.m2033y(this.$values, this.$parentScope, nn0, 8);
        if (ComposerKt.m1997O()) {
            ComposerKt.m2007Y();
        }
        nn0.mo2968o();
        return d;
    }
}
