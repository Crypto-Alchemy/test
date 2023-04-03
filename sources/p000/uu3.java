package p000;

import com.google.firebase.messaging.reporting.MessagingClientEvent;

/* renamed from: uu3 */
/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public final class uu3 {

    /* renamed from: b */
    public static final uu3 f34720b = new C6583a().mo48530a();

    /* renamed from: a */
    public final MessagingClientEvent f34721a;

    /* renamed from: uu3$a */
    /* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
    public static final class C6583a {

        /* renamed from: a */
        public MessagingClientEvent f34722a = null;

        /* renamed from: a */
        public uu3 mo48530a() {
            return new uu3(this.f34722a);
        }

        /* renamed from: b */
        public C6583a mo48531b(MessagingClientEvent messagingClientEvent) {
            this.f34722a = messagingClientEvent;
            return this;
        }
    }

    public uu3(MessagingClientEvent messagingClientEvent) {
        this.f34721a = messagingClientEvent;
    }

    /* renamed from: b */
    public static C6583a m53019b() {
        return new C6583a();
    }

    @ok9(zza = 1)
    /* renamed from: a */
    public MessagingClientEvent mo48528a() {
        return this.f34721a;
    }

    /* renamed from: c */
    public byte[] mo48529c() {
        return ol8.m49354a(this);
    }
}
