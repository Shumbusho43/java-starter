package rw.david.ne.java.services;

import rw.david.ne.java.models.User;


public interface IUserService {

    User create(User user);

    boolean isNotUnique(User user);

    void validateNewRegistration(User user);

    User getLoggedInUser();

}