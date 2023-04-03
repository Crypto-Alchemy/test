package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.C7428e;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C7433a;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.StaticScopeForKotlinEnum;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;
import org.web3j.ens.contracts.generated.PublicResolver;
import p000.a97;
import p000.nd6;
import p000.we5;
import p000.xx4;

/* compiled from: DeserializedClassDescriptor.kt */
public final class DeserializedClassDescriptor extends C9387u5 implements d31 {

    /* renamed from: A */
    public final Modality f40158A;

    /* renamed from: B */
    public final fd1 f40159B;

    /* renamed from: C */
    public final ClassKind f40160C;

    /* renamed from: H */
    public final md1 f40161H;

    /* renamed from: I */
    public final qs3 f40162I;

    /* renamed from: L */
    public final DeserializedClassTypeConstructor f40163L;

    /* renamed from: M */
    public final ScopesHolderForClass<DeserializedClassMemberScope> f40164M;

    /* renamed from: P */
    public final EnumEntryClassDescriptors f40165P;

    /* renamed from: Q */
    public final d31 f40166Q;

    /* renamed from: U */
    public final gc4<ef0> f40167U;

    /* renamed from: X */
    public final q84<Collection<ef0>> f40168X;

    /* renamed from: Y */
    public final gc4<if0> f40169Y;

    /* renamed from: Z */
    public final q84<Collection<if0>> f40170Z;

    /* renamed from: e0 */
    public final gc4<d87<d36>> f40171e0;

    /* renamed from: k0 */
    public final xx4.C9612a f40172k0;

    /* renamed from: r */
    public final ProtoBuf$Class f40173r;

    /* renamed from: s */
    public final o10 f40174s;

    /* renamed from: v0 */
    public final C6983dm f40175v0;

    /* renamed from: x */
    public final a66 f40176x;

    /* renamed from: y */
    public final nf0 f40177y;

    /* compiled from: DeserializedClassDescriptor.kt */
    public final class DeserializedClassMemberScope extends DeserializedMemberScope {

        /* renamed from: g */
        public final bd3 f40178g;

        /* renamed from: h */
        public final q84<Collection<d31>> f40179h;

        /* renamed from: i */
        public final q84<Collection<xc3>> f40180i;

        /* renamed from: j */
        public final /* synthetic */ DeserializedClassDescriptor f40181j;

        /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$a */
        /* compiled from: DeserializedClassDescriptor.kt */
        public static final class C7677a extends n84 {

            /* renamed from: a */
            public final /* synthetic */ List<D> f40182a;

            public C7677a(List<D> list) {
                this.f40182a = list;
            }

            /* renamed from: a */
            public void mo50135a(CallableMemberDescriptor callableMemberDescriptor) {
                vx2.m53591g(callableMemberDescriptor, "fakeOverride");
                OverridingUtil.m62364K(callableMemberDescriptor, (rc2<CallableMemberDescriptor, r37>) null);
                this.f40182a.add(callableMemberDescriptor);
            }

            /* renamed from: e */
            public void mo50137e(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2) {
                vx2.m53591g(callableMemberDescriptor, "fromSuper");
                vx2.m53591g(callableMemberDescriptor2, "fromCurrent");
                if (callableMemberDescriptor2 instanceof C7433a) {
                    ((C7433a) callableMemberDescriptor2).mo53325O0(td1.f44719a, callableMemberDescriptor);
                }
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public DeserializedClassMemberScope(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor r8, p000.bd3 r9) {
            /*
                r7 = this;
                java.lang.String r0 = "kotlinTypeRefiner"
                p000.vx2.m53591g(r9, r0)
                r7.f40181j = r8
                md1 r2 = r8.mo55172U0()
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r0 = r8.mo55173V0()
                java.util.List r3 = r0.getFunctionList()
                java.lang.String r0 = "classProto.functionList"
                p000.vx2.m53590f(r3, r0)
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r0 = r8.mo55173V0()
                java.util.List r4 = r0.getPropertyList()
                java.lang.String r0 = "classProto.propertyList"
                p000.vx2.m53590f(r4, r0)
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r0 = r8.mo55173V0()
                java.util.List r5 = r0.getTypeAliasList()
                java.lang.String r0 = "classProto.typeAliasList"
                p000.vx2.m53590f(r5, r0)
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r0 = r8.mo55173V0()
                java.util.List r0 = r0.getNestedClassNameList()
                java.lang.String r1 = "classProto.nestedClassNameList"
                p000.vx2.m53590f(r0, r1)
                md1 r8 = r8.mo55172U0()
                t24 r8 = r8.mo56230g()
                java.util.ArrayList r1 = new java.util.ArrayList
                r6 = 10
                int r6 = p000.dk0.m43495u(r0, r6)
                r1.<init>(r6)
                java.util.Iterator r0 = r0.iterator()
            L_0x0056:
                boolean r6 = r0.hasNext()
                if (r6 == 0) goto L_0x006e
                java.lang.Object r6 = r0.next()
                java.lang.Number r6 = (java.lang.Number) r6
                int r6 = r6.intValue()
                r24 r6 = p000.v24.m73044b(r8, r6)
                r1.add(r6)
                goto L_0x0056
            L_0x006e:
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$2$1 r6 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$2$1
                r6.<init>(r1)
                r1 = r7
                r1.<init>(r2, r3, r4, r5, r6)
                r7.f40178g = r9
                md1 r8 = r7.mo55201p()
                da6 r8 = r8.mo56231h()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$allDescriptors$1 r9 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$allDescriptors$1
                r9.<init>(r7)
                q84 r8 = r8.mo51164i(r9)
                r7.f40179h = r8
                md1 r8 = r7.mo55201p()
                da6 r8 = r8.mo56231h()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$refinedSupertypes$1 r9 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$refinedSupertypes$1
                r9.<init>(r7)
                q84 r8 = r8.mo51164i(r9)
                r7.f40180i = r8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.DeserializedClassMemberScope.<init>(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor, bd3):void");
        }

        /* renamed from: A */
        public final <D extends CallableMemberDescriptor> void mo55180A(r24 r24, Collection<? extends D> collection, List<D> list) {
            r24 r242 = r24;
            Collection<? extends D> collection2 = collection;
            mo55201p().mo56226c().mo52446m().mo52869a().mo55055v(r242, collection2, new ArrayList(list), mo55181B(), new C7677a(list));
        }

        /* renamed from: B */
        public final DeserializedClassDescriptor mo55181B() {
            return this.f40181j;
        }

        /* renamed from: C */
        public void mo55182C(r24 r24, ul3 ul3) {
            vx2.m53591g(r24, PublicResolver.FUNC_NAME);
            vx2.m53591g(ul3, "location");
            u77.m72644a(mo55201p().mo56226c().mo52448o(), ul3, mo55181B(), r24);
        }

        /* renamed from: b */
        public Collection<fx4> mo50861b(r24 r24, ul3 ul3) {
            vx2.m53591g(r24, PublicResolver.FUNC_NAME);
            vx2.m53591g(ul3, "location");
            mo55182C(r24, ul3);
            return super.mo50861b(r24, ul3);
        }

        /* renamed from: c */
        public Collection<C7428e> mo50862c(r24 r24, ul3 ul3) {
            vx2.m53591g(r24, PublicResolver.FUNC_NAME);
            vx2.m53591g(ul3, "location");
            mo55182C(r24, ul3);
            return super.mo50862c(r24, ul3);
        }

        /* renamed from: e */
        public eg0 mo50864e(r24 r24, ul3 ul3) {
            if0 f;
            vx2.m53591g(r24, PublicResolver.FUNC_NAME);
            vx2.m53591g(ul3, "location");
            mo55182C(r24, ul3);
            EnumEntryClassDescriptors K0 = mo55181B().f40165P;
            if (K0 == null || (f = K0.mo55195f(r24)) == null) {
                return super.mo50864e(r24, ul3);
            }
            return f;
        }

        /* renamed from: f */
        public Collection<d31> mo50865f(yc1 yc1, rc2<? super r24, Boolean> rc2) {
            vx2.m53591g(yc1, "kindFilter");
            vx2.m53591g(rc2, "nameFilter");
            return (Collection) this.f40179h.invoke();
        }

        /* renamed from: i */
        public void mo55183i(Collection<d31> collection, rc2<? super r24, Boolean> rc2) {
            Collection collection2;
            vx2.m53591g(collection, "result");
            vx2.m53591g(rc2, "nameFilter");
            EnumEntryClassDescriptors K0 = mo55181B().f40165P;
            if (K0 != null) {
                collection2 = K0.mo55193d();
            } else {
                collection2 = null;
            }
            if (collection2 == null) {
                collection2 = ck0.m33062j();
            }
            collection.addAll(collection2);
        }

        /* renamed from: k */
        public void mo55184k(r24 r24, List<C7428e> list) {
            vx2.m53591g(r24, PublicResolver.FUNC_NAME);
            vx2.m53591g(list, "functions");
            ArrayList arrayList = new ArrayList();
            for (xc3 m : (Collection) this.f40180i.invoke()) {
                arrayList.addAll(m.mo51146m().mo50862c(r24, NoLookupLocation.FOR_ALREADY_TRACKED));
            }
            list.addAll(mo55201p().mo56226c().mo52436c().mo50133d(r24, this.f40181j));
            mo55180A(r24, arrayList, list);
        }

        /* renamed from: l */
        public void mo55185l(r24 r24, List<fx4> list) {
            vx2.m53591g(r24, PublicResolver.FUNC_NAME);
            vx2.m53591g(list, "descriptors");
            ArrayList arrayList = new ArrayList();
            for (xc3 m : (Collection) this.f40180i.invoke()) {
                arrayList.addAll(m.mo51146m().mo50861b(r24, NoLookupLocation.FOR_ALREADY_TRACKED));
            }
            mo55180A(r24, arrayList, list);
        }

        /* renamed from: m */
        public nf0 mo55186m(r24 r24) {
            vx2.m53591g(r24, PublicResolver.FUNC_NAME);
            nf0 d = this.f40181j.f40177y.mo62675d(r24);
            vx2.m53590f(d, "classId.createNestedClassId(name)");
            return d;
        }

        /* renamed from: s */
        public Set<r24> mo55187s() {
            List<xc3> r = mo55181B().f40163L.mo51811g();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (xc3 m : r) {
                Set<r24> g = m.mo51146m().mo50866g();
                if (g == null) {
                    return null;
                }
                hk0.m45275z(linkedHashSet, g);
            }
            return linkedHashSet;
        }

        /* renamed from: t */
        public Set<r24> mo55188t() {
            List<xc3> r = mo55181B().f40163L.mo51811g();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (xc3 m : r) {
                hk0.m45275z(linkedHashSet, m.mo51146m().mo50860a());
            }
            linkedHashSet.addAll(mo55201p().mo56226c().mo52436c().mo50132b(this.f40181j));
            return linkedHashSet;
        }

        /* renamed from: u */
        public Set<r24> mo55189u() {
            List<xc3> r = mo55181B().f40163L.mo51811g();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (xc3 m : r) {
                hk0.m45275z(linkedHashSet, m.mo51146m().mo50863d());
            }
            return linkedHashSet;
        }

        /* renamed from: x */
        public boolean mo55190x(C7428e eVar) {
            vx2.m53591g(eVar, "function");
            return mo55201p().mo56226c().mo52452s().mo50688c(this.f40181j, eVar);
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    public final class DeserializedClassTypeConstructor extends C9442v5 {

        /* renamed from: d */
        public final q84<List<a17>> f40183d;

        public DeserializedClassTypeConstructor() {
            super(DeserializedClassDescriptor.this.mo55172U0().mo56231h());
            this.f40183d = DeserializedClassDescriptor.this.mo55172U0().mo56231h().mo51164i(new C7680x32944d2c(DeserializedClassDescriptor.this));
        }

        /* renamed from: e */
        public boolean mo51809e() {
            return true;
        }

        public List<a17> getParameters() {
            return (List) this.f40183d.invoke();
        }

        /* renamed from: m */
        public Collection<xc3> mo52632m() {
            String str;
            u82 b;
            NotFoundClasses.C7415b bVar;
            List<ProtoBuf$Type> l = cy4.m56607l(DeserializedClassDescriptor.this.mo55173V0(), DeserializedClassDescriptor.this.mo55172U0().mo56233j());
            DeserializedClassDescriptor deserializedClassDescriptor = DeserializedClassDescriptor.this;
            ArrayList arrayList = new ArrayList(dk0.m43495u(l, 10));
            for (ProtoBuf$Type q : l) {
                arrayList.add(deserializedClassDescriptor.mo55172U0().mo56232i().mo55153q(q));
            }
            List<T> u0 = CollectionsKt___CollectionsKt.m47350u0(arrayList, DeserializedClassDescriptor.this.mo55172U0().mo56226c().mo52436c().mo50131a(DeserializedClassDescriptor.this));
            ArrayList<NotFoundClasses.C7415b> arrayList2 = new ArrayList<>();
            for (T H0 : u0) {
                eg0 d = H0.mo51134H0().mo51180d();
                if (d instanceof NotFoundClasses.C7415b) {
                    bVar = (NotFoundClasses.C7415b) d;
                } else {
                    bVar = null;
                }
                if (bVar != null) {
                    arrayList2.add(bVar);
                }
            }
            if (!arrayList2.isEmpty()) {
                gr1 i = DeserializedClassDescriptor.this.mo55172U0().mo56226c().mo52442i();
                DeserializedClassDescriptor deserializedClassDescriptor2 = DeserializedClassDescriptor.this;
                ArrayList arrayList3 = new ArrayList(dk0.m43495u(arrayList2, 10));
                for (NotFoundClasses.C7415b bVar2 : arrayList2) {
                    nf0 g = DescriptorUtilsKt.m62446g(bVar2);
                    if (g == null || (b = g.mo62673b()) == null || (str = b.mo66195b()) == null) {
                        str = bVar2.getName().mo65594d();
                    }
                    arrayList3.add(str);
                }
                i.mo51979b(deserializedClassDescriptor2, arrayList3);
            }
            return CollectionsKt___CollectionsKt.m47311K0(u0);
        }

        /* renamed from: q */
        public nd6 mo52634q() {
            return nd6.C7936a.f41155a;
        }

        public String toString() {
            String r24 = DeserializedClassDescriptor.this.getName().toString();
            vx2.m53590f(r24, "name.toString()");
            return r24;
        }

        /* renamed from: x */
        public DeserializedClassDescriptor mo53524w() {
            return DeserializedClassDescriptor.this;
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    public final class EnumEntryClassDescriptors {

        /* renamed from: a */
        public final Map<r24, ProtoBuf$EnumEntry> f40185a;

        /* renamed from: b */
        public final ws3<r24, if0> f40186b;

        /* renamed from: c */
        public final q84<Set<r24>> f40187c;

        public EnumEntryClassDescriptors() {
            List<ProtoBuf$EnumEntry> enumEntryList = DeserializedClassDescriptor.this.mo55173V0().getEnumEntryList();
            vx2.m53590f(enumEntryList, "classProto.enumEntryList");
            LinkedHashMap linkedHashMap = new LinkedHashMap(d75.m43382d(ao3.m31893e(dk0.m43495u(enumEntryList, 10)), 16));
            for (T next : enumEntryList) {
                linkedHashMap.put(v24.m73044b(DeserializedClassDescriptor.this.mo55172U0().mo56230g(), ((ProtoBuf$EnumEntry) next).getName()), next);
            }
            this.f40185a = linkedHashMap;
            this.f40186b = DeserializedClassDescriptor.this.mo55172U0().mo56231h().mo51159d(new C7681xaf8327b7(this, DeserializedClassDescriptor.this));
            this.f40187c = DeserializedClassDescriptor.this.mo55172U0().mo56231h().mo51164i(new C7683xaaca1f71(this));
        }

        /* renamed from: d */
        public final Collection<if0> mo55193d() {
            Set<r24> keySet = this.f40185a.keySet();
            ArrayList arrayList = new ArrayList();
            for (r24 f : keySet) {
                if0 f2 = mo55195f(f);
                if (f2 != null) {
                    arrayList.add(f2);
                }
            }
            return arrayList;
        }

        /* renamed from: e */
        public final Set<r24> mo55194e() {
            HashSet hashSet = new HashSet();
            for (xc3 m : DeserializedClassDescriptor.this.mo50046g().mo51811g()) {
                for (d31 d31 : we5.C9516a.m73584a(m.mo51146m(), (yc1) null, (rc2) null, 3, (Object) null)) {
                    if ((d31 instanceof C7428e) || (d31 instanceof fx4)) {
                        hashSet.add(d31.getName());
                    }
                }
            }
            List<ProtoBuf$Function> functionList = DeserializedClassDescriptor.this.mo55173V0().getFunctionList();
            vx2.m53590f(functionList, "classProto.functionList");
            DeserializedClassDescriptor deserializedClassDescriptor = DeserializedClassDescriptor.this;
            for (ProtoBuf$Function name : functionList) {
                hashSet.add(v24.m73044b(deserializedClassDescriptor.mo55172U0().mo56230g(), name.getName()));
            }
            List<ProtoBuf$Property> propertyList = DeserializedClassDescriptor.this.mo55173V0().getPropertyList();
            vx2.m53590f(propertyList, "classProto.propertyList");
            DeserializedClassDescriptor deserializedClassDescriptor2 = DeserializedClassDescriptor.this;
            for (ProtoBuf$Property name2 : propertyList) {
                hashSet.add(v24.m73044b(deserializedClassDescriptor2.mo55172U0().mo56230g(), name2.getName()));
            }
            return oy5.m49611k(hashSet, hashSet);
        }

        /* renamed from: f */
        public final if0 mo55195f(r24 r24) {
            vx2.m53591g(r24, PublicResolver.FUNC_NAME);
            return this.f40186b.invoke(r24);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeserializedClassDescriptor(md1 md1, ProtoBuf$Class protoBuf$Class, t24 t24, o10 o10, a66 a66) {
        super(md1.mo56231h(), v24.m73043a(t24, protoBuf$Class.getFqName()).mo62681j());
        qs3 qs3;
        EnumEntryClassDescriptors enumEntryClassDescriptors;
        DeserializedClassDescriptor deserializedClassDescriptor;
        C6983dm dmVar;
        vx2.m53591g(md1, "outerContext");
        vx2.m53591g(protoBuf$Class, "classProto");
        vx2.m53591g(t24, "nameResolver");
        vx2.m53591g(o10, "metadataVersion");
        vx2.m53591g(a66, "sourceElement");
        this.f40173r = protoBuf$Class;
        this.f40174s = o10;
        this.f40176x = a66;
        this.f40177y = v24.m73043a(t24, protoBuf$Class.getFqName());
        yx4 yx4 = yx4.f46285a;
        this.f40158A = yx4.mo67186b(b42.f36656e.mo50465d(protoBuf$Class.getFlags()));
        this.f40159B = zx4.m75243a(yx4, b42.f36655d.mo50465d(protoBuf$Class.getFlags()));
        ClassKind a = yx4.mo67185a(b42.f36657f.mo50465d(protoBuf$Class.getFlags()));
        this.f40160C = a;
        List<ProtoBuf$TypeParameter> typeParameterList = protoBuf$Class.getTypeParameterList();
        vx2.m53590f(typeParameterList, "classProto.typeParameterList");
        ProtoBuf$TypeTable typeTable = protoBuf$Class.getTypeTable();
        vx2.m53590f(typeTable, "classProto.typeTable");
        w17 w17 = new w17(typeTable);
        a97.C6814a aVar = a97.f36407b;
        ProtoBuf$VersionRequirementTable versionRequirementTable = protoBuf$Class.getVersionRequirementTable();
        vx2.m53590f(versionRequirementTable, "classProto.versionRequirementTable");
        md1 a2 = md1.mo56225a(this, typeParameterList, t24, w17, aVar.mo50122a(versionRequirementTable), o10);
        this.f40161H = a2;
        ClassKind classKind = ClassKind.ENUM_CLASS;
        if (a == classKind) {
            qs3 = new StaticScopeForKotlinEnum(a2.mo56231h(), this);
        } else {
            qs3 = MemberScope.C7667a.f40117b;
        }
        this.f40162I = qs3;
        this.f40163L = new DeserializedClassTypeConstructor();
        this.f40164M = ScopesHolderForClass.f39254e.mo53257a(this, a2.mo56231h(), a2.mo56226c().mo52446m().mo52870d(), new DeserializedClassDescriptor$memberScopeHolder$1(this));
        xx4.C9612a aVar2 = null;
        if (a == classKind) {
            enumEntryClassDescriptors = new EnumEntryClassDescriptors();
        } else {
            enumEntryClassDescriptors = null;
        }
        this.f40165P = enumEntryClassDescriptors;
        d31 e = md1.mo56228e();
        this.f40166Q = e;
        this.f40167U = a2.mo56231h().mo51162g(new DeserializedClassDescriptor$primaryConstructor$1(this));
        this.f40168X = a2.mo56231h().mo51164i(new DeserializedClassDescriptor$constructors$1(this));
        this.f40169Y = a2.mo56231h().mo51162g(new DeserializedClassDescriptor$companionObjectDescriptor$1(this));
        this.f40170Z = a2.mo56231h().mo51164i(new DeserializedClassDescriptor$sealedSubclasses$1(this));
        this.f40171e0 = a2.mo56231h().mo51162g(new DeserializedClassDescriptor$valueClassRepresentation$1(this));
        t24 g = a2.mo56230g();
        w17 j = a2.mo56233j();
        if (e instanceof DeserializedClassDescriptor) {
            deserializedClassDescriptor = (DeserializedClassDescriptor) e;
        } else {
            deserializedClassDescriptor = null;
        }
        this.f40172k0 = new xx4.C9612a(protoBuf$Class, g, j, a66, deserializedClassDescriptor != null ? deserializedClassDescriptor.f40172k0 : aVar2);
        if (!b42.f36654c.mo50465d(protoBuf$Class.getFlags()).booleanValue()) {
            dmVar = C6983dm.f37317b.mo51228b();
        } else {
            dmVar = new k84(a2.mo56231h(), new DeserializedClassDescriptor$annotations$1(this));
        }
        this.f40175v0 = dmVar;
    }

    /* renamed from: C0 */
    public boolean mo52338C0() {
        Boolean g = b42.f36659h.mo50465d(this.f40173r.getFlags());
        vx2.m53590f(g, "IS_DATA.get(classProto.flags)");
        return g.booleanValue();
    }

    /* renamed from: M0 */
    public final if0 mo55164M0() {
        if (!this.f40173r.hasCompanionObjectName()) {
            return null;
        }
        eg0 e = mo55174W0().mo50864e(v24.m73044b(this.f40161H.mo56230g(), this.f40173r.getCompanionObjectName()), NoLookupLocation.FROM_DESERIALIZATION);
        if (e instanceof if0) {
            return (if0) e;
        }
        return null;
    }

    /* renamed from: N0 */
    public final Collection<ef0> mo55165N0() {
        return CollectionsKt___CollectionsKt.m47350u0(CollectionsKt___CollectionsKt.m47350u0(mo55169R0(), ck0.m33066n(mo52355z())), this.f40161H.mo56226c().mo52436c().mo50134e(this));
    }

    /* JADX WARNING: type inference failed for: r1v8, types: [xc3, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: O0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p000.mu2<p000.d36> mo55166O0() {
        /*
            r9 = this;
            boolean r0 = r9.isInline()
            r1 = 0
            if (r0 != 0) goto L_0x000e
            boolean r0 = r9.mo52352q()
            if (r0 != 0) goto L_0x000e
            return r1
        L_0x000e:
            boolean r0 = r9.mo52352q()
            if (r0 == 0) goto L_0x0035
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r0 = r9.f40173r
            boolean r0 = r0.hasInlineClassUnderlyingPropertyName()
            if (r0 != 0) goto L_0x0035
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r0 = r9.f40173r
            boolean r0 = r0.hasInlineClassUnderlyingType()
            if (r0 != 0) goto L_0x0035
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r0 = r9.f40173r
            boolean r0 = r0.hasInlineClassUnderlyingTypeId()
            if (r0 != 0) goto L_0x0035
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r0 = r9.f40173r
            int r0 = r0.getMultiFieldValueClassUnderlyingNameCount()
            if (r0 <= 0) goto L_0x0035
            return r1
        L_0x0035:
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r0 = r9.f40173r
            boolean r0 = r0.hasInlineClassUnderlyingPropertyName()
            r2 = 1
            if (r0 == 0) goto L_0x004f
            md1 r0 = r9.f40161H
            t24 r0 = r0.mo56230g()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r3 = r9.f40173r
            int r3 = r3.getInlineClassUnderlyingPropertyName()
            r24 r0 = p000.v24.m73044b(r0, r3)
            goto L_0x0076
        L_0x004f:
            o10 r0 = r9.f40174s
            r3 = 5
            boolean r0 = r0.mo62815c(r2, r3, r2)
            if (r0 != 0) goto L_0x0110
            ef0 r0 = r9.mo52355z()
            if (r0 == 0) goto L_0x00f5
            java.util.List r0 = r0.mo51763f()
            java.lang.String r3 = "constructor.valueParameters"
            p000.vx2.m53590f(r0, r3)
            java.lang.Object r0 = kotlin.collections.CollectionsKt___CollectionsKt.m47329Z(r0)
            n87 r0 = (p000.n87) r0
            r24 r0 = r0.getName()
            java.lang.String r3 = "{\n                // Bef…irst().name\n            }"
            p000.vx2.m53590f(r0, r3)
        L_0x0076:
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r3 = r9.f40173r
            md1 r4 = r9.f40161H
            w17 r4 = r4.mo56233j()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r3 = p000.cy4.m56601f(r3, r4)
            r4 = 0
            if (r3 == 0) goto L_0x0092
            md1 r5 = r9.f40161H
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer r5 = r5.mo56232i()
            r6 = 2
            d36 r3 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer.m62558n(r5, r3, r4, r6, r1)
            if (r3 != 0) goto L_0x00d4
        L_0x0092:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope r3 = r9.mo55174W0()
            kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation r5 = kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_DESERIALIZATION
            java.util.Collection r3 = r3.mo50861b(r0, r5)
            java.util.Iterator r3 = r3.iterator()
            r6 = r1
            r5 = r4
        L_0x00a2:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x00c0
            java.lang.Object r7 = r3.next()
            r8 = r7
            fx4 r8 = (p000.fx4) r8
            h85 r8 = r8.mo51315J()
            if (r8 != 0) goto L_0x00b7
            r8 = r2
            goto L_0x00b8
        L_0x00b7:
            r8 = r4
        L_0x00b8:
            if (r8 == 0) goto L_0x00a2
            if (r5 == 0) goto L_0x00bd
            goto L_0x00c4
        L_0x00bd:
            r5 = r2
            r6 = r7
            goto L_0x00a2
        L_0x00c0:
            if (r5 != 0) goto L_0x00c3
            goto L_0x00c4
        L_0x00c3:
            r1 = r6
        L_0x00c4:
            fx4 r1 = (p000.fx4) r1
            if (r1 == 0) goto L_0x00da
            xc3 r1 = r1.getType()
            java.lang.String r2 = "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType"
            p000.vx2.m53589e(r1, r2)
            r3 = r1
            d36 r3 = (p000.d36) r3
        L_0x00d4:
            mu2 r1 = new mu2
            r1.<init>(r0, r3)
            return r1
        L_0x00da:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Value class has no underlying property: "
            r1.append(r2)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00f5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Inline class has no primary constructor: "
            r1.append(r2)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0110:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Inline class has no underlying property name in metadata: "
            r1.append(r2)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.mo55166O0():mu2");
    }

    /* renamed from: P */
    public d87<d36> mo52344P() {
        return (d87) this.f40171e0.invoke();
    }

    /* renamed from: P0 */
    public final oz3<d36> mo55167P0() {
        List<ProtoBuf$Type> list;
        List<Integer> multiFieldValueClassUnderlyingNameList = this.f40173r.getMultiFieldValueClassUnderlyingNameList();
        vx2.m53590f(multiFieldValueClassUnderlyingNameList, "classProto.multiFieldValueClassUnderlyingNameList");
        ArrayList arrayList = new ArrayList(dk0.m43495u(multiFieldValueClassUnderlyingNameList, 10));
        for (Integer next : multiFieldValueClassUnderlyingNameList) {
            t24 g = this.f40161H.mo56230g();
            vx2.m53590f(next, "it");
            arrayList.add(v24.m73044b(g, next.intValue()));
        }
        if (!(!arrayList.isEmpty())) {
            arrayList = null;
        }
        if (arrayList == null) {
            return null;
        }
        if (mo52352q()) {
            Pair a = wy6.m54142a(Integer.valueOf(this.f40173r.getMultiFieldValueClassUnderlyingTypeIdCount()), Integer.valueOf(this.f40173r.getMultiFieldValueClassUnderlyingTypeCount()));
            if (vx2.m53586b(a, wy6.m54142a(Integer.valueOf(arrayList.size()), 0))) {
                List<Integer> multiFieldValueClassUnderlyingTypeIdList = this.f40173r.getMultiFieldValueClassUnderlyingTypeIdList();
                vx2.m53590f(multiFieldValueClassUnderlyingTypeIdList, "classProto.multiFieldVal…ClassUnderlyingTypeIdList");
                list = new ArrayList<>(dk0.m43495u(multiFieldValueClassUnderlyingTypeIdList, 10));
                for (Integer next2 : multiFieldValueClassUnderlyingTypeIdList) {
                    w17 j = this.f40161H.mo56233j();
                    vx2.m53590f(next2, "it");
                    list.add(j.mo66609a(next2.intValue()));
                }
            } else if (vx2.m53586b(a, wy6.m54142a(0, Integer.valueOf(arrayList.size())))) {
                list = this.f40173r.getMultiFieldValueClassUnderlyingTypeList();
            } else {
                throw new IllegalStateException(("Illegal multi-field value class representation: " + this).toString());
            }
            vx2.m53590f(list, "when (typeIdCount to typ…tation: $this\")\n        }");
            ArrayList arrayList2 = new ArrayList(dk0.m43495u(list, 10));
            for (ProtoBuf$Type protoBuf$Type : list) {
                TypeDeserializer i = this.f40161H.mo56232i();
                vx2.m53590f(protoBuf$Type, "it");
                arrayList2.add(TypeDeserializer.m62558n(i, protoBuf$Type, false, 2, (Object) null));
            }
            return new oz3<>(CollectionsKt___CollectionsKt.m47321R0(arrayList, arrayList2));
        }
        throw new IllegalArgumentException(("Not a value class: " + this).toString());
    }

    /* renamed from: Q0 */
    public final ef0 mo55168Q0() {
        T t;
        if (this.f40160C.isSingleton()) {
            ff0 k = wc1.m73551k(this, a66.f36360a);
            k.mo53336a1(mo51464n());
            return k;
        }
        List<ProtoBuf$Constructor> constructorList = this.f40173r.getConstructorList();
        vx2.m53590f(constructorList, "classProto.constructorList");
        Iterator<T> it = constructorList.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (!b42.f36664m.mo50465d(((ProtoBuf$Constructor) t).getFlags()).booleanValue()) {
                break;
            }
        }
        ProtoBuf$Constructor protoBuf$Constructor = (ProtoBuf$Constructor) t;
        if (protoBuf$Constructor != null) {
            return this.f40161H.mo56229f().mo55135i(protoBuf$Constructor, true);
        }
        return null;
    }

    /* renamed from: R0 */
    public final List<ef0> mo55169R0() {
        List<ProtoBuf$Constructor> constructorList = this.f40173r.getConstructorList();
        vx2.m53590f(constructorList, "classProto.constructorList");
        ArrayList<ProtoBuf$Constructor> arrayList = new ArrayList<>();
        for (T next : constructorList) {
            Boolean g = b42.f36664m.mo50465d(((ProtoBuf$Constructor) next).getFlags());
            vx2.m53590f(g, "IS_SECONDARY.get(it.flags)");
            if (g.booleanValue()) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(dk0.m43495u(arrayList, 10));
        for (ProtoBuf$Constructor protoBuf$Constructor : arrayList) {
            MemberDeserializer f = this.f40161H.mo56229f();
            vx2.m53590f(protoBuf$Constructor, "it");
            arrayList2.add(f.mo55135i(protoBuf$Constructor, false));
        }
        return arrayList2;
    }

    /* renamed from: S0 */
    public final Collection<if0> mo55170S0() {
        if (this.f40158A != Modality.SEALED) {
            return ck0.m33062j();
        }
        List<Integer> sealedSubclassFqNameList = this.f40173r.getSealedSubclassFqNameList();
        vx2.m53590f(sealedSubclassFqNameList, "fqNames");
        if (!(!sealedSubclassFqNameList.isEmpty())) {
            return kg0.f38896a.mo52902a(this, false);
        }
        ArrayList arrayList = new ArrayList();
        for (Integer num : sealedSubclassFqNameList) {
            id1 c = this.f40161H.mo56226c();
            t24 g = this.f40161H.mo56230g();
            vx2.m53590f(num, "index");
            if0 b = c.mo52435b(v24.m73043a(g, num.intValue()));
            if (b != null) {
                arrayList.add(b);
            }
        }
        return arrayList;
    }

    /* renamed from: T */
    public boolean mo51317T() {
        return false;
    }

    /* renamed from: T0 */
    public final d87<d36> mo55171T0() {
        mu2<d36> O0 = mo55166O0();
        oz3<d36> P0 = mo55167P0();
        if (O0 != null && P0 != null) {
            throw new IllegalArgumentException("Class cannot have both inline class representation and multi field class representation: " + this);
        } else if ((mo52352q() || isInline()) && O0 == null && P0 == null) {
            throw new IllegalArgumentException("Value class has no value class representation: " + this);
        } else if (O0 != null) {
            return O0;
        } else {
            return P0;
        }
    }

    /* renamed from: U */
    public List<h85> mo52463U() {
        List<ProtoBuf$Type> contextReceiverTypeList = this.f40173r.getContextReceiverTypeList();
        vx2.m53590f(contextReceiverTypeList, "classProto.contextReceiverTypeList");
        ArrayList arrayList = new ArrayList(dk0.m43495u(contextReceiverTypeList, 10));
        for (ProtoBuf$Type protoBuf$Type : contextReceiverTypeList) {
            TypeDeserializer i = this.f40161H.mo56232i();
            vx2.m53590f(protoBuf$Type, "it");
            arrayList.add(new i85(mo52460D0(), new yr0(this, i.mo55153q(protoBuf$Type), (j85) null), C6983dm.f37317b.mo51228b()));
        }
        return arrayList;
    }

    /* renamed from: U0 */
    public final md1 mo55172U0() {
        return this.f40161H;
    }

    /* renamed from: V */
    public boolean mo52345V() {
        if (b42.f36657f.mo50465d(this.f40173r.getFlags()) == ProtoBuf$Class.Kind.COMPANION_OBJECT) {
            return true;
        }
        return false;
    }

    /* renamed from: V0 */
    public final ProtoBuf$Class mo55173V0() {
        return this.f40173r;
    }

    /* renamed from: W0 */
    public final DeserializedClassMemberScope mo55174W0() {
        return this.f40164M.mo53255c(this.f40161H.mo56226c().mo52446m().mo52870d());
    }

    /* renamed from: X0 */
    public final o10 mo55175X0() {
        return this.f40174s;
    }

    /* renamed from: Y */
    public boolean mo52346Y() {
        Boolean g = b42.f36663l.mo50465d(this.f40173r.getFlags());
        vx2.m53590f(g, "IS_FUN_INTERFACE.get(classProto.flags)");
        return g.booleanValue();
    }

    /* renamed from: Y0 */
    public qs3 mo52347g0() {
        return this.f40162I;
    }

    /* renamed from: Z0 */
    public final xx4.C9612a mo55177Z0() {
        return this.f40172k0;
    }

    /* renamed from: a1 */
    public final boolean mo55178a1(r24 r24) {
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        return mo55174W0().mo55202q().contains(r24);
    }

    /* renamed from: b */
    public d31 mo51119b() {
        return this.f40166Q;
    }

    /* renamed from: b0 */
    public MemberScope mo51546b0(bd3 bd3) {
        vx2.m53591g(bd3, "kotlinTypeRefiner");
        return this.f40164M.mo53255c(bd3);
    }

    /* renamed from: d0 */
    public boolean mo51319d0() {
        Boolean g = b42.f36661j.mo50465d(this.f40173r.getFlags());
        vx2.m53590f(g, "IS_EXPECT_CLASS.get(classProto.flags)");
        return g.booleanValue();
    }

    /* renamed from: g */
    public yz6 mo50046g() {
        return this.f40163L;
    }

    public C6983dm getAnnotations() {
        return this.f40175v0;
    }

    public ClassKind getKind() {
        return this.f40160C;
    }

    public a66 getSource() {
        return this.f40176x;
    }

    public fd1 getVisibility() {
        return this.f40159B;
    }

    /* renamed from: h */
    public Collection<ef0> mo52349h() {
        return (Collection) this.f40168X.invoke();
    }

    /* renamed from: h0 */
    public if0 mo52350h0() {
        return (if0) this.f40169Y.invoke();
    }

    /* renamed from: i */
    public boolean mo51669i() {
        Boolean g = b42.f36658g.mo50465d(this.f40173r.getFlags());
        vx2.m53590f(g, "IS_INNER.get(classProto.flags)");
        return g.booleanValue();
    }

    public boolean isExternal() {
        Boolean g = b42.f36660i.mo50465d(this.f40173r.getFlags());
        vx2.m53590f(g, "IS_EXTERNAL_CLASS.get(classProto.flags)");
        return g.booleanValue();
    }

    public boolean isInline() {
        Boolean g = b42.f36662k.mo50465d(this.f40173r.getFlags());
        vx2.m53590f(g, "IS_VALUE_CLASS.get(classProto.flags)");
        if (!g.booleanValue() || !this.f40174s.mo62817e(1, 4, 1)) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    public List<a17> mo51670o() {
        return this.f40161H.mo56232i().mo55148j();
    }

    /* renamed from: p */
    public Modality mo51326p() {
        return this.f40158A;
    }

    /* renamed from: q */
    public boolean mo52352q() {
        Boolean g = b42.f36662k.mo50465d(this.f40173r.getFlags());
        vx2.m53590f(g, "IS_VALUE_CLASS.get(classProto.flags)");
        if (!g.booleanValue() || !this.f40174s.mo62815c(1, 4, 2)) {
            return false;
        }
        return true;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("deserialized ");
        if (mo51319d0()) {
            str = "expect ";
        } else {
            str = "";
        }
        sb.append(str);
        sb.append("class ");
        sb.append(getName());
        return sb.toString();
    }

    /* renamed from: w */
    public Collection<if0> mo52354w() {
        return (Collection) this.f40170Z.invoke();
    }

    /* renamed from: z */
    public ef0 mo52355z() {
        return (ef0) this.f40167U.invoke();
    }
}
