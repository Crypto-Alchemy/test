package p000;

import com.walletconnect.android.internal.common.JsonRpcResponse;
import com.walletconnect.android.internal.common.model.AppMetaData;
import com.walletconnect.sign.engine.model.EngineDO;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.a16;
import p000.cn4;
import p000.tt0;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0000\u001a\f\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0000\u001a\f\u0010\u000b\u001a\u00020\n*\u00020\tH\u0000\u001a\f\u0010\u000e\u001a\u00020\r*\u00020\fH\u0000\u001a\f\u0010\u0011\u001a\u00020\u0010*\u00020\u000fH\u0000\u001a\f\u0010\u0014\u001a\u00020\u0013*\u00020\u0012H\u0000\u001a\f\u0010\u0017\u001a\u00020\u0016*\u00020\u0015H\u0000\u001a\f\u0010\u001a\u001a\u00020\u0019*\u00020\u0018H\u0000\u001a$\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001e0\u001b*\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001bH\u0000\u001a$\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020!0\u001b*\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020 0\u001bH\u0000\u001a$\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001b*\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001e0\u001bH\u0000\u001a\f\u0010&\u001a\u00020%*\u00020$H\u0000\u001a\f\u0010)\u001a\u00020(*\u00020'H\u0000¨\u0006*"}, mo44877d2 = {"La16$d;", "Lcom/walletconnect/android/internal/common/JsonRpcResponse;", "i", "Lcom/walletconnect/sign/engine/model/EngineDO$o;", "La16$j;", "g", "Lcom/walletconnect/sign/engine/model/EngineDO$n;", "La16$i;", "h", "Lcom/walletconnect/sign/engine/model/EngineDO$j;", "La16$g;", "e", "Lcom/walletconnect/sign/engine/model/EngineDO$l;", "La16$h;", "f", "La16$d$b;", "Lcom/walletconnect/android/internal/common/JsonRpcResponse$b;", "n", "La16$d$a;", "Lcom/walletconnect/android/internal/common/JsonRpcResponse$JsonRpcError;", "m", "Lcom/walletconnect/sign/engine/model/EngineDO$f;", "La16$b;", "c", "Lcom/walletconnect/sign/engine/model/EngineDO$d;", "La16$f;", "a", "", "", "Lcom/walletconnect/sign/engine/model/EngineDO$b$b;", "La16$e$b;", "k", "Lcom/walletconnect/sign/engine/model/EngineDO$b$a;", "La16$e$a;", "j", "l", "Lpp0;", "La16$a;", "b", "Lvi5;", "La16$c;", "d", "sdk_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: og0 */
/* compiled from: ClientMapper.kt */
public final /* synthetic */ class og0 {
    /* renamed from: a */
    public static final /* synthetic */ a16.C3789f m49292a(EngineDO.C5661d dVar) {
        tt0.C6536a aVar;
        vx2.m53591g(dVar, "<this>");
        String a = dVar.mo41311d().mo42395a();
        long a2 = dVar.mo41308a().mo46241a();
        Map k = m49302k(dVar.mo41309b());
        AppMetaData c = dVar.mo41310c();
        if (c != null) {
            aVar = ml4.m48364b(c);
        } else {
            aVar = null;
        }
        return new a16.C3789f(a, a2, k, aVar);
    }

    /* renamed from: f */
    public static final /* synthetic */ a16.C3791h m49297f(EngineDO.C5669l lVar) {
        tt0.C6536a aVar;
        vx2.m53591g(lVar, "<this>");
        String d = lVar.mo41352d();
        String a = lVar.mo41349a();
        AppMetaData b = lVar.mo41350b();
        if (b != null) {
            aVar = ml4.m48364b(b);
        } else {
            aVar = null;
        }
        return new a16.C3791h(d, a, aVar, new a16.C3791h.C3792a(lVar.mo41351c().mo41356a(), lVar.mo41351c().mo41357b(), lVar.mo41351c().mo41358c()));
    }

    /* renamed from: g */
    public static final /* synthetic */ a16.C3796j m49298g(EngineDO.C5675o oVar) {
        vx2.m53591g(oVar, "<this>");
        if (oVar instanceof EngineDO.C5675o.C5677b) {
            return new a16.C3796j.C3798b(m49292a(((EngineDO.C5675o.C5677b) oVar).mo41378a()));
        }
        if (oVar instanceof EngineDO.C5675o.C5676a) {
            return new a16.C3796j.C3797a(((EngineDO.C5675o.C5676a) oVar).mo41374a());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: h */
    public static final /* synthetic */ a16.C3793i m49299h(EngineDO.C5672n nVar) {
        vx2.m53591g(nVar, "<this>");
        if (nVar instanceof EngineDO.C5672n.C5674b) {
            EngineDO.C5672n.C5674b bVar = (EngineDO.C5672n.C5674b) nVar;
            return new a16.C3793i.C3795b(bVar.mo41370b().mo42395a(), m49302k(bVar.mo41369a()));
        } else if (nVar instanceof EngineDO.C5672n.C5673a) {
            return new a16.C3793i.C3794a(((EngineDO.C5672n.C5673a) nVar).mo41365a());
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: i */
    public static final /* synthetic */ JsonRpcResponse m49300i(a16.C3781d dVar) {
        vx2.m53591g(dVar, "<this>");
        if (dVar instanceof a16.C3781d.C3783b) {
            return vx2.m53591g((a16.C3781d.C3783b) dVar, "<this>");
        }
        if (dVar instanceof a16.C3781d.C3782a) {
            return m49304m((a16.C3781d.C3782a) dVar);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: j */
    public static final /* synthetic */ Map m49301j(Map map) {
        ArrayList arrayList;
        vx2.m53591g(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap(ao3.m31893e(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            EngineDO.C5655b.C5656a aVar = (EngineDO.C5655b.C5656a) entry.getValue();
            List<String> a = aVar.mo41275a();
            List<String> d = aVar.mo41278d();
            List<String> b = aVar.mo41276b();
            List<EngineDO.C5655b.C5656a.C5657a> c = aVar.mo41277c();
            if (c != null) {
                arrayList = new ArrayList(dk0.m43495u(c, 10));
                for (EngineDO.C5655b.C5656a.C5657a aVar2 : c) {
                    arrayList.add(new a16.C3784e.C3785a.C3786a(aVar2.mo41282a(), aVar2.mo41284c(), aVar2.mo41283b()));
                }
            } else {
                arrayList = null;
            }
            linkedHashMap.put(key, new a16.C3784e.C3785a(a, d, b, arrayList));
        }
        return linkedHashMap;
    }

    /* renamed from: k */
    public static final /* synthetic */ Map m49302k(Map map) {
        ArrayList arrayList;
        vx2.m53591g(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap(ao3.m31893e(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            EngineDO.C5655b.C5658b bVar = (EngineDO.C5655b.C5658b) entry.getValue();
            List<String> a = bVar.mo41288a();
            List<String> d = bVar.mo41291d();
            List<String> b = bVar.mo41289b();
            List<EngineDO.C5655b.C5658b.C5659a> c = bVar.mo41290c();
            if (c != null) {
                arrayList = new ArrayList(dk0.m43495u(c, 10));
                for (EngineDO.C5655b.C5658b.C5659a aVar : c) {
                    arrayList.add(new a16.C3784e.C3787b.C3788a(aVar.mo41295a(), aVar.mo41297c(), aVar.mo41296b()));
                }
            } else {
                arrayList = null;
            }
            linkedHashMap.put(key, new a16.C3784e.C3787b(a, d, b, arrayList));
        }
        return linkedHashMap;
    }

    /* renamed from: l */
    public static final /* synthetic */ Map m49303l(Map map) {
        ArrayList arrayList;
        vx2.m53591g(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap(ao3.m31893e(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            a16.C3784e.C3787b bVar = (a16.C3784e.C3787b) entry.getValue();
            List<String> a = bVar.mo28730a();
            List<String> d = bVar.mo28733d();
            List<String> b = bVar.mo28731b();
            List<a16.C3784e.C3787b.C3788a> c = bVar.mo28732c();
            if (c != null) {
                arrayList = new ArrayList(dk0.m43495u(c, 10));
                for (a16.C3784e.C3787b.C3788a aVar : c) {
                    arrayList.add(new EngineDO.C5655b.C5658b.C5659a(aVar.mo28737a(), aVar.mo28739c(), aVar.mo28738b()));
                }
            } else {
                arrayList = null;
            }
            linkedHashMap.put(key, new EngineDO.C5655b.C5658b(a, d, b, arrayList));
        }
        return linkedHashMap;
    }

    /* renamed from: m */
    public static final /* synthetic */ JsonRpcResponse.JsonRpcError m49304m(a16.C3781d.C3782a aVar) {
        vx2.m53591g(aVar, "<this>");
        cn4.C3947a.C3950c cVar = new cn4.C3947a.C3950c(aVar.mo28708b());
        return new JsonRpcResponse.JsonRpcError(aVar.mo28707a(), (String) null, new JsonRpcResponse.C5514a(cVar.getCode(), cVar.getMessage()), 2, (DefaultConstructorMarker) null);
    }
}
