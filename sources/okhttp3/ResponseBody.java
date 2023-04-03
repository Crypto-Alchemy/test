package okhttp3;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.MediaType;
import okhttp3.internal.Util;
import okio.ByteString;
import org.web3j.ens.contracts.generated.PublicResolver;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u0007¢\u0006\u0004\b \u0010!JB\u0010\t\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0004H\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\f\u001a\u00020\u000bH\u0002J\n\u0010\u000e\u001a\u0004\u0018\u00010\rH&J\b\u0010\u0010\u001a\u00020\u000fH&J\u0006\u0010\u0012\u001a\u00020\u0011J\b\u0010\u0013\u001a\u00020\u0005H&J\u0006\u0010\u0015\u001a\u00020\u0014J\u0006\u0010\u0017\u001a\u00020\u0016J\u0006\u0010\u0019\u001a\u00020\u0018J\u0006\u0010\u001b\u001a\u00020\u001aJ\b\u0010\u001d\u001a\u00020\u001cH\u0016R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006$"}, mo44877d2 = {"Lokhttp3/ResponseBody;", "Ljava/io/Closeable;", "", "T", "Lkotlin/Function1;", "Lw40;", "consumer", "", "sizeMapper", "consumeSource", "(Lrc2;Lrc2;)Ljava/lang/Object;", "Ljava/nio/charset/Charset;", "charset", "Lokhttp3/MediaType;", "contentType", "", "contentLength", "Ljava/io/InputStream;", "byteStream", "source", "", "bytes", "Lokio/ByteString;", "byteString", "Ljava/io/Reader;", "charStream", "", "string", "Lr37;", "close", "reader", "Ljava/io/Reader;", "<init>", "()V", "Companion", "BomAwareReader", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: ResponseBody.kt */
public abstract class ResponseBody implements Closeable {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private Reader reader;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, mo44877d2 = {"Lokhttp3/ResponseBody$BomAwareReader;", "Ljava/io/Reader;", "", "cbuf", "", "off", "len", "read", "Lr37;", "close", "Lw40;", "source", "Lw40;", "Ljava/nio/charset/Charset;", "charset", "Ljava/nio/charset/Charset;", "", "closed", "Z", "delegate", "Ljava/io/Reader;", "<init>", "(Lw40;Ljava/nio/charset/Charset;)V", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* compiled from: ResponseBody.kt */
    public static final class BomAwareReader extends Reader {
        private final Charset charset;
        private boolean closed;
        private Reader delegate;
        private final w40 source;

        public BomAwareReader(w40 w40, Charset charset2) {
            vx2.m53591g(w40, "source");
            vx2.m53591g(charset2, "charset");
            this.source = w40;
            this.charset = charset2;
        }

        public void close() throws IOException {
            r37 r37;
            this.closed = true;
            Reader reader = this.delegate;
            if (reader == null) {
                r37 = null;
            } else {
                reader.close();
                r37 = r37.f33317a;
            }
            if (r37 == null) {
                this.source.close();
            }
        }

        public int read(char[] cArr, int i, int i2) throws IOException {
            vx2.m53591g(cArr, "cbuf");
            if (!this.closed) {
                Reader reader = this.delegate;
                if (reader == null) {
                    reader = new InputStreamReader(this.source.mo56078p1(), Util.readBomAsCharset(this.source, this.charset));
                    this.delegate = reader;
                }
                return reader.read(cArr, i, i2);
            }
            throw new IOException("Stream closed");
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\b\u001a\u00020\u0005*\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u0005*\u00020\t2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\nJ\u001f\u0010\b\u001a\u00020\u0005*\u00020\u000b2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\fJ)\u0010\u0011\u001a\u00020\u0005*\u00020\r2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0006\u0010\u0010J\u001a\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0012\u001a\u00020\u0002H\u0007J\u001a\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0012\u001a\u00020\tH\u0007J\u001a\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0012\u001a\u00020\u000bH\u0007J\"\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\rH\u0007¨\u0006\u0015"}, mo44877d2 = {"Lokhttp3/ResponseBody$Companion;", "", "", "Lokhttp3/MediaType;", "contentType", "Lokhttp3/ResponseBody;", "create", "(Ljava/lang/String;Lokhttp3/MediaType;)Lokhttp3/ResponseBody;", "toResponseBody", "", "([BLokhttp3/MediaType;)Lokhttp3/ResponseBody;", "Lokio/ByteString;", "(Lokio/ByteString;Lokhttp3/MediaType;)Lokhttp3/ResponseBody;", "Lw40;", "", "contentLength", "(Lw40;Lokhttp3/MediaType;J)Lokhttp3/ResponseBody;", "asResponseBody", "content", "<init>", "()V", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* compiled from: ResponseBody.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, String str, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(str, mediaType);
        }

        public final ResponseBody create(String str, MediaType mediaType) {
            vx2.m53591g(str, "<this>");
            Charset charset = ae0.f36435b;
            if (mediaType != null) {
                Charset charset$default = MediaType.charset$default(mediaType, (Charset) null, 1, (Object) null);
                if (charset$default == null) {
                    MediaType.Companion companion = MediaType.Companion;
                    mediaType = companion.parse(mediaType + "; charset=utf-8");
                } else {
                    charset = charset$default;
                }
            }
            m40 o0 = new m40().mo56074o0(str, charset);
            return create((w40) o0, mediaType, o0.size());
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, byte[] bArr, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(bArr, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, ByteString byteString, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(byteString, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, w40 w40, MediaType mediaType, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            if ((i & 2) != 0) {
                j = -1;
            }
            return companion.create(w40, mediaType, j);
        }

        public final ResponseBody create(byte[] bArr, MediaType mediaType) {
            vx2.m53591g(bArr, "<this>");
            return create((w40) new m40().write(bArr), mediaType, (long) bArr.length);
        }

        public final ResponseBody create(ByteString byteString, MediaType mediaType) {
            vx2.m53591g(byteString, "<this>");
            return create((w40) new m40().mo56054e1(byteString), mediaType, (long) byteString.size());
        }

        public final ResponseBody create(w40 w40, MediaType mediaType, long j) {
            vx2.m53591g(w40, "<this>");
            return new ResponseBody$Companion$asResponseBody$1(mediaType, j, w40);
        }

        public final ResponseBody create(MediaType mediaType, String str) {
            vx2.m53591g(str, PublicResolver.FUNC_CONTENT);
            return create(str, mediaType);
        }

        public final ResponseBody create(MediaType mediaType, byte[] bArr) {
            vx2.m53591g(bArr, PublicResolver.FUNC_CONTENT);
            return create(bArr, mediaType);
        }

        public final ResponseBody create(MediaType mediaType, ByteString byteString) {
            vx2.m53591g(byteString, PublicResolver.FUNC_CONTENT);
            return create(byteString, mediaType);
        }

        public final ResponseBody create(MediaType mediaType, long j, w40 w40) {
            vx2.m53591g(w40, PublicResolver.FUNC_CONTENT);
            return create(w40, mediaType, j);
        }
    }

    private final Charset charset() {
        Charset charset;
        MediaType contentType = contentType();
        if (contentType == null) {
            charset = null;
        } else {
            charset = contentType.charset(ae0.f36435b);
        }
        if (charset == null) {
            return ae0.f36435b;
        }
        return charset;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005b, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005c, code lost:
        p000.pu2.m50113b(1);
        p000.lh0.m47807a(r2, r6);
        p000.pu2.m50112a(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0065, code lost:
        throw r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final <T> T consumeSource(p000.rc2<? super p000.w40, ? extends T> r6, p000.rc2<? super T, java.lang.Integer> r7) {
        /*
            r5 = this;
            long r0 = r5.contentLength()
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x0066
            w40 r2 = r5.source()
            r3 = 0
            r4 = 1
            java.lang.Object r6 = r6.invoke(r2)     // Catch:{ all -> 0x0059 }
            p000.pu2.m50113b(r4)
            p000.lh0.m47807a(r2, r3)
            p000.pu2.m50112a(r4)
            java.lang.Object r7 = r7.invoke(r6)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0058
            long r2 = (long) r7
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x0034
            goto L_0x0058
        L_0x0034:
            java.io.IOException r6 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Content-Length ("
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ") and stream length ("
            r2.append(r0)
            r2.append(r7)
            java.lang.String r7 = ") disagree"
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            r6.<init>(r7)
            throw r6
        L_0x0058:
            return r6
        L_0x0059:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x005b }
        L_0x005b:
            r7 = move-exception
            p000.pu2.m50113b(r4)
            p000.lh0.m47807a(r2, r6)
            p000.pu2.m50112a(r4)
            throw r7
        L_0x0066:
            java.io.IOException r6 = new java.io.IOException
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "Cannot buffer entire body for content length: "
            java.lang.String r7 = p000.vx2.m53598n(r0, r7)
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.ResponseBody.consumeSource(rc2, rc2):java.lang.Object");
    }

    public static final ResponseBody create(String str, MediaType mediaType) {
        return Companion.create(str, mediaType);
    }

    public static final ResponseBody create(MediaType mediaType, long j, w40 w40) {
        return Companion.create(mediaType, j, w40);
    }

    public static final ResponseBody create(MediaType mediaType, String str) {
        return Companion.create(mediaType, str);
    }

    public static final ResponseBody create(MediaType mediaType, ByteString byteString) {
        return Companion.create(mediaType, byteString);
    }

    public static final ResponseBody create(MediaType mediaType, byte[] bArr) {
        return Companion.create(mediaType, bArr);
    }

    public static final ResponseBody create(ByteString byteString, MediaType mediaType) {
        return Companion.create(byteString, mediaType);
    }

    public static final ResponseBody create(w40 w40, MediaType mediaType, long j) {
        return Companion.create(w40, mediaType, j);
    }

    public static final ResponseBody create(byte[] bArr, MediaType mediaType) {
        return Companion.create(bArr, mediaType);
    }

    public final InputStream byteStream() {
        return source().mo56078p1();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004f, code lost:
        p000.lh0.m47807a(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0052, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final okio.ByteString byteString() throws java.io.IOException {
        /*
            r7 = this;
            long r0 = r7.contentLength()
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x0053
            w40 r2 = r7.source()
            r3 = 0
            okio.ByteString r4 = r2.mo56042V0()     // Catch:{ all -> 0x004c }
            p000.lh0.m47807a(r2, r3)
            int r2 = r4.size()
            r5 = -1
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x004b
            long r5 = (long) r2
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x0027
            goto L_0x004b
        L_0x0027:
            java.io.IOException r3 = new java.io.IOException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Content-Length ("
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = ") and stream length ("
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = ") disagree"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r3.<init>(r0)
            throw r3
        L_0x004b:
            return r4
        L_0x004c:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004e }
        L_0x004e:
            r1 = move-exception
            p000.lh0.m47807a(r2, r0)
            throw r1
        L_0x0053:
            java.io.IOException r2 = new java.io.IOException
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = "Cannot buffer entire body for content length: "
            java.lang.String r0 = p000.vx2.m53598n(r1, r0)
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.ResponseBody.byteString():okio.ByteString");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004b, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
        p000.lh0.m47807a(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004f, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] bytes() throws java.io.IOException {
        /*
            r7 = this;
            long r0 = r7.contentLength()
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x0050
            w40 r2 = r7.source()
            r3 = 0
            byte[] r4 = r2.mo56020F0()     // Catch:{ all -> 0x0049 }
            p000.lh0.m47807a(r2, r3)
            int r2 = r4.length
            r5 = -1
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x0048
            long r5 = (long) r2
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x0024
            goto L_0x0048
        L_0x0024:
            java.io.IOException r3 = new java.io.IOException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Content-Length ("
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = ") and stream length ("
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = ") disagree"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r3.<init>(r0)
            throw r3
        L_0x0048:
            return r4
        L_0x0049:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004b }
        L_0x004b:
            r1 = move-exception
            p000.lh0.m47807a(r2, r0)
            throw r1
        L_0x0050:
            java.io.IOException r2 = new java.io.IOException
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = "Cannot buffer entire body for content length: "
            java.lang.String r0 = p000.vx2.m53598n(r1, r0)
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.ResponseBody.bytes():byte[]");
    }

    public final Reader charStream() {
        Reader reader2 = this.reader;
        if (reader2 != null) {
            return reader2;
        }
        BomAwareReader bomAwareReader = new BomAwareReader(source(), charset());
        this.reader = bomAwareReader;
        return bomAwareReader;
    }

    public void close() {
        Util.closeQuietly((Closeable) source());
    }

    public abstract long contentLength();

    public abstract MediaType contentType();

    public abstract w40 source();

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        p000.lh0.m47807a(r0, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String string() throws java.io.IOException {
        /*
            r3 = this;
            w40 r0 = r3.source()
            java.nio.charset.Charset r1 = r3.charset()     // Catch:{ all -> 0x0015 }
            java.nio.charset.Charset r1 = okhttp3.internal.Util.readBomAsCharset(r0, r1)     // Catch:{ all -> 0x0015 }
            java.lang.String r1 = r0.mo56038T0(r1)     // Catch:{ all -> 0x0015 }
            r2 = 0
            p000.lh0.m47807a(r0, r2)
            return r1
        L_0x0015:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0017 }
        L_0x0017:
            r2 = move-exception
            p000.lh0.m47807a(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.ResponseBody.string():java.lang.String");
    }
}
