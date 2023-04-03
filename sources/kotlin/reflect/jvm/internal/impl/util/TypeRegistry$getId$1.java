package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.Lambda;

/* compiled from: ArrayMapOwner.kt */
public final class TypeRegistry$getId$1 extends Lambda implements rc2<q83<? extends K>, Integer> {
    public final /* synthetic */ TypeRegistry<K, V> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TypeRegistry$getId$1(TypeRegistry<K, V> typeRegistry) {
        super(1);
        this.this$0 = typeRegistry;
    }

    public final Integer invoke(q83<? extends K> q83) {
        vx2.m53591g(q83, "it");
        return Integer.valueOf(this.this$0.f40321b.getAndIncrement());
    }
}
