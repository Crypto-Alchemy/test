package androidx.media3.exoplayer.scheduler;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.os.PersistableBundle;

public final class PlatformScheduler$PlatformSchedulerService extends JobService {
    public boolean onStartJob(JobParameters jobParameters) {
        PersistableBundle extras = jobParameters.getExtras();
        int b = new Requirements(extras.getInt("requirements")).mo7541b(this);
        if (b == 0) {
            w67.m29323O0(this, new Intent((String) C2725kr.m20985e(extras.getString("service_action"))).setPackage((String) C2725kr.m20985e(extras.getString("service_package"))));
            return false;
        }
        gk3.m18132i("PlatformScheduler", "Requirements not met: " + b);
        jobFinished(jobParameters, true);
        return false;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }
}
