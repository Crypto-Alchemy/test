package p000;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.AbstractDeserializer;
import com.fasterxml.jackson.databind.deser.BeanDeserializer;
import com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer;
import com.fasterxml.jackson.databind.deser.SettableAnyProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty;
import com.fasterxml.jackson.databind.deser.impl.ValueInjector;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.util.IgnorePropertiesUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p000.k53;

/* renamed from: o00 */
/* compiled from: BeanDeserializerBuilder */
public class o00 {

    /* renamed from: a */
    public final DeserializationConfig f15754a;

    /* renamed from: b */
    public final DeserializationContext f15755b;

    /* renamed from: c */
    public final n00 f15756c;

    /* renamed from: d */
    public final Map<String, SettableBeanProperty> f15757d = new LinkedHashMap();

    /* renamed from: e */
    public List<ValueInjector> f15758e;

    /* renamed from: f */
    public HashMap<String, SettableBeanProperty> f15759f;

    /* renamed from: g */
    public HashSet<String> f15760g;

    /* renamed from: h */
    public HashSet<String> f15761h;

    /* renamed from: i */
    public ValueInstantiator f15762i;

    /* renamed from: j */
    public ObjectIdReader f15763j;

    /* renamed from: k */
    public SettableAnyProperty f15764k;

    /* renamed from: l */
    public boolean f15765l;

    /* renamed from: m */
    public AnnotatedMethod f15766m;

    /* renamed from: n */
    public k53.C2643a f15767n;

    public o00(n00 n00, DeserializationContext deserializationContext) {
        this.f15756c = n00;
        this.f15755b = deserializationContext;
        this.f15754a = deserializationContext.getConfig();
    }

    /* renamed from: A */
    public void mo23848A(ValueInstantiator valueInstantiator) {
        this.f15762i = valueInstantiator;
    }

    /* renamed from: a */
    public Map<String, List<PropertyName>> mo23849a(Collection<SettableBeanProperty> collection) {
        AnnotationIntrospector annotationIntrospector = this.f15754a.getAnnotationIntrospector();
        HashMap hashMap = null;
        if (annotationIntrospector != null) {
            for (SettableBeanProperty next : collection) {
                List<PropertyName> findPropertyAliases = annotationIntrospector.findPropertyAliases(next.getMember());
                if (findPropertyAliases != null && !findPropertyAliases.isEmpty()) {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    hashMap.put(next.getName(), findPropertyAliases);
                }
            }
        }
        if (hashMap == null) {
            return Collections.emptyMap();
        }
        return hashMap;
    }

    /* renamed from: b */
    public boolean mo23850b() {
        Boolean feature = this.f15756c.mo23449g((JsonFormat.Value) null).getFeature(JsonFormat.Feature.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
        if (feature == null) {
            return this.f15754a.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
        }
        return feature.booleanValue();
    }

    /* renamed from: c */
    public void mo23851c(Collection<SettableBeanProperty> collection) throws JsonMappingException {
        if (this.f15754a.canOverrideAccessModifiers()) {
            for (SettableBeanProperty fixAccess : collection) {
                try {
                    fixAccess.fixAccess(this.f15754a);
                } catch (IllegalArgumentException e) {
                    mo23852d(e);
                }
            }
        }
        SettableAnyProperty settableAnyProperty = this.f15764k;
        if (settableAnyProperty != null) {
            try {
                settableAnyProperty.fixAccess(this.f15754a);
            } catch (IllegalArgumentException e2) {
                mo23852d(e2);
            }
        }
        AnnotatedMethod annotatedMethod = this.f15766m;
        if (annotatedMethod != null) {
            try {
                annotatedMethod.fixAccess(this.f15754a.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
            } catch (IllegalArgumentException e3) {
                mo23852d(e3);
            }
        }
    }

    /* renamed from: d */
    public void mo23852d(IllegalArgumentException illegalArgumentException) throws JsonMappingException {
        try {
            this.f15755b.reportBadTypeDefinition(this.f15756c, illegalArgumentException.getMessage(), new Object[0]);
        } catch (DatabindException e) {
            if (e.getCause() == null) {
                e.initCause(illegalArgumentException);
            }
            throw e;
        }
    }

    /* renamed from: e */
    public void mo23853e(String str, SettableBeanProperty settableBeanProperty) throws JsonMappingException {
        if (this.f15759f == null) {
            this.f15759f = new HashMap<>(4);
        }
        if (this.f15754a.canOverrideAccessModifiers()) {
            try {
                settableBeanProperty.fixAccess(this.f15754a);
            } catch (IllegalArgumentException e) {
                mo23852d(e);
            }
        }
        this.f15759f.put(str, settableBeanProperty);
    }

    /* renamed from: f */
    public void mo23854f(SettableBeanProperty settableBeanProperty) {
        mo23859k(settableBeanProperty);
    }

    /* renamed from: g */
    public void mo23855g(String str) {
        if (this.f15760g == null) {
            this.f15760g = new HashSet<>();
        }
        this.f15760g.add(str);
    }

    /* renamed from: h */
    public void mo23856h(String str) {
        if (this.f15761h == null) {
            this.f15761h = new HashSet<>();
        }
        this.f15761h.add(str);
    }

    /* renamed from: i */
    public void mo23857i(PropertyName propertyName, JavaType javaType, C2236em emVar, AnnotatedMember annotatedMember, Object obj) throws JsonMappingException {
        if (this.f15758e == null) {
            this.f15758e = new ArrayList();
        }
        if (this.f15754a.canOverrideAccessModifiers()) {
            try {
                annotatedMember.fixAccess(this.f15754a.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
            } catch (IllegalArgumentException e) {
                mo23852d(e);
            }
        }
        this.f15758e.add(new ValueInjector(propertyName, javaType, annotatedMember, obj));
    }

    /* renamed from: j */
    public void mo23858j(SettableBeanProperty settableBeanProperty, boolean z) {
        this.f15757d.put(settableBeanProperty.getName(), settableBeanProperty);
    }

    /* renamed from: k */
    public void mo23859k(SettableBeanProperty settableBeanProperty) {
        SettableBeanProperty put = this.f15757d.put(settableBeanProperty.getName(), settableBeanProperty);
        if (put != null && put != settableBeanProperty) {
            throw new IllegalArgumentException("Duplicate property '" + settableBeanProperty.getName() + "' for " + this.f15756c.mo23439A());
        }
    }

    /* renamed from: l */
    public o43<?> mo23860l() throws JsonMappingException {
        boolean z;
        Collection<SettableBeanProperty> values = this.f15757d.values();
        mo23851c(values);
        BeanPropertyMap construct = BeanPropertyMap.construct(this.f15754a, values, mo23849a(values), mo23850b());
        construct.assignIndexes();
        boolean z2 = !this.f15754a.isEnabled(MapperFeature.DEFAULT_VIEW_INCLUSION);
        if (!z2) {
            Iterator<SettableBeanProperty> it = values.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().hasViews()) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = z2;
        if (this.f15763j != null) {
            construct = construct.withProperty(new ObjectIdValueProperty(this.f15763j, PropertyMetadata.STD_REQUIRED));
        }
        return new BeanDeserializer(this, this.f15756c, construct, this.f15759f, this.f15760g, this.f15765l, this.f15761h, z);
    }

    /* renamed from: m */
    public AbstractDeserializer mo23861m() {
        return new AbstractDeserializer(this, this.f15756c, this.f15759f, this.f15757d);
    }

    /* renamed from: n */
    public o43<?> mo23862n(JavaType javaType, String str) throws JsonMappingException {
        AnnotatedMethod annotatedMethod = this.f15766m;
        boolean z = true;
        if (annotatedMethod != null) {
            Class<?> rawReturnType = annotatedMethod.getRawReturnType();
            Class<?> rawClass = javaType.getRawClass();
            if (rawReturnType != rawClass && !rawReturnType.isAssignableFrom(rawClass) && !rawClass.isAssignableFrom(rawReturnType)) {
                this.f15755b.reportBadDefinition(this.f15756c.mo23439A(), String.format("Build method `%s` has wrong return type (%s), not compatible with POJO type (%s)", new Object[]{this.f15766m.getFullName(), wf0.m29539y(rawReturnType), wf0.m29480G(javaType)}));
            }
        } else if (!str.isEmpty()) {
            this.f15755b.reportBadDefinition(this.f15756c.mo23439A(), String.format("Builder class %s does not have build method (name: '%s')", new Object[]{wf0.m29480G(this.f15756c.mo23439A()), str}));
        }
        Collection<SettableBeanProperty> values = this.f15757d.values();
        mo23851c(values);
        BeanPropertyMap construct = BeanPropertyMap.construct(this.f15754a, values, mo23849a(values), mo23850b());
        construct.assignIndexes();
        boolean z2 = !this.f15754a.isEnabled(MapperFeature.DEFAULT_VIEW_INCLUSION);
        if (!z2) {
            Iterator<SettableBeanProperty> it = values.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().hasViews()) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = z2;
        if (this.f15763j != null) {
            construct = construct.withProperty(new ObjectIdValueProperty(this.f15763j, PropertyMetadata.STD_REQUIRED));
        }
        return mo23863o(javaType, construct, z);
    }

    /* renamed from: o */
    public o43<?> mo23863o(JavaType javaType, BeanPropertyMap beanPropertyMap, boolean z) {
        return new BuilderBasedDeserializer(this, this.f15756c, javaType, beanPropertyMap, this.f15759f, this.f15760g, this.f15765l, this.f15761h, z);
    }

    /* renamed from: p */
    public SettableBeanProperty mo23864p(PropertyName propertyName) {
        return this.f15757d.get(propertyName.getSimpleName());
    }

    /* renamed from: q */
    public SettableAnyProperty mo23865q() {
        return this.f15764k;
    }

    /* renamed from: r */
    public AnnotatedMethod mo23866r() {
        return this.f15766m;
    }

    /* renamed from: s */
    public List<ValueInjector> mo23867s() {
        return this.f15758e;
    }

    /* renamed from: t */
    public ObjectIdReader mo23868t() {
        return this.f15763j;
    }

    /* renamed from: u */
    public ValueInstantiator mo23869u() {
        return this.f15762i;
    }

    /* renamed from: v */
    public boolean mo23870v(String str) {
        return IgnorePropertiesUtil.m14343c(str, this.f15760g, this.f15761h);
    }

    /* renamed from: w */
    public void mo23871w(SettableAnyProperty settableAnyProperty) {
        if (this.f15764k == null || settableAnyProperty == null) {
            this.f15764k = settableAnyProperty;
            return;
        }
        throw new IllegalStateException("_anySetter already set to non-null");
    }

    /* renamed from: x */
    public void mo23872x(boolean z) {
        this.f15765l = z;
    }

    /* renamed from: y */
    public void mo23873y(ObjectIdReader objectIdReader) {
        this.f15763j = objectIdReader;
    }

    /* renamed from: z */
    public void mo23874z(AnnotatedMethod annotatedMethod, k53.C2643a aVar) {
        this.f15766m = annotatedMethod;
        this.f15767n = aVar;
    }
}
