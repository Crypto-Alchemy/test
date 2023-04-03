package p000;

import android.os.Bundle;
import androidx.lifecycle.C0729l;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: ej3 */
/* compiled from: LoaderManagerImpl */
public class ej3 extends dj3 {

    /* renamed from: c */
    public static boolean f11175c = false;

    /* renamed from: a */
    public final ug3 f11176a;

    /* renamed from: b */
    public final C2230b f11177b;

    /* renamed from: ej3$a */
    /* compiled from: LoaderManagerImpl */
    public static class C2229a<D> extends k04<D> {

        /* renamed from: a */
        public final int f11178a;

        /* renamed from: b */
        public final Bundle f11179b;

        /* renamed from: c */
        public ug3 f11180c;

        /* renamed from: a */
        public bj3<D> mo19260a(boolean z) {
            if (ej3.f11175c) {
                StringBuilder sb = new StringBuilder();
                sb.append("  Destroying: ");
                sb.append(this);
            }
            throw null;
        }

        /* renamed from: b */
        public void mo19261b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f11178a);
            printWriter.print(" mArgs=");
            printWriter.println(this.f11179b);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println((Object) null);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("  ");
            throw null;
        }

        /* renamed from: c */
        public void mo19262c() {
        }

        public void onActive() {
            if (ej3.f11175c) {
                StringBuilder sb = new StringBuilder();
                sb.append("  Starting: ");
                sb.append(this);
            }
            throw null;
        }

        public void onInactive() {
            if (ej3.f11175c) {
                StringBuilder sb = new StringBuilder();
                sb.append("  Stopping: ");
                sb.append(this);
            }
            throw null;
        }

        public void removeObserver(pf4<? super D> pf4) {
            super.removeObserver(pf4);
            this.f11180c = null;
        }

        public void setValue(D d) {
            super.setValue(d);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f11178a);
            sb.append(" : ");
            c31.m11696a((Object) null, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* renamed from: ej3$b */
    /* compiled from: LoaderManagerImpl */
    public static class C2230b extends ad7 {

        /* renamed from: c */
        public static final C0729l.C0733b f11181c = new C2231a();

        /* renamed from: a */
        public j66<C2229a> f11182a = new j66<>();

        /* renamed from: b */
        public boolean f11183b = false;

        /* renamed from: ej3$b$a */
        /* compiled from: LoaderManagerImpl */
        public static class C2231a implements C0729l.C0733b {
            /* renamed from: a */
            public <T extends ad7> T mo6370a(Class<T> cls) {
                return new C2230b();
            }

            /* renamed from: b */
            public /* synthetic */ ad7 mo6371b(Class cls, zv0 zv0) {
                return ed7.m16079b(this, cls, zv0);
            }
        }

        /* renamed from: c */
        public static C2230b m16122c(gd7 gd7) {
            return (C2230b) new C0729l(gd7, f11181c).mo6421a(C2230b.class);
        }

        /* renamed from: b */
        public void mo19264b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f11182a.mo21766v() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i = 0; i < this.f11182a.mo21766v(); i++) {
                    C2229a w = this.f11182a.mo21767w(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f11182a.mo21761p(i));
                    printWriter.print(": ");
                    printWriter.println(w.toString());
                    w.mo19261b(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        /* renamed from: d */
        public void mo19265d() {
            int v = this.f11182a.mo21766v();
            for (int i = 0; i < v; i++) {
                this.f11182a.mo21767w(i).mo19262c();
            }
        }

        public void onCleared() {
            super.onCleared();
            int v = this.f11182a.mo21766v();
            for (int i = 0; i < v; i++) {
                this.f11182a.mo21767w(i).mo19260a(true);
            }
            this.f11182a.mo21750b();
        }
    }

    public ej3(ug3 ug3, gd7 gd7) {
        this.f11176a = ug3;
        this.f11177b = C2230b.m16122c(gd7);
    }

    @Deprecated
    /* renamed from: a */
    public void mo18792a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f11177b.mo19264b(str, fileDescriptor, printWriter, strArr);
    }

    /* renamed from: c */
    public void mo18793c() {
        this.f11177b.mo19265d();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        c31.m11696a(this.f11176a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
