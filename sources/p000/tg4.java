package p000;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.text.StringsKt__StringsKt;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0003\u001a\n\u0010\u0007\u001a\u00020\u0001*\u00020\u0006\u001a\n\u0010\b\u001a\u00020\u0004*\u00020\u0006\u001a\u0016\u0010\f\u001a\u00020\u0001*\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007\u001a\n\u0010\r\u001a\u00020\u0001*\u00020\t\u001a\n\u0010\u000e\u001a\u00020\u0004*\u00020\t\"\u001c\u0010\u0013\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u001c\u0010\u0018\u001a\u00020\n*\u00060\u0014j\u0002`\u00158@X\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, mo44877d2 = {"Ljava/io/OutputStream;", "Ls36;", "f", "Ljava/io/InputStream;", "Lz56;", "j", "Ljava/net/Socket;", "g", "k", "Ljava/io/File;", "", "append", "e", "b", "i", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "a", "Ljava/util/logging/Logger;", "logger", "Ljava/lang/AssertionError;", "Lkotlin/AssertionError;", "c", "(Ljava/lang/AssertionError;)Z", "isAndroidGetsocknameError", "okio"}, mo44878k = 5, mo44879mv = {1, 5, 1}, mo44882xs = "okio/Okio")
/* renamed from: tg4 */
/* compiled from: JvmOkio.kt */
public final /* synthetic */ class tg4 {

    /* renamed from: a */
    public static final Logger f44736a = Logger.getLogger("okio.Okio");

    /* renamed from: b */
    public static final s36 m72303b(File file) throws FileNotFoundException {
        vx2.m53591g(file, "<this>");
        return sg4.m71933h(new FileOutputStream(file, true));
    }

    /* renamed from: c */
    public static final boolean m72304c(AssertionError assertionError) {
        boolean z;
        vx2.m53591g(assertionError, "<this>");
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        if (message == null) {
            z = false;
        } else {
            z = StringsKt__StringsKt.m63081R(message, "getsockname failed", false, 2, (Object) null);
        }
        if (z) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static final s36 m72305d(File file) throws FileNotFoundException {
        vx2.m53591g(file, "<this>");
        return m72309h(file, false, 1, (Object) null);
    }

    /* renamed from: e */
    public static final s36 m72306e(File file, boolean z) throws FileNotFoundException {
        vx2.m53591g(file, "<this>");
        return sg4.m71933h(new FileOutputStream(file, z));
    }

    /* renamed from: f */
    public static final s36 m72307f(OutputStream outputStream) {
        vx2.m53591g(outputStream, "<this>");
        return new hj4(outputStream, new qq6());
    }

    /* renamed from: g */
    public static final s36 m72308g(Socket socket) throws IOException {
        vx2.m53591g(socket, "<this>");
        t56 t56 = new t56(socket);
        OutputStream outputStream = socket.getOutputStream();
        vx2.m53590f(outputStream, "getOutputStream()");
        return t56.sink(new hj4(outputStream, t56));
    }

    /* renamed from: h */
    public static /* synthetic */ s36 m72309h(File file, boolean z, int i, Object obj) throws FileNotFoundException {
        if ((i & 1) != 0) {
            z = false;
        }
        return sg4.m71932g(file, z);
    }

    /* renamed from: i */
    public static final z56 m72310i(File file) throws FileNotFoundException {
        vx2.m53591g(file, "<this>");
        return new gv2(new FileInputStream(file), qq6.NONE);
    }

    /* renamed from: j */
    public static final z56 m72311j(InputStream inputStream) {
        vx2.m53591g(inputStream, "<this>");
        return new gv2(inputStream, new qq6());
    }

    /* renamed from: k */
    public static final z56 m72312k(Socket socket) throws IOException {
        vx2.m53591g(socket, "<this>");
        t56 t56 = new t56(socket);
        InputStream inputStream = socket.getInputStream();
        vx2.m53590f(inputStream, "getInputStream()");
        return t56.source(new gv2(inputStream, t56));
    }
}
