package p000;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: x63 */
/* compiled from: JsonSerializableSchema */
public @interface x63 {
    /* renamed from: id */
    String mo27682id() default "";
}
