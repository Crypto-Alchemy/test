package zendesk.core;

import java.util.List;
import java.util.Map;

public interface UserProvider {
    void addTags(List<String> list, op7<List<String>> op7);

    void deleteTags(List<String> list, op7<List<String>> op7);

    void getUser(op7<User> op7);

    void getUserFields(op7<List<UserField>> op7);

    void setUserFields(Map<String, String> map, op7<Map<String, String>> op7);
}
