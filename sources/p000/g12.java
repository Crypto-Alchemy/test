package p000;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.text.StringsKt__StringsKt;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¨\u0006\u0007"}, mo44877d2 = {"", "", "a", "(Ljava/lang/String;)I", "Ljava/io/File;", "Lv02;", "b", "kotlin-stdlib"}, mo44878k = 5, mo44879mv = {1, 7, 1}, mo44882xs = "kotlin/io/FilesKt")
/* renamed from: g12 */
/* compiled from: FilePathComponents.kt */
public class g12 {
    /* renamed from: a */
    public static final int m44462a(String str) {
        char c;
        int d0;
        int d02 = StringsKt__StringsKt.m63099d0(str, File.separatorChar, 0, false, 4, (Object) null);
        if (d02 == 0) {
            if (str.length() <= 1 || str.charAt(1) != (c = File.separatorChar) || (d0 = StringsKt__StringsKt.m63099d0(str, c, 2, false, 4, (Object) null)) < 0) {
                return 1;
            }
            int d03 = StringsKt__StringsKt.m63099d0(str, File.separatorChar, d0 + 1, false, 4, (Object) null);
            if (d03 >= 0) {
                return d03 + 1;
            }
            return str.length();
        } else if (d02 > 0 && str.charAt(d02 - 1) == ':') {
            return d02 + 1;
        } else {
            if (d02 != -1 || !StringsKt__StringsKt.m63087U(str, ':', false, 2, (Object) null)) {
                return 0;
            }
            return str.length();
        }
    }

    /* renamed from: b */
    public static final v02 m44463b(File file) {
        boolean z;
        List list;
        vx2.m53591g(file, "<this>");
        String path = file.getPath();
        vx2.m53590f(path, "path");
        int a = m44462a(path);
        String substring = path.substring(0, a);
        vx2.m53590f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        String substring2 = path.substring(a);
        vx2.m53590f(substring2, "this as java.lang.String).substring(startIndex)");
        if (substring2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            list = ck0.m33062j();
        } else {
            List<String> A0 = StringsKt__StringsKt.m63060A0(substring2, new char[]{File.separatorChar}, false, 0, 6, (Object) null);
            ArrayList arrayList = new ArrayList(dk0.m43495u(A0, 10));
            for (String file2 : A0) {
                arrayList.add(new File(file2));
            }
            list = arrayList;
        }
        return new v02(new File(substring), list);
    }
}
