package p000;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: uc4 */
/* compiled from: OPTIONS */
public @interface uc4 {
    String value() default "";
}
