package p000;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.C2032h;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.stream.Collectors;

/* renamed from: zj4 */
/* compiled from: POJOPropertyBuilder */
public class zj4 extends q00 implements Comparable<zj4> {

    /* renamed from: H */
    public static final AnnotationIntrospector.ReferenceProperty f20563H = AnnotationIntrospector.ReferenceProperty.m13977e("");

    /* renamed from: A */
    public C3738g<AnnotatedMethod> f20564A;

    /* renamed from: B */
    public transient PropertyMetadata f20565B;

    /* renamed from: C */
    public transient AnnotationIntrospector.ReferenceProperty f20566C;

    /* renamed from: d */
    public final boolean f20567d;

    /* renamed from: e */
    public final MapperConfig<?> f20568e;

    /* renamed from: g */
    public final AnnotationIntrospector f20569g;

    /* renamed from: k */
    public final PropertyName f20570k;

    /* renamed from: r */
    public final PropertyName f20571r;

    /* renamed from: s */
    public C3738g<AnnotatedField> f20572s;

    /* renamed from: x */
    public C3738g<AnnotatedParameter> f20573x;

    /* renamed from: y */
    public C3738g<AnnotatedMethod> f20574y;

    /* renamed from: zj4$a */
    /* compiled from: POJOPropertyBuilder */
    public class C3732a implements C3740i<Class<?>[]> {
        public C3732a() {
        }

        /* renamed from: b */
        public Class<?>[] mo28501a(AnnotatedMember annotatedMember) {
            return zj4.this.f20569g.findViews(annotatedMember);
        }
    }

    /* renamed from: zj4$b */
    /* compiled from: POJOPropertyBuilder */
    public class C3733b implements C3740i<AnnotationIntrospector.ReferenceProperty> {
        public C3733b() {
        }

        /* renamed from: b */
        public AnnotationIntrospector.ReferenceProperty mo28501a(AnnotatedMember annotatedMember) {
            return zj4.this.f20569g.findReferenceType(annotatedMember);
        }
    }

    /* renamed from: zj4$c */
    /* compiled from: POJOPropertyBuilder */
    public class C3734c implements C3740i<Boolean> {
        public C3734c() {
        }

        /* renamed from: b */
        public Boolean mo28501a(AnnotatedMember annotatedMember) {
            return zj4.this.f20569g.isTypeId(annotatedMember);
        }
    }

    /* renamed from: zj4$d */
    /* compiled from: POJOPropertyBuilder */
    public class C3735d implements C3740i<bf4> {
        public C3735d() {
        }

        /* renamed from: b */
        public bf4 mo28501a(AnnotatedMember annotatedMember) {
            bf4 findObjectIdInfo = zj4.this.f20569g.findObjectIdInfo(annotatedMember);
            if (findObjectIdInfo != null) {
                return zj4.this.f20569g.findObjectReferenceInfo(annotatedMember, findObjectIdInfo);
            }
            return findObjectIdInfo;
        }
    }

    /* renamed from: zj4$e */
    /* compiled from: POJOPropertyBuilder */
    public class C3736e implements C3740i<JsonProperty.Access> {
        public C3736e() {
        }

        /* renamed from: b */
        public JsonProperty.Access mo28501a(AnnotatedMember annotatedMember) {
            return zj4.this.f20569g.findPropertyAccess(annotatedMember);
        }
    }

    /* renamed from: zj4$f */
    /* compiled from: POJOPropertyBuilder */
    public static /* synthetic */ class C3737f {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20580a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.fasterxml.jackson.annotation.JsonProperty$Access[] r0 = com.fasterxml.jackson.annotation.JsonProperty.Access.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f20580a = r0
                com.fasterxml.jackson.annotation.JsonProperty$Access r1 = com.fasterxml.jackson.annotation.JsonProperty.Access.READ_ONLY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f20580a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fasterxml.jackson.annotation.JsonProperty$Access r1 = com.fasterxml.jackson.annotation.JsonProperty.Access.READ_WRITE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f20580a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.fasterxml.jackson.annotation.JsonProperty$Access r1 = com.fasterxml.jackson.annotation.JsonProperty.Access.WRITE_ONLY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f20580a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.fasterxml.jackson.annotation.JsonProperty$Access r1 = com.fasterxml.jackson.annotation.JsonProperty.Access.AUTO     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.zj4.C3737f.<clinit>():void");
        }
    }

    /* renamed from: zj4$g */
    /* compiled from: POJOPropertyBuilder */
    public static final class C3738g<T> {

        /* renamed from: a */
        public final T f20581a;

        /* renamed from: b */
        public final C3738g<T> f20582b;

        /* renamed from: c */
        public final PropertyName f20583c;

        /* renamed from: d */
        public final boolean f20584d;

        /* renamed from: e */
        public final boolean f20585e;

        /* renamed from: f */
        public final boolean f20586f;

        public C3738g(T t, C3738g<T> gVar, PropertyName propertyName, boolean z, boolean z2, boolean z3) {
            PropertyName propertyName2;
            this.f20581a = t;
            this.f20582b = gVar;
            if (propertyName == null || propertyName.isEmpty()) {
                propertyName2 = null;
            } else {
                propertyName2 = propertyName;
            }
            this.f20583c = propertyName2;
            if (z) {
                if (propertyName2 == null) {
                    throw new IllegalArgumentException("Cannot pass true for 'explName' if name is null/empty");
                } else if (!propertyName.hasSimpleName()) {
                    z = false;
                }
            }
            this.f20584d = z;
            this.f20585e = z2;
            this.f20586f = z3;
        }

        /* renamed from: a */
        public C3738g<T> mo28507a(C3738g<T> gVar) {
            C3738g<T> gVar2 = this.f20582b;
            if (gVar2 == null) {
                return mo28509c(gVar);
            }
            return mo28509c(gVar2.mo28507a(gVar));
        }

        /* renamed from: b */
        public C3738g<T> mo28508b() {
            C3738g<T> gVar = this.f20582b;
            if (gVar == null) {
                return this;
            }
            C3738g<T> b = gVar.mo28508b();
            if (this.f20583c != null) {
                if (b.f20583c == null) {
                    return mo28509c((C3738g) null);
                }
                return mo28509c(b);
            } else if (b.f20583c != null) {
                return b;
            } else {
                boolean z = this.f20585e;
                if (z == b.f20585e) {
                    return mo28509c(b);
                }
                if (z) {
                    return mo28509c((C3738g) null);
                }
                return b;
            }
        }

        /* renamed from: c */
        public C3738g<T> mo28509c(C3738g<T> gVar) {
            if (gVar == this.f20582b) {
                return this;
            }
            return new C3738g(this.f20581a, gVar, this.f20583c, this.f20584d, this.f20585e, this.f20586f);
        }

        /* renamed from: d */
        public C3738g<T> mo28510d(T t) {
            if (t == this.f20581a) {
                return this;
            }
            return new C3738g(t, this.f20582b, this.f20583c, this.f20584d, this.f20585e, this.f20586f);
        }

        /* renamed from: e */
        public C3738g<T> mo28511e() {
            C3738g<T> e;
            if (this.f20586f) {
                C3738g<T> gVar = this.f20582b;
                if (gVar == null) {
                    return null;
                }
                return gVar.mo28511e();
            }
            C3738g<T> gVar2 = this.f20582b;
            if (gVar2 == null || (e = gVar2.mo28511e()) == this.f20582b) {
                return this;
            }
            return mo28509c(e);
        }

        /* renamed from: f */
        public C3738g<T> mo28512f() {
            if (this.f20582b == null) {
                return this;
            }
            return new C3738g(this.f20581a, (C3738g) null, this.f20583c, this.f20584d, this.f20585e, this.f20586f);
        }

        /* renamed from: g */
        public C3738g<T> mo28513g() {
            C3738g<T> gVar;
            C3738g<T> gVar2 = this.f20582b;
            if (gVar2 == null) {
                gVar = null;
            } else {
                gVar = gVar2.mo28513g();
            }
            if (this.f20585e) {
                return mo28509c(gVar);
            }
            return gVar;
        }

        public String toString() {
            String format = String.format("%s[visible=%b,ignore=%b,explicitName=%b]", new Object[]{this.f20581a.toString(), Boolean.valueOf(this.f20585e), Boolean.valueOf(this.f20586f), Boolean.valueOf(this.f20584d)});
            if (this.f20582b == null) {
                return format;
            }
            return format + ", " + this.f20582b.toString();
        }
    }

    /* renamed from: zj4$h */
    /* compiled from: POJOPropertyBuilder */
    public static class C3739h<T extends AnnotatedMember> implements Iterator<T> {

        /* renamed from: a */
        public C3738g<T> f20587a;

        public C3739h(C3738g<T> gVar) {
            this.f20587a = gVar;
        }

        /* renamed from: a */
        public T next() {
            C3738g<T> gVar = this.f20587a;
            if (gVar != null) {
                T t = (AnnotatedMember) gVar.f20581a;
                this.f20587a = gVar.f20582b;
                return t;
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            if (this.f20587a != null) {
                return true;
            }
            return false;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: zj4$i */
    /* compiled from: POJOPropertyBuilder */
    public interface C3740i<T> {
        /* renamed from: a */
        T mo28501a(AnnotatedMember annotatedMember);
    }

    public zj4(MapperConfig<?> mapperConfig, AnnotationIntrospector annotationIntrospector, boolean z, PropertyName propertyName) {
        this(mapperConfig, annotationIntrospector, z, propertyName, propertyName);
    }

    /* renamed from: w0 */
    public static <T> C3738g<T> m31256w0(C3738g<T> gVar, C3738g<T> gVar2) {
        if (gVar == null) {
            return gVar2;
        }
        if (gVar2 == null) {
            return gVar;
        }
        return gVar.mo28507a(gVar2);
    }

    /* renamed from: A0 */
    public void mo28455A0() {
        this.f20572s = mo28472U(this.f20572s);
        this.f20574y = mo28472U(this.f20574y);
        this.f20564A = mo28472U(this.f20564A);
        this.f20573x = mo28472U(this.f20573x);
    }

    /* renamed from: B */
    public boolean mo24871B() {
        if (this.f20572s != null) {
            return true;
        }
        return false;
    }

    /* renamed from: B0 */
    public JsonProperty.Access mo28456B0(boolean z, C2032h hVar) {
        JsonProperty.Access m0 = mo28488m0();
        if (m0 == null) {
            m0 = JsonProperty.Access.AUTO;
        }
        int i = C3737f.f20580a[m0.ordinal()];
        if (i == 1) {
            if (hVar != null) {
                hVar.mo16099k(getName());
                for (PropertyName simpleName : mo28489n0()) {
                    hVar.mo16099k(simpleName.getSimpleName());
                }
            }
            this.f20564A = null;
            this.f20573x = null;
            if (!this.f20567d) {
                this.f20572s = null;
            }
        } else if (i != 2) {
            if (i != 3) {
                this.f20574y = mo28473V(this.f20574y);
                this.f20573x = mo28473V(this.f20573x);
                if (!z || this.f20574y == null) {
                    this.f20572s = mo28473V(this.f20572s);
                    this.f20564A = mo28473V(this.f20564A);
                }
            } else {
                this.f20574y = null;
                if (this.f20567d) {
                    this.f20572s = null;
                }
            }
        }
        return m0;
    }

    /* renamed from: C */
    public boolean mo24872C(PropertyName propertyName) {
        return this.f20570k.equals(propertyName);
    }

    /* renamed from: C0 */
    public void mo28457C0() {
        this.f20572s = mo28477c0(this.f20572s);
        this.f20574y = mo28477c0(this.f20574y);
        this.f20564A = mo28477c0(this.f20564A);
        this.f20573x = mo28477c0(this.f20573x);
    }

    /* renamed from: D */
    public boolean mo24873D() {
        if (this.f20564A != null) {
            return true;
        }
        return false;
    }

    /* renamed from: D0 */
    public zj4 mo28458D0(PropertyName propertyName) {
        return new zj4(this, propertyName);
    }

    /* renamed from: E */
    public boolean mo24874E() {
        if (mo28461I(this.f20572s) || mo28461I(this.f20574y) || mo28461I(this.f20564A) || mo28460H(this.f20573x)) {
            return true;
        }
        return false;
    }

    /* renamed from: F */
    public boolean mo24875F() {
        if (mo28460H(this.f20572s) || mo28460H(this.f20574y) || mo28460H(this.f20564A) || mo28460H(this.f20573x)) {
            return true;
        }
        return false;
    }

    /* renamed from: F0 */
    public zj4 mo28459F0(String str) {
        PropertyName withSimpleName = this.f20570k.withSimpleName(str);
        if (withSimpleName == this.f20570k) {
            return this;
        }
        return new zj4(this, withSimpleName);
    }

    /* renamed from: G */
    public boolean mo24876G() {
        Boolean bool = (Boolean) mo28490o0(new C3734c());
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: H */
    public final <T> boolean mo28460H(C3738g<T> gVar) {
        while (gVar != null) {
            if (gVar.f20583c != null && gVar.f20584d) {
                return true;
            }
            gVar = gVar.f20582b;
        }
        return false;
    }

    /* renamed from: I */
    public final <T> boolean mo28461I(C3738g<T> gVar) {
        while (gVar != null) {
            PropertyName propertyName = gVar.f20583c;
            if (propertyName != null && propertyName.hasSimpleName()) {
                return true;
            }
            gVar = gVar.f20582b;
        }
        return false;
    }

    /* renamed from: J */
    public final <T> boolean mo28462J(C3738g<T> gVar) {
        while (gVar != null) {
            if (gVar.f20586f) {
                return true;
            }
            gVar = gVar.f20582b;
        }
        return false;
    }

    /* renamed from: K */
    public final <T> boolean mo28463K(C3738g<T> gVar) {
        while (gVar != null) {
            if (gVar.f20585e) {
                return true;
            }
            gVar = gVar.f20582b;
        }
        return false;
    }

    /* renamed from: L */
    public final <T extends AnnotatedMember> C3738g<T> mo28464L(C3738g<T> gVar, C3742zl zlVar) {
        AnnotatedMember annotatedMember = (AnnotatedMember) ((AnnotatedMember) gVar.f20581a).withAnnotations(zlVar);
        C3738g<T> gVar2 = gVar.f20582b;
        if (gVar2 != null) {
            gVar = gVar.mo28509c(mo28464L(gVar2, zlVar));
        }
        return gVar.mo28510d(annotatedMember);
    }

    /* renamed from: M */
    public final void mo28465M(Collection<PropertyName> collection, Map<PropertyName, zj4> map, C3738g<?> gVar) {
        for (C3738g gVar2 = gVar; gVar2 != null; gVar2 = gVar2.f20582b) {
            PropertyName propertyName = gVar2.f20583c;
            if (gVar2.f20584d && propertyName != null) {
                zj4 zj4 = map.get(propertyName);
                if (zj4 == null) {
                    zj4 = new zj4(this.f20568e, this.f20569g, this.f20567d, this.f20571r, propertyName);
                    map.put(propertyName, zj4);
                }
                if (gVar == this.f20572s) {
                    zj4.f20572s = gVar2.mo28509c(zj4.f20572s);
                } else if (gVar == this.f20574y) {
                    zj4.f20574y = gVar2.mo28509c(zj4.f20574y);
                } else if (gVar == this.f20564A) {
                    zj4.f20564A = gVar2.mo28509c(zj4.f20564A);
                } else if (gVar == this.f20573x) {
                    zj4.f20573x = gVar2.mo28509c(zj4.f20573x);
                } else {
                    throw new IllegalStateException("Internal error: mismatched accessors, property: " + this);
                }
            } else if (gVar2.f20585e) {
                throw new IllegalStateException("Conflicting/ambiguous property name definitions (implicit name " + wf0.m29494U(this.f20570k) + "): found multiple explicit names: " + collection + ", but also implicit accessor: " + gVar2);
            }
        }
    }

    /* renamed from: N */
    public final Set<PropertyName> mo28466N(C3738g<? extends AnnotatedMember> gVar, Set<PropertyName> set) {
        C3738g<T> gVar2;
        while (gVar2 != null) {
            if (gVar2.f20584d && gVar2.f20583c != null) {
                if (set == null) {
                    set = new HashSet<>();
                }
                set.add(gVar2.f20583c);
            }
            C3738g<T> gVar3 = gVar2.f20582b;
            gVar2 = gVar;
            gVar2 = gVar3;
        }
        return set;
    }

    /* renamed from: O */
    public final <T extends AnnotatedMember> C3742zl mo28467O(C3738g<T> gVar) {
        C3742zl allAnnotations = ((AnnotatedMember) gVar.f20581a).getAllAnnotations();
        C3738g<T> gVar2 = gVar.f20582b;
        if (gVar2 != null) {
            return C3742zl.m31356d(allAnnotations, mo28467O(gVar2));
        }
        return allAnnotations;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a7 A[ADDED_TO_REGION] */
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.PropertyMetadata mo28468P(com.fasterxml.jackson.databind.PropertyMetadata r7, com.fasterxml.jackson.databind.introspect.AnnotatedMember r8) {
        /*
            r6 = this;
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r0 = r6.mo24887l()
            r1 = 0
            r2 = 0
            r3 = 1
            if (r8 == 0) goto L_0x0071
            com.fasterxml.jackson.databind.AnnotationIntrospector r4 = r6.f20569g
            if (r4 == 0) goto L_0x0035
            if (r0 == 0) goto L_0x0024
            java.lang.Boolean r4 = r4.findMergeInfo(r8)
            if (r4 == 0) goto L_0x0024
            boolean r3 = r4.booleanValue()
            if (r3 == 0) goto L_0x0023
            com.fasterxml.jackson.databind.PropertyMetadata$a r3 = com.fasterxml.jackson.databind.PropertyMetadata.C1987a.m14005b(r0)
            com.fasterxml.jackson.databind.PropertyMetadata r7 = r7.withMergeInfo(r3)
        L_0x0023:
            r3 = r1
        L_0x0024:
            com.fasterxml.jackson.databind.AnnotationIntrospector r4 = r6.f20569g
            com.fasterxml.jackson.annotation.JsonSetter$Value r4 = r4.findSetterInfo(r8)
            if (r4 == 0) goto L_0x0035
            com.fasterxml.jackson.annotation.Nulls r2 = r4.nonDefaultValueNulls()
            com.fasterxml.jackson.annotation.Nulls r4 = r4.nonDefaultContentNulls()
            goto L_0x0036
        L_0x0035:
            r4 = r2
        L_0x0036:
            if (r3 != 0) goto L_0x003c
            if (r2 == 0) goto L_0x003c
            if (r4 != 0) goto L_0x0072
        L_0x003c:
            java.lang.Class r8 = r6.mo28471T(r8)
            com.fasterxml.jackson.databind.cfg.MapperConfig<?> r5 = r6.f20568e
            oo0 r8 = r5.getConfigOverride(r8)
            com.fasterxml.jackson.annotation.JsonSetter$Value r5 = r8.getSetterInfo()
            if (r5 == 0) goto L_0x0058
            if (r2 != 0) goto L_0x0052
            com.fasterxml.jackson.annotation.Nulls r2 = r5.nonDefaultValueNulls()
        L_0x0052:
            if (r4 != 0) goto L_0x0058
            com.fasterxml.jackson.annotation.Nulls r4 = r5.nonDefaultContentNulls()
        L_0x0058:
            if (r3 == 0) goto L_0x0072
            if (r0 == 0) goto L_0x0072
            java.lang.Boolean r8 = r8.getMergeable()
            if (r8 == 0) goto L_0x0072
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x0073
            com.fasterxml.jackson.databind.PropertyMetadata$a r8 = com.fasterxml.jackson.databind.PropertyMetadata.C1987a.m14006c(r0)
            com.fasterxml.jackson.databind.PropertyMetadata r7 = r7.withMergeInfo(r8)
            goto L_0x0073
        L_0x0071:
            r4 = r2
        L_0x0072:
            r1 = r3
        L_0x0073:
            if (r1 != 0) goto L_0x0079
            if (r2 == 0) goto L_0x0079
            if (r4 != 0) goto L_0x00a5
        L_0x0079:
            com.fasterxml.jackson.databind.cfg.MapperConfig<?> r8 = r6.f20568e
            com.fasterxml.jackson.annotation.JsonSetter$Value r8 = r8.getDefaultSetterInfo()
            if (r2 != 0) goto L_0x0085
            com.fasterxml.jackson.annotation.Nulls r2 = r8.nonDefaultValueNulls()
        L_0x0085:
            if (r4 != 0) goto L_0x008b
            com.fasterxml.jackson.annotation.Nulls r4 = r8.nonDefaultContentNulls()
        L_0x008b:
            if (r1 == 0) goto L_0x00a5
            com.fasterxml.jackson.databind.cfg.MapperConfig<?> r8 = r6.f20568e
            java.lang.Boolean r8 = r8.getDefaultMergeable()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L_0x00a5
            if (r0 == 0) goto L_0x00a5
            com.fasterxml.jackson.databind.PropertyMetadata$a r8 = com.fasterxml.jackson.databind.PropertyMetadata.C1987a.m14004a(r0)
            com.fasterxml.jackson.databind.PropertyMetadata r7 = r7.withMergeInfo(r8)
        L_0x00a5:
            if (r2 != 0) goto L_0x00a9
            if (r4 == 0) goto L_0x00ad
        L_0x00a9:
            com.fasterxml.jackson.databind.PropertyMetadata r7 = r7.withNulls(r2, r4)
        L_0x00ad:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.zj4.mo28468P(com.fasterxml.jackson.databind.PropertyMetadata, com.fasterxml.jackson.databind.introspect.AnnotatedMember):com.fasterxml.jackson.databind.PropertyMetadata");
    }

    /* renamed from: R */
    public int mo28469R(AnnotatedMethod annotatedMethod) {
        String name = annotatedMethod.getName();
        if (name.startsWith("get") && name.length() > 3) {
            return 1;
        }
        if (!name.startsWith("is") || name.length() <= 2) {
            return 3;
        }
        return 2;
    }

    /* renamed from: S */
    public final C3742zl mo28470S(int i, C3738g<? extends AnnotatedMember>... gVarArr) {
        C3742zl O = mo28467O(gVarArr[i]);
        do {
            i++;
            if (i >= gVarArr.length) {
                return O;
            }
        } while (gVarArr[i] == null);
        return C3742zl.m31356d(O, mo28470S(i, gVarArr));
    }

    /* renamed from: T */
    public Class<?> mo28471T(AnnotatedMember annotatedMember) {
        if (annotatedMember instanceof AnnotatedMethod) {
            AnnotatedMethod annotatedMethod = (AnnotatedMethod) annotatedMember;
            if (annotatedMethod.getParameterCount() > 0) {
                return annotatedMethod.getParameterType(0).getRawClass();
            }
        }
        return annotatedMember.getType().getRawClass();
    }

    /* renamed from: U */
    public final <T> C3738g<T> mo28472U(C3738g<T> gVar) {
        if (gVar == null) {
            return gVar;
        }
        return gVar.mo28511e();
    }

    /* renamed from: V */
    public final <T> C3738g<T> mo28473V(C3738g<T> gVar) {
        if (gVar == null) {
            return gVar;
        }
        return gVar.mo28513g();
    }

    /* renamed from: Y */
    public AnnotatedMethod mo28474Y(AnnotatedMethod annotatedMethod, AnnotatedMethod annotatedMethod2) {
        Class<?> declaringClass = annotatedMethod.getDeclaringClass();
        Class<?> declaringClass2 = annotatedMethod2.getDeclaringClass();
        if (declaringClass != declaringClass2) {
            if (declaringClass.isAssignableFrom(declaringClass2)) {
                return annotatedMethod2;
            }
            if (declaringClass2.isAssignableFrom(declaringClass)) {
                return annotatedMethod;
            }
        }
        int a0 = mo28476a0(annotatedMethod2);
        int a02 = mo28476a0(annotatedMethod);
        if (a0 == a02) {
            AnnotationIntrospector annotationIntrospector = this.f20569g;
            if (annotationIntrospector == null) {
                return null;
            }
            return annotationIntrospector.resolveSetterConflict(this.f20568e, annotatedMethod, annotatedMethod2);
        } else if (a0 < a02) {
            return annotatedMethod2;
        } else {
            return annotatedMethod;
        }
    }

    /* renamed from: Z */
    public AnnotatedMethod mo28475Z(C3738g<AnnotatedMethod> gVar, C3738g<AnnotatedMethod> gVar2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(gVar.f20581a);
        arrayList.add(gVar2.f20581a);
        for (C3738g<T> gVar3 = gVar2.f20582b; gVar3 != null; gVar3 = gVar3.f20582b) {
            T Y = mo28474Y((AnnotatedMethod) gVar.f20581a, (AnnotatedMethod) gVar3.f20581a);
            if (Y != gVar.f20581a) {
                T t = gVar3.f20581a;
                if (Y == t) {
                    arrayList.clear();
                    gVar = gVar3;
                } else {
                    arrayList.add(t);
                }
            }
        }
        if (arrayList.isEmpty()) {
            this.f20564A = gVar.mo28512f();
            return (AnnotatedMethod) gVar.f20581a;
        }
        throw new IllegalArgumentException(String.format("Conflicting setter definitions for property \"%s\": %s", new Object[]{getName(), (String) arrayList.stream().map(new yj4()).collect(Collectors.joining(" vs "))}));
    }

    /* renamed from: a */
    public boolean mo24877a() {
        if (this.f20573x == null && this.f20564A == null && this.f20572s == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a0 */
    public int mo28476a0(AnnotatedMethod annotatedMethod) {
        String name = annotatedMethod.getName();
        if (!name.startsWith("set") || name.length() <= 3) {
            return 2;
        }
        return 1;
    }

    /* renamed from: c0 */
    public final <T> C3738g<T> mo28477c0(C3738g<T> gVar) {
        if (gVar == null) {
            return gVar;
        }
        return gVar.mo28508b();
    }

    /* renamed from: d */
    public boolean mo24878d() {
        if (this.f20574y == null && this.f20572s == null) {
            return false;
        }
        return true;
    }

    /* renamed from: d0 */
    public void mo28479d0(zj4 zj4) {
        this.f20572s = m31256w0(this.f20572s, zj4.f20572s);
        this.f20573x = m31256w0(this.f20573x, zj4.f20573x);
        this.f20574y = m31256w0(this.f20574y, zj4.f20574y);
        this.f20564A = m31256w0(this.f20564A, zj4.f20564A);
    }

    /* renamed from: e */
    public JsonInclude.Value mo24879e() {
        JsonInclude.Value value;
        AnnotatedMember l = mo24887l();
        AnnotationIntrospector annotationIntrospector = this.f20569g;
        if (annotationIntrospector == null) {
            value = null;
        } else {
            value = annotationIntrospector.findPropertyInclusion(l);
        }
        if (value == null) {
            return JsonInclude.Value.empty();
        }
        return value;
    }

    /* renamed from: e0 */
    public void mo28480e0(AnnotatedParameter annotatedParameter, PropertyName propertyName, boolean z, boolean z2, boolean z3) {
        this.f20573x = new C3738g(annotatedParameter, this.f20573x, propertyName, z, z2, z3);
    }

    /* renamed from: f */
    public bf4 mo24880f() {
        return (bf4) mo28490o0(new C3735d());
    }

    /* renamed from: f0 */
    public void mo28481f0(AnnotatedField annotatedField, PropertyName propertyName, boolean z, boolean z2, boolean z3) {
        this.f20572s = new C3738g(annotatedField, this.f20572s, propertyName, z, z2, z3);
    }

    /* renamed from: g0 */
    public void mo28482g0(AnnotatedMethod annotatedMethod, PropertyName propertyName, boolean z, boolean z2, boolean z3) {
        this.f20574y = new C3738g(annotatedMethod, this.f20574y, propertyName, z, z2, z3);
    }

    public PropertyName getFullName() {
        return this.f20570k;
    }

    public PropertyMetadata getMetadata() {
        if (this.f20565B == null) {
            AnnotatedMember t0 = mo28495t0();
            if (t0 == null) {
                this.f20565B = PropertyMetadata.STD_REQUIRED_OR_OPTIONAL;
            } else {
                Boolean hasRequiredMarker = this.f20569g.hasRequiredMarker(t0);
                String findPropertyDescription = this.f20569g.findPropertyDescription(t0);
                Integer findPropertyIndex = this.f20569g.findPropertyIndex(t0);
                String findPropertyDefaultValue = this.f20569g.findPropertyDefaultValue(t0);
                if (hasRequiredMarker == null && findPropertyIndex == null && findPropertyDefaultValue == null) {
                    PropertyMetadata propertyMetadata = PropertyMetadata.STD_REQUIRED_OR_OPTIONAL;
                    if (findPropertyDescription != null) {
                        propertyMetadata = propertyMetadata.withDescription(findPropertyDescription);
                    }
                    this.f20565B = propertyMetadata;
                } else {
                    this.f20565B = PropertyMetadata.construct(hasRequiredMarker, findPropertyDescription, findPropertyIndex, findPropertyDefaultValue);
                }
                if (!this.f20567d) {
                    this.f20565B = mo28468P(this.f20565B, t0);
                }
            }
        }
        return this.f20565B;
    }

    public String getName() {
        PropertyName propertyName = this.f20570k;
        if (propertyName == null) {
            return null;
        }
        return propertyName.getSimpleName();
    }

    public PropertyName getWrapperName() {
        AnnotationIntrospector annotationIntrospector;
        AnnotatedMember v = mo24894v();
        if (v == null || (annotationIntrospector = this.f20569g) == null) {
            return null;
        }
        return annotationIntrospector.findWrapperName(v);
    }

    /* renamed from: h */
    public AnnotationIntrospector.ReferenceProperty mo24885h() {
        AnnotationIntrospector.ReferenceProperty referenceProperty;
        AnnotationIntrospector.ReferenceProperty referenceProperty2 = this.f20566C;
        if (referenceProperty2 == null) {
            AnnotationIntrospector.ReferenceProperty referenceProperty3 = (AnnotationIntrospector.ReferenceProperty) mo28490o0(new C3733b());
            if (referenceProperty3 == null) {
                referenceProperty = f20563H;
            } else {
                referenceProperty = referenceProperty3;
            }
            this.f20566C = referenceProperty;
            return referenceProperty3;
        } else if (referenceProperty2 == f20563H) {
            return null;
        } else {
            return referenceProperty2;
        }
    }

    /* renamed from: h0 */
    public void mo28483h0(AnnotatedMethod annotatedMethod, PropertyName propertyName, boolean z, boolean z2, boolean z3) {
        this.f20564A = new C3738g(annotatedMethod, this.f20564A, propertyName, z, z2, z3);
    }

    /* renamed from: i */
    public Class<?>[] mo24886i() {
        return (Class[]) mo28490o0(new C3732a());
    }

    /* renamed from: i0 */
    public boolean mo28484i0() {
        if (mo28462J(this.f20572s) || mo28462J(this.f20574y) || mo28462J(this.f20564A) || mo28462J(this.f20573x)) {
            return true;
        }
        return false;
    }

    /* renamed from: j0 */
    public boolean mo28485j0() {
        if (mo28463K(this.f20572s) || mo28463K(this.f20574y) || mo28463K(this.f20564A) || mo28463K(this.f20573x)) {
            return true;
        }
        return false;
    }

    /* renamed from: k0 */
    public int compareTo(zj4 zj4) {
        if (this.f20573x != null) {
            if (zj4.f20573x == null) {
                return -1;
            }
        } else if (zj4.f20573x != null) {
            return 1;
        }
        return getName().compareTo(zj4.getName());
    }

    /* renamed from: l0 */
    public Collection<zj4> mo28487l0(Collection<PropertyName> collection) {
        HashMap hashMap = new HashMap();
        mo28465M(collection, hashMap, this.f20572s);
        mo28465M(collection, hashMap, this.f20574y);
        mo28465M(collection, hashMap, this.f20564A);
        mo28465M(collection, hashMap, this.f20573x);
        return hashMap.values();
    }

    /* renamed from: m */
    public AnnotatedParameter mo24888m() {
        C3738g gVar = this.f20573x;
        if (gVar == null) {
            return null;
        }
        while (!(((AnnotatedParameter) gVar.f20581a).getOwner() instanceof AnnotatedConstructor)) {
            gVar = gVar.f20582b;
            if (gVar == null) {
                return (AnnotatedParameter) this.f20573x.f20581a;
            }
        }
        return (AnnotatedParameter) gVar.f20581a;
    }

    /* renamed from: m0 */
    public JsonProperty.Access mo28488m0() {
        return (JsonProperty.Access) mo28491p0(new C3736e(), JsonProperty.Access.AUTO);
    }

    /* renamed from: n0 */
    public Set<PropertyName> mo28489n0() {
        Set<PropertyName> N = mo28466N(this.f20573x, mo28466N(this.f20564A, mo28466N(this.f20574y, mo28466N(this.f20572s, (Set<PropertyName>) null))));
        if (N == null) {
            return Collections.emptySet();
        }
        return N;
    }

    /* renamed from: o */
    public Iterator<AnnotatedParameter> mo24889o() {
        C3738g<AnnotatedParameter> gVar = this.f20573x;
        if (gVar == null) {
            return wf0.m29526n();
        }
        return new C3739h(gVar);
    }

    /* renamed from: o0 */
    public <T> T mo28490o0(C3740i<T> iVar) {
        C3738g<AnnotatedField> gVar;
        C3738g<AnnotatedMethod> gVar2;
        T t = null;
        if (this.f20569g == null) {
            return null;
        }
        if (this.f20567d) {
            C3738g<AnnotatedMethod> gVar3 = this.f20574y;
            if (gVar3 != null) {
                t = iVar.mo28501a((AnnotatedMember) gVar3.f20581a);
            }
        } else {
            C3738g<AnnotatedParameter> gVar4 = this.f20573x;
            if (gVar4 != null) {
                t = iVar.mo28501a((AnnotatedMember) gVar4.f20581a);
            }
            if (t == null && (gVar2 = this.f20564A) != null) {
                t = iVar.mo28501a((AnnotatedMember) gVar2.f20581a);
            }
        }
        if (t != null || (gVar = this.f20572s) == null) {
            return t;
        }
        return iVar.mo28501a((AnnotatedMember) gVar.f20581a);
    }

    /* renamed from: p */
    public AnnotatedField mo24890p() {
        C3738g<AnnotatedField> gVar = this.f20572s;
        if (gVar == null) {
            return null;
        }
        AnnotatedField annotatedField = (AnnotatedField) gVar.f20581a;
        C3738g<T> gVar2 = gVar.f20582b;
        while (gVar2 != null) {
            AnnotatedField annotatedField2 = (AnnotatedField) gVar2.f20581a;
            Class<?> declaringClass = annotatedField.getDeclaringClass();
            Class<?> declaringClass2 = annotatedField2.getDeclaringClass();
            if (declaringClass != declaringClass2) {
                if (declaringClass.isAssignableFrom(declaringClass2)) {
                    annotatedField = annotatedField2;
                } else if (declaringClass2.isAssignableFrom(declaringClass)) {
                }
                gVar2 = gVar2.f20582b;
            }
            throw new IllegalArgumentException("Multiple fields representing property \"" + getName() + "\": " + annotatedField.getFullName() + " vs " + annotatedField2.getFullName());
        }
        return annotatedField;
    }

    /* renamed from: p0 */
    public <T> T mo28491p0(C3740i<T> iVar, T t) {
        T a;
        T a2;
        T a3;
        T a4;
        T a5;
        T a6;
        T a7;
        T a8;
        if (this.f20569g == null) {
            return null;
        }
        if (this.f20567d) {
            C3738g<AnnotatedMethod> gVar = this.f20574y;
            if (gVar != null && (a8 = iVar.mo28501a((AnnotatedMember) gVar.f20581a)) != null && a8 != t) {
                return a8;
            }
            C3738g<AnnotatedField> gVar2 = this.f20572s;
            if (gVar2 != null && (a7 = iVar.mo28501a((AnnotatedMember) gVar2.f20581a)) != null && a7 != t) {
                return a7;
            }
            C3738g<AnnotatedParameter> gVar3 = this.f20573x;
            if (gVar3 != null && (a6 = iVar.mo28501a((AnnotatedMember) gVar3.f20581a)) != null && a6 != t) {
                return a6;
            }
            C3738g<AnnotatedMethod> gVar4 = this.f20564A;
            if (gVar4 == null || (a5 = iVar.mo28501a((AnnotatedMember) gVar4.f20581a)) == null || a5 == t) {
                return null;
            }
            return a5;
        }
        C3738g<AnnotatedParameter> gVar5 = this.f20573x;
        if (gVar5 != null && (a4 = iVar.mo28501a((AnnotatedMember) gVar5.f20581a)) != null && a4 != t) {
            return a4;
        }
        C3738g<AnnotatedMethod> gVar6 = this.f20564A;
        if (gVar6 != null && (a3 = iVar.mo28501a((AnnotatedMember) gVar6.f20581a)) != null && a3 != t) {
            return a3;
        }
        C3738g<AnnotatedField> gVar7 = this.f20572s;
        if (gVar7 != null && (a2 = iVar.mo28501a((AnnotatedMember) gVar7.f20581a)) != null && a2 != t) {
            return a2;
        }
        C3738g<AnnotatedMethod> gVar8 = this.f20574y;
        if (gVar8 == null || (a = iVar.mo28501a((AnnotatedMember) gVar8.f20581a)) == null || a == t) {
            return null;
        }
        return a;
    }

    /* renamed from: q0 */
    public AnnotatedField mo28492q0() {
        C3738g<AnnotatedField> gVar = this.f20572s;
        if (gVar == null) {
            return null;
        }
        return (AnnotatedField) gVar.f20581a;
    }

    /* renamed from: r */
    public AnnotatedMethod mo24891r() {
        C3738g<AnnotatedMethod> gVar = this.f20574y;
        if (gVar == null) {
            return null;
        }
        C3738g<T> gVar2 = gVar.f20582b;
        if (gVar2 == null) {
            return (AnnotatedMethod) gVar.f20581a;
        }
        while (gVar2 != null) {
            Class<?> declaringClass = ((AnnotatedMethod) gVar.f20581a).getDeclaringClass();
            Class<?> declaringClass2 = ((AnnotatedMethod) gVar2.f20581a).getDeclaringClass();
            if (declaringClass != declaringClass2) {
                if (!declaringClass.isAssignableFrom(declaringClass2)) {
                    if (declaringClass2.isAssignableFrom(declaringClass)) {
                        continue;
                        gVar2 = gVar2.f20582b;
                    }
                }
                gVar = gVar2;
                gVar2 = gVar2.f20582b;
            }
            int R = mo28469R((AnnotatedMethod) gVar2.f20581a);
            int R2 = mo28469R((AnnotatedMethod) gVar.f20581a);
            if (R != R2) {
                if (R >= R2) {
                    gVar2 = gVar2.f20582b;
                }
                gVar = gVar2;
                gVar2 = gVar2.f20582b;
            } else {
                throw new IllegalArgumentException("Conflicting getter definitions for property \"" + getName() + "\": " + ((AnnotatedMethod) gVar.f20581a).getFullName() + " vs " + ((AnnotatedMethod) gVar2.f20581a).getFullName());
            }
        }
        this.f20574y = gVar.mo28512f();
        return (AnnotatedMethod) gVar.f20581a;
    }

    /* renamed from: r0 */
    public AnnotatedMethod mo28493r0() {
        C3738g<AnnotatedMethod> gVar = this.f20574y;
        if (gVar == null) {
            return null;
        }
        return (AnnotatedMethod) gVar.f20581a;
    }

    /* renamed from: s0 */
    public String mo28494s0() {
        return this.f20571r.getSimpleName();
    }

    /* renamed from: t0 */
    public AnnotatedMember mo28495t0() {
        if (this.f20567d) {
            C3738g<AnnotatedMethod> gVar = this.f20574y;
            if (gVar != null) {
                return (AnnotatedMember) gVar.f20581a;
            }
            C3738g<AnnotatedField> gVar2 = this.f20572s;
            if (gVar2 != null) {
                return (AnnotatedMember) gVar2.f20581a;
            }
            return null;
        }
        C3738g<AnnotatedParameter> gVar3 = this.f20573x;
        if (gVar3 != null) {
            return (AnnotatedMember) gVar3.f20581a;
        }
        C3738g<AnnotatedMethod> gVar4 = this.f20564A;
        if (gVar4 != null) {
            return (AnnotatedMember) gVar4.f20581a;
        }
        C3738g<AnnotatedField> gVar5 = this.f20572s;
        if (gVar5 != null) {
            return (AnnotatedMember) gVar5.f20581a;
        }
        C3738g<AnnotatedMethod> gVar6 = this.f20574y;
        if (gVar6 != null) {
            return (AnnotatedMember) gVar6.f20581a;
        }
        return null;
    }

    public String toString() {
        return "[Property '" + this.f20570k + "'; ctors: " + this.f20573x + ", field(s): " + this.f20572s + ", getter(s): " + this.f20574y + ", setter(s): " + this.f20564A + "]";
    }

    /* renamed from: u0 */
    public AnnotatedMethod mo28497u0() {
        C3738g<AnnotatedMethod> gVar = this.f20564A;
        if (gVar == null) {
            return null;
        }
        return (AnnotatedMethod) gVar.f20581a;
    }

    /* renamed from: v */
    public AnnotatedMember mo24894v() {
        if (this.f20567d) {
            return mo24887l();
        }
        AnnotatedMember t = mo24892t();
        if (t == null) {
            return mo24887l();
        }
        return t;
    }

    /* renamed from: v0 */
    public boolean mo28498v0() {
        if (this.f20574y != null) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    public JavaType mo24895w() {
        if (this.f20567d) {
            C2911nl r = mo24891r();
            if (r == null && (r = mo24890p()) == null) {
                return TypeFactory.unknownType();
            }
            return r.getType();
        }
        C2911nl m = mo24888m();
        if (m == null) {
            AnnotatedMethod y = mo24897y();
            if (y != null) {
                return y.getParameterType(0);
            }
            m = mo24890p();
        }
        if (m == null && (m = mo24891r()) == null) {
            return TypeFactory.unknownType();
        }
        return m.getType();
    }

    /* renamed from: x */
    public Class<?> mo24896x() {
        return mo24895w().getRawClass();
    }

    /* renamed from: x0 */
    public void mo28499x0(boolean z) {
        if (z) {
            C3738g<AnnotatedMethod> gVar = this.f20574y;
            if (gVar != null) {
                this.f20574y = mo28464L(this.f20574y, mo28470S(0, gVar, this.f20572s, this.f20573x, this.f20564A));
                return;
            }
            C3738g<AnnotatedField> gVar2 = this.f20572s;
            if (gVar2 != null) {
                this.f20572s = mo28464L(this.f20572s, mo28470S(0, gVar2, this.f20573x, this.f20564A));
                return;
            }
            return;
        }
        C3738g<AnnotatedParameter> gVar3 = this.f20573x;
        if (gVar3 != null) {
            this.f20573x = mo28464L(this.f20573x, mo28470S(0, gVar3, this.f20564A, this.f20572s, this.f20574y));
            return;
        }
        C3738g<AnnotatedMethod> gVar4 = this.f20564A;
        if (gVar4 != null) {
            this.f20564A = mo28464L(this.f20564A, mo28470S(0, gVar4, this.f20572s, this.f20574y));
            return;
        }
        C3738g<AnnotatedField> gVar5 = this.f20572s;
        if (gVar5 != null) {
            this.f20572s = mo28464L(this.f20572s, mo28470S(0, gVar5, this.f20574y));
        }
    }

    /* renamed from: y */
    public AnnotatedMethod mo24897y() {
        C3738g<AnnotatedMethod> gVar = this.f20564A;
        if (gVar == null) {
            return null;
        }
        C3738g<T> gVar2 = gVar.f20582b;
        if (gVar2 == null) {
            return (AnnotatedMethod) gVar.f20581a;
        }
        while (gVar2 != null) {
            T Y = mo28474Y((AnnotatedMethod) gVar.f20581a, (AnnotatedMethod) gVar2.f20581a);
            if (Y != gVar.f20581a) {
                if (Y != gVar2.f20581a) {
                    return mo28475Z(gVar, gVar2);
                }
                gVar = gVar2;
            }
            gVar2 = gVar2.f20582b;
        }
        this.f20564A = gVar.mo28512f();
        return (AnnotatedMethod) gVar.f20581a;
    }

    /* renamed from: z */
    public boolean mo24898z() {
        if (this.f20573x != null) {
            return true;
        }
        return false;
    }

    /* renamed from: z0 */
    public void mo28500z0() {
        this.f20573x = null;
    }

    public zj4(MapperConfig<?> mapperConfig, AnnotationIntrospector annotationIntrospector, boolean z, PropertyName propertyName, PropertyName propertyName2) {
        this.f20568e = mapperConfig;
        this.f20569g = annotationIntrospector;
        this.f20571r = propertyName;
        this.f20570k = propertyName2;
        this.f20567d = z;
    }

    public zj4(zj4 zj4, PropertyName propertyName) {
        this.f20568e = zj4.f20568e;
        this.f20569g = zj4.f20569g;
        this.f20571r = zj4.f20571r;
        this.f20570k = propertyName;
        this.f20572s = zj4.f20572s;
        this.f20573x = zj4.f20573x;
        this.f20574y = zj4.f20574y;
        this.f20564A = zj4.f20564A;
        this.f20567d = zj4.f20567d;
    }
}
