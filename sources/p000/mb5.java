package p000;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import androidx.sqlite.p006db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import net.safemoon.androidwallet.model.reflections.RoomReflectionsData;
import net.safemoon.androidwallet.model.reflections.RoomReflectionsDataAndToken;
import net.safemoon.androidwallet.model.reflections.RoomReflectionsToken;
import net.safemoon.androidwallet.model.reflections.RoomReflectionsTokenAndData;
import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: mb5 */
/* compiled from: ReflectionsDao_Impl */
public final class mb5 implements lb5 {

    /* renamed from: a */
    public final RoomDatabase f40822a;

    /* renamed from: b */
    public final vq1<RoomReflectionsToken> f40823b;

    /* renamed from: c */
    public final vq1<RoomReflectionsData> f40824c;

    /* renamed from: d */
    public final uq1<RoomReflectionsToken> f40825d;

    /* renamed from: e */
    public final SharedSQLiteStatement f40826e;

    /* renamed from: f */
    public final SharedSQLiteStatement f40827f;

    /* renamed from: g */
    public final SharedSQLiteStatement f40828g;

    /* renamed from: h */
    public final SharedSQLiteStatement f40829h;

    /* renamed from: i */
    public final SharedSQLiteStatement f40830i;

    /* renamed from: j */
    public final SharedSQLiteStatement f40831j;

    /* renamed from: mb5$a */
    /* compiled from: ReflectionsDao_Impl */
    public class C7872a implements Callable<Long> {

        /* renamed from: a */
        public final /* synthetic */ RoomReflectionsToken f40832a;

        public C7872a(RoomReflectionsToken roomReflectionsToken) {
            this.f40832a = roomReflectionsToken;
        }

        /* renamed from: a */
        public Long call() throws Exception {
            mb5.this.f40822a.mo10119e();
            try {
                long l = mb5.this.f40823b.mo27298l(this.f40832a);
                mb5.this.f40822a.mo10115C();
                return Long.valueOf(l);
            } finally {
                mb5.this.f40822a.mo10124j();
            }
        }
    }

    /* renamed from: mb5$a0 */
    /* compiled from: ReflectionsDao_Impl */
    public class C7873a0 extends SharedSQLiteStatement {
        public C7873a0(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo10165e() {
            return "DELETE FROM table_room_reflections_data_2 WHERE _ID NOT IN (SELECT MIN(_id) ROWIDS FROM table_room_reflections_data_2  GROUP BY symbolWithType)";
        }
    }

    /* renamed from: mb5$b */
    /* compiled from: ReflectionsDao_Impl */
    public class C7874b implements Callable<Long> {

        /* renamed from: a */
        public final /* synthetic */ RoomReflectionsData f40835a;

        public C7874b(RoomReflectionsData roomReflectionsData) {
            this.f40835a = roomReflectionsData;
        }

        /* renamed from: a */
        public Long call() throws Exception {
            mb5.this.f40822a.mo10119e();
            try {
                long l = mb5.this.f40824c.mo27298l(this.f40835a);
                mb5.this.f40822a.mo10115C();
                return Long.valueOf(l);
            } finally {
                mb5.this.f40822a.mo10124j();
            }
        }
    }

    /* renamed from: mb5$b0 */
    /* compiled from: ReflectionsDao_Impl */
    public class C7875b0 extends SharedSQLiteStatement {
        public C7875b0(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo10165e() {
            return "DELETE FROM table_room_reflections_data_2 WHERE symbolWithType=? AND _ID NOT IN (SELECT MIN(_id) ROWIDS FROM table_room_reflections_data_2  GROUP BY symbolWithType)";
        }
    }

    /* renamed from: mb5$c */
    /* compiled from: ReflectionsDao_Impl */
    public class C7876c implements Callable<r37> {

        /* renamed from: a */
        public final /* synthetic */ RoomReflectionsToken f40838a;

        public C7876c(RoomReflectionsToken roomReflectionsToken) {
            this.f40838a = roomReflectionsToken;
        }

        /* renamed from: a */
        public r37 call() throws Exception {
            mb5.this.f40822a.mo10119e();
            try {
                mb5.this.f40825d.mo26842j(this.f40838a);
                mb5.this.f40822a.mo10115C();
                return r37.f33317a;
            } finally {
                mb5.this.f40822a.mo10124j();
            }
        }
    }

    /* renamed from: mb5$d */
    /* compiled from: ReflectionsDao_Impl */
    public class C7877d implements Callable<r37> {

        /* renamed from: a */
        public final /* synthetic */ int f40840a;

        /* renamed from: d */
        public final /* synthetic */ String f40841d;

        public C7877d(int i, String str) {
            this.f40840a = i;
            this.f40841d = str;
        }

        /* renamed from: a */
        public r37 call() throws Exception {
            SupportSQLiteStatement b = mb5.this.f40826e.mo10162b();
            b.bindLong(1, (long) this.f40840a);
            String str = this.f40841d;
            if (str == null) {
                b.bindNull(2);
            } else {
                b.bindString(2, str);
            }
            mb5.this.f40822a.mo10119e();
            try {
                b.executeUpdateDelete();
                mb5.this.f40822a.mo10115C();
                return r37.f33317a;
            } finally {
                mb5.this.f40822a.mo10124j();
                mb5.this.f40826e.mo10168h(b);
            }
        }
    }

    /* renamed from: mb5$e */
    /* compiled from: ReflectionsDao_Impl */
    public class C7878e implements Callable<r37> {

        /* renamed from: a */
        public final /* synthetic */ double f40843a;

        /* renamed from: d */
        public final /* synthetic */ String f40844d;

        public C7878e(double d, String str) {
            this.f40843a = d;
            this.f40844d = str;
        }

        /* renamed from: a */
        public r37 call() throws Exception {
            SupportSQLiteStatement b = mb5.this.f40827f.mo10162b();
            b.bindDouble(1, this.f40843a);
            String str = this.f40844d;
            if (str == null) {
                b.bindNull(2);
            } else {
                b.bindString(2, str);
            }
            mb5.this.f40822a.mo10119e();
            try {
                b.executeUpdateDelete();
                mb5.this.f40822a.mo10115C();
                return r37.f33317a;
            } finally {
                mb5.this.f40822a.mo10124j();
                mb5.this.f40827f.mo10168h(b);
            }
        }
    }

    /* renamed from: mb5$f */
    /* compiled from: ReflectionsDao_Impl */
    public class C7879f implements Callable<r37> {

        /* renamed from: a */
        public final /* synthetic */ long f40846a;

        /* renamed from: d */
        public final /* synthetic */ long f40847d;

        /* renamed from: e */
        public final /* synthetic */ String f40848e;

        public C7879f(long j, long j2, String str) {
            this.f40846a = j;
            this.f40847d = j2;
            this.f40848e = str;
        }

        /* renamed from: a */
        public r37 call() throws Exception {
            SupportSQLiteStatement b = mb5.this.f40828g.mo10162b();
            b.bindLong(1, this.f40846a);
            b.bindLong(2, this.f40847d);
            String str = this.f40848e;
            if (str == null) {
                b.bindNull(3);
            } else {
                b.bindString(3, str);
            }
            mb5.this.f40822a.mo10119e();
            try {
                b.executeUpdateDelete();
                mb5.this.f40822a.mo10115C();
                return r37.f33317a;
            } finally {
                mb5.this.f40822a.mo10124j();
                mb5.this.f40828g.mo10168h(b);
            }
        }
    }

    /* renamed from: mb5$g */
    /* compiled from: ReflectionsDao_Impl */
    public class C7880g implements Callable<r37> {

        /* renamed from: a */
        public final /* synthetic */ int f40850a;

        /* renamed from: d */
        public final /* synthetic */ long f40851d;

        public C7880g(int i, long j) {
            this.f40850a = i;
            this.f40851d = j;
        }

        /* renamed from: a */
        public r37 call() throws Exception {
            SupportSQLiteStatement b = mb5.this.f40829h.mo10162b();
            b.bindLong(1, (long) this.f40850a);
            b.bindLong(2, this.f40851d);
            mb5.this.f40822a.mo10119e();
            try {
                b.executeUpdateDelete();
                mb5.this.f40822a.mo10115C();
                return r37.f33317a;
            } finally {
                mb5.this.f40822a.mo10124j();
                mb5.this.f40829h.mo10168h(b);
            }
        }
    }

    /* renamed from: mb5$h */
    /* compiled from: ReflectionsDao_Impl */
    public class C7881h implements Callable<r37> {
        public C7881h() {
        }

        /* renamed from: a */
        public r37 call() throws Exception {
            SupportSQLiteStatement b = mb5.this.f40830i.mo10162b();
            mb5.this.f40822a.mo10119e();
            try {
                b.executeUpdateDelete();
                mb5.this.f40822a.mo10115C();
                return r37.f33317a;
            } finally {
                mb5.this.f40822a.mo10124j();
                mb5.this.f40830i.mo10168h(b);
            }
        }
    }

    /* renamed from: mb5$i */
    /* compiled from: ReflectionsDao_Impl */
    public class C7882i implements Callable<r37> {

        /* renamed from: a */
        public final /* synthetic */ String f40854a;

        public C7882i(String str) {
            this.f40854a = str;
        }

        /* renamed from: a */
        public r37 call() throws Exception {
            SupportSQLiteStatement b = mb5.this.f40831j.mo10162b();
            String str = this.f40854a;
            if (str == null) {
                b.bindNull(1);
            } else {
                b.bindString(1, str);
            }
            mb5.this.f40822a.mo10119e();
            try {
                b.executeUpdateDelete();
                mb5.this.f40822a.mo10115C();
                return r37.f33317a;
            } finally {
                mb5.this.f40822a.mo10124j();
                mb5.this.f40831j.mo10168h(b);
            }
        }
    }

    /* renamed from: mb5$j */
    /* compiled from: ReflectionsDao_Impl */
    public class C7883j implements Callable<Boolean> {

        /* renamed from: a */
        public final /* synthetic */ lh5 f40856a;

        public C7883j(lh5 lh5) {
            this.f40856a = lh5;
        }

        /* renamed from: a */
        public Boolean call() throws Exception {
            Integer num;
            boolean z = false;
            Boolean bool = null;
            Cursor c = iz0.m19913c(mb5.this.f40822a, this.f40856a, false, (CancellationSignal) null);
            try {
                if (c.moveToFirst()) {
                    if (c.isNull(0)) {
                        num = null;
                    } else {
                        num = Integer.valueOf(c.getInt(0));
                    }
                    if (num != null) {
                        if (num.intValue() != 0) {
                            z = true;
                        }
                        bool = Boolean.valueOf(z);
                    }
                }
                return bool;
            } finally {
                c.close();
                this.f40856a.mo22765f();
            }
        }
    }

    /* renamed from: mb5$k */
    /* compiled from: ReflectionsDao_Impl */
    public class C7884k extends vq1<RoomReflectionsToken> {
        public C7884k(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo10165e() {
            return "INSERT OR ABORT INTO `table_room_reflections_token_2` (`_id`,`symbolWithType`,`symbol`,`name`,`iconPath`,`contractorAddress`,`tokenTypeChain`,`decimals`,`nativeBalance`,`firstTimeStamp`,`enableAdvanceMode`,`latestBalance`,`latestTimeStamp`,`cmcId`,`priceUsd`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* renamed from: m */
        public void mo12130i(SupportSQLiteStatement supportSQLiteStatement, RoomReflectionsToken roomReflectionsToken) {
            if (roomReflectionsToken.getId() == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindLong(1, roomReflectionsToken.getId().longValue());
            }
            if (roomReflectionsToken.getSymbolWithType() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, roomReflectionsToken.getSymbolWithType());
            }
            if (roomReflectionsToken.getSymbol() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, roomReflectionsToken.getSymbol());
            }
            if (roomReflectionsToken.getName() == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, roomReflectionsToken.getName());
            }
            if (roomReflectionsToken.getIconResName() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindString(5, roomReflectionsToken.getIconResName());
            }
            if (roomReflectionsToken.getContractAddress() == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindString(6, roomReflectionsToken.getContractAddress());
            }
            supportSQLiteStatement.bindLong(7, (long) roomReflectionsToken.getChainId());
            supportSQLiteStatement.bindLong(8, (long) roomReflectionsToken.getDecimals());
            if (roomReflectionsToken.getNativeBalance() == null) {
                supportSQLiteStatement.bindNull(9);
            } else {
                supportSQLiteStatement.bindString(9, roomReflectionsToken.getNativeBalance());
            }
            if (roomReflectionsToken.getFirstTimeStamp() == null) {
                supportSQLiteStatement.bindNull(10);
            } else {
                supportSQLiteStatement.bindLong(10, roomReflectionsToken.getFirstTimeStamp().longValue());
            }
            supportSQLiteStatement.bindLong(11, roomReflectionsToken.getEnableAdvanceMode() ? 1 : 0);
            if (roomReflectionsToken.getLatestBalance() == null) {
                supportSQLiteStatement.bindNull(12);
            } else {
                supportSQLiteStatement.bindLong(12, roomReflectionsToken.getLatestBalance().longValue());
            }
            if (roomReflectionsToken.getLatestTimeStamp() == null) {
                supportSQLiteStatement.bindNull(13);
            } else {
                supportSQLiteStatement.bindLong(13, roomReflectionsToken.getLatestTimeStamp().longValue());
            }
            if (roomReflectionsToken.getCmcId() == null) {
                supportSQLiteStatement.bindNull(14);
            } else {
                supportSQLiteStatement.bindLong(14, roomReflectionsToken.getCmcId().longValue());
            }
            if (roomReflectionsToken.getPriceUsd() == null) {
                supportSQLiteStatement.bindNull(15);
            } else {
                supportSQLiteStatement.bindDouble(15, roomReflectionsToken.getPriceUsd().doubleValue());
            }
        }
    }

    /* renamed from: mb5$l */
    /* compiled from: ReflectionsDao_Impl */
    public class C7885l implements Callable<Boolean> {

        /* renamed from: a */
        public final /* synthetic */ lh5 f40859a;

        public C7885l(lh5 lh5) {
            this.f40859a = lh5;
        }

        /* renamed from: a */
        public Boolean call() throws Exception {
            Integer num;
            boolean z = false;
            Boolean bool = null;
            Cursor c = iz0.m19913c(mb5.this.f40822a, this.f40859a, false, (CancellationSignal) null);
            try {
                if (c.moveToFirst()) {
                    if (c.isNull(0)) {
                        num = null;
                    } else {
                        num = Integer.valueOf(c.getInt(0));
                    }
                    if (num != null) {
                        if (num.intValue() != 0) {
                            z = true;
                        }
                        bool = Boolean.valueOf(z);
                    }
                }
                return bool;
            } finally {
                c.close();
                this.f40859a.mo22765f();
            }
        }
    }

    /* renamed from: mb5$m */
    /* compiled from: ReflectionsDao_Impl */
    public class C7886m implements Callable<List<RoomReflectionsToken>> {

        /* renamed from: a */
        public final /* synthetic */ lh5 f40861a;

        public C7886m(lh5 lh5) {
            this.f40861a = lh5;
        }

        /* renamed from: a */
        public List<RoomReflectionsToken> call() throws Exception {
            Long l;
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            Long l2;
            boolean z;
            Long l3;
            Long l4;
            int i;
            Long valueOf;
            Double d;
            int i2;
            Cursor c = iz0.m19913c(mb5.this.f40822a, this.f40861a, false, (CancellationSignal) null);
            try {
                int e = px0.m25190e(c, "_id");
                int e2 = px0.m25190e(c, "symbolWithType");
                int e3 = px0.m25190e(c, "symbol");
                int e4 = px0.m25190e(c, PublicResolver.FUNC_NAME);
                int e5 = px0.m25190e(c, "iconPath");
                int e6 = px0.m25190e(c, "contractorAddress");
                int e7 = px0.m25190e(c, "tokenTypeChain");
                int e8 = px0.m25190e(c, "decimals");
                int e9 = px0.m25190e(c, "nativeBalance");
                int e10 = px0.m25190e(c, "firstTimeStamp");
                int e11 = px0.m25190e(c, "enableAdvanceMode");
                int e12 = px0.m25190e(c, "latestBalance");
                int e13 = px0.m25190e(c, "latestTimeStamp");
                int e14 = px0.m25190e(c, "cmcId");
                int e15 = px0.m25190e(c, "priceUsd");
                int i3 = e14;
                ArrayList arrayList = new ArrayList(c.getCount());
                while (c.moveToNext()) {
                    if (c.isNull(e)) {
                        l = null;
                    } else {
                        l = Long.valueOf(c.getLong(e));
                    }
                    if (c.isNull(e2)) {
                        str = null;
                    } else {
                        str = c.getString(e2);
                    }
                    if (c.isNull(e3)) {
                        str2 = null;
                    } else {
                        str2 = c.getString(e3);
                    }
                    if (c.isNull(e4)) {
                        str3 = null;
                    } else {
                        str3 = c.getString(e4);
                    }
                    if (c.isNull(e5)) {
                        str4 = null;
                    } else {
                        str4 = c.getString(e5);
                    }
                    if (c.isNull(e6)) {
                        str5 = null;
                    } else {
                        str5 = c.getString(e6);
                    }
                    int i4 = c.getInt(e7);
                    int i5 = c.getInt(e8);
                    if (c.isNull(e9)) {
                        str6 = null;
                    } else {
                        str6 = c.getString(e9);
                    }
                    if (c.isNull(e10)) {
                        l2 = null;
                    } else {
                        l2 = Long.valueOf(c.getLong(e10));
                    }
                    if (c.getInt(e11) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (c.isNull(e12)) {
                        l3 = null;
                    } else {
                        l3 = Long.valueOf(c.getLong(e12));
                    }
                    if (c.isNull(e13)) {
                        i = i3;
                        l4 = null;
                    } else {
                        l4 = Long.valueOf(c.getLong(e13));
                        i = i3;
                    }
                    if (c.isNull(i)) {
                        valueOf = null;
                    } else {
                        valueOf = Long.valueOf(c.getLong(i));
                    }
                    int i6 = e15;
                    int i7 = e;
                    int i8 = i6;
                    if (c.isNull(i8)) {
                        i2 = i8;
                        d = null;
                    } else {
                        d = Double.valueOf(c.getDouble(i8));
                        i2 = i8;
                    }
                    arrayList.add(new RoomReflectionsToken(l, str, str2, str3, str4, str5, i4, i5, str6, l2, z, l3, l4, valueOf, d));
                    e = i7;
                    e15 = i2;
                    i3 = i;
                }
                return arrayList;
            } finally {
                c.close();
            }
        }

        public void finalize() {
            this.f40861a.mo22765f();
        }
    }

    /* renamed from: mb5$n */
    /* compiled from: ReflectionsDao_Impl */
    public class C7887n implements Callable<List<RoomReflectionsTokenAndData>> {

        /* renamed from: a */
        public final /* synthetic */ lh5 f40863a;

        public C7887n(lh5 lh5) {
            this.f40863a = lh5;
        }

        /* renamed from: a */
        public List<RoomReflectionsTokenAndData> call() throws Exception {
            Cursor c;
            Long l;
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            Long l2;
            boolean z;
            int i;
            Long valueOf;
            Long valueOf2;
            Long valueOf3;
            Double d;
            int i2;
            int i3;
            mb5.this.f40822a.mo10119e();
            try {
                c = iz0.m19913c(mb5.this.f40822a, this.f40863a, true, (CancellationSignal) null);
                int e = px0.m25190e(c, "_id");
                int e2 = px0.m25190e(c, "symbolWithType");
                int e3 = px0.m25190e(c, "symbol");
                int e4 = px0.m25190e(c, PublicResolver.FUNC_NAME);
                int e5 = px0.m25190e(c, "iconPath");
                int e6 = px0.m25190e(c, "contractorAddress");
                int e7 = px0.m25190e(c, "tokenTypeChain");
                int e8 = px0.m25190e(c, "decimals");
                int e9 = px0.m25190e(c, "nativeBalance");
                int e10 = px0.m25190e(c, "firstTimeStamp");
                int e11 = px0.m25190e(c, "enableAdvanceMode");
                int e12 = px0.m25190e(c, "latestBalance");
                int e13 = px0.m25190e(c, "latestTimeStamp");
                int e14 = px0.m25190e(c, "cmcId");
                int e15 = px0.m25190e(c, "priceUsd");
                C2781lq lqVar = new C2781lq();
                while (c.moveToNext()) {
                    int i4 = e13;
                    String string = c.getString(e2);
                    if (((ArrayList) lqVar.get(string)) == null) {
                        i3 = e12;
                        lqVar.put(string, new ArrayList());
                    } else {
                        i3 = e12;
                    }
                    e13 = i4;
                    e12 = i3;
                }
                int i5 = e13;
                int i6 = e12;
                c.moveToPosition(-1);
                mb5.this.mo56176F(lqVar);
                ArrayList arrayList = new ArrayList(c.getCount());
                while (c.moveToNext()) {
                    if (c.isNull(e)) {
                        l = null;
                    } else {
                        l = Long.valueOf(c.getLong(e));
                    }
                    if (c.isNull(e2)) {
                        str = null;
                    } else {
                        str = c.getString(e2);
                    }
                    if (c.isNull(e3)) {
                        str2 = null;
                    } else {
                        str2 = c.getString(e3);
                    }
                    if (c.isNull(e4)) {
                        str3 = null;
                    } else {
                        str3 = c.getString(e4);
                    }
                    if (c.isNull(e5)) {
                        str4 = null;
                    } else {
                        str4 = c.getString(e5);
                    }
                    if (c.isNull(e6)) {
                        str5 = null;
                    } else {
                        str5 = c.getString(e6);
                    }
                    int i7 = c.getInt(e7);
                    int i8 = c.getInt(e8);
                    if (c.isNull(e9)) {
                        str6 = null;
                    } else {
                        str6 = c.getString(e9);
                    }
                    if (c.isNull(e10)) {
                        l2 = null;
                    } else {
                        l2 = Long.valueOf(c.getLong(e10));
                    }
                    if (c.getInt(e11) != 0) {
                        i = i6;
                        z = true;
                    } else {
                        z = false;
                        i = i6;
                    }
                    if (c.isNull(i)) {
                        valueOf = null;
                    } else {
                        valueOf = Long.valueOf(c.getLong(i));
                    }
                    int i9 = i5;
                    int i10 = e;
                    int i11 = i9;
                    if (c.isNull(i11)) {
                        valueOf2 = null;
                    } else {
                        valueOf2 = Long.valueOf(c.getLong(i11));
                    }
                    int i12 = e14;
                    int i13 = i11;
                    int i14 = i12;
                    if (c.isNull(i14)) {
                        valueOf3 = null;
                    } else {
                        valueOf3 = Long.valueOf(c.getLong(i14));
                    }
                    int i15 = e15;
                    int i16 = i14;
                    int i17 = i15;
                    if (c.isNull(i17)) {
                        i2 = i17;
                        d = null;
                    } else {
                        d = Double.valueOf(c.getDouble(i17));
                        i2 = i17;
                    }
                    RoomReflectionsToken roomReflectionsToken = new RoomReflectionsToken(l, str, str2, str3, str4, str5, i7, i8, str6, l2, z, valueOf, valueOf2, valueOf3, d);
                    int i18 = e3;
                    ArrayList arrayList2 = (ArrayList) lqVar.get(c.getString(e2));
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList.add(new RoomReflectionsTokenAndData(roomReflectionsToken, arrayList2));
                    e = i10;
                    e3 = i18;
                    lqVar = lqVar;
                    i5 = i13;
                    e14 = i16;
                    e15 = i2;
                    i6 = i;
                }
                mb5.this.f40822a.mo10115C();
                c.close();
                mb5.this.f40822a.mo10124j();
                return arrayList;
            } catch (Throwable th) {
                mb5.this.f40822a.mo10124j();
                throw th;
            }
        }

        public void finalize() {
            this.f40863a.mo22765f();
        }
    }

    /* renamed from: mb5$o */
    /* compiled from: ReflectionsDao_Impl */
    public class C7888o implements Callable<List<RoomReflectionsToken>> {

        /* renamed from: a */
        public final /* synthetic */ lh5 f40865a;

        public C7888o(lh5 lh5) {
            this.f40865a = lh5;
        }

        /* renamed from: a */
        public List<RoomReflectionsToken> call() throws Exception {
            C7888o oVar;
            Long l;
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            Long l2;
            boolean z;
            Long l3;
            Long l4;
            int i;
            Long valueOf;
            Double d;
            int i2;
            Cursor c = iz0.m19913c(mb5.this.f40822a, this.f40865a, false, (CancellationSignal) null);
            try {
                int e = px0.m25190e(c, "_id");
                int e2 = px0.m25190e(c, "symbolWithType");
                int e3 = px0.m25190e(c, "symbol");
                int e4 = px0.m25190e(c, PublicResolver.FUNC_NAME);
                int e5 = px0.m25190e(c, "iconPath");
                int e6 = px0.m25190e(c, "contractorAddress");
                int e7 = px0.m25190e(c, "tokenTypeChain");
                int e8 = px0.m25190e(c, "decimals");
                int e9 = px0.m25190e(c, "nativeBalance");
                int e10 = px0.m25190e(c, "firstTimeStamp");
                int e11 = px0.m25190e(c, "enableAdvanceMode");
                int e12 = px0.m25190e(c, "latestBalance");
                int e13 = px0.m25190e(c, "latestTimeStamp");
                int e14 = px0.m25190e(c, "cmcId");
                try {
                    int e15 = px0.m25190e(c, "priceUsd");
                    int i3 = e14;
                    ArrayList arrayList = new ArrayList(c.getCount());
                    while (c.moveToNext()) {
                        if (c.isNull(e)) {
                            l = null;
                        } else {
                            l = Long.valueOf(c.getLong(e));
                        }
                        if (c.isNull(e2)) {
                            str = null;
                        } else {
                            str = c.getString(e2);
                        }
                        if (c.isNull(e3)) {
                            str2 = null;
                        } else {
                            str2 = c.getString(e3);
                        }
                        if (c.isNull(e4)) {
                            str3 = null;
                        } else {
                            str3 = c.getString(e4);
                        }
                        if (c.isNull(e5)) {
                            str4 = null;
                        } else {
                            str4 = c.getString(e5);
                        }
                        if (c.isNull(e6)) {
                            str5 = null;
                        } else {
                            str5 = c.getString(e6);
                        }
                        int i4 = c.getInt(e7);
                        int i5 = c.getInt(e8);
                        if (c.isNull(e9)) {
                            str6 = null;
                        } else {
                            str6 = c.getString(e9);
                        }
                        if (c.isNull(e10)) {
                            l2 = null;
                        } else {
                            l2 = Long.valueOf(c.getLong(e10));
                        }
                        if (c.getInt(e11) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (c.isNull(e12)) {
                            l3 = null;
                        } else {
                            l3 = Long.valueOf(c.getLong(e12));
                        }
                        if (c.isNull(e13)) {
                            i = i3;
                            l4 = null;
                        } else {
                            l4 = Long.valueOf(c.getLong(e13));
                            i = i3;
                        }
                        if (c.isNull(i)) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(c.getLong(i));
                        }
                        int i6 = e15;
                        int i7 = e;
                        int i8 = i6;
                        if (c.isNull(i8)) {
                            i2 = i8;
                            d = null;
                        } else {
                            d = Double.valueOf(c.getDouble(i8));
                            i2 = i8;
                        }
                        arrayList.add(new RoomReflectionsToken(l, str, str2, str3, str4, str5, i4, i5, str6, l2, z, l3, l4, valueOf, d));
                        e = i7;
                        e15 = i2;
                        i3 = i;
                    }
                    c.close();
                    this.f40865a.mo22765f();
                    return arrayList;
                } catch (Throwable th) {
                    th = th;
                    oVar = this;
                    c.close();
                    oVar.f40865a.mo22765f();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                oVar = this;
                c.close();
                oVar.f40865a.mo22765f();
                throw th;
            }
        }
    }

    /* renamed from: mb5$p */
    /* compiled from: ReflectionsDao_Impl */
    public class C7889p implements Callable<List<RoomReflectionsDataAndToken>> {

        /* renamed from: a */
        public final /* synthetic */ lh5 f40867a;

        public C7889p(lh5 lh5) {
            this.f40867a = lh5;
        }

        /* renamed from: a */
        public List<RoomReflectionsDataAndToken> call() throws Exception {
            Cursor c;
            Long l;
            String str;
            String str2;
            String str3;
            String str4;
            mb5.this.f40822a.mo10119e();
            try {
                c = iz0.m19913c(mb5.this.f40822a, this.f40867a, true, (CancellationSignal) null);
                int e = px0.m25190e(c, "_id");
                int e2 = px0.m25190e(c, "symbolWithType");
                int e3 = px0.m25190e(c, "nativeBalance");
                int e4 = px0.m25190e(c, "blockBalance");
                int e5 = px0.m25190e(c, "block");
                int e6 = px0.m25190e(c, "timeStamp");
                C2781lq lqVar = new C2781lq();
                while (c.moveToNext()) {
                    lqVar.put(c.getString(e2), null);
                }
                c.moveToPosition(-1);
                mb5.this.mo56177G(lqVar);
                ArrayList arrayList = new ArrayList(c.getCount());
                while (c.moveToNext()) {
                    if (c.isNull(e)) {
                        l = null;
                    } else {
                        l = Long.valueOf(c.getLong(e));
                    }
                    if (c.isNull(e2)) {
                        str = null;
                    } else {
                        str = c.getString(e2);
                    }
                    if (c.isNull(e3)) {
                        str2 = null;
                    } else {
                        str2 = c.getString(e3);
                    }
                    if (c.isNull(e4)) {
                        str3 = null;
                    } else {
                        str3 = c.getString(e4);
                    }
                    if (c.isNull(e5)) {
                        str4 = null;
                    } else {
                        str4 = c.getString(e5);
                    }
                    arrayList.add(new RoomReflectionsDataAndToken(new RoomReflectionsData(l, str, str2, str3, str4, c.getLong(e6)), (RoomReflectionsToken) lqVar.get(c.getString(e2))));
                }
                mb5.this.f40822a.mo10115C();
                c.close();
                mb5.this.f40822a.mo10124j();
                return arrayList;
            } catch (Throwable th) {
                mb5.this.f40822a.mo10124j();
                throw th;
            }
        }

        public void finalize() {
            this.f40867a.mo22765f();
        }
    }

    /* renamed from: mb5$q */
    /* compiled from: ReflectionsDao_Impl */
    public class C7890q implements Callable<List<RoomReflectionsDataAndToken>> {

        /* renamed from: a */
        public final /* synthetic */ lh5 f40869a;

        public C7890q(lh5 lh5) {
            this.f40869a = lh5;
        }

        /* renamed from: a */
        public List<RoomReflectionsDataAndToken> call() throws Exception {
            Cursor c;
            Long l;
            String str;
            String str2;
            String str3;
            String str4;
            mb5.this.f40822a.mo10119e();
            try {
                c = iz0.m19913c(mb5.this.f40822a, this.f40869a, true, (CancellationSignal) null);
                int e = px0.m25190e(c, "_id");
                int e2 = px0.m25190e(c, "symbolWithType");
                int e3 = px0.m25190e(c, "nativeBalance");
                int e4 = px0.m25190e(c, "blockBalance");
                int e5 = px0.m25190e(c, "block");
                int e6 = px0.m25190e(c, "timeStamp");
                C2781lq lqVar = new C2781lq();
                while (c.moveToNext()) {
                    lqVar.put(c.getString(e2), null);
                }
                c.moveToPosition(-1);
                mb5.this.mo56177G(lqVar);
                ArrayList arrayList = new ArrayList(c.getCount());
                while (c.moveToNext()) {
                    if (c.isNull(e)) {
                        l = null;
                    } else {
                        l = Long.valueOf(c.getLong(e));
                    }
                    if (c.isNull(e2)) {
                        str = null;
                    } else {
                        str = c.getString(e2);
                    }
                    if (c.isNull(e3)) {
                        str2 = null;
                    } else {
                        str2 = c.getString(e3);
                    }
                    if (c.isNull(e4)) {
                        str3 = null;
                    } else {
                        str3 = c.getString(e4);
                    }
                    if (c.isNull(e5)) {
                        str4 = null;
                    } else {
                        str4 = c.getString(e5);
                    }
                    arrayList.add(new RoomReflectionsDataAndToken(new RoomReflectionsData(l, str, str2, str3, str4, c.getLong(e6)), (RoomReflectionsToken) lqVar.get(c.getString(e2))));
                }
                mb5.this.f40822a.mo10115C();
                c.close();
                mb5.this.f40822a.mo10124j();
                return arrayList;
            } catch (Throwable th) {
                mb5.this.f40822a.mo10124j();
                throw th;
            }
        }

        public void finalize() {
            this.f40869a.mo22765f();
        }
    }

    /* renamed from: mb5$r */
    /* compiled from: ReflectionsDao_Impl */
    public class C7891r implements Callable<RoomReflectionsData> {

        /* renamed from: a */
        public final /* synthetic */ lh5 f40871a;

        public C7891r(lh5 lh5) {
            this.f40871a = lh5;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: net.safemoon.androidwallet.model.reflections.RoomReflectionsData} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: net.safemoon.androidwallet.model.reflections.RoomReflectionsData} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: net.safemoon.androidwallet.model.reflections.RoomReflectionsData} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: net.safemoon.androidwallet.model.reflections.RoomReflectionsData} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: net.safemoon.androidwallet.model.reflections.RoomReflectionsData} */
        /* JADX WARNING: type inference failed for: r4v2, types: [java.lang.String] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public net.safemoon.androidwallet.model.reflections.RoomReflectionsData call() throws java.lang.Exception {
            /*
                r17 = this;
                r1 = r17
                mb5 r0 = p000.mb5.this
                androidx.room.RoomDatabase r0 = r0.f40822a
                lh5 r2 = r1.f40871a
                r3 = 0
                r4 = 0
                android.database.Cursor r2 = p000.iz0.m19913c(r0, r2, r3, r4)
                java.lang.String r0 = "_id"
                int r0 = p000.px0.m25190e(r2, r0)     // Catch:{ all -> 0x0092 }
                java.lang.String r3 = "symbolWithType"
                int r3 = p000.px0.m25190e(r2, r3)     // Catch:{ all -> 0x0092 }
                java.lang.String r5 = "nativeBalance"
                int r5 = p000.px0.m25190e(r2, r5)     // Catch:{ all -> 0x0092 }
                java.lang.String r6 = "blockBalance"
                int r6 = p000.px0.m25190e(r2, r6)     // Catch:{ all -> 0x0092 }
                java.lang.String r7 = "block"
                int r7 = p000.px0.m25190e(r2, r7)     // Catch:{ all -> 0x0092 }
                java.lang.String r8 = "timeStamp"
                int r8 = p000.px0.m25190e(r2, r8)     // Catch:{ all -> 0x0092 }
                boolean r9 = r2.moveToFirst()     // Catch:{ all -> 0x0092 }
                if (r9 == 0) goto L_0x0089
                boolean r9 = r2.isNull(r0)     // Catch:{ all -> 0x0092 }
                if (r9 == 0) goto L_0x0042
                r10 = r4
                goto L_0x004b
            L_0x0042:
                long r9 = r2.getLong(r0)     // Catch:{ all -> 0x0092 }
                java.lang.Long r0 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x0092 }
                r10 = r0
            L_0x004b:
                boolean r0 = r2.isNull(r3)     // Catch:{ all -> 0x0092 }
                if (r0 == 0) goto L_0x0053
                r11 = r4
                goto L_0x0058
            L_0x0053:
                java.lang.String r0 = r2.getString(r3)     // Catch:{ all -> 0x0092 }
                r11 = r0
            L_0x0058:
                boolean r0 = r2.isNull(r5)     // Catch:{ all -> 0x0092 }
                if (r0 == 0) goto L_0x0060
                r12 = r4
                goto L_0x0065
            L_0x0060:
                java.lang.String r0 = r2.getString(r5)     // Catch:{ all -> 0x0092 }
                r12 = r0
            L_0x0065:
                boolean r0 = r2.isNull(r6)     // Catch:{ all -> 0x0092 }
                if (r0 == 0) goto L_0x006d
                r13 = r4
                goto L_0x0072
            L_0x006d:
                java.lang.String r0 = r2.getString(r6)     // Catch:{ all -> 0x0092 }
                r13 = r0
            L_0x0072:
                boolean r0 = r2.isNull(r7)     // Catch:{ all -> 0x0092 }
                if (r0 == 0) goto L_0x007a
            L_0x0078:
                r14 = r4
                goto L_0x007f
            L_0x007a:
                java.lang.String r4 = r2.getString(r7)     // Catch:{ all -> 0x0092 }
                goto L_0x0078
            L_0x007f:
                long r15 = r2.getLong(r8)     // Catch:{ all -> 0x0092 }
                net.safemoon.androidwallet.model.reflections.RoomReflectionsData r4 = new net.safemoon.androidwallet.model.reflections.RoomReflectionsData     // Catch:{ all -> 0x0092 }
                r9 = r4
                r9.<init>(r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0092 }
            L_0x0089:
                r2.close()
                lh5 r0 = r1.f40871a
                r0.mo22765f()
                return r4
            L_0x0092:
                r0 = move-exception
                r2.close()
                lh5 r2 = r1.f40871a
                r2.mo22765f()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.mb5.C7891r.call():net.safemoon.androidwallet.model.reflections.RoomReflectionsData");
        }
    }

    /* renamed from: mb5$s */
    /* compiled from: ReflectionsDao_Impl */
    public class C7892s implements Callable<RoomReflectionsTokenAndData> {

        /* renamed from: a */
        public final /* synthetic */ lh5 f40873a;

        public C7892s(lh5 lh5) {
            this.f40873a = lh5;
        }

        /* renamed from: a */
        public RoomReflectionsTokenAndData call() throws Exception {
            RoomReflectionsTokenAndData roomReflectionsTokenAndData;
            Long l;
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            Long l2;
            boolean z;
            int i;
            Long l3;
            int i2;
            Long l4;
            int i3;
            Long l5;
            int i4;
            Double d;
            int i5;
            Cursor c = iz0.m19913c(mb5.this.f40822a, this.f40873a, true, (CancellationSignal) null);
            try {
                int e = px0.m25190e(c, "_id");
                int e2 = px0.m25190e(c, "symbolWithType");
                int e3 = px0.m25190e(c, "symbol");
                int e4 = px0.m25190e(c, PublicResolver.FUNC_NAME);
                int e5 = px0.m25190e(c, "iconPath");
                int e6 = px0.m25190e(c, "contractorAddress");
                int e7 = px0.m25190e(c, "tokenTypeChain");
                int e8 = px0.m25190e(c, "decimals");
                int e9 = px0.m25190e(c, "nativeBalance");
                int e10 = px0.m25190e(c, "firstTimeStamp");
                int e11 = px0.m25190e(c, "enableAdvanceMode");
                int e12 = px0.m25190e(c, "latestBalance");
                int e13 = px0.m25190e(c, "latestTimeStamp");
                int e14 = px0.m25190e(c, "cmcId");
                int e15 = px0.m25190e(c, "priceUsd");
                C2781lq lqVar = new C2781lq();
                while (c.moveToNext()) {
                    int i6 = e13;
                    String string = c.getString(e2);
                    if (((ArrayList) lqVar.get(string)) == null) {
                        i5 = e12;
                        lqVar.put(string, new ArrayList());
                    } else {
                        i5 = e12;
                    }
                    e13 = i6;
                    e12 = i5;
                }
                int i7 = e13;
                int i8 = e12;
                c.moveToPosition(-1);
                mb5.this.mo56176F(lqVar);
                if (c.moveToFirst()) {
                    if (c.isNull(e)) {
                        l = null;
                    } else {
                        l = Long.valueOf(c.getLong(e));
                    }
                    if (c.isNull(e2)) {
                        str = null;
                    } else {
                        str = c.getString(e2);
                    }
                    if (c.isNull(e3)) {
                        str2 = null;
                    } else {
                        str2 = c.getString(e3);
                    }
                    if (c.isNull(e4)) {
                        str3 = null;
                    } else {
                        str3 = c.getString(e4);
                    }
                    if (c.isNull(e5)) {
                        str4 = null;
                    } else {
                        str4 = c.getString(e5);
                    }
                    if (c.isNull(e6)) {
                        str5 = null;
                    } else {
                        str5 = c.getString(e6);
                    }
                    int i9 = c.getInt(e7);
                    int i10 = c.getInt(e8);
                    if (c.isNull(e9)) {
                        str6 = null;
                    } else {
                        str6 = c.getString(e9);
                    }
                    if (c.isNull(e10)) {
                        l2 = null;
                    } else {
                        l2 = Long.valueOf(c.getLong(e10));
                    }
                    if (c.getInt(e11) != 0) {
                        i = i8;
                        z = true;
                    } else {
                        z = false;
                        i = i8;
                    }
                    if (c.isNull(i)) {
                        i2 = i7;
                        l3 = null;
                    } else {
                        l3 = Long.valueOf(c.getLong(i));
                        i2 = i7;
                    }
                    if (c.isNull(i2)) {
                        i3 = e14;
                        l4 = null;
                    } else {
                        l4 = Long.valueOf(c.getLong(i2));
                        i3 = e14;
                    }
                    if (c.isNull(i3)) {
                        i4 = e15;
                        l5 = null;
                    } else {
                        l5 = Long.valueOf(c.getLong(i3));
                        i4 = e15;
                    }
                    if (c.isNull(i4)) {
                        d = null;
                    } else {
                        d = Double.valueOf(c.getDouble(i4));
                    }
                    RoomReflectionsToken roomReflectionsToken = new RoomReflectionsToken(l, str, str2, str3, str4, str5, i9, i10, str6, l2, z, l3, l4, l5, d);
                    ArrayList arrayList = (ArrayList) lqVar.get(c.getString(e2));
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    roomReflectionsTokenAndData = new RoomReflectionsTokenAndData(roomReflectionsToken, arrayList);
                } else {
                    roomReflectionsTokenAndData = null;
                }
                return roomReflectionsTokenAndData;
            } finally {
                c.close();
            }
        }

        public void finalize() {
            this.f40873a.mo22765f();
        }
    }

    /* renamed from: mb5$t */
    /* compiled from: ReflectionsDao_Impl */
    public class C7893t extends vq1<RoomReflectionsData> {
        public C7893t(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo10165e() {
            return "INSERT OR ABORT INTO `table_room_reflections_data_2` (`_id`,`symbolWithType`,`nativeBalance`,`blockBalance`,`block`,`timeStamp`) VALUES (?,?,?,?,?,?)";
        }

        /* renamed from: m */
        public void mo12130i(SupportSQLiteStatement supportSQLiteStatement, RoomReflectionsData roomReflectionsData) {
            if (roomReflectionsData.getId() == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindLong(1, roomReflectionsData.getId().longValue());
            }
            if (roomReflectionsData.getSymbolWithType() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, roomReflectionsData.getSymbolWithType());
            }
            if (roomReflectionsData.getNativeBalance() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, roomReflectionsData.getNativeBalance());
            }
            if (roomReflectionsData.getBlockBalance() == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, roomReflectionsData.getBlockBalance());
            }
            if (roomReflectionsData.getBlock() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindString(5, roomReflectionsData.getBlock());
            }
            supportSQLiteStatement.bindLong(6, roomReflectionsData.getTimeStamp());
        }
    }

    /* renamed from: mb5$u */
    /* compiled from: ReflectionsDao_Impl */
    public class C7894u implements Callable<RoomReflectionsToken> {

        /* renamed from: a */
        public final /* synthetic */ lh5 f40876a;

        public C7894u(lh5 lh5) {
            this.f40876a = lh5;
        }

        /* renamed from: a */
        public RoomReflectionsToken call() throws Exception {
            RoomReflectionsToken roomReflectionsToken;
            Long l;
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            Long l2;
            boolean z;
            Long l3;
            Long l4;
            Long l5;
            Double d;
            C7894u uVar = this;
            mb5.this.f40822a.mo10119e();
            try {
                Cursor c = iz0.m19913c(mb5.this.f40822a, uVar.f40876a, false, (CancellationSignal) null);
                try {
                    int e = px0.m25190e(c, "_id");
                    int e2 = px0.m25190e(c, "symbolWithType");
                    int e3 = px0.m25190e(c, "symbol");
                    int e4 = px0.m25190e(c, PublicResolver.FUNC_NAME);
                    int e5 = px0.m25190e(c, "iconPath");
                    int e6 = px0.m25190e(c, "contractorAddress");
                    int e7 = px0.m25190e(c, "tokenTypeChain");
                    int e8 = px0.m25190e(c, "decimals");
                    int e9 = px0.m25190e(c, "nativeBalance");
                    int e10 = px0.m25190e(c, "firstTimeStamp");
                    int e11 = px0.m25190e(c, "enableAdvanceMode");
                    int e12 = px0.m25190e(c, "latestBalance");
                    int e13 = px0.m25190e(c, "latestTimeStamp");
                    int e14 = px0.m25190e(c, "cmcId");
                    try {
                        int e15 = px0.m25190e(c, "priceUsd");
                        if (c.moveToFirst()) {
                            if (c.isNull(e)) {
                                l = null;
                            } else {
                                l = Long.valueOf(c.getLong(e));
                            }
                            if (c.isNull(e2)) {
                                str = null;
                            } else {
                                str = c.getString(e2);
                            }
                            if (c.isNull(e3)) {
                                str2 = null;
                            } else {
                                str2 = c.getString(e3);
                            }
                            if (c.isNull(e4)) {
                                str3 = null;
                            } else {
                                str3 = c.getString(e4);
                            }
                            if (c.isNull(e5)) {
                                str4 = null;
                            } else {
                                str4 = c.getString(e5);
                            }
                            if (c.isNull(e6)) {
                                str5 = null;
                            } else {
                                str5 = c.getString(e6);
                            }
                            int i = c.getInt(e7);
                            int i2 = c.getInt(e8);
                            if (c.isNull(e9)) {
                                str6 = null;
                            } else {
                                str6 = c.getString(e9);
                            }
                            if (c.isNull(e10)) {
                                l2 = null;
                            } else {
                                l2 = Long.valueOf(c.getLong(e10));
                            }
                            if (c.getInt(e11) != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (c.isNull(e12)) {
                                l3 = null;
                            } else {
                                l3 = Long.valueOf(c.getLong(e12));
                            }
                            if (c.isNull(e13)) {
                                l4 = null;
                            } else {
                                l4 = Long.valueOf(c.getLong(e13));
                            }
                            if (c.isNull(e14)) {
                                l5 = null;
                            } else {
                                l5 = Long.valueOf(c.getLong(e14));
                            }
                            if (c.isNull(e15)) {
                                d = null;
                            } else {
                                d = Double.valueOf(c.getDouble(e15));
                            }
                            roomReflectionsToken = new RoomReflectionsToken(l, str, str2, str3, str4, str5, i, i2, str6, l2, z, l3, l4, l5, d);
                        } else {
                            roomReflectionsToken = null;
                        }
                        uVar = this;
                        mb5.this.f40822a.mo10115C();
                        c.close();
                        uVar.f40876a.mo22765f();
                        return roomReflectionsToken;
                    } catch (Throwable th) {
                        th = th;
                        uVar = this;
                        c.close();
                        uVar.f40876a.mo22765f();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    c.close();
                    uVar.f40876a.mo22765f();
                    throw th;
                }
            } finally {
                mb5.this.f40822a.mo10124j();
            }
        }
    }

    /* renamed from: mb5$v */
    /* compiled from: ReflectionsDao_Impl */
    public class C7895v extends uq1<RoomReflectionsToken> {
        public C7895v(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo10165e() {
            return "DELETE FROM `table_room_reflections_token_2` WHERE `_id` = ?";
        }

        /* renamed from: k */
        public void mo26841i(SupportSQLiteStatement supportSQLiteStatement, RoomReflectionsToken roomReflectionsToken) {
            if (roomReflectionsToken.getId() == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindLong(1, roomReflectionsToken.getId().longValue());
            }
        }
    }

    /* renamed from: mb5$w */
    /* compiled from: ReflectionsDao_Impl */
    public class C7896w extends SharedSQLiteStatement {
        public C7896w(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo10165e() {
            return "UPDATE table_room_reflections_token_2 SET cmcId = ? WHERE symbolWithType=?";
        }
    }

    /* renamed from: mb5$x */
    /* compiled from: ReflectionsDao_Impl */
    public class C7897x extends SharedSQLiteStatement {
        public C7897x(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo10165e() {
            return "UPDATE table_room_reflections_token_2 SET priceUsd = ? WHERE symbolWithType=?";
        }
    }

    /* renamed from: mb5$y */
    /* compiled from: ReflectionsDao_Impl */
    public class C7898y extends SharedSQLiteStatement {
        public C7898y(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo10165e() {
            return "UPDATE table_room_reflections_token_2 SET latestBalance = ?, latestTimeStamp = ? WHERE symbolWithType=?";
        }
    }

    /* renamed from: mb5$z */
    /* compiled from: ReflectionsDao_Impl */
    public class C7899z extends SharedSQLiteStatement {
        public C7899z(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo10165e() {
            return "UPDATE table_room_reflections_token_2 SET enableAdvanceMode = ? WHERE _id=?";
        }
    }

    public mb5(RoomDatabase roomDatabase) {
        this.f40822a = roomDatabase;
        this.f40823b = new C7884k(roomDatabase);
        this.f40824c = new C7893t(roomDatabase);
        this.f40825d = new C7895v(roomDatabase);
        this.f40826e = new C7896w(roomDatabase);
        this.f40827f = new C7897x(roomDatabase);
        this.f40828g = new C7898y(roomDatabase);
        this.f40829h = new C7899z(roomDatabase);
        this.f40830i = new C7873a0(roomDatabase);
        this.f40831j = new C7875b0(roomDatabase);
    }

    /* renamed from: H */
    public static List<Class<?>> m64228H() {
        return Collections.emptyList();
    }

    /* renamed from: F */
    public final void mo56176F(C2781lq<String, ArrayList<RoomReflectionsData>> lqVar) {
        Long l;
        String str;
        String str2;
        String str3;
        String str4;
        C2781lq<String, ArrayList<RoomReflectionsData>> lqVar2 = lqVar;
        Set<String> keySet = lqVar.keySet();
        if (!keySet.isEmpty()) {
            if (lqVar.size() > 999) {
                C2781lq lqVar3 = new C2781lq(999);
                int size = lqVar.size();
                int i = 0;
                int i2 = 0;
                while (i < size) {
                    lqVar3.put(lqVar2.mo27919i(i), lqVar2.mo27921m(i));
                    i++;
                    i2++;
                    if (i2 == 999) {
                        mo56176F(lqVar3);
                        lqVar3 = new C2781lq(999);
                        i2 = 0;
                    }
                }
                if (i2 > 0) {
                    mo56176F(lqVar3);
                    return;
                }
                return;
            }
            StringBuilder b = ib6.m19545b();
            b.append("SELECT `_id`,`symbolWithType`,`nativeBalance`,`blockBalance`,`block`,`timeStamp` FROM `table_room_reflections_data_2` WHERE `symbolWithType` IN (");
            int size2 = keySet.size();
            ib6.m19544a(b, size2);
            b.append(")");
            lh5 a = lh5.m21448a(b.toString(), size2 + 0);
            int i3 = 1;
            for (String next : keySet) {
                if (next == null) {
                    a.bindNull(i3);
                } else {
                    a.bindString(i3, next);
                }
                i3++;
            }
            Cursor c = iz0.m19913c(this.f40822a, a, false, (CancellationSignal) null);
            try {
                int d = px0.m25189d(c, "symbolWithType");
                if (d != -1) {
                    while (c.moveToNext()) {
                        ArrayList arrayList = lqVar2.get(c.getString(d));
                        if (arrayList != null) {
                            if (c.isNull(0)) {
                                l = null;
                            } else {
                                l = Long.valueOf(c.getLong(0));
                            }
                            if (c.isNull(1)) {
                                str = null;
                            } else {
                                str = c.getString(1);
                            }
                            if (c.isNull(2)) {
                                str2 = null;
                            } else {
                                str2 = c.getString(2);
                            }
                            if (c.isNull(3)) {
                                str3 = null;
                            } else {
                                str3 = c.getString(3);
                            }
                            if (c.isNull(4)) {
                                str4 = null;
                            } else {
                                str4 = c.getString(4);
                            }
                            arrayList.add(new RoomReflectionsData(l, str, str2, str3, str4, c.getLong(5)));
                        }
                    }
                    c.close();
                }
            } finally {
                c.close();
            }
        }
    }

    /* renamed from: G */
    public final void mo56177G(C2781lq<String, RoomReflectionsToken> lqVar) {
        Long l;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Long l2;
        boolean z;
        Long l3;
        Long l4;
        Long l5;
        Double d;
        C2781lq<String, RoomReflectionsToken> lqVar2 = lqVar;
        Set<String> keySet = lqVar.keySet();
        if (!keySet.isEmpty()) {
            if (lqVar.size() > 999) {
                C2781lq lqVar3 = new C2781lq(999);
                int size = lqVar.size();
                int i = 0;
                int i2 = 0;
                while (i < size) {
                    lqVar3.put(lqVar2.mo27919i(i), null);
                    i++;
                    i2++;
                    if (i2 == 999) {
                        mo56177G(lqVar3);
                        lqVar2.putAll(lqVar3);
                        lqVar3 = new C2781lq(999);
                        i2 = 0;
                    }
                }
                if (i2 > 0) {
                    mo56177G(lqVar3);
                    lqVar2.putAll(lqVar3);
                    return;
                }
                return;
            }
            StringBuilder b = ib6.m19545b();
            b.append("SELECT `_id`,`symbolWithType`,`symbol`,`name`,`iconPath`,`contractorAddress`,`tokenTypeChain`,`decimals`,`nativeBalance`,`firstTimeStamp`,`enableAdvanceMode`,`latestBalance`,`latestTimeStamp`,`cmcId`,`priceUsd` FROM `table_room_reflections_token_2` WHERE `symbolWithType` IN (");
            int size2 = keySet.size();
            ib6.m19544a(b, size2);
            b.append(")");
            lh5 a = lh5.m21448a(b.toString(), size2 + 0);
            int i3 = 1;
            for (String next : keySet) {
                if (next == null) {
                    a.bindNull(i3);
                } else {
                    a.bindString(i3, next);
                }
                i3++;
            }
            Cursor c = iz0.m19913c(this.f40822a, a, false, (CancellationSignal) null);
            try {
                int d2 = px0.m25189d(c, "symbolWithType");
                if (d2 != -1) {
                    while (c.moveToNext()) {
                        String string = c.getString(d2);
                        if (lqVar2.containsKey(string)) {
                            if (c.isNull(0)) {
                                l = null;
                            } else {
                                l = Long.valueOf(c.getLong(0));
                            }
                            if (c.isNull(1)) {
                                str = null;
                            } else {
                                str = c.getString(1);
                            }
                            if (c.isNull(2)) {
                                str2 = null;
                            } else {
                                str2 = c.getString(2);
                            }
                            if (c.isNull(3)) {
                                str3 = null;
                            } else {
                                str3 = c.getString(3);
                            }
                            if (c.isNull(4)) {
                                str4 = null;
                            } else {
                                str4 = c.getString(4);
                            }
                            if (c.isNull(5)) {
                                str5 = null;
                            } else {
                                str5 = c.getString(5);
                            }
                            int i4 = c.getInt(6);
                            int i5 = c.getInt(7);
                            if (c.isNull(8)) {
                                str6 = null;
                            } else {
                                str6 = c.getString(8);
                            }
                            if (c.isNull(9)) {
                                l2 = null;
                            } else {
                                l2 = Long.valueOf(c.getLong(9));
                            }
                            if (c.getInt(10) != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (c.isNull(11)) {
                                l3 = null;
                            } else {
                                l3 = Long.valueOf(c.getLong(11));
                            }
                            if (c.isNull(12)) {
                                l4 = null;
                            } else {
                                l4 = Long.valueOf(c.getLong(12));
                            }
                            if (c.isNull(13)) {
                                l5 = null;
                            } else {
                                l5 = Long.valueOf(c.getLong(13));
                            }
                            if (c.isNull(14)) {
                                d = null;
                            } else {
                                d = Double.valueOf(c.getDouble(14));
                            }
                            lqVar2.put(string, new RoomReflectionsToken(l, str, str2, str3, str4, str5, i4, i5, str6, l2, z, l3, l4, l5, d));
                        }
                    }
                    c.close();
                }
            } finally {
                c.close();
            }
        }
    }

    /* renamed from: a */
    public LiveData<List<RoomReflectionsTokenAndData>> mo55856a(int i) {
        lh5 a = lh5.m21448a("SELECT * FROM table_room_reflections_token_2 WHERE tokenTypeChain=?", 1);
        a.bindLong(1, (long) i);
        return this.f40822a.mo10128n().mo20867d(new String[]{"table_room_reflections_data_2", "table_room_reflections_token_2"}, true, new C7887n(a));
    }

    /* renamed from: b */
    public LiveData<List<RoomReflectionsDataAndToken>> mo55857b(String str, long j) {
        lh5 a = lh5.m21448a("SELECT * FROM table_room_reflections_data_2 WHERE symbolWithType=?  AND ((timeStamp >= (SELECT timeStamp FROM table_room_reflections_data_2 WHERE symbolWithType=?  AND timeStamp < ? ORDER BY `timeStamp` DESC LIMIT 1)) OR timeStamp >= ?) ORDER BY `timeStamp` DESC", 4);
        if (str == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str);
        }
        if (str == null) {
            a.bindNull(2);
        } else {
            a.bindString(2, str);
        }
        a.bindLong(3, j);
        a.bindLong(4, j);
        return this.f40822a.mo10128n().mo20867d(new String[]{"table_room_reflections_token_2", "table_room_reflections_data_2"}, true, new C7890q(a));
    }

    /* renamed from: c */
    public Object mo55858c(String str, ns0<? super RoomReflectionsData> ns0) {
        lh5 a = lh5.m21448a("SELECT * FROM table_room_reflections_data_2 WHERE symbolWithType=? ORDER BY `timeStamp` DESC LIMIT 1", 1);
        if (str == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str);
        }
        return CoroutinesRoom.m9773a(this.f40822a, false, iz0.m19911a(), new C7891r(a), ns0);
    }

    /* renamed from: d */
    public LiveData<List<RoomReflectionsToken>> mo55859d(int i) {
        lh5 a = lh5.m21448a("SELECT * FROM table_room_reflections_token_2 WHERE tokenTypeChain=?", 1);
        a.bindLong(1, (long) i);
        return this.f40822a.mo10128n().mo20867d(new String[]{"table_room_reflections_token_2"}, false, new C7886m(a));
    }

    /* renamed from: e */
    public Object mo55860e(RoomReflectionsToken roomReflectionsToken, ns0<? super Long> ns0) {
        return CoroutinesRoom.m9774b(this.f40822a, true, new C7872a(roomReflectionsToken), ns0);
    }

    /* renamed from: f */
    public Object mo55861f(RoomReflectionsToken roomReflectionsToken, ns0<? super r37> ns0) {
        return CoroutinesRoom.m9774b(this.f40822a, true, new C7876c(roomReflectionsToken), ns0);
    }

    /* renamed from: g */
    public Object mo55862g(String str, long j, ns0<? super Boolean> ns0) {
        lh5 a = lh5.m21448a("SELECT EXISTS (SELECT 1 FROM table_room_reflections_data_2 WHERE symbolWithType = ? AND timeStamp >=?)", 2);
        if (str == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str);
        }
        a.bindLong(2, j);
        return CoroutinesRoom.m9773a(this.f40822a, false, iz0.m19911a(), new C7885l(a), ns0);
    }

    /* renamed from: h */
    public LiveData<List<RoomReflectionsDataAndToken>> mo55863h(String str) {
        lh5 a = lh5.m21448a("SELECT * FROM table_room_reflections_data_2 WHERE symbolWithType=? ORDER BY `timeStamp` DESC", 1);
        if (str == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str);
        }
        return this.f40822a.mo10128n().mo20867d(new String[]{"table_room_reflections_token_2", "table_room_reflections_data_2"}, true, new C7889p(a));
    }

    /* renamed from: i */
    public LiveData<RoomReflectionsTokenAndData> mo55864i(String str) {
        lh5 a = lh5.m21448a("SELECT * FROM table_room_reflections_token_2 WHERE symbolWithType=?", 1);
        if (str == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str);
        }
        return this.f40822a.mo10128n().mo20867d(new String[]{"table_room_reflections_data_2", "table_room_reflections_token_2"}, false, new C7892s(a));
    }

    /* renamed from: j */
    public Object mo55865j(ns0<? super List<RoomReflectionsToken>> ns0) {
        lh5 a = lh5.m21448a("SELECT * FROM table_room_reflections_token_2", 0);
        return CoroutinesRoom.m9773a(this.f40822a, false, iz0.m19911a(), new C7888o(a), ns0);
    }

    /* renamed from: k */
    public Object mo55866k(String str, int i, ns0<? super Boolean> ns0) {
        lh5 a = lh5.m21448a("SELECT EXISTS (SELECT 1 FROM table_room_reflections_token_2 WHERE symbolWithType = ? AND tokenTypeChain =?)", 2);
        if (str == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str);
        }
        a.bindLong(2, (long) i);
        return CoroutinesRoom.m9773a(this.f40822a, false, iz0.m19911a(), new C7883j(a), ns0);
    }

    /* renamed from: l */
    public Object mo55867l(String str, ns0<? super r37> ns0) {
        return CoroutinesRoom.m9774b(this.f40822a, true, new C7882i(str), ns0);
    }

    /* renamed from: m */
    public Object mo55868m(double d, String str, ns0<? super r37> ns0) {
        return CoroutinesRoom.m9774b(this.f40822a, true, new C7878e(d, str), ns0);
    }

    /* renamed from: n */
    public Object mo55869n(long j, int i, ns0<? super r37> ns0) {
        return CoroutinesRoom.m9774b(this.f40822a, true, new C7880g(i, j), ns0);
    }

    /* renamed from: o */
    public Object mo55870o(RoomReflectionsData roomReflectionsData, ns0<? super Long> ns0) {
        return CoroutinesRoom.m9774b(this.f40822a, true, new C7874b(roomReflectionsData), ns0);
    }

    /* renamed from: p */
    public Object mo55871p(ns0<? super r37> ns0) {
        return CoroutinesRoom.m9774b(this.f40822a, true, new C7881h(), ns0);
    }

    /* renamed from: q */
    public Object mo55872q(String str, ns0<? super RoomReflectionsToken> ns0) {
        lh5 a = lh5.m21448a("SELECT * FROM table_room_reflections_token_2 WHERE symbolWithType=?", 1);
        if (str == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str);
        }
        return CoroutinesRoom.m9773a(this.f40822a, true, iz0.m19911a(), new C7894u(a), ns0);
    }

    /* renamed from: r */
    public Object mo55873r(long j, long j2, String str, ns0<? super r37> ns0) {
        return CoroutinesRoom.m9774b(this.f40822a, true, new C7879f(j, j2, str), ns0);
    }

    /* renamed from: s */
    public Object mo55874s(int i, String str, ns0<? super r37> ns0) {
        return CoroutinesRoom.m9774b(this.f40822a, true, new C7877d(i, str), ns0);
    }
}
