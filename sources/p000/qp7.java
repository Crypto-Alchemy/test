package p000;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.zip.CRC32;
import java.util.zip.ZipException;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Stream;

/* renamed from: qp7 */
/* compiled from: ZipUtil */
public final class qp7 {

    /* renamed from: qp7$a */
    /* compiled from: ZipUtil */
    public static class C3161a {

        /* renamed from: a */
        public long f17003a;

        /* renamed from: b */
        public long f17004b;
    }

    /* renamed from: a */
    public static long m25827a(RandomAccessFile randomAccessFile, C3161a aVar) throws IOException {
        CRC32 crc32 = new CRC32();
        long j = aVar.f17004b;
        randomAccessFile.seek(aVar.f17003a);
        int min = (int) Math.min(Http2Stream.EMIT_BUFFER_SIZE, j);
        byte[] bArr = new byte[Http2.INITIAL_MAX_FRAME_SIZE];
        int read = randomAccessFile.read(bArr, 0, min);
        while (read != -1) {
            crc32.update(bArr, 0, read);
            j -= (long) read;
            if (j == 0) {
                break;
            }
            read = randomAccessFile.read(bArr, 0, (int) Math.min(Http2Stream.EMIT_BUFFER_SIZE, j));
        }
        return crc32.getValue();
    }

    /* renamed from: b */
    public static C3161a m25828b(RandomAccessFile randomAccessFile) throws IOException, ZipException {
        long length = randomAccessFile.length() - 22;
        long j = 0;
        if (length >= 0) {
            long j2 = length - 65536;
            if (j2 >= 0) {
                j = j2;
            }
            int reverseBytes = Integer.reverseBytes(101010256);
            do {
                randomAccessFile.seek(length);
                if (randomAccessFile.readInt() == reverseBytes) {
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    C3161a aVar = new C3161a();
                    aVar.f17004b = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                    aVar.f17003a = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                    return aVar;
                }
                length--;
            } while (length >= j);
            throw new ZipException("End Of Central Directory signature not found");
        }
        throw new ZipException("File too short to be a zip file: " + randomAccessFile.length());
    }

    /* renamed from: c */
    public static long m25829c(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            return m25827a(randomAccessFile, m25828b(randomAccessFile));
        } finally {
            randomAccessFile.close();
        }
    }
}
