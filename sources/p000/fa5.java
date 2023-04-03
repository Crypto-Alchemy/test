package p000;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import p000.ka5;
import p000.m13;

/* renamed from: fa5 */
/* compiled from: ReflectJavaMethod.kt */
public final class fa5 extends ea5 implements m13 {

    /* renamed from: a */
    public final Method f37741a;

    public fa5(Method method) {
        vx2.m53591g(method, "member");
        this.f37741a = method;
    }

    /* renamed from: L */
    public boolean mo51623L() {
        return m13.C7855a.m64041a(this);
    }

    /* renamed from: U */
    public Method mo50848S() {
        return this.f37741a;
    }

    /* renamed from: V */
    public ka5 getReturnType() {
        ka5.C7340a aVar = ka5.f38877a;
        Type genericReturnType = mo50848S().getGenericReturnType();
        vx2.m53590f(genericReturnType, "member.genericReturnType");
        return aVar.mo52886a(genericReturnType);
    }

    /* renamed from: f */
    public List<p23> mo51626f() {
        Type[] genericParameterTypes = mo50848S().getGenericParameterTypes();
        vx2.m53590f(genericParameterTypes, "member.genericParameterTypes");
        Annotation[][] parameterAnnotations = mo50848S().getParameterAnnotations();
        vx2.m53590f(parameterAnnotations, "member.parameterAnnotations");
        return mo51418T(genericParameterTypes, parameterAnnotations, mo50848S().isVarArgs());
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

    /* renamed from: o */
    public i03 mo51629o() {
        Object defaultValue = mo50848S().getDefaultValue();
        if (defaultValue != null) {
            return p95.f44016b.mo65260a(defaultValue, (r24) null);
        }
        return null;
    }
}
