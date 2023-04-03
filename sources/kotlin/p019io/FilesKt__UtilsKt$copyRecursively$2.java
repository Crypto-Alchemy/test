package kotlin.p019io;

import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo44877d2 = {"Ljava/io/File;", "f", "Ljava/io/IOException;", "e", "Lr37;", "invoke", "(Ljava/io/File;Ljava/io/IOException;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* renamed from: kotlin.io.FilesKt__UtilsKt$copyRecursively$2 */
/* compiled from: Utils.kt */
public final class FilesKt__UtilsKt$copyRecursively$2 extends Lambda implements fd2<File, IOException, r37> {
    public final /* synthetic */ fd2<File, IOException, OnErrorAction> $onError;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FilesKt__UtilsKt$copyRecursively$2(fd2<? super File, ? super IOException, ? extends OnErrorAction> fd2) {
        super(2);
        this.$onError = fd2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((File) obj, (IOException) obj2);
        return r37.f33317a;
    }

    public final void invoke(File file, IOException iOException) {
        vx2.m53591g(file, "f");
        vx2.m53591g(iOException, "e");
        if (this.$onError.invoke(file, iOException) == OnErrorAction.TERMINATE) {
            throw new TerminateException(file);
        }
    }
}
