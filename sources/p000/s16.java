package p000;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: s16 */
/* compiled from: predefinedEnhancementInfo.kt */
public final class s16 {

    /* renamed from: a */
    public final Map<String, hu4> f44514a = new LinkedHashMap();

    /* renamed from: s16$a */
    /* compiled from: predefinedEnhancementInfo.kt */
    public final class C9297a {

        /* renamed from: a */
        public final String f44515a;

        /* renamed from: b */
        public final /* synthetic */ s16 f44516b;

        /* renamed from: s16$a$a */
        /* compiled from: predefinedEnhancementInfo.kt */
        public final class C9298a {

            /* renamed from: a */
            public final String f44517a;

            /* renamed from: b */
            public final List<Pair<String, o07>> f44518b = new ArrayList();

            /* renamed from: c */
            public Pair<String, o07> f44519c = wy6.m54142a("V", null);

            /* renamed from: d */
            public final /* synthetic */ C9297a f44520d;

            public C9298a(C9297a aVar, String str) {
                vx2.m53591g(str, "functionName");
                this.f44520d = aVar;
                this.f44517a = str;
            }

            /* renamed from: a */
            public final Pair<String, hu4> mo65799a() {
                SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.f39611a;
                String b = this.f44520d.mo65798b();
                String str = this.f44517a;
                List<Pair<String, o07>> list = this.f44518b;
                ArrayList arrayList = new ArrayList(dk0.m43495u(list, 10));
                for (Pair first : list) {
                    arrayList.add((String) first.getFirst());
                }
                String k = signatureBuildingComponents.mo53818k(b, signatureBuildingComponents.mo53817j(str, arrayList, this.f44519c.getFirst()));
                o07 second = this.f44519c.getSecond();
                List<Pair<String, o07>> list2 = this.f44518b;
                ArrayList arrayList2 = new ArrayList(dk0.m43495u(list2, 10));
                for (Pair second2 : list2) {
                    arrayList2.add((o07) second2.getSecond());
                }
                return wy6.m54142a(k, new hu4(second, arrayList2));
            }

            /* renamed from: b */
            public final void mo65800b(String str, j23... j23Arr) {
                boolean z;
                o07 o07;
                vx2.m53591g(str, "type");
                vx2.m53591g(j23Arr, "qualifiers");
                List<Pair<String, o07>> list = this.f44518b;
                if (j23Arr.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    o07 = null;
                } else {
                    Iterable<wt2> E0 = ArraysKt___ArraysKt.m47252E0(j23Arr);
                    LinkedHashMap linkedHashMap = new LinkedHashMap(d75.m43382d(ao3.m31893e(dk0.m43495u(E0, 10)), 16));
                    for (wt2 wt2 : E0) {
                        linkedHashMap.put(Integer.valueOf(wt2.mo49265c()), (j23) wt2.mo49266d());
                    }
                    o07 = new o07(linkedHashMap);
                }
                list.add(wy6.m54142a(str, o07));
            }

            /* renamed from: c */
            public final void mo65801c(String str, j23... j23Arr) {
                vx2.m53591g(str, "type");
                vx2.m53591g(j23Arr, "qualifiers");
                Iterable<wt2> E0 = ArraysKt___ArraysKt.m47252E0(j23Arr);
                LinkedHashMap linkedHashMap = new LinkedHashMap(d75.m43382d(ao3.m31893e(dk0.m43495u(E0, 10)), 16));
                for (wt2 wt2 : E0) {
                    linkedHashMap.put(Integer.valueOf(wt2.mo49265c()), (j23) wt2.mo49266d());
                }
                this.f44519c = wy6.m54142a(str, new o07(linkedHashMap));
            }

            /* renamed from: d */
            public final void mo65802d(JvmPrimitiveType jvmPrimitiveType) {
                vx2.m53591g(jvmPrimitiveType, "type");
                String desc = jvmPrimitiveType.getDesc();
                vx2.m53590f(desc, "type.desc");
                this.f44519c = wy6.m54142a(desc, null);
            }
        }

        public C9297a(s16 s16, String str) {
            vx2.m53591g(str, "className");
            this.f44516b = s16;
            this.f44515a = str;
        }

        /* renamed from: a */
        public final void mo65797a(String str, rc2<? super C9298a, r37> rc2) {
            vx2.m53591g(str, PublicResolver.FUNC_NAME);
            vx2.m53591g(rc2, "block");
            Map a = this.f44516b.f44514a;
            C9298a aVar = new C9298a(this, str);
            rc2.invoke(aVar);
            Pair<String, hu4> a2 = aVar.mo65799a();
            a.put(a2.getFirst(), a2.getSecond());
        }

        /* renamed from: b */
        public final String mo65798b() {
            return this.f44515a;
        }
    }

    /* renamed from: b */
    public final Map<String, hu4> mo65796b() {
        return this.f44514a;
    }
}
