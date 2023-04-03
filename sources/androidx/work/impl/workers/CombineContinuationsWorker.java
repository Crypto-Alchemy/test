package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class CombineContinuationsWorker extends Worker {
    public CombineContinuationsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* renamed from: r */
    public ListenableWorker.C1509a mo10897r() {
        return ListenableWorker.C1509a.m10435d(mo10872g());
    }
}
