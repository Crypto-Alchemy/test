package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.descriptors.C7425c;
import kotlin.reflect.jvm.internal.impl.descriptors.C7428e;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import org.web3j.ens.contracts.generated.PublicResolver;
import p000.we5;

/* compiled from: GivenFunctionsMemberScope.kt */
public abstract class GivenFunctionsMemberScope extends qs3 {

    /* renamed from: d */
    public static final /* synthetic */ i93<Object>[] f40108d = {ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(GivenFunctionsMemberScope.class), "allDescriptors", "getAllDescriptors()Ljava/util/List;"))};

    /* renamed from: b */
    public final if0 f40109b;

    /* renamed from: c */
    public final q84 f40110c;

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope$a */
    /* compiled from: GivenFunctionsMemberScope.kt */
    public static final class C7666a extends n84 {

        /* renamed from: a */
        public final /* synthetic */ ArrayList<d31> f40111a;

        /* renamed from: b */
        public final /* synthetic */ GivenFunctionsMemberScope f40112b;

        public C7666a(ArrayList<d31> arrayList, GivenFunctionsMemberScope givenFunctionsMemberScope) {
            this.f40111a = arrayList;
            this.f40112b = givenFunctionsMemberScope;
        }

        /* renamed from: a */
        public void mo50135a(CallableMemberDescriptor callableMemberDescriptor) {
            vx2.m53591g(callableMemberDescriptor, "fakeOverride");
            OverridingUtil.m62364K(callableMemberDescriptor, (rc2<CallableMemberDescriptor, r37>) null);
            this.f40111a.add(callableMemberDescriptor);
        }

        /* renamed from: e */
        public void mo50137e(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2) {
            vx2.m53591g(callableMemberDescriptor, "fromSuper");
            vx2.m53591g(callableMemberDescriptor2, "fromCurrent");
            throw new IllegalStateException(("Conflict in scope of " + this.f40112b.mo55093l() + ": " + callableMemberDescriptor + " vs " + callableMemberDescriptor2).toString());
        }
    }

    public GivenFunctionsMemberScope(da6 da6, if0 if0) {
        vx2.m53591g(da6, "storageManager");
        vx2.m53591g(if0, "containingClass");
        this.f40109b = if0;
        this.f40110c = da6.mo51164i(new GivenFunctionsMemberScope$allDescriptors$2(this));
    }

    /* renamed from: b */
    public Collection<fx4> mo50861b(r24 r24, ul3 ul3) {
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        vx2.m53591g(ul3, "location");
        List<d31> k = mo55092k();
        v46 v46 = new v46();
        for (T next : k) {
            if ((next instanceof fx4) && vx2.m53586b(((fx4) next).getName(), r24)) {
                v46.add(next);
            }
        }
        return v46;
    }

    /* renamed from: c */
    public Collection<C7428e> mo50862c(r24 r24, ul3 ul3) {
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        vx2.m53591g(ul3, "location");
        List<d31> k = mo55092k();
        v46 v46 = new v46();
        for (T next : k) {
            if ((next instanceof C7428e) && vx2.m53586b(((C7428e) next).getName(), r24)) {
                v46.add(next);
            }
        }
        return v46;
    }

    /* renamed from: f */
    public Collection<d31> mo50865f(yc1 yc1, rc2<? super r24, Boolean> rc2) {
        vx2.m53591g(yc1, "kindFilter");
        vx2.m53591g(rc2, "nameFilter");
        if (!yc1.mo67068a(yc1.f46178p.mo67072m())) {
            return ck0.m33062j();
        }
        return mo55092k();
    }

    /* renamed from: i */
    public abstract List<C7425c> mo51467i();

    /* renamed from: j */
    public final List<d31> mo55091j(List<? extends C7425c> list) {
        Collection collection;
        ArrayList arrayList = new ArrayList(3);
        Collection<xc3> g = this.f40109b.mo50046g().mo51811g();
        vx2.m53590f(g, "containingClass.typeConstructor.supertypes");
        ArrayList arrayList2 = new ArrayList();
        for (xc3 m : g) {
            hk0.m45275z(arrayList2, we5.C9516a.m73584a(m.mo51146m(), (yc1) null, (rc2) null, 3, (Object) null));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object next : arrayList2) {
            if (next instanceof CallableMemberDescriptor) {
                arrayList3.add(next);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next2 : arrayList3) {
            r24 name = ((CallableMemberDescriptor) next2).getName();
            Object obj = linkedHashMap.get(name);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(name, obj);
            }
            ((List) obj).add(next2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            r24 r24 = (r24) entry.getKey();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object next3 : (List) entry.getValue()) {
                Boolean valueOf = Boolean.valueOf(((CallableMemberDescriptor) next3) instanceof C7425c);
                Object obj2 = linkedHashMap2.get(valueOf);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap2.put(valueOf, obj2);
                }
                ((List) obj2).add(next3);
            }
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                boolean booleanValue = ((Boolean) entry2.getKey()).booleanValue();
                List list2 = (List) entry2.getValue();
                OverridingUtil overridingUtil = OverridingUtil.f40070f;
                if (booleanValue) {
                    collection = new ArrayList();
                    for (T next4 : list) {
                        if (vx2.m53586b(((C7425c) next4).getName(), r24)) {
                            collection.add(next4);
                        }
                    }
                } else {
                    collection = ck0.m33062j();
                }
                overridingUtil.mo55055v(r24, list2, collection, this.f40109b, new C7666a(arrayList, this));
            }
        }
        return ak0.m55533c(arrayList);
    }

    /* renamed from: k */
    public final List<d31> mo55092k() {
        return (List) ca6.m56364a(this.f40110c, this, f40108d[0]);
    }

    /* renamed from: l */
    public final if0 mo55093l() {
        return this.f40109b;
    }
}
