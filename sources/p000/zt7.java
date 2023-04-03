package p000;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: zt7 */
public final /* synthetic */ class zt7 implements FilenameFilter {

    /* renamed from: a */
    public final String f36263a;

    public zt7(String str) {
        this.f36263a = str;
    }

    public final boolean accept(File file, String str) {
        return str.startsWith(String.valueOf(this.f36263a).concat("-")) && str.endsWith(".apk");
    }
}
