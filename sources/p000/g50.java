package p000;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.Metadata;
import p000.ju3;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, mo44877d2 = {"Lg50;", "Lju3$a;", "Ljava/lang/reflect/Type;", "type", "", "", "annotations", "Lju3;", "a", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lju3;", "<init>", "()V", "scarlet-message-adapter-builtin"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* renamed from: g50 */
/* compiled from: BuiltInMessageAdapterFactory.kt */
public final class g50 implements ju3.C6128a {
    /* renamed from: a */
    public ju3<?> mo42691a(Type type, Annotation[] annotationArr) {
        vx2.m53591g(type, "type");
        vx2.m53591g(annotationArr, "annotations");
        Class<?> b = y17.m54604b(type);
        if (vx2.m53586b(b, String.class)) {
            return new yn6();
        }
        if (vx2.m53586b(b, byte[].class)) {
            return new i60();
        }
        throw new IllegalArgumentException(vx2.m53598n("Type is not supported by this MessageAdapterFactory: ", type));
    }
}
