package p000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: cn2 */
/* compiled from: HttpGetRequest */
public class cn2 {

    /* renamed from: a */
    public final String f21817a;

    /* renamed from: b */
    public final Map<String, String> f21818b;

    /* renamed from: c */
    public final Map<String, String> f21819c = new HashMap();

    public cn2(String str, Map<String, String> map) {
        this.f21817a = str;
        this.f21818b = map;
    }

    /* renamed from: a */
    public final String mo30058a(Map<String, String> map) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        Map.Entry next = it.next();
        StringBuilder sb2 = new StringBuilder();
        sb2.append((String) next.getKey());
        sb2.append("=");
        if (next.getValue() != null) {
            str = (String) next.getValue();
        } else {
            str = "";
        }
        sb2.append(str);
        sb.append(sb2.toString());
        while (it.hasNext()) {
            Map.Entry next2 = it.next();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("&");
            sb3.append((String) next2.getKey());
            sb3.append("=");
            if (next2.getValue() != null) {
                str2 = (String) next2.getValue();
            } else {
                str2 = "";
            }
            sb3.append(str2);
            sb.append(sb3.toString());
        }
        return sb.toString();
    }

    /* renamed from: b */
    public final String mo30059b(String str, Map<String, String> map) {
        String a = mo30058a(map);
        if (a.isEmpty()) {
            return str;
        }
        if (str.contains("?")) {
            if (!str.endsWith("&")) {
                a = "&" + a;
            }
            return str + a;
        }
        return str + "?" + a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008d  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p000.fn2 mo30060c() throws java.io.IOException {
        /*
            r5 = this;
            r0 = 0
            java.lang.String r1 = r5.f21817a     // Catch:{ all -> 0x0084 }
            java.util.Map<java.lang.String, java.lang.String> r2 = r5.f21818b     // Catch:{ all -> 0x0084 }
            java.lang.String r1 = r5.mo30059b(r1, r2)     // Catch:{ all -> 0x0084 }
            rk3 r2 = p000.rk3.m51112f()     // Catch:{ all -> 0x0084 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0084 }
            r3.<init>()     // Catch:{ all -> 0x0084 }
            java.lang.String r4 = "GET Request URL: "
            r3.append(r4)     // Catch:{ all -> 0x0084 }
            r3.append(r1)     // Catch:{ all -> 0x0084 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0084 }
            r2.mo47429i(r3)     // Catch:{ all -> 0x0084 }
            java.net.URL r2 = new java.net.URL     // Catch:{ all -> 0x0084 }
            r2.<init>(r1)     // Catch:{ all -> 0x0084 }
            java.net.URLConnection r1 = r2.openConnection()     // Catch:{ all -> 0x0084 }
            javax.net.ssl.HttpsURLConnection r1 = (javax.net.ssl.HttpsURLConnection) r1     // Catch:{ all -> 0x0084 }
            r2 = 10000(0x2710, float:1.4013E-41)
            r1.setReadTimeout(r2)     // Catch:{ all -> 0x0082 }
            r1.setConnectTimeout(r2)     // Catch:{ all -> 0x0082 }
            java.lang.String r2 = "GET"
            r1.setRequestMethod(r2)     // Catch:{ all -> 0x0082 }
            java.util.Map<java.lang.String, java.lang.String> r2 = r5.f21819c     // Catch:{ all -> 0x0082 }
            java.util.Set r2 = r2.entrySet()     // Catch:{ all -> 0x0082 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0082 }
        L_0x0043:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0082 }
            if (r3 == 0) goto L_0x005f
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0082 }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x0082 }
            java.lang.Object r4 = r3.getKey()     // Catch:{ all -> 0x0082 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0082 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x0082 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0082 }
            r1.addRequestProperty(r4, r3)     // Catch:{ all -> 0x0082 }
            goto L_0x0043
        L_0x005f:
            r1.connect()     // Catch:{ all -> 0x0082 }
            int r2 = r1.getResponseCode()     // Catch:{ all -> 0x0082 }
            java.io.InputStream r3 = r1.getInputStream()     // Catch:{ all -> 0x0082 }
            if (r3 == 0) goto L_0x0074
            java.lang.String r0 = r5.mo30062e(r3)     // Catch:{ all -> 0x0071 }
            goto L_0x0074
        L_0x0071:
            r2 = move-exception
            r0 = r3
            goto L_0x0086
        L_0x0074:
            if (r3 == 0) goto L_0x0079
            r3.close()
        L_0x0079:
            r1.disconnect()
            fn2 r1 = new fn2
            r1.<init>(r2, r0)
            return r1
        L_0x0082:
            r2 = move-exception
            goto L_0x0086
        L_0x0084:
            r2 = move-exception
            r1 = r0
        L_0x0086:
            if (r0 == 0) goto L_0x008b
            r0.close()
        L_0x008b:
            if (r1 == 0) goto L_0x0090
            r1.disconnect()
        L_0x0090:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.cn2.mo30060c():fn2");
    }

    /* renamed from: d */
    public cn2 mo30061d(String str, String str2) {
        this.f21819c.put(str, str2);
        return this;
    }

    /* renamed from: e */
    public final String mo30062e(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        char[] cArr = new char[8192];
        StringBuilder sb = new StringBuilder();
        while (true) {
            int read = bufferedReader.read(cArr);
            if (read == -1) {
                return sb.toString();
            }
            sb.append(cArr, 0, read);
        }
    }
}
