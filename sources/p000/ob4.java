package p000;

import android.app.Application;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.model.NotificationRead;
import net.safemoon.androidwallet.model.common.FooterHistoryItem;
import net.safemoon.androidwallet.model.common.HeaderItemHistory;
import net.safemoon.androidwallet.model.common.HistoryListItem;
import net.safemoon.androidwallet.model.notificationHistory.NotificationDeleteRequest;
import net.safemoon.androidwallet.model.notificationHistory.NotificationHistory;
import net.safemoon.androidwallet.model.notificationHistory.NotificationHistoryData;
import net.safemoon.androidwallet.model.notificationHistory.NotificationHistoryResult;
import net.safemoon.androidwallet.model.notificationHistory.NotificationMarkReadRequest;
import net.safemoon.androidwallet.model.notificationHistory.ResultItemHistory;
import net.safemoon.androidwallet.model.wallets.Wallet;
import net.safemoon.androidwallet.utils.Common;
import okhttp3.ResponseBody;
import p000.l21;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J0\u0010\u000f\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\fJ0\u0010\u0010\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\fJ\"\u0010\u0011\u001a\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\fJ\"\u0010\u0012\u001a\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\fJ\n\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0002R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u00148\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019¨\u0006!"}, mo44877d2 = {"Lob4;", "Lwj;", "Lr37;", "h", "", "notificationId", "l", "", "Lnet/safemoon/androidwallet/model/common/HistoryListItem;", "i", "", "ids", "Lkotlin/Function0;", "onSuccess", "onFailed", "e", "k", "j", "d", "c", "Lk04;", "Lnet/safemoon/androidwallet/model/notificationHistory/NotificationHistory;", "b", "Lk04;", "g", "()Lk04;", "notificationData", "f", "errorListData", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: ob4 */
/* compiled from: NotificationHistoryViewModel.kt */
public final class ob4 extends C3552wj {

    /* renamed from: b */
    public final k04<NotificationHistory> f43603b = new k04<>();

    /* renamed from: c */
    public final k04<String> f43604c = new k04<>();

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J(\u0010\b\u001a\u00020\u00072\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00032\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005H\u0016J \u0010\u000b\u001a\u00020\u00072\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\f"}, mo44877d2 = {"ob4$a", "Lp90;", "Lokhttp3/ResponseBody;", "Lk90;", "call", "Lbg5;", "response", "Lr37;", "b", "", "t", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: ob4$a */
    /* compiled from: NotificationHistoryViewModel.kt */
    public static final class C9016a implements p90<ResponseBody> {

        /* renamed from: a */
        public final /* synthetic */ pc2<r37> f43605a;

        /* renamed from: b */
        public final /* synthetic */ pc2<r37> f43606b;

        /* renamed from: c */
        public final /* synthetic */ ob4 f43607c;

        public C9016a(pc2<r37> pc2, pc2<r37> pc22, ob4 ob4) {
            this.f43605a = pc2;
            this.f43606b = pc22;
            this.f43607c = ob4;
        }

        /* renamed from: a */
        public void mo47103a(k90<ResponseBody> k90, Throwable th) {
            vx2.m53591g(k90, "call");
            vx2.m53591g(th, "t");
            this.f43606b.invoke();
            this.f43607c.mo62866f().setValue(th.getLocalizedMessage());
        }

        /* renamed from: b */
        public void mo47104b(k90<ResponseBody> k90, bg5<ResponseBody> bg5) {
            vx2.m53591g(k90, "call");
            vx2.m53591g(bg5, "response");
            if (bg5.mo50581e()) {
                this.f43605a.invoke();
                return;
            }
            this.f43606b.invoke();
            try {
                this.f43607c.mo62866f().setValue(m54.m64173a(bg5).message);
            } catch (Exception e) {
                this.f43607c.mo62866f().setValue(e.getLocalizedMessage());
            }
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J(\u0010\b\u001a\u00020\u00072\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00032\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005H\u0016J \u0010\u000b\u001a\u00020\u00072\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\f"}, mo44877d2 = {"ob4$b", "Lp90;", "Lokhttp3/ResponseBody;", "Lk90;", "call", "Lbg5;", "response", "Lr37;", "b", "", "t", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: ob4$b */
    /* compiled from: NotificationHistoryViewModel.kt */
    public static final class C9017b implements p90<ResponseBody> {

        /* renamed from: a */
        public final /* synthetic */ pc2<r37> f43608a;

        /* renamed from: b */
        public final /* synthetic */ pc2<r37> f43609b;

        /* renamed from: c */
        public final /* synthetic */ ob4 f43610c;

        public C9017b(pc2<r37> pc2, pc2<r37> pc22, ob4 ob4) {
            this.f43608a = pc2;
            this.f43609b = pc22;
            this.f43610c = ob4;
        }

        /* renamed from: a */
        public void mo47103a(k90<ResponseBody> k90, Throwable th) {
            vx2.m53591g(k90, "call");
            vx2.m53591g(th, "t");
            this.f43609b.invoke();
            this.f43610c.mo62866f().setValue(th.getLocalizedMessage());
        }

        /* renamed from: b */
        public void mo47104b(k90<ResponseBody> k90, bg5<ResponseBody> bg5) {
            vx2.m53591g(k90, "call");
            vx2.m53591g(bg5, "response");
            if (bg5.mo50581e()) {
                this.f43608a.invoke();
                return;
            }
            this.f43609b.invoke();
            try {
                this.f43610c.mo62866f().setValue(m54.m64173a(bg5).message);
            } catch (Exception e) {
                this.f43610c.mo62866f().setValue(e.getLocalizedMessage());
            }
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J(\u0010\b\u001a\u00020\u00072\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00032\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005H\u0016J \u0010\u000b\u001a\u00020\u00072\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\f"}, mo44877d2 = {"ob4$c", "Lp90;", "Lnet/safemoon/androidwallet/model/notificationHistory/NotificationHistory;", "Lk90;", "call", "Lbg5;", "response", "Lr37;", "b", "", "t", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: ob4$c */
    /* compiled from: NotificationHistoryViewModel.kt */
    public static final class C9018c implements p90<NotificationHistory> {

        /* renamed from: a */
        public final /* synthetic */ ob4 f43611a;

        public C9018c(ob4 ob4) {
            this.f43611a = ob4;
        }

        /* renamed from: a */
        public void mo47103a(k90<NotificationHistory> k90, Throwable th) {
            vx2.m53591g(k90, "call");
            vx2.m53591g(th, "t");
            this.f43611a.mo62866f().setValue(th.getLocalizedMessage());
        }

        /* renamed from: b */
        public void mo47104b(k90<NotificationHistory> k90, bg5<NotificationHistory> bg5) {
            vx2.m53591g(k90, "call");
            vx2.m53591g(bg5, "response");
            if (bg5.mo50581e()) {
                this.f43611a.mo62867g().setValue(bg5.mo50578a());
                return;
            }
            try {
                this.f43611a.mo62866f().setValue(m54.m64173a(bg5).message);
            } catch (Exception e) {
                this.f43611a.mo62866f().setValue(e.getLocalizedMessage());
            }
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J(\u0010\b\u001a\u00020\u00072\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00032\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005H\u0016J \u0010\u000b\u001a\u00020\u00072\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\f"}, mo44877d2 = {"ob4$d", "Lp90;", "Lokhttp3/ResponseBody;", "Lk90;", "call", "Lbg5;", "response", "Lr37;", "b", "", "t", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: ob4$d */
    /* compiled from: NotificationHistoryViewModel.kt */
    public static final class C9019d implements p90<ResponseBody> {

        /* renamed from: a */
        public final /* synthetic */ pc2<r37> f43612a;

        /* renamed from: b */
        public final /* synthetic */ pc2<r37> f43613b;

        /* renamed from: c */
        public final /* synthetic */ ob4 f43614c;

        public C9019d(pc2<r37> pc2, pc2<r37> pc22, ob4 ob4) {
            this.f43612a = pc2;
            this.f43613b = pc22;
            this.f43614c = ob4;
        }

        /* renamed from: a */
        public void mo47103a(k90<ResponseBody> k90, Throwable th) {
            vx2.m53591g(k90, "call");
            vx2.m53591g(th, "t");
            this.f43613b.invoke();
            this.f43614c.mo62866f().setValue(th.getLocalizedMessage());
        }

        /* renamed from: b */
        public void mo47104b(k90<ResponseBody> k90, bg5<ResponseBody> bg5) {
            vx2.m53591g(k90, "call");
            vx2.m53591g(bg5, "response");
            if (bg5.mo50581e()) {
                this.f43612a.invoke();
                return;
            }
            this.f43613b.invoke();
            try {
                this.f43614c.mo62866f().setValue(m54.m64173a(bg5).message);
            } catch (Exception e) {
                this.f43614c.mo62866f().setValue(e.getLocalizedMessage());
            }
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J(\u0010\b\u001a\u00020\u00072\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00032\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005H\u0016J \u0010\u000b\u001a\u00020\u00072\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\f"}, mo44877d2 = {"ob4$e", "Lp90;", "Lokhttp3/ResponseBody;", "Lk90;", "call", "Lbg5;", "response", "Lr37;", "b", "", "t", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: ob4$e */
    /* compiled from: NotificationHistoryViewModel.kt */
    public static final class C9020e implements p90<ResponseBody> {

        /* renamed from: a */
        public final /* synthetic */ pc2<r37> f43615a;

        /* renamed from: b */
        public final /* synthetic */ pc2<r37> f43616b;

        /* renamed from: c */
        public final /* synthetic */ ob4 f43617c;

        public C9020e(pc2<r37> pc2, pc2<r37> pc22, ob4 ob4) {
            this.f43615a = pc2;
            this.f43616b = pc22;
            this.f43617c = ob4;
        }

        /* renamed from: a */
        public void mo47103a(k90<ResponseBody> k90, Throwable th) {
            vx2.m53591g(k90, "call");
            vx2.m53591g(th, "t");
            this.f43616b.invoke();
            this.f43617c.mo62866f().setValue(th.getLocalizedMessage());
        }

        /* renamed from: b */
        public void mo47104b(k90<ResponseBody> k90, bg5<ResponseBody> bg5) {
            vx2.m53591g(k90, "call");
            vx2.m53591g(bg5, "response");
            if (bg5.mo50581e()) {
                this.f43615a.invoke();
                return;
            }
            this.f43616b.invoke();
            try {
                this.f43617c.mo62866f().setValue(m54.m64173a(bg5).message);
            } catch (Exception e) {
                this.f43617c.mo62866f().setValue(e.getLocalizedMessage());
            }
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J$\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0016J\u001e\u0010\u000b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\f"}, mo44877d2 = {"ob4$f", "Lp90;", "Lnet/safemoon/androidwallet/model/NotificationRead;", "Lk90;", "call", "Lbg5;", "response", "Lr37;", "b", "", "t", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: ob4$f */
    /* compiled from: NotificationHistoryViewModel.kt */
    public static final class C9021f implements p90<NotificationRead> {

        /* renamed from: a */
        public final /* synthetic */ ob4 f43618a;

        /* renamed from: b */
        public final /* synthetic */ String f43619b;

        public C9021f(ob4 ob4, String str) {
            this.f43618a = ob4;
            this.f43619b = str;
        }

        /* renamed from: a */
        public void mo47103a(k90<NotificationRead> k90, Throwable th) {
            vx2.m53591g(k90, "call");
            vx2.m53591g(th, "t");
        }

        /* renamed from: b */
        public void mo47104b(k90<NotificationRead> k90, bg5<NotificationRead> bg5) {
            NotificationRead.Data data;
            vx2.m53591g(k90, "call");
            vx2.m53591g(bg5, "response");
            if (bg5.mo50581e()) {
                NotificationRead a = bg5.mo50578a();
                T t = null;
                if (a != null) {
                    data = a.data;
                } else {
                    data = null;
                }
                if (data != null) {
                    try {
                        NotificationHistory value = this.f43618a.mo62867g().getValue();
                        vx2.m53588d(value);
                        ArrayList<NotificationHistoryResult> result = value.getData().getResult();
                        vx2.m53590f(result, "notificationData\n       …             .data.result");
                        String str = this.f43619b;
                        Iterator<T> it = result.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            T next = it.next();
                            if (yb6.m74344y(((NotificationHistoryResult) next).f42459id, str, true)) {
                                t = next;
                                break;
                            }
                        }
                        vx2.m53588d(t);
                        ((NotificationHistoryResult) t).read = true;
                        this.f43618a.mo62867g().postValue(this.f43618a.mo62867g().getValue());
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ob4(Application application) {
        super(application);
        vx2.m53591g(application, "application");
    }

    /* renamed from: c */
    public final String mo62863c() {
        String str;
        Application b = mo27549b();
        vx2.m53590f(b, "it");
        if (ol0.m70355e(b) == TokenType.MULTI_COIN) {
            List<TokenType> a = Common.f42577a.mo60896a(true);
            ArrayList<TokenType> arrayList = new ArrayList<>();
            for (T next : a) {
                if (((TokenType) next).isPartOfMultiChainTokens()) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(dk0.m43495u(arrayList, 10));
            for (TokenType tokenType : arrayList) {
                Wallet c = ol0.m70351c(b);
                if (c != null) {
                    str = c.getAddress(tokenType.getCoinType().getValue());
                } else {
                    str = null;
                }
                arrayList2.add(str);
            }
            return CollectionsKt___CollectionsKt.m47338i0(CollectionsKt___CollectionsKt.m47326W(arrayList2), ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (rc2) null, 62, (Object) null);
        }
        Wallet c2 = ol0.m70351c(b);
        if (c2 != null) {
            return c2.getAddress(ol0.m70355e(b).getCoinType().getValue());
        }
        return null;
    }

    /* renamed from: d */
    public final void mo62864d(pc2<r37> pc2, pc2<r37> pc22) {
        vx2.m53591g(pc2, "onSuccess");
        vx2.m53591g(pc22, "onFailed");
        NotificationDeleteRequest notificationDeleteRequest = new NotificationDeleteRequest();
        notificationDeleteRequest.setAddresses(mo62863c());
        notificationDeleteRequest.setDeleteAll(Boolean.TRUE);
        C9384u3.m72574o().mo66089h(notificationDeleteRequest).mo50512X(new C9016a(pc2, pc22, this));
    }

    /* renamed from: e */
    public final void mo62865e(List<String> list, pc2<r37> pc2, pc2<r37> pc22) {
        vx2.m53591g(list, "ids");
        vx2.m53591g(pc2, "onSuccess");
        vx2.m53591g(pc22, "onFailed");
        NotificationDeleteRequest notificationDeleteRequest = new NotificationDeleteRequest();
        notificationDeleteRequest.setAddresses(mo62863c());
        notificationDeleteRequest.setDeleteAll(Boolean.FALSE);
        notificationDeleteRequest.setIds(list);
        C9384u3.m72574o().mo66089h(notificationDeleteRequest).mo50512X(new C9017b(pc2, pc22, this));
    }

    /* renamed from: f */
    public final k04<String> mo62866f() {
        return this.f43604c;
    }

    /* renamed from: g */
    public final k04<NotificationHistory> mo62867g() {
        return this.f43603b;
    }

    /* renamed from: h */
    public final void mo62868h() {
        tk5 o = C9384u3.m72574o();
        Common common = Common.f42577a;
        Application b = mo27549b();
        vx2.m53590f(b, "getApplication()");
        o.mo66082a(Common.m68291i(common, b, (String) null, 2, (Object) null), mo62863c(), 100, 0).mo50512X(new C9018c(this));
    }

    /* renamed from: i */
    public final List<HistoryListItem> mo62869i() {
        LinkedHashMap linkedHashMap;
        Set<Date> keySet;
        String str;
        NotificationHistoryData data;
        ArrayList<NotificationHistoryResult> result;
        ArrayList arrayList = new ArrayList();
        NotificationHistory value = this.f43603b.getValue();
        if (value == null || (data = value.getData()) == null || (result = data.getResult()) == null) {
            linkedHashMap = null;
        } else {
            linkedHashMap = new LinkedHashMap();
            for (T next : result) {
                Calendar instance = Calendar.getInstance();
                Date parse = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).parse(((NotificationHistoryResult) next).createdAt);
                vx2.m53588d(parse);
                instance.setTime(parse);
                instance.set(11, 0);
                instance.set(12, 0);
                instance.set(13, 0);
                instance.set(14, 0);
                Date time = instance.getTime();
                Object obj = linkedHashMap.get(time);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(time, obj);
                }
                ((List) obj).add(next);
            }
        }
        if (!(linkedHashMap == null || (keySet = linkedHashMap.keySet()) == null)) {
            for (Date date : keySet) {
                HeaderItemHistory headerItemHistory = new HeaderItemHistory();
                Calendar instance2 = Calendar.getInstance();
                instance2.set(11, 0);
                instance2.set(12, 0);
                instance2.set(13, 0);
                instance2.set(14, 0);
                instance2.getTime();
                l21.C7817a aVar = l21.f40561a;
                Application b = mo27549b();
                vx2.m53590f(b, "getApplication()");
                SimpleDateFormat b2 = aVar.mo55805b(b);
                if (vx2.m53586b(b2.format(date), b2.format(new Date()))) {
                    str = mo27549b().getString(R.string.today);
                } else {
                    str = b2.format(date);
                }
                headerItemHistory.setTitle(str);
                arrayList.add(headerItemHistory);
                List<NotificationHistoryResult> list = (List) linkedHashMap.get(date);
                if (list != null) {
                    for (NotificationHistoryResult result2 : list) {
                        ResultItemHistory resultItemHistory = new ResultItemHistory();
                        resultItemHistory.setResult(result2);
                        arrayList.add(resultItemHistory);
                    }
                }
                arrayList.add(new FooterHistoryItem());
            }
        }
        return arrayList;
    }

    /* renamed from: j */
    public final void mo62870j(pc2<r37> pc2, pc2<r37> pc22) {
        vx2.m53591g(pc2, "onSuccess");
        vx2.m53591g(pc22, "onFailed");
        NotificationMarkReadRequest notificationMarkReadRequest = new NotificationMarkReadRequest();
        notificationMarkReadRequest.setAddresses(mo62863c());
        notificationMarkReadRequest.setReadAll(Boolean.TRUE);
        C9384u3.m72574o().mo66088g(notificationMarkReadRequest).mo50512X(new C9019d(pc2, pc22, this));
    }

    /* renamed from: k */
    public final void mo62871k(List<String> list, pc2<r37> pc2, pc2<r37> pc22) {
        vx2.m53591g(list, "ids");
        vx2.m53591g(pc2, "onSuccess");
        vx2.m53591g(pc22, "onFailed");
        NotificationMarkReadRequest notificationMarkReadRequest = new NotificationMarkReadRequest();
        notificationMarkReadRequest.setAddresses(mo62863c());
        notificationMarkReadRequest.setReadAll(Boolean.FALSE);
        notificationMarkReadRequest.setIds(list);
        C9384u3.m72574o().mo66088g(notificationMarkReadRequest).mo50512X(new C9020e(pc2, pc22, this));
    }

    /* renamed from: l */
    public final void mo62872l(String str) {
        vx2.m53591g(str, "notificationId");
        C9384u3.m72574o().mo66086e(str).mo50512X(new C9021f(this, str));
    }
}
