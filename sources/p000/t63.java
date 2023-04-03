package p000;

import com.squareup.moshi.C5401h;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B1\u0012\u0010\u0010\u0012\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\u000e\u0012\u0016\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\u0013¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u0010\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007J\u001e\u0010\f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u00022\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0002J\u001c\u0010\r\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0002R!\u0010\u0012\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\u000e8\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R'\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001b\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u001a¨\u0006\u001e"}, mo44877d2 = {"Lt63;", "", "", "method", "json", "Lrg0;", "a", "Lpw5;", "payload", "c", "Lq83;", "type", "d", "e", "", "Ljava/util/Set;", "getSerializerEntries", "()Ljava/util/Set;", "serializerEntries", "", "b", "Ljava/util/Map;", "getDeserializerEntries", "()Ljava/util/Map;", "deserializerEntries", "Lcom/squareup/moshi/h;", "()Lcom/squareup/moshi/h;", "moshi", "<init>", "(Ljava/util/Set;Ljava/util/Map;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: t63 */
/* compiled from: JsonRpcSerializer.kt */
public final class t63 {

    /* renamed from: a */
    public final Set<q83<?>> f34118a;

    /* renamed from: b */
    public final Map<String, q83<?>> f34119b;

    public t63(Set<? extends q83<?>> set, Map<String, ? extends q83<?>> map) {
        vx2.m53591g(set, "serializerEntries");
        vx2.m53591g(map, "deserializerEntries");
        this.f34118a = set;
        this.f34119b = map;
    }

    /* renamed from: a */
    public final rg0 mo47994a(String str, String str2) {
        Object d;
        vx2.m53591g(str, "method");
        vx2.m53591g(str2, "json");
        q83 q83 = this.f34119b.get(str);
        if (q83 != null && (d = mo47997d(str2, q83)) != null && vx2.m53586b(ua5.m52727b(d.getClass()), q83) && (d instanceof o63)) {
            return ((o63) d).getParams();
        }
        return null;
    }

    /* renamed from: b */
    public final C5401h mo47995b() {
        C5401h c = ((C5401h.C5402a) CollectionsKt___CollectionsKt.m47329Z(hc3.m45112a().mo51892b().mo51636g().mo56284d().mo64989g(ua5.m52727b(C5401h.C5402a.class)))).mo39416c();
        vx2.m53590f(c, "wcKoinApp.koin.getAll<Mo…uilder>().first().build()");
        return c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo47996c(p000.pw5 r7) {
        /*
            r6 = this;
            java.lang.String r0 = "payload"
            p000.vx2.m53591g(r7, r0)
            boolean r0 = r7 instanceof com.walletconnect.android.internal.common.JsonRpcResponse.C5515b
            java.lang.String r1 = "moshi.adapter(T::class.java).toJson(type)"
            r2 = 0
            if (r0 == 0) goto L_0x001e
            com.squareup.moshi.h r0 = r6.mo47995b()
            java.lang.Class<com.walletconnect.android.internal.common.JsonRpcResponse$b> r2 = com.walletconnect.android.internal.common.JsonRpcResponse.C5515b.class
            com.squareup.moshi.d r0 = r0.mo39408c(r2)
            java.lang.String r2 = r0.mo39367h(r7)
            p000.vx2.m53590f(r2, r1)
            goto L_0x0071
        L_0x001e:
            boolean r0 = r7 instanceof com.walletconnect.android.internal.common.JsonRpcResponse.JsonRpcError
            if (r0 == 0) goto L_0x0034
            com.squareup.moshi.h r0 = r6.mo47995b()
            java.lang.Class<com.walletconnect.android.internal.common.JsonRpcResponse$JsonRpcError> r2 = com.walletconnect.android.internal.common.JsonRpcResponse.JsonRpcError.class
            com.squareup.moshi.d r0 = r0.mo39408c(r2)
            java.lang.String r2 = r0.mo39367h(r7)
            p000.vx2.m53590f(r2, r1)
            goto L_0x0071
        L_0x0034:
            java.util.Set<q83<?>> r0 = r6.f34118a
            boolean r1 = r0 instanceof java.util.Collection
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0044
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x0044
            r1 = r2
            goto L_0x0061
        L_0x0044:
            java.util.Iterator r0 = r0.iterator()
            r1 = r2
        L_0x0049:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0061
            java.lang.Object r1 = r0.next()
            q83 r1 = (p000.q83) r1
            java.lang.Object r5 = p000.v83.m53299a(r1, r7)
            if (r5 == 0) goto L_0x005d
            r5 = r3
            goto L_0x005e
        L_0x005d:
            r5 = r4
        L_0x005e:
            if (r5 == 0) goto L_0x0049
            goto L_0x0062
        L_0x0061:
            r3 = r4
        L_0x0062:
            if (r3 == 0) goto L_0x0071
            if (r1 != 0) goto L_0x006c
            java.lang.String r0 = "payloadType"
            p000.vx2.m53605u(r0)
            goto L_0x006d
        L_0x006c:
            r2 = r1
        L_0x006d:
            java.lang.String r2 = r6.mo47998e(r7, r2)
        L_0x0071:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.t63.mo47996c(pw5):java.lang.String");
    }

    /* renamed from: d */
    public final Object mo47997d(String str, q83<?> q83) {
        Object obj;
        try {
            Result.C6167a aVar = Result.Companion;
            obj = Result.m75635constructorimpl(mo47995b().mo39408c(x73.m54253b(q83)).mo39362c(str));
        } catch (Throwable th) {
            Result.C6167a aVar2 = Result.Companion;
            obj = Result.m75635constructorimpl(hg5.m45198a(th));
        }
        if (Result.m75640isFailureimpl(obj)) {
            return null;
        }
        return obj;
    }

    /* renamed from: e */
    public final String mo47998e(Object obj, q83<?> q83) {
        String h = mo47995b().mo39409d(x73.m54253b(q83)).mo39367h(obj);
        vx2.m53590f(h, "moshi.adapter<Any>(type.java).toJson(payload)");
        return h;
    }
}
