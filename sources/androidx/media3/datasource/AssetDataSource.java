package androidx.media3.datasource;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.media3.common.PlaybackException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public final class AssetDataSource extends C3009oy {

    /* renamed from: e */
    public final AssetManager f4560e;

    /* renamed from: f */
    public Uri f4561f;

    /* renamed from: g */
    public InputStream f4562g;

    /* renamed from: h */
    public long f4563h;

    /* renamed from: i */
    public boolean f4564i;

    public static final class AssetDataSourceException extends DataSourceException {
        @Deprecated
        public AssetDataSourceException(IOException iOException) {
            super((Throwable) iOException, (int) PlaybackException.ERROR_CODE_IO_UNSPECIFIED);
        }

        public AssetDataSourceException(Throwable th, int i) {
            super(th, i);
        }
    }

    public AssetDataSource(Context context) {
        super(false);
        this.f4560e = context.getAssets();
    }

    /* renamed from: b */
    public long mo6964b(d21 d21) throws AssetDataSourceException {
        int i;
        try {
            Uri uri = d21.f10437a;
            this.f4561f = uri;
            String str = (String) C2725kr.m20985e(uri.getPath());
            if (str.startsWith("/android_asset/")) {
                str = str.substring(15);
            } else if (str.startsWith("/")) {
                str = str.substring(1);
            }
            mo24281q(d21);
            InputStream open = this.f4560e.open(str, 1);
            this.f4562g = open;
            if (open.skip(d21.f10443g) >= d21.f10443g) {
                long j = d21.f10444h;
                if (j != -1) {
                    this.f4563h = j;
                } else {
                    long available = (long) this.f4562g.available();
                    this.f4563h = available;
                    if (available == 2147483647L) {
                        this.f4563h = -1;
                    }
                }
                this.f4564i = true;
                mo24282r(d21);
                return this.f4563h;
            }
            throw new AssetDataSourceException((Throwable) null, 2008);
        } catch (AssetDataSourceException e) {
            throw e;
        } catch (IOException e2) {
            if (e2 instanceof FileNotFoundException) {
                i = PlaybackException.ERROR_CODE_IO_FILE_NOT_FOUND;
            } else {
                i = PlaybackException.ERROR_CODE_IO_UNSPECIFIED;
            }
            throw new AssetDataSourceException(e2, i);
        }
    }

    public void close() throws AssetDataSourceException {
        this.f4561f = null;
        try {
            InputStream inputStream = this.f4562g;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f4562g = null;
            if (this.f4564i) {
                this.f4564i = false;
                mo24280p();
            }
        } catch (IOException e) {
            throw new AssetDataSourceException(e, PlaybackException.ERROR_CODE_IO_UNSPECIFIED);
        } catch (Throwable th) {
            this.f4562g = null;
            if (this.f4564i) {
                this.f4564i = false;
                mo24280p();
            }
            throw th;
        }
    }

    /* renamed from: m */
    public Uri mo6966m() {
        return this.f4561f;
    }

    public int read(byte[] bArr, int i, int i2) throws AssetDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f4563h;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new AssetDataSourceException(e, PlaybackException.ERROR_CODE_IO_UNSPECIFIED);
            }
        }
        int read = ((InputStream) w67.m29360j(this.f4562g)).read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.f4563h;
        if (j2 != -1) {
            this.f4563h = j2 - ((long) read);
        }
        mo24279o(read);
        return read;
    }
}
