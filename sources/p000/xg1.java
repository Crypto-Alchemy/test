package p000;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;

/* renamed from: xg1 */
/* compiled from: DiskCacheStrategy */
public abstract class xg1 {

    /* renamed from: a */
    public static final xg1 f19827a = new C3595a();

    /* renamed from: b */
    public static final xg1 f19828b = new C3596b();

    /* renamed from: c */
    public static final xg1 f19829c = new C3597c();

    /* renamed from: d */
    public static final xg1 f19830d = new C3598d();

    /* renamed from: e */
    public static final xg1 f19831e = new C3599e();

    /* renamed from: xg1$a */
    /* compiled from: DiskCacheStrategy */
    public class C3595a extends xg1 {
        /* renamed from: a */
        public boolean mo27729a() {
            return true;
        }

        /* renamed from: b */
        public boolean mo27730b() {
            return true;
        }

        /* renamed from: c */
        public boolean mo27731c(DataSource dataSource) {
            if (dataSource == DataSource.REMOTE) {
                return true;
            }
            return false;
        }

        /* renamed from: d */
        public boolean mo27732d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            if (dataSource == DataSource.RESOURCE_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: xg1$b */
    /* compiled from: DiskCacheStrategy */
    public class C3596b extends xg1 {
        /* renamed from: a */
        public boolean mo27729a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo27730b() {
            return false;
        }

        /* renamed from: c */
        public boolean mo27731c(DataSource dataSource) {
            return false;
        }

        /* renamed from: d */
        public boolean mo27732d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }
    }

    /* renamed from: xg1$c */
    /* compiled from: DiskCacheStrategy */
    public class C3597c extends xg1 {
        /* renamed from: a */
        public boolean mo27729a() {
            return true;
        }

        /* renamed from: b */
        public boolean mo27730b() {
            return false;
        }

        /* renamed from: c */
        public boolean mo27731c(DataSource dataSource) {
            if (dataSource == DataSource.DATA_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) {
                return false;
            }
            return true;
        }

        /* renamed from: d */
        public boolean mo27732d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }
    }

    /* renamed from: xg1$d */
    /* compiled from: DiskCacheStrategy */
    public class C3598d extends xg1 {
        /* renamed from: a */
        public boolean mo27729a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo27730b() {
            return true;
        }

        /* renamed from: c */
        public boolean mo27731c(DataSource dataSource) {
            return false;
        }

        /* renamed from: d */
        public boolean mo27732d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            if (dataSource == DataSource.RESOURCE_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: xg1$e */
    /* compiled from: DiskCacheStrategy */
    public class C3599e extends xg1 {
        /* renamed from: a */
        public boolean mo27729a() {
            return true;
        }

        /* renamed from: b */
        public boolean mo27730b() {
            return true;
        }

        /* renamed from: c */
        public boolean mo27731c(DataSource dataSource) {
            if (dataSource == DataSource.REMOTE) {
                return true;
            }
            return false;
        }

        /* renamed from: d */
        public boolean mo27732d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            if (((!z || dataSource != DataSource.DATA_DISK_CACHE) && dataSource != DataSource.LOCAL) || encodeStrategy != EncodeStrategy.TRANSFORMED) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    public abstract boolean mo27729a();

    /* renamed from: b */
    public abstract boolean mo27730b();

    /* renamed from: c */
    public abstract boolean mo27731c(DataSource dataSource);

    /* renamed from: d */
    public abstract boolean mo27732d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy);
}
