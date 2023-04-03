package com.fasterxml.jackson.databind.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p000.ot0;
import p000.y63;

@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.TYPE, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonSerialize {

    @Deprecated
    public enum Inclusion {
        ALWAYS,
        NON_NULL,
        NON_DEFAULT,
        NON_EMPTY,
        DEFAULT_INCLUSION
    }

    public enum Typing {
        DYNAMIC,
        STATIC,
        DEFAULT_TYPING
    }

    /* renamed from: as */
    Class<?> mo15038as() default Void.class;

    Class<?> contentAs() default Void.class;

    Class<? extends ot0> contentConverter() default ot0.C2992a.class;

    Class<? extends y63> contentUsing() default y63.C3656a.class;

    Class<? extends ot0> converter() default ot0.C2992a.class;

    @Deprecated
    Inclusion include() default Inclusion.DEFAULT_INCLUSION;

    Class<?> keyAs() default Void.class;

    Class<? extends y63> keyUsing() default y63.C3656a.class;

    Class<? extends y63> nullsUsing() default y63.C3656a.class;

    Typing typing() default Typing.DEFAULT_TYPING;

    Class<? extends y63> using() default y63.C3656a.class;
}
