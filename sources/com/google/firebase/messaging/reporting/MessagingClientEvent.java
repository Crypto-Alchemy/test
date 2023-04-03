package com.google.firebase.messaging.reporting;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public final class MessagingClientEvent {

    /* renamed from: p */
    public static final MessagingClientEvent f25467p = new C4815a().mo36310a();

    /* renamed from: a */
    public final long f25468a;

    /* renamed from: b */
    public final String f25469b;

    /* renamed from: c */
    public final String f25470c;

    /* renamed from: d */
    public final MessageType f25471d;

    /* renamed from: e */
    public final SDKPlatform f25472e;

    /* renamed from: f */
    public final String f25473f;

    /* renamed from: g */
    public final String f25474g;

    /* renamed from: h */
    public final int f25475h;

    /* renamed from: i */
    public final int f25476i;

    /* renamed from: j */
    public final String f25477j;

    /* renamed from: k */
    public final long f25478k;

    /* renamed from: l */
    public final Event f25479l;

    /* renamed from: m */
    public final String f25480m;

    /* renamed from: n */
    public final long f25481n;

    /* renamed from: o */
    public final String f25482o;

    /* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
    public enum Event implements yj9 {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);
        
        private final int number_;

        /* access modifiers changed from: public */
        Event(int i) {
            this.number_ = i;
        }

        public int getNumber() {
            return this.number_;
        }
    }

    /* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
    public enum MessageType implements yj9 {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);
        
        private final int number_;

        /* access modifiers changed from: public */
        MessageType(int i) {
            this.number_ = i;
        }

        public int getNumber() {
            return this.number_;
        }
    }

    /* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
    public enum SDKPlatform implements yj9 {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);
        
        private final int number_;

        /* access modifiers changed from: public */
        SDKPlatform(int i) {
            this.number_ = i;
        }

        public int getNumber() {
            return this.number_;
        }
    }

    /* renamed from: com.google.firebase.messaging.reporting.MessagingClientEvent$a */
    /* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
    public static final class C4815a {

        /* renamed from: a */
        public long f25486a = 0;

        /* renamed from: b */
        public String f25487b = "";

        /* renamed from: c */
        public String f25488c = "";

        /* renamed from: d */
        public MessageType f25489d = MessageType.UNKNOWN;

        /* renamed from: e */
        public SDKPlatform f25490e = SDKPlatform.UNKNOWN_OS;

        /* renamed from: f */
        public String f25491f = "";

        /* renamed from: g */
        public String f25492g = "";

        /* renamed from: h */
        public int f25493h = 0;

        /* renamed from: i */
        public int f25494i = 0;

        /* renamed from: j */
        public String f25495j = "";

        /* renamed from: k */
        public long f25496k = 0;

        /* renamed from: l */
        public Event f25497l = Event.UNKNOWN_EVENT;

        /* renamed from: m */
        public String f25498m = "";

        /* renamed from: n */
        public long f25499n = 0;

        /* renamed from: o */
        public String f25500o = "";

        /* renamed from: a */
        public MessagingClientEvent mo36310a() {
            return new MessagingClientEvent(this.f25486a, this.f25487b, this.f25488c, this.f25489d, this.f25490e, this.f25491f, this.f25492g, this.f25493h, this.f25494i, this.f25495j, this.f25496k, this.f25497l, this.f25498m, this.f25499n, this.f25500o);
        }

        /* renamed from: b */
        public C4815a mo36311b(String str) {
            this.f25498m = str;
            return this;
        }

        /* renamed from: c */
        public C4815a mo36312c(String str) {
            this.f25492g = str;
            return this;
        }

        /* renamed from: d */
        public C4815a mo36313d(String str) {
            this.f25500o = str;
            return this;
        }

        /* renamed from: e */
        public C4815a mo36314e(Event event) {
            this.f25497l = event;
            return this;
        }

        /* renamed from: f */
        public C4815a mo36315f(String str) {
            this.f25488c = str;
            return this;
        }

        /* renamed from: g */
        public C4815a mo36316g(String str) {
            this.f25487b = str;
            return this;
        }

        /* renamed from: h */
        public C4815a mo36317h(MessageType messageType) {
            this.f25489d = messageType;
            return this;
        }

        /* renamed from: i */
        public C4815a mo36318i(String str) {
            this.f25491f = str;
            return this;
        }

        /* renamed from: j */
        public C4815a mo36319j(long j) {
            this.f25486a = j;
            return this;
        }

        /* renamed from: k */
        public C4815a mo36320k(SDKPlatform sDKPlatform) {
            this.f25490e = sDKPlatform;
            return this;
        }

        /* renamed from: l */
        public C4815a mo36321l(String str) {
            this.f25495j = str;
            return this;
        }

        /* renamed from: m */
        public C4815a mo36322m(int i) {
            this.f25494i = i;
            return this;
        }
    }

    public MessagingClientEvent(long j, String str, String str2, MessageType messageType, SDKPlatform sDKPlatform, String str3, String str4, int i, int i2, String str5, long j2, Event event, String str6, long j3, String str7) {
        this.f25468a = j;
        this.f25469b = str;
        this.f25470c = str2;
        this.f25471d = messageType;
        this.f25472e = sDKPlatform;
        this.f25473f = str3;
        this.f25474g = str4;
        this.f25475h = i;
        this.f25476i = i2;
        this.f25477j = str5;
        this.f25478k = j2;
        this.f25479l = event;
        this.f25480m = str6;
        this.f25481n = j3;
        this.f25482o = str7;
    }

    /* renamed from: p */
    public static C4815a m38708p() {
        return new C4815a();
    }

    @ok9(zza = 13)
    /* renamed from: a */
    public String mo36294a() {
        return this.f25480m;
    }

    @ok9(zza = 11)
    /* renamed from: b */
    public long mo36295b() {
        return this.f25478k;
    }

    @ok9(zza = 14)
    /* renamed from: c */
    public long mo36296c() {
        return this.f25481n;
    }

    @ok9(zza = 7)
    /* renamed from: d */
    public String mo36297d() {
        return this.f25474g;
    }

    @ok9(zza = 15)
    /* renamed from: e */
    public String mo36298e() {
        return this.f25482o;
    }

    @ok9(zza = 12)
    /* renamed from: f */
    public Event mo36299f() {
        return this.f25479l;
    }

    @ok9(zza = 3)
    /* renamed from: g */
    public String mo36300g() {
        return this.f25470c;
    }

    @ok9(zza = 2)
    /* renamed from: h */
    public String mo36301h() {
        return this.f25469b;
    }

    @ok9(zza = 4)
    /* renamed from: i */
    public MessageType mo36302i() {
        return this.f25471d;
    }

    @ok9(zza = 6)
    /* renamed from: j */
    public String mo36303j() {
        return this.f25473f;
    }

    @ok9(zza = 8)
    /* renamed from: k */
    public int mo36304k() {
        return this.f25475h;
    }

    @ok9(zza = 1)
    /* renamed from: l */
    public long mo36305l() {
        return this.f25468a;
    }

    @ok9(zza = 5)
    /* renamed from: m */
    public SDKPlatform mo36306m() {
        return this.f25472e;
    }

    @ok9(zza = 10)
    /* renamed from: n */
    public String mo36307n() {
        return this.f25477j;
    }

    @ok9(zza = 9)
    /* renamed from: o */
    public int mo36308o() {
        return this.f25476i;
    }
}
