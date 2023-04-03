package androidx.media3.datasource;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.common.PlaybackException;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

public final class RawResourceDataSource extends C3009oy {

    /* renamed from: e */
    public final Resources f4575e;

    /* renamed from: f */
    public final String f4576f;

    /* renamed from: g */
    public Uri f4577g;

    /* renamed from: h */
    public AssetFileDescriptor f4578h;

    /* renamed from: i */
    public InputStream f4579i;

    /* renamed from: j */
    public long f4580j;

    /* renamed from: k */
    public boolean f4581k;

    public static class RawResourceDataSourceException extends DataSourceException {
        @Deprecated
        public RawResourceDataSourceException(String str) {
            super(str, (Throwable) null, PlaybackException.ERROR_CODE_IO_UNSPECIFIED);
        }

        @Deprecated
        public RawResourceDataSourceException(Throwable th) {
            super(th, (int) PlaybackException.ERROR_CODE_IO_UNSPECIFIED);
        }

        public RawResourceDataSourceException(String str, Throwable th, int i) {
            super(str, th, i);
        }
    }

    public RawResourceDataSource(Context context) {
        super(false);
        this.f4575e = context.getResources();
        this.f4576f = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
    }

    /* renamed from: b */
    public long mo6964b(d21 d21) throws RawResourceDataSourceException {
        int i;
        String str;
        d21 d212 = d21;
        Uri uri = d212.f10437a;
        this.f4577g = uri;
        if (TextUtils.equals("rawresource", uri.getScheme()) || (TextUtils.equals("android.resource", uri.getScheme()) && uri.getPathSegments().size() == 1 && ((String) C2725kr.m20985e(uri.getLastPathSegment())).matches("\\d+"))) {
            try {
                i = Integer.parseInt((String) C2725kr.m20985e(uri.getLastPathSegment()));
            } catch (NumberFormatException unused) {
                throw new RawResourceDataSourceException("Resource identifier must be an integer.", (Throwable) null, PlaybackException.ERROR_CODE_FAILED_RUNTIME_CHECK);
            }
        } else if (TextUtils.equals("android.resource", uri.getScheme())) {
            String str2 = (String) C2725kr.m20985e(uri.getPath());
            if (str2.startsWith("/")) {
                str2 = str2.substring(1);
            }
            String host = uri.getHost();
            StringBuilder sb = new StringBuilder();
            if (TextUtils.isEmpty(host)) {
                str = "";
            } else {
                str = host + ":";
            }
            sb.append(str);
            sb.append(str2);
            i = this.f4575e.getIdentifier(sb.toString(), "raw", this.f4576f);
            if (i == 0) {
                throw new RawResourceDataSourceException("Resource not found.", (Throwable) null, PlaybackException.ERROR_CODE_IO_FILE_NOT_FOUND);
            }
        } else {
            throw new RawResourceDataSourceException("URI must either use scheme rawresource or android.resource", (Throwable) null, PlaybackException.ERROR_CODE_FAILED_RUNTIME_CHECK);
        }
        mo24281q(d21);
        try {
            AssetFileDescriptor openRawResourceFd = this.f4575e.openRawResourceFd(i);
            this.f4578h = openRawResourceFd;
            if (openRawResourceFd != null) {
                long length = openRawResourceFd.getLength();
                FileInputStream fileInputStream = new FileInputStream(openRawResourceFd.getFileDescriptor());
                this.f4579i = fileInputStream;
                int i2 = (length > -1 ? 1 : (length == -1 ? 0 : -1));
                if (i2 != 0) {
                    try {
                        if (d212.f10443g > length) {
                            throw new RawResourceDataSourceException((String) null, (Throwable) null, 2008);
                        }
                    } catch (RawResourceDataSourceException e) {
                        throw e;
                    } catch (IOException e2) {
                        throw new RawResourceDataSourceException((String) null, e2, PlaybackException.ERROR_CODE_IO_UNSPECIFIED);
                    }
                }
                long startOffset = openRawResourceFd.getStartOffset();
                long skip = fileInputStream.skip(d212.f10443g + startOffset) - startOffset;
                if (skip == d212.f10443g) {
                    if (i2 == 0) {
                        FileChannel channel = fileInputStream.getChannel();
                        if (channel.size() == 0) {
                            this.f4580j = -1;
                        } else {
                            long size = channel.size() - channel.position();
                            this.f4580j = size;
                            if (size < 0) {
                                throw new RawResourceDataSourceException((String) null, (Throwable) null, 2008);
                            }
                        }
                    } else {
                        long j = length - skip;
                        this.f4580j = j;
                        if (j < 0) {
                            throw new DataSourceException(2008);
                        }
                    }
                    long j2 = d212.f10444h;
                    if (j2 != -1) {
                        long j3 = this.f4580j;
                        if (j3 != -1) {
                            j2 = Math.min(j3, j2);
                        }
                        this.f4580j = j2;
                    }
                    this.f4581k = true;
                    mo24282r(d21);
                    long j4 = d212.f10444h;
                    if (j4 != -1) {
                        return j4;
                    }
                    return this.f4580j;
                }
                throw new RawResourceDataSourceException((String) null, (Throwable) null, 2008);
            }
            throw new RawResourceDataSourceException("Resource is compressed: " + uri, (Throwable) null, PlaybackException.ERROR_CODE_IO_UNSPECIFIED);
        } catch (Resources.NotFoundException e3) {
            throw new RawResourceDataSourceException((String) null, e3, PlaybackException.ERROR_CODE_IO_FILE_NOT_FOUND);
        }
    }

    public void close() throws RawResourceDataSourceException {
        this.f4577g = null;
        try {
            InputStream inputStream = this.f4579i;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f4579i = null;
            try {
                AssetFileDescriptor assetFileDescriptor = this.f4578h;
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                }
                this.f4578h = null;
                if (this.f4581k) {
                    this.f4581k = false;
                    mo24280p();
                }
            } catch (IOException e) {
                throw new RawResourceDataSourceException((String) null, e, PlaybackException.ERROR_CODE_IO_UNSPECIFIED);
            } catch (Throwable th) {
                this.f4578h = null;
                if (this.f4581k) {
                    this.f4581k = false;
                    mo24280p();
                }
                throw th;
            }
        } catch (IOException e2) {
            throw new RawResourceDataSourceException((String) null, e2, PlaybackException.ERROR_CODE_IO_UNSPECIFIED);
        } catch (Throwable th2) {
            this.f4579i = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.f4578h;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.f4578h = null;
                if (this.f4581k) {
                    this.f4581k = false;
                    mo24280p();
                }
                throw th2;
            } catch (IOException e3) {
                throw new RawResourceDataSourceException((String) null, e3, PlaybackException.ERROR_CODE_IO_UNSPECIFIED);
            } catch (Throwable th3) {
                this.f4578h = null;
                if (this.f4581k) {
                    this.f4581k = false;
                    mo24280p();
                }
                throw th3;
            }
        }
    }

    /* renamed from: m */
    public Uri mo6966m() {
        return this.f4577g;
    }

    public int read(byte[] bArr, int i, int i2) throws RawResourceDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f4580j;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new RawResourceDataSourceException((String) null, e, PlaybackException.ERROR_CODE_IO_UNSPECIFIED);
            }
        }
        int read = ((InputStream) w67.m29360j(this.f4579i)).read(bArr, i, i2);
        if (read != -1) {
            long j2 = this.f4580j;
            if (j2 != -1) {
                this.f4580j = j2 - ((long) read);
            }
            mo24279o(read);
            return read;
        } else if (this.f4580j == -1) {
            return -1;
        } else {
            throw new RawResourceDataSourceException("End of stream reached having not read sufficient data.", new EOFException(), PlaybackException.ERROR_CODE_IO_UNSPECIFIED);
        }
    }
}
