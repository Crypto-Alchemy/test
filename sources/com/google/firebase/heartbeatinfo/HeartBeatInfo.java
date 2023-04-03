package com.google.firebase.heartbeatinfo;

public interface HeartBeatInfo {

    public enum HeartBeat {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);
        
        private final int code;

        /* access modifiers changed from: public */
        HeartBeat(int i) {
            this.code = i;
        }

        public int getCode() {
            return this.code;
        }
    }

    /* renamed from: a */
    HeartBeat mo36104a(String str);
}
