package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.DefaultAccessorNamingStrategy;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: com.fasterxml.jackson.databind.introspect.h */
/* compiled from: POJOPropertiesCollector */
public class C2032h {

    /* renamed from: a */
    public final MapperConfig<?> f10050a;

    /* renamed from: b */
    public final AccessorNamingStrategy f10051b;

    /* renamed from: c */
    public final boolean f10052c;

    /* renamed from: d */
    public final JavaType f10053d;

    /* renamed from: e */
    public final C2021a f10054e;

    /* renamed from: f */
    public final VisibilityChecker<?> f10055f;

    /* renamed from: g */
    public final AnnotationIntrospector f10056g;

    /* renamed from: h */
    public final boolean f10057h;

    /* renamed from: i */
    public boolean f10058i;

    /* renamed from: j */
    public LinkedHashMap<String, zj4> f10059j;

    /* renamed from: k */
    public LinkedList<zj4> f10060k;

    /* renamed from: l */
    public Map<PropertyName, PropertyName> f10061l;

    /* renamed from: m */
    public LinkedList<AnnotatedMember> f10062m;

    /* renamed from: n */
    public LinkedList<AnnotatedMember> f10063n;

    /* renamed from: o */
    public LinkedList<AnnotatedMethod> f10064o;

    /* renamed from: p */
    public LinkedList<AnnotatedMember> f10065p;

    /* renamed from: q */
    public LinkedList<AnnotatedMember> f10066q;

    /* renamed from: r */
    public LinkedList<AnnotatedMember> f10067r;

    /* renamed from: s */
    public HashSet<String> f10068s;

    /* renamed from: t */
    public LinkedHashMap<Object, AnnotatedMember> f10069t;
    @Deprecated

    /* renamed from: u */
    public final boolean f10070u;
    @Deprecated

    /* renamed from: v */
    public String f10071v;

    public C2032h(MapperConfig<?> mapperConfig, boolean z, JavaType javaType, C2021a aVar, AccessorNamingStrategy accessorNamingStrategy) {
        this.f10071v = "set";
        this.f10050a = mapperConfig;
        this.f10052c = z;
        this.f10053d = javaType;
        this.f10054e = aVar;
        if (mapperConfig.isAnnotationProcessingEnabled()) {
            this.f10057h = true;
            this.f10056g = mapperConfig.getAnnotationIntrospector();
        } else {
            this.f10057h = false;
            this.f10056g = AnnotationIntrospector.nopInstance();
        }
        this.f10055f = mapperConfig.getDefaultVisibilityChecker(javaType.getRawClass(), aVar);
        this.f10051b = accessorNamingStrategy;
        this.f10070u = mapperConfig.isEnabled(MapperFeature.USE_STD_BEAN_NAMING);
    }

    /* renamed from: a */
    public static AccessorNamingStrategy m14231a(MapperConfig<?> mapperConfig, C2021a aVar, String str) {
        if (str == null) {
            str = "set";
        }
        return new DefaultAccessorNamingStrategy.Provider().withSetterPrefix(str).forPOJO(mapperConfig, aVar);
    }

    /* renamed from: A */
    public AnnotatedMember mo16076A() {
        if (!this.f10058i) {
            mo16112x();
        }
        LinkedList<AnnotatedMember> linkedList = this.f10065p;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1) {
            mo16089N("Multiple 'any-setter' fields defined (%s vs %s)", this.f10065p.get(0), this.f10065p.get(1));
        }
        return this.f10065p.getFirst();
    }

    /* renamed from: B */
    public AnnotatedMethod mo16077B() {
        if (!this.f10058i) {
            mo16112x();
        }
        LinkedList<AnnotatedMethod> linkedList = this.f10064o;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1) {
            mo16089N("Multiple 'any-setter' methods defined (%s vs %s)", this.f10064o.get(0), this.f10064o.get(1));
        }
        return this.f10064o.getFirst();
    }

    /* renamed from: C */
    public C2021a mo16078C() {
        return this.f10054e;
    }

    /* renamed from: D */
    public MapperConfig<?> mo16079D() {
        return this.f10050a;
    }

    /* renamed from: E */
    public Set<String> mo16080E() {
        return this.f10068s;
    }

    /* renamed from: F */
    public Map<Object, AnnotatedMember> mo16081F() {
        if (!this.f10058i) {
            mo16112x();
        }
        return this.f10069t;
    }

    /* renamed from: G */
    public AnnotatedMember mo16082G() {
        if (!this.f10058i) {
            mo16112x();
        }
        LinkedList<AnnotatedMember> linkedList = this.f10066q;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1) {
            mo16089N("Multiple 'as-key' properties defined (%s vs %s)", this.f10066q.get(0), this.f10066q.get(1));
        }
        return this.f10066q.get(0);
    }

    /* renamed from: H */
    public AnnotatedMember mo16083H() {
        if (!this.f10058i) {
            mo16112x();
        }
        LinkedList<AnnotatedMember> linkedList = this.f10067r;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1) {
            mo16089N("Multiple 'as-value' properties defined (%s vs %s)", this.f10067r.get(0), this.f10067r.get(1));
        }
        return this.f10067r.get(0);
    }

    @Deprecated
    /* renamed from: I */
    public AnnotatedMethod mo16084I() {
        AnnotatedMember H = mo16083H();
        if (H instanceof AnnotatedMethod) {
            return (AnnotatedMethod) H;
        }
        return null;
    }

    /* renamed from: J */
    public bf4 mo16085J() {
        bf4 findObjectIdInfo = this.f10056g.findObjectIdInfo(this.f10054e);
        if (findObjectIdInfo != null) {
            return this.f10056g.findObjectReferenceInfo(this.f10054e, findObjectIdInfo);
        }
        return findObjectIdInfo;
    }

    /* renamed from: K */
    public List<q00> mo16086K() {
        return new ArrayList(mo16087L().values());
    }

    /* renamed from: L */
    public Map<String, zj4> mo16087L() {
        if (!this.f10058i) {
            mo16112x();
        }
        return this.f10059j;
    }

    /* renamed from: M */
    public JavaType mo16088M() {
        return this.f10053d;
    }

    /* renamed from: N */
    public void mo16089N(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        throw new IllegalArgumentException("Problem with definition of " + this.f10054e + ": " + str);
    }

    /* renamed from: b */
    public void mo16090b(Map<String, zj4> map, AnnotatedParameter annotatedParameter) {
        boolean z;
        zj4 zj4;
        JsonCreator.Mode findCreatorAnnotation;
        String findImplicitPropertyName = this.f10056g.findImplicitPropertyName(annotatedParameter);
        if (findImplicitPropertyName == null) {
            findImplicitPropertyName = "";
        }
        PropertyName findNameForDeserialization = this.f10056g.findNameForDeserialization(annotatedParameter);
        if (findNameForDeserialization == null || findNameForDeserialization.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        boolean z2 = z;
        if (!z2) {
            if (!findImplicitPropertyName.isEmpty() && (findCreatorAnnotation = this.f10056g.findCreatorAnnotation(this.f10050a, annotatedParameter.getOwner())) != null && findCreatorAnnotation != JsonCreator.Mode.DISABLED) {
                findNameForDeserialization = PropertyName.construct(findImplicitPropertyName);
            } else {
                return;
            }
        }
        PropertyName propertyName = findNameForDeserialization;
        String j = mo16098j(findImplicitPropertyName);
        if (!z2 || !j.isEmpty()) {
            zj4 = mo16104p(map, j);
        } else {
            zj4 = mo16103o(map, propertyName);
        }
        zj4.mo28480e0(annotatedParameter, propertyName, z2, true, false);
        this.f10060k.add(zj4);
    }

    /* renamed from: c */
    public void mo16091c(Map<String, zj4> map) {
        if (this.f10057h) {
            Iterator<AnnotatedConstructor> it = this.f10054e.mo16046i().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AnnotatedConstructor next = it.next();
                if (this.f10060k == null) {
                    this.f10060k = new LinkedList<>();
                }
                int parameterCount = next.getParameterCount();
                for (int i = 0; i < parameterCount; i++) {
                    mo16090b(map, next.getParameter(i));
                }
            }
            for (AnnotatedMethod next2 : this.f10054e.mo16048k()) {
                if (this.f10060k == null) {
                    this.f10060k = new LinkedList<>();
                }
                int parameterCount2 = next2.getParameterCount();
                for (int i2 = 0; i2 < parameterCount2; i2++) {
                    mo16090b(map, next2.getParameter(i2));
                }
            }
        }
    }

    /* renamed from: d */
    public void mo16092d(Map<String, zj4> map) {
        boolean z;
        PropertyName propertyName;
        boolean z2;
        boolean z3;
        PropertyName propertyName2;
        boolean z4;
        boolean z5;
        boolean z6;
        AnnotationIntrospector annotationIntrospector = this.f10056g;
        if (this.f10052c || this.f10050a.isEnabled(MapperFeature.ALLOW_FINAL_FIELDS_AS_MUTATORS)) {
            z = false;
        } else {
            z = true;
        }
        boolean isEnabled = this.f10050a.isEnabled(MapperFeature.PROPAGATE_TRANSIENT_MARKER);
        for (AnnotatedField next : this.f10054e.mo16042e()) {
            Boolean bool = Boolean.TRUE;
            if (bool.equals(annotationIntrospector.hasAsKey(this.f10050a, next))) {
                if (this.f10066q == null) {
                    this.f10066q = new LinkedList<>();
                }
                this.f10066q.add(next);
            }
            if (bool.equals(annotationIntrospector.hasAsValue(next))) {
                if (this.f10067r == null) {
                    this.f10067r = new LinkedList<>();
                }
                this.f10067r.add(next);
            } else {
                boolean equals = bool.equals(annotationIntrospector.hasAnyGetter(next));
                boolean equals2 = bool.equals(annotationIntrospector.hasAnySetter(next));
                if (equals || equals2) {
                    if (equals) {
                        if (this.f10063n == null) {
                            this.f10063n = new LinkedList<>();
                        }
                        this.f10063n.add(next);
                    }
                    if (equals2) {
                        if (this.f10065p == null) {
                            this.f10065p = new LinkedList<>();
                        }
                        this.f10065p.add(next);
                    }
                } else {
                    String findImplicitPropertyName = annotationIntrospector.findImplicitPropertyName(next);
                    if (findImplicitPropertyName == null) {
                        findImplicitPropertyName = next.getName();
                    }
                    String d = this.f10051b.mo15893d(next, findImplicitPropertyName);
                    if (d != null) {
                        PropertyName n = mo16102n(d);
                        PropertyName findRenameByField = annotationIntrospector.findRenameByField(this.f10050a, next, n);
                        if (findRenameByField != null && !findRenameByField.equals(n)) {
                            if (this.f10061l == null) {
                                this.f10061l = new HashMap();
                            }
                            this.f10061l.put(findRenameByField, n);
                        }
                        if (this.f10052c) {
                            propertyName = annotationIntrospector.findNameForSerialization(next);
                        } else {
                            propertyName = annotationIntrospector.findNameForDeserialization(next);
                        }
                        if (propertyName != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z2 || !propertyName.isEmpty()) {
                            propertyName2 = propertyName;
                            z3 = z2;
                        } else {
                            z3 = false;
                            propertyName2 = mo16102n(d);
                        }
                        if (propertyName2 != null) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (!z4) {
                            z4 = this.f10055f.isFieldVisible(next);
                        }
                        boolean hasIgnoreMarker = annotationIntrospector.hasIgnoreMarker(next);
                        if (!next.isTransient() || z2) {
                            z5 = hasIgnoreMarker;
                            z6 = z4;
                        } else {
                            if (isEnabled) {
                                z5 = true;
                            } else {
                                z5 = hasIgnoreMarker;
                            }
                            z6 = false;
                        }
                        if (!z || propertyName2 != null || z5 || !Modifier.isFinal(next.getModifiers())) {
                            mo16104p(map, d).mo28481f0(next, propertyName2, z3, z6, z5);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public void mo16093e(Map<String, zj4> map, AnnotatedMethod annotatedMethod, AnnotationIntrospector annotationIntrospector) {
        boolean z;
        boolean z2;
        boolean z3;
        PropertyName propertyName;
        String str;
        boolean z4;
        Class<?> rawReturnType = annotatedMethod.getRawReturnType();
        if (rawReturnType == Void.TYPE) {
            return;
        }
        if (rawReturnType != Void.class || this.f10050a.isEnabled(MapperFeature.ALLOW_VOID_VALUED_PROPERTIES)) {
            Boolean bool = Boolean.TRUE;
            if (bool.equals(annotationIntrospector.hasAnyGetter(annotatedMethod))) {
                if (this.f10062m == null) {
                    this.f10062m = new LinkedList<>();
                }
                this.f10062m.add(annotatedMethod);
            } else if (bool.equals(annotationIntrospector.hasAsKey(this.f10050a, annotatedMethod))) {
                if (this.f10066q == null) {
                    this.f10066q = new LinkedList<>();
                }
                this.f10066q.add(annotatedMethod);
            } else if (bool.equals(annotationIntrospector.hasAsValue(annotatedMethod))) {
                if (this.f10067r == null) {
                    this.f10067r = new LinkedList<>();
                }
                this.f10067r.add(annotatedMethod);
            } else {
                PropertyName findNameForSerialization = annotationIntrospector.findNameForSerialization(annotatedMethod);
                boolean z5 = false;
                if (findNameForSerialization != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    str = annotationIntrospector.findImplicitPropertyName(annotatedMethod);
                    if (str == null) {
                        str = this.f10051b.mo15892c(annotatedMethod, annotatedMethod.getName());
                    }
                    if (str == null) {
                        str = this.f10051b.mo15890a(annotatedMethod, annotatedMethod.getName());
                        if (str != null) {
                            z4 = this.f10055f.isIsGetterVisible(annotatedMethod);
                        } else {
                            return;
                        }
                    } else {
                        z4 = this.f10055f.isGetterVisible(annotatedMethod);
                    }
                    propertyName = findNameForSerialization;
                    z2 = z4;
                    z3 = z;
                } else {
                    String findImplicitPropertyName = annotationIntrospector.findImplicitPropertyName(annotatedMethod);
                    if (findImplicitPropertyName == null && (findImplicitPropertyName = this.f10051b.mo15892c(annotatedMethod, annotatedMethod.getName())) == null) {
                        findImplicitPropertyName = this.f10051b.mo15890a(annotatedMethod, annotatedMethod.getName());
                    }
                    if (findImplicitPropertyName == null) {
                        findImplicitPropertyName = annotatedMethod.getName();
                    }
                    if (findNameForSerialization.isEmpty()) {
                        findNameForSerialization = mo16102n(findImplicitPropertyName);
                    } else {
                        z5 = z;
                    }
                    propertyName = findNameForSerialization;
                    z2 = true;
                    z3 = z5;
                    str = findImplicitPropertyName;
                }
                mo16104p(map, mo16098j(str)).mo28482g0(annotatedMethod, propertyName, z3, z2, annotationIntrospector.hasIgnoreMarker(annotatedMethod));
            }
        }
    }

    /* renamed from: f */
    public void mo16094f(Map<String, zj4> map) {
        for (AnnotatedField next : this.f10054e.mo16042e()) {
            mo16100l(this.f10056g.findInjectableValue(next), next);
        }
        for (AnnotatedMethod next2 : this.f10054e.mo16051n()) {
            if (next2.getParameterCount() == 1) {
                mo16100l(this.f10056g.findInjectableValue(next2), next2);
            }
        }
    }

    /* renamed from: g */
    public void mo16095g(Map<String, zj4> map) {
        for (AnnotatedMethod next : this.f10054e.mo16051n()) {
            int parameterCount = next.getParameterCount();
            if (parameterCount == 0) {
                mo16093e(map, next, this.f10056g);
            } else if (parameterCount == 1) {
                mo16096h(map, next, this.f10056g);
            } else if (parameterCount == 2 && Boolean.TRUE.equals(this.f10056g.hasAnySetter(next))) {
                if (this.f10064o == null) {
                    this.f10064o = new LinkedList<>();
                }
                this.f10064o.add(next);
            }
        }
    }

    /* renamed from: h */
    public void mo16096h(Map<String, zj4> map, AnnotatedMethod annotatedMethod, AnnotationIntrospector annotationIntrospector) {
        boolean z;
        boolean z2;
        boolean z3;
        PropertyName propertyName;
        String str;
        PropertyName findNameForDeserialization = annotationIntrospector.findNameForDeserialization(annotatedMethod);
        boolean z4 = false;
        if (findNameForDeserialization != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            str = annotationIntrospector.findImplicitPropertyName(annotatedMethod);
            if (str == null) {
                str = this.f10051b.mo15891b(annotatedMethod, annotatedMethod.getName());
            }
            if (str != null) {
                propertyName = findNameForDeserialization;
                z2 = this.f10055f.isSetterVisible(annotatedMethod);
                z3 = z;
            } else {
                return;
            }
        } else {
            String findImplicitPropertyName = annotationIntrospector.findImplicitPropertyName(annotatedMethod);
            if (findImplicitPropertyName == null) {
                findImplicitPropertyName = this.f10051b.mo15891b(annotatedMethod, annotatedMethod.getName());
            }
            if (findImplicitPropertyName == null) {
                findImplicitPropertyName = annotatedMethod.getName();
            }
            if (findNameForDeserialization.isEmpty()) {
                findNameForDeserialization = mo16102n(findImplicitPropertyName);
            } else {
                z4 = z;
            }
            propertyName = findNameForDeserialization;
            z2 = true;
            z3 = z4;
            str = findImplicitPropertyName;
        }
        mo16104p(map, mo16098j(str)).mo28483h0(annotatedMethod, propertyName, z3, z2, annotationIntrospector.hasIgnoreMarker(annotatedMethod));
    }

    /* renamed from: i */
    public final boolean mo16097i(Collection<zj4> collection) {
        for (zj4 metadata : collection) {
            if (metadata.getMetadata().hasIndex()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    public final String mo16098j(String str) {
        PropertyName propertyName;
        Map<PropertyName, PropertyName> map = this.f10061l;
        if (map == null || (propertyName = map.get(mo16102n(str))) == null) {
            return str;
        }
        return propertyName.getSimpleName();
    }

    /* renamed from: k */
    public void mo16099k(String str) {
        if (!this.f10052c && str != null) {
            if (this.f10068s == null) {
                this.f10068s = new HashSet<>();
            }
            this.f10068s.add(str);
        }
    }

    /* renamed from: l */
    public void mo16100l(JacksonInject.Value value, AnnotatedMember annotatedMember) {
        if (value != null) {
            Object id = value.getId();
            if (this.f10069t == null) {
                this.f10069t = new LinkedHashMap<>();
            }
            AnnotatedMember put = this.f10069t.put(id, annotatedMember);
            if (put != null && put.getClass() == annotatedMember.getClass()) {
                String name = id.getClass().getName();
                throw new IllegalArgumentException("Duplicate injectable value with id '" + id + "' (of type " + name + ")");
            }
        }
    }

    /* renamed from: m */
    public final PropertyNamingStrategy mo16101m() {
        Object findNamingStrategy = this.f10056g.findNamingStrategy(this.f10054e);
        if (findNamingStrategy == null) {
            return this.f10050a.getPropertyNamingStrategy();
        }
        if (findNamingStrategy instanceof PropertyNamingStrategy) {
            return (PropertyNamingStrategy) findNamingStrategy;
        }
        if (findNamingStrategy instanceof Class) {
            Class<PropertyNamingStrategy> cls = (Class) findNamingStrategy;
            if (cls == PropertyNamingStrategy.class) {
                return null;
            }
            if (PropertyNamingStrategy.class.isAssignableFrom(cls)) {
                this.f10050a.getHandlerInstantiator();
                return (PropertyNamingStrategy) wf0.m29522l(cls, this.f10050a.canOverrideAccessModifiers());
            }
            throw new IllegalStateException("AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<PropertyNamingStrategy>");
        }
        throw new IllegalStateException("AnnotationIntrospector returned PropertyNamingStrategy definition of type " + findNamingStrategy.getClass().getName() + "; expected type PropertyNamingStrategy or Class<PropertyNamingStrategy> instead");
    }

    /* renamed from: n */
    public final PropertyName mo16102n(String str) {
        return PropertyName.construct(str, (String) null);
    }

    /* renamed from: o */
    public zj4 mo16103o(Map<String, zj4> map, PropertyName propertyName) {
        String simpleName = propertyName.getSimpleName();
        zj4 zj4 = map.get(simpleName);
        if (zj4 != null) {
            return zj4;
        }
        zj4 zj42 = new zj4(this.f10050a, this.f10056g, this.f10052c, propertyName);
        map.put(simpleName, zj42);
        return zj42;
    }

    /* renamed from: p */
    public zj4 mo16104p(Map<String, zj4> map, String str) {
        zj4 zj4 = map.get(str);
        if (zj4 != null) {
            return zj4;
        }
        zj4 zj42 = new zj4(this.f10050a, this.f10056g, this.f10052c, PropertyName.construct(str));
        map.put(str, zj42);
        return zj42;
    }

    /* renamed from: q */
    public void mo16105q(Map<String, zj4> map) {
        C2032h hVar;
        boolean isEnabled = this.f10050a.isEnabled(MapperFeature.INFER_PROPERTY_MUTATORS);
        for (zj4 next : map.values()) {
            if (this.f10052c) {
                hVar = null;
            } else {
                hVar = this;
            }
            next.mo28456B0(isEnabled, hVar);
        }
    }

    /* renamed from: r */
    public void mo16106r(Map<String, zj4> map) {
        Iterator<zj4> it = map.values().iterator();
        while (it.hasNext()) {
            zj4 next = it.next();
            if (!next.mo28485j0()) {
                it.remove();
            } else if (next.mo28484i0()) {
                if (!next.mo24874E()) {
                    it.remove();
                    mo16099k(next.getName());
                } else {
                    next.mo28455A0();
                    if (!next.mo24877a()) {
                        mo16099k(next.getName());
                    }
                }
            }
        }
    }

    /* renamed from: s */
    public void mo16107s(Map<String, zj4> map) {
        HashSet<String> hashSet;
        Iterator<Map.Entry<String, zj4>> it = map.entrySet().iterator();
        LinkedList linkedList = null;
        while (it.hasNext()) {
            zj4 zj4 = (zj4) it.next().getValue();
            Set<PropertyName> n0 = zj4.mo28489n0();
            if (!n0.isEmpty()) {
                it.remove();
                if (linkedList == null) {
                    linkedList = new LinkedList();
                }
                if (n0.size() == 1) {
                    linkedList.add(zj4.mo28458D0(n0.iterator().next()));
                } else {
                    linkedList.addAll(zj4.mo28487l0(n0));
                }
            }
        }
        if (linkedList != null) {
            Iterator it2 = linkedList.iterator();
            while (it2.hasNext()) {
                zj4 zj42 = (zj4) it2.next();
                String name = zj42.getName();
                zj4 zj43 = map.get(name);
                if (zj43 == null) {
                    map.put(name, zj42);
                } else {
                    zj43.mo28479d0(zj42);
                }
                if (mo16110v(zj42, this.f10060k) && (hashSet = this.f10068s) != null) {
                    hashSet.remove(name);
                }
            }
        }
    }

    /* renamed from: t */
    public void mo16108t(Map<String, zj4> map, PropertyNamingStrategy propertyNamingStrategy) {
        zj4[] zj4Arr = (zj4[]) map.values().toArray(new zj4[map.size()]);
        map.clear();
        for (zj4 zj4 : zj4Arr) {
            PropertyName fullName = zj4.getFullName();
            String str = null;
            if (!zj4.mo24875F() || this.f10050a.isEnabled(MapperFeature.ALLOW_EXPLICIT_PROPERTY_RENAMING)) {
                if (this.f10052c) {
                    if (zj4.mo28498v0()) {
                        str = propertyNamingStrategy.nameForGetterMethod(this.f10050a, zj4.mo24891r(), fullName.getSimpleName());
                    } else if (zj4.mo24871B()) {
                        str = propertyNamingStrategy.nameForField(this.f10050a, zj4.mo24890p(), fullName.getSimpleName());
                    }
                } else if (zj4.mo24873D()) {
                    str = propertyNamingStrategy.nameForSetterMethod(this.f10050a, zj4.mo28497u0(), fullName.getSimpleName());
                } else if (zj4.mo24898z()) {
                    str = propertyNamingStrategy.nameForConstructorParameter(this.f10050a, zj4.mo24888m(), fullName.getSimpleName());
                } else if (zj4.mo24871B()) {
                    str = propertyNamingStrategy.nameForField(this.f10050a, zj4.mo28492q0(), fullName.getSimpleName());
                } else if (zj4.mo28498v0()) {
                    str = propertyNamingStrategy.nameForGetterMethod(this.f10050a, zj4.mo28493r0(), fullName.getSimpleName());
                }
            }
            if (str == null || fullName.hasSimpleName(str)) {
                str = fullName.getSimpleName();
            } else {
                zj4 = zj4.mo28459F0(str);
            }
            zj4 zj42 = map.get(str);
            if (zj42 == null) {
                map.put(str, zj4);
            } else {
                zj42.mo28479d0(zj4);
            }
            mo16110v(zj4, this.f10060k);
        }
    }

    /* renamed from: u */
    public void mo16109u(Map<String, zj4> map) {
        PropertyName findWrapperName;
        Iterator<Map.Entry<String, zj4>> it = map.entrySet().iterator();
        LinkedList linkedList = null;
        while (it.hasNext()) {
            zj4 zj4 = (zj4) it.next().getValue();
            AnnotatedMember v = zj4.mo24894v();
            if (v != null && (findWrapperName = this.f10056g.findWrapperName(v)) != null && findWrapperName.hasSimpleName() && !findWrapperName.equals(zj4.getFullName())) {
                if (linkedList == null) {
                    linkedList = new LinkedList();
                }
                linkedList.add(zj4.mo28458D0(findWrapperName));
                it.remove();
            }
        }
        if (linkedList != null) {
            Iterator it2 = linkedList.iterator();
            while (it2.hasNext()) {
                zj4 zj42 = (zj4) it2.next();
                String name = zj42.getName();
                zj4 zj43 = map.get(name);
                if (zj43 == null) {
                    map.put(name, zj42);
                } else {
                    zj43.mo28479d0(zj42);
                }
            }
        }
    }

    /* renamed from: v */
    public boolean mo16110v(zj4 zj4, List<zj4> list) {
        if (list != null) {
            String s0 = zj4.mo28494s0();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (list.get(i).mo28494s0().equals(s0)) {
                    list.set(i, zj4);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: w */
    public void mo16111w(Map<String, zj4> map) {
        boolean z;
        Map map2;
        Collection<zj4> collection;
        AnnotationIntrospector annotationIntrospector = this.f10056g;
        Boolean findSerializationSortAlphabetically = annotationIntrospector.findSerializationSortAlphabetically(this.f10054e);
        if (findSerializationSortAlphabetically == null) {
            z = this.f10050a.shouldSortPropertiesAlphabetically();
        } else {
            z = findSerializationSortAlphabetically.booleanValue();
        }
        boolean i = mo16097i(map.values());
        String[] findSerializationPropertyOrder = annotationIntrospector.findSerializationPropertyOrder(this.f10054e);
        if (z || i || this.f10060k != null || findSerializationPropertyOrder != null) {
            int size = map.size();
            if (z) {
                map2 = new TreeMap();
            } else {
                map2 = new LinkedHashMap(size + size);
            }
            for (zj4 next : map.values()) {
                map2.put(next.getName(), next);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(size + size);
            if (findSerializationPropertyOrder != null) {
                for (String str : findSerializationPropertyOrder) {
                    zj4 zj4 = (zj4) map2.remove(str);
                    if (zj4 == null) {
                        Iterator<zj4> it = map.values().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            zj4 next2 = it.next();
                            if (str.equals(next2.mo28494s0())) {
                                str = next2.getName();
                                zj4 = next2;
                                break;
                            }
                        }
                    }
                    if (zj4 != null) {
                        linkedHashMap.put(str, zj4);
                    }
                }
            }
            if (i) {
                TreeMap treeMap = new TreeMap();
                Iterator it2 = map2.entrySet().iterator();
                while (it2.hasNext()) {
                    zj4 zj42 = (zj4) ((Map.Entry) it2.next()).getValue();
                    Integer index = zj42.getMetadata().getIndex();
                    if (index != null) {
                        treeMap.put(index, zj42);
                        it2.remove();
                    }
                }
                for (zj4 zj43 : treeMap.values()) {
                    linkedHashMap.put(zj43.getName(), zj43);
                }
            }
            if (this.f10060k != null && (!z || this.f10050a.isEnabled(MapperFeature.SORT_CREATOR_PROPERTIES_FIRST))) {
                if (z) {
                    TreeMap treeMap2 = new TreeMap();
                    Iterator<zj4> it3 = this.f10060k.iterator();
                    while (it3.hasNext()) {
                        zj4 next3 = it3.next();
                        treeMap2.put(next3.getName(), next3);
                    }
                    collection = treeMap2.values();
                } else {
                    collection = this.f10060k;
                }
                for (zj4 zj44 : collection) {
                    String name = zj44.getName();
                    if (map2.containsKey(name)) {
                        linkedHashMap.put(name, zj44);
                    }
                }
            }
            linkedHashMap.putAll(map2);
            map.clear();
            map.putAll(linkedHashMap);
        }
    }

    /* renamed from: x */
    public void mo16112x() {
        LinkedHashMap<String, zj4> linkedHashMap = new LinkedHashMap<>();
        mo16092d(linkedHashMap);
        mo16095g(linkedHashMap);
        if (!this.f10054e.mo16050m()) {
            mo16091c(linkedHashMap);
        }
        mo16106r(linkedHashMap);
        mo16105q(linkedHashMap);
        mo16107s(linkedHashMap);
        mo16094f(linkedHashMap);
        for (zj4 x0 : linkedHashMap.values()) {
            x0.mo28499x0(this.f10052c);
        }
        PropertyNamingStrategy m = mo16101m();
        if (m != null) {
            mo16108t(linkedHashMap, m);
        }
        for (zj4 C0 : linkedHashMap.values()) {
            C0.mo28457C0();
        }
        if (this.f10050a.isEnabled(MapperFeature.USE_WRAPPER_NAME_AS_PROPERTY_NAME)) {
            mo16109u(linkedHashMap);
        }
        mo16111w(linkedHashMap);
        this.f10059j = linkedHashMap;
        this.f10058i = true;
    }

    /* renamed from: y */
    public AnnotatedMember mo16113y() {
        if (!this.f10058i) {
            mo16112x();
        }
        LinkedList<AnnotatedMember> linkedList = this.f10063n;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1) {
            mo16089N("Multiple 'any-getter' fields defined (%s vs %s)", this.f10063n.get(0), this.f10063n.get(1));
        }
        return this.f10063n.getFirst();
    }

    /* renamed from: z */
    public AnnotatedMember mo16114z() {
        if (!this.f10058i) {
            mo16112x();
        }
        LinkedList<AnnotatedMember> linkedList = this.f10062m;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1) {
            mo16089N("Multiple 'any-getter' methods defined (%s vs %s)", this.f10062m.get(0), this.f10062m.get(1));
        }
        return this.f10062m.getFirst();
    }

    @Deprecated
    public C2032h(MapperConfig<?> mapperConfig, boolean z, JavaType javaType, C2021a aVar, String str) {
        this(mapperConfig, z, javaType, aVar, m14231a(mapperConfig, aVar, str));
        this.f10071v = str;
    }
}
