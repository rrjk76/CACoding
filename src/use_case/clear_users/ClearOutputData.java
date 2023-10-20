package use_case.clear_users;

import java.util.Map;

public class ClearOutputData {

    private boolean useCaseFailed;
    private Map<Object, Object> deletedUsers;


    public ClearOutputData(boolean useCaseFailed, Map<Object, Object> deletedUsers) {
        this.deletedUsers = deletedUsers;
        this.useCaseFailed = useCaseFailed;
    }

    public Map<Object, Object> getDeletedUsers(){
        return deletedUsers;
    }


}
