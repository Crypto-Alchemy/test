package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.cfg.MapperConfig;
import java.io.Serializable;

public abstract class AccessorNamingStrategy {

    public static abstract class Provider implements Serializable {
        private static final long serialVersionUID = 1;

        public abstract AccessorNamingStrategy forBuilder(MapperConfig<?> mapperConfig, C2021a aVar, n00 n00);

        public abstract AccessorNamingStrategy forPOJO(MapperConfig<?> mapperConfig, C2021a aVar);

        public abstract AccessorNamingStrategy forRecord(MapperConfig<?> mapperConfig, C2021a aVar);
    }

    /* renamed from: a */
    public abstract String mo15890a(AnnotatedMethod annotatedMethod, String str);

    /* renamed from: b */
    public abstract String mo15891b(AnnotatedMethod annotatedMethod, String str);

    /* renamed from: c */
    public abstract String mo15892c(AnnotatedMethod annotatedMethod, String str);

    /* renamed from: d */
    public abstract String mo15893d(AnnotatedField annotatedField, String str);
}
