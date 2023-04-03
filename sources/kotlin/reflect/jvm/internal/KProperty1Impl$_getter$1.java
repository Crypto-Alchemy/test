package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KProperty1Impl;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\"\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001 \u0003*\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00020\u0002\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001 \u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"T", "V", "Lkotlin/reflect/jvm/internal/KProperty1Impl$a;", "kotlin.jvm.PlatformType", "invoke", "()Lkotlin/reflect/jvm/internal/KProperty1Impl$a;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: KProperty1Impl.kt */
public final class KProperty1Impl$_getter$1 extends Lambda implements pc2<KProperty1Impl.C7369a<T, ? extends V>> {
    public final /* synthetic */ KProperty1Impl<T, V> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KProperty1Impl$_getter$1(KProperty1Impl<T, ? extends V> kProperty1Impl) {
        super(0);
        this.this$0 = kProperty1Impl;
    }

    public final KProperty1Impl.C7369a<T, V> invoke() {
        return new KProperty1Impl.C7369a<>(this.this$0);
    }
}
