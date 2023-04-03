package androidx.media3.datasource;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import androidx.media3.common.PlaybackException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import org.web3j.ens.contracts.generated.PublicResolver;

public final class ContentDataSource extends C3009oy {

    /* renamed from: e */
    public final ContentResolver f4565e;

    /* renamed from: f */
    public Uri f4566f;

    /* renamed from: g */
    public AssetFileDescriptor f4567g;

    /* renamed from: h */
    public FileInputStream f4568h;

    /* renamed from: i */
    public long f4569i;

    /* renamed from: j */
    public boolean f4570j;

    public static class ContentDataSourceException extends DataSourceException {
        @Deprecated
        public ContentDataSourceException(IOException iOException) {
            this(iOException, PlaybackException.ERROR_CODE_IO_UNSPECIFIED);
        }

        public ContentDataSourceException(IOException iOException, int i) {
            super((Throwable) iOException, i);
        }
    }

    public ContentDataSource(Context context) {
        super(false);
        this.f4565e = context.getContentResolver();
    }

    /* renamed from: b */
    public long mo6964b(d21 d21) throws ContentDataSourceException {
        AssetFileDescriptor assetFileDescriptor;
        d21 d212 = d21;
        int i = PlaybackException.ERROR_CODE_IO_UNSPECIFIED;
        try {
            Uri uri = d212.f10437a;
            this.f4566f = uri;
            mo24281q(d21);
            if (PublicResolver.FUNC_CONTENT.equals(d212.f10437a.getScheme())) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                assetFileDescriptor = this.f4565e.openTypedAssetFileDescriptor(uri, "*/*", bundle);
            } else {
                assetFileDescriptor = this.f4565e.openAssetFileDescriptor(uri, "r");
            }
            this.f4567g = assetFileDescriptor;
            if (assetFileDescriptor != null) {
                long length = assetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptor.getFileDescriptor());
                this.f4568h = fileInputStream;
                int i2 = (length > -1 ? 1 : (length == -1 ? 0 : -1));
                if (i2 != 0) {
                    if (d212.f10443g > length) {
                        throw new ContentDataSourceException((IOException) null, 2008);
                    }
                }
                long startOffset = assetFileDescriptor.getStartOffset();
                long j = length;
                long skip = fileInputStream.skip(d212.f10443g + startOffset) - startOffset;
                if (skip == d212.f10443g) {
                    if (i2 == 0) {
                        FileChannel channel = fileInputStream.getChannel();
                        long size = channel.size();
                        if (size == 0) {
                            this.f4569i = -1;
                        } else {
                            long position = size - channel.position();
                            this.f4569i = position;
                            if (position < 0) {
                                throw new ContentDataSourceException((IOException) null, 2008);
                            }
                        }
                    } else {
                        long j2 = j - skip;
                        this.f4569i = j2;
                        if (j2 < 0) {
                            throw new ContentDataSourceException((IOException) null, 2008);
                        }
                    }
                    long j3 = d212.f10444h;
                    if (j3 != -1) {
                        long j4 = this.f4569i;
                        if (j4 != -1) {
                            j3 = Math.min(j4, j3);
                        }
                        this.f4569i = j3;
                    }
                    this.f4570j = true;
                    mo24282r(d21);
                    long j5 = d212.f10444h;
                    if (j5 != -1) {
                        return j5;
                    }
                    return this.f4569i;
                }
                throw new ContentDataSourceException((IOException) null, 2008);
            }
            throw new ContentDataSourceException(new IOException("Could not open file descriptor for: " + uri), PlaybackException.ERROR_CODE_IO_UNSPECIFIED);
        } catch (ContentDataSourceException e) {
            throw e;
        } catch (IOException e2) {
            if (e2 instanceof FileNotFoundException) {
                i = PlaybackException.ERROR_CODE_IO_FILE_NOT_FOUND;
            }
            throw new ContentDataSourceException(e2, i);
        }
    }

    public void close() throws ContentDataSourceException {
        this.f4566f = null;
        try {
            FileInputStream fileInputStream = this.f4568h;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            this.f4568h = null;
            try {
                AssetFileDescriptor assetFileDescriptor = this.f4567g;
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                }
                this.f4567g = null;
                if (this.f4570j) {
                    this.f4570j = false;
                    mo24280p();
                }
            } catch (IOException e) {
                throw new ContentDataSourceException(e, PlaybackException.ERROR_CODE_IO_UNSPECIFIED);
            } catch (Throwable th) {
                this.f4567g = null;
                if (this.f4570j) {
                    this.f4570j = false;
                    mo24280p();
                }
                throw th;
            }
        } catch (IOException e2) {
            throw new ContentDataSourceException(e2, PlaybackException.ERROR_CODE_IO_UNSPECIFIED);
        } catch (Throwable th2) {
            this.f4568h = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.f4567g;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.f4567g = null;
                if (this.f4570j) {
                    this.f4570j = false;
                    mo24280p();
                }
                throw th2;
            } catch (IOException e3) {
                throw new ContentDataSourceException(e3, PlaybackException.ERROR_CODE_IO_UNSPECIFIED);
            } catch (Throwable th3) {
                this.f4567g = null;
                if (this.f4570j) {
                    this.f4570j = false;
                    mo24280p();
                }
                throw th3;
            }
        }
    }

    /* renamed from: m */
    public Uri mo6966m() {
        return this.f4566f;
    }

    public int read(byte[] bArr, int i, int i2) throws ContentDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f4569i;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new ContentDataSourceException(e, PlaybackException.ERROR_CODE_IO_UNSPECIFIED);
            }
        }
        int read = ((FileInputStream) w67.m29360j(this.f4568h)).read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.f4569i;
        if (j2 != -1) {
            this.f4569i = j2 - ((long) read);
        }
        mo24279o(read);
        return read;
    }
}
