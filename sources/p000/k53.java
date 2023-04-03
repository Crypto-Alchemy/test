package p000;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: k53 */
/* compiled from: JsonPOJOBuilder */
public @interface k53 {

    /* renamed from: k53$a */
    /* compiled from: JsonPOJOBuilder */
    public static class C2643a {

        /* renamed from: a */
        public final String f13977a;

        /* renamed from: b */
        public final String f13978b;

        public C2643a(k53 k53) {
            this(k53.buildMethodName(), k53.withPrefix());
        }

        public C2643a(String str, String str2) {
            this.f13977a = str;
            this.f13978b = str2;
        }
    }

    String buildMethodName() default "build";

    String withPrefix() default "with";
}
