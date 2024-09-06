/*package com.example.jpa_project.Users.application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import com.example.jpa_project.CategoriesCatalog.domain.models.CategoriesCatalog;
import com.example.jpa_project.CategoriesCatalog.domain.repository.CategoriesCatalogRepository;

@Service
public class UsersService {

    @Autowired
    private UsersRepository usersRepository;

    public List<Users> findAll() {
        return usersRepository.findAll();
    }

    public Optional<Users> findById(Long id) {
        return usersRepository.findById(id);
    }

    public Users save(Users user) {
        return usersRepository.save(user);
    }

    public void deleteById(Long id) {
        usersRepository.deleteById(id);
    }
}
*/