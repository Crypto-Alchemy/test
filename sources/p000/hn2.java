package p000;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.CipherSuite;
import okhttp3.ConnectionSpec;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.logging.HttpLoggingInterceptor;
import org.web3j.protocol.exceptions.ClientConnectionException;

/* renamed from: hn2 */
/* compiled from: HttpService */
public class hn2 extends gx5 {
    private static final List<ConnectionSpec> CONNECTION_SPEC_LIST;
    public static final String DEFAULT_URL = "http://localhost:8545/";
    private static final CipherSuite[] INFURA_CIPHER_SUITES;
    private static final ConnectionSpec INFURA_CIPHER_SUITE_SPEC;
    public static final MediaType JSON_MEDIA_TYPE = MediaType.parse("application/json; charset=utf-8");
    private static final uk3 log = vk3.m73272i(hn2.class);
    private HashMap<String, String> headers;
    private OkHttpClient httpClient;
    private final boolean includeRawResponse;
    private final String url;

    static {
        CipherSuite[] cipherSuiteArr = {CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, CipherSuite.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256, CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_RSA_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_RSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_RSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_RSA_WITH_3DES_EDE_CBC_SHA, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256, CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384, CipherSuite.TLS_RSA_WITH_AES_128_CBC_SHA256, CipherSuite.TLS_RSA_WITH_AES_256_CBC_SHA256};
        INFURA_CIPHER_SUITES = cipherSuiteArr;
        ConnectionSpec build = new ConnectionSpec.Builder(ConnectionSpec.MODERN_TLS).cipherSuites(cipherSuiteArr).build();
        INFURA_CIPHER_SUITE_SPEC = build;
        CONNECTION_SPEC_LIST = Arrays.asList(new ConnectionSpec[]{build, ConnectionSpec.CLEARTEXT});
    }

    public hn2(String str, OkHttpClient okHttpClient, boolean z) {
        super(z);
        this.headers = new HashMap<>();
        this.url = str;
        this.httpClient = okHttpClient;
        this.includeRawResponse = z;
    }

    private Headers buildHeaders() {
        return Headers.m70302of((Map<String, String>) this.headers);
    }

    private InputStream buildInputStream(ResponseBody responseBody) throws IOException {
        InputStream byteStream = responseBody.byteStream();
        if (!this.includeRawResponse) {
            return byteStream;
        }
        w40 source = responseBody.source();
        source.request(Long.MAX_VALUE);
        long size = source.mo56019F().size();
        if (size <= 2147483647L) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(byteStream, (int) size);
            bufferedInputStream.mark(byteStream.available());
            return bufferedInputStream;
        }
        throw new UnsupportedOperationException("Non-integer input buffer size specified: " + size);
    }

    private static void configureLogging(OkHttpClient.Builder builder) {
        if (log.isDebugEnabled()) {
            HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(new gn2());
            httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
            builder.addInterceptor(httpLoggingInterceptor);
        }
    }

    private static OkHttpClient createOkHttpClient() {
        OkHttpClient.Builder connectionSpecs = new OkHttpClient.Builder().connectionSpecs(CONNECTION_SPEC_LIST);
        configureLogging(connectionSpecs);
        return connectionSpecs.build();
    }

    public void addHeader(String str, String str2) {
        this.headers.put(str, str2);
    }

    public void addHeaders(Map<String, String> map) {
        this.headers.putAll(map);
    }

    public void close() throws IOException {
    }

    public HashMap<String, String> getHeaders() {
        return this.headers;
    }

    public String getUrl() {
        return this.url;
    }

    public InputStream performIO(String str) throws IOException {
        String str2;
        Response execute = this.httpClient.newCall(new Request.Builder().url(this.url).headers(buildHeaders()).post(RequestBody.create(str, JSON_MEDIA_TYPE)).build()).execute();
        processHeaders(execute.headers());
        ResponseBody body = execute.body();
        if (!execute.isSuccessful()) {
            int code = execute.code();
            if (body == null) {
                str2 = xg5.MISSING_REASON;
            } else {
                str2 = body.string();
            }
            throw new ClientConnectionException("Invalid response received: " + code + "; " + str2);
        } else if (body != null) {
            return buildInputStream(body);
        } else {
            return null;
        }
    }

    public void processHeaders(Headers headers2) {
    }

    public hn2(OkHttpClient okHttpClient, boolean z) {
        this(DEFAULT_URL, okHttpClient, z);
    }

    public hn2(String str, OkHttpClient okHttpClient) {
        this(str, okHttpClient, false);
    }

    public hn2(String str) {
        this(str, createOkHttpClient());
    }

    public hn2(String str, boolean z) {
        this(str, createOkHttpClient(), z);
    }

    public hn2(OkHttpClient okHttpClient) {
        this(DEFAULT_URL, okHttpClient);
    }

    public hn2(boolean z) {
        this(DEFAULT_URL, z);
    }

    public hn2() {
        this(DEFAULT_URL);
    }
}
