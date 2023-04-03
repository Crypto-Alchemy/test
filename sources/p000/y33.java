package p000;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Documented
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: y33 */
/* compiled from: Json */
public @interface y33 {
    boolean ignore() default false;

    String name() default "\u0000";
}
