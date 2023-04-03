package p000;

import com.fasterxml.jackson.annotation.OptBoolean;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: e53 */
/* compiled from: JsonMerge */
public @interface e53 {
    OptBoolean value() default OptBoolean.TRUE;
}
