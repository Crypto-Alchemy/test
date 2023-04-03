package zendesk.support.request;

import java.util.List;
import zendesk.support.suas.Reducer;

public final class RequestModule_ProvidesReducerFactory implements ry1<List<Reducer>> {

    public static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final RequestModule_ProvidesReducerFactory INSTANCE = new RequestModule_ProvidesReducerFactory();

        private InstanceHolder() {
        }
    }

    public static RequestModule_ProvidesReducerFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static List<Reducer> providesReducer() {
        return (List) fu4.m44415f(RequestModule.providesReducer());
    }

    public List<Reducer> get() {
        return providesReducer();
    }
}
