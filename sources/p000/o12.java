package p000;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.web3j.protocol.core.filters.FilterException;
import p000.ag5;
import p000.ps1;

/* renamed from: o12 */
/* compiled from: Filter */
public abstract class o12<T> {
    private static final uk3 log = vk3.m73272i(o12.class);
    private long blockTime;
    public o90<T> callback;
    private volatile BigInteger filterId;
    public ScheduledFuture<?> schedule;
    private ScheduledExecutorService scheduledExecutorService;
    public final vj7 web3j;

    public o12(vj7 vj7, o90<T> o90) {
        this.web3j = vj7;
        this.callback = o90;
    }

    private void getInitialFilterLogs() {
        ps1 ps1;
        try {
            qi4<zd5<?, ps1>> filterLogs = getFilterLogs(this.filterId);
            if (filterLogs.mo47120c()) {
                ps1 = (ps1) filterLogs.mo47119b().send();
            } else {
                ps1 = new ps1();
                ps1.setResult((List<ps1.C9191c>) Collections.emptyList());
            }
            process(ps1.getLogs());
        } catch (IOException e) {
            throwException((Throwable) e);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$run$0(as1 as1) {
        try {
            pollFilter(as1);
        } catch (Throwable th) {
            log.error("Error sending request", th);
        }
    }

    private void pollFilter(as1 as1) {
        ps1 ps1;
        try {
            ps1 = this.web3j.ethGetFilterChanges(this.filterId).send();
        } catch (IOException e) {
            throwException((Throwable) e);
            ps1 = null;
        }
        if (ps1.hasError()) {
            ag5.C6827a error = ps1.getError();
            if (error.getCode() != -32000) {
                throwException(error);
            } else {
                reinstallFilter();
            }
        } else {
            process(ps1.getLogs());
        }
    }

    private void reinstallFilter() {
        uk3 uk3 = log;
        uk3.warn("The filter has not been found. Filter id: " + this.filterId);
        this.schedule.cancel(true);
        run(this.scheduledExecutorService, this.blockTime);
    }

    public void cancel() {
        this.schedule.cancel(false);
        try {
            zs1 uninstallFilter = uninstallFilter(this.filterId);
            if (uninstallFilter.hasError()) {
                throwException(uninstallFilter.getError());
            }
            if (!uninstallFilter.isUninstalled()) {
                throw new FilterException("Filter with id '" + this.filterId + "' failed to uninstall");
            }
        } catch (IOException e) {
            throwException((Throwable) e);
        }
    }

    public abstract qi4<zd5<?, ps1>> getFilterLogs(BigInteger bigInteger);

    public abstract void process(List<ps1.C9191c> list);

    public void run(ScheduledExecutorService scheduledExecutorService2, long j) {
        try {
            as1 sendRequest = sendRequest();
            if (sendRequest.hasError()) {
                throwException(sendRequest.getError());
            }
            this.filterId = sendRequest.getFilterId();
            this.scheduledExecutorService = scheduledExecutorService2;
            this.blockTime = j;
            getInitialFilterLogs();
            this.schedule = scheduledExecutorService2.scheduleAtFixedRate(new m12(this, sendRequest), 0, j, TimeUnit.MILLISECONDS);
        } catch (IOException e) {
            throwException((Throwable) e);
        }
    }

    public abstract as1 sendRequest() throws IOException;

    public void throwException(ag5.C6827a aVar) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid request: ");
        if (aVar == null) {
            str = "Unknown Error";
        } else {
            str = aVar.getMessage();
        }
        sb.append(str);
        throw new FilterException(sb.toString());
    }

    public zs1 uninstallFilter(BigInteger bigInteger) throws IOException {
        return this.web3j.ethUninstallFilter(bigInteger).send();
    }

    public void throwException(Throwable th) {
        throw new FilterException("Error sending request", th);
    }
}
