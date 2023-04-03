package p000;

import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C6175a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.p019io.AccessDeniedException;
import kotlin.p019io.FileWalkDirection;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\n\u000e\u0013Bm\b\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r\u0012\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0011\u0012\u001a\u0010\u001a\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001b¢\u0006\u0004\b\u001f\u0010 B\u001b\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u001f\u0010!J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0002J \u0010\t\u001a\u00020\u00002\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005R\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\"\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\"\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R(\u0010\u001a\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\""}, mo44877d2 = {"Lc12;", "Lhw5;", "Ljava/io/File;", "", "iterator", "Lkotlin/Function2;", "Ljava/io/IOException;", "Lr37;", "function", "h", "a", "Ljava/io/File;", "start", "Lkotlin/io/FileWalkDirection;", "b", "Lkotlin/io/FileWalkDirection;", "direction", "Lkotlin/Function1;", "", "c", "Lrc2;", "onEnter", "d", "onLeave", "e", "Lfd2;", "onFail", "", "f", "I", "maxDepth", "<init>", "(Ljava/io/File;Lkotlin/io/FileWalkDirection;Lrc2;Lrc2;Lfd2;I)V", "(Ljava/io/File;Lkotlin/io/FileWalkDirection;)V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: c12 */
/* compiled from: FileTreeWalk.kt */
public final class c12 implements hw5<File> {

    /* renamed from: a */
    public final File f21551a;

    /* renamed from: b */
    public final FileWalkDirection f21552b;

    /* renamed from: c */
    public final rc2<File, Boolean> f21553c;

    /* renamed from: d */
    public final rc2<File, r37> f21554d;

    /* renamed from: e */
    public final fd2<File, IOException, r37> f21555e;

    /* renamed from: f */
    public final int f21556f;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\"\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo44877d2 = {"Lc12$a;", "Lc12$c;", "Ljava/io/File;", "rootDir", "<init>", "(Ljava/io/File;)V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: c12$a */
    /* compiled from: FileTreeWalk.kt */
    public static abstract class C3916a extends C3922c {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3916a(File file) {
            super(file);
            vx2.m53591g(file, "rootDir");
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0004\u0010\u0011B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0004\u001a\u00020\u0003H\u0014J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0010R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0012"}, mo44877d2 = {"Lc12$b;", "Lkotlin/collections/a;", "Ljava/io/File;", "Lr37;", "a", "root", "Lc12$a;", "f", "g", "Ljava/util/ArrayDeque;", "Lc12$c;", "e", "Ljava/util/ArrayDeque;", "state", "<init>", "(Lc12;)V", "b", "c", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: c12$b */
    /* compiled from: FileTreeWalk.kt */
    public final class C3917b extends C6175a<File> {

        /* renamed from: e */
        public final ArrayDeque<C3922c> f21557e;

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u0016\u0010\u0006\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005R\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0005¨\u0006\u0014"}, mo44877d2 = {"Lc12$b$a;", "Lc12$a;", "Ljava/io/File;", "b", "", "Z", "rootVisited", "", "c", "[Ljava/io/File;", "fileList", "", "d", "I", "fileIndex", "e", "failed", "rootDir", "<init>", "(Lc12$b;Ljava/io/File;)V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: c12$b$a */
        /* compiled from: FileTreeWalk.kt */
        public final class C3918a extends C3916a {

            /* renamed from: b */
            public boolean f21559b;

            /* renamed from: c */
            public File[] f21560c;

            /* renamed from: d */
            public int f21561d;

            /* renamed from: e */
            public boolean f21562e;

            /* renamed from: f */
            public final /* synthetic */ C3917b f21563f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3918a(C3917b bVar, File file) {
                super(file);
                vx2.m53591g(file, "rootDir");
                this.f21563f = bVar;
            }

            /* renamed from: b */
            public File mo29845b() {
                if (!this.f21562e && this.f21560c == null) {
                    rc2 d = c12.this.f21553c;
                    boolean z = false;
                    if (d != null && !((Boolean) d.invoke(mo29846a())).booleanValue()) {
                        z = true;
                    }
                    if (z) {
                        return null;
                    }
                    File[] listFiles = mo29846a().listFiles();
                    this.f21560c = listFiles;
                    if (listFiles == null) {
                        fd2 e = c12.this.f21555e;
                        if (e != null) {
                            e.invoke(mo29846a(), new AccessDeniedException(mo29846a(), (File) null, "Cannot list files in a directory", 2, (DefaultConstructorMarker) null));
                        }
                        this.f21562e = true;
                    }
                }
                File[] fileArr = this.f21560c;
                if (fileArr != null) {
                    int i = this.f21561d;
                    vx2.m53588d(fileArr);
                    if (i < fileArr.length) {
                        File[] fileArr2 = this.f21560c;
                        vx2.m53588d(fileArr2);
                        int i2 = this.f21561d;
                        this.f21561d = i2 + 1;
                        return fileArr2[i2];
                    }
                }
                if (!this.f21559b) {
                    this.f21559b = true;
                    return mo29846a();
                }
                rc2 f = c12.this.f21554d;
                if (f != null) {
                    f.invoke(mo29846a());
                }
                return null;
            }
        }

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u0016\u0010\u0006\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005¨\u0006\n"}, mo44877d2 = {"Lc12$b$b;", "Lc12$c;", "Ljava/io/File;", "b", "", "Z", "visited", "rootFile", "<init>", "(Lc12$b;Ljava/io/File;)V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: c12$b$b */
        /* compiled from: FileTreeWalk.kt */
        public final class C3919b extends C3922c {

            /* renamed from: b */
            public boolean f21564b;

            /* renamed from: c */
            public final /* synthetic */ C3917b f21565c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3919b(C3917b bVar, File file) {
                super(file);
                vx2.m53591g(file, "rootFile");
                this.f21565c = bVar;
            }

            /* renamed from: b */
            public File mo29845b() {
                if (this.f21564b) {
                    return null;
                }
                this.f21564b = true;
                return mo29846a();
            }
        }

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u0016\u0010\u0006\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005R\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0012"}, mo44877d2 = {"Lc12$b$c;", "Lc12$a;", "Ljava/io/File;", "b", "", "Z", "rootVisited", "", "c", "[Ljava/io/File;", "fileList", "", "d", "I", "fileIndex", "rootDir", "<init>", "(Lc12$b;Ljava/io/File;)V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: c12$b$c */
        /* compiled from: FileTreeWalk.kt */
        public final class C3920c extends C3916a {

            /* renamed from: b */
            public boolean f21566b;

            /* renamed from: c */
            public File[] f21567c;

            /* renamed from: d */
            public int f21568d;

            /* renamed from: e */
            public final /* synthetic */ C3917b f21569e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3920c(C3917b bVar, File file) {
                super(file);
                vx2.m53591g(file, "rootDir");
                this.f21569e = bVar;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:29:0x0083, code lost:
                if (r0.length == 0) goto L_0x0085;
             */
            /* renamed from: b */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.io.File mo29845b() {
                /*
                    r10 = this;
                    boolean r0 = r10.f21566b
                    r1 = 0
                    if (r0 != 0) goto L_0x002c
                    c12$b r0 = r10.f21569e
                    c12 r0 = p000.c12.this
                    rc2 r0 = r0.f21553c
                    r2 = 0
                    r3 = 1
                    if (r0 == 0) goto L_0x0022
                    java.io.File r4 = r10.mo29846a()
                    java.lang.Object r0 = r0.invoke(r4)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L_0x0022
                    r2 = r3
                L_0x0022:
                    if (r2 == 0) goto L_0x0025
                    return r1
                L_0x0025:
                    r10.f21566b = r3
                    java.io.File r0 = r10.mo29846a()
                    return r0
                L_0x002c:
                    java.io.File[] r0 = r10.f21567c
                    if (r0 == 0) goto L_0x004b
                    int r2 = r10.f21568d
                    p000.vx2.m53588d(r0)
                    int r0 = r0.length
                    if (r2 >= r0) goto L_0x0039
                    goto L_0x004b
                L_0x0039:
                    c12$b r0 = r10.f21569e
                    c12 r0 = p000.c12.this
                    rc2 r0 = r0.f21554d
                    if (r0 == 0) goto L_0x004a
                    java.io.File r2 = r10.mo29846a()
                    r0.invoke(r2)
                L_0x004a:
                    return r1
                L_0x004b:
                    java.io.File[] r0 = r10.f21567c
                    if (r0 != 0) goto L_0x0097
                    java.io.File r0 = r10.mo29846a()
                    java.io.File[] r0 = r0.listFiles()
                    r10.f21567c = r0
                    if (r0 != 0) goto L_0x007b
                    c12$b r0 = r10.f21569e
                    c12 r0 = p000.c12.this
                    fd2 r0 = r0.f21555e
                    if (r0 == 0) goto L_0x007b
                    java.io.File r2 = r10.mo29846a()
                    kotlin.io.AccessDeniedException r9 = new kotlin.io.AccessDeniedException
                    java.io.File r4 = r10.mo29846a()
                    r5 = 0
                    r7 = 2
                    r8 = 0
                    java.lang.String r6 = "Cannot list files in a directory"
                    r3 = r9
                    r3.<init>(r4, r5, r6, r7, r8)
                    r0.invoke(r2, r9)
                L_0x007b:
                    java.io.File[] r0 = r10.f21567c
                    if (r0 == 0) goto L_0x0085
                    p000.vx2.m53588d(r0)
                    int r0 = r0.length
                    if (r0 != 0) goto L_0x0097
                L_0x0085:
                    c12$b r0 = r10.f21569e
                    c12 r0 = p000.c12.this
                    rc2 r0 = r0.f21554d
                    if (r0 == 0) goto L_0x0096
                    java.io.File r2 = r10.mo29846a()
                    r0.invoke(r2)
                L_0x0096:
                    return r1
                L_0x0097:
                    java.io.File[] r0 = r10.f21567c
                    p000.vx2.m53588d(r0)
                    int r1 = r10.f21568d
                    int r2 = r1 + 1
                    r10.f21568d = r2
                    r0 = r0[r1]
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.c12.C3917b.C3920c.mo29845b():java.io.File");
            }
        }

        @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
        /* renamed from: c12$b$d */
        /* compiled from: FileTreeWalk.kt */
        public /* synthetic */ class C3921d {

            /* renamed from: a */
            public static final /* synthetic */ int[] f21570a;

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            static {
                /*
                    kotlin.io.FileWalkDirection[] r0 = kotlin.p019io.FileWalkDirection.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    kotlin.io.FileWalkDirection r1 = kotlin.p019io.FileWalkDirection.TOP_DOWN     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    kotlin.io.FileWalkDirection r1 = kotlin.p019io.FileWalkDirection.BOTTOM_UP     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    f21570a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.c12.C3917b.C3921d.<clinit>():void");
            }
        }

        public C3917b() {
            ArrayDeque<C3922c> arrayDeque = new ArrayDeque<>();
            this.f21557e = arrayDeque;
            if (c12.this.f21551a.isDirectory()) {
                arrayDeque.push(mo29843f(c12.this.f21551a));
            } else if (c12.this.f21551a.isFile()) {
                arrayDeque.push(new C3919b(this, c12.this.f21551a));
            } else {
                mo45012b();
            }
        }

        /* renamed from: a */
        public void mo29842a() {
            File g = mo29844g();
            if (g != null) {
                mo45013c(g);
            } else {
                mo45012b();
            }
        }

        /* renamed from: f */
        public final C3916a mo29843f(File file) {
            int i = C3921d.f21570a[c12.this.f21552b.ordinal()];
            if (i == 1) {
                return new C3920c(this, file);
            }
            if (i == 2) {
                return new C3918a(this, file);
            }
            throw new NoWhenBranchMatchedException();
        }

        /* renamed from: g */
        public final File mo29844g() {
            File b;
            while (true) {
                C3922c peek = this.f21557e.peek();
                if (peek == null) {
                    return null;
                }
                b = peek.mo29845b();
                if (b == null) {
                    this.f21557e.pop();
                } else if (vx2.m53586b(b, peek.mo29846a()) || !b.isDirectory() || this.f21557e.size() >= c12.this.f21556f) {
                    return b;
                } else {
                    this.f21557e.push(mo29843f(b));
                }
            }
            return b;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\"\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006¨\u0006\n"}, mo44877d2 = {"Lc12$c;", "", "Ljava/io/File;", "b", "a", "Ljava/io/File;", "()Ljava/io/File;", "root", "<init>", "(Ljava/io/File;)V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: c12$c */
    /* compiled from: FileTreeWalk.kt */
    public static abstract class C3922c {

        /* renamed from: a */
        public final File f21571a;

        public C3922c(File file) {
            vx2.m53591g(file, "root");
            this.f21571a = file;
        }

        /* renamed from: a */
        public final File mo29846a() {
            return this.f21571a;
        }

        /* renamed from: b */
        public abstract File mo29845b();
    }

    public c12(File file, FileWalkDirection fileWalkDirection, rc2<? super File, Boolean> rc2, rc2<? super File, r37> rc22, fd2<? super File, ? super IOException, r37> fd2, int i) {
        this.f21551a = file;
        this.f21552b = fileWalkDirection;
        this.f21553c = rc2;
        this.f21554d = rc22;
        this.f21555e = fd2;
        this.f21556f = i;
    }

    /* renamed from: h */
    public final c12 mo29841h(fd2<? super File, ? super IOException, r37> fd2) {
        vx2.m53591g(fd2, "function");
        return new c12(this.f21551a, this.f21552b, this.f21553c, this.f21554d, fd2, this.f21556f);
    }

    public Iterator<File> iterator() {
        return new C3917b();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c12(File file, FileWalkDirection fileWalkDirection, rc2 rc2, rc2 rc22, fd2 fd2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i2 & 2) != 0 ? FileWalkDirection.TOP_DOWN : fileWalkDirection, rc2, rc22, fd2, (i2 & 32) != 0 ? Integer.MAX_VALUE : i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public c12(File file, FileWalkDirection fileWalkDirection) {
        this(file, fileWalkDirection, (rc2) null, (rc2) null, (fd2) null, 0, 32, (DefaultConstructorMarker) null);
        vx2.m53591g(file, "start");
        vx2.m53591g(fileWalkDirection, "direction");
    }
}
