package p000;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: z16 */
/* compiled from: SimpleBeanPropertyDefinition */
public class z16 extends q00 {

    /* renamed from: d */
    public final AnnotationIntrospector f20440d;

    /* renamed from: e */
    public final AnnotatedMember f20441e;

    /* renamed from: g */
    public final PropertyMetadata f20442g;

    /* renamed from: k */
    public final PropertyName f20443k;

    /* renamed from: r */
    public final JsonInclude.Value f20444r;

    public z16(AnnotationIntrospector annotationIntrospector, AnnotatedMember annotatedMember, PropertyName propertyName, PropertyMetadata propertyMetadata, JsonInclude.Value value) {
        this.f20440d = annotationIntrospector;
        this.f20441e = annotatedMember;
        this.f20443k = propertyName;
        this.f20442g = propertyMetadata == null ? PropertyMetadata.STD_OPTIONAL : propertyMetadata;
        this.f20444r = value;
    }

    /* renamed from: H */
    public static z16 m30927H(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, PropertyName propertyName) {
        return m30929J(mapperConfig, annotatedMember, propertyName, (PropertyMetadata) null, q00.f16712a);
    }

    /* renamed from: I */
    public static z16 m30928I(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, PropertyName propertyName, PropertyMetadata propertyMetadata, JsonInclude.Include include) {
        JsonInclude.Value value;
        if (include == null || include == JsonInclude.Include.USE_DEFAULTS) {
            value = q00.f16712a;
        } else {
            value = JsonInclude.Value.construct(include, (JsonInclude.Include) null);
        }
        return new z16(mapperConfig.getAnnotationIntrospector(), annotatedMember, propertyName, propertyMetadata, value);
    }

    /* renamed from: J */
    public static z16 m30929J(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, PropertyName propertyName, PropertyMetadata propertyMetadata, JsonInclude.Value value) {
        return new z16(mapperConfig.getAnnotationIntrospector(), annotatedMember, propertyName, propertyMetadata, value);
    }

    /* renamed from: B */
    public boolean mo24871B() {
        return this.f20441e instanceof AnnotatedField;
    }

    /* renamed from: C */
    public boolean mo24872C(PropertyName propertyName) {
        return this.f20443k.equals(propertyName);
    }

    /* renamed from: D */
    public boolean mo24873D() {
        if (mo24897y() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: E */
    public boolean mo24874E() {
        return false;
    }

    /* renamed from: F */
    public boolean mo24875F() {
        return false;
    }

    /* renamed from: e */
    public JsonInclude.Value mo24879e() {
        return this.f20444r;
    }

    public PropertyName getFullName() {
        return this.f20443k;
    }

    public PropertyMetadata getMetadata() {
        return this.f20442g;
    }

    public String getName() {
        return this.f20443k.getSimpleName();
    }

    public PropertyName getWrapperName() {
        AnnotatedMember annotatedMember;
        AnnotationIntrospector annotationIntrospector = this.f20440d;
        if (annotationIntrospector == null || (annotatedMember = this.f20441e) == null) {
            return null;
        }
        return annotationIntrospector.findWrapperName(annotatedMember);
    }

    /* renamed from: m */
    public AnnotatedParameter mo24888m() {
        AnnotatedMember annotatedMember = this.f20441e;
        if (annotatedMember instanceof AnnotatedParameter) {
            return (AnnotatedParameter) annotatedMember;
        }
        return null;
    }

    /* renamed from: o */
    public Iterator<AnnotatedParameter> mo24889o() {
        AnnotatedParameter m = mo24888m();
        if (m == null) {
            return wf0.m29526n();
        }
        return Collections.singleton(m).iterator();
    }

    /* renamed from: p */
    public AnnotatedField mo24890p() {
        AnnotatedMember annotatedMember = this.f20441e;
        if (annotatedMember instanceof AnnotatedField) {
            return (AnnotatedField) annotatedMember;
        }
        return null;
    }

    /* renamed from: r */
    public AnnotatedMethod mo24891r() {
        AnnotatedMember annotatedMember = this.f20441e;
        if (!(annotatedMember instanceof AnnotatedMethod) || ((AnnotatedMethod) annotatedMember).getParameterCount() != 0) {
            return null;
        }
        return (AnnotatedMethod) this.f20441e;
    }

    /* renamed from: v */
    public AnnotatedMember mo24894v() {
        return this.f20441e;
    }

    /* renamed from: w */
    public JavaType mo24895w() {
        AnnotatedMember annotatedMember = this.f20441e;
        if (annotatedMember == null) {
            return TypeFactory.unknownType();
        }
        return annotatedMember.getType();
    }

    /* renamed from: x */
    public Class<?> mo24896x() {
        AnnotatedMember annotatedMember = this.f20441e;
        if (annotatedMember == null) {
            return Object.class;
        }
        return annotatedMember.getRawType();
    }

    /* renamed from: y */
    public AnnotatedMethod mo24897y() {
        AnnotatedMember annotatedMember = this.f20441e;
        if (!(annotatedMember instanceof AnnotatedMethod) || ((AnnotatedMethod) annotatedMember).getParameterCount() != 1) {
            return null;
        }
        return (AnnotatedMethod) this.f20441e;
    }

    /* renamed from: z */
    public boolean mo24898z() {
        return this.f20441e instanceof AnnotatedParameter;
    }
}
