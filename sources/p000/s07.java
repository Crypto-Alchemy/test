package p000;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;

/* renamed from: s07 */
/* compiled from: TypeIdResolverBase */
public abstract class s07 implements r07 {

    /* renamed from: a */
    public final TypeFactory f17424a;

    /* renamed from: b */
    public final JavaType f17425b;

    public s07(JavaType javaType, TypeFactory typeFactory) {
        this.f17425b = javaType;
        this.f17424a = typeFactory;
    }

    /* renamed from: c */
    public void mo25314c(JavaType javaType) {
    }

    /* renamed from: f */
    public String mo25315f() {
        return mo25087e((Object) null, this.f17425b.getRawClass());
    }
}
