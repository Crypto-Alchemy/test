package okhttp3.internal.publicsuffix;

import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.internal.Util;
import org.slf4j.Marker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\bH\u0002J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u000f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\r\u0010\u0016R\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016¨\u0006\u001a"}, mo44877d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "", "domain", "", "splitDomain", "domainLabels", "findMatchingRule", "Lr37;", "readTheListUninterruptibly", "readTheList", "getEffectiveTldPlusOne", "", "publicSuffixListBytes", "publicSuffixExceptionListBytes", "setListBytes", "Ljava/util/concurrent/atomic/AtomicBoolean;", "listRead", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/CountDownLatch;", "readCompleteLatch", "Ljava/util/concurrent/CountDownLatch;", "[B", "<init>", "()V", "Companion", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: PublicSuffixDatabase.kt */
public final class PublicSuffixDatabase {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final char EXCEPTION_MARKER = '!';
    private static final List<String> PREVAILING_RULE = bk0.m32598e(Marker.ANY_MARKER);
    public static final String PUBLIC_SUFFIX_RESOURCE = "publicsuffixes.gz";
    private static final byte[] WILDCARD_LABEL = {42};
    /* access modifiers changed from: private */
    public static final PublicSuffixDatabase instance = new PublicSuffixDatabase();
    private final AtomicBoolean listRead = new AtomicBoolean(false);
    private byte[] publicSuffixExceptionListBytes;
    private byte[] publicSuffixListBytes;
    private final CountDownLatch readCompleteLatch = new CountDownLatch(1);

    @Metadata(mo44876d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\fJ)\u0010\u000e\u001a\u0004\u0018\u00010\u0007*\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, mo44877d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase$Companion;", "", "()V", "EXCEPTION_MARKER", "", "PREVAILING_RULE", "", "", "PUBLIC_SUFFIX_RESOURCE", "WILDCARD_LABEL", "", "instance", "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "get", "binarySearch", "labels", "", "labelIndex", "", "([B[[BI)Ljava/lang/String;", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0}, mo44881xi = 48)
    /* compiled from: PublicSuffixDatabase.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final String binarySearch(byte[] bArr, byte[][] bArr2, int i) {
            int i2;
            boolean z;
            int i3;
            int and;
            byte[] bArr3 = bArr;
            byte[][] bArr4 = bArr2;
            int length = bArr3.length;
            int i4 = 0;
            while (i4 < length) {
                int i5 = (i4 + length) / 2;
                while (i5 > -1 && bArr3[i5] != 10) {
                    i5--;
                }
                int i6 = i5 + 1;
                int i7 = 1;
                while (true) {
                    i2 = i6 + i7;
                    if (bArr3[i2] == 10) {
                        break;
                    }
                    i7++;
                }
                int i8 = i2 - i6;
                int i9 = i;
                boolean z2 = false;
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (z2) {
                        i3 = 46;
                        z = false;
                    } else {
                        z = z2;
                        i3 = Util.and(bArr4[i9][i10], 255);
                    }
                    and = i3 - Util.and(bArr3[i6 + i11], 255);
                    if (and == 0) {
                        i11++;
                        i10++;
                        if (i11 == i8) {
                            break;
                        } else if (bArr4[i9].length != i10) {
                            z2 = z;
                        } else if (i9 == bArr4.length - 1) {
                            break;
                        } else {
                            i9++;
                            i10 = -1;
                            z2 = true;
                        }
                    } else {
                        break;
                    }
                }
                if (and >= 0) {
                    if (and <= 0) {
                        int i12 = i8 - i11;
                        int length2 = bArr4[i9].length - i10;
                        int length3 = bArr4.length;
                        for (int i13 = i9 + 1; i13 < length3; i13++) {
                            length2 += bArr4[i13].length;
                        }
                        if (length2 >= i12) {
                            if (length2 <= i12) {
                                Charset charset = StandardCharsets.UTF_8;
                                vx2.m53590f(charset, "UTF_8");
                                return new String(bArr3, i6, i8, charset);
                            }
                        }
                    }
                    i4 = i2 + 1;
                }
                length = i6 - 1;
            }
            return null;
        }

        public final PublicSuffixDatabase get() {
            return PublicSuffixDatabase.instance;
        }
    }

    private final List<String> findMatchingRule(List<String> list) {
        boolean z;
        List<String> list2;
        String str;
        String str2;
        String str3;
        List<String> list3;
        if (this.listRead.get() || !this.listRead.compareAndSet(false, true)) {
            try {
                this.readCompleteLatch.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            readTheListUninterruptibly();
        }
        if (this.publicSuffixListBytes != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int size = list.size();
            byte[][] bArr = new byte[size][];
            for (int i = 0; i < size; i++) {
                Charset charset = StandardCharsets.UTF_8;
                vx2.m53590f(charset, "UTF_8");
                byte[] bytes = list.get(i).getBytes(charset);
                vx2.m53590f(bytes, "this as java.lang.String).getBytes(charset)");
                bArr[i] = bytes;
            }
            int i2 = 0;
            while (true) {
                list2 = null;
                if (i2 >= size) {
                    str = null;
                    break;
                }
                int i3 = i2 + 1;
                Companion companion = Companion;
                byte[] bArr2 = this.publicSuffixListBytes;
                if (bArr2 == null) {
                    vx2.m53605u("publicSuffixListBytes");
                    bArr2 = null;
                }
                String access$binarySearch = companion.binarySearch(bArr2, bArr, i2);
                if (access$binarySearch != null) {
                    str = access$binarySearch;
                    break;
                }
                i2 = i3;
            }
            if (size > 1) {
                byte[][] bArr3 = (byte[][]) bArr.clone();
                int length = bArr3.length - 1;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        break;
                    }
                    int i5 = i4 + 1;
                    bArr3[i4] = WILDCARD_LABEL;
                    Companion companion2 = Companion;
                    byte[] bArr4 = this.publicSuffixListBytes;
                    if (bArr4 == null) {
                        vx2.m53605u("publicSuffixListBytes");
                        bArr4 = null;
                    }
                    String access$binarySearch2 = companion2.binarySearch(bArr4, bArr3, i4);
                    if (access$binarySearch2 != null) {
                        str2 = access$binarySearch2;
                        break;
                    }
                    i4 = i5;
                }
            }
            str2 = null;
            if (str2 != null) {
                int i6 = size - 1;
                int i7 = 0;
                while (true) {
                    if (i7 >= i6) {
                        break;
                    }
                    int i8 = i7 + 1;
                    Companion companion3 = Companion;
                    byte[] bArr5 = this.publicSuffixExceptionListBytes;
                    if (bArr5 == null) {
                        vx2.m53605u("publicSuffixExceptionListBytes");
                        bArr5 = null;
                    }
                    str3 = companion3.binarySearch(bArr5, bArr, i7);
                    if (str3 != null) {
                        break;
                    }
                    i7 = i8;
                }
            }
            str3 = null;
            if (str3 != null) {
                return StringsKt__StringsKt.m63060A0(vx2.m53598n("!", str3), new char[]{'.'}, false, 0, 6, (Object) null);
            } else if (str == null && str2 == null) {
                return PREVAILING_RULE;
            } else {
                if (str == null) {
                    list3 = null;
                } else {
                    list3 = StringsKt__StringsKt.m63060A0(str, new char[]{'.'}, false, 0, 6, (Object) null);
                }
                if (list3 == null) {
                    list3 = ck0.m33062j();
                }
                if (str2 != null) {
                    list2 = StringsKt__StringsKt.m63060A0(str2, new char[]{'.'}, false, 0, 6, (Object) null);
                }
                if (list2 == null) {
                    list2 = ck0.m33062j();
                }
                if (list3.size() > list2.size()) {
                    return list3;
                }
                return list2;
            }
        } else {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.".toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0047, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        p000.lh0.m47807a(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004b, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void readTheList() throws java.io.IOException {
        /*
            r5 = this;
            java.lang.Class<okhttp3.internal.publicsuffix.PublicSuffixDatabase> r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.class
            java.lang.String r1 = "publicsuffixes.gz"
            java.io.InputStream r0 = r0.getResourceAsStream(r1)
            if (r0 != 0) goto L_0x000b
            return
        L_0x000b:
            ck2 r1 = new ck2
            z56 r0 = p000.sg4.m71937l(r0)
            r1.<init>(r0)
            w40 r0 = p000.sg4.m71929d(r1)
            r1 = 0
            int r2 = r0.readInt()     // Catch:{ all -> 0x0045 }
            long r2 = (long) r2     // Catch:{ all -> 0x0045 }
            byte[] r2 = r0.mo56077p0(r2)     // Catch:{ all -> 0x0045 }
            int r3 = r0.readInt()     // Catch:{ all -> 0x0045 }
            long r3 = (long) r3     // Catch:{ all -> 0x0045 }
            byte[] r3 = r0.mo56077p0(r3)     // Catch:{ all -> 0x0045 }
            r37 r4 = p000.r37.f33317a     // Catch:{ all -> 0x0045 }
            p000.lh0.m47807a(r0, r1)
            monitor-enter(r5)
            p000.vx2.m53588d(r2)     // Catch:{ all -> 0x0042 }
            r5.publicSuffixListBytes = r2     // Catch:{ all -> 0x0042 }
            p000.vx2.m53588d(r3)     // Catch:{ all -> 0x0042 }
            r5.publicSuffixExceptionListBytes = r3     // Catch:{ all -> 0x0042 }
            monitor-exit(r5)
            java.util.concurrent.CountDownLatch r0 = r5.readCompleteLatch
            r0.countDown()
            return
        L_0x0042:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0045:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0047 }
        L_0x0047:
            r2 = move-exception
            p000.lh0.m47807a(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.readTheList():void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0027 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void readTheListUninterruptibly() {
        /*
            r5 = this;
            r0 = 0
        L_0x0001:
            r5.readTheList()     // Catch:{ InterruptedIOException -> 0x0027, IOException -> 0x0010 }
            if (r0 == 0) goto L_0x000d
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x000d:
            return
        L_0x000e:
            r1 = move-exception
            goto L_0x002c
        L_0x0010:
            r1 = move-exception
            okhttp3.internal.platform.Platform$Companion r2 = okhttp3.internal.platform.Platform.Companion     // Catch:{ all -> 0x000e }
            okhttp3.internal.platform.Platform r2 = r2.get()     // Catch:{ all -> 0x000e }
            java.lang.String r3 = "Failed to read public suffix list"
            r4 = 5
            r2.log(r3, r4, r1)     // Catch:{ all -> 0x000e }
            if (r0 == 0) goto L_0x0026
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0026:
            return
        L_0x0027:
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x000e }
            r0 = 1
            goto L_0x0001
        L_0x002c:
            if (r0 == 0) goto L_0x0035
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0035:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.readTheListUninterruptibly():void");
    }

    private final List<String> splitDomain(String str) {
        List<String> A0 = StringsKt__StringsKt.m63060A0(str, new char[]{'.'}, false, 0, 6, (Object) null);
        if (vx2.m53586b(CollectionsKt___CollectionsKt.m47340k0(A0), "")) {
            return CollectionsKt___CollectionsKt.m47324U(A0, 1);
        }
        return A0;
    }

    public final String getEffectiveTldPlusOne(String str) {
        int i;
        int i2;
        vx2.m53591g(str, "domain");
        String unicode = IDN.toUnicode(str);
        vx2.m53590f(unicode, "unicodeDomain");
        List<String> splitDomain = splitDomain(unicode);
        List<String> findMatchingRule = findMatchingRule(splitDomain);
        if (splitDomain.size() == findMatchingRule.size() && findMatchingRule.get(0).charAt(0) != '!') {
            return null;
        }
        if (findMatchingRule.get(0).charAt(0) == '!') {
            i2 = splitDomain.size();
            i = findMatchingRule.size();
        } else {
            i2 = splitDomain.size();
            i = findMatchingRule.size() + 1;
        }
        return SequencesKt___SequencesKt.m63032v(SequencesKt___SequencesKt.m63024n(CollectionsKt___CollectionsKt.m47318Q(splitDomain(str)), i2 - i), ".", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (rc2) null, 62, (Object) null);
    }

    public final void setListBytes(byte[] bArr, byte[] bArr2) {
        vx2.m53591g(bArr, "publicSuffixListBytes");
        vx2.m53591g(bArr2, "publicSuffixExceptionListBytes");
        this.publicSuffixListBytes = bArr;
        this.publicSuffixExceptionListBytes = bArr2;
        this.listRead.set(true);
        this.readCompleteLatch.countDown();
    }
}
