package p000;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: z95 */
/* compiled from: ReflectJavaConstructor.kt */
public final class z95 extends ea5 implements y03 {

    /* renamed from: a */
    public final Constructor<?> f46342a;

    public z95(Constructor<?> constructor) {
        vx2.m53591g(constructor, "member");
        this.f46342a = constructor;
    }

    /* renamed from: U */
    public Constructor<?> mo50848S() {
        return this.f46342a;
    }

    /* renamed from: f */
    public List<p23> mo66995f() {
        boolean z;
        Type[] genericParameterTypes = mo50848S().getGenericParameterTypes();
        vx2.m53590f(genericParameterTypes, "types");
        if (genericParameterTypes.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return ck0.m33062j();
        }
        Class<?> declaringClass = mo50848S().getDeclaringClass();
        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
            genericParameterTypes = (Type[]) C6706xq.m54501o(genericParameterTypes, 1, genericParameterTypes.length);
        }
        Annotation[][] parameterAnnotations = mo50848S().getParameterAnnotations();
        if (parameterAnnotations.length >= genericParameterTypes.length) {
            if (parameterAnnotations.length > genericParameterTypes.length) {
                vx2.m53590f(parameterAnnotations, "annotations");
                parameterAnnotations = (Annotation[][]) C6706xq.m54501o(parameterAnnotations, parameterAnnotations.length - genericParameterTypes.length, parameterAnnotations.length);
            }
            vx2.m53590f(genericParameterTypes, "realTypes");
            vx2.m53590f(parameterAnnotations, "realAnnotations");
            return mo51418T(genericParameterTypes, parameterAnnotations, mo50848S().isVarArgs());
        }
        throw new IllegalStateException("Illegal generic signature: " + mo50848S());
    }

    public List<la5> getTypeParameters() {
        TypeVariable[] typeParameters = mo50848S().getTypeParameters();
        vx2.m53590f(typeParameters, "member.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable la5 : typeParameters) {
            arrayList.add(new la5(la5));
        }
        return arrayList;
    }
}
