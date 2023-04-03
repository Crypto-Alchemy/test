package p000;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.C2021a;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p000.k53;

/* renamed from: n00 */
/* compiled from: BeanDescription */
public abstract class n00 {

    /* renamed from: a */
    public final JavaType f15297a;

    public n00(JavaType javaType) {
        this.f15297a = javaType;
    }

    /* renamed from: A */
    public JavaType mo23439A() {
        return this.f15297a;
    }

    /* renamed from: B */
    public abstract boolean mo23440B();

    /* renamed from: C */
    public abstract Object mo23441C(boolean z);

    /* renamed from: D */
    public boolean mo23442D() {
        return mo23462t().mo16050m();
    }

    /* renamed from: a */
    public abstract AnnotatedMember mo23443a();

    /* renamed from: b */
    public abstract AnnotatedMember mo23444b();

    /* renamed from: c */
    public abstract List<q00> mo23445c();

    /* renamed from: d */
    public abstract AnnotatedConstructor mo23446d();

    /* renamed from: e */
    public abstract Class<?>[] mo23447e();

    /* renamed from: f */
    public abstract ot0<Object, Object> mo23448f();

    /* renamed from: g */
    public abstract JsonFormat.Value mo23449g(JsonFormat.Value value);

    /* renamed from: h */
    public abstract Map<Object, AnnotatedMember> mo23450h();

    /* renamed from: i */
    public abstract AnnotatedMember mo23451i();

    /* renamed from: j */
    public abstract AnnotatedMember mo23452j();

    @Deprecated
    /* renamed from: k */
    public abstract AnnotatedMethod mo23453k();

    /* renamed from: l */
    public abstract AnnotatedMethod mo23454l(String str, Class<?>[] clsArr);

    /* renamed from: m */
    public abstract Class<?> mo23455m();

    /* renamed from: n */
    public abstract k53.C2643a mo23456n();

    /* renamed from: o */
    public abstract List<q00> mo23457o();

    /* renamed from: p */
    public abstract JsonInclude.Value mo23458p(JsonInclude.Value value);

    /* renamed from: q */
    public abstract ot0<Object, Object> mo23459q();

    /* renamed from: r */
    public Class<?> mo23460r() {
        return this.f15297a.getRawClass();
    }

    /* renamed from: s */
    public abstract C2236em mo23461s();

    /* renamed from: t */
    public abstract C2021a mo23462t();

    /* renamed from: u */
    public abstract List<AnnotatedConstructor> mo23463u();

    /* renamed from: v */
    public abstract List<C2968ol<AnnotatedConstructor, JsonCreator.Mode>> mo23464v();

    /* renamed from: w */
    public abstract List<AnnotatedMethod> mo23465w();

    /* renamed from: x */
    public abstract List<C2968ol<AnnotatedMethod, JsonCreator.Mode>> mo23466x();

    /* renamed from: y */
    public abstract Set<String> mo23467y();

    /* renamed from: z */
    public abstract bf4 mo23468z();
}
