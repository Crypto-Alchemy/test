package p000;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;

/* renamed from: mg9 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class mg9 implements Handler.Callback {

    /* renamed from: a */
    public final /* synthetic */ wh9 f31696a;

    public /* synthetic */ mg9(wh9 wh9, ue9 ue9) {
        this.f31696a = wh9;
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            synchronized (this.f31696a.f35326f) {
                ib9 ib9 = (ib9) message.obj;
                vc9 vc9 = (vc9) this.f31696a.f35326f.get(ib9);
                if (vc9 != null && vc9.mo48727i()) {
                    if (vc9.mo48728j()) {
                        vc9.mo48725g("GmsClientSupervisor");
                    }
                    this.f31696a.f35326f.remove(ib9);
                }
            }
            return true;
        } else if (i != 1) {
            return false;
        } else {
            synchronized (this.f31696a.f35326f) {
                ib9 ib92 = (ib9) message.obj;
                vc9 vc92 = (vc9) this.f31696a.f35326f.get(ib92);
                if (vc92 != null && vc92.mo48719a() == 3) {
                    String valueOf = String.valueOf(ib92);
                    StringBuilder sb = new StringBuilder();
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(valueOf);
                    new Exception();
                    ComponentName b = vc92.mo48720b();
                    if (b == null) {
                        b = ib92.mo43536b();
                    }
                    if (b == null) {
                        String d = ib92.mo43538d();
                        cu4.m43221k(d);
                        b = new ComponentName(d, "unknown");
                    }
                    vc92.onServiceDisconnected(b);
                }
            }
            return true;
        }
    }
}
