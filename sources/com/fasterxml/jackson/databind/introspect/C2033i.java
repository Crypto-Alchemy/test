package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.lang.reflect.Type;

/* renamed from: com.fasterxml.jackson.databind.introspect.i */
/* compiled from: TypeResolutionContext */
public interface C2033i {

    /* renamed from: com.fasterxml.jackson.databind.introspect.i$a */
    /* compiled from: TypeResolutionContext */
    public static class C2034a implements C2033i {

        /* renamed from: a */
        public final TypeFactory f10072a;

        /* renamed from: d */
        public final TypeBindings f10073d;

        public C2034a(TypeFactory typeFactory, TypeBindings typeBindings) {
            this.f10072a = typeFactory;
            this.f10073d = typeBindings;
        }

        /* renamed from: a */
        public JavaType mo16038a(Type type) {
            return this.f10072a.resolveMemberType(type, this.f10073d);
        }
    }

    /* renamed from: a */
    JavaType mo16038a(Type type);
}
