package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.C6177b;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.descriptors.C7428e;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias;
import kotlin.reflect.jvm.internal.impl.protobuf.C7610a;
import kotlin.reflect.jvm.internal.impl.protobuf.C7628h;
import org.web3j.ens.contracts.generated.PublicResolver;
import p000.yc1;

/* compiled from: DeserializedMemberScope.kt */
public abstract class DeserializedMemberScope extends qs3 {

    /* renamed from: f */
    public static final /* synthetic */ i93<Object>[] f40190f;

    /* renamed from: b */
    public final md1 f40191b;

    /* renamed from: c */
    public final C7684a f40192c;

    /* renamed from: d */
    public final q84 f40193d;

    /* renamed from: e */
    public final gc4 f40194e;

    /* compiled from: DeserializedMemberScope.kt */
    public final class NoReorderImplementation implements C7684a {

        /* renamed from: o */
        public static final /* synthetic */ i93<Object>[] f40195o;

        /* renamed from: a */
        public final List<ProtoBuf$Function> f40196a;

        /* renamed from: b */
        public final List<ProtoBuf$Property> f40197b;

        /* renamed from: c */
        public final List<ProtoBuf$TypeAlias> f40198c;

        /* renamed from: d */
        public final q84 f40199d;

        /* renamed from: e */
        public final q84 f40200e;

        /* renamed from: f */
        public final q84 f40201f;

        /* renamed from: g */
        public final q84 f40202g;

        /* renamed from: h */
        public final q84 f40203h;

        /* renamed from: i */
        public final q84 f40204i;

        /* renamed from: j */
        public final q84 f40205j;

        /* renamed from: k */
        public final q84 f40206k;

        /* renamed from: l */
        public final q84 f40207l;

        /* renamed from: m */
        public final q84 f40208m;

        /* renamed from: n */
        public final /* synthetic */ DeserializedMemberScope f40209n;

        static {
            Class<NoReorderImplementation> cls = NoReorderImplementation.class;
            f40195o = new i93[]{ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(cls), "declaredFunctions", "getDeclaredFunctions()Ljava/util/List;")), ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(cls), "declaredProperties", "getDeclaredProperties()Ljava/util/List;")), ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(cls), "allTypeAliases", "getAllTypeAliases()Ljava/util/List;")), ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(cls), "allFunctions", "getAllFunctions()Ljava/util/List;")), ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(cls), "allProperties", "getAllProperties()Ljava/util/List;")), ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(cls), "typeAliasesByName", "getTypeAliasesByName()Ljava/util/Map;")), ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(cls), "functionsByName", "getFunctionsByName()Ljava/util/Map;")), ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(cls), "propertiesByName", "getPropertiesByName()Ljava/util/Map;")), ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(cls), "functionNames", "getFunctionNames()Ljava/util/Set;")), ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(cls), "variableNames", "getVariableNames()Ljava/util/Set;"))};
        }

        public NoReorderImplementation(DeserializedMemberScope deserializedMemberScope, List<ProtoBuf$Function> list, List<ProtoBuf$Property> list2, List<ProtoBuf$TypeAlias> list3) {
            vx2.m53591g(list, "functionList");
            vx2.m53591g(list2, "propertyList");
            vx2.m53591g(list3, "typeAliasList");
            this.f40209n = deserializedMemberScope;
            this.f40196a = list;
            this.f40197b = list2;
            this.f40198c = !deserializedMemberScope.mo55201p().mo56226c().mo52440g().mo55885c() ? ck0.m33062j() : list3;
            this.f40199d = deserializedMemberScope.mo55201p().mo56231h().mo51164i(new C7685x2e9e69e8(this));
            this.f40200e = deserializedMemberScope.mo55201p().mo56231h().mo51164i(new C7686x7d574862(this));
            this.f40201f = deserializedMemberScope.mo55201p().mo56231h().mo51164i(new DeserializedMemberScope$NoReorderImplementation$allTypeAliases$2(this));
            this.f40202g = deserializedMemberScope.mo55201p().mo56231h().mo51164i(new DeserializedMemberScope$NoReorderImplementation$allFunctions$2(this));
            this.f40203h = deserializedMemberScope.mo55201p().mo56231h().mo51164i(new DeserializedMemberScope$NoReorderImplementation$allProperties$2(this));
            this.f40204i = deserializedMemberScope.mo55201p().mo56231h().mo51164i(new C7689xb136a72d(this));
            this.f40205j = deserializedMemberScope.mo55201p().mo56231h().mo51164i(new C7687x615757a4(this));
            this.f40206k = deserializedMemberScope.mo55201p().mo56231h().mo51164i(new C7688xd0ec09aa(this));
            this.f40207l = deserializedMemberScope.mo55201p().mo56231h().mo51164i(new DeserializedMemberScope$NoReorderImplementation$functionNames$2(this, deserializedMemberScope));
            this.f40208m = deserializedMemberScope.mo55201p().mo56231h().mo51164i(new DeserializedMemberScope$NoReorderImplementation$variableNames$2(this, deserializedMemberScope));
        }

        /* renamed from: A */
        public final List<C7428e> mo55206A() {
            return (List) ca6.m56364a(this.f40202g, this, f40195o[3]);
        }

        /* renamed from: B */
        public final List<fx4> mo55207B() {
            return (List) ca6.m56364a(this.f40203h, this, f40195o[4]);
        }

        /* renamed from: C */
        public final List<hz6> mo55208C() {
            return (List) ca6.m56364a(this.f40201f, this, f40195o[2]);
        }

        /* renamed from: D */
        public final List<C7428e> mo55209D() {
            return (List) ca6.m56364a(this.f40199d, this, f40195o[0]);
        }

        /* renamed from: E */
        public final List<fx4> mo55210E() {
            return (List) ca6.m56364a(this.f40200e, this, f40195o[1]);
        }

        /* renamed from: F */
        public final Map<r24, Collection<C7428e>> mo55211F() {
            return (Map) ca6.m56364a(this.f40205j, this, f40195o[6]);
        }

        /* renamed from: G */
        public final Map<r24, Collection<fx4>> mo55212G() {
            return (Map) ca6.m56364a(this.f40206k, this, f40195o[7]);
        }

        /* renamed from: H */
        public final Map<r24, hz6> mo55213H() {
            return (Map) ca6.m56364a(this.f40204i, this, f40195o[5]);
        }

        /* renamed from: a */
        public Set<r24> mo55214a() {
            return (Set) ca6.m56364a(this.f40207l, this, f40195o[8]);
        }

        /* renamed from: b */
        public Collection<fx4> mo55215b(r24 r24, ul3 ul3) {
            vx2.m53591g(r24, PublicResolver.FUNC_NAME);
            vx2.m53591g(ul3, "location");
            if (!mo55217d().contains(r24)) {
                return ck0.m33062j();
            }
            Collection<fx4> collection = mo55212G().get(r24);
            if (collection == null) {
                return ck0.m33062j();
            }
            return collection;
        }

        /* renamed from: c */
        public Collection<C7428e> mo55216c(r24 r24, ul3 ul3) {
            vx2.m53591g(r24, PublicResolver.FUNC_NAME);
            vx2.m53591g(ul3, "location");
            if (!mo55214a().contains(r24)) {
                return ck0.m33062j();
            }
            Collection<C7428e> collection = mo55211F().get(r24);
            if (collection == null) {
                return ck0.m33062j();
            }
            return collection;
        }

        /* renamed from: d */
        public Set<r24> mo55217d() {
            return (Set) ca6.m56364a(this.f40208m, this, f40195o[9]);
        }

        /* renamed from: e */
        public void mo55218e(Collection<d31> collection, yc1 yc1, rc2<? super r24, Boolean> rc2, ul3 ul3) {
            vx2.m53591g(collection, "result");
            vx2.m53591g(yc1, "kindFilter");
            vx2.m53591g(rc2, "nameFilter");
            vx2.m53591g(ul3, "location");
            if (yc1.mo67068a(yc1.f46165c.mo67082i())) {
                for (T next : mo55207B()) {
                    r24 name = ((fx4) next).getName();
                    vx2.m53590f(name, "it.name");
                    if (rc2.invoke(name).booleanValue()) {
                        collection.add(next);
                    }
                }
            }
            if (yc1.mo67068a(yc1.f46165c.mo67077d())) {
                for (T next2 : mo55206A()) {
                    r24 name2 = ((C7428e) next2).getName();
                    vx2.m53590f(name2, "it.name");
                    if (rc2.invoke(name2).booleanValue()) {
                        collection.add(next2);
                    }
                }
            }
        }

        /* renamed from: f */
        public hz6 mo55219f(r24 r24) {
            vx2.m53591g(r24, PublicResolver.FUNC_NAME);
            return mo55213H().get(r24);
        }

        /* renamed from: g */
        public Set<r24> mo55220g() {
            List<ProtoBuf$TypeAlias> list = this.f40198c;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            DeserializedMemberScope deserializedMemberScope = this.f40209n;
            for (C7628h hVar : list) {
                linkedHashSet.add(v24.m73044b(deserializedMemberScope.mo55201p().mo56230g(), ((ProtoBuf$TypeAlias) hVar).getName()));
            }
            return linkedHashSet;
        }

        /* renamed from: t */
        public final List<C7428e> mo55221t() {
            Set<r24> t = this.f40209n.mo55188t();
            ArrayList arrayList = new ArrayList();
            for (r24 w : t) {
                hk0.m45275z(arrayList, mo55224w(w));
            }
            return arrayList;
        }

        /* renamed from: u */
        public final List<fx4> mo55222u() {
            Set<r24> u = this.f40209n.mo55189u();
            ArrayList arrayList = new ArrayList();
            for (r24 x : u) {
                hk0.m45275z(arrayList, mo55225x(x));
            }
            return arrayList;
        }

        /* renamed from: v */
        public final List<C7428e> mo55223v() {
            List<ProtoBuf$Function> list = this.f40196a;
            DeserializedMemberScope deserializedMemberScope = this.f40209n;
            ArrayList arrayList = new ArrayList();
            for (C7628h hVar : list) {
                C7428e j = deserializedMemberScope.mo55201p().mo56229f().mo55136j((ProtoBuf$Function) hVar);
                if (!deserializedMemberScope.mo55190x(j)) {
                    j = null;
                }
                if (j != null) {
                    arrayList.add(j);
                }
            }
            return arrayList;
        }

        /* renamed from: w */
        public final List<C7428e> mo55224w(r24 r24) {
            List<C7428e> D = mo55209D();
            DeserializedMemberScope deserializedMemberScope = this.f40209n;
            ArrayList arrayList = new ArrayList();
            for (T next : D) {
                if (vx2.m53586b(((d31) next).getName(), r24)) {
                    arrayList.add(next);
                }
            }
            int size = arrayList.size();
            deserializedMemberScope.mo55184k(r24, arrayList);
            return arrayList.subList(size, arrayList.size());
        }

        /* renamed from: x */
        public final List<fx4> mo55225x(r24 r24) {
            List<fx4> E = mo55210E();
            DeserializedMemberScope deserializedMemberScope = this.f40209n;
            ArrayList arrayList = new ArrayList();
            for (T next : E) {
                if (vx2.m53586b(((d31) next).getName(), r24)) {
                    arrayList.add(next);
                }
            }
            int size = arrayList.size();
            deserializedMemberScope.mo55185l(r24, arrayList);
            return arrayList.subList(size, arrayList.size());
        }

        /* renamed from: y */
        public final List<fx4> mo55226y() {
            List<ProtoBuf$Property> list = this.f40197b;
            DeserializedMemberScope deserializedMemberScope = this.f40209n;
            ArrayList arrayList = new ArrayList();
            for (C7628h hVar : list) {
                fx4 l = deserializedMemberScope.mo55201p().mo56229f().mo55138l((ProtoBuf$Property) hVar);
                if (l != null) {
                    arrayList.add(l);
                }
            }
            return arrayList;
        }

        /* renamed from: z */
        public final List<hz6> mo55227z() {
            List<ProtoBuf$TypeAlias> list = this.f40198c;
            DeserializedMemberScope deserializedMemberScope = this.f40209n;
            ArrayList arrayList = new ArrayList();
            for (C7628h hVar : list) {
                hz6 m = deserializedMemberScope.mo55201p().mo56229f().mo55139m((ProtoBuf$TypeAlias) hVar);
                if (m != null) {
                    arrayList.add(m);
                }
            }
            return arrayList;
        }
    }

    /* compiled from: DeserializedMemberScope.kt */
    public final class OptimizedImplementation implements C7684a {

        /* renamed from: j */
        public static final /* synthetic */ i93<Object>[] f40210j;

        /* renamed from: a */
        public final Map<r24, byte[]> f40211a;

        /* renamed from: b */
        public final Map<r24, byte[]> f40212b;

        /* renamed from: c */
        public final Map<r24, byte[]> f40213c;

        /* renamed from: d */
        public final vs3<r24, Collection<C7428e>> f40214d;

        /* renamed from: e */
        public final vs3<r24, Collection<fx4>> f40215e;

        /* renamed from: f */
        public final ws3<r24, hz6> f40216f;

        /* renamed from: g */
        public final q84 f40217g;

        /* renamed from: h */
        public final q84 f40218h;

        /* renamed from: i */
        public final /* synthetic */ DeserializedMemberScope f40219i;

        static {
            Class<OptimizedImplementation> cls = OptimizedImplementation.class;
            f40210j = new i93[]{ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(cls), "functionNames", "getFunctionNames()Ljava/util/Set;")), ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(cls), "variableNames", "getVariableNames()Ljava/util/Set;"))};
        }

        public OptimizedImplementation(DeserializedMemberScope deserializedMemberScope, List<ProtoBuf$Function> list, List<ProtoBuf$Property> list2, List<ProtoBuf$TypeAlias> list3) {
            Map<r24, byte[]> map;
            vx2.m53591g(list, "functionList");
            vx2.m53591g(list2, "propertyList");
            vx2.m53591g(list3, "typeAliasList");
            this.f40219i = deserializedMemberScope;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (T next : list) {
                r24 b = v24.m73044b(deserializedMemberScope.mo55201p().mo56230g(), ((ProtoBuf$Function) ((C7628h) next)).getName());
                Object obj = linkedHashMap.get(b);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(b, obj);
                }
                ((List) obj).add(next);
            }
            this.f40211a = mo55231p(linkedHashMap);
            DeserializedMemberScope deserializedMemberScope2 = this.f40219i;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (T next2 : list2) {
                r24 b2 = v24.m73044b(deserializedMemberScope2.mo55201p().mo56230g(), ((ProtoBuf$Property) ((C7628h) next2)).getName());
                Object obj2 = linkedHashMap2.get(b2);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap2.put(b2, obj2);
                }
                ((List) obj2).add(next2);
            }
            this.f40212b = mo55231p(linkedHashMap2);
            if (this.f40219i.mo55201p().mo56226c().mo52440g().mo55885c()) {
                DeserializedMemberScope deserializedMemberScope3 = this.f40219i;
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (T next3 : list3) {
                    r24 b3 = v24.m73044b(deserializedMemberScope3.mo55201p().mo56230g(), ((ProtoBuf$TypeAlias) ((C7628h) next3)).getName());
                    Object obj3 = linkedHashMap3.get(b3);
                    if (obj3 == null) {
                        obj3 = new ArrayList();
                        linkedHashMap3.put(b3, obj3);
                    }
                    ((List) obj3).add(next3);
                }
                map = mo55231p(linkedHashMap3);
            } else {
                map = C6177b.m47361i();
            }
            this.f40213c = map;
            this.f40214d = this.f40219i.mo55201p().mo56231h().mo51163h(new DeserializedMemberScope$OptimizedImplementation$functions$1(this));
            this.f40215e = this.f40219i.mo55201p().mo56231h().mo51163h(new DeserializedMemberScope$OptimizedImplementation$properties$1(this));
            this.f40216f = this.f40219i.mo55201p().mo56231h().mo51159d(new C7691x48b4056b(this));
            this.f40217g = this.f40219i.mo55201p().mo56231h().mo51164i(new DeserializedMemberScope$OptimizedImplementation$functionNames$2(this, this.f40219i));
            this.f40218h = this.f40219i.mo55201p().mo56231h().mo51164i(new DeserializedMemberScope$OptimizedImplementation$variableNames$2(this, this.f40219i));
        }

        /* renamed from: a */
        public Set<r24> mo55214a() {
            return (Set) ca6.m56364a(this.f40217g, this, f40210j[0]);
        }

        /* renamed from: b */
        public Collection<fx4> mo55215b(r24 r24, ul3 ul3) {
            vx2.m53591g(r24, PublicResolver.FUNC_NAME);
            vx2.m53591g(ul3, "location");
            if (!mo55217d().contains(r24)) {
                return ck0.m33062j();
            }
            return this.f40215e.invoke(r24);
        }

        /* renamed from: c */
        public Collection<C7428e> mo55216c(r24 r24, ul3 ul3) {
            vx2.m53591g(r24, PublicResolver.FUNC_NAME);
            vx2.m53591g(ul3, "location");
            if (!mo55214a().contains(r24)) {
                return ck0.m33062j();
            }
            return this.f40214d.invoke(r24);
        }

        /* renamed from: d */
        public Set<r24> mo55217d() {
            return (Set) ca6.m56364a(this.f40218h, this, f40210j[1]);
        }

        /* renamed from: e */
        public void mo55218e(Collection<d31> collection, yc1 yc1, rc2<? super r24, Boolean> rc2, ul3 ul3) {
            vx2.m53591g(collection, "result");
            vx2.m53591g(yc1, "kindFilter");
            vx2.m53591g(rc2, "nameFilter");
            vx2.m53591g(ul3, "location");
            if (yc1.mo67068a(yc1.f46165c.mo67082i())) {
                Set<r24> d = mo55217d();
                ArrayList arrayList = new ArrayList();
                for (r24 next : d) {
                    if (rc2.invoke(next).booleanValue()) {
                        arrayList.addAll(mo55215b(next, ul3));
                    }
                }
                ms3 ms3 = ms3.f41006a;
                vx2.m53590f(ms3, "INSTANCE");
                gk0.m44738y(arrayList, ms3);
                collection.addAll(arrayList);
            }
            if (yc1.mo67068a(yc1.f46165c.mo67077d())) {
                Set<r24> a = mo55214a();
                ArrayList arrayList2 = new ArrayList();
                for (r24 next2 : a) {
                    if (rc2.invoke(next2).booleanValue()) {
                        arrayList2.addAll(mo55216c(next2, ul3));
                    }
                }
                ms3 ms32 = ms3.f41006a;
                vx2.m53590f(ms32, "INSTANCE");
                gk0.m44738y(arrayList2, ms32);
                collection.addAll(arrayList2);
            }
        }

        /* renamed from: f */
        public hz6 mo55219f(r24 r24) {
            vx2.m53591g(r24, PublicResolver.FUNC_NAME);
            return this.f40216f.invoke(r24);
        }

        /* renamed from: g */
        public Set<r24> mo55220g() {
            return this.f40213c.keySet();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0027, code lost:
            if (r0 != null) goto L_0x002e;
         */
        /* renamed from: m */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.C7428e> mo55228m(p000.r24 r7) {
            /*
                r6 = this;
                java.util.Map<r24, byte[]> r0 = r6.f40211a
                jm4<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function.PARSER
                java.lang.String r2 = "PARSER"
                p000.vx2.m53590f(r1, r2)
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope r2 = r6.f40219i
                java.lang.Object r0 = r0.get(r7)
                byte[] r0 = (byte[]) r0
                if (r0 == 0) goto L_0x002a
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope r3 = r6.f40219i
                java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream
                r4.<init>(r0)
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1 r0 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1
                r0.<init>(r1, r4, r3)
                hw5 r0 = kotlin.sequences.SequencesKt__SequencesKt.m63013h(r0)
                java.util.List r0 = kotlin.sequences.SequencesKt___SequencesKt.m63020D(r0)
                if (r0 == 0) goto L_0x002a
                goto L_0x002e
            L_0x002a:
                java.util.List r0 = p000.ck0.m33062j()
            L_0x002e:
                java.util.ArrayList r1 = new java.util.ArrayList
                int r3 = r0.size()
                r1.<init>(r3)
                java.util.Iterator r0 = r0.iterator()
            L_0x003b:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L_0x0066
                java.lang.Object r3 = r0.next()
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function) r3
                md1 r4 = r2.mo55201p()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer r4 = r4.mo56229f()
                java.lang.String r5 = "it"
                p000.vx2.m53590f(r3, r5)
                kotlin.reflect.jvm.internal.impl.descriptors.e r3 = r4.mo55136j(r3)
                boolean r4 = r2.mo55190x(r3)
                if (r4 == 0) goto L_0x005f
                goto L_0x0060
            L_0x005f:
                r3 = 0
            L_0x0060:
                if (r3 == 0) goto L_0x003b
                r1.add(r3)
                goto L_0x003b
            L_0x0066:
                r2.mo55184k(r7, r1)
                java.util.List r7 = p000.ak0.m55533c(r1)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.OptimizedImplementation.mo55228m(r24):java.util.Collection");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0027, code lost:
            if (r0 != null) goto L_0x002e;
         */
        /* renamed from: n */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.util.Collection<p000.fx4> mo55229n(p000.r24 r7) {
            /*
                r6 = this;
                java.util.Map<r24, byte[]> r0 = r6.f40212b
                jm4<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property.PARSER
                java.lang.String r2 = "PARSER"
                p000.vx2.m53590f(r1, r2)
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope r2 = r6.f40219i
                java.lang.Object r0 = r0.get(r7)
                byte[] r0 = (byte[]) r0
                if (r0 == 0) goto L_0x002a
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope r3 = r6.f40219i
                java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream
                r4.<init>(r0)
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1 r0 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1
                r0.<init>(r1, r4, r3)
                hw5 r0 = kotlin.sequences.SequencesKt__SequencesKt.m63013h(r0)
                java.util.List r0 = kotlin.sequences.SequencesKt___SequencesKt.m63020D(r0)
                if (r0 == 0) goto L_0x002a
                goto L_0x002e
            L_0x002a:
                java.util.List r0 = p000.ck0.m33062j()
            L_0x002e:
                java.util.ArrayList r1 = new java.util.ArrayList
                int r3 = r0.size()
                r1.<init>(r3)
                java.util.Iterator r0 = r0.iterator()
            L_0x003b:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L_0x005e
                java.lang.Object r3 = r0.next()
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property) r3
                md1 r4 = r2.mo55201p()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer r4 = r4.mo56229f()
                java.lang.String r5 = "it"
                p000.vx2.m53590f(r3, r5)
                fx4 r3 = r4.mo55138l(r3)
                if (r3 == 0) goto L_0x003b
                r1.add(r3)
                goto L_0x003b
            L_0x005e:
                r2.mo55185l(r7, r1)
                java.util.List r7 = p000.ak0.m55533c(r1)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.OptimizedImplementation.mo55229n(r24):java.util.Collection");
        }

        /* renamed from: o */
        public final hz6 mo55230o(r24 r24) {
            ProtoBuf$TypeAlias parseDelimitedFrom;
            byte[] bArr = this.f40213c.get(r24);
            if (bArr == null || (parseDelimitedFrom = ProtoBuf$TypeAlias.parseDelimitedFrom(new ByteArrayInputStream(bArr), this.f40219i.mo55201p().mo56226c().mo52443j())) == null) {
                return null;
            }
            return this.f40219i.mo55201p().mo56229f().mo55139m(parseDelimitedFrom);
        }

        /* renamed from: p */
        public final Map<r24, byte[]> mo55231p(Map<r24, ? extends Collection<? extends C7610a>> map) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(ao3.m31893e(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Iterable<C7610a> iterable = (Iterable) entry.getValue();
                ArrayList arrayList = new ArrayList(dk0.m43495u(iterable, 10));
                for (C7610a writeDelimitedTo : iterable) {
                    writeDelimitedTo.writeDelimitedTo(byteArrayOutputStream);
                    arrayList.add(r37.f33317a);
                }
                linkedHashMap.put(key, byteArrayOutputStream.toByteArray());
            }
            return linkedHashMap;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$a */
    /* compiled from: DeserializedMemberScope.kt */
    public interface C7684a {
        /* renamed from: a */
        Set<r24> mo55214a();

        /* renamed from: b */
        Collection<fx4> mo55215b(r24 r24, ul3 ul3);

        /* renamed from: c */
        Collection<C7428e> mo55216c(r24 r24, ul3 ul3);

        /* renamed from: d */
        Set<r24> mo55217d();

        /* renamed from: e */
        void mo55218e(Collection<d31> collection, yc1 yc1, rc2<? super r24, Boolean> rc2, ul3 ul3);

        /* renamed from: f */
        hz6 mo55219f(r24 r24);

        /* renamed from: g */
        Set<r24> mo55220g();
    }

    static {
        Class<DeserializedMemberScope> cls = DeserializedMemberScope.class;
        f40190f = new i93[]{ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(cls), "classNames", "getClassNames$deserialization()Ljava/util/Set;")), ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(cls), "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;"))};
    }

    public DeserializedMemberScope(md1 md1, List<ProtoBuf$Function> list, List<ProtoBuf$Property> list2, List<ProtoBuf$TypeAlias> list3, pc2<? extends Collection<r24>> pc2) {
        vx2.m53591g(md1, "c");
        vx2.m53591g(list, "functionList");
        vx2.m53591g(list2, "propertyList");
        vx2.m53591g(list3, "typeAliasList");
        vx2.m53591g(pc2, "classNames");
        this.f40191b = md1;
        this.f40192c = mo55199n(list, list2, list3);
        this.f40193d = md1.mo56231h().mo51164i(new DeserializedMemberScope$classNames$2(pc2));
        this.f40194e = md1.mo56231h().mo51162g(new DeserializedMemberScope$classifierNamesLazy$2(this));
    }

    /* renamed from: a */
    public Set<r24> mo50860a() {
        return this.f40192c.mo55214a();
    }

    /* renamed from: b */
    public Collection<fx4> mo50861b(r24 r24, ul3 ul3) {
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        vx2.m53591g(ul3, "location");
        return this.f40192c.mo55215b(r24, ul3);
    }

    /* renamed from: c */
    public Collection<C7428e> mo50862c(r24 r24, ul3 ul3) {
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        vx2.m53591g(ul3, "location");
        return this.f40192c.mo55216c(r24, ul3);
    }

    /* renamed from: d */
    public Set<r24> mo50863d() {
        return this.f40192c.mo55217d();
    }

    /* renamed from: e */
    public eg0 mo50864e(r24 r24, ul3 ul3) {
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        vx2.m53591g(ul3, "location");
        if (mo55205w(r24)) {
            return mo55200o(r24);
        }
        if (this.f40192c.mo55220g().contains(r24)) {
            return mo55204v(r24);
        }
        return null;
    }

    /* renamed from: g */
    public Set<r24> mo50866g() {
        return mo55203r();
    }

    /* renamed from: i */
    public abstract void mo55183i(Collection<d31> collection, rc2<? super r24, Boolean> rc2);

    /* renamed from: j */
    public final Collection<d31> mo55198j(yc1 yc1, rc2<? super r24, Boolean> rc2, ul3 ul3) {
        vx2.m53591g(yc1, "kindFilter");
        vx2.m53591g(rc2, "nameFilter");
        vx2.m53591g(ul3, "location");
        ArrayList arrayList = new ArrayList(0);
        yc1.C9636a aVar = yc1.f46165c;
        if (yc1.mo67068a(aVar.mo67080g())) {
            mo55183i(arrayList, rc2);
        }
        this.f40192c.mo55218e(arrayList, yc1, rc2, ul3);
        if (yc1.mo67068a(aVar.mo67076c())) {
            for (r24 next : mo55202q()) {
                if (rc2.invoke(next).booleanValue()) {
                    ak0.m55531a(arrayList, mo55200o(next));
                }
            }
        }
        if (yc1.mo67068a(yc1.f46165c.mo67081h())) {
            for (r24 next2 : this.f40192c.mo55220g()) {
                if (rc2.invoke(next2).booleanValue()) {
                    ak0.m55531a(arrayList, this.f40192c.mo55219f(next2));
                }
            }
        }
        return ak0.m55533c(arrayList);
    }

    /* renamed from: k */
    public void mo55184k(r24 r24, List<C7428e> list) {
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        vx2.m53591g(list, "functions");
    }

    /* renamed from: l */
    public void mo55185l(r24 r24, List<fx4> list) {
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        vx2.m53591g(list, "descriptors");
    }

    /* renamed from: m */
    public abstract nf0 mo55186m(r24 r24);

    /* renamed from: n */
    public final C7684a mo55199n(List<ProtoBuf$Function> list, List<ProtoBuf$Property> list2, List<ProtoBuf$TypeAlias> list3) {
        if (this.f40191b.mo56226c().mo52440g().mo55883a()) {
            return new NoReorderImplementation(this, list, list2, list3);
        }
        return new OptimizedImplementation(this, list, list2, list3);
    }

    /* renamed from: o */
    public final if0 mo55200o(r24 r24) {
        return this.f40191b.mo56226c().mo52435b(mo55186m(r24));
    }

    /* renamed from: p */
    public final md1 mo55201p() {
        return this.f40191b;
    }

    /* renamed from: q */
    public final Set<r24> mo55202q() {
        return (Set) ca6.m56364a(this.f40193d, this, f40190f[0]);
    }

    /* renamed from: r */
    public final Set<r24> mo55203r() {
        return (Set) ca6.m56365b(this.f40194e, this, f40190f[1]);
    }

    /* renamed from: s */
    public abstract Set<r24> mo55187s();

    /* renamed from: t */
    public abstract Set<r24> mo55188t();

    /* renamed from: u */
    public abstract Set<r24> mo55189u();

    /* renamed from: v */
    public final hz6 mo55204v(r24 r24) {
        return this.f40192c.mo55219f(r24);
    }

    /* renamed from: w */
    public boolean mo55205w(r24 r24) {
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        return mo55202q().contains(r24);
    }

    /* renamed from: x */
    public boolean mo55190x(C7428e eVar) {
        vx2.m53591g(eVar, "function");
        return true;
    }
}
