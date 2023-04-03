package kotlin.p019io;

import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44876d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo44877d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Ljava/io/File;", "exception", "Ljava/io/IOException;", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* renamed from: kotlin.io.FilesKt__UtilsKt$copyRecursively$1 */
/* compiled from: Utils.kt */
public final class FilesKt__UtilsKt$copyRecursively$1 extends Lambda implements fd2 {
    public static final FilesKt__UtilsKt$copyRecursively$1 INSTANCE = new FilesKt__UtilsKt$copyRecursively$1();

    public FilesKt__UtilsKt$copyRecursively$1() {
        super(2);
    }

    public final Void invoke(File file, IOException iOException) {
        vx2.m53591g(file, "<anonymous parameter 0>");
        vx2.m53591g(iOException, "exception");
        throw iOException;
    }
}
