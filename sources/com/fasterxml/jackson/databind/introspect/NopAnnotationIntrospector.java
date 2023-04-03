package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.AnnotationIntrospector;

public abstract class NopAnnotationIntrospector extends AnnotationIntrospector {
    public static final NopAnnotationIntrospector instance = new NopAnnotationIntrospector() {
        private static final long serialVersionUID = 1;

        public Version version() {
            return rk4.f17279a;
        }
    };
    private static final long serialVersionUID = 1;

    public Version version() {
        return Version.unknownVersion();
    }
}
