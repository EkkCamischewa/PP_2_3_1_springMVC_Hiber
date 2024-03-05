package web.dao;

import org.springframework.stereotype.Repository;

import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDao implements UserDaoInt {


    @PersistenceContext
    private EntityManager entityManager;

    public List<User> getAllUsers(){
        return entityManager
                .createQuery("from User", User.class)
                .getResultList();
    }



    public User getParticularUser(Long id){
        return entityManager.find(User.class, id);
    }

    public void addNewUser(User user){
        entityManager.persist(user);
    }

    public void updateUser(User user){
        entityManager.merge(user);
    }

    public void deleteUser(Long id) {
        entityManager.remove(getParticularUser(id));
    }
}
