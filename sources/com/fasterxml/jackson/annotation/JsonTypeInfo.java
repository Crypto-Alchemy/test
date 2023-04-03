package com.fasterxml.jackson.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonTypeInfo {

    /* renamed from: com.fasterxml.jackson.annotation.JsonTypeInfo$As */
    public enum C1971As {
        PROPERTY,
        WRAPPER_OBJECT,
        WRAPPER_ARRAY,
        EXTERNAL_PROPERTY,
        EXISTING_PROPERTY
    }

    /* renamed from: com.fasterxml.jackson.annotation.JsonTypeInfo$Id */
    public enum C1972Id {
        NONE((String) null),
        CLASS("@class"),
        MINIMAL_CLASS("@c"),
        NAME("@type"),
        DEDUCTION((String) null),
        CUSTOM((String) null);
        
        private final String _defaultPropertyName;

        /* access modifiers changed from: public */
        C1972Id(String str) {
            this._defaultPropertyName = str;
        }

        public String getDefaultPropertyName() {
            return this._defaultPropertyName;
        }
    }

    @Deprecated
    /* renamed from: com.fasterxml.jackson.annotation.JsonTypeInfo$a */
    public static abstract class C1973a {
    }

    Class<?> defaultImpl() default JsonTypeInfo.class;

    C1971As include() default C1971As.PROPERTY;

    String property() default "";

    C1972Id use();

    boolean visible() default false;
}
