package interface_adapter.clear_users;

import interface_adapter.ViewManagerModel;
import use_case.clear_users.ClearOutputData;
import interface_adapter.signup.SignupViewModel;
import use_case.clear_users.ClearOutputBoundary;

import interface_adapter.signup.SignupState;


import java.util.Map;


public class ClearPresenter implements ClearOutputBoundary {
    final private ClearViewModel clearViewModel;
//    private final SignupViewModel signupViewModel;
    private ViewManagerModel viewManagerModel;

    public ClearPresenter(ViewManagerModel viewManagerModel,
                          ClearViewModel clearViewModel) {
                          //SignupViewModel signupViewModel) {
        this.viewManagerModel = viewManagerModel;
        this.clearViewModel = clearViewModel;
//        this.signupViewModel = signupViewModel;
    }

    @Override
    public void prepareSuccessView(ClearOutputData user) {
        Map<Object, Object> users = user.getDeletedUsers();

        ClearState clearState = clearViewModel.getState();
        clearState.setDeletedUsers(users);

        this.clearViewModel.setState(clearState);
        this.clearViewModel.firePropertyChanged();

        this.viewManagerModel.setActiveView(clearViewModel.getViewName());
        viewManagerModel.firePropertyChanged();

    }

//    @Override
//    public void prepareFailView(String error) {
//        ClearState clearState = clearViewModel.getState();
//        clearState.clearError(error);
//        clearViewModel.firePropertyChanged();
//    }
}
