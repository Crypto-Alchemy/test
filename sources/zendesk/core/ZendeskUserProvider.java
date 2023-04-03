package zendesk.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p000.qg5;

class ZendeskUserProvider implements UserProvider {
    private static final qg5.C6410b<UserFieldResponse, List<UserField>> FIELDS_EXTRACTOR = new qg5.C6410b<UserFieldResponse, List<UserField>>() {
        public List<UserField> extract(UserFieldResponse userFieldResponse) {
            return userFieldResponse.getUserFields();
        }
    };
    private static final qg5.C6410b<UserResponse, Map<String, String>> FIELDS_MAP_EXTRACTOR = new qg5.C6410b<UserResponse, Map<String, String>>() {
        public Map<String, String> extract(UserResponse userResponse) {
            if (userResponse == null || userResponse.getUser() == null) {
                return kj0.m47113d(new HashMap());
            }
            return userResponse.getUser().getUserFields();
        }
    };
    private static final qg5.C6410b<UserResponse, List<String>> TAGS_EXTRACTOR = new qg5.C6410b<UserResponse, List<String>>() {
        public List<String> extract(UserResponse userResponse) {
            if (userResponse == null || userResponse.getUser() == null) {
                return kj0.m47112c(new ArrayList());
            }
            return userResponse.getUser().getTags();
        }
    };
    private static final qg5.C6410b<UserResponse, User> USER_EXTRACTOR = new qg5.C6410b<UserResponse, User>() {
        public User extract(UserResponse userResponse) {
            return userResponse.getUser();
        }
    };
    private final UserService userService;

    public ZendeskUserProvider(UserService userService2) {
        this.userService = userService2;
    }

    public void addTags(List<String> list, final op7<List<String>> op7) {
        this.userService.addTags(new UserTagRequest(kj0.m47114e(list))).mo50512X(new qg5(new PassThroughErrorZendeskCallback<List<String>>(op7) {
            public void onSuccess(List<String> list) {
                op7 op7 = op7;
                if (op7 != null) {
                    op7.onSuccess(list);
                }
            }
        }, TAGS_EXTRACTOR));
    }

    public void deleteTags(List<String> list, final op7<List<String>> op7) {
        this.userService.deleteTags(kb6.m46953f(kj0.m47114e(list))).mo50512X(new qg5(new PassThroughErrorZendeskCallback<List<String>>(op7) {
            public void onSuccess(List<String> list) {
                op7 op7 = op7;
                if (op7 != null) {
                    op7.onSuccess(list);
                }
            }
        }, TAGS_EXTRACTOR));
    }

    public void getUser(final op7<User> op7) {
        this.userService.getUser().mo50512X(new qg5(new PassThroughErrorZendeskCallback<User>(op7) {
            public void onSuccess(User user) {
                op7 op7 = op7;
                if (op7 != null) {
                    op7.onSuccess(user);
                }
            }
        }, USER_EXTRACTOR));
    }

    public void getUserFields(final op7<List<UserField>> op7) {
        this.userService.getUserFields().mo50512X(new qg5(new PassThroughErrorZendeskCallback<List<UserField>>(op7) {
            public void onSuccess(List<UserField> list) {
                op7 op7 = op7;
                if (op7 != null) {
                    op7.onSuccess(list);
                }
            }
        }, FIELDS_EXTRACTOR));
    }

    public void setUserFields(Map<String, String> map, final op7<Map<String, String>> op7) {
        this.userService.setUserFields(new UserFieldRequest(map)).mo50512X(new qg5(new PassThroughErrorZendeskCallback<Map<String, String>>(op7) {
            public void onSuccess(Map<String, String> map) {
                op7 op7 = op7;
                if (op7 != null) {
                    op7.onSuccess(map);
                }
            }
        }, FIELDS_MAP_EXTRACTOR));
    }
}
