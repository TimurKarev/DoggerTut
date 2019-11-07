package com.example.doggertut;

public interface LoginActivityMVP {

    interface  View {

        String getFirstName();
        String getLastName();

        void showUserNotAvailble();
        void showInputError();
        void showUserSavedMessage();

        void setFirstName(String fname);
        void setSecondName(String sname);

    }

    interface Presenter {
        void setView(LoginActivityMVP.View view);
        void logginButtonClicked();
        void getCurrentUser();

    }

    interface Model {

        void creatrUser(String fname, String lname);

        User getUser();

    }

}
