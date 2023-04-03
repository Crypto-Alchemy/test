package p000;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: gv7 */
public final class gv7 implements mv7 {

    /* renamed from: a */
    public final /* synthetic */ Set f29374a;

    /* renamed from: b */
    public final /* synthetic */ qw7 f29375b;

    /* renamed from: c */
    public final /* synthetic */ ZipFile f29376c;

    public gv7(Set set, qw7 qw7, ZipFile zipFile) {
        this.f29374a = set;
        this.f29375b = qw7;
        this.f29376c = zipFile;
    }

    /* renamed from: a */
    public final void mo43012a(qv7 qv7, File file, boolean z) throws IOException {
        FileOutputStream fileOutputStream;
        this.f29374a.add(file);
        if (!z) {
            String.format("NativeLibraryExtractor: split '%s' has native library '%s' that does not exist; extracting from '%s!%s' to '%s'", new Object[]{this.f29375b.mo47287b(), qv7.f33276a, this.f29375b.mo47286a().getAbsolutePath(), qv7.f33277b.getName(), file.getAbsolutePath()});
            ZipFile zipFile = this.f29376c;
            ZipEntry zipEntry = qv7.f33277b;
            Pattern pattern = tv7.f34393b;
            byte[] bArr = new byte[4096];
            InputStream inputStream = zipFile.getInputStream(zipEntry);
            try {
                fileOutputStream = new FileOutputStream(file);
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read > 0) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        fileOutputStream.close();
                        inputStream.close();
                        return;
                    }
                }
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th2) {
                        mt7.m48481a(th, th2);
                    }
                }
                throw th;
            }
        } else {
            return;
        }
        throw th;
    }
}
