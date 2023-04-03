package p000;

import com.github.mikephil.charting.utils.Utils;
import com.squareup.moshi.C5391d;
import com.squareup.moshi.C5401h;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonEncodingException;
import com.squareup.moshi.JsonReader;
import com.walletconnect.sign.common.model.p016vo.clientsync.session.payload.SessionRequestVO;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016J \u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u000e\u0010\u0010\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000fH\u0002J\u001c\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0014H\u0002R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001c¨\u0006%"}, mo44877d2 = {"Lwx5;", "Lcom/squareup/moshi/d;", "Lcom/walletconnect/sign/common/model/vo/clientsync/session/payload/SessionRequestVO;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "k", "Lq73;", "writer", "value_", "Lr37;", "l", "Lorg/json/JSONObject;", "rootObject", "", "paramsMap", "n", "Lorg/json/JSONArray;", "rootArray", "", "paramsList", "m", "Lcom/squareup/moshi/JsonReader$b;", "a", "Lcom/squareup/moshi/JsonReader$b;", "options", "b", "Lcom/squareup/moshi/d;", "stringAdapter", "", "c", "anyAdapter", "Lcom/squareup/moshi/h;", "moshi", "<init>", "(Lcom/squareup/moshi/h;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: wx5 */
/* compiled from: SessionRequestVOJsonAdapter.kt */
public final class wx5 extends C5391d<SessionRequestVO> {

    /* renamed from: a */
    public final JsonReader.C5372b f35465a;

    /* renamed from: b */
    public final C5391d<String> f35466b;

    /* renamed from: c */
    public final C5391d<Object> f35467c;

    public wx5(C5401h hVar) {
        vx2.m53591g(hVar, "moshi");
        JsonReader.C5372b a = JsonReader.C5372b.m41530a("method", "params");
        vx2.m53590f(a, "of(\"method\", \"params\")");
        this.f35465a = a;
        C5391d<String> f = hVar.mo39411f(String.class, ny5.m49095e(), "method");
        vx2.m53590f(f, "moshi.adapter(String::cl…va, emptySet(), \"method\")");
        this.f35466b = f;
        C5391d<Object> f2 = hVar.mo39411f(Object.class, ny5.m49095e(), "params");
        vx2.m53590f(f2, "moshi.adapter(Any::class…va, emptySet(), \"params\")");
        this.f35467c = f2;
    }

    /* renamed from: k */
    public SessionRequestVO mo39346b(JsonReader jsonReader) {
        Map.Entry entry;
        vx2.m53591g(jsonReader, "reader");
        jsonReader.mo39276b();
        String str = null;
        String str2 = null;
        while (jsonReader.mo39280f()) {
            int z = jsonReader.mo39295z(this.f35465a);
            if (z == -1) {
                jsonReader.mo39272I();
                jsonReader.mo39273J();
            } else if (z == 0) {
                str = this.f35466b.mo39346b(jsonReader);
                if (str == null) {
                    JsonDataException v = t67.m52121v("method", "method", jsonReader);
                    vx2.m53590f(v, "unexpectedNull(\"method\", \"method\", reader)");
                    throw v;
                }
            } else if (z == 1) {
                Object b = this.f35467c.mo39346b(jsonReader);
                if (b == null) {
                    JsonDataException v2 = t67.m52121v("params", "params", jsonReader);
                    vx2.m53590f(v2, "unexpectedNull(\"params\", \"params\", reader)");
                    throw v2;
                } else if (b instanceof List) {
                    str2 = mo49311m(new JSONArray(), (List) b).toString();
                } else {
                    Map map = (Map) b;
                    if (map.size() == 1) {
                        Iterator it = map.entrySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                entry = null;
                                break;
                            }
                            entry = (Map.Entry) it.next();
                            if (entry != null) {
                                break;
                            }
                        }
                        if (entry != null) {
                            Object key = entry.getKey();
                            vx2.m53589e(key, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) key;
                            Object value = entry.getValue();
                            if (value instanceof List) {
                                JSONArray jSONArray = new JSONArray();
                                Object value2 = entry.getValue();
                                vx2.m53589e(value2, "null cannot be cast to non-null type kotlin.collections.List<*>");
                                String jSONArray2 = mo49311m(jSONArray, (List) value2).toString();
                                vx2.m53590f(jSONArray2, "upsertArray(JSONArray(),…ue as List<*>).toString()");
                                str2 = "\"" + str3 + "\":" + jSONArray2;
                            } else if (value instanceof Map) {
                                JSONObject jSONObject = new JSONObject();
                                Object value3 = entry.getValue();
                                vx2.m53589e(value3, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
                                str2 = "\"" + str3 + "\":" + mo49312n(jSONObject, (Map) value3);
                            } else {
                                str2 = mo49312n(new JSONObject(), map).toString();
                                vx2.m53590f(str2, "{\n                      …                        }");
                            }
                        } else {
                            throw new NoSuchElementException("No element of the map was transformed to a non-null value.");
                        }
                    } else {
                        str2 = mo49312n(new JSONObject(), map).toString();
                        vx2.m53590f(str2, "{\n                      …                        }");
                    }
                }
            } else {
                continue;
            }
        }
        jsonReader.mo39278d();
        if (str == null) {
            JsonDataException n = t67.m52113n("method", "method", jsonReader);
            vx2.m53590f(n, "missingProperty(\"method\", \"method\", reader)");
            throw n;
        } else if (str2 != null) {
            return new SessionRequestVO(str, str2);
        } else {
            JsonDataException n2 = t67.m52113n("params", "params", jsonReader);
            vx2.m53590f(n2, "missingProperty(\"params\", \"params\", reader)");
            throw n2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004e, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004f, code lost:
        p000.lh0.m47807a(r0, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0052, code lost:
        throw r11;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo39347j(p000.q73 r10, com.walletconnect.sign.common.model.p016vo.clientsync.session.payload.SessionRequestVO r11) {
        /*
            r9 = this;
            java.lang.String r0 = "writer"
            p000.vx2.m53591g(r10, r0)
            if (r11 == 0) goto L_0x0053
            r10.mo39394c()
            java.lang.String r0 = "method"
            r10.mo39399j(r0)
            com.squareup.moshi.d<java.lang.String> r0 = r9.f35466b
            java.lang.String r1 = r11.mo41171a()
            r0.mo39347j(r10, r1)
            java.lang.String r0 = "params"
            r10.mo39399j(r0)
            v40 r0 = r10.mo39391G()
            r1 = 0
            com.squareup.moshi.d<java.lang.Object> r2 = r9.f35467c     // Catch:{ all -> 0x004c }
            java.lang.String r11 = r11.mo41172b()     // Catch:{ all -> 0x004c }
            java.lang.String r11 = r2.mo39367h(r11)     // Catch:{ all -> 0x004c }
            java.lang.String r2 = "anyAdapter.toJson(value_.params)"
            p000.vx2.m53590f(r11, r2)     // Catch:{ all -> 0x004c }
            java.lang.String r2 = "\""
            java.lang.String r3 = kotlin.text.StringsKt__StringsKt.m63116u0(r11, r2)     // Catch:{ all -> 0x004c }
            java.lang.String r4 = "\\\""
            java.lang.String r5 = "\""
            r6 = 0
            r7 = 4
            r8 = 0
            java.lang.String r11 = p000.yb6.m74332I(r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x004c }
            r0.mo56044Z(r11)     // Catch:{ all -> 0x004c }
            p000.lh0.m47807a(r0, r1)
            r10.mo39398g()
            return
        L_0x004c:
            r10 = move-exception
            throw r10     // Catch:{ all -> 0x004e }
        L_0x004e:
            r11 = move-exception
            p000.lh0.m47807a(r0, r10)
            throw r11
        L_0x0053:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException
            java.lang.String r11 = "value_ was null! Wrap in .nullSafe() to write nullable values."
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.wx5.mo39347j(q73, com.walletconnect.sign.common.model.vo.clientsync.session.payload.SessionRequestVO):void");
    }

    /* renamed from: m */
    public final JSONArray mo49311m(JSONArray jSONArray, List<?> list) {
        Object obj;
        for (T next : list) {
            if (next instanceof List) {
                jSONArray.put(mo49311m(new JSONArray(), (List) next));
            } else if (next instanceof Map) {
                jSONArray.put(mo49312n(new JSONObject(), (Map) next));
            } else if (next instanceof String) {
                try {
                    Object c = this.f35467c.mo39362c((String) next);
                    if (c instanceof List) {
                        jSONArray.put(mo49311m(new JSONArray(), (List) c));
                    } else if (c instanceof Map) {
                        jSONArray.put(mo49312n(new JSONObject(), (Map) c));
                    } else if (c instanceof Number) {
                        jSONArray.put(((String) next).toString());
                    } else {
                        throw new IllegalArgumentException("Failed Deserializing Unknown Type " + next);
                    }
                } catch (JsonEncodingException unused) {
                    jSONArray.put(next);
                }
            } else if (next instanceof Number) {
                Number number = (Number) next;
                boolean z = true;
                if (number.doubleValue() % ((double) 1) != Utils.DOUBLE_EPSILON) {
                    z = false;
                }
                if (z) {
                    obj = Long.valueOf(number.longValue());
                } else {
                    obj = Double.valueOf(number.doubleValue());
                }
                jSONArray.put(obj);
            } else {
                if (next == null) {
                    next = JSONObject.NULL;
                }
                jSONArray.put(next);
            }
        }
        return jSONArray;
    }

    /* renamed from: n */
    public final JSONObject mo49312n(JSONObject jSONObject, Map<?, ?> map) {
        Object obj;
        vx2.m53589e(map, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof List) {
                jSONObject.putOpt(str, mo49311m(new JSONArray(), (List) value));
            } else if (value instanceof Map) {
                jSONObject.putOpt(str, mo49312n(new JSONObject(), (Map) value));
            } else if (value instanceof Number) {
                Number number = (Number) value;
                boolean z = true;
                if (number.doubleValue() % ((double) 1) != Utils.DOUBLE_EPSILON) {
                    z = false;
                }
                if (z) {
                    obj = Long.valueOf(number.longValue());
                } else {
                    obj = Double.valueOf(number.doubleValue());
                }
                jSONObject.put(str, obj);
            } else {
                if (value == null) {
                    value = JSONObject.NULL;
                }
                jSONObject.putOpt(str, value);
            }
        }
        return jSONObject;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(38);
        sb.append("GeneratedJsonAdapter(");
        sb.append("SessionRequestVO");
        sb.append(')');
        String sb2 = sb.toString();
        vx2.m53590f(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }
}
