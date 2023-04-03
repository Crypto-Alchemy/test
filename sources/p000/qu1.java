package p000;

import java.io.File;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a$\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002¨\u0006\u0006"}, mo44877d2 = {"Ljava/io/File;", "file", "other", "", "reason", "b", "kotlin-stdlib"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: qu1 */
/* compiled from: Exceptions.kt */
public final class qu1 {
    /* renamed from: b */
    public static final String m50881b(File file, File file2, String str) {
        StringBuilder sb = new StringBuilder(file.toString());
        if (file2 != null) {
            sb.append(" -> " + file2);
        }
        if (str != null) {
            sb.append(": " + str);
        }
        String sb2 = sb.toString();
        vx2.m53590f(sb2, "sb.toString()");
        return sb2;
    }
}
