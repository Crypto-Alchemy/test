package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import org.web3j.ens.contracts.generated.ENS;
import p000.cd0;

/* renamed from: ok4 */
/* compiled from: PackagePartScopeCache.kt */
public final class ok4 {

    /* renamed from: a */
    public final DeserializedDescriptorResolver f43723a;

    /* renamed from: b */
    public final qa5 f43724b;

    /* renamed from: c */
    public final ConcurrentHashMap<nf0, MemberScope> f43725c = new ConcurrentHashMap<>();

    public ok4(DeserializedDescriptorResolver deserializedDescriptorResolver, qa5 qa5) {
        vx2.m53591g(deserializedDescriptorResolver, ENS.FUNC_RESOLVER);
        vx2.m53591g(qa5, "kotlinClassFinder");
        this.f43723a = deserializedDescriptorResolver;
        this.f43724b = qa5;
    }

    /* renamed from: a */
    public final MemberScope mo62938a(pa5 pa5) {
        List<tc3> list;
        vx2.m53591g(pa5, "fileClass");
        ConcurrentHashMap<nf0, MemberScope> concurrentHashMap = this.f43725c;
        nf0 i = pa5.mo65268i();
        MemberScope memberScope = concurrentHashMap.get(i);
        if (memberScope == null) {
            u82 h = pa5.mo65268i().mo62678h();
            vx2.m53590f(h, "fileClass.classId.packageFqName");
            if (pa5.mo65261a().mo53822c() == KotlinClassHeader.Kind.MULTIFILE_CLASS) {
                List<String> f = pa5.mo65261a().mo53825f();
                list = new ArrayList<>();
                for (String d : f) {
                    nf0 m = nf0.m69751m(y73.m74293d(d).mo67041e());
                    vx2.m53590f(m, "topLevel(JvmClassName.by…velClassMaybeWithDollars)");
                    tc3 a = oc3.m70233a(this.f43724b, m);
                    if (a != null) {
                        list.add(a);
                    }
                }
            } else {
                list = bk0.m32598e(pa5);
            }
            vo1 vo1 = new vo1(this.f43723a.mo53798d().mo52449p(), h);
            ArrayList arrayList = new ArrayList();
            for (tc3 b : list) {
                MemberScope b2 = this.f43723a.mo53796b(vo1, b);
                if (b2 != null) {
                    arrayList.add(b2);
                }
            }
            List K0 = CollectionsKt___CollectionsKt.m47311K0(arrayList);
            cd0.C6935a aVar = cd0.f37102d;
            MemberScope a2 = aVar.mo50868a("package " + h + " (" + pa5 + ')', K0);
            MemberScope putIfAbsent = concurrentHashMap.putIfAbsent(i, a2);
            if (putIfAbsent == null) {
                memberScope = a2;
            } else {
                memberScope = putIfAbsent;
            }
        }
        vx2.m53590f(memberScope, "cache.getOrPut(fileClass…ileClass)\", scopes)\n    }");
        return memberScope;
    }
}
