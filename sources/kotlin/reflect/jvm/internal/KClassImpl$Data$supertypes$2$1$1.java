package kotlin.reflect.jvm.internal;

import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44876d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo44877d2 = {"<anonymous>", "Ljava/lang/reflect/Type;", "T", "", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: KClassImpl.kt */
public final class KClassImpl$Data$supertypes$2$1$1 extends Lambda implements pc2<Type> {
    public final /* synthetic */ xc3 $kotlinType;
    public final /* synthetic */ KClassImpl<T>.Data this$0;
    public final /* synthetic */ KClassImpl<T> this$1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KClassImpl$Data$supertypes$2$1$1(xc3 xc3, KClassImpl<T>.Data data, KClassImpl<T> kClassImpl) {
        super(0);
        this.$kotlinType = xc3;
        this.this$0 = data;
        this.this$1 = kClassImpl;
    }

    public final Type invoke() {
        eg0 d = this.$kotlinType.mo51134H0().mo51180d();
        if (d instanceof if0) {
            Class<?> p = y67.m74286p((if0) d);
            if (p == null) {
                throw new KotlinReflectionInternalError("Unsupported superclass of " + this.this$0 + ": " + d);
            } else if (vx2.m53586b(this.this$1.mo41920k().getSuperclass(), p)) {
                Type genericSuperclass = this.this$1.mo41920k().getGenericSuperclass();
                vx2.m53590f(genericSuperclass, "{\n                      …ass\n                    }");
                return genericSuperclass;
            } else {
                Class[] interfaces = this.this$1.mo41920k().getInterfaces();
                vx2.m53590f(interfaces, "jClass.interfaces");
                int Q = ArraysKt___ArraysKt.m47265Q(interfaces, p);
                if (Q >= 0) {
                    Type type = this.this$1.mo41920k().getGenericInterfaces()[Q];
                    vx2.m53590f(type, "{\n                      …ex]\n                    }");
                    return type;
                }
                throw new KotlinReflectionInternalError("No superclass of " + this.this$0 + " in Java reflection for " + d);
            }
        } else {
            throw new KotlinReflectionInternalError("Supertype not a class: " + d);
        }
    }
}
