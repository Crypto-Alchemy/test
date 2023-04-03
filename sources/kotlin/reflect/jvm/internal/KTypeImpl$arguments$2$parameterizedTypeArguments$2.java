package kotlin.reflect.jvm.internal;

import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;

@Metadata(mo44876d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, mo44877d2 = {"<anonymous>", "", "Ljava/lang/reflect/Type;", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: KTypeImpl.kt */
public final class KTypeImpl$arguments$2$parameterizedTypeArguments$2 extends Lambda implements pc2<List<? extends Type>> {
    public final /* synthetic */ KTypeImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KTypeImpl$arguments$2$parameterizedTypeArguments$2(KTypeImpl kTypeImpl) {
        super(0);
        this.this$0 = kTypeImpl;
    }

    public final List<Type> invoke() {
        Type g = this.this$0.mo46045g();
        vx2.m53588d(g);
        return ReflectClassUtilKt.m60596d(g);
    }
}
