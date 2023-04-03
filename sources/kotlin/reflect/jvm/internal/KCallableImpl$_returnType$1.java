package kotlin.reflect.jvm.internal;

import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44876d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0003 \u0001H\n¢\u0006\u0002\b\u0004"}, mo44877d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/KTypeImpl;", "kotlin.jvm.PlatformType", "R", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: KCallableImpl.kt */
public final class KCallableImpl$_returnType$1 extends Lambda implements pc2<KTypeImpl> {
    public final /* synthetic */ KCallableImpl<R> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KCallableImpl$_returnType$1(KCallableImpl<? extends R> kCallableImpl) {
        super(0);
        this.this$0 = kCallableImpl;
    }

    public final KTypeImpl invoke() {
        xc3 returnType = this.this$0.mo52984x().getReturnType();
        vx2.m53588d(returnType);
        final KCallableImpl<R> kCallableImpl = this.this$0;
        return new KTypeImpl(returnType, new pc2<Type>() {
            public final Type invoke() {
                Type k = kCallableImpl.mo52980s();
                return k == null ? kCallableImpl.mo52981t().getReturnType() : k;
            }
        });
    }
}
