package okhttp3.internal;

import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.C6177b;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http2.Header;
import okio.ByteString;
import org.web3j.ens.contracts.generated.PublicResolver;
import p000.wi4;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000°\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000\u001a\u0016\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b\u001a;\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\f*\b\u0012\u0004\u0012\u00020\u00060\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00060\u000e¢\u0006\u0004\b\u0010\u0010\u0011\u001a7\u0010\u0012\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u00060\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f2\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00060\u000e¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0014\u0010\u0016\u001a\u00020\u0006*\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\b\u001a-\u0010\u0019\u001a\u00020\u0018*\b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u0017\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e¢\u0006\u0004\b\u0019\u0010\u001a\u001a%\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\f*\b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001e\u0010\u001f\u001a\u00020\u0018*\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u001a\u001e\u0010 \u001a\u00020\u0018*\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u001a\u001e\u0010!\u001a\u00020\u0006*\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u001a&\u0010#\u001a\u00020\u0018*\u00020\u00062\u0006\u0010\"\u001a\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u001a&\u0010#\u001a\u00020\u0018*\u00020\u00062\u0006\u0010%\u001a\u00020$2\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u001a\n\u0010&\u001a\u00020\u0018*\u00020\u0006\u001a\n\u0010'\u001a\u00020\b*\u00020\u0006\u001a\u000e\u0010(\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006\u001a)\u0010)\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00062\u0012\u0010+\u001a\n\u0012\u0006\b\u0001\u0012\u00020*0\f\"\u00020*¢\u0006\u0004\b)\u0010,\u001a\u0012\u00100\u001a\u00020.*\u00020-2\u0006\u0010/\u001a\u00020.\u001a \u00104\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u00002\b\u00103\u001a\u0004\u0018\u000102\u001a\n\u00105\u001a\u00020\u0018*\u00020$\u001a\u0010\u00109\u001a\u000208*\b\u0012\u0004\u0012\u00020706\u001a\u0010\u0010:\u001a\b\u0012\u0004\u0012\u00020706*\u000208\u001a\u0012\u0010;\u001a\u00020\b*\u00020\u00142\u0006\u0010\r\u001a\u00020\u0014\u001a\n\u0010>\u001a\u00020=*\u00020<\u001a\u0015\u0010A\u001a\u00020\u0018*\u00020?2\u0006\u0010@\u001a\u00020\u0018H\u0004\u001a\u0015\u0010A\u001a\u00020\u0018*\u00020B2\u0006\u0010@\u001a\u00020\u0018H\u0004\u001a\u0015\u0010A\u001a\u00020\u0000*\u00020\u00182\u0006\u0010@\u001a\u00020\u0000H\u0004\u001a\u0012\u0010E\u001a\u00020\u0004*\u00020C2\u0006\u0010D\u001a\u00020\u0018\u001a\n\u0010F\u001a\u00020\u0018*\u00020-\u001a\u001a\u0010I\u001a\u00020\b*\u00020G2\u0006\u00101\u001a\u00020\u00182\u0006\u0010H\u001a\u000202\u001a\u001a\u0010K\u001a\u00020\b*\u00020G2\u0006\u0010J\u001a\u00020\u00182\u0006\u0010H\u001a\u000202\u001a\n\u0010M\u001a\u00020\u0006*\u00020L\u001a\u0012\u0010O\u001a\u00020\b*\u00020L2\u0006\u0010N\u001a\u00020-\u001a\u001a\u0010R\u001a\u00020\u00042\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00040PH\bø\u0001\u0000\u001a\"\u0010S\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00040PH\bø\u0001\u0000\u001a\u0012\u0010I\u001a\u00020\u0018*\u00020T2\u0006\u0010U\u001a\u00020?\u001a\u0014\u0010V\u001a\u00020\u0018*\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u0018\u001a\n\u0010X\u001a\u00020\u0000*\u00020W\u001a\u0012\u0010Z\u001a\u00020\u0000*\u00020\u00062\u0006\u0010Y\u001a\u00020\u0000\u001a\u0014\u0010[\u001a\u00020\u0018*\u0004\u0018\u00010\u00062\u0006\u0010Y\u001a\u00020\u0018\u001a\u001c\u0010]\u001a\b\u0012\u0004\u0012\u00028\u000006\"\u0004\b\u0000\u0010\\*\b\u0012\u0004\u0012\u00028\u000006\u001a/\u0010_\u001a\b\u0012\u0004\u0012\u00028\u000006\"\u0004\b\u0000\u0010\\2\u0012\u0010^\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\f\"\u00028\u0000H\u0007¢\u0006\u0004\b_\u0010`\u001a.\u0010d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010c\"\u0004\b\u0000\u0010a\"\u0004\b\u0001\u0010b*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010c\u001a\n\u0010f\u001a\u00020\u0004*\u00020e\u001a\n\u0010f\u001a\u00020\u0004*\u00020L\u001a\n\u0010f\u001a\u00020\u0004*\u00020g\u001a\u0012\u0010k\u001a\u00020\b*\u00020h2\u0006\u0010j\u001a\u00020i\u001a\n\u0010l\u001a\u00020\u0006*\u00020\u0000\u001a\n\u0010l\u001a\u00020\u0006*\u00020\u0018\u001a\r\u0010m\u001a\u00020\u0004*\u00020*H\b\u001a\r\u0010n\u001a\u00020\u0004*\u00020*H\b\u001a\r\u0010o\u001a\u00020\u0004*\u00020*H\b\u001a3\u0010t\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\\2\u0006\u0010p\u001a\u00020*2\f\u0010r\u001a\b\u0012\u0004\u0012\u00028\u00000q2\u0006\u0010s\u001a\u00020\u0006¢\u0006\u0004\bt\u0010u\u001a'\u0010y\u001a\u00020\u0004\"\u0004\b\u0000\u0010v*\b\u0012\u0004\u0012\u00028\u00000w2\u0006\u0010x\u001a\u00028\u0000H\u0000¢\u0006\u0004\by\u0010z\u001a\r\u0010{\u001a\u00020\u0004*\u00020*H\b\u001a\r\u0010|\u001a\u00020\u0004*\u00020*H\b\u001a\"\u0010\u0001\u001a\u00030\u0001*\u00060}j\u0002`~2\u0010\u0010\u001a\f\u0012\b\u0012\u00060}j\u0002`~06\u001a:\u0010\u0001\u001a\b\u0012\u0004\u0012\u00028\u000006\"\u0004\b\u0000\u0010\\*\t\u0012\u0004\u0012\u00028\u00000\u00012\u0014\u0010\u0001\u001a\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0001H\bø\u0001\u0000\"\u0018\u0010\u0001\u001a\u00030\u00018\u0006X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001\"\u0017\u0010\u0001\u001a\u0002088\u0006X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001\"\u0018\u0010\u0001\u001a\u00030\u00018\u0006X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001\"\u0018\u0010\u0001\u001a\u00030\u00018\u0006X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001\"\u0018\u0010\u0001\u001a\u00030\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001\"\u0018\u0010\u0001\u001a\u00030\u00018\u0006X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001\"\u0018\u0010\u0001\u001a\u00030\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001\"\u0017\u0010\u0001\u001a\u00020\b8\u0000X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001\"\u0017\u0010\u0001\u001a\u00020\u00068\u0000X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001\"\u0017\u0010\u0001\u001a\u00020\u00068\u0006XT¢\u0006\b\n\u0006\b\u0001\u0010\u0001\u0002\u0007\n\u0005\b20\u0001¨\u0006\u0001"}, mo44877d2 = {"", "arrayLength", "offset", "count", "Lr37;", "checkOffsetAndCount", "", "name", "", "daemon", "Ljava/util/concurrent/ThreadFactory;", "threadFactory", "", "other", "Ljava/util/Comparator;", "comparator", "intersect", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)[Ljava/lang/String;", "hasIntersection", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)Z", "Lokhttp3/HttpUrl;", "includeDefaultPort", "toHostHeader", "value", "", "indexOf", "([Ljava/lang/String;Ljava/lang/String;Ljava/util/Comparator;)I", "concat", "([Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;", "startIndex", "endIndex", "indexOfFirstNonAsciiWhitespace", "indexOfLastNonAsciiWhitespace", "trimSubstring", "delimiters", "delimiterOffset", "", "delimiter", "indexOfControlOrNonAscii", "canParseAsIpAddress", "isSensitiveHeader", "format", "", "args", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "Lw40;", "Ljava/nio/charset/Charset;", "default", "readBomAsCharset", "duration", "Ljava/util/concurrent/TimeUnit;", "unit", "checkDuration", "parseHexDigit", "", "Lokhttp3/internal/http2/Header;", "Lokhttp3/Headers;", "toHeaders", "toHeaderList", "canReuseConnectionFor", "Lokhttp3/EventListener;", "Lokhttp3/EventListener$Factory;", "asFactory", "", "mask", "and", "", "Lv40;", "medium", "writeMedium", "readMedium", "Lz56;", "timeUnit", "skipAll", "timeout", "discard", "Ljava/net/Socket;", "peerName", "source", "isHealthy", "Lkotlin/Function0;", "block", "ignoreIoExceptions", "threadName", "Lm40;", "b", "indexOfNonWhitespace", "Lokhttp3/Response;", "headersContentLength", "defaultValue", "toLongOrDefault", "toNonNegativeInt", "T", "toImmutableList", "elements", "immutableListOf", "([Ljava/lang/Object;)Ljava/util/List;", "K", "V", "", "toImmutableMap", "Ljava/io/Closeable;", "closeQuietly", "Ljava/net/ServerSocket;", "Lokhttp3/internal/io/FileSystem;", "Ljava/io/File;", "file", "isCivilized", "toHexString", "wait", "notify", "notifyAll", "instance", "Ljava/lang/Class;", "fieldType", "fieldName", "readFieldOrNull", "(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;", "E", "", "element", "addIfAbsent", "(Ljava/util/List;Ljava/lang/Object;)V", "assertThreadHoldsLock", "assertThreadDoesntHoldLock", "Ljava/lang/Exception;", "Lkotlin/Exception;", "suppressed", "", "withSuppressed", "", "Lkotlin/Function1;", "predicate", "filterList", "", "EMPTY_BYTE_ARRAY", "[B", "EMPTY_HEADERS", "Lokhttp3/Headers;", "Lokhttp3/ResponseBody;", "EMPTY_RESPONSE", "Lokhttp3/ResponseBody;", "Lokhttp3/RequestBody;", "EMPTY_REQUEST", "Lokhttp3/RequestBody;", "Lwi4;", "UNICODE_BOMS", "Lwi4;", "Ljava/util/TimeZone;", "UTC", "Ljava/util/TimeZone;", "Lkotlin/text/Regex;", "VERIFY_AS_IP_ADDRESS", "Lkotlin/text/Regex;", "assertionsEnabled", "Z", "okHttpName", "Ljava/lang/String;", "userAgent", "okhttp"}, mo44878k = 2, mo44879mv = {1, 6, 0})
/* compiled from: Util.kt */
public final class Util {
    public static final byte[] EMPTY_BYTE_ARRAY;
    public static final Headers EMPTY_HEADERS = Headers.Companion.mo63274of(new String[0]);
    public static final RequestBody EMPTY_REQUEST;
    public static final ResponseBody EMPTY_RESPONSE;
    private static final wi4 UNICODE_BOMS;
    public static final TimeZone UTC;
    private static final Regex VERIFY_AS_IP_ADDRESS = new Regex("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    public static final boolean assertionsEnabled = false;
    public static final String okHttpName;
    public static final String userAgent = "okhttp/4.10.0";

    static {
        byte[] bArr = new byte[0];
        EMPTY_BYTE_ARRAY = bArr;
        EMPTY_RESPONSE = ResponseBody.Companion.create$default(ResponseBody.Companion, bArr, (MediaType) null, 1, (Object) null);
        EMPTY_REQUEST = RequestBody.Companion.create$default(RequestBody.Companion, bArr, (MediaType) null, 0, 0, 7, (Object) null);
        wi4.C9519a aVar = wi4.f45529g;
        ByteString.C9034a aVar2 = ByteString.Companion;
        UNICODE_BOMS = aVar.mo66719d(aVar2.mo64478b("efbbbf"), aVar2.mo64478b("feff"), aVar2.mo64478b("fffe"), aVar2.mo64478b("0000ffff"), aVar2.mo64478b("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        vx2.m53588d(timeZone);
        UTC = timeZone;
        Class<OkHttpClient> cls = OkHttpClient.class;
        String name = OkHttpClient.class.getName();
        vx2.m53590f(name, "OkHttpClient::class.java.name");
        okHttpName = StringsKt__StringsKt.m63115t0(StringsKt__StringsKt.m63114s0(name, "okhttp3."), "Client");
    }

    public static final <E> void addIfAbsent(List<E> list, E e) {
        vx2.m53591g(list, "<this>");
        if (!list.contains(e)) {
            list.add(e);
        }
    }

    public static final int and(byte b, int i) {
        return b & i;
    }

    public static final int and(short s, int i) {
        return s & i;
    }

    public static final long and(int i, long j) {
        return ((long) i) & j;
    }

    public static final EventListener.Factory asFactory(EventListener eventListener) {
        vx2.m53591g(eventListener, "<this>");
        return new m67(eventListener);
    }

    /* access modifiers changed from: private */
    /* renamed from: asFactory$lambda-8  reason: not valid java name */
    public static final EventListener m75780asFactory$lambda8(EventListener eventListener, Call call) {
        vx2.m53591g(eventListener, "$this_asFactory");
        vx2.m53591g(call, "it");
        return eventListener;
    }

    public static final void assertThreadDoesntHoldLock(Object obj) {
        vx2.m53591g(obj, "<this>");
        if (assertionsEnabled && Thread.holdsLock(obj)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + obj);
        }
    }

    public static final void assertThreadHoldsLock(Object obj) {
        vx2.m53591g(obj, "<this>");
        if (assertionsEnabled && !Thread.holdsLock(obj)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + obj);
        }
    }

    public static final boolean canParseAsIpAddress(String str) {
        vx2.m53591g(str, "<this>");
        return VERIFY_AS_IP_ADDRESS.matches(str);
    }

    public static final boolean canReuseConnectionFor(HttpUrl httpUrl, HttpUrl httpUrl2) {
        vx2.m53591g(httpUrl, "<this>");
        vx2.m53591g(httpUrl2, "other");
        if (!vx2.m53586b(httpUrl.host(), httpUrl2.host()) || httpUrl.port() != httpUrl2.port() || !vx2.m53586b(httpUrl.scheme(), httpUrl2.scheme())) {
            return false;
        }
        return true;
    }

    public static final int checkDuration(String str, long j, TimeUnit timeUnit) {
        boolean z;
        boolean z2;
        boolean z3;
        vx2.m53591g(str, PublicResolver.FUNC_NAME);
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        boolean z4 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (timeUnit != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                long millis = timeUnit.toMillis(j);
                if (millis <= 2147483647L) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    if (millis == 0 && i > 0) {
                        z4 = false;
                    }
                    if (z4) {
                        return (int) millis;
                    }
                    throw new IllegalArgumentException(vx2.m53598n(str, " too small.").toString());
                }
                throw new IllegalArgumentException(vx2.m53598n(str, " too large.").toString());
            }
            throw new IllegalStateException("unit == null".toString());
        }
        throw new IllegalStateException(vx2.m53598n(str, " < 0").toString());
    }

    public static final void checkOffsetAndCount(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void closeQuietly(Closeable closeable) {
        vx2.m53591g(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final String[] concat(String[] strArr, String str) {
        vx2.m53591g(strArr, "<this>");
        vx2.m53591g(str, "value");
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length + 1);
        vx2.m53590f(copyOf, "copyOf(this, newSize)");
        String[] strArr2 = (String[]) copyOf;
        strArr2[ArraysKt___ArraysKt.m47261M(strArr2)] = str;
        return strArr2;
    }

    public static final int delimiterOffset(String str, String str2, int i, int i2) {
        vx2.m53591g(str, "<this>");
        vx2.m53591g(str2, "delimiters");
        while (i < i2) {
            int i3 = i + 1;
            if (StringsKt__StringsKt.m63079Q(str2, str.charAt(i), false, 2, (Object) null)) {
                return i;
            }
            i = i3;
        }
        return i2;
    }

    public static /* synthetic */ int delimiterOffset$default(String str, String str2, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return delimiterOffset(str, str2, i, i2);
    }

    public static final boolean discard(z56 z56, int i, TimeUnit timeUnit) {
        vx2.m53591g(z56, "<this>");
        vx2.m53591g(timeUnit, "timeUnit");
        try {
            return skipAll(z56, i, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final <T> List<T> filterList(Iterable<? extends T> iterable, rc2<? super T, Boolean> rc2) {
        vx2.m53591g(iterable, "<this>");
        vx2.m53591g(rc2, "predicate");
        List<T> j = ck0.m33062j();
        for (Object next : iterable) {
            if (rc2.invoke(next).booleanValue()) {
                if (j.isEmpty()) {
                    j = new ArrayList<>();
                }
                t07.m52024c(j).add(next);
            }
        }
        return j;
    }

    public static final String format(String str, Object... objArr) {
        vx2.m53591g(str, "format");
        vx2.m53591g(objArr, "args");
        cb6 cb6 = cb6.f21669a;
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format = String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
        vx2.m53590f(format, "format(locale, format, *args)");
        return format;
    }

    public static final boolean hasIntersection(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        boolean z;
        boolean z2;
        vx2.m53591g(strArr, "<this>");
        vx2.m53591g(comparator, "comparator");
        if (strArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && strArr2 != null) {
            if (strArr2.length == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                int length = strArr.length;
                int i = 0;
                while (i < length) {
                    String str = strArr[i];
                    i++;
                    Iterator a = C6118jq.m46703a(strArr2);
                    while (true) {
                        if (a.hasNext()) {
                            if (comparator.compare(str, (String) a.next()) == 0) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final long headersContentLength(Response response) {
        vx2.m53591g(response, "<this>");
        String str = response.headers().get("Content-Length");
        if (str == null) {
            return -1;
        }
        return toLongOrDefault(str, -1);
    }

    public static final void ignoreIoExceptions(pc2<r37> pc2) {
        vx2.m53591g(pc2, "block");
        try {
            pc2.invoke();
        } catch (IOException unused) {
        }
    }

    public static final <T> List<T> immutableListOf(T... tArr) {
        vx2.m53591g(tArr, "elements");
        Object[] objArr = (Object[]) tArr.clone();
        List<T> unmodifiableList = Collections.unmodifiableList(ck0.m33065m(Arrays.copyOf(objArr, objArr.length)));
        vx2.m53590f(unmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return unmodifiableList;
    }

    public static final int indexOf(String[] strArr, String str, Comparator<String> comparator) {
        boolean z;
        vx2.m53591g(strArr, "<this>");
        vx2.m53591g(str, "value");
        vx2.m53591g(comparator, "comparator");
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (comparator.compare(strArr[i], str) == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return i;
            }
        }
        return -1;
    }

    public static final int indexOfControlOrNonAscii(String str) {
        vx2.m53591g(str, "<this>");
        int length = str.length();
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            char charAt = str.charAt(i);
            if (vx2.m53593i(charAt, 31) <= 0 || vx2.m53593i(charAt, 127) >= 0) {
                return i;
            }
            i = i2;
        }
        return -1;
    }

    public static final int indexOfFirstNonAsciiWhitespace(String str, int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        vx2.m53591g(str, "<this>");
        while (i < i2) {
            int i3 = i + 1;
            char charAt = str.charAt(i);
            boolean z4 = false;
            if (charAt == 9 || charAt == 10) {
                z = true;
            } else {
                z = false;
            }
            if (!z && charAt != 12) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2 && charAt != 13) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z3 || charAt == ' ') {
                z4 = true;
            }
            if (!z4) {
                return i;
            }
            i = i3;
        }
        return i2;
    }

    public static /* synthetic */ int indexOfFirstNonAsciiWhitespace$default(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return indexOfFirstNonAsciiWhitespace(str, i, i2);
    }

    public static final int indexOfLastNonAsciiWhitespace(String str, int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        vx2.m53591g(str, "<this>");
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                int i4 = i3 - 1;
                char charAt = str.charAt(i3);
                boolean z4 = false;
                if (charAt == 9 || charAt == 10) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z && charAt != 12) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (!z2 && charAt != 13) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (z3 || charAt == ' ') {
                    z4 = true;
                }
                if (!z4) {
                    return i3 + 1;
                }
                if (i3 == i) {
                    break;
                }
                i3 = i4;
            }
        }
        return i;
    }

    public static /* synthetic */ int indexOfLastNonAsciiWhitespace$default(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return indexOfLastNonAsciiWhitespace(str, i, i2);
    }

    public static final int indexOfNonWhitespace(String str, int i) {
        vx2.m53591g(str, "<this>");
        int length = str.length();
        while (i < length) {
            int i2 = i + 1;
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != 9) {
                return i;
            }
            i = i2;
        }
        return str.length();
    }

    public static /* synthetic */ int indexOfNonWhitespace$default(String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return indexOfNonWhitespace(str, i);
    }

    public static final String[] intersect(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        vx2.m53591g(strArr, "<this>");
        vx2.m53591g(strArr2, "other");
        vx2.m53591g(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            String str = strArr[i];
            i++;
            int length2 = strArr2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    break;
                }
                String str2 = strArr2[i2];
                i2++;
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        p000.lh0.m47807a(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0028, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        r2 = p000.r37.f33317a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        p000.lh0.m47807a(r0, (java.lang.Throwable) null);
        r3.delete(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        return false;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0019 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean isCivilized(okhttp3.internal.p022io.FileSystem r3, java.io.File r4) {
        /*
            java.lang.String r0 = "<this>"
            p000.vx2.m53591g(r3, r0)
            java.lang.String r0 = "file"
            p000.vx2.m53591g(r4, r0)
            s36 r0 = r3.sink(r4)
            r1 = 0
            r3.delete(r4)     // Catch:{ IOException -> 0x0019 }
            r3 = 1
            p000.lh0.m47807a(r0, r1)
            return r3
        L_0x0017:
            r3 = move-exception
            goto L_0x0023
        L_0x0019:
            r37 r2 = p000.r37.f33317a     // Catch:{ all -> 0x0017 }
            p000.lh0.m47807a(r0, r1)
            r3.delete(r4)
            r3 = 0
            return r3
        L_0x0023:
            throw r3     // Catch:{ all -> 0x0024 }
        L_0x0024:
            r4 = move-exception
            p000.lh0.m47807a(r0, r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.Util.isCivilized(okhttp3.internal.io.FileSystem, java.io.File):boolean");
    }

    public static final boolean isHealthy(Socket socket, w40 w40) {
        int soTimeout;
        vx2.m53591g(socket, "<this>");
        vx2.m53591g(w40, "source");
        try {
            soTimeout = socket.getSoTimeout();
            socket.setSoTimeout(1);
            boolean z = !w40.mo56024I0();
            socket.setSoTimeout(soTimeout);
            return z;
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        } catch (Throwable th) {
            socket.setSoTimeout(soTimeout);
            throw th;
        }
    }

    public static final boolean isSensitiveHeader(String str) {
        vx2.m53591g(str, PublicResolver.FUNC_NAME);
        if (yb6.m74344y(str, Constants.AUTHORIZATION_HEADER, true) || yb6.m74344y(str, "Cookie", true) || yb6.m74344y(str, "Proxy-Authorization", true) || yb6.m74344y(str, "Set-Cookie", true)) {
            return true;
        }
        return false;
    }

    public static final void notify(Object obj) {
        vx2.m53591g(obj, "<this>");
        obj.notify();
    }

    public static final void notifyAll(Object obj) {
        vx2.m53591g(obj, "<this>");
        obj.notifyAll();
    }

    public static final int parseHexDigit(char c) {
        boolean z = true;
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        char c2 = 'a';
        if (!('a' <= c && c < 'g')) {
            c2 = 'A';
            if ('A' > c || c >= 'G') {
                z = false;
            }
            if (!z) {
                return -1;
            }
        }
        return (c - c2) + 10;
    }

    public static final String peerName(Socket socket) {
        vx2.m53591g(socket, "<this>");
        SocketAddress remoteSocketAddress = socket.getRemoteSocketAddress();
        if (!(remoteSocketAddress instanceof InetSocketAddress)) {
            return remoteSocketAddress.toString();
        }
        String hostName = ((InetSocketAddress) remoteSocketAddress).getHostName();
        vx2.m53590f(hostName, "address.hostName");
        return hostName;
    }

    public static final Charset readBomAsCharset(w40 w40, Charset charset) throws IOException {
        vx2.m53591g(w40, "<this>");
        vx2.m53591g(charset, "default");
        int J0 = w40.mo56026J0(UNICODE_BOMS);
        if (J0 == -1) {
            return charset;
        }
        if (J0 == 0) {
            Charset charset2 = StandardCharsets.UTF_8;
            vx2.m53590f(charset2, "UTF_8");
            return charset2;
        } else if (J0 == 1) {
            Charset charset3 = StandardCharsets.UTF_16BE;
            vx2.m53590f(charset3, "UTF_16BE");
            return charset3;
        } else if (J0 == 2) {
            Charset charset4 = StandardCharsets.UTF_16LE;
            vx2.m53590f(charset4, "UTF_16LE");
            return charset4;
        } else if (J0 == 3) {
            return ae0.f36434a.mo50140a();
        } else {
            if (J0 == 4) {
                return ae0.f36434a.mo50141b();
            }
            throw new AssertionError();
        }
    }

    public static final <T> T readFieldOrNull(Object obj, Class<T> cls, String str) {
        Object readFieldOrNull;
        Class<Object> cls2 = Object.class;
        vx2.m53591g(obj, "instance");
        vx2.m53591g(cls, "fieldType");
        vx2.m53591g(str, "fieldName");
        Class cls3 = obj.getClass();
        while (!vx2.m53586b(cls3, cls2)) {
            try {
                Field declaredField = cls3.getDeclaredField(str);
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(obj);
                if (!cls.isInstance(obj2)) {
                    return null;
                }
                return cls.cast(obj2);
            } catch (NoSuchFieldException unused) {
                cls3 = cls3.getSuperclass();
                vx2.m53590f(cls3, "c.superclass");
            }
        }
        if (vx2.m53586b(str, "delegate") || (readFieldOrNull = readFieldOrNull(obj, cls2, "delegate")) == null) {
            return null;
        }
        return readFieldOrNull(readFieldOrNull, cls, str);
    }

    public static final int readMedium(w40 w40) throws IOException {
        vx2.m53591g(w40, "<this>");
        return and(w40.readByte(), 255) | (and(w40.readByte(), 255) << 16) | (and(w40.readByte(), 255) << 8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0051, code lost:
        if (r5 == Long.MAX_VALUE) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0053, code lost:
        r11.timeout().clearDeadline();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005b, code lost:
        r11.timeout().deadlineNanoTime(r0 + r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007d, code lost:
        if (r5 != Long.MAX_VALUE) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0080, code lost:
        return r12;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean skipAll(p000.z56 r11, int r12, java.util.concurrent.TimeUnit r13) throws java.io.IOException {
        /*
            java.lang.String r0 = "<this>"
            p000.vx2.m53591g(r11, r0)
            java.lang.String r0 = "timeUnit"
            p000.vx2.m53591g(r13, r0)
            long r0 = java.lang.System.nanoTime()
            qq6 r2 = r11.timeout()
            boolean r2 = r2.hasDeadline()
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r2 == 0) goto L_0x0027
            qq6 r2 = r11.timeout()
            long r5 = r2.deadlineNanoTime()
            long r5 = r5 - r0
            goto L_0x0028
        L_0x0027:
            r5 = r3
        L_0x0028:
            qq6 r2 = r11.timeout()
            long r7 = (long) r12
            long r12 = r13.toNanos(r7)
            long r12 = java.lang.Math.min(r5, r12)
            long r12 = r12 + r0
            r2.deadlineNanoTime(r12)
            m40 r12 = new m40     // Catch:{ InterruptedIOException -> 0x007a, all -> 0x0064 }
            r12.<init>()     // Catch:{ InterruptedIOException -> 0x007a, all -> 0x0064 }
        L_0x003e:
            r7 = 8192(0x2000, double:4.0474E-320)
            long r7 = r11.read(r12, r7)     // Catch:{ InterruptedIOException -> 0x007a, all -> 0x0064 }
            r9 = -1
            int r13 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r13 == 0) goto L_0x004e
            r12.mo56045a()     // Catch:{ InterruptedIOException -> 0x007a, all -> 0x0064 }
            goto L_0x003e
        L_0x004e:
            r12 = 1
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L_0x005b
        L_0x0053:
            qq6 r11 = r11.timeout()
            r11.clearDeadline()
            goto L_0x0080
        L_0x005b:
            qq6 r11 = r11.timeout()
            long r0 = r0 + r5
            r11.deadlineNanoTime(r0)
            goto L_0x0080
        L_0x0064:
            r12 = move-exception
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L_0x0071
            qq6 r11 = r11.timeout()
            r11.clearDeadline()
            goto L_0x0079
        L_0x0071:
            qq6 r11 = r11.timeout()
            long r0 = r0 + r5
            r11.deadlineNanoTime(r0)
        L_0x0079:
            throw r12
        L_0x007a:
            r12 = 0
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L_0x005b
            goto L_0x0053
        L_0x0080:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.Util.skipAll(z56, int, java.util.concurrent.TimeUnit):boolean");
    }

    public static final ThreadFactory threadFactory(String str, boolean z) {
        vx2.m53591g(str, PublicResolver.FUNC_NAME);
        return new l67(str, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: threadFactory$lambda-1  reason: not valid java name */
    public static final Thread m75781threadFactory$lambda1(String str, boolean z, Runnable runnable) {
        vx2.m53591g(str, "$name");
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(z);
        return thread;
    }

    public static final void threadName(String str, pc2<r37> pc2) {
        vx2.m53591g(str, PublicResolver.FUNC_NAME);
        vx2.m53591g(pc2, "block");
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(str);
        try {
            pc2.invoke();
        } finally {
            pu2.m50113b(1);
            currentThread.setName(name);
            pu2.m50112a(1);
        }
    }

    public static final List<Header> toHeaderList(Headers headers) {
        vx2.m53591g(headers, "<this>");
        rw2 q = d75.m43395q(0, headers.size());
        ArrayList arrayList = new ArrayList(dk0.m43495u(q, 10));
        Iterator it = q.iterator();
        while (it.hasNext()) {
            int nextInt = ((lw2) it).nextInt();
            arrayList.add(new Header(headers.name(nextInt), headers.value(nextInt)));
        }
        return arrayList;
    }

    public static final Headers toHeaders(List<Header> list) {
        vx2.m53591g(list, "<this>");
        Headers.Builder builder = new Headers.Builder();
        for (Header next : list) {
            builder.addLenient$okhttp(next.component1().utf8(), next.component2().utf8());
        }
        return builder.build();
    }

    public static final String toHexString(long j) {
        String hexString = Long.toHexString(j);
        vx2.m53590f(hexString, "toHexString(this)");
        return hexString;
    }

    public static final String toHostHeader(HttpUrl httpUrl, boolean z) {
        String str;
        vx2.m53591g(httpUrl, "<this>");
        if (StringsKt__StringsKt.m63081R(httpUrl.host(), ":", false, 2, (Object) null)) {
            str = '[' + httpUrl.host() + ']';
        } else {
            str = httpUrl.host();
        }
        if (!z && httpUrl.port() == HttpUrl.Companion.defaultPort(httpUrl.scheme())) {
            return str;
        }
        return str + ':' + httpUrl.port();
    }

    public static /* synthetic */ String toHostHeader$default(HttpUrl httpUrl, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return toHostHeader(httpUrl, z);
    }

    public static final <T> List<T> toImmutableList(List<? extends T> list) {
        vx2.m53591g(list, "<this>");
        List<T> unmodifiableList = Collections.unmodifiableList(CollectionsKt___CollectionsKt.m47313M0(list));
        vx2.m53590f(unmodifiableList, "unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    public static final <K, V> Map<K, V> toImmutableMap(Map<K, ? extends V> map) {
        vx2.m53591g(map, "<this>");
        if (map.isEmpty()) {
            return C6177b.m47361i();
        }
        Map<K, V> unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        vx2.m53590f(unmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        return unmodifiableMap;
    }

    public static final long toLongOrDefault(String str, long j) {
        vx2.m53591g(str, "<this>");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    public static final int toNonNegativeInt(String str, int i) {
        Long l;
        if (str == null) {
            l = null;
        } else {
            try {
                l = Long.valueOf(Long.parseLong(str));
            } catch (NumberFormatException unused) {
                return i;
            }
        }
        if (l == null) {
            return i;
        }
        long longValue = l.longValue();
        if (longValue > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (longValue < 0) {
            return 0;
        }
        return (int) longValue;
    }

    public static final String trimSubstring(String str, int i, int i2) {
        vx2.m53591g(str, "<this>");
        int indexOfFirstNonAsciiWhitespace = indexOfFirstNonAsciiWhitespace(str, i, i2);
        String substring = str.substring(indexOfFirstNonAsciiWhitespace, indexOfLastNonAsciiWhitespace(str, indexOfFirstNonAsciiWhitespace, i2));
        vx2.m53590f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String trimSubstring$default(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return trimSubstring(str, i, i2);
    }

    public static final void wait(Object obj) {
        vx2.m53591g(obj, "<this>");
        obj.wait();
    }

    public static final Throwable withSuppressed(Exception exc, List<? extends Exception> list) {
        vx2.m53591g(exc, "<this>");
        vx2.m53591g(list, ThrowableDeserializer.PROP_NAME_SUPPRESSED);
        if (list.size() > 1) {
            System.out.println(list);
        }
        for (Exception a : list) {
            ru1.m51326a(exc, a);
        }
        return exc;
    }

    public static final void writeMedium(v40 v40, int i) throws IOException {
        vx2.m53591g(v40, "<this>");
        v40.writeByte((i >>> 16) & 255);
        v40.writeByte((i >>> 8) & 255);
        v40.writeByte(i & 255);
    }

    public static final int delimiterOffset(String str, char c, int i, int i2) {
        vx2.m53591g(str, "<this>");
        while (i < i2) {
            int i3 = i + 1;
            if (str.charAt(i) == c) {
                return i;
            }
            i = i3;
        }
        return i2;
    }

    public static /* synthetic */ int delimiterOffset$default(String str, char c, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return delimiterOffset(str, c, i, i2);
    }

    public static final String toHexString(int i) {
        String hexString = Integer.toHexString(i);
        vx2.m53590f(hexString, "toHexString(this)");
        return hexString;
    }

    public static final void closeQuietly(Socket socket) {
        vx2.m53591g(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (!vx2.m53586b(e2.getMessage(), "bio == null")) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }

    public static final void closeQuietly(ServerSocket serverSocket) {
        vx2.m53591g(serverSocket, "<this>");
        try {
            serverSocket.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final int skipAll(m40 m40, byte b) {
        vx2.m53591g(m40, "<this>");
        int i = 0;
        while (!m40.mo56024I0() && m40.mo56066j(0) == b) {
            i++;
            m40.readByte();
        }
        return i;
    }
}
