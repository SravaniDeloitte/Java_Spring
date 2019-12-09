package com.cr.training.service;

import com.cr.training.model.Login;
import com.cr.training.model.User;

public interface UserService {

  void register(User user);

  User validateUser(Login login);
  
  void delete(String emailid);
}
