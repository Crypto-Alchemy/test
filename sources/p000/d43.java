package p000;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ser.VirtualBeanPropertyWriter;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: d43 */
/* compiled from: JsonAppend */
public @interface d43 {

    /* renamed from: d43$a */
    /* compiled from: JsonAppend */
    public @interface C2133a {
        JsonInclude.Include include() default JsonInclude.Include.NON_NULL;

        String propName() default "";

        String propNamespace() default "";

        boolean required() default false;

        String value();
    }

    /* renamed from: d43$b */
    /* compiled from: JsonAppend */
    public @interface C2134b {
        JsonInclude.Include include() default JsonInclude.Include.NON_NULL;

        String name() default "";

        String namespace() default "";

        boolean required() default false;

        Class<?> type() default Object.class;

        Class<? extends VirtualBeanPropertyWriter> value();
    }

    C2133a[] attrs() default {};

    boolean prepend() default false;

    C2134b[] props() default {};
}
