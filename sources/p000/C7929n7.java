package p000;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;
import org.java_websocket.C9058a;
import org.java_websocket.WebSocket;

/* renamed from: n7 */
/* compiled from: AbstractWebSocket */
public abstract class C7929n7 extends zj7 {

    /* renamed from: a */
    public boolean f41116a;

    /* renamed from: d */
    public boolean f41117d;

    /* renamed from: e */
    public Timer f41118e;

    /* renamed from: g */
    public TimerTask f41119g;

    /* renamed from: k */
    public int f41120k = 60;

    /* renamed from: n7$a */
    /* compiled from: AbstractWebSocket */
    public class C7930a extends TimerTask {

        /* renamed from: a */
        public ArrayList<WebSocket> f41121a = new ArrayList<>();

        public C7930a() {
        }

        public void run() {
            this.f41121a.clear();
            this.f41121a.addAll(C7929n7.this.mo50250q());
            long currentTimeMillis = System.currentTimeMillis() - ((long) (C7929n7.this.f41120k * 1500));
            Iterator<WebSocket> it = this.f41121a.iterator();
            while (it.hasNext()) {
                WebSocket next = it.next();
                if (next instanceof C9058a) {
                    C9058a aVar = (C9058a) next;
                    if (aVar.mo64893q() < currentTimeMillis) {
                        if (C9058a.f43883X) {
                            PrintStream printStream = System.out;
                            printStream.println("Closing connection due to no pong received: " + next.toString());
                        }
                        aVar.mo64881e(1006, "The connection was closed because the other endpoint did not respond with a pong in time. For more information check: https://github.com/TooTallNate/Java-WebSocket/wiki/Lost-connection-detection");
                    } else if (aVar.mo64899v()) {
                        aVar.mo64903z();
                    } else if (C9058a.f43883X) {
                        PrintStream printStream2 = System.out;
                        printStream2.println("Trying to ping a non open connection: " + next.toString());
                    }
                }
            }
            this.f41121a.clear();
        }
    }

    /* renamed from: p */
    public final void mo56381p() {
        Timer timer = this.f41118e;
        if (timer != null) {
            timer.cancel();
            this.f41118e = null;
        }
        TimerTask timerTask = this.f41119g;
        if (timerTask != null) {
            timerTask.cancel();
            this.f41119g = null;
        }
    }

    /* renamed from: q */
    public abstract Collection<WebSocket> mo50250q();

    /* renamed from: r */
    public boolean mo56382r() {
        return this.f41117d;
    }

    /* renamed from: s */
    public boolean mo56383s() {
        return this.f41116a;
    }

    /* renamed from: t */
    public final void mo56384t() {
        mo56381p();
        this.f41118e = new Timer("WebSocketTimer");
        C7930a aVar = new C7930a();
        this.f41119g = aVar;
        Timer timer = this.f41118e;
        int i = this.f41120k;
        timer.scheduleAtFixedRate(aVar, (long) (i * 1000), (long) (i * 1000));
    }

    /* renamed from: u */
    public void mo56385u(boolean z) {
        this.f41117d = z;
    }

    /* renamed from: v */
    public void mo56386v(boolean z) {
        this.f41116a = z;
    }

    /* renamed from: w */
    public void mo56387w() {
        if (this.f41120k > 0) {
            if (C9058a.f43883X) {
                System.out.println("Connection lost timer started");
            }
            mo56384t();
        } else if (C9058a.f43883X) {
            System.out.println("Connection lost timer deactivated");
        }
    }

    /* renamed from: x */
    public void mo56388x() {
        if (this.f41118e != null || this.f41119g != null) {
            if (C9058a.f43883X) {
                System.out.println("Connection lost timer stopped");
            }
            mo56381p();
        }
    }
}
