package p000;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.C2021a;
import com.fasterxml.jackson.databind.introspect.C2032h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p000.k53;
import p000.ot0;

/* renamed from: wz */
/* compiled from: BasicBeanDescription */
public class C3563wz extends n00 {

    /* renamed from: j */
    public static final Class<?>[] f19255j = new Class[0];

    /* renamed from: b */
    public final C2032h f19256b;

    /* renamed from: c */
    public final MapperConfig<?> f19257c;

    /* renamed from: d */
    public final AnnotationIntrospector f19258d;

    /* renamed from: e */
    public final C2021a f19259e;

    /* renamed from: f */
    public Class<?>[] f19260f;

    /* renamed from: g */
    public boolean f19261g;

    /* renamed from: h */
    public List<q00> f19262h;

    /* renamed from: i */
    public bf4 f19263i;

    public C3563wz(C2032h hVar, JavaType javaType, C2021a aVar) {
        super(javaType);
        this.f19256b = hVar;
        MapperConfig<?> D = hVar.mo16079D();
        this.f19257c = D;
        if (D == null) {
            this.f19258d = null;
        } else {
            this.f19258d = D.getAnnotationIntrospector();
        }
        this.f19259e = aVar;
    }

    /* renamed from: J */
    public static C3563wz m29756J(C2032h hVar) {
        return new C3563wz(hVar);
    }

    /* renamed from: K */
    public static C3563wz m29757K(MapperConfig<?> mapperConfig, JavaType javaType, C2021a aVar) {
        return new C3563wz(mapperConfig, javaType, aVar, Collections.emptyList());
    }

    /* renamed from: L */
    public static C3563wz m29758L(C2032h hVar) {
        return new C3563wz(hVar);
    }

    /* renamed from: B */
    public boolean mo23440B() {
        return this.f19259e.mo16049l();
    }

    /* renamed from: C */
    public Object mo23441C(boolean z) {
        AnnotatedConstructor j = this.f19259e.mo16047j();
        if (j == null) {
            return null;
        }
        if (z) {
            j.fixAccess(this.f19257c.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        try {
            return j.call();
        } catch (Exception e) {
            e = e;
            while (e.getCause() != null) {
                e = e.getCause();
            }
            wf0.m29515h0(e);
            wf0.m29519j0(e);
            throw new IllegalArgumentException("Failed to instantiate bean of type " + this.f19259e.getAnnotated().getName() + ": (" + e.getClass().getName() + ") " + wf0.m29528o(e), e);
        }
    }

    /* renamed from: E */
    public ot0<Object, Object> mo27622E(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof ot0) {
            return (ot0) obj;
        }
        if (obj instanceof Class) {
            Class<ot0.C2992a> cls = (Class) obj;
            if (cls == ot0.C2992a.class || wf0.m29483J(cls)) {
                return null;
            }
            if (ot0.class.isAssignableFrom(cls)) {
                this.f19257c.getHandlerInstantiator();
                return (ot0) wf0.m29522l(cls, this.f19257c.canOverrideAccessModifiers());
            }
            throw new IllegalStateException("AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<Converter>");
        }
        throw new IllegalStateException("AnnotationIntrospector returned Converter definition of type " + obj.getClass().getName() + "; expected type Converter or Class<Converter> instead");
    }

    /* renamed from: F */
    public List<q00> mo27623F() {
        if (this.f19262h == null) {
            this.f19262h = this.f19256b.mo16086K();
        }
        return this.f19262h;
    }

    /* renamed from: G */
    public boolean mo27624G(q00 q00) {
        if (mo27627M(q00.getFullName())) {
            return false;
        }
        mo27623F().add(q00);
        return true;
    }

    /* renamed from: H */
    public C2968ol<AnnotatedMethod, JsonCreator.Mode> mo27625H(AnnotatedMethod annotatedMethod) {
        Class<?> rawParameterType;
        if (!mo23460r().isAssignableFrom(annotatedMethod.getRawReturnType())) {
            return null;
        }
        JsonCreator.Mode findCreatorAnnotation = this.f19258d.findCreatorAnnotation(this.f19257c, annotatedMethod);
        if (findCreatorAnnotation == null) {
            String name = annotatedMethod.getName();
            if ("valueOf".equals(name) && annotatedMethod.getParameterCount() == 1) {
                return C2968ol.m23878a(annotatedMethod, findCreatorAnnotation);
            }
            if (!"fromString".equals(name) || annotatedMethod.getParameterCount() != 1 || ((rawParameterType = annotatedMethod.getRawParameterType(0)) != String.class && !CharSequence.class.isAssignableFrom(rawParameterType))) {
                return null;
            }
            return C2968ol.m23878a(annotatedMethod, findCreatorAnnotation);
        } else if (findCreatorAnnotation == JsonCreator.Mode.DISABLED) {
            return null;
        } else {
            return C2968ol.m23878a(annotatedMethod, findCreatorAnnotation);
        }
    }

    /* renamed from: I */
    public q00 mo27626I(PropertyName propertyName) {
        for (q00 next : mo27623F()) {
            if (next.mo24872C(propertyName)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: M */
    public boolean mo27627M(PropertyName propertyName) {
        if (mo27626I(propertyName) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: N */
    public boolean mo27628N(AnnotatedMethod annotatedMethod) {
        Class<?> rawParameterType;
        if (!mo23460r().isAssignableFrom(annotatedMethod.getRawReturnType())) {
            return false;
        }
        JsonCreator.Mode findCreatorAnnotation = this.f19258d.findCreatorAnnotation(this.f19257c, annotatedMethod);
        if (findCreatorAnnotation != null && findCreatorAnnotation != JsonCreator.Mode.DISABLED) {
            return true;
        }
        String name = annotatedMethod.getName();
        if ("valueOf".equals(name) && annotatedMethod.getParameterCount() == 1) {
            return true;
        }
        if (!"fromString".equals(name) || annotatedMethod.getParameterCount() != 1 || ((rawParameterType = annotatedMethod.getRawParameterType(0)) != String.class && !CharSequence.class.isAssignableFrom(rawParameterType))) {
            return false;
        }
        return true;
    }

    /* renamed from: O */
    public boolean mo27629O(String str) {
        Iterator<q00> it = mo27623F().iterator();
        while (it.hasNext()) {
            if (it.next().getName().equals(str)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public AnnotatedMember mo23443a() throws IllegalArgumentException {
        C2032h hVar = this.f19256b;
        if (hVar == null) {
            return null;
        }
        AnnotatedMember z = hVar.mo16114z();
        if (z != null) {
            if (Map.class.isAssignableFrom(z.getRawType())) {
                return z;
            }
            throw new IllegalArgumentException(String.format("Invalid 'any-getter' annotation on method %s(): return type is not instance of java.util.Map", new Object[]{z.getName()}));
        }
        AnnotatedMember y = this.f19256b.mo16113y();
        if (y == null) {
            return null;
        }
        if (Map.class.isAssignableFrom(y.getRawType())) {
            return y;
        }
        throw new IllegalArgumentException(String.format("Invalid 'any-getter' annotation on field '%s': type is not instance of java.util.Map", new Object[]{y.getName()}));
    }

    /* renamed from: b */
    public AnnotatedMember mo23444b() throws IllegalArgumentException {
        C2032h hVar = this.f19256b;
        if (hVar == null) {
            return null;
        }
        AnnotatedMethod B = hVar.mo16077B();
        if (B != null) {
            Class<?> rawParameterType = B.getRawParameterType(0);
            if (rawParameterType == String.class || rawParameterType == Object.class) {
                return B;
            }
            throw new IllegalArgumentException(String.format("Invalid 'any-setter' annotation on method '%s()': first argument not of type String or Object, but %s", new Object[]{B.getName(), rawParameterType.getName()}));
        }
        AnnotatedMember A = this.f19256b.mo16076A();
        if (A == null) {
            return null;
        }
        if (Map.class.isAssignableFrom(A.getRawType())) {
            return A;
        }
        throw new IllegalArgumentException(String.format("Invalid 'any-setter' annotation on field '%s': type is not instance of java.util.Map", new Object[]{A.getName()}));
    }

    /* renamed from: c */
    public List<q00> mo23445c() {
        ArrayList arrayList = null;
        HashSet hashSet = null;
        for (q00 next : mo27623F()) {
            AnnotationIntrospector.ReferenceProperty h = next.mo24885h();
            if (h != null && h.mo14222c()) {
                String b = h.mo14221b();
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hashSet = new HashSet();
                    hashSet.add(b);
                } else if (!hashSet.add(b)) {
                    throw new IllegalArgumentException("Multiple back-reference properties with name " + wf0.m29495V(b));
                }
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public AnnotatedConstructor mo23446d() {
        return this.f19259e.mo16047j();
    }

    /* renamed from: e */
    public Class<?>[] mo23447e() {
        Class<?>[] clsArr;
        if (!this.f19261g) {
            this.f19261g = true;
            AnnotationIntrospector annotationIntrospector = this.f19258d;
            if (annotationIntrospector == null) {
                clsArr = null;
            } else {
                clsArr = annotationIntrospector.findViews(this.f19259e);
            }
            if (clsArr == null && !this.f19257c.isEnabled(MapperFeature.DEFAULT_VIEW_INCLUSION)) {
                clsArr = f19255j;
            }
            this.f19260f = clsArr;
        }
        return this.f19260f;
    }

    /* renamed from: f */
    public ot0<Object, Object> mo23448f() {
        AnnotationIntrospector annotationIntrospector = this.f19258d;
        if (annotationIntrospector == null) {
            return null;
        }
        return mo27622E(annotationIntrospector.findDeserializationConverter(this.f19259e));
    }

    /* renamed from: g */
    public JsonFormat.Value mo23449g(JsonFormat.Value value) {
        JsonFormat.Value findFormat;
        AnnotationIntrospector annotationIntrospector = this.f19258d;
        if (!(annotationIntrospector == null || (findFormat = annotationIntrospector.findFormat(this.f19259e)) == null)) {
            if (value == null) {
                value = findFormat;
            } else {
                value = value.withOverrides(findFormat);
            }
        }
        JsonFormat.Value defaultPropertyFormat = this.f19257c.getDefaultPropertyFormat(this.f19259e.getRawType());
        if (defaultPropertyFormat == null) {
            return value;
        }
        if (value == null) {
            return defaultPropertyFormat;
        }
        return value.withOverrides(defaultPropertyFormat);
    }

    /* renamed from: h */
    public Map<Object, AnnotatedMember> mo23450h() {
        C2032h hVar = this.f19256b;
        if (hVar != null) {
            return hVar.mo16081F();
        }
        return Collections.emptyMap();
    }

    /* renamed from: i */
    public AnnotatedMember mo23451i() {
        C2032h hVar = this.f19256b;
        if (hVar == null) {
            return null;
        }
        return hVar.mo16082G();
    }

    /* renamed from: j */
    public AnnotatedMember mo23452j() {
        C2032h hVar = this.f19256b;
        if (hVar == null) {
            return null;
        }
        return hVar.mo16083H();
    }

    @Deprecated
    /* renamed from: k */
    public AnnotatedMethod mo23453k() {
        C2032h hVar = this.f19256b;
        if (hVar == null) {
            return null;
        }
        return hVar.mo16084I();
    }

    /* renamed from: l */
    public AnnotatedMethod mo23454l(String str, Class<?>[] clsArr) {
        return this.f19259e.mo16043f(str, clsArr);
    }

    /* renamed from: m */
    public Class<?> mo23455m() {
        AnnotationIntrospector annotationIntrospector = this.f19258d;
        if (annotationIntrospector == null) {
            return null;
        }
        return annotationIntrospector.findPOJOBuilder(this.f19259e);
    }

    /* renamed from: n */
    public k53.C2643a mo23456n() {
        AnnotationIntrospector annotationIntrospector = this.f19258d;
        if (annotationIntrospector == null) {
            return null;
        }
        return annotationIntrospector.findPOJOBuilderConfig(this.f19259e);
    }

    /* renamed from: o */
    public List<q00> mo23457o() {
        return mo27623F();
    }

    /* renamed from: p */
    public JsonInclude.Value mo23458p(JsonInclude.Value value) {
        JsonInclude.Value findPropertyInclusion;
        AnnotationIntrospector annotationIntrospector = this.f19258d;
        if (annotationIntrospector == null || (findPropertyInclusion = annotationIntrospector.findPropertyInclusion(this.f19259e)) == null) {
            return value;
        }
        if (value == null) {
            return findPropertyInclusion;
        }
        return value.withOverrides(findPropertyInclusion);
    }

    /* renamed from: q */
    public ot0<Object, Object> mo23459q() {
        AnnotationIntrospector annotationIntrospector = this.f19258d;
        if (annotationIntrospector == null) {
            return null;
        }
        return mo27622E(annotationIntrospector.findSerializationConverter(this.f19259e));
    }

    /* renamed from: s */
    public C2236em mo23461s() {
        return this.f19259e.mo16045h();
    }

    /* renamed from: t */
    public C2021a mo23462t() {
        return this.f19259e;
    }

    /* renamed from: u */
    public List<AnnotatedConstructor> mo23463u() {
        return this.f19259e.mo16046i();
    }

    /* renamed from: v */
    public List<C2968ol<AnnotatedConstructor, JsonCreator.Mode>> mo23464v() {
        List<AnnotatedConstructor> i = this.f19259e.mo16046i();
        if (i.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (AnnotatedConstructor next : i) {
            JsonCreator.Mode findCreatorAnnotation = this.f19258d.findCreatorAnnotation(this.f19257c, next);
            if (findCreatorAnnotation != JsonCreator.Mode.DISABLED) {
                arrayList.add(C2968ol.m23878a(next, findCreatorAnnotation));
            }
        }
        return arrayList;
    }

    /* renamed from: w */
    public List<AnnotatedMethod> mo23465w() {
        List<AnnotatedMethod> k = this.f19259e.mo16048k();
        if (k.isEmpty()) {
            return k;
        }
        ArrayList arrayList = null;
        for (AnnotatedMethod next : k) {
            if (mo27628N(next)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(next);
            }
        }
        if (arrayList == null) {
            return Collections.emptyList();
        }
        return arrayList;
    }

    /* renamed from: x */
    public List<C2968ol<AnnotatedMethod, JsonCreator.Mode>> mo23466x() {
        List<AnnotatedMethod> k = this.f19259e.mo16048k();
        if (k.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = null;
        for (AnnotatedMethod H : k) {
            C2968ol<AnnotatedMethod, JsonCreator.Mode> H2 = mo27625H(H);
            if (H2 != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(H2);
            }
        }
        if (arrayList == null) {
            return Collections.emptyList();
        }
        return arrayList;
    }

    /* renamed from: y */
    public Set<String> mo23467y() {
        Set<String> set;
        C2032h hVar = this.f19256b;
        if (hVar == null) {
            set = null;
        } else {
            set = hVar.mo16080E();
        }
        if (set == null) {
            return Collections.emptySet();
        }
        return set;
    }

    /* renamed from: z */
    public bf4 mo23468z() {
        return this.f19263i;
    }

    public C3563wz(MapperConfig<?> mapperConfig, JavaType javaType, C2021a aVar, List<q00> list) {
        super(javaType);
        this.f19256b = null;
        this.f19257c = mapperConfig;
        if (mapperConfig == null) {
            this.f19258d = null;
        } else {
            this.f19258d = mapperConfig.getAnnotationIntrospector();
        }
        this.f19259e = aVar;
        this.f19262h = list;
    }

    public C3563wz(C2032h hVar) {
        this(hVar, hVar.mo16088M(), hVar.mo16078C());
        this.f19263i = hVar.mo16085J();
    }
}
