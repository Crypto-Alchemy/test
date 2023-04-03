package okhttp3;

import com.fasterxml.jackson.core.JsonFactory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.internal.Util;
import okio.ByteString;
import org.web3j.ens.contracts.generated.PublicResolver;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 '2\u00020\u0001:\u0003(')B'\b\u0000\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u0018¢\u0006\u0004\b%\u0010&J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bJ\b\u0010\r\u001a\u00020\fH\u0016J\u000f\u0010\u0010\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0014\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0017\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u0018H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u001c\u001a\u00020\u0006H\u0016J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0017\u0010\u0010\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\u0010\u0010\"\u001a\u0004\b\u0010\u0010\u000fR\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u00188\u0007¢\u0006\f\n\u0004\b\u001b\u0010#\u001a\u0004\b\u001b\u0010\u001aR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\"R\u0016\u0010\u001c\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010$R\u0011\u0010\u0014\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0017\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0016¨\u0006*"}, mo44877d2 = {"Lokhttp3/MultipartBody;", "Lokhttp3/RequestBody;", "Lv40;", "sink", "", "countBytes", "", "writeOrCountBytes", "", "index", "Lokhttp3/MultipartBody$Part;", "part", "Lokhttp3/MediaType;", "contentType", "-deprecated_type", "()Lokhttp3/MediaType;", "type", "", "-deprecated_boundary", "()Ljava/lang/String;", "boundary", "-deprecated_size", "()I", "size", "", "-deprecated_parts", "()Ljava/util/List;", "parts", "contentLength", "Lr37;", "writeTo", "Lokio/ByteString;", "boundaryByteString", "Lokio/ByteString;", "Lokhttp3/MediaType;", "Ljava/util/List;", "J", "<init>", "(Lokio/ByteString;Lokhttp3/MediaType;Ljava/util/List;)V", "Companion", "Builder", "Part", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: MultipartBody.kt */
public final class MultipartBody extends RequestBody {
    public static final MediaType ALTERNATIVE;
    private static final byte[] COLONSPACE = {58, 32};
    private static final byte[] CRLF = {13, 10};
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final byte[] DASHDASH = {45, 45};
    public static final MediaType DIGEST;
    public static final MediaType FORM;
    public static final MediaType MIXED;
    public static final MediaType PARALLEL;
    private final ByteString boundaryByteString;
    private long contentLength = -1;
    private final MediaType contentType;
    private final List<Part> parts;
    private final MediaType type;

    @Metadata(mo44876d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003J \u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000f\u001a\u00020\u0010J\u0018\u0010\u0011\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\bJ\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, mo44877d2 = {"Lokhttp3/MultipartBody$Builder;", "", "boundary", "", "(Ljava/lang/String;)V", "Lokio/ByteString;", "parts", "", "Lokhttp3/MultipartBody$Part;", "type", "Lokhttp3/MediaType;", "addFormDataPart", "name", "value", "filename", "body", "Lokhttp3/RequestBody;", "addPart", "headers", "Lokhttp3/Headers;", "part", "build", "Lokhttp3/MultipartBody;", "setType", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0}, mo44881xi = 48)
    /* compiled from: MultipartBody.kt */
    public static final class Builder {
        private final ByteString boundary;
        private final List<Part> parts;
        private MediaType type;

        public Builder() {
            this((String) null, 1, (DefaultConstructorMarker) null);
        }

        public Builder(String str) {
            vx2.m53591g(str, "boundary");
            this.boundary = ByteString.Companion.mo64480d(str);
            this.type = MultipartBody.MIXED;
            this.parts = new ArrayList();
        }

        public final Builder addFormDataPart(String str, String str2) {
            vx2.m53591g(str, PublicResolver.FUNC_NAME);
            vx2.m53591g(str2, "value");
            addPart(Part.Companion.createFormData(str, str2));
            return this;
        }

        public final Builder addPart(RequestBody requestBody) {
            vx2.m53591g(requestBody, "body");
            addPart(Part.Companion.create(requestBody));
            return this;
        }

        public final MultipartBody build() {
            if (!this.parts.isEmpty()) {
                return new MultipartBody(this.boundary, this.type, Util.toImmutableList(this.parts));
            }
            throw new IllegalStateException("Multipart body must have at least one part.".toString());
        }

        public final Builder setType(MediaType mediaType) {
            vx2.m53591g(mediaType, "type");
            if (vx2.m53586b(mediaType.type(), "multipart")) {
                this.type = mediaType;
                return this;
            }
            throw new IllegalArgumentException(vx2.m53598n("multipart != ", mediaType).toString());
        }

        public final Builder addFormDataPart(String str, String str2, RequestBody requestBody) {
            vx2.m53591g(str, PublicResolver.FUNC_NAME);
            vx2.m53591g(requestBody, "body");
            addPart(Part.Companion.createFormData(str, str2, requestBody));
            return this;
        }

        public final Builder addPart(Headers headers, RequestBody requestBody) {
            vx2.m53591g(requestBody, "body");
            addPart(Part.Companion.create(headers, requestBody));
            return this;
        }

        public final Builder addPart(Part part) {
            vx2.m53591g(part, "part");
            this.parts.add(part);
            return this;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ Builder(java.lang.String r1, int r2, kotlin.jvm.internal.DefaultConstructorMarker r3) {
            /*
                r0 = this;
                r2 = r2 & 1
                if (r2 == 0) goto L_0x0011
                java.util.UUID r1 = java.util.UUID.randomUUID()
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "randomUUID().toString()"
                p000.vx2.m53590f(r1, r2)
            L_0x0011:
                r0.<init>(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.MultipartBody.Builder.<init>(java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\t\u001a\u00020\u0006*\u00060\u0002j\u0002`\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\n8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u0014\u0010\u0013\u001a\u00020\n8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u0014\u0010\u0014\u001a\u00020\n8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u0014\u0010\u0015\u001a\u00020\n8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\f¨\u0006\u0018"}, mo44877d2 = {"Lokhttp3/MultipartBody$Companion;", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "", "key", "Lr37;", "appendQuotedString$okhttp", "(Ljava/lang/StringBuilder;Ljava/lang/String;)V", "appendQuotedString", "Lokhttp3/MediaType;", "ALTERNATIVE", "Lokhttp3/MediaType;", "", "COLONSPACE", "[B", "CRLF", "DASHDASH", "DIGEST", "FORM", "MIXED", "PARALLEL", "<init>", "()V", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* compiled from: MultipartBody.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void appendQuotedString$okhttp(StringBuilder sb, String str) {
            vx2.m53591g(sb, "<this>");
            vx2.m53591g(str, "key");
            sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
            int length = str.length();
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                char charAt = str.charAt(i);
                if (charAt == 10) {
                    sb.append("%0A");
                } else if (charAt == 13) {
                    sb.append("%0D");
                } else if (charAt == '\"') {
                    sb.append("%22");
                } else {
                    sb.append(charAt);
                }
                i = i2;
            }
            sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
        }
    }

    @Metadata(mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0019\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\r\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\b\tJ\u000f\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b\nR\u0013\u0010\u0004\u001a\u00020\u00058\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\b¨\u0006\f"}, mo44877d2 = {"Lokhttp3/MultipartBody$Part;", "", "headers", "Lokhttp3/Headers;", "body", "Lokhttp3/RequestBody;", "(Lokhttp3/Headers;Lokhttp3/RequestBody;)V", "()Lokhttp3/RequestBody;", "()Lokhttp3/Headers;", "-deprecated_body", "-deprecated_headers", "Companion", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0}, mo44881xi = 48)
    /* compiled from: MultipartBody.kt */
    public static final class Part {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        private final RequestBody body;
        private final Headers headers;

        @Metadata(mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0007J\"\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\u000e"}, mo44877d2 = {"Lokhttp3/MultipartBody$Part$Companion;", "", "()V", "create", "Lokhttp3/MultipartBody$Part;", "headers", "Lokhttp3/Headers;", "body", "Lokhttp3/RequestBody;", "createFormData", "name", "", "value", "filename", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0}, mo44881xi = 48)
        /* compiled from: MultipartBody.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Part create(RequestBody requestBody) {
                vx2.m53591g(requestBody, "body");
                return create((Headers) null, requestBody);
            }

            public final Part createFormData(String str, String str2) {
                vx2.m53591g(str, PublicResolver.FUNC_NAME);
                vx2.m53591g(str2, "value");
                return createFormData(str, (String) null, RequestBody.Companion.create$default(RequestBody.Companion, str2, (MediaType) null, 1, (Object) null));
            }

            public final Part create(Headers headers, RequestBody requestBody) {
                String str;
                vx2.m53591g(requestBody, "body");
                boolean z = true;
                if ((headers == null ? null : headers.get("Content-Type")) == null) {
                    if (headers == null) {
                        str = null;
                    } else {
                        str = headers.get("Content-Length");
                    }
                    if (str != null) {
                        z = false;
                    }
                    if (z) {
                        return new Part(headers, requestBody, (DefaultConstructorMarker) null);
                    }
                    throw new IllegalArgumentException("Unexpected header: Content-Length".toString());
                }
                throw new IllegalArgumentException("Unexpected header: Content-Type".toString());
            }

            public final Part createFormData(String str, String str2, RequestBody requestBody) {
                vx2.m53591g(str, PublicResolver.FUNC_NAME);
                vx2.m53591g(requestBody, "body");
                StringBuilder sb = new StringBuilder();
                sb.append("form-data; name=");
                Companion companion = MultipartBody.Companion;
                companion.appendQuotedString$okhttp(sb, str);
                if (str2 != null) {
                    sb.append("; filename=");
                    companion.appendQuotedString$okhttp(sb, str2);
                }
                String sb2 = sb.toString();
                vx2.m53590f(sb2, "StringBuilder().apply(builderAction).toString()");
                return create(new Headers.Builder().addUnsafeNonAscii("Content-Disposition", sb2).build(), requestBody);
            }
        }

        private Part(Headers headers2, RequestBody requestBody) {
            this.headers = headers2;
            this.body = requestBody;
        }

        public /* synthetic */ Part(Headers headers2, RequestBody requestBody, DefaultConstructorMarker defaultConstructorMarker) {
            this(headers2, requestBody);
        }

        public static final Part create(Headers headers2, RequestBody requestBody) {
            return Companion.create(headers2, requestBody);
        }

        public static final Part create(RequestBody requestBody) {
            return Companion.create(requestBody);
        }

        public static final Part createFormData(String str, String str2) {
            return Companion.createFormData(str, str2);
        }

        public static final Part createFormData(String str, String str2, RequestBody requestBody) {
            return Companion.createFormData(str, str2, requestBody);
        }

        /* renamed from: -deprecated_body  reason: not valid java name */
        public final RequestBody m75728deprecated_body() {
            return this.body;
        }

        /* renamed from: -deprecated_headers  reason: not valid java name */
        public final Headers m75729deprecated_headers() {
            return this.headers;
        }

        public final RequestBody body() {
            return this.body;
        }

        public final Headers headers() {
            return this.headers;
        }
    }

    static {
        MediaType.Companion companion = MediaType.Companion;
        MIXED = companion.get("multipart/mixed");
        ALTERNATIVE = companion.get("multipart/alternative");
        DIGEST = companion.get("multipart/digest");
        PARALLEL = companion.get("multipart/parallel");
        FORM = companion.get("multipart/form-data");
    }

    public MultipartBody(ByteString byteString, MediaType mediaType, List<Part> list) {
        vx2.m53591g(byteString, "boundaryByteString");
        vx2.m53591g(mediaType, "type");
        vx2.m53591g(list, "parts");
        this.boundaryByteString = byteString;
        this.type = mediaType;
        this.parts = list;
        MediaType.Companion companion = MediaType.Companion;
        this.contentType = companion.get(mediaType + "; boundary=" + boundary());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: v40} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: m40} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: m40} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: v40} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: m40} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long writeOrCountBytes(p000.v40 r14, boolean r15) throws java.io.IOException {
        /*
            r13 = this;
            if (r15 == 0) goto L_0x0009
            m40 r14 = new m40
            r14.<init>()
            r0 = r14
            goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            java.util.List<okhttp3.MultipartBody$Part> r1 = r13.parts
            int r1 = r1.size()
            r2 = 0
            r3 = 0
            r5 = r2
        L_0x0014:
            if (r5 >= r1) goto L_0x00b0
            int r6 = r5 + 1
            java.util.List<okhttp3.MultipartBody$Part> r7 = r13.parts
            java.lang.Object r5 = r7.get(r5)
            okhttp3.MultipartBody$Part r5 = (okhttp3.MultipartBody.Part) r5
            okhttp3.Headers r7 = r5.headers()
            okhttp3.RequestBody r5 = r5.body()
            p000.vx2.m53588d(r14)
            byte[] r8 = DASHDASH
            r14.write(r8)
            okio.ByteString r8 = r13.boundaryByteString
            r14.mo56054e1(r8)
            byte[] r8 = CRLF
            r14.write(r8)
            if (r7 == 0) goto L_0x0062
            int r8 = r7.size()
            r9 = r2
        L_0x0041:
            if (r9 >= r8) goto L_0x0062
            int r10 = r9 + 1
            java.lang.String r11 = r7.name(r9)
            v40 r11 = r14.mo56044Z(r11)
            byte[] r12 = COLONSPACE
            v40 r11 = r11.write(r12)
            java.lang.String r9 = r7.value(r9)
            v40 r9 = r11.mo56044Z(r9)
            byte[] r11 = CRLF
            r9.write(r11)
            r9 = r10
            goto L_0x0041
        L_0x0062:
            okhttp3.MediaType r7 = r5.contentType()
            if (r7 == 0) goto L_0x007b
            java.lang.String r8 = "Content-Type: "
            v40 r8 = r14.mo56044Z(r8)
            java.lang.String r7 = r7.toString()
            v40 r7 = r8.mo56044Z(r7)
            byte[] r8 = CRLF
            r7.write(r8)
        L_0x007b:
            long r7 = r5.contentLength()
            r9 = -1
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x0095
            java.lang.String r9 = "Content-Length: "
            v40 r9 = r14.mo56044Z(r9)
            v40 r9 = r9.mo56096w0(r7)
            byte[] r10 = CRLF
            r9.write(r10)
            goto L_0x009e
        L_0x0095:
            if (r15 == 0) goto L_0x009e
            p000.vx2.m53588d(r0)
            r0.mo56045a()
            return r9
        L_0x009e:
            byte[] r9 = CRLF
            r14.write(r9)
            if (r15 == 0) goto L_0x00a7
            long r3 = r3 + r7
            goto L_0x00aa
        L_0x00a7:
            r5.writeTo(r14)
        L_0x00aa:
            r14.write(r9)
            r5 = r6
            goto L_0x0014
        L_0x00b0:
            p000.vx2.m53588d(r14)
            byte[] r1 = DASHDASH
            r14.write(r1)
            okio.ByteString r2 = r13.boundaryByteString
            r14.mo56054e1(r2)
            r14.write(r1)
            byte[] r1 = CRLF
            r14.write(r1)
            if (r15 == 0) goto L_0x00d2
            p000.vx2.m53588d(r0)
            long r14 = r0.size()
            long r3 = r3 + r14
            r0.mo56045a()
        L_0x00d2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.MultipartBody.writeOrCountBytes(v40, boolean):long");
    }

    /* renamed from: -deprecated_boundary  reason: not valid java name */
    public final String m75724deprecated_boundary() {
        return boundary();
    }

    /* renamed from: -deprecated_parts  reason: not valid java name */
    public final List<Part> m75725deprecated_parts() {
        return this.parts;
    }

    /* renamed from: -deprecated_size  reason: not valid java name */
    public final int m75726deprecated_size() {
        return size();
    }

    /* renamed from: -deprecated_type  reason: not valid java name */
    public final MediaType m75727deprecated_type() {
        return this.type;
    }

    public final String boundary() {
        return this.boundaryByteString.utf8();
    }

    public long contentLength() throws IOException {
        long j = this.contentLength;
        if (j != -1) {
            return j;
        }
        long writeOrCountBytes = writeOrCountBytes((v40) null, true);
        this.contentLength = writeOrCountBytes;
        return writeOrCountBytes;
    }

    public MediaType contentType() {
        return this.contentType;
    }

    public final Part part(int i) {
        return this.parts.get(i);
    }

    public final List<Part> parts() {
        return this.parts;
    }

    public final int size() {
        return this.parts.size();
    }

    public final MediaType type() {
        return this.type;
    }

    public void writeTo(v40 v40) throws IOException {
        vx2.m53591g(v40, "sink");
        writeOrCountBytes(v40, false);
    }
}
