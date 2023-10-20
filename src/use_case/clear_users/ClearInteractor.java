package use_case.clear_users;

import java.util.Map;

public class ClearInteractor implements ClearInputBoundary {

    final ClearUserDataAccessInterface userDataAccessObject;
    final ClearOutputBoundary clearPresenter;

    public ClearInteractor(ClearUserDataAccessInterface userDataAccessInterface,
                           ClearOutputBoundary clearOutputBoundary) {
        this.userDataAccessObject = userDataAccessInterface;
        this.clearPresenter = clearOutputBoundary;
    }

    @Override
    public void execute() {
        Map<Object, Object> user = userDataAccessObject.clear();

        ClearOutputData clearOutputData = new ClearOutputData( false, user);
        clearPresenter.prepareSuccessView(clearOutputData);

    }

}
