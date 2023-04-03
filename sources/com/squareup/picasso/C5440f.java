package com.squareup.picasso;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.squareup.picasso.NetworkRequestHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

/* renamed from: com.squareup.picasso.f */
/* compiled from: Dispatcher */
public class C5440f {

    /* renamed from: a */
    public final C5443b f26857a;

    /* renamed from: b */
    public final Context f26858b;

    /* renamed from: c */
    public final ExecutorService f26859c;

    /* renamed from: d */
    public final si1 f26860d;

    /* renamed from: e */
    public final Map<String, C5431c> f26861e = new LinkedHashMap();

    /* renamed from: f */
    public final Map<Object, C5428a> f26862f = new WeakHashMap();

    /* renamed from: g */
    public final Map<Object, C5428a> f26863g = new WeakHashMap();

    /* renamed from: h */
    public final Set<Object> f26864h = new LinkedHashSet();

    /* renamed from: i */
    public final Handler f26865i;

    /* renamed from: j */
    public final Handler f26866j;

    /* renamed from: k */
    public final c80 f26867k;

    /* renamed from: l */
    public final m96 f26868l;

    /* renamed from: m */
    public final List<C5431c> f26869m;

    /* renamed from: n */
    public final C5444c f26870n;

    /* renamed from: o */
    public final boolean f26871o;

    /* renamed from: p */
    public boolean f26872p;

    /* renamed from: com.squareup.picasso.f$a */
    /* compiled from: Dispatcher */
    public static class C5441a extends Handler {

        /* renamed from: a */
        public final C5440f f26873a;

        /* renamed from: com.squareup.picasso.f$a$a */
        /* compiled from: Dispatcher */
        public class C5442a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Message f26874a;

            public C5442a(Message message) {
                this.f26874a = message;
            }

            public void run() {
                throw new AssertionError("Unknown handler message received: " + this.f26874a.what);
            }
        }

        public C5441a(Looper looper, C5440f fVar) {
            super(looper);
            this.f26873a = fVar;
        }

        public void handleMessage(Message message) {
            boolean z = false;
            switch (message.what) {
                case 1:
                    this.f26873a.mo39550v((C5428a) message.obj);
                    return;
                case 2:
                    this.f26873a.mo39543o((C5428a) message.obj);
                    return;
                case 4:
                    this.f26873a.mo39544p((C5431c) message.obj);
                    return;
                case 5:
                    this.f26873a.mo39549u((C5431c) message.obj);
                    return;
                case 6:
                    this.f26873a.mo39545q((C5431c) message.obj, false);
                    return;
                case 7:
                    this.f26873a.mo39542n();
                    return;
                case 9:
                    this.f26873a.mo39546r((NetworkInfo) message.obj);
                    return;
                case 10:
                    C5440f fVar = this.f26873a;
                    if (message.arg1 == 1) {
                        z = true;
                    }
                    fVar.mo39541m(z);
                    return;
                case 11:
                    this.f26873a.mo39547s(message.obj);
                    return;
                case 12:
                    this.f26873a.mo39548t(message.obj);
                    return;
                default:
                    Picasso.f26774p.post(new C5442a(message));
                    return;
            }
        }
    }

    /* renamed from: com.squareup.picasso.f$b */
    /* compiled from: Dispatcher */
    public static class C5443b extends HandlerThread {
        public C5443b() {
            super("Picasso-Dispatcher", 10);
        }
    }

    /* renamed from: com.squareup.picasso.f$c */
    /* compiled from: Dispatcher */
    public static class C5444c extends BroadcastReceiver {

        /* renamed from: a */
        public final C5440f f26876a;

        public C5444c(C5440f fVar) {
            this.f26876a = fVar;
        }

        /* renamed from: a */
        public void mo39554a() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
            if (this.f26876a.f26871o) {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
            this.f26876a.f26858b.registerReceiver(this, intentFilter);
        }

        @SuppressLint({"MissingPermission"})
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                String action = intent.getAction();
                if ("android.intent.action.AIRPLANE_MODE".equals(action)) {
                    if (intent.hasExtra("state")) {
                        this.f26876a.mo39530b(intent.getBooleanExtra("state", false));
                    }
                } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                    this.f26876a.mo39534f(((ConnectivityManager) C5459q.m41886n(context, "connectivity")).getActiveNetworkInfo());
                }
            }
        }
    }

    public C5440f(Context context, ExecutorService executorService, Handler handler, si1 si1, c80 c80, m96 m96) {
        C5443b bVar = new C5443b();
        this.f26857a = bVar;
        bVar.start();
        C5459q.m41880h(bVar.getLooper());
        this.f26858b = context;
        this.f26859c = executorService;
        this.f26865i = new C5441a(bVar.getLooper(), this);
        this.f26860d = si1;
        this.f26866j = handler;
        this.f26867k = c80;
        this.f26868l = m96;
        this.f26869m = new ArrayList(4);
        this.f26872p = C5459q.m41888p(context);
        this.f26871o = C5459q.m41887o(context, "android.permission.ACCESS_NETWORK_STATE");
        C5444c cVar = new C5444c(this);
        this.f26870n = cVar;
        cVar.mo39554a();
    }

    /* renamed from: a */
    public final void mo39529a(C5431c cVar) {
        if (!cVar.mo39518u()) {
            Bitmap bitmap = cVar.f26833H;
            if (bitmap != null) {
                bitmap.prepareToDraw();
            }
            this.f26869m.add(cVar);
            if (!this.f26865i.hasMessages(7)) {
                this.f26865i.sendEmptyMessageDelayed(7, 200);
            }
        }
    }

    /* renamed from: b */
    public void mo39530b(boolean z) {
        Handler handler = this.f26865i;
        handler.sendMessage(handler.obtainMessage(10, z ? 1 : 0, 0));
    }

    /* renamed from: c */
    public void mo39531c(C5428a aVar) {
        Handler handler = this.f26865i;
        handler.sendMessage(handler.obtainMessage(2, aVar));
    }

    /* renamed from: d */
    public void mo39532d(C5431c cVar) {
        Handler handler = this.f26865i;
        handler.sendMessage(handler.obtainMessage(4, cVar));
    }

    /* renamed from: e */
    public void mo39533e(C5431c cVar) {
        Handler handler = this.f26865i;
        handler.sendMessage(handler.obtainMessage(6, cVar));
    }

    /* renamed from: f */
    public void mo39534f(NetworkInfo networkInfo) {
        Handler handler = this.f26865i;
        handler.sendMessage(handler.obtainMessage(9, networkInfo));
    }

    /* renamed from: g */
    public void mo39535g(C5431c cVar) {
        Handler handler = this.f26865i;
        handler.sendMessageDelayed(handler.obtainMessage(5, cVar), 500);
    }

    /* renamed from: h */
    public void mo39536h(C5428a aVar) {
        Handler handler = this.f26865i;
        handler.sendMessage(handler.obtainMessage(1, aVar));
    }

    /* renamed from: i */
    public final void mo39537i() {
        if (!this.f26862f.isEmpty()) {
            Iterator<C5428a> it = this.f26862f.values().iterator();
            while (it.hasNext()) {
                C5428a next = it.next();
                it.remove();
                if (next.mo39495g().f26789n) {
                    C5459q.m41891s("Dispatcher", "replaying", next.mo39497i().mo39569d());
                }
                mo39551w(next, false);
            }
        }
    }

    /* renamed from: j */
    public final void mo39538j(List<C5431c> list) {
        if (list != null && !list.isEmpty() && list.get(0).mo39513q().f26789n) {
            StringBuilder sb = new StringBuilder();
            for (C5431c next : list) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(C5459q.m41882j(next));
            }
            C5459q.m41891s("Dispatcher", "delivered", sb.toString());
        }
    }

    /* renamed from: k */
    public final void mo39539k(C5428a aVar) {
        Object k = aVar.mo39499k();
        if (k != null) {
            aVar.f26819k = true;
            this.f26862f.put(k, aVar);
        }
    }

    /* renamed from: l */
    public final void mo39540l(C5431c cVar) {
        C5428a h = cVar.mo39506h();
        if (h != null) {
            mo39539k(h);
        }
        List<C5428a> i = cVar.mo39507i();
        if (i != null) {
            int size = i.size();
            for (int i2 = 0; i2 < size; i2++) {
                mo39539k(i.get(i2));
            }
        }
    }

    /* renamed from: m */
    public void mo39541m(boolean z) {
        this.f26872p = z;
    }

    /* renamed from: n */
    public void mo39542n() {
        ArrayList arrayList = new ArrayList(this.f26869m);
        this.f26869m.clear();
        Handler handler = this.f26866j;
        handler.sendMessage(handler.obtainMessage(8, arrayList));
        mo39538j(arrayList);
    }

    /* renamed from: o */
    public void mo39543o(C5428a aVar) {
        String d = aVar.mo39492d();
        C5431c cVar = this.f26861e.get(d);
        if (cVar != null) {
            cVar.mo39505f(aVar);
            if (cVar.mo39503c()) {
                this.f26861e.remove(d);
                if (aVar.mo39495g().f26789n) {
                    C5459q.m41891s("Dispatcher", "canceled", aVar.mo39497i().mo39569d());
                }
            }
        }
        if (this.f26864h.contains(aVar.mo39498j())) {
            this.f26863g.remove(aVar.mo39499k());
            if (aVar.mo39495g().f26789n) {
                C5459q.m41892t("Dispatcher", "canceled", aVar.mo39497i().mo39569d(), "because paused request got canceled");
            }
        }
        C5428a remove = this.f26862f.remove(aVar.mo39499k());
        if (remove != null && remove.mo39495g().f26789n) {
            C5459q.m41892t("Dispatcher", "canceled", remove.mo39497i().mo39569d(), "from replaying");
        }
    }

    /* renamed from: p */
    public void mo39544p(C5431c cVar) {
        if (MemoryPolicy.shouldWriteToMemoryCache(cVar.mo39512p())) {
            this.f26867k.mo29631b(cVar.mo39510n(), cVar.mo39516s());
        }
        this.f26861e.remove(cVar.mo39510n());
        mo39529a(cVar);
        if (cVar.mo39513q().f26789n) {
            C5459q.m41892t("Dispatcher", "batched", C5459q.m41882j(cVar), "for completion");
        }
    }

    /* renamed from: q */
    public void mo39545q(C5431c cVar, boolean z) {
        String str;
        if (cVar.mo39513q().f26789n) {
            String j = C5459q.m41882j(cVar);
            StringBuilder sb = new StringBuilder();
            sb.append("for error");
            if (z) {
                str = " (will replay)";
            } else {
                str = "";
            }
            sb.append(str);
            C5459q.m41892t("Dispatcher", "batched", j, sb.toString());
        }
        this.f26861e.remove(cVar.mo39510n());
        mo39529a(cVar);
    }

    /* renamed from: r */
    public void mo39546r(NetworkInfo networkInfo) {
        ExecutorService executorService = this.f26859c;
        if (executorService instanceof C5448j) {
            ((C5448j) executorService).mo39561a(networkInfo);
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            mo39537i();
        }
    }

    /* renamed from: s */
    public void mo39547s(Object obj) {
        boolean z;
        if (this.f26864h.add(obj)) {
            Iterator<C5431c> it = this.f26861e.values().iterator();
            while (it.hasNext()) {
                C5431c next = it.next();
                boolean z2 = next.mo39513q().f26789n;
                C5428a h = next.mo39506h();
                List<C5428a> i = next.mo39507i();
                if (i == null || i.isEmpty()) {
                    z = false;
                } else {
                    z = true;
                }
                if (h != null || z) {
                    if (h != null && h.mo39498j().equals(obj)) {
                        next.mo39505f(h);
                        this.f26863g.put(h.mo39499k(), h);
                        if (z2) {
                            C5459q.m41892t("Dispatcher", "paused", h.f26810b.mo39569d(), "because tag '" + obj + "' was paused");
                        }
                    }
                    if (z) {
                        for (int size = i.size() - 1; size >= 0; size--) {
                            C5428a aVar = i.get(size);
                            if (aVar.mo39498j().equals(obj)) {
                                next.mo39505f(aVar);
                                this.f26863g.put(aVar.mo39499k(), aVar);
                                if (z2) {
                                    C5459q.m41892t("Dispatcher", "paused", aVar.f26810b.mo39569d(), "because tag '" + obj + "' was paused");
                                }
                            }
                        }
                    }
                    if (next.mo39503c()) {
                        it.remove();
                        if (z2) {
                            C5459q.m41892t("Dispatcher", "canceled", C5459q.m41882j(next), "all actions paused");
                        }
                    }
                }
            }
        }
    }

    /* renamed from: t */
    public void mo39548t(Object obj) {
        if (this.f26864h.remove(obj)) {
            ArrayList arrayList = null;
            Iterator<C5428a> it = this.f26863g.values().iterator();
            while (it.hasNext()) {
                C5428a next = it.next();
                if (next.mo39498j().equals(obj)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(next);
                    it.remove();
                }
            }
            if (arrayList != null) {
                Handler handler = this.f26866j;
                handler.sendMessage(handler.obtainMessage(13, arrayList));
            }
        }
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: u */
    public void mo39549u(C5431c cVar) {
        if (!cVar.mo39518u()) {
            boolean z = false;
            if (this.f26859c.isShutdown()) {
                mo39545q(cVar, false);
                return;
            }
            NetworkInfo networkInfo = null;
            if (this.f26871o) {
                networkInfo = ((ConnectivityManager) C5459q.m41886n(this.f26858b, "connectivity")).getActiveNetworkInfo();
            }
            if (cVar.mo39519w(this.f26872p, networkInfo)) {
                if (cVar.mo39513q().f26789n) {
                    C5459q.m41891s("Dispatcher", "retrying", C5459q.m41882j(cVar));
                }
                if (cVar.mo39509k() instanceof NetworkRequestHandler.ContentLengthException) {
                    cVar.f26848y |= NetworkPolicy.NO_CACHE.index;
                }
                cVar.f26834I = this.f26859c.submit(cVar);
                return;
            }
            if (this.f26871o && cVar.mo39520x()) {
                z = true;
            }
            mo39545q(cVar, z);
            if (z) {
                mo39540l(cVar);
            }
        }
    }

    /* renamed from: v */
    public void mo39550v(C5428a aVar) {
        mo39551w(aVar, true);
    }

    /* renamed from: w */
    public void mo39551w(C5428a aVar, boolean z) {
        if (this.f26864h.contains(aVar.mo39498j())) {
            this.f26863g.put(aVar.mo39499k(), aVar);
            if (aVar.mo39495g().f26789n) {
                String d = aVar.f26810b.mo39569d();
                C5459q.m41892t("Dispatcher", "paused", d, "because tag '" + aVar.mo39498j() + "' is paused");
                return;
            }
            return;
        }
        C5431c cVar = this.f26861e.get(aVar.mo39492d());
        if (cVar != null) {
            cVar.mo39502b(aVar);
        } else if (!this.f26859c.isShutdown()) {
            C5431c g = C5431c.m41759g(aVar.mo39495g(), this, this.f26867k, this.f26868l, aVar);
            g.f26834I = this.f26859c.submit(g);
            this.f26861e.put(aVar.mo39492d(), g);
            if (z) {
                this.f26862f.remove(aVar.mo39499k());
            }
            if (aVar.mo39495g().f26789n) {
                C5459q.m41891s("Dispatcher", "enqueued", aVar.f26810b.mo39569d());
            }
        } else if (aVar.mo39495g().f26789n) {
            C5459q.m41892t("Dispatcher", "ignored", aVar.f26810b.mo39569d(), "because shut down");
        }
    }
}
