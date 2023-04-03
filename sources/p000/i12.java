package p000;

import java.io.File;
import kotlin.Metadata;
import kotlin.p019io.FileWalkDirection;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001\u001a\n\u0010\u0005\u001a\u00020\u0003*\u00020\u0000\u001a\n\u0010\u0006\u001a\u00020\u0003*\u00020\u0000¨\u0006\u0007"}, mo44877d2 = {"Ljava/io/File;", "Lkotlin/io/FileWalkDirection;", "direction", "Lc12;", "c", "e", "d", "kotlin-stdlib"}, mo44878k = 5, mo44879mv = {1, 7, 1}, mo44882xs = "kotlin/io/FilesKt")
/* renamed from: i12 */
/* compiled from: FileTreeWalk.kt */
public class i12 extends h12 {
    /* renamed from: c */
    public static final c12 m45445c(File file, FileWalkDirection fileWalkDirection) {
        vx2.m53591g(file, "<this>");
        vx2.m53591g(fileWalkDirection, "direction");
        return new c12(file, fileWalkDirection);
    }

    /* renamed from: d */
    public static final c12 m45446d(File file) {
        vx2.m53591g(file, "<this>");
        return m45445c(file, FileWalkDirection.BOTTOM_UP);
    }

    /* renamed from: e */
    public static final c12 m45447e(File file) {
        vx2.m53591g(file, "<this>");
        return m45445c(file, FileWalkDirection.TOP_DOWN);
    }
}
