package p000;

import com.squareup.moshi.C5391d;
import com.squareup.moshi.C5401h;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.walletconnect.android.internal.common.JsonRpcResponse;
import com.walletconnect.android.internal.common.model.params.CoreAuthParams;
import com.walletconnect.android.internal.common.model.params.CoreChatParams;
import com.walletconnect.android.internal.common.model.params.CoreSignParams;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.Result;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b-\u0010.J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020 0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020#0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020&0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019R\u001e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010)8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006/"}, mo44877d2 = {"Ls63;", "Lcom/squareup/moshi/d;", "Lcom/walletconnect/android/internal/common/JsonRpcResponse$b;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "k", "Lq73;", "writer", "value_", "Lr37;", "l", "Lcom/squareup/moshi/h;", "a", "Lcom/squareup/moshi/h;", "getMoshi", "()Lcom/squareup/moshi/h;", "moshi", "Lcom/squareup/moshi/JsonReader$b;", "b", "Lcom/squareup/moshi/JsonReader$b;", "options", "", "c", "Lcom/squareup/moshi/d;", "longAdapter", "d", "stringAdapter", "", "e", "anyAdapter", "Lcom/walletconnect/android/internal/common/model/params/CoreSignParams$ApprovalParams;", "f", "approvalParamsAdapter", "Lcom/walletconnect/android/internal/common/model/params/CoreAuthParams$ResponseParams;", "g", "cacaoAdapter", "Lcom/walletconnect/android/internal/common/model/params/CoreChatParams$AcceptanceParams;", "h", "acceptanceParamsAdapter", "Ljava/lang/reflect/Constructor;", "i", "Ljava/lang/reflect/Constructor;", "constructorRef", "<init>", "(Lcom/squareup/moshi/h;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: s63 */
/* compiled from: JsonRpcResultAdapter.kt */
public final class s63 extends C5391d<JsonRpcResponse.C5515b> {

    /* renamed from: a */
    public final C5401h f33744a;

    /* renamed from: b */
    public final JsonReader.C5372b f33745b;

    /* renamed from: c */
    public final C5391d<Long> f33746c;

    /* renamed from: d */
    public final C5391d<String> f33747d;

    /* renamed from: e */
    public final C5391d<Object> f33748e;

    /* renamed from: f */
    public final C5391d<CoreSignParams.ApprovalParams> f33749f;

    /* renamed from: g */
    public final C5391d<CoreAuthParams.ResponseParams> f33750g;

    /* renamed from: h */
    public final C5391d<CoreChatParams.AcceptanceParams> f33751h;

    /* renamed from: i */
    public volatile Constructor<JsonRpcResponse.C5515b> f33752i;

    public s63(C5401h hVar) {
        vx2.m53591g(hVar, "moshi");
        this.f33744a = hVar;
        JsonReader.C5372b a = JsonReader.C5372b.m41530a("id", "jsonrpc", "result");
        vx2.m53590f(a, "of(\"id\", \"jsonrpc\", \"result\")");
        this.f33745b = a;
        C5391d<Long> f = hVar.mo39411f(Long.TYPE, ny5.m49095e(), "id");
        vx2.m53590f(f, "moshi.adapter(Long::class.java, emptySet(), \"id\")");
        this.f33746c = f;
        C5391d<String> f2 = hVar.mo39411f(String.class, ny5.m49095e(), "jsonrpc");
        vx2.m53590f(f2, "moshi.adapter(String::cl…a, emptySet(), \"jsonrpc\")");
        this.f33747d = f2;
        C5391d<Object> f3 = hVar.mo39411f(Object.class, ny5.m49095e(), "result");
        vx2.m53590f(f3, "moshi.adapter(Any::class…va, emptySet(), \"result\")");
        this.f33748e = f3;
        C5391d<CoreSignParams.ApprovalParams> f4 = hVar.mo39411f(CoreSignParams.ApprovalParams.class, ny5.m49095e(), "result");
        vx2.m53590f(f4, "moshi.adapter(CoreSignPa…va, emptySet(), \"result\")");
        this.f33749f = f4;
        C5391d<CoreAuthParams.ResponseParams> f5 = hVar.mo39411f(CoreAuthParams.ResponseParams.class, ny5.m49095e(), "result");
        vx2.m53590f(f5, "moshi.adapter(CoreAuthPa…va, emptySet(), \"result\")");
        this.f33750g = f5;
        C5391d<CoreChatParams.AcceptanceParams> f6 = hVar.mo39411f(CoreChatParams.AcceptanceParams.class, ny5.m49095e(), "result");
        vx2.m53590f(f6, "moshi.adapter(CoreChatPa…va, emptySet(), \"result\")");
        this.f33751h = f6;
    }

    /* renamed from: k */
    public JsonRpcResponse.C5515b mo39346b(JsonReader jsonReader) {
        Object obj;
        Object obj2;
        Object obj3;
        JsonReader jsonReader2 = jsonReader;
        vx2.m53591g(jsonReader2, "reader");
        jsonReader.mo39276b();
        int i = -1;
        Object obj4 = null;
        Long l = null;
        String str = null;
        while (jsonReader.mo39280f()) {
            int z = jsonReader2.mo39295z(this.f33745b);
            if (z == -1) {
                jsonReader.mo39272I();
                jsonReader.mo39273J();
            } else if (z == 0) {
                l = this.f33746c.mo39346b(jsonReader2);
                if (l == null) {
                    JsonDataException v = t67.m52121v("id", "id", jsonReader2);
                    vx2.m53590f(v, "unexpectedNull(\"id\", \"id\", reader)");
                    throw v;
                }
            } else if (z == 1) {
                str = this.f33747d.mo39346b(jsonReader2);
                if (str != null) {
                    i &= -3;
                } else {
                    JsonDataException v2 = t67.m52121v("jsonrpc", "jsonrpc", jsonReader2);
                    vx2.m53590f(v2, "unexpectedNull(\"jsonrpc\", \"jsonrpc\", reader)");
                    throw v2;
                }
            } else if (z == 2) {
                try {
                    Result.C6167a aVar = Result.Companion;
                    obj = Result.m75635constructorimpl(this.f33749f.mo39346b(jsonReader.mo39291s()));
                } catch (Throwable th) {
                    Result.C6167a aVar2 = Result.Companion;
                    obj = Result.m75635constructorimpl(hg5.m45198a(th));
                }
                if (Result.m75641isSuccessimpl(obj)) {
                    obj4 = this.f33749f.mo39346b(jsonReader2);
                } else {
                    try {
                        obj2 = Result.m75635constructorimpl(this.f33750g.mo39346b(jsonReader.mo39291s()));
                    } catch (Throwable th2) {
                        Result.C6167a aVar3 = Result.Companion;
                        obj2 = Result.m75635constructorimpl(hg5.m45198a(th2));
                    }
                    if (Result.m75641isSuccessimpl(obj2)) {
                        obj4 = this.f33750g.mo39346b(jsonReader2);
                    } else {
                        try {
                            obj3 = Result.m75635constructorimpl(this.f33751h.mo39346b(jsonReader.mo39291s()));
                        } catch (Throwable th3) {
                            Result.C6167a aVar4 = Result.Companion;
                            obj3 = Result.m75635constructorimpl(hg5.m45198a(th3));
                        }
                        if (Result.m75641isSuccessimpl(obj3)) {
                            obj4 = this.f33751h.mo39346b(jsonReader2);
                        } else {
                            obj4 = this.f33748e.mo39346b(jsonReader2);
                        }
                    }
                }
            }
        }
        jsonReader.mo39278d();
        if (i != -3) {
            Constructor<JsonRpcResponse.C5515b> constructor = this.f33752i;
            if (constructor == null) {
                constructor = JsonRpcResponse.C5515b.class.getDeclaredConstructor(new Class[]{Long.TYPE, String.class, Object.class, Integer.TYPE, t67.f34130c});
                this.f33752i = constructor;
                vx2.m53590f(constructor, "JsonRpcResponse.JsonRpcR…ter.constructorRef = it }");
            }
            Object[] objArr = new Object[5];
            if (l != null) {
                objArr[0] = Long.valueOf(l.longValue());
                objArr[1] = str;
                if (obj4 != null) {
                    objArr[2] = obj4;
                    objArr[3] = Integer.valueOf(i);
                    objArr[4] = null;
                    JsonRpcResponse.C5515b newInstance = constructor.newInstance(objArr);
                    vx2.m53590f(newInstance, "localConstructor.newInst…ker */ null\n            )");
                    return newInstance;
                }
                JsonDataException n = t67.m52113n("result", "result", jsonReader2);
                vx2.m53590f(n, "missingProperty(\"result\", \"result\", reader)");
                throw n;
            }
            JsonDataException n2 = t67.m52113n("id", "id", jsonReader2);
            vx2.m53590f(n2, "missingProperty(\"id\", \"id\", reader)");
            throw n2;
        } else if (l != null) {
            long longValue = l.longValue();
            vx2.m53589e(str, "null cannot be cast to non-null type kotlin.String");
            if (obj4 != null) {
                return new JsonRpcResponse.C5515b(longValue, str, obj4);
            }
            JsonDataException n3 = t67.m52113n("result", "result", jsonReader2);
            vx2.m53590f(n3, "missingProperty(\"result\", \"result\", reader)");
            throw n3;
        } else {
            JsonDataException n4 = t67.m52113n("id", "id", jsonReader2);
            vx2.m53590f(n4, "missingProperty(\"id\", \"id\", reader)");
            throw n4;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005b, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005c, code lost:
        p000.lh0.m47807a(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005f, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008b, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008c, code lost:
        p000.lh0.m47807a(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008f, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b9, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ba, code lost:
        p000.lh0.m47807a(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00bd, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00f7, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00f8, code lost:
        p000.lh0.m47807a(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00fb, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0133, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0134, code lost:
        p000.lh0.m47807a(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0137, code lost:
        throw r7;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo39347j(p000.q73 r6, com.walletconnect.android.internal.common.JsonRpcResponse.C5515b r7) {
        /*
            r5 = this;
            java.lang.String r0 = "writer"
            p000.vx2.m53591g(r6, r0)
            if (r7 == 0) goto L_0x0145
            r6.mo39394c()
            java.lang.String r0 = "id"
            r6.mo39399j(r0)
            com.squareup.moshi.d<java.lang.Long> r0 = r5.f33746c
            long r1 = r7.getId()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.mo39347j(r6, r1)
            java.lang.String r0 = "jsonrpc"
            r6.mo39399j(r0)
            com.squareup.moshi.d<java.lang.String> r0 = r5.f33747d
            java.lang.String r1 = r7.mo40171a()
            r0.mo39347j(r6, r1)
            java.lang.String r0 = "result"
            r6.mo39399j(r0)
            java.lang.Object r0 = r7.mo40172b()
            boolean r1 = r0 instanceof com.walletconnect.android.internal.common.model.params.CoreSignParams.ApprovalParams
            r2 = 0
            if (r1 == 0) goto L_0x003b
            com.walletconnect.android.internal.common.model.params.CoreSignParams$ApprovalParams r0 = (com.walletconnect.android.internal.common.model.params.CoreSignParams.ApprovalParams) r0
            goto L_0x003c
        L_0x003b:
            r0 = r2
        L_0x003c:
            java.lang.String r1 = "approvalParamsString"
            if (r0 == 0) goto L_0x0060
            com.squareup.moshi.d<com.walletconnect.android.internal.common.model.params.CoreSignParams$ApprovalParams> r0 = r5.f33749f
            java.lang.Object r7 = r7.mo40172b()
            java.lang.String r7 = r0.mo39367h(r7)
            v40 r0 = r6.mo39391G()
            p000.vx2.m53590f(r7, r1)     // Catch:{ all -> 0x0059 }
            r0.mo56044Z(r7)     // Catch:{ all -> 0x0059 }
            p000.lh0.m47807a(r0, r2)
            goto L_0x0141
        L_0x0059:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x005b }
        L_0x005b:
            r7 = move-exception
            p000.lh0.m47807a(r0, r6)
            throw r7
        L_0x0060:
            java.lang.Object r0 = r7.mo40172b()
            boolean r3 = r0 instanceof com.walletconnect.android.internal.common.model.params.CoreAuthParams.ResponseParams
            if (r3 == 0) goto L_0x006b
            com.walletconnect.android.internal.common.model.params.CoreAuthParams$ResponseParams r0 = (com.walletconnect.android.internal.common.model.params.CoreAuthParams.ResponseParams) r0
            goto L_0x006c
        L_0x006b:
            r0 = r2
        L_0x006c:
            if (r0 == 0) goto L_0x0090
            com.squareup.moshi.d<com.walletconnect.android.internal.common.model.params.CoreAuthParams$ResponseParams> r0 = r5.f33750g
            java.lang.Object r7 = r7.mo40172b()
            java.lang.String r7 = r0.mo39367h(r7)
            v40 r0 = r6.mo39391G()
            java.lang.String r1 = "responseParamsString"
            p000.vx2.m53590f(r7, r1)     // Catch:{ all -> 0x0089 }
            r0.mo56044Z(r7)     // Catch:{ all -> 0x0089 }
            p000.lh0.m47807a(r0, r2)
            goto L_0x0141
        L_0x0089:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x008b }
        L_0x008b:
            r7 = move-exception
            p000.lh0.m47807a(r0, r6)
            throw r7
        L_0x0090:
            java.lang.Object r0 = r7.mo40172b()
            boolean r3 = r0 instanceof com.walletconnect.android.internal.common.model.params.CoreChatParams.AcceptanceParams
            if (r3 == 0) goto L_0x009b
            com.walletconnect.android.internal.common.model.params.CoreChatParams$AcceptanceParams r0 = (com.walletconnect.android.internal.common.model.params.CoreChatParams.AcceptanceParams) r0
            goto L_0x009c
        L_0x009b:
            r0 = r2
        L_0x009c:
            if (r0 == 0) goto L_0x00be
            com.squareup.moshi.d<com.walletconnect.android.internal.common.model.params.CoreChatParams$AcceptanceParams> r0 = r5.f33751h
            java.lang.Object r7 = r7.mo40172b()
            java.lang.String r7 = r0.mo39367h(r7)
            v40 r0 = r6.mo39391G()
            p000.vx2.m53590f(r7, r1)     // Catch:{ all -> 0x00b7 }
            r0.mo56044Z(r7)     // Catch:{ all -> 0x00b7 }
            p000.lh0.m47807a(r0, r2)
            goto L_0x0141
        L_0x00b7:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x00b9 }
        L_0x00b9:
            r7 = move-exception
            p000.lh0.m47807a(r0, r6)
            throw r7
        L_0x00be:
            java.lang.Object r0 = r7.mo40172b()
            boolean r0 = r0 instanceof java.lang.String
            r1 = 2
            r3 = 0
            if (r0 == 0) goto L_0x00fc
            java.lang.Object r0 = r7.mo40172b()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r4 = "{"
            boolean r0 = p000.yb6.m74336M(r0, r4, r3, r1, r2)
            if (r0 == 0) goto L_0x00fc
            v40 r0 = r6.mo39391G()
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x00f5 }
            java.lang.Object r7 = r7.mo40172b()     // Catch:{ all -> 0x00f5 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x00f5 }
            r1.<init>(r7)     // Catch:{ all -> 0x00f5 }
            java.lang.String r7 = r1.toString()     // Catch:{ all -> 0x00f5 }
            java.lang.String r1 = "JSONObject(value_.result).toString()"
            p000.vx2.m53590f(r7, r1)     // Catch:{ all -> 0x00f5 }
            r0.mo56044Z(r7)     // Catch:{ all -> 0x00f5 }
            p000.lh0.m47807a(r0, r2)
            goto L_0x0141
        L_0x00f5:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x00f7 }
        L_0x00f7:
            r7 = move-exception
            p000.lh0.m47807a(r0, r6)
            throw r7
        L_0x00fc:
            java.lang.Object r0 = r7.mo40172b()
            boolean r0 = r0 instanceof java.lang.String
            if (r0 == 0) goto L_0x0138
            java.lang.Object r0 = r7.mo40172b()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r4 = "["
            boolean r0 = p000.yb6.m74336M(r0, r4, r3, r1, r2)
            if (r0 == 0) goto L_0x0138
            v40 r0 = r6.mo39391G()
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ all -> 0x0131 }
            java.lang.Object r7 = r7.mo40172b()     // Catch:{ all -> 0x0131 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0131 }
            r1.<init>(r7)     // Catch:{ all -> 0x0131 }
            java.lang.String r7 = r1.toString()     // Catch:{ all -> 0x0131 }
            java.lang.String r1 = "JSONArray(value_.result).toString()"
            p000.vx2.m53590f(r7, r1)     // Catch:{ all -> 0x0131 }
            r0.mo56044Z(r7)     // Catch:{ all -> 0x0131 }
            p000.lh0.m47807a(r0, r2)
            goto L_0x0141
        L_0x0131:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0133 }
        L_0x0133:
            r7 = move-exception
            p000.lh0.m47807a(r0, r6)
            throw r7
        L_0x0138:
            com.squareup.moshi.d<java.lang.Object> r0 = r5.f33748e
            java.lang.Object r7 = r7.mo40172b()
            r0.mo39347j(r6, r7)
        L_0x0141:
            r6.mo39398g()
            return
        L_0x0145:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r7 = "value_ was null! Wrap in .nullSafe() to write nullable values."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.s63.mo39347j(q73, com.walletconnect.android.internal.common.JsonRpcResponse$b):void");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(59);
        sb.append("GeneratedJsonAdapter(");
        sb.append("RelayDO.JsonRpcResponse.JsonRpcResult");
        sb.append(')');
        String sb2 = sb.toString();
        vx2.m53590f(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }
}
