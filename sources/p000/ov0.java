package p000;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: ov0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class ov0 implements FilenameFilter {

    /* renamed from: a */
    public final /* synthetic */ String f32455a;

    public /* synthetic */ ov0(String str) {
        this.f32455a = str;
    }

    public final boolean accept(File file, String str) {
        return str.startsWith(this.f32455a);
    }
}
