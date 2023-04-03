package p000;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: ey1 */
/* compiled from: ExternalTypeHandler */
public class ey1 {

    /* renamed from: a */
    public final JavaType f11446a;

    /* renamed from: b */
    public final C2256b[] f11447b;

    /* renamed from: c */
    public final Map<String, Object> f11448c;

    /* renamed from: d */
    public final String[] f11449d;

    /* renamed from: e */
    public final fr6[] f11450e;

    /* renamed from: ey1$a */
    /* compiled from: ExternalTypeHandler */
    public static class C2255a {

        /* renamed from: a */
        public final JavaType f11451a;

        /* renamed from: b */
        public final List<C2256b> f11452b = new ArrayList();

        /* renamed from: c */
        public final Map<String, Object> f11453c = new HashMap();

        public C2255a(JavaType javaType) {
            this.f11451a = javaType;
        }

        /* renamed from: a */
        public final void mo19544a(String str, Integer num) {
            Object obj = this.f11453c.get(str);
            if (obj == null) {
                this.f11453c.put(str, num);
            } else if (obj instanceof List) {
                ((List) obj).add(num);
            } else {
                LinkedList linkedList = new LinkedList();
                linkedList.add(obj);
                linkedList.add(num);
                this.f11453c.put(str, linkedList);
            }
        }

        /* renamed from: b */
        public void mo19545b(SettableBeanProperty settableBeanProperty, j07 j07) {
            Integer valueOf = Integer.valueOf(this.f11452b.size());
            this.f11452b.add(new C2256b(settableBeanProperty, j07));
            mo19544a(settableBeanProperty.getName(), valueOf);
            mo19544a(j07.getPropertyName(), valueOf);
        }

        /* renamed from: c */
        public ey1 mo19546c(BeanPropertyMap beanPropertyMap) {
            int size = this.f11452b.size();
            C2256b[] bVarArr = new C2256b[size];
            for (int i = 0; i < size; i++) {
                C2256b bVar = this.f11452b.get(i);
                SettableBeanProperty find = beanPropertyMap.find(bVar.mo19550d());
                if (find != null) {
                    bVar.mo19553g(find);
                }
                bVarArr[i] = bVar;
            }
            return new ey1(this.f11451a, bVarArr, this.f11453c, (String[]) null, (fr6[]) null);
        }
    }

    /* renamed from: ey1$b */
    /* compiled from: ExternalTypeHandler */
    public static final class C2256b {

        /* renamed from: a */
        public final SettableBeanProperty f11454a;

        /* renamed from: b */
        public final j07 f11455b;

        /* renamed from: c */
        public final String f11456c;

        /* renamed from: d */
        public SettableBeanProperty f11457d;

        public C2256b(SettableBeanProperty settableBeanProperty, j07 j07) {
            this.f11454a = settableBeanProperty;
            this.f11455b = j07;
            this.f11456c = j07.getPropertyName();
        }

        /* renamed from: a */
        public String mo19547a() {
            Class<?> defaultImpl = this.f11455b.getDefaultImpl();
            if (defaultImpl == null) {
                return null;
            }
            return this.f11455b.getTypeIdResolver().mo25087e((Object) null, defaultImpl);
        }

        /* renamed from: b */
        public SettableBeanProperty mo19548b() {
            return this.f11454a;
        }

        /* renamed from: c */
        public SettableBeanProperty mo19549c() {
            return this.f11457d;
        }

        /* renamed from: d */
        public String mo19550d() {
            return this.f11456c;
        }

        /* renamed from: e */
        public boolean mo19551e() {
            return this.f11455b.hasDefaultImpl();
        }

        /* renamed from: f */
        public boolean mo19552f(String str) {
            return str.equals(this.f11456c);
        }

        /* renamed from: g */
        public void mo19553g(SettableBeanProperty settableBeanProperty) {
            this.f11457d = settableBeanProperty;
        }
    }

    public ey1(JavaType javaType, C2256b[] bVarArr, Map<String, Object> map, String[] strArr, fr6[] fr6Arr) {
        this.f11446a = javaType;
        this.f11447b = bVarArr;
        this.f11448c = map;
        this.f11449d = strArr;
        this.f11450e = fr6Arr;
    }

    /* renamed from: d */
    public static C2255a m16404d(JavaType javaType) {
        return new C2255a(javaType);
    }

    /* renamed from: a */
    public final Object mo19536a(JsonParser jsonParser, DeserializationContext deserializationContext, int i, String str) throws IOException {
        JsonParser z1 = this.f11450e[i].mo20094z1(jsonParser);
        if (z1.mo13938N0() == JsonToken.VALUE_NULL) {
            return null;
        }
        fr6 bufferForInputBuffering = deserializationContext.bufferForInputBuffering(jsonParser);
        bufferForInputBuffering.mo13840G0();
        bufferForInputBuffering.mo13860Z0(str);
        bufferForInputBuffering.mo20074B1(z1);
        bufferForInputBuffering.mo13853S();
        JsonParser z12 = bufferForInputBuffering.mo20094z1(jsonParser);
        z12.mo13938N0();
        return this.f11447b[i].mo19548b().deserialize(z12, deserializationContext);
    }

    /* renamed from: b */
    public final void mo19537b(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, int i, String str) throws IOException {
        if (str == null) {
            deserializationContext.reportInputMismatch(this.f11446a, "Internal error in external Type Id handling: `null` type id passed", new Object[0]);
        }
        JsonParser z1 = this.f11450e[i].mo20094z1(jsonParser);
        if (z1.mo13938N0() == JsonToken.VALUE_NULL) {
            this.f11447b[i].mo19548b().set(obj, (Object) null);
            return;
        }
        fr6 bufferForInputBuffering = deserializationContext.bufferForInputBuffering(jsonParser);
        bufferForInputBuffering.mo13840G0();
        bufferForInputBuffering.mo13860Z0(str);
        bufferForInputBuffering.mo20074B1(z1);
        bufferForInputBuffering.mo13853S();
        JsonParser z12 = bufferForInputBuffering.mo20094z1(jsonParser);
        z12.mo13938N0();
        this.f11447b[i].mo19548b().deserializeAndSet(z12, deserializationContext, obj);
    }

    /* renamed from: c */
    public final boolean mo19538c(JsonParser jsonParser, DeserializationContext deserializationContext, String str, Object obj, String str2, int i) throws IOException {
        boolean z = false;
        if (!this.f11447b[i].mo19552f(str)) {
            return false;
        }
        if (!(obj == null || this.f11450e[i] == null)) {
            z = true;
        }
        if (z) {
            mo19537b(jsonParser, deserializationContext, obj, i, str2);
            this.f11450e[i] = null;
        } else {
            this.f11449d[i] = str2;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005d, code lost:
        if (r13.isEnabled(com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY) != false) goto L_0x005f;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo19539e(com.fasterxml.jackson.core.JsonParser r12, com.fasterxml.jackson.databind.DeserializationContext r13, p000.ox4 r14, com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator r15) throws java.io.IOException {
        /*
            r11 = this;
            ey1$b[] r0 = r11.f11447b
            int r0 = r0.length
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r3 = r2
        L_0x0007:
            if (r3 >= r0) goto L_0x00ce
            java.lang.String[] r4 = r11.f11449d
            r4 = r4[r3]
            ey1$b[] r5 = r11.f11447b
            r5 = r5[r3]
            r6 = 1
            if (r4 != 0) goto L_0x0047
            fr6[] r7 = r11.f11450e
            r7 = r7[r3]
            if (r7 == 0) goto L_0x00ca
            com.fasterxml.jackson.core.JsonToken r7 = r7.mo20076D1()
            com.fasterxml.jackson.core.JsonToken r8 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            if (r7 != r8) goto L_0x0024
            goto L_0x00ca
        L_0x0024:
            boolean r7 = r5.mo19551e()
            if (r7 != 0) goto L_0x0042
            com.fasterxml.jackson.databind.JavaType r7 = r11.f11446a
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r8 = r5.mo19548b()
            java.lang.String r8 = r8.getName()
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r9 = r5.mo19550d()
            r6[r2] = r9
            java.lang.String r9 = "Missing external type id property '%s'"
            r13.reportPropertyInputMismatch((com.fasterxml.jackson.databind.JavaType) r7, (java.lang.String) r8, (java.lang.String) r9, (java.lang.Object[]) r6)
            goto L_0x007d
        L_0x0042:
            java.lang.String r4 = r5.mo19547a()
            goto L_0x007d
        L_0x0047:
            fr6[] r7 = r11.f11450e
            r7 = r7[r3]
            if (r7 != 0) goto L_0x007d
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r7 = r5.mo19548b()
            boolean r8 = r7.isRequired()
            if (r8 != 0) goto L_0x005f
            com.fasterxml.jackson.databind.DeserializationFeature r8 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY
            boolean r8 = r13.isEnabled((com.fasterxml.jackson.databind.DeserializationFeature) r8)
            if (r8 == 0) goto L_0x007d
        L_0x005f:
            com.fasterxml.jackson.databind.JavaType r8 = r11.f11446a
            java.lang.String r9 = r7.getName()
            r10 = 2
            java.lang.Object[] r10 = new java.lang.Object[r10]
            java.lang.String r7 = r7.getName()
            r10[r2] = r7
            ey1$b[] r7 = r11.f11447b
            r7 = r7[r3]
            java.lang.String r7 = r7.mo19550d()
            r10[r6] = r7
            java.lang.String r6 = "Missing property '%s' for external type id '%s'"
            r13.reportPropertyInputMismatch((com.fasterxml.jackson.databind.JavaType) r8, (java.lang.String) r9, (java.lang.String) r6, (java.lang.Object[]) r10)
        L_0x007d:
            fr6[] r6 = r11.f11450e
            r6 = r6[r3]
            if (r6 == 0) goto L_0x0089
            java.lang.Object r6 = r11.mo19536a(r12, r13, r3, r4)
            r1[r3] = r6
        L_0x0089:
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r6 = r5.mo19548b()
            int r7 = r6.getCreatorIndex()
            if (r7 < 0) goto L_0x00ca
            r7 = r1[r3]
            r14.mo24271b(r6, r7)
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r5 = r5.mo19549c()
            if (r5 == 0) goto L_0x00ca
            int r6 = r5.getCreatorIndex()
            if (r6 < 0) goto L_0x00ca
            com.fasterxml.jackson.databind.JavaType r6 = r5.getType()
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            boolean r6 = r6.hasRawClass(r7)
            if (r6 == 0) goto L_0x00b1
            goto L_0x00c7
        L_0x00b1:
            fr6 r6 = r13.bufferForInputBuffering(r12)
            r6.mo13860Z0(r4)
            o43 r4 = r5.getValueDeserializer()
            com.fasterxml.jackson.core.JsonParser r7 = r6.mo20073A1()
            java.lang.Object r4 = r4.deserialize(r7, r13)
            r6.close()
        L_0x00c7:
            r14.mo24271b(r5, r4)
        L_0x00ca:
            int r3 = r3 + 1
            goto L_0x0007
        L_0x00ce:
            java.lang.Object r12 = r15.mo15598a(r13, r14)
        L_0x00d2:
            if (r2 >= r0) goto L_0x00ea
            ey1$b[] r13 = r11.f11447b
            r13 = r13[r2]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r13 = r13.mo19548b()
            int r14 = r13.getCreatorIndex()
            if (r14 >= 0) goto L_0x00e7
            r14 = r1[r2]
            r13.set(r12, r14)
        L_0x00e7:
            int r2 = r2 + 1
            goto L_0x00d2
        L_0x00ea:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ey1.mo19539e(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, ox4, com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator):java.lang.Object");
    }

    /* renamed from: f */
    public Object mo19540f(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        int length = this.f11447b.length;
        for (int i = 0; i < length; i++) {
            String str = this.f11449d[i];
            C2256b bVar = this.f11447b[i];
            if (str == null) {
                fr6 fr6 = this.f11450e[i];
                if (fr6 != null) {
                    if (fr6.mo20076D1().isScalarValue()) {
                        JsonParser z1 = fr6.mo20094z1(jsonParser);
                        z1.mo13938N0();
                        SettableBeanProperty b = bVar.mo19548b();
                        Object deserializeIfNatural = j07.deserializeIfNatural(z1, deserializationContext, b.getType());
                        if (deserializeIfNatural != null) {
                            b.set(obj, deserializeIfNatural);
                        }
                    }
                    if (!bVar.mo19551e()) {
                        deserializationContext.reportPropertyInputMismatch(this.f11446a, bVar.mo19548b().getName(), "Missing external type id property '%s' (and no 'defaultImpl' specified)", bVar.mo19550d());
                    } else {
                        str = bVar.mo19547a();
                        if (str == null) {
                            deserializationContext.reportPropertyInputMismatch(this.f11446a, bVar.mo19548b().getName(), "Invalid default type id for property '%s': `null` returned by TypeIdResolver", bVar.mo19550d());
                        }
                    }
                }
            } else if (this.f11450e[i] == null) {
                SettableBeanProperty b2 = bVar.mo19548b();
                if (b2.isRequired() || deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY)) {
                    deserializationContext.reportPropertyInputMismatch(obj.getClass(), b2.getName(), "Missing property '%s' for external type id '%s'", b2.getName(), bVar.mo19550d());
                }
                return obj;
            }
            mo19537b(jsonParser, deserializationContext, obj, i, str);
        }
        return obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0090, code lost:
        if (r10.f11450e[r0] != null) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a2, code lost:
        if (r10.f11449d[r0] != null) goto L_0x0092;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a7  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo19541g(com.fasterxml.jackson.core.JsonParser r11, com.fasterxml.jackson.databind.DeserializationContext r12, java.lang.String r13, java.lang.Object r14) throws java.io.IOException {
        /*
            r10 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r10.f11448c
            java.lang.Object r0 = r0.get(r13)
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            boolean r2 = r0 instanceof java.util.List
            r3 = 1
            if (r2 == 0) goto L_0x006f
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r14 = r0.iterator()
            java.lang.Object r0 = r14.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            ey1$b[] r1 = r10.f11447b
            int r2 = r0.intValue()
            r1 = r1[r2]
            boolean r13 = r1.mo19552f(r13)
            if (r13 == 0) goto L_0x004d
            java.lang.String r12 = r11.mo13947W()
            r11.mo13959c1()
            java.lang.String[] r11 = r10.f11449d
            int r13 = r0.intValue()
            r11[r13] = r12
        L_0x0038:
            boolean r11 = r14.hasNext()
            if (r11 == 0) goto L_0x006e
            java.lang.String[] r11 = r10.f11449d
            java.lang.Object r13 = r14.next()
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            r11[r13] = r12
            goto L_0x0038
        L_0x004d:
            fr6 r11 = r12.bufferAsCopyOfValue(r11)
            fr6[] r12 = r10.f11450e
            int r13 = r0.intValue()
            r12[r13] = r11
        L_0x0059:
            boolean r12 = r14.hasNext()
            if (r12 == 0) goto L_0x006e
            fr6[] r12 = r10.f11450e
            java.lang.Object r13 = r14.next()
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            r12[r13] = r11
            goto L_0x0059
        L_0x006e:
            return r3
        L_0x006f:
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            ey1$b[] r2 = r10.f11447b
            r2 = r2[r0]
            boolean r13 = r2.mo19552f(r13)
            if (r13 == 0) goto L_0x0094
            java.lang.String[] r13 = r10.f11449d
            java.lang.String r2 = r11.mo13974k0()
            r13[r0] = r2
            r11.mo13959c1()
            if (r14 == 0) goto L_0x00a5
            fr6[] r13 = r10.f11450e
            r13 = r13[r0]
            if (r13 == 0) goto L_0x00a5
        L_0x0092:
            r1 = r3
            goto L_0x00a5
        L_0x0094:
            fr6 r13 = r12.bufferAsCopyOfValue(r11)
            fr6[] r2 = r10.f11450e
            r2[r0] = r13
            if (r14 == 0) goto L_0x00a5
            java.lang.String[] r13 = r10.f11449d
            r13 = r13[r0]
            if (r13 == 0) goto L_0x00a5
            goto L_0x0092
        L_0x00a5:
            if (r1 == 0) goto L_0x00ba
            java.lang.String[] r13 = r10.f11449d
            r9 = r13[r0]
            r1 = 0
            r13[r0] = r1
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r14
            r8 = r0
            r4.mo19537b(r5, r6, r7, r8, r9)
            fr6[] r11 = r10.f11450e
            r11[r0] = r1
        L_0x00ba:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ey1.mo19541g(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.String, java.lang.Object):boolean");
    }

    /* renamed from: h */
    public boolean mo19542h(JsonParser jsonParser, DeserializationContext deserializationContext, String str, Object obj) throws IOException {
        Object obj2 = this.f11448c.get(str);
        boolean z = false;
        if (obj2 == null) {
            return false;
        }
        String W = jsonParser.mo13947W();
        if (obj2 instanceof List) {
            for (Integer intValue : (List) obj2) {
                if (mo19538c(jsonParser, deserializationContext, str, obj, W, intValue.intValue())) {
                    z = true;
                }
            }
            return z;
        }
        return mo19538c(jsonParser, deserializationContext, str, obj, W, ((Integer) obj2).intValue());
    }

    /* renamed from: i */
    public ey1 mo19543i() {
        return new ey1(this);
    }

    public ey1(ey1 ey1) {
        this.f11446a = ey1.f11446a;
        C2256b[] bVarArr = ey1.f11447b;
        this.f11447b = bVarArr;
        this.f11448c = ey1.f11448c;
        int length = bVarArr.length;
        this.f11449d = new String[length];
        this.f11450e = new fr6[length];
    }
}
