package kotlin.p019io;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\u001a\u0012\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a&\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t\u001a8\u0010\u0010\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\u001a\b\u0002\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u001a\n\u0010\u0011\u001a\u00020\u0007*\u00020\u0000\u001a\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00000\u0015*\b\u0012\u0004\u0012\u00020\u00000\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, mo44877d2 = {"Ljava/io/File;", "base", "", "m", "n", "(Ljava/io/File;Ljava/io/File;)Ljava/lang/String;", "target", "", "overwrite", "", "bufferSize", "h", "Lkotlin/Function2;", "Ljava/io/IOException;", "Lkotlin/io/OnErrorAction;", "onError", "f", "j", "Lv02;", "k", "(Lv02;)Lv02;", "", "l", "(Ljava/util/List;)Ljava/util/List;", "kotlin-stdlib"}, mo44878k = 5, mo44879mv = {1, 7, 1}, mo44882xs = "kotlin/io/FilesKt")
/* renamed from: kotlin.io.FilesKt__UtilsKt */
/* compiled from: Utils.kt */
public class FilesKt__UtilsKt extends i12 {
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009c A[Catch:{ TerminateException -> 0x00dc }] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m47427f(java.io.File r11, java.io.File r12, boolean r13, p000.fd2<? super java.io.File, ? super java.io.IOException, ? extends kotlin.p019io.OnErrorAction> r14) {
        /*
            java.lang.String r0 = "<this>"
            p000.vx2.m53591g(r11, r0)
            java.lang.String r0 = "target"
            p000.vx2.m53591g(r12, r0)
            java.lang.String r0 = "onError"
            p000.vx2.m53591g(r14, r0)
            boolean r0 = r11.exists()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x002e
            kotlin.io.NoSuchFileException r12 = new kotlin.io.NoSuchFileException
            r5 = 0
            r7 = 2
            r8 = 0
            java.lang.String r6 = "The source file doesn't exist."
            r3 = r12
            r4 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.Object r11 = r14.invoke(r11, r12)
            kotlin.io.OnErrorAction r12 = kotlin.p019io.OnErrorAction.TERMINATE
            if (r11 == r12) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            r1 = r2
        L_0x002d:
            return r1
        L_0x002e:
            c12 r0 = p000.i12.m45447e(r11)     // Catch:{ TerminateException -> 0x00dc }
            kotlin.io.FilesKt__UtilsKt$copyRecursively$2 r3 = new kotlin.io.FilesKt__UtilsKt$copyRecursively$2     // Catch:{ TerminateException -> 0x00dc }
            r3.<init>(r14)     // Catch:{ TerminateException -> 0x00dc }
            c12 r0 = r0.mo29841h(r3)     // Catch:{ TerminateException -> 0x00dc }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ TerminateException -> 0x00dc }
        L_0x003f:
            boolean r3 = r0.hasNext()     // Catch:{ TerminateException -> 0x00dc }
            if (r3 == 0) goto L_0x00db
            java.lang.Object r3 = r0.next()     // Catch:{ TerminateException -> 0x00dc }
            java.io.File r3 = (java.io.File) r3     // Catch:{ TerminateException -> 0x00dc }
            boolean r4 = r3.exists()     // Catch:{ TerminateException -> 0x00dc }
            if (r4 != 0) goto L_0x0066
            kotlin.io.NoSuchFileException r10 = new kotlin.io.NoSuchFileException     // Catch:{ TerminateException -> 0x00dc }
            r6 = 0
            java.lang.String r7 = "The source file doesn't exist."
            r8 = 2
            r9 = 0
            r4 = r10
            r5 = r3
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ TerminateException -> 0x00dc }
            java.lang.Object r3 = r14.invoke(r3, r10)     // Catch:{ TerminateException -> 0x00dc }
            kotlin.io.OnErrorAction r4 = kotlin.p019io.OnErrorAction.TERMINATE     // Catch:{ TerminateException -> 0x00dc }
            if (r3 != r4) goto L_0x003f
            return r2
        L_0x0066:
            java.lang.String r4 = m47434m(r3, r11)     // Catch:{ TerminateException -> 0x00dc }
            java.io.File r5 = new java.io.File     // Catch:{ TerminateException -> 0x00dc }
            r5.<init>(r12, r4)     // Catch:{ TerminateException -> 0x00dc }
            boolean r4 = r5.exists()     // Catch:{ TerminateException -> 0x00dc }
            if (r4 == 0) goto L_0x00ac
            boolean r4 = r3.isDirectory()     // Catch:{ TerminateException -> 0x00dc }
            if (r4 == 0) goto L_0x0081
            boolean r4 = r5.isDirectory()     // Catch:{ TerminateException -> 0x00dc }
            if (r4 != 0) goto L_0x00ac
        L_0x0081:
            if (r13 != 0) goto L_0x0085
        L_0x0083:
            r4 = r1
            goto L_0x009a
        L_0x0085:
            boolean r4 = r5.isDirectory()     // Catch:{ TerminateException -> 0x00dc }
            if (r4 == 0) goto L_0x0092
            boolean r4 = m47431j(r5)     // Catch:{ TerminateException -> 0x00dc }
            if (r4 != 0) goto L_0x0099
            goto L_0x0083
        L_0x0092:
            boolean r4 = r5.delete()     // Catch:{ TerminateException -> 0x00dc }
            if (r4 != 0) goto L_0x0099
            goto L_0x0083
        L_0x0099:
            r4 = r2
        L_0x009a:
            if (r4 == 0) goto L_0x00ac
            kotlin.io.FileAlreadyExistsException r4 = new kotlin.io.FileAlreadyExistsException     // Catch:{ TerminateException -> 0x00dc }
            java.lang.String r6 = "The destination file already exists."
            r4.<init>(r3, r5, r6)     // Catch:{ TerminateException -> 0x00dc }
            java.lang.Object r3 = r14.invoke(r5, r4)     // Catch:{ TerminateException -> 0x00dc }
            kotlin.io.OnErrorAction r4 = kotlin.p019io.OnErrorAction.TERMINATE     // Catch:{ TerminateException -> 0x00dc }
            if (r3 != r4) goto L_0x003f
            return r2
        L_0x00ac:
            boolean r4 = r3.isDirectory()     // Catch:{ TerminateException -> 0x00dc }
            if (r4 == 0) goto L_0x00b6
            r5.mkdirs()     // Catch:{ TerminateException -> 0x00dc }
            goto L_0x003f
        L_0x00b6:
            r7 = 0
            r8 = 4
            r9 = 0
            r4 = r3
            r6 = r13
            java.io.File r4 = m47430i(r4, r5, r6, r7, r8, r9)     // Catch:{ TerminateException -> 0x00dc }
            long r4 = r4.length()     // Catch:{ TerminateException -> 0x00dc }
            long r6 = r3.length()     // Catch:{ TerminateException -> 0x00dc }
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x003f
            java.io.IOException r4 = new java.io.IOException     // Catch:{ TerminateException -> 0x00dc }
            java.lang.String r5 = "Source file wasn't copied completely, length of destination file differs."
            r4.<init>(r5)     // Catch:{ TerminateException -> 0x00dc }
            java.lang.Object r3 = r14.invoke(r3, r4)     // Catch:{ TerminateException -> 0x00dc }
            kotlin.io.OnErrorAction r4 = kotlin.p019io.OnErrorAction.TERMINATE     // Catch:{ TerminateException -> 0x00dc }
            if (r3 != r4) goto L_0x003f
            return r2
        L_0x00db:
            return r1
        L_0x00dc:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p019io.FilesKt__UtilsKt.m47427f(java.io.File, java.io.File, boolean, fd2):boolean");
    }

    /* renamed from: g */
    public static /* synthetic */ boolean m47428g(File file, File file2, boolean z, fd2 fd2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            fd2 = FilesKt__UtilsKt$copyRecursively$1.INSTANCE;
        }
        return m47427f(file, file2, z, fd2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0064, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        p000.lh0.m47807a(r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0068, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x006b, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x006c, code lost:
        p000.lh0.m47807a(r8, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x006f, code lost:
        throw r7;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.io.File m47429h(java.io.File r6, java.io.File r7, boolean r8, int r9) {
        /*
            java.lang.String r0 = "<this>"
            p000.vx2.m53591g(r6, r0)
            java.lang.String r0 = "target"
            p000.vx2.m53591g(r7, r0)
            boolean r0 = r6.exists()
            if (r0 == 0) goto L_0x0070
            boolean r0 = r7.exists()
            if (r0 == 0) goto L_0x002f
            if (r8 == 0) goto L_0x0027
            boolean r8 = r7.delete()
            if (r8 == 0) goto L_0x001f
            goto L_0x002f
        L_0x001f:
            kotlin.io.FileAlreadyExistsException r8 = new kotlin.io.FileAlreadyExistsException
            java.lang.String r9 = "Tried to overwrite the destination, but failed to delete it."
            r8.<init>(r6, r7, r9)
            throw r8
        L_0x0027:
            kotlin.io.FileAlreadyExistsException r8 = new kotlin.io.FileAlreadyExistsException
            java.lang.String r9 = "The destination file already exists."
            r8.<init>(r6, r7, r9)
            throw r8
        L_0x002f:
            boolean r8 = r6.isDirectory()
            if (r8 == 0) goto L_0x0044
            boolean r8 = r7.mkdirs()
            if (r8 == 0) goto L_0x003c
            goto L_0x0061
        L_0x003c:
            kotlin.io.FileSystemException r8 = new kotlin.io.FileSystemException
            java.lang.String r9 = "Failed to create target directory."
            r8.<init>(r6, r7, r9)
            throw r8
        L_0x0044:
            java.io.File r8 = r7.getParentFile()
            if (r8 == 0) goto L_0x004d
            r8.mkdirs()
        L_0x004d:
            java.io.FileInputStream r8 = new java.io.FileInputStream
            r8.<init>(r6)
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ all -> 0x0069 }
            r6.<init>(r7)     // Catch:{ all -> 0x0069 }
            p000.b70.m32368a(r8, r6, r9)     // Catch:{ all -> 0x0062 }
            r9 = 0
            p000.lh0.m47807a(r6, r9)     // Catch:{ all -> 0x0069 }
            p000.lh0.m47807a(r8, r9)
        L_0x0061:
            return r7
        L_0x0062:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x0064 }
        L_0x0064:
            r9 = move-exception
            p000.lh0.m47807a(r6, r7)     // Catch:{ all -> 0x0069 }
            throw r9     // Catch:{ all -> 0x0069 }
        L_0x0069:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x006b }
        L_0x006b:
            r7 = move-exception
            p000.lh0.m47807a(r8, r6)
            throw r7
        L_0x0070:
            kotlin.io.NoSuchFileException r7 = new kotlin.io.NoSuchFileException
            r2 = 0
            r4 = 2
            r5 = 0
            java.lang.String r3 = "The source file doesn't exist."
            r0 = r7
            r1 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p019io.FilesKt__UtilsKt.m47429h(java.io.File, java.io.File, boolean, int):java.io.File");
    }

    /* renamed from: i */
    public static /* synthetic */ File m47430i(File file, File file2, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 8192;
        }
        return m47429h(file, file2, z, i);
    }

    /* renamed from: j */
    public static final boolean m47431j(File file) {
        vx2.m53591g(file, "<this>");
        Iterator it = i12.m45446d(file).iterator();
        while (true) {
            boolean z = true;
            while (true) {
                if (!it.hasNext()) {
                    return z;
                }
                File file2 = (File) it.next();
                if (file2.delete() || !file2.exists()) {
                    if (z) {
                    }
                }
                z = false;
            }
        }
    }

    /* renamed from: k */
    public static final v02 m47432k(v02 v02) {
        return new v02(v02.mo48622a(), m47433l(v02.mo48623b()));
    }

    /* renamed from: l */
    public static final List<File> m47433l(List<? extends File> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (File file : list) {
            String name = file.getName();
            if (!vx2.m53586b(name, ".")) {
                if (!vx2.m53586b(name, "..")) {
                    arrayList.add(file);
                } else if (arrayList.isEmpty() || vx2.m53586b(((File) CollectionsKt___CollectionsKt.m47340k0(arrayList)).getName(), "..")) {
                    arrayList.add(file);
                } else {
                    arrayList.remove(arrayList.size() - 1);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: m */
    public static final String m47434m(File file, File file2) {
        vx2.m53591g(file, "<this>");
        vx2.m53591g(file2, "base");
        String n = m47435n(file, file2);
        if (n != null) {
            return n;
        }
        throw new IllegalArgumentException("this and base files have different roots: " + file + " and " + file2 + '.');
    }

    /* renamed from: n */
    public static final String m47435n(File file, File file2) {
        v02 k = m47432k(g12.m44463b(file));
        v02 k2 = m47432k(g12.m44463b(file2));
        if (!vx2.m53586b(k.mo48622a(), k2.mo48622a())) {
            return null;
        }
        int c = k2.mo48624c();
        int c2 = k.mo48624c();
        int i = 0;
        int min = Math.min(c2, c);
        while (i < min && vx2.m53586b(k.mo48623b().get(i), k2.mo48623b().get(i))) {
            i++;
        }
        StringBuilder sb = new StringBuilder();
        int i2 = c - 1;
        if (i <= i2) {
            while (!vx2.m53586b(k2.mo48623b().get(i2).getName(), "..")) {
                sb.append("..");
                if (i2 != i) {
                    sb.append(File.separatorChar);
                }
                if (i2 != i) {
                    i2--;
                }
            }
            return null;
        }
        if (i < c2) {
            if (i < c) {
                sb.append(File.separatorChar);
            }
            List<T> T = CollectionsKt___CollectionsKt.m47323T(k.mo48623b(), i);
            String str = File.separator;
            vx2.m53590f(str, "separator");
            CollectionsKt___CollectionsKt.m47336g0(T, sb, str, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (rc2) null, 124, (Object) null);
        }
        return sb.toString();
    }
}
