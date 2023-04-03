package p000;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: h73 */
/* compiled from: JsonUnwrapped */
public @interface h73 {
    boolean enabled() default true;

    String prefix() default "";

    String suffix() default "";
}
