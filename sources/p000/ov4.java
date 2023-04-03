package p000;

import android.annotation.SuppressLint;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.web3j.ens.contracts.generated.PublicResolver;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0007B\u001f\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\t\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011¨\u0006\u0019"}, mo44877d2 = {"Lov4;", "", "", "processLock", "Lr37;", "b", "d", "a", "Z", "Ljava/io/File;", "Ljava/io/File;", "lockFile", "Ljava/util/concurrent/locks/Lock;", "c", "Ljava/util/concurrent/locks/Lock;", "threadLock", "Ljava/nio/channels/FileChannel;", "Ljava/nio/channels/FileChannel;", "lockChannel", "", "name", "lockDir", "<init>", "(Ljava/lang/String;Ljava/io/File;Z)V", "e", "sqlite-framework_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: ov4 */
/* compiled from: ProcessLock.kt */
public final class ov4 {

    /* renamed from: e */
    public static final C2996a f16079e = new C2996a((DefaultConstructorMarker) null);

    /* renamed from: f */
    public static final Map<String, Lock> f16080f = new HashMap();

    /* renamed from: a */
    public final boolean f16081a;

    /* renamed from: b */
    public final File f16082b;
    @SuppressLint({"SyntheticAccessor"})

    /* renamed from: c */
    public final Lock f16083c;

    /* renamed from: d */
    public FileChannel f16084d;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u0014\u0010\u0006\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, mo44877d2 = {"Lov4$a;", "", "", "key", "Ljava/util/concurrent/locks/Lock;", "b", "TAG", "Ljava/lang/String;", "", "threadLocksMap", "Ljava/util/Map;", "<init>", "()V", "sqlite-framework_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: ov4$a */
    /* compiled from: ProcessLock.kt */
    public static final class C2996a {
        public C2996a() {
        }

        public /* synthetic */ C2996a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public final Lock mo24122b(String str) {
            Lock lock;
            synchronized (ov4.f16080f) {
                Map a = ov4.f16080f;
                Object obj = a.get(str);
                if (obj == null) {
                    obj = new ReentrantLock();
                    a.put(str, obj);
                }
                lock = (Lock) obj;
            }
            return lock;
        }
    }

    public ov4(String str, File file, boolean z) {
        vx2.m53591g(str, PublicResolver.FUNC_NAME);
        vx2.m53591g(file, "lockDir");
        this.f16081a = z;
        File file2 = new File(file, str + ".lck");
        this.f16082b = file2;
        C2996a aVar = f16079e;
        String absolutePath = file2.getAbsolutePath();
        vx2.m53590f(absolutePath, "lockFile.absolutePath");
        this.f16083c = aVar.mo24122b(absolutePath);
    }

    /* renamed from: c */
    public static /* synthetic */ void m24065c(ov4 ov4, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = ov4.f16081a;
        }
        ov4.mo24120b(z);
    }

    /* renamed from: b */
    public final void mo24120b(boolean z) {
        this.f16083c.lock();
        if (z) {
            try {
                File parentFile = this.f16082b.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(this.f16082b).getChannel();
                channel.lock();
                this.f16084d = channel;
            } catch (IOException unused) {
                this.f16084d = null;
            }
        }
    }

    /* renamed from: d */
    public final void mo24121d() {
        try {
            FileChannel fileChannel = this.f16084d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f16083c.unlock();
    }
}
