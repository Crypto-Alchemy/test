package p000;

import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import java.beans.ConstructorProperties;
import java.beans.Transient;

/* renamed from: f03 */
/* compiled from: Java7SupportImpl */
public class f03 extends e03 {

    /* renamed from: b */
    public final Class<?> f11470b = ConstructorProperties.class;

    public f03() {
        Class<Transient> cls = Transient.class;
    }

    /* renamed from: a */
    public PropertyName mo19026a(AnnotatedParameter annotatedParameter) {
        ConstructorProperties annotation;
        AnnotatedWithParams owner = annotatedParameter.getOwner();
        if (owner == null || (annotation = owner.getAnnotation(ConstructorProperties.class)) == null) {
            return null;
        }
        String[] value = annotation.value();
        int index = annotatedParameter.getIndex();
        if (index < value.length) {
            return PropertyName.construct(value[index]);
        }
        return null;
    }

    /* renamed from: b */
    public Boolean mo19027b(C2911nl nlVar) {
        Transient annotation = nlVar.getAnnotation(Transient.class);
        if (annotation != null) {
            return Boolean.valueOf(annotation.value());
        }
        return null;
    }

    /* renamed from: c */
    public Boolean mo19028c(C2911nl nlVar) {
        if (nlVar.getAnnotation(ConstructorProperties.class) != null) {
            return Boolean.TRUE;
        }
        return null;
    }
}
