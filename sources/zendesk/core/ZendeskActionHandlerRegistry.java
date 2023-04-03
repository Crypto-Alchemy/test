package zendesk.core;

import com.google.gson.JsonElement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

class ZendeskActionHandlerRegistry implements ActionHandlerRegistry {
    private static final Comparator<ActionHandler> PRIORITY_ACTION_HANDLER_COMPARATOR = new Comparator<ActionHandler>() {
        public int compare(ActionHandler actionHandler, ActionHandler actionHandler2) {
            return actionHandler2.getPriority() - actionHandler.getPriority();
        }
    };
    private List<ActionHandler> registry = new ArrayList();

    public void add(ActionHandler actionHandler) {
        if (actionHandler != null) {
            this.registry.add(actionHandler);
        }
    }

    public void clear() {
        this.registry.clear();
    }

    public ActionHandler handlerByAction(String str) {
        if (kb6.m46951d(str)) {
            return null;
        }
        ArrayList<ActionHandler> arrayList = new ArrayList<>(this.registry);
        Collections.sort(arrayList, PRIORITY_ACTION_HANDLER_COMPARATOR);
        for (ActionHandler actionHandler : arrayList) {
            if (actionHandler.canHandle(str)) {
                return actionHandler;
            }
        }
        return null;
    }

    public List<ActionHandler> handlersByAction(final String str) {
        if (kb6.m46951d(str)) {
            return Collections.emptyList();
        }
        List<ActionHandler> f = kj0.m47115f(this.registry, new lp7<ActionHandler, Boolean>() {
            public Boolean apply(ActionHandler actionHandler) {
                return Boolean.valueOf(actionHandler.canHandle(str));
            }
        });
        Collections.sort(f, PRIORITY_ACTION_HANDLER_COMPARATOR);
        return f;
    }

    public void remove(ActionHandler actionHandler) {
        if (actionHandler != null) {
            this.registry.remove(actionHandler);
        }
    }

    public void updateSettings(Map<String, JsonElement> map) {
        for (ActionHandler next : this.registry) {
            if (next != null) {
                next.updateSettings(map);
            }
        }
    }
}
