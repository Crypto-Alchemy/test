package p000;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: f53 */
/* compiled from: JsonNaming */
public @interface f53 {
    Class<? extends PropertyNamingStrategy> value() default PropertyNamingStrategy.class;
}
