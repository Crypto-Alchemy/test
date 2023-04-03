package androidx.media3.datasource;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import androidx.media3.common.PlaybackException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class FileDataSource extends C3009oy {

    /* renamed from: e */
    public RandomAccessFile f4571e;

    /* renamed from: f */
    public Uri f4572f;

    /* renamed from: g */
    public long f4573g;

    /* renamed from: h */
    public boolean f4574h;

    public static class FileDataSourceException extends DataSourceException {
        @Deprecated
        public FileDataSourceException(Exception exc) {
            super((Throwable) exc, (int) PlaybackException.ERROR_CODE_IO_UNSPECIFIED);
        }

        @Deprecated
        public FileDataSourceException(String str, IOException iOException) {
            super(str, iOException, PlaybackException.ERROR_CODE_IO_UNSPECIFIED);
        }

        public FileDataSourceException(Throwable th, int i) {
            super(th, i);
        }

        public FileDataSourceException(String str, Throwable th, int i) {
            super(str, th, i);
        }
    }

    /* renamed from: androidx.media3.datasource.FileDataSource$a */
    public static final class C0845a {
        /* access modifiers changed from: private */
        /* renamed from: b */
        public static boolean m5947b(Throwable th) {
            if (!(th instanceof ErrnoException) || ((ErrnoException) th).errno != OsConstants.EACCES) {
                return false;
            }
            return true;
        }
    }

    public FileDataSource() {
        super(false);
    }

    /* renamed from: s */
    public static RandomAccessFile m5943s(Uri uri) throws FileDataSourceException {
        int i = PlaybackException.ERROR_CODE_IO_NO_PERMISSION;
        try {
            return new RandomAccessFile((String) C2725kr.m20985e(uri.getPath()), "r");
        } catch (FileNotFoundException e) {
            if (!TextUtils.isEmpty(uri.getQuery()) || !TextUtils.isEmpty(uri.getFragment())) {
                throw new FileDataSourceException(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", new Object[]{uri.getPath(), uri.getQuery(), uri.getFragment()}), e, PlaybackException.ERROR_CODE_FAILED_RUNTIME_CHECK);
            }
            if (w67.f19021a < 21 || !C0845a.m5947b(e.getCause())) {
                i = PlaybackException.ERROR_CODE_IO_FILE_NOT_FOUND;
            }
            throw new FileDataSourceException((Throwable) e, i);
        } catch (SecurityException e2) {
            throw new FileDataSourceException((Throwable) e2, (int) PlaybackException.ERROR_CODE_IO_NO_PERMISSION);
        } catch (RuntimeException e3) {
            throw new FileDataSourceException((Throwable) e3, (int) PlaybackException.ERROR_CODE_IO_UNSPECIFIED);
        }
    }

    /* renamed from: b */
    public long mo6964b(d21 d21) throws FileDataSourceException {
        Uri uri = d21.f10437a;
        this.f4572f = uri;
        mo24281q(d21);
        RandomAccessFile s = m5943s(uri);
        this.f4571e = s;
        try {
            s.seek(d21.f10443g);
            long j = d21.f10444h;
            if (j == -1) {
                j = this.f4571e.length() - d21.f10443g;
            }
            this.f4573g = j;
            if (j >= 0) {
                this.f4574h = true;
                mo24282r(d21);
                return this.f4573g;
            }
            throw new FileDataSourceException((String) null, (Throwable) null, 2008);
        } catch (IOException e) {
            throw new FileDataSourceException((Throwable) e, (int) PlaybackException.ERROR_CODE_IO_UNSPECIFIED);
        }
    }

    public void close() throws FileDataSourceException {
        this.f4572f = null;
        try {
            RandomAccessFile randomAccessFile = this.f4571e;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            this.f4571e = null;
            if (this.f4574h) {
                this.f4574h = false;
                mo24280p();
            }
        } catch (IOException e) {
            throw new FileDataSourceException((Throwable) e, (int) PlaybackException.ERROR_CODE_IO_UNSPECIFIED);
        } catch (Throwable th) {
            this.f4571e = null;
            if (this.f4574h) {
                this.f4574h = false;
                mo24280p();
            }
            throw th;
        }
    }

    /* renamed from: m */
    public Uri mo6966m() {
        return this.f4572f;
    }

    public int read(byte[] bArr, int i, int i2) throws FileDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        if (this.f4573g == 0) {
            return -1;
        }
        try {
            int read = ((RandomAccessFile) w67.m29360j(this.f4571e)).read(bArr, i, (int) Math.min(this.f4573g, (long) i2));
            if (read > 0) {
                this.f4573g -= (long) read;
                mo24279o(read);
            }
            return read;
        } catch (IOException e) {
            throw new FileDataSourceException((Throwable) e, (int) PlaybackException.ERROR_CODE_IO_UNSPECIFIED);
        }
    }
}
