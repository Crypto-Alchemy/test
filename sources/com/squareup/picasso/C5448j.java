package com.squareup.picasso;

import android.net.NetworkInfo;
import com.squareup.picasso.C5459q;
import com.squareup.picasso.Picasso;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.squareup.picasso.j */
/* compiled from: PicassoExecutorService */
public class C5448j extends ThreadPoolExecutor {

    /* renamed from: com.squareup.picasso.j$a */
    /* compiled from: PicassoExecutorService */
    public static final class C5449a extends FutureTask<C5431c> implements Comparable<C5449a> {

        /* renamed from: a */
        public final C5431c f26886a;

        public C5449a(C5431c cVar) {
            super(cVar, (Object) null);
            this.f26886a = cVar;
        }

        /* renamed from: a */
        public int compareTo(C5449a aVar) {
            Picasso.Priority r = this.f26886a.mo39514r();
            Picasso.Priority r2 = aVar.f26886a.mo39514r();
            if (r == r2) {
                return this.f26886a.f26840a - aVar.f26886a.f26840a;
            }
            return r2.ordinal() - r.ordinal();
        }
    }

    public C5448j() {
        super(3, 3, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new C5459q.C5462c());
    }

    /* renamed from: a */
    public void mo39561a(NetworkInfo networkInfo) {
        if (networkInfo == null || !networkInfo.isConnectedOrConnecting()) {
            mo39562b(3);
            return;
        }
        int type = networkInfo.getType();
        if (type == 0) {
            int subtype = networkInfo.getSubtype();
            switch (subtype) {
                case 1:
                case 2:
                    mo39562b(1);
                    return;
                case 3:
                case 4:
                case 5:
                case 6:
                    break;
                default:
                    switch (subtype) {
                        case 12:
                            break;
                        case 13:
                        case 14:
                        case 15:
                            mo39562b(3);
                            return;
                        default:
                            mo39562b(3);
                            return;
                    }
            }
            mo39562b(2);
        } else if (type == 1 || type == 6 || type == 9) {
            mo39562b(4);
        } else {
            mo39562b(3);
        }
    }

    /* renamed from: b */
    public final void mo39562b(int i) {
        setCorePoolSize(i);
        setMaximumPoolSize(i);
    }

    public Future<?> submit(Runnable runnable) {
        C5449a aVar = new C5449a((C5431c) runnable);
        execute(aVar);
        return aVar;
    }
}
