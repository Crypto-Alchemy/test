package p000;

import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: dj3 */
/* compiled from: LoaderManager */
public abstract class dj3 {
    /* renamed from: b */
    public static <T extends ug3 & hd7> dj3 m15131b(T t) {
        return new ej3(t, ((hd7) t).getViewModelStore());
    }

    @Deprecated
    /* renamed from: a */
    public abstract void mo18792a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: c */
    public abstract void mo18793c();
}
