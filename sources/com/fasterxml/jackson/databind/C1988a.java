package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import java.util.Collections;

/* renamed from: com.fasterxml.jackson.databind.a */
/* compiled from: Module */
public abstract class C1988a {

    /* renamed from: com.fasterxml.jackson.databind.a$a */
    /* compiled from: Module */
    public interface C1989a {
        /* renamed from: a */
        void mo14718a(ia3 ia3);

        /* renamed from: b */
        void mo14719b(l87 l87);

        /* renamed from: c */
        void mo14720c(NamedType... namedTypeArr);

        /* renamed from: d */
        void mo14721d(ax5 ax5);

        /* renamed from: e */
        void mo14722e(be1 be1);

        /* renamed from: f */
        void mo14723f(Class<?> cls, Class<?> cls2);

        /* renamed from: g */
        void mo14724g(C2805m7 m7Var);

        /* renamed from: h */
        void mo14725h(ax5 ax5);

        /* renamed from: i */
        void mo14726i(PropertyNamingStrategy propertyNamingStrategy);

        /* renamed from: j */
        void mo14727j(p00 p00);

        /* renamed from: k */
        void mo14728k(s00 s00);
    }

    public Iterable<? extends C1988a> getDependencies() {
        return Collections.emptyList();
    }

    public abstract String getModuleName();

    public Object getTypeId() {
        return getClass().getName();
    }

    public abstract void setupModule(C1989a aVar);

    public abstract Version version();
}
