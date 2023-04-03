package p000;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import java.util.Iterator;

/* renamed from: q00 */
/* compiled from: BeanPropertyDefinition */
public abstract class q00 implements y24 {

    /* renamed from: a */
    public static final JsonInclude.Value f16712a = JsonInclude.Value.empty();

    /* renamed from: B */
    public abstract boolean mo24871B();

    /* renamed from: C */
    public boolean mo24872C(PropertyName propertyName) {
        return getFullName().equals(propertyName);
    }

    /* renamed from: D */
    public abstract boolean mo24873D();

    /* renamed from: E */
    public abstract boolean mo24874E();

    /* renamed from: F */
    public boolean mo24875F() {
        return mo24874E();
    }

    /* renamed from: G */
    public boolean mo24876G() {
        return false;
    }

    /* renamed from: a */
    public boolean mo24877a() {
        if (mo24892t() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public boolean mo24878d() {
        if (mo24887l() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public abstract JsonInclude.Value mo24879e();

    /* renamed from: f */
    public bf4 mo24880f() {
        return null;
    }

    /* renamed from: g */
    public String mo24881g() {
        AnnotationIntrospector.ReferenceProperty h = mo24885h();
        if (h == null) {
            return null;
        }
        return h.mo14221b();
    }

    public abstract PropertyName getFullName();

    public abstract PropertyMetadata getMetadata();

    public abstract String getName();

    public abstract PropertyName getWrapperName();

    /* renamed from: h */
    public AnnotationIntrospector.ReferenceProperty mo24885h() {
        return null;
    }

    /* renamed from: i */
    public Class<?>[] mo24886i() {
        return null;
    }

    /* renamed from: l */
    public AnnotatedMember mo24887l() {
        AnnotatedMethod r = mo24891r();
        if (r == null) {
            return mo24890p();
        }
        return r;
    }

    /* renamed from: m */
    public abstract AnnotatedParameter mo24888m();

    /* renamed from: o */
    public Iterator<AnnotatedParameter> mo24889o() {
        return wf0.m29526n();
    }

    /* renamed from: p */
    public abstract AnnotatedField mo24890p();

    /* renamed from: r */
    public abstract AnnotatedMethod mo24891r();

    /* renamed from: t */
    public AnnotatedMember mo24892t() {
        AnnotatedParameter m = mo24888m();
        if (m != null) {
            return m;
        }
        AnnotatedMethod y = mo24897y();
        if (y == null) {
            return mo24890p();
        }
        return y;
    }

    /* renamed from: u */
    public AnnotatedMember mo24893u() {
        AnnotatedMethod y = mo24897y();
        if (y == null) {
            return mo24890p();
        }
        return y;
    }

    /* renamed from: v */
    public abstract AnnotatedMember mo24894v();

    /* renamed from: w */
    public abstract JavaType mo24895w();

    /* renamed from: x */
    public abstract Class<?> mo24896x();

    /* renamed from: y */
    public abstract AnnotatedMethod mo24897y();

    /* renamed from: z */
    public abstract boolean mo24898z();
}
