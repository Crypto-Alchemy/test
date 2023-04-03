package p000;

import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: m73 */
/* compiled from: JsonValueInstantiator */
public @interface m73 {
    Class<? extends ValueInstantiator> value();
}
