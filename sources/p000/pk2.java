package p000;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: pk2 */
/* compiled from: HTTP */
public @interface pk2 {
    boolean hasBody() default false;

    String method();

    String path() default "";
}
