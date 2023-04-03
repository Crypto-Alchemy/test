package p000;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.std.StdValueInstantiator;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import java.lang.reflect.Member;
import java.util.HashMap;

/* renamed from: bw0 */
/* compiled from: CreatorCollector */
public class bw0 {

    /* renamed from: j */
    public static final String[] f8273j = {"default", "from-String", "from-int", "from-long", "from-big-integer", "from-double", "from-big-decimal", "from-boolean", "delegate", "property-based", "array-delegate"};

    /* renamed from: a */
    public final n00 f8274a;

    /* renamed from: b */
    public final boolean f8275b;

    /* renamed from: c */
    public final boolean f8276c;

    /* renamed from: d */
    public final AnnotatedWithParams[] f8277d = new AnnotatedWithParams[11];

    /* renamed from: e */
    public int f8278e = 0;

    /* renamed from: f */
    public boolean f8279f = false;

    /* renamed from: g */
    public SettableBeanProperty[] f8280g;

    /* renamed from: h */
    public SettableBeanProperty[] f8281h;

    /* renamed from: i */
    public SettableBeanProperty[] f8282i;

    public bw0(n00 n00, MapperConfig<?> mapperConfig) {
        this.f8274a = n00;
        this.f8275b = mapperConfig.canOverrideAccessModifiers();
        this.f8276c = mapperConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS);
    }

    /* renamed from: a */
    public final JavaType mo11895a(DeserializationContext deserializationContext, AnnotatedWithParams annotatedWithParams, SettableBeanProperty[] settableBeanPropertyArr) throws JsonMappingException {
        if (!this.f8279f || annotatedWithParams == null) {
            return null;
        }
        int i = 0;
        if (settableBeanPropertyArr != null) {
            int length = settableBeanPropertyArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (settableBeanPropertyArr[i2] == null) {
                    i = i2;
                    break;
                } else {
                    i2++;
                }
            }
        }
        DeserializationConfig config = deserializationContext.getConfig();
        JavaType parameterType = annotatedWithParams.getParameterType(i);
        AnnotationIntrospector annotationIntrospector = config.getAnnotationIntrospector();
        if (annotationIntrospector == null) {
            return parameterType;
        }
        AnnotatedParameter parameter = annotatedWithParams.getParameter(i);
        Object findDeserializer = annotationIntrospector.findDeserializer(parameter);
        if (findDeserializer != null) {
            return parameterType.withValueHandler(deserializationContext.deserializerInstance(parameter, findDeserializer));
        }
        return annotationIntrospector.refineDeserializationType(config, parameter, parameterType);
    }

    /* renamed from: b */
    public final <T extends AnnotatedMember> T mo11896b(T t) {
        if (t != null && this.f8275b) {
            wf0.m29512g((Member) t.getAnnotated(), this.f8276c);
        }
        return t;
    }

    /* renamed from: c */
    public boolean mo11897c(AnnotatedWithParams annotatedWithParams) {
        if (!wf0.m29485L(annotatedWithParams.getDeclaringClass()) || !"valueOf".equals(annotatedWithParams.getName())) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public void mo11898d(int i, boolean z, AnnotatedWithParams annotatedWithParams, AnnotatedWithParams annotatedWithParams2) {
        String str;
        Object[] objArr = new Object[4];
        objArr[0] = f8273j[i];
        if (z) {
            str = "explicitly marked";
        } else {
            str = "implicitly discovered";
        }
        objArr[1] = str;
        objArr[2] = annotatedWithParams;
        objArr[3] = annotatedWithParams2;
        throw new IllegalArgumentException(String.format("Conflicting %s creators: already had %s creator %s, encountered another: %s", objArr));
    }

    /* renamed from: e */
    public void mo11899e(AnnotatedWithParams annotatedWithParams, boolean z) {
        mo11913s(annotatedWithParams, 6, z);
    }

    /* renamed from: f */
    public void mo11900f(AnnotatedWithParams annotatedWithParams, boolean z) {
        mo11913s(annotatedWithParams, 4, z);
    }

    /* renamed from: g */
    public void mo11901g(AnnotatedWithParams annotatedWithParams, boolean z) {
        mo11913s(annotatedWithParams, 7, z);
    }

    /* renamed from: h */
    public void mo11902h(AnnotatedWithParams annotatedWithParams, boolean z, SettableBeanProperty[] settableBeanPropertyArr, int i) {
        if (annotatedWithParams.getParameterType(i).isCollectionLikeType()) {
            if (mo11913s(annotatedWithParams, 10, z)) {
                this.f8281h = settableBeanPropertyArr;
            }
        } else if (mo11913s(annotatedWithParams, 8, z)) {
            this.f8280g = settableBeanPropertyArr;
        }
    }

    /* renamed from: i */
    public void mo11903i(AnnotatedWithParams annotatedWithParams, boolean z) {
        mo11913s(annotatedWithParams, 5, z);
    }

    /* renamed from: j */
    public void mo11904j(AnnotatedWithParams annotatedWithParams, boolean z) {
        mo11913s(annotatedWithParams, 2, z);
    }

    /* renamed from: k */
    public void mo11905k(AnnotatedWithParams annotatedWithParams, boolean z) {
        mo11913s(annotatedWithParams, 3, z);
    }

    /* renamed from: l */
    public void mo11906l(AnnotatedWithParams annotatedWithParams, boolean z, SettableBeanProperty[] settableBeanPropertyArr) {
        Integer num;
        if (mo11913s(annotatedWithParams, 9, z)) {
            if (settableBeanPropertyArr.length > 1) {
                HashMap hashMap = new HashMap();
                int length = settableBeanPropertyArr.length;
                for (int i = 0; i < length; i++) {
                    String name = settableBeanPropertyArr[i].getName();
                    if ((!name.isEmpty() || settableBeanPropertyArr[i].getInjectableValueId() == null) && (num = (Integer) hashMap.put(name, Integer.valueOf(i))) != null) {
                        throw new IllegalArgumentException(String.format("Duplicate creator property \"%s\" (index %s vs %d) for type %s ", new Object[]{name, num, Integer.valueOf(i), wf0.m29497X(this.f8274a.mo23460r())}));
                    }
                }
            }
            this.f8282i = settableBeanPropertyArr;
        }
    }

    /* renamed from: m */
    public void mo11907m(AnnotatedWithParams annotatedWithParams, boolean z) {
        mo11913s(annotatedWithParams, 1, z);
    }

    /* renamed from: n */
    public ValueInstantiator mo11908n(DeserializationContext deserializationContext) throws JsonMappingException {
        DeserializationConfig config = deserializationContext.getConfig();
        JavaType a = mo11895a(deserializationContext, this.f8277d[8], this.f8280g);
        JavaType a2 = mo11895a(deserializationContext, this.f8277d[10], this.f8281h);
        StdValueInstantiator stdValueInstantiator = new StdValueInstantiator(config, this.f8274a.mo23439A());
        AnnotatedWithParams[] annotatedWithParamsArr = this.f8277d;
        stdValueInstantiator.configureFromObjectSettings(annotatedWithParamsArr[0], annotatedWithParamsArr[8], a, this.f8280g, annotatedWithParamsArr[9], this.f8282i);
        stdValueInstantiator.configureFromArraySettings(this.f8277d[10], a2, this.f8281h);
        stdValueInstantiator.configureFromStringCreator(this.f8277d[1]);
        stdValueInstantiator.configureFromIntCreator(this.f8277d[2]);
        stdValueInstantiator.configureFromLongCreator(this.f8277d[3]);
        stdValueInstantiator.configureFromBigIntegerCreator(this.f8277d[4]);
        stdValueInstantiator.configureFromDoubleCreator(this.f8277d[5]);
        stdValueInstantiator.configureFromBigDecimalCreator(this.f8277d[6]);
        stdValueInstantiator.configureFromBooleanCreator(this.f8277d[7]);
        return stdValueInstantiator;
    }

    /* renamed from: o */
    public boolean mo11909o() {
        if (this.f8277d[0] != null) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public boolean mo11910p() {
        if (this.f8277d[8] != null) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public boolean mo11911q() {
        if (this.f8277d[9] != null) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public void mo11912r(AnnotatedWithParams annotatedWithParams) {
        this.f8277d[0] = (AnnotatedWithParams) mo11896b(annotatedWithParams);
    }

    /* renamed from: s */
    public boolean mo11913s(AnnotatedWithParams annotatedWithParams, int i, boolean z) {
        boolean z2;
        int i2 = 1 << i;
        this.f8279f = true;
        AnnotatedWithParams annotatedWithParams2 = this.f8277d[i];
        if (annotatedWithParams2 != null) {
            if ((this.f8278e & i2) == 0) {
                z2 = !z;
            } else if (!z) {
                return false;
            } else {
                z2 = true;
            }
            if (z2 && annotatedWithParams2.getClass() == annotatedWithParams.getClass()) {
                Class<?> rawParameterType = annotatedWithParams2.getRawParameterType(0);
                Class<?> rawParameterType2 = annotatedWithParams.getRawParameterType(0);
                if (rawParameterType == rawParameterType2) {
                    if (mo11897c(annotatedWithParams)) {
                        return false;
                    }
                    if (!mo11897c(annotatedWithParams2)) {
                        mo11898d(i, z, annotatedWithParams2, annotatedWithParams);
                    }
                } else if (rawParameterType2.isAssignableFrom(rawParameterType)) {
                    return false;
                } else {
                    if (!rawParameterType.isAssignableFrom(rawParameterType2)) {
                        if (rawParameterType.isPrimitive() == rawParameterType2.isPrimitive()) {
                            mo11898d(i, z, annotatedWithParams2, annotatedWithParams);
                        } else if (rawParameterType.isPrimitive()) {
                            return false;
                        }
                    }
                }
            }
        }
        if (z) {
            this.f8278e |= i2;
        }
        this.f8277d[i] = (AnnotatedWithParams) mo11896b(annotatedWithParams);
        return true;
    }
}
