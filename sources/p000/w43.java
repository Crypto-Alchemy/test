package p000;

import com.fasterxml.jackson.annotation.C1974a;
import com.fasterxml.jackson.annotation.C1975b;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: w43 */
/* compiled from: JsonIdentityInfo */
public @interface w43 {
    Class<? extends ObjectIdGenerator<?>> generator();

    String property() default "@id";

    Class<? extends C1974a> resolver() default C1975b.class;

    Class<?> scope() default Object.class;
}
