package guru.springframework.springrestclientexamples.service;

import guru.springframework.api.domain.User;
import guru.springframework.api.domain.UserData;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ApiService {
    List<User> getUsers(Integer limit);
}
