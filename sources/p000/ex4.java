package p000;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;

/* renamed from: ex4 */
/* compiled from: PropertyBuilder */
public class ex4 {

    /* renamed from: g */
    public static final Object f11381g = Boolean.FALSE;

    /* renamed from: a */
    public final SerializationConfig f11382a;

    /* renamed from: b */
    public final n00 f11383b;

    /* renamed from: c */
    public final AnnotationIntrospector f11384c;

    /* renamed from: d */
    public Object f11385d;

    /* renamed from: e */
    public final JsonInclude.Value f11386e;

    /* renamed from: f */
    public final boolean f11387f;

    /* renamed from: ex4$a */
    /* compiled from: PropertyBuilder */
    public static /* synthetic */ class C2254a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f11388a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.fasterxml.jackson.annotation.JsonInclude$Include[] r0 = com.fasterxml.jackson.annotation.JsonInclude.Include.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11388a = r0
                com.fasterxml.jackson.annotation.JsonInclude$Include r1 = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_DEFAULT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f11388a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fasterxml.jackson.annotation.JsonInclude$Include r1 = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_ABSENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f11388a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.fasterxml.jackson.annotation.JsonInclude$Include r1 = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f11388a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.fasterxml.jackson.annotation.JsonInclude$Include r1 = com.fasterxml.jackson.annotation.JsonInclude.Include.CUSTOM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f11388a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.fasterxml.jackson.annotation.JsonInclude$Include r1 = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f11388a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.fasterxml.jackson.annotation.JsonInclude$Include r1 = com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.ex4.C2254a.<clinit>():void");
        }
    }

    public ex4(SerializationConfig serializationConfig, n00 n00) {
        boolean z;
        this.f11382a = serializationConfig;
        this.f11383b = n00;
        JsonInclude.Value merge = JsonInclude.Value.merge(n00.mo23458p(JsonInclude.Value.empty()), serializationConfig.getDefaultPropertyInclusion(n00.mo23460r(), JsonInclude.Value.empty()));
        this.f11386e = JsonInclude.Value.merge(serializationConfig.getDefaultPropertyInclusion(), merge);
        if (merge.getValueInclusion() == JsonInclude.Include.NON_DEFAULT) {
            z = true;
        } else {
            z = false;
        }
        this.f11387f = z;
        this.f11384c = serializationConfig.getAnnotationIntrospector();
    }

    /* renamed from: a */
    public BeanPropertyWriter mo19508a(q00 q00, AnnotatedMember annotatedMember, C2236em emVar, JavaType javaType, y63<?> y63, m17 m17, JavaType javaType2, boolean z, Object obj, Class<?>[] clsArr) throws JsonMappingException {
        return new BeanPropertyWriter(q00, annotatedMember, emVar, javaType, y63, m17, javaType2, z, obj, clsArr);
    }

    /* renamed from: b */
    public Object mo19509b(Exception exc, String str, Object obj) {
        while (true) {
            Throwable cause = r3.getCause();
            Throwable th = exc;
            if (cause != null) {
                th = th.getCause();
            } else {
                wf0.m29515h0(th);
                wf0.m29519j0(th);
                throw new IllegalArgumentException("Failed to get property '" + str + "' of default " + obj.getClass().getName() + " instance");
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:68:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.ser.BeanPropertyWriter mo19510c(p000.zw5 r16, p000.q00 r17, com.fasterxml.jackson.databind.JavaType r18, p000.y63<?> r19, p000.m17 r20, p000.m17 r21, com.fasterxml.jackson.databind.introspect.AnnotatedMember r22, boolean r23) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r15 = this;
            r12 = r15
            r13 = r16
            r2 = r17
            r5 = r18
            r0 = r21
            r14 = r22
            r1 = 0
            r3 = r23
            com.fasterxml.jackson.databind.JavaType r3 = r15.mo19511d(r14, r3, r5)     // Catch:{ JsonMappingException -> 0x0152 }
            if (r0 == 0) goto L_0x0043
            if (r3 != 0) goto L_0x0017
            r3 = r5
        L_0x0017:
            com.fasterxml.jackson.databind.JavaType r4 = r3.getContentType()
            if (r4 != 0) goto L_0x003a
            n00 r4 = r12.f11383b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "serialization type "
            r6.append(r7)
            r6.append(r3)
            java.lang.String r7 = " has no content"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.Object[] r7 = new java.lang.Object[r1]
            r13.reportBadPropertyDefinition(r4, r2, r6, r7)
        L_0x003a:
            com.fasterxml.jackson.databind.JavaType r0 = r3.withContentTypeHandler(r0)
            r0.getContentType()
            r8 = r0
            goto L_0x0044
        L_0x0043:
            r8 = r3
        L_0x0044:
            r3 = 0
            if (r8 != 0) goto L_0x0049
            r0 = r5
            goto L_0x004a
        L_0x0049:
            r0 = r8
        L_0x004a:
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r4 = r17.mo24887l()
            if (r4 != 0) goto L_0x005d
            n00 r0 = r12.f11383b
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r3 = "could not determine property type"
            java.lang.Object r0 = r13.reportBadPropertyDefinition(r0, r2, r3, r1)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter r0 = (com.fasterxml.jackson.databind.ser.BeanPropertyWriter) r0
            return r0
        L_0x005d:
            java.lang.Class r4 = r4.getRawType()
            com.fasterxml.jackson.databind.SerializationConfig r6 = r12.f11382a
            java.lang.Class r7 = r0.getRawClass()
            com.fasterxml.jackson.annotation.JsonInclude$Value r9 = r12.f11386e
            com.fasterxml.jackson.annotation.JsonInclude$Value r4 = r6.getDefaultInclusion(r7, r4, r9)
            com.fasterxml.jackson.annotation.JsonInclude$Value r6 = r17.mo24879e()
            com.fasterxml.jackson.annotation.JsonInclude$Value r4 = r4.withOverrides(r6)
            com.fasterxml.jackson.annotation.JsonInclude$Include r6 = r4.getValueInclusion()
            com.fasterxml.jackson.annotation.JsonInclude$Include r7 = com.fasterxml.jackson.annotation.JsonInclude.Include.USE_DEFAULTS
            if (r6 != r7) goto L_0x007f
            com.fasterxml.jackson.annotation.JsonInclude$Include r6 = com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS
        L_0x007f:
            int[] r7 = p000.ex4.C2254a.f11388a
            int r6 = r6.ordinal()
            r6 = r7[r6]
            r7 = 1
            if (r6 == r7) goto L_0x00d1
            r9 = 2
            if (r6 == r9) goto L_0x00c5
            r9 = 3
            if (r6 == r9) goto L_0x00c1
            r9 = 4
            if (r6 == r9) goto L_0x00af
            r4 = 5
            if (r6 == r4) goto L_0x0097
            goto L_0x0098
        L_0x0097:
            r1 = r7
        L_0x0098:
            com.fasterxml.jackson.databind.SerializationFeature r4 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_EMPTY_JSON_ARRAYS
            boolean r0 = r0.isContainerType()
            if (r0 == 0) goto L_0x00ab
            com.fasterxml.jackson.databind.SerializationConfig r0 = r12.f11382a
            boolean r0 = r0.isEnabled(r4)
            if (r0 != 0) goto L_0x00ab
            java.lang.Object r0 = com.fasterxml.jackson.databind.ser.BeanPropertyWriter.MARKER_FOR_EMPTY
            goto L_0x00be
        L_0x00ab:
            r9 = r1
            r10 = r3
            goto L_0x0114
        L_0x00af:
            java.lang.Class r0 = r4.getValueFilter()
            java.lang.Object r0 = r13.includeFilterInstance(r2, r0)
            if (r0 != 0) goto L_0x00ba
            goto L_0x00c3
        L_0x00ba:
            boolean r1 = r13.includeFilterSuppressNulls(r0)
        L_0x00be:
            r10 = r0
            r9 = r1
            goto L_0x0114
        L_0x00c1:
            java.lang.Object r0 = com.fasterxml.jackson.databind.ser.BeanPropertyWriter.MARKER_FOR_EMPTY
        L_0x00c3:
            r10 = r0
            goto L_0x00cf
        L_0x00c5:
            boolean r0 = r0.isReferenceType()
            if (r0 == 0) goto L_0x00ce
            java.lang.Object r0 = com.fasterxml.jackson.databind.ser.BeanPropertyWriter.MARKER_FOR_EMPTY
            goto L_0x00c3
        L_0x00ce:
            r10 = r3
        L_0x00cf:
            r9 = r7
            goto L_0x0114
        L_0x00d1:
            boolean r4 = r12.f11387f
            if (r4 == 0) goto L_0x00fd
            java.lang.Object r4 = r15.mo19512e()
            if (r4 == 0) goto L_0x00fd
            com.fasterxml.jackson.databind.MapperFeature r0 = com.fasterxml.jackson.databind.MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS
            boolean r0 = r13.isEnabled((com.fasterxml.jackson.databind.MapperFeature) r0)
            if (r0 == 0) goto L_0x00ee
            com.fasterxml.jackson.databind.SerializationConfig r0 = r12.f11382a
            com.fasterxml.jackson.databind.MapperFeature r6 = com.fasterxml.jackson.databind.MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS
            boolean r0 = r0.isEnabled(r6)
            r14.fixAccess(r0)
        L_0x00ee:
            java.lang.Object r3 = r14.getValue(r4)     // Catch:{ Exception -> 0x00f3 }
            goto L_0x0102
        L_0x00f3:
            r0 = move-exception
            r6 = r0
            java.lang.String r0 = r17.getName()
            r15.mo19509b(r6, r0, r4)
            goto L_0x0102
        L_0x00fd:
            java.lang.Object r3 = p000.t00.m27231b(r0)
            r1 = r7
        L_0x0102:
            if (r3 != 0) goto L_0x0105
            goto L_0x00ce
        L_0x0105:
            java.lang.Class r0 = r3.getClass()
            boolean r0 = r0.isArray()
            if (r0 == 0) goto L_0x00ab
            java.lang.Object r0 = p000.C2103cq.m14359b(r3)
            goto L_0x00be
        L_0x0114:
            java.lang.Class[] r0 = r17.mo24886i()
            if (r0 != 0) goto L_0x0120
            n00 r0 = r12.f11383b
            java.lang.Class[] r0 = r0.mo23447e()
        L_0x0120:
            r11 = r0
            n00 r0 = r12.f11383b
            em r4 = r0.mo23461s()
            r1 = r15
            r2 = r17
            r3 = r22
            r5 = r18
            r6 = r19
            r7 = r20
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter r0 = r1.mo19508a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            com.fasterxml.jackson.databind.AnnotationIntrospector r1 = r12.f11384c
            java.lang.Object r1 = r1.findNullSerializer(r14)
            if (r1 == 0) goto L_0x0145
            y63 r1 = r13.serializerInstance(r14, r1)
            r0.assignNullSerializer(r1)
        L_0x0145:
            com.fasterxml.jackson.databind.AnnotationIntrospector r1 = r12.f11384c
            com.fasterxml.jackson.databind.util.NameTransformer r1 = r1.findUnwrappingNameTransformer(r14)
            if (r1 == 0) goto L_0x0151
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter r0 = r0.unwrappingWriter(r1)
        L_0x0151:
            return r0
        L_0x0152:
            r0 = move-exception
            r3 = r0
            if (r2 != 0) goto L_0x0161
            java.lang.String r0 = p000.wf0.m29528o(r3)
            java.lang.Object r0 = r13.reportBadDefinition(r5, r0)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter r0 = (com.fasterxml.jackson.databind.ser.BeanPropertyWriter) r0
            return r0
        L_0x0161:
            n00 r0 = r12.f11383b
            java.lang.String r3 = p000.wf0.m29528o(r3)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Object r0 = r13.reportBadPropertyDefinition(r0, r2, r3, r1)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter r0 = (com.fasterxml.jackson.databind.ser.BeanPropertyWriter) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ex4.mo19510c(zw5, q00, com.fasterxml.jackson.databind.JavaType, y63, m17, m17, com.fasterxml.jackson.databind.introspect.AnnotatedMember, boolean):com.fasterxml.jackson.databind.ser.BeanPropertyWriter");
    }

    /* renamed from: d */
    public JavaType mo19511d(C2911nl nlVar, boolean z, JavaType javaType) throws JsonMappingException {
        JavaType refineSerializationType = this.f11384c.refineSerializationType(this.f11382a, nlVar, javaType);
        boolean z2 = true;
        if (refineSerializationType != javaType) {
            Class<?> rawClass = refineSerializationType.getRawClass();
            Class<?> rawClass2 = javaType.getRawClass();
            if (!rawClass.isAssignableFrom(rawClass2) && !rawClass2.isAssignableFrom(rawClass)) {
                throw new IllegalArgumentException("Illegal concrete-type annotation for method '" + nlVar.getName() + "': class " + rawClass.getName() + " not a super-type of (declared) class " + rawClass2.getName());
            }
            javaType = refineSerializationType;
            z = true;
        }
        JsonSerialize.Typing findSerializationTyping = this.f11384c.findSerializationTyping(nlVar);
        if (!(findSerializationTyping == null || findSerializationTyping == JsonSerialize.Typing.DEFAULT_TYPING)) {
            if (findSerializationTyping != JsonSerialize.Typing.STATIC) {
                z2 = false;
            }
            z = z2;
        }
        if (z) {
            return javaType.withStaticTyping();
        }
        return null;
    }

    /* renamed from: e */
    public Object mo19512e() {
        Object obj = this.f11385d;
        if (obj == null) {
            obj = this.f11383b.mo23441C(this.f11382a.canOverrideAccessModifiers());
            if (obj == null) {
                obj = f11381g;
            }
            this.f11385d = obj;
        }
        if (obj == f11381g) {
            return null;
        }
        return this.f11385d;
    }
}
