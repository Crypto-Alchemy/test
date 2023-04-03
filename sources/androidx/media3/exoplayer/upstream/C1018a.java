package androidx.media3.exoplayer.upstream;

import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.exoplayer.upstream.C1019b;
import androidx.media3.exoplayer.upstream.Loader;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: androidx.media3.exoplayer.upstream.a */
/* compiled from: DefaultLoadErrorHandlingPolicy */
public class C1018a implements C1019b {

    /* renamed from: a */
    public final int f5467a;

    public C1018a() {
        this(-1);
    }

    /* renamed from: a */
    public long mo7824a(C1019b.C1022c cVar) {
        IOException iOException = cVar.f5476c;
        if ((iOException instanceof ParserException) || (iOException instanceof FileNotFoundException) || (iOException instanceof HttpDataSource$CleartextNotPermittedException) || (iOException instanceof Loader.UnexpectedLoaderException) || DataSourceException.isCausedByPositionOutOfRange(iOException)) {
            return CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        }
        return (long) Math.min((cVar.f5477d - 1) * 1000, 5000);
    }

    /* renamed from: b */
    public int mo7825b(int i) {
        int i2 = this.f5467a;
        if (i2 != -1) {
            return i2;
        }
        if (i == 7) {
            return 6;
        }
        return 3;
    }

    /* renamed from: c */
    public /* synthetic */ void mo7826c(long j) {
        ui3.m28299a(this, j);
    }

    /* renamed from: d */
    public C1019b.C1021b mo7827d(C1019b.C1020a aVar, C1019b.C1022c cVar) {
        if (!mo7828e(cVar.f5476c)) {
            return null;
        }
        if (aVar.mo7829a(1)) {
            return new C1019b.C1021b(1, 300000);
        }
        if (aVar.mo7829a(2)) {
            return new C1019b.C1021b(2, 60000);
        }
        return null;
    }

    /* renamed from: e */
    public boolean mo7828e(IOException iOException) {
        if (!(iOException instanceof HttpDataSource$InvalidResponseCodeException)) {
            return false;
        }
        int i = ((HttpDataSource$InvalidResponseCodeException) iOException).responseCode;
        if (i == 403 || i == 404 || i == 410 || i == 416 || i == 500 || i == 503) {
            return true;
        }
        return false;
    }

    public C1018a(int i) {
        this.f5467a = i;
    }
}
