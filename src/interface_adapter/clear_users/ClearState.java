package interface_adapter.clear_users;

import java.util.HashMap;
import java.util.Map;

public class ClearState {
    private Map<Object, Object> deletedUsers = new HashMap<>();

    public ClearState(ClearState copy) {
        deletedUsers = copy.deletedUsers;
    }

    public ClearState() {
    }

    public Map<Object, Object> getDeletedUsers() {
        return deletedUsers;
    }

    public void setDeletedUsers(Map<Object, Object> deletedUsers) {
        this.deletedUsers = deletedUsers;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Object deletedUser : deletedUsers.keySet()) {
            sb.append(deletedUser).append("\n");
        }
        return sb.toString();
    }

}
