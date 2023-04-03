package androidx.compose.runtime;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: CompositionLocal.kt */
public final class CompositionLocalKt$CompositionLocalProvider$1 extends Lambda implements fd2<nn0, Integer, r37> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ fd2<nn0, Integer, r37> $content;
    public final /* synthetic */ jy4<?>[] $values;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CompositionLocalKt$CompositionLocalProvider$1(jy4<?>[] jy4Arr, fd2<? super nn0, ? super Integer, r37> fd2, int i) {
        super(2);
        this.$values = jy4Arr;
        this.$content = fd2;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((nn0) obj, ((Number) obj2).intValue());
        return r37.f33317a;
    }

    public final void invoke(nn0 nn0, int i) {
        jy4<?>[] jy4Arr = this.$values;
        CompositionLocalKt.m2035a((jy4[]) Arrays.copyOf(jy4Arr, jy4Arr.length), this.$content, nn0, this.$$changed | 1);
    }
}
