package p000;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p000.ha3;
import p000.o43;
import p000.ot0;

@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.TYPE, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: n43 */
/* compiled from: JsonDeserialize */
public @interface n43 {
    /* renamed from: as */
    Class<?> mo23491as() default Void.class;

    Class<?> builder() default Void.class;

    Class<?> contentAs() default Void.class;

    Class<? extends ot0> contentConverter() default ot0.C2992a.class;

    Class<? extends o43> contentUsing() default o43.C2939a.class;

    Class<? extends ot0> converter() default ot0.C2992a.class;

    Class<?> keyAs() default Void.class;

    Class<? extends ha3> keyUsing() default ha3.C2459a.class;

    Class<? extends o43> using() default o43.C2939a.class;
}
