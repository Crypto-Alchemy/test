package p000;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: c73 */
/* compiled from: JsonSubTypes */
public @interface c73 {

    /* renamed from: c73$a */
    /* compiled from: JsonSubTypes */
    public @interface C1668a {
        String name() default "";

        String[] names() default {};

        Class<?> value();
    }

    C1668a[] value();
}
