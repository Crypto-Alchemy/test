package p000;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* renamed from: ou7 */
public final class ou7 implements nt7 {

    /* renamed from: a */
    public final FileChannel f32450a;

    /* renamed from: b */
    public final long f32451b;

    /* renamed from: c */
    public final long f32452c;

    public ou7(FileChannel fileChannel, long j, long j2) {
        this.f32450a = fileChannel;
        this.f32451b = j;
        this.f32452c = j2;
    }

    /* renamed from: a */
    public final long mo46219a() {
        return this.f32452c;
    }

    /* renamed from: a */
    public final void mo46220a(MessageDigest[] messageDigestArr, long j, int i) throws IOException {
        MappedByteBuffer map = this.f32450a.map(FileChannel.MapMode.READ_ONLY, this.f32451b + j, (long) i);
        map.load();
        for (MessageDigest update : messageDigestArr) {
            map.position(0);
            update.update(map);
        }
    }
}
