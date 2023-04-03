package okhttp3.internal.http;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C6177b;
import okhttp3.Challenge;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import okio.ByteString;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u001a\u0010\n\u001a\u00020\t*\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0002\u001a\f\u0010\f\u001a\u00020\u000b*\u00020\u0006H\u0002\u001a\u0014\u0010\u000f\u001a\u00020\u000b*\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002\u001a\u000e\u0010\u0010\u001a\u0004\u0018\u00010\u0001*\u00020\u0006H\u0002\u001a\u000e\u0010\u0011\u001a\u0004\u0018\u00010\u0001*\u00020\u0006H\u0002\u001a\u001a\u0010\u0016\u001a\u00020\t*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0000\u001a\n\u0010\u0018\u001a\u00020\u000b*\u00020\u0017\u001a\u0010\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0017H\u0007\"\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\"\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001d¨\u0006\u001f"}, mo44877d2 = {"Lokhttp3/Headers;", "", "headerName", "", "Lokhttp3/Challenge;", "parseChallenges", "Lm40;", "", "result", "Lr37;", "readChallengeHeader", "", "skipCommasAndWhitespace", "", "prefix", "startsWith", "readQuotedString", "readToken", "Lokhttp3/CookieJar;", "Lokhttp3/HttpUrl;", "url", "headers", "receiveHeaders", "Lokhttp3/Response;", "promisesBody", "response", "hasBody", "Lokio/ByteString;", "QUOTED_STRING_DELIMITERS", "Lokio/ByteString;", "TOKEN_DELIMITERS", "okhttp"}, mo44878k = 2, mo44879mv = {1, 6, 0})
/* compiled from: HttpHeaders.kt */
public final class HttpHeaders {
    private static final ByteString QUOTED_STRING_DELIMITERS;
    private static final ByteString TOKEN_DELIMITERS;

    static {
        ByteString.C9034a aVar = ByteString.Companion;
        QUOTED_STRING_DELIMITERS = aVar.mo64480d("\"\\");
        TOKEN_DELIMITERS = aVar.mo64480d("\t ,=");
    }

    public static final boolean hasBody(Response response) {
        vx2.m53591g(response, "response");
        return promisesBody(response);
    }

    public static final List<Challenge> parseChallenges(Headers headers, String str) {
        vx2.m53591g(headers, "<this>");
        vx2.m53591g(str, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = headers.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (yb6.m74344y(str, headers.name(i), true)) {
                try {
                    readChallengeHeader(new m40().mo56044Z(headers.value(i)), arrayList);
                } catch (EOFException e) {
                    Platform.Companion.get().log("Unable to parse challenge", 5, e);
                }
            }
            i = i2;
        }
        return arrayList;
    }

    public static final boolean promisesBody(Response response) {
        vx2.m53591g(response, "<this>");
        if (vx2.m53586b(response.request().method(), "HEAD")) {
            return false;
        }
        int code = response.code();
        if (((code >= 100 && code < 200) || code == 204 || code == 304) && Util.headersContentLength(response) == -1 && !yb6.m74344y("chunked", Response.header$default(response, "Transfer-Encoding", (String) null, 2, (Object) null), true)) {
            return false;
        }
        return true;
    }

    private static final void readChallengeHeader(m40 m40, List<Challenge> list) throws EOFException {
        String readToken;
        int skipAll;
        String str;
        while (true) {
            String str2 = null;
            while (true) {
                if (str2 == null) {
                    skipCommasAndWhitespace(m40);
                    str2 = readToken(m40);
                    if (str2 == null) {
                        return;
                    }
                }
                boolean skipCommasAndWhitespace = skipCommasAndWhitespace(m40);
                readToken = readToken(m40);
                if (readToken != null) {
                    skipAll = Util.skipAll(m40, (byte) 61);
                    boolean skipCommasAndWhitespace2 = skipCommasAndWhitespace(m40);
                    if (skipCommasAndWhitespace || (!skipCommasAndWhitespace2 && !m40.mo56024I0())) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        int skipAll2 = skipAll + Util.skipAll(m40, (byte) 61);
                        while (true) {
                            if (readToken == null) {
                                readToken = readToken(m40);
                                if (skipCommasAndWhitespace(m40)) {
                                    continue;
                                    break;
                                }
                                skipAll2 = Util.skipAll(m40, (byte) 61);
                            }
                            if (skipAll2 == 0) {
                                continue;
                                break;
                            } else if (skipAll2 <= 1 && !skipCommasAndWhitespace(m40)) {
                                if (startsWith(m40, (byte) 34)) {
                                    str = readQuotedString(m40);
                                } else {
                                    str = readToken(m40);
                                }
                                if (str == null || ((String) linkedHashMap.put(readToken, str)) != null) {
                                    return;
                                }
                                if (skipCommasAndWhitespace(m40) || m40.mo56024I0()) {
                                    readToken = null;
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        list.add(new Challenge(str2, (Map<String, String>) linkedHashMap));
                        str2 = readToken;
                    }
                } else if (m40.mo56024I0()) {
                    list.add(new Challenge(str2, (Map<String, String>) C6177b.m47361i()));
                    return;
                } else {
                    return;
                }
            }
            Map singletonMap = Collections.singletonMap((Object) null, vx2.m53598n(readToken, yb6.m74328E("=", skipAll)));
            vx2.m53590f(singletonMap, "singletonMap<String, Str…ek + \"=\".repeat(eqCount))");
            list.add(new Challenge(str2, (Map<String, String>) singletonMap));
        }
    }

    private static final String readQuotedString(m40 m40) throws EOFException {
        boolean z;
        if (m40.readByte() == 34) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m40 m402 = new m40();
            while (true) {
                long T = m40.mo56037T(QUOTED_STRING_DELIMITERS);
                if (T == -1) {
                    return null;
                }
                if (m40.mo56066j(T) == 34) {
                    m402.write(m40, T);
                    m40.readByte();
                    return m402.mo56048b1();
                } else if (m40.size() == T + 1) {
                    return null;
                } else {
                    m402.write(m40, T);
                    m40.readByte();
                    m402.write(m40, 1);
                }
            }
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    private static final String readToken(m40 m40) {
        long T = m40.mo56037T(TOKEN_DELIMITERS);
        if (T == -1) {
            T = m40.size();
        }
        if (T != 0) {
            return m40.mo56023I(T);
        }
        return null;
    }

    public static final void receiveHeaders(CookieJar cookieJar, HttpUrl httpUrl, Headers headers) {
        vx2.m53591g(cookieJar, "<this>");
        vx2.m53591g(httpUrl, "url");
        vx2.m53591g(headers, "headers");
        if (cookieJar != CookieJar.NO_COOKIES) {
            List<Cookie> parseAll = Cookie.Companion.parseAll(httpUrl, headers);
            if (!parseAll.isEmpty()) {
                cookieJar.saveFromResponse(httpUrl, parseAll);
            }
        }
    }

    private static final boolean skipCommasAndWhitespace(m40 m40) {
        boolean z;
        boolean z2 = false;
        while (!m40.mo56024I0()) {
            byte j = m40.mo56066j(0);
            if (j != 44) {
                if (j == 32 || j == 9) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    break;
                }
                m40.readByte();
            } else {
                m40.readByte();
                z2 = true;
            }
        }
        return z2;
    }

    private static final boolean startsWith(m40 m40, byte b) {
        if (m40.mo56024I0() || m40.mo56066j(0) != b) {
            return false;
        }
        return true;
    }
}
