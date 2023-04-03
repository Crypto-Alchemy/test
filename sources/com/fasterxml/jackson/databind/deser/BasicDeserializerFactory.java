package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.ConstructorDetector;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.deser.impl.JDKValueInstantiators;
import com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer;
import com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer;
import com.fasterxml.jackson.databind.deser.std.CollectionDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateDeserializers;
import com.fasterxml.jackson.databind.deser.std.EnumDeserializer;
import com.fasterxml.jackson.databind.deser.std.EnumSetDeserializer;
import com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer;
import com.fasterxml.jackson.databind.deser.std.MapEntryDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers;
import com.fasterxml.jackson.databind.deser.std.ObjectArrayDeserializer;
import com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers;
import com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer;
import com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer;
import com.fasterxml.jackson.databind.deser.std.StringDeserializer;
import com.fasterxml.jackson.databind.deser.std.TokenBufferDeserializer;
import com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.ext.OptionalHandlerFactory;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.introspect.C2021a;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.EnumResolver;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.atomic.AtomicReference;

public abstract class BasicDeserializerFactory extends C1999a implements Serializable {
    public static final PropertyName UNWRAPPED_CREATOR_PARAM_NAME = new PropertyName("@JsonUnwrapped");

    /* renamed from: a */
    public static final Class<?> f9907a = Object.class;

    /* renamed from: d */
    public static final Class<?> f9908d = String.class;

    /* renamed from: e */
    public static final Class<?> f9909e = CharSequence.class;

    /* renamed from: g */
    public static final Class<?> f9910g = Iterable.class;

    /* renamed from: k */
    public static final Class<?> f9911k = Map.Entry.class;

    /* renamed from: r */
    public static final Class<?> f9912r = Serializable.class;
    public final DeserializerFactoryConfig _factoryConfig;

    /* renamed from: com.fasterxml.jackson.databind.deser.BasicDeserializerFactory$a */
    public static /* synthetic */ class C1992a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f9913a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f9914b;

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|(2:1|2)|3|(2:5|6)|7|9|10|(2:11|12)|13|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004e */
        static {
            /*
                com.fasterxml.jackson.databind.cfg.ConstructorDetector$SingleArgConstructor[] r0 = com.fasterxml.jackson.databind.cfg.ConstructorDetector.SingleArgConstructor.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9914b = r0
                r1 = 1
                com.fasterxml.jackson.databind.cfg.ConstructorDetector$SingleArgConstructor r2 = com.fasterxml.jackson.databind.cfg.ConstructorDetector.SingleArgConstructor.DELEGATING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f9914b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fasterxml.jackson.databind.cfg.ConstructorDetector$SingleArgConstructor r3 = com.fasterxml.jackson.databind.cfg.ConstructorDetector.SingleArgConstructor.PROPERTIES     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f9914b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.fasterxml.jackson.databind.cfg.ConstructorDetector$SingleArgConstructor r4 = com.fasterxml.jackson.databind.cfg.ConstructorDetector.SingleArgConstructor.REQUIRE_MODE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r3 = f9914b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.fasterxml.jackson.databind.cfg.ConstructorDetector$SingleArgConstructor r4 = com.fasterxml.jackson.databind.cfg.ConstructorDetector.SingleArgConstructor.HEURISTIC     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                com.fasterxml.jackson.annotation.JsonCreator$Mode[] r3 = com.fasterxml.jackson.annotation.JsonCreator.Mode.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f9913a = r3
                com.fasterxml.jackson.annotation.JsonCreator$Mode r4 = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = f9913a     // Catch:{ NoSuchFieldError -> 0x004e }
                com.fasterxml.jackson.annotation.JsonCreator$Mode r3 = com.fasterxml.jackson.annotation.JsonCreator.Mode.PROPERTIES     // Catch:{ NoSuchFieldError -> 0x004e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f9913a     // Catch:{ NoSuchFieldError -> 0x0058 }
                com.fasterxml.jackson.annotation.JsonCreator$Mode r1 = com.fasterxml.jackson.annotation.JsonCreator.Mode.DEFAULT     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.C1992a.<clinit>():void");
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.deser.BasicDeserializerFactory$b */
    public static class C1993b {

        /* renamed from: a */
        public static final HashMap<String, Class<? extends Collection>> f9915a;

        /* renamed from: b */
        public static final HashMap<String, Class<? extends Map>> f9916b;

        static {
            HashMap<String, Class<? extends Collection>> hashMap = new HashMap<>();
            Class<ArrayList> cls = ArrayList.class;
            Class<HashSet> cls2 = HashSet.class;
            hashMap.put(Collection.class.getName(), cls);
            hashMap.put(List.class.getName(), cls);
            hashMap.put(Set.class.getName(), cls2);
            hashMap.put(SortedSet.class.getName(), TreeSet.class);
            hashMap.put(Queue.class.getName(), LinkedList.class);
            hashMap.put(AbstractList.class.getName(), cls);
            hashMap.put(AbstractSet.class.getName(), cls2);
            hashMap.put(Deque.class.getName(), LinkedList.class);
            hashMap.put(NavigableSet.class.getName(), TreeSet.class);
            f9915a = hashMap;
            HashMap<String, Class<? extends Map>> hashMap2 = new HashMap<>();
            Class<LinkedHashMap> cls3 = LinkedHashMap.class;
            hashMap2.put(Map.class.getName(), cls3);
            hashMap2.put(AbstractMap.class.getName(), cls3);
            hashMap2.put(ConcurrentMap.class.getName(), ConcurrentHashMap.class);
            hashMap2.put(SortedMap.class.getName(), TreeMap.class);
            hashMap2.put(NavigableMap.class.getName(), TreeMap.class);
            hashMap2.put(ConcurrentNavigableMap.class.getName(), ConcurrentSkipListMap.class);
            f9916b = hashMap2;
        }

        /* renamed from: a */
        public static Class<?> m14030a(JavaType javaType) {
            return f9915a.get(javaType.getRawClass().getName());
        }

        /* renamed from: b */
        public static Class<?> m14031b(JavaType javaType) {
            return f9916b.get(javaType.getRawClass().getName());
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.deser.BasicDeserializerFactory$c */
    public static class C1994c {

        /* renamed from: a */
        public final DeserializationContext f9917a;

        /* renamed from: b */
        public final n00 f9918b;

        /* renamed from: c */
        public final VisibilityChecker<?> f9919c;

        /* renamed from: d */
        public final bw0 f9920d;

        /* renamed from: e */
        public final Map<AnnotatedWithParams, q00[]> f9921e;

        /* renamed from: f */
        public List<aw0> f9922f;

        /* renamed from: g */
        public int f9923g;

        /* renamed from: h */
        public List<aw0> f9924h;

        /* renamed from: i */
        public int f9925i;

        public C1994c(DeserializationContext deserializationContext, n00 n00, VisibilityChecker<?> visibilityChecker, bw0 bw0, Map<AnnotatedWithParams, q00[]> map) {
            this.f9917a = deserializationContext;
            this.f9918b = n00;
            this.f9919c = visibilityChecker;
            this.f9920d = bw0;
            this.f9921e = map;
        }

        /* renamed from: a */
        public void mo15308a(aw0 aw0) {
            if (this.f9924h == null) {
                this.f9924h = new LinkedList();
            }
            this.f9924h.add(aw0);
        }

        /* renamed from: b */
        public void mo15309b(aw0 aw0) {
            if (this.f9922f == null) {
                this.f9922f = new LinkedList();
            }
            this.f9922f.add(aw0);
        }

        /* renamed from: c */
        public AnnotationIntrospector mo15310c() {
            return this.f9917a.getAnnotationIntrospector();
        }

        /* renamed from: d */
        public boolean mo15311d() {
            if (this.f9925i > 0) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        public boolean mo15312e() {
            if (this.f9923g > 0) {
                return true;
            }
            return false;
        }

        /* renamed from: f */
        public boolean mo15313f() {
            if (this.f9924h != null) {
                return true;
            }
            return false;
        }

        /* renamed from: g */
        public boolean mo15314g() {
            if (this.f9922f != null) {
                return true;
            }
            return false;
        }

        /* renamed from: h */
        public List<aw0> mo15315h() {
            return this.f9924h;
        }

        /* renamed from: i */
        public List<aw0> mo15316i() {
            return this.f9922f;
        }

        /* renamed from: j */
        public void mo15317j() {
            this.f9925i++;
        }

        /* renamed from: k */
        public void mo15318k() {
            this.f9923g++;
        }
    }

    public BasicDeserializerFactory(DeserializerFactoryConfig deserializerFactoryConfig) {
        this._factoryConfig = deserializerFactoryConfig;
    }

    @Deprecated
    public void _addExplicitAnyCreator(DeserializationContext deserializationContext, n00 n00, bw0 bw0, aw0 aw0) throws JsonMappingException {
        _addExplicitAnyCreator(deserializationContext, n00, bw0, aw0, deserializationContext.getConfig().getConstructorDetector());
    }

    public void _addExplicitConstructorCreators(DeserializationContext deserializationContext, C1994c cVar, boolean z) throws JsonMappingException {
        n00 n00 = cVar.f9918b;
        bw0 bw0 = cVar.f9920d;
        AnnotationIntrospector c = cVar.mo15310c();
        VisibilityChecker<?> visibilityChecker = cVar.f9919c;
        Map<AnnotatedWithParams, q00[]> map = cVar.f9921e;
        AnnotatedConstructor d = n00.mo23446d();
        if (d != null && (!bw0.mo11909o() || _hasCreatorAnnotation(deserializationContext, d))) {
            bw0.mo11912r(d);
        }
        for (AnnotatedConstructor next : n00.mo23463u()) {
            JsonCreator.Mode findCreatorAnnotation = c.findCreatorAnnotation(deserializationContext.getConfig(), next);
            if (JsonCreator.Mode.DISABLED != findCreatorAnnotation) {
                if (findCreatorAnnotation != null) {
                    int i = C1992a.f9913a[findCreatorAnnotation.ordinal()];
                    if (i == 1) {
                        _addExplicitDelegatingCreator(deserializationContext, n00, bw0, aw0.m10833a(c, next, (q00[]) null));
                    } else if (i != 2) {
                        _addExplicitAnyCreator(deserializationContext, n00, bw0, aw0.m10833a(c, next, map.get(next)), deserializationContext.getConfig().getConstructorDetector());
                    } else {
                        _addExplicitPropertyCreator(deserializationContext, n00, bw0, aw0.m10833a(c, next, map.get(next)));
                    }
                    cVar.mo15317j();
                } else if (z && visibilityChecker.isCreatorVisible(next)) {
                    cVar.mo15308a(aw0.m10833a(c, next, map.get(next)));
                }
            }
        }
    }

    public void _addExplicitDelegatingCreator(DeserializationContext deserializationContext, n00 n00, bw0 bw0, aw0 aw0) throws JsonMappingException {
        DeserializationContext deserializationContext2 = deserializationContext;
        n00 n002 = n00;
        bw0 bw02 = bw0;
        aw0 aw02 = aw0;
        int g = aw0.mo11165g();
        SettableBeanProperty[] settableBeanPropertyArr = new SettableBeanProperty[g];
        int i = -1;
        for (int i2 = 0; i2 < g; i2++) {
            AnnotatedParameter i3 = aw02.mo11167i(i2);
            JacksonInject.Value f = aw02.mo11164f(i2);
            if (f != null) {
                settableBeanPropertyArr[i2] = constructCreatorProperty(deserializationContext, n00, (PropertyName) null, i2, i3, f);
            } else if (i < 0) {
                i = i2;
            } else {
                deserializationContext2.reportBadTypeDefinition(n002, "More than one argument (#%d and #%d) left as delegating for Creator %s: only one allowed", Integer.valueOf(i), Integer.valueOf(i2), aw02);
            }
        }
        if (i < 0) {
            deserializationContext2.reportBadTypeDefinition(n002, "No argument left as delegating for Creator %s: exactly one required", aw02);
        }
        if (g == 1) {
            _handleSingleArgumentCreator(bw02, aw0.mo11160b(), true, true);
            q00 j = aw02.mo11168j(0);
            if (j != null) {
                ((zj4) j).mo28500z0();
                return;
            }
            return;
        }
        bw02.mo11902h(aw0.mo11160b(), true, settableBeanPropertyArr, i);
    }

    public void _addExplicitFactoryCreators(DeserializationContext deserializationContext, C1994c cVar, boolean z) throws JsonMappingException {
        n00 n00 = cVar.f9918b;
        bw0 bw0 = cVar.f9920d;
        AnnotationIntrospector c = cVar.mo15310c();
        VisibilityChecker<?> visibilityChecker = cVar.f9919c;
        Map<AnnotatedWithParams, q00[]> map = cVar.f9921e;
        for (AnnotatedMethod next : n00.mo23465w()) {
            JsonCreator.Mode findCreatorAnnotation = c.findCreatorAnnotation(deserializationContext.getConfig(), next);
            int parameterCount = next.getParameterCount();
            if (findCreatorAnnotation == null) {
                if (z && parameterCount == 1 && visibilityChecker.isCreatorVisible(next)) {
                    cVar.mo15309b(aw0.m10833a(c, next, (q00[]) null));
                }
            } else if (findCreatorAnnotation != JsonCreator.Mode.DISABLED) {
                if (parameterCount == 0) {
                    bw0.mo11912r(next);
                } else {
                    int i = C1992a.f9913a[findCreatorAnnotation.ordinal()];
                    if (i == 1) {
                        _addExplicitDelegatingCreator(deserializationContext, n00, bw0, aw0.m10833a(c, next, (q00[]) null));
                    } else if (i != 2) {
                        _addExplicitAnyCreator(deserializationContext, n00, bw0, aw0.m10833a(c, next, map.get(next)), ConstructorDetector.DEFAULT);
                    } else {
                        _addExplicitPropertyCreator(deserializationContext, n00, bw0, aw0.m10833a(c, next, map.get(next)));
                    }
                    cVar.mo15318k();
                }
            }
        }
    }

    public void _addExplicitPropertyCreator(DeserializationContext deserializationContext, n00 n00, bw0 bw0, aw0 aw0) throws JsonMappingException {
        aw0 aw02 = aw0;
        int g = aw0.mo11165g();
        SettableBeanProperty[] settableBeanPropertyArr = new SettableBeanProperty[g];
        int i = 0;
        while (i < g) {
            JacksonInject.Value f = aw02.mo11164f(i);
            AnnotatedParameter i2 = aw02.mo11167i(i);
            PropertyName h = aw02.mo11166h(i);
            if (h == null) {
                DeserializationContext deserializationContext2 = deserializationContext;
                n00 n002 = n00;
                if (deserializationContext.getAnnotationIntrospector().findUnwrappingNameTransformer(i2) != null) {
                    _reportUnwrappedCreatorProperty(deserializationContext2, n002, i2);
                }
                PropertyName d = aw02.mo11162d(i);
                _validateNamedPropertyParameter(deserializationContext, n00, aw0, i, d, f);
                h = d;
            } else {
                DeserializationContext deserializationContext3 = deserializationContext;
                n00 n003 = n00;
            }
            int i3 = i;
            settableBeanPropertyArr[i3] = constructCreatorProperty(deserializationContext, n00, h, i, i2, f);
            i = i3 + 1;
        }
        bw0.mo11906l(aw0.mo11160b(), true, settableBeanPropertyArr);
    }

    public void _addImplicitConstructorCreators(DeserializationContext deserializationContext, C1994c cVar, List<aw0> list) throws JsonMappingException {
        VisibilityChecker<?> visibilityChecker;
        Iterator<aw0> it;
        boolean z;
        bw0 bw0;
        LinkedList linkedList;
        PropertyName propertyName;
        bw0 bw02;
        VisibilityChecker<?> visibilityChecker2;
        boolean z2;
        Iterator<aw0> it2;
        boolean z3;
        int i;
        SettableBeanProperty[] settableBeanPropertyArr;
        AnnotatedWithParams annotatedWithParams;
        int i2;
        aw0 aw0;
        aw0 aw02;
        int i3;
        boolean z4;
        DeserializationContext deserializationContext2 = deserializationContext;
        C1994c cVar2 = cVar;
        DeserializationConfig config = deserializationContext.getConfig();
        n00 n00 = cVar2.f9918b;
        bw0 bw03 = cVar2.f9920d;
        AnnotationIntrospector c = cVar.mo15310c();
        VisibilityChecker<?> visibilityChecker3 = cVar2.f9919c;
        boolean singleArgCreatorDefaultsToProperties = config.getConstructorDetector().singleArgCreatorDefaultsToProperties();
        Iterator<aw0> it3 = list.iterator();
        LinkedList linkedList2 = null;
        while (it3.hasNext()) {
            aw0 next = it3.next();
            int g = next.mo11165g();
            AnnotatedWithParams b = next.mo11160b();
            boolean z5 = true;
            if (g == 1) {
                q00 j = next.mo11168j(0);
                if (singleArgCreatorDefaultsToProperties || mo15271a(c, b, j)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    SettableBeanProperty[] settableBeanPropertyArr2 = new SettableBeanProperty[1];
                    JacksonInject.Value f = next.mo11164f(0);
                    PropertyName h = next.mo11166h(0);
                    if (!(h == null && (h = next.mo11162d(0)) == null && f == null)) {
                        SettableBeanProperty[] settableBeanPropertyArr3 = settableBeanPropertyArr2;
                        settableBeanPropertyArr3[0] = constructCreatorProperty(deserializationContext, n00, h, 0, next.mo11167i(0), f);
                        bw03.mo11906l(b, false, settableBeanPropertyArr3);
                    }
                } else {
                    _handleSingleArgumentCreator(bw03, b, false, visibilityChecker3.isCreatorVisible(b));
                    if (j != null) {
                        ((zj4) j).mo28500z0();
                    }
                }
                bw0 = bw03;
                visibilityChecker = visibilityChecker3;
                z = singleArgCreatorDefaultsToProperties;
                it = it3;
            } else {
                SettableBeanProperty[] settableBeanPropertyArr4 = new SettableBeanProperty[g];
                int i4 = -1;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                while (i5 < g) {
                    AnnotatedParameter parameter = b.getParameter(i5);
                    q00 j2 = next.mo11168j(i5);
                    JacksonInject.Value findInjectableValue = c.findInjectableValue(parameter);
                    if (j2 == null) {
                        propertyName = null;
                    } else {
                        propertyName = j2.getFullName();
                    }
                    if (j2 == null || !j2.mo24875F()) {
                        i = i5;
                        z2 = z5;
                        bw02 = bw03;
                        visibilityChecker2 = visibilityChecker3;
                        z3 = singleArgCreatorDefaultsToProperties;
                        it2 = it3;
                        i3 = i4;
                        settableBeanPropertyArr = settableBeanPropertyArr4;
                        annotatedWithParams = b;
                        i2 = g;
                        if (findInjectableValue != null) {
                            i7++;
                            AnnotatedParameter annotatedParameter = parameter;
                            aw02 = next;
                            settableBeanPropertyArr[i] = constructCreatorProperty(deserializationContext, n00, propertyName, i, annotatedParameter, findInjectableValue);
                        } else {
                            aw0 = next;
                            if (c.findUnwrappingNameTransformer(parameter) != null) {
                                _reportUnwrappedCreatorProperty(deserializationContext2, n00, parameter);
                            } else if (i3 < 0) {
                                i4 = i;
                                next = aw0;
                                i5 = i + 1;
                                g = i2;
                                b = annotatedWithParams;
                                settableBeanPropertyArr4 = settableBeanPropertyArr;
                                singleArgCreatorDefaultsToProperties = z3;
                                it3 = it2;
                                z5 = z2;
                                visibilityChecker3 = visibilityChecker2;
                                bw03 = bw02;
                            }
                            i4 = i3;
                            next = aw0;
                            i5 = i + 1;
                            g = i2;
                            b = annotatedWithParams;
                            settableBeanPropertyArr4 = settableBeanPropertyArr;
                            singleArgCreatorDefaultsToProperties = z3;
                            it3 = it2;
                            z5 = z2;
                            visibilityChecker3 = visibilityChecker2;
                            bw03 = bw02;
                        }
                    } else {
                        i6++;
                        i = i5;
                        z3 = singleArgCreatorDefaultsToProperties;
                        i3 = i4;
                        it2 = it3;
                        settableBeanPropertyArr = settableBeanPropertyArr4;
                        z2 = z5;
                        visibilityChecker2 = visibilityChecker3;
                        annotatedWithParams = b;
                        bw02 = bw03;
                        i2 = g;
                        AnnotatedParameter annotatedParameter2 = parameter;
                        aw02 = next;
                        settableBeanPropertyArr[i] = constructCreatorProperty(deserializationContext, n00, propertyName, i, annotatedParameter2, findInjectableValue);
                    }
                    i4 = i3;
                    aw0 = aw02;
                    next = aw0;
                    i5 = i + 1;
                    g = i2;
                    b = annotatedWithParams;
                    settableBeanPropertyArr4 = settableBeanPropertyArr;
                    singleArgCreatorDefaultsToProperties = z3;
                    it3 = it2;
                    z5 = z2;
                    visibilityChecker3 = visibilityChecker2;
                    bw03 = bw02;
                }
                char c2 = z5;
                aw0 aw03 = next;
                bw0 bw04 = bw03;
                visibilityChecker = visibilityChecker3;
                z = singleArgCreatorDefaultsToProperties;
                it = it3;
                int i8 = i4;
                SettableBeanProperty[] settableBeanPropertyArr5 = settableBeanPropertyArr4;
                AnnotatedWithParams annotatedWithParams2 = b;
                int i9 = g;
                int i10 = i6 + 0;
                if (i6 <= 0 && i7 <= 0) {
                    bw0 = bw04;
                } else if (i10 + i7 == i9) {
                    bw0 = bw04;
                    bw0.mo11906l(annotatedWithParams2, false, settableBeanPropertyArr5);
                } else {
                    bw0 = bw04;
                    if (i6 == 0 && i7 + 1 == i9) {
                        bw0.mo11902h(annotatedWithParams2, false, settableBeanPropertyArr5, 0);
                    } else {
                        PropertyName d = aw03.mo11162d(i8);
                        if (d == null || d.isEmpty()) {
                            Object[] objArr = new Object[2];
                            objArr[0] = Integer.valueOf(i8);
                            objArr[c2] = annotatedWithParams2;
                            deserializationContext2.reportBadTypeDefinition(n00, "Argument #%d of constructor %s has no property name annotation; must have name when multiple-parameter constructor annotated as Creator", objArr);
                        }
                    }
                }
                if (!bw0.mo11909o()) {
                    if (linkedList2 == null) {
                        linkedList = new LinkedList();
                    } else {
                        linkedList = linkedList2;
                    }
                    linkedList.add(annotatedWithParams2);
                    linkedList2 = linkedList;
                }
            }
            bw03 = bw0;
            singleArgCreatorDefaultsToProperties = z;
            it3 = it;
            visibilityChecker3 = visibilityChecker;
        }
        bw0 bw05 = bw03;
        VisibilityChecker<?> visibilityChecker4 = visibilityChecker3;
        if (linkedList2 != null && !bw05.mo11910p() && !bw05.mo11911q()) {
            mo15272b(deserializationContext, n00, visibilityChecker4, c, bw05, linkedList2);
        }
    }

    /* JADX WARNING: type inference failed for: r13v4, types: [boolean, int] */
    public void _addImplicitFactoryCreators(DeserializationContext deserializationContext, C1994c cVar, List<aw0> list) throws JsonMappingException {
        int i;
        q00 q00;
        PropertyName propertyName;
        Iterator<aw0> it;
        boolean z;
        Map<AnnotatedWithParams, q00[]> map;
        VisibilityChecker<?> visibilityChecker;
        int i2;
        AnnotatedWithParams annotatedWithParams;
        boolean z2;
        SettableBeanProperty[] settableBeanPropertyArr;
        DeserializationContext deserializationContext2 = deserializationContext;
        C1994c cVar2 = cVar;
        n00 n00 = cVar2.f9918b;
        bw0 bw0 = cVar2.f9920d;
        AnnotationIntrospector c = cVar.mo15310c();
        VisibilityChecker<?> visibilityChecker2 = cVar2.f9919c;
        Map<AnnotatedWithParams, q00[]> map2 = cVar2.f9921e;
        Iterator<aw0> it2 = list.iterator();
        while (it2.hasNext()) {
            aw0 next = it2.next();
            int g = next.mo11165g();
            AnnotatedWithParams b = next.mo11160b();
            q00[] q00Arr = map2.get(b);
            boolean z3 = true;
            if (g == 1) {
                boolean z4 = false;
                q00 j = next.mo11168j(0);
                if (!mo15271a(c, b, j)) {
                    _handleSingleArgumentCreator(bw0, b, false, visibilityChecker2.isCreatorVisible(b));
                    if (j != null) {
                        ((zj4) j).mo28500z0();
                    }
                } else {
                    SettableBeanProperty[] settableBeanPropertyArr2 = new SettableBeanProperty[g];
                    int i3 = 0;
                    int i4 = 0;
                    int i5 = 0;
                    AnnotatedParameter annotatedParameter = null;
                    while (i3 < g) {
                        AnnotatedParameter parameter = b.getParameter(i3);
                        if (q00Arr == null) {
                            q00 = null;
                        } else {
                            q00 = q00Arr[i3];
                        }
                        JacksonInject.Value findInjectableValue = c.findInjectableValue(parameter);
                        if (q00 == null) {
                            propertyName = null;
                        } else {
                            propertyName = q00.getFullName();
                        }
                        if (q00 == null || !q00.mo24875F()) {
                            AnnotatedParameter annotatedParameter2 = parameter;
                            i2 = i3;
                            z = z3;
                            visibilityChecker = visibilityChecker2;
                            map = map2;
                            it = it2;
                            settableBeanPropertyArr = settableBeanPropertyArr2;
                            z2 = z4;
                            annotatedWithParams = b;
                            if (findInjectableValue != null) {
                                i5++;
                                settableBeanPropertyArr[i2] = constructCreatorProperty(deserializationContext, n00, propertyName, i2, annotatedParameter2, findInjectableValue);
                            } else {
                                AnnotatedParameter annotatedParameter3 = annotatedParameter2;
                                if (c.findUnwrappingNameTransformer(annotatedParameter3) != null) {
                                    _reportUnwrappedCreatorProperty(deserializationContext2, n00, annotatedParameter3);
                                } else if (annotatedParameter == null) {
                                    annotatedParameter = annotatedParameter3;
                                }
                            }
                        } else {
                            i4++;
                            i2 = i3;
                            visibilityChecker = visibilityChecker2;
                            settableBeanPropertyArr = settableBeanPropertyArr2;
                            map = map2;
                            z2 = z4;
                            z = z3;
                            it = it2;
                            annotatedWithParams = b;
                            settableBeanPropertyArr[i2] = constructCreatorProperty(deserializationContext, n00, propertyName, i2, parameter, findInjectableValue);
                        }
                        i3 = i2 + 1;
                        settableBeanPropertyArr2 = settableBeanPropertyArr;
                        z4 = z2;
                        b = annotatedWithParams;
                        visibilityChecker2 = visibilityChecker;
                        map2 = map;
                        z3 = z;
                        it2 = it;
                    }
                    char c2 = z3;
                    VisibilityChecker<?> visibilityChecker3 = visibilityChecker2;
                    Map<AnnotatedWithParams, q00[]> map3 = map2;
                    Iterator<aw0> it3 = it2;
                    SettableBeanProperty[] settableBeanPropertyArr3 = settableBeanPropertyArr2;
                    ? r13 = z4;
                    AnnotatedWithParams annotatedWithParams2 = b;
                    int i6 = i4 + 0;
                    if (i4 > 0 || i5 > 0) {
                        if (i6 + i5 == g) {
                            bw0.mo11906l(annotatedWithParams2, r13, settableBeanPropertyArr3);
                        } else if (i4 == 0 && i5 + 1 == g) {
                            bw0.mo11902h(annotatedWithParams2, r13, settableBeanPropertyArr3, r13);
                        } else {
                            Object[] objArr = new Object[2];
                            if (annotatedParameter == null) {
                                i = -1;
                            } else {
                                i = annotatedParameter.getIndex();
                            }
                            objArr[r13] = Integer.valueOf(i);
                            objArr[c2] = annotatedWithParams2;
                            deserializationContext2.reportBadTypeDefinition(n00, "Argument #%d of factory method %s has no property name annotation; must have name when multiple-parameter constructor annotated as Creator", objArr);
                        }
                    }
                    it2 = it3;
                    visibilityChecker2 = visibilityChecker3;
                    map2 = map3;
                }
            }
        }
    }

    public void _addRecordConstructor(DeserializationContext deserializationContext, C1994c cVar, AnnotatedConstructor annotatedConstructor, List<String> list) throws JsonMappingException {
        C1994c cVar2 = cVar;
        AnnotatedConstructor annotatedConstructor2 = annotatedConstructor;
        int parameterCount = annotatedConstructor.getParameterCount();
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        SettableBeanProperty[] settableBeanPropertyArr = new SettableBeanProperty[parameterCount];
        for (int i = 0; i < parameterCount; i++) {
            AnnotatedParameter parameter = annotatedConstructor2.getParameter(i);
            JacksonInject.Value findInjectableValue = annotationIntrospector.findInjectableValue(parameter);
            PropertyName findNameForDeserialization = annotationIntrospector.findNameForDeserialization(parameter);
            if (findNameForDeserialization == null || findNameForDeserialization.isEmpty()) {
                findNameForDeserialization = PropertyName.construct(list.get(i));
            } else {
                List<String> list2 = list;
            }
            settableBeanPropertyArr[i] = constructCreatorProperty(deserializationContext, cVar2.f9918b, findNameForDeserialization, i, parameter, findInjectableValue);
        }
        cVar2.f9920d.mo11906l(annotatedConstructor2, false, settableBeanPropertyArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0042, code lost:
        r2 = new java.util.ArrayList();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.deser.ValueInstantiator _constructDefaultValueInstantiator(com.fasterxml.jackson.databind.DeserializationContext r10, p000.n00 r11) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r9 = this;
            com.fasterxml.jackson.databind.DeserializationConfig r0 = r10.getConfig()
            java.lang.Class r1 = r11.mo23460r()
            com.fasterxml.jackson.databind.introspect.a r2 = r11.mo23462t()
            com.fasterxml.jackson.databind.introspect.VisibilityChecker r6 = r0.getDefaultVisibilityChecker(r1, r2)
            com.fasterxml.jackson.databind.cfg.ConstructorDetector r1 = r0.getConstructorDetector()
            bw0 r7 = new bw0
            r7.<init>(r11, r0)
            java.util.Map r8 = r9._findCreatorsFromProperties(r10, r11)
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory$c r0 = new com.fasterxml.jackson.databind.deser.BasicDeserializerFactory$c
            r3 = r0
            r4 = r10
            r5 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            boolean r2 = r1.requireCtorAnnotation()
            r2 = r2 ^ 1
            r9._addExplicitFactoryCreators(r10, r0, r2)
            com.fasterxml.jackson.databind.JavaType r2 = r11.mo23439A()
            boolean r2 = r2.isConcrete()
            if (r2 == 0) goto L_0x007c
            com.fasterxml.jackson.databind.JavaType r2 = r11.mo23439A()
            boolean r2 = r2.isRecordType()
            if (r2 == 0) goto L_0x0057
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor r3 = p000.sz2.m27204a(r10, r11, r2)
            if (r3 == 0) goto L_0x0057
            r9._addRecordConstructor(r10, r0, r3, r2)
            bw0 r11 = r0.f9920d
            com.fasterxml.jackson.databind.deser.ValueInstantiator r10 = r11.mo11908n(r10)
            return r10
        L_0x0057:
            boolean r2 = r11.mo23442D()
            if (r2 == 0) goto L_0x005e
            goto L_0x007c
        L_0x005e:
            java.lang.Class r11 = r11.mo23460r()
            boolean r11 = r1.shouldIntrospectorImplicitConstructors(r11)
            r9._addExplicitConstructorCreators(r10, r0, r11)
            boolean r11 = r0.mo15313f()
            if (r11 == 0) goto L_0x007c
            boolean r11 = r0.mo15311d()
            if (r11 != 0) goto L_0x007c
            java.util.List r11 = r0.mo15315h()
            r9._addImplicitConstructorCreators(r10, r0, r11)
        L_0x007c:
            boolean r11 = r0.mo15314g()
            if (r11 == 0) goto L_0x0095
            boolean r11 = r0.mo15312e()
            if (r11 != 0) goto L_0x0095
            boolean r11 = r0.mo15311d()
            if (r11 != 0) goto L_0x0095
            java.util.List r11 = r0.mo15316i()
            r9._addImplicitFactoryCreators(r10, r0, r11)
        L_0x0095:
            bw0 r11 = r0.f9920d
            com.fasterxml.jackson.databind.deser.ValueInstantiator r10 = r11.mo11908n(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BasicDeserializerFactory._constructDefaultValueInstantiator(com.fasterxml.jackson.databind.DeserializationContext, n00):com.fasterxml.jackson.databind.deser.ValueInstantiator");
    }

    public Map<AnnotatedWithParams, q00[]> _findCreatorsFromProperties(DeserializationContext deserializationContext, n00 n00) throws JsonMappingException {
        Map<AnnotatedWithParams, q00[]> emptyMap = Collections.emptyMap();
        for (q00 next : n00.mo23457o()) {
            Iterator<AnnotatedParameter> o = next.mo24889o();
            while (o.hasNext()) {
                AnnotatedParameter next2 = o.next();
                AnnotatedWithParams owner = next2.getOwner();
                q00[] q00Arr = emptyMap.get(owner);
                int index = next2.getIndex();
                if (q00Arr == null) {
                    if (emptyMap.isEmpty()) {
                        emptyMap = new LinkedHashMap<>();
                    }
                    q00Arr = new q00[owner.getParameterCount()];
                    emptyMap.put(owner, q00Arr);
                } else if (q00Arr[index] != null) {
                    deserializationContext.reportBadTypeDefinition(n00, "Conflict: parameter #%d of %s bound to more than one property; %s vs %s", Integer.valueOf(index), owner, q00Arr[index], next);
                }
                q00Arr[index] = next;
            }
        }
        return emptyMap;
    }

    public o43<?> _findCustomArrayDeserializer(ArrayType arrayType, DeserializationConfig deserializationConfig, n00 n00, j07 j07, o43<?> o43) throws JsonMappingException {
        for (be1 findArrayDeserializer : this._factoryConfig.deserializers()) {
            o43<?> findArrayDeserializer2 = findArrayDeserializer.findArrayDeserializer(arrayType, deserializationConfig, n00, j07, o43);
            if (findArrayDeserializer2 != null) {
                return findArrayDeserializer2;
            }
        }
        return null;
    }

    public o43<Object> _findCustomBeanDeserializer(JavaType javaType, DeserializationConfig deserializationConfig, n00 n00) throws JsonMappingException {
        for (be1 findBeanDeserializer : this._factoryConfig.deserializers()) {
            o43<?> findBeanDeserializer2 = findBeanDeserializer.findBeanDeserializer(javaType, deserializationConfig, n00);
            if (findBeanDeserializer2 != null) {
                return findBeanDeserializer2;
            }
        }
        return null;
    }

    public o43<?> _findCustomCollectionDeserializer(CollectionType collectionType, DeserializationConfig deserializationConfig, n00 n00, j07 j07, o43<?> o43) throws JsonMappingException {
        for (be1 findCollectionDeserializer : this._factoryConfig.deserializers()) {
            o43<?> findCollectionDeserializer2 = findCollectionDeserializer.findCollectionDeserializer(collectionType, deserializationConfig, n00, j07, o43);
            if (findCollectionDeserializer2 != null) {
                return findCollectionDeserializer2;
            }
        }
        return null;
    }

    public o43<?> _findCustomCollectionLikeDeserializer(CollectionLikeType collectionLikeType, DeserializationConfig deserializationConfig, n00 n00, j07 j07, o43<?> o43) throws JsonMappingException {
        for (be1 findCollectionLikeDeserializer : this._factoryConfig.deserializers()) {
            o43<?> findCollectionLikeDeserializer2 = findCollectionLikeDeserializer.findCollectionLikeDeserializer(collectionLikeType, deserializationConfig, n00, j07, o43);
            if (findCollectionLikeDeserializer2 != null) {
                return findCollectionLikeDeserializer2;
            }
        }
        return null;
    }

    public o43<?> _findCustomEnumDeserializer(Class<?> cls, DeserializationConfig deserializationConfig, n00 n00) throws JsonMappingException {
        for (be1 findEnumDeserializer : this._factoryConfig.deserializers()) {
            o43<?> findEnumDeserializer2 = findEnumDeserializer.findEnumDeserializer(cls, deserializationConfig, n00);
            if (findEnumDeserializer2 != null) {
                return findEnumDeserializer2;
            }
        }
        return null;
    }

    public o43<?> _findCustomMapDeserializer(MapType mapType, DeserializationConfig deserializationConfig, n00 n00, ha3 ha3, j07 j07, o43<?> o43) throws JsonMappingException {
        for (be1 findMapDeserializer : this._factoryConfig.deserializers()) {
            o43<?> findMapDeserializer2 = findMapDeserializer.findMapDeserializer(mapType, deserializationConfig, n00, ha3, j07, o43);
            if (findMapDeserializer2 != null) {
                return findMapDeserializer2;
            }
        }
        return null;
    }

    public o43<?> _findCustomMapLikeDeserializer(MapLikeType mapLikeType, DeserializationConfig deserializationConfig, n00 n00, ha3 ha3, j07 j07, o43<?> o43) throws JsonMappingException {
        for (be1 findMapLikeDeserializer : this._factoryConfig.deserializers()) {
            o43<?> findMapLikeDeserializer2 = findMapLikeDeserializer.findMapLikeDeserializer(mapLikeType, deserializationConfig, n00, ha3, j07, o43);
            if (findMapLikeDeserializer2 != null) {
                return findMapLikeDeserializer2;
            }
        }
        return null;
    }

    public o43<?> _findCustomReferenceDeserializer(ReferenceType referenceType, DeserializationConfig deserializationConfig, n00 n00, j07 j07, o43<?> o43) throws JsonMappingException {
        for (be1 findReferenceDeserializer : this._factoryConfig.deserializers()) {
            o43<?> findReferenceDeserializer2 = findReferenceDeserializer.findReferenceDeserializer(referenceType, deserializationConfig, n00, j07, o43);
            if (findReferenceDeserializer2 != null) {
                return findReferenceDeserializer2;
            }
        }
        return null;
    }

    public o43<?> _findCustomTreeNodeDeserializer(Class<? extends g53> cls, DeserializationConfig deserializationConfig, n00 n00) throws JsonMappingException {
        for (be1 findTreeNodeDeserializer : this._factoryConfig.deserializers()) {
            o43<?> findTreeNodeDeserializer2 = findTreeNodeDeserializer.findTreeNodeDeserializer(cls, deserializationConfig, n00);
            if (findTreeNodeDeserializer2 != null) {
                return findTreeNodeDeserializer2;
            }
        }
        return null;
    }

    @Deprecated
    public AnnotatedMethod _findJsonValueFor(DeserializationConfig deserializationConfig, JavaType javaType) {
        if (javaType == null) {
            return null;
        }
        return deserializationConfig.introspect(javaType).mo23453k();
    }

    public JavaType _findRemappedType(DeserializationConfig deserializationConfig, Class<?> cls) throws JsonMappingException {
        JavaType mapAbstractType = mapAbstractType(deserializationConfig, deserializationConfig.constructType(cls));
        if (mapAbstractType == null || mapAbstractType.hasRawClass(cls)) {
            return null;
        }
        return mapAbstractType;
    }

    public PropertyMetadata _getSetterInfo(DeserializationContext deserializationContext, BeanProperty beanProperty, PropertyMetadata propertyMetadata) {
        Nulls nulls;
        JsonSetter.Value findSetterInfo;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        DeserializationConfig config = deserializationContext.getConfig();
        AnnotatedMember member = beanProperty.getMember();
        Nulls nulls2 = null;
        if (member != null) {
            if (annotationIntrospector == null || (findSetterInfo = annotationIntrospector.findSetterInfo(member)) == null) {
                nulls = null;
            } else {
                nulls2 = findSetterInfo.nonDefaultValueNulls();
                nulls = findSetterInfo.nonDefaultContentNulls();
            }
            JsonSetter.Value setterInfo = config.getConfigOverride(beanProperty.getType().getRawClass()).getSetterInfo();
            if (setterInfo != null) {
                if (nulls2 == null) {
                    nulls2 = setterInfo.nonDefaultValueNulls();
                }
                if (nulls == null) {
                    nulls = setterInfo.nonDefaultContentNulls();
                }
            }
        } else {
            nulls = null;
        }
        JsonSetter.Value defaultSetterInfo = config.getDefaultSetterInfo();
        if (nulls2 == null) {
            nulls2 = defaultSetterInfo.nonDefaultValueNulls();
        }
        if (nulls == null) {
            nulls = defaultSetterInfo.nonDefaultContentNulls();
        }
        if (nulls2 == null && nulls == null) {
            return propertyMetadata;
        }
        return propertyMetadata.withNulls(nulls2, nulls);
    }

    public boolean _handleSingleArgumentCreator(bw0 bw0, AnnotatedWithParams annotatedWithParams, boolean z, boolean z2) {
        Class<?> rawParameterType = annotatedWithParams.getRawParameterType(0);
        if (rawParameterType == String.class || rawParameterType == f9909e) {
            if (z || z2) {
                bw0.mo11907m(annotatedWithParams, z);
            }
            return true;
        } else if (rawParameterType == Integer.TYPE || rawParameterType == Integer.class) {
            if (z || z2) {
                bw0.mo11904j(annotatedWithParams, z);
            }
            return true;
        } else if (rawParameterType == Long.TYPE || rawParameterType == Long.class) {
            if (z || z2) {
                bw0.mo11905k(annotatedWithParams, z);
            }
            return true;
        } else if (rawParameterType == Double.TYPE || rawParameterType == Double.class) {
            if (z || z2) {
                bw0.mo11903i(annotatedWithParams, z);
            }
            return true;
        } else if (rawParameterType == Boolean.TYPE || rawParameterType == Boolean.class) {
            if (z || z2) {
                bw0.mo11901g(annotatedWithParams, z);
            }
            return true;
        } else {
            if (rawParameterType == BigInteger.class && (z || z2)) {
                bw0.mo11900f(annotatedWithParams, z);
            }
            if (rawParameterType == BigDecimal.class && (z || z2)) {
                bw0.mo11899e(annotatedWithParams, z);
            }
            if (!z) {
                return false;
            }
            bw0.mo11902h(annotatedWithParams, z, (SettableBeanProperty[]) null, 0);
            return true;
        }
    }

    public boolean _hasCreatorAnnotation(DeserializationContext deserializationContext, C2911nl nlVar) {
        JsonCreator.Mode findCreatorAnnotation;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null || (findCreatorAnnotation = annotationIntrospector.findCreatorAnnotation(deserializationContext.getConfig(), nlVar)) == null || findCreatorAnnotation == JsonCreator.Mode.DISABLED) {
            return false;
        }
        return true;
    }

    public CollectionType _mapAbstractCollectionType(JavaType javaType, DeserializationConfig deserializationConfig) {
        Class<?> a = C1993b.m14030a(javaType);
        if (a != null) {
            return (CollectionType) deserializationConfig.getTypeFactory().constructSpecializedType(javaType, a, true);
        }
        return null;
    }

    public MapType _mapAbstractMapType(JavaType javaType, DeserializationConfig deserializationConfig) {
        Class<?> b = C1993b.m14031b(javaType);
        if (b != null) {
            return (MapType) deserializationConfig.getTypeFactory().constructSpecializedType(javaType, b, true);
        }
        return null;
    }

    public void _reportUnwrappedCreatorProperty(DeserializationContext deserializationContext, n00 n00, AnnotatedParameter annotatedParameter) throws JsonMappingException {
        deserializationContext.reportBadTypeDefinition(n00, "Cannot define Creator parameter %d as `@JsonUnwrapped`: combination not yet supported", Integer.valueOf(annotatedParameter.getIndex()));
    }

    public void _validateNamedPropertyParameter(DeserializationContext deserializationContext, n00 n00, aw0 aw0, int i, PropertyName propertyName, JacksonInject.Value value) throws JsonMappingException {
        if (propertyName == null && value == null) {
            deserializationContext.reportBadTypeDefinition(n00, "Argument #%d of constructor %s has no property name (and is not Injectable): can not use as property-based Creator", Integer.valueOf(i), aw0);
        }
    }

    public ValueInstantiator _valueInstantiatorInstance(DeserializationConfig deserializationConfig, C2911nl nlVar, Object obj) throws JsonMappingException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof ValueInstantiator) {
            return (ValueInstantiator) obj;
        }
        if (obj instanceof Class) {
            Class cls = (Class) obj;
            if (wf0.m29483J(cls)) {
                return null;
            }
            if (ValueInstantiator.class.isAssignableFrom(cls)) {
                deserializationConfig.getHandlerInstantiator();
                return (ValueInstantiator) wf0.m29522l(cls, deserializationConfig.canOverrideAccessModifiers());
            }
            throw new IllegalStateException("AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<ValueInstantiator>");
        }
        throw new IllegalStateException("AnnotationIntrospector returned key deserializer definition of type " + obj.getClass().getName() + "; expected type KeyDeserializer or Class<KeyDeserializer> instead");
    }

    /* renamed from: a */
    public final boolean mo15271a(AnnotationIntrospector annotationIntrospector, AnnotatedWithParams annotatedWithParams, q00 q00) {
        String name;
        if ((q00 != null && q00.mo24875F()) || annotationIntrospector.findInjectableValue(annotatedWithParams.getParameter(0)) != null) {
            return true;
        }
        if (q00 == null || (name = q00.getName()) == null || name.isEmpty() || !q00.mo24878d()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo15272b(DeserializationContext deserializationContext, n00 n00, VisibilityChecker<?> visibilityChecker, AnnotationIntrospector annotationIntrospector, bw0 bw0, List<AnnotatedWithParams> list) throws JsonMappingException {
        int i;
        Iterator<AnnotatedWithParams> it = list.iterator();
        AnnotatedWithParams annotatedWithParams = null;
        AnnotatedWithParams annotatedWithParams2 = null;
        SettableBeanProperty[] settableBeanPropertyArr = null;
        while (true) {
            if (!it.hasNext()) {
                annotatedWithParams = annotatedWithParams2;
                break;
            }
            AnnotatedWithParams next = it.next();
            if (visibilityChecker.isCreatorVisible(next)) {
                int parameterCount = next.getParameterCount();
                SettableBeanProperty[] settableBeanPropertyArr2 = new SettableBeanProperty[parameterCount];
                int i2 = 0;
                while (true) {
                    if (i2 < parameterCount) {
                        AnnotatedParameter parameter = next.getParameter(i2);
                        PropertyName d = mo15285d(parameter, annotationIntrospector);
                        if (d == null || d.isEmpty()) {
                            break;
                        }
                        settableBeanPropertyArr2[i2] = constructCreatorProperty(deserializationContext, n00, d, parameter.getIndex(), parameter, (JacksonInject.Value) null);
                        i2++;
                    } else if (annotatedWithParams2 != null) {
                        break;
                    } else {
                        annotatedWithParams2 = next;
                        settableBeanPropertyArr = settableBeanPropertyArr2;
                    }
                }
            }
        }
        if (annotatedWithParams != null) {
            bw0.mo11906l(annotatedWithParams, false, settableBeanPropertyArr);
            C3563wz wzVar = (C3563wz) n00;
            for (SettableBeanProperty settableBeanProperty : settableBeanPropertyArr) {
                PropertyName fullName = settableBeanProperty.getFullName();
                if (!wzVar.mo27627M(fullName)) {
                    wzVar.mo27624G(z16.m30927H(deserializationContext.getConfig(), settableBeanProperty.getMember(), fullName));
                }
            }
        }
    }

    /* renamed from: c */
    public final ha3 mo15273c(DeserializationContext deserializationContext, JavaType javaType) throws JsonMappingException {
        DeserializationConfig config = deserializationContext.getConfig();
        Class<?> rawClass = javaType.getRawClass();
        n00 introspect = config.introspect(javaType);
        ha3 findKeyDeserializerFromAnnotation = findKeyDeserializerFromAnnotation(deserializationContext, introspect.mo23462t());
        if (findKeyDeserializerFromAnnotation != null) {
            return findKeyDeserializerFromAnnotation;
        }
        o43<?> _findCustomEnumDeserializer = _findCustomEnumDeserializer(rawClass, config, introspect);
        if (_findCustomEnumDeserializer != null) {
            return StdKeyDeserializers.constructDelegatingKeyDeserializer(config, javaType, _findCustomEnumDeserializer);
        }
        o43<Object> findDeserializerFromAnnotation = findDeserializerFromAnnotation(deserializationContext, introspect.mo23462t());
        if (findDeserializerFromAnnotation != null) {
            return StdKeyDeserializers.constructDelegatingKeyDeserializer(config, javaType, findDeserializerFromAnnotation);
        }
        EnumResolver constructEnumResolver = constructEnumResolver(rawClass, config, introspect.mo23452j());
        for (AnnotatedMethod next : introspect.mo23465w()) {
            if (_hasCreatorAnnotation(deserializationContext, next)) {
                if (next.getParameterCount() != 1 || !next.getRawReturnType().isAssignableFrom(rawClass)) {
                    throw new IllegalArgumentException("Unsuitable method (" + next + ") decorated with @JsonCreator (for Enum type " + rawClass.getName() + ")");
                } else if (next.getRawParameterType(0) == String.class) {
                    if (config.canOverrideAccessModifiers()) {
                        wf0.m29512g(next.getMember(), deserializationContext.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
                    }
                    return StdKeyDeserializers.constructEnumKeyDeserializer(constructEnumResolver, next);
                }
            }
        }
        return StdKeyDeserializers.constructEnumKeyDeserializer(constructEnumResolver);
    }

    public SettableBeanProperty constructCreatorProperty(DeserializationContext deserializationContext, n00 n00, PropertyName propertyName, int i, AnnotatedParameter annotatedParameter, JacksonInject.Value value) throws JsonMappingException {
        PropertyMetadata propertyMetadata;
        PropertyName propertyName2;
        DeserializationContext deserializationContext2 = deserializationContext;
        AnnotatedParameter annotatedParameter2 = annotatedParameter;
        DeserializationConfig config = deserializationContext.getConfig();
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null) {
            propertyMetadata = PropertyMetadata.STD_REQUIRED_OR_OPTIONAL;
            propertyName2 = null;
        } else {
            PropertyMetadata construct = PropertyMetadata.construct(annotationIntrospector.hasRequiredMarker(annotatedParameter2), annotationIntrospector.findPropertyDescription(annotatedParameter2), annotationIntrospector.findPropertyIndex(annotatedParameter2), annotationIntrospector.findPropertyDefaultValue(annotatedParameter2));
            propertyName2 = annotationIntrospector.findWrapperName(annotatedParameter2);
            propertyMetadata = construct;
        }
        JavaType resolveMemberAndTypeAnnotations = resolveMemberAndTypeAnnotations(deserializationContext, annotatedParameter2, annotatedParameter.getType());
        BeanProperty.Std std = new BeanProperty.Std(propertyName, resolveMemberAndTypeAnnotations, propertyName2, annotatedParameter, propertyMetadata);
        j07 j07 = (j07) resolveMemberAndTypeAnnotations.getTypeHandler();
        if (j07 == null) {
            j07 = findTypeDeserializer(config, resolveMemberAndTypeAnnotations);
        }
        PropertyMetadata _getSetterInfo = _getSetterInfo(deserializationContext, std, propertyMetadata);
        CreatorProperty construct2 = CreatorProperty.construct(propertyName, resolveMemberAndTypeAnnotations, std.getWrapperName(), j07, n00.mo23461s(), annotatedParameter, i, value, _getSetterInfo);
        o43<Object> findDeserializerFromAnnotation = findDeserializerFromAnnotation(deserializationContext, annotatedParameter2);
        if (findDeserializerFromAnnotation == null) {
            findDeserializerFromAnnotation = (o43) resolveMemberAndTypeAnnotations.getValueHandler();
        }
        if (findDeserializerFromAnnotation != null) {
            return construct2.withValueDeserializer(deserializationContext.handlePrimaryContextualization(findDeserializerFromAnnotation, construct2, resolveMemberAndTypeAnnotations));
        }
        return construct2;
    }

    public EnumResolver constructEnumResolver(Class<?> cls, DeserializationConfig deserializationConfig, AnnotatedMember annotatedMember) {
        if (annotatedMember == null) {
            return EnumResolver.constructFor(deserializationConfig, cls);
        }
        if (deserializationConfig.canOverrideAccessModifiers()) {
            wf0.m29512g(annotatedMember.getMember(), deserializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        return EnumResolver.constructUsingMethod(deserializationConfig, cls, annotatedMember);
    }

    public o43<?> createArrayDeserializer(DeserializationContext deserializationContext, ArrayType arrayType, n00 n00) throws JsonMappingException {
        DeserializationConfig config = deserializationContext.getConfig();
        JavaType contentType = arrayType.getContentType();
        o43 o43 = (o43) contentType.getValueHandler();
        j07 j07 = (j07) contentType.getTypeHandler();
        if (j07 == null) {
            j07 = findTypeDeserializer(config, contentType);
        }
        j07 j072 = j07;
        o43<?> _findCustomArrayDeserializer = _findCustomArrayDeserializer(arrayType, config, n00, j072, o43);
        if (_findCustomArrayDeserializer == null) {
            if (o43 == null) {
                Class<?> rawClass = contentType.getRawClass();
                if (contentType.isPrimitive()) {
                    return PrimitiveArrayDeserializers.forType(rawClass);
                }
                if (rawClass == String.class) {
                    return StringArrayDeserializer.instance;
                }
            }
            _findCustomArrayDeserializer = new ObjectArrayDeserializer(arrayType, o43, j072);
        }
        if (this._factoryConfig.hasDeserializerModifiers()) {
            for (p00 modifyArrayDeserializer : this._factoryConfig.deserializerModifiers()) {
                _findCustomArrayDeserializer = modifyArrayDeserializer.modifyArrayDeserializer(config, arrayType, n00, _findCustomArrayDeserializer);
            }
        }
        return _findCustomArrayDeserializer;
    }

    public o43<?> createCollectionDeserializer(DeserializationContext deserializationContext, CollectionType collectionType, n00 n00) throws JsonMappingException {
        o43<?> o43;
        JavaType contentType = collectionType.getContentType();
        o43 o432 = (o43) contentType.getValueHandler();
        DeserializationConfig config = deserializationContext.getConfig();
        j07 j07 = (j07) contentType.getTypeHandler();
        if (j07 == null) {
            j07 = findTypeDeserializer(config, contentType);
        }
        j07 j072 = j07;
        o43<?> _findCustomCollectionDeserializer = _findCustomCollectionDeserializer(collectionType, config, n00, j072, o432);
        if (_findCustomCollectionDeserializer == null) {
            Class<?> rawClass = collectionType.getRawClass();
            if (o432 == null && EnumSet.class.isAssignableFrom(rawClass)) {
                _findCustomCollectionDeserializer = new EnumSetDeserializer(contentType, (o43<?>) null);
            }
        }
        if (_findCustomCollectionDeserializer == null) {
            if (collectionType.isInterface() || collectionType.isAbstract()) {
                CollectionType _mapAbstractCollectionType = _mapAbstractCollectionType(collectionType, config);
                if (_mapAbstractCollectionType != null) {
                    n00 = config.introspectForCreation(_mapAbstractCollectionType);
                    collectionType = _mapAbstractCollectionType;
                } else if (collectionType.getTypeHandler() != null) {
                    _findCustomCollectionDeserializer = AbstractDeserializer.constructForNonPOJO(n00);
                } else {
                    throw new IllegalArgumentException("Cannot find a deserializer for non-concrete Collection type " + collectionType);
                }
            }
            if (_findCustomCollectionDeserializer == null) {
                ValueInstantiator findValueInstantiator = findValueInstantiator(deserializationContext, n00);
                if (!findValueInstantiator.canCreateUsingDefault()) {
                    if (collectionType.hasRawClass(ArrayBlockingQueue.class)) {
                        return new ArrayBlockingQueueDeserializer(collectionType, o432, j072, findValueInstantiator);
                    }
                    o43<?> h = n23.m22750h(deserializationContext, collectionType);
                    if (h != null) {
                        return h;
                    }
                }
                if (contentType.hasRawClass(String.class)) {
                    o43 = new StringCollectionDeserializer(collectionType, o432, findValueInstantiator);
                } else {
                    o43 = new CollectionDeserializer(collectionType, o432, j072, findValueInstantiator);
                }
                _findCustomCollectionDeserializer = o43;
            }
        }
        if (this._factoryConfig.hasDeserializerModifiers()) {
            for (p00 modifyCollectionDeserializer : this._factoryConfig.deserializerModifiers()) {
                _findCustomCollectionDeserializer = modifyCollectionDeserializer.modifyCollectionDeserializer(config, collectionType, n00, _findCustomCollectionDeserializer);
            }
        }
        return _findCustomCollectionDeserializer;
    }

    public o43<?> createCollectionLikeDeserializer(DeserializationContext deserializationContext, CollectionLikeType collectionLikeType, n00 n00) throws JsonMappingException {
        j07 j07;
        JavaType contentType = collectionLikeType.getContentType();
        o43 o43 = (o43) contentType.getValueHandler();
        DeserializationConfig config = deserializationContext.getConfig();
        j07 j072 = (j07) contentType.getTypeHandler();
        if (j072 == null) {
            j07 = findTypeDeserializer(config, contentType);
        } else {
            j07 = j072;
        }
        o43<?> _findCustomCollectionLikeDeserializer = _findCustomCollectionLikeDeserializer(collectionLikeType, config, n00, j07, o43);
        if (_findCustomCollectionLikeDeserializer != null && this._factoryConfig.hasDeserializerModifiers()) {
            for (p00 modifyCollectionLikeDeserializer : this._factoryConfig.deserializerModifiers()) {
                _findCustomCollectionLikeDeserializer = modifyCollectionLikeDeserializer.modifyCollectionLikeDeserializer(config, collectionLikeType, n00, _findCustomCollectionLikeDeserializer);
            }
        }
        return _findCustomCollectionLikeDeserializer;
    }

    public o43<?> createEnumDeserializer(DeserializationContext deserializationContext, JavaType javaType, n00 n00) throws JsonMappingException {
        SettableBeanProperty[] settableBeanPropertyArr;
        DeserializationConfig config = deserializationContext.getConfig();
        Class<?> rawClass = javaType.getRawClass();
        o43<?> _findCustomEnumDeserializer = _findCustomEnumDeserializer(rawClass, config, n00);
        if (_findCustomEnumDeserializer == null) {
            if (rawClass == Enum.class) {
                return AbstractDeserializer.constructForNonPOJO(n00);
            }
            ValueInstantiator _constructDefaultValueInstantiator = _constructDefaultValueInstantiator(deserializationContext, n00);
            if (_constructDefaultValueInstantiator == null) {
                settableBeanPropertyArr = null;
            } else {
                settableBeanPropertyArr = _constructDefaultValueInstantiator.getFromObjectArguments(deserializationContext.getConfig());
            }
            Iterator<AnnotatedMethod> it = n00.mo23465w().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AnnotatedMethod next = it.next();
                if (_hasCreatorAnnotation(deserializationContext, next)) {
                    if (next.getParameterCount() == 0) {
                        _findCustomEnumDeserializer = EnumDeserializer.deserializerForNoArgsCreator(config, rawClass, next);
                    } else {
                        if (!next.getRawReturnType().isAssignableFrom(rawClass)) {
                            deserializationContext.reportBadDefinition(javaType, String.format("Invalid `@JsonCreator` annotated Enum factory method [%s]: needs to return compatible type", new Object[]{next.toString()}));
                        }
                        _findCustomEnumDeserializer = EnumDeserializer.deserializerForCreator(config, rawClass, next, _constructDefaultValueInstantiator, settableBeanPropertyArr);
                    }
                }
            }
            if (_findCustomEnumDeserializer == null) {
                _findCustomEnumDeserializer = new EnumDeserializer(constructEnumResolver(rawClass, config, n00.mo23452j()), Boolean.valueOf(config.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS)));
            }
        }
        if (this._factoryConfig.hasDeserializerModifiers()) {
            for (p00 modifyEnumDeserializer : this._factoryConfig.deserializerModifiers()) {
                _findCustomEnumDeserializer = modifyEnumDeserializer.modifyEnumDeserializer(config, javaType, n00, _findCustomEnumDeserializer);
            }
        }
        return _findCustomEnumDeserializer;
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x001b A[LOOP:0: B:3:0x001b->B:6:0x002b, LOOP_START, PHI: r2 
      PHI: (r2v9 ha3) = (r2v0 ha3), (r2v12 ha3) binds: [B:2:0x000d, B:6:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p000.ha3 createKeyDeserializer(com.fasterxml.jackson.databind.DeserializationContext r6, com.fasterxml.jackson.databind.JavaType r7) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r5 = this;
            com.fasterxml.jackson.databind.DeserializationConfig r0 = r6.getConfig()
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r1 = r5._factoryConfig
            boolean r1 = r1.hasKeyDeserializers()
            r2 = 0
            if (r1 == 0) goto L_0x002e
            n00 r1 = r0.introspectClassAnnotations((com.fasterxml.jackson.databind.JavaType) r7)
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r3 = r5._factoryConfig
            java.lang.Iterable r3 = r3.keyDeserializers()
            java.util.Iterator r3 = r3.iterator()
        L_0x001b:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x002f
            java.lang.Object r2 = r3.next()
            ia3 r2 = (p000.ia3) r2
            ha3 r2 = r2.findKeyDeserializer(r7, r0, r1)
            if (r2 == 0) goto L_0x001b
            goto L_0x002f
        L_0x002e:
            r1 = r2
        L_0x002f:
            if (r2 != 0) goto L_0x0054
            if (r1 != 0) goto L_0x003b
            java.lang.Class r1 = r7.getRawClass()
            n00 r1 = r0.introspectClassAnnotations((java.lang.Class<?>) r1)
        L_0x003b:
            com.fasterxml.jackson.databind.introspect.a r1 = r1.mo23462t()
            ha3 r2 = r5.findKeyDeserializerFromAnnotation(r6, r1)
            if (r2 != 0) goto L_0x0054
            boolean r1 = r7.isEnumType()
            if (r1 == 0) goto L_0x0050
            ha3 r2 = r5.mo15273c(r6, r7)
            goto L_0x0054
        L_0x0050:
            ha3 r2 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers.findStringBasedKeyDeserializer(r0, r7)
        L_0x0054:
            if (r2 == 0) goto L_0x0079
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r6 = r5._factoryConfig
            boolean r6 = r6.hasDeserializerModifiers()
            if (r6 == 0) goto L_0x0079
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r6 = r5._factoryConfig
            java.lang.Iterable r6 = r6.deserializerModifiers()
            java.util.Iterator r6 = r6.iterator()
        L_0x0068:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x0079
            java.lang.Object r1 = r6.next()
            p00 r1 = (p000.p00) r1
            ha3 r2 = r1.modifyKeyDeserializer(r0, r7, r2)
            goto L_0x0068
        L_0x0079:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.createKeyDeserializer(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.JavaType):ha3");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: o43<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: o43<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: o43<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: com.fasterxml.jackson.databind.deser.std.MapDeserializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v13, resolved type: com.fasterxml.jackson.databind.deser.std.MapDeserializer} */
    /* JADX WARNING: type inference failed for: r2v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0115  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p000.o43<?> createMapDeserializer(com.fasterxml.jackson.databind.DeserializationContext r20, com.fasterxml.jackson.databind.type.MapType r21, p000.n00 r22) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r19 = this;
            r7 = r19
            r8 = r20
            r9 = r21
            com.fasterxml.jackson.databind.DeserializationConfig r10 = r20.getConfig()
            com.fasterxml.jackson.databind.JavaType r11 = r21.getKeyType()
            com.fasterxml.jackson.databind.JavaType r0 = r21.getContentType()
            java.lang.Object r1 = r0.getValueHandler()
            r16 = r1
            o43 r16 = (p000.o43) r16
            java.lang.Object r1 = r11.getValueHandler()
            r15 = r1
            ha3 r15 = (p000.ha3) r15
            java.lang.Object r1 = r0.getTypeHandler()
            j07 r1 = (p000.j07) r1
            if (r1 != 0) goto L_0x0030
            j07 r0 = r7.findTypeDeserializer(r10, r0)
            r17 = r0
            goto L_0x0032
        L_0x0030:
            r17 = r1
        L_0x0032:
            r0 = r19
            r1 = r21
            r2 = r10
            r3 = r22
            r4 = r15
            r5 = r17
            r6 = r16
            o43 r0 = r0._findCustomMapDeserializer(r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L_0x010a
            java.lang.Class r1 = r21.getRawClass()
            java.lang.Class<java.util.EnumMap> r2 = java.util.EnumMap.class
            boolean r2 = r2.isAssignableFrom(r1)
            r18 = 0
            if (r2 == 0) goto L_0x007f
            java.lang.Class<java.util.EnumMap> r0 = java.util.EnumMap.class
            if (r1 != r0) goto L_0x005b
            r12 = r22
            r2 = r18
            goto L_0x0062
        L_0x005b:
            r12 = r22
            com.fasterxml.jackson.databind.deser.ValueInstantiator r0 = r7.findValueInstantiator(r8, r12)
            r2 = r0
        L_0x0062:
            boolean r0 = r11.isEnumImplType()
            if (r0 == 0) goto L_0x0077
            com.fasterxml.jackson.databind.deser.std.EnumMapDeserializer r11 = new com.fasterxml.jackson.databind.deser.std.EnumMapDeserializer
            r3 = 0
            r6 = 0
            r0 = r11
            r1 = r21
            r4 = r16
            r5 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6)
            goto L_0x0081
        L_0x0077:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Cannot construct EnumMap; generic (key) type not available"
            r0.<init>(r1)
            throw r0
        L_0x007f:
            r12 = r22
        L_0x0081:
            if (r0 != 0) goto L_0x010c
            boolean r1 = r21.isInterface()
            if (r1 != 0) goto L_0x009b
            boolean r1 = r21.isAbstract()
            if (r1 == 0) goto L_0x0090
            goto L_0x009b
        L_0x0090:
            o43 r0 = p000.n23.m22751i(r20, r21)
            if (r0 == 0) goto L_0x0097
            return r0
        L_0x0097:
            r2 = r0
            r1 = r9
        L_0x0099:
            r0 = r12
            goto L_0x00b7
        L_0x009b:
            com.fasterxml.jackson.databind.type.MapType r1 = r7._mapAbstractMapType(r9, r10)
            if (r1 == 0) goto L_0x00aa
            r1.getRawClass()
            n00 r2 = r10.introspectForCreation(r1)
            r12 = r2
            goto L_0x00b5
        L_0x00aa:
            java.lang.Object r0 = r21.getTypeHandler()
            if (r0 == 0) goto L_0x00f3
            com.fasterxml.jackson.databind.deser.AbstractDeserializer r0 = com.fasterxml.jackson.databind.deser.AbstractDeserializer.constructForNonPOJO(r22)
            r1 = r9
        L_0x00b5:
            r2 = r0
            goto L_0x0099
        L_0x00b7:
            if (r2 != 0) goto L_0x00f0
            com.fasterxml.jackson.databind.deser.ValueInstantiator r14 = r7.findValueInstantiator(r8, r0)
            com.fasterxml.jackson.databind.deser.std.MapDeserializer r2 = new com.fasterxml.jackson.databind.deser.std.MapDeserializer
            r12 = r2
            r13 = r1
            r12.<init>(r13, r14, r15, r16, r17)
            java.lang.Class<java.util.Map> r3 = java.util.Map.class
            com.fasterxml.jackson.databind.introspect.a r4 = r0.mo23462t()
            com.fasterxml.jackson.annotation.JsonIgnoreProperties$Value r3 = r10.getDefaultPropertyIgnorals(r3, r4)
            if (r3 != 0) goto L_0x00d3
            r3 = r18
            goto L_0x00d7
        L_0x00d3:
            java.util.Set r3 = r3.findIgnoredForDeserialization()
        L_0x00d7:
            r2.setIgnorableProperties((java.util.Set<java.lang.String>) r3)
            java.lang.Class<java.util.Map> r3 = java.util.Map.class
            com.fasterxml.jackson.databind.introspect.a r4 = r0.mo23462t()
            com.fasterxml.jackson.annotation.JsonIncludeProperties$Value r3 = r10.getDefaultPropertyInclusions(r3, r4)
            if (r3 != 0) goto L_0x00e7
            goto L_0x00eb
        L_0x00e7:
            java.util.Set r18 = r3.getIncluded()
        L_0x00eb:
            r3 = r18
            r2.setIncludableProperties(r3)
        L_0x00f0:
            r12 = r0
            r0 = r2
            goto L_0x010d
        L_0x00f3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot find a deserializer for non-concrete Map type "
            r1.append(r2)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x010a:
            r12 = r22
        L_0x010c:
            r1 = r9
        L_0x010d:
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r2 = r7._factoryConfig
            boolean r2 = r2.hasDeserializerModifiers()
            if (r2 == 0) goto L_0x0130
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r2 = r7._factoryConfig
            java.lang.Iterable r2 = r2.deserializerModifiers()
            java.util.Iterator r2 = r2.iterator()
        L_0x011f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0130
            java.lang.Object r3 = r2.next()
            p00 r3 = (p000.p00) r3
            o43 r0 = r3.modifyMapDeserializer(r10, r1, r12, r0)
            goto L_0x011f
        L_0x0130:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.createMapDeserializer(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.type.MapType, n00):o43");
    }

    public o43<?> createMapLikeDeserializer(DeserializationContext deserializationContext, MapLikeType mapLikeType, n00 n00) throws JsonMappingException {
        JavaType keyType = mapLikeType.getKeyType();
        JavaType contentType = mapLikeType.getContentType();
        DeserializationConfig config = deserializationContext.getConfig();
        o43 o43 = (o43) contentType.getValueHandler();
        ha3 ha3 = (ha3) keyType.getValueHandler();
        j07 j07 = (j07) contentType.getTypeHandler();
        if (j07 == null) {
            j07 = findTypeDeserializer(config, contentType);
        }
        o43<?> _findCustomMapLikeDeserializer = _findCustomMapLikeDeserializer(mapLikeType, config, n00, ha3, j07, o43);
        if (_findCustomMapLikeDeserializer != null && this._factoryConfig.hasDeserializerModifiers()) {
            for (p00 modifyMapLikeDeserializer : this._factoryConfig.deserializerModifiers()) {
                _findCustomMapLikeDeserializer = modifyMapLikeDeserializer.modifyMapLikeDeserializer(config, mapLikeType, n00, _findCustomMapLikeDeserializer);
            }
        }
        return _findCustomMapLikeDeserializer;
    }

    public o43<?> createReferenceDeserializer(DeserializationContext deserializationContext, ReferenceType referenceType, n00 n00) throws JsonMappingException {
        ValueInstantiator valueInstantiator;
        JavaType contentType = referenceType.getContentType();
        o43 o43 = (o43) contentType.getValueHandler();
        DeserializationConfig config = deserializationContext.getConfig();
        j07 j07 = (j07) contentType.getTypeHandler();
        if (j07 == null) {
            j07 = findTypeDeserializer(config, contentType);
        }
        j07 j072 = j07;
        o43<?> _findCustomReferenceDeserializer = _findCustomReferenceDeserializer(referenceType, config, n00, j072, o43);
        if (_findCustomReferenceDeserializer != null || !referenceType.isTypeOrSubTypeOf(AtomicReference.class)) {
            if (_findCustomReferenceDeserializer != null && this._factoryConfig.hasDeserializerModifiers()) {
                for (p00 modifyReferenceDeserializer : this._factoryConfig.deserializerModifiers()) {
                    _findCustomReferenceDeserializer = modifyReferenceDeserializer.modifyReferenceDeserializer(config, referenceType, n00, _findCustomReferenceDeserializer);
                }
            }
            return _findCustomReferenceDeserializer;
        }
        if (referenceType.getRawClass() == AtomicReference.class) {
            valueInstantiator = null;
        } else {
            valueInstantiator = findValueInstantiator(deserializationContext, n00);
        }
        return new AtomicReferenceDeserializer(referenceType, valueInstantiator, j072, o43);
    }

    public o43<?> createTreeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, n00 n00) throws JsonMappingException {
        Class<?> rawClass = javaType.getRawClass();
        o43<?> _findCustomTreeNodeDeserializer = _findCustomTreeNodeDeserializer(rawClass, deserializationConfig, n00);
        if (_findCustomTreeNodeDeserializer != null) {
            return _findCustomTreeNodeDeserializer;
        }
        return JsonNodeDeserializer.getDeserializer(rawClass);
    }

    /* renamed from: d */
    public final PropertyName mo15285d(AnnotatedParameter annotatedParameter, AnnotationIntrospector annotationIntrospector) {
        if (annotationIntrospector == null) {
            return null;
        }
        PropertyName findNameForDeserialization = annotationIntrospector.findNameForDeserialization(annotatedParameter);
        if (findNameForDeserialization != null && !findNameForDeserialization.isEmpty()) {
            return findNameForDeserialization;
        }
        String findImplicitPropertyName = annotationIntrospector.findImplicitPropertyName(annotatedParameter);
        if (findImplicitPropertyName == null || findImplicitPropertyName.isEmpty()) {
            return null;
        }
        return PropertyName.construct(findImplicitPropertyName);
    }

    /* renamed from: e */
    public final JavaType mo15286e(DeserializationConfig deserializationConfig, JavaType javaType) throws JsonMappingException {
        Class<?> rawClass = javaType.getRawClass();
        if (!this._factoryConfig.hasAbstractTypeResolvers()) {
            return null;
        }
        for (C2805m7 findTypeMapping : this._factoryConfig.abstractTypeResolvers()) {
            JavaType findTypeMapping2 = findTypeMapping.findTypeMapping(deserializationConfig, javaType);
            if (findTypeMapping2 != null && !findTypeMapping2.hasRawClass(rawClass)) {
                return findTypeMapping2;
            }
        }
        return null;
    }

    public o43<Object> findContentDeserializerFromAnnotation(DeserializationContext deserializationContext, C2911nl nlVar) throws JsonMappingException {
        Object findContentDeserializer;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null || (findContentDeserializer = annotationIntrospector.findContentDeserializer(nlVar)) == null) {
            return null;
        }
        return deserializationContext.deserializerInstance(nlVar, findContentDeserializer);
    }

    public o43<?> findDefaultDeserializer(DeserializationContext deserializationContext, JavaType javaType, n00 n00) throws JsonMappingException {
        JavaType javaType2;
        JavaType javaType3;
        JavaType javaType4;
        Class<?> rawClass = javaType.getRawClass();
        if (rawClass == f9907a || rawClass == f9912r) {
            DeserializationConfig config = deserializationContext.getConfig();
            if (this._factoryConfig.hasAbstractTypeResolvers()) {
                javaType2 = _findRemappedType(config, List.class);
                javaType3 = _findRemappedType(config, Map.class);
            } else {
                javaType2 = null;
                javaType3 = null;
            }
            return new UntypedObjectDeserializer(javaType2, javaType3);
        } else if (rawClass == f9908d || rawClass == f9909e) {
            return StringDeserializer.instance;
        } else {
            Class<?> cls = f9910g;
            if (rawClass == cls) {
                TypeFactory typeFactory = deserializationContext.getTypeFactory();
                JavaType[] findTypeParameters = typeFactory.findTypeParameters(javaType, cls);
                if (findTypeParameters == null || findTypeParameters.length != 1) {
                    javaType4 = TypeFactory.unknownType();
                } else {
                    javaType4 = findTypeParameters[0];
                }
                return createCollectionDeserializer(deserializationContext, typeFactory.constructCollectionType((Class<? extends Collection>) Collection.class, javaType4), n00);
            } else if (rawClass == f9911k) {
                JavaType containedTypeOrUnknown = javaType.containedTypeOrUnknown(0);
                JavaType containedTypeOrUnknown2 = javaType.containedTypeOrUnknown(1);
                j07 j07 = (j07) containedTypeOrUnknown2.getTypeHandler();
                if (j07 == null) {
                    j07 = findTypeDeserializer(deserializationContext.getConfig(), containedTypeOrUnknown2);
                }
                return new MapEntryDeserializer(javaType, (ha3) containedTypeOrUnknown.getValueHandler(), (o43<Object>) (o43) containedTypeOrUnknown2.getValueHandler(), j07);
            } else {
                String name = rawClass.getName();
                if (rawClass.isPrimitive() || name.startsWith("java.")) {
                    o43<?> a = NumberDeserializers.m14108a(rawClass, name);
                    if (a == null) {
                        a = DateDeserializers.m14093a(rawClass, name);
                    }
                    if (a != null) {
                        return a;
                    }
                }
                if (rawClass == fr6.class) {
                    return new TokenBufferDeserializer();
                }
                o43<?> findOptionalStdDeserializer = findOptionalStdDeserializer(deserializationContext, javaType, n00);
                if (findOptionalStdDeserializer != null) {
                    return findOptionalStdDeserializer;
                }
                return w23.m29236a(rawClass, name);
            }
        }
    }

    public o43<Object> findDeserializerFromAnnotation(DeserializationContext deserializationContext, C2911nl nlVar) throws JsonMappingException {
        Object findDeserializer;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null || (findDeserializer = annotationIntrospector.findDeserializer(nlVar)) == null) {
            return null;
        }
        return deserializationContext.deserializerInstance(nlVar, findDeserializer);
    }

    public ha3 findKeyDeserializerFromAnnotation(DeserializationContext deserializationContext, C2911nl nlVar) throws JsonMappingException {
        Object findKeyDeserializer;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null || (findKeyDeserializer = annotationIntrospector.findKeyDeserializer(nlVar)) == null) {
            return null;
        }
        return deserializationContext.keyDeserializerInstance(nlVar, findKeyDeserializer);
    }

    public o43<?> findOptionalStdDeserializer(DeserializationContext deserializationContext, JavaType javaType, n00 n00) throws JsonMappingException {
        return OptionalHandlerFactory.instance.findDeserializer(javaType, deserializationContext.getConfig(), n00);
    }

    public j07 findPropertyContentTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, AnnotatedMember annotatedMember) throws JsonMappingException {
        l17<?> findPropertyContentTypeResolver = deserializationConfig.getAnnotationIntrospector().findPropertyContentTypeResolver(deserializationConfig, annotatedMember, javaType);
        JavaType contentType = javaType.getContentType();
        if (findPropertyContentTypeResolver == null) {
            return findTypeDeserializer(deserializationConfig, contentType);
        }
        return findPropertyContentTypeResolver.buildTypeDeserializer(deserializationConfig, contentType, deserializationConfig.getSubtypeResolver().collectAndResolveSubtypesByTypeId(deserializationConfig, annotatedMember, contentType));
    }

    public j07 findPropertyTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, AnnotatedMember annotatedMember) throws JsonMappingException {
        l17<?> findPropertyTypeResolver = deserializationConfig.getAnnotationIntrospector().findPropertyTypeResolver(deserializationConfig, annotatedMember, javaType);
        if (findPropertyTypeResolver == null) {
            return findTypeDeserializer(deserializationConfig, javaType);
        }
        try {
            return findPropertyTypeResolver.buildTypeDeserializer(deserializationConfig, javaType, deserializationConfig.getSubtypeResolver().collectAndResolveSubtypesByTypeId(deserializationConfig, annotatedMember, javaType));
        } catch (IllegalArgumentException | IllegalStateException e) {
            throw InvalidDefinitionException.from((JsonParser) null, wf0.m29528o(e), javaType).withCause(e);
        }
    }

    public j07 findTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType) throws JsonMappingException {
        Collection<NamedType> collection;
        JavaType mapAbstractType;
        C2021a t = deserializationConfig.introspectClassAnnotations(javaType.getRawClass()).mo23462t();
        l17 findTypeResolver = deserializationConfig.getAnnotationIntrospector().findTypeResolver(deserializationConfig, t, javaType);
        if (findTypeResolver == null) {
            findTypeResolver = deserializationConfig.getDefaultTyper(javaType);
            if (findTypeResolver == null) {
                return null;
            }
            collection = null;
        } else {
            collection = deserializationConfig.getSubtypeResolver().collectAndResolveSubtypesByTypeId(deserializationConfig, t);
        }
        if (findTypeResolver.getDefaultImpl() == null && javaType.isAbstract() && (mapAbstractType = mapAbstractType(deserializationConfig, javaType)) != null && !mapAbstractType.hasRawClass(javaType.getRawClass())) {
            findTypeResolver = findTypeResolver.withDefaultImpl(mapAbstractType.getRawClass());
        }
        try {
            return findTypeResolver.buildTypeDeserializer(deserializationConfig, javaType, collection);
        } catch (IllegalArgumentException | IllegalStateException e) {
            throw InvalidDefinitionException.from((JsonParser) null, wf0.m29528o(e), javaType).withCause(e);
        }
    }

    public ValueInstantiator findValueInstantiator(DeserializationContext deserializationContext, n00 n00) throws JsonMappingException {
        ValueInstantiator valueInstantiator;
        DeserializationConfig config = deserializationContext.getConfig();
        C2021a t = n00.mo23462t();
        Object findValueInstantiator = deserializationContext.getAnnotationIntrospector().findValueInstantiator(t);
        if (findValueInstantiator != null) {
            valueInstantiator = _valueInstantiatorInstance(config, t, findValueInstantiator);
        } else {
            valueInstantiator = null;
        }
        if (valueInstantiator == null && (valueInstantiator = JDKValueInstantiators.m14066a(config, n00.mo23460r())) == null) {
            valueInstantiator = _constructDefaultValueInstantiator(deserializationContext, n00);
        }
        if (this._factoryConfig.hasValueInstantiators()) {
            for (l87 next : this._factoryConfig.valueInstantiators()) {
                valueInstantiator = next.findValueInstantiator(config, n00, valueInstantiator);
                if (valueInstantiator == null) {
                    deserializationContext.reportBadTypeDefinition(n00, "Broken registered ValueInstantiators (of type %s): returned null ValueInstantiator", next.getClass().getName());
                }
            }
        }
        if (valueInstantiator != null) {
            return valueInstantiator.createContextual(deserializationContext, n00);
        }
        return valueInstantiator;
    }

    public DeserializerFactoryConfig getFactoryConfig() {
        return this._factoryConfig;
    }

    public boolean hasExplicitDeserializerFor(DeserializationConfig deserializationConfig, Class<?> cls) {
        while (cls.isArray()) {
            cls = cls.getComponentType();
        }
        if (Enum.class.isAssignableFrom(cls)) {
            return true;
        }
        String name = cls.getName();
        if (name.startsWith("java.")) {
            if (Collection.class.isAssignableFrom(cls) || Map.class.isAssignableFrom(cls)) {
                return true;
            }
            if (Number.class.isAssignableFrom(cls)) {
                if (NumberDeserializers.m14108a(cls, name) != null) {
                    return true;
                }
                return false;
            } else if (w23.m29237b(cls) || cls == f9908d || cls == Boolean.class || cls == EnumMap.class || cls == AtomicReference.class || DateDeserializers.m14094b(cls)) {
                return true;
            } else {
                return false;
            }
        } else if (!name.startsWith("com.fasterxml.")) {
            return OptionalHandlerFactory.instance.hasDeserializerFor(cls);
        } else {
            if (g53.class.isAssignableFrom(cls) || cls == fr6.class) {
                return true;
            }
            return false;
        }
    }

    public JavaType mapAbstractType(DeserializationConfig deserializationConfig, JavaType javaType) throws JsonMappingException {
        JavaType e;
        while (true) {
            e = mo15286e(deserializationConfig, javaType);
            if (e == null) {
                return javaType;
            }
            Class<?> rawClass = javaType.getRawClass();
            Class<?> rawClass2 = e.getRawClass();
            if (rawClass == rawClass2 || !rawClass.isAssignableFrom(rawClass2)) {
            } else {
                javaType = e;
            }
        }
        throw new IllegalArgumentException("Invalid abstract type resolution from " + javaType + " to " + e + ": latter is not a subtype of former");
    }

    @Deprecated
    public JavaType modifyTypeByAnnotation(DeserializationContext deserializationContext, C2911nl nlVar, JavaType javaType) throws JsonMappingException {
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null) {
            return javaType;
        }
        return annotationIntrospector.refineDeserializationType(deserializationContext.getConfig(), nlVar, javaType);
    }

    public JavaType resolveMemberAndTypeAnnotations(DeserializationContext deserializationContext, AnnotatedMember annotatedMember, JavaType javaType) throws JsonMappingException {
        ha3 keyDeserializerInstance;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null) {
            return javaType;
        }
        if (!(!javaType.isMapLikeType() || javaType.getKeyType() == null || (keyDeserializerInstance = deserializationContext.keyDeserializerInstance(annotatedMember, annotationIntrospector.findKeyDeserializer(annotatedMember))) == null)) {
            javaType = ((MapLikeType) javaType).withKeyValueHandler(keyDeserializerInstance);
            javaType.getKeyType();
        }
        if (javaType.hasContentType()) {
            o43<Object> deserializerInstance = deserializationContext.deserializerInstance(annotatedMember, annotationIntrospector.findContentDeserializer(annotatedMember));
            if (deserializerInstance != null) {
                javaType = javaType.withContentValueHandler(deserializerInstance);
            }
            j07 findPropertyContentTypeDeserializer = findPropertyContentTypeDeserializer(deserializationContext.getConfig(), javaType, annotatedMember);
            if (findPropertyContentTypeDeserializer != null) {
                javaType = javaType.withContentTypeHandler(findPropertyContentTypeDeserializer);
            }
        }
        j07 findPropertyTypeDeserializer = findPropertyTypeDeserializer(deserializationContext.getConfig(), javaType, annotatedMember);
        if (findPropertyTypeDeserializer != null) {
            javaType = javaType.withTypeHandler(findPropertyTypeDeserializer);
        }
        return annotationIntrospector.refineDeserializationType(deserializationContext.getConfig(), annotatedMember, javaType);
    }

    @Deprecated
    public JavaType resolveType(DeserializationContext deserializationContext, n00 n00, JavaType javaType, AnnotatedMember annotatedMember) throws JsonMappingException {
        return resolveMemberAndTypeAnnotations(deserializationContext, annotatedMember, javaType);
    }

    public final C1999a withAbstractTypeResolver(C2805m7 m7Var) {
        return withConfig(this._factoryConfig.withAbstractTypeResolver(m7Var));
    }

    public final C1999a withAdditionalDeserializers(be1 be1) {
        return withConfig(this._factoryConfig.withAdditionalDeserializers(be1));
    }

    public final C1999a withAdditionalKeyDeserializers(ia3 ia3) {
        return withConfig(this._factoryConfig.withAdditionalKeyDeserializers(ia3));
    }

    public abstract C1999a withConfig(DeserializerFactoryConfig deserializerFactoryConfig);

    public final C1999a withDeserializerModifier(p00 p00) {
        return withConfig(this._factoryConfig.withDeserializerModifier(p00));
    }

    public final C1999a withValueInstantiators(l87 l87) {
        return withConfig(this._factoryConfig.withValueInstantiators(l87));
    }

    public void _addExplicitAnyCreator(DeserializationContext deserializationContext, n00 n00, bw0 bw0, aw0 aw0, ConstructorDetector constructorDetector) throws JsonMappingException {
        PropertyName propertyName;
        boolean z;
        int e;
        bw0 bw02 = bw0;
        aw0 aw02 = aw0;
        if (1 == aw0.mo11165g()) {
            AnnotatedParameter i = aw02.mo11167i(0);
            JacksonInject.Value f = aw02.mo11164f(0);
            int i2 = C1992a.f9914b[constructorDetector.singleArgMode().ordinal()];
            if (i2 == 1) {
                DeserializationContext deserializationContext2 = deserializationContext;
                n00 n002 = n00;
                propertyName = null;
                z = false;
            } else if (i2 == 2) {
                DeserializationContext deserializationContext3 = deserializationContext;
                n00 n003 = n00;
                PropertyName h = aw02.mo11166h(0);
                if (h == null) {
                    _validateNamedPropertyParameter(deserializationContext, n00, aw0, 0, h, f);
                }
                z = true;
                propertyName = h;
            } else if (i2 != 3) {
                q00 j = aw02.mo11168j(0);
                PropertyName c = aw02.mo11161c(0);
                z = (c == null && f == null) ? false : true;
                if (!z && j != null) {
                    c = aw02.mo11166h(0);
                    z = c != null && j.mo24878d();
                }
                DeserializationContext deserializationContext4 = deserializationContext;
                n00 n004 = n00;
                propertyName = c;
            } else {
                deserializationContext.reportBadTypeDefinition(n00, "Single-argument constructor (%s) is annotated but no 'mode' defined; `CreatorDetector`configured with `SingleArgConstructor.REQUIRE_MODE`", aw0.mo11160b());
                return;
            }
            if (z) {
                bw02.mo11906l(aw0.mo11160b(), true, new SettableBeanProperty[]{constructCreatorProperty(deserializationContext, n00, propertyName, 0, i, f)});
                return;
            }
            _handleSingleArgumentCreator(bw02, aw0.mo11160b(), true, true);
            q00 j2 = aw02.mo11168j(0);
            if (j2 != null) {
                ((zj4) j2).mo28500z0();
            }
        } else if (constructorDetector.singleArgCreatorDefaultsToProperties() || (e = aw0.mo11163e()) < 0 || (!constructorDetector.singleArgCreatorDefaultsToDelegating() && aw02.mo11166h(e) != null)) {
            _addExplicitPropertyCreator(deserializationContext, n00, bw0, aw0);
        } else {
            _addExplicitDelegatingCreator(deserializationContext, n00, bw0, aw0);
        }
    }
}
