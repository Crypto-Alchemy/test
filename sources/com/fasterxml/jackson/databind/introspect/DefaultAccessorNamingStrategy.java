package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy;
import java.util.HashSet;
import java.util.Set;
import p000.k53;

public class DefaultAccessorNamingStrategy extends AccessorNamingStrategy {

    /* renamed from: a */
    public final MapperConfig<?> f9990a;

    /* renamed from: b */
    public final C2021a f9991b;

    /* renamed from: c */
    public final C2015a f9992c;

    /* renamed from: d */
    public final boolean f9993d;

    /* renamed from: e */
    public final String f9994e;

    /* renamed from: f */
    public final String f9995f;

    /* renamed from: g */
    public final String f9996g;

    public static class Provider extends AccessorNamingStrategy.Provider {
        private static final long serialVersionUID = 1;
        public final C2015a _baseNameValidator;
        public final String _getterPrefix;
        public final String _isGetterPrefix;
        public final String _setterPrefix;
        public final String _withPrefix;

        public Provider() {
            this("set", "with", "get", "is", (C2015a) null);
        }

        public AccessorNamingStrategy forBuilder(MapperConfig<?> mapperConfig, C2021a aVar, n00 n00) {
            AnnotationIntrospector annotationIntrospector;
            String str;
            k53.C2643a aVar2 = null;
            if (mapperConfig.isAnnotationProcessingEnabled()) {
                annotationIntrospector = mapperConfig.getAnnotationIntrospector();
            } else {
                annotationIntrospector = null;
            }
            if (annotationIntrospector != null) {
                aVar2 = annotationIntrospector.findPOJOBuilderConfig(aVar);
            }
            if (aVar2 == null) {
                str = this._withPrefix;
            } else {
                str = aVar2.f13978b;
            }
            return new DefaultAccessorNamingStrategy(mapperConfig, aVar, str, this._getterPrefix, this._isGetterPrefix, this._baseNameValidator);
        }

        public AccessorNamingStrategy forPOJO(MapperConfig<?> mapperConfig, C2021a aVar) {
            return new DefaultAccessorNamingStrategy(mapperConfig, aVar, this._setterPrefix, this._getterPrefix, this._isGetterPrefix, this._baseNameValidator);
        }

        public AccessorNamingStrategy forRecord(MapperConfig<?> mapperConfig, C2021a aVar) {
            return new C2017c(mapperConfig, aVar);
        }

        public Provider withBaseNameValidator(C2015a aVar) {
            return new Provider(this, aVar);
        }

        public Provider withBuilderPrefix(String str) {
            return new Provider(this, this._setterPrefix, str, this._getterPrefix, this._isGetterPrefix);
        }

        public Provider withFirstCharAcceptance(boolean z, boolean z2) {
            return withBaseNameValidator(C2016b.m14160b(z, z2));
        }

        public Provider withGetterPrefix(String str) {
            return new Provider(this, this._setterPrefix, this._withPrefix, str, this._isGetterPrefix);
        }

        public Provider withIsGetterPrefix(String str) {
            return new Provider(this, this._setterPrefix, this._withPrefix, this._getterPrefix, str);
        }

        public Provider withSetterPrefix(String str) {
            return new Provider(this, str, this._withPrefix, this._getterPrefix, this._isGetterPrefix);
        }

        public Provider(Provider provider, String str, String str2, String str3, String str4) {
            this(str, str2, str3, str4, provider._baseNameValidator);
        }

        public Provider(Provider provider, C2015a aVar) {
            this(provider._setterPrefix, provider._withPrefix, provider._getterPrefix, provider._isGetterPrefix, aVar);
        }

        public Provider(String str, String str2, String str3, String str4, C2015a aVar) {
            this._setterPrefix = str;
            this._withPrefix = str2;
            this._getterPrefix = str3;
            this._isGetterPrefix = str4;
            this._baseNameValidator = aVar;
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.introspect.DefaultAccessorNamingStrategy$a */
    public interface C2015a {
        /* renamed from: a */
        boolean mo15990a(char c, String str, int i);
    }

    /* renamed from: com.fasterxml.jackson.databind.introspect.DefaultAccessorNamingStrategy$b */
    public static class C2016b implements C2015a {

        /* renamed from: a */
        public final boolean f9997a;

        /* renamed from: b */
        public final boolean f9998b;

        public C2016b(boolean z, boolean z2) {
            this.f9997a = z;
            this.f9998b = z2;
        }

        /* renamed from: b */
        public static C2015a m14160b(boolean z, boolean z2) {
            if (z || z2) {
                return new C2016b(z, z2);
            }
            return null;
        }

        /* renamed from: a */
        public boolean mo15990a(char c, String str, int i) {
            if (!Character.isLetter(c)) {
                return this.f9998b;
            }
            if (this.f9997a || !Character.isLowerCase(c)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.introspect.DefaultAccessorNamingStrategy$c */
    public static class C2017c extends DefaultAccessorNamingStrategy {

        /* renamed from: h */
        public final Set<String> f9999h = new HashSet();

        public C2017c(MapperConfig<?> mapperConfig, C2021a aVar) {
            super(mapperConfig, aVar, (String) null, "get", "is", (C2015a) null);
            for (String add : sz2.m27205b(aVar.getRawType())) {
                this.f9999h.add(add);
            }
        }

        /* renamed from: c */
        public String mo15892c(AnnotatedMethod annotatedMethod, String str) {
            if (this.f9999h.contains(str)) {
                return str;
            }
            return DefaultAccessorNamingStrategy.super.mo15892c(annotatedMethod, str);
        }
    }

    public DefaultAccessorNamingStrategy(MapperConfig<?> mapperConfig, C2021a aVar, String str, String str2, String str3, C2015a aVar2) {
        this.f9990a = mapperConfig;
        this.f9991b = aVar;
        this.f9993d = mapperConfig.isEnabled(MapperFeature.USE_STD_BEAN_NAMING);
        this.f9996g = str;
        this.f9994e = str2;
        this.f9995f = str3;
        this.f9992c = aVar2;
    }

    /* renamed from: a */
    public String mo15890a(AnnotatedMethod annotatedMethod, String str) {
        if (this.f9995f == null) {
            return null;
        }
        Class<?> rawType = annotatedMethod.getRawType();
        if ((rawType != Boolean.class && rawType != Boolean.TYPE) || !str.startsWith(this.f9995f)) {
            return null;
        }
        if (this.f9993d) {
            return mo15983h(str, 2);
        }
        return mo15982g(str, 2);
    }

    /* renamed from: b */
    public String mo15891b(AnnotatedMethod annotatedMethod, String str) {
        String str2 = this.f9996g;
        if (str2 == null || !str.startsWith(str2)) {
            return null;
        }
        if (this.f9993d) {
            return mo15983h(str, this.f9996g.length());
        }
        return mo15982g(str, this.f9996g.length());
    }

    /* renamed from: c */
    public String mo15892c(AnnotatedMethod annotatedMethod, String str) {
        String str2 = this.f9994e;
        if (str2 == null || !str.startsWith(str2)) {
            return null;
        }
        if ("getCallbacks".equals(str)) {
            if (mo15980e(annotatedMethod)) {
                return null;
            }
        } else if ("getMetaClass".equals(str) && mo15981f(annotatedMethod)) {
            return null;
        }
        if (this.f9993d) {
            return mo15983h(str, this.f9994e.length());
        }
        return mo15982g(str, this.f9994e.length());
    }

    /* renamed from: d */
    public String mo15893d(AnnotatedField annotatedField, String str) {
        return str;
    }

    /* renamed from: e */
    public boolean mo15980e(AnnotatedMethod annotatedMethod) {
        Class<?> rawType = annotatedMethod.getRawType();
        if (!rawType.isArray()) {
            return false;
        }
        String name = rawType.getComponentType().getName();
        if (!name.contains(".cglib")) {
            return false;
        }
        if (name.startsWith("net.sf.cglib") || name.startsWith("org.hibernate.repackage.cglib") || name.startsWith("org.springframework.cglib")) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo15981f(AnnotatedMethod annotatedMethod) {
        return annotatedMethod.getRawType().getName().startsWith("groovy.lang");
    }

    /* renamed from: g */
    public String mo15982g(String str, int i) {
        int length = str.length();
        if (length == i) {
            return null;
        }
        char charAt = str.charAt(i);
        C2015a aVar = this.f9992c;
        if (aVar != null && !aVar.mo15990a(charAt, str, i)) {
            return null;
        }
        char lowerCase = Character.toLowerCase(charAt);
        if (charAt == lowerCase) {
            return str.substring(i);
        }
        StringBuilder sb = new StringBuilder(length - i);
        sb.append(lowerCase);
        while (true) {
            i++;
            if (i >= length) {
                break;
            }
            char charAt2 = str.charAt(i);
            char lowerCase2 = Character.toLowerCase(charAt2);
            if (charAt2 == lowerCase2) {
                sb.append(str, i, length);
                break;
            }
            sb.append(lowerCase2);
        }
        return sb.toString();
    }

    /* renamed from: h */
    public String mo15983h(String str, int i) {
        int length = str.length();
        if (length == i) {
            return null;
        }
        char charAt = str.charAt(i);
        C2015a aVar = this.f9992c;
        if (aVar != null && !aVar.mo15990a(charAt, str, i)) {
            return null;
        }
        char lowerCase = Character.toLowerCase(charAt);
        if (charAt == lowerCase) {
            return str.substring(i);
        }
        int i2 = i + 1;
        if (i2 < length && Character.isUpperCase(str.charAt(i2))) {
            return str.substring(i);
        }
        StringBuilder sb = new StringBuilder(length - i);
        sb.append(lowerCase);
        sb.append(str, i2, length);
        return sb.toString();
    }
}
